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
import main.java.com.purplefrog.jluadata.LuaDumper;
import main.java.com.purplefrog.jluadata.LuaUpdater;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Main {
   
   private static final String FILE_PATH = "C:\\Users\\Alex\\Documents\\GitHub\\ElvUIFilters\\src\\backup\\ElvUI.lua";
   private static final Path PATH = new File(FILE_PATH).toPath();;
   
   public static void main(String[] args) throws IOException, ParseException {
      updateGlobalFilters();
   }

   private static void updateGlobalFilters() throws IOException, ParseException {
      FilterGenerator filterGenerator = new FilterGenerator();
      Map<Long, Object> globalMap = filterGenerator.generateAuras();

      LuaUpdater luaUpdater = new LuaUpdater();
      Map<String, Object> dictionary = luaUpdater.readLuaIntoTable(PATH);
      Map<Object, Object> globalAuras = (Map<Object, Object>) luaUpdater.exploreDictionary(dictionary, "ElvDB", "global", "unitframe", "aurawatch", "GLOBAL");
      globalAuras.putAll(globalMap);
      String newStr = LuaDumper.dumpAsLuaDict(dictionary);
      Files.writeString(PATH, newStr, StandardOpenOption.WRITE);
      System.out.println(newStr);
   }
   
   private static void removeGlobalFromClassFilters() throws IOException, ParseException {
      FilterGenerator filterGenerator = new FilterGenerator();
      Map<Long, Object> globalMap = filterGenerator.generateAuras();
      
      Path path = new File(FILE_PATH).toPath();
      LuaUpdater luaUpdater = new LuaUpdater();
      Map<String, Object> dictionary = luaUpdater.readLuaIntoTable(path);
      removeGlobalFromClassFilters(dictionary, "PALADIN", globalMap);
      removeGlobalFromClassFilters(dictionary, "PRIEST", globalMap);
      removeGlobalFromClassFilters(dictionary, "DRUID", globalMap);
      removeGlobalFromClassFilters(dictionary, "MONK", globalMap);
      removeGlobalFromClassFilters(dictionary, "SHAMAN", globalMap);

      String newStr = LuaDumper.dumpAsLuaDict(dictionary);
      Files.writeString(PATH, newStr, StandardOpenOption.WRITE);
      System.out.println(newStr);
   }

   private static void removeGlobalFromClassFilters(Map<String, Object> dictionary, String className, Map<Long, Object> globalMap) {
      LuaUpdater luaUpdater = new LuaUpdater();
      Map<Object, Object> classAuras = (Map<Object, Object>) luaUpdater.exploreDictionary(dictionary, "ElvDB", "global", "unitframe", "aurawatch", className);
      Iterator<Entry<Object, Object>> auraIterator = classAuras.entrySet().iterator();
      while(auraIterator.hasNext()) {
         Entry<Object, Object> next = auraIterator.next();
         if(globalMap.containsKey(next.getKey())) {
            auraIterator.remove();
         }
      }

      classAuras.remove(79853L);
      classAuras.remove(194844L);
      classAuras.remove(125174L);
      classAuras.remove(207319L);
      classAuras.remove(210320L);
      classAuras.remove(78826L);
      classAuras.remove(90958L);
      classAuras.remove(65860L);
      classAuras.remove(120954L);
      classAuras.remove(183416L);
      classAuras.remove(33206L);
      classAuras.remove(97463L);
      classAuras.remove(199754L);
      classAuras.remove(198589L);
      classAuras.remove(66023L);
      classAuras.remove(164444L);
      classAuras.remove(209426L);
      classAuras.remove(183415L);
      classAuras.remove(114250L);
      classAuras.remove(31379L);
      classAuras.remove(115176L);
      classAuras.remove(108416L);
      classAuras.remove(266018L);
   }
}