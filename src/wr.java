import java.util.Random;

public class wr extends w2 {
   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      byte var6 = 3;
      int var7 = var2.nextInt(2) + 2;
      int var8 = var2.nextInt(2) + 2;
      int var9 = 0;

      int var10;
      int var11;
      int var12;
      for(var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; ++var10) {
         for(var11 = var4 - 1; var11 <= var4 + var6 + 1; ++var11) {
            for(var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; ++var12) {
               ts var13 = var1.byte(var10, var11, var12);
               if (var11 == var4 - 1 && !var13.for()) {
                  return false;
               }

               if (var11 == var4 + var6 + 1 && !var13.for()) {
                  return false;
               }

               if ((var10 == var3 - var7 - 1 || var10 == var3 + var7 + 1 || var12 == var5 - var8 - 1 || var12 == var5 + var8 + 1) && var11 == var4 && var1.a(var10, var11, var12) && var1.a(var10, var11 + 1, var12)) {
                  ++var9;
               }
            }
         }
      }

      if (var9 >= 1 && var9 <= 5) {
         for(var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; ++var10) {
            for(var11 = var4 + var6; var11 >= var4 - 1; --var11) {
               for(var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; ++var12) {
                  if (var10 != var3 - var7 - 1 && var11 != var4 - 1 && var12 != var5 - var8 - 1 && var10 != var3 + var7 + 1 && var11 != var4 + var6 + 1 && var12 != var5 + var8 + 1) {
                     var1.o(var10, var11, var12);
                  } else if (var11 >= 0 && !var1.byte(var10, var11 - 1, var12).for()) {
                     var1.o(var10, var11, var12);
                  } else if (var1.byte(var10, var11, var12).for()) {
                     if (var11 == var4 - 1 && var2.nextInt(4) != 0) {
                        var1.int(var10, var11, var12, pa.bv.void, 0, 2);
                     } else {
                        var1.int(var10, var11, var12, pa.bf.void, 0, 2);
                     }
                  }
               }
            }
         }

         label118:
         for(var10 = 0; var10 < 2; ++var10) {
            for(var11 = 0; var11 < 3; ++var11) {
               var12 = var3 + var2.nextInt(var7 * 2 + 1) - var7;
               int var14 = var5 + var2.nextInt(var8 * 2 + 1) - var8;
               if (var1.a(var12, var4, var14)) {
                  int var15 = 0;
                  if (var1.byte(var12 - 1, var4, var14).for()) {
                     ++var15;
                  }

                  if (var1.byte(var12 + 1, var4, var14).for()) {
                     ++var15;
                  }

                  if (var1.byte(var12, var4, var14 - 1).for()) {
                     ++var15;
                  }

                  if (var1.byte(var12, var4, var14 + 1).for()) {
                     ++var15;
                  }

                  if (var15 == 1) {
                     var1.int(var12, var4, var14, pa.bi.void, 0, 2);
                     om var16 = (om)var1.if(var12, var4, var14);
                     if (var16 == null) {
                        break;
                     }

                     int var17 = 0;

                     while(true) {
                        if (var17 >= 8) {
                           continue label118;
                        }

                        abp var18 = this.a(var2);
                        if (var18 != null) {
                           var16.if(var2.nextInt(var16.r()), var18);
                        }

                        ++var17;
                     }
                  }
               }
            }
         }

         var1.int(var3, var4, var5, pa.bm.void, 0, 2);
         oa var19 = (oa)var1.if(var3, var4, var5);
         if (var19 != null) {
            var19.o().a(this.if(var2));
         } else {
            System.err.println("Failed to fetch mob spawner entity at (" + var3 + ", " + var4 + ", " + var5 + ")");
         }

         return true;
      } else {
         return false;
      }
   }

   private abp a(Random var1) {
      int var2 = var1.nextInt(12);
      if (var2 == 0) {
         return new abp(abr.cx);
      } else if (var2 == 1) {
         return new abp(abr.N, var1.nextInt(4) + 1);
      } else if (var2 == 2) {
         return new abp(abr.aC);
      } else if (var2 == 3) {
         return new abp(abr.aE, var1.nextInt(4) + 1);
      } else if (var2 == 4) {
         return new abp(abr.aS, var1.nextInt(4) + 1);
      } else if (var2 == 5) {
         return new abp(abr.aW, var1.nextInt(4) + 1);
      } else if (var2 == 6) {
         return new abp(abr.bi);
      } else if (var2 == 7 && var1.nextInt(100) == 0) {
         return new abp(abr.bo);
      } else if (var2 == 8 && var1.nextInt(2) == 0) {
         return new abp(abr.cv, var1.nextInt(4) + 1);
      } else if (var2 == 9 && var1.nextInt(10) == 0) {
         return new abp(abr.ai[abr.ab.A + var1.nextInt(2)]);
      } else if (var2 == 10) {
         return new abp(abr.b9, 1, 3);
      } else {
         return var2 == 11 ? abr.bj.a(var1) : null;
      }
   }

   private String if(Random var1) {
      int var2 = var1.nextInt(4);
      if (var2 == 0) {
         return "Skeleton";
      } else if (var2 == 1) {
         return "Zombie";
      } else if (var2 == 2) {
         return "Zombie";
      } else {
         return var2 == 3 ? "Spider" : "";
      }
   }
}
