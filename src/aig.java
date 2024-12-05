import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public abstract class aig extends aiw {
   private static final float[] em = new float[]{0.0F, 0.0F, 0.1F, 0.2F};
   private static final float[] ek = new float[]{0.0F, 0.0F, 0.25F, 0.5F};
   private static final float[] ei = new float[]{0.0F, 0.0F, 0.05F, 0.02F};
   public static final float[] eP = new float[]{0.0F, 0.1F, 0.15F, 0.45F};
   public int eN = 20;
   public float eL;
   public float eJ;
   public float eH = 0.0F;
   public float eG = 0.0F;
   public float fA = 0.0F;
   public float fz = 0.0F;
   protected float fy;
   protected float fx;
   protected float fw;
   protected float fv;
   protected boolean fu = true;
   protected String ft = "/mob/charall.png";
   protected boolean fs = true;
   protected float fr = 0.0F;
   protected String fq = null;
   protected float fp = 1.0F;
   protected int fo = 0;
   protected float fn = 0.0F;
   public float fm = 0.1F;
   public float fl = 0.02F;
   public float fk;
   public float fj;
   protected int fi = this.b0();
   public int fh;
   public int fg;
   public int ff;
   public int fe;
   public int fd;
   public float fc = 0.0F;
   public int fb = 0;
   public int eF = 0;
   public float eE;
   public float eD;
   protected boolean eC = false;
   public int eB;
   public int eA = -1;
   public float ez = (float)(Math.random() * 0.8999999761581421D + 0.10000000149011612D);
   public float ey;
   public float ex;
   public float ew;
   protected aek ev = null;
   protected int eu = 0;
   private aig eg = null;
   private int ee = 0;
   private aig ec = null;
   public int et = 0;
   protected HashMap es = new HashMap();
   private boolean ea = true;
   private int d8;
   private ahz d7;
   private ahy e0;
   private ah0 eZ;
   private ah1 eY;
   private agj eX;
   public final ahj er;
   public final ahj eq;
   private aig eW;
   private agi eV;
   private float eU;
   private apg eT = new apg(0, 0, 0);
   private float eS = -1.0F;
   private abp[] eR = new abp[5];
   protected float[] ep = new float[5];
   private abp[] eQ = new abp[5];
   public boolean eo = false;
   public int en = 0;
   private boolean eO = false;
   private boolean eM = false;
   protected final ai5 el = new ai5(this);
   protected int ej;
   protected double eh;
   protected double ef;
   protected double ed;
   protected double eb;
   protected double d9;
   float fa = 0.0F;
   protected int e9 = 0;
   protected int e8 = 0;
   protected float e7;
   protected float e6;
   protected float e5;
   public boolean e4 = false;
   protected float e3 = 0.0F;
   protected float e2 = 0.7F;
   private int eK = 0;
   private aiw eI;
   protected int e1 = 0;
   public int d6;

   public aig(y6 var1) {
      super(var1);
      this.d6 = this.bm.nextInt(Integer.MAX_VALUE);
      this.at = true;
      this.er = new ahj(var1 != null && var1.e != null ? var1.e : null);
      this.eq = new ahj(var1 != null && var1.e != null ? var1.e : null);
      this.d7 = new ahz(this);
      this.e0 = new ahy(this);
      this.eZ = new ah0(this);
      this.eY = new ah1(this);
      this.eX = new agj(this, var1, (float)this.cq());
      this.eV = new agi(this);
      this.eJ = (float)(Math.random() + 1.0D) * 0.01F;
      this.try(this.al, this.ak, this.aj);
      this.eL = (float)Math.random() * 12398.0F;
      this.a5 = (float)(Math.random() * 3.141592653589793D * 2.0D);
      this.fA = this.a5;

      for(int var2 = 0; var2 < this.ep.length; ++var2) {
         this.ep[var2] = 0.085F;
      }

      this.aF = 0.5F;
   }

   protected int cq() {
      return 16;
   }

   public ahz b9() {
      return this.d7;
   }

   public ahy ch() {
      return this.e0;
   }

   public ah0 bo() {
      return this.eZ;
   }

   public agj bl() {
      return this.eX;
   }

   public agi ci() {
      return this.eV;
   }

   public Random bq() {
      return this.bm;
   }

   public aig bD() {
      return this.eg;
   }

   public aig bF() {
      return this.ec;
   }

   public void goto(aiw var1) {
      if (var1 instanceof aig) {
         this.ec = (aig)var1;
      }

   }

   public int bH() {
      return this.e8;
   }

   public float ae() {
      return this.fA;
   }

   public void byte(float var1) {
      this.fA = var1;
   }

   public float bY() {
      return this.eU;
   }

   public void goto(float var1) {
      this.eU = var1;
      this.c(var1);
   }

   public boolean long(aiw var1) {
      this.goto(var1);
      return false;
   }

   public aig bB() {
      return this.eW;
   }

   public void do(aig var1) {
      this.eW = var1;
      if (vf.new.for()) {
         vf.do(vf.new, this, var1);
      }

   }

   public boolean a(Class var1) {
      return ae7.class != var1 && ae3.class != var1;
   }

   public void cp() {
   }

   protected void a(double var1, boolean var3) {
      if (!this.ap()) {
         this.aq();
      }

      if (var3 && this.aK > 0.0F) {
         int var4 = ajs.a(this.al);
         int var5 = ajs.a(this.ak - 0.20000000298023224D - (double)this.aQ);
         int var6 = ajs.a(this.aj);
         int var7 = this.ap.new(var4, var5, var6);
         if (var7 == 0) {
            int var8 = this.ap.q(var4, var5 - 1, var6);
            if (var8 == 11 || var8 == 32 || var8 == 21) {
               var7 = this.ap.new(var4, var5 - 1, var6);
            }
         }

         if (var7 > 0) {
            pa.x[var7].a(this.ap, var4, var5, var6, this, this.aK);
         }
      }

      super.a(var1, var3);
   }

   public boolean bv() {
      return this.do(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj));
   }

   public boolean do(int var1, int var2, int var3) {
      return this.eS == -1.0F ? true : this.eT.if(var1, var2, var3) < this.eS * this.eS;
   }

   public void if(int var1, int var2, int var3, int var4) {
      this.eT.a(var1, var2, var3);
      this.eS = (float)var4;
   }

   public apg bh() {
      return this.eT;
   }

   public float b4() {
      return this.eS;
   }

   public void ce() {
      this.eS = -1.0F;
   }

   public boolean bm() {
      return this.eS != -1.0F;
   }

   public void if(aig var1) {
      this.eg = var1;
      this.ee = this.eg != null ? 100 : 0;
      if (vf.new.for()) {
         vf.do(vf.new, this, var1);
      }

   }

   protected void X() {
      this.bg.a(8, this.d8);
      this.bg.a(9, (byte)0);
      this.bg.a(10, (byte)0);
      this.bg.a(6, (byte)0);
      this.bg.a(5, "");
   }

   public boolean void(aiw var1) {
      return this.ap.a(this.ap.do().a(this.al, this.ak + (double)this.af(), this.aj), this.ap.do().a(var1.al, var1.ak + (double)var1.af(), var1.aj)) == null;
   }

   public String W() {
      return this.ft;
   }

   public boolean aw() {
      return !this.aR;
   }

   public boolean ax() {
      return !this.aR;
   }

   public float af() {
      return this.aO * 0.85F;
   }

   public int bE() {
      return 80;
   }

   public void bP() {
      String var1 = this.b2();
      if (var1 != null) {
         this.a(var1, this.bR(), this.bp());
      }

   }

   public void aD() {
      this.fk = this.fj;
      super.aD();
      this.ap.e.a("mobBaseTick");
      if (this.aA() && this.bm.nextInt(1000) < this.ff++) {
         this.ff = -this.bE();
         this.bP();
      }

      if (this.aA() && this.aE()) {
         this.a((ai4)ai4.g, 1);
      }

      if (this.al() || this.ap.goto) {
         this.ad();
      }

      boolean var1 = this instanceof aek && ((aek)this).fY.if;
      if (this.aA() && this.a((ts)ts.s) && !this.bV() && !this.es.containsKey(ai0.m.try) && !var1) {
         this.b(this.w(this.Z()));
         if (this.Z() == -20) {
            this.b(0);

            for(int var2 = 0; var2 < 8; ++var2) {
               float var3 = this.bm.nextFloat() - this.bm.nextFloat();
               float var4 = this.bm.nextFloat() - this.bm.nextFloat();
               float var5 = this.bm.nextFloat() - this.bm.nextFloat();
               this.ap.a("bubble", this.al + (double)var3, this.ak + (double)var4, this.aj + (double)var5, this.ai, this.ah, this.ag);
            }

            this.a((ai4)ai4.f, 2);
         }

         this.ad();
      } else {
         this.b(300);
      }

      this.eE = this.eD;
      if (this.eF > 0) {
         --this.eF;
      }

      if (this.fe > 0) {
         --this.fe;
      }

      if (this.bi > 0) {
         --this.bi;
      }

      if (this.fi <= 0) {
         this.b7();
      }

      if (this.eu > 0) {
         --this.eu;
      } else {
         this.ev = null;
      }

      if (this.ec != null && !this.ec.aA()) {
         this.ec = null;
      }

      if (this.eg != null) {
         if (!this.eg.aA()) {
            this.if((aig)null);
         } else if (this.ee > 0) {
            --this.ee;
         } else {
            this.if((aig)null);
         }
      }

      this.bT();
      this.fv = this.fw;
      this.eG = this.eH;
      this.fz = this.fA;
      this.a2 = this.a5;
      this.a0 = this.a4;
      this.ap.e.if();
   }

   protected void b7() {
      ++this.fb;
      if (this.fb == 20) {
         int var1;
         if (!this.ap.goto && (this.eu > 0 || this.ck()) && !this.bG() && this.ap.i().a("doMobLoot")) {
            var1 = this.new(this.ev);

            while(var1 > 0) {
               int var2 = aik.aC(var1);
               var1 -= var2;
               this.ap.new(new aik(this.ap, this.al, this.ak, this.aj, var2));
            }
         }

         this.az();

         for(var1 = 0; var1 < 20; ++var1) {
            double var8 = this.bm.nextGaussian() * 0.02D;
            double var4 = this.bm.nextGaussian() * 0.02D;
            double var6 = this.bm.nextGaussian() * 0.02D;
            this.ap.a("explode", this.al + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP, this.ak + (double)(this.bm.nextFloat() * this.aO), this.aj + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP, var8, var4, var6);
         }
      }

   }

   protected int w(int var1) {
      int var2 = z1.try(this);
      return var2 > 0 && this.bm.nextInt(var2 + 1) > 0 ? var1 : var1 - 1;
   }

   protected int new(aek var1) {
      if (this.eB > 0) {
         int var2 = this.eB;
         abp[] var3 = this.as();

         for(int var4 = 0; var4 < var3.length; ++var4) {
            if (var3[var4] != null && this.ep[var4] <= 1.0F) {
               var2 += 1 + this.bm.nextInt(3);
            }
         }

         return var2;
      } else {
         return this.eB;
      }
   }

   protected boolean ck() {
      return false;
   }

   public void br() {
      for(int var1 = 0; var1 < 20; ++var1) {
         double var2 = this.bm.nextGaussian() * 0.02D;
         double var4 = this.bm.nextGaussian() * 0.02D;
         double var6 = this.bm.nextGaussian() * 0.02D;
         double var8 = 10.0D;
         this.ap.a("explode", this.al + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP - var2 * var8, this.ak + (double)(this.bm.nextFloat() * this.aO) - var4 * var8, this.aj + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP - var6 * var8, var2, var4, var6);
      }

   }

   public void aG() {
      super.aG();
      this.fy = this.fx;
      this.fx = 0.0F;
      this.aK = 0.0F;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.aQ = 0.0F;
      this.eh = var1;
      this.ef = var3;
      this.ed = var5;
      this.eb = (double)var7;
      this.d9 = (double)var8;
      this.ej = var9;
   }

   public void aC() {
      if (!vf.R.for() || !vf.int(vf.R, this)) {
         super.aC();
         if (!this.ap.goto) {
            int var1;
            for(var1 = 0; var1 < 5; ++var1) {
               abp var2 = this.A(var1);
               if (!abp.if(var2, this.eQ[var1])) {
                  ((ak5)this.ap).D().a((aiw)this, (an7)(new anq(this.av, var1, var2)));
                  this.eQ[var1] = var2 == null ? null : var2.n();
               }
            }

            var1 = this.bt();
            if (var1 > 0) {
               if (this.et <= 0) {
                  this.et = 20 * (30 - var1);
               }

               --this.et;
               if (this.et <= 0) {
                  this.y(var1 - 1);
               }
            }
         }

         this.bU();
         double var12 = this.al - this.ao;
         double var3 = this.aj - this.am;
         float var5 = (float)(var12 * var12 + var3 * var3);
         float var6 = this.eH;
         float var7 = 0.0F;
         this.fy = this.fx;
         float var8 = 0.0F;
         if (var5 > 0.0025000002F) {
            var8 = 1.0F;
            var7 = (float)Math.sqrt((double)var5) * 3.0F;
            var6 = (float)Math.atan2(var3, var12) * 180.0F / 3.1415927F - 90.0F;
         }

         if (this.fj > 0.0F) {
            var6 = this.a5;
         }

         if (!this.aY) {
            var8 = 0.0F;
         }

         this.fx += (var8 - this.fx) * 0.3F;
         this.ap.e.a("headTurn");
         if (this.co()) {
            this.eY.a();
         } else {
            float var9 = ajs.int(var6 - this.eH);
            this.eH += var9 * 0.3F;
            float var10 = ajs.int(this.a5 - this.eH);
            boolean var11 = var10 < -90.0F || var10 >= 90.0F;
            if (var10 < -75.0F) {
               var10 = -75.0F;
            }

            if (var10 >= 75.0F) {
               var10 = 75.0F;
            }

            this.eH = this.a5 - var10;
            if (var10 * var10 > 2500.0F) {
               this.eH += var10 * 0.2F;
            }

            if (var11) {
               var7 *= -1.0F;
            }
         }

         this.ap.e.if();
         this.ap.e.a("rangeChecks");

         while(this.a5 - this.a2 < -180.0F) {
            this.a2 -= 360.0F;
         }

         while(this.a5 - this.a2 >= 180.0F) {
            this.a2 += 360.0F;
         }

         while(this.eH - this.eG < -180.0F) {
            this.eG -= 360.0F;
         }

         while(this.eH - this.eG >= 180.0F) {
            this.eG += 360.0F;
         }

         while(this.a4 - this.a0 < -180.0F) {
            this.a0 -= 360.0F;
         }

         while(this.a4 - this.a0 >= 180.0F) {
            this.a0 += 360.0F;
         }

         while(this.fA - this.fz < -180.0F) {
            this.fz -= 360.0F;
         }

         while(this.fA - this.fz >= 180.0F) {
            this.fz += 360.0F;
         }

         this.ap.e.if();
         this.fw += var7;
         if (qs.P() && !qs.aa()) {
            Thread.yield();
         }
      }

   }

   public void q(int var1) {
      if (this.fi > 0) {
         this.t(this.cd() + var1);
         if (this.fi > this.b0()) {
            this.t(this.b0());
         }

         this.bi = this.eN / 2;
      }

   }

   public abstract int b0();

   public int cd() {
      return this.fi;
   }

   public void t(int var1) {
      this.fi = var1;
      if (var1 > this.b0()) {
         var1 = this.b0();
      }

   }

   public boolean a(ai4 var1, int var2) {
      if (vf.y.for() && vf.int(vf.y, this, var1, var2)) {
         return false;
      } else if (this.ac()) {
         return false;
      } else if (this.ap.goto) {
         return false;
      } else {
         this.e8 = 0;
         if (this.fi <= 0) {
            return false;
         } else if (var1.do() && this.if(ai0.n)) {
            return false;
         } else {
            if ((var1 == ai4.else || var1 == ai4.char) && this.A(4) != null) {
               this.A(4).a(var2 * 4 + this.bm.nextInt(var2 * 2), this);
               var2 = (int)((float)var2 * 0.75F);
            }

            this.ex = 1.5F;
            boolean var3 = true;
            if ((float)this.bi > (float)this.eN / 2.0F) {
               if (var2 <= this.e9) {
                  return false;
               }

               this.for(var1, var2 - this.e9);
               this.e9 = var2;
               var3 = false;
            } else {
               this.e9 = var2;
               this.fh = this.fi;
               this.bi = this.eN;
               this.for(var1, var2);
               this.fe = this.fd = 10;
            }

            this.fc = 0.0F;
            aiw var4 = var1.new();
            if (var4 != null) {
               if (var4 instanceof aig) {
                  this.if((aig)var4);
               }

               if (var4 instanceof aek) {
                  this.eu = 100;
                  this.ev = (aek)var4;
               } else if (var4 instanceof afw) {
                  afw var5 = (afw)var4;
                  if (var5.fy()) {
                     this.eu = 100;
                     this.ev = null;
                  }
               }
            }

            if (var3) {
               this.ap.a((aiw)this, (byte)2);
               if (var1 != ai4.f) {
                  this.av();
               }

               if (var4 != null) {
                  double var9 = var4.al - this.al;

                  double var7;
                  for(var7 = var4.aj - this.aj; var9 * var9 + var7 * var7 < 1.0E-4D; var7 = (Math.random() - Math.random()) * 0.01D) {
                     var9 = (Math.random() - Math.random()) * 0.01D;
                  }

                  this.fc = (float)(Math.atan2(var7, var9) * 180.0D / 3.141592653589793D) - this.a5;
                  this.a(var4, var2, var9, var7);
               } else {
                  this.fc = (float)((int)(Math.random() * 2.0D) * 180);
               }
            }

            if (this.fi <= 0) {
               if (var3) {
                  this.a(this.bS(), this.bR(), this.bp());
               }

               this.a(var1);
            } else if (var3) {
               this.a(this.bX(), this.bR(), this.bp());
            }

            return true;
         }
      }
   }

   protected float bp() {
      return this.bG() ? (this.bm.nextFloat() - this.bm.nextFloat()) * 0.2F + 1.5F : (this.bm.nextFloat() - this.bm.nextFloat()) * 0.2F + 1.0F;
   }

   public void aM() {
      this.fe = this.fd = 10;
      this.fc = 0.0F;
   }

   public int by() {
      int var1 = 0;
      abp[] var2 = this.as();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         abp var5 = var2[var4];
         if (var5 != null && var5.d() instanceof ac4) {
            int var6 = ((ac4)var5.d()).dU;
            var1 += var6;
         }
      }

      return var1;
   }

   protected void x(int var1) {
   }

   protected int if(ai4 var1, int var2) {
      if (!var1.a()) {
         int var3 = 25 - this.by();
         int var4 = var2 * var3 + this.fg;
         this.x(var2);
         var2 = var4 / 25;
         this.fg = var4 % 25;
      }

      return var2;
   }

   protected int do(ai4 var1, int var2) {
      int var3;
      int var4;
      int var5;
      if (this.if(ai0.o)) {
         var3 = (this.a(ai0.o).int() + 1) * 5;
         var4 = 25 - var3;
         var5 = var2 * var4 + this.fg;
         var2 = var5 / 25;
         this.fg = var5 % 25;
      }

      if (var2 <= 0) {
         return 0;
      } else {
         var3 = z1.a(this.as(), var1);
         if (var3 > 20) {
            var3 = 20;
         }

         if (var3 > 0 && var3 <= 20) {
            var4 = 25 - var3;
            var5 = var2 * var4 + this.fg;
            var2 = var5 / 25;
            this.fg = var5 % 25;
         }

         return var2;
      }
   }

   protected void for(ai4 var1, int var2) {
      if (!this.ac()) {
         if (vf.V.for()) {
            var2 = vf.a(vf.V, this, var1, var2);
            if (var2 <= 0) {
               return;
            }
         }

         var2 = this.if(var1, var2);
         var2 = this.do(var1, var2);
         int var3 = this.cd();
         this.fi -= var2;
         this.el.a(var1, var3, var2);
      }

   }

   protected float bR() {
      return 1.0F;
   }

   protected String b2() {
      return null;
   }

   protected String bX() {
      return "damage.hit";
   }

   protected String bS() {
      return "damage.hit";
   }

   public void a(aiw var1, int var2, double var3, double var5) {
      this.ba = true;
      float var7 = ajs.int(var3 * var3 + var5 * var5);
      float var8 = 0.4F;
      this.ai /= 2.0D;
      this.ah /= 2.0D;
      this.ag /= 2.0D;
      this.ai -= var3 / (double)var7 * (double)var8;
      this.ah += (double)var8;
      this.ag -= var5 / (double)var7 * (double)var8;
      if (this.ah > 0.4000000059604645D) {
         this.ah = 0.4000000059604645D;
      }

   }

   public void a(ai4 var1) {
      if (!vf.l.for() || !vf.int(vf.l, this, var1)) {
         aiw var2 = var1.new();
         aig var3 = this.bN();
         if (this.fo >= 0 && var3 != null) {
            var3.a((aiw)this, this.fo);
         }

         if (var2 != null) {
            var2.a(this);
         }

         this.eC = true;
         if (!this.ap.goto) {
            int var4 = 0;
            if (var2 instanceof aek) {
               var4 = z1.new((aig)var2);
            }

            ArrayList var5 = null;
            if (vf.e.do()) {
               vf.a(this, (sw)vf.e, (Object)Boolean.TRUE);
               var5 = (ArrayList)vf.a((Object)this, (sw)vf.goto);
               var5.clear();
            }

            int var6 = 0;
            if (!this.bG() && this.ap.i().a("doMobLoot")) {
               this.a(this.eu > 0, var4);
               this.if(this.eu > 0, var4);
               if (this.eu > 0) {
                  var6 = this.bm.nextInt(200) - var4;
                  if (var6 < 5) {
                     this.u(var6 <= 0 ? 1 : 0);
                  }
               }
            }

            if (vf.e.do()) {
               vf.a(this, (sw)vf.e, (Object)Boolean.FALSE);
               if (!vf.int(vf.f, this, var1, var5, var4, this.eu > 0, var6)) {
                  Iterator var7 = var5.iterator();

                  while(var7.hasNext()) {
                     afk var8 = (afk)var7.next();
                     this.ap.new(var8);
                  }
               }
            }
         }

         this.ap.a((aiw)this, (byte)3);
      }

   }

   protected void u(int var1) {
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.bI();
      if (var3 > 0) {
         int var4 = this.bm.nextInt(3);
         if (var2 > 0) {
            var4 += this.bm.nextInt(var2 + 1);
         }

         for(int var5 = 0; var5 < var4; ++var5) {
            this.new(var3, 1);
         }
      }

   }

   protected int bI() {
      return 0;
   }

   protected void try(float var1) {
      if (vf.t.for()) {
         var1 = vf.for(vf.t, this, var1);
         if (var1 <= 0.0F) {
            return;
         }
      }

      super.try(var1);
      int var2 = ajs.a(var1 - 3.0F);
      if (var2 > 0) {
         if (var2 > 4) {
            this.a("damage.fallbig", 1.0F, 1.0F);
         } else {
            this.a("damage.fallsmall", 1.0F, 1.0F);
         }

         this.a(ai4.c, var2);
         int var3 = this.ap.new(ajs.a(this.al), ajs.a(this.ak - 0.20000000298023224D - (double)this.aQ), ajs.a(this.aj));
         if (var3 > 0) {
            o6 var4 = pa.x[var3].az;
            this.a(var4.if(), var4.for() * 0.5F, var4.a() * 0.75F);
         }
      }

   }

   public void int(float var1, float var2) {
      double var3;
      float var5;
      if (!this.ap() || this instanceof aek && ((aek)this).fY.a) {
         if (!this.ar() || this instanceof aek && ((aek)this).fY.a) {
            float var6 = 0.91F;
            if (this.aY) {
               var6 = 0.54600006F;
               int var7 = this.ap.new(ajs.a(this.al), ajs.a(this.aZ.a) - 1, ajs.a(this.aj));
               if (var7 > 0) {
                  var6 = pa.x[var7].aq * 0.91F;
               }
            }

            float var10 = 0.16277136F / (var6 * var6 * var6);
            if (this.aY) {
               if (this.co()) {
                  var5 = this.bY();
               } else {
                  var5 = this.fm;
               }

               var5 *= var10;
            } else {
               var5 = this.fl;
            }

            this.a(var1, var2, var5);
            var6 = 0.91F;
            if (this.aY) {
               var6 = 0.54600006F;
               int var8 = this.ap.new(ajs.a(this.al), ajs.a(this.aZ.a) - 1, ajs.a(this.aj));
               if (var8 > 0) {
                  var6 = pa.x[var8].aq * 0.91F;
               }
            }

            if (this.bZ()) {
               float var11 = 0.15F;
               if (this.ai < (double)(-var11)) {
                  this.ai = (double)(-var11);
               }

               if (this.ai > (double)var11) {
                  this.ai = (double)var11;
               }

               if (this.ag < (double)(-var11)) {
                  this.ag = (double)(-var11);
               }

               if (this.ag > (double)var11) {
                  this.ag = (double)var11;
               }

               this.aK = 0.0F;
               if (this.ah < -0.15D) {
                  this.ah = -0.15D;
               }

               boolean var9 = this.Q() && this instanceof aek;
               if (var9 && this.ah < 0.0D) {
                  this.ah = 0.0D;
               }
            }

            this.do(this.ai, this.ah, this.ag);
            if (this.aX && this.bZ()) {
               this.ah = 0.2D;
            }

            if (!this.ap.goto || this.ap.p((int)this.al, 0, (int)this.aj) && this.ap.try((int)this.al, (int)this.aj).e) {
               this.ah -= 0.08D;
            } else if (this.ak > 0.0D) {
               this.ah = -0.1D;
            } else {
               this.ah = 0.0D;
            }

            this.ah *= 0.9800000190734863D;
            this.ai *= (double)var6;
            this.ag *= (double)var6;
         } else {
            var3 = this.ak;
            this.a(var1, var2, 0.02F);
            this.do(this.ai, this.ah, this.ag);
            this.ai *= 0.5D;
            this.ah *= 0.5D;
            this.ag *= 0.5D;
            this.ah -= 0.02D;
            if (this.aX && this.int(this.ai, this.ah + 0.6000000238418579D - this.ak + var3, this.ag)) {
               this.ah = 0.30000001192092896D;
            }
         }
      } else {
         var3 = this.ak;
         this.a(var1, var2, this.co() ? 0.04F : 0.02F);
         this.do(this.ai, this.ah, this.ag);
         this.ai *= 0.800000011920929D;
         this.ah *= 0.800000011920929D;
         this.ag *= 0.800000011920929D;
         this.ah -= 0.02D;
         if (this.aX && this.int(this.ai, this.ah + 0.6000000238418579D - this.ak + var3, this.ag)) {
            this.ah = 0.30000001192092896D;
         }
      }

      this.ey = this.ex;
      var3 = this.al - this.ao;
      double var12 = this.aj - this.am;
      var5 = ajs.int(var3 * var3 + var12 * var12) * 4.0F;
      if (var5 > 1.0F) {
         var5 = 1.0F;
      }

      this.ex += (var5 - this.ex) * 0.4F;
      this.ew += this.ex;
   }

   public boolean bZ() {
      int var1 = ajs.a(this.al);
      int var2 = ajs.a(this.aZ.a);
      int var3 = ajs.a(this.aj);
      int var4 = this.ap.new(var1, var2, var3);
      return vf.N.for() ? vf.int(vf.N, pa.x[var4], this.ap, var1, var2, var3) : var4 == pa.cn.void || var4 == pa.Z.void;
   }

   public void for(aqv var1) {
      if (this.fi < -32768) {
         this.fi = -32768;
      }

      var1.a("Health", (short)this.fi);
      var1.a("HurtTime", (short)this.fe);
      var1.a("DeathTime", (short)this.fb);
      var1.a("AttackTime", (short)this.eF);
      var1.a("CanPickUpLoot", this.bL());
      var1.a("PersistenceRequired", this.eM);
      aqm var2 = new aqm();

      for(int var3 = 0; var3 < this.eR.length; ++var3) {
         aqv var4 = new aqv();
         if (this.eR[var3] != null) {
            this.eR[var3].if(var4);
         }

         var2.a((aqd)var4);
      }

      var1.a("Equipment", (aqd)var2);
      aqm var6;
      if (!this.es.isEmpty()) {
         var6 = new aqm();
         Iterator var7 = this.es.values().iterator();

         while(var7.hasNext()) {
            aiz var5 = (aiz)var7.next();
            var6.a((aqd)var5.if(new aqv()));
         }

         var1.a("ActiveEffects", (aqd)var6);
      }

      var6 = new aqm();

      for(int var8 = 0; var8 < this.ep.length; ++var8) {
         var6.a((aqd)(new aqq(var8 + "", this.ep[var8])));
      }

      var1.a("DropChances", (aqd)var6);
      var1.a("CustomName", this.cm());
      var1.a("CustomNameVisible", this.cr());
      var1.a("PersistentId", this.d6);
   }

   public void try(aqv var1) {
      this.fi = var1.case("Health");
      if (!var1.try("Health")) {
         this.fi = this.b0();
      }

      this.fe = var1.case("HurtTime");
      this.fb = var1.case("DeathTime");
      this.eF = var1.case("AttackTime");
      this.d(var1.if("CanPickUpLoot"));
      this.eM = var1.if("PersistenceRequired");
      if (var1.try("CustomName") && var1.new("CustomName").length() > 0) {
         this.int(var1.new("CustomName"));
      }

      this.b(var1.if("CustomNameVisible"));
      aqm var2;
      int var3;
      if (var1.try("Equipment")) {
         var2 = var1.void("Equipment");

         for(var3 = 0; var3 < this.eR.length; ++var3) {
            this.eR[var3] = abp.for((aqv)var2.a(var3));
         }
      }

      if (var1.try("ActiveEffects")) {
         var2 = var1.void("ActiveEffects");

         for(var3 = 0; var3 < var2.for(); ++var3) {
            aqv var4 = (aqv)var2.a(var3);
            aiz var5 = aiz.a(var4);
            this.es.put(var5.byte(), var5);
         }
      }

      if (var1.try("DropChances")) {
         var2 = var1.void("DropChances");

         for(var3 = 0; var3 < var2.for(); ++var3) {
            this.ep[var3] = ((aqq)var2.a(var3)).char;
         }
      }

      this.d6 = var1.goto("PersistentId");
      if (this.d6 == 0) {
         this.d6 = this.bm.nextInt(Integer.MAX_VALUE);
      }

   }

   public boolean aA() {
      return !this.aR && this.fi > 0;
   }

   public boolean bV() {
      return false;
   }

   public void c(float var1) {
      this.e6 = var1;
   }

   public void c(boolean var1) {
      this.e4 = var1;
   }

   public void bU() {
      if (this.eK > 0) {
         --this.eK;
      }

      if (this.ej > 0) {
         double var1 = this.al + (this.eh - this.al) / (double)this.ej;
         double var3 = this.ak + (this.ef - this.ak) / (double)this.ej;
         double var5 = this.aj + (this.ed - this.aj) / (double)this.ej;
         double var7 = ajs.do(this.eb - (double)this.a5);
         this.a5 = (float)((double)this.a5 + var7 / (double)this.ej);
         this.a4 = (float)((double)this.a4 + (this.d9 - (double)this.a4) / (double)this.ej);
         --this.ej;
         this.try(var1, var3, var5);
         this.do(this.a5, this.a4);
      } else if (!this.bw()) {
         this.ai *= 0.98D;
         this.ah *= 0.98D;
         this.ag *= 0.98D;
      }

      if (Math.abs(this.ai) < 0.005D) {
         this.ai = 0.0D;
      }

      if (Math.abs(this.ah) < 0.005D) {
         this.ah = 0.0D;
      }

      if (Math.abs(this.ag) < 0.005D) {
         this.ag = 0.0D;
      }

      this.ap.e.a("ai");
      if (this.bK()) {
         this.e4 = false;
         this.e7 = 0.0F;
         this.e6 = 0.0F;
         this.e5 = 0.0F;
      } else if (this.bw()) {
         if (this.co()) {
            this.ap.e.a("newAi");
            this.bQ();
            this.ap.e.if();
         } else {
            this.ap.e.a("oldAi");
            this.cl();
            this.ap.e.if();
            this.fA = this.a5;
         }
      }

      this.ap.e.if();
      this.ap.e.a("jump");
      if (this.e4) {
         if (!this.ap() && !this.ar()) {
            if (this.aY && this.eK == 0) {
               this.cf();
               this.eK = 10;
            }
         } else {
            this.ah += 0.03999999910593033D;
         }
      } else {
         this.eK = 0;
      }

      this.ap.e.if();
      this.ap.e.a("travel");
      this.e7 *= 0.98F;
      this.e6 *= 0.98F;
      this.e5 *= 0.9F;
      float var11 = this.fm;
      this.fm *= this.bM();
      this.int(this.e7, this.e6);
      this.fm = var11;
      this.ap.e.if();
      this.ap.e.a("push");
      if (!this.ap.goto) {
         this.cb();
      }

      this.ap.e.if();
      this.ap.e.a("looting");
      if (!this.ap.goto && this.bL() && !this.eC && this.ap.i().a("mobGriefing")) {
         List var2 = this.ap.a(afk.class, this.aZ.do(1.0D, 0.0D, 1.0D));
         Iterator var12 = var2.iterator();

         label158:
         while(true) {
            afk var4;
            int var6;
            abp var13;
            do {
               do {
                  do {
                     if (!var12.hasNext()) {
                        break label158;
                     }

                     var4 = (afk)var12.next();
                  } while(var4.aR);
               } while(var4.ba() == null);

               var13 = var4.ba();
               var6 = case(var13);
            } while(var6 <= -1);

            boolean var14 = true;
            abp var8 = this.A(var6);
            if (var8 != null) {
               if (var6 == 0) {
                  if (var13.d() instanceof aav && !(var8.d() instanceof aav)) {
                     var14 = true;
                  } else if (var13.d() instanceof aav && var8.d() instanceof aav) {
                     aav var15 = (aav)var13.d();
                     aav var16 = (aav)var8.d();
                     if (var15.m() != var16.m()) {
                        var14 = var15.m() > var16.m();
                     } else {
                        var14 = var13.new() > var8.new() || var13.a() && !var8.a();
                     }
                  } else {
                     var14 = false;
                  }
               } else if (var13.d() instanceof ac4 && !(var8.d() instanceof ac4)) {
                  var14 = true;
               } else if (var13.d() instanceof ac4 && var8.d() instanceof ac4) {
                  ac4 var9 = (ac4)var13.d();
                  ac4 var10 = (ac4)var8.d();
                  if (var9.dU != var10.dU) {
                     var14 = var9.dU > var10.dU;
                  } else {
                     var14 = var13.new() > var8.new() || var13.a() && !var8.a();
                  }
               } else {
                  var14 = false;
               }
            }

            if (var14) {
               if (var8 != null && this.bm.nextFloat() - 0.1F < this.ep[var6]) {
                  this.a(var8, 0.0F);
               }

               this.do(var6, var13);
               this.ep[var6] = 2.0F;
               this.eM = true;
               this.if((aiw)var4, 1);
               var4.az();
            }
         }
      }

      this.ap.e.if();
   }

   protected void cb() {
      List var1 = this.ap.a((aiw)this, (nw)this.aZ.do(0.20000000298023224D, 0.0D, 0.20000000298023224D));
      if (var1 != null && !var1.isEmpty()) {
         for(int var2 = 0; var2 < var1.size(); ++var2) {
            aiw var3 = (aiw)var1.get(var2);
            if (var3.ax()) {
               this.else(var3);
            }
         }
      }

   }

   protected void else(aiw var1) {
      var1.try((aiw)this);
   }

   protected boolean co() {
      return false;
   }

   protected boolean bw() {
      return !this.ap.goto;
   }

   protected boolean bK() {
      return this.fi <= 0;
   }

   public boolean b1() {
      return false;
   }

   protected void cf() {
      this.ah = 0.41999998688697815D;
      if (this.if(ai0.r)) {
         this.ah += (double)((float)(this.a(ai0.r).int() + 1) * 0.1F);
      }

      if (this.S()) {
         float var1 = this.a5 * 0.017453292F;
         this.ai -= (double)(ajs.try(var1) * 0.2F);
         this.ag += (double)(ajs.for(var1) * 0.2F);
      }

      this.ba = true;
      if (vf.n.for()) {
         vf.do(vf.n, this);
      }

   }

   protected boolean bn() {
      return true;
   }

   protected void bC() {
      if (!this.eM) {
         aek var1 = this.ap.if(this, -1.0D);
         if (var1 != null) {
            double var2 = var1.al - this.al;
            double var4 = var1.ak - this.ak;
            double var6 = var1.aj - this.aj;
            double var8 = var2 * var2 + var4 * var4 + var6 * var6;
            if (this.bn() && var8 > 16384.0D) {
               this.az();
            }

            if (this.e8 > 600 && this.bm.nextInt(800) == 0 && var8 > 1024.0D && this.bn()) {
               this.az();
            } else if (var8 < 1024.0D) {
               this.e8 = 0;
            }
         }
      }

   }

   protected void bQ() {
      ++this.e8;
      this.ap.e.a("checkDespawn");
      this.bC();
      this.ap.e.if();
      this.ap.e.a("sensing");
      this.eV.a();
      this.ap.e.if();
      this.ap.e.a("targetSelector");
      this.eq.a();
      this.ap.e.if();
      this.ap.e.a("goalSelector");
      this.er.a();
      this.ap.e.if();
      this.ap.e.a("navigation");
      this.eX.for();
      this.ap.e.if();
      this.ap.e.a("mob tick");
      this.b8();
      this.ap.e.if();
      this.ap.e.a("controls");
      this.ap.e.a("move");
      this.e0.a();
      this.ap.e.do("look");
      this.d7.a();
      this.ap.e.do("jump");
      this.eZ.a();
      this.ap.e.if();
      this.ap.e.if();
   }

   protected void b8() {
   }

   protected void cl() {
      ++this.e8;
      this.bC();
      this.e7 = 0.0F;
      this.e6 = 0.0F;
      float var1 = 8.0F;
      if (this.bm.nextFloat() < 0.02F) {
         aek var2 = this.ap.if(this, (double)var1);
         if (var2 != null) {
            this.eI = var2;
            this.e1 = 10 + this.bm.nextInt(20);
         } else {
            this.e5 = (this.bm.nextFloat() - 0.5F) * 20.0F;
         }
      }

      if (this.eI != null) {
         this.a(this.eI, 10.0F, (float)this.bJ());
         if (this.e1-- <= 0 || this.eI.aR || this.eI.for((aiw)this) > (double)(var1 * var1)) {
            this.eI = null;
         }
      } else {
         if (this.bm.nextFloat() < 0.05F) {
            this.e5 = (this.bm.nextFloat() - 0.5F) * 20.0F;
         }

         this.a5 += this.e5;
         this.a4 = this.e3;
      }

      boolean var4 = this.ap();
      boolean var3 = this.ar();
      if (var4 || var3) {
         this.e4 = this.bm.nextFloat() < 0.8F;
      }

   }

   protected void bs() {
      int var1 = this.b3();
      if (this.eo) {
         ++this.en;
         if (this.en >= var1) {
            this.en = 0;
            this.eo = false;
         }
      } else {
         this.en = 0;
      }

      this.fj = (float)this.en / (float)var1;
   }

   public int bJ() {
      return 40;
   }

   public void a(aiw var1, float var2, float var3) {
      double var4 = var1.al - this.al;
      double var6 = var1.aj - this.aj;
      double var8;
      if (var1 instanceof aig) {
         aig var10 = (aig)var1;
         var8 = var10.ak + (double)var10.af() - (this.ak + (double)this.af());
      } else {
         var8 = (var1.aZ.a + var1.aZ.int) / 2.0D - (this.ak + (double)this.af());
      }

      double var14 = (double)ajs.int(var4 * var4 + var6 * var6);
      float var12 = (float)(Math.atan2(var6, var4) * 180.0D / 3.141592653589793D) - 90.0F;
      float var13 = (float)(-(Math.atan2(var8, var14) * 180.0D / 3.141592653589793D));
      this.a4 = this.do(this.a4, var13, var3);
      this.a5 = this.do(this.a5, var12, var2);
   }

   private float do(float var1, float var2, float var3) {
      float var4 = ajs.int(var2 - var1);
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public boolean bj() {
      return this.ap.int(this.aZ) && this.ap.if((aiw)this, (nw)this.aZ).isEmpty() && !this.ap.do(this.aZ);
   }

   protected void ag() {
      this.a((ai4)ai4.b, 4);
   }

   public float void(float var1) {
      float var2 = this.fj - this.fk;
      if (var2 < 0.0F) {
         ++var2;
      }

      return this.fk + var2 * var1;
   }

   public nr long(float var1) {
      if (var1 == 1.0F) {
         return this.ap.do().a(this.al, this.ak, this.aj);
      } else {
         double var2 = this.ao + (this.al - this.ao) * (double)var1;
         double var4 = this.an + (this.ak - this.an) * (double)var1;
         double var6 = this.am + (this.aj - this.am) * (double)var1;
         return this.ap.do().a(var2, var4, var6);
      }
   }

   public nr T() {
      return this.b(1.0F);
   }

   public nr b(float var1) {
      float var2;
      float var3;
      float var4;
      float var5;
      if (var1 == 1.0F) {
         var2 = ajs.for(-this.a5 * 0.017453292F - 3.1415927F);
         var3 = ajs.try(-this.a5 * 0.017453292F - 3.1415927F);
         var4 = -ajs.for(-this.a4 * 0.017453292F);
         var5 = ajs.try(-this.a4 * 0.017453292F);
         return this.ap.do().a((double)(var3 * var4), (double)var5, (double)(var2 * var4));
      } else {
         var2 = this.a0 + (this.a4 - this.a0) * var1;
         var3 = this.a2 + (this.a5 - this.a2) * var1;
         var4 = ajs.for(-var3 * 0.017453292F - 3.1415927F);
         var5 = ajs.try(-var3 * 0.017453292F - 3.1415927F);
         float var6 = -ajs.for(-var2 * 0.017453292F);
         float var7 = ajs.try(-var2 * 0.017453292F);
         return this.ap.do().a((double)(var5 * var6), (double)var7, (double)(var4 * var6));
      }
   }

   public float bA() {
      return 1.0F;
   }

   public nt a(double var1, float var3) {
      nr var4 = this.long(var3);
      nr var5 = this.b(var3);
      nr var6 = var4.a(var5.int * var1, var5.for * var1, var5.do * var1);
      return this.ap.a(var4, var6);
   }

   public int b6() {
      return 4;
   }

   public void a(byte var1) {
      if (var1 == 2) {
         this.ex = 1.5F;
         this.bi = this.eN;
         this.fe = this.fd = 10;
         this.fc = 0.0F;
         this.a(this.bX(), this.bR(), (this.bm.nextFloat() - this.bm.nextFloat()) * 0.2F + 1.0F);
         this.a((ai4)ai4.void, 0);
      } else if (var1 == 3) {
         this.a(this.bS(), this.bR(), (this.bm.nextFloat() - this.bm.nextFloat()) * 0.2F + 1.0F);
         this.fi = 0;
         this.a(ai4.void);
      } else {
         super.a(var1);
      }

   }

   public boolean cg() {
      return false;
   }

   public ajd a(abp var1, int var2) {
      return var1.f();
   }

   protected void bT() {
      Iterator var1 = this.es.keySet().iterator();

      while(var1.hasNext()) {
         Integer var2 = (Integer)var1.next();
         aiz var3 = (aiz)this.es.get(var2);

         try {
            if (!var3.if(this)) {
               if (!this.ap.goto) {
                  var1.remove();
                  this.do(var3);
               }
            } else if (var3.do() % 600 == 0) {
               this.if(var3);
            }
         } catch (Throwable var11) {
            aqh var5 = aqh.a(var11, "Ticking mob effect instance");
            apu var6 = var5.a("Mob effect being ticked");
            var6.a((String)"Effect Name", (Callable)(new aif(this, var3)));
            var6.a((String)"Effect ID", (Callable)(new aie(this, var3)));
            var6.a((String)"Effect Duration", (Callable)(new aid(this, var3)));
            var6.a((String)"Effect Amplifier", (Callable)(new aic(this, var3)));
            var6.a((String)"Effect is Splash", (Callable)(new aib(this, var3)));
            var6.a((String)"Effect is Ambient", (Callable)(new aia(this, var3)));
            throw new ape(var5);
         }
      }

      int var12;
      if (this.ea) {
         if (!this.ap.goto) {
            if (this.es.isEmpty()) {
               this.bg.if(9, (byte)0);
               this.bg.if(8, 0);
               this.do(false);
            } else {
               var12 = aas.a(this.es.values());
               this.bg.if(9, (byte)(aas.if(this.es.values()) ? 1 : 0));
               this.bg.if(8, var12);
               this.do(this.r(ai0.l.try));
            }
         }

         this.ea = false;
      }

      var12 = this.bg.int(8);
      boolean var13 = this.bg.for(9) > 0;
      if (var12 > 0) {
         boolean var4 = false;
         if (!this.U()) {
            var4 = this.bm.nextBoolean();
         } else {
            var4 = this.bm.nextInt(15) == 0;
         }

         if (var13) {
            var4 &= this.bm.nextInt(5) == 0;
         }

         if (var4 && var12 > 0) {
            double var14 = (double)(var12 >> 16 & 255) / 255.0D;
            double var7 = (double)(var12 >> 8 & 255) / 255.0D;
            double var9 = (double)(var12 >> 0 & 255) / 255.0D;
            this.ap.a(var13 ? "mobSpellAmbient" : "mobSpell", this.al + (this.bm.nextDouble() - 0.5D) * (double)this.aP, this.ak + this.bm.nextDouble() * (double)this.aO - (double)this.aQ, this.aj + (this.bm.nextDouble() - 0.5D) * (double)this.aP, var14, var7, var9);
         }
      }

   }

   public void ca() {
      Iterator var1 = this.es.keySet().iterator();

      while(var1.hasNext()) {
         Integer var2 = (Integer)var1.next();
         aiz var3 = (aiz)this.es.get(var2);
         if (!this.ap.goto) {
            var1.remove();
            this.do(var3);
         }
      }

   }

   public Collection bi() {
      return this.es.values();
   }

   public boolean r(int var1) {
      return this.es.containsKey(var1);
   }

   public boolean if(ai0 var1) {
      return this.es.containsKey(var1.try);
   }

   public aiz a(ai0 var1) {
      return (aiz)this.es.get(var1.try);
   }

   public void for(aiz var1) {
      if (this.a(var1)) {
         if (this.es.containsKey(var1.byte())) {
            ((aiz)this.es.get(var1.byte())).a(var1);
            this.if((aiz)this.es.get(var1.byte()));
         } else {
            this.es.put(var1.byte(), var1);
            this.int(var1);
         }
      }

   }

   public boolean a(aiz var1) {
      if (this.cn() == ah8.a) {
         int var2 = var1.byte();
         if (var2 == ai0.p.try || var2 == ai0.g.try) {
            return false;
         }
      }

      return true;
   }

   public boolean bu() {
      return this.cn() == ah8.a;
   }

   public void z(int var1) {
      this.es.remove(var1);
   }

   public void v(int var1) {
      aiz var2 = (aiz)this.es.remove(var1);
      if (var2 != null) {
         this.do(var2);
      }

   }

   protected void int(aiz var1) {
      this.ea = true;
   }

   protected void if(aiz var1) {
      this.ea = true;
   }

   protected void do(aiz var1) {
      this.ea = true;
   }

   public float bM() {
      float var1 = 1.0F;
      if (this.if(ai0.y)) {
         var1 *= 1.0F + 0.2F * (float)(this.a(ai0.y).int() + 1);
      }

      if (this.if(ai0.x)) {
         var1 *= 1.0F - 0.15F * (float)(this.a(ai0.x).int() + 1);
      }

      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      return var1;
   }

   public void char(double var1, double var3, double var5) {
      this.if(var1, var3, var5, this.a5, this.a4);
   }

   public boolean bG() {
      return false;
   }

   public ah8 cn() {
      return ah8.if;
   }

   public void byte(abp var1) {
      this.a("random.break", 0.8F, 0.8F + this.ap.o.nextFloat() * 0.4F);

      for(int var2 = 0; var2 < 5; ++var2) {
         nr var3 = this.ap.do().a(((double)this.bm.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
         var3.if(-this.a4 * 3.1415927F / 180.0F);
         var3.a(-this.a5 * 3.1415927F / 180.0F);
         nr var4 = this.ap.do().a(((double)this.bm.nextFloat() - 0.5D) * 0.3D, (double)(-this.bm.nextFloat()) * 0.6D - 0.3D, 0.6D);
         var4.if(-this.a4 * 3.1415927F / 180.0F);
         var4.a(-this.a5 * 3.1415927F / 180.0F);
         var4 = var4.a(this.al, this.ak + (double)this.af(), this.aj);
         this.ap.a("iconcrack_" + var1.d().A, var4.int, var4.for, var4.do, var3.int, var3.for + 0.05D, var3.do);
      }

   }

   public void char(abp var1) {
      Iterator var2 = this.es.keySet().iterator();
      if (!this.ap.goto) {
         while(var2.hasNext()) {
            Integer var3 = (Integer)var2.next();
            aiz var4 = (aiz)this.es.get(var3);
            if (vf.int(var4, vf.g, var1)) {
               var2.remove();
               this.do(var4);
            }
         }
      }

   }

   public boolean int(aek var1) {
      return this instanceof af3;
   }

   public int ak() {
      if (this.bB() == null) {
         return 3;
      } else {
         int var1 = (int)((float)this.fi - (float)this.b0() * 0.33F);
         var1 -= (3 - this.ap.p) * 4;
         if (var1 < 0) {
            var1 = 0;
         }

         return var1 + 3;
      }
   }

   public abp bW() {
      return this.eR[0];
   }

   public abp A(int var1) {
      return this.eR[var1];
   }

   public abp s(int var1) {
      return this.eR[var1 + 1];
   }

   public void do(int var1, abp var2) {
      this.eR[var1] = var2;
   }

   public abp[] as() {
      return this.eR;
   }

   protected void if(boolean var1, int var2) {
      for(int var3 = 0; var3 < this.as().length; ++var3) {
         abp var4 = this.A(var3);
         boolean var5 = this.ep[var3] > 1.0F;
         if (var4 != null && (var1 || var5) && this.bm.nextFloat() - (float)var2 * 0.01F < this.ep[var3]) {
            if (!var5 && var4.else()) {
               int var6 = Math.max(var4.e() - 25, 1);
               int var7 = var4.e() - this.bm.nextInt(this.bm.nextInt(var6) + 1);
               if (var7 > var6) {
                  var7 = var6;
               }

               if (var7 < 1) {
                  var7 = 1;
               }

               var4.do(var7);
            }

            this.a(var4, 0.0F);
         }
      }

   }

   protected void bk() {
      if (this.bm.nextFloat() < ei[this.ap.p]) {
         int var1 = this.bm.nextInt(2);
         float var2 = this.ap.p == 3 ? 0.1F : 0.25F;
         if (this.bm.nextFloat() < 0.095F) {
            ++var1;
         }

         if (this.bm.nextFloat() < 0.095F) {
            ++var1;
         }

         if (this.bm.nextFloat() < 0.095F) {
            ++var1;
         }

         for(int var3 = 3; var3 >= 0; --var3) {
            abp var4 = this.s(var3);
            if (var3 < 3 && this.bm.nextFloat() < var2) {
               break;
            }

            if (var4 == null) {
               abr var5 = try(var3 + 1, var1);
               if (var5 != null) {
                  this.do(var3 + 1, new abp(var5));
               }
            }
         }
      }

   }

   public void if(aiw var1, int var2) {
      if (!var1.aR && !this.ap.goto) {
         alb var3 = ((ak5)this.ap).D();
         if (var1 instanceof afk) {
            var3.a((aiw)var1, (an7)(new anf(var1.av, this.av)));
         }

         if (var1 instanceof aei) {
            var3.a((aiw)var1, (an7)(new anf(var1.av, this.av)));
         }

         if (var1 instanceof aik) {
            var3.a((aiw)var1, (an7)(new anf(var1.av, this.av)));
         }
      }

   }

   public static int case(abp var0) {
      if (var0.new != pa.aW.void && var0.new != abr.bv.A) {
         if (var0.d() instanceof ac4) {
            switch(((ac4)var0.d()).dV) {
            case 0:
               return 4;
            case 1:
               return 3;
            case 2:
               return 2;
            case 3:
               return 1;
            }
         }

         return 0;
      } else {
         return 4;
      }
   }

   public static abr try(int var0, int var1) {
      switch(var0) {
      case 4:
         if (var1 == 0) {
            return abr.aA;
         } else if (var1 == 1) {
            return abr.bD;
         } else if (var1 == 2) {
            return abr.b2;
         } else if (var1 == 3) {
            return abr.bU;
         } else if (var1 == 4) {
            return abr.bM;
         }
      case 3:
         if (var1 == 0) {
            return abr.ay;
         } else if (var1 == 1) {
            return abr.bB;
         } else if (var1 == 2) {
            return abr.b0;
         } else if (var1 == 3) {
            return abr.bS;
         } else if (var1 == 4) {
            return abr.bK;
         }
      case 2:
         if (var1 == 0) {
            return abr.aw;
         } else if (var1 == 1) {
            return abr.bz;
         } else if (var1 == 2) {
            return abr.bY;
         } else if (var1 == 3) {
            return abr.bQ;
         } else if (var1 == 4) {
            return abr.bI;
         }
      case 1:
         if (var1 == 0) {
            return abr.au;
         } else if (var1 == 1) {
            return abr.by;
         } else if (var1 == 2) {
            return abr.bW;
         } else if (var1 == 3) {
            return abr.bO;
         } else if (var1 == 4) {
            return abr.bF;
         }
      default:
         return null;
      }
   }

   protected void bz() {
      if (this.bW() != null && this.bm.nextFloat() < em[this.ap.p]) {
         z1.a(this.bm, this.bW(), 5 + this.ap.p * this.bm.nextInt(6));
      }

      for(int var1 = 0; var1 < 4; ++var1) {
         abp var2 = this.s(var1);
         if (var2 != null && this.bm.nextFloat() < ek[this.ap.p]) {
            z1.a(this.bm, var2, 5 + this.ap.p * this.bm.nextInt(6));
         }
      }

   }

   public void bO() {
   }

   private int b3() {
      return this.if(ai0.w) ? 6 - (1 + this.a(ai0.w).int()) * 1 : (this.if(ai0.v) ? 6 + (1 + this.a(ai0.v).int()) * 2 : 6);
   }

   public void b5() {
      if (!this.eo || this.en >= this.b3() / 2 || this.en < 0) {
         this.en = -1;
         this.eo = true;
         if (this.ap instanceof ak5) {
            ((ak5)this.ap).D().a((aiw)this, (an7)(new apl(this, 1)));
         }
      }

   }

   public boolean cj() {
      return false;
   }

   public final int bt() {
      return this.bg.for(10);
   }

   public final void y(int var1) {
      this.bg.if(10, (byte)var1);
   }

   public aig bN() {
      return (aig)(this.el.int() != null ? this.el.int() : (this.ev != null ? this.ev : (this.eg != null ? this.eg : null)));
   }

   public String aB() {
      return this.cc() ? this.cm() : super.aB();
   }

   public void int(String var1) {
      this.bg.if(5, var1);
   }

   public String cm() {
      return this.bg.a(5);
   }

   public boolean cc() {
      return this.bg.a(5).length() > 0;
   }

   public void b(boolean var1) {
      this.bg.if(6, (byte)(var1 ? 1 : 0));
   }

   public boolean cr() {
      return this.bg.for(6) == 1;
   }

   public boolean bx() {
      return this.cr();
   }

   public void a(int var1, float var2) {
      this.ep[var1] = var2;
   }

   public boolean bL() {
      return this.eO;
   }

   public void d(boolean var1) {
      this.eO = var1;
   }
}
