import java.util.List;
import java.util.Random;

public class pd extends r8 {
   public static boolean eb = false;

   protected pd(int var1, ts var2) {
      super(var1, var2);
      this.do(1.0F);
   }

   public n4 if(y6 var1) {
      return new n5();
   }

   public void int(yy var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, var5, 1.0F);
   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      return var5 != 0 ? false : super.int(var1, var2, var3, var4, var5);
   }

   public void a(y6 var1, int var2, int var3, int var4, nw var5, List var6, aiw var7) {
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public int a(Random var1) {
      return 0;
   }

   public void if(y6 var1, int var2, int var3, int var4, aiw var5) {
      if (var5.ar == null && var5.as == null && !var1.goto) {
         var5.f(1);
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      double var6 = (double)((float)var2 + var5.nextFloat());
      double var8 = (double)((float)var3 + 0.8F);
      double var10 = (double)((float)var4 + var5.nextFloat());
      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = 0.0D;
      var1.a("smoke", var6, var8, var10, var12, var14, var16);
   }

   public int new() {
      return -1;
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      if (!eb) {
         if (var1.n.if != 0) {
            var1.o(var2, var3, var4);
         }

      }
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return 0;
   }

   public void a(ajc var1) {
      this.an = var1.a("portal");
   }
}
