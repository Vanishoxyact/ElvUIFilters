// *************************************************************
//                         H*E*R*M*E*S
//                   Holistic Environment for
//         Railway Modelling, Evaluation and Simulation
//        Built on Graffica System Development Kit: GSDK
//
//       Copyright: (c) Graffica Ltd (www.graffica.co.uk)
//
// This software is made available under binary licence. Holding 
// source code without the express permission of Graffica Ltd is 
//           not permitted under any circumstances. 
// *************************************************************
package main;

import main.AuraManager.ClassSpecAura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class FilterGenerator {
   
   public Map<Long, Object> generateAuras() {
      AuraManager auraManager = new AuraManager();
      AuraPopulator auraPopulator = new AuraPopulator(auraManager);
      auraPopulator.populateManager();
      FilterExporter filterExporter = new FilterExporter();

      Map<Long, Object> globalMap = new LinkedHashMap<>();
      for( SpecClass specClass : SpecClass.values() ) {
         for( AuraType auraType : AuraType.values() ) {
            List<ClassSpecAura> classAuras = auraManager.getAllAurasOfTypeForClass(auraType, specClass );
            if(classAuras.isEmpty()) {
               continue;
            }
            List<List< Aura >> arrangedAuras = arrangeAuras(classAuras );
            arrangedAuras.get( 0 ).get( 0 ).positionAuras( arrangedAuras );
            for( List< Aura > arrangedAuraList : arrangedAuras ) {
               for( Aura aura : arrangedAuraList ) {
                  globalMap.put((long)aura.getSpellId(), filterExporter.convertAuraIntoTable(aura));
               }
            }
         }
      }
//      Externals now handled in ElvUI
//      List<List<Aura>> externals = auraPopulator.populateExternalsList();
//      externals.get(0).get(0).positionAuras(externals);
//      for(List<Aura> externalList : externals) {
//         for(Aura external : externalList) {
//            globalMap.put((long)external.getSpellId(), filterExporter.convertAuraIntoTable(external));
//         }
//      }
      return globalMap;
   }

   private static List<List<Aura>> arrangeAuras(List<ClassSpecAura> classSpecAuras) {
      Set<Aura> nonUniqueAuras = new LinkedHashSet<>();
      Map<Spec, List<Aura>> uniqueAuras = new LinkedHashMap<>();
      int maxSpecAuras = 0;
      for( ClassSpecAura classSpecAura : classSpecAuras ) {
         Aura aura = classSpecAura.getAura();
         if( classSpecAura.getSpec() == null) {
            nonUniqueAuras.add( aura );
         } else {
            long count = classSpecAuras.stream()
                                       .filter( csAura -> csAura.getAura() == aura )
                                       .count();
            if(count > 1) {
               nonUniqueAuras.add( aura );
            } else {
               List< Aura > specAuras = uniqueAuras.computeIfAbsent( classSpecAura.getSpec(), unused -> new ArrayList<>() );
               specAuras.add( aura );
               maxSpecAuras = Math.max( maxSpecAuras, specAuras.size() );
            }
         }
      }
      List<List<Aura>> aurasCategories = new ArrayList<>();
      for( Aura nonUniqueAura : nonUniqueAuras ) {
         aurasCategories.add(Arrays.asList(nonUniqueAura) );
      }
      for(int i = 0; i<maxSpecAuras; i++) {
         List<Aura> specAuras = new ArrayList<>();
         for( Entry< Spec, List< Aura > > specAurasEntry : uniqueAuras.entrySet() ) {
            List< Aura > entryAuras = specAurasEntry.getValue();
            if( entryAuras.size() > i ) {
               specAuras.add( entryAuras.get( i ) );
            }
         }
         aurasCategories.add( specAuras );
      }
      return aurasCategories;
   }
}