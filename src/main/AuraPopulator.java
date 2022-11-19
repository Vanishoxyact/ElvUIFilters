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

import java.util.Arrays;
import java.util.List;

class AuraPopulator {
   
   private final AuraManager auraManager;

   public AuraPopulator( AuraManager auraManager ) {
      this.auraManager = auraManager;
   }

   public void populateManager() {
      populateDkAuras();
      populateHunterAuras();
      populateDhAuras();
      populateMageAuras();
      populateShamanAuras();
      populateDruidAuras();
      populatePaladinAuras();
      populateWarriorAuras();
      populatePriestAuras();
      populateRogueAuras();
      populateWarlockAuras();
      populateMonkAuras();
   }
   
   public List< List<Aura> > populateExternalsList(){
      return Arrays.asList(
            Arrays.asList(
                  new ExternalBuff(6940),//Sac
                  new ExternalBuff(1022),//Bop
                  new ExternalBuff(204018)//Spellwarding
            ),
            Arrays.asList(
                  new ExternalBuff(48707),//AMZ
                  new ExternalBuff(196718)//Darkness
            ),
            Arrays.asList(
                  new ExternalBuff(97462)//Rallying Cry
            )
      );
   }
   
   private void populateDkAuras() {
      auraManager.addClassAura( SpecClass.DEATH_KNIGHT, new DefensiveBuff(48792) );//Icebound Fortitude
      auraManager.addClassAura( SpecClass.DEATH_KNIGHT, new DefensiveBuff(48707) );//Anti-Magic Shell
      auraManager.addClassAura( SpecClass.DEATH_KNIGHT, new DefensiveBuff(50397) );//Lichborne

      auraManager.addSpecAura( Spec.FROST_DK, new ClassBuff(51271) );//Pillar of Frost
      auraManager.addSpecAura( Spec.FROST_DK, new ClassBuff(47568) );//Empower Rune Weapon
      auraManager.addSpecAura( Spec.FROST_DK, new ClassBuff(152279) );//Breath of Sindragosa

      auraManager.addSpecAura( Spec.BLOOD, new ClassBuff(55233) );//Vampiric Blood
      auraManager.addSpecAura( Spec.BLOOD, new ClassBuff(194679) );//Runetap
      auraManager.addSpecAura( Spec.BLOOD, new ClassBuff(49028) );//Dancing Rune Weapon
   }
   
   private void populateHunterAuras() {
      auraManager.addClassAura( SpecClass.HUNTER, new DefensiveBuff(186265) );//Turtle
      auraManager.addClassAura( SpecClass.HUNTER, new DefensiveBuff(264735) );//Survival of the Fittest
      auraManager.addClassAura( SpecClass.HUNTER, new DefensiveBuff(281195) );//Survival of the Fittest
      
      auraManager.addSpecAura( Spec.BEAST_MASTERY, new ClassBuff(193530) );//Aspect of the Wild
      
      auraManager.addSpecAura( Spec.MARKSMANSHIP, new ClassBuff(288613) );//Trueshot
      
      auraManager.addSpecAura( Spec.SURVIVAL, new ClassBuff(266779) );//Coordinated Assult
   }
   
   private void populateDhAuras() {
      auraManager.addSpecAura( Spec.HAVOC, new ClassBuff(162264) );//Meta
      auraManager.addSpecAura( Spec.HAVOC, new DefensiveBuff(212800) );//Blur

      auraManager.addSpecAura( Spec.VENGEANCE, new DefensiveBuff(187827) );//Meta
      auraManager.addSpecAura( Spec.VENGEANCE, new DefensiveBuff(203720) );//Demon Spikes
   }

   private void populateMageAuras() {
      auraManager.addClassAura( SpecClass.MAGE, new DefensiveBuff(45438) );//Ice block
      
      auraManager.addSpecAura( Spec.FIRE, new DefensiveBuff(86949) );//Cauterize
      auraManager.addSpecAura( Spec.FIRE, new ClassBuff(190319) );//Combustion
      
      auraManager.addSpecAura( Spec.FROST_MAGE, new ClassBuff(12472) );//Icy Veins
      
      auraManager.addSpecAura( Spec.ARCANE, new ClassBuff(12042) );//Arcane Power
   }

   private void populateShamanAuras() {
      auraManager.addClassAura( SpecClass.SHAMAN, new DefensiveBuff(108271) );//Astral Shift

      auraManager.addSpecAura( Spec.ELEMENTAL, new ClassBuff(114050) );//Ascendance
      auraManager.addSpecAura( Spec.ELEMENTAL, new ClassBuff(263806) );//Storm Elemental (Wind Gust)

      auraManager.addSpecAura( Spec.ENHANCEMENT, new ClassBuff(114051) );//Ascendance
   }
   
   private void populateDruidAuras() {
      auraManager.addClassAura( SpecClass.DRUID, new DefensiveBuff(22812) );//Barkskin
      auraManager.addClassAura( SpecClass.DRUID, new DefensiveBuff(22842) );//Frenzied Regeneration

      auraManager.addSpecAura( Spec.FERAL, new DefensiveBuff(61336) );//Survival Instincts
      auraManager.addSpecAura( Spec.FERAL, new ClassBuff(106951) );//Berserk

      auraManager.addSpecAura( Spec.GUARDIAN, new ClassBuff(192081) );//Ironfur
      auraManager.addSpecAura( Spec.GUARDIAN, new ClassBuff(50334) );//Berserk
      auraManager.addSpecAura( Spec.GUARDIAN, new ClassBuff(61336) );//Survival Instincts

      auraManager.addSpecAura( Spec.BALANCE, new ClassBuff(194223) );//Celestial Alignment
      auraManager.addSpecAura( Spec.BALANCE, new ClassBuff(323546) );//Ravenous Frenzy
      auraManager.addSpecAura( Spec.BALANCE, new ClassBuff(319454) );//Heart of the Wild
   }
   
   private void populatePaladinAuras() {
      auraManager.addClassAura( SpecClass.PALADIN, new DefensiveBuff(642) );//Divine Shield
      auraManager.addClassAura( SpecClass.PALADIN, new ClassBuff(31884) );//Avenging Wrath

      auraManager.addSpecAura( Spec.RET, new DefensiveBuff(184662) );//Shield of Vengeance

      auraManager.addSpecAura( Spec.PROT_PALLY, new ClassBuff(86659) );//Guardian of Ancient Kings
      auraManager.addSpecAura( Spec.PROT_PALLY, new ClassBuff(31850) );//Ardent Defender
      auraManager.addSpecAura( Spec.PROT_PALLY, new ClassBuff(327510) );//Shining Light
   }
   
   private void populateWarriorAuras() {
      auraManager.addClassAura( SpecClass.WARRIOR, new DefensiveBuff(23920) );//Spell Reflection

      auraManager.addSpecAura( Spec.PROT_WARR, new DefensiveBuff(871) );//Shield Wall
      auraManager.addSpecAura( Spec.PROT_WARR, new DefensiveBuff(12975) );//Last Stand
      auraManager.addSpecAura( Spec.PROT_WARR, new ClassBuff(2565) );//Shield Block
      auraManager.addSpecAura( Spec.PROT_WARR, new ClassBuff(107574) );//Avatar

      auraManager.addSpecAura( Spec.ARMS, new DefensiveBuff(118038) );//Die by the Sword
      auraManager.addSpecAura( Spec.ARMS, new ClassBuff(107574) );//Avatar

      auraManager.addSpecAura( Spec.FURY, new DefensiveBuff(184364) );//Enraged Regeneration
      auraManager.addSpecAura( Spec.FURY, new ClassBuff(1719) );//Recklessness
   }

   private void populatePriestAuras() {
      auraManager.addSpecAura( Spec.SHADOW, new DefensiveBuff(47585) );//Dispersion
      auraManager.addSpecAura( Spec.SHADOW, new ClassBuff(194249) );//Voidform
   }

   private void populateRogueAuras() {
      auraManager.addClassAura( SpecClass.ROGUE, new DefensiveBuff(1966) );//Feint
      auraManager.addClassAura( SpecClass.ROGUE, new DefensiveBuff(5277) );//Evasion
      auraManager.addClassAura( SpecClass.ROGUE, new DefensiveBuff(31224) );//Cloak of Shadows

      auraManager.addSpecAura( Spec.OUTLAW, new ClassBuff(13750) );//Adrenaline Rush
      
      auraManager.addSpecAura( Spec.SUBTLETY, new ClassBuff(121471) );//Shadow Blades
   }

   private void populateWarlockAuras() {
      auraManager.addClassAura( SpecClass.WARLOCK, new DefensiveBuff(104773) );//Unending Resolve

      auraManager.addSpecAura( Spec.AFFLICTION, new ClassBuff(113860) );//Dark Soul: Misery
      
      auraManager.addSpecAura( Spec.DESTRUCTION, new ClassBuff(113858) );//Dark Soul: Instability
      
      auraManager.addSpecAura( Spec.DEMONOLOGY, new ClassBuff(265273) );//Demonic Power
   }

   private void populateMonkAuras() {
      auraManager.addSpecAura( Spec.BREWMASTER, new DefensiveBuff(122278) );//Dampen Harm
      auraManager.addSpecAura( Spec.BREWMASTER, new DefensiveBuff(115203) );//Fortifying Brew
      auraManager.addSpecAura( Spec.BREWMASTER, new ClassBuff(124274) );//Moderate Stagger
      auraManager.addSpecAura( Spec.BREWMASTER, new ClassBuff(124273) );//Heavy Stagger
      auraManager.addSpecAura( Spec.BREWMASTER, new ClassBuff(310454) );//Weapons of Order

      auraManager.addSpecAura( Spec.WINDWALKER, new DefensiveBuff(122470) );//Dampen Harm
      auraManager.addSpecAura( Spec.WINDWALKER, new DefensiveBuff(243435) );//Fortifying Brew
      auraManager.addSpecAura( Spec.WINDWALKER, new DefensiveBuff(122783) );//Diffuse Magic
      auraManager.addSpecAura( Spec.WINDWALKER, new ClassBuff(310454) );//Weapons of Order
      auraManager.addSpecAura( Spec.WINDWALKER, new ClassBuff(137639) );//Storm, Earth & Fire
      auraManager.addSpecAura( Spec.WINDWALKER, new ClassBuff(123904) );//Invoke Xuen
   }
}