import java.util.Random;

public class xc extends xd {
   protected void a(long var1, int var3, int var4, byte[] var5, double var6, double var8, double var10) {
      this.a(var1, var3, var4, var5, var6, var8, var10, 1.0F + this.a.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5D);
   }

   protected void a(long var1, int var3, int var4, byte[] var5, double var6, double var8, double var10, float var12, float var13, float var14, int var15, int var16, double var17) {
      double var19 = (double)(var3 * 16 + 8);
      double var21 = (double)(var4 * 16 + 8);
      float var23 = 0.0F;
      float var24 = 0.0F;
      Random var25 = new Random(var1);
      if (var16 <= 0) {
         int var26 = this.if * 16 - 16;
         var16 = var26 - var25.nextInt(var26 / 4);
      }

      boolean var53 = false;
      if (var15 == -1) {
         var15 = var16 / 2;
         var53 = true;
      }

      int var27 = var25.nextInt(var16 / 2) + var16 / 4;

      for(boolean var28 = var25.nextInt(6) == 0; var15 < var16; ++var15) {
         double var29 = 1.5D + (double)(ajs.try((float)var15 * 3.1415927F / (float)var16) * var12 * 1.0F);
         double var31 = var29 * var17;
         float var33 = ajs.for(var14);
         float var34 = ajs.try(var14);
         var6 += (double)(ajs.for(var13) * var33);
         var8 += (double)var34;
         var10 += (double)(ajs.try(var13) * var33);
         if (var28) {
            var14 *= 0.92F;
         } else {
            var14 *= 0.7F;
         }

         var14 += var24 * 0.1F;
         var13 += var23 * 0.1F;
         var24 *= 0.9F;
         var23 *= 0.75F;
         var24 += (var25.nextFloat() - var25.nextFloat()) * var25.nextFloat() * 2.0F;
         var23 += (var25.nextFloat() - var25.nextFloat()) * var25.nextFloat() * 4.0F;
         if (!var53 && var15 == var27 && var12 > 1.0F) {
            this.a(var25.nextLong(), var3, var4, var5, var6, var8, var10, var25.nextFloat() * 0.5F + 0.5F, var13 - 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
            this.a(var25.nextLong(), var3, var4, var5, var6, var8, var10, var25.nextFloat() * 0.5F + 0.5F, var13 + 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
            return;
         }

         if (var53 || var25.nextInt(4) != 0) {
            double var35 = var6 - var19;
            double var37 = var10 - var21;
            double var39 = (double)(var16 - var15);
            double var41 = (double)(var12 + 2.0F + 16.0F);
            if (var35 * var35 + var37 * var37 - var39 * var39 > var41 * var41) {
               return;
            }

            if (!(var6 < var19 - 16.0D - var29 * 2.0D) && !(var10 < var21 - 16.0D - var29 * 2.0D) && !(var6 > var19 + 16.0D + var29 * 2.0D) && !(var10 > var21 + 16.0D + var29 * 2.0D)) {
               int var54 = ajs.a(var6 - var29) - var3 * 16 - 1;
               int var36 = ajs.a(var6 + var29) - var3 * 16 + 1;
               int var55 = ajs.a(var8 - var31) - 1;
               int var38 = ajs.a(var8 + var31) + 1;
               int var56 = ajs.a(var10 - var29) - var4 * 16 - 1;
               int var40 = ajs.a(var10 + var29) - var4 * 16 + 1;
               if (var54 < 0) {
                  var54 = 0;
               }

               if (var36 > 16) {
                  var36 = 16;
               }

               if (var55 < 1) {
                  var55 = 1;
               }

               if (var38 > 120) {
                  var38 = 120;
               }

               if (var56 < 0) {
                  var56 = 0;
               }

               if (var40 > 16) {
                  var40 = 16;
               }

               boolean var57 = false;

               int var42;
               int var45;
               for(var42 = var54; !var57 && var42 < var36; ++var42) {
                  for(int var43 = var56; !var57 && var43 < var40; ++var43) {
                     for(int var44 = var38 + 1; !var57 && var44 >= var55 - 1; --var44) {
                        var45 = (var42 * 16 + var43) * 128 + var44;
                        if (var44 >= 0 && var44 < 128) {
                           if (var5[var45] == pa.a7.void || var5[var45] == pa.a4.void) {
                              var57 = true;
                           }

                           if (var44 != var55 - 1 && var42 != var54 && var42 != var36 - 1 && var43 != var56 && var43 != var40 - 1) {
                              var44 = var55;
                           }
                        }
                     }
                  }
               }

               if (!var57) {
                  for(var42 = var54; var42 < var36; ++var42) {
                     double var58 = ((double)(var42 + var3 * 16) + 0.5D - var6) / var29;

                     for(var45 = var56; var45 < var40; ++var45) {
                        double var46 = ((double)(var45 + var4 * 16) + 0.5D - var10) / var29;
                        int var48 = (var42 * 16 + var45) * 128 + var38;

                        for(int var49 = var38 - 1; var49 >= var55; --var49) {
                           double var50 = ((double)var49 + 0.5D - var8) / var31;
                           if (var50 > -0.7D && var58 * var58 + var50 * var50 + var46 * var46 < 1.0D) {
                              byte var52 = var5[var48];
                              if (var52 == pa.aT.void || var52 == pa.g.void || var52 == pa.i.void) {
                                 var5[var48] = 0;
                              }
                           }

                           --var48;
                        }
                     }
                  }

                  if (var53) {
                     break;
                  }
               }
            }
         }
      }

   }

   protected void a(y6 var1, int var2, int var3, int var4, int var5, byte[] var6) {
      int var7 = this.a.nextInt(this.a.nextInt(this.a.nextInt(10) + 1) + 1);
      if (this.a.nextInt(5) != 0) {
         var7 = 0;
      }

      for(int var8 = 0; var8 < var7; ++var8) {
         double var9 = (double)(var2 * 16 + this.a.nextInt(16));
         double var11 = (double)this.a.nextInt(128);
         double var13 = (double)(var3 * 16 + this.a.nextInt(16));
         int var15 = 1;
         if (this.a.nextInt(4) == 0) {
            this.a(this.a.nextLong(), var4, var5, var6, var9, var11, var13);
            var15 += this.a.nextInt(4);
         }

         for(int var16 = 0; var16 < var15; ++var16) {
            float var17 = this.a.nextFloat() * 3.1415927F * 2.0F;
            float var18 = (this.a.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var19 = this.a.nextFloat() * 2.0F + this.a.nextFloat();
            this.a(this.a.nextLong(), var4, var5, var6, var9, var11, var13, var19 * 2.0F, var17, var18, 0, 0, 0.5D);
         }
      }

   }
}
