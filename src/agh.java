import java.util.Random;

public class agh {
   private static nr a = nr.do(0.0D, 0.0D, 0.0D);

   public static nr a(ah5 var0, int var1, int var2) {
      return a(var0, var1, var2, (nr)null);
   }

   public static nr if(ah5 var0, int var1, int var2, nr var3) {
      a.int = var3.int - var0.al;
      a.for = var3.for - var0.ak;
      a.do = var3.do - var0.aj;
      return a(var0, var1, var2, a);
   }

   public static nr do(ah5 var0, int var1, int var2, nr var3) {
      a.int = var0.al - var3.int;
      a.for = var0.ak - var3.for;
      a.do = var0.aj - var3.do;
      return a(var0, var1, var2, a);
   }

   private static nr a(ah5 var0, int var1, int var2, nr var3) {
      Random var4 = var0.bq();
      boolean var5 = false;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      float var9 = -99999.0F;
      boolean var10;
      if (var0.bm()) {
         double var11 = (double)(var0.bh().if(ajs.a(var0.al), ajs.a(var0.ak), ajs.a(var0.aj)) + 4.0F);
         double var13 = (double)(var0.b4() + (float)var1);
         var10 = var11 < var13 * var13;
      } else {
         var10 = false;
      }

      for(int var16 = 0; var16 < 10; ++var16) {
         int var12 = var4.nextInt(2 * var1) - var1;
         int var17 = var4.nextInt(2 * var2) - var2;
         int var14 = var4.nextInt(2 * var1) - var1;
         if (var3 == null || !((double)var12 * var3.int + (double)var14 * var3.do < 0.0D)) {
            var12 += ajs.a(var0.al);
            var17 += ajs.a(var0.ak);
            var14 += ajs.a(var0.aj);
            if (!var10 || var0.do(var12, var17, var14)) {
               float var15 = var0.long(var12, var17, var14);
               if (var15 > var9) {
                  var9 = var15;
                  var6 = var12;
                  var7 = var17;
                  var8 = var14;
                  var5 = true;
               }
            }
         }
      }

      if (var5) {
         return var0.ap.do().a((double)var6, (double)var7, (double)var8);
      } else {
         return null;
      }
   }
}
