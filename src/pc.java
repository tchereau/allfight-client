import java.util.List;
import java.util.Random;

public class pc extends pa {
   private ajd c1;
   private ajd c0;

   public pc(int var1) {
      super(var1, ts.v);
   }

   public ajd if(int var1, int var2) {
      if (var1 == 1) {
         return this.c1;
      } else {
         return var1 == 0 ? pa.bG.do(var1) : this.an;
      }
   }

   public void a(ajc var1) {
      this.an = var1.a("endframe_side");
      this.c1 = var1.a("endframe_top");
      this.c0 = var1.a("endframe_eye");
   }

   public ajd u() {
      return this.c0;
   }

   public boolean do() {
      return false;
   }

   public int new() {
      return 26;
   }

   public void try() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
   }

   public void a(y6 var1, int var2, int var3, int var4, nw var5, List var6, aiw var7) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      int var8 = var1.for(var2, var3, var4);
      if (e(var8)) {
         this.a(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

      this.try();
   }

   public static boolean e(int var0) {
      return (var0 & 4) != 0;
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      int var7 = ((ajs.a((double)(var5.a5 * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
      var1.do(var2, var3, var4, var7, 2);
   }
}
