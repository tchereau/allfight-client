import java.util.Random;

public class wi extends w2 {
   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      int var6;
      for(var6 = var2.nextInt(4) + 5; var1.byte(var3, var4 - 1, var5) == ts.s; --var4) {
      }

      boolean var7 = true;
      if (var4 >= 1 && var4 + var6 + 1 <= 128) {
         int var8;
         int var10;
         int var11;
         int var12;
         for(var8 = var4; var8 <= var4 + 1 + var6; ++var8) {
            byte var9 = 1;
            if (var8 == var4) {
               var9 = 0;
            }

            if (var8 >= var4 + 1 + var6 - 2) {
               var9 = 3;
            }

            for(var10 = var3 - var9; var10 <= var3 + var9 && var7; ++var10) {
               for(var11 = var5 - var9; var11 <= var5 + var9 && var7; ++var11) {
                  if (var8 >= 0 && var8 < 128) {
                     var12 = var1.new(var10, var8, var11);
                     if (var12 != 0 && var12 != pa.aJ.void) {
                        if (var12 != pa.ba.void && var12 != pa.bb.void) {
                           var7 = false;
                        } else if (var8 > var4) {
                           var7 = false;
                        }
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
            if ((var8 == pa.i.void || var8 == pa.g.void) && var4 < 128 - var6 - 1) {
               this.a(var1, var3, var4 - 1, var5, pa.g.void);

               int var13;
               int var16;
               for(var16 = var4 - 3 + var6; var16 <= var4 + var6; ++var16) {
                  var10 = var16 - (var4 + var6);
                  var11 = 2 - var10 / 2;

                  for(var12 = var3 - var11; var12 <= var3 + var11; ++var12) {
                     var13 = var12 - var3;

                     for(int var14 = var5 - var11; var14 <= var5 + var11; ++var14) {
                        int var15 = var14 - var5;
                        if ((Math.abs(var13) != var11 || Math.abs(var15) != var11 || var2.nextInt(2) != 0 && var10 != 0) && !pa.v[var1.new(var12, var16, var14)]) {
                           this.a(var1, var12, var16, var14, pa.aJ.void);
                        }
                     }
                  }
               }

               for(var16 = 0; var16 < var6; ++var16) {
                  var10 = var1.new(var3, var4 + var16, var5);
                  if (var10 == 0 || var10 == pa.aJ.void || var10 == pa.bb.void || var10 == pa.ba.void) {
                     this.a(var1, var3, var4 + var16, var5, pa.aM.void);
                  }
               }

               for(var16 = var4 - 3 + var6; var16 <= var4 + var6; ++var16) {
                  var10 = var16 - (var4 + var6);
                  var11 = 2 - var10 / 2;

                  for(var12 = var3 - var11; var12 <= var3 + var11; ++var12) {
                     for(var13 = var5 - var11; var13 <= var5 + var11; ++var13) {
                        if (var1.new(var12, var16, var13) == pa.aJ.void) {
                           if (var2.nextInt(4) == 0 && var1.new(var12 - 1, var16, var13) == 0) {
                              this.do(var1, var12 - 1, var16, var13, 8);
                           }

                           if (var2.nextInt(4) == 0 && var1.new(var12 + 1, var16, var13) == 0) {
                              this.do(var1, var12 + 1, var16, var13, 2);
                           }

                           if (var2.nextInt(4) == 0 && var1.new(var12, var16, var13 - 1) == 0) {
                              this.do(var1, var12, var16, var13 - 1, 1);
                           }

                           if (var2.nextInt(4) == 0 && var1.new(var12, var16, var13 + 1) == 0) {
                              this.do(var1, var12, var16, var13 + 1, 4);
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

   private void do(y6 var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, pa.Z.void, var5);
      int var6 = 4;

      while(true) {
         --var3;
         if (var1.new(var2, var3, var4) != 0 || var6 <= 0) {
            return;
         }

         this.a(var1, var2, var3, var4, pa.Z.void, var5);
         --var6;
      }
   }
}
