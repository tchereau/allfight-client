import java.util.Random;

public class wg extends w2 {
   private final int do;
   private final boolean if;
   private final int int;
   private final int for;

   public wg(boolean var1) {
      this(var1, 4, 0, 0, false);
   }

   public wg(boolean var1, int var2, int var3, int var4, boolean var5) {
      super(var1);
      this.do = var2;
      this.int = var3;
      this.for = var4;
      this.if = var5;
   }

   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      int var6 = var2.nextInt(3) + this.do;
      boolean var7 = true;
      if (var4 >= 1 && var4 + var6 + 1 <= 256) {
         int var8;
         byte var9;
         int var11;
         int var12;
         for(var8 = var4; var8 <= var4 + 1 + var6; ++var8) {
            var9 = 1;
            if (var8 == var4) {
               var9 = 0;
            }

            if (var8 >= var4 + 1 + var6 - 2) {
               var9 = 2;
            }

            for(int var10 = var3 - var9; var10 <= var3 + var9 && var7; ++var10) {
               for(var11 = var5 - var9; var11 <= var5 + var9 && var7; ++var11) {
                  if (var8 >= 0 && var8 < 256) {
                     var12 = var1.new(var10, var8, var11);
                     if (var12 != 0 && var12 != pa.aJ.void && var12 != pa.i.void && var12 != pa.g.void && var12 != pa.aM.void) {
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
               this.a(var1, var3, var4 - 1, var5, pa.g.void);
               var9 = 3;
               byte var19 = 0;

               int var13;
               int var14;
               int var15;
               for(var11 = var4 - var9 + var6; var11 <= var4 + var6; ++var11) {
                  var12 = var11 - (var4 + var6);
                  var13 = var19 + 1 - var12 / 2;

                  for(var14 = var3 - var13; var14 <= var3 + var13; ++var14) {
                     var15 = var14 - var3;

                     for(int var16 = var5 - var13; var16 <= var5 + var13; ++var16) {
                        int var17 = var16 - var5;
                        if (Math.abs(var15) != var13 || Math.abs(var17) != var13 || var2.nextInt(2) != 0 && var12 != 0) {
                           int var18 = var1.new(var14, var11, var16);
                           if (var18 == 0 || var18 == pa.aJ.void) {
                              this.a(var1, var14, var11, var16, pa.aJ.void, this.for);
                           }
                        }
                     }
                  }
               }

               for(var11 = 0; var11 < var6; ++var11) {
                  var12 = var1.new(var3, var4 + var11, var5);
                  if (var12 == 0 || var12 == pa.aJ.void) {
                     this.a(var1, var3, var4 + var11, var5, pa.aM.void, this.int);
                     if (this.if && var11 > 0) {
                        if (var2.nextInt(3) > 0 && var1.a(var3 - 1, var4 + var11, var5)) {
                           this.a(var1, var3 - 1, var4 + var11, var5, pa.Z.void, 8);
                        }

                        if (var2.nextInt(3) > 0 && var1.a(var3 + 1, var4 + var11, var5)) {
                           this.a(var1, var3 + 1, var4 + var11, var5, pa.Z.void, 2);
                        }

                        if (var2.nextInt(3) > 0 && var1.a(var3, var4 + var11, var5 - 1)) {
                           this.a(var1, var3, var4 + var11, var5 - 1, pa.Z.void, 1);
                        }

                        if (var2.nextInt(3) > 0 && var1.a(var3, var4 + var11, var5 + 1)) {
                           this.a(var1, var3, var4 + var11, var5 + 1, pa.Z.void, 4);
                        }
                     }
                  }
               }

               if (this.if) {
                  for(var11 = var4 - 3 + var6; var11 <= var4 + var6; ++var11) {
                     var12 = var11 - (var4 + var6);
                     var13 = 2 - var12 / 2;

                     for(var14 = var3 - var13; var14 <= var3 + var13; ++var14) {
                        for(var15 = var5 - var13; var15 <= var5 + var13; ++var15) {
                           if (var1.new(var14, var11, var15) == pa.aJ.void) {
                              if (var2.nextInt(4) == 0 && var1.new(var14 - 1, var11, var15) == 0) {
                                 this.if(var1, var14 - 1, var11, var15, 8);
                              }

                              if (var2.nextInt(4) == 0 && var1.new(var14 + 1, var11, var15) == 0) {
                                 this.if(var1, var14 + 1, var11, var15, 2);
                              }

                              if (var2.nextInt(4) == 0 && var1.new(var14, var11, var15 - 1) == 0) {
                                 this.if(var1, var14, var11, var15 - 1, 1);
                              }

                              if (var2.nextInt(4) == 0 && var1.new(var14, var11, var15 + 1) == 0) {
                                 this.if(var1, var14, var11, var15 + 1, 4);
                              }
                           }
                        }
                     }
                  }

                  if (var2.nextInt(5) == 0 && var6 > 5) {
                     for(var11 = 0; var11 < 2; ++var11) {
                        for(var12 = 0; var12 < 4; ++var12) {
                           if (var2.nextInt(4 - var11) == 0) {
                              var13 = var2.nextInt(3);
                              this.a(var1, var3 + apk.case[apk.for[var12]], var4 + var6 - 5 + var11, var5 + apk.byte[apk.for[var12]], pa.bu.void, var13 << 2 | var12);
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

   private void if(y6 var1, int var2, int var3, int var4, int var5) {
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
