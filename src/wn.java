import java.util.Random;

public class wn extends w2 {
   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 20; ++var6) {
         int var7 = var3 + var2.nextInt(4) - var2.nextInt(4);
         int var8 = var4;
         int var9 = var5 + var2.nextInt(4) - var2.nextInt(4);
         if (var1.a(var7, var4, var9) && (var1.byte(var7 - 1, var4 - 1, var9) == ts.s || var1.byte(var7 + 1, var4 - 1, var9) == ts.s || var1.byte(var7, var4 - 1, var9 - 1) == ts.s || var1.byte(var7, var4 - 1, var9 + 1) == ts.s)) {
            int var10 = 2 + var2.nextInt(var2.nextInt(3) + 1);

            for(int var11 = 0; var11 < var10; ++var11) {
               if (pa.a5.try(var1, var7, var8 + var11, var9)) {
                  var1.int(var7, var8 + var11, var9, pa.a5.void, 0, 2);
               }
            }
         }
      }

      return true;
   }
}
