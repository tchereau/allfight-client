import java.util.Random;

public class pj extends r0 {
   private final pa eW;
   private ajd eV;

   protected pj(int var1, pa var2) {
      super(var1);
      this.eW = var2;
      this.a(true);
      float var3 = 0.125F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
      this.a((acn)null);
   }

   protected boolean K(int var1) {
      return var1 == pa.cs.void;
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      super.if(var1, var2, var3, var4, var5);
      if (var1.h(var2, var3 + 1, var4) >= 9) {
         float var6 = this.T(var1, var2, var3, var4);
         if (var5.nextInt((int)(25.0F / var6) + 1) == 0) {
            int var7 = var1.for(var2, var3, var4);
            if (var7 < 7) {
               ++var7;
               var1.do(var2, var3, var4, var7, 2);
            } else {
               if (var1.new(var2 - 1, var3, var4) == this.eW.void) {
                  return;
               }

               if (var1.new(var2 + 1, var3, var4) == this.eW.void) {
                  return;
               }

               if (var1.new(var2, var3, var4 - 1) == this.eW.void) {
                  return;
               }

               if (var1.new(var2, var3, var4 + 1) == this.eW.void) {
                  return;
               }

               int var8 = var5.nextInt(4);
               int var9 = var2;
               int var10 = var4;
               if (var8 == 0) {
                  var9 = var2 - 1;
               }

               if (var8 == 1) {
                  ++var9;
               }

               if (var8 == 2) {
                  var10 = var4 - 1;
               }

               if (var8 == 3) {
                  ++var10;
               }

               int var11 = var1.new(var9, var3 - 1, var10);
               if (var1.new(var9, var3, var10) == 0 && (var11 == pa.cs.void || var11 == pa.g.void || var11 == pa.i.void)) {
                  var1.int(var9, var3, var10, this.eW.void);
               }
            }
         }
      }

   }

   public void U(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4) + ajs.a((Random)var1.o, 2, 5);
      if (var5 > 7) {
         var5 = 7;
      }

      var1.do(var2, var3, var4, var5, 2);
   }

   private float T(y6 var1, int var2, int var3, int var4) {
      float var5 = 1.0F;
      int var6 = var1.new(var2, var3, var4 - 1);
      int var7 = var1.new(var2, var3, var4 + 1);
      int var8 = var1.new(var2 - 1, var3, var4);
      int var9 = var1.new(var2 + 1, var3, var4);
      int var10 = var1.new(var2 - 1, var3, var4 - 1);
      int var11 = var1.new(var2 + 1, var3, var4 - 1);
      int var12 = var1.new(var2 + 1, var3, var4 + 1);
      int var13 = var1.new(var2 - 1, var3, var4 + 1);
      boolean var14 = var8 == this.void || var9 == this.void;
      boolean var15 = var6 == this.void || var7 == this.void;
      boolean var16 = var10 == this.void || var11 == this.void || var12 == this.void || var13 == this.void;

      for(int var17 = var2 - 1; var17 <= var2 + 1; ++var17) {
         for(int var18 = var4 - 1; var18 <= var4 + 1; ++var18) {
            int var19 = var1.new(var17, var3 - 1, var18);
            float var20 = 0.0F;
            if (var19 == pa.cs.void) {
               var20 = 1.0F;
               if (var1.for(var17, var3 - 1, var18) > 0) {
                  var20 = 3.0F;
               }
            }

            if (var17 != var2 || var18 != var4) {
               var20 /= 4.0F;
            }

            var5 += var20;
         }
      }

      if (var16 || var14 && var15) {
         var5 /= 2.0F;
      }

      return var5;
   }

   public int a(int var1) {
      int var2 = var1 * 32;
      int var3 = 255 - var1 * 8;
      int var4 = var1 * 4;
      return var2 << 16 | var3 << 8 | var4;
   }

   public int do(yy var1, int var2, int var3, int var4) {
      return this.a(var1.for(var2, var3, var4));
   }

   public void try() {
      float var1 = 0.125F;
      this.a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.25F, 0.5F + var1);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      this.aF = (double)((float)(var1.for(var2, var3, var4) * 2 + 2) / 16.0F);
      float var5 = 0.125F;
      this.a(0.5F - var5, 0.0F, 0.5F - var5, 0.5F + var5, (float)this.aF, 0.5F + var5);
   }

   public int new() {
      return 19;
   }

   public int h(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      if (var5 < 7) {
         return -1;
      } else if (var1.new(var2 - 1, var3, var4) == this.eW.void) {
         return 0;
      } else if (var1.new(var2 + 1, var3, var4) == this.eW.void) {
         return 1;
      } else if (var1.new(var2, var3, var4 - 1) == this.eW.void) {
         return 2;
      } else {
         return var1.new(var2, var3, var4 + 1) == this.eW.void ? 3 : -1;
      }
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      if (!var1.goto) {
         abr var8 = null;
         if (this.eW == pa.aW) {
            var8 = abr.aT;
         }

         if (this.eW == pa.ad) {
            var8 = abr.aR;
         }

         for(int var9 = 0; var9 < 3; ++var9) {
            if (var1.o.nextInt(15) <= var5) {
               this.a(var1, var2, var3, var4, new abp(var8));
            }
         }

      }
   }

   public int a(int var1, Random var2, int var3) {
      return -1;
   }

   public int a(Random var1) {
      return 1;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      if (this.eW == pa.aW) {
         return abr.aT.A;
      } else {
         return this.eW == pa.ad ? abr.aR.A : 0;
      }
   }

   public void a(ajc var1) {
      this.an = var1.a("stem_straight");
      this.eV = var1.a("stem_bent");
   }

   public ajd B() {
      return this.eV;
   }
}
