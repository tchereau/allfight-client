import java.util.List;
import java.util.Random;

public class u4 extends uq {
   private final int n;

   public u4(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.do = var3;
      this.n = var4 != 2 && var4 != 0 ? var3.int() : var3.a();
   }

   public static wc a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      wc var7 = wc.a(var2, var3, var4, -1, -1, 0, 5, 5, 4, var5);
      uk var8 = uk.a(var0, var7);
      if (var8 == null) {
         return null;
      } else {
         if (var8.do().a == var7.a) {
            for(int var9 = 3; var9 >= 1; --var9) {
               var7 = wc.a(var2, var3, var4, -1, -1, 0, 5, 5, var9 - 1, var5);
               if (!var8.do().if(var7)) {
                  return wc.a(var2, var3, var4, -1, -1, 0, 5, 5, var9, var5);
               }
            }
         }

         return null;
      }
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         for(int var4 = 0; var4 < this.n; ++var4) {
            this.a(var1, pa.am.void, 0, 0, 0, var4, var3);
            this.a(var1, pa.am.void, 0, 1, 0, var4, var3);
            this.a(var1, pa.am.void, 0, 2, 0, var4, var3);
            this.a(var1, pa.am.void, 0, 3, 0, var4, var3);
            this.a(var1, pa.am.void, 0, 4, 0, var4, var3);

            for(int var5 = 1; var5 <= 3; ++var5) {
               this.a(var1, pa.am.void, 0, 0, var5, var4, var3);
               this.a(var1, 0, 0, 1, var5, var4, var3);
               this.a(var1, 0, 0, 2, var5, var4, var3);
               this.a(var1, 0, 0, 3, var5, var4, var3);
               this.a(var1, pa.am.void, 0, 4, var5, var4, var3);
            }

            this.a(var1, pa.am.void, 0, 0, 4, var4, var3);
            this.a(var1, pa.am.void, 0, 1, 4, var4, var3);
            this.a(var1, pa.am.void, 0, 2, 4, var4, var3);
            this.a(var1, pa.am.void, 0, 3, 4, var4, var3);
            this.a(var1, pa.am.void, 0, 4, 4, var4, var3);
         }

         return true;
      }
   }
}
