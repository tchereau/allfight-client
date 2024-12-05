import java.util.List;

public class abn extends aco {
   protected abn(int var1) {
      super(var1);
      this.a(true);
   }

   public static s3 a(short var0, y6 var1) {
      String var2 = "map_" + var0;
      s3 var3 = (s3)var1.a(s3.class, var2);
      if (var3 == null) {
         var3 = new s3(var2);
         var1.a((String)var2, (s0)var3);
      }

      return var3;
   }

   public s3 a(abp var1, y6 var2) {
      String var3 = "map_" + var1.new();
      s3 var4 = (s3)var2.a(s3.class, var3);
      if (var4 == null && !var2.goto) {
         var1.do(var2.a("map"));
         var3 = "map_" + var1.new();
         var4 = new s3(var3);
         var4.case = 3;
         int var5 = 128 * (1 << var4.case);
         var4.for = Math.round((float)var2.l().h() / (float)var5) * var5;
         var4.do = Math.round((float)(var2.l().b() / var5)) * var5;
         var4.char = (byte)var2.n.if;
         var4.a();
         var2.a((String)var3, (s0)var4);
      }

      return var4;
   }

   public void a(y6 var1, aiw var2, s3 var3) {
      if (var1.n.if == var3.char && var2 instanceof aek) {
         short var4 = 128;
         short var5 = 128;
         int var6 = 1 << var3.case;
         int var7 = var3.for;
         int var8 = var3.do;
         int var9 = ajs.a(var2.al - (double)var7) / var6 + var4 / 2;
         int var10 = ajs.a(var2.aj - (double)var8) / var6 + var5 / 2;
         int var11 = 128 / var6;
         if (var1.n.for) {
            var11 /= 2;
         }

         s2 var12 = var3.a((aek)var2);
         ++var12.new;

         for(int var13 = var9 - var11 + 1; var13 < var9 + var11; ++var13) {
            if ((var13 & 15) == (var12.new & 15)) {
               int var14 = 255;
               int var15 = 0;
               double var16 = 0.0D;

               for(int var18 = var10 - var11 - 1; var18 < var10 + var11; ++var18) {
                  if (var13 >= 0 && var18 >= -1 && var13 < var4 && var18 < var5) {
                     int var19 = var13 - var9;
                     int var20 = var18 - var10;
                     boolean var21 = var19 * var19 + var20 * var20 > (var11 - 2) * (var11 - 2);
                     int var22 = (var7 / var6 + var13 - var4 / 2) * var6;
                     int var23 = (var8 / var6 + var18 - var5 / 2) * var6;
                     int[] var24 = new int[256];
                     xx var25 = var1.try(var22, var23);
                     if (!var25.int()) {
                        int var26 = var22 & 15;
                        int var27 = var23 & 15;
                        int var28 = 0;
                        double var29 = 0.0D;
                        int var31;
                        int var32;
                        int var33;
                        int var36;
                        if (var1.n.for) {
                           var31 = var22 + var23 * 231871;
                           var31 = var31 * var31 * 31287121 + var31 * 11;
                           int var10001;
                           if ((var31 >> 20 & 1) == 0) {
                              var10001 = pa.g.void;
                              var24[var10001] += 10;
                           } else {
                              var10001 = pa.k.void;
                              var24[var10001] += 10;
                           }

                           var29 = 100.0D;
                        } else {
                           for(var31 = 0; var31 < var6; ++var31) {
                              for(var32 = 0; var32 < var6; ++var32) {
                                 var33 = var25.int(var31 + var26, var32 + var27) + 1;
                                 int var34 = 0;
                                 if (var33 > 1) {
                                    boolean var35;
                                    do {
                                       var35 = true;
                                       var34 = var25.int(var31 + var26, var33 - 1, var32 + var27);
                                       if (var34 == 0) {
                                          var35 = false;
                                       } else if (var33 > 0 && var34 > 0 && pa.x[var34].at.try == tq.c) {
                                          var35 = false;
                                       }

                                       if (!var35) {
                                          --var33;
                                          if (var33 <= 0) {
                                             break;
                                          }

                                          var34 = var25.int(var31 + var26, var33 - 1, var32 + var27);
                                       }
                                    } while(var33 > 0 && !var35);

                                    if (var33 > 0 && var34 != 0 && pa.x[var34].at.case()) {
                                       var36 = var33 - 1;
                                       boolean var37 = false;

                                       int var41;
                                       do {
                                          var41 = var25.int(var31 + var26, var36--, var32 + var27);
                                          ++var28;
                                       } while(var36 > 0 && var41 != 0 && pa.x[var41].at.case());
                                    }
                                 }

                                 var29 += (double)var33 / (double)(var6 * var6);
                                 int var10002 = var24[var34]++;
                              }
                           }
                        }

                        var28 /= var6 * var6;
                        var31 = 0;
                        var32 = 0;

                        for(var33 = 0; var33 < 256; ++var33) {
                           if (var24[var33] > var31) {
                              var32 = var33;
                              var31 = var24[var33];
                           }
                        }

                        double var39 = (var29 - var16) * 4.0D / (double)(var6 + 4) + ((double)(var13 + var18 & 1) - 0.5D) * 0.4D;
                        byte var40 = 1;
                        if (var39 > 0.6D) {
                           var40 = 2;
                        }

                        if (var39 < -0.6D) {
                           var40 = 0;
                        }

                        var36 = 0;
                        if (var32 > 0) {
                           tq var42 = pa.x[var32].at.try;
                           if (var42 == tq.for) {
                              var39 = (double)var28 * 0.1D + (double)(var13 + var18 & 1) * 0.2D;
                              var40 = 1;
                              if (var39 < 0.5D) {
                                 var40 = 2;
                              }

                              if (var39 > 0.9D) {
                                 var40 = 0;
                              }
                           }

                           var36 = var42.a;
                        }

                        var16 = var29;
                        if (var18 >= 0 && var19 * var19 + var20 * var20 < var11 * var11 && (!var21 || (var13 + var18 & 1) != 0)) {
                           byte var43 = var3.byte[var13 + var18 * var4];
                           byte var38 = (byte)(var36 * 4 + var40);
                           if (var43 != var38) {
                              if (var14 > var18) {
                                 var14 = var18;
                              }

                              if (var15 < var18) {
                                 var15 = var18;
                              }

                              var3.byte[var13 + var18 * var4] = var38;
                           }
                        }
                     }
                  }
               }

               if (var14 <= var15) {
                  var3.a(var13, var14, var15);
               }
            }
         }

      }
   }

   public void a(abp var1, y6 var2, aiw var3, int var4, boolean var5) {
      if (!var2.goto) {
         s3 var6 = this.a(var1, var2);
         if (var3 instanceof aek) {
            aek var7 = (aek)var3;
            var6.a(var7, var1);
         }

         if (var5) {
            this.a(var2, var3, var6);
         }

      }
   }

   public an7 try(abp var1, y6 var2, aek var3) {
      byte[] var4 = this.a(var1, var2).a(var1, var2, var3);
      return var4 == null ? null : new ao4((short)abr.aZ.A, (short)var1.new(), var4);
   }

   public void if(abp var1, y6 var2, aek var3) {
      if (var1.a() && var1.b().if("map_is_scaling")) {
         s3 var4 = abr.aZ.a(var1, var2);
         var1.do(var2.a("map"));
         s3 var5 = new s3("map_" + var1.new());
         var5.case = (byte)(var4.case + 1);
         if (var5.case > 4) {
            var5.case = 4;
         }

         var5.for = var4.for;
         var5.do = var4.do;
         var5.char = var4.char;
         var5.a();
         var2.a((String)("map_" + var1.new()), (s0)var5);
      }

   }

   public void a(abp var1, aek var2, List var3, boolean var4) {
      s3 var5 = this.a(var1, var2.ap);
      if (var4) {
         if (var5 == null) {
            var3.add("Unknown map");
         } else {
            var3.add("Scaling at 1:" + (1 << var5.case));
            var3.add("(Level " + var5.case + "/" + 4 + ")");
         }
      }

   }
}
