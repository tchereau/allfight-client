public class ae3 extends aij implements ae5 {
   public int qe = 0;
   public double qd;
   public double qc;
   public double qb;
   private aiw p8 = null;
   private int p7 = 0;
   public int qa = 0;
   public int p9 = 0;
   private int p6 = 1;

   public ae3(y6 var1) {
      super(var1);
      this.ft = "/mob/ghast.png";
      this.if(4.0F, 4.0F);
      this.bh = true;
      this.eB = 5;
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else if ("fireball".equals(var1.else()) && var1.new() instanceof aek) {
         super.a(var1, 1000);
         ((aek)var1.new()).a((akf)akk.if);
         return true;
      } else {
         return super.a(var1, var2);
      }
   }

   protected void X() {
      super.X();
      this.bg.a(16, (byte)0);
   }

   public int b0() {
      return 10;
   }

   public void aC() {
      super.aC();
      byte var1 = this.bg.for(16);
      this.ft = var1 == 1 ? "/mob/ghast_fire.png" : "/mob/ghast.png";
   }

   protected void cl() {
      if (!this.ap.goto && this.ap.p == 0) {
         this.az();
      }

      this.bC();
      this.qa = this.p9;
      double var1 = this.qd - this.al;
      double var3 = this.qc - this.ak;
      double var5 = this.qb - this.aj;
      double var7 = var1 * var1 + var3 * var3 + var5 * var5;
      if (var7 < 1.0D || var7 > 3600.0D) {
         this.qd = this.al + (double)((this.bm.nextFloat() * 2.0F - 1.0F) * 16.0F);
         this.qc = this.ak + (double)((this.bm.nextFloat() * 2.0F - 1.0F) * 16.0F);
         this.qb = this.aj + (double)((this.bm.nextFloat() * 2.0F - 1.0F) * 16.0F);
      }

      if (this.qe-- <= 0) {
         this.qe += this.bm.nextInt(5) + 2;
         var7 = (double)ajs.int(var7);
         if (this.a(this.qd, this.qc, this.qb, var7)) {
            this.ai += var1 / var7 * 0.1D;
            this.ah += var3 / var7 * 0.1D;
            this.ag += var5 / var7 * 0.1D;
         } else {
            this.qd = this.al;
            this.qc = this.ak;
            this.qb = this.aj;
         }
      }

      if (this.p8 != null && this.p8.aR) {
         this.p8 = null;
      }

      if (this.p8 == null || this.p7-- <= 0) {
         this.p8 = this.ap.a(this, 100.0D);
         if (this.p8 != null) {
            this.p7 = 20;
         }
      }

      double var9 = 64.0D;
      if (this.p8 != null && this.p8.for((aiw)this) < var9 * var9) {
         double var11 = this.p8.al - this.al;
         double var13 = this.p8.aZ.a + (double)(this.p8.aO / 2.0F) - (this.ak + (double)(this.aO / 2.0F));
         double var15 = this.p8.aj - this.aj;
         this.eH = this.a5 = -((float)Math.atan2(var11, var15)) * 180.0F / 3.1415927F;
         if (this.void(this.p8)) {
            if (this.p9 == 10) {
               this.ap.a((aek)null, 1007, (int)this.al, (int)this.ak, (int)this.aj, 0);
            }

            ++this.p9;
            if (this.p9 == 20) {
               this.ap.a((aek)null, 1008, (int)this.al, (int)this.ak, (int)this.aj, 0);
               aed var17 = new aed(this.ap, this, var11, var13, var15);
               var17.ds = this.p6;
               double var18 = 4.0D;
               nr var20 = this.b(1.0F);
               var17.al = this.al + var20.int * var18;
               var17.ak = this.ak + (double)(this.aO / 2.0F) + 0.5D;
               var17.aj = this.aj + var20.do * var18;
               this.ap.new(var17);
               this.p9 = -40;
            }
         } else if (this.p9 > 0) {
            --this.p9;
         }
      } else {
         this.eH = this.a5 = -((float)Math.atan2(this.ai, this.ag)) * 180.0F / 3.1415927F;
         if (this.p9 > 0) {
            --this.p9;
         }
      }

      if (!this.ap.goto) {
         byte var21 = this.bg.for(16);
         byte var12 = (byte)(this.p9 > 10 ? 1 : 0);
         if (var21 != var12) {
            this.bg.if(16, var12);
         }
      }

   }

   private boolean a(double var1, double var3, double var5, double var7) {
      double var9 = (this.qd - this.al) / var7;
      double var11 = (this.qc - this.ak) / var7;
      double var13 = (this.qb - this.aj) / var7;
      nw var15 = this.aZ.do();

      for(int var16 = 1; (double)var16 < var7; ++var16) {
         var15.if(var9, var11, var13);
         if (!this.ap.if((aiw)this, (nw)var15).isEmpty()) {
            return false;
         }
      }

      return true;
   }

   protected String b2() {
      return "mob.ghast.moan";
   }

   protected String bX() {
      return "mob.ghast.scream";
   }

   protected String bS() {
      return "mob.ghast.death";
   }

   protected int bI() {
      return abr.aS.A;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.bm.nextInt(2) + this.bm.nextInt(1 + var2);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.new(abr.aB.A, 1);
      }

      var3 = this.bm.nextInt(3) + this.bm.nextInt(1 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         this.new(abr.aS.A, 1);
      }

   }

   protected float bR() {
      return 10.0F;
   }

   public boolean bj() {
      return this.bm.nextInt(20) == 0 && super.bj() && this.ap.p > 0;
   }

   public int b6() {
      return 1;
   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("ExplosionPower", this.p6);
   }

   public void try(aqv var1) {
      super.try(var1);
      if (var1.try("ExplosionPower")) {
         this.p6 = var1.goto("ExplosionPower");
      }

   }
}
