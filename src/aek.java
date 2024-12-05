import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class aek extends aig implements ar0 {
   public aen fR = new aen(this);
   private adf ga = new adf();
   public ad1 fQ;
   public ad1 fP;
   protected ad2 fO = new ad2();
   protected int fN = 0;
   public byte fM = 0;
   public float fL;
   public float fK;
   public String fJ;
   public int fI = 0;
   public double fH;
   public double fG;
   public double fF;
   public double fE;
   public double fD;
   public double fC;
   protected boolean f2;
   public apg f1;
   private int f9;
   public float f0;
   public float fB;
   public float fZ;
   private apg f8;
   private boolean f7;
   private apg f6;
   public aeo fY = new aeo();
   public int fX;
   public int fW;
   public float fV;
   private abp f5;
   private int f4;
   protected float fU = 0.1F;
   protected float fT = 0.02F;
   private int f3 = 0;
   public aee fS = null;

   public aek(y6 var1) {
      super(var1);
      this.fQ = new adl(this.fR, !var1.goto, this);
      this.fP = this.fQ;
      this.aQ = 1.62F;
      apg var2 = var1.long();
      this.if((double)var2.if + 0.5D, (double)(var2.a + 1), (double)var2.do + 0.5D, 0.0F, 0.0F);
      this.fq = "humanoid";
      this.fr = 180.0F;
      this.bk = 20;
      this.ft = "/mob/charall.png";
   }

   public int b0() {
      return 20;
   }

   protected void X() {
      super.X();
      this.bg.a(16, (byte)0);
      this.bg.a(17, (byte)0);
      this.bg.a(18, 0);
   }

   public abp cI() {
      return this.f5;
   }

   public int cy() {
      return this.f4;
   }

   public boolean cx() {
      return this.f5 != null;
   }

   public int cE() {
      return this.cx() ? this.f5.long() - this.f4 : 0;
   }

   public void cz() {
      if (this.f5 != null) {
         this.f5.a(this.ap, this, this.f4);
      }

      this.cC();
   }

   public void cC() {
      this.f5 = null;
      this.f4 = 0;
      if (!this.ap.goto) {
         this.if(false);
      }

   }

   public boolean b1() {
      return this.cx() && abr.ai[this.f5.new].else(this.f5) == aax.new;
   }

   public void aC() {
      if (this.f5 != null) {
         abp var1 = this.fR.L();
         if (var1 == this.f5) {
            if (this.f4 <= 25 && this.f4 % 4 == 0) {
               this.if(var1, 5);
            }

            if (--this.f4 == 0 && !this.ap.goto) {
               this.cB();
            }
         } else {
            this.cC();
         }
      }

      if (this.fI > 0) {
         --this.fI;
      }

      if (this.cg()) {
         ++this.f9;
         if (this.f9 > 100) {
            this.f9 = 100;
         }

         if (!this.ap.goto) {
            if (!this.cw()) {
               this.a(true, true, false);
            } else if (this.ap.j()) {
               this.a(false, true, true);
            }
         }
      } else if (this.f9 > 0) {
         ++this.f9;
         if (this.f9 >= 110) {
            this.f9 = 0;
         }
      }

      super.aC();
      if (!this.ap.goto && this.fP != null && !this.fP.do(this)) {
         this.cv();
         this.fP = this.fQ;
      }

      if (this.aP() && this.fY.if) {
         this.ad();
      }

      this.fH = this.fE;
      this.fG = this.fD;
      this.fF = this.fC;
      double var9 = this.al - this.fE;
      double var3 = this.ak - this.fD;
      double var5 = this.aj - this.fC;
      double var7 = 10.0D;
      if (var9 > var7) {
         this.fH = this.fE = this.al;
      }

      if (var5 > var7) {
         this.fF = this.fC = this.aj;
      }

      if (var3 > var7) {
         this.fG = this.fD = this.ak;
      }

      if (var9 < -var7) {
         this.fH = this.fE = this.al;
      }

      if (var5 < -var7) {
         this.fF = this.fC = this.aj;
      }

      if (var3 < -var7) {
         this.fG = this.fD = this.ak;
      }

      this.fE += var9 * 0.25D;
      this.fC += var5 * 0.25D;
      this.fD += var3 * 0.25D;
      this.a((akf)aka.k, 1);
      if (this.ar == null) {
         this.f6 = null;
      }

      if (!this.ap.goto) {
         this.fO.a(this);
      }

   }

   public int aJ() {
      return this.fY.if ? 0 : 80;
   }

   public int aO() {
      return 10;
   }

   public void a(String var1, float var2, float var3) {
      this.ap.a(this, var1, var2, var3);
   }

   protected void if(abp var1, int var2) {
      if (var1.l() == aax.try) {
         this.a("random.drink", 0.5F, this.ap.o.nextFloat() * 0.1F + 0.9F);
      }

      int var3;
      nr var4;
      nr var5;
      if (var1.l() == aax.if) {
         for(var3 = 0; var3 < var2; ++var3) {
            var4 = this.ap.do().a(((double)this.bm.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
            var4.if(-this.a4 * 3.1415927F / 180.0F);
            var4.a(-this.a5 * 3.1415927F / 180.0F);
            var5 = this.ap.do().a(((double)this.bm.nextFloat() - 0.5D) * 0.3D, (double)(-this.bm.nextFloat()) * 0.6D - 0.3D, 0.6D);
            var5.if(-this.a4 * 3.1415927F / 180.0F);
            var5.a(-this.a5 * 3.1415927F / 180.0F);
            var5 = var5.a(this.al, this.ak + (double)this.af(), this.aj);
            this.ap.a("iconcrack_" + var1.d().A, var5.int, var5.for, var5.do, var4.int, var4.for + 0.05D, var4.do);
         }

         this.a("random.eat", 0.5F + 0.5F * (float)this.bm.nextInt(2), (this.bm.nextFloat() - this.bm.nextFloat()) * 0.2F + 1.0F);
      }

      if (var1.l() == aax.a) {
         for(var3 = 0; var3 < var2; ++var3) {
            var4 = this.ap.do().a(((double)this.bm.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
            var4.if(-this.a4 * 3.1415927F / 180.0F);
            var4.a(-this.a5 * 3.1415927F / 180.0F);
            var5 = this.ap.do().a(((double)this.bm.nextFloat() - 0.5D) * 0.3D, (double)(-this.bm.nextFloat()) * 0.6D - 0.3D, 0.6D);
            var5.if(-this.a4 * 3.1415927F / 180.0F);
            var5.a(-this.a5 * 3.1415927F / 180.0F);
            var5.a(this.al, this.ak + (double)this.af(), this.aj);
         }

         this.a("random.fumer", 0.5F, this.ap.o.nextFloat() * 0.1F + 0.9F);
      }

   }

   protected void cB() {
      if (this.f5 != null) {
         this.if(this.f5, 16);
         int var1 = this.f5.if;
         abp var2 = this.f5.a(this.ap, this);
         if (var2 != this.f5 || var2 != null && var2.if != var1) {
            this.fR.V[this.fR.aa] = var2;
            if (var2.if == 0) {
               this.fR.V[this.fR.aa] = null;
            }
         }

         this.cC();
      }

   }

   public void a(byte var1) {
      if (var1 == 9) {
         this.cB();
      } else {
         super.a(var1);
      }

   }

   protected boolean bK() {
      return this.cd() <= 0 || this.cg();
   }

   protected void cv() {
      this.fP = this.fQ;
   }

   public void int(aiw var1) {
      if (this.ar == var1) {
         this.byte(var1);
         if (this.ar != null) {
            this.ar.as = null;
         }

         this.ar = null;
      } else {
         super.int((aiw)var1);
      }

   }

   public void aG() {
      double var1 = this.al;
      double var3 = this.ak;
      double var5 = this.aj;
      float var7 = this.a5;
      float var8 = this.a4;
      super.aG();
      this.fL = this.fK;
      this.fK = 0.0F;
      this.goto(this.al - var1, this.ak - var3, this.aj - var5);
      if (this.ar instanceof af3) {
         this.a4 = var8;
         this.a5 = var7;
         this.eH = ((af3)this.ar).eH;
      }

   }

   public void ay() {
      this.aQ = 1.62F;
      this.if(0.6F, 1.8F);
      super.ay();
      this.t(this.b0());
      this.fb = 0;
   }

   protected void cl() {
      this.bs();
   }

   public void bU() {
      if (this.fN > 0) {
         --this.fN;
      }

      if (this.ap.p == 0 && this.cd() < this.b0() && this.bl % 20 * 12 == 0) {
         this.q(1);
      }

      this.fR.G();
      this.fL = this.fK;
      super.bU();
      this.fm = this.fY.if();
      this.fl = this.fT;
      if (this.S()) {
         this.fm = (float)((double)this.fm + (double)this.fY.if() * 0.3D);
         this.fl = (float)((double)this.fl + (double)this.fT * 0.3D);
      }

      float var1 = ajs.int(this.ai * this.ai + this.ag * this.ag);
      float var2 = (float)Math.atan(-this.ah * 0.20000000298023224D) * 15.0F;
      if (var1 > 0.1F) {
         var1 = 0.1F;
      }

      if (!this.aY || this.cd() <= 0) {
         var1 = 0.0F;
      }

      if (this.aY || this.cd() <= 0) {
         var2 = 0.0F;
      }

      this.fK += (var1 - this.fK) * 0.4F;
      this.eD += (var2 - this.eD) * 0.8F;
      if (this.cd() > 0) {
         List var3 = this.ap.a((aiw)this, (nw)this.aZ.do(1.0D, 0.5D, 1.0D));
         if (var3 != null) {
            for(int var4 = 0; var4 < var3.size(); ++var4) {
               aiw var5 = (aiw)var3.get(var4);
               if (!var5.aR) {
                  this.b(var5);
               }
            }
         }
      }

   }

   private void b(aiw var1) {
      var1.do(this);
   }

   public int cJ() {
      return this.bg.int(18);
   }

   public void G(int var1) {
      this.bg.if(18, var1);
   }

   public void F(int var1) {
      int var2 = this.cJ();
      this.bg.if(18, var2 + var1);
   }

   public void a(ai4 var1) {
      super.a(var1);
      this.if(0.2F, 0.2F);
      this.try(this.al, this.ak, this.aj);
      this.ah = 0.10000000149011612D;
      if (this.fJ.equals("Notch")) {
         this.a(new abp(abr.Y, 1), true);
      }

      if (!this.ap.i().a("keepInventory")) {
         this.fR.K();
      }

      if (var1 != null) {
         this.ai = (double)(-ajs.for((this.fc + this.a5) * 3.1415927F / 180.0F) * 0.1F);
         this.ag = (double)(-ajs.try((this.fc + this.a5) * 3.1415927F / 180.0F) * 0.1F);
      } else {
         this.ai = this.ag = 0.0D;
      }

      this.aQ = 0.1F;
      this.a((akf)aka.if, 1);
   }

   public void a(aiw var1, int var2) {
      this.F(var2);
      Collection var3 = this.ct().a(nh.for);
      if (var1 instanceof aek) {
         this.a((akf)aka.e, 1);
         var3.addAll(this.ct().a(nh.int));
      } else {
         this.a((akf)aka.a, 1);
      }

      Iterator var4 = var3.iterator();

      while(var4.hasNext()) {
         np var5 = (np)var4.next();
         nn var6 = this.ct().a(this.aB(), var5);
         var6.if();
      }

   }

   public afk f(boolean var1) {
      return this.a(this.fR.if(this.fR.aa, var1 && this.fR.L() != null ? this.fR.L().if : 1), false);
   }

   public afk else(abp var1) {
      return this.a(var1, false);
   }

   public afk a(abp var1, boolean var2) {
      if (var1 == null) {
         return null;
      } else {
         afk var3 = new afk(this.ap, this.al, this.ak - 0.30000001192092896D + (double)this.af(), this.aj, var1);
         var3.dB = 40;
         float var4 = 0.1F;
         float var5;
         if (var2) {
            var5 = this.bm.nextFloat() * 0.5F;
            float var6 = this.bm.nextFloat() * 3.1415927F * 2.0F;
            var3.ai = (double)(-ajs.try(var6) * var5);
            var3.ag = (double)(ajs.for(var6) * var5);
            var3.ah = 0.20000000298023224D;
         } else {
            var4 = 0.3F;
            var3.ai = (double)(-ajs.try(this.a5 / 180.0F * 3.1415927F) * ajs.for(this.a4 / 180.0F * 3.1415927F) * var4);
            var3.ag = (double)(ajs.for(this.a5 / 180.0F * 3.1415927F) * ajs.for(this.a4 / 180.0F * 3.1415927F) * var4);
            var3.ah = (double)(-ajs.try(this.a4 / 180.0F * 3.1415927F) * var4 + 0.1F);
            var4 = 0.02F;
            var5 = this.bm.nextFloat() * 3.1415927F * 2.0F;
            var4 *= this.bm.nextFloat();
            var3.ai += Math.cos((double)var5) * (double)var4;
            var3.ah += (double)((this.bm.nextFloat() - this.bm.nextFloat()) * 0.1F);
            var3.ag += Math.sin((double)var5) * (double)var4;
         }

         this.if(var3);
         this.a((akf)aka.try, 1);
         return var3;
      }
   }

   protected void if(afk var1) {
      this.ap.new(var1);
   }

   public float a(pa var1, boolean var2) {
      float var3 = this.fR.if(var1);
      if (var3 > 1.0F) {
         int var4 = z1.byte(this);
         abp var5 = this.fR.L();
         if (var4 > 0 && var5 != null) {
            float var6 = (float)(var4 * var4 + 1);
            if (!var5.a(var1) && var3 <= 1.0F) {
               var3 += var6 * 0.08F;
            } else {
               var3 += var6;
            }
         }
      }

      if (this.if((ai0)ai0.w)) {
         var3 *= 1.0F + (float)(this.a((ai0)ai0.w).int() + 1) * 0.2F;
      }

      if (this.if((ai0)ai0.v)) {
         var3 *= 1.0F - (float)(this.a((ai0)ai0.v).int() + 1) * 0.2F;
      }

      if (this.a((ts)ts.s) && !z1.int(this)) {
         var3 /= 5.0F;
      }

      if (!this.aY) {
         var3 /= 5.0F;
      }

      return var3;
   }

   public boolean do(pa var1) {
      return this.fR.a(var1);
   }

   public void try(aqv var1) {
      super.try(var1);
      aqm var2 = var1.void("Inventory");
      this.fR.a(var2);
      this.fR.aa = var1.goto("SelectedItemSlot");
      this.f2 = var1.if("Sleeping");
      this.f9 = var1.case("SleepTimer");
      this.fV = var1.b("XpP");
      this.fX = var1.goto("XpLevel");
      this.fW = var1.goto("XpTotal");
      this.G(var1.goto("Score"));
      if (this.f2) {
         this.f1 = new apg(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj));
         this.a(true, true, false);
      }

      if (var1.try("SpawnX") && var1.try("SpawnY") && var1.try("SpawnZ")) {
         this.f8 = new apg(var1.goto("SpawnX"), var1.goto("SpawnY"), var1.goto("SpawnZ"));
         this.f7 = var1.if("SpawnForced");
      }

      this.fO.if(var1);
      this.fY.a(var1);
      if (var1.try("EnderItems")) {
         aqm var3 = var1.void("EnderItems");
         this.ga.do(var3);
      }

   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("Inventory", (aqd)this.fR.if(new aqm()));
      var1.a("SelectedItemSlot", this.fR.aa);
      var1.a("Sleeping", this.f2);
      var1.a("SleepTimer", (short)this.f9);
      var1.a("XpP", this.fV);
      var1.a("XpLevel", this.fX);
      var1.a("XpTotal", this.fW);
      var1.a("Score", this.cJ());
      if (this.f8 != null) {
         var1.a("SpawnX", this.f8.if);
         var1.a("SpawnY", this.f8.a);
         var1.a("SpawnZ", this.f8.do);
         var1.a("SpawnForced", this.f7);
      }

      this.fO.a(var1);
      this.fY.if(var1);
      var1.a("EnderItems", (aqd)this.ga.gx());
   }

   public void a(ajg var1) {
   }

   public void a(oc var1) {
   }

   public void a(aff var1) {
   }

   public void a(int var1, int var2, int var3, String var4) {
   }

   public void for(int var1, int var2, int var3) {
   }

   public void new(int var1, int var2, int var3) {
   }

   public float af() {
      return 0.12F;
   }

   protected void cs() {
      this.aQ = 1.62F;
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else if (this.fY.if && !var1.for()) {
         return false;
      } else {
         this.e8 = 0;
         if (this.cd() <= 0) {
            return false;
         } else {
            if (this.cg() && !this.ap.goto) {
               this.a(true, true, false);
            }

            if (var1.char()) {
               if (this.ap.p == 0) {
                  var2 = 0;
               }

               if (this.ap.p == 1) {
                  var2 = var2 / 2 + 1;
               }

               if (this.ap.p == 3) {
                  var2 = var2 * 3 / 2;
               }
            }

            if (var2 == 0) {
               return false;
            } else {
               aiw var3 = var1.new();
               if (var3 instanceof aei && ((aei)var3).cF != null) {
                  var3 = ((aei)var3).cF;
               }

               if (var3 instanceof aig) {
                  this.a((aig)var3, false);
               }

               this.a(aka.do, var2);
               return super.a(var1, var2);
            }
         }
      }
   }

   public boolean try(aek var1) {
      no var2 = this.cu();
      no var3 = var1.cu();
      return var2 != var3 ? true : (var2 != null ? var2.for() : true);
   }

   protected void a(aig var1, boolean var2) {
      if (!(var1 instanceof ae7) && !(var1 instanceof ae3)) {
         if (var1 instanceof afw) {
            afw var3 = (afw)var1;
            if (var3.fy() && this.fJ.equals(var3.fz())) {
               return;
            }
         }

         if (!(var1 instanceof aek) || this.try((aek)var1)) {
            List var6 = this.ap.a(afw.class, nw.if().a(this.al, this.ak, this.aj, this.al + 1.0D, this.ak + 1.0D, this.aj + 1.0D).do(16.0D, 4.0D, 16.0D));
            Iterator var4 = var6.iterator();

            while(true) {
               afw var5;
               do {
                  do {
                     do {
                        do {
                           if (!var4.hasNext()) {
                              return;
                           }

                           var5 = (afw)var4.next();
                        } while(!var5.fy());
                     } while(var5.eO() != null);
                  } while(!this.fJ.equals(var5.fz()));
               } while(var2 && var5.fB());

               var5.B(false);
               var5.g(var1);
            }
         }
      }

   }

   protected void x(int var1) {
      this.fR.else(var1);
   }

   public int by() {
      return this.fR.I();
   }

   public float cL() {
      int var1 = 0;
      abp[] var2 = this.fR.U;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         abp var5 = var2[var4];
         if (var5 != null) {
            ++var1;
         }
      }

      return (float)var1 / (float)this.fR.U.length;
   }

   protected void for(ai4 var1, int var2) {
      if (!this.ac()) {
         if (!var1.a() && this.b1()) {
            var2 = 1 + var2 >> 1;
         }

         var2 = this.if(var1, var2);
         var2 = this.do(var1, var2);
         this.d(var1.case());
         int var3 = this.cd();
         this.t(this.cd() - var2);
         this.el.a(var1, var3, var2);
      }

   }

   public void a(oe var1) {
   }

   public void a(oi var1) {
   }

   public void a(n4 var1) {
   }

   public void a(on var1) {
   }

   public void a(oo var1) {
   }

   public void a(zn var1, String var2) {
   }

   public void goto(abp var1) {
   }

   public boolean c(aiw var1) {
      if (var1.for(this)) {
         return true;
      } else {
         abp var2 = this.cD();
         if (var2 != null && var1 instanceof aig) {
            if (this.fY.new) {
               var2 = var2.n();
            }

            if (var2.a((aig)var1)) {
               if (var2.if <= 0 && !this.fY.new) {
                  this.cH();
               }

               return true;
            }
         }

         return false;
      }
   }

   public abp cD() {
      return this.fR.L();
   }

   public void cH() {
      this.fR.if(this.fR.aa, (abp)null);
   }

   public double aQ() {
      return (double)(this.aQ - 0.5F);
   }

   public void f(aiw var1) {
      if (var1.aa() && !var1.new((aiw)this)) {
         int var2 = this.fR.a(var1);
         if (this.if((ai0)ai0.u)) {
            var2 += 3 << this.a((ai0)ai0.u).int();
         }

         if (this.if((ai0)ai0.h)) {
            var2 -= 2 << this.a((ai0)ai0.h).int();
         }

         int var3 = 0;
         int var4 = 0;
         if (var1 instanceof aig) {
            var4 = z1.a((aig)this, (aig)((aig)var1));
            var3 += z1.if(this, (aig)var1);
         }

         if (this.S()) {
            ++var3;
         }

         if (var2 > 0 || var4 > 0) {
            boolean var5 = this.aK > 0.0F && !this.aY && !this.bZ() && !this.ap() && !this.if((ai0)ai0.k) && this.ar == null && var1 instanceof aig;
            if (var5 && var2 > 0) {
               var2 += this.bm.nextInt(var2 / 2 + 2);
            }

            var2 += var4;
            boolean var6 = false;
            int var7 = z1.if(this);
            if (var1 instanceof aig && var7 > 0 && !var1.aP()) {
               var6 = true;
               var1.e(1);
            }

            boolean var8 = var1.a(ai4.a(this), var2);
            if (var8) {
               if (var3 > 0) {
                  var1.byte((double)(-ajs.try(this.a5 * 3.1415927F / 180.0F) * (float)var3 * 0.5F), 0.1D, (double)(ajs.for(this.a5 * 3.1415927F / 180.0F) * (float)var3 * 0.5F));
                  this.ai *= 0.6D;
                  this.ag *= 0.6D;
                  this.for(false);
               }

               if (var5) {
                  this.e(var1);
               }

               if (var4 > 0) {
                  this.d(var1);
               }

               if (var2 >= 18) {
                  this.a((akf)akk.byte);
               }

               this.goto(var1);
               if (var1 instanceof aig) {
                  zq.a(this, (aig)var1, this.bm);
               }
            }

            abp var9 = this.cD();
            Object var10 = var1;
            if (var1 instanceof aft) {
               afu var11 = ((aft)var1).d5;
               if (var11 != null && var11 instanceof aig) {
                  var10 = (aig)var11;
               }
            }

            if (var9 != null && var10 instanceof aig) {
               var9.a((aig)var10, this);
               if (var9.if <= 0) {
                  this.cH();
               }
            }

            if (var1 instanceof aig) {
               if (var1.aA()) {
                  this.a((aig)var1, true);
               }

               this.a(aka.int, var2);
               if (var7 > 0 && var8) {
                  var1.e(var7 * 4);
               } else if (var6) {
                  var1.ad();
               }
            }

            this.d(0.3F);
         }
      }

   }

   public void e(aiw var1) {
   }

   public void d(aiw var1) {
   }

   public void cK() {
   }

   public void az() {
      super.az();
      this.fQ.if(this);
      if (this.fP != null) {
         this.fP.if(this);
      }

   }

   public boolean aE() {
      return !this.f2 && super.aE();
   }

   public boolean cM() {
      return false;
   }

   public aej int(int var1, int var2, int var3) {
      if (!this.ap.goto) {
         if (this.cg() || !this.aA()) {
            return aej.int;
         }

         if (!this.ap.n.a()) {
            return aej.a;
         }

         if (this.ap.j()) {
            return aej.try;
         }

         if (Math.abs(this.al - (double)var1) > 3.0D || Math.abs(this.ak - (double)var2) > 2.0D || Math.abs(this.aj - (double)var3) > 3.0D) {
            return aej.new;
         }

         double var4 = 8.0D;
         double var6 = 5.0D;
         List var8 = this.ap.a(ae0.class, nw.if().a((double)var1 - var4, (double)var2 - var6, (double)var3 - var4, (double)var1 + var4, (double)var2 + var6, (double)var3 + var4));
         if (!var8.isEmpty()) {
            return aej.for;
         }
      }

      this.if(0.2F, 0.2F);
      this.aQ = 0.2F;
      if (this.ap.p(var1, var2, var3)) {
         int var9 = this.ap.for(var1, var2, var3);
         int var5 = r3.r(var9);
         float var10 = 0.5F;
         float var7 = 0.5F;
         switch(var5) {
         case 0:
            var7 = 0.9F;
            break;
         case 1:
            var10 = 0.1F;
            break;
         case 2:
            var7 = 0.1F;
            break;
         case 3:
            var10 = 0.9F;
         }

         this.B(var5);
         this.try((double)((float)var1 + var10), (double)((float)var2 + 0.9375F), (double)((float)var3 + var7));
      } else {
         this.try((double)((float)var1 + 0.5F), (double)((float)var2 + 0.9375F), (double)((float)var3 + 0.5F));
      }

      this.f2 = true;
      this.f9 = 0;
      this.f1 = new apg(var1, var2, var3);
      this.ai = this.ag = this.ah = 0.0D;
      if (!this.ap.goto) {
         this.ap.o();
      }

      return aej.if;
   }

   private void B(int var1) {
      this.f0 = 0.0F;
      this.fZ = 0.0F;
      switch(var1) {
      case 0:
         this.fZ = -1.8F;
         break;
      case 1:
         this.f0 = 1.8F;
         break;
      case 2:
         this.fZ = 1.8F;
         break;
      case 3:
         this.f0 = -1.8F;
      }

   }

   public void a(boolean var1, boolean var2, boolean var3) {
      this.if(0.6F, 1.8F);
      this.cs();
      apg var4 = this.f1;
      apg var5 = this.f1;
      if (var4 != null && this.ap.new(var4.if, var4.a, var4.do) == pa.al.void) {
         r3.for(this.ap, var4.if, var4.a, var4.do, false);
         var5 = r3.l(this.ap, var4.if, var4.a, var4.do, 0);
         if (var5 == null) {
            var5 = new apg(var4.if, var4.a + 1, var4.do);
         }

         this.try((double)((float)var5.if + 0.5F), (double)((float)var5.a + this.aQ + 0.1F), (double)((float)var5.do + 0.5F));
      }

      this.f2 = false;
      if (!this.ap.goto && var2) {
         this.ap.o();
      }

      if (var1) {
         this.f9 = 0;
      } else {
         this.f9 = 100;
      }

      if (var3) {
         this.a(this.f1, false);
      }

   }

   private boolean cw() {
      return this.ap.new(this.f1.if, this.f1.a, this.f1.do) == pa.al.void;
   }

   public static apg a(y6 var0, apg var1, boolean var2) {
      x0 var3 = var0.new();
      var3.if(var1.if - 3 >> 4, var1.do - 3 >> 4);
      var3.if(var1.if + 3 >> 4, var1.do - 3 >> 4);
      var3.if(var1.if - 3 >> 4, var1.do + 3 >> 4);
      var3.if(var1.if + 3 >> 4, var1.do + 3 >> 4);
      if (var0.new(var1.if, var1.a, var1.do) == pa.al.void) {
         apg var8 = r3.l(var0, var1.if, var1.a, var1.do, 0);
         return var8;
      } else {
         ts var4 = var0.byte(var1.if, var1.a, var1.do);
         ts var5 = var0.byte(var1.if, var1.a + 1, var1.do);
         boolean var6 = !var4.for() && !var4.case();
         boolean var7 = !var5.for() && !var5.case();
         return var2 && var6 && var7 ? var1 : null;
      }
   }

   public float cR() {
      if (this.f1 != null) {
         int var1 = this.ap.for(this.f1.if, this.f1.a, this.f1.do);
         int var2 = r3.r(var1);
         switch(var2) {
         case 0:
            return 90.0F;
         case 1:
            return 0.0F;
         case 2:
            return 270.0F;
         case 3:
            return 180.0F;
         }
      }

      return 0.0F;
   }

   public boolean cg() {
      return this.f2;
   }

   public boolean cO() {
      return this.f2 && this.f9 >= 100;
   }

   public int cS() {
      return this.f9;
   }

   protected boolean E(int var1) {
      return (this.bg.for(16) & 1 << var1) != 0;
   }

   protected void if(int var1, boolean var2) {
      byte var3 = this.bg.for(16);
      if (var2) {
         this.bg.if(16, (byte)(var3 | 1 << var1));
      } else {
         this.bg.if(16, (byte)(var3 & ~(1 << var1)));
      }

   }

   public void new(String var1) {
   }

   public apg cP() {
      return this.f8;
   }

   public boolean cQ() {
      return this.f7;
   }

   public void a(apg var1, boolean var2) {
      if (var1 != null) {
         this.f8 = new apg(var1);
         this.f7 = var2;
      } else {
         this.f8 = null;
         this.f7 = false;
      }

   }

   public void a(akf var1) {
      this.a((akf)var1, 1);
   }

   public void a(akf var1, int var2) {
   }

   protected void cf() {
      super.cf();
      this.a((akf)aka.case, 1);
      if (this.S()) {
         this.d(0.8F);
      } else {
         this.d(0.2F);
      }

   }

   public void int(float var1, float var2) {
      double var3 = this.al;
      double var5 = this.ak;
      double var7 = this.aj;
      if (this.fY.a && this.ar == null) {
         double var9 = this.ah;
         float var11 = this.fl;
         this.fl = this.fY.a();
         super.int(var1, var2);
         this.ah = var9 * 0.6D;
         this.fl = var11;
      } else {
         super.int(var1, var2);
      }

      this.else(this.al - var3, this.ak - var5, this.aj - var7);
   }

   public void else(double var1, double var3, double var5) {
      if (this.ar == null) {
         int var7;
         if (this.a((ts)ts.s)) {
            var7 = Math.round(ajs.int(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            if (var7 > 0) {
               this.a(aka.d, var7);
               this.d(0.015F * (float)var7 * 0.01F);
            }
         } else if (this.ap()) {
            var7 = Math.round(ajs.int(var1 * var1 + var5 * var5) * 100.0F);
            if (var7 > 0) {
               this.a(aka.i, var7);
               this.d(0.015F * (float)var7 * 0.01F);
            }
         } else if (this.bZ()) {
            if (var3 > 0.0D) {
               this.a(aka.g, (int)Math.round(var3 * 100.0D));
            }
         } else if (this.aY) {
            var7 = Math.round(ajs.int(var1 * var1 + var5 * var5) * 100.0F);
            if (var7 > 0) {
               this.a(aka.j, var7);
               if (this.S()) {
                  this.d(0.099999994F * (float)var7 * 0.01F);
               } else {
                  this.d(0.01F * (float)var7 * 0.01F);
               }
            }
         } else {
            var7 = Math.round(ajs.int(var1 * var1 + var5 * var5) * 100.0F);
            if (var7 > 25) {
               this.a(aka.f, var7);
            }
         }
      }

   }

   private void goto(double var1, double var3, double var5) {
      if (this.ar != null) {
         int var7 = Math.round(ajs.int(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
         if (var7 > 0) {
            if (this.ar instanceof afj) {
               this.a(aka.b, var7);
               if (this.f6 == null) {
                  this.f6 = new apg(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj));
               } else if ((double)this.f6.if(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj)) >= 1000000.0D) {
                  this.a((akf)akk.b, 1);
               }
            } else if (this.ar instanceof afm) {
               this.a(aka.long, var7);
            } else if (this.ar instanceof af3) {
               this.a(aka.else, var7);
            }
         }
      }

   }

   protected void try(float var1) {
      if (!this.fY.try) {
         if (var1 >= 2.0F) {
            this.a(aka.h, (int)Math.round((double)var1 * 100.0D));
         }

         super.try(var1);
      }

   }

   public void a(aig var1) {
      if (var1 instanceof ae5) {
         this.a((akf)akk.else);
      }

   }

   public void Y() {
      if (!this.fY.a) {
         super.Y();
      }

   }

   public ajd a(abp var1, int var2) {
      ajd var3 = super.a(var1, var2);
      if (var1.new == abr.ce.A && this.fS != null) {
         var3 = abr.ce.w();
      } else {
         if (var1.d().do()) {
            return var1.d().a(var1.new(), var2);
         }

         int var4;
         if (this.f5 != null && var1.new == abr.W.A) {
            var4 = var1.long() - this.f4;
            if (var4 >= 18) {
               return abr.W.char(2);
            }

            if (var4 > 13) {
               return abr.W.char(1);
            }

            if (var4 > 0) {
               return abr.W.char(0);
            }
         }

         if (this.f5 != null && var1.new == mod_saphir.G.A) {
            var4 = var1.long() - this.f4;
            if (var4 >= 18) {
               return mod_saphir.G.int(2);
            }

            if (var4 > 13) {
               return mod_saphir.G.int(1);
            }

            if (var4 > 0) {
               return mod_saphir.G.int(0);
            }
         }

         if (this.f5 != null && var1.new == mod_emeraude.void.A) {
            var4 = var1.long() - this.f4;
            if (var4 >= 18) {
               return mod_emeraude.void.long(2);
            }

            if (var4 > 13) {
               return mod_emeraude.void.long(1);
            }

            if (var4 > 0) {
               return mod_emeraude.void.long(0);
            }
         }

         if (this.f5 != null && var1.new == mod_rubis.ap.A) {
            var4 = var1.long() - this.f4;
            if (var4 >= 18) {
               return mod_rubis.ap.goto(2);
            }

            if (var4 > 13) {
               return mod_rubis.ap.goto(1);
            }

            if (var4 > 0) {
               return mod_rubis.ap.goto(0);
            }
         }
      }

      return var3;
   }

   public abp s(int var1) {
      return this.fR.long(var1);
   }

   protected void bk() {
   }

   protected void bz() {
   }

   public void C(int var1) {
      this.F(var1);
      int var2 = Integer.MAX_VALUE - this.fW;
      if (var1 > var2) {
         var1 = var2;
      }

      this.fV += (float)var1 / (float)this.cU();

      for(this.fW += var1; this.fV >= 1.0F; this.fV /= (float)this.cU()) {
         this.fV = (this.fV - 1.0F) * (float)this.cU();
         this.D(1);
      }

   }

   public void D(int var1) {
      this.fX += var1;
      if (this.fX < 0) {
         this.fX = 0;
         this.fV = 0.0F;
         this.fW = 0;
      }

      if (var1 > 0 && this.fX % 5 == 0 && (float)this.f3 < (float)this.bl - 100.0F) {
         float var2 = this.fX > 30 ? 1.0F : (float)this.fX / 30.0F;
         this.ap.a((aiw)this, "random.levelup", var2 * 0.75F, 1.0F);
         this.f3 = this.bl;
      }

   }

   public int cU() {
      return this.fX >= 30 ? 62 + (this.fX - 30) * 7 : (this.fX >= 15 ? 17 + (this.fX - 15) * 3 : 17);
   }

   public void d(float var1) {
      if (!this.fY.if && !this.ap.goto) {
         this.fO.if(var1);
      }

   }

   public ad2 cA() {
      return this.fO;
   }

   public boolean e(boolean var1) {
      return (var1 || this.fO.if()) && !this.fY.if;
   }

   public boolean cT() {
      return this.cd() > 0 && this.cd() < this.b0();
   }

   public void do(abp var1, int var2) {
      if (var1 != this.f5) {
         this.f5 = var1;
         this.f4 = var2;
         if (!this.ap.goto) {
            this.if(true);
         }
      }

   }

   public boolean try(int var1, int var2, int var3) {
      if (this.fY.int) {
         return true;
      } else {
         int var4 = this.ap.new(var1, var2, var3);
         if (var4 > 0) {
            pa var5 = pa.x[var4];
            if (var5.at.a()) {
               return true;
            }

            if (this.cD() != null) {
               abp var6 = this.cD();
               if (var6.a(var5) || var6.if(var5) > 1.0F) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4, abp var5) {
      return this.fY.int ? true : (var5 != null ? var5.i() : false);
   }

   protected int new(aek var1) {
      if (this.ap.i().a("keepInventory")) {
         return 0;
      } else {
         int var2 = this.fX * 7;
         return var2 > 100 ? 100 : var2;
      }
   }

   protected boolean ck() {
      return true;
   }

   public String aB() {
      return this.fJ;
   }

   public boolean cr() {
      return super.cr();
   }

   public boolean bx() {
      return true;
   }

   public boolean bL() {
      return false;
   }

   public void a(aek var1, boolean var2) {
      if (var2) {
         this.fR.a(var1.fR);
         this.fi = var1.fi;
         this.fO = var1.fO;
         this.fX = var1.fX;
         this.fW = var1.fW;
         this.fV = var1.fV;
         this.G(var1.cJ());
         this.a3 = var1.a3;
      } else if (this.ap.i().a("keepInventory")) {
         this.fR.a(var1.fR);
         this.fX = var1.fX;
         this.fW = var1.fW;
         this.fV = var1.fV;
         this.G(var1.cJ());
      }

      this.ga = var1.ga;
   }

   protected boolean aK() {
      return !this.fY.a;
   }

   public void cF() {
   }

   public void a(yz var1) {
   }

   public String do() {
      return this.fJ;
   }

   public aqy cN() {
      return aqy.if();
   }

   public String a(String var1, Object... var2) {
      return this.cN().a(var1, var2);
   }

   public adf cG() {
      return this.ga;
   }

   public abp A(int var1) {
      return var1 == 0 ? this.fR.L() : this.fR.U[var1 - 1];
   }

   public abp bW() {
      return this.fR.L();
   }

   public void do(int var1, abp var2) {
      this.fR.U[var1] = var2;
   }

   public boolean if(aek var1) {
      if (!this.U()) {
         return false;
      } else {
         no var2 = this.cu();
         return var2 == null || var1 == null || var1.cu() != var2 || !var2.if();
      }
   }

   public abp[] as() {
      return this.fR.U;
   }

   public boolean cV() {
      return this.E(1);
   }

   public boolean an() {
      return !this.fY.a;
   }

   public nl ct() {
      return this.ap.f();
   }

   public no cu() {
      return this.ct().case(this.fJ);
   }

   public String at() {
      return no.a(this.cu(), this.fJ);
   }
}
