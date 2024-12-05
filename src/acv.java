public class acv extends abr {
   public static final String[] dM = new String[]{"bow_pull_0", "bow_pull_1", "bow_pull_2"};
   private ajd[] dL;

   public acv(int var1) {
      super(var1);
      this.y = 1;
      this.for(384);
      this.a((acn)acn.case);
   }

   public void a(abp var1, y6 var2, aek var3, int var4) {
      boolean var5 = var3.fY.new || z1.a(z3.if.a, var1) > 0;
      if (var5 || var3.fR.void(abr.T.A)) {
         int var6 = this.a(var1) - var4;
         float var7 = (float)var6 / 20.0F;
         var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;
         if ((double)var7 < 0.1D) {
            return;
         }

         if (var7 > 1.0F) {
            var7 = 1.0F;
         }

         aei var8 = new aei(var2, var3, var7 * 2.0F);
         if (var7 == 1.0F) {
            var8.char(true);
         }

         int var9 = z1.a(z3.int.a, var1);
         if (var9 > 0) {
            var8.if(var8.aZ() + (double)var9 * 0.5D + 0.5D);
         }

         int var10 = z1.a(z3.for.a, var1);
         if (var10 > 0) {
            var8.l(var10);
         }

         if (z1.a(z3.do.a, var1) > 0) {
            var8.e(100);
         }

         var1.a(1, (aig)var3);
         var2.a((aiw)var3, "random.bow", 1.0F, 1.0F / (aj.nextFloat() * 0.4F + 1.2F) + var7 * 0.5F);
         if (var5) {
            var8.cI = 2;
         } else {
            var3.fR.case(abr.T.A);
         }

         if (!var2.goto) {
            var2.new(var8);
         }
      }

   }

   public abp do(abp var1, y6 var2, aek var3) {
      return var1;
   }

   public int a(abp var1) {
      return 72000;
   }

   public aax else(abp var1) {
      return aax.int;
   }

   public abp a(abp var1, y6 var2, aek var3) {
      if (var3.fY.new || var3.fR.void(abr.T.A)) {
         var3.do(var1, this.a(var1));
      }

      return var1;
   }

   public int d() {
      return 1;
   }

   public void a(ajc var1) {
      super.a(var1);
      this.dL = new ajd[dM.length];

      for(int var2 = 0; var2 < this.dL.length; ++var2) {
         this.dL[var2] = var1.a(dM[var2]);
      }

   }

   public ajd char(int var1) {
      return this.dL[var1];
   }
}
