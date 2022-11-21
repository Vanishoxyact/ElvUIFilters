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

public enum Spec {
   
   BEAST_MASTERY(SpecClass.HUNTER),
   MARKSMANSHIP(SpecClass.HUNTER),
   SURVIVAL(SpecClass.HUNTER),
   
   BLOOD(SpecClass.DEATH_KNIGHT),
   FROST_DK(SpecClass.DEATH_KNIGHT),
   UNHOLY(SpecClass.DEATH_KNIGHT),
   
   HAVOC(SpecClass.DEMON_HUNTER),
   VENGEANCE(SpecClass.DEMON_HUNTER),
   
   FIRE(SpecClass.MAGE),
   FROST_MAGE(SpecClass.MAGE),
   ARCANE(SpecClass.MAGE),
   
   RESTO_SHAM(SpecClass.SHAMAN),
   ELEMENTAL(SpecClass.SHAMAN),
   ENHANCEMENT(SpecClass.SHAMAN),
   
   FERAL(SpecClass.DRUID),
   GUARDIAN(SpecClass.DRUID),
   RESTO_DRUID(SpecClass.DRUID),
   BALANCE(SpecClass.DRUID),
   
   RET(SpecClass.PALADIN),
   HOLY_PALLY(SpecClass.PALADIN),
   PROT_PALLY(SpecClass.PALADIN),
   
   PROT_WARR(SpecClass.WARRIOR),
   FURY(SpecClass.WARRIOR),
   ARMS(SpecClass.WARRIOR),
   
   SHADOW(SpecClass.PRIEST),
   
   ASSASSINATION(SpecClass.ROGUE),
   OUTLAW(SpecClass.ROGUE),
   SUBTLETY(SpecClass.ROGUE),
   
   DESTRUCTION(SpecClass.WARLOCK),
   AFFLICTION(SpecClass.WARLOCK),
   DEMONOLOGY(SpecClass.WARLOCK),
   
   WINDWALKER(SpecClass.MONK),
   BREWMASTER(SpecClass.MONK),
   
   DEVASTATION(SpecClass.EVOKER)
   ;
   
   private SpecClass specClass;

   Spec( SpecClass specClass ) {
      this.specClass = specClass;
   }

   public SpecClass getSpecClass() {
      return specClass;
   }
}
