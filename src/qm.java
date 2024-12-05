import java.util.Random;

public class qm extends qn {
   int dB = 0;
   boolean[] dA = new boolean[4];
   int[] dC = new int[4];

   protected qm(int var1, ts var2) {
      super(var1, var2);
   }

   private void s(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      var1.int(var2, var3, var4, this.void + 1, var5, 2);
   }

   public boolean a(yy var1, int var2, int var3, int var4) {
      return this.at != ts.r;
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      int var6 = this.k(var1, var2, var3, var4);
      byte var7 = 1;
      if (this.at == ts.r && !var1.n.int) {
         var7 = 2;
      }

      boolean var8 = true;
      int var10;
      if (var6 > 0) {
         byte var9 = -100;
         this.dB = 0;
         int var12 = this.c(var1, var2 - 1, var3, var4, var9);
         var12 = this.c(var1, var2 + 1, var3, var4, var12);
         var12 = this.c(var1, var2, var3, var4 - 1, var12);
         var12 = this.c(var1, var2, var3, var4 + 1, var12);
         var10 = var12 + var7;
         if (var10 >= 8 || var12 < 0) {
            var10 = -1;
         }

         if (this.k(var1, var2, var3 + 1, var4) >= 0) {
            int var11 = this.k(var1, var2, var3 + 1, var4);
            if (var11 >= 8) {
               var10 = var11;
            } else {
               var10 = var11 + 8;
            }
         }

         if (this.dB >= 2 && this.at == ts.s) {
            if (var1.byte(var2, var3 - 1, var4).for()) {
               var10 = 0;
            } else if (var1.byte(var2, var3 - 1, var4) == this.at && var1.for(var2, var3 - 1, var4) == 0) {
               var10 = 0;
            }
         }

         if (this.at == ts.r && var6 < 8 && var10 < 8 && var10 > var6 && var5.nextInt(4) != 0) {
            var10 = var6;
            var8 = false;
         }

         if (var10 == var6) {
            if (var8) {
               this.s(var1, var2, var3, var4);
            }
         } else {
            var6 = var10;
            if (var10 < 0) {
               var1.o(var2, var3, var4);
            } else {
               var1.do(var2, var3, var4, var10, 2);
               var1.if(var2, var3, var4, this.void, this.a(var1));
               var1.for(var2, var3, var4, this.void);
            }
         }
      } else {
         this.s(var1, var2, var3, var4);
      }

      if (this.p(var1, var2, var3 - 1, var4)) {
         if (this.at == ts.r && var1.byte(var2, var3 - 1, var4) == ts.s) {
            var1.int(var2, var3 - 1, var4, pa.k.void);
            this.l(var1, var2, var3 - 1, var4);
            return;
         }

         if (var6 >= 8) {
            this.b(var1, var2, var3 - 1, var4, var6);
         } else {
            this.b(var1, var2, var3 - 1, var4, var6 + 8);
         }
      } else if (var6 >= 0 && (var6 == 0 || this.q(var1, var2, var3 - 1, var4))) {
         boolean[] var13 = this.r(var1, var2, var3, var4);
         var10 = var6 + var7;
         if (var6 >= 8) {
            var10 = 1;
         }

         if (var10 >= 8) {
            return;
         }

         if (var13[0]) {
            this.b(var1, var2 - 1, var3, var4, var10);
         }

         if (var13[1]) {
            this.b(var1, var2 + 1, var3, var4, var10);
         }

         if (var13[2]) {
            this.b(var1, var2, var3, var4 - 1, var10);
         }

         if (var13[3]) {
            this.b(var1, var2, var3, var4 + 1, var10);
         }
      }

   }

   private void b(y6 var1, int var2, int var3, int var4, int var5) {
      if (this.p(var1, var2, var3, var4)) {
         int var6 = var1.new(var2, var3, var4);
         if (var6 > 0) {
            if (this.at == ts.r) {
               this.l(var1, var2, var3, var4);
            } else {
               pa.x[var6].a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
            }
         }

         var1.int(var2, var3, var4, this.void, var5, 3);
      }

   }

   private int for(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 1000;

      for(int var8 = 0; var8 < 4; ++var8) {
         if ((var8 != 0 || var6 != 1) && (var8 != 1 || var6 != 0) && (var8 != 2 || var6 != 3) && (var8 != 3 || var6 != 2)) {
            int var9 = var2;
            int var11 = var4;
            if (var8 == 0) {
               var9 = var2 - 1;
            }

            if (var8 == 1) {
               ++var9;
            }

            if (var8 == 2) {
               var11 = var4 - 1;
            }

            if (var8 == 3) {
               ++var11;
            }

            if (!this.q(var1, var9, var3, var11) && (var1.byte(var9, var3, var11) != this.at || var1.for(var9, var3, var11) != 0)) {
               if (!this.q(var1, var9, var3 - 1, var11)) {
                  return var5;
               }

               if (var5 < 4) {
                  int var12 = this.for(var1, var9, var3, var11, var5 + 1, var8);
                  if (var12 < var7) {
                     var7 = var12;
                  }
               }
            }
         }
      }

      return var7;
   }

   private boolean[] r(y6 var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 4; ++var5) {
         this.dC[var5] = 1000;
         var6 = var2;
         int var8 = var4;
         if (var5 == 0) {
            var6 = var2 - 1;
         }

         if (var5 == 1) {
            ++var6;
         }

         if (var5 == 2) {
            var8 = var4 - 1;
         }

         if (var5 == 3) {
            ++var8;
         }

         if (!this.q(var1, var6, var3, var8) && (var1.byte(var6, var3, var8) != this.at || var1.for(var6, var3, var8) != 0)) {
            if (this.q(var1, var6, var3 - 1, var8)) {
               this.dC[var5] = this.for(var1, var6, var3, var8, 1, var5);
            } else {
               this.dC[var5] = 0;
            }
         }
      }

      var5 = this.dC[0];

      for(var6 = 1; var6 < 4; ++var6) {
         if (this.dC[var6] < var5) {
            var5 = this.dC[var6];
         }
      }

      for(var6 = 0; var6 < 4; ++var6) {
         this.dA[var6] = this.dC[var6] == var5;
      }

      return this.dA;
   }

   private boolean q(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.new(var2, var3, var4);
      if (var5 != pa.co.void && var5 != pa.ch.void && var5 != pa.cp.void && var5 != pa.cn.void && var5 != pa.a5.void) {
         if (var5 == 0) {
            return false;
         } else {
            ts var6 = pa.x[var5].at;
            if (var6 == ts.else) {
               return true;
            } else {
               return var6.void();
            }
         }
      } else {
         return true;
      }
   }

   protected int c(y6 var1, int var2, int var3, int var4, int var5) {
      int var6 = this.k(var1, var2, var3, var4);
      if (var6 < 0) {
         return var5;
      } else {
         if (var6 == 0) {
            ++this.dB;
         }

         if (var6 >= 8) {
            var6 = 0;
         }

         return var5 >= 0 && var6 >= var5 ? var5 : var6;
      }
   }

   private boolean p(y6 var1, int var2, int var3, int var4) {
      ts var5 = var1.byte(var2, var3, var4);
      if (var5 == this.at) {
         return false;
      } else if (var5 == ts.r) {
         return false;
      } else {
         return !this.q(var1, var2, var3, var4);
      }
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      super.for(var1, var2, var3, var4);
      if (var1.new(var2, var3, var4) == this.void) {
         var1.if(var2, var3, var4, this.void, this.a(var1));
      }

   }

   public boolean char() {
      return false;
   }
}
