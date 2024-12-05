import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class aep extends aiy implements aeq, zn {
   private int rT;
   private boolean rR;
   private boolean rP;
   agf rV;
   private aek rN;
   private zl rL;
   private int rJ;
   private boolean rU;
   private int rS;
   private String rQ;
   private boolean rO;
   private float rM;
   private static final Map rK = new HashMap();
   private static final Map rI = new HashMap();

   public aep(y6 var1) {
      this(var1, 0);
   }

   public aep(y6 var1, int var2) {
      super(var1);
      this.rT = 0;
      this.rR = false;
      this.rP = false;
      this.rV = null;
      this.ax(var2);
      this.ft = "/mob/villager/villager.png";
      this.e2 = 0.5F;
      this.if(0.6F, 1.8F);
      this.bl().if(true);
      this.bl().for(true);
      this.er.a(0, new aho(this));
      this.er.a(1, new ahx(this, aes.class, 8.0F, 0.3F, 0.35F));
      this.er.a(1, new ags(this));
      this.er.a(1, new ahe(this));
      this.er.a(2, new ahb(this));
      this.er.a(3, new agy(this));
      this.er.a(4, new ag4(this, true));
      this.er.a(5, new ag9(this, 0.3F));
      this.er.a(6, new ahd(this));
      this.er.a(7, new agu(this));
      this.er.a(8, new ag2(this, 0.32F));
      this.er.a(9, new ahh(this, aek.class, 3.0F, 1.0F));
      this.er.a(9, new ahh(this, aep.class, 5.0F, 0.02F));
      this.er.a(9, new ag0(this, 0.3F));
      this.er.a(10, new ahf(this, aig.class, 8.0F));
   }

   public boolean co() {
      return true;
   }

   protected void b8() {
      if (--this.rT <= 0) {
         this.ap.g.do(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj));
         this.rT = 70 + this.bm.nextInt(50);
         this.rV = this.ap.g.a(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj), 32);
         if (this.rV == null) {
            this.ce();
         } else {
            apg var1 = this.rV.void();
            this.if(var1.if, var1.a, var1.do, (int)((float)this.rV.if() * 0.6F));
            if (this.rO) {
               this.rO = false;
               this.rV.if(5);
            }
         }
      }

      if (!this.fK() && this.rJ > 0) {
         --this.rJ;
         if (this.rJ <= 0) {
            if (this.rU) {
               if (this.rL.size() > 1) {
                  Iterator var3 = this.rL.iterator();

                  while(var3.hasNext()) {
                     zm var2 = (zm)var3.next();
                     if (var2.new()) {
                        var2.a(this.bm.nextInt(6) + this.bm.nextInt(6) + 2);
                     }
                  }
               }

               this.ay(1);
               this.rU = false;
               if (this.rV != null && this.rQ != null) {
                  this.ap.a((aiw)this, (byte)14);
                  this.rV.a(this.rQ, 1);
               }
            }

            this.for((aiz)(new aiz(ai0.p.try, 200, 0)));
         }
      }

      super.b8();
   }

   public boolean for(aek var1) {
      abp var2 = var1.fR.L();
      boolean var3 = var2 != null && var2.new == abr.bZ.A;
      if (!var3 && this.aA() && !this.fK() && !this.bG()) {
         if (!this.ap.goto) {
            this.case(var1);
            var1.a((zn)this, (String)this.cm());
         }

         return true;
      } else {
         return super.for(var1);
      }
   }

   protected void X() {
      super.X();
      this.bg.a(16, 0);
   }

   public int b0() {
      return 20;
   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("Profession", this.fO());
      var1.a("Riches", this.rS);
      if (this.rL != null) {
         var1.a("Offers", this.rL.a());
      }

   }

   public void try(aqv var1) {
      super.try(var1);
      this.ax(var1.goto("Profession"));
      this.rS = var1.goto("Riches");
      if (var1.try("Offers")) {
         aqv var2 = var1.char("Offers");
         this.rL = new zl(var2);
      }

   }

   public String W() {
      switch(this.fO()) {
      case 0:
         return "/mob/villager/farmer.png";
      case 1:
         return "/mob/villager/librarian.png";
      case 2:
         return "/mob/villager/priest.png";
      case 3:
         return "/mob/villager/smith.png";
      case 4:
         return "/mob/villager/butcher.png";
      default:
         return super.W();
      }
   }

   protected boolean bn() {
      return false;
   }

   protected String b2() {
      return "mob.villager.default";
   }

   protected String bX() {
      return "mob.villager.defaulthurt";
   }

   protected String bS() {
      return "mob.villager.defaultdeath";
   }

   public void ax(int var1) {
      this.bg.if(16, var1);
   }

   public int fO() {
      return this.bg.int(16);
   }

   public boolean fL() {
      return this.rR;
   }

   public void H(boolean var1) {
      this.rR = var1;
   }

   public void G(boolean var1) {
      this.rP = var1;
   }

   public boolean fN() {
      return this.rP;
   }

   public void if(aig var1) {
      super.if(var1);
      if (this.rV != null && var1 != null) {
         this.rV.do(var1);
         if (var1 instanceof aek) {
            byte var2 = -1;
            if (this.bG()) {
               var2 = -3;
            }

            this.rV.a(((aek)var1).do(), var2);
            if (this.aA()) {
               this.ap.a((aiw)this, (byte)13);
            }
         }
      }

   }

   public void a(ai4 var1) {
      if (this.rV != null) {
         aiw var2 = var1.new();
         if (var2 != null) {
            if (var2 instanceof aek) {
               this.rV.a(((aek)var2).do(), -2);
            } else if (var2 instanceof ae5) {
               this.rV.goto();
            }
         } else if (var2 == null) {
            aek var3 = this.ap.if(this, 16.0D);
            if (var3 != null) {
               this.rV.goto();
            }
         }
      }

      super.a(var1);
   }

   public void case(aek var1) {
      this.rN = var1;
   }

   public aek fJ() {
      return this.rN;
   }

   public boolean fK() {
      return this.rN != null;
   }

   public void a(zm var1) {
      var1.a();
      if (var1.if((zm)this.rL.get(this.rL.size() - 1))) {
         this.rJ = 40;
         this.rU = true;
         if (this.rN != null) {
            this.rQ = this.rN.do();
         } else {
            this.rQ = null;
         }
      }

      if (var1.byte().new == abr.bP.A) {
         this.rS += var1.byte().if;
      }

   }

   public zl char(aek var1) {
      if (this.rL == null) {
         this.ay(1);
      }

      return this.rL;
   }

   private float o(float var1) {
      float var2 = var1 + this.rM;
      return var2 > 0.9F ? 0.9F - (var2 - 0.9F) : var2;
   }

   private void ay(int var1) {
      if (this.rL != null) {
         this.rM = ajs.if((float)this.rL.size()) * 0.2F;
      } else {
         this.rM = 0.0F;
      }

      zl var2;
      var2 = new zl();
      int var3;
      label51:
      switch(this.fO()) {
      case 0:
         if(var2, abr.aE.A, this.bm, this.o(0.9F));
         if(var2, pa.bV.void, this.bm, this.o(0.5F));
         if(var2, abr.aL.A, this.bm, this.o(0.5F));
         if(var2, abr.ca.A, this.bm, this.o(0.4F));
         a(var2, abr.aC.A, this.bm, this.o(0.9F));
         a(var2, abr.aV.A, this.bm, this.o(0.3F));
         a(var2, abr.Y.A, this.bm, this.o(0.3F));
         a(var2, abr.a1.A, this.bm, this.o(0.3F));
         a(var2, abr.aX.A, this.bm, this.o(0.3F));
         a(var2, abr.aa.A, this.bm, this.o(0.3F));
         a(var2, abr.aJ.A, this.bm, this.o(0.3F));
         a(var2, abr.T.A, this.bm, this.o(0.5F));
         if (this.bm.nextFloat() < this.o(0.5F)) {
            var2.add(new zm(new abp(pa.aY, 10), new abp(abr.bP), new abp(abr.bw.A, 4 + this.bm.nextInt(2), 0)));
         }
         break;
      case 1:
         if(var2, abr.cn.A, this.bm, this.o(0.8F));
         if(var2, abr.cm.A, this.bm, this.o(0.8F));
         if(var2, abr.bR.A, this.bm, this.o(0.3F));
         a(var2, pa.bx.void, this.bm, this.o(0.8F));
         a(var2, pa.aD.void, this.bm, this.o(0.2F));
         a(var2, abr.cg.A, this.bm, this.o(0.2F));
         a(var2, abr.cd.A, this.bm, this.o(0.2F));
         if (this.bm.nextFloat() < this.o(0.07F)) {
            z3 var8 = z3.m[this.bm.nextInt(z3.m.length)];
            int var10 = ajs.a(this.bm, var8.a(), var8.do());
            abp var11 = abr.bj.a(new zw(var8, var10));
            var3 = 2 + this.bm.nextInt(5 + var10 * 10) + 3 * var10;
            var2.add(new zm(new abp(abr.cm), new abp(abr.bP, var3), var11));
         }
         break;
      case 2:
         a(var2, abr.b3.A, this.bm, this.o(0.3F));
         a(var2, abr.bX.A, this.bm, this.o(0.2F));
         a(var2, abr.cv.A, this.bm, this.o(0.4F));
         a(var2, pa.aN.void, this.bm, this.o(0.3F));
         int[] var4 = new int[]{abr.J.A, abr.bd.A, abr.bS.A, abr.bK.A, abr.ac.A, abr.ba.A, abr.ae.A, abr.bb.A};
         int[] var5 = var4;
         int var6 = var4.length;
         var3 = 0;

         while(true) {
            if (var3 >= var6) {
               break label51;
            }

            int var7 = var5[var3];
            if (this.bm.nextFloat() < this.o(0.05F)) {
               var2.add(new zm(new abp(var7, 1, 0), new abp(abr.bP, 2 + this.bm.nextInt(3), 0), z1.a(this.bm, new abp(var7, 1, 0), 5 + this.bm.nextInt(15))));
            }

            ++var3;
         }
      case 3:
         if(var2, abr.R.A, this.bm, this.o(0.7F));
         if(var2, abr.N.A, this.bm, this.o(0.5F));
         if(var2, abr.L.A, this.bm, this.o(0.5F));
         if(var2, abr.P.A, this.bm, this.o(0.5F));
         a(var2, abr.J.A, this.bm, this.o(0.5F));
         a(var2, abr.bd.A, this.bm, this.o(0.5F));
         a(var2, abr.ac.A, this.bm, this.o(0.3F));
         a(var2, abr.ba.A, this.bm, this.o(0.3F));
         a(var2, abr.ae.A, this.bm, this.o(0.5F));
         a(var2, abr.bb.A, this.bm, this.o(0.5F));
         a(var2, abr.ag.A, this.bm, this.o(0.2F));
         a(var2, abr.bc.A, this.bm, this.o(0.2F));
         a(var2, abr.aM.A, this.bm, this.o(0.2F));
         a(var2, abr.aK.A, this.bm, this.o(0.2F));
         a(var2, abr.bO.A, this.bm, this.o(0.2F));
         a(var2, abr.bF.A, this.bm, this.o(0.2F));
         a(var2, abr.bU.A, this.bm, this.o(0.2F));
         a(var2, abr.bM.A, this.bm, this.o(0.2F));
         a(var2, abr.bS.A, this.bm, this.o(0.2F));
         a(var2, abr.bK.A, this.bm, this.o(0.2F));
         a(var2, abr.bQ.A, this.bm, this.o(0.2F));
         a(var2, abr.bI.A, this.bm, this.o(0.2F));
         a(var2, abr.bW.A, this.bm, this.o(0.1F));
         a(var2, abr.b2.A, this.bm, this.o(0.1F));
         a(var2, abr.b0.A, this.bm, this.o(0.1F));
         a(var2, abr.bY.A, this.bm, this.o(0.1F));
         break;
      case 4:
         if(var2, abr.R.A, this.bm, this.o(0.7F));
         if(var2, abr.bu.A, this.bm, this.o(0.5F));
         if(var2, abr.aP.A, this.bm, this.o(0.5F));
         a(var2, abr.cx.A, this.bm, this.o(0.1F));
         a(var2, abr.ay.A, this.bm, this.o(0.3F));
         a(var2, abr.au.A, this.bm, this.o(0.3F));
         a(var2, abr.aA.A, this.bm, this.o(0.3F));
         a(var2, abr.aw.A, this.bm, this.o(0.3F));
         a(var2, abr.bs.A, this.bm, this.o(0.3F));
         a(var2, abr.aN.A, this.bm, this.o(0.3F));
      }

      this.if(var2);
      if (var2.isEmpty()) {
         if(var2, abr.L.A, this.bm, 1.0F);
      }

      Collections.shuffle(var2);
      if (this.rL == null) {
         this.rL = new zl();
      }

      for(int var9 = 0; var9 < var1 && var9 < var2.size(); ++var9) {
         this.rL.a((zm)var2.get(var9));
      }

   }

   private void if(zl var1) {
      List var2 = ModLoader.a(this.fO());
      if (var2 != null) {
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            anu var4 = (anu)var3.next();
            if (var4.for) {
               if(var1, var4.int, this.bm, var4.if);
            } else {
               a(var1, var4.int, this.bm, var4.if);
            }
         }

      }
   }

   public void a(zl var1) {
   }

   private static void if(zl var0, int var1, Random var2, float var3) {
      if (var2.nextFloat() < var3) {
         var0.add(new zm(a(var1, var2), abr.bP));
      }

   }

   private static abp a(int var0, Random var1) {
      return new abp(var0, if(var0, var1), 0);
   }

   private static int if(int var0, Random var1) {
      ajl var2 = (ajl)rK.get(var0);
      return var2 == null ? 1 : ((Integer)var2.if() >= (Integer)var2.a() ? (Integer)var2.if() : (Integer)var2.if() + var1.nextInt((Integer)var2.a() - (Integer)var2.if()));
   }

   private static void a(zl var0, int var1, Random var2, float var3) {
      if (var2.nextFloat() < var3) {
         int var4 = do(var1, var2);
         abp var5;
         abp var6;
         if (var4 < 0) {
            var5 = new abp(abr.bP.A, 1, 0);
            var6 = new abp(var1, -var4, 0);
         } else {
            var5 = new abp(abr.bP.A, var4, 0);
            var6 = new abp(var1, 1, 0);
         }

         var0.add(new zm(var5, var6));
      }

   }

   private static int do(int var0, Random var1) {
      ajl var2 = (ajl)rI.get(var0);
      return var2 == null ? 1 : ((Integer)var2.if() >= (Integer)var2.a() ? (Integer)var2.if() : (Integer)var2.if() + var1.nextInt((Integer)var2.a() - (Integer)var2.if()));
   }

   public void a(byte var1) {
      if (var1 == 12) {
         this.x("heart");
      } else if (var1 == 13) {
         this.x("angryVillager");
      } else if (var1 == 14) {
         this.x("happyVillager");
      } else {
         super.a(var1);
      }

   }

   private void x(String var1) {
      for(int var2 = 0; var2 < 5; ++var2) {
         double var3 = this.bm.nextGaussian() * 0.02D;
         double var5 = this.bm.nextGaussian() * 0.02D;
         double var7 = this.bm.nextGaussian() * 0.02D;
         this.ap.a(var1, this.al + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP, this.ak + 1.0D + (double)(this.bm.nextFloat() * this.aO), this.aj + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP, var3, var5, var7);
      }

   }

   public void bO() {
      this.ax(this.ap.o.nextInt(5));
   }

   public void fM() {
      this.rO = true;
   }

   public aep case(aiy var1) {
      aep var2 = new aep(this.ap);
      var2.bO();
      return var2;
   }

   public aiy a(aiy var1) {
      return this.case(var1);
   }

   static {
      rK.put(abr.R.A, new ajl(16, 24));
      rK.put(abr.N.A, new ajl(8, 10));
      rK.put(abr.L.A, new ajl(8, 10));
      rK.put(abr.P.A, new ajl(4, 6));
      rK.put(abr.cn.A, new ajl(24, 36));
      rK.put(abr.cm.A, new ajl(11, 13));
      rK.put(abr.bR.A, new ajl(1, 1));
      rK.put(abr.aF.A, new ajl(3, 4));
      rK.put(abr.b3.A, new ajl(2, 3));
      rK.put(abr.bu.A, new ajl(14, 18));
      rK.put(abr.aP.A, new ajl(14, 18));
      rK.put(abr.aL.A, new ajl(14, 18));
      rK.put(abr.ca.A, new ajl(9, 13));
      rK.put(abr.aG.A, new ajl(34, 48));
      rK.put(abr.aR.A, new ajl(30, 38));
      rK.put(abr.aT.A, new ajl(30, 38));
      rK.put(abr.aE.A, new ajl(18, 22));
      rK.put(pa.bV.void, new ajl(14, 22));
      rK.put(abr.aH.A, new ajl(36, 64));
      rI.put(abr.aa.A, new ajl(3, 4));
      rI.put(abr.aX.A, new ajl(3, 4));
      rI.put(abr.J.A, new ajl(7, 11));
      rI.put(abr.bd.A, new ajl(12, 14));
      rI.put(abr.ac.A, new ajl(6, 8));
      rI.put(abr.ba.A, new ajl(9, 12));
      rI.put(abr.ae.A, new ajl(7, 9));
      rI.put(abr.bb.A, new ajl(10, 12));
      rI.put(abr.ag.A, new ajl(4, 6));
      rI.put(abr.bc.A, new ajl(7, 8));
      rI.put(abr.aM.A, new ajl(4, 6));
      rI.put(abr.aK.A, new ajl(7, 8));
      rI.put(abr.bO.A, new ajl(4, 6));
      rI.put(abr.bF.A, new ajl(7, 8));
      rI.put(abr.bU.A, new ajl(4, 6));
      rI.put(abr.bM.A, new ajl(7, 8));
      rI.put(abr.bS.A, new ajl(10, 14));
      rI.put(abr.bK.A, new ajl(16, 19));
      rI.put(abr.bQ.A, new ajl(8, 10));
      rI.put(abr.bI.A, new ajl(11, 14));
      rI.put(abr.bW.A, new ajl(5, 7));
      rI.put(abr.b2.A, new ajl(5, 7));
      rI.put(abr.b0.A, new ajl(11, 15));
      rI.put(abr.bY.A, new ajl(9, 11));
      rI.put(abr.aC.A, new ajl(-4, -2));
      rI.put(abr.aV.A, new ajl(-8, -4));
      rI.put(abr.Y.A, new ajl(-8, -4));
      rI.put(abr.a1.A, new ajl(-10, -7));
      rI.put(pa.aD.void, new ajl(-5, -3));
      rI.put(pa.bx.void, new ajl(3, 4));
      rI.put(abr.ay.A, new ajl(4, 5));
      rI.put(abr.au.A, new ajl(2, 4));
      rI.put(abr.aA.A, new ajl(2, 4));
      rI.put(abr.aw.A, new ajl(2, 4));
      rI.put(abr.cx.A, new ajl(6, 8));
      rI.put(abr.bX.A, new ajl(-4, -1));
      rI.put(abr.cv.A, new ajl(-4, -1));
      rI.put(abr.cg.A, new ajl(10, 12));
      rI.put(abr.cd.A, new ajl(10, 12));
      rI.put(pa.aN.void, new ajl(-3, -1));
      rI.put(abr.bs.A, new ajl(-7, -5));
      rI.put(abr.aN.A, new ajl(-7, -5));
      rI.put(abr.aJ.A, new ajl(-8, -6));
      rI.put(abr.b3.A, new ajl(7, 11));
      rI.put(abr.T.A, new ajl(-12, -8));
      List var0 = ModLoader.a(-1);
      Iterator var1 = var0.iterator();

      while(var1.hasNext()) {
         anu var2 = (anu)var1.next();
         if (var2.for) {
            if (var2.do > 0 && var2.a > 0) {
               rK.put(var2.int, new ajl(var2.do, var2.a));
            }
         } else if (var2.do > 0 && var2.a > 0) {
            rI.put(var2.int, new ajl(var2.do, var2.a));
         }
      }

   }
}
