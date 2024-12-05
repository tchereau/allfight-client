import java.util.List;
import java.util.Random;

public class xa implements x0 {
   private Random try;
   private tx new;
   private tx int;
   private tx for;
   public tx b;
   public tx void;
   private y6 do;
   private double[] if;
   private yn[] a;
   double[] long;
   double[] goto;
   double[] else;
   double[] char;
   double[] case;
   int[][] byte = new int[32][32];

   public xa(y6 var1, long var2) {
      this.do = var1;
      this.try = new Random(var2);
      this.new = new tx(this.try, 16);
      this.int = new tx(this.try, 16);
      this.for = new tx(this.try, 8);
      this.b = new tx(this.try, 10);
      this.void = new tx(this.try, 16);
   }

   public void if(int var1, int var2, byte[] var3, yn[] var4) {
      byte var5 = 2;
      int var6 = var5 + 1;
      byte var7 = 33;
      int var8 = var5 + 1;
      this.if = this.a(this.if, var1 * var5, 0, var2 * var5, var6, var7, var8);

      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var5; ++var10) {
            for(int var11 = 0; var11 < 32; ++var11) {
               double var12 = 0.25D;
               double var14 = this.if[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
               double var16 = this.if[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
               double var18 = this.if[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
               double var20 = this.if[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
               double var22 = (this.if[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
               double var24 = (this.if[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
               double var26 = (this.if[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
               double var28 = (this.if[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

               for(int var30 = 0; var30 < 4; ++var30) {
                  double var31 = 0.125D;
                  double var33 = var14;
                  double var35 = var16;
                  double var37 = (var18 - var14) * var31;
                  double var39 = (var20 - var16) * var31;

                  for(int var41 = 0; var41 < 8; ++var41) {
                     int var42 = var41 + var9 * 8 << 11 | 0 + var10 * 8 << 7 | var11 * 4 + var30;
                     short var43 = 128;
                     double var44 = 0.125D;
                     double var46 = var33;
                     double var48 = (var35 - var33) * var44;

                     for(int var50 = 0; var50 < 8; ++var50) {
                        int var51 = 0;
                        if (var46 > 0.0D) {
                           var51 = pa.bG.void;
                        }

                        var3[var42] = (byte)var51;
                        var42 += var43;
                        var46 += var48;
                     }

                     var33 += var37;
                     var35 += var39;
                  }

                  var14 += var22;
                  var16 += var24;
                  var18 += var26;
                  var20 += var28;
               }
            }
         }
      }

   }

   public void a(int var1, int var2, byte[] var3, yn[] var4) {
      for(int var5 = 0; var5 < 16; ++var5) {
         for(int var6 = 0; var6 < 16; ++var6) {
            byte var7 = 1;
            int var8 = -1;
            byte var9 = (byte)pa.bG.void;
            byte var10 = (byte)pa.bG.void;

            for(int var11 = 127; var11 >= 0; --var11) {
               int var12 = (var6 * 16 + var5) * 128 + var11;
               byte var13 = var3[var12];
               if (var13 == 0) {
                  var8 = -1;
               } else if (var13 == pa.k.void) {
                  if (var8 == -1) {
                     if (var7 <= 0) {
                        var9 = 0;
                        var10 = (byte)pa.bG.void;
                     }

                     var8 = var7;
                     if (var11 >= 0) {
                        var3[var12] = var9;
                     } else {
                        var3[var12] = var10;
                     }
                  } else if (var8 > 0) {
                     --var8;
                     var3[var12] = var10;
                  }
               }
            }
         }
      }

   }

   public xx if(int var1, int var2) {
      return this.do(var1, var2);
   }

   public xx do(int var1, int var2) {
      this.try.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      byte[] var3 = new byte['耀'];
      this.a = this.do.void().a((yn[])this.a, var1 * 16, var2 * 16, 16, 16);
      this.if(var1, var2, var3, this.a);
      this.a(var1, var2, var3, this.a);
      xx var4 = new xx(this.do, var3, var1, var2);
      byte[] var5 = var4.new();

      for(int var6 = 0; var6 < var5.length; ++var6) {
         var5[var6] = (byte)this.a[var6].try;
      }

      var4.for();
      return var4;
   }

   private double[] a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412D;
      double var10 = 684.412D;
      this.char = this.b.a(this.char, var2, var4, var5, var7, 1.121D, 1.121D, 0.5D);
      this.case = this.void.a(this.case, var2, var4, var5, var7, 200.0D, 200.0D, 0.5D);
      var8 *= 2.0D;
      this.long = this.for.a(this.long, var2, var3, var4, var5, var6, var7, var8 / 80.0D, var10 / 160.0D, var8 / 80.0D);
      this.goto = this.new.a(this.goto, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      this.else = this.int.a(this.else, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;
      int var13 = 0;

      for(int var14 = 0; var14 < var5; ++var14) {
         for(int var15 = 0; var15 < var7; ++var15) {
            double var16 = (this.char[var13] + 256.0D) / 512.0D;
            if (var16 > 1.0D) {
               var16 = 1.0D;
            }

            double var18 = this.case[var13] / 8000.0D;
            if (var18 < 0.0D) {
               var18 = -var18 * 0.3D;
            }

            var18 = var18 * 3.0D - 2.0D;
            float var20 = (float)(var14 + var2 - 0) / 1.0F;
            float var21 = (float)(var15 + var4 - 0) / 1.0F;
            float var22 = 100.0F - ajs.if(var20 * var20 + var21 * var21) * 8.0F;
            if (var22 > 80.0F) {
               var22 = 80.0F;
            }

            if (var22 < -100.0F) {
               var22 = -100.0F;
            }

            if (var18 > 1.0D) {
               var18 = 1.0D;
            }

            var18 /= 8.0D;
            var18 = 0.0D;
            if (var16 < 0.0D) {
               var16 = 0.0D;
            }

            var16 += 0.5D;
            var18 = var18 * (double)var6 / 16.0D;
            ++var13;
            double var23 = (double)var6 / 2.0D;

            for(int var25 = 0; var25 < var6; ++var25) {
               double var26 = 0.0D;
               double var28 = ((double)var25 - var23) * 8.0D / var16;
               if (var28 < 0.0D) {
                  var28 *= -1.0D;
               }

               double var30 = this.goto[var12] / 512.0D;
               double var32 = this.else[var12] / 512.0D;
               double var34 = (this.long[var12] / 10.0D + 1.0D) / 2.0D;
               if (var34 < 0.0D) {
                  var26 = var30;
               } else if (var34 > 1.0D) {
                  var26 = var32;
               } else {
                  var26 = var30 + (var32 - var30) * var34;
               }

               var26 -= 8.0D;
               var26 += (double)var22;
               byte var36 = 2;
               double var37;
               if (var25 > var6 / 2 - var36) {
                  var37 = (double)((float)(var25 - (var6 / 2 - var36)) / 64.0F);
                  if (var37 < 0.0D) {
                     var37 = 0.0D;
                  }

                  if (var37 > 1.0D) {
                     var37 = 1.0D;
                  }

                  var26 = var26 * (1.0D - var37) + -3000.0D * var37;
               }

               var36 = 8;
               if (var25 < var36) {
                  var37 = (double)((float)(var36 - var25) / ((float)var36 - 1.0F));
                  var26 = var26 * (1.0D - var37) + -30.0D * var37;
               }

               var1[var12] = var26;
               ++var12;
            }
         }
      }

      return var1;
   }

   public boolean for(int var1, int var2) {
      return true;
   }

   public void a(x0 var1, int var2, int var3) {
      qy.dI = true;
      int var4 = var2 * 16;
      int var5 = var3 * 16;
      yn var6 = this.do.a(var4 + 16, var5 + 16);
      var6.a(this.do, this.do.o, var4, var5);
      qy.dI = false;
   }

   public boolean a(boolean var1, ajo var2) {
      return true;
   }

   public boolean for() {
      return false;
   }

   public boolean if() {
      return true;
   }

   public String a() {
      return "RandomLevelSource";
   }

   public List a(ah9 var1, int var2, int var3, int var4) {
      yn var5 = this.do.a(var2, var4);
      return var5 == null ? null : var5.a(var1);
   }

   public yp a(y6 var1, String var2, int var3, int var4, int var5) {
      return null;
   }

   public int do() {
      return 0;
   }

   public void a(int var1, int var2) {
   }
}
