import java.util.Random;

public abstract class qn extends pa {
   private ajd[] dz;

   protected qn(int var1, ts var2) {
      super(var1, var2);
      float var3 = 0.0F;
      float var4 = 0.0F;
      this.a(0.0F + var4, 0.0F + var3, 0.0F + var4, 1.0F + var4, 1.0F + var3, 1.0F + var4);
      this.a(true);
   }

   public boolean a(yy var1, int var2, int var3, int var4) {
      return this.at != ts.r;
   }

   public int c() {
      return 16777215;
   }

   public int do(yy var1, int var2, int var3, int var4) {
      if (this.at != ts.s) {
         return 16777215;
      } else {
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;

         for(int var8 = -1; var8 <= 1; ++var8) {
            for(int var9 = -1; var9 <= 1; ++var9) {
               int var10 = var1.a(var2 + var9, var4 + var8).long;
               var5 += (var10 & 16711680) >> 16;
               var6 += (var10 & '\uff00') >> 8;
               var7 += var10 & 255;
            }
         }

         return (var5 / 9 & 255) << 16 | (var6 / 9 & 255) << 8 | var7 / 9 & 255;
      }
   }

   public static float i(int var0) {
      if (var0 >= 8) {
         var0 = 0;
      }

      return (float)(var0 + 1) / 9.0F;
   }

   public ajd if(int var1, int var2) {
      return var1 != 0 && var1 != 1 ? this.dz[1] : this.dz[0];
   }

   protected int k(y6 var1, int var2, int var3, int var4) {
      return var1.byte(var2, var3, var4) == this.at ? var1.for(var2, var3, var4) : -1;
   }

   protected int else(yy var1, int var2, int var3, int var4) {
      if (var1.byte(var2, var3, var4) != this.at) {
         return -1;
      } else {
         int var5 = var1.for(var2, var3, var4);
         if (var5 >= 8) {
            var5 = 0;
         }

         return var5;
      }
   }

   public boolean if() {
      return false;
   }

   public boolean do() {
      return false;
   }

   public boolean a(int var1, boolean var2) {
      return var2 && var1 == 0;
   }

   public boolean a(yy var1, int var2, int var3, int var4, int var5) {
      ts var6 = var1.byte(var2, var3, var4);
      if (var6 == this.at) {
         return false;
      } else if (var5 == 1) {
         return true;
      } else {
         return var6 == ts.e ? false : super.a(var1, var2, var3, var4, var5);
      }
   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      ts var6 = var1.byte(var2, var3, var4);
      if (var6 == this.at) {
         return false;
      } else if (var5 == 1) {
         return true;
      } else {
         return var6 == ts.e ? false : super.int(var1, var2, var3, var4, var5);
      }
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      return null;
   }

   public int new() {
      return 4;
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public int a(Random var1) {
      return 0;
   }

   private nr goto(yy var1, int var2, int var3, int var4) {
      nr var5 = var1.do().a(0.0D, 0.0D, 0.0D);
      int var6 = this.else(var1, var2, var3, var4);

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var2;
         int var10 = var4;
         if (var7 == 0) {
            var8 = var2 - 1;
         }

         if (var7 == 1) {
            var10 = var4 - 1;
         }

         if (var7 == 2) {
            ++var8;
         }

         if (var7 == 3) {
            ++var10;
         }

         int var11 = this.else(var1, var8, var3, var10);
         int var12;
         if (var11 < 0) {
            if (!var1.byte(var8, var3, var10).void()) {
               var11 = this.else(var1, var8, var3 - 1, var10);
               if (var11 >= 0) {
                  var12 = var11 - (var6 - 8);
                  var5 = var5.a((double)((var8 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
               }
            }
         } else if (var11 >= 0) {
            var12 = var11 - var6;
            var5 = var5.a((double)((var8 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
         }
      }

      if (var1.for(var2, var3, var4) >= 8) {
         boolean var13 = false;
         if (var13 || this.a(var1, var2, var3, var4 - 1, 2)) {
            var13 = true;
         }

         if (var13 || this.a(var1, var2, var3, var4 + 1, 3)) {
            var13 = true;
         }

         if (var13 || this.a(var1, var2 - 1, var3, var4, 4)) {
            var13 = true;
         }

         if (var13 || this.a(var1, var2 + 1, var3, var4, 5)) {
            var13 = true;
         }

         if (var13 || this.a(var1, var2, var3 + 1, var4 - 1, 2)) {
            var13 = true;
         }

         if (var13 || this.a(var1, var2, var3 + 1, var4 + 1, 3)) {
            var13 = true;
         }

         if (var13 || this.a(var1, var2 - 1, var3 + 1, var4, 4)) {
            var13 = true;
         }

         if (var13 || this.a(var1, var2 + 1, var3 + 1, var4, 5)) {
            var13 = true;
         }

         if (var13) {
            var5 = var5.if().a(0.0D, -6.0D, 0.0D);
         }
      }

      var5 = var5.if();
      return var5;
   }

   public void a(y6 var1, int var2, int var3, int var4, aiw var5, nr var6) {
      nr var7 = this.goto(var1, var2, var3, var4);
      var6.int += var7.int;
      var6.for += var7.for;
      var6.do += var7.do;
   }

   public int a(y6 var1) {
      if (this.at == ts.s) {
         return 5;
      } else if (this.at == ts.r) {
         return var1.n.for ? 10 : 30;
      } else {
         return 0;
      }
   }

   public int new(yy var1, int var2, int var3, int var4) {
      int var5 = var1.do(var2, var3, var4, 0);
      int var6 = var1.do(var2, var3 + 1, var4, 0);
      int var7 = var5 & 255;
      int var8 = var6 & 255;
      int var9 = var5 >> 16 & 255;
      int var10 = var6 >> 16 & 255;
      return (var7 > var8 ? var7 : var8) | (var9 > var10 ? var9 : var10) << 16;
   }

   public float if(yy var1, int var2, int var3, int var4) {
      float var5 = var1.int(var2, var3, var4);
      float var6 = var1.int(var2, var3 + 1, var4);
      return var5 > var6 ? var5 : var6;
   }

   public int b() {
      return this.at == ts.s ? 1 : 0;
   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      int var6;
      if (this.at == ts.s) {
         if (var5.nextInt(10) == 0) {
            var6 = var1.for(var2, var3, var4);
            if (var6 <= 0 || var6 >= 8) {
               var1.a("suspended", (double)((float)var2 + var5.nextFloat()), (double)((float)var3 + var5.nextFloat()), (double)((float)var4 + var5.nextFloat()), 0.0D, 0.0D, 0.0D);
            }
         }

         for(var6 = 0; var6 < 0; ++var6) {
            int var7 = var5.nextInt(4);
            int var8 = var2;
            int var9 = var4;
            if (var7 == 0) {
               var8 = var2 - 1;
            }

            if (var7 == 1) {
               ++var8;
            }

            if (var7 == 2) {
               var9 = var4 - 1;
            }

            if (var7 == 3) {
               ++var9;
            }

            if (var1.byte(var8, var3, var9) == ts.z && (var1.byte(var8, var3 - 1, var9).void() || var1.byte(var8, var3 - 1, var9).case())) {
               float var10 = 0.0625F;
               double var11 = (double)((float)var2 + var5.nextFloat());
               double var13 = (double)((float)var3 + var5.nextFloat());
               double var15 = (double)((float)var4 + var5.nextFloat());
               if (var7 == 0) {
                  var11 = (double)((float)var2 - var10);
               }

               if (var7 == 1) {
                  var11 = (double)((float)(var2 + 1) + var10);
               }

               if (var7 == 2) {
                  var15 = (double)((float)var4 - var10);
               }

               if (var7 == 3) {
                  var15 = (double)((float)(var4 + 1) + var10);
               }

               double var17 = 0.0D;
               double var19 = 0.0D;
               if (var7 == 0) {
                  var17 = (double)(-var10);
               }

               if (var7 == 1) {
                  var17 = (double)var10;
               }

               if (var7 == 2) {
                  var19 = (double)(-var10);
               }

               if (var7 == 3) {
                  var19 = (double)var10;
               }

               var1.a("splash", var11, var13, var15, var17, 0.0D, var19);
            }
         }
      }

      if (this.at == ts.s && var5.nextInt(64) == 0) {
         var6 = var1.for(var2, var3, var4);
         if (var6 > 0 && var6 < 8) {
            var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "liquid.water", var5.nextFloat() * 0.25F + 0.75F, var5.nextFloat() * 1.0F + 0.5F, false);
         }
      }

      double var21;
      double var22;
      double var23;
      if (this.at == ts.r && var1.byte(var2, var3 + 1, var4) == ts.z && !var1.do(var2, var3 + 1, var4)) {
         if (var5.nextInt(100) == 0) {
            var21 = (double)((float)var2 + var5.nextFloat());
            var22 = (double)var3 + this.aF;
            var23 = (double)((float)var4 + var5.nextFloat());
            var1.a("lava", var21, var22, var23, 0.0D, 0.0D, 0.0D);
            var1.a(var21, var22, var23, "liquid.lavapop", 0.2F + var5.nextFloat() * 0.2F, 0.9F + var5.nextFloat() * 0.15F, false);
         }

         if (var5.nextInt(200) == 0) {
            var1.a((double)var2, (double)var3, (double)var4, "liquid.lava", 0.2F + var5.nextFloat() * 0.2F, 0.9F + var5.nextFloat() * 0.15F, false);
         }
      }

      if (var5.nextInt(10) == 0 && var1.case(var2, var3 - 1, var4) && !var1.byte(var2, var3 - 2, var4).void()) {
         var21 = (double)((float)var2 + var5.nextFloat());
         var22 = (double)var3 - 1.05D;
         var23 = (double)((float)var4 + var5.nextFloat());
         if (this.at == ts.s) {
            var1.a("dripWater", var21, var22, var23, 0.0D, 0.0D, 0.0D);
         } else {
            var1.a("dripLava", var21, var22, var23, 0.0D, 0.0D, 0.0D);
         }
      }

   }

   public static double a(yy var0, int var1, int var2, int var3, ts var4) {
      nr var5 = null;
      if (var4 == ts.s) {
         var5 = pa.bb.goto(var0, var1, var2, var3);
      }

      if (var4 == ts.r) {
         var5 = pa.a7.goto(var0, var1, var2, var3);
      }

      return var5.int == 0.0D && var5.do == 0.0D ? -1000.0D : Math.atan2(var5.do, var5.int) - 1.5707963267948966D;
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      this.m(var1, var2, var3, var4);
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      this.m(var1, var2, var3, var4);
   }

   private void m(y6 var1, int var2, int var3, int var4) {
      if (var1.new(var2, var3, var4) == this.void) {
         if (this.at == ts.r) {
            boolean var5 = false;
            if (var5 || var1.byte(var2, var3, var4 - 1) == ts.s) {
               var5 = true;
            }

            if (var5 || var1.byte(var2, var3, var4 + 1) == ts.s) {
               var5 = true;
            }

            if (var5 || var1.byte(var2 - 1, var3, var4) == ts.s) {
               var5 = true;
            }

            if (var5 || var1.byte(var2 + 1, var3, var4) == ts.s) {
               var5 = true;
            }

            if (var5 || var1.byte(var2, var3 + 1, var4) == ts.s) {
               var5 = true;
            }

            if (var5) {
               int var6 = var1.for(var2, var3, var4);
               if (var6 == 0) {
                  var1.int(var2, var3, var4, pa.bs.void);
               } else if (var6 <= 4) {
                  var1.int(var2, var3, var4, pa.bf.void);
               }

               this.l(var1, var2, var3, var4);
            }
         }

      }
   }

   protected void l(y6 var1, int var2, int var3, int var4) {
      var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.o.nextFloat() - var1.o.nextFloat()) * 0.8F);

      for(int var5 = 0; var5 < 8; ++var5) {
         var1.a("largesmoke", (double)var2 + Math.random(), (double)var3 + 1.2D, (double)var4 + Math.random(), 0.0D, 0.0D, 0.0D);
      }

   }

   public void a(ajc var1) {
      if (this.at == ts.r) {
         this.dz = new ajd[]{var1.a("lava"), var1.a("lava_flow")};
      } else {
         this.dz = new ajd[]{var1.a("water"), var1.a("water_flow")};
      }

   }

   public static ajd for(String var0) {
      if (var0 == "water") {
         return pa.bb.dz[0];
      } else if (var0 == "water_flow") {
         return pa.bb.dz[1];
      } else if (var0 == "lava") {
         return pa.a7.dz[0];
      } else {
         return var0 == "lava_flow" ? pa.a7.dz[1] : null;
      }
   }
}
