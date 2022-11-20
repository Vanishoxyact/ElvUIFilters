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

import java.util.List;

class DefensiveBuff extends Aura {

   public DefensiveBuff( int spellId ) {
      super( spellId, Anchor.CENTER, AuraType.DEFENSIVE );
   }

   public DefensiveBuff( int spellId, int index ) {
      this( spellId);
      setIndex(index);
   }
   @Override
   public void positionAuras( List< List< Aura > > auras ) {
      for( int i = 0; i < auras.size(); i++ ) {
         List< Aura > aurasForIndex = auras.get( i );
         for( Aura aura : aurasForIndex ) {
            aura.setyOffset( 0 );
            int index = aura.getIndex().orElse(i);
            if(index > 2) {
               throw new IllegalStateException("Too many auras in block!");
            }
            int multiplier = ( int ) Math.ceil( index / 2d );
            int mod = index % 2;
            if( mod == 0 ) {
               aura.setxOffset( multiplier * Aura.OFFSET );
            } else {
               aura.setxOffset( multiplier * - Aura.OFFSET );
            }
         }
      }
   }
}