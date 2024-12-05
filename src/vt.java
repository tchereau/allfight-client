import java.util.List;
import java.util.Random;

public class vt extends vp {
   public vt(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.do = var3;
   }

   public void a(uk var1, List var2, Random var3) {
      this.a((vl)var1, var2, var3, 1, 0, true);
   }

   public static vt c(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
      return if(var7) && uk.a(var0, var7) == null ? new vt(var6, var1, var7, var5) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      this.a(var1, var3, 0, 0, 0, 4, 1, 4, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 0, 2, 0, 4, 5, 4, 0, 0, false);
      this.a(var1, var3, 0, 2, 0, 0, 5, 4, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 4, 2, 0, 4, 5, 4, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 0, 3, 1, 0, 4, 1, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 0, 3, 3, 0, 4, 3, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 4, 3, 1, 4, 4, 1, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 4, 3, 3, 4, 4, 3, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 0, 6, 0, 4, 6, 4, pa.bY.void, pa.bY.void, false);

      for(int var4 = 0; var4 <= 4; ++var4) {
         for(int var5 = 0; var5 <= 4; ++var5) {
            this.if(var1, pa.bY.void, 0, var4, -1, var5, var3);
         }
      }

      return true;
   }
}
