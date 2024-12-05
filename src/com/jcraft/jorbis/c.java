package com.jcraft.jorbis;

class c {
   com.jcraft.jorbis.u do = new com.jcraft.jorbis.u();
   int if;
   int a;

   static float a(float[] var0, float[] var1, int var2, int var3) {
      float[] var4 = new float[var3 + 1];

      int var6;
      int var7;
      float var8;
      for(var7 = var3 + 1; var7-- != 0; var4[var7] = var8) {
         var8 = 0.0F;

         for(var6 = var7; var6 < var2; ++var6) {
            var8 += var0[var6] * var0[var6 - var7];
         }
      }

      float var5 = var4[0];

      for(var6 = 0; var6 < var3; ++var6) {
         var8 = -var4[var6 + 1];
         if (var5 == 0.0F) {
            for(int var10 = 0; var10 < var3; ++var10) {
               var1[var10] = 0.0F;
            }

            return 0.0F;
         }

         for(var7 = 0; var7 < var6; ++var7) {
            var8 -= var1[var7] * var4[var6 - var7];
         }

         var8 /= var5;
         var1[var6] = var8;

         for(var7 = 0; var7 < var6 / 2; ++var7) {
            float var9 = var1[var7];
            var1[var7] += var8 * var1[var6 - 1 - var7];
            var1[var6 - 1 - var7] += var8 * var9;
         }

         if (var6 % 2 != 0) {
            var1[var7] += var1[var7] * var8;
         }

         var5 = (float)((double)var5 * (1.0D - (double)(var8 * var8)));
      }

      return var5;
   }

   float a(float[] var1, float[] var2) {
      int var3 = this.if;
      float[] var4 = new float[var3 + var3];
      float var5 = (float)(0.5D / (double)var3);

      int var6;
      for(var6 = 0; var6 < var3; ++var6) {
         var4[var6 * 2] = var1[var6] * var5;
         var4[var6 * 2 + 1] = 0.0F;
      }

      var4[var3 * 2 - 1] = var1[var3 - 1] * var5;
      var3 *= 2;
      this.do.a(var4);
      var6 = 0;

      float var8;
      for(int var7 = var3 / 2; var6 < var3 / 2; var4[var7++] = var8) {
         var8 = var4[var6];
         var4[var6++] = var4[var7];
      }

      return a(var4, var2, var3, this.a);
   }

   void a(int var1, int var2) {
      this.if = var1;
      this.a = var2;
      this.do.a(var1 * 2);
   }

   void a() {
      this.do.a();
   }

   static float a(float var0, float var1) {
      return (float)Math.sqrt((double)(var0 * var0 + var1 * var1));
   }

   void a(float[] var1, float[] var2, float var3) {
      int var4;
      for(var4 = 0; var4 < this.if * 2; ++var4) {
         var1[var4] = 0.0F;
      }

      if (var3 != 0.0F) {
         for(var4 = 0; var4 < this.a; ++var4) {
            var1[var4 * 2 + 1] = var2[var4] / (4.0F * var3);
            var1[var4 * 2 + 2] = -var2[var4] / (4.0F * var3);
         }

         this.do.a(var1);
         var4 = this.if * 2;
         float var5 = (float)(1.0D / (double)var3);
         var1[0] = (float)(1.0D / (double)(var1[0] * 2.0F + var5));

         for(int var6 = 1; var6 < this.if; ++var6) {
            float var7 = var1[var6] + var1[var4 - var6];
            float var8 = var1[var6] - var1[var4 - var6];
            float var9 = var7 + var5;
            var1[var6] = (float)(1.0D / (double)a(var9, var8));
         }

      }
   }
}
