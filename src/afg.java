public class afg extends afj {
   private int ss = 0;
   public double sr;
   public double sq;

   public afg(y6 var1) {
      super(var1);
   }

   public afg(y6 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public int f3() {
      return 2;
   }

   protected void X() {
      super.X();
      this.bg.a(16, new Byte((byte)0));
   }

   public void aC() {
      super.aC();
      if (this.ss > 0) {
         --this.ss;
      }

      if (this.ss <= 0) {
         this.sr = this.sq = 0.0D;
      }

      this.K(this.ss > 0);
      if (this.gf() && this.bm.nextInt(4) == 0) {
         this.ap.a("largesmoke", this.al, this.ak + 0.8D, this.aj, 0.0D, 0.0D, 0.0D);
      }

   }

   public void if(ai4 var1) {
      super.if(var1);
      if (!var1.long()) {
         this.a(new abp(pa.cr, 1), 0.0F);
      }

   }

   protected void a(int var1, int var2, int var3, double var4, double var6, int var8, int var9) {
      super.a(var1, var2, var3, var4, var6, var8, var9);
      double var10 = this.sr * this.sr + this.sq * this.sq;
      if (var10 > 1.0E-4D && this.ai * this.ai + this.ag * this.ag > 0.001D) {
         var10 = (double)ajs.int(var10);
         this.sr /= var10;
         this.sq /= var10;
         if (this.sr * this.ai + this.sq * this.ag < 0.0D) {
            this.sr = 0.0D;
            this.sq = 0.0D;
         } else {
            this.sr = this.ai;
            this.sq = this.ag;
         }
      }

   }

   protected void f8() {
      double var1 = this.sr * this.sr + this.sq * this.sq;
      if (var1 > 1.0E-4D) {
         var1 = (double)ajs.int(var1);
         this.sr /= var1;
         this.sq /= var1;
         double var3 = 0.05D;
         this.ai *= 0.800000011920929D;
         this.ah *= 0.0D;
         this.ag *= 0.800000011920929D;
         this.ai += this.sr * var3;
         this.ag += this.sq * var3;
      } else {
         this.ai *= 0.9800000190734863D;
         this.ah *= 0.0D;
         this.ag *= 0.9800000190734863D;
      }

      super.f8();
   }

   public boolean for(aek var1) {
      abp var2 = var1.fR.L();
      if (var2 != null && var2.new == abr.R.A) {
         if (--var2.if == 0) {
            var1.fR.if(var1.fR.aa, (abp)null);
         }

         this.ss += 3600;
      }

      this.sr = this.al - var1.al;
      this.sq = this.aj - var1.aj;
      return true;
   }

   protected void for(aqv var1) {
      super.for(var1);
      var1.a("PushX", this.sr);
      var1.a("PushZ", this.sq);
      var1.a("Fuel", (short)this.ss);
   }

   protected void try(aqv var1) {
      super.try(var1);
      this.sr = var1.c("PushX");
      this.sq = var1.c("PushZ");
      this.ss = var1.case("Fuel");
   }

   protected boolean gf() {
      return (this.bg.for(16) & 1) != 0;
   }

   protected void K(boolean var1) {
      if (var1) {
         this.bg.if(16, (byte)(this.bg.for(16) | 1));
      } else {
         this.bg.if(16, (byte)(this.bg.for(16) & -2));
      }

   }

   public pa f6() {
      return pa.cq;
   }

   public int f0() {
      return 2;
   }
}
