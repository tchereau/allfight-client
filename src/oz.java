import java.util.Random;

public class oz extends pa {
   public oz(int var1) {
      super(var1, ts.j);
      this.a(acn.b);
      this.a(true);
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
      return 29;
   }

   public int a(y6 var1) {
      return 10;
   }

   public boolean for(y6 var1, int var2, int var3, int var4, int var5) {
      if (var5 == 2 && var1.try(var2, var3, var4 + 1)) {
         return true;
      } else if (var5 == 3 && var1.try(var2, var3, var4 - 1)) {
         return true;
      } else if (var5 == 4 && var1.try(var2 + 1, var3, var4)) {
         return true;
      } else {
         return var5 == 5 && var1.try(var2 - 1, var3, var4);
      }
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      if (var1.try(var2 - 1, var3, var4)) {
         return true;
      } else if (var1.try(var2 + 1, var3, var4)) {
         return true;
      } else if (var1.try(var2, var3, var4 - 1)) {
         return true;
      } else {
         return var1.try(var2, var3, var4 + 1);
      }
   }

   public int a(y6 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      byte var10 = 0;
      if (var5 == 2 && var1.do(var2, var3, var4 + 1, true)) {
         var10 = 2;
      }

      if (var5 == 3 && var1.do(var2, var3, var4 - 1, true)) {
         var10 = 0;
      }

      if (var5 == 4 && var1.do(var2 + 1, var3, var4, true)) {
         var10 = 1;
      }

      if (var5 == 5 && var1.do(var2 - 1, var3, var4, true)) {
         var10 = 3;
      }

      return var10;
   }

   public void try(y6 var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, this.void, var5, false, -1, 0);
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (var5 != this.void) {
         if (this.long(var1, var2, var3, var4)) {
            int var6 = var1.for(var2, var3, var4);
            int var7 = var6 & 3;
            boolean var8 = false;
            if (!var1.try(var2 - 1, var3, var4) && var7 == 3) {
               var8 = true;
            }

            if (!var1.try(var2 + 1, var3, var4) && var7 == 1) {
               var8 = true;
            }

            if (!var1.try(var2, var3, var4 - 1) && var7 == 0) {
               var8 = true;
            }

            if (!var1.try(var2, var3, var4 + 1) && var7 == 2) {
               var8 = true;
            }

            if (var8) {
               this.a(var1, var2, var3, var4, var6, 0);
               var1.o(var2, var3, var4);
            }
         }

      }
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int var9) {
      int var10 = var6 & 3;
      boolean var11 = (var6 & 4) == 4;
      boolean var12 = (var6 & 8) == 8;
      boolean var13 = var5 == pa.bl.void;
      boolean var14 = false;
      boolean var15 = !var1.case(var2, var3 - 1, var4);
      int var16 = apk.case[var10];
      int var17 = apk.byte[var10];
      int var18 = 0;
      int[] var19 = new int[42];

      int var20;
      int var21;
      int var22;
      int var23;
      int var24;
      for(var20 = 1; var20 < 42; ++var20) {
         var21 = var2 + var16 * var20;
         var22 = var4 + var17 * var20;
         var23 = var1.new(var21, var3, var22);
         if (var23 == pa.bl.void) {
            var24 = var1.for(var21, var3, var22);
            if ((var24 & 3) == apk.for[var10]) {
               var18 = var20;
            }
            break;
         }

         if (var23 != pa.bj.void && var20 != var8) {
            var19[var20] = -1;
            var13 = false;
         } else {
            var24 = var20 == var8 ? var9 : var1.for(var21, var3, var22);
            boolean var25 = (var24 & 8) != 8;
            boolean var26 = (var24 & 1) == 1;
            boolean var27 = (var24 & 2) == 2;
            var13 &= var27 == var15;
            var14 |= var25 && var26;
            var19[var20] = var24;
            if (var20 == var8) {
               var1.if(var2, var3, var4, var5, this.a(var1));
               var13 &= var25;
            }
         }
      }

      var13 &= var18 > 1;
      var14 &= var13;
      var20 = (var13 ? 4 : 0) | (var14 ? 8 : 0);
      var6 = var10 | var20;
      if (var18 > 0) {
         var21 = var2 + var16 * var18;
         var22 = var4 + var17 * var18;
         var23 = apk.for[var10];
         var1.do(var21, var3, var22, var23 | var20, 3);
         this.goto(var1, var21, var3, var22, var23);
         this.a(var1, var21, var3, var22, var13, var14, var11, var12);
      }

      this.a(var1, var2, var3, var4, var13, var14, var11, var12);
      if (var5 > 0) {
         var1.do(var2, var3, var4, var6, 3);
         if (var7) {
            this.goto(var1, var2, var3, var4, var10);
         }
      }

      if (var11 != var13) {
         for(var21 = 1; var21 < var18; ++var21) {
            var22 = var2 + var16 * var21;
            var23 = var4 + var17 * var21;
            var24 = var19[var21];
            if (var24 >= 0) {
               if (var13) {
                  var24 |= 4;
               } else {
                  var24 &= -5;
               }

               var1.do(var22, var3, var23, var24, 3);
            }
         }
      }

   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      this.a(var1, var2, var3, var4, this.void, var1.for(var2, var3, var4), true, -1, 0);
   }

   private void a(y6 var1, int var2, int var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      if (var6 && !var8) {
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.4F, 0.6F);
      } else if (!var6 && var8) {
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.4F, 0.5F);
      } else if (var5 && !var7) {
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.4F, 0.7F);
      } else if (!var5 && var7) {
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.bowhit", 0.4F, 1.2F / (var1.o.nextFloat() * 0.2F + 0.9F));
      }

   }

   private void goto(y6 var1, int var2, int var3, int var4, int var5) {
      var1.for(var2, var3, var4, this.void);
      if (var5 == 3) {
         var1.for(var2 - 1, var3, var4, this.void);
      } else if (var5 == 1) {
         var1.for(var2 + 1, var3, var4, this.void);
      } else if (var5 == 0) {
         var1.for(var2, var3, var4 - 1, this.void);
      } else if (var5 == 2) {
         var1.for(var2, var3, var4 + 1, this.void);
      }

   }

   private boolean long(y6 var1, int var2, int var3, int var4) {
      if (!this.case(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.o(var2, var3, var4);
         return false;
      } else {
         return true;
      }
   }

   public void int(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4) & 3;
      float var6 = 0.1875F;
      if (var5 == 3) {
         this.a(0.0F, 0.2F, 0.5F - var6, var6 * 2.0F, 0.8F, 0.5F + var6);
      } else if (var5 == 1) {
         this.a(1.0F - var6 * 2.0F, 0.2F, 0.5F - var6, 1.0F, 0.8F, 0.5F + var6);
      } else if (var5 == 0) {
         this.a(0.5F - var6, 0.2F, 0.0F, 0.5F + var6, 0.8F, var6 * 2.0F);
      } else if (var5 == 2) {
         this.a(0.5F - var6, 0.2F, 1.0F - var6 * 2.0F, 0.5F + var6, 0.8F, 1.0F);
      }

   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = (var6 & 4) == 4;
      boolean var8 = (var6 & 8) == 8;
      if (var7 || var8) {
         this.a(var1, var2, var3, var4, 0, var6, false, -1, 0);
      }

      if (var8) {
         var1.for(var2, var3, var4, this.void);
         int var9 = var6 & 3;
         if (var9 == 3) {
            var1.for(var2 - 1, var3, var4, this.void);
         } else if (var9 == 1) {
            var1.for(var2 + 1, var3, var4, this.void);
         } else if (var9 == 0) {
            var1.for(var2, var3, var4 - 1, this.void);
         } else if (var9 == 2) {
            var1.for(var2, var3, var4 + 1, this.void);
         }
      }

      super.do(var1, var2, var3, var4, var5, var6);
   }

   public int do(yy var1, int var2, int var3, int var4, int var5) {
      return (var1.for(var2, var3, var4) & 8) == 8 ? 15 : 0;
   }

   public int for(yy var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.for(var2, var3, var4);
      if ((var6 & 8) != 8) {
         return 0;
      } else {
         int var7 = var6 & 3;
         if (var7 == 2 && var5 == 2) {
            return 15;
         } else if (var7 == 0 && var5 == 3) {
            return 15;
         } else if (var7 == 1 && var5 == 4) {
            return 15;
         } else {
            return var7 == 3 && var5 == 5 ? 15 : 0;
         }
      }
   }

   public boolean int() {
      return true;
   }
}
