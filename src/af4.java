public class af4 extends ah2 {
   private agt rE;

   public af4(y6 var1) {
      super(var1);
      this.ft = "/mob/ozelot.png";
      this.if(0.6F, 0.8F);
      this.bl().for(true);
      this.er.a(1, new aho(this));
      this.er.a(2, this.rx);
      this.er.a(3, this.rE = new agt(this, 0.18F, abr.cb.A, true));
      this.er.a(4, new ahx(this, aek.class, 16.0F, 0.23F, 0.4F));
      this.er.a(5, new ahn(this, 0.3F, 10.0F, 5.0F));
      this.er.a(6, new ag6(this, 0.4F));
      this.er.a(7, new ahg(this, 0.3F));
      this.er.a(8, new ag7(this));
      this.er.a(9, new aht(this, 0.23F));
      this.er.a(10, new ag0(this, 0.23F));
      this.er.a(11, new ahf(this, aek.class, 10.0F));
      this.eq.a(1, new agn(this, af8.class, 14.0F, 750, false));
   }

   protected void X() {
      super.X();
      this.bg.a(18, (byte)0);
   }

   public void b8() {
      if (this.ch().if()) {
         float var1 = this.ch().do();
         if (var1 == 0.18F) {
            this.int(true);
            this.for(false);
         } else if (var1 == 0.4F) {
            this.int(false);
            this.for(true);
         } else {
            this.int(false);
            this.for(false);
         }
      } else {
         this.int(false);
         this.for(false);
      }

   }

   protected boolean bn() {
      return !this.fy();
   }

   public String W() {
      switch(this.fI()) {
      case 0:
         return "/mob/ozelot.png";
      case 1:
         return "/mob/cat_black.png";
      case 2:
         return "/mob/cat_red.png";
      case 3:
         return "/mob/cat_siamese.png";
      default:
         return super.W();
      }
   }

   public boolean co() {
      return true;
   }

   public int b0() {
      return 10;
   }

   protected void try(float var1) {
   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("CatType", this.fI());
   }

   public void try(aqv var1) {
      super.try(var1);
      this.aw(var1.goto("CatType"));
   }

   protected String b2() {
      if (this.fy()) {
         if (this.fs()) {
            return "mob.cat.purr";
         } else {
            return this.bm.nextInt(4) == 0 ? "mob.cat.purreow" : "mob.cat.meow";
         }
      } else {
         return "";
      }
   }

   protected String bX() {
      return "mob.cat.hitt";
   }

   protected String bS() {
      return "mob.cat.hitt";
   }

   protected float bR() {
      return 0.4F;
   }

   protected int bI() {
      return abr.cs.A;
   }

   public boolean long(aiw var1) {
      return var1.a((ai4)ai4.a((aig)this), 3);
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else {
         this.rx.a(false);
         return super.a(var1, var2);
      }
   }

   protected void a(boolean var1, int var2) {
   }

   public boolean for(aek var1) {
      abp var2 = var1.fR.L();
      if (this.fy()) {
         if (var1.fJ.equalsIgnoreCase(this.fz()) && !this.ap.goto && !this.long(var2)) {
            this.rx.a(!this.fB());
         }
      } else if (this.rE.byte() && var2 != null && var2.new == abr.cb.A && var1.for(this) < 9.0D) {
         if (!var1.fY.new) {
            --var2.if;
         }

         if (var2.if <= 0) {
            var1.fR.if(var1.fR.aa, (abp)null);
         }

         if (!this.ap.goto) {
            if (this.bm.nextInt(3) == 0) {
               this.C(true);
               this.aw(1 + this.ap.o.nextInt(3));
               this.w(var1.fJ);
               this.D(true);
               this.rx.a(true);
               this.ap.a((aiw)this, (byte)7);
            } else {
               this.D(false);
               this.ap.a((aiw)this, (byte)6);
            }
         }

         return true;
      }

      return super.for(var1);
   }

   public af4 byte(aiy var1) {
      af4 var2 = new af4(this.ap);
      if (this.fy()) {
         var2.w(this.fz());
         var2.C(true);
         var2.aw(this.fI());
      }

      return var2;
   }

   public boolean long(abp var1) {
      return var1 != null && var1.new == abr.cb.A;
   }

   public boolean if(af9 var1) {
      if (var1 == this) {
         return false;
      } else if (!this.fy()) {
         return false;
      } else if (!(var1 instanceof af4)) {
         return false;
      } else {
         af4 var2 = (af4)var1;
         if (!var2.fy()) {
            return false;
         } else {
            return this.fs() && var2.fs();
         }
      }
   }

   public int fI() {
      return this.bg.for(18);
   }

   public void aw(int var1) {
      this.bg.if(18, (byte)var1);
   }

   public boolean bj() {
      if (this.ap.o.nextInt(3) == 0) {
         return false;
      } else {
         if (this.ap.int(this.aZ) && this.ap.if((aiw)this, (nw)this.aZ).isEmpty() && !this.ap.do(this.aZ)) {
            int var1 = ajs.a(this.al);
            int var2 = ajs.a(this.aZ.a);
            int var3 = ajs.a(this.aj);
            if (var2 < 63) {
               return false;
            }

            int var4 = this.ap.new(var1, var2 - 1, var3);
            if (var4 == pa.i.void || var4 == pa.aJ.void) {
               return true;
            }
         }

         return false;
      }
   }

   public String aB() {
      if (this.cc()) {
         return this.cm();
      } else {
         return this.fy() ? "entity.Cat.name" : super.aB();
      }
   }

   public void bO() {
      if (this.ap.o.nextInt(7) == 0) {
         for(int var1 = 0; var1 < 2; ++var1) {
            af4 var2 = new af4(this.ap);
            var2.if(this.al, this.ak, this.aj, this.a5, 0.0F);
            var2.at(-24000);
            this.ap.new(var2);
         }
      }

   }

   // $FF: synthetic method
   public aiy a(aiy var1) {
      return this.byte(var1);
   }
}
