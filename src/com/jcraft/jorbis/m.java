package com.jcraft.jorbis;

class m {
   static int do(int var0) {
      int var1;
      for(var1 = 0; var0 != 0; var0 >>>= 1) {
         ++var1;
      }

      return var1;
   }

   static int a(int var0) {
      int var1;
      for(var1 = 0; var0 > 1; var0 >>>= 1) {
         ++var1;
      }

      return var1;
   }

   static int if(int var0) {
      int var1;
      for(var1 = 0; var0 != 0; var0 >>>= 1) {
         var1 += var0 & 1;
      }

      return var1;
   }
}
