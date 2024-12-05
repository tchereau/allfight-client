public class ahm extends abr {
   public static final String[] d0 = new String[]{"EmeraudeBow_pull_0", "EmeraudeBow_pull_1", "EmeraudeBow_pull_2"};
   private ajd[] dZ;

   public ahm(int var1) {
      super(var1);
      this.y = 1;
      this.for(200);
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

         if (z1.a(z3.do.a, var1) > 0) {
            var8.e(100);
         }

         var8.if(var8.aZ() + 1.0D);
         var8.else(true);
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
      this.dZ = new ajd[d0.length];

      for(int var2 = 0; var2 < this.dZ.length; ++var2) {
         this.dZ[var2] = var1.a(d0[var2]);
      }

   }

   public ajd long(int var1) {
      return this.dZ[var1];
   }
}
