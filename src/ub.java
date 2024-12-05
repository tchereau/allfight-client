import java.util.List;
import java.util.Random;

public class ub extends t1 {
   private int ag = -1;

   public ub(t4 var1, int var2, Random var3, wc var4, int var5) {
      super(var1, var2);
      this.if = var5;
      this.do = var4;
   }

   public static wc if(t4 var0, List var1, Random var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var3, var4, var5, 0, 0, 0, 3, 4, 2, var6);
      return uk.a(var1, var7) != null ? null : var7;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.ag < 0) {
         this.ag = this.if(var1, var3);
         if (this.ag < 0) {
            return true;
         }

         this.do.a(0, this.ag - this.do.for + 4 - 1, 0);
      }

      this.a(var1, var3, 0, 0, 0, 2, 3, 1, 0, 0, false);
      this.a(var1, pa.aZ.void, 0, 1, 0, 0, var3);
      this.a(var1, pa.aZ.void, 0, 1, 1, 0, var3);
      this.a(var1, pa.aZ.void, 0, 1, 2, 0, var3);
      this.a(var1, pa.bV.void, 15, 1, 3, 0, var3);
      this.a(var1, pa.bq.void, 0, 0, 3, 0, var3);
      this.a(var1, pa.bq.void, 0, 1, 3, 1, var3);
      this.a(var1, pa.bq.void, 0, 2, 3, 0, var3);
      this.a(var1, pa.bq.void, 0, 1, 3, -1, var3);
      return true;
   }
}
