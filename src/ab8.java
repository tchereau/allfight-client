import java.util.List;

public class ab8 extends abr {
   public static final String[] dy = new String[]{"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
   public static final String[] dx = new String[]{"dyePowder_black", "dyePowder_red", "dyePowder_green", "dyePowder_brown", "dyePowder_blue", "dyePowder_purple", "dyePowder_cyan", "dyePowder_silver", "dyePowder_gray", "dyePowder_pink", "dyePowder_lime", "dyePowder_yellow", "dyePowder_lightBlue", "dyePowder_magenta", "dyePowder_orange", "dyePowder_white"};
   public static final int[] dA = new int[]{1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320};
   private ajd[] dz;

   public ab8(int var1) {
      super(var1);
      this.a(true);
      this.for(0);
      this.a(acn.try);
   }

   public ajd a(int var1) {
      int var2 = ajs.a(var1, 0, 15);
      return this.dz[var2];
   }

   public String int(abp var1) {
      int var2 = ajs.a(var1.new(), 0, 15);
      return super.int() + "." + dy[var2];
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         if (var1.new() == 15) {
            if (a(var1, var3, var4, var5, var6)) {
               if (!var3.goto) {
                  var3.for(2005, var4, var5, var6, 0);
               }

               return true;
            }
         } else if (var1.new() == 3) {
            int var11 = var3.new(var4, var5, var6);
            int var12 = var3.for(var4, var5, var6);
            if (var11 == pa.aM.void && o0.goto(var12) == 3) {
               if (var7 == 0) {
                  return false;
               }

               if (var7 == 1) {
                  return false;
               }

               if (var7 == 2) {
                  --var6;
               }

               if (var7 == 3) {
                  ++var6;
               }

               if (var7 == 4) {
                  --var4;
               }

               if (var7 == 5) {
                  ++var4;
               }

               if (var3.a(var4, var5, var6)) {
                  int var13 = pa.x[pa.bu.void].a(var3, var4, var5, var6, var7, var8, var9, var10, 0);
                  var3.int(var4, var5, var6, pa.bu.void, var13, 2);
                  if (!var2.fY.new) {
                     --var1.if;
                  }
               }

               return true;
            }
         }

         return false;
      }
   }

   public static boolean a(abp var0, y6 var1, int var2, int var3, int var4) {
      int var5 = var1.new(var2, var3, var4);
      if (var5 == pa.bd.void) {
         if (!var1.goto) {
            if ((double)var1.o.nextFloat() < 0.45D) {
               ((pq)pa.bd).for(var1, var2, var3, var4, var1.o);
            }

            --var0.if;
         }

         return true;
      } else if (var5 != pa.bN.void && var5 != pa.bL.void) {
         if (var5 != pa.aa.void && var5 != pa.ac.void) {
            if (var5 > 0 && pa.x[var5] instanceof ro) {
               if (var1.for(var2, var3, var4) == 7) {
                  return false;
               } else {
                  if (!var1.goto) {
                     ((ro)pa.x[var5]).W(var1, var2, var3, var4);
                     --var0.if;
                  }

                  return true;
               }
            } else {
               int var6;
               int var7;
               int var8;
               if (var5 == pa.bu.void) {
                  var6 = var1.for(var2, var3, var4);
                  var7 = rj.r(var6);
                  var8 = rr.E(var6);
                  if (var8 >= 2) {
                     return false;
                  } else {
                     if (!var1.goto) {
                        ++var8;
                        var1.do(var2, var3, var4, var8 << 2 | var7, 2);
                        --var0.if;
                     }

                     return true;
                  }
               } else if (var5 != pa.i.void) {
                  return false;
               } else {
                  if (!var1.goto) {
                     --var0.if;

                     label112:
                     for(var6 = 0; var6 < 128; ++var6) {
                        var7 = var2;
                        var8 = var3 + 1;
                        int var9 = var4;

                        for(int var10 = 0; var10 < var6 / 16; ++var10) {
                           var7 += aj.nextInt(3) - 1;
                           var8 += (aj.nextInt(3) - 1) * aj.nextInt(3) / 2;
                           var9 += aj.nextInt(3) - 1;
                           if (var1.new(var7, var8 - 1, var9) != pa.i.void || var1.try(var7, var8, var9)) {
                              continue label112;
                           }
                        }

                        if (var1.new(var7, var8, var9) == 0) {
                           if (aj.nextInt(10) != 0) {
                              if (pa.b3.try(var1, var7, var8, var9)) {
                                 var1.int(var7, var8, var9, pa.b3.void, 1, 3);
                              }
                           } else if (aj.nextInt(3) != 0) {
                              if (pa.bR.try(var1, var7, var8, var9)) {
                                 var1.int(var7, var8, var9, pa.bR.void);
                              }
                           } else if (aj.nextInt(2) != 0) {
                              if (mod_rajouts.P.try(var1, var7, var8, var9)) {
                                 var1.int(var7, var8, var9, mod_rajouts.P.void);
                              }
                           } else if (aj.nextInt(2) != 0) {
                              if (mod_rajouts.ac.try(var1, var7, var8, var9)) {
                                 var1.int(var7, var8, var9, mod_rajouts.ac.void);
                              }
                           } else if (pa.bP.try(var1, var7, var8, var9)) {
                              var1.int(var7, var8, var9, pa.bP.void);
                           }
                        }
                     }
                  }

                  return true;
               }
            }
         } else if (var1.for(var2, var3, var4) == 7) {
            return false;
         } else {
            if (!var1.goto) {
               ((pj)pa.x[var5]).U(var1, var2, var3, var4);
               --var0.if;
            }

            return true;
         }
      } else {
         if (!var1.goto) {
            if ((double)var1.o.nextFloat() < 0.4D) {
               ((qg)pa.x[var5]).new(var1, var2, var3, var4, var1.o);
            }

            --var0.if;
         }

         return true;
      }
   }

   public static void if(y6 var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.new(var1, var2, var3);
      if (var4 == 0) {
         var4 = 15;
      }

      pa var6 = var5 > 0 && var5 < pa.x.length ? pa.x[var5] : null;
      if (var6 != null) {
         var6.int((yy)var0, var1, var2, var3);

         for(int var7 = 0; var7 < var4; ++var7) {
            double var8 = aj.nextGaussian() * 0.02D;
            double var10 = aj.nextGaussian() * 0.02D;
            double var12 = aj.nextGaussian() * 0.02D;
            var0.a("happyVillager", (double)((float)var1 + aj.nextFloat()), (double)var2 + (double)aj.nextFloat() * var6.n(), (double)((float)var3 + aj.nextFloat()), var8, var10, var12);
         }
      }

   }

   public boolean a(abp var1, aig var2) {
      if (var2 instanceof af2) {
         af2 var3 = (af2)var2;
         int var4 = rs.I(var1.new());
         if (!var3.fu() && var3.fv() != var4) {
            var3.au(var4);
            --var1.if;
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int var1, acn var2, List var3) {
      for(int var4 = 0; var4 < 16; ++var4) {
         var3.add(new abp(var1, 1, var4));
      }

   }

   public void a(ajc var1) {
      this.dz = new ajd[dx.length];

      for(int var2 = 0; var2 < dx.length; ++var2) {
         this.dz[var2] = var1.a(dx[var2]);
      }

   }
}
