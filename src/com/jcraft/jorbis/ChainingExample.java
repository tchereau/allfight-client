package com.jcraft.jorbis;

class ChainingExample {
   public static void main(String[] var0) {
      com.jcraft.jorbis.x var1 = null;

      try {
         if (var0.length > 0) {
            var1 = new com.jcraft.jorbis.x(var0[0]);
         } else {
            var1 = new com.jcraft.jorbis.x(System.in, (byte[])null, -1);
         }
      } catch (Exception var5) {
         System.err.println(var5);
         return;
      }

      if (var1.if()) {
         System.out.println("Input bitstream contained " + var1.a() + " logical bitstream section(s).");
         System.out.println("Total bitstream playing time: " + var1.if(-1) + " seconds\n");
      } else {
         System.out.println("Standard input was not seekable.");
         System.out.println("First logical bitstream information:\n");
      }

      for(int var2 = 0; var2 < var1.a(); ++var2) {
         com.jcraft.jorbis.f var3 = var1.case(var2);
         System.out.println("\tlogical bitstream section " + (var2 + 1) + " information:");
         System.out.println("\t\t" + var3.f + "Hz " + var3.u + " channels bitrate " + var1.a(var2) / 1000 + "kbps serial number=" + var1.int(var2));
         System.out.print("\t\tcompressed length: " + var1.do(var2) + " bytes ");
         System.out.println(" play time: " + var1.if(var2) + "s");
         com.jcraft.jorbis.y var4 = var1.new(var2);
         System.out.println(var4);
      }

   }
}
