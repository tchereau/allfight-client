public class af0 extends af6 implements aey {
   public af0(y6 var1) {
      super(var1);
      this.ft = "/mob/snowman.png";
      this.if(0.4F, 1.8F);
      this.bl().for(true);
      this.er.a(1, new agz(this, 0.25F, 20, 10.0F));
      this.er.a(2, new ag0(this, 0.2F));
      this.er.a(3, new ahf(this, aek.class, 6.0F));
      this.er.a(4, new ag1(this));
      this.eq.a(1, new agp(this, aig.class, 16.0F, 0, true, false, ae5.p0));
   }

   public boolean co() {
      return true;
   }

   public int b0() {
      return 4;
   }

   public void bU() {
      super.bU();
      if (this.ao()) {
         this.a(ai4.f, 1);
      }

      int var1 = ajs.a(this.al);
      int var2 = ajs.a(this.aj);
      if (this.ap.a(var1, var2).int() > 1.0F) {
         this.a(ai4.i, 1);
      }

      for(var1 = 0; var1 < 4; ++var1) {
         var2 = ajs.a(this.al + (double)((float)(var1 % 2 * 2 - 1) * 0.25F));
         int var3 = ajs.a(this.ak);
         int var4 = ajs.a(this.aj + (double)((float)(var1 / 2 % 2 * 2 - 1) * 0.25F));
         if (this.ap.new(var2, var3, var4) == 0 && this.ap.a(var2, var4).int() < 0.8F && pa.ca.case(this.ap, var2, var3, var4)) {
            this.ap.int(var2, var3, var4, pa.ca.void);
         }
      }

   }

   protected int bI() {
      return abr.cu.A;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.bm.nextInt(16);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.new(abr.cu.A, 1);
      }

   }

   public void a(aig var1, float var2) {
      aea var3 = new aea(this.ap, this);
      double var4 = var1.al - this.al;
      double var6 = var1.ak + (double)var1.af() - 1.100000023841858D - var3.ak;
      double var8 = var1.aj - this.aj;
      float var10 = ajs.int(var4 * var4 + var8 * var8) * 0.2F;
      var3.do(var4, var6 + (double)var10, var8, 1.6F, 12.0F);
      this.a("random.bow", 1.0F, 1.0F / (this.bq().nextFloat() * 0.4F + 0.8F));
      this.ap.new(var3);
   }
}
