public class afz extends afx {
   public float rg = 0.0F;
   public float re = 0.0F;
   public float rc = 0.0F;
   public float ra = 0.0F;
   public float q8 = 0.0F;
   public float q6 = 0.0F;
   public float q4 = 0.0F;
   public float rf = 0.0F;
   private float rd = 0.0F;
   private float rb = 0.0F;
   private float q9 = 0.0F;
   private float q7 = 0.0F;
   private float q5 = 0.0F;
   private float q3 = 0.0F;

   public afz(y6 var1) {
      super(var1);
      this.ft = "/mob/squid.png";
      this.if(0.95F, 0.95F);
      this.rb = 1.0F / (this.bm.nextFloat() + 1.0F) * 0.2F;
   }

   public int b0() {
      return 10;
   }

   protected String b2() {
      return null;
   }

   protected String bX() {
      return null;
   }

   protected String bS() {
      return null;
   }

   protected float bR() {
      return 0.4F;
   }

   protected int bI() {
      return 0;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.bm.nextInt(3 + var2) + 1;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.a(new abp(abr.b9, 1, 0), 0.0F);
      }

   }

   public boolean ap() {
      return this.ap.a((nw)this.aZ.do(0.0D, -0.6000000238418579D, 0.0D), (ts)ts.s, (aiw)this);
   }

   public void bU() {
      super.bU();
      this.re = this.rg;
      this.ra = this.rc;
      this.q6 = this.q8;
      this.rf = this.q4;
      this.q8 += this.rb;
      if (this.q8 > 6.2831855F) {
         this.q8 -= 6.2831855F;
         if (this.bm.nextInt(10) == 0) {
            this.rb = 1.0F / (this.bm.nextFloat() + 1.0F) * 0.2F;
         }
      }

      if (this.ap()) {
         float var1;
         if (this.q8 < 3.1415927F) {
            var1 = this.q8 / 3.1415927F;
            this.q4 = ajs.try(var1 * var1 * 3.1415927F) * 3.1415927F * 0.25F;
            if ((double)var1 > 0.75D) {
               this.rd = 1.0F;
               this.q9 = 1.0F;
            } else {
               this.q9 *= 0.8F;
            }
         } else {
            this.q4 = 0.0F;
            this.rd *= 0.9F;
            this.q9 *= 0.99F;
         }

         if (!this.ap.goto) {
            this.ai = (double)(this.q7 * this.rd);
            this.ah = (double)(this.q5 * this.rd);
            this.ag = (double)(this.q3 * this.rd);
         }

         var1 = ajs.int(this.ai * this.ai + this.ag * this.ag);
         this.eH += (-((float)Math.atan2(this.ai, this.ag)) * 180.0F / 3.1415927F - this.eH) * 0.1F;
         this.a5 = this.eH;
         this.rc += 3.1415927F * this.q9 * 1.5F;
         this.rg += (-((float)Math.atan2((double)var1, this.ah)) * 180.0F / 3.1415927F - this.rg) * 0.1F;
      } else {
         this.q4 = ajs.do(ajs.try(this.q8)) * 3.1415927F * 0.25F;
         if (!this.ap.goto) {
            this.ai = 0.0D;
            this.ah -= 0.08D;
            this.ah *= 0.9800000190734863D;
            this.ag = 0.0D;
         }

         this.rg = (float)((double)this.rg + (double)(-90.0F - this.rg) * 0.02D);
      }

   }

   public void int(float var1, float var2) {
      this.do(this.ai, this.ah, this.ag);
   }

   protected void cl() {
      ++this.e8;
      if (this.e8 > 100) {
         this.q7 = this.q5 = this.q3 = 0.0F;
      } else if (this.bm.nextInt(50) == 0 || !this.bj || this.q7 == 0.0F && this.q5 == 0.0F && this.q3 == 0.0F) {
         float var1 = this.bm.nextFloat() * 3.1415927F * 2.0F;
         this.q7 = ajs.for(var1) * 0.2F;
         this.q5 = -0.1F + this.bm.nextFloat() * 0.2F;
         this.q3 = ajs.try(var1) * 0.2F;
      }

      this.bC();
   }

   public boolean bj() {
      return this.ak > 45.0D && this.ak < 63.0D && super.bj();
   }
}
