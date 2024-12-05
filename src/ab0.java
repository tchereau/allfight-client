import java.util.List;

public class ab0 extends abr {
   private ajd dw;

   public ab0(int var1) {
      super(var1);
   }

   public ajd a(int var1, int var2) {
      return var2 > 0 ? this.dw : super.a(var1, var2);
   }

   public int a(abp var1, int var2) {
      if (var2 != 1) {
         return super.a(var1, var2);
      } else {
         aqd var3 = a(var1, "Colors");
         if (var3 == null) {
            return 9079434;
         } else {
            aqp var4 = (aqp)var3;
            if (var4.case.length == 1) {
               return var4.case[0];
            } else {
               int var5 = 0;
               int var6 = 0;
               int var7 = 0;
               int[] var8 = var4.case;
               int var9 = var8.length;

               for(int var10 = 0; var10 < var9; ++var10) {
                  int var11 = var8[var10];
                  var5 += (var11 & 16711680) >> 16;
                  var6 += (var11 & '\uff00') >> 8;
                  var7 += (var11 & 255) >> 0;
               }

               var5 /= var4.case.length;
               var6 /= var4.case.length;
               var7 /= var4.case.length;
               return var5 << 16 | var6 << 8 | var7;
            }
         }
      }
   }

   public boolean do() {
      return true;
   }

   public static aqd a(abp var0, String var1) {
      if (var0.a()) {
         aqv var2 = var0.b().char("Explosion");
         if (var2 != null) {
            return var2.byte(var1);
         }
      }

      return null;
   }

   public void a(abp var1, aek var2, List var3, boolean var4) {
      if (var1.a()) {
         aqv var5 = var1.b().char("Explosion");
         if (var5 != null) {
            a(var5, var3);
         }
      }

   }

   public static void a(aqv var0, List var1) {
      byte var2 = var0.else("Type");
      if (var2 >= 0 && var2 <= 4) {
         var1.add(aqz.if("item.fireworksCharge.type." + var2).trim());
      } else {
         var1.add(aqz.if("item.fireworksCharge.type").trim());
      }

      int[] var3 = var0.for("Colors");
      int var8;
      int var9;
      if (var3.length > 0) {
         boolean var4 = true;
         String var5 = "";
         int[] var6 = var3;
         int var7 = var3.length;

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var6[var8];
            if (!var4) {
               var5 = var5 + ", ";
            }

            var4 = false;
            boolean var10 = false;

            for(int var11 = 0; var11 < 16; ++var11) {
               if (var9 == ab8.dA[var11]) {
                  var10 = true;
                  var5 = var5 + aqz.if("item.fireworksCharge." + ab8.dy[var11]);
                  break;
               }
            }

            if (!var10) {
               var5 = var5 + aqz.if("item.fireworksCharge.customColor");
            }
         }

         var1.add(var5);
      }

      int[] var13 = var0.for("FadeColors");
      boolean var15;
      if (var13.length > 0) {
         var15 = true;
         String var14 = aqz.if("item.fireworksCharge.fadeTo") + " ";
         int[] var16 = var13;
         var8 = var13.length;

         for(var9 = 0; var9 < var8; ++var9) {
            int var18 = var16[var9];
            if (!var15) {
               var14 = var14 + ", ";
            }

            var15 = false;
            boolean var19 = false;

            for(int var12 = 0; var12 < 16; ++var12) {
               if (var18 == ab8.dA[var12]) {
                  var19 = true;
                  var14 = var14 + aqz.if("item.fireworksCharge." + ab8.dy[var12]);
                  break;
               }
            }

            if (!var19) {
               var14 = var14 + aqz.if("item.fireworksCharge.customColor");
            }
         }

         var1.add(var14);
      }

      var15 = var0.if("Trail");
      if (var15) {
         var1.add(aqz.if("item.fireworksCharge.trail"));
      }

      boolean var17 = var0.if("Flicker");
      if (var17) {
         var1.add(aqz.if("item.fireworksCharge.flicker"));
      }

   }

   public void a(ajc var1) {
      super.a(var1);
      this.dw = var1.a("fireworksCharge_overlay");
   }
}
