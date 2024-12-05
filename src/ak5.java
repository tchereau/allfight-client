import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ak5 extends y6 {
   private final net.minecraft.a.a V;
   private final alb U;
   private final ak8 S;
   private Set R;
   private TreeSet P;
   public ak6 T;
   public boolean Q;
   private boolean O;
   private int N = 0;
   private final yu M;
   private ak3[] L = new ak3[]{new ak3((ak4)null), new ak3((ak4)null)};
   private int K = 0;
   private static final aji[] J;
   private ArrayList I = new ArrayList();
   private ajy H;

   public ak5(net.minecraft.a.a var1, si var2, String var3, int var4, y0 var5, ajq var6, ajw var7) {
      super(var2, var3, var5, xl.a(var4), var6, var7);
      this.V = var1;
      this.U = new alb(this);
      this.S = new ak8(this, var1.g6().b());
      if (this.H == null) {
         this.H = new ajy();
      }

      if (this.R == null) {
         this.R = new HashSet();
      }

      if (this.P == null) {
         this.P = new TreeSet();
      }

      this.M = new yu(this);
      this.d = new amf(var1);
      nk var8 = (nk)this.h.a(nk.class, "scoreboard");
      if (var8 == null) {
         var8 = new nk();
         this.h.a((String)"scoreboard", (s0)var8);
      }

      var8.a(this.d);
      ((amf)this.d).a(var8);
   }

   public void d() {
      super.d();
      if (this.l().void() && this.p < 3) {
         this.p = 3;
      }

      this.n.new.a();
      if (this.H()) {
         boolean var1 = false;
         if (this.c && this.p >= 1) {
         }

         if (!var1) {
            long var2 = this.j.else() + 24000L;
            this.j.a(var2 - var2 % 24000L);
            this.z();
         }
      }

      this.e.a("mobSpawner");
      if (this.i().a("doMobSpawning")) {
         yv.a(this, this.c, this.b, this.j.if() % 400L == 0L);
      }

      this.e.do("chunkSource");
      this.l.for();
      int var4 = this.a(1.0F);
      if (var4 != this.x) {
         this.x = var4;
      }

      this.j.if(this.j.if() + 1L);
      this.j.a(this.j.else() + 1L);
      this.e.do("tickPending");
      this.a(false);
      this.e.do("tickTiles");
      this.g();
      this.e.do("chunkMap");
      this.S.a();
      this.e.do("village");
      this.g.int();
      this.f.a();
      this.e.do("portalForcer");
      this.M.a(this.m());
      this.e.if();
      this.I();
   }

   public ym a(ah9 var1, int var2, int var3, int var4) {
      List var5 = this.new().a(var1, var2, var3, var4);
      return var5 != null && !var5.isEmpty() ? (ym)ajk.a(this.o, (Collection)var5) : null;
   }

   public void o() {
      this.O = !this.z.isEmpty();
      Iterator var1 = this.z.iterator();

      while(var1.hasNext()) {
         aek var2 = (aek)var1.next();
         if (!var2.cg()) {
            this.O = false;
            break;
         }
      }

   }

   protected void z() {
      this.O = false;
      Iterator var1 = this.z.iterator();

      while(var1.hasNext()) {
         aek var2 = (aek)var1.next();
         if (var2.cg()) {
            var2.a(false, false, true);
         }
      }

      this.C();
   }

   private void C() {
      this.j.do(0);
      this.j.do(false);
      this.j.int(0);
      this.j.a(false);
   }

   public boolean H() {
      if (this.O && !this.goto) {
         Iterator var1 = this.z.iterator();

         aek var2;
         do {
            if (!var1.hasNext()) {
               return true;
            }

            var2 = (aek)var1.next();
         } while(var2.cO());

         return false;
      } else {
         return false;
      }
   }

   public void else() {
      if (this.j.int() <= 0) {
         this.j.new(64);
      }

      int var1 = this.j.h();
      int var2 = this.j.b();
      int var3 = 0;

      while(this.if(var1, var2) == 0) {
         var1 += this.o.nextInt(8) - this.o.nextInt(8);
         var2 += this.o.nextInt(8) - this.o.nextInt(8);
         ++var3;
         if (var3 == 10000) {
            break;
         }
      }

      this.j.if(var1);
      this.j.for(var2);
   }

   protected void g() {
      super.g();
      int var1 = 0;
      int var2 = 0;
      Iterator var3 = this.void.iterator();

      while(var3.hasNext()) {
         zi var4 = (zi)var3.next();
         int var5 = var4.if * 16;
         int var6 = var4.a * 16;
         this.e.a("getChunk");
         xx var7 = this.byte(var4.if, var4.a);
         this.a(var5, var6, var7);
         this.e.do("tickChunk");
         var7.a();
         this.e.do("thunder");
         int var8;
         int var9;
         int var10;
         int var11;
         if (this.o.nextInt(100000) == 0 && this.goto() && this.w()) {
            this.w = this.w * 3 + 1013904223;
            var8 = this.w >> 2;
            var9 = var5 + (var8 & 15);
            var10 = var6 + (var8 >> 8 & 15);
            var11 = this.new(var9, var10);
            if (this.d(var9, var11, var10)) {
               this.for(new afn(this, (double)var9, (double)var11, (double)var10));
            }
         }

         this.e.do("iceandsnow");
         int var13;
         if (this.o.nextInt(16) == 0) {
            this.w = this.w * 3 + 1013904223;
            var8 = this.w >> 2;
            var9 = var8 & 15;
            var10 = var8 >> 8 & 15;
            var11 = this.new(var9 + var5, var10 + var6);
            if (this.goto(var9 + var5, var11 - 1, var10 + var6)) {
               this.int(var9 + var5, var11 - 1, var10 + var6, pa.b9.void);
            }

            if (this.goto() && this.long(var9 + var5, var11, var10 + var6)) {
               this.int(var9 + var5, var11, var10 + var6, pa.ca.void);
            }

            if (this.goto()) {
               yn var12 = this.a(var9 + var5, var10 + var6);
               if (var12.if()) {
                  var13 = this.new(var9 + var5, var11 - 1, var10 + var6);
                  if (var13 != 0) {
                     pa.x[var13].byte(this, var9 + var5, var11 - 1, var10 + var6);
                  }
               }
            }
         }

         this.e.do("tickTiles");
         xw[] var19 = var7.else();
         var9 = var19.length;

         for(var10 = 0; var10 < var9; ++var10) {
            xw var20 = var19[var10];
            if (var20 != null && var20.else()) {
               for(int var21 = 0; var21 < 3; ++var21) {
                  this.w = this.w * 3 + 1013904223;
                  var13 = this.w >> 2;
                  int var14 = var13 & 15;
                  int var15 = var13 >> 8 & 15;
                  int var16 = var13 >> 16 & 15;
                  int var17 = var20.a(var14, var16, var15);
                  ++var2;
                  pa var18 = pa.x[var17];
                  if (var18 != null && var18.f()) {
                     ++var1;
                     var18.if(this, var14 + var5, var16 + var20.int(), var15 + var6, (Random)this.o);
                  }
               }
            }
         }

         this.e.if();
      }

   }

   public boolean case(int var1, int var2, int var3, int var4) {
      yr var5 = new yr(var1, var2, var3, var4);
      return this.I.contains(var5);
   }

   public void if(int var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, 0);
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      yr var7 = new yr(var1, var2, var3, var4);
      byte var8 = 0;
      if (this.D && var4 > 0) {
         if (pa.x[var4].char()) {
            if (this.for(var7.if - var8, var7.a - var8, var7.byte - var8, var7.if + var8, var7.a + var8, var7.byte + var8)) {
               int var9 = this.new(var7.if, var7.a, var7.byte);
               if (var9 == var7.try && var9 > 0) {
                  pa.x[var9].if(this, var7.if, var7.a, var7.byte, (Random)this.o);
               }
            }

            return;
         }

         var5 = 1;
      }

      if (this.for(var1 - var8, var2 - var8, var3 - var8, var1 + var8, var2 + var8, var3 + var8)) {
         if (var4 > 0) {
            var7.a((long)var5 + this.j.if());
            var7.a(var6);
         }

         if (!this.R.contains(var7)) {
            this.R.add(var7);
            this.P.add(var7);
         }
      }

   }

   public void if(int var1, int var2, int var3, int var4, int var5, int var6) {
      yr var7 = new yr(var1, var2, var3, var4);
      var7.a(var6);
      if (var4 > 0) {
         var7.a((long)var5 + this.j.if());
      }

      if (!this.R.contains(var7)) {
         this.R.add(var7);
         this.P.add(var7);
      }

   }

   public void p() {
      if (this.z.isEmpty()) {
         if (this.N++ >= 1200) {
            return;
         }
      } else {
         this.A();
      }

      super.p();
   }

   public void A() {
      this.N = 0;
   }

   public boolean a(boolean var1) {
      int var2 = this.P.size();
      if (var2 != this.R.size()) {
         throw new IllegalStateException("TickNextTick list out of synch");
      } else {
         if (var2 > 1000) {
            var2 = 1000;
         }

         this.e.a("cleaning");

         yr var4;
         for(int var3 = 0; var3 < var2; ++var3) {
            var4 = (yr)this.P.first();
            if (!var1 && var4.new > this.j.if()) {
               break;
            }

            this.P.remove(var4);
            this.R.remove(var4);
            this.I.add(var4);
         }

         this.e.if();
         this.e.a("ticking");
         Iterator var14 = this.I.iterator();

         while(var14.hasNext()) {
            var4 = (yr)var14.next();
            var14.remove();
            byte var5 = 0;
            if (this.for(var4.if - var5, var4.a - var5, var4.byte - var5, var4.if + var5, var4.a + var5, var4.byte + var5)) {
               int var6 = this.new(var4.if, var4.a, var4.byte);
               if (var6 > 0 && pa.a(var6, var4.try)) {
                  try {
                     pa.x[var6].if(this, var4.if, var4.a, var4.byte, (Random)this.o);
                  } catch (Throwable var13) {
                     aqh var8 = aqh.a(var13, "Exception while ticking a block");
                     apu var9 = var8.a("Block being ticked");

                     int var10;
                     try {
                        var10 = this.for(var4.if, var4.a, var4.byte);
                     } catch (Throwable var12) {
                        var10 = -1;
                     }

                     apu.a(var9, var4.if, var4.a, var4.byte, var6, var10);
                     throw new ape(var8);
                  }
               }
            } else {
               this.if(var4.if, var4.a, var4.byte, var4.try, 0);
            }
         }

         this.e.if();
         this.I.clear();
         return !this.P.isEmpty();
      }
   }

   public List a(xx var1, boolean var2) {
      ArrayList var3 = null;
      zi var4 = var1.void();
      int var5 = (var4.if << 4) - 2;
      int var6 = var5 + 16 + 2;
      int var7 = (var4.a << 4) - 2;
      int var8 = var7 + 16 + 2;

      for(int var9 = 0; var9 < 2; ++var9) {
         Iterator var10;
         if (var9 == 0) {
            var10 = this.P.iterator();
         } else {
            var10 = this.I.iterator();
            if (!this.I.isEmpty()) {
               System.out.println(this.I.size());
            }
         }

         while(var10.hasNext()) {
            yr var11 = (yr)var10.next();
            if (var11.if >= var5 && var11.if < var6 && var11.byte >= var7 && var11.byte < var8) {
               if (var2) {
                  this.R.remove(var11);
                  var10.remove();
               }

               if (var3 == null) {
                  var3 = new ArrayList();
               }

               var3.add(var11);
            }
         }
      }

      return var3;
   }

   public void a(aiw var1, boolean var2) {
      if (!this.V.hv() && (var1 instanceof af9 || var1 instanceof afx)) {
         var1.az();
      }

      if (!this.V.hy() && var1 instanceof aeq) {
         var1.az();
      }

      if (!(var1.as instanceof aek)) {
         super.a(var1, var2);
      }

   }

   public void if(aiw var1, boolean var2) {
      super.a(var1, var2);
   }

   protected x0 s() {
      xt var1 = this.k.a(this.n);
      this.T = new ak6(this, var1, this.n.else());
      return this.T;
   }

   public List try(int var1, int var2, int var3, int var4, int var5, int var6) {
      ArrayList var7 = new ArrayList();

      for(int var8 = 0; var8 < this.A.size(); ++var8) {
         n4 var9 = (n4)this.A.get(var8);
         if (var9.new >= var1 && var9.int >= var2 && var9.for >= var3 && var9.new < var4 && var9.int < var5 && var9.for < var6) {
            var7.add(var9);
         }
      }

      return var7;
   }

   public boolean a(aek var1, int var2, int var3, int var4) {
      return !this.V.a(this, var2, var3, var4, var1);
   }

   protected void a(y0 var1) {
      if (this.H == null) {
         this.H = new ajy();
      }

      if (this.R == null) {
         this.R = new HashSet();
      }

      if (this.P == null) {
         this.P = new TreeSet();
      }

      this.if(var1);
      super.a(var1);
   }

   protected void if(y0 var1) {
      if (!this.n.do()) {
         this.j.a(0, this.n.if(), 0);
      } else {
         this.i = true;
         yi var2 = this.n.new;
         List var3 = var2.if();
         Random var4 = new Random(this.b());
         yp var5 = var2.a(0, 0, 256, var3, var4);
         int var6 = 0;
         int var7 = this.n.if();
         int var8 = 0;
         if (var5 != null) {
            var6 = var5.if;
            var8 = var5.do;
         } else {
            this.char().if("Unable to find spawn biome");
         }

         int var9 = 0;

         while(!this.n.a(var6, var8)) {
            var6 += var4.nextInt(64) - var4.nextInt(64);
            var8 += var4.nextInt(64) - var4.nextInt(64);
            ++var9;
            if (var9 == 1000) {
               break;
            }
         }

         this.j.a(var6, var7, var8);
         this.i = false;
         if (var1.new()) {
            this.y();
         }

      }
   }

   protected void y() {
      w7 var1 = new w7(J, 10);

      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = this.j.h() + this.o.nextInt(6) - this.o.nextInt(6);
         int var4 = this.j.b() + this.o.nextInt(6) - this.o.nextInt(6);
         int var5 = this.case(var3, var4) + 1;
         if (var1.a(this, this.o, var3, var5, var4)) {
            break;
         }
      }

   }

   public apg G() {
      return this.n.case();
   }

   public void a(boolean var1, ajo var2) {
      if (this.l.if()) {
         if (var2 != null) {
            var2.l("Saving level");
         }

         this.K();
         if (var2 != null) {
            var2.n("Saving chunks");
         }

         this.l.a(var1, var2);
      }
   }

   protected void K() {
      this.for();
      this.k.a(this.j, this.V.g6().char());
      this.h.if();
   }

   protected void try(aiw var1) {
      super.try(var1);
      this.H.a(var1.av, var1);
      aiw[] var2 = var1.R();
      if (var2 != null) {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            this.H.a(var2[var3].av, var2[var3]);
         }
      }

   }

   protected void if(aiw var1) {
      super.if(var1);
      this.H.try(var1.av);
      aiw[] var2 = var1.R();
      if (var2 != null) {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            this.H.try(var2[var3].av);
         }
      }

   }

   public aiw a(int var1) {
      return (aiw)this.H.for(var1);
   }

   public boolean for(aiw var1) {
      if (super.for(var1)) {
         this.V.g6().a(var1.al, var1.ak, var1.aj, 512.0D, this.n.if, new apt(var1));
         return true;
      } else {
         return false;
      }
   }

   public void a(aiw var1, byte var2) {
      aos var3 = new aos(var1.av, var2);
      this.D().if(var1, var3);
   }

   public zg a(aiw var1, double var2, double var4, double var6, float var8, boolean var9, boolean var10) {
      zg var11 = new zg(this, var1, var2, var4, var6, var8);
      var11.goto = var9;
      var11.else = var10;
      var11.if();
      var11.a(false);
      if (!var10) {
         var11.int.clear();
      }

      Iterator var12 = this.z.iterator();

      while(var12.hasNext()) {
         aek var13 = (aek)var12.next();
         if (var13.if(var2, var4, var6) < 4096.0D) {
            ((ak2)var13).pV.if((an7)(new aor(var2, var4, var6, var8, var11.int, (nr)var11.a().get(var13))));
         }
      }

      return var11;
   }

   public void do(int var1, int var2, int var3, int var4, int var5, int var6) {
      yq var7 = new yq(var1, var2, var3, var4, var5, var6);
      Iterator var8 = this.L[this.K].iterator();

      yq var9;
      do {
         if (!var8.hasNext()) {
            this.L[this.K].add(var7);
            return;
         }

         var9 = (yq)var8.next();
      } while(!var9.equals(var7));

   }

   private void I() {
      while(!this.L[this.K].isEmpty()) {
         int var1 = this.K;
         this.K ^= 1;
         Iterator var2 = this.L[var1].iterator();

         while(var2.hasNext()) {
            yq var3 = (yq)var2.next();
            if (this.a(var3)) {
               this.V.g6().a((double)var3.int(), (double)var3.do(), (double)var3.a(), 64.0D, this.n.if, new anb(var3.int(), var3.do(), var3.a(), var3.if(), var3.new(), var3.for()));
            }
         }

         this.L[var1].clear();
      }

   }

   private boolean a(yq var1) {
      int var2 = this.new(var1.int(), var1.do(), var1.a());
      return var2 == var1.if() ? pa.x[var2].if(this, var1.int(), var1.do(), var1.a(), var1.new(), var1.for()) : false;
   }

   public void J() {
      this.k.do();
   }

   protected void v() {
      boolean var1 = this.goto();
      super.v();
      if (var1 != this.goto()) {
         if (var1) {
            this.V.g6().a((an7)(new aoq(2, 0)));
         } else {
            this.V.g6().a((an7)(new aoq(1, 0)));
         }
      }

   }

   public net.minecraft.a.a F() {
      return this.V;
   }

   public alb D() {
      return this.U;
   }

   public ak8 E() {
      return this.S;
   }

   public yu B() {
      return this.M;
   }

   static {
      J = new aji[]{new aji(abr.a9.A, 0, 1, 3, 10), new aji(pa.be.void, 0, 1, 3, 10), new aji(pa.aM.void, 0, 1, 3, 10), new aji(abr.r.A, 0, 1, 1, 3), new aji(abr.z.A, 0, 1, 1, 5), new aji(abr.t.A, 0, 1, 1, 3), new aji(abr.B.A, 0, 1, 1, 5), new aji(abr.Y.A, 0, 2, 3, 5), new aji(abr.aC.A, 0, 2, 3, 3)};
   }
}
