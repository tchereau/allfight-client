import java.util.Random;

public class pw extends pa {
   private boolean dh;

   public pw(int var1, boolean var2) {
      super(var1, ts.v);
      if (var2) {
         this.a(true);
      }

      this.dh = var2;
   }

   public int a(y6 var1) {
      return 30;
   }

   public void a(y6 var1, int var2, int var3, int var4, aek var5) {
      this.h(var1, var2, var3, var4);
      super.a(var1, var2, var3, var4, var5);
   }

   public void a(y6 var1, int var2, int var3, int var4, aiw var5) {
      this.h(var1, var2, var3, var4);
      super.a(var1, var2, var3, var4, var5);
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      this.h(var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   private void h(y6 var1, int var2, int var3, int var4) {
      this.g(var1, var2, var3, var4);
      if (this.void == pa.cf.void) {
         var1.int(var2, var3, var4, pa.ce.void);
      }

   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (this.void == pa.ce.void) {
         var1.int(var2, var3, var4, pa.cf.void);
      }

   }

   public int a(int var1, Random var2, int var3) {
      return abr.cv.A;
   }

   public int a(int var1, Random var2) {
      return this.a(var2) + var2.nextInt(var1 + 1);
   }

   public int a(Random var1) {
      return 4 + var1.nextInt(2);
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      if (this.a(var5, var1.o, var7) != this.void) {
         int var8 = 1 + var1.o.nextInt(5);
         this.do(var1, var2, var3, var4, var8);
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      if (this.dh) {
         this.g(var1, var2, var3, var4);
      }

   }

   private void g(y6 var1, int var2, int var3, int var4) {
      Random var5 = var1.o;
      double var6 = 0.0625D;

      for(int var8 = 0; var8 < 6; ++var8) {
         double var9 = (double)((float)var2 + var5.nextFloat());
         double var11 = (double)((float)var3 + var5.nextFloat());
         double var13 = (double)((float)var4 + var5.nextFloat());
         if (var8 == 0 && !var1.do(var2, var3 + 1, var4)) {
            var11 = (double)(var3 + 1) + var6;
         }

         if (var8 == 1 && !var1.do(var2, var3 - 1, var4)) {
            var11 = (double)(var3 + 0) - var6;
         }

         if (var8 == 2 && !var1.do(var2, var3, var4 + 1)) {
            var13 = (double)(var4 + 1) + var6;
         }

         if (var8 == 3 && !var1.do(var2, var3, var4 - 1)) {
            var13 = (double)(var4 + 0) - var6;
         }

         if (var8 == 4 && !var1.do(var2 + 1, var3, var4)) {
            var9 = (double)(var2 + 1) + var6;
         }

         if (var8 == 5 && !var1.do(var2 - 1, var3, var4)) {
            var9 = (double)(var2 + 0) - var6;
         }

         if (var9 < (double)var2 || var9 > (double)(var2 + 1) || var11 < 0.0D || var11 > (double)(var3 + 1) || var13 < (double)var4 || var13 > (double)(var4 + 1)) {
            var1.a("reddust", var9, var11, var13, 0.0D, 0.0D, 0.0D);
         }
      }

   }

   protected abp int(int var1) {
      return new abp(pa.cf);
   }
}
