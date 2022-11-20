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
import java.util.OptionalInt;

abstract class Aura {
   
   public static int OFFSET = 25;
   
   private int spellId;
   private Anchor auraAnchor;
   private AuraType auraType;
   private boolean showAnyones = true;
   private int xOffset;
   private int yOffset;
   private Integer index;

   public Aura( int spellId, Anchor auraAnchor, AuraType auraType ) {
      this.spellId = spellId;
      this.auraAnchor = auraAnchor;
      this.auraType = auraType;
   }

   public void setxOffset( int xOffset ) {
      this.xOffset = xOffset;
   }

   public void setyOffset( int yOffset ) {
      this.yOffset = yOffset;
   }

   public int getSpellId() {
      return spellId;
   }

   public Anchor getAuraAnchor() {
      return auraAnchor;
   }

   public AuraType getAuraType() {
      return auraType;
   }

   public boolean isShowAnyones() {
      return showAnyones;
   }

   public int getxOffset() {
      return xOffset;
   }

   public int getyOffset() {
      return yOffset;
   }

   public OptionalInt getIndex() {
      if(index == null) {
         return OptionalInt.empty();
      } else {
         return OptionalInt.of(index);
      }
   }

   public void setIndex(int index) {
      this.index = index;
   }

   public abstract void positionAuras( List<List<Aura>> auras );
}