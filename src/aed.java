public class aed extends aeg {
   public int ds = 1;

   public aed(y6 var1) {
      super(var1);
   }

   public aed(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
   }

   public aed(y6 var1, aig var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
   }

   protected void if(nt var1) {
      if (!this.ap.goto) {
         if (var1.do != null) {
            var1.do.a((ai4)ai4.a((aeg)this, this.dr), 6);
         }

         this.ap.a((aiw)null, this.al, this.ak, this.aj, (float)this.ds, true, this.ap.i().a("mobGriefing"));
         this.az();
      }

   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("ExplosionPower", this.ds);
   }

   public void try(aqv var1) {
      super.try(var1);
      if (var1.try("ExplosionPower")) {
         this.ds = var1.goto("ExplosionPower");
      }

   }
}
