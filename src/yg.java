import java.util.Random;

public class yg extends yn {
   private w2 H;

   protected yg(int var1) {
      super(var1);
      this.H = new wq(pa.ap.void, 8);
   }

   public void a(y6 var1, Random var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      int var5 = 3 + var2.nextInt(6);

      int var6;
      int var7;
      int var8;
      for(var6 = 0; var6 < var5; ++var6) {
         var7 = var3 + var2.nextInt(16);
         var8 = var2.nextInt(28) + 4;
         int var9 = var4 + var2.nextInt(16);
         int var10 = var1.new(var7, var8, var9);
         if (var10 == pa.k.void) {
            var1.int(var7, var8, var9, pa.bp.void, 0, 2);
         }
      }

      for(var5 = 0; var5 < 7; ++var5) {
         var6 = var3 + var2.nextInt(16);
         var7 = var2.nextInt(64);
         var8 = var4 + var2.nextInt(16);
         this.H.a(var1, var2, var6, var7, var8);
      }

   }
}
