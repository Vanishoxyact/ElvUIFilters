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

   @Override
   public void positionAuras( List< List< Aura > > auras ) {
      for( int i = 0; i < auras.size(); i++ ) {
         List< Aura > aurasForIndex = auras.get( i );
         for( Aura aura : aurasForIndex ) {
            aura.setyOffset( 0 );
            int multiplier = ( int ) Math.ceil( i / 2d );
            int mod = i % 2;
            if( mod == 0 ) {
               aura.setxOffset( multiplier * Aura.OFFSET );
            } else {
               aura.setxOffset( multiplier * - Aura.OFFSET );
            }
         }
      }
   }
}