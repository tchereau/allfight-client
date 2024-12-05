import java.util.Random;

public class wu extends w2 {
   private int e;

   public wu(int var1) {
      this.e = var1;
   }

   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      var3 -= 8;

      for(var5 -= 8; var4 > 5 && var1.a(var3, var4, var5); --var4) {
      }

      if (var4 <= 4) {
         return false;
      } else {
         var4 -= 4;
         boolean[] var6 = new boolean[2048];
         int var7 = var2.nextInt(4) + 4;

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            double var9 = var2.nextDouble() * 6.0D + 3.0D;
            double var11 = var2.nextDouble() * 4.0D + 2.0D;
            double var13 = var2.nextDouble() * 6.0D + 3.0D;
            double var15 = var2.nextDouble() * (16.0D - var9 - 2.0D) + 1.0D + var9 / 2.0D;
            double var17 = var2.nextDouble() * (8.0D - var11 - 4.0D) + 2.0D + var11 / 2.0D;
            double var19 = var2.nextDouble() * (16.0D - var13 - 2.0D) + 1.0D + var13 / 2.0D;

            for(int var21 = 1; var21 < 15; ++var21) {
               for(int var22 = 1; var22 < 15; ++var22) {
                  for(int var23 = 1; var23 < 7; ++var23) {
                     double var24 = ((double)var21 - var15) / (var9 / 2.0D);
                     double var26 = ((double)var23 - var17) / (var11 / 2.0D);
                     double var28 = ((double)var22 - var19) / (var13 / 2.0D);
                     double var30 = var24 * var24 + var26 * var26 + var28 * var28;
                     if (var30 < 1.0D) {
                        var6[(var21 * 16 + var22) * 8 + var23] = true;
                     }
                  }
               }
            }
         }

         int var10;
         int var32;
         boolean var33;
         for(var8 = 0; var8 < 16; ++var8) {
            for(var32 = 0; var32 < 16; ++var32) {
               for(var10 = 0; var10 < 8; ++var10) {
                  var33 = !var6[(var8 * 16 + var32) * 8 + var10] && (var8 < 15 && var6[((var8 + 1) * 16 + var32) * 8 + var10] || var8 > 0 && var6[((var8 - 1) * 16 + var32) * 8 + var10] || var32 < 15 && var6[(var8 * 16 + var32 + 1) * 8 + var10] || var32 > 0 && var6[(var8 * 16 + (var32 - 1)) * 8 + var10] || var10 < 7 && var6[(var8 * 16 + var32) * 8 + var10 + 1] || var10 > 0 && var6[(var8 * 16 + var32) * 8 + (var10 - 1)]);
                  if (var33) {
                     ts var12 = var1.byte(var3 + var8, var4 + var10, var5 + var32);
                     if (var10 >= 4 && var12.case()) {
                        return false;
                     }

                     if (var10 < 4 && !var12.for() && var1.new(var3 + var8, var4 + var10, var5 + var32) != this.e) {
                        return false;
                     }
                  }
               }
            }
         }

         for(var8 = 0; var8 < 16; ++var8) {
            for(var32 = 0; var32 < 16; ++var32) {
               for(var10 = 0; var10 < 8; ++var10) {
                  if (var6[(var8 * 16 + var32) * 8 + var10]) {
                     var1.int(var3 + var8, var4 + var10, var5 + var32, var10 >= 4 ? 0 : this.e, 0, 2);
                  }
               }
            }
         }

         for(var8 = 0; var8 < 16; ++var8) {
            for(var32 = 0; var32 < 16; ++var32) {
               for(var10 = 4; var10 < 8; ++var10) {
                  if (var6[(var8 * 16 + var32) * 8 + var10] && var1.new(var3 + var8, var4 + var10 - 1, var5 + var32) == pa.g.void && var1.for(yw.if, var3 + var8, var4 + var10, var5 + var32) > 0) {
                     yn var34 = var1.a(var3 + var8, var5 + var32);
                     if (var34.g == pa.b2.void) {
                        var1.int(var3 + var8, var4 + var10 - 1, var5 + var32, pa.b2.void, 0, 2);
                     } else {
                        var1.int(var3 + var8, var4 + var10 - 1, var5 + var32, pa.i.void, 0, 2);
                     }
                  }
               }
            }
         }

         if (pa.x[this.e].at == ts.r) {
            for(var8 = 0; var8 < 16; ++var8) {
               for(var32 = 0; var32 < 16; ++var32) {
                  for(var10 = 0; var10 < 8; ++var10) {
                     var33 = !var6[(var8 * 16 + var32) * 8 + var10] && (var8 < 15 && var6[((var8 + 1) * 16 + var32) * 8 + var10] || var8 > 0 && var6[((var8 - 1) * 16 + var32) * 8 + var10] || var32 < 15 && var6[(var8 * 16 + var32 + 1) * 8 + var10] || var32 > 0 && var6[(var8 * 16 + (var32 - 1)) * 8 + var10] || var10 < 7 && var6[(var8 * 16 + var32) * 8 + var10 + 1] || var10 > 0 && var6[(var8 * 16 + var32) * 8 + (var10 - 1)]);
                     if (var33 && (var10 < 4 || var2.nextInt(2) != 0) && var1.byte(var3 + var8, var4 + var10, var5 + var32).for()) {
                        var1.int(var3 + var8, var4 + var10, var5 + var32, pa.k.void, 0, 2);
                     }
                  }
               }
            }
         }

         if (pa.x[this.e].at == ts.s) {
            for(var8 = 0; var8 < 16; ++var8) {
               for(var32 = 0; var32 < 16; ++var32) {
                  byte var35 = 4;
                  if (var1.else(var3 + var8, var4 + var35, var5 + var32)) {
                     var1.int(var3 + var8, var4 + var35, var5 + var32, pa.b9.void, 0, 2);
                  }
               }
            }
         }

         return true;
      }
   }
}
