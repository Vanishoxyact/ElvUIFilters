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
      populateEvokerAuras();
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

      auraManager.addSpecAura( Spec.FROST_DK, new ClassBuff(47568) );//Empower Rune Weapon
      auraManager.addSpecAura( Spec.FROST_DK, new ClassBuff(51271) );//Pillar of Frost
      auraManager.addSpecAura( Spec.FROST_DK, new ClassBuff(152279) );//Breath of Sindragosa

      auraManager.addSpecAura( Spec.UNHOLY, new ClassBuff(47568) );//Empower Rune Weapon
      auraManager.addSpecAura( Spec.UNHOLY, new ClassBuff(207289) );//Unholy Assault

      //Bone shield? (195181)
      auraManager.addSpecAura( Spec.BLOOD, new DefensiveBuff(55233) );//Vampiric Blood
      auraManager.addSpecAura( Spec.BLOOD, new ClassBuff(194679) );//Runetap
      auraManager.addSpecAura( Spec.BLOOD, new ClassBuff(81256) );//Dancing Rune Weapon
      auraManager.addSpecAura( Spec.BLOOD, new ClassBuff(194844) );//Bonestorm

      //Globals
      //145629 - AMZ
   }
   
   private void populateHunterAuras() {
      //TODO need to check
      auraManager.addClassAura( SpecClass.HUNTER, new DefensiveBuff(186265) );//Turtle
      auraManager.addClassAura( SpecClass.HUNTER, new DefensiveBuff(264735) );//Survival of the Fittest
      
      auraManager.addSpecAura( Spec.BEAST_MASTERY, new ClassBuff(193530) );//Aspect of the Wild
      auraManager.addSpecAura( Spec.BEAST_MASTERY, new ClassBuff(359844) );//Call of the Wild
      
      auraManager.addSpecAura( Spec.MARKSMANSHIP, new ClassBuff(288613) );//Trueshot
      
      auraManager.addSpecAura( Spec.SURVIVAL, new ClassBuff(266779) );//Coordinated Assault
      auraManager.addSpecAura( Spec.SURVIVAL, new ClassBuff(360966) );//Spearhead
   }
   
   private void populateDhAuras() {
      auraManager.addSpecAura( Spec.HAVOC, new DefensiveBuff(212800) );//Blur
      auraManager.addSpecAura( Spec.HAVOC, new DefensiveBuff(196555) );//Netherwalk
      auraManager.addSpecAura( Spec.HAVOC, new ClassBuff(162264) );//Meta

      auraManager.addSpecAura( Spec.VENGEANCE, new DefensiveBuff(187827) );//Meta
      auraManager.addSpecAura( Spec.VENGEANCE, new DefensiveBuff(203819) );//Demon Spikes
      auraManager.addSpecAura( Spec.VENGEANCE, new ClassBuff(263648) );//Soul Barrier
      auraManager.addSpecAura( Spec.VENGEANCE, new ClassBuff(203981) );//Soul Fragments
      
      //Globals
      //209426 - Darkness
   }

   private void populateMageAuras() {
      auraManager.addClassAura( SpecClass.MAGE, new DefensiveBuff(45438) );//Ice block
      auraManager.addClassAura( SpecClass.MAGE, new DefensiveBuff(113862) );//Greater Invis
      
      auraManager.addSpecAura( Spec.FIRE, new DefensiveBuff(86949) );//Cauterize
      auraManager.addSpecAura( Spec.FIRE, new ClassBuff(190319) );//Combustion
      
      auraManager.addSpecAura( Spec.FROST_MAGE, new ClassBuff(12472) );//Icy Veins
      
      auraManager.addSpecAura( Spec.ARCANE, new ClassBuff(365362) );//Arcane Surge
   }

   private void populateShamanAuras() {
      auraManager.addClassAura( SpecClass.SHAMAN, new DefensiveBuff(108271) );//Astral Shift
      auraManager.addClassAura( SpecClass.SHAMAN, new DefensiveBuff(381755) );//Earth Ele

      auraManager.addSpecAura( Spec.ELEMENTAL, new ClassBuff(114050) );//Ascendance
      auraManager.addSpecAura( Spec.ELEMENTAL, new ClassBuff(263806) );//Storm Elemental (Wind Gust)

      auraManager.addSpecAura( Spec.ENHANCEMENT, new ClassBuff(114051) );//Ascendance
      auraManager.addSpecAura( Spec.ENHANCEMENT, new ClassBuff(333957) );//Feral Spirit
      
      //Global
      //Stoneskin?
   }
   
   private void populateDruidAuras() {
      auraManager.addClassAura( SpecClass.DRUID, new DefensiveBuff(22812) );//Barkskin
      auraManager.addClassAura( SpecClass.DRUID, new DefensiveBuff(22842) );//Frenzied Regeneration

      auraManager.addSpecAura( Spec.FERAL, new DefensiveBuff(61336) );//Survival Instincts
      auraManager.addSpecAura( Spec.FERAL, new ClassBuff(106951, 0) );//Berserk
      auraManager.addSpecAura( Spec.FERAL, new ClassBuff(102543, 0) );//Incarn

      auraManager.addSpecAura( Spec.GUARDIAN, new DefensiveBuff(61336) );//Survival Instincts
      auraManager.addSpecAura( Spec.GUARDIAN, new ClassBuff(192081) );//Ironfur
      auraManager.addSpecAura( Spec.GUARDIAN, new ClassBuff(50334, 1) );//Berserk
      auraManager.addSpecAura( Spec.GUARDIAN, new ClassBuff(102558, 1) );//Incarn
      auraManager.addSpecAura( Spec.GUARDIAN, new ClassBuff(200851, 2) );//Rage of the Sleeper

      auraManager.addSpecAura( Spec.BALANCE, new ClassBuff(194223) );//Celestial Alignment
   }
   
   private void populatePaladinAuras() {
      auraManager.addClassAura( SpecClass.PALADIN, new DefensiveBuff(642) );//Divine Shield
      auraManager.addClassAura( SpecClass.PALADIN, new ClassBuff(31884) );//Avenging Wrath
      auraManager.addClassAura( SpecClass.PALADIN, new ClassBuff(152262) );//Seraphim

      auraManager.addSpecAura( Spec.RET, new DefensiveBuff(184662, 1) );//Shield of Vengeance
      auraManager.addSpecAura( Spec.RET, new DefensiveBuff(498, 1) );//Divine Protection
      auraManager.addSpecAura( Spec.RET, new ClassBuff(231895, 0) );//Crusade

      auraManager.addSpecAura( Spec.PROT_PALLY, new DefensiveBuff(86659) );//Guardian of Ancient Kings
      auraManager.addSpecAura( Spec.PROT_PALLY, new DefensiveBuff(327193) );//Moment of Glory
      auraManager.addSpecAura( Spec.PROT_PALLY, new ClassBuff(31850) );//Ardent Defender
      auraManager.addSpecAura( Spec.PROT_PALLY, new ClassBuff(389539, 0) );//Sentinel
      
      //Globals
      //Bop 1022
      //Sac 6940
      //Spellwarding 204018
      //Freedom 1044
   }
   
   private void populateWarriorAuras() {
      auraManager.addClassAura( SpecClass.WARRIOR, new DefensiveBuff(23920) );//Spell Reflection
      auraManager.addClassAura( SpecClass.WARRIOR, new ClassBuff(107574) );//Avatar

      auraManager.addSpecAura( Spec.PROT_WARR, new DefensiveBuff(12975) );//Last Stand
      auraManager.addSpecAura( Spec.PROT_WARR, new DefensiveBuff(392966) );//Spell Block
      auraManager.addSpecAura( Spec.PROT_WARR, new ClassBuff(871) );//Shield Wall
      auraManager.addSpecAura( Spec.PROT_WARR, new ClassBuff(132404) );//Shield Block

      auraManager.addSpecAura( Spec.ARMS, new DefensiveBuff(118038) );//Die by the Sword
      auraManager.addSpecAura( Spec.ARMS, new ClassBuff(227847) );//Bladestorm

      auraManager.addSpecAura( Spec.FURY, new DefensiveBuff(184364) );//Enraged Regeneration
      auraManager.addSpecAura( Spec.FURY, new ClassBuff(1719) );//Recklessness
      
      //Globals
      //Rally 97463
   }

   private void populatePriestAuras() {
      auraManager.addSpecAura( Spec.SHADOW, new DefensiveBuff(47585) );//Dispersion
      auraManager.addSpecAura( Spec.SHADOW, new ClassBuff(391109, 0) );//Dark Ascension
      auraManager.addSpecAura( Spec.SHADOW, new ClassBuff(194249, 0) );//Voidform
      
      //Global
      //Power Infusion 10060
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
      
      //Track affl darkglare?
      
      //Track destro infernal?
      
      auraManager.addSpecAura( Spec.DEMONOLOGY, new ClassBuff(265273) );//Demonic Power
      auraManager.addSpecAura( Spec.DEMONOLOGY, new ClassBuff(267218) );//Nether Portal
      //Track GfG?
   }

   private void populateMonkAuras() {
      auraManager.addClassAura( SpecClass.MONK, new DefensiveBuff(122278) );//Dampen Harm
      auraManager.addClassAura( SpecClass.MONK, new DefensiveBuff(120954) );//Fortifying Brew
      auraManager.addClassAura( SpecClass.MONK, new DefensiveBuff(122783) );//Diffuse Magic

      auraManager.addSpecAura( Spec.BREWMASTER, new ClassBuff(124275, 0) );//Light Stagger
      auraManager.addSpecAura( Spec.BREWMASTER, new ClassBuff(124274, 0) );//Moderate Stagger
      auraManager.addSpecAura( Spec.BREWMASTER, new ClassBuff(124273, 0) );//Heavy Stagger
      //auraManager.addSpecAura( Spec.BREWMASTER, new ClassBuff(387184) );//Weapons of Order
      auraManager.addSpecAura( Spec.BREWMASTER, new ClassBuff(115176, 1) );//Zen Meditation
      auraManager.addSpecAura( Spec.BREWMASTER, new ClassBuff(132578, 2) );//Invoke Niuzao, the Black Ox

      auraManager.addSpecAura( Spec.WINDWALKER, new ClassBuff(125174, 2) );//Touch of Karma
      auraManager.addSpecAura( Spec.WINDWALKER, new ClassBuff(137639, 0) );//Storm, Earth & Fire
      auraManager.addSpecAura( Spec.WINDWALKER, new ClassBuff(152173, 0) );//Serenity
      //Track Xuen pet
   }

   private void populateEvokerAuras() {
      auraManager.addClassAura( SpecClass.EVOKER, new DefensiveBuff(363916) );//Obsidian Scales
      auraManager.addClassAura( SpecClass.EVOKER, new DefensiveBuff(374348) );//Renewing Blaze

      auraManager.addSpecAura( Spec.DEVASTATION, new ClassBuff(375087) );//Dragonrage

      //Global
      //Zephyr - 374227
   }
   
   //global stoneskin?
}