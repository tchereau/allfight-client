package com.jcraft.jorbis;

class e {
   int int;
   int a;
   com.jcraft.jorbis.l try = new com.jcraft.jorbis.l();
   float[] for;
   int[] new;
   e$a if;
   private int[] do = new int[15];

   int a(int var1, com.jcraft.a.e var2) {
      var2.a(this.new[var1], this.try.if[var1]);
      return this.try.if[var1];
   }

   int a(float[] var1) {
      int var2 = this.a((float[])var1, 1);

      for(int var3 = 0; var3 < this.int; ++var3) {
         var1[var3] = this.for[var2 * this.int + var3];
      }

      return var2;
   }

   int a(int var1, float[] var2, com.jcraft.a.e var3) {
      for(int var4 = 0; var4 < this.int; ++var4) {
         var2[var4] = this.for[var1 * this.int + var4];
      }

      return this.a(var1, var3);
   }

   int a(float[] var1, com.jcraft.a.e var2, int var3, int var4) {
      int var5 = this.a(var1, var3, var4);
      return this.a(var5, var2);
   }

   synchronized int do(float[] var1, int var2, com.jcraft.a.e var3, int var4) {
      int var5 = var4 / this.int;
      if (this.do.length < var5) {
         this.do = new int[var5];
      }

      int var7;
      for(var7 = 0; var7 < var5; ++var7) {
         int var6 = this.a(var3);
         if (var6 == -1) {
            return -1;
         }

         this.do[var7] = var6 * this.int;
      }

      var7 = 0;

      for(int var9 = 0; var7 < this.int; var9 += var5) {
         for(int var8 = 0; var8 < var5; ++var8) {
            var1[var2 + var9 + var8] += this.for[this.do[var8] + var7];
         }

         ++var7;
      }

      return 0;
   }

   int a(float[] var1, int var2, com.jcraft.a.e var3, int var4) {
      int var10002;
      int var5;
      int var6;
      int var7;
      int var8;
      if (this.int > 8) {
         var5 = 0;

         while(var5 < var4) {
            var7 = this.a(var3);
            if (var7 == -1) {
               return -1;
            }

            var8 = var7 * this.int;

            for(var6 = 0; var6 < this.int; var1[var2 + var10002] += this.for[var8 + var6++]) {
               var10002 = var5++;
            }
         }
      } else {
         var5 = 0;

         while(var5 < var4) {
            var7 = this.a(var3);
            if (var7 == -1) {
               return -1;
            }

            var8 = var7 * this.int;
            var6 = 0;
            switch(this.int) {
            case 0:
            default:
               break;
            case 8:
               var10002 = var5++;
               var1[var2 + var10002] += this.for[var8 + var6++];
            case 7:
               var10002 = var5++;
               var1[var2 + var10002] += this.for[var8 + var6++];
            case 6:
               var10002 = var5++;
               var1[var2 + var10002] += this.for[var8 + var6++];
            case 5:
               var10002 = var5++;
               var1[var2 + var10002] += this.for[var8 + var6++];
            case 4:
               var10002 = var5++;
               var1[var2 + var10002] += this.for[var8 + var6++];
            case 3:
               var10002 = var5++;
               var1[var2 + var10002] += this.for[var8 + var6++];
            case 2:
               var10002 = var5++;
               var1[var2 + var10002] += this.for[var8 + var6++];
            case 1:
               var10002 = var5++;
               var1[var2 + var10002] += this.for[var8 + var6++];
            }
         }
      }

      return 0;
   }

   int if(float[] var1, int var2, com.jcraft.a.e var3, int var4) {
      int var5 = 0;

      while(var5 < var4) {
         int var7 = this.a(var3);
         if (var7 == -1) {
            return -1;
         }

         int var8 = var7 * this.int;

         for(int var6 = 0; var6 < this.int; var1[var2 + var5++] = this.for[var8 + var6++]) {
         }
      }

      return 0;
   }

   int a(float[][] var1, int var2, int var3, com.jcraft.a.e var4, int var5) {
      int var9 = 0;
      int var6 = var2 / var3;

      while(var6 < (var2 + var5) / var3) {
         int var8 = this.a(var4);
         if (var8 == -1) {
            return -1;
         }

         int var10 = var8 * this.int;

         for(int var7 = 0; var7 < this.int; ++var7) {
            int var10001 = var9++;
            var1[var10001][var6] += this.for[var10 + var7];
            if (var9 == var3) {
               var9 = 0;
               ++var6;
            }
         }
      }

      return 0;
   }

   int a(com.jcraft.a.e var1) {
      int var2 = 0;
      e$a var3 = this.if;
      int var4 = var1.a(var3.try);
      if (var4 >= 0) {
         var2 = var3.int[var4];
         var1.do(var3.do[var4]);
         if (var2 <= 0) {
            return -var2;
         }
      }

      do {
         switch(var1.try()) {
         case -1:
         default:
            return -1;
         case 0:
            var2 = var3.new[var2];
            break;
         case 1:
            var2 = var3.for[var2];
         }
      } while(var2 > 0);

      return -var2;
   }

   int a(float[] var1, int var2, com.jcraft.a.e var3, int var4, int var5) {
      int var6 = this.a(var3);
      if (var6 == -1) {
         return -1;
      } else {
         int var7;
         int var8;
         switch(var5) {
         case -1:
            var7 = 0;

            for(var8 = 0; var7 < this.int; var8 += var4) {
               var1[var2 + var8] = this.for[var6 * this.int + var7];
               ++var7;
            }

            return var6;
         case 0:
            var7 = 0;

            for(var8 = 0; var7 < this.int; var8 += var4) {
               var1[var2 + var8] += this.for[var6 * this.int + var7];
               ++var7;
            }

            return var6;
         case 1:
            var7 = 0;

            for(var8 = 0; var7 < this.int; var8 += var4) {
               var1[var2 + var8] *= this.for[var6 * this.int + var7];
               ++var7;
            }
         }

         return var6;
      }
   }

   int a(float[] var1, int var2) {
      int var3 = -1;
      float var4 = 0.0F;
      int var5 = 0;

      for(int var6 = 0; var6 < this.a; ++var6) {
         if (this.try.if[var6] > 0) {
            float var7 = a(this.int, this.for, var5, var1, var2);
            if (var3 == -1 || var7 < var4) {
               var4 = var7;
               var3 = var6;
            }
         }

         var5 += this.int;
      }

      return var3;
   }

   int a(float[] var1, int var2, int var3) {
      int var4 = this.a(var1, var2);
      int var5;
      int var6;
      switch(var3) {
      case 0:
         var5 = 0;

         for(var6 = 0; var5 < this.int; var6 += var2) {
            var1[var6] -= this.for[var4 * this.int + var5];
            ++var5;
         }

         return var4;
      case 1:
         var5 = 0;

         for(var6 = 0; var5 < this.int; var6 += var2) {
            float var7 = this.for[var4 * this.int + var5];
            if (var7 == 0.0F) {
               var1[var6] = 0.0F;
            } else {
               var1[var6] /= var7;
            }

            ++var5;
         }
      }

      return var4;
   }

   void a() {
   }

   private static float a(int var0, float[] var1, int var2, float[] var3, int var4) {
      float var5 = 0.0F;

      for(int var6 = 0; var6 < var0; ++var6) {
         float var7 = var1[var2 + var6] - var3[var6 * var4];
         var5 += var7 * var7;
      }

      return var5;
   }

   int a(com.jcraft.jorbis.l var1) {
      this.try = var1;
      this.a = var1.new;
      this.int = var1.int;
      this.for = var1.do();
      this.if = this.if();
      if (this.if == null) {
         this.a();
         return -1;
      } else {
         return 0;
      }
   }

   static int[] a(int[] var0, int var1) {
      int[] var2 = new int[33];
      int[] var3 = new int[var1];

      int var4;
      int var5;
      int var6;
      for(var4 = 0; var4 < var1; ++var4) {
         var5 = var0[var4];
         if (var5 > 0) {
            var6 = var2[var5];
            if (var5 < 32 && var6 >>> var5 != 0) {
               return null;
            }

            var3[var4] = var6;

            int var7;
            for(var7 = var5; var7 > 0; --var7) {
               int var10002;
               if ((var2[var7] & 1) != 0) {
                  if (var7 == 1) {
                     var10002 = var2[1]++;
                  } else {
                     var2[var7] = var2[var7 - 1] << 1;
                  }
                  break;
               }

               var10002 = var2[var7]++;
            }

            for(var7 = var5 + 1; var7 < 33 && var2[var7] >>> 1 == var6; ++var7) {
               var6 = var2[var7];
               var2[var7] = var2[var7 - 1] << 1;
            }
         }
      }

      for(var4 = 0; var4 < var1; ++var4) {
         var5 = 0;

         for(var6 = 0; var6 < var0[var4]; ++var6) {
            var5 <<= 1;
            var5 |= var3[var4] >>> var6 & 1;
         }

         var3[var4] = var5;
      }

      return var3;
   }

   e$a if() {
      int var1 = 0;
      e$a var2 = new e$a(this);
      int[] var3 = var2.new = new int[this.a * 2];
      int[] var4 = var2.for = new int[this.a * 2];
      int[] var5 = a(this.try.if, this.try.new);
      if (var5 == null) {
         return null;
      } else {
         var2.if = this.a * 2;

         int var6;
         int var7;
         int var8;
         int var9;
         for(var6 = 0; var6 < this.a; ++var6) {
            if (this.try.if[var6] > 0) {
               var7 = 0;

               for(var8 = 0; var8 < this.try.if[var6] - 1; ++var8) {
                  var9 = var5[var6] >>> var8 & 1;
                  if (var9 == 0) {
                     if (var3[var7] == 0) {
                        ++var1;
                        var3[var7] = var1;
                     }

                     var7 = var3[var7];
                  } else {
                     if (var4[var7] == 0) {
                        ++var1;
                        var4[var7] = var1;
                     }

                     var7 = var4[var7];
                  }
               }

               if ((var5[var6] >>> var8 & 1) == 0) {
                  var3[var7] = -var6;
               } else {
                  var4[var7] = -var6;
               }
            }
         }

         var2.try = com.jcraft.jorbis.m.do(this.a) - 4;
         if (var2.try < 5) {
            var2.try = 5;
         }

         var6 = 1 << var2.try;
         var2.int = new int[var6];
         var2.do = new int[var6];

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = 0;
            boolean var10 = false;

            for(var9 = 0; var9 < var2.try && (var8 > 0 || var9 == 0); ++var9) {
               if ((var7 & 1 << var9) != 0) {
                  var8 = var4[var8];
               } else {
                  var8 = var3[var8];
               }
            }

            var2.int[var7] = var8;
            var2.do[var7] = var9;
         }

         return var2;
      }
   }
}
