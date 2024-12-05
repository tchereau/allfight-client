import java.util.Random;

public class wf extends w2 {
   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      int var6 = var3;

      for(int var7 = var5; var4 < 128; ++var4) {
         if (var1.a(var3, var4, var5)) {
            for(int var8 = 2; var8 <= 5; ++var8) {
               if (pa.Z.for(var1, var3, var4, var5, var8)) {
                  var1.int(var3, var4, var5, pa.Z.void, 1 << apk.int[api.if[var8]], 2);
                  break;
               }
            }
         } else {
            var3 = var6 + var2.nextInt(4) - var2.nextInt(4);
            var5 = var7 + var2.nextInt(4) - var2.nextInt(4);
         }
      }

      return true;
   }
}
