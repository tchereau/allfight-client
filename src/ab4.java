public class ab4 extends abr {
   public ab4(int var1) {
      super(var1);
      this.a(acn.long);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      int var11 = var3.new(var4, var5, var6);
      int var12 = var3.for(var4, var5, var6);
      if (var2.a(var4, var5, var6, var7, var1) && var11 == pa.bI.void && !pc.e(var12)) {
         if (var3.goto) {
            return true;
         } else {
            var3.do(var4, var5, var6, var12 + 4, 2);
            --var1.if;

            int var13;
            for(var13 = 0; var13 < 16; ++var13) {
               double var14 = (double)((float)var4 + (5.0F + aj.nextFloat() * 6.0F) / 16.0F);
               double var16 = (double)((float)var5 + 0.8125F);
               double var18 = (double)((float)var6 + (5.0F + aj.nextFloat() * 6.0F) / 16.0F);
               double var20 = 0.0D;
               double var22 = 0.0D;
               double var24 = 0.0D;
               var3.a("smoke", var14, var16, var18, var20, var22, var24);
            }

            var13 = var12 & 3;
            int var26 = 0;
            int var15 = 0;
            boolean var27 = false;
            boolean var17 = true;
            int var28 = apk.do[var13];

            int var19;
            int var21;
            int var23;
            int var29;
            int var30;
            for(var19 = -2; var19 <= 2; ++var19) {
               var29 = var4 + apk.case[var28] * var19;
               var21 = var6 + apk.byte[var28] * var19;
               var30 = var3.new(var29, var5, var21);
               if (var30 == pa.bI.void) {
                  var23 = var3.for(var29, var5, var21);
                  if (!pc.e(var23)) {
                     var17 = false;
                     break;
                  }

                  var15 = var19;
                  if (!var27) {
                     var26 = var19;
                     var27 = true;
                  }
               }
            }

            if (var17 && var15 == var26 + 2) {
               for(var19 = var26; var19 <= var15; ++var19) {
                  var29 = var4 + apk.case[var28] * var19;
                  var21 = var6 + apk.byte[var28] * var19;
                  var29 += apk.case[var13] * 4;
                  var21 += apk.byte[var13] * 4;
                  var30 = var3.new(var29, var5, var21);
                  var23 = var3.for(var29, var5, var21);
                  if (var30 != pa.bI.void || !pc.e(var23)) {
                     var17 = false;
                     break;
                  }
               }

               for(var19 = var26 - 1; var19 <= var15 + 1; var19 += 4) {
                  for(var29 = 1; var29 <= 3; ++var29) {
                     var21 = var4 + apk.case[var28] * var19;
                     var30 = var6 + apk.byte[var28] * var19;
                     var21 += apk.case[var13] * var29;
                     var30 += apk.byte[var13] * var29;
                     var23 = var3.new(var21, var5, var30);
                     int var31 = var3.for(var21, var5, var30);
                     if (var23 != pa.bI.void || !pc.e(var31)) {
                        var17 = false;
                        break;
                     }
                  }
               }

               if (var17) {
                  for(var19 = var26; var19 <= var15; ++var19) {
                     for(var29 = 1; var29 <= 3; ++var29) {
                        var21 = var4 + apk.case[var28] * var19;
                        var30 = var6 + apk.byte[var28] * var19;
                        var21 += apk.case[var13] * var29;
                        var30 += apk.byte[var13] * var29;
                        var3.int(var21, var5, var30, pa.bK.void, 0, 2);
                     }
                  }
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public abp a(abp var1, y6 var2, aek var3) {
      nt var4 = this.a(var2, var3, false);
      if (var4 != null && var4.if == ns.if) {
         int var5 = var2.new(var4.a, var4.try, var4.new);
         if (var5 == pa.bI.void) {
            return var1;
         }
      }

      if (!var2.goto) {
         yp var7 = var2.a("Stronghold", (int)var3.al, (int)var3.ak, (int)var3.aj);
         if (var7 != null) {
            aeh var6 = new aeh(var2, var3.al, var3.ak + 1.62D - (double)var3.aQ, var3.aj);
            var6.a((double)var7.if, var7.a, (double)var7.do);
            var2.new(var6);
            var2.a((aiw)var3, "random.bow", 0.5F, 0.4F / (aj.nextFloat() * 0.4F + 0.8F));
            var2.a((aek)null, 1002, (int)var3.al, (int)var3.ak, (int)var3.aj, 0);
            if (!var3.fY.new) {
               --var1.if;
            }
         }
      }

      return var1;
   }
}
