public class afw extends ah2 {
   private float rD;
   private float rC;
   private boolean rB;
   private boolean rA;
   private float rz;
   private float ry;

   public afw(y6 var1) {
      super(var1);
      this.ft = "/mob/wolf.png";
      this.if(0.6F, 0.8F);
      this.e2 = 0.3F;
      this.bl().for(true);
      this.er.a(1, new aho(this));
      this.er.a(2, this.rx);
      this.er.a(3, new ahg(this, 0.4F));
      this.er.a(4, new ahc(this, this.e2, true));
      this.er.a(5, new ahn(this, this.e2, 10.0F, 2.0F));
      this.er.a(6, new aht(this, this.e2));
      this.er.a(7, new ag0(this, this.e2));
      this.er.a(8, new ahv(this, 8.0F));
      this.er.a(9, new ahf(this, aek.class, 8.0F));
      this.er.a(9, new ag1(this));
      this.eq.a(1, new agm(this));
      this.eq.a(2, new agl(this));
      this.eq.a(3, new agq(this, true));
      this.eq.a(4, new agn(this, af2.class, 16.0F, 200, false));
   }

   public boolean co() {
      return true;
   }

   public void do(aig var1) {
      super.do(var1);
      if (var1 instanceof aek) {
         this.E(true);
      }

   }

   protected void b8() {
      this.bg.if(18, this.cd());
   }

   public int b0() {
      return this.fy() ? 20 : 8;
   }

   protected void X() {
      super.X();
      this.bg.a(18, new Integer(this.cd()));
      this.bg.a(19, new Byte((byte)0));
      this.bg.a(20, new Byte((byte)rs.I(1)));
   }

   protected void a(int var1, int var2, int var3, int var4) {
      this.a("mob.wolf.step", 0.15F, 1.0F);
   }

   public String W() {
      if (this.fy()) {
         return "/mob/wolf_tame.png";
      } else {
         return this.fD() ? "/mob/wolf_angry.png" : super.W();
      }
   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("Angry", this.fD());
      var1.a("CollarColor", (byte)this.fF());
   }

   public void try(aqv var1) {
      super.try(var1);
      this.E(var1.if("Angry"));
      if (var1.try("CollarColor")) {
         this.av(var1.else("CollarColor"));
      }

   }

   protected boolean bn() {
      return this.fD();
   }

   protected String b2() {
      if (this.fD()) {
         return "mob.wolf.growl";
      } else if (this.bm.nextInt(3) == 0) {
         return this.fy() && this.bg.int(18) < 10 ? "mob.wolf.whine" : "mob.wolf.panting";
      } else {
         return "mob.wolf.bark";
      }
   }

   protected String bX() {
      return "mob.wolf.hurt";
   }

   protected String bS() {
      return "mob.wolf.death";
   }

   protected float bR() {
      return 0.4F;
   }

   protected int bI() {
      return -1;
   }

   public void bU() {
      super.bU();
      if (!this.ap.goto && this.rB && !this.rA && !this.eN() && this.aY) {
         this.rA = true;
         this.rz = 0.0F;
         this.ry = 0.0F;
         this.ap.a((aiw)this, (byte)8);
      }

   }

   public void aC() {
      super.aC();
      this.rC = this.rD;
      if (this.fH()) {
         this.rD += (1.0F - this.rD) * 0.4F;
      } else {
         this.rD += (0.0F - this.rD) * 0.4F;
      }

      if (this.fH()) {
         this.e1 = 10;
      }

      if (this.ao()) {
         this.rB = true;
         this.rA = false;
         this.rz = 0.0F;
         this.ry = 0.0F;
      } else if ((this.rB || this.rA) && this.rA) {
         if (this.rz == 0.0F) {
            this.a("mob.wolf.shake", this.bR(), (this.bm.nextFloat() - this.bm.nextFloat()) * 0.2F + 1.0F);
         }

         this.ry = this.rz;
         this.rz += 0.05F;
         if (this.ry >= 2.0F) {
            this.rB = false;
            this.rA = false;
            this.ry = 0.0F;
            this.rz = 0.0F;
         }

         if (this.rz > 0.4F) {
            float var1 = (float)this.aZ.a;
            int var2 = (int)(ajs.try((this.rz - 0.4F) * 3.1415927F) * 7.0F);

            for(int var3 = 0; var3 < var2; ++var3) {
               float var4 = (this.bm.nextFloat() * 2.0F - 1.0F) * this.aP * 0.5F;
               float var5 = (this.bm.nextFloat() * 2.0F - 1.0F) * this.aP * 0.5F;
               this.ap.a("splash", this.al + (double)var4, (double)(var1 + 0.8F), this.aj + (double)var5, this.ai, this.ah, this.ag);
            }
         }
      }

   }

   public boolean fE() {
      return this.rB;
   }

   public float m(float var1) {
      return 0.75F + (this.ry + (this.rz - this.ry) * var1) / 2.0F * 0.25F;
   }

   public float new(float var1, float var2) {
      float var3 = (this.ry + (this.rz - this.ry) * var1 + var2) / 1.8F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      } else if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      return ajs.try(var3 * 3.1415927F) * ajs.try(var3 * 3.1415927F * 11.0F) * 0.15F * 3.1415927F;
   }

   public float n(float var1) {
      return (this.rC + (this.rD - this.rC) * var1) * 0.15F * 3.1415927F;
   }

   public float af() {
      return this.aO * 0.8F;
   }

   public int bJ() {
      return this.fB() ? 20 : super.bJ();
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else {
         aiw var3 = var1.new();
         this.rx.a(false);
         if (var3 != null && !(var3 instanceof aek) && !(var3 instanceof aei)) {
            var2 = (var2 + 1) / 2;
         }

         return super.a(var1, var2);
      }
   }

   public boolean long(aiw var1) {
      int var2 = this.fy() ? 4 : 2;
      return var1.a(ai4.a((aig)this), var2);
   }

   public boolean for(aek var1) {
      abp var2 = var1.fR.L();
      if (this.fy()) {
         if (var2 != null) {
            if (abr.ai[var2.new] instanceof abw) {
               abw var3 = (abw)abr.ai[var2.new];
               if (var3.s() && this.bg.int(18) < 20) {
                  if (!var1.fY.new) {
                     --var2.if;
                  }

                  this.q(var3.v());
                  if (var2.if <= 0) {
                     var1.fR.if(var1.fR.aa, (abp)null);
                  }

                  return true;
               }
            } else if (var2.new == abr.b9.A) {
               int var4 = rs.I(var2.new());
               if (var4 != this.fF()) {
                  this.av(var4);
                  if (!var1.fY.new && --var2.if <= 0) {
                     var1.fR.if(var1.fR.aa, (abp)null);
                  }

                  return true;
               }
            }
         }

         if (var1.fJ.equalsIgnoreCase(this.fz()) && !this.ap.goto && !this.long(var2)) {
            this.rx.a(!this.fB());
            this.e4 = false;
            this.a((s5)null);
         }
      } else if (var2 != null && var2.new == abr.b8.A && !this.fD()) {
         if (!var1.fY.new) {
            --var2.if;
         }

         if (var2.if <= 0) {
            var1.fR.if(var1.fR.aa, (abp)null);
         }

         if (!this.ap.goto) {
            if (this.bm.nextInt(3) == 0) {
               this.C(true);
               this.a((s5)null);
               this.do((aig)null);
               this.rx.a(true);
               this.t(20);
               this.w(var1.fJ);
               this.D(true);
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

   public void a(byte var1) {
      if (var1 == 8) {
         this.rA = true;
         this.rz = 0.0F;
         this.ry = 0.0F;
      } else {
         super.a(var1);
      }

   }

   public float fG() {
      if (this.fD()) {
         return 1.5393804F;
      } else {
         return this.fy() ? (0.55F - (float)(20 - this.bg.int(18)) * 0.02F) * 3.1415927F : 0.62831855F;
      }
   }

   public boolean long(abp var1) {
      if (var1 == null) {
         return false;
      } else {
         return !(abr.ai[var1.new] instanceof abw) ? false : ((abw)abr.ai[var1.new]).s();
      }
   }

   public int b6() {
      return 8;
   }

   public boolean fD() {
      return (this.bg.for(16) & 2) != 0;
   }

   public void E(boolean var1) {
      byte var2 = this.bg.for(16);
      if (var1) {
         this.bg.if(16, (byte)(var2 | 2));
      } else {
         this.bg.if(16, (byte)(var2 & -3));
      }

   }

   public int fF() {
      return this.bg.for(20) & 15;
   }

   public void av(int var1) {
      this.bg.if(20, (byte)(var1 & 15));
   }

   public afw try(aiy var1) {
      afw var2 = new afw(this.ap);
      String var3 = this.fz();
      if (var3 != null && var3.trim().length() > 0) {
         var2.w(var3);
         var2.C(true);
      }

      return var2;
   }

   public void F(boolean var1) {
      byte var2 = this.bg.for(19);
      if (var1) {
         this.bg.if(19, (byte)1);
      } else {
         this.bg.if(19, (byte)0);
      }

   }

   public boolean if(af9 var1) {
      if (var1 == this) {
         return false;
      } else if (!this.fy()) {
         return false;
      } else if (!(var1 instanceof afw)) {
         return false;
      } else {
         afw var2 = (afw)var1;
         if (!var2.fy()) {
            return false;
         } else if (var2.fB()) {
            return false;
         } else {
            return this.fs() && var2.fs();
         }
      }
   }

   public boolean fH() {
      return this.bg.for(19) == 1;
   }

   // $FF: synthetic method
   public aiy a(aiy var1) {
      return this.try(var1);
   }
}
