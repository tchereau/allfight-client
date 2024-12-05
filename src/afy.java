public class afy extends af6 {
   private int qO = 0;
   agf qP = null;
   private int qN;
   private int qM;

   public afy(y6 var1) {
      super(var1);
      this.ft = "/mob/villager_golem.png";
      this.if(1.4F, 2.9F);
      this.bl().for(true);
      this.er.a(1, new ahc(this, 0.25F, true));
      this.er.a(2, new ag8(this, 0.22F, 32.0F));
      this.er.a(3, new aha(this, 0.16F, true));
      this.er.a(4, new ag9(this, 0.16F));
      this.er.a(5, new ag5(this));
      this.er.a(6, new ag0(this, 0.16F));
      this.er.a(7, new ahf(this, aek.class, 6.0F));
      this.er.a(8, new ag1(this));
      this.eq.a(1, new agr(this));
      this.eq.a(2, new agq(this, false));
      this.eq.a(3, new agp(this, aig.class, 16.0F, 0, false, true, ae5.p0));
   }

   protected void X() {
      super.X();
      this.bg.a(16, (byte)0);
   }

   public boolean co() {
      return true;
   }

   protected void b8() {
      if (--this.qO <= 0) {
         this.qO = 70 + this.bm.nextInt(50);
         this.qP = this.ap.g.a(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj), 32);
         if (this.qP == null) {
            this.ce();
         } else {
            apg var1 = this.qP.void();
            this.if(var1.if, var1.a, var1.do, (int)((float)this.qP.if() * 0.6F));
         }
      }

      super.b8();
   }

   public int b0() {
      return 100;
   }

   protected int w(int var1) {
      return var1;
   }

   protected void else(aiw var1) {
      if (var1 instanceof ae5 && this.bq().nextInt(20) == 0) {
         this.do((aig)var1);
      }

      super.else(var1);
   }

   public void bU() {
      super.bU();
      if (this.qN > 0) {
         --this.qN;
      }

      if (this.qM > 0) {
         --this.qM;
      }

      if (this.ai * this.ai + this.ag * this.ag > 2.500000277905201E-7D && this.bm.nextInt(5) == 0) {
         int var1 = ajs.a(this.al);
         int var2 = ajs.a(this.ak - 0.20000000298023224D - (double)this.aQ);
         int var3 = ajs.a(this.aj);
         int var4 = this.ap.new(var1, var2, var3);
         if (var4 > 0) {
            this.ap.a("tilecrack_" + var4 + "_" + this.ap.for(var1, var2, var3), this.al + ((double)this.bm.nextFloat() - 0.5D) * (double)this.aP, this.aZ.a + 0.1D, this.aj + ((double)this.bm.nextFloat() - 0.5D) * (double)this.aP, 4.0D * ((double)this.bm.nextFloat() - 0.5D), 0.5D, ((double)this.bm.nextFloat() - 0.5D) * 4.0D);
         }
      }

   }

   public boolean a(Class var1) {
      return this.ff() && aek.class.isAssignableFrom(var1) ? false : super.a(var1);
   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("PlayerCreated", this.ff());
   }

   public void try(aqv var1) {
      super.try(var1);
      this.s(var1.if("PlayerCreated"));
   }

   public boolean long(aiw var1) {
      this.qN = 10;
      this.ap.a((aiw)this, (byte)4);
      boolean var2 = var1.a(ai4.a((aig)this), 7 + this.bm.nextInt(15));
      if (var2) {
         var1.ah += 0.4000000059604645D;
      }

      this.a("mob.irongolem.throw", 1.0F, 1.0F);
      return var2;
   }

   public void a(byte var1) {
      if (var1 == 4) {
         this.qN = 10;
         this.a("mob.irongolem.throw", 1.0F, 1.0F);
      } else if (var1 == 11) {
         this.qM = 400;
      } else {
         super.a(var1);
      }

   }

   public agf fe() {
      return this.qP;
   }

   public int fg() {
      return this.qN;
   }

   public void t(boolean var1) {
      this.qM = var1 ? 400 : 0;
      this.ap.a((aiw)this, (byte)11);
   }

   protected String b2() {
      return "none";
   }

   protected String bX() {
      return "mob.irongolem.hit";
   }

   protected String bS() {
      return "mob.irongolem.death";
   }

   protected void a(int var1, int var2, int var3, int var4) {
      this.a("mob.irongolem.walk", 1.0F, 1.0F);
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.bm.nextInt(3);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.new(pa.bP.void, 1);
      }

      var4 = 3 + this.bm.nextInt(3);

      for(int var5 = 0; var5 < var4; ++var5) {
         this.new(abr.N.A, 1);
      }

   }

   public int fd() {
      return this.qM;
   }

   public boolean ff() {
      return (this.bg.for(16) & 1) != 0;
   }

   public void s(boolean var1) {
      byte var2 = this.bg.for(16);
      if (var1) {
         this.bg.if(16, (byte)(var2 | 1));
      } else {
         this.bg.if(16, (byte)(var2 & -2));
      }

   }

   public void a(ai4 var1) {
      if (!this.ff() && this.ev != null && this.qP != null) {
         this.qP.a(this.ev.do(), -5);
      }

      super.a(var1);
   }
}
