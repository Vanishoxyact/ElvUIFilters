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
package main.java.com.purplefrog.jluadata;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LuaUpdater {
   
   public Map<String,Object> readLuaIntoTable(Path path) throws IOException, ParseException {
      String s = Files.readString(path);
      return new LuaParser(new StringReader(s)).parseDictionary();
   }

   public Object exploreDictionary(Map<String,Object> dictionary, Object... path) {
      Map cast = dictionary;
      return explore(cast, path);
   }
   
   private Object explore(Map<Object,Object> layer, Object... remainingPath) {
      List<Object> pathList = Arrays.stream(remainingPath).collect(Collectors.toList());
      Object topElement = pathList.remove(0);
      Object topObject = layer.get(topElement);
      if(pathList.isEmpty()) {
         return topObject;
      } else {
         return explore((Map<Object, Object>) topObject, pathList.toArray());
      }
   }
}