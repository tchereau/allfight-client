import java.util.Random;

public class b8 extends pa {
   public b8(int var1, int var2) {
      super(var1, ts.v);
   }

   public boolean do() {
      return true;
   }

   public int a(int var1, Random var2, int var3) {
      return mod_rajouts.M.void;
   }

   public int a(Random var1) {
      return 1;
   }

   protected boolean d() {
      return true;
   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      for(int var6 = 0; var6 < 3; ++var6) {
         double var10000 = (double)((float)var2 + var5.nextFloat());
         double var9 = (double)((float)var3 + var5.nextFloat());
         var10000 = (double)((float)var4 + var5.nextFloat());
         double var11 = 0.0D;
         double var13 = 0.0D;
         double var15 = 0.0D;
         int var17 = var5.nextInt(2) * 2 - 1;
         int var18 = var5.nextInt(2) * 2 - 1;
         var11 = ((double)var5.nextFloat() - 0.5D) * 0.125D;
         var13 = ((double)var5.nextFloat() - 0.5D) * 0.125D;
         var15 = ((double)var5.nextFloat() - 0.5D) * 0.125D;
         double var19 = (double)var4 + 0.5D + 0.25D * (double)var18;
         var15 = (double)(var5.nextFloat() * 1.0F * (float)var18);
         double var21 = (double)var2 + 0.5D + 0.25D * (double)var17;
         var11 = (double)(var5.nextFloat() * 1.0F * (float)var17);
         var1.a("portal", var21, var9, var19, var11, var13, var15);
         var1.a("enchantmenttable", var21, var9, var19, var11, var13, var15);
      }

   }
}
