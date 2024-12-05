import java.util.Random;

public class w3 extends w2 {
   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      while(var1.a(var3, var4, var5) && var4 > 2) {
         --var4;
      }

      int var6 = var1.new(var3, var4, var5);
      if (var6 != pa.a1.void) {
         return false;
      } else {
         int var7;
         int var8;
         for(var7 = -2; var7 <= 2; ++var7) {
            for(var8 = -2; var8 <= 2; ++var8) {
               if (var1.a(var3 + var7, var4 - 1, var5 + var8) && var1.a(var3 + var7, var4 - 2, var5 + var8)) {
                  return false;
               }
            }
         }

         for(var7 = -1; var7 <= 0; ++var7) {
            for(var8 = -2; var8 <= 2; ++var8) {
               for(int var9 = -2; var9 <= 2; ++var9) {
                  var1.int(var3 + var8, var4 + var7, var5 + var9, pa.ar.void, 0, 2);
               }
            }
         }

         var1.int(var3, var4, var5, pa.bb.void, 0, 2);
         var1.int(var3 - 1, var4, var5, pa.bb.void, 0, 2);
         var1.int(var3 + 1, var4, var5, pa.bb.void, 0, 2);
         var1.int(var3, var4, var5 - 1, pa.bb.void, 0, 2);
         var1.int(var3, var4, var5 + 1, pa.bb.void, 0, 2);

         for(var7 = -2; var7 <= 2; ++var7) {
            for(var8 = -2; var8 <= 2; ++var8) {
               if (var7 == -2 || var7 == 2 || var8 == -2 || var8 == 2) {
                  var1.int(var3 + var7, var4 + 1, var5 + var8, pa.ar.void, 0, 2);
               }
            }
         }

         var1.int(var3 + 2, var4 + 1, var5, pa.bD.void, 1, 2);
         var1.int(var3 - 2, var4 + 1, var5, pa.bD.void, 1, 2);
         var1.int(var3, var4 + 1, var5 + 2, pa.bD.void, 1, 2);
         var1.int(var3, var4 + 1, var5 - 2, pa.bD.void, 1, 2);

         for(var7 = -1; var7 <= 1; ++var7) {
            for(var8 = -1; var8 <= 1; ++var8) {
               if (var7 == 0 && var8 == 0) {
                  var1.int(var3 + var7, var4 + 4, var5 + var8, pa.ar.void, 0, 2);
               } else {
                  var1.int(var3 + var7, var4 + 4, var5 + var8, pa.bD.void, 1, 2);
               }
            }
         }

         for(var7 = 1; var7 <= 3; ++var7) {
            var1.int(var3 - 1, var4 + var7, var5 - 1, pa.ar.void, 0, 2);
            var1.int(var3 - 1, var4 + var7, var5 + 1, pa.ar.void, 0, 2);
            var1.int(var3 + 1, var4 + var7, var5 - 1, pa.ar.void, 0, 2);
            var1.int(var3 + 1, var4 + var7, var5 + 1, pa.ar.void, 0, 2);
         }

         return true;
      }
   }
}
