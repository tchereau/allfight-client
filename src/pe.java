import java.util.List;
import java.util.Random;

public class pe extends r0 {
   private static final String[] eU = new String[]{"deadbush", "tallgrass", "fern"};
   private ajd[] eT;

   protected pe(int var1) {
      super(var1, ts.o);
      float var2 = 0.4F;
      this.a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, 0.8F, 0.5F + var2);
   }

   public ajd if(int var1, int var2) {
      if (var2 >= this.eT.length) {
         var2 = 0;
      }

      return this.eT[var2];
   }

   public int c() {
      double var1 = 0.5D;
      double var3 = 1.0D;
      return y7.a(var1, var3);
   }

   public int a(int var1) {
      return var1 == 0 ? 16777215 : zf.a();
   }

   public int do(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      return var5 == 0 ? 16777215 : var1.a(var2, var4).try();
   }

   public int a(int var1, Random var2, int var3) {
      return var2.nextInt(8) == 0 ? abr.aG.A : -1;
   }

   public int a(int var1, Random var2) {
      return 1 + var2.nextInt(var1 * 2 + 1);
   }

   public void a(y6 var1, aek var2, int var3, int var4, int var5, int var6) {
      if (!var1.goto && var2.cD() != null && var2.cD().new == abr.aX.A) {
         var2.a((akf)aka.void[this.void], 1);
         this.a(var1, var3, var4, var5, new abp(pa.b3, 1, var6));
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }

   public int a(y6 var1, int var2, int var3, int var4) {
      return var1.for(var2, var3, var4);
   }

   public void a(int var1, acn var2, List var3) {
      for(int var4 = 1; var4 < 3; ++var4) {
         var3.add(new abp(var1, 1, var4));
      }

   }

   public void a(ajc var1) {
      this.eT = new ajd[eU.length];

      for(int var2 = 0; var2 < this.eT.length; ++var2) {
         this.eT[var2] = var1.a(eU[var2]);
      }

   }
}
