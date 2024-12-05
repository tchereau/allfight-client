public class aev extends aig implements ae5 {
   private static final float[] p3 = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public float p1;
   public float p5;
   public float p4;
   private int p2 = 0;

   public aev(y6 var1) {
      super(var1);
      this.ft = "/mob/slime.png";
      int var2 = 1 << this.bm.nextInt(3);
      this.aQ = 0.0F;
      this.p2 = this.bm.nextInt(20) + 10;
      this.ag(var2);
   }

   protected void X() {
      super.X();
      this.bg.a(16, new Byte((byte)1));
   }

   protected void ag(int var1) {
      this.bg.if(16, new Byte((byte)var1));
      this.if(0.6F * (float)var1, 0.6F * (float)var1);
      this.try(this.al, this.ak, this.aj);
      this.t(this.b0());
      this.eB = var1;
   }

   public int b0() {
      int var1 = this.eQ();
      return var1 * var1;
   }

   public int eQ() {
      return this.bg.for(16);
   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("Size", this.eQ() - 1);
   }

   public void try(aqv var1) {
      super.try(var1);
      this.ag(var1.goto("Size") + 1);
   }

   protected String eT() {
      return "slime";
   }

   protected String eW() {
      return "mob.slime." + (this.eQ() > 1 ? "big" : "small");
   }

   public void aC() {
      if (!this.ap.goto && this.ap.p == 0 && this.eQ() > 0) {
         this.aR = true;
      }

      this.p5 += (this.p1 - this.p5) * 0.5F;
      this.p4 = this.p5;
      boolean var1 = this.aY;
      super.aC();
      int var2;
      if (this.aY && !var1) {
         var2 = this.eQ();

         for(int var3 = 0; var3 < var2 * 8; ++var3) {
            float var4 = this.bm.nextFloat() * 3.1415927F * 2.0F;
            float var5 = this.bm.nextFloat() * 0.5F + 0.5F;
            float var6 = ajs.try(var4) * (float)var2 * 0.5F * var5;
            float var7 = ajs.for(var4) * (float)var2 * 0.5F * var5;
            this.ap.a(this.eT(), this.al + (double)var6, this.aZ.a, this.aj + (double)var7, 0.0D, 0.0D, 0.0D);
         }

         if (this.eU()) {
            this.a(this.eW(), this.bR(), ((this.bm.nextFloat() - this.bm.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         }

         this.p1 = -0.5F;
      } else if (!this.aY && var1) {
         this.p1 = 1.0F;
      }

      this.eP();
      if (this.ap.goto) {
         var2 = this.eQ();
         this.if(0.6F * (float)var2, 0.6F * (float)var2);
      }

   }

   protected void cl() {
      this.bC();
      aek var1 = this.ap.a(this, 16.0D);
      if (var1 != null) {
         this.a(var1, 10.0F, 20.0F);
      }

      if (this.aY && this.p2-- <= 0) {
         this.p2 = this.eS();
         if (var1 != null) {
            this.p2 /= 3;
         }

         this.e4 = true;
         if (this.eY()) {
            this.a(this.eW(), this.bR(), ((this.bm.nextFloat() - this.bm.nextFloat()) * 0.2F + 1.0F) * 0.8F);
         }

         this.e7 = 1.0F - this.bm.nextFloat() * 2.0F;
         this.e6 = (float)(1 * this.eQ());
      } else {
         this.e4 = false;
         if (this.aY) {
            this.e7 = this.e6 = 0.0F;
         }
      }

   }

   protected void eP() {
      this.p1 *= 0.6F;
   }

   protected int eS() {
      return this.bm.nextInt(20) + 10;
   }

   protected aev eX() {
      return new aev(this.ap);
   }

   public void az() {
      int var1 = this.eQ();
      if (!this.ap.goto && var1 > 1 && this.cd() <= 0) {
         int var2 = 2 + this.bm.nextInt(3);

         for(int var3 = 0; var3 < var2; ++var3) {
            float var4 = ((float)(var3 % 2) - 0.5F) * (float)var1 / 4.0F;
            float var5 = ((float)(var3 / 2) - 0.5F) * (float)var1 / 4.0F;
            aev var6 = this.eX();
            var6.ag(var1 / 2);
            var6.if(this.al + (double)var4, this.ak + 0.5D, this.aj + (double)var5, this.bm.nextFloat() * 360.0F, 0.0F);
            this.ap.new(var6);
         }
      }

      super.az();
   }

   public void do(aek var1) {
      if (this.eR()) {
         int var2 = this.eQ();
         if (this.void(var1) && this.for(var1) < 0.6D * (double)var2 * 0.6D * (double)var2 && var1.a(ai4.a((aig)this), this.eV())) {
            this.a("mob.attack", 1.0F, (this.bm.nextFloat() - this.bm.nextFloat()) * 0.2F + 1.0F);
         }
      }

   }

   protected boolean eR() {
      return this.eQ() > 1;
   }

   protected int eV() {
      return this.eQ();
   }

   protected String bX() {
      return "mob.slime." + (this.eQ() > 1 ? "big" : "small");
   }

   protected String bS() {
      return "mob.slime." + (this.eQ() > 1 ? "big" : "small");
   }

   protected int bI() {
      return this.eQ() == 1 ? abr.cl.A : 0;
   }

   public boolean bj() {
      xx var1 = this.ap.try(ajs.a(this.al), ajs.a(this.aj));
      if (this.ap.l().new() == yx.byte && this.bm.nextInt(4) != 1) {
         return false;
      } else {
         if (this.eQ() == 1 || this.ap.p > 0) {
            yn var2 = this.ap.a(ajs.a(this.al), ajs.a(this.aj));
            if (var2 == yn.z && this.ak > 50.0D && this.ak < 70.0D && this.bm.nextFloat() < 0.5F && this.bm.nextFloat() < p3[this.ap.r()] && this.ap.h(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj)) <= this.bm.nextInt(8)) {
               return super.bj();
            }

            if (this.bm.nextInt(10) == 0 && var1.a(987234911L).nextInt(10) == 0 && this.ak < 40.0D) {
               return super.bj();
            }
         }

         return false;
      }
   }

   protected float bR() {
      return 0.4F * (float)this.eQ();
   }

   public int bJ() {
      return 0;
   }

   protected boolean eY() {
      return this.eQ() > 0;
   }

   protected boolean eU() {
      return this.eQ() > 2;
   }
}
