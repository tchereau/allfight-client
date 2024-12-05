package com.jcraft.jorbis;

class r extends com.jcraft.jorbis.s {
   int a(com.jcraft.jorbis.z var1, Object var2, float[][] var3, int[] var4, int var5) {
      int var6 = 0;

      for(int var7 = 0; var7 < var5; ++var7) {
         if (var4[var7] != 0) {
            var3[var6++] = var3[var7];
         }
      }

      if (var6 != 0) {
         return a(var1, var2, var3, var6, 1);
      } else {
         return 0;
      }
   }
}
