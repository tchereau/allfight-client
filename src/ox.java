import java.util.Random;

public class ox extends pa {
   public ox(int var1) {
      super(var1, ts.o);
      this.a(true);
      this.a(acn.c);
   }

   public void try() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public int new() {
      return 20;
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public void int(yy var1, int var2, int var3, int var4) {
      int var6 = var1.for(var2, var3, var4);
      float var7 = 1.0F;
      float var8 = 1.0F;
      float var9 = 1.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      boolean var13 = var6 > 0;
      if ((var6 & 2) != 0) {
         var10 = Math.max(var10, 0.0625F);
         var7 = 0.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var9 = 0.0F;
         var12 = 1.0F;
         var13 = true;
      }

      if ((var6 & 8) != 0) {
         var7 = Math.min(var7, 0.9375F);
         var10 = 1.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var9 = 0.0F;
         var12 = 1.0F;
         var13 = true;
      }

      if ((var6 & 4) != 0) {
         var12 = Math.max(var12, 0.0625F);
         var9 = 0.0F;
         var7 = 0.0F;
         var10 = 1.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var13 = true;
      }

      if ((var6 & 1) != 0) {
         var9 = Math.min(var9, 0.9375F);
         var12 = 1.0F;
         var7 = 0.0F;
         var10 = 1.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var13 = true;
      }

      if (!var13 && this.else(var1.new(var2, var3 + 1, var4))) {
         var8 = Math.min(var8, 0.9375F);
         var11 = 1.0F;
         var7 = 0.0F;
         var10 = 1.0F;
         var9 = 0.0F;
         var12 = 1.0F;
      }

      this.a(var7, var8, var9, var10, var11, var12);
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean for(y6 var1, int var2, int var3, int var4, int var5) {
      switch(var5) {
      case 1:
         return this.else(var1.new(var2, var3 + 1, var4));
      case 2:
         return this.else(var1.new(var2, var3, var4 + 1));
      case 3:
         return this.else(var1.new(var2, var3, var4 - 1));
      case 4:
         return this.else(var1.new(var2 + 1, var3, var4));
      case 5:
         return this.else(var1.new(var2 - 1, var3, var4));
      default:
         return false;
      }
   }

   private boolean else(int var1) {
      if (var1 == 0) {
         return false;
      } else {
         pa var2 = pa.x[var1];
         return var2.if() && var2.at.void();
      }
   }

   private boolean else(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      int var6 = var5;
      if (var5 > 0) {
         for(int var7 = 0; var7 <= 3; ++var7) {
            int var8 = 1 << var7;
            if ((var5 & var8) != 0 && !this.else(var1.new(var2 + apk.case[var7], var3, var4 + apk.byte[var7])) && (var1.new(var2, var3 + 1, var4) != this.void || (var1.for(var2, var3 + 1, var4) & var8) == 0)) {
               var6 &= ~var8;
            }
         }
      }

      if (var6 == 0 && !this.else(var1.new(var2, var3 + 1, var4))) {
         return false;
      } else {
         if (var6 != var5) {
            var1.do(var2, var3, var4, var6, 2);
         }

         return true;
      }
   }

   public int c() {
      return zf.a();
   }

   public int a(int var1) {
      return zf.a();
   }

   public int do(yy var1, int var2, int var3, int var4) {
      return var1.a(var2, var4).case();
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!var1.goto && !this.else(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.o(var2, var3, var4);
      }

   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (!var1.goto && var1.o.nextInt(4) == 0) {
         byte var6 = 4;
         int var7 = 5;
         boolean var8 = false;

         int var9;
         int var10;
         int var11;
         label141:
         for(var9 = var2 - var6; var9 <= var2 + var6; ++var9) {
            for(var10 = var4 - var6; var10 <= var4 + var6; ++var10) {
               for(var11 = var3 - 1; var11 <= var3 + 1; ++var11) {
                  if (var1.new(var9, var11, var10) == this.void) {
                     --var7;
                     if (var7 <= 0) {
                        var8 = true;
                        break label141;
                     }
                  }
               }
            }
         }

         var9 = var1.for(var2, var3, var4);
         var10 = var1.o.nextInt(6);
         var11 = apk.int[var10];
         int var12;
         int var13;
         if (var10 == 1 && var3 < 255 && var1.a(var2, var3 + 1, var4)) {
            if (var8) {
               return;
            }

            var12 = var1.o.nextInt(16) & var9;
            if (var12 > 0) {
               for(var13 = 0; var13 <= 3; ++var13) {
                  if (!this.else(var1.new(var2 + apk.case[var13], var3 + 1, var4 + apk.byte[var13]))) {
                     var12 &= ~(1 << var13);
                  }
               }

               if (var12 > 0) {
                  var1.int(var2, var3 + 1, var4, this.void, var12, 2);
               }
            }
         } else {
            int var14;
            if (var10 >= 2 && var10 <= 5 && (var9 & 1 << var11) == 0) {
               if (var8) {
                  return;
               }

               var12 = var1.new(var2 + apk.case[var11], var3, var4 + apk.byte[var11]);
               if (var12 != 0 && pa.x[var12] != null) {
                  if (pa.x[var12].at.goto() && pa.x[var12].if()) {
                     var1.do(var2, var3, var4, var9 | 1 << var11, 2);
                  }
               } else {
                  var13 = var11 + 1 & 3;
                  var14 = var11 + 3 & 3;
                  if ((var9 & 1 << var13) != 0 && this.else(var1.new(var2 + apk.case[var11] + apk.case[var13], var3, var4 + apk.byte[var11] + apk.byte[var13]))) {
                     var1.int(var2 + apk.case[var11], var3, var4 + apk.byte[var11], this.void, 1 << var13, 2);
                  } else if ((var9 & 1 << var14) != 0 && this.else(var1.new(var2 + apk.case[var11] + apk.case[var14], var3, var4 + apk.byte[var11] + apk.byte[var14]))) {
                     var1.int(var2 + apk.case[var11], var3, var4 + apk.byte[var11], this.void, 1 << var14, 2);
                  } else if ((var9 & 1 << var13) != 0 && var1.a(var2 + apk.case[var11] + apk.case[var13], var3, var4 + apk.byte[var11] + apk.byte[var13]) && this.else(var1.new(var2 + apk.case[var13], var3, var4 + apk.byte[var13]))) {
                     var1.int(var2 + apk.case[var11] + apk.case[var13], var3, var4 + apk.byte[var11] + apk.byte[var13], this.void, 1 << (var11 + 2 & 3), 2);
                  } else if ((var9 & 1 << var14) != 0 && var1.a(var2 + apk.case[var11] + apk.case[var14], var3, var4 + apk.byte[var11] + apk.byte[var14]) && this.else(var1.new(var2 + apk.case[var14], var3, var4 + apk.byte[var14]))) {
                     var1.int(var2 + apk.case[var11] + apk.case[var14], var3, var4 + apk.byte[var11] + apk.byte[var14], this.void, 1 << (var11 + 2 & 3), 2);
                  } else if (this.else(var1.new(var2 + apk.case[var11], var3 + 1, var4 + apk.byte[var11]))) {
                     var1.int(var2 + apk.case[var11], var3, var4 + apk.byte[var11], this.void, 0, 2);
                  }
               }
            } else if (var3 > 1) {
               var12 = var1.new(var2, var3 - 1, var4);
               if (var12 == 0) {
                  var13 = var1.o.nextInt(16) & var9;
                  if (var13 > 0) {
                     var1.int(var2, var3 - 1, var4, this.void, var13, 2);
                  }
               } else if (var12 == this.void) {
                  var13 = var1.o.nextInt(16) & var9;
                  var14 = var1.for(var2, var3 - 1, var4);
                  if (var14 != (var14 | var13)) {
                     var1.do(var2, var3 - 1, var4, var14 | var13, 2);
                  }
               }
            }
         }
      }

   }

   public int a(y6 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      byte var10 = 0;
      switch(var5) {
      case 2:
         var10 = 1;
         break;
      case 3:
         var10 = 4;
         break;
      case 4:
         var10 = 8;
         break;
      case 5:
         var10 = 2;
      }

      return var10 != 0 ? var10 : var9;
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(y6 var1, aek var2, int var3, int var4, int var5, int var6) {
      if (!var1.goto && var2.cD() != null && var2.cD().new == abr.aX.A) {
         var2.a((akf)aka.void[this.void], 1);
         this.a(var1, var3, var4, var5, new abp(pa.Z, 1, 0));
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }
}
