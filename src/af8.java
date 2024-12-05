public class af8 extends af9 {
   public boolean rw = false;
   public float rv = 0.0F;
   public float ru = 0.0F;
   public float rt;
   public float rs;
   public float rr = 1.0F;
   public int rq;

   public af8(y6 var1) {
      super(var1);
      this.ft = "/mob/chicken.png";
      this.if(0.3F, 0.7F);
      this.rq = this.bm.nextInt(6000) + 6000;
      float var2 = 0.25F;
      this.er.a(0, new aho(this));
      this.er.a(1, new ag3(this, 0.38F));
      this.er.a(2, new aht(this, var2));
      this.er.a(3, new agt(this, 0.25F, abr.aG.A, false));
      this.er.a(4, new ahl(this, 0.28F));
      this.er.a(5, new ag0(this, var2));
      this.er.a(6, new ahf(this, aek.class, 6.0F));
      this.er.a(7, new ag1(this));
   }

   public boolean co() {
      return true;
   }

   public int b0() {
      return 4;
   }

   public void bU() {
      super.bU();
      this.rs = this.rv;
      this.rt = this.ru;
      this.ru = (float)((double)this.ru + (double)(this.aY ? -1 : 4) * 0.3D);
      if (this.ru < 0.0F) {
         this.ru = 0.0F;
      }

      if (this.ru > 1.0F) {
         this.ru = 1.0F;
      }

      if (!this.aY && this.rr < 1.0F) {
         this.rr = 1.0F;
      }

      this.rr = (float)((double)this.rr * 0.9D);
      if (!this.aY && this.ah < 0.0D) {
         this.ah *= 0.6D;
      }

      this.rv += this.rr * 2.0F;
      if (!this.bG() && !this.ap.goto && --this.rq <= 0) {
         this.a("mob.chicken.plop", 1.0F, (this.bm.nextFloat() - this.bm.nextFloat()) * 0.2F + 1.0F);
         this.new(abr.ch.A, 1);
         this.rq = this.bm.nextInt(6000) + 6000;
      }

   }

   protected void try(float var1) {
   }

   protected String b2() {
      return "mob.chicken.say";
   }

   protected String bX() {
      return "mob.chicken.hurt";
   }

   protected String bS() {
      return "mob.chicken.hurt";
   }

   protected void a(int var1, int var2, int var3, int var4) {
      this.a("mob.chicken.step", 0.15F, 1.0F);
   }

   protected int bI() {
      return abr.aU.A;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.bm.nextInt(3) + this.bm.nextInt(1 + var2);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.new(abr.aU.A, 1);
      }

      if (this.aP()) {
         this.new(abr.aJ.A, 1);
      } else {
         this.new(abr.aL.A, 1);
      }

   }

   public af8 new(aiy var1) {
      return new af8(this.ap);
   }

   public boolean long(abp var1) {
      return var1 != null && var1.d() instanceof aa8;
   }

   // $FF: synthetic method
   public aiy a(aiy var1) {
      return this.new(var1);
   }
}
