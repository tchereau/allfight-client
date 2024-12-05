import java.util.Random;

public class x1 extends w2 {
   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 10; ++var6) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if (var1.a(var7, var8, var9) && pa.b0.case(var1, var7, var8, var9)) {
            var1.int(var7, var8, var9, pa.b0.void, 0, 2);
         }
      }

      return true;
   }
}
