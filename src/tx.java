import java.util.Random;

public class tx extends tw {
   private ty[] if;
   private int a;

   public tx(Random var1, int var2) {
      this.a = var2;
      this.if = new ty[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.if[var3] = new ty(var1);
      }

   }

   public double[] a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7, double var8, double var10, double var12) {
      if (var1 == null) {
         var1 = new double[var5 * var6 * var7];
      } else {
         for(int var14 = 0; var14 < var1.length; ++var14) {
            var1[var14] = 0.0D;
         }
      }

      double var27 = 1.0D;

      for(int var16 = 0; var16 < this.a; ++var16) {
         double var17 = (double)var2 * var27 * var8;
         double var19 = (double)var3 * var27 * var10;
         double var21 = (double)var4 * var27 * var12;
         long var23 = ajs.for(var17);
         long var25 = ajs.for(var21);
         var17 -= (double)var23;
         var21 -= (double)var25;
         var23 %= 16777216L;
         var25 %= 16777216L;
         var17 += (double)var23;
         var21 += (double)var25;
         this.if[var16].a(var1, var17, var19, var21, var5, var6, var7, var8 * var27, var10 * var27, var12 * var27, var27);
         var27 /= 2.0D;
      }

      return var1;
   }

   public double[] a(double[] var1, int var2, int var3, int var4, int var5, double var6, double var8, double var10) {
      return this.a(var1, var2, 10, var3, var4, 1, var5, var6, 1.0D, var8);
   }
}
