import java.util.List;
import java.util.Random;

public class xb implements x0 {
   private Random r;
   private tx q;
   private tx p;
   private tx o;
   private tx n;
   public tx B;
   public tx A;
   public tx z;
   private y6 m;
   private final boolean l;
   private double[] k;
   private double[] j = new double[256];
   private xd i = new xe();
   private vb h = new vb();
   private uh g = new uh();
   private wb f = new wb();
   private vk e = new vk();
   private xd d = new xh();
   private yn[] c;
   double[] y;
   double[] x;
   double[] w;
   double[] v;
   double[] u;
   float[] t;
   int[][] s = new int[32][32];

   public xb(y6 var1, long var2, boolean var4) {
      this.m = var1;
      this.l = var4;
      this.r = new Random(var2);
      this.q = new tx(this.r, 16);
      this.p = new tx(this.r, 16);
      this.o = new tx(this.r, 8);
      this.n = new tx(this.r, 4);
      this.B = new tx(this.r, 10);
      this.A = new tx(this.r, 16);
      this.z = new tx(this.r, 8);
   }

   public void a(int var1, int var2, byte[] var3) {
      byte var4 = 4;
      byte var5 = 16;
      byte var6 = 63;
      int var7 = var4 + 1;
      byte var8 = 17;
      int var9 = var4 + 1;
      this.c = this.m.void().if(this.c, var1 * 4 - 2, var2 * 4 - 2, var7 + 5, var9 + 5);
      this.k = this.if(this.k, var1 * var4, 0, var2 * var4, var7, var8, var9);

      for(int var10 = 0; var10 < var4; ++var10) {
         for(int var11 = 0; var11 < var4; ++var11) {
            for(int var12 = 0; var12 < var5; ++var12) {
               double var13 = 0.125D;
               double var15 = this.k[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 0];
               double var17 = this.k[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 0];
               double var19 = this.k[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 0];
               double var21 = this.k[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 0];
               double var23 = (this.k[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 1] - var15) * var13;
               double var25 = (this.k[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 1] - var17) * var13;
               double var27 = (this.k[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 1] - var19) * var13;
               double var29 = (this.k[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 1] - var21) * var13;

               for(int var31 = 0; var31 < 8; ++var31) {
                  double var32 = 0.25D;
                  double var34 = var15;
                  double var36 = var17;
                  double var38 = (var19 - var15) * var32;
                  double var40 = (var21 - var17) * var32;

                  for(int var42 = 0; var42 < 4; ++var42) {
                     int var43 = var42 + var10 * 4 << 11 | 0 + var11 * 4 << 7 | var12 * 8 + var31;
                     short var44 = 128;
                     var43 -= var44;
                     double var45 = 0.25D;
                     double var49 = (var36 - var34) * var45;
                     double var47 = var34 - var49;

                     for(int var51 = 0; var51 < 4; ++var51) {
                        if ((var47 += var49) > 0.0D) {
                           var3[var43 += var44] = (byte)pa.k.void;
                        } else if (var12 * 8 + var31 < var6) {
                           var3[var43 += var44] = (byte)pa.ba.void;
                        } else {
                           var3[var43 += var44] = 0;
                        }
                     }

                     var34 += var38;
                     var36 += var40;
                  }

                  var15 += var23;
                  var17 += var25;
                  var19 += var27;
                  var21 += var29;
               }
            }
         }
      }

   }

   public void do(int var1, int var2, byte[] var3, yn[] var4) {
      byte var5 = 63;
      double var6 = 0.03125D;
      this.j = this.n.a(this.j, var1 * 16, var2 * 16, 0, 16, 16, 1, var6 * 2.0D, var6 * 2.0D, var6 * 2.0D);

      for(int var8 = 0; var8 < 16; ++var8) {
         for(int var9 = 0; var9 < 16; ++var9) {
            yn var10 = var4[var9 + var8 * 16];
            float var11 = var10.int();
            int var12 = (int)(this.j[var8 + var9 * 16] / 3.0D + 3.0D + this.r.nextDouble() * 0.25D);
            int var13 = -1;
            byte var14 = var10.g;
            byte var15 = var10.f;

            for(int var16 = 127; var16 >= 0; --var16) {
               int var17 = (var9 * 16 + var8) * 128 + var16;
               if (var16 <= 0 + this.r.nextInt(5)) {
                  var3[var17] = (byte)pa.bc.void;
               } else {
                  byte var18 = var3[var17];
                  if (var18 == 0) {
                     var13 = -1;
                  } else if (var18 == pa.k.void) {
                     if (var13 == -1) {
                        if (var12 <= 0) {
                           var14 = 0;
                           var15 = (byte)pa.k.void;
                        } else if (var16 >= var5 - 4 && var16 <= var5 + 1) {
                           var14 = var10.g;
                           var15 = var10.f;
                        }

                        if (var16 < var5 && var14 == 0) {
                           if (var11 < 0.15F) {
                              var14 = (byte)pa.b9.void;
                           } else {
                              var14 = (byte)pa.ba.void;
                           }
                        }

                        var13 = var12;
                        if (var16 >= var5 - 1) {
                           var3[var17] = var14;
                        } else {
                           var3[var17] = var15;
                        }
                     } else if (var13 > 0) {
                        --var13;
                        var3[var17] = var15;
                        if (var13 == 0 && var15 == pa.a1.void) {
                           var13 = this.r.nextInt(4);
                           var15 = (byte)pa.ar.void;
                        }
                     }
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
      this.r.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      byte[] var3 = new byte['耀'];
      this.a(var1, var2, var3);
      this.c = this.m.void().a((yn[])this.c, var1 * 16, var2 * 16, 16, 16);
      this.do(var1, var2, var3, this.c);
      this.i.a(this, this.m, var1, var2, var3);
      this.d.a(this, this.m, var1, var2, var3);
      if (this.l) {
         this.f.a(this, this.m, var1, var2, var3);
         this.g.a(this, this.m, var1, var2, var3);
         this.h.a(this, this.m, var1, var2, var3);
         this.e.a(this, this.m, var1, var2, var3);
      }

      xx var4 = new xx(this.m, var3, var1, var2);
      byte[] var5 = var4.new();

      for(int var6 = 0; var6 < var5.length; ++var6) {
         var5[var6] = (byte)this.c[var6].try;
      }

      var4.for();
      return var4;
   }

   private double[] if(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      if (this.t == null) {
         this.t = new float[25];

         for(int var8 = -2; var8 <= 2; ++var8) {
            for(int var9 = -2; var9 <= 2; ++var9) {
               float var10 = 10.0F / ajs.if((float)(var8 * var8 + var9 * var9) + 0.2F);
               this.t[var8 + 2 + (var9 + 2) * 5] = var10;
            }
         }
      }

      double var44 = 684.412D;
      double var45 = 684.412D;
      this.v = this.B.a(this.v, var2, var4, var5, var7, 1.121D, 1.121D, 0.5D);
      this.u = this.A.a(this.u, var2, var4, var5, var7, 200.0D, 200.0D, 0.5D);
      this.y = this.o.a(this.y, var2, var3, var4, var5, var6, var7, var44 / 80.0D, var45 / 160.0D, var44 / 80.0D);
      this.x = this.q.a(this.x, var2, var3, var4, var5, var6, var7, var44, var45, var44);
      this.w = this.p.a(this.w, var2, var3, var4, var5, var6, var7, var44, var45, var44);
      boolean var43 = false;
      boolean var42 = false;
      int var12 = 0;
      int var13 = 0;

      for(int var14 = 0; var14 < var5; ++var14) {
         for(int var15 = 0; var15 < var7; ++var15) {
            float var16 = 0.0F;
            float var17 = 0.0F;
            float var18 = 0.0F;
            byte var19 = 2;
            yn var20 = this.c[var14 + 2 + (var15 + 2) * (var5 + 5)];

            for(int var21 = -var19; var21 <= var19; ++var21) {
               for(int var22 = -var19; var22 <= var19; ++var22) {
                  yn var23 = this.c[var14 + var21 + 2 + (var15 + var22 + 2) * (var5 + 5)];
                  float var24 = this.t[var21 + 2 + (var22 + 2) * 5] / (var23.d + 2.0F);
                  if (var23.d > var20.d) {
                     var24 /= 2.0F;
                  }

                  var16 += var23.c * var24;
                  var17 += var23.d * var24;
                  var18 += var24;
               }
            }

            var16 /= var18;
            var17 /= var18;
            var16 = var16 * 0.9F + 0.1F;
            var17 = (var17 * 4.0F - 1.0F) / 8.0F;
            double var46 = this.u[var13] / 8000.0D;
            if (var46 < 0.0D) {
               var46 = -var46 * 0.3D;
            }

            var46 = var46 * 3.0D - 2.0D;
            if (var46 < 0.0D) {
               var46 /= 2.0D;
               if (var46 < -1.0D) {
                  var46 = -1.0D;
               }

               var46 /= 1.4D;
               var46 /= 2.0D;
            } else {
               if (var46 > 1.0D) {
                  var46 = 1.0D;
               }

               var46 /= 8.0D;
            }

            ++var13;

            for(int var47 = 0; var47 < var6; ++var47) {
               double var48 = (double)var17;
               double var26 = (double)var16;
               var48 += var46 * 0.2D;
               var48 = var48 * (double)var6 / 16.0D;
               double var28 = (double)var6 / 2.0D + var48 * 4.0D;
               double var30 = 0.0D;
               double var32 = ((double)var47 - var28) * 12.0D * 128.0D / 128.0D / var26;
               if (var32 < 0.0D) {
                  var32 *= 4.0D;
               }

               double var34 = this.x[var12] / 512.0D;
               double var36 = this.w[var12] / 512.0D;
               double var38 = (this.y[var12] / 10.0D + 1.0D) / 2.0D;
               if (var38 < 0.0D) {
                  var30 = var34;
               } else if (var38 > 1.0D) {
                  var30 = var36;
               } else {
                  var30 = var34 + (var36 - var34) * var38;
               }

               var30 -= var32;
               if (var47 > var6 - 4) {
                  double var40 = (double)((float)(var47 - (var6 - 4)) / 3.0F);
                  var30 = var30 * (1.0D - var40) + -10.0D * var40;
               }

               var1[var12] = var30;
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
      yn var6 = this.m.a(var4 + 16, var5 + 16);
      this.r.setSeed(this.m.b());
      long var7 = this.r.nextLong() / 2L * 2L + 1L;
      long var9 = this.r.nextLong() / 2L * 2L + 1L;
      this.r.setSeed((long)var2 * var7 + (long)var3 * var9 ^ this.m.b());
      boolean var11 = false;
      if (this.l) {
         this.f.a(this.m, this.r, var2, var3);
         var11 = this.g.a(this.m, this.r, var2, var3);
         this.h.a(this.m, this.r, var2, var3);
         this.e.a(this.m, this.r, var2, var3);
      }

      int var12;
      int var13;
      int var14;
      if (!var11 && this.r.nextInt(4) == 0) {
         var12 = var4 + this.r.nextInt(16) + 8;
         var13 = this.r.nextInt(128);
         var14 = var5 + this.r.nextInt(16) + 8;
         (new wu(pa.ba.void)).a(this.m, this.r, var12, var13, var14);
      }

      if (!var11 && this.r.nextInt(8) == 0) {
         var12 = var4 + this.r.nextInt(16) + 8;
         var13 = this.r.nextInt(this.r.nextInt(120) + 8);
         var14 = var5 + this.r.nextInt(16) + 8;
         if (var13 < 63 || this.r.nextInt(10) == 0) {
            (new wu(pa.a4.void)).a(this.m, this.r, var12, var13, var14);
         }
      }

      for(var12 = 0; var12 < 8; ++var12) {
         var13 = var4 + this.r.nextInt(16) + 8;
         var14 = this.r.nextInt(128);
         int var15 = var5 + this.r.nextInt(16) + 8;
         if ((new wr()).a(this.m, this.r, var13, var14, var15)) {
         }
      }

      var6.a(this.m, this.r, var4, var5);
      yv.a(this.m, var6, var4 + 8, var5 + 8, 16, 16, this.r);
      var4 += 8;
      var5 += 8;

      for(var12 = 0; var12 < 16; ++var12) {
         for(var13 = 0; var13 < 16; ++var13) {
            var14 = this.m.new(var4 + var12, var5 + var13);
            if (this.m.else(var12 + var4, var14 - 1, var13 + var5)) {
               this.m.int(var12 + var4, var14 - 1, var13 + var5, pa.b9.void, 0, 2);
            }

            if (this.m.long(var12 + var4, var14, var13 + var5)) {
               this.m.int(var12 + var4, var14, var13 + var5, pa.ca.void, 0, 2);
            }
         }
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
      return "RandomLevelSource";
   }

   public List a(ah9 var1, int var2, int var3, int var4) {
      yn var5 = this.m.a(var2, var4);
      if (var5 == null) {
         return null;
      } else {
         return var5 == yn.z && var1 == ah9.char && this.e.a(var2, var3, var4) ? this.e.if() : var5.a(var1);
      }
   }

   public yp a(y6 var1, String var2, int var3, int var4, int var5) {
      return "Stronghold".equals(var2) && this.h != null ? this.h.a(var1, var3, var4, var5) : null;
   }

   public int do() {
      return 0;
   }

   public void a(int var1, int var2) {
      if (this.l) {
         this.f.a(this, this.m, var1, var2, (byte[])null);
         this.g.a(this, this.m, var1, var2, (byte[])null);
         this.h.a(this, this.m, var1, var2, (byte[])null);
         this.e.a(this, this.m, var1, var2, (byte[])null);
      }

   }
}
