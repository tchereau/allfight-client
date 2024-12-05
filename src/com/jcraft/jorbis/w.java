package com.jcraft.jorbis;

class w extends com.jcraft.jorbis.v {
   static int do = 0;
   float[][] int = (float[][])null;
   int[] for = null;
   int[] new = null;
   Object[] if = null;

   void if(Object var1) {
   }

   void a(Object var1) {
   }

   Object a(com.jcraft.jorbis.k var1, com.jcraft.jorbis.d var2, Object var3) {
      com.jcraft.jorbis.f var4 = var1.p;
      w$b var5 = new w$b(this);
      w$a var6 = var5.if = (w$a)var3;
      var5.byte = var2;
      var5.void = new Object[var6.byte];
      var5.int = new Object[var6.byte];
      var5.do = new Object[var6.byte];
      var5.case = new com.jcraft.jorbis.b[var6.byte];
      var5.goto = new com.jcraft.jorbis.h[var6.byte];
      var5.char = new com.jcraft.jorbis.i[var6.byte];

      for(int var7 = 0; var7 < var6.byte; ++var7) {
         int var8 = var6.case[var7];
         int var9 = var6.for[var7];
         int var10 = var6.new[var7];
         var5.case[var7] = com.jcraft.jorbis.b.a[var4.a[var8]];
         var5.void[var7] = var5.case[var7].a(var1, var2, var4.o[var8]);
         var5.goto[var7] = com.jcraft.jorbis.h.a[var4.w[var9]];
         var5.int[var7] = var5.goto[var7].a(var1, var2, var4.char[var9]);
         var5.char[var7] = com.jcraft.jorbis.i.a[var4.case[var10]];
         var5.do[var7] = var5.char[var7].a(var1, var2, var4.b[var10]);
      }

      if (var4.t != 0 && var1.e != 0) {
      }

      var5.a = var4.u;
      return var5;
   }

   void a(com.jcraft.jorbis.f var1, Object var2, com.jcraft.a.e var3) {
      w$a var4 = (w$a)var2;
      if (var4.byte > 1) {
         var3.a(1, 1);
         var3.a(var4.byte - 1, 4);
      } else {
         var3.a(0, 1);
      }

      int var5;
      if (var4.try > 0) {
         var3.a(1, 1);
         var3.a(var4.try - 1, 8);

         for(var5 = 0; var5 < var4.try; ++var5) {
            var3.a(var4.if[var5], com.jcraft.jorbis.m.a(var1.u));
            var3.a(var4.char[var5], com.jcraft.jorbis.m.a(var1.u));
         }
      } else {
         var3.a(0, 1);
      }

      var3.a(0, 2);
      if (var4.byte > 1) {
         for(var5 = 0; var5 < var1.u; ++var5) {
            var3.a(var4.do[var5], 4);
         }
      }

      for(var5 = 0; var5 < var4.byte; ++var5) {
         var3.a(var4.case[var5], 8);
         var3.a(var4.for[var5], 8);
         var3.a(var4.new[var5], 8);
      }

   }

   Object a(com.jcraft.jorbis.f var1, com.jcraft.a.e var2) {
      w$a var3 = new w$a(this);
      if (var2.for(1) != 0) {
         var3.byte = var2.for(4) + 1;
      } else {
         var3.byte = 1;
      }

      int var4;
      if (var2.for(1) != 0) {
         var3.try = var2.for(8) + 1;

         for(var4 = 0; var4 < var3.try; ++var4) {
            int var5 = var3.if[var4] = var2.for(com.jcraft.jorbis.m.a(var1.u));
            int var6 = var3.char[var4] = var2.for(com.jcraft.jorbis.m.a(var1.u));
            if (var5 < 0 || var6 < 0 || var5 == var6 || var5 >= var1.u || var6 >= var1.u) {
               var3.a();
               return null;
            }
         }
      }

      if (var2.for(2) > 0) {
         var3.a();
         return null;
      } else {
         if (var3.byte > 1) {
            for(var4 = 0; var4 < var1.u; ++var4) {
               var3.do[var4] = var2.for(4);
               if (var3.do[var4] >= var3.byte) {
                  var3.a();
                  return null;
               }
            }
         }

         for(var4 = 0; var4 < var3.byte; ++var4) {
            var3.case[var4] = var2.for(8);
            if (var3.case[var4] >= var1.c) {
               var3.a();
               return null;
            }

            var3.for[var4] = var2.for(8);
            if (var3.for[var4] >= var1.byte) {
               var3.a();
               return null;
            }

            var3.new[var4] = var2.for(8);
            if (var3.new[var4] >= var1.do) {
               var3.a();
               return null;
            }
         }

         return var3;
      }
   }

   synchronized int a(com.jcraft.jorbis.z var1, Object var2) {
      com.jcraft.jorbis.k var3 = var1.case;
      com.jcraft.jorbis.f var4 = var3.p;
      w$b var5 = (w$b)var2;
      w$a var6 = var5.if;
      com.jcraft.jorbis.d var7 = var5.byte;
      int var8 = var1.else = var4.q[var1.int];
      float[] var9 = var3.new[var1.int][var1.char][var1.b][var7.do];
      if (this.int == null || this.int.length < var4.u) {
         this.int = new float[var4.u][];
         this.new = new int[var4.u];
         this.for = new int[var4.u];
         this.if = new Object[var4.u];
      }

      int var10;
      float[] var11;
      int var12;
      int var13;
      for(var10 = 0; var10 < var4.u; ++var10) {
         var11 = var1.if[var10];
         var12 = var6.do[var10];
         this.if[var10] = var5.goto[var12].a(var1, var5.int[var12], this.if[var10]);
         if (this.if[var10] != null) {
            this.new[var10] = 1;
         } else {
            this.new[var10] = 0;
         }

         for(var13 = 0; var13 < var8 / 2; ++var13) {
            var11[var13] = 0.0F;
         }
      }

      for(var10 = 0; var10 < var6.try; ++var10) {
         if (this.new[var6.if[var10]] != 0 || this.new[var6.char[var10]] != 0) {
            this.new[var6.if[var10]] = 1;
            this.new[var6.char[var10]] = 1;
         }
      }

      for(var10 = 0; var10 < var6.byte; ++var10) {
         int var16 = 0;

         for(var12 = 0; var12 < var4.u; ++var12) {
            if (var6.do[var12] == var10) {
               if (this.new[var12] != 0) {
                  this.for[var16] = 1;
               } else {
                  this.for[var16] = 0;
               }

               this.int[var16++] = var1.if[var12];
            }
         }

         var5.char[var10].a(var1, var5.do[var10], this.int, this.for, var16);
      }

      for(var10 = var6.try - 1; var10 >= 0; --var10) {
         var11 = var1.if[var6.if[var10]];
         float[] var17 = var1.if[var6.char[var10]];

         for(var13 = 0; var13 < var8 / 2; ++var13) {
            float var14 = var11[var13];
            float var15 = var17[var13];
            if (var14 > 0.0F) {
               if (var15 > 0.0F) {
                  var11[var13] = var14;
                  var17[var13] = var14 - var15;
               } else {
                  var17[var13] = var14;
                  var11[var13] = var14 + var15;
               }
            } else if (var15 > 0.0F) {
               var11[var13] = var14;
               var17[var13] = var14 + var15;
            } else {
               var17[var13] = var14;
               var11[var13] = var14 - var15;
            }
         }
      }

      for(var10 = 0; var10 < var4.u; ++var10) {
         var11 = var1.if[var10];
         var12 = var6.do[var10];
         var5.goto[var12].a(var1, var5.int[var12], this.if[var10], var11);
      }

      for(var10 = 0; var10 < var4.u; ++var10) {
         var11 = var1.if[var10];
         ((com.jcraft.jorbis.a)var3.char[var1.int][0]).if(var11, var11);
      }

      for(var10 = 0; var10 < var4.u; ++var10) {
         var11 = var1.if[var10];
         if (this.new[var10] != 0) {
            for(var12 = 0; var12 < var8; ++var12) {
               var11[var12] *= var9[var12];
            }
         } else {
            for(var12 = 0; var12 < var8; ++var12) {
               var11[var12] = 0.0F;
            }
         }
      }

      return 0;
   }
}
