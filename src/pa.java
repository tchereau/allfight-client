import java.util.List;
import java.util.Random;

public class pa {
   private acn X;
   public static final o6 V = new o6("stone", 1.0F, 1.0F);
   public static final o6 T = new o6("wood", 1.0F, 1.0F);
   public static final o6 R = new o6("gravel", 1.0F, 1.0F);
   public static final o6 P = new o6("grass", 1.0F, 1.0F);
   public static final o6 N = new o6("stone", 1.0F, 1.0F);
   public static final o6 L = new o6("stone", 1.0F, 1.5F);
   public static final o6 J = new o9("stone", 1.0F, 1.0F);
   public static final o6 H = new o6("cloth", 1.0F, 1.0F);
   public static final o6 F = new o6("sand", 1.0F, 1.0F);
   public static final o6 D = new o6("snow", 1.0F, 1.0F);
   public static final o6 B = new o8("ladder", 1.0F, 1.0F);
   public static final o6 z = new o7("anvil", 0.3F, 1.0F);
   public static final pa[] x = new pa[4096];
   public static final boolean[] v = new boolean[4096];
   public static final int[] t = new int[4096];
   public static final boolean[] r = new boolean[4096];
   public static final int[] o = new int[4096];
   public static boolean[] m = new boolean[4096];
   public static final pa k;
   public static final q2 i;
   public static final pa g;
   public static final pa bf;
   public static final pa be;
   public static final pa bd;
   public static final pa bc;
   public static final qn bb;
   public static final pa ba;
   public static final qn a7;
   public static final pa a4;
   public static final pa a1;
   public static final pa aY;
   public static final pa aV;
   public static final pa aS;
   public static final pa aP;
   public static final pa aM;
   public static final qq aJ;
   public static final pa aG;
   public static final pa aD;
   public static final pa aA;
   public static final pa ax;
   public static final pa au;
   public static final pa ar;
   public static final pa ao;
   public static final pa al;
   public static final pa aj;
   public static final pa ah;
   public static final n0 af;
   public static final pa b5;
   public static final pe b3;
   public static final rm b1;
   public static final n0 bZ;
   public static final nz bX;
   public static final pa bV;
   public static final ny bT;
   public static final r0 bR;
   public static final r0 bP;
   public static final r0 bN;
   public static final r0 bL;
   public static final pa bJ;
   public static final pa bH;
   public static final q0 bF;
   public static final pa a;
   public static final pa for;
   public static final pa new;
   public static final pa long;
   public static final pa try;
   public static final pa byte;
   public static final pa p;
   public static final pa char;
   public static final pa int;
   public static final pa else;
   public static final pa bt;
   public static final pa ab;
   public static final pa do;
   public static final pa case;
   public static final pa if;
   public static final pa goto;
   public static final q0 bD;
   public static final pa bB;
   public static final pa bz;
   public static final pa bx;
   public static final pa bv;
   public static final pa bs;
   public static final pa bq;
   public static final q7 bo;
   public static final pa bm;
   public static final pa bk;
   public static final ru bi;
   public static final px bg;
   public static final pa cw;
   public static final pa cv;
   public static final pa cu;
   public static final pa ct;
   public static final pa cs;
   public static final pa cr;
   public static final pa cq;
   public static final pa cp;
   public static final pa co;
   public static final pa cn;
   public static final pa cm;
   public static final pa cl;
   public static final pa ck;
   public static final pa cj;
   public static final pa ci;
   public static final pa ch;
   public static final pa cg;
   public static final pa cf;
   public static final pa ce;
   public static final pa cd;
   public static final pa cc;
   public static final pa cb;
   public static final pa ca;
   public static final pa b9;
   public static final pa b8;
   public static final pa b7;
   public static final pa a8;
   public static final pa a5;
   public static final pa a2;
   public static final pa aZ;
   public static final pa aW;
   public static final pa aT;
   public static final pa aQ;
   public static final pa aN;
   public static final p8 aK;
   public static final pa aH;
   public static final pa aE;
   public static final ps aB;
   public static final ps ay;
   public static final pa av;
   public static final pa as;
   public static final pa ap;
   public static final pa am;
   public static final pa ak;
   public static final pa ai;
   public static final pa ag;
   public static final pa ae;
   public static final pa ad;
   public static final pa ac;
   public static final pa aa;
   public static final pa Z;
   public static final pa Y;
   public static final pa b6;
   public static final pa b4;
   public static final qe b2;
   public static final pa b0;
   public static final pa bY;
   public static final pa bW;
   public static final pa bU;
   public static final pa bS;
   public static final pa bQ;
   public static final pa bO;
   public static final rv bM;
   public static final pa bK;
   public static final pa bI;
   public static final pa bG;
   public static final pa bE;
   public static final pa bC;
   public static final pa bA;
   public static final q0 by;
   public static final q0 bw;
   public static final pa bu;
   public static final pa br;
   public static final pa bp;
   public static final pa bn;
   public static final oz bl;
   public static final pa bj;
   public static final pa bh;
   public static final pa U;
   public static final pa S;
   public static final pa Q;
   public static final pa O;
   public static final r4 M;
   public static final pa K;
   public static final pa I;
   public static final pa G;
   public static final pa E;
   public static final pa C;
   public static final pa A;
   public static final pa y;
   public static final pa w;
   public static final pa u;
   public static final pa s;
   public static final rp q;
   public static final rp n;
   public static final rn l;
   public static final pa j;
   public static final pa h;
   public static final qv f;
   public static final pa e;
   public static final pa d;
   public static final pa c;
   public static final pa b;
   public final int void;
   protected float a9;
   protected float a6;
   protected boolean a3 = true;
   protected boolean a0 = true;
   protected boolean aX;
   protected boolean aU;
   protected double aR;
   protected double aO;
   protected double aL;
   protected double aI;
   protected double aF;
   protected double aC;
   public o6 az;
   public float aw;
   public final ts at;
   public float aq;
   private String W;
   protected ajd an;

   protected pa(int var1, ts var2) {
      this.az = V;
      this.aw = 1.0F;
      this.aq = 0.6F;
      if (x[var1] != null) {
         throw new IllegalArgumentException("Slot " + var1 + " is already occupied by " + x[var1] + " when adding " + this);
      } else {
         this.at = var2;
         x[var1] = this;
         this.void = var1;
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         v[var1] = this.do();
         t[var1] = this.do() ? 255 : 0;
         r[var1] = !var2.d();
      }
   }

   protected void else() {
   }

   protected pa a(o6 var1) {
      this.az = var1;
      return this;
   }

   protected pa new(int var1) {
      t[this.void] = var1;
      return this;
   }

   protected pa do(float var1) {
      o[this.void] = (int)(15.0F * var1);
      return this;
   }

   protected pa a(float var1) {
      this.a6 = var1 * 3.0F;
      return this;
   }

   public static boolean if(int var0) {
      pa var1 = x[var0];
      return var1 == null ? false : var1.at.goto() && var1.if() && !var1.int();
   }

   public boolean if() {
      return true;
   }

   public boolean a(yy var1, int var2, int var3, int var4) {
      return !this.at.void();
   }

   public int new() {
      return 0;
   }

   protected pa if(float var1) {
      this.a9 = var1;
      if (this.a6 < var1 * 5.0F) {
         this.a6 = var1 * 5.0F;
      }

      return this;
   }

   protected pa a() {
      this.if(-1.0F);
      return this;
   }

   public float if(y6 var1, int var2, int var3, int var4) {
      return this.a9;
   }

   protected pa a(boolean var1) {
      this.aX = var1;
      return this;
   }

   public boolean f() {
      return this.aX;
   }

   public boolean h() {
      return this.aU;
   }

   protected final void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.aR = (double)var1;
      this.aO = (double)var2;
      this.aL = (double)var3;
      this.aI = (double)var4;
      this.aF = (double)var5;
      this.aC = (double)var6;
   }

   public float if(yy var1, int var2, int var3, int var4) {
      return var1.if(var2, var3, var4, o[var1.new(var2, var3, var4)]);
   }

   public int new(yy var1, int var2, int var3, int var4) {
      return var1.do(var2, var3, var4, o[var1.new(var2, var3, var4)]);
   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      return var5 == 0 && this.aO > 0.0D ? true : (var5 == 1 && this.aF < 1.0D ? true : (var5 == 2 && this.aL > 0.0D ? true : (var5 == 3 && this.aC < 1.0D ? true : (var5 == 4 && this.aR > 0.0D ? true : (var5 == 5 && this.aI < 1.0D ? true : !var1.do(var2, var3, var4))))));
   }

   public boolean a(yy var1, int var2, int var3, int var4, int var5) {
      return var1.byte(var2, var3, var4).for();
   }

   public ajd if(yy var1, int var2, int var3, int var4, int var5) {
      return this.if(var5, var1.for(var2, var3, var4));
   }

   public ajd if(int var1, int var2) {
      return this.an;
   }

   public final ajd do(int var1) {
      return this.if(var1, 0);
   }

   public nw new(y6 var1, int var2, int var3, int var4) {
      return nw.if().a((double)var2 + this.aR, (double)var3 + this.aO, (double)var4 + this.aL, (double)var2 + this.aI, (double)var3 + this.aF, (double)var4 + this.aC);
   }

   public void a(y6 var1, int var2, int var3, int var4, nw var5, List var6, aiw var7) {
      nw var8 = this.int(var1, var2, var3, var4);
      if (var8 != null && var5.a(var8)) {
         var6.add(var8);
      }

   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      return nw.if().a((double)var2 + this.aR, (double)var3 + this.aO, (double)var4 + this.aL, (double)var2 + this.aI, (double)var3 + this.aF, (double)var4 + this.aC);
   }

   public boolean do() {
      return true;
   }

   public boolean a(int var1, boolean var2) {
      return this.goto();
   }

   public boolean goto() {
      return true;
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5) {
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
   }

   public int a(y6 var1) {
      return 10;
   }

   public void for(y6 var1, int var2, int var3, int var4) {
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public int a(Random var1) {
      return 1;
   }

   public int a(int var1, Random var2, int var3) {
      return this.void;
   }

   public float a(aek var1, y6 var2, int var3, int var4, int var5) {
      float var6 = this.if(var2, var3, var4, var5);
      return var6 < 0.0F ? 0.0F : (!var1.do(this) ? var1.a(this, false) / var6 / 100.0F : var1.a(this, true) / var6 / 30.0F);
   }

   public final void a(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      this.a(var1, var2, var3, var4, var5, 1.0F, var6);
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if (!var1.goto) {
         int var8 = this.a(var7, var1.o);

         for(int var9 = 0; var9 < var8; ++var9) {
            if (var1.o.nextFloat() <= var6) {
               int var10 = this.a(var5, var1.o, var7);
               if (var10 > 0) {
                  this.a(var1, var2, var3, var4, new abp(var10, 1, this.for(var5)));
               }
            }
         }
      }

   }

   protected void a(y6 var1, int var2, int var3, int var4, abp var5) {
      if (!var1.goto && var1.i().a("doTileDrops")) {
         float var6 = 0.7F;
         double var7 = (double)(var1.o.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
         double var9 = (double)(var1.o.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
         double var11 = (double)(var1.o.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
         afk var13 = new afk(var1, (double)var2 + var7, (double)var3 + var9, (double)var4 + var11, var5);
         var13.dB = 10;
         var1.new(var13);
      }

   }

   protected void do(y6 var1, int var2, int var3, int var4, int var5) {
      if (!var1.goto) {
         while(var5 > 0) {
            int var6 = aik.aC(var5);
            var5 -= var6;
            var1.new(new aik(var1, (double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, var6));
         }
      }

   }

   public int for(int var1) {
      return 0;
   }

   public float a(aiw var1) {
      return this.a6 / 5.0F;
   }

   public nt a(y6 var1, int var2, int var3, int var4, nr var5, nr var6) {
      this.int((yy)var1, var2, var3, var4);
      var5 = var5.a((double)(-var2), (double)(-var3), (double)(-var4));
      var6 = var6.a((double)(-var2), (double)(-var3), (double)(-var4));
      nr var7 = var5.if(var6, this.aR);
      nr var8 = var5.if(var6, this.aI);
      nr var9 = var5.do(var6, this.aO);
      nr var10 = var5.do(var6, this.aF);
      nr var11 = var5.a(var6, this.aL);
      nr var12 = var5.a(var6, this.aC);
      if (!this.do(var7)) {
         var7 = null;
      }

      if (!this.do(var8)) {
         var8 = null;
      }

      if (!this.a(var9)) {
         var9 = null;
      }

      if (!this.a(var10)) {
         var10 = null;
      }

      if (!this.if(var11)) {
         var11 = null;
      }

      if (!this.if(var12)) {
         var12 = null;
      }

      nr var13 = null;
      if (var7 != null && (var13 == null || var5.for(var7) < var5.for(var13))) {
         var13 = var7;
      }

      if (var8 != null && (var13 == null || var5.for(var8) < var5.for(var13))) {
         var13 = var8;
      }

      if (var9 != null && (var13 == null || var5.for(var9) < var5.for(var13))) {
         var13 = var9;
      }

      if (var10 != null && (var13 == null || var5.for(var10) < var5.for(var13))) {
         var13 = var10;
      }

      if (var11 != null && (var13 == null || var5.for(var11) < var5.for(var13))) {
         var13 = var11;
      }

      if (var12 != null && (var13 == null || var5.for(var12) < var5.for(var13))) {
         var13 = var12;
      }

      if (var13 == null) {
         return null;
      } else {
         byte var14 = -1;
         if (var13 == var7) {
            var14 = 4;
         }

         if (var13 == var8) {
            var14 = 5;
         }

         if (var13 == var9) {
            var14 = 0;
         }

         if (var13 == var10) {
            var14 = 1;
         }

         if (var13 == var11) {
            var14 = 2;
         }

         if (var13 == var12) {
            var14 = 3;
         }

         return new nt(var2, var3, var4, var14, var13.a((double)var2, (double)var3, (double)var4));
      }
   }

   private boolean do(nr var1) {
      return var1 == null ? false : var1.for >= this.aO && var1.for <= this.aF && var1.do >= this.aL && var1.do <= this.aC;
   }

   private boolean a(nr var1) {
      return var1 == null ? false : var1.int >= this.aR && var1.int <= this.aI && var1.do >= this.aL && var1.do <= this.aC;
   }

   private boolean if(nr var1) {
      return var1 == null ? false : var1.int >= this.aR && var1.int <= this.aI && var1.for >= this.aO && var1.for <= this.aF;
   }

   public void a(y6 var1, int var2, int var3, int var4, zg var5) {
   }

   public int b() {
      return 0;
   }

   public boolean a(y6 var1, int var2, int var3, int var4, int var5, abp var6) {
      return this.for(var1, var2, var3, var4, var5);
   }

   public boolean for(y6 var1, int var2, int var3, int var4, int var5) {
      return this.case(var1, var2, var3, var4);
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.new(var2, var3, var4);
      return var5 == 0 || x[var5].at.c();
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      return false;
   }

   public void a(y6 var1, int var2, int var3, int var4, aiw var5) {
   }

   public int a(y6 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      return var9;
   }

   public void a(y6 var1, int var2, int var3, int var4, aek var5) {
   }

   public void a(y6 var1, int var2, int var3, int var4, aiw var5, nr var6) {
   }

   public void int(yy var1, int var2, int var3, int var4) {
   }

   public final double j() {
      return this.aR;
   }

   public final double l() {
      return this.aI;
   }

   public final double m() {
      return this.aO;
   }

   public final double n() {
      return this.aF;
   }

   public final double o() {
      return this.aL;
   }

   public final double q() {
      return this.aC;
   }

   public int c() {
      return 16777215;
   }

   public int a(int var1) {
      return 16777215;
   }

   public int do(yy var1, int var2, int var3, int var4) {
      return 16777215;
   }

   public int do(yy var1, int var2, int var3, int var4, int var5) {
      return 0;
   }

   public boolean int() {
      return false;
   }

   public void if(y6 var1, int var2, int var3, int var4, aiw var5) {
   }

   public int for(yy var1, int var2, int var3, int var4, int var5) {
      return 0;
   }

   public void try() {
   }

   public void a(y6 var1, aek var2, int var3, int var4, int var5, int var6) {
      var2.a((akf)aka.void[this.void], 1);
      var2.d(0.025F);
      if (this.d() && z1.for(var2)) {
         abp var8 = this.int(var6);
         if (var8 != null) {
            this.a(var1, var3, var4, var5, var8);
         }
      } else {
         int var7 = z1.a((aig)var2);
         this.a(var1, var3, var4, var5, var6, var7);
      }

   }

   protected boolean d() {
      return this.if() && !this.aU;
   }

   protected abp int(int var1) {
      int var2 = 0;
      if (this.void >= 0 && this.void < abr.ai.length && abr.ai[this.void].b()) {
         var2 = var1;
      }

      return new abp(this.void, 1, var2);
   }

   public int a(int var1, Random var2) {
      return this.a(var2);
   }

   public boolean try(y6 var1, int var2, int var3, int var4) {
      return true;
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
   }

   public void try(y6 var1, int var2, int var3, int var4, int var5) {
   }

   public pa a(String var1) {
      this.W = var1;
      return this;
   }

   public String p() {
      return aqz.if(this.long() + ".name");
   }

   public String long() {
      return "tile." + this.W;
   }

   public String e() {
      return this.W;
   }

   public boolean if(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      return false;
   }

   public boolean byte() {
      return this.a0;
   }

   protected pa g() {
      this.a0 = false;
      return this;
   }

   public int case() {
      return this.at.b();
   }

   public float for(yy var1, int var2, int var3, int var4) {
      return var1.try(var2, var3, var4) ? 0.2F : 1.0F;
   }

   public void a(y6 var1, int var2, int var3, int var4, aiw var5, float var6) {
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return this.void;
   }

   public int a(y6 var1, int var2, int var3, int var4) {
      return this.for(var1.for(var2, var3, var4));
   }

   public void a(int var1, acn var2, List var3) {
      var3.add(new abp(var1, 1, 0));
   }

   public acn i() {
      return this.X;
   }

   public pa a(acn var1) {
      this.X = var1;
      return this;
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, aek var6) {
   }

   public void if(y6 var1, int var2, int var3, int var4, int var5) {
   }

   public void byte(y6 var1, int var2, int var3, int var4) {
   }

   public boolean for() {
      return false;
   }

   public boolean char() {
      return true;
   }

   public boolean a(zg var1) {
      return true;
   }

   public boolean try(int var1) {
      return this.void == var1;
   }

   public static boolean a(int var0, int var1) {
      return var0 == var1 ? true : (var0 != 0 && var1 != 0 && x[var0] != null && x[var1] != null ? x[var0].try(var1) : false);
   }

   public boolean k() {
      return false;
   }

   public int int(y6 var1, int var2, int var3, int var4, int var5) {
      return 0;
   }

   public void a(ajc var1) {
      this.an = var1.a(this.W);
   }

   public String void() {
      return null;
   }

   static {
      k = (new pf(1)).if(1.5F).a(10.0F).a(N).a("stone");
      i = (q2)(new q2(2)).if(0.6F).a(P).a("grass");
      g = (new ri(3)).if(0.5F).a(R).a("dirt");
      bf = (new pa(4, ts.v)).if(2.0F).a(10.0F).a(N).a("stonebrick").a(acn.d);
      be = (new oq(5)).if(2.0F).a(5.0F).a(T).a("wood");
      bd = (new pq(6)).if(0.0F).a(P).a("sapling");
      bc = (new pa(7, ts.v)).a().a(6000000.0F).a(N).a("bedrock").g().a(acn.d);
      bb = (qn)(new qm(8, ts.s)).if(100.0F).new(3).a("water").g();
      ba = (new ql(9, ts.s)).if(100.0F).new(3).a("water").g();
      a7 = (qn)(new qm(10, ts.r)).if(0.0F).do(1.0F).a("lava").g();
      a4 = (new ql(11, ts.r)).if(100.0F).do(1.0F).a("lava").g();
      a1 = (new qy(12)).if(0.5F).a(F).a("sand");
      aY = (new q1(13)).if(0.6F).a(R).a("gravel");
      aV = (new p9(14)).if(3.0F).a(5.0F).a(N).a("oreGold");
      aS = (new p9(15)).if(3.0F).a(5.0F).a(N).a("oreIron");
      aP = (new p9(16)).if(3.0F).a(5.0F).a(N).a("oreCoal");
      aM = (new o0(17)).if(2.0F).a(T).a("log");
      aJ = (qq)(new qq(18)).if(0.2F).new(1).a(P).a("leaves");
      aG = (new pl(19)).if(0.6F).a(P).a("sponge");
      aD = (new q3(20, ts.i, false)).if(0.3F).a(J).a("glass");
      aA = (new p9(21)).if(3.0F).a(5.0F).a(N).a("oreLapis");
      ax = (new pa(22, ts.v)).if(3.0F).a(5.0F).a(N).a("blockLapis").a(acn.d);
      au = (new rh(23)).if(3.5F).a(N).a("dispenser");
      ar = (new pr(24)).a(N).if(0.8F).a("sandStone");
      ao = (new qf(25)).if(0.8F).a("musicBlock");
      al = (new r3(26)).if(0.2F).a("bed").g();
      aj = (new p5(27)).if(0.7F).a(L).a("goldenRail");
      ah = (new rl(28)).if(0.7F).a(L).a("detectorRail");
      af = (n0)(new n0(29, true)).a("pistonStickyBase");
      b5 = (new ou(30)).new(1).if(4.0F).a("web");
      b3 = (pe)(new pe(31)).if(0.0F).a(P).a("tallgrass");
      b1 = (rm)(new rm(32)).if(0.0F).a(P).a("deadbush");
      bZ = (n0)(new n0(33, false)).a("pistonBase");
      bX = new nz(34);
      bV = (new rs()).if(0.8F).a(H).a("cloth");
      bT = new ny(36);
      bR = (r0)(new r0(37)).if(0.0F).a(P).a("flower");
      bP = (r0)(new r0(38)).if(0.0F).a(P).a("rose");
      bN = (r0)(new qg(39, "mushroom_brown")).if(0.0F).a(P).do(0.125F).a("mushroom");
      bL = (r0)(new qg(40, "mushroom_red")).if(0.0F).a(P).a("mushroom");
      bJ = (new qi(41)).if(3.0F).a(10.0F).a(L).a("blockGold");
      bH = (new qi(42)).if(5.0F).a(10.0F).a(L).a("blockIron");
      bF = (q0)(new pg(43, true)).if(2.0F).a(10.0F).a(N).a("stoneSlab");
      a = (new adk(185, 64)).if(0.5F).a(H).a("TapisBlanc").new(0).a(acn.c);
      for = (new adk(186, 113)).if(0.5F).a(H).a("TapisNoir").new(0).a(acn.c);
      new = (new adk(187, 114)).if(0.5F).a(H).a("TapisGrisFonce").new(0).a(acn.c);
      long = (new adk(188, 129)).if(0.5F).a(H).a("TapisRouge").new(0).a(acn.c);
      try = (new adk(189, 130)).if(0.5F).a(H).a("TapisRose").new(0).a(acn.c);
      byte = (new adk(190, 145)).if(0.5F).a(H).a("TapisVert").new(0).a(acn.c);
      p = (new adk(191, 146)).if(0.5F).a(H).a("TapisVertClair").new(0).a(acn.c);
      char = (new adk(192, 161)).if(0.5F).a(H).a("TapisMarron").new(0).a(acn.c);
      int = (new adk(193, 162)).if(0.5F).a(H).a("TapisJaune").new(0).a(acn.c);
      else = (new adk(194, 177)).if(0.5F).a(H).a("TapisBleu").new(0).a(acn.c);
      bt = (new adk(195, 178)).if(0.5F).a(H).a("TapisBleuClair").new(0).a(acn.c);
      ab = (new adk(196, 193)).if(0.5F).a(H).a("TapisViolet").new(0).a(acn.c);
      do = (new adk(197, 194)).if(0.5F).a(H).a("TapisMagenta").new(0).a(acn.c);
      case = (new adk(198, 209)).if(0.5F).a(H).a("TapisCyan").new(0).a(acn.c);
      if = (new adk(199, 210)).if(0.5F).a(H).a("TapisOrange").new(0).a(acn.c);
      goto = (new adk(200, 225)).if(0.5F).a(H).a("TapisGrisClair").new(0).a(acn.c);
      bD = (q0)(new pg(44, false)).if(2.0F).a(10.0F).a(N).a("stoneSlab");
      bB = (new pa(45, ts.v)).if(2.0F).a(10.0F).a(N).a("brick").a(acn.d);
      bz = (new o5(46)).if(0.0F).a(P).a("tnt");
      bx = (new r2(47)).if(1.5F).a(T).a("bookshelf");
      bv = (new pa(48, ts.v)).if(2.0F).a(10.0F).a(N).a("stoneMoss").a(acn.d);
      bs = (new qa(49)).if(50.0F).a(2000.0F).a(N).a("obsidian");
      bq = (new o3(50)).if(0.0F).do(0.9375F).a(T).a("torch");
      bo = (q7)(new q7(51)).if(0.0F).do(1.0F).a(T).a("fire").g();
      bm = (new qh(52)).if(5.0F).a(L).a("mobSpawner").g();
      bk = (new pk(53, be, 0)).a((String)"stairsWood");
      bi = (ru)(new ru(54, 0)).if(2.5F).a(T).a("chest");
      bg = (px)(new px(55)).if(0.0F).a(V).a("redstoneDust").g();
      cw = (new p9(56)).if(3.0F).a(5.0F).a(N).a("oreDiamond");
      cv = (new qi(57)).if(5.0F).a(10.0F).a(L).a("blockDiamond");
      cu = (new op(58)).if(2.5F).a(T).a("workbench");
      ct = (new ro(59)).a((String)"crops");
      cs = (new ra(60)).if(0.6F).a(R).a("farmland");
      cr = (new q5(61, false)).if(3.5F).a(N).a("furnace").a(acn.c);
      cq = (new q5(62, true)).if(3.5F).a(N).do(0.875F).a("furnace");
      cp = (new pp(63, n7.class, true)).if(1.0F).a(T).a("sign").g();
      co = (new rg(64, ts.w)).if(3.0F).a(T).a("doorWood").g();
      cn = (new qr(65)).if(0.4F).a(B).a("ladder");
      cm = (new p0(66)).if(0.7F).a(L).a("rail");
      cl = (new pk(67, bf, 0)).a((String)"stairsStone");
      ck = (new pp(68, n7.class, false)).if(1.0F).a(T).a("sign").g();
      cj = (new qp(69)).if(0.5F).a(T).a("lever");
      ci = (new p4(70, "stone", ts.v, p3.a)).if(0.5F).a(N).a("pressurePlate");
      ch = (new rg(71, ts.u)).if(5.0F).a(L).a("doorIron").g();
      cg = (new p4(72, "wood", ts.w, p3.if)).if(0.5F).a(T).a("pressurePlate");
      cf = (new pw(73, false)).if(3.0F).a(5.0F).a(N).a("oreRedstone").a(acn.d);
      ce = (new pw(74, true)).do(0.625F).if(3.0F).a(5.0F).a(N).a("oreRedstone");
      cd = (new qc(75, false)).if(0.0F).a(T).a("notGate");
      cc = (new qc(76, true)).if(0.0F).do(0.5F).a(T).a("notGate").a(acn.b);
      cb = (new pi(77)).if(0.5F).a(N).a("button");
      ca = (new o4(78)).if(0.1F).a(D).a("snow").new(0);
      b9 = (new qt(79)).if(0.5F).new(3).a(J).a("ice");
      b8 = (new pm(80)).if(0.2F).a(D).a("snow");
      b7 = (new ry(81)).if(0.4F).a(H).a("cactus");
      a8 = (new rt(82)).if(0.6F).a(R).a("clay");
      a5 = (new pt(83)).if(0.0F).a(P).a("reeds").g();
      a2 = (new pz(84)).if(2.0F).a(10.0F).a(N).a("jukebox");
      aZ = (new q8(85, "wood", ts.w)).if(2.0F).a(5.0F).a(T).a("fence");
      aW = (new p2(86, false)).if(1.0F).a(T).a("pumpkin");
      aT = (new qw(87)).if(0.4F).a(N).a("hellrock");
      aQ = (new qx(88)).if(0.5F).a(F).a("hellsand");
      aN = (new qo(89, ts.i)).if(0.3F).a(J).do(1.0F).a("lightgem");
      aK = (p8)(new p8(90)).if(-1.0F).a(J).do(0.75F).a("portal");
      aH = (new p2(91, true)).if(1.0F).a(T).do(1.0F).a("litpumpkin");
      aE = (new rx(92)).if(0.5F).a(H).a("cake").g();
      aB = (ps)(new ps(93, false)).if(0.0F).a(T).a("diode").g();
      ay = (ps)(new ps(94, true)).if(0.0F).do(0.625F).a(T).a("diode").g();
      av = (new qk(95)).if(0.0F).do(1.0F).a(T).a("lockedchest").a(true);
      as = (new o1(96, ts.w)).if(3.0F).a(T).a("trapdoor").g();
      ap = (new ph(97)).if(0.75F).a("monsterStoneEgg");
      am = (new pn(98)).if(1.5F).a(10.0F).a(N).a("stonebricksmooth");
      ak = (new qu(99, ts.w, 0)).if(0.2F).a(T).a("mushroom");
      ai = (new qu(100, ts.w, 1)).if(0.2F).a(T).a("mushroom");
      ag = (new pb(101, "fenceIron", "fenceIron", ts.u, true)).if(5.0F).a(10.0F).a(L).a("fenceIron");
      ae = (new pb(102, "glass", "thinglass_top", ts.i, false)).if(0.3F).a(J).a("thinGlass");
      ad = (new qj(103)).if(1.0F).a(T).a("melon");
      ac = (new pj(104, aW)).if(0.0F).a(T).a("pumpkinStem");
      aa = (new pj(105, ad)).if(0.0F).a(T).a("pumpkinStem");
      Z = (new ox(106)).if(0.2F).a(P).a("vine");
      Y = (new q9(107)).if(2.0F).a(5.0F).a(T).a("fenceGate");
      b6 = (new pk(108, bB, 0)).a((String)"stairsBrick");
      b4 = (new pk(109, am, 0)).a((String)"stairsStoneBrickSmooth");
      b2 = (qe)(new qe(110)).if(0.6F).a(P).a("mycel");
      b0 = (new ov(111)).if(0.0F).a(P).a("waterlily");
      bY = (new pa(112, ts.v)).if(2.0F).a(10.0F).a(N).a("netherBrick").a(acn.d);
      bW = (new q8(113, "netherBrick", ts.v)).if(2.0F).a(10.0F).a(N).a("netherFence");
      bU = (new pk(114, bY, 0)).a((String)"stairsNetherBrick");
      bS = (new qd(115)).a((String)"netherStalk");
      bQ = (new rd(116)).if(5.0F).a(2000.0F).a("enchantmentTable");
      bO = (new r1(117)).if(0.5F).do(0.125F).a("brewingStand");
      bM = (rv)(new rv(118)).if(2.0F).a("cauldron");
      bK = (new pd(119, ts.else)).if(-1.0F).a(6000000.0F);
      bI = (new pc(120)).a(J).do(0.125F).if(-1.0F).a("endPortalFrame").a(6000000.0F).a(acn.c);
      bG = (new pa(121, ts.v)).if(3.0F).a(15.0F).a(N).a("whiteStone").a(acn.d);
      bE = (new re(122)).if(3.0F).a(15.0F).a(N).do(0.125F).a("dragonEgg");
      bC = (new pu(123, false)).if(0.3F).a(J).a("redstoneLight").a(acn.b);
      bA = (new pu(124, true)).if(0.3F).a(J).a("redstoneLight");
      by = (q0)(new or(125, true)).if(2.0F).a(5.0F).a(T).a("woodSlab");
      bw = (q0)(new or(126, false)).if(2.0F).a(5.0F).a(T).a("woodSlab");
      bu = (new rr(127)).if(0.2F).a(5.0F).a(T).a("cocoa");
      br = (new pk(128, ar, 0)).a((String)"stairsSandStone");
      bp = (new p9(129)).if(3.0F).a(5.0F).a(N).a("oreEmerald");
      bn = (new rc(130)).if(22.5F).a(1000.0F).a(N).a("enderChest").do(0.5F);
      bl = (oz)(new oz(131)).a("tripWireSource");
      bj = (new oy(132)).a("tripWire");
      bh = (new qi(133)).if(5.0F).a(10.0F).a(L).a("blockEmerald");
      U = (new pk(134, be, 1)).a((String)"stairsWoodSpruce");
      S = (new pk(135, be, 2)).a((String)"stairsWoodBirch");
      Q = (new pk(136, be, 3)).a((String)"stairsWoodJungle");
      O = (new rq(137)).a("commandBlock");
      M = (r4)(new r4(138)).a("beacon").do(1.0F);
      K = (new ow(139, bf)).a("cobbleWall");
      I = (new q6(140)).if(0.0F).a(V).a("flowerPot");
      G = (new rw(141)).a("carrots");
      E = (new p7(142)).a("potatoes");
      C = (new os(143)).if(0.5F).a(T).a("button");
      A = (new po(144)).if(1.0F).a(N).a("skull");
      y = (new r9(145)).if(5.0F).a(z).a(2000.0F).a("anvil");
      w = (new ru(146, 1)).if(2.5F).a(T).a("chestTrap");
      u = (new ot(147, "blockGold", ts.u, 64)).if(0.5F).a(T).a("weightedPlate_light");
      s = (new ot(148, "blockIron", ts.u, 640)).if(0.5F).a(T).a("weightedPlate_heavy");
      q = (rp)(new rp(149, false)).if(0.0F).a(T).a("comparator").g();
      n = (rp)(new rp(150, true)).if(0.0F).do(0.625F).a(T).a("comparator").g();
      l = (rn)(new rn(151)).if(0.2F).a(T).a("daylightDetector");
      j = (new p6(152)).if(5.0F).a(10.0F).a(L).a("blockRedstone");
      h = (new p9(153)).if(3.0F).a(5.0F).a(N).a("netherquartz");
      f = (qv)(new qv(154)).if(3.0F).a(8.0F).a(T).a("hopper");
      e = (new p1(155)).a(N).if(0.8F).a("quartzBlock");
      d = (new pk(156, e, 0)).a((String)"stairsQuartz");
      c = (new p5(157)).if(0.7F).a(L).a("activatorRail");
      b = (new rf(158)).if(3.5F).a(N).a("dropper");
      abr.ai[bV.void] = (new acr(bV.void - 256)).if("cloth");
      abr.ai[aM.void] = (new abi(aM.void - 256, aM, o0.cJ)).if("log");
      abr.ai[be.void] = (new abi(be.void - 256, be, oq.cF)).if("wood");
      abr.ai[ap.void] = (new abi(ap.void - 256, ap, ph.c2)).if("monsterStoneEgg");
      abr.ai[am.void] = (new abi(am.void - 256, am, pn.c9)).if("stonebricksmooth");
      abr.ai[ar.void] = (new abi(ar.void - 256, ar, pr.dc)).if("sandStone");
      abr.ai[e.void] = (new abi(e.void - 256, e, p1.dq)).if("quartzBlock");
      abr.ai[bD.void] = (new aa0(bD.void - 256, bD, bF, false)).if("stoneSlab");
      abr.ai[bF.void] = (new aa0(bF.void - 256, bD, bF, true)).if("stoneSlab");
      abr.ai[bw.void] = (new aa0(bw.void - 256, bw, by, false)).if("woodSlab");
      abr.ai[by.void] = (new aa0(by.void - 256, bw, by, true)).if("woodSlab");
      abr.ai[bd.void] = (new abi(bd.void - 256, bd, pq.eY)).if("sapling");
      abr.ai[aJ.void] = (new abo(aJ.void - 256)).if("leaves");
      abr.ai[Z.void] = new acp(Z.void - 256, false);
      abr.ai[b3.void] = (new acp(b3.void - 256, true)).a(new String[]{"shrub", "grass", "fern"});
      abr.ai[ca.void] = new aa2(ca.void - 256, ca);
      abr.ai[b0.void] = new aaw(b0.void - 256);
      abr.ai[bZ.void] = new abf(bZ.void - 256);
      abr.ai[af.void] = new abf(af.void - 256);
      abr.ai[K.void] = (new abi(K.void - 256, K, ow.cH)).if("cobbleWall");
      abr.ai[y.void] = (new ac5(y)).if("anvil");

      for(int var0 = 0; var0 < 256; ++var0) {
         if (x[var0] != null) {
            if (abr.ai[var0] == null) {
               abr.ai[var0] = new aaz(var0 - 256);
               x[var0].else();
            }

            boolean var1 = false;
            if (var0 > 0 && x[var0].new() == 10) {
               var1 = true;
            }

            if (var0 > 0 && x[var0] instanceof q0) {
               var1 = true;
            }

            if (var0 == cs.void) {
               var1 = true;
            }

            if (r[var0]) {
               var1 = true;
            }

            if (t[var0] == 0) {
               var1 = true;
            }

            m[var0] = var1;
         }
      }

      r[0] = true;
      aka.a();
   }
}
