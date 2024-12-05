public class af7 extends af9 {
   public af7(y6 var1) {
      super(var1);
      this.ft = "/mob/cow.png";
      this.if(0.9F, 1.3F);
      this.bl().for(true);
      this.er.a(0, new aho(this));
      this.er.a(1, new ag3(this, 0.38F));
      this.er.a(2, new aht(this, 0.2F));
      this.er.a(3, new agt(this, 0.25F, abr.aE.A, false));
      this.er.a(4, new ahl(this, 0.25F));
      this.er.a(5, new ag0(this, 0.2F));
      this.er.a(6, new ahf(this, aek.class, 6.0F));
      this.er.a(7, new ag1(this));
   }

   public boolean co() {
      return true;
   }

   public int b0() {
      return 10;
   }

   protected String b2() {
      return "mob.cow.say";
   }

   protected String bX() {
      return "mob.cow.hurt";
   }

   protected String bS() {
      return "mob.cow.hurt";
   }

   protected void a(int var1, int var2, int var3, int var4) {
      this.a("mob.cow.step", 0.15F, 1.0F);
   }

   protected float bR() {
      return 0.4F;
   }

   protected int bI() {
      return abr.cs.A;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.bm.nextInt(3) + this.bm.nextInt(1 + var2);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.new(abr.cs.A, 1);
      }

      var3 = this.bm.nextInt(3) + 1 + this.bm.nextInt(1 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         if (this.aP()) {
            this.new(abr.aN.A, 1);
         } else {
            this.new(abr.aP.A, 1);
         }
      }

   }

   public boolean for(aek var1) {
      abp var2 = var1.fR.L();
      if (var2 != null && var2.new == abr.bi.A) {
         if (--var2.if <= 0) {
            var1.fR.if(var1.fR.aa, new abp(abr.cr));
         } else if (!var1.fR.new(new abp(abr.cr))) {
            var1.else(new abp(abr.cr.A, 1, 0));
         }

         return true;
      } else {
         return super.for(var1);
      }
   }

   public af7 for(aiy var1) {
      return new af7(this.ap);
   }

   // $FF: synthetic method
   public aiy a(aiy var1) {
      return this.for(var1);
   }
}
