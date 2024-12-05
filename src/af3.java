public class af3 extends af9 {
   private final ahs rp;

   public af3(y6 var1) {
      super(var1);
      this.ft = "/mob/pig.png";
      this.if(0.9F, 0.9F);
      this.bl().for(true);
      float var2 = 0.25F;
      this.er.a(0, new aho(this));
      this.er.a(1, new ag3(this, 0.38F));
      this.er.a(2, this.rp = new ahs(this, 0.34F));
      this.er.a(3, new aht(this, var2));
      this.er.a(4, new agt(this, 0.3F, abr.bt.A, false));
      this.er.a(4, new agt(this, 0.3F, abr.bJ.A, false));
      this.er.a(5, new ahl(this, 0.28F));
      this.er.a(6, new ag0(this, var2));
      this.er.a(7, new ahf(this, aek.class, 6.0F));
      this.er.a(8, new ag1(this));
   }

   public boolean co() {
      return true;
   }

   public int b0() {
      return 10;
   }

   protected void bQ() {
      super.bQ();
   }

   public boolean cj() {
      abp var1 = ((aek)this.as).bW();
      return var1 != null && var1.new == abr.bt.A;
   }

   protected void X() {
      super.X();
      this.bg.a(16, (byte)0);
   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("Saddle", this.fw());
   }

   public void try(aqv var1) {
      super.try(var1);
      this.A(var1.if("Saddle"));
   }

   protected String b2() {
      return "mob.pig.say";
   }

   protected String bX() {
      return "mob.pig.say";
   }

   protected String bS() {
      return "mob.pig.death";
   }

   protected void a(int var1, int var2, int var3, int var4) {
      this.a("mob.pig.step", 0.15F, 1.0F);
   }

   public boolean for(aek var1) {
      if (super.for(var1)) {
         return true;
      } else if (!this.fw() || this.ap.goto || this.as != null && this.as != var1) {
         return false;
      } else {
         var1.int(this);
         return true;
      }
   }

   protected int bI() {
      return this.aP() ? abr.bs.A : abr.bu.A;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.bm.nextInt(3) + 1 + this.bm.nextInt(1 + var2);

      for(int var4 = 0; var4 < var3; ++var4) {
         if (this.aP()) {
            this.new(abr.bs.A, 1);
         } else {
            this.new(abr.bu.A, 1);
         }
      }

      if (this.fw()) {
         this.new(abr.cx.A, 1);
      }

   }

   public boolean fw() {
      return (this.bg.for(16) & 1) != 0;
   }

   public void A(boolean var1) {
      if (var1) {
         this.bg.if(16, (byte)1);
      } else {
         this.bg.if(16, (byte)0);
      }

   }

   public void a(afn var1) {
      if (!this.ap.goto) {
         aez var2 = new aez(this.ap);
         var2.if(this.al, this.ak, this.aj, this.a5, this.a4);
         this.ap.new(var2);
         this.az();
      }
   }

   protected void try(float var1) {
      super.try(var1);
      if (var1 > 5.0F && this.as instanceof aek) {
         ((aek)this.as).a((akf)akk.try);
      }

   }

   public af3 do(aiy var1) {
      return new af3(this.ap);
   }

   public boolean long(abp var1) {
      return var1 != null && var1.new == abr.bJ.A;
   }

   public ahs fx() {
      return this.rp;
   }

   // $FF: synthetic method
   public aiy a(aiy var1) {
      return this.do(var1);
   }
}
