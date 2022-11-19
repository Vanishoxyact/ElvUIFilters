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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class AuraManager {
   
   public static class ClassSpecAura {
      
      private SpecClass specClass;
      private Spec spec;
      private Aura aura;

      public ClassSpecAura( SpecClass specClass, Spec spec, Aura aura ) {
         this.specClass = specClass;
         this.spec = spec;
         this.aura = aura;
      }

      public SpecClass getSpecClass() {
         return specClass;
      }

      public Spec getSpec() {
         return spec;
      }

      public Aura getAura() {
         return aura;
      }
   }
   
   private List<ClassSpecAura> allAuras = new ArrayList<>();
   
   public void addSpecAura(Spec specClass, Aura aura ) {
      allAuras.add( new ClassSpecAura( specClass.getSpecClass(), specClass, aura ) );
   }

   public void addClassAura(SpecClass specClass, Aura aura ) {
      allAuras.add( new ClassSpecAura( specClass, null, aura ) );
   }
   
   public List<ClassSpecAura> getAllAurasOfTypeForClass(AuraType auraType, SpecClass specClass) {
      return allAuras.stream()
                   .filter( aura -> aura.aura.getAuraType() == auraType )
                   .filter( aura -> aura.specClass.equals( specClass ) )
                   .collect( Collectors.toList() );
   }
   
}