import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ak2 extends aek implements adv {
   private aqy pL = new aqy("en_US");
   public akx pV;
   public net.minecraft.a.a pU;
   public ak1 pT;
   public double pS;
   public double pR;
   public final List pQ = new LinkedList();
   public final List pP = new LinkedList();
   private int pK = -99999999;
   private int pJ = -99999999;
   private boolean pI = true;
   private int pH = -99999999;
   private int pG = 60;
   private int pF = 0;
   private int pE = 0;
   private boolean pD = true;
   private int pC = 0;
   public boolean pO;
   public int pN;
   public boolean pM = false;

   public ak2(net.minecraft.a.a var1, y6 var2, String var3, ak1 var4) {
      super(var2);
      var4.void = this;
      this.pT = var4;
      this.pF = var1.g6().b();
      apg var5 = var2.long();
      int var6 = var5.if;
      int var7 = var5.do;
      int var8 = var5.a;
      if (!var2.n.for && var2.l().f() != yz.new) {
         int var9 = Math.max(5, var1.gS() - 6);
         var6 += this.bm.nextInt(var9 * 2) - var9;
         var7 += this.bm.nextInt(var9 * 2) - var9;
         var8 = var2.case(var6, var7);
      }

      this.pU = var1;
      this.aF = 0.0F;
      this.fJ = var3;
      this.aQ = 0.0F;
      this.if((double)var6 + 0.5D, (double)var8, (double)var7 + 0.5D, 0.0F, 0.0F);

      while(!var2.if((aiw)this, (nw)this.aZ).isEmpty()) {
         this.try(this.al, this.ak + 1.0D, this.aj);
      }

   }

   public void try(aqv var1) {
      super.try(var1);
      if (var1.try("playerGameType")) {
         this.pT.a(yz.a(var1.goto("playerGameType")));
      }

   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("playerGameType", this.pT.a().new());
   }

   public void D(int var1) {
      super.D(var1);
      this.pH = -1;
   }

   public void eG() {
      this.fP.a((adv)this);
   }

   protected void cs() {
      this.aQ = 0.0F;
   }

   public float af() {
      return 1.62F;
   }

   public void aC() {
      this.pT.if();
      --this.pG;
      this.fP.do();

      while(!this.pP.isEmpty()) {
         int var1 = Math.min(this.pP.size(), 127);
         int[] var2 = new int[var1];
         Iterator var3 = this.pP.iterator();
         int var4 = 0;

         while(var3.hasNext() && var4 < var1) {
            var2[var4++] = (Integer)var3.next();
            var3.remove();
         }

         this.pV.if((an7)(new an1(var2)));
      }

      if (!this.pQ.isEmpty()) {
         ArrayList var6 = new ArrayList();
         Iterator var7 = this.pQ.iterator();
         ArrayList var8 = new ArrayList();

         while(var7.hasNext() && var6.size() < 5) {
            zi var9 = (zi)var7.next();
            var7.remove();
            if (var9 != null && this.ap.p(var9.if << 4, 0, var9.a << 4)) {
               var6.add(this.ap.byte(var9.if, var9.a));
               var8.addAll(((ak5)this.ap).try(var9.if * 16, 0, var9.a * 16, var9.if * 16 + 16, 256, var9.a * 16 + 16));
            }
         }

         if (!var6.isEmpty()) {
            this.pV.if((an7)(new aok(var6)));
            Iterator var10 = var8.iterator();

            while(var10.hasNext()) {
               n4 var5 = (n4)var10.next();
               this.if(var5);
            }

            var10 = var6.iterator();

            while(var10.hasNext()) {
               xx var11 = (xx)var10.next();
               this.eC().D().a(this, var11);
            }
         }
      }

   }

   public void t(int var1) {
      super.t(var1);
      Collection var2 = this.ct().a(nh.do);
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         np var4 = (np)var3.next();
         this.ct().a(this.aB(), var4).a(Arrays.asList(this));
      }

   }

   public void eD() {
      try {
         super.aC();

         for(int var1 = 0; var1 < this.fR.r(); ++var1) {
            abp var5 = this.fR.do(var1);
            if (var5 != null && abr.ai[var5.new].f() && this.pV.for() <= 5) {
               an7 var6 = ((aco)abr.ai[var5.new]).try(var5, this.ap, this);
               if (var6 != null) {
                  this.pV.if(var6);
               }
            }
         }

         if (this.cd() != this.pK || this.pJ != this.fO.for() || this.fO.a() == 0.0F != this.pI) {
            this.pV.if((an7)(new ano(this.cd(), this.fO.for(), this.fO.a())));
            this.pK = this.cd();
            this.pJ = this.fO.for();
            this.pI = this.fO.a() == 0.0F;
         }

         if (this.fW != this.pH) {
            this.pH = this.fW;
            this.pV.if((an7)(new anp(this.fV, this.fW, this.fX)));
         }

      } catch (Throwable var4) {
         aqh var2 = aqh.a(var4, "Ticking player");
         apu var3 = var2.a("Player being ticked");
         this.if((apu)var3);
         throw new ape(var2);
      }
   }

   public void a(ai4 var1) {
      this.pU.g6().case(this.el.a());
      if (!this.ap.i().a("keepInventory")) {
         this.fR.K();
      }

      Collection var2 = this.ap.f().a(nh.new);
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         np var4 = (np)var3.next();
         nn var5 = this.ct().a(this.aB(), var4);
         var5.if();
      }

      aig var6 = this.bN();
      if (var6 != null) {
         var6.a((aiw)this, this.fo);
      }

   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else {
         boolean var3 = this.pU.ht() && this.pU.hA() && "fall".equals(var1.case);
         if (!var3 && this.pG > 0 && var1 != ai4.b) {
            return false;
         } else {
            if (var1 instanceof ai3) {
               aiw var4 = var1.new();
               if (var4 instanceof aek && !this.try((aek)var4)) {
                  return false;
               }

               if (var4 instanceof aei) {
                  aei var5 = (aei)var4;
                  if (var5.cF instanceof aek && !this.try((aek)var5.cF)) {
                     return false;
                  }
               }
            }

            return super.a(var1, var2);
         }
      }
   }

   public boolean try(aek var1) {
      return !this.pU.hA() ? false : super.try(var1);
   }

   public void f(int var1) {
      if (this.a6 == 1 && var1 == 1) {
         this.a((akf)akk.goto);
         this.ap.a((aiw)this);
         this.pM = true;
         this.pV.if((an7)(new aoq(4, 0)));
      } else {
         if (this.a6 == 1 && var1 == 0) {
            this.a((akf)akk.void);
            apg var2 = this.pU.aS(var1).G();
            if (var2 != null) {
               this.pV.a((double)var2.if, (double)var2.a, (double)var2.do, 0.0F, 0.0F);
            }

            var1 = 1;
         } else {
            this.a((akf)akk.do);
         }

         this.pU.g6().a(this, var1);
         this.pH = -1;
         this.pK = -1;
         this.pJ = -1;
      }

   }

   private void if(n4 var1) {
      if (var1 != null) {
         an7 var2 = var1.char();
         if (var2 != null) {
            this.pV.if(var2);
         }
      }

   }

   public void if(aiw var1, int var2) {
      super.if(var1, var2);
      this.fP.do();
   }

   public aej int(int var1, int var2, int var3) {
      aej var4 = super.int(var1, var2, var3);
      if (var4 == aej.if) {
         aot var5 = new aot(this, 0, var1, var2, var3);
         this.eC().D().a((aiw)this, (an7)var5);
         this.pV.a(this.al, this.ak, this.aj, this.a5, this.a4);
         this.pV.if((an7)var5);
      }

      return var4;
   }

   public void a(boolean var1, boolean var2, boolean var3) {
      if (this.cg()) {
         this.eC().D().if(this, new apl(this, 3));
      }

      super.a(var1, var2, var3);
      if (this.pV != null) {
         this.pV.a(this.al, this.ak, this.aj, this.a5, this.a4);
      }

   }

   public void int(aiw var1) {
      super.int(var1);
      this.pV.if((an7)(new anl(this, this.ar)));
      this.pV.a(this.al, this.ak, this.aj, this.a5, this.a4);
   }

   protected void a(double var1, boolean var3) {
   }

   public void if(double var1, boolean var3) {
      super.a(var1, var3);
   }

   private void eI() {
      this.pC = this.pC % 100 + 1;
   }

   public void new(int var1, int var2, int var3) {
      this.eI();
      this.pV.if((an7)(new aoz(this.pC, 1, "Crafting", 9, true)));
      this.fP = new ads(this.fR, this.ap, var1, var2, var3);
      this.fP.new = this.pC;
      this.fP.a((adv)this);
   }

   public void a(int var1, int var2, int var3, String var4) {
      this.eI();
      this.pV.if((an7)(new aoz(this.pC, 4, var4 == null ? "" : var4, 9, var4 != null)));
      this.fP = new adr(this.fR, this.ap, var1, var2, var3);
      this.fP.new = this.pC;
      this.fP.a((adv)this);
   }

   public void for(int var1, int var2, int var3) {
      this.eI();
      this.pV.if((an7)(new aoz(this.pC, 8, "Repairing", 9, true)));
      this.fP = new ade(this.fR, this.ap, var1, var2, var3, this);
      this.fP.new = this.pC;
      this.fP.a((adv)this);
   }

   public void a(ajg var1) {
      if (this.fP != this.fQ) {
         this.cv();
      }

      this.eI();
      this.pV.if((an7)(new aoz(this.pC, 0, var1.t(), var1.r(), var1.s())));
      this.fP = new adu(this.fR, var1);
      this.fP.new = this.pC;
      this.fP.a((adv)this);
   }

   public void a(oc var1) {
      this.eI();
      this.pV.if((an7)(new aoz(this.pC, 9, var1.t(), var1.r(), var1.s())));
      this.fP = new adm(this.fR, var1);
      this.fP.new = this.pC;
      this.fP.a((adv)this);
   }

   public void a(aff var1) {
      this.eI();
      this.pV.if((an7)(new aoz(this.pC, 9, var1.t(), var1.r(), var1.s())));
      this.fP = new adm(this.fR, var1);
      this.fP.new = this.pC;
      this.fP.a((adv)this);
   }

   public void a(oe var1) {
      this.eI();
      this.pV.if((an7)(new aoz(this.pC, 2, var1.t(), var1.r(), var1.s())));
      this.fP = new ado(this.fR, var1);
      this.fP.new = this.pC;
      this.fP.a((adv)this);
   }

   public void a(oi var1) {
      this.eI();
      this.pV.if((an7)(new aoz(this.pC, var1 instanceof oh ? 10 : 3, var1.t(), var1.r(), var1.s())));
      this.fP = new ac7(this.fR, var1);
      this.fP.new = this.pC;
      this.fP.a((adv)this);
   }

   public void a(on var1) {
      this.eI();
      this.pV.if((an7)(new aoz(this.pC, 5, var1.t(), var1.r(), var1.s())));
      this.fP = new ady(this.fR, var1);
      this.fP.new = this.pC;
      this.fP.a((adv)this);
   }

   public void a(oo var1) {
      this.eI();
      this.pV.if((an7)(new aoz(this.pC, 7, var1.t(), var1.r(), var1.s())));
      this.fP = new ad0(this.fR, var1);
      this.fP.new = this.pC;
      this.fP.a((adv)this);
   }

   public void a(zn var1, String var2) {
      this.eI();
      this.fP = new adh(this.fR, var1, this.ap);
      this.fP.new = this.pC;
      this.fP.a((adv)this);
      adi var3 = ((adh)this.fP).int();
      this.pV.if((an7)(new aoz(this.pC, 6, var2 == null ? "" : var2, var3.r(), var2 != null)));
      zl var4 = var1.char(this);
      if (var4 != null) {
         try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var6 = new DataOutputStream(var5);
            var6.writeInt(this.pC);
            var4.a(var6);
            this.pV.if((an7)(new aov("MC|TrList", var5.toByteArray())));
         } catch (IOException var7) {
            var7.printStackTrace();
         }
      }

   }

   public void a(ad1 var1, int var2, abp var3) {
      if (!(var1.do(var2) instanceof ada)) {
         if (!this.pO) {
            this.pV.if((an7)(new aow(var1.new, var2, var3)));
         }
      }
   }

   public void a(ad1 var1) {
      this.a(var1, var1.a());
   }

   public void a(ad1 var1, List var2) {
      this.pV.if((an7)(new aoy(var1.new, var2)));
      this.pV.if((an7)(new aow(-1, -1, this.fR.M())));
   }

   public void a(ad1 var1, int var2, int var3) {
      this.pV.if((an7)(new aox(var1.new, var2, var3)));
   }

   public void cv() {
      this.pV.if((an7)(new ao0(this.fP.new)));
      this.eF();
   }

   public void eB() {
      if (!this.pO) {
         this.pV.if((an7)(new aow(-1, -1, this.fR.M())));
      }
   }

   public void eF() {
      this.fP.if((aek)this);
      this.fP = this.fQ;
   }

   public void a(akf var1, int var2) {
      if (var1 != null) {
         if (!var1.int) {
            while(var2 > 100) {
               this.pV.if((an7)(new apj(var1.new, 100)));
               var2 -= 100;
            }

            this.pV.if((an7)(new apj(var1.new, var2)));
         }

      }
   }

   public void eA() {
      if (this.as != null) {
         this.as.int((aiw)this);
      }

      if (this.f2) {
         this.a(true, false, false);
      }

   }

   public void eE() {
      this.pK = -99999999;
   }

   public void new(String var1) {
      aqy var2 = aqy.if();
      String var3 = var2.a(var1);
      this.pV.if((an7)(new apf(var3)));
   }

   protected void cB() {
      this.pV.if((an7)(new aos(this.av, (byte)9)));
      super.cB();
   }

   public void do(abp var1, int var2) {
      super.do(var1, var2);
      if (var1 != null && var1.d() != null && var1.d().else(var1) == aax.if) {
         this.eC().D().if(this, new apl(this, 5));
      }

   }

   public void a(aek var1, boolean var2) {
      super.a(var1, var2);
      this.pH = -1;
      this.pK = -1;
      this.pJ = -1;
      this.pP.addAll(((ak2)var1).pP);
   }

   protected void int(aiz var1) {
      super.int(var1);
      this.pV.if((an7)(new am9(this.av, var1)));
   }

   protected void if(aiz var1) {
      super.if((aiz)var1);
      this.pV.if((an7)(new am9(this.av, var1)));
   }

   protected void do(aiz var1) {
      super.do(var1);
      this.pV.if((an7)(new an0(this.av, var1)));
   }

   public void char(double var1, double var3, double var5) {
      this.pV.a(var1, var3, var5, this.a5, this.a4);
   }

   public void e(aiw var1) {
      this.eC().D().if(this, new apl(var1, 6));
   }

   public void d(aiw var1) {
      this.eC().D().if(this, new apl(var1, 7));
   }

   public void cF() {
      if (this.pV != null) {
         this.pV.if((an7)(new an5(this.fY)));
      }
   }

   public ak5 eC() {
      return (ak5)this.ap;
   }

   public void a(yz var1) {
      this.pT.a(var1);
      this.pV.if((an7)(new aoq(3, var1.new())));
   }

   public void a(String var1) {
      this.pV.if((an7)(new apf(var1)));
   }

   public boolean a(int var1, String var2) {
      if ("seed".equals(var2) && !this.pU.ht()) {
         return true;
      } else {
         return !"tell".equals(var2) && !"help".equals(var2) && !"me".equals(var2) ? this.pU.g6().for(this.fJ) : true;
      }
   }

   public String eH() {
      String var1 = this.pV.e.do().toString();
      var1 = var1.substring(var1.indexOf("/") + 1);
      var1 = var1.substring(0, var1.indexOf(":"));
      return var1;
   }

   public void a(ao9 var1) {
      if (this.pL.a().containsKey(var1.I())) {
         this.pL.a(var1.I(), false);
      }

      int var2 = 256 >> var1.J();
      if (var2 > 3 && var2 < 15) {
         this.pF = var2;
      }

      this.pE = var1.H();
      this.pD = var1.G();
      if (this.pU.hb() && this.pU.hC().equals(this.fJ)) {
         this.pU.aU(var1.L());
      }

      this.if(1, !var1.K());
   }

   public aqy cN() {
      return this.pL;
   }

   public int eJ() {
      return this.pE;
   }

   public void for(String var1, int var2) {
      String var3 = var1 + "\u0000" + var2;
      this.pV.if((an7)(new aov("MC|TPack", var3.getBytes())));
   }

   public apg for() {
      return new apg(ajs.a(this.al), ajs.a(this.ak + 0.5D), ajs.a(this.aj));
   }
}
