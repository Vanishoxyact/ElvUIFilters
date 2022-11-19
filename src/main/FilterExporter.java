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

class FilterExporter {

   public String convertAuraIntoFilterString( Aura aura ) {
      return String.format( "\t\t\t\t\t[%s] = {\n" +
                            "\t\t\t\t\t\t[\"enabled\"] = true,\n" +
                            "\t\t\t\t\t\t[\"anyUnit\"] = %s,\n" +
                            "\t\t\t\t\t\t[\"point\"] = \"%s\",\n" +
                            "\t\t\t\t\t\t[\"id\"] = %s,\n" +
                            "\t\t\t\t\t\t[\"yOffset\"] = %s,\n" +
                            "\t\t\t\t\t\t[\"sizeOffset\"] = 0,\n" +
                            "\t\t\t\t\t\t[\"style\"] = \"texturedIcon\",\n" +
                            "\t\t\t\t\t\t[\"xOffset\"] = %s,\n" +
                            "\t\t\t\t\t\t[\"color\"] = {\n" +
                            "\t\t\t\t\t\t\t[\"r\"] = 1,\n" +
                            "\t\t\t\t\t\t\t[\"g\"] = 0,\n" +
                            "\t\t\t\t\t\t\t[\"b\"] = 0,\n" +
                            "\t\t\t\t\t\t},\n" +
                            "\t\t\t\t\t\t[\"onlyShowMissing\"] = false,\n" +
                            "\t\t\t\t\t},",
                            aura.getSpellId(),
                            aura.isShowAnyones(),
                            aura.getAuraAnchor(),
                            aura.getSpellId(),
                            aura.getyOffset(),
                            aura.getxOffset()
                          );
   }
   
}