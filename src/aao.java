import java.util.ArrayList;

public class aao implements aag {
   private abp try;

   public boolean a(adt var1, y6 var2) {
      this.try = null;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.r(); ++var9) {
         abp var10 = var1.do(var9);
         if (var10 != null) {
            if (var10.new == abr.aS.A) {
               ++var4;
            } else if (var10.new == abr.bl.A) {
               ++var6;
            } else if (var10.new == abr.b9.A) {
               ++var5;
            } else if (var10.new == abr.cn.A) {
               ++var3;
            } else if (var10.new == abr.cc.A) {
               ++var7;
            } else if (var10.new == abr.P.A) {
               ++var7;
            } else if (var10.new == abr.bV.A) {
               ++var8;
            } else if (var10.new == abr.aU.A) {
               ++var8;
            } else if (var10.new == abr.az.A) {
               ++var8;
            } else {
               if (var10.new != abr.bv.A) {
                  return false;
               }

               ++var8;
            }
         }
      }

      var7 += var5 + var8;
      if (var4 <= 3 && var3 <= 1) {
         aqv var16;
         aqv var19;
         if (var4 >= 1 && var3 == 1 && var7 == 0) {
            this.try = new abp(abr.bn);
            if (var6 > 0) {
               var16 = new aqv();
               var19 = new aqv("Fireworks");
               aqm var25 = new aqm("Explosions");

               for(int var22 = 0; var22 < var1.r(); ++var22) {
                  abp var26 = var1.do(var22);
                  if (var26 != null && var26.new == abr.bl.A && var26.a() && var26.b().try("Explosion")) {
                     var25.a((aqd)var26.b().char("Explosion"));
                  }
               }

               var19.a("Explosions", (aqd)var25);
               var19.a("Flight", (byte)var4);
               var16.a("Fireworks", (aqd)var19);
               this.try.do(var16);
            }

            return true;
         } else if (var4 == 1 && var3 == 0 && var6 == 0 && var5 > 0 && var8 <= 1) {
            this.try = new abp(abr.bl);
            var16 = new aqv();
            var19 = new aqv("Explosion");
            byte var23 = 0;
            ArrayList var12 = new ArrayList();

            for(int var13 = 0; var13 < var1.r(); ++var13) {
               abp var14 = var1.do(var13);
               if (var14 != null) {
                  if (var14.new == abr.b9.A) {
                     var12.add(ab8.dA[var14.new()]);
                  } else if (var14.new == abr.cc.A) {
                     var19.a("Flicker", true);
                  } else if (var14.new == abr.P.A) {
                     var19.a("Trail", true);
                  } else if (var14.new == abr.bV.A) {
                     var23 = 1;
                  } else if (var14.new == abr.aU.A) {
                     var23 = 4;
                  } else if (var14.new == abr.az.A) {
                     var23 = 2;
                  } else if (var14.new == abr.bv.A) {
                     var23 = 3;
                  }
               }
            }

            int[] var24 = new int[var12.size()];

            for(int var27 = 0; var27 < var24.length; ++var27) {
               var24[var27] = (Integer)var12.get(var27);
            }

            var19.a("Colors", var24);
            var19.a("Type", var23);
            var16.a("Explosion", (aqd)var19);
            this.try.do(var16);
            return true;
         } else if (var4 == 0 && var3 == 0 && var6 == 1 && var5 > 0 && var5 == var7) {
            ArrayList var15 = new ArrayList();

            for(int var17 = 0; var17 < var1.r(); ++var17) {
               abp var11 = var1.do(var17);
               if (var11 != null) {
                  if (var11.new == abr.b9.A) {
                     var15.add(ab8.dA[var11.new()]);
                  } else if (var11.new == abr.bl.A) {
                     this.try = var11.n();
                     this.try.if = 1;
                  }
               }
            }

            int[] var18 = new int[var15.size()];

            for(int var20 = 0; var20 < var18.length; ++var20) {
               var18[var20] = (Integer)var15.get(var20);
            }

            if (this.try != null && this.try.a()) {
               aqv var21 = this.try.b().char("Explosion");
               if (var21 == null) {
                  return false;
               } else {
                  var21.a("FadeColors", var18);
                  return true;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public abp a(adt var1) {
      return this.try.n();
   }

   public int if() {
      return 10;
   }

   public abp a() {
      return this.try;
   }
}
