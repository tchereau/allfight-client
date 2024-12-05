import java.util.Random;

public class ps extends rk {
   public static final double[] d9 = new double[]{-0.0625D, 0.0625D, 0.1875D, 0.3125D};
   private static final int[] ea = new int[]{1, 2, 3, 4};

   protected ps(int var1, boolean var2) {
      super(var1, var2);
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      int var10 = var1.for(var2, var3, var4);
      int var11 = (var10 & 12) >> 2;
      var11 = var11 + 1 << 2 & 12;
      var1.do(var2, var3, var4, var11 | var10 & 3, 3);
      return true;
   }

   protected int t(int var1) {
      return ea[(var1 & 12) >> 2] * 2;
   }

   protected rk x() {
      return pa.ay;
   }

   protected rk w() {
      return pa.aB;
   }

   public int a(int var1, Random var2, int var3) {
      return abr.a3.A;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return abr.a3.A;
   }

   public int new() {
      return 15;
   }

   public boolean case(yy var1, int var2, int var3, int var4, int var5) {
      return this.else(var1, var2, var3, var4, var5) > 0;
   }

   protected boolean w(int var1) {
      return u(var1);
   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      if (this.d8) {
         int var6 = var1.for(var2, var3, var4);
         int var7 = r(var6);
         double var8 = (double)((float)var2 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         double var10 = (double)((float)var3 + 0.4F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         double var12 = (double)((float)var4 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         double var14 = 0.0D;
         double var16 = 0.0D;
         if (var5.nextInt(2) == 0) {
            switch(var7) {
            case 0:
               var16 = -0.3125D;
               break;
            case 1:
               var14 = 0.3125D;
               break;
            case 2:
               var16 = 0.3125D;
               break;
            case 3:
               var14 = -0.3125D;
            }
         } else {
            int var18 = (var6 & 12) >> 2;
            switch(var7) {
            case 0:
               var16 = d9[var18];
               break;
            case 1:
               var14 = -d9[var18];
               break;
            case 2:
               var16 = -d9[var18];
               break;
            case 3:
               var14 = d9[var18];
            }
         }

         var1.a("reddust", var8 + var14, var10, var12 + var16, 0.0D, 0.0D, 0.0D);
      }
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      super.do(var1, var2, var3, var4, var5, var6);
      this.D(var1, var2, var3, var4);
   }
}
