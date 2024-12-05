package com.jcraft.jorbis;

class o extends com.jcraft.jorbis.h {
   float[] int = null;

   void a(Object var1, com.jcraft.a.e var2) {
      o$c var3 = (o$c)var1;
      var2.a(var3.if, 8);
      var2.a(var3.int, 16);
      var2.a(var3.do, 16);
      var2.a(var3.byte, 6);
      var2.a(var3.new, 8);
      var2.a(var3.for - 1, 4);

      for(int var4 = 0; var4 < var3.for; ++var4) {
         var2.a(var3.try[var4], 8);
      }

   }

   Object a(com.jcraft.jorbis.f var1, com.jcraft.a.e var2) {
      o$c var3 = new o$c(this);
      var3.if = var2.for(8);
      var3.int = var2.for(16);
      var3.do = var2.for(16);
      var3.byte = var2.for(6);
      var3.new = var2.for(8);
      var3.for = var2.for(4) + 1;
      if (var3.if >= 1 && var3.int >= 1 && var3.do >= 1 && var3.for >= 1) {
         for(int var4 = 0; var4 < var3.for; ++var4) {
            var3.try[var4] = var2.for(8);
            if (var3.try[var4] < 0 || var3.try[var4] >= var1.j) {
               return null;
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   Object a(com.jcraft.jorbis.k var1, com.jcraft.jorbis.d var2, Object var3) {
      com.jcraft.jorbis.f var5 = var1.p;
      o$c var6 = (o$c)var3;
      o$b var7 = new o$b(this);
      var7.if = var6.if;
      var7.try = var5.q[var2.if] / 2;
      var7.int = var6.do;
      var7.new = var6;
      var7.do.a(var7.int, var7.if);
      float var4 = (float)var7.int / a((float)((double)var6.int / 2.0D));
      var7.for = new int[var7.try];

      for(int var8 = 0; var8 < var7.try; ++var8) {
         int var9 = (int)Math.floor((double)(a((float)((double)var6.int / 2.0D / (double)var7.try * (double)var8)) * var4));
         if (var9 >= var7.int) {
            var9 = var7.int;
         }

         var7.for[var8] = var9;
      }

      return var7;
   }

   static float a(float var0) {
      return (float)(13.1D * Math.atan(7.4E-4D * (double)var0) + 2.24D * Math.atan((double)(var0 * var0) * 1.85E-8D) + 1.0E-4D * (double)var0);
   }

   Object for(Object var1) {
      o$a var2 = new o$a(this);
      o$c var3 = (o$c)var1;
      var2.for = new int[var3.if];
      var2.int = new float[var3.do];
      var2.do = -1L;
      return var2;
   }

   void if(Object var1) {
   }

   void do(Object var1) {
   }

   void a(Object var1) {
   }

   int a(com.jcraft.jorbis.z var1, Object var2, float[] var3, float[] var4, Object var5) {
      return 0;
   }

   int a(com.jcraft.jorbis.z var1, Object var2, float[] var3) {
      o$b var4 = (o$b)var2;
      o$c var5 = var4.new;
      int var6 = var1.void.for(var5.byte);
      if (var6 > 0) {
         int var7 = (1 << var5.byte) - 1;
         float var8 = (float)var6 / (float)var7 * (float)var5.new;
         int var9 = var1.void.for(com.jcraft.jorbis.m.do(var5.for));
         if (var9 != -1 && var9 < var5.for) {
            synchronized(this) {
               if (this.int != null && this.int.length >= var4.if) {
                  for(int var11 = 0; var11 < var4.if; ++var11) {
                     this.int[var11] = 0.0F;
                  }
               } else {
                  this.int = new float[var4.if];
               }

               com.jcraft.jorbis.e var17 = var1.case.b[var5.try[var9]];
               float var12 = 0.0F;

               int var13;
               for(var13 = 0; var13 < var4.if; ++var13) {
                  var3[var13] = 0.0F;
               }

               int var14;
               for(var13 = 0; var13 < var4.if; var13 += var17.int) {
                  if (var17.a(this.int, var13, var1.void, 1, -1) == -1) {
                     for(var14 = 0; var14 < var4.try; ++var14) {
                        var3[var14] = 0.0F;
                     }

                     return 0;
                  }
               }

               for(var13 = 0; var13 < var4.if; var12 = this.int[var13 - 1]) {
                  for(var14 = 0; var14 < var17.int; ++var13) {
                     float[] var10000 = this.int;
                     var10000[var13] += var12;
                     ++var14;
                  }
               }

               com.jcraft.jorbis.ab.a(var3, var4.for, var4.try, var4.int, this.int, var4.if, var8, (float)var5.new);
               return 1;
            }
         }
      }

      return 0;
   }

   Object a(com.jcraft.jorbis.z var1, Object var2, Object var3) {
      o$b var4 = (o$b)var2;
      o$c var5 = var4.new;
      float[] var6 = null;
      if (var3 instanceof float[]) {
         var6 = (float[])((float[])var3);
      }

      int var7 = var1.void.for(var5.byte);
      if (var7 > 0) {
         int var8 = (1 << var5.byte) - 1;
         float var9 = (float)var7 / (float)var8 * (float)var5.new;
         int var10 = var1.void.for(com.jcraft.jorbis.m.do(var5.for));
         if (var10 != -1 && var10 < var5.for) {
            com.jcraft.jorbis.e var11 = var1.case.b[var5.try[var10]];
            float var12 = 0.0F;
            int var13;
            if (var6 != null && var6.length >= var4.if + 1) {
               for(var13 = 0; var13 < var6.length; ++var13) {
                  var6[var13] = 0.0F;
               }
            } else {
               var6 = new float[var4.if + 1];
            }

            for(var13 = 0; var13 < var4.if; var13 += var11.int) {
               if (var11.if(var6, var13, var1.void, var11.int) == -1) {
                  return null;
               }
            }

            for(var13 = 0; var13 < var4.if; var12 = var6[var13 - 1]) {
               for(int var14 = 0; var14 < var11.int; ++var13) {
                  var6[var13] += var12;
                  ++var14;
               }
            }

            var6[var4.if] = var9;
            return var6;
         }
      }

      return null;
   }

   int a(com.jcraft.jorbis.z var1, Object var2, Object var3, float[] var4) {
      o$b var5 = (o$b)var2;
      o$c var6 = var5.new;
      if (var3 != null) {
         float[] var9 = (float[])((float[])var3);
         float var8 = var9[var5.if];
         com.jcraft.jorbis.ab.a(var4, var5.for, var5.try, var5.int, var9, var5.if, var8, (float)var6.new);
         return 1;
      } else {
         for(int var7 = 0; var7 < var5.try; ++var7) {
            var4[var7] = 0.0F;
         }

         return 0;
      }
   }

   static float if(float var0) {
      return (float)Math.exp((double)var0 * 0.11512925D);
   }

   static void a(float[] var0, float[] var1, int var2) {
      int var5 = var2 / 2;
      float[] var6 = new float[var5];
      float[] var7 = new float[var5];
      float[] var9 = new float[var5 + 1];
      float[] var10 = new float[var5 + 1];
      float[] var12 = new float[var5];
      float[] var13 = new float[var5];

      int var3;
      for(var3 = 0; var3 < var5; ++var3) {
         var6[var3] = (float)(-2.0D * Math.cos((double)var0[var3 * 2]));
         var7[var3] = (float)(-2.0D * Math.cos((double)var0[var3 * 2 + 1]));
      }

      int var4;
      for(var4 = 0; var4 < var5; ++var4) {
         var9[var4] = 0.0F;
         var10[var4] = 1.0F;
         var12[var4] = 0.0F;
         var13[var4] = 1.0F;
      }

      var10[var4] = 1.0F;
      var9[var4] = 1.0F;

      for(var3 = 1; var3 < var2 + 1; ++var3) {
         float var11 = 0.0F;
         float var8 = 0.0F;

         for(var4 = 0; var4 < var5; ++var4) {
            float var14 = var6[var4] * var10[var4] + var9[var4];
            var9[var4] = var10[var4];
            var10[var4] = var8;
            var8 += var14;
            var14 = var7[var4] * var13[var4] + var12[var4];
            var12[var4] = var13[var4];
            var13[var4] = var11;
            var11 += var14;
         }

         var1[var3 - 1] = (var8 + var10[var4] + var11 - var9[var4]) / 2.0F;
         var10[var4] = var8;
         var9[var4] = var11;
      }

   }

   static void a(float[] var0, float[] var1, float var2, o$b var3, String var4, int var5) {
      float[] var6 = new float[Math.max(var3.int * 2, var3.if * 2 + 2)];
      int var7;
      if (var2 == 0.0F) {
         for(var7 = 0; var7 < var3.try; ++var7) {
            var0[var7] = 0.0F;
         }

      } else {
         var3.do.a(var6, var1, var2);

         for(var7 = 0; var7 < var3.try; ++var7) {
            var0[var7] = var6[var3.for[var7]];
         }

      }
   }
}
