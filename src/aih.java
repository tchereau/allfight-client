public class aih extends aii {
   private float r3 = 1.0F;

   public aih(y6 var1) {
      super(var1);
   }

   public aih(y6 var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
      this.aA(var5);
   }

   protected void X() {
      this.ab().a(2, 5);
      this.ab().a(3, (byte)0);
   }

   public int fQ() {
      return 9;
   }

   public int fR() {
      return 9;
   }

   public boolean a(double var1) {
      double var3 = 16.0D;
      var3 *= 64.0D * this.au;
      return var1 < var3 * var3;
   }

   public void fS() {
      this.a(new abp(abr.bN), 0.0F);
      abp var1 = this.fU();
      if (var1 != null && this.bm.nextFloat() < this.r3) {
         var1 = var1.n();
         var1.a((aih)null);
         this.a(var1, 0.0F);
      }

   }

   public abp fU() {
      return this.ab().new(2);
   }

   public void void(abp var1) {
      var1 = var1.n();
      var1.if = 1;
      var1.a(this);
      this.ab().if(2, var1);
      this.ab().do(2);
   }

   public int fV() {
      return this.ab().for(3);
   }

   public void aB(int var1) {
      this.ab().if(3, (byte)(var1 % 4));
   }

   public void for(aqv var1) {
      if (this.fU() != null) {
         var1.a("Item", this.fU().if(new aqv()));
         var1.a("ItemRotation", (byte)this.fV());
         var1.a("ItemDropChance", this.r3);
      }

      super.for(var1);
   }

   public void try(aqv var1) {
      aqv var2 = var1.char("Item");
      if (var2 != null && !var2.int()) {
         this.void(abp.for(var2));
         this.aB(var1.else("ItemRotation"));
         if (var1.try("ItemDropChance")) {
            this.r3 = var1.b("ItemDropChance");
         }
      }

      super.try(var1);
   }

   public boolean for(aek var1) {
      if (this.fU() == null) {
         abp var2 = var1.bW();
         if (var2 != null && !this.ap.goto) {
            this.void(var2);
            if (!var1.fY.new && --var2.if <= 0) {
               var1.fR.if(var1.fR.aa, (abp)null);
            }
         }
      } else if (!this.ap.goto) {
         this.aB(this.fV() + 1);
      }

      return true;
   }
}
