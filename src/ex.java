import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class ex extends y6 {
   private e5 ad;
   private ez ab;
   private ajy ag = new ajy();
   private Set ae = new HashSet();
   private Set ac = new HashSet();
   private final Minecraft aa = Minecraft.ih();
   private final Set af = new HashSet();

   public ex(e5 var1, y0 var2, int var3, int var4, ajq var5, ajw var6) {
      super(new se(), "MpServer", (xl)xl.a(var3), (y0)var2, var5, var6);
      this.ad = var1;
      this.p = var4;
      this.c(8, 64, 8);
      this.h = var1.A;
   }

   public void d() {
      super.d();
      this.a(this.m() + 1L);
      this.if(this.t() + 1L);
      this.e.a("reEntryProcessing");

      for(int var1 = 0; var1 < 10 && !this.ac.isEmpty(); ++var1) {
         aiw var2 = (aiw)this.ac.iterator().next();
         this.ac.remove(var2);
         if (!this.C.contains(var2)) {
            this.new(var2);
         }
      }

      this.e.do("connection");
      this.ad.char();
      this.e.do("chunkCache");
      this.ab.for();
      this.e.do("tiles");
      this.g();
      this.e.if();
   }

   public void byte(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   protected x0 s() {
      this.ab = new ez(this);
      return this.ab;
   }

   protected void g() {
      super.g();
      this.af.retainAll(this.void);
      if (this.af.size() == this.void.size()) {
         this.af.clear();
      }

      int var1 = 0;
      Iterator var2 = this.void.iterator();

      while(var2.hasNext()) {
         zi var3 = (zi)var2.next();
         if (!this.af.contains(var3)) {
            int var4 = var3.if * 16;
            int var5 = var3.a * 16;
            this.e.a("getChunk");
            xx var6 = this.byte(var3.if, var3.a);
            this.a(var4, var5, var6);
            this.e.if();
            this.af.add(var3);
            ++var1;
            if (var1 >= 10) {
               return;
            }
         }
      }

   }

   public void a(int var1, int var2, boolean var3) {
      if (var3) {
         this.ab.if(var1, var2);
      } else {
         this.ab.try(var1, var2);
      }

      if (!var3) {
         this.new(var1 * 16, 0, var2 * 16, var1 * 16 + 15, 256, var2 * 16 + 15);
      }

   }

   public boolean new(aiw var1) {
      boolean var2 = super.new(var1);
      this.ae.add(var1);
      if (!var2) {
         this.ac.add(var1);
      }

      return var2;
   }

   public void a(aiw var1) {
      super.a(var1);
      this.ae.remove(var1);
   }

   protected void try(aiw var1) {
      super.try(var1);
      if (this.ac.contains(var1)) {
         this.ac.remove(var1);
      }

   }

   protected void if(aiw var1) {
      super.if(var1);
      if (this.ae.contains(var1)) {
         if (var1.aA()) {
            this.ac.add(var1);
         } else {
            this.ae.remove(var1);
         }
      }

   }

   public void a(int var1, aiw var2) {
      aiw var3 = this.a(var1);
      if (var3 != null) {
         this.a(var3);
      }

      this.ae.add(var2);
      var2.av = var1;
      if (!this.new(var2)) {
         this.ac.add(var2);
      }

      this.ag.a(var1, var2);
   }

   public aiw a(int var1) {
      return (aiw)(var1 == this.aa.vk.av ? this.aa.vk : (aiw)this.ag.for(var1));
   }

   public aiw if(int var1) {
      aiw var2 = (aiw)this.ag.try(var1);
      if (var2 != null) {
         this.ae.remove(var2);
         this.a(var2);
      }

      return var2;
   }

   public boolean try(int var1, int var2, int var3, int var4, int var5) {
      this.byte(var1, var2, var3, var1, var2, var3);
      return super.int(var1, var2, var3, var4, var5, 3);
   }

   public void u() {
      this.ad.do(new aou("Quitting"));
   }

   public amd a(afj var1) {
      return new ac(this.aa.uX, var1, this.aa.vk);
   }

   protected void v() {
      if (!this.n.for) {
         this.u = this.t;
         if (this.j.a()) {
            this.t = (float)((double)this.t + 0.01D);
         } else {
            this.t = (float)((double)this.t - 0.01D);
         }

         if (this.t < 0.0F) {
            this.t = 0.0F;
         }

         if (this.t > 1.0F) {
            this.t = 1.0F;
         }

         this.s = this.r;
         if (this.j.do()) {
            this.r = (float)((double)this.r + 0.01D);
         } else {
            this.r = (float)((double)this.r - 0.01D);
         }

         if (this.r < 0.0F) {
            this.r = 0.0F;
         }

         if (this.r > 1.0F) {
            this.r = 1.0F;
         }

      }
   }

   public void t(int var1, int var2, int var3) {
      byte var4 = 16;
      Random var5 = new Random();

      for(int var6 = 0; var6 < 1000; ++var6) {
         int var7 = var1 + this.o.nextInt(var4) - this.o.nextInt(var4);
         int var8 = var2 + this.o.nextInt(var4) - this.o.nextInt(var4);
         int var9 = var3 + this.o.nextInt(var4) - this.o.nextInt(var4);
         int var10 = this.new(var7, var8, var9);
         if (var10 == 0 && this.o.nextInt(8) > var8 && this.n.goto()) {
            this.a("depthsuspend", (double)((float)var7 + this.o.nextFloat()), (double)((float)var8 + this.o.nextFloat()), (double)((float)var9 + this.o.nextFloat()), 0.0D, 0.0D, 0.0D);
         } else if (var10 > 0) {
            pa.x[var10].a(this, var7, var8, var9, (Random)var5);
         }
      }

   }

   public void M() {
      this.C.removeAll(this.B);

      int var1;
      aiw var2;
      int var3;
      int var4;
      for(var1 = 0; var1 < this.B.size(); ++var1) {
         var2 = (aiw)this.B.get(var1);
         var3 = var2.be;
         var4 = var2.bc;
         if (var2.bf && this.for(var3, var4)) {
            this.byte(var3, var4).a(var2);
         }
      }

      for(var1 = 0; var1 < this.B.size(); ++var1) {
         this.if((aiw)this.B.get(var1));
      }

      this.B.clear();

      for(var1 = 0; var1 < this.C.size(); ++var1) {
         var2 = (aiw)this.C.get(var1);
         if (var2.ar != null) {
            if (!var2.ar.aR && var2.ar.as == var2) {
               continue;
            }

            var2.ar.as = null;
            var2.ar = null;
         }

         if (var2.aR) {
            var3 = var2.be;
            var4 = var2.bc;
            if (var2.bf && this.for(var3, var4)) {
               this.byte(var3, var4).a(var2);
            }

            this.C.remove(var1--);
            this.if(var2);
         }
      }

   }

   public apu a(aqh var1) {
      apu var2 = super.a(var1);
      var2.a((String)"Forced entities", (Callable)(new ew(this)));
      var2.a((String)"Retry entities", (Callable)(new ev(this)));
      return var2;
   }

   public void a(double var1, double var3, double var5, String var7, float var8, float var9, boolean var10) {
      float var11 = 16.0F;
      if (var8 > 1.0F) {
         var11 *= var8;
      }

      double var12 = this.aa.vj.if(var1, var3, var5);
      if (var12 < (double)(var11 * var11)) {
         if (var10 && var12 > 100.0D) {
            double var14 = Math.sqrt(var12) / 40.0D;
            this.aa.uX.a(var7, (float)var1, (float)var3, (float)var5, var8, var9, (int)Math.round(var14 * 20.0D));
         } else {
            this.aa.uX.a(var7, (float)var1, (float)var3, (float)var5, var8, var9);
         }
      }

   }

   public void a(double var1, double var3, double var5, double var7, double var9, double var11, aqv var13) {
      this.aa.vh.a((d7)(new ef(this, var1, var3, var5, var7, var9, var11, this.aa.vh, var13)));
   }

   public void a(nl var1) {
      this.d = var1;
   }

   // $FF: synthetic method
   static Set a(ex var0) {
      return var0.ae;
   }

   // $FF: synthetic method
   static Set if(ex var0) {
      return var0.ac;
   }
}
