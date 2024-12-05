package com.jcraft.jorbis;

class s extends com.jcraft.jorbis.i {
   private static int[][][] do = new int[2][][];
   static int[][] if = (int[][])null;

   void a(Object var1, com.jcraft.a.e var2) {
      s$a var3 = (s$a)var1;
      int var4 = 0;
      var2.a(var3.do, 24);
      var2.a(var3.for, 24);
      var2.a(var3.if - 1, 24);
      var2.a(var3.a - 1, 6);
      var2.a(var3.case, 8);

      int var5;
      for(var5 = 0; var5 < var3.a; ++var5) {
         int var6 = var3.char[var5];
         if (com.jcraft.jorbis.m.do(var6) > 3) {
            var2.a(var6, 3);
            var2.a(1, 1);
            var2.a(var6 >>> 3, 5);
         } else {
            var2.a(var6, 4);
         }

         var4 += com.jcraft.jorbis.m.if(var6);
      }

      for(var5 = 0; var5 < var4; ++var5) {
         var2.a(var3.else[var5], 8);
      }

   }

   Object a(com.jcraft.jorbis.f var1, com.jcraft.a.e var2) {
      int var3 = 0;
      s$a var4 = new s$a(this);
      var4.do = var2.for(24);
      var4.for = var2.for(24);
      var4.if = var2.for(24) + 1;
      var4.a = var2.for(6) + 1;
      var4.case = var2.for(8);

      int var5;
      for(var5 = 0; var5 < var4.a; ++var5) {
         int var6 = var2.for(3);
         if (var2.for(1) != 0) {
            var6 |= var2.for(5) << 3;
         }

         var4.char[var5] = var6;
         var3 += com.jcraft.jorbis.m.if(var6);
      }

      for(var5 = 0; var5 < var3; ++var5) {
         var4.else[var5] = var2.for(8);
      }

      if (var4.case >= var1.j) {
         this.if(var4);
         return null;
      } else {
         for(var5 = 0; var5 < var3; ++var5) {
            if (var4.else[var5] >= var1.j) {
               this.if(var4);
               return null;
            }
         }

         return var4;
      }
   }

   Object a(com.jcraft.jorbis.k var1, com.jcraft.jorbis.d var2, Object var3) {
      s$a var4 = (s$a)var3;
      s$b var5 = new s$b(this);
      int var6 = 0;
      int var8 = 0;
      var5.for = var4;
      var5.a = var2.a;
      var5.try = var4.a;
      var5.new = var1.b;
      var5.long = var1.b[var4.case];
      int var7 = var5.long.int;
      var5.goto = new int[var5.try][];

      int var9;
      int var10;
      int var11;
      int var12;
      for(var9 = 0; var9 < var5.try; ++var9) {
         var10 = var4.char[var9];
         var11 = com.jcraft.jorbis.m.do(var10);
         if (var11 != 0) {
            if (var11 > var8) {
               var8 = var11;
            }

            var5.goto[var9] = new int[var11];

            for(var12 = 0; var12 < var11; ++var12) {
               if ((var10 & 1 << var12) != 0) {
                  var5.goto[var9][var12] = var4.else[var6++];
               }
            }
         }
      }

      var5.do = (int)Math.rint(Math.pow((double)var5.try, (double)var7));
      var5.if = var8;
      var5.else = new int[var5.do][];

      for(var9 = 0; var9 < var5.do; ++var9) {
         var10 = var9;
         var11 = var5.do / var5.try;
         var5.else[var9] = new int[var7];

         for(var12 = 0; var12 < var7; ++var12) {
            int var13 = var10 / var11;
            var10 -= var13 * var11;
            var11 /= var5.try;
            var5.else[var9][var12] = var13;
         }
      }

      return var5;
   }

   void if(Object var1) {
   }

   void a(Object var1) {
   }

   static synchronized int a(com.jcraft.jorbis.z var0, Object var1, float[][] var2, int var3, int var4) {
      s$b var10 = (s$b)var1;
      s$a var11 = var10.for;
      int var12 = var11.if;
      int var13 = var10.long.int;
      int var14 = var11.for - var11.do;
      int var15 = var14 / var12;
      int var16 = (var15 + var13 - 1) / var13;
      if (do.length < var3) {
         do = new int[var3][][];
      }

      int var6;
      for(var6 = 0; var6 < var3; ++var6) {
         if (do[var6] == null || do[var6].length < var16) {
            do[var6] = new int[var16][];
         }
      }

      for(int var9 = 0; var9 < var10.if; ++var9) {
         int var5 = 0;

         for(int var8 = 0; var5 < var15; ++var8) {
            int var17;
            if (var9 == 0) {
               for(var6 = 0; var6 < var3; ++var6) {
                  var17 = var10.long.a(var0.void);
                  if (var17 == -1) {
                     return 0;
                  }

                  do[var6][var8] = var10.else[var17];
                  if (do[var6][var8] == null) {
                     return 0;
                  }
               }
            }

            for(int var7 = 0; var7 < var13 && var5 < var15; ++var5) {
               for(var6 = 0; var6 < var3; ++var6) {
                  var17 = var11.do + var5 * var12;
                  int var18 = do[var6][var8][var7];
                  if ((var11.char[var18] & 1 << var9) != 0) {
                     com.jcraft.jorbis.e var19 = var10.new[var10.goto[var18][var9]];
                     if (var19 != null) {
                        if (var4 == 0) {
                           if (var19.do(var2[var6], var17, var0.void, var12) == -1) {
                              return 0;
                           }
                        } else if (var4 == 1 && var19.a(var2[var6], var17, var0.void, var12) == -1) {
                           return 0;
                        }
                     }
                  }
               }

               ++var7;
            }
         }
      }

      return 0;
   }

   static synchronized int a(com.jcraft.jorbis.z var0, Object var1, float[][] var2, int var3) {
      s$b var8 = (s$b)var1;
      s$a var9 = var8.for;
      int var10 = var9.if;
      int var11 = var8.long.int;
      int var12 = var9.for - var9.do;
      int var13 = var12 / var10;
      int var14 = (var13 + var11 - 1) / var11;
      if (if == null || if.length < var14) {
         if = new int[var14][];
      }

      for(int var7 = 0; var7 < var8.if; ++var7) {
         int var4 = 0;

         for(int var6 = 0; var4 < var13; ++var6) {
            int var15;
            if (var7 == 0) {
               var15 = var8.long.a(var0.void);
               if (var15 == -1) {
                  return 0;
               }

               if[var6] = var8.else[var15];
               if (if[var6] == null) {
                  return 0;
               }
            }

            for(int var5 = 0; var5 < var11 && var4 < var13; ++var4) {
               var15 = var9.do + var4 * var10;
               int var16 = if[var6][var5];
               if ((var9.char[var16] & 1 << var7) != 0) {
                  com.jcraft.jorbis.e var17 = var8.new[var8.goto[var16][var7]];
                  if (var17 != null && var17.a(var2, var15, var3, var0.void, var10) == -1) {
                     return 0;
                  }
               }

               ++var5;
            }
         }
      }

      return 0;
   }

   int a(com.jcraft.jorbis.z var1, Object var2, float[][] var3, int[] var4, int var5) {
      int var6 = 0;

      for(int var7 = 0; var7 < var5; ++var7) {
         if (var4[var7] != 0) {
            var3[var6++] = var3[var7];
         }
      }

      if (var6 != 0) {
         return a(var1, var2, var3, var6, 0);
      } else {
         return 0;
      }
   }
}
