import java.util.List;
import java.util.Random;

public class vq extends vp {
   private boolean F;

   public vq(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.do = var3;
   }

   public static vq long(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -2, 0, 0, 7, 8, 9, var5);
      return if(var7) && uk.a(var0, var7) == null ? new vq(var6, var1, var7, var5) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      this.a(var1, var3, 0, 2, 0, 6, 7, 7, 0, 0, false);
      this.a(var1, var3, 1, 0, 0, 5, 1, 7, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 1, 2, 1, 5, 2, 7, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 1, 3, 2, 5, 3, 7, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 1, 4, 3, 5, 4, 7, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 1, 2, 0, 1, 4, 2, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 5, 2, 0, 5, 4, 2, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 1, 5, 2, 1, 5, 3, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 5, 5, 2, 5, 5, 3, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 0, 5, 3, 0, 5, 8, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 6, 5, 3, 6, 5, 8, pa.bY.void, pa.bY.void, false);
      this.a(var1, var3, 1, 5, 8, 5, 5, 8, pa.bY.void, pa.bY.void, false);
      this.a(var1, pa.bW.void, 0, 1, 6, 3, var3);
      this.a(var1, pa.bW.void, 0, 5, 6, 3, var3);
      this.a(var1, var3, 0, 6, 3, 0, 6, 8, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 6, 6, 3, 6, 6, 8, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 1, 6, 8, 5, 7, 8, pa.bW.void, pa.bW.void, false);
      this.a(var1, var3, 2, 8, 8, 4, 8, 8, pa.bW.void, pa.bW.void, false);
      int var4;
      int var5;
      if (!this.F) {
         var4 = this.a(5);
         var5 = this.a(3, 5);
         int var6 = this.if(3, 5);
         if (var3.if(var5, var4, var6)) {
            this.F = true;
            var1.int(var5, var4, var6, pa.bm.void, 0, 2);
            oa var7 = (oa)var1.if(var5, var4, var6);
            if (var7 != null) {
               var7.o().a("Blaze");
            }
         }
      }

      for(var4 = 0; var4 <= 6; ++var4) {
         for(var5 = 0; var5 <= 6; ++var5) {
            this.if(var1, pa.bY.void, 0, var4, -1, var5, var3);
         }
      }

      return true;
   }
}
