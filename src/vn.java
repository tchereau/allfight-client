import java.util.List;
import java.util.Random;

public class vn extends vp {
   public vn(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.do = var3;
   }

   public void a(uk var1, List var2, Random var3) {
      this.a((vl)var1, var2, var3, 2, 0, false);
      this.if((vl)var1, var2, var3, 0, 2, false);
      this.do((vl)var1, var2, var3, 0, 2, false);
   }

   public static vn goto(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -2, 0, 0, 7, 9, 7, var5);
      return if(var7) && uk.a(var0, var7) == null ? new vn(var6, var1, var7, var5) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      this.a(var1, var3, 0, 0, 0, 6, 1, 6, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 0, 2, 0, 6, 7, 6, 0, 0, false);
      this.a(var1, var3, 0, 2, 0, 1, 6, 0, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 0, 2, 6, 1, 6, 6, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 5, 2, 0, 6, 6, 0, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 5, 2, 6, 6, 6, 6, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 0, 2, 0, 0, 6, 1, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 0, 2, 5, 0, 6, 6, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 6, 2, 0, 6, 6, 1, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 6, 2, 5, 6, 6, 6, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 2, 6, 0, 4, 6, 0, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 2, 5, 0, 4, 5, 0, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 2, 6, 6, 4, 6, 6, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 2, 5, 6, 4, 5, 6, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 0, 6, 2, 0, 6, 4, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 0, 5, 2, 0, 5, 4, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 6, 6, 2, 6, 6, 4, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 6, 5, 2, 6, 5, 4, pa.bW.void, pa.bW.void, false);

      for(int var4 = 0; var4 <= 6; ++var4) {
         for(int var5 = 0; var5 <= 6; ++var5) {
            this.if(var1, pa.bY.void, 0, var4, -1, var5, var3);
         }
      }

      return true;
   }
}
