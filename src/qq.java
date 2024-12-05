import java.util.List;
import java.util.Random;

public class qq extends o2 {
   public static final String[] cO = new String[]{"oak", "spruce", "birch", "jungle"};
   public static final String[][] cN = new String[][]{{"leaves", "leaves_spruce", "leaves", "leaves_jungle"}, {"leaves_opaque", "leaves_spruce_opaque", "leaves_opaque", "leaves_jungle_opaque"}};
   private int cQ;
   private ajd[][] cP = new ajd[2][];
   int[] cR;

   protected qq(int var1) {
      super(var1, ts.q, false);
      this.a(true);
      this.a((acn)acn.c);
   }

   public int c() {
      double var1 = 0.5D;
      double var3 = 1.0D;
      return zf.a(var1, var3);
   }

   public int a(int var1) {
      if ((var1 & 3) == 1) {
         return zf.do();
      } else {
         return (var1 & 3) == 2 ? zf.if() : zf.a();
      }
   }

   public int do(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      if ((var5 & 3) == 1) {
         return zf.do();
      } else if ((var5 & 3) == 2) {
         return zf.if();
      } else {
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;

         for(int var9 = -1; var9 <= 1; ++var9) {
            for(int var10 = -1; var10 <= 1; ++var10) {
               int var11 = var1.a(var2 + var10, var4 + var9).case();
               var6 += (var11 & 16711680) >> 16;
               var7 += (var11 & '\uff00') >> 8;
               var8 += var11 & 255;
            }
         }

         return (var6 / 9 & 255) << 16 | (var7 / 9 & 255) << 8 | var8 / 9 & 255;
      }
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      byte var7 = 1;
      int var8 = var7 + 1;
      if (var1.for(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
         for(int var9 = -var7; var9 <= var7; ++var9) {
            for(int var10 = -var7; var10 <= var7; ++var10) {
               for(int var11 = -var7; var11 <= var7; ++var11) {
                  int var12 = var1.new(var2 + var9, var3 + var10, var4 + var11);
                  if (var12 == pa.aJ.void) {
                     int var13 = var1.for(var2 + var9, var3 + var10, var4 + var11);
                     var1.do(var2 + var9, var3 + var10, var4 + var11, var13 | 8, 4);
                  }
               }
            }
         }
      }

   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (!var1.goto) {
         int var6 = var1.for(var2, var3, var4);
         if ((var6 & 8) != 0 && (var6 & 4) == 0) {
            byte var7 = 4;
            int var8 = var7 + 1;
            byte var9 = 32;
            int var10 = var9 * var9;
            int var11 = var9 / 2;
            if (this.cR == null) {
               this.cR = new int[var9 * var9 * var9];
            }

            int var12;
            if (var1.for(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
               var12 = -var7;

               label112:
               while(true) {
                  int var13;
                  int var14;
                  int var15;
                  if (var12 > var7) {
                     var12 = 1;

                     while(true) {
                        if (var12 > 4) {
                           break label112;
                        }

                        for(var13 = -var7; var13 <= var7; ++var13) {
                           for(var14 = -var7; var14 <= var7; ++var14) {
                              for(var15 = -var7; var15 <= var7; ++var15) {
                                 if (this.cR[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11] == var12 - 1) {
                                    if (this.cR[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var15 + var11] == -2) {
                                       this.cR[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var15 + var11] = var12;
                                    }

                                    if (this.cR[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var15 + var11] == -2) {
                                       this.cR[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var15 + var11] = var12;
                                    }

                                    if (this.cR[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var15 + var11] == -2) {
                                       this.cR[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var15 + var11] = var12;
                                    }

                                    if (this.cR[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var15 + var11] == -2) {
                                       this.cR[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var15 + var11] = var12;
                                    }

                                    if (this.cR[(var13 + var11) * var10 + (var14 + var11) * var9 + (var15 + var11 - 1)] == -2) {
                                       this.cR[(var13 + var11) * var10 + (var14 + var11) * var9 + (var15 + var11 - 1)] = var12;
                                    }

                                    if (this.cR[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11 + 1] == -2) {
                                       this.cR[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11 + 1] = var12;
                                    }
                                 }
                              }
                           }
                        }

                        ++var12;
                     }
                  }

                  for(var13 = -var7; var13 <= var7; ++var13) {
                     for(var14 = -var7; var14 <= var7; ++var14) {
                        var15 = var1.new(var2 + var12, var3 + var13, var4 + var14);
                        if (var15 == pa.aM.void) {
                           this.cR[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = 0;
                        } else if (var15 == pa.aJ.void) {
                           this.cR[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -2;
                        } else {
                           this.cR[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -1;
                        }
                     }
                  }

                  ++var12;
               }
            }

            var12 = this.cR[var11 * var10 + var11 * var9 + var11];
            if (var12 >= 0) {
               var1.do(var2, var3, var4, var6 & -9, 4);
            } else {
               this.void(var1, var2, var3, var4);
            }
         }

      }
   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      if (var1.d(var2, var3 + 1, var4) && !var1.case(var2, var3 - 1, var4) && var5.nextInt(15) == 1) {
         double var6 = (double)((float)var2 + var5.nextFloat());
         double var8 = (double)var3 - 0.05D;
         double var10 = (double)((float)var4 + var5.nextFloat());
         var1.a("dripWater", var6, var8, var10, 0.0D, 0.0D, 0.0D);
      }

   }

   private void void(y6 var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
      var1.o(var2, var3, var4);
   }

   public int a(Random var1) {
      return var1.nextInt(20) == 0 ? 1 : 0;
   }

   public int a(int var1, Random var2, int var3) {
      return pa.bd.void;
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if (!var1.goto) {
         int var8 = 20;
         if ((var5 & 3) == 3) {
            var8 = 40;
         }

         if (var7 > 0) {
            var8 -= 2 << var7;
            if (var8 < 10) {
               var8 = 10;
            }
         }

         if (var1.o.nextInt(var8) == 0) {
            int var9 = this.a(var5, var1.o, var7);
            this.a(var1, var2, var3, var4, new abp(var9, 1, this.for(var5)));
         }

         var8 = 200;
         if (var7 > 0) {
            var8 -= 10 << var7;
            if (var8 < 40) {
               var8 = 40;
            }
         }

         if ((var5 & 3) == 0 && var1.o.nextInt(var8) == 0) {
            this.a(var1, var2, var3, var4, new abp(abr.Y, 1, 0));
         }
      }

   }

   public void a(y6 var1, aek var2, int var3, int var4, int var5, int var6) {
      if (!var1.goto && var2.cD() != null && var2.cD().new == abr.aX.A) {
         var2.a((akf)aka.void[this.void], 1);
         this.a(var1, var3, var4, var5, new abp(pa.aJ.void, 1, var6 & 3));
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }

   public int for(int var1) {
      return var1 & 3;
   }

   public boolean do() {
      return !this.cM;
   }

   public ajd if(int var1, int var2) {
      if ((var2 & 3) == 1) {
         return this.cP[this.cQ][1];
      } else {
         return (var2 & 3) == 3 ? this.cP[this.cQ][3] : this.cP[this.cQ][0];
      }
   }

   public void if(boolean var1) {
      this.cM = var1;
      this.cQ = var1 ? 0 : 1;
   }

   public void a(int var1, acn var2, List var3) {
      var3.add(new abp(var1, 1, 0));
      var3.add(new abp(var1, 1, 1));
      var3.add(new abp(var1, 1, 2));
      var3.add(new abp(var1, 1, 3));
   }

   protected abp int(int var1) {
      return new abp(this.void, 1, var1 & 3);
   }

   public void a(ajc var1) {
      for(int var2 = 0; var2 < cN.length; ++var2) {
         this.cP[var2] = new ajd[cN[var2].length];

         for(int var3 = 0; var3 < cN[var2].length; ++var3) {
            this.cP[var2][var3] = var1.a(cN[var2][var3]);
         }
      }

   }
}
