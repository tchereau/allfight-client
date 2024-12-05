import java.util.List;
import java.util.Random;

public class vy extends vp {
   public vy(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.do = var3;
   }

   public void a(uk var1, List var2, Random var3) {
      this.a((vl)var1, var2, var3, 1, 0, true);
   }

   public static vy h(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -1, -7, 0, 5, 14, 10, var5);
      return if(var7) && uk.a(var0, var7) == null ? new vy(var6, var1, var7, var5) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      int var4 = this.do(pa.bU.void, 2);

      for(int var5 = 0; var5 <= 9; ++var5) {
         int var6 = Math.max(1, 7 - var5);
         int var7 = Math.min(Math.max(var6 + 5, 14 - var5), 13);
         int var8 = var5;
         this.a(var1, var3, 0, 0, var5, 4, var6, var5, pa.bY.void, pa.bY.void, false);
         this.a(var1, var3, 1, var6 + 1, var5, 3, var7 - 1, var5, 0, 0, false);
         if (var5 <= 6) {
            this.a(var1, pa.bU.void, var4, 1, var6 + 1, var5, var3);
            this.a(var1, pa.bU.void, var4, 2, var6 + 1, var5, var3);
            this.a(var1, pa.bU.void, var4, 3, var6 + 1, var5, var3);
         }

         this.a(var1, var3, 0, var7, var5, 4, var7, var5, pa.bY.void, pa.bY.void, false);
         this.a(var1, var3, 0, var6 + 1, var5, 0, var7 - 1, var5, pa.bY.void, pa.bY.void, false);
         this.a(var1, var3, 4, var6 + 1, var5, 4, var7 - 1, var5, pa.bY.void, pa.bY.void, false);
         if ((var5 & 1) == 0) {
            this.a(var1, var3, 0, var6 + 2, var5, 0, var6 + 3, var5, pa.bW.void, pa.bW.void, false);
            this.a(var1, var3, 4, var6 + 2, var5, 4, var6 + 3, var5, pa.bW.void, pa.bW.void, false);
         }

         for(int var9 = 0; var9 <= 4; ++var9) {
            this.if(var1, pa.bY.void, 0, var9, -1, var8, var3);
         }
      }

      return true;
   }
}
