import java.util.Random;

public class ws extends w2 {
   private final int c;
   private final int b;
   private final int d;

   public ws(boolean var1, int var2, int var3, int var4) {
      super(var1);
      this.c = var2;
      this.b = var3;
      this.d = var4;
   }

   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      int var6 = var2.nextInt(3) + this.c;
      boolean var7 = true;
      if (var4 >= 1 && var4 + var6 + 1 <= 256) {
         int var8;
         int var10;
         int var11;
         int var12;
         for(var8 = var4; var8 <= var4 + 1 + var6; ++var8) {
            byte var9 = 2;
            if (var8 == var4) {
               var9 = 1;
            }

            if (var8 >= var4 + 1 + var6 - 2) {
               var9 = 2;
            }

            for(var10 = var3 - var9; var10 <= var3 + var9 && var7; ++var10) {
               for(var11 = var5 - var9; var11 <= var5 + var9 && var7; ++var11) {
                  if (var8 >= 0 && var8 < 256) {
                     var12 = var1.new(var10, var8, var11);
                     if (var12 != 0 && var12 != pa.aJ.void && var12 != pa.i.void && var12 != pa.g.void && var12 != pa.aM.void && var12 != pa.bd.void) {
                        var7 = false;
                     }
                  } else {
                     var7 = false;
                  }
               }
            }
         }

         if (!var7) {
            return false;
         } else {
            var8 = var1.new(var3, var4 - 1, var5);
            if ((var8 == pa.i.void || var8 == pa.g.void) && var4 < 256 - var6 - 1) {
               var1.int(var3, var4 - 1, var5, pa.g.void, 0, 2);
               var1.int(var3 + 1, var4 - 1, var5, pa.g.void, 0, 2);
               var1.int(var3, var4 - 1, var5 + 1, pa.g.void, 0, 2);
               var1.int(var3 + 1, var4 - 1, var5 + 1, pa.g.void, 0, 2);
               this.a(var1, var3, var5, var4 + var6, 2, var2);

               for(int var14 = var4 + var6 - 2 - var2.nextInt(4); var14 > var4 + var6 / 2; var14 -= 2 + var2.nextInt(4)) {
                  float var15 = var2.nextFloat() * 3.1415927F * 2.0F;
                  var11 = var3 + (int)(0.5F + ajs.for(var15) * 4.0F);
                  var12 = var5 + (int)(0.5F + ajs.try(var15) * 4.0F);
                  this.a(var1, var11, var12, var14, 0, var2);

                  for(int var13 = 0; var13 < 5; ++var13) {
                     var11 = var3 + (int)(1.5F + ajs.for(var15) * (float)var13);
                     var12 = var5 + (int)(1.5F + ajs.try(var15) * (float)var13);
                     this.a(var1, var11, var14 - 3 + var13 / 2, var12, pa.aM.void, this.b);
                  }
               }

               for(var10 = 0; var10 < var6; ++var10) {
                  var11 = var1.new(var3, var4 + var10, var5);
                  if (var11 == 0 || var11 == pa.aJ.void) {
                     this.a(var1, var3, var4 + var10, var5, pa.aM.void, this.b);
                     if (var10 > 0) {
                        if (var2.nextInt(3) > 0 && var1.a(var3 - 1, var4 + var10, var5)) {
                           this.a(var1, var3 - 1, var4 + var10, var5, pa.Z.void, 8);
                        }

                        if (var2.nextInt(3) > 0 && var1.a(var3, var4 + var10, var5 - 1)) {
                           this.a(var1, var3, var4 + var10, var5 - 1, pa.Z.void, 1);
                        }
                     }
                  }

                  if (var10 < var6 - 1) {
                     var11 = var1.new(var3 + 1, var4 + var10, var5);
                     if (var11 == 0 || var11 == pa.aJ.void) {
                        this.a(var1, var3 + 1, var4 + var10, var5, pa.aM.void, this.b);
                        if (var10 > 0) {
                           if (var2.nextInt(3) > 0 && var1.a(var3 + 2, var4 + var10, var5)) {
                              this.a(var1, var3 + 2, var4 + var10, var5, pa.Z.void, 2);
                           }

                           if (var2.nextInt(3) > 0 && var1.a(var3 + 1, var4 + var10, var5 - 1)) {
                              this.a(var1, var3 + 1, var4 + var10, var5 - 1, pa.Z.void, 1);
                           }
                        }
                     }

                     var11 = var1.new(var3 + 1, var4 + var10, var5 + 1);
                     if (var11 == 0 || var11 == pa.aJ.void) {
                        this.a(var1, var3 + 1, var4 + var10, var5 + 1, pa.aM.void, this.b);
                        if (var10 > 0) {
                           if (var2.nextInt(3) > 0 && var1.a(var3 + 2, var4 + var10, var5 + 1)) {
                              this.a(var1, var3 + 2, var4 + var10, var5 + 1, pa.Z.void, 2);
                           }

                           if (var2.nextInt(3) > 0 && var1.a(var3 + 1, var4 + var10, var5 + 2)) {
                              this.a(var1, var3 + 1, var4 + var10, var5 + 2, pa.Z.void, 4);
                           }
                        }
                     }

                     var11 = var1.new(var3, var4 + var10, var5 + 1);
                     if (var11 == 0 || var11 == pa.aJ.void) {
                        this.a(var1, var3, var4 + var10, var5 + 1, pa.aM.void, this.b);
                        if (var10 > 0) {
                           if (var2.nextInt(3) > 0 && var1.a(var3 - 1, var4 + var10, var5 + 1)) {
                              this.a(var1, var3 - 1, var4 + var10, var5 + 1, pa.Z.void, 8);
                           }

                           if (var2.nextInt(3) > 0 && var1.a(var3, var4 + var10, var5 + 2)) {
                              this.a(var1, var3, var4 + var10, var5 + 2, pa.Z.void, 4);
                           }
                        }
                     }
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private void a(y6 var1, int var2, int var3, int var4, int var5, Random var6) {
      byte var7 = 2;

      for(int var8 = var4 - var7; var8 <= var4; ++var8) {
         int var9 = var8 - var4;
         int var10 = var5 + 1 - var9;

         for(int var11 = var2 - var10; var11 <= var2 + var10 + 1; ++var11) {
            int var12 = var11 - var2;

            for(int var13 = var3 - var10; var13 <= var3 + var10 + 1; ++var13) {
               int var14 = var13 - var3;
               if ((var12 >= 0 || var14 >= 0 || var12 * var12 + var14 * var14 <= var10 * var10) && (var12 <= 0 && var14 <= 0 || var12 * var12 + var14 * var14 <= (var10 + 1) * (var10 + 1)) && (var6.nextInt(4) != 0 || var12 * var12 + var14 * var14 <= (var10 - 1) * (var10 - 1))) {
                  int var15 = var1.new(var11, var8, var13);
                  if (var15 == 0 || var15 == pa.aJ.void) {
                     this.a(var1, var11, var8, var13, pa.aJ.void, this.d);
                  }
               }
            }
         }
      }

   }
}
