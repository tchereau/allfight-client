import java.util.List;
import java.util.Random;

public class v0 extends vp {
   private int G;

   public v0(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.do = var3;
      this.G = var2.nextInt();
   }

   public static v0 j(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -1, -3, 0, 5, 10, 8, var5);
      return if(var7) && uk.a(var0, var7) == null ? new v0(var6, var1, var7, var5) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      Random var4 = new Random((long)this.G);

      int var5;
      int var6;
      int var7;
      for(var5 = 0; var5 <= 4; ++var5) {
         for(var6 = 3; var6 <= 4; ++var6) {
            var7 = var4.nextInt(8);
            this.a(var1, var3, var5, var6, 0, var5, var6, var7, pa.bY.void, pa.bY.void, false);
         }
      }

      var5 = var4.nextInt(8);
      this.a(var1, var3, 0, 5, 0, 0, 5, var5, pa.bY.void, pa.bY.void, false);
      var5 = var4.nextInt(8);
      this.a(var1, var3, 4, 5, 0, 4, 5, var5, pa.bY.void, pa.bY.void, false);

      for(var5 = 0; var5 <= 4; ++var5) {
         var6 = var4.nextInt(5);
         this.a(var1, var3, var5, 2, 0, var5, 2, var6, pa.bY.void, pa.bY.void, false);
      }

      for(var5 = 0; var5 <= 4; ++var5) {
         for(var6 = 0; var6 <= 1; ++var6) {
            var7 = var4.nextInt(3);
            this.a(var1, var3, var5, var6, 0, var5, var6, var7, pa.bY.void, pa.bY.void, false);
         }
      }

      return true;
   }
}
