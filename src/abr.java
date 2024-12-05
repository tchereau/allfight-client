import java.util.List;
import java.util.Random;

public class abr {
   private acn an = null;
   protected static Random aj = new Random();
   public static abr[] ai = new abr[32000];
   public static abr ag;
   public static abr ae;
   public static abr ac;
   public static abr aa;
   public static abr Y;
   public static acv W;
   public static abr T;
   public static abr R;
   public static abr P;
   public static abr N;
   public static abr L;
   public static abr J;
   public static abr G;
   public static abr D;
   public static abr B;
   public static abr z;
   public static abr x;
   public static abr v;
   public static abr t;
   public static abr r;
   public static abr bd;
   public static abr bc;
   public static abr bb;
   public static abr ba;
   public static abr a9;
   public static abr a8;
   public static abr a6;
   public static abr a4;
   public static abr a2;
   public static abr a0;
   public static abr aY;
   public static abr aW;
   public static abr aU;
   public static abr aS;
   public static abr aQ;
   public static abr aO;
   public static abr aM;
   public static abr aK;
   public static abr aI;
   public static abr aG;
   public static abr aE;
   public static abr aC;
   public static ac4 aA;
   public static ac4 ay;
   public static ac4 aw;
   public static ac4 au;
   public static ac4 b2;
   public static ac4 b0;
   public static ac4 bY;
   public static ac4 bW;
   public static ac4 bU;
   public static ac4 bS;
   public static ac4 bQ;
   public static ac4 bO;
   public static ac4 bM;
   public static ac4 bK;
   public static ac4 bI;
   public static ac4 bF;
   public static ac4 bD;
   public static ac4 bB;
   public static ac4 bz;
   public static ac4 by;
   public static abr bw;
   public static abr bu;
   public static abr bs;
   public static abr bq;
   public static abr bo;
   public static abr bm;
   public static abr bk;
   public static abr bi;
   public static abr bg;
   public static abr be;
   public static abr cy;
   public static abr cx;
   public static abr cw;
   public static abr cv;
   public static abr cu;
   public static abr ct;
   public static abr cs;
   public static abr cr;
   public static abr cq;
   public static abr cp;
   public static abr co;
   public static abr cn;
   public static abr cm;
   public static abr cl;
   public static abr ck;
   public static abr ci;
   public static abr ch;
   public static abr cg;
   public static aby ce;
   public static abr cd;
   public static abr cc;
   public static abr cb;
   public static abr ca;
   public static abr b9;
   public static abr b8;
   public static abr b7;
   public static abr a7;
   public static abr a5;
   public static abr a3;
   public static abr a1;
   public static abn aZ;
   public static aa7 aX;
   public static abr aV;
   public static abr aT;
   public static abr aR;
   public static abr aP;
   public static abr aN;
   public static abr aL;
   public static abr aJ;
   public static abr aH;
   public static abr aF;
   public static abr aD;
   public static abr aB;
   public static abr az;
   public static abr ax;
   public static abe av;
   public static abr at;
   public static abr as;
   public static abr ar;
   public static abr aq;
   public static abr ap;
   public static abr ao;
   public static abr b4;
   public static abr b3;
   public static abr b1;
   public static abr bZ;
   public static abr bX;
   public static abr bV;
   public static abr bT;
   public static abr bR;
   public static abr bP;
   public static abr bN;
   public static abr bL;
   public static abr bJ;
   public static abr bG;
   public static abr bE;
   public static abr bC;
   public static ab6 bA;
   public static abr bx;
   public static abr bv;
   public static abr bt;
   public static abr br;
   public static abr bp;
   public static abr bn;
   public static abr bl;
   public static ab5 bj;
   public static abr bh;
   public static abr bf;
   public static abr ah;
   public static abr af;
   public static abr ad;
   public static abr ab;
   public static abr Z;
   public static abr X;
   public static abr V;
   public static abr S;
   public static abr Q;
   public static abr O;
   public static abr M;
   public static abr K;
   public static abr I;
   public static abr F;
   public static abr C;
   public static abr do;
   public static abr b6;
   public static abr n;
   public static abr void;
   public static abr bH;
   public static abr b5;
   public static abr case;
   public static abr k;
   public static abr j;
   public static abr E;
   public static abr i;
   public static abr U;
   public static abr c;
   public static abr cz;
   public static abr cA;
   public static abr f;
   public static abr try;
   public static abr char;
   public static abr if;
   public static abr new;
   public static abr a;
   public static abr m;
   public static abr for;
   public static abr e;
   public static abr goto;
   public static abr g;
   public static abr b;
   public static abr o;
   public static abr h;
   public static abr p;
   public static abr H;
   public static abr d;
   public static abr cj;
   public static abr byte;
   public static abr long;
   public static abr else;
   public static abr int;
   public static abr cf;
   public static abr l;
   public final int A;
   protected int y = 64;
   private int am = 0;
   protected boolean w = false;
   protected boolean u = false;
   private abr al = null;
   private String ak = null;
   private String q;
   protected ajd s;

   protected abr(int var1) {
      this.A = 256 + var1;
      if (ai[256 + var1] != null) {
         System.out.println("CONFLICT @ " + var1);
      }

      ai[256 + var1] = this;
   }

   public abr if(int var1) {
      this.y = var1;
      return this;
   }

   public int if() {
      return 1;
   }

   public ajd a(int var1) {
      return this.s;
   }

   public final ajd char(abp var1) {
      return this.a(var1.new());
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      return false;
   }

   public float a(abp var1, pa var2) {
      return 1.0F;
   }

   public abp a(abp var1, y6 var2, aek var3) {
      return var1;
   }

   public abp do(abp var1, y6 var2, aek var3) {
      return var1;
   }

   public int try() {
      return this.y;
   }

   public int do(int var1) {
      return 0;
   }

   public boolean b() {
      return this.u;
   }

   protected abr a(boolean var1) {
      this.u = var1;
      return this;
   }

   public int for() {
      return this.am;
   }

   protected abr for(int var1) {
      this.am = var1;
      return this;
   }

   public boolean char() {
      return this.am > 0 && !this.u;
   }

   public boolean a(abp var1, aig var2, aig var3) {
      return false;
   }

   public boolean a(abp var1, y6 var2, int var3, int var4, int var5, int var6, aig var7) {
      return false;
   }

   public int a(aiw var1) {
      return 1;
   }

   public boolean a(pa var1) {
      return false;
   }

   public boolean a(abp var1, aig var2) {
      return false;
   }

   public abr byte() {
      this.w = true;
      return this;
   }

   public boolean g() {
      return this.w;
   }

   public boolean else() {
      return false;
   }

   public abr if(String var1) {
      this.q = var1;
      return this;
   }

   public String case(abp var1) {
      String var2 = this.int(var1);
      return var2 == null ? "" : aqz.if(var2);
   }

   public String int() {
      return "item." + this.q;
   }

   public String int(abp var1) {
      return "item." + this.q;
   }

   public abr a(abr var1) {
      this.al = var1;
      return this;
   }

   public boolean new(abp var1) {
      return true;
   }

   public boolean c() {
      return true;
   }

   public abr case() {
      return this.al;
   }

   public boolean goto() {
      return this.al != null;
   }

   public String new() {
      return aqz.if(this.int() + ".name");
   }

   public String byte(abp var1) {
      return aqz.if(this.int(var1) + ".name");
   }

   public int a(abp var1, int var2) {
      return 16777215;
   }

   public void a(abp var1, y6 var2, aiw var3, int var4, boolean var5) {
   }

   public void if(abp var1, y6 var2, aek var3) {
   }

   public boolean f() {
      return false;
   }

   public aax else(abp var1) {
      return aax.do;
   }

   public int a(abp var1) {
      return 0;
   }

   public void a(abp var1, y6 var2, aek var3, int var4) {
   }

   protected abr a(String var1) {
      this.ak = var1;
      return this;
   }

   public String a() {
      return this.ak;
   }

   public boolean e() {
      return this.ak != null;
   }

   public void a(abp var1, aek var2, List var3, boolean var4) {
   }

   public String if(abp var1) {
      return ("" + aqy.if().for(this.case(var1))).trim();
   }

   public boolean do(abp var1) {
      return var1.case();
   }

   public abd try(abp var1) {
      return var1.case() ? abd.byte : abd.if;
   }

   public boolean for(abp var1) {
      return this.try() == 1 && this.char();
   }

   protected nt a(y6 var1, aek var2, boolean var3) {
      float var4 = 1.0F;
      float var5 = var2.a0 + (var2.a4 - var2.a0) * var4;
      float var6 = var2.a2 + (var2.a5 - var2.a2) * var4;
      double var7 = var2.ao + (var2.al - var2.ao) * (double)var4;
      double var9 = var2.an + (var2.ak - var2.an) * (double)var4 + 1.62D - (double)var2.aQ;
      double var11 = var2.am + (var2.aj - var2.am) * (double)var4;
      nr var13 = var1.do().a(var7, var9, var11);
      float var14 = ajs.for(-var6 * 0.017453292F - 3.1415927F);
      float var15 = ajs.try(-var6 * 0.017453292F - 3.1415927F);
      float var16 = -ajs.for(-var5 * 0.017453292F);
      float var17 = ajs.try(-var5 * 0.017453292F);
      float var18 = var15 * var16;
      float var19 = var14 * var16;
      double var20 = 5.0D;
      nr var22 = var13.a((double)var18 * var20, (double)var17 * var20, (double)var19 * var20);
      return var1.a(var13, var22, var3, !var3);
   }

   public int d() {
      return 0;
   }

   public boolean do() {
      return false;
   }

   public ajd a(int var1, int var2) {
      return this.a(var1);
   }

   public void a(int var1, acn var2, List var3) {
      var3.add(new abp(var1, 1, 0));
   }

   public acn long() {
      return this.an;
   }

   public abr a(acn var1) {
      this.an = var1;
      return this;
   }

   public boolean void() {
      return true;
   }

   public boolean a(abp var1, abp var2) {
      return false;
   }

   public void a(ajc var1) {
      this.s = var1.a(this.q);
   }

   static {
      ag = (new aa6(0, abq.goto)).if("shovelIron");
      ae = (new abg(1, abq.goto)).if("pickaxeIron");
      ac = (new abt(2, abq.goto)).if("hatchetIron");
      aa = (new abx(3)).if("flintAndSteel");
      Y = (new abw(4, 4, 0.3F, false)).if("apple");
      W = (acv)(new acv(5)).if("bow");
      T = (new abr(6)).if("arrow").a(acn.case);
      R = (new acq(7)).if("coal");
      P = (new abr(8)).if("diamond").a(acn.try);
      N = (new abr(9)).if("ingotIron").a(acn.try);
      L = (new abr(10)).if("ingotGold").a(acn.try);
      J = (new aav(11, abq.goto)).if("swordIron");
      G = (new aav(12, abq.b)).if("swordWood");
      D = (new aa6(13, abq.b)).if("shovelWood");
      B = (new abg(14, abq.b)).if("pickaxeWood");
      z = (new abt(15, abq.b)).if("hatchetWood");
      x = (new aav(16, abq.void)).if("swordStone");
      v = (new aa6(17, abq.void)).if("shovelStone");
      t = (new abg(18, abq.void)).if("pickaxeStone");
      r = (new abt(19, abq.void)).if("hatchetStone");
      bd = (new aav(20, abq.else)).if("swordDiamond");
      bc = (new aa6(21, abq.else)).if("shovelDiamond");
      bb = (new abg(22, abq.else)).if("pickaxeDiamond");
      ba = (new abt(23, abq.else)).if("hatchetDiamond");
      a9 = (new abr(24)).byte().if("stick").a(acn.try);
      a8 = (new abr(25)).if("bowl").a(acn.try);
      a6 = (new acu(26, 6)).if("mushroomStew");
      a4 = (new aav(27, abq.char)).if("swordGold");
      a2 = (new aa6(28, abq.char)).if("shovelGold");
      a0 = (new abg(29, abq.char)).if("pickaxeGold");
      aY = (new abt(30, abq.char)).if("hatchetGold");
      aW = (new aay(31, pa.bj)).if("string").a(acn.try);
      aU = (new abr(32)).if("feather").a(acn.try);
      aS = (new abr(33)).if("sulphur").a(aas.new).a(acn.try);
      aQ = (new abs(34, abq.b)).if("hoeWood");
      aO = (new abs(35, abq.void)).if("hoeStone");
      aM = (new abs(36, abq.goto)).if("hoeIron");
      aK = (new abs(37, abq.else)).if("hoeDiamond");
      aI = (new abs(38, abq.char)).if("hoeGold");
      aG = (new aa8(39, pa.ct.void, pa.cs.void)).if("seeds");
      aE = (new abr(40)).if("wheat").a(acn.try);
      aC = (new abw(41, 5, 0.6F, false)).if("bread");
      aA = (ac4)(new ac4(42, ac1.long, 0, 0)).if("helmetCloth");
      ay = (ac4)(new ac4(43, ac1.long, 0, 1)).if("chestplateCloth");
      aw = (ac4)(new ac4(44, ac1.long, 0, 2)).if("leggingsCloth");
      au = (ac4)(new ac4(45, ac1.long, 0, 3)).if("bootsCloth");
      b2 = (ac4)(new ac4(46, ac1.goto, 1, 0)).if("helmetChain");
      b0 = (ac4)(new ac4(47, ac1.goto, 1, 1)).if("chestplateChain");
      bY = (ac4)(new ac4(48, ac1.goto, 1, 2)).if("leggingsChain");
      bW = (ac4)(new ac4(49, ac1.goto, 1, 3)).if("bootsChain");
      bU = (ac4)(new ac4(50, ac1.else, 2, 0)).if("helmetIron");
      bS = (ac4)(new ac4(51, ac1.else, 2, 1)).if("chestplateIron");
      bQ = (ac4)(new ac4(52, ac1.else, 2, 2)).if("leggingsIron");
      bO = (ac4)(new ac4(53, ac1.else, 2, 3)).if("bootsIron");
      bM = (ac4)(new ac4(54, ac1.byte, 3, 0)).if("helmetDiamond");
      bK = (ac4)(new ac4(55, ac1.byte, 3, 1)).if("chestplateDiamond");
      bI = (ac4)(new ac4(56, ac1.byte, 3, 2)).if("leggingsDiamond");
      bF = (ac4)(new ac4(57, ac1.byte, 3, 3)).if("bootsDiamond");
      bD = (ac4)(new ac4(58, ac1.case, 4, 0)).if("helmetGold");
      bB = (ac4)(new ac4(59, ac1.case, 4, 1)).if("chestplateGold");
      bz = (ac4)(new ac4(60, ac1.case, 4, 2)).if("leggingsGold");
      by = (ac4)(new ac4(61, ac1.case, 4, 3)).if("bootsGold");
      bw = (new abr(62)).if("flint").a(acn.try);
      bu = (new abw(63, 3, 0.3F, true)).if("porkchopRaw");
      bs = (new abw(64, 8, 0.8F, true)).if("porkchopCooked");
      bq = (new abu(65, ah7.class)).if("painting");
      bo = (new abv(66, 4, 1.2F, false)).t().if(ai0.p.try, 5, 0, 1.0F).if("appleGold");
      bm = (new aa5(67)).if("sign");
      bk = (new ab9(68, ts.w)).if("doorWood");
      bi = (new act(69, 0)).if("bucket").if(16);
      bg = (new act(70, pa.bb.void)).if("bucketWater").a(bi);
      be = (new act(71, pa.a7.void)).if("bucketLava").a(bi);
      cy = (new abl(72, 0)).if("minecart");
      cx = (new aba(73)).if("saddle");
      cw = (new ab9(74, ts.u)).if("doorIron");
      cv = (new abb(75)).if("redstone").a(aas.byte);
      cu = (new aa1(76)).if("snowball");
      ct = (new acy(77)).if("boat");
      cs = (new abr(78)).if("leather").a(acn.try);
      cr = (new abm(79)).if("milk").a(bi);
      cq = (new abr(80)).if("brick").a(acn.try);
      cp = (new abr(81)).if("clay").a(acn.try);
      co = (new aay(82, pa.a5)).if("reeds").a(acn.try);
      cn = (new abr(83)).if("paper").a(acn.long);
      cm = (new acx(84)).if("book").a(acn.long);
      cl = (new abr(85)).if("slimeball").a(acn.long);
      ck = (new abl(86, 1)).if("minecartChest");
      ci = (new abl(87, 2)).if("minecartFurnace");
      ch = (new ab7(88)).if("egg");
      cg = (new abr(89)).if("compass").a(acn.char);
      ce = (aby)(new aby(90)).if("fishingRod");
      cd = (new abr(91)).if("clock").a(acn.char);
      cc = (new abr(92)).if("yellowDust").a(aas.try).a(acn.try);
      cb = (new abw(93, 2, 0.3F, false)).if("fishRaw");
      ca = (new abw(94, 5, 0.6F, false)).if("fishCooked");
      b9 = (new ab8(95)).if("dyePowder");
      b8 = (new abr(96)).if("bone").byte().a(acn.long);
      b7 = (new abr(97)).if("sugar").a(aas.b).a(acn.try);
      a7 = (new aay(98, pa.aE)).if(1).if("cake").a(acn.else);
      a5 = (new acz(99)).if(1).if("bed");
      a3 = (new aay(100, pa.aB)).if("diode").a(acn.b);
      a1 = (new abw(101, 2, 0.1F, false)).if("cookie");
      aZ = (abn)(new abn(102)).if("map");
      aX = (aa7)(new aa7(103)).if("shears");
      aV = (new abw(104, 2, 0.3F, false)).if("melon");
      aT = (new aa8(105, pa.ac.void, pa.cs.void)).if("seeds_pumpkin");
      aR = (new aa8(106, pa.aa.void, pa.cs.void)).if("seeds_melon");
      aP = (new abw(107, 3, 0.3F, true)).if("beefRaw");
      aN = (new abw(108, 8, 0.8F, true)).if("beefCooked");
      aL = (new abw(109, 2, 0.3F, true)).if(ai0.i.try, 30, 0, 0.3F).if("chickenRaw");
      aJ = (new abw(110, 6, 0.6F, true)).if("chickenCooked");
      aH = (new abw(111, 4, 0.1F, true)).if(ai0.i.try, 30, 0, 0.8F).if("rottenFlesh");
      aF = (new ab3(112)).if("enderPearl");
      aD = (new abr(113)).if("blazeRod").a(acn.try);
      aB = (new abr(114)).if("ghastTear").a("+0-1-2-3&4-4+13").a(acn.byte);
      az = (new abr(115)).if("goldNugget").a(acn.try);
      ax = (new aa8(116, pa.bS.void, pa.aQ.void)).if("netherStalkSeeds").a("+4");
      av = (abe)(new abe(117)).if("potion");
      at = (new acw(118)).if("glassBottle");
      as = (new abw(119, 2, 0.8F, false)).if(ai0.g.try, 5, 0, 1.0F).if("spiderEye").a(aas.long);
      ar = (new abr(120)).if("fermentedSpiderEye").a(aas.goto).a(acn.byte);
      aq = (new abr(121)).if("blazePowder").a(aas.char).a(acn.byte);
      ap = (new abr(122)).if("magmaCream").a(aas.case).a(acn.byte);
      ao = (new aay(123, pa.bO)).if("brewingStand").a(acn.byte);
      b4 = (new aay(124, pa.bM)).if("cauldron").a(acn.byte);
      b3 = (new ab4(125)).if("eyeOfEnder");
      b1 = (new abr(126)).if("speckledMelon").a(aas.else).a(acn.byte);
      bZ = (new abj(127)).if("monsterPlacer");
      bX = (new ab2(128)).if("expBottle");
      bV = (new ab1(129)).if("fireball");
      bT = (new aau(130)).if("writingBook").a(acn.long);
      bR = (new aat(131)).if("writtenBook");
      bP = (new abr(132)).if("emerald").a(acn.try);
      bN = (new abu(133, aih.class)).if("frame");
      bL = (new aay(134, pa.I)).if("flowerPot").a(acn.c);
      bJ = (new aa9(135, 4, 0.6F, pa.G.void, pa.cs.void)).if("carrots");
      bG = (new aa9(136, 1, 0.3F, pa.E.void, pa.cs.void)).if("potato");
      bE = (new abw(137, 6, 0.6F, false)).if("potatoBaked");
      bC = (new abw(138, 2, 0.3F, false)).if(ai0.g.try, 5, 0, 0.6F).if("potatoPoisonous");
      bA = (ab6)(new ab6(139)).if("emptyMap");
      bx = (new abw(140, 6, 1.2F, false)).if("carrotGolden").a(aas.int);
      bv = (new aa3(141)).if("skull");
      bt = (new acs(142)).if("carrotOnAStick");
      br = (new aa4(143)).if("netherStar").a(acn.try);
      bp = (new abw(144, 8, 0.3F, false)).if("pumpkinPie").a(acn.else);
      bn = (new abz(145)).if("fireworks");
      bl = (new ab0(146)).if("fireworksCharge").a(acn.long);
      bj = (ab5)(new ab5(147)).if(1).if("enchantedBook");
      bh = (new aay(148, pa.q)).if("comparator").a(acn.b);
      bf = (new abr(149)).if("netherbrick").a(acn.try);
      ah = (new abr(150)).if("netherquartz").a(acn.try);
      af = (new abl(151, 3)).if("minecartTnt");
      ad = (new abl(152, 5)).if("minecartHopper");
      ab = (new abc(2000, "13")).if("record");
      Z = (new abc(2001, "cat")).if("record");
      X = (new abc(2002, "blocks")).if("record");
      V = (new abc(2003, "chirp")).if("record");
      S = (new abc(2004, "far")).if("record");
      Q = (new abc(2005, "mall")).if("record");
      O = (new abc(2006, "mellohi")).if("record");
      M = (new abc(2007, "stal")).if("record");
      K = (new abc(2008, "strad")).if("record");
      I = (new abc(2009, "ward")).if("record");
      F = (new abc(2010, "11")).if("record");
      C = (new abc(2011, "wait")).if("record");
      do = (new abc(2012, "around")).if("record");
      b6 = (new abc(2013, "stillalive")).if("record");
      n = (new abc(2014, "genesis")).if("record");
      void = (new abc(2015, "dance")).if("record");
      bH = (new abc(2016, "dreams")).if("record");
      b5 = (new abc(2017, "holiday")).if("record");
      case = (new abc(2018, "21stcentury")).if("record");
      k = (new abc(2019, "staticage")).if("record");
      j = (new abc(2020, "warriormix")).if("record");
      E = (new abc(2021, "aura")).if("record");
      i = (new abc(2022, "bangers")).if("record");
      U = (new abc(2023, "fly")).if("record");
      c = (new abc(2024, "comeback")).if("record");
      cz = (new abc(2025, "walkline")).if("record");
      cA = (new abc(2026, "memories")).if("record");
      f = (new abc(2027, "lovetakesover")).if("record");
      try = (new abc(2028, "paradise")).if("record");
      char = (new abc(2029, "partofme")).if("record");
      if = (new abc(2030, "fridaynight")).if("record");
      new = (new abc(2031, "wishmaster")).if("record");
      a = (new abc(2032, "endhope")).if("record");
      m = (new abc(2033, "aurora")).if("record");
      for = (new abc(2034, "easylover")).if("record");
      e = (new abc(2035, "jesus")).if("record");
      goto = (new abc(2036, "dirtybit")).if("record");
      g = (new abc(2037, "goodtime")).if("record");
      b = (new abc(2038, "getup")).if("record");
      o = (new abc(2039, "promises")).if("record");
      h = (new abc(2040, "robotrock")).if("record");
      p = (new abc(2041, "aerodynamic")).if("record");
      H = (new abc(2042, "dafunk")).if("record");
      d = (new abc(2043, "digitallove")).if("record");
      cj = (new abc(2044, "givelife")).if("record");
      byte = (new abc(2045, "getlucky")).if("record");
      long = (new abc(2046, "beyond")).if("record");
      else = (new abc(2047, "instantcrush")).if("record");
      int = (new abc(2048, "loseyourself")).if("record");
      cf = (new abc(2049, "humanafterall")).if("record");
      l = (new abc(2050, "television")).if("record");
      aka.for();
   }
}
