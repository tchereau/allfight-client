import java.util.List;
import java.util.Random;

public class xf implements x0 {
   private Random N;
   private tx M;
   private tx L;
   private tx K;
   private tx J;
   private tx I;
   public tx V;
   public tx U;
   private y6 H;
   private double[] G;
   public v4 T = new v4();
   private double[] F = new double[256];
   private double[] E = new double[256];
   private double[] D = new double[256];
   private xd C = new xc();
   double[] S;
   double[] R;
   double[] Q;
   double[] P;
   double[] O;

   public xf(y6 var1, long var2) {
      this.H = var1;
      this.N = new Random(var2);
      this.M = new tx(this.N, 16);
      this.L = new tx(this.N, 16);
      this.K = new tx(this.N, 8);
      this.J = new tx(this.N, 4);
      this.I = new tx(this.N, 4);
      this.V = new tx(this.N, 10);
      this.U = new tx(this.N, 16);
   }

   public void do(int var1, int var2, byte[] var3) {
      byte var4 = 4;
      byte var5 = 32;
      int var6 = var4 + 1;
      byte var7 = 17;
      int var8 = var4 + 1;
      this.G = this.do(this.G, var1 * var4, 0, var2 * var4, var6, var7, var8);

      for(int var9 = 0; var9 < var4; ++var9) {
         for(int var10 = 0; var10 < var4; ++var10) {
            for(int var11 = 0; var11 < 16; ++var11) {
               double var12 = 0.125D;
               double var14 = this.G[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
               double var16 = this.G[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
               double var18 = this.G[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
               double var20 = this.G[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
               double var22 = (this.G[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
               double var24 = (this.G[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
               double var26 = (this.G[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
               double var28 = (this.G[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

               for(int var30 = 0; var30 < 8; ++var30) {
                  double var31 = 0.25D;
                  double var33 = var14;
                  double var35 = var16;
                  double var37 = (var18 - var14) * var31;
                  double var39 = (var20 - var16) * var31;

                  for(int var41 = 0; var41 < 4; ++var41) {
                     int var42 = var41 + var9 * 4 << 11 | 0 + var10 * 4 << 7 | var11 * 8 + var30;
                     short var43 = 128;
                     double var44 = 0.25D;
                     double var46 = var33;
                     double var48 = (var35 - var33) * var44;

                     for(int var50 = 0; var50 < 4; ++var50) {
                        int var51 = 0;
                        if (var11 * 8 + var30 < var5) {
                           var51 = pa.a4.void;
                        }

                        if (var46 > 0.0D) {
                           var51 = pa.aT.void;
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

   public void if(int var1, int var2, byte[] var3) {
      byte var4 = 64;
      double var5 = 0.03125D;
      this.F = this.J.a(this.F, var1 * 16, var2 * 16, 0, 16, 16, 1, var5, var5, 1.0D);
      this.E = this.J.a(this.E, var1 * 16, 109, var2 * 16, 16, 1, 16, var5, 1.0D, var5);
      this.D = this.I.a(this.D, var1 * 16, var2 * 16, 0, 16, 16, 1, var5 * 2.0D, var5 * 2.0D, var5 * 2.0D);

      for(int var7 = 0; var7 < 16; ++var7) {
         for(int var8 = 0; var8 < 16; ++var8) {
            boolean var9 = this.F[var7 + var8 * 16] + this.N.nextDouble() * 0.2D > 0.0D;
            boolean var10 = this.E[var7 + var8 * 16] + this.N.nextDouble() * 0.2D > 0.0D;
            int var11 = (int)(this.D[var7 + var8 * 16] / 3.0D + 3.0D + this.N.nextDouble() * 0.25D);
            int var12 = -1;
            byte var13 = (byte)pa.aT.void;
            byte var14 = (byte)pa.aT.void;

            for(int var15 = 127; var15 >= 0; --var15) {
               int var16 = (var8 * 16 + var7) * 128 + var15;
               if (var15 < 127 - this.N.nextInt(5) && var15 > 0 + this.N.nextInt(5)) {
                  byte var17 = var3[var16];
                  if (var17 == 0) {
                     var12 = -1;
                  } else if (var17 == pa.aT.void) {
                     if (var12 == -1) {
                        if (var11 <= 0) {
                           var13 = 0;
                           var14 = (byte)pa.aT.void;
                        } else if (var15 >= var4 - 4 && var15 <= var4 + 1) {
                           var13 = (byte)pa.aT.void;
                           var14 = (byte)pa.aT.void;
                           if (var10) {
                              var13 = (byte)pa.aY.void;
                           }

                           if (var10) {
                              var14 = (byte)pa.aT.void;
                           }

                           if (var9) {
                              var13 = (byte)pa.aQ.void;
                           }

                           if (var9) {
                              var14 = (byte)pa.aQ.void;
                           }
                        }

                        if (var15 < var4 && var13 == 0) {
                           var13 = (byte)pa.a4.void;
                        }

                        var12 = var11;
                        if (var15 >= var4 - 1) {
                           var3[var16] = var13;
                        } else {
                           var3[var16] = var14;
                        }
                     } else if (var12 > 0) {
                        --var12;
                        var3[var16] = var14;
                     }
                  }
               } else {
                  var3[var16] = (byte)pa.bc.void;
               }
            }
         }
      }

   }

   public xx if(int var1, int var2) {
      return this.do(var1, var2);
   }

   public xx do(int var1, int var2) {
      this.N.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      byte[] var3 = new byte['耀'];
      this.do(var1, var2, var3);
      this.if(var1, var2, var3);
      this.C.a(this, this.H, var1, var2, var3);
      this.T.a(this, this.H, var1, var2, var3);
      xx var4 = new xx(this.H, var3, var1, var2);
      yn[] var5 = this.H.void().a((yn[])null, var1 * 16, var2 * 16, 16, 16);
      byte[] var6 = var4.new();

      for(int var7 = 0; var7 < var6.length; ++var7) {
         var6[var7] = (byte)var5[var7].try;
      }

      var4.do();
      return var4;
   }

   private double[] do(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412D;
      double var10 = 2053.236D;
      this.P = this.V.a(this.P, var2, var3, var4, var5, 1, var7, 1.0D, 0.0D, 1.0D);
      this.O = this.U.a(this.O, var2, var3, var4, var5, 1, var7, 100.0D, 0.0D, 100.0D);
      this.S = this.K.a(this.S, var2, var3, var4, var5, var6, var7, var8 / 80.0D, var10 / 60.0D, var8 / 80.0D);
      this.R = this.M.a(this.R, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      this.Q = this.L.a(this.Q, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;
      int var13 = 0;
      double[] var14 = new double[var6];

      int var15;
      for(var15 = 0; var15 < var6; ++var15) {
         var14[var15] = Math.cos((double)var15 * 3.141592653589793D * 6.0D / (double)var6) * 2.0D;
         double var16 = (double)var15;
         if (var15 > var6 / 2) {
            var16 = (double)(var6 - 1 - var15);
         }

         if (var16 < 4.0D) {
            var16 = 4.0D - var16;
            var14[var15] -= var16 * var16 * var16 * 10.0D;
         }
      }

      for(var15 = 0; var15 < var5; ++var15) {
         for(int var36 = 0; var36 < var7; ++var36) {
            double var17 = (this.P[var13] + 256.0D) / 512.0D;
            if (var17 > 1.0D) {
               var17 = 1.0D;
            }

            double var19 = 0.0D;
            double var21 = this.O[var13] / 8000.0D;
            if (var21 < 0.0D) {
               var21 = -var21;
            }

            var21 = var21 * 3.0D - 3.0D;
            if (var21 < 0.0D) {
               var21 /= 2.0D;
               if (var21 < -1.0D) {
                  var21 = -1.0D;
               }

               var21 /= 1.4D;
               var21 /= 2.0D;
               var17 = 0.0D;
            } else {
               if (var21 > 1.0D) {
                  var21 = 1.0D;
               }

               var21 /= 6.0D;
            }

            var17 += 0.5D;
            var21 = var21 * (double)var6 / 16.0D;
            ++var13;

            for(int var23 = 0; var23 < var6; ++var23) {
               double var24 = 0.0D;
               double var26 = var14[var23];
               double var28 = this.R[var12] / 512.0D;
               double var30 = this.Q[var12] / 512.0D;
               double var32 = (this.S[var12] / 10.0D + 1.0D) / 2.0D;
               if (var32 < 0.0D) {
                  var24 = var28;
               } else if (var32 > 1.0D) {
                  var24 = var30;
               } else {
                  var24 = var28 + (var30 - var28) * var32;
               }

               var24 -= var26;
               double var34;
               if (var23 > var6 - 4) {
                  var34 = (double)((float)(var23 - (var6 - 4)) / 3.0F);
                  var24 = var24 * (1.0D - var34) + -10.0D * var34;
               }

               if ((double)var23 < var19) {
                  var34 = (var19 - (double)var23) / 4.0D;
                  if (var34 < 0.0D) {
                     var34 = 0.0D;
                  }

                  if (var34 > 1.0D) {
                     var34 = 1.0D;
                  }

                  var24 = var24 * (1.0D - var34) + -10.0D * var34;
               }

               var1[var12] = var24;
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
      this.T.a(this.H, this.N, var2, var3);

      int var6;
      int var7;
      int var8;
      int var9;
      for(var6 = 0; var6 < 8; ++var6) {
         var7 = var4 + this.N.nextInt(16) + 8;
         var8 = this.N.nextInt(120) + 4;
         var9 = var5 + this.N.nextInt(16) + 8;
         (new ww(pa.a7.void, false)).a(this.H, this.N, var7, var8, var9);
      }

      var6 = this.N.nextInt(this.N.nextInt(10) + 1) + 1;

      int var10;
      for(var7 = 0; var7 < var6; ++var7) {
         var8 = var4 + this.N.nextInt(16) + 8;
         var9 = this.N.nextInt(120) + 4;
         var10 = var5 + this.N.nextInt(16) + 8;
         (new wy()).a(this.H, this.N, var8, var9, var10);
      }

      var6 = this.N.nextInt(this.N.nextInt(10) + 1);

      for(var7 = 0; var7 < var6; ++var7) {
         var8 = var4 + this.N.nextInt(16) + 8;
         var9 = this.N.nextInt(120) + 4;
         var10 = var5 + this.N.nextInt(16) + 8;
         (new wt()).a(this.H, this.N, var8, var9, var10);
      }

      for(var7 = 0; var7 < 10; ++var7) {
         var8 = var4 + this.N.nextInt(16) + 8;
         var9 = this.N.nextInt(128);
         var10 = var5 + this.N.nextInt(16) + 8;
         (new wx()).a(this.H, this.N, var8, var9, var10);
      }

      if (this.N.nextInt(1) == 0) {
         var7 = var4 + this.N.nextInt(16) + 8;
         var8 = this.N.nextInt(128);
         var9 = var5 + this.N.nextInt(16) + 8;
         (new w1(pa.bN.void)).a(this.H, this.N, var7, var8, var9);
      }

      if (this.N.nextInt(1) == 0) {
         var7 = var4 + this.N.nextInt(16) + 8;
         var8 = this.N.nextInt(128);
         var9 = var5 + this.N.nextInt(16) + 8;
         (new w1(pa.bL.void)).a(this.H, this.N, var7, var8, var9);
      }

      wq var12 = new wq(pa.h.void, 13, pa.aT.void);

      int var11;
      for(var8 = 0; var8 < 16; ++var8) {
         var9 = var4 + this.N.nextInt(16);
         var10 = this.N.nextInt(108) + 10;
         var11 = var5 + this.N.nextInt(16);
         var12.a(this.H, this.N, var9, var10, var11);
      }

      for(var8 = 0; var8 < 16; ++var8) {
         var9 = var4 + this.N.nextInt(16);
         var10 = this.N.nextInt(108) + 10;
         var11 = var5 + this.N.nextInt(16);
         (new ww(pa.a7.void, true)).a(this.H, this.N, var9, var10, var11);
      }

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
      return "HellRandomLevelSource";
   }

   public List a(ah9 var1, int var2, int var3, int var4) {
      if (var1 == ah9.char && this.T.a(var2, var3, var4)) {
         return this.T.do();
      } else {
         yn var5 = this.H.a(var2, var4);
         return var5 == null ? null : var5.a(var1);
      }
   }

   public yp a(y6 var1, String var2, int var3, int var4, int var5) {
      return null;
   }

   public int do() {
      return 0;
   }

   public void a(int var1, int var2) {
      this.T.a(this, this.H, var1, var2, (byte[])null);
   }
}
