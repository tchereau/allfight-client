import java.util.List;
import java.util.Random;

public class ur extends uq {
   private final up for;

   public ur(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.for = this.a(var2);
      this.do = var3;
   }

   public void a(uk var1, List var2, Random var3) {
      this.do((ut)var1, var2, var3, 1, 1);
   }

   public static ur a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -1, -7, 0, 5, 11, 8, var5);
      return a(var7) && uk.a(var0, var7) == null ? new ur(var6, var1, var7, var5) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 10, 7, true, var2, u9.do());
         this.a(var1, var2, var3, this.for, 1, 7, 0);
         this.a(var1, var2, var3, up.if, 1, 1, 7);
         int var4 = this.do(pa.cl.void, 2);

         for(int var5 = 0; var5 < 6; ++var5) {
            this.a(var1, pa.cl.void, var4, 1, 6 - var5, 1 + var5, var3);
            this.a(var1, pa.cl.void, var4, 2, 6 - var5, 1 + var5, var3);
            this.a(var1, pa.cl.void, var4, 3, 6 - var5, 1 + var5, var3);
            if (var5 < 5) {
               this.a(var1, pa.am.void, 0, 1, 5 - var5, 1 + var5, var3);
               this.a(var1, pa.am.void, 0, 2, 5 - var5, 1 + var5, var3);
               this.a(var1, pa.am.void, 0, 3, 5 - var5, 1 + var5, var3);
            }
         }

         return true;
      }
   }
}
