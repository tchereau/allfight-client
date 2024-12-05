import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class yu {
   private final ak5 if;
   private final Random a;
   private final ajv for = new ajv();
   private final List do = new ArrayList();

   public yu(ak5 var1) {
      this.if = var1;
      this.a = new Random(var1.b());
   }

   public void if(aiw var1, double var2, double var4, double var6, float var8) {
      if (this.if.n.if != 1) {
         if (!this.a(var1, var2, var4, var6, var8)) {
            this.a(var1);
            this.a(var1, var2, var4, var6, var8);
         }
      } else {
         int var9 = ajs.a(var1.al);
         int var10 = ajs.a(var1.ak) - 1;
         int var11 = ajs.a(var1.aj);
         byte var12 = 1;
         byte var13 = 0;

         for(int var14 = -2; var14 <= 2; ++var14) {
            for(int var15 = -2; var15 <= 2; ++var15) {
               for(int var16 = -1; var16 < 3; ++var16) {
                  int var17 = var9 + var15 * var12 + var14 * var13;
                  int var18 = var10 + var16;
                  int var19 = var11 + var15 * var13 - var14 * var12;
                  boolean var20 = var16 < 0;
                  this.if.int(var17, var18, var19, var20 ? pa.bs.void : 0);
               }
            }
         }

         var1.if((double)var9, (double)var10, (double)var11, var1.a5, 0.0F);
         var1.ai = var1.ah = var1.ag = 0.0D;
      }
   }

   public boolean a(aiw var1, double var2, double var4, double var6, float var8) {
      short var9 = 128;
      double var10 = -1.0D;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = ajs.a(var1.al);
      int var16 = ajs.a(var1.aj);
      long var17 = zi.a(var15, var16);
      boolean var19 = true;
      double var27;
      int var48;
      if (this.for.try(var17)) {
         yt var20 = (yt)this.for.int(var17);
         var10 = 0.0D;
         var12 = var20.if;
         var13 = var20.a;
         var14 = var20.do;
         var20.int = this.if.m();
         var19 = false;
      } else {
         for(var48 = var15 - var9; var48 <= var15 + var9; ++var48) {
            double var21 = (double)var48 + 0.5D - var1.al;

            for(int var23 = var16 - var9; var23 <= var16 + var9; ++var23) {
               double var24 = (double)var23 + 0.5D - var1.aj;

               for(int var26 = this.if.q() - 1; var26 >= 0; --var26) {
                  if (this.if.new(var48, var26, var23) == pa.aK.void) {
                     while(this.if.new(var48, var26 - 1, var23) == pa.aK.void) {
                        --var26;
                     }

                     var27 = (double)var26 + 0.5D - var1.ak;
                     double var29 = var21 * var21 + var27 * var27 + var24 * var24;
                     if (var10 < 0.0D || var29 < var10) {
                        var10 = var29;
                        var12 = var48;
                        var13 = var26;
                        var14 = var23;
                     }
                  }
               }
            }
         }
      }

      if (var10 >= 0.0D) {
         if (var19) {
            this.for.a(var17, new yt(this, var12, var13, var14, this.if.m()));
            this.do.add(var17);
         }

         double var49 = (double)var12 + 0.5D;
         double var25 = (double)var13 + 0.5D;
         var27 = (double)var14 + 0.5D;
         int var50 = -1;
         if (this.if.new(var12 - 1, var13, var14) == pa.aK.void) {
            var50 = 2;
         }

         if (this.if.new(var12 + 1, var13, var14) == pa.aK.void) {
            var50 = 0;
         }

         if (this.if.new(var12, var13, var14 - 1) == pa.aK.void) {
            var50 = 3;
         }

         if (this.if.new(var12, var13, var14 + 1) == pa.aK.void) {
            var50 = 1;
         }

         int var30 = var1.am();
         if (var50 > -1) {
            int var31 = apk.if[var50];
            int var32 = apk.case[var50];
            int var33 = apk.byte[var50];
            int var34 = apk.case[var31];
            int var35 = apk.byte[var31];
            boolean var36 = !this.if.a(var12 + var32 + var34, var13, var14 + var33 + var35) || !this.if.a(var12 + var32 + var34, var13 + 1, var14 + var33 + var35);
            boolean var37 = !this.if.a(var12 + var32, var13, var14 + var33) || !this.if.a(var12 + var32, var13 + 1, var14 + var33);
            if (var36 && var37) {
               var50 = apk.for[var50];
               var31 = apk.for[var31];
               var32 = apk.case[var50];
               var33 = apk.byte[var50];
               var34 = apk.case[var31];
               var35 = apk.byte[var31];
               var48 = var12 - var34;
               var49 -= (double)var34;
               int var22 = var14 - var35;
               var27 -= (double)var35;
               var36 = !this.if.a(var48 + var32 + var34, var13, var22 + var33 + var35) || !this.if.a(var48 + var32 + var34, var13 + 1, var22 + var33 + var35);
               var37 = !this.if.a(var48 + var32, var13, var22 + var33) || !this.if.a(var48 + var32, var13 + 1, var22 + var33);
            }

            float var38 = 0.5F;
            float var39 = 0.5F;
            if (!var36 && var37) {
               var38 = 1.0F;
            } else if (var36 && !var37) {
               var38 = 0.0F;
            } else if (var36 && var37) {
               var39 = 0.0F;
            }

            var49 += (double)((float)var34 * var38 + var39 * (float)var32);
            var27 += (double)((float)var35 * var38 + var39 * (float)var33);
            float var40 = 0.0F;
            float var41 = 0.0F;
            float var42 = 0.0F;
            float var43 = 0.0F;
            if (var50 == var30) {
               var40 = 1.0F;
               var41 = 1.0F;
            } else if (var50 == apk.for[var30]) {
               var40 = -1.0F;
               var41 = -1.0F;
            } else if (var50 == apk.do[var30]) {
               var42 = 1.0F;
               var43 = -1.0F;
            } else {
               var42 = -1.0F;
               var43 = 1.0F;
            }

            double var44 = var1.ai;
            double var46 = var1.ag;
            var1.ai = var44 * (double)var40 + var46 * (double)var43;
            var1.ag = var44 * (double)var42 + var46 * (double)var41;
            var1.a5 = var8 - (float)(var30 * 90) + (float)(var50 * 90);
         } else {
            var1.ai = var1.ah = var1.ag = 0.0D;
         }

         var1.if(var49, var25, var27, var1.a5, var1.a4);
         return true;
      } else {
         return false;
      }
   }

   public boolean a(aiw var1) {
      byte var2 = 16;
      double var3 = -1.0D;
      int var5 = ajs.a(var1.al);
      int var6 = ajs.a(var1.ak);
      int var7 = ajs.a(var1.aj);
      int var8 = var5;
      int var9 = var6;
      int var10 = var7;
      int var11 = 0;
      int var12 = this.a.nextInt(4);

      int var13;
      double var14;
      int var16;
      double var17;
      int var19;
      int var20;
      int var21;
      int var22;
      int var23;
      int var24;
      int var25;
      int var26;
      int var27;
      double var31;
      double var32;
      for(var13 = var5 - var2; var13 <= var5 + var2; ++var13) {
         var14 = (double)var13 + 0.5D - var1.al;

         for(var16 = var7 - var2; var16 <= var7 + var2; ++var16) {
            var17 = (double)var16 + 0.5D - var1.aj;

            label296:
            for(var19 = this.if.q() - 1; var19 >= 0; --var19) {
               if (this.if.a(var13, var19, var16)) {
                  while(var19 > 0 && this.if.a(var13, var19 - 1, var16)) {
                     --var19;
                  }

                  for(var20 = var12; var20 < var12 + 4; ++var20) {
                     var21 = var20 % 2;
                     var22 = 1 - var21;
                     if (var20 % 4 >= 2) {
                        var21 = -var21;
                        var22 = -var22;
                     }

                     for(var23 = 0; var23 < 3; ++var23) {
                        for(var24 = 0; var24 < 4; ++var24) {
                           for(var25 = -1; var25 < 4; ++var25) {
                              var26 = var13 + (var24 - 1) * var21 + var23 * var22;
                              var27 = var19 + var25;
                              int var28 = var16 + (var24 - 1) * var22 - var23 * var21;
                              if (var25 < 0 && !this.if.byte(var26, var27, var28).for() || var25 >= 0 && !this.if.a(var26, var27, var28)) {
                                 continue label296;
                              }
                           }
                        }
                     }

                     var31 = (double)var19 + 0.5D - var1.ak;
                     var32 = var14 * var14 + var31 * var31 + var17 * var17;
                     if (var3 < 0.0D || var32 < var3) {
                        var3 = var32;
                        var8 = var13;
                        var9 = var19;
                        var10 = var16;
                        var11 = var20 % 4;
                     }
                  }
               }
            }
         }
      }

      if (var3 < 0.0D) {
         for(var13 = var5 - var2; var13 <= var5 + var2; ++var13) {
            var14 = (double)var13 + 0.5D - var1.al;

            for(var16 = var7 - var2; var16 <= var7 + var2; ++var16) {
               var17 = (double)var16 + 0.5D - var1.aj;

               label234:
               for(var19 = this.if.q() - 1; var19 >= 0; --var19) {
                  if (this.if.a(var13, var19, var16)) {
                     while(var19 > 0 && this.if.a(var13, var19 - 1, var16)) {
                        --var19;
                     }

                     for(var20 = var12; var20 < var12 + 2; ++var20) {
                        var21 = var20 % 2;
                        var22 = 1 - var21;

                        for(var23 = 0; var23 < 4; ++var23) {
                           for(var24 = -1; var24 < 4; ++var24) {
                              var25 = var13 + (var23 - 1) * var21;
                              var26 = var19 + var24;
                              var27 = var16 + (var23 - 1) * var22;
                              if (var24 < 0 && !this.if.byte(var25, var26, var27).for() || var24 >= 0 && !this.if.a(var25, var26, var27)) {
                                 continue label234;
                              }
                           }
                        }

                        var31 = (double)var19 + 0.5D - var1.ak;
                        var32 = var14 * var14 + var31 * var31 + var17 * var17;
                        if (var3 < 0.0D || var32 < var3) {
                           var3 = var32;
                           var8 = var13;
                           var9 = var19;
                           var10 = var16;
                           var11 = var20 % 2;
                        }
                     }
                  }
               }
            }
         }
      }

      int var29 = var8;
      int var15 = var9;
      var16 = var10;
      int var30 = var11 % 2;
      int var18 = 1 - var30;
      if (var11 % 4 >= 2) {
         var30 = -var30;
         var18 = -var18;
      }

      boolean var33;
      if (var3 < 0.0D) {
         if (var9 < 70) {
            var9 = 70;
         }

         if (var9 > this.if.q() - 10) {
            var9 = this.if.q() - 10;
         }

         var15 = var9;

         for(var19 = -1; var19 <= 1; ++var19) {
            for(var20 = 1; var20 < 3; ++var20) {
               for(var21 = -1; var21 < 3; ++var21) {
                  var22 = var29 + (var20 - 1) * var30 + var19 * var18;
                  var23 = var15 + var21;
                  var24 = var16 + (var20 - 1) * var18 - var19 * var30;
                  var33 = var21 < 0;
                  this.if.int(var22, var23, var24, var33 ? pa.bs.void : 0);
               }
            }
         }
      }

      for(var19 = 0; var19 < 4; ++var19) {
         for(var20 = 0; var20 < 4; ++var20) {
            for(var21 = -1; var21 < 4; ++var21) {
               var22 = var29 + (var20 - 1) * var30;
               var23 = var15 + var21;
               var24 = var16 + (var20 - 1) * var18;
               var33 = var20 == 0 || var20 == 3 || var21 == -1 || var21 == 3;
               this.if.int(var22, var23, var24, var33 ? pa.bs.void : pa.aK.void, 0, 2);
            }
         }

         for(var20 = 0; var20 < 4; ++var20) {
            for(var21 = -1; var21 < 4; ++var21) {
               var22 = var29 + (var20 - 1) * var30;
               var23 = var15 + var21;
               var24 = var16 + (var20 - 1) * var18;
               this.if.for(var22, var23, var24, this.if.new(var22, var23, var24));
            }
         }
      }

      return true;
   }

   public void a(long var1) {
      if (var1 % 100L == 0L) {
         Iterator var3 = this.do.iterator();
         long var4 = var1 - 600L;

         while(true) {
            Long var6;
            yt var7;
            do {
               if (!var3.hasNext()) {
                  return;
               }

               var6 = (Long)var3.next();
               var7 = (yt)this.for.int(var6);
            } while(var7 != null && var7.int >= var4);

            var3.remove();
            this.for.new(var6);
         }
      }
   }
}
