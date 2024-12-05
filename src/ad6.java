public class ad6 extends ad9 {
   public ad6(y6 var1) {
      super(var1);
   }

   public ad6(y6 var1, aig var2) {
      super(var1, var2);
   }

   public ad6(y6 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected void a(nt var1) {
      if (var1.do != null) {
         var1.do.a((ai4)ai4.a((aiw)this, this.a3()), 0);
      }

      for(int var2 = 0; var2 < 32; ++var2) {
         this.ap.a("portal", this.al, this.ak + this.bm.nextDouble() * 2.0D, this.aj, this.bm.nextGaussian(), 0.0D, this.bm.nextGaussian());
      }

      if (!this.ap.goto) {
         if (this.a3() != null && this.a3() instanceof ak2) {
            ak2 var3 = (ak2)this.a3();
            if (!var3.pV.d && var3.ap == this.ap) {
               this.a3().char(this.al, this.ak, this.aj);
               this.a3().aK = 0.0F;
               this.a3().a((ai4)ai4.c, 5);
            }
         }

         this.az();
      }

   }
}
