import java.util.Random;

public class q7 extends pa {
   private int[] dX = new int[256];
   private int[] dW = new int[256];
   private ajd[] dY;

   protected q7(int var1) {
      super(var1, ts.l);
      this.a(true);
   }

   public void else() {
      this.a(pa.be.void, 5, 20);
      this.a(pa.by.void, 5, 20);
      this.a(pa.bw.void, 5, 20);
      this.a(pa.aZ.void, 5, 20);
      this.a(pa.bk.void, 5, 20);
      this.a(pa.S.void, 5, 20);
      this.a(pa.U.void, 5, 20);
      this.a(pa.Q.void, 5, 20);
      this.a(pa.aM.void, 5, 5);
      this.a(pa.aJ.void, 30, 60);
      this.a(pa.bx.void, 30, 20);
      this.a(pa.bz.void, 15, 100);
      this.a(pa.b3.void, 60, 100);
      this.a(pa.bV.void, 30, 60);
      this.a(pa.Z.void, 15, 100);
   }

   private void a(int var1, int var2, int var3) {
      this.dX[var1] = var2;
      this.dW[var1] = var3;
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public int new() {
      return 3;
   }

   public int a(Random var1) {
      return 0;
   }

   public int a(y6 var1) {
      return 30;
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (var1.i().a("doFireTick")) {
         boolean var6 = var1.new(var2, var3 - 1, var4) == pa.aT.void;
         if (var1.n instanceof xi && var1.new(var2, var3 - 1, var4) == pa.bc.void) {
            var6 = true;
         }

         if (!this.case(var1, var2, var3, var4)) {
            var1.o(var2, var3, var4);
         }

         if (!var6 && var1.goto() && (var1.d(var2, var3, var4) || var1.d(var2 - 1, var3, var4) || var1.d(var2 + 1, var3, var4) || var1.d(var2, var3, var4 - 1) || var1.d(var2, var3, var4 + 1))) {
            var1.o(var2, var3, var4);
         } else {
            int var7 = var1.for(var2, var3, var4);
            if (var7 < 15) {
               var1.do(var2, var3, var4, var7 + var5.nextInt(3) / 2, 4);
            }

            var1.if(var2, var3, var4, this.void, this.a(var1) + var5.nextInt(10));
            if (!var6 && !this.y(var1, var2, var3, var4)) {
               if (!var1.case(var2, var3 - 1, var4) || var7 > 3) {
                  var1.o(var2, var3, var4);
               }

            } else if (!var6 && !this.long(var1, var2, var3 - 1, var4) && var7 == 15 && var5.nextInt(4) == 0) {
               var1.o(var2, var3, var4);
            } else {
               boolean var8 = var1.e(var2, var3, var4);
               byte var9 = 0;
               if (var8) {
                  var9 = -50;
               }

               this.a(var1, var2 + 1, var3, var4, 300 + var9, var5, var7);
               this.a(var1, var2 - 1, var3, var4, 300 + var9, var5, var7);
               this.a(var1, var2, var3 - 1, var4, 250 + var9, var5, var7);
               this.a(var1, var2, var3 + 1, var4, 250 + var9, var5, var7);
               this.a(var1, var2, var3, var4 - 1, 300 + var9, var5, var7);
               this.a(var1, var2, var3, var4 + 1, 300 + var9, var5, var7);

               for(int var10 = var2 - 1; var10 <= var2 + 1; ++var10) {
                  for(int var11 = var4 - 1; var11 <= var4 + 1; ++var11) {
                     for(int var12 = var3 - 1; var12 <= var3 + 4; ++var12) {
                        if (var10 != var2 || var12 != var3 || var11 != var4) {
                           int var13 = 100;
                           if (var12 > var3 + 1) {
                              var13 += (var12 - (var3 + 1)) * 100;
                           }

                           int var14 = this.x(var1, var10, var12, var11);
                           if (var14 > 0) {
                              int var15 = (var14 + 40 + var1.p * 7) / (var7 + 30);
                              if (var8) {
                                 var15 /= 2;
                              }

                              if (var15 > 0 && var5.nextInt(var13) <= var15 && (!var1.goto() || !var1.d(var10, var12, var11)) && !var1.d(var10 - 1, var12, var4) && !var1.d(var10 + 1, var12, var11) && !var1.d(var10, var12, var11 - 1) && !var1.d(var10, var12, var11 + 1)) {
                                 int var16 = var7 + var5.nextInt(5) / 4;
                                 if (var16 > 15) {
                                    var16 = 15;
                                 }

                                 var1.int(var10, var12, var11, this.void, var16, 3);
                              }
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   public boolean char() {
      return false;
   }

   private void a(y6 var1, int var2, int var3, int var4, int var5, Random var6, int var7) {
      int var8 = this.dW[var1.new(var2, var3, var4)];
      if (var6.nextInt(var5) < var8) {
         boolean var9 = var1.new(var2, var3, var4) == pa.bz.void;
         if (var6.nextInt(var7 + 10) < 5 && !var1.d(var2, var3, var4)) {
            int var10 = var7 + var6.nextInt(5) / 4;
            if (var10 > 15) {
               var10 = 15;
            }

            var1.int(var2, var3, var4, this.void, var10, 3);
         } else {
            var1.o(var2, var3, var4);
         }

         if (var9) {
            pa.bz.a((y6)var1, var2, var3, var4, 1);
         }
      }

   }

   private boolean y(y6 var1, int var2, int var3, int var4) {
      if (this.long(var1, var2 + 1, var3, var4)) {
         return true;
      } else if (this.long(var1, var2 - 1, var3, var4)) {
         return true;
      } else if (this.long(var1, var2, var3 - 1, var4)) {
         return true;
      } else if (this.long(var1, var2, var3 + 1, var4)) {
         return true;
      } else if (this.long(var1, var2, var3, var4 - 1)) {
         return true;
      } else {
         return this.long(var1, var2, var3, var4 + 1);
      }
   }

   private int x(y6 var1, int var2, int var3, int var4) {
      byte var5 = 0;
      if (!var1.a(var2, var3, var4)) {
         return 0;
      } else {
         int var6 = this.e(var1, var2 + 1, var3, var4, var5);
         var6 = this.e(var1, var2 - 1, var3, var4, var6);
         var6 = this.e(var1, var2, var3 - 1, var4, var6);
         var6 = this.e(var1, var2, var3 + 1, var4, var6);
         var6 = this.e(var1, var2, var3, var4 - 1, var6);
         var6 = this.e(var1, var2, var3, var4 + 1, var6);
         return var6;
      }
   }

   public boolean goto() {
      return false;
   }

   public boolean long(yy var1, int var2, int var3, int var4) {
      return this.dX[var1.new(var2, var3, var4)] > 0;
   }

   public int e(y6 var1, int var2, int var3, int var4, int var5) {
      int var6 = this.dX[var1.new(var2, var3, var4)];
      return var6 > var5 ? var6 : var5;
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      return var1.case(var2, var3 - 1, var4) || this.y(var1, var2, var3, var4);
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!var1.case(var2, var3 - 1, var4) && !this.y(var1, var2, var3, var4)) {
         var1.o(var2, var3, var4);
      }

   }

   public void for(y6 var1, int var2, int var3, int var4) {
      if (var1.n.if > 0 || var1.new(var2, var3 - 1, var4) != pa.bs.void || !pa.aK.w(var1, var2, var3, var4)) {
         if (!var1.case(var2, var3 - 1, var4) && !this.y(var1, var2, var3, var4)) {
            var1.o(var2, var3, var4);
         } else {
            var1.if(var2, var3, var4, this.void, this.a(var1) + var1.o.nextInt(10));
         }
      }
   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      if (var5.nextInt(24) == 0) {
         var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "fire.fire", 1.0F + var5.nextFloat(), var5.nextFloat() * 0.7F + 0.3F, false);
      }

      int var6;
      float var7;
      float var8;
      float var9;
      if (!var1.case(var2, var3 - 1, var4) && !pa.bo.long(var1, var2, var3 - 1, var4)) {
         if (pa.bo.long(var1, var2 - 1, var3, var4)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat() * 0.1F;
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)var4 + var5.nextFloat();
               var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if (pa.bo.long(var1, var2 + 1, var3, var4)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)(var2 + 1) - var5.nextFloat() * 0.1F;
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)var4 + var5.nextFloat();
               var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if (pa.bo.long(var1, var2, var3, var4 - 1)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat();
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)var4 + var5.nextFloat() * 0.1F;
               var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if (pa.bo.long(var1, var2, var3, var4 + 1)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat();
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)(var4 + 1) - var5.nextFloat() * 0.1F;
               var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if (pa.bo.long(var1, var2, var3 + 1, var4)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat();
               var8 = (float)(var3 + 1) - var5.nextFloat() * 0.1F;
               var9 = (float)var4 + var5.nextFloat();
               var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }
      } else {
         for(var6 = 0; var6 < 3; ++var6) {
            var7 = (float)var2 + var5.nextFloat();
            var8 = (float)var3 + var5.nextFloat() * 0.5F + 0.5F;
            var9 = (float)var4 + var5.nextFloat();
            var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
         }
      }

   }

   public void a(ajc var1) {
      this.dY = new ajd[]{var1.a("fire_0"), var1.a("fire_1")};
   }

   public ajd o(int var1) {
      return this.dY[var1];
   }

   public ajd if(int var1, int var2) {
      return this.dY[0];
   }
}
