import java.util.List;
import java.util.Random;

public class vx extends vp {
   public vx(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.do = var3;
   }

   public void a(uk var1, List var2, Random var3) {
      byte var4 = 1;
      if (this.if == 1 || this.if == 2) {
         var4 = 5;
      }

      this.if((vl)var1, var2, var3, 0, var4, var3.nextInt(8) > 0);
      this.do((vl)var1, var2, var3, 0, var4, var3.nextInt(8) > 0);
   }

   public static vx g(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -3, 0, 0, 9, 7, 9, var5);
      return if(var7) && uk.a(var0, var7) == null ? new vx(var6, var1, var7, var5) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      this.a(var1, var3, 0, 0, 0, 8, 1, 8, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 0, 2, 0, 8, 5, 8, 0, 0, false);
      this.a(var1, var3, 0, 6, 0, 8, 6, 5, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 0, 2, 0, 2, 5, 0, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 6, 2, 0, 8, 5, 0, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 1, 3, 0, 1, 4, 0, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 7, 3, 0, 7, 4, 0, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 0, 2, 4, 8, 2, 8, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 1, 1, 4, 2, 2, 4, 0, 0, false);
      this.a(var1, var3, 6, 1, 4, 7, 2, 4, 0, 0, false);
      this.a(var1, var3, 0, 3, 8, 8, 3, 8, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 0, 3, 6, 0, 3, 7, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 8, 3, 6, 8, 3, 7, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 0, 3, 4, 0, 5, 5, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 8, 3, 4, 8, 5, 5, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 1, 3, 5, 2, 5, 5, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 6, 3, 5, 7, 5, 5, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 1, 4, 5, 1, 5, 5, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 7, 4, 5, 7, 5, 5, pa.bW.void, pa.bW.void, false);

      for(int var4 = 0; var4 <= 5; ++var4) {
         for(int var5 = 0; var5 <= 8; ++var5) {
            this.if(var1, pa.bY.void, 0, var5, -1, var4, var3);
         }
      }

      return true;
   }
}
