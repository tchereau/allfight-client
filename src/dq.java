import net.minecraft.client.Minecraft;

public class dq extends aek {
   public ds gt;
   protected Minecraft gr;
   protected int gp = 0;
   public int gn = 0;
   public float gm;
   public float gl;
   public float gk;
   public float gj;
   private ajn gs = new ajn();
   private ajn gq = new ajn();
   private ajn go = new ajn();
   public float gi;
   public float gu;

   public dq(Minecraft var1, y6 var2, j7 var3, int var4) {
      super(var2);
      this.gr = var1;
      this.a6 = var4;
      if (var3 != null && var3.if != null && var3.if.length() > 0) {
         this.af = "http://allfightpvp.net/Download/ModifPlayer/Skins/skin.php?Pseudo=" + ajm.a(var3.if);
      }

      this.fJ = var3.if;
   }

   public void do(double var1, double var3, double var5) {
      super.do(var1, var3, var5);
   }

   public void cl() {
      super.cl();
      this.e7 = this.gt.if;
      this.e6 = this.gt.a;
      this.e4 = this.gt.for;
      this.gk = this.gm;
      this.gj = this.gl;
      this.gl = (float)((double)this.gl + (double)(this.a4 - this.gl) * 0.5D);
      this.gm = (float)((double)this.gm + (double)(this.a5 - this.gm) * 0.5D);
   }

   protected boolean bw() {
      return true;
   }

   public void bU() {
      if (this.gn > 0) {
         --this.gn;
         if (this.gn == 0) {
            this.for(false);
         }
      }

      if (this.gp > 0) {
         --this.gp;
      }

      if (this.gr.vp.new()) {
         this.al = this.aj = 0.5D;
         this.al = 0.0D;
         this.aj = 0.0D;
         this.a5 = (float)this.bl / 12.0F;
         this.a4 = 10.0F;
         this.ak = 68.5D;
      } else {
         if (!this.gr.uP.if(akk.n)) {
            this.gr.u5.a(akk.n);
         }

         this.gu = this.gi;
         if (this.a8) {
            if (this.gr.u8 != null) {
               this.gr.a((i5)null);
            }

            if (this.gi == 0.0F) {
               this.gr.uX.a("portal.trigger", 1.0F, this.bm.nextFloat() * 0.4F + 0.8F);
            }

            this.gi += 0.0125F;
            if (this.gi >= 1.0F) {
               this.gi = 1.0F;
            }

            this.a8 = false;
         } else if (this.if(ai0.q) && this.a((ai0)ai0.q).do() > 60) {
            this.gi += 0.006666667F;
            if (this.gi > 1.0F) {
               this.gi = 1.0F;
            }
         } else {
            if (this.gi > 0.0F) {
               this.gi -= 0.05F;
            }

            if (this.gi < 0.0F) {
               this.gi = 0.0F;
            }
         }

         if (this.a9 > 0) {
            --this.a9;
         }

         boolean var1 = this.gt.for;
         float var2 = 0.8F;
         boolean var3 = this.gt.a >= var2;
         this.gt.a();
         if (this.cx()) {
            ds var10000 = this.gt;
            var10000.if *= 0.2F;
            var10000 = this.gt;
            var10000.a *= 0.2F;
            this.gp = 0;
         }

         if (this.gt.do && this.aG < 0.2F) {
            this.aG = 0.2F;
         }

         this.for(this.al - (double)this.aP * 0.35D, this.aZ.a + 0.5D, this.aj + (double)this.aP * 0.35D);
         this.for(this.al - (double)this.aP * 0.35D, this.aZ.a + 0.5D, this.aj - (double)this.aP * 0.35D);
         this.for(this.al + (double)this.aP * 0.35D, this.aZ.a + 0.5D, this.aj - (double)this.aP * 0.35D);
         this.for(this.al + (double)this.aP * 0.35D, this.aZ.a + 0.5D, this.aj + (double)this.aP * 0.35D);
         boolean var4 = (float)this.cA().for() > 6.0F || this.fY.try;
         if (this.aY && !var3 && this.gt.a >= var2 && !this.S() && var4 && !this.cx() && !this.if(ai0.k)) {
            if (this.gp == 0) {
               this.gp = 7;
            } else {
               this.for(true);
               this.gp = 0;
            }
         }

         if (this.Q()) {
            this.gp = 0;
         }

         if (this.S() && (this.gt.a < var2 || this.aX || !var4)) {
            this.for(false);
         }

         if (this.fY.try && !var1 && this.gt.for) {
            if (this.fN == 0) {
               this.fN = 7;
            } else {
               this.fY.a = !this.fY.a;
               this.cF();
               this.fN = 0;
            }
         }

         if (this.fY.a) {
            if (this.gt.do) {
               this.ah -= 0.15D;
            }

            if (this.gt.for) {
               this.ah += 0.15D;
            }
         }

         super.bU();
         if (this.aY && this.fY.a) {
            this.fY.a = false;
            this.cF();
         }
      }

   }

   public float cW() {
      float var1 = 1.0F;
      if (this.fY.a) {
         var1 *= 1.1F;
      }

      var1 *= (this.fm * this.bM() / this.fU + 1.0F) / 2.0F;
      int var2;
      float var3;
      if (this.cx() && this.cI().new == abr.W.A) {
         var2 = this.cE();
         var3 = (float)var2 / 20.0F;
         if (var3 > 1.0F) {
            var3 = 1.0F;
         } else {
            var3 *= var3;
         }

         var1 *= 1.0F - var3 * 0.15F;
      }

      if (this.cx() && this.cI().new == mod_saphir.G.A) {
         var2 = this.cE();
         var3 = (float)var2 / 20.0F;
         if (var3 > 1.0F) {
            var3 = 1.0F;
         } else {
            var3 *= var3;
         }

         var1 *= 1.0F - var3 * 0.15F;
      }

      if (this.cx() && this.cI().new == mod_emeraude.void.A) {
         var2 = this.cE();
         var3 = (float)var2 / 20.0F;
         if (var3 > 1.0F) {
            var3 = 1.0F;
         } else {
            var3 *= var3;
         }

         var1 *= 1.0F - var3 * 0.15F;
      }

      if (this.cx() && this.cI().new == mod_rubis.ap.A) {
         var2 = this.cE();
         var3 = (float)var2 / 20.0F;
         if (var3 > 1.0F) {
            var3 = 1.0F;
         } else {
            var3 *= var3;
         }

         var1 *= 1.0F - var3 * 0.15F;
      }

      return var1;
   }

   public void aN() {
      this.ae = "http://allfightpvp.net/Download/ModifPlayer/Capes/" + ajm.a(this.fJ) + ".png";
   }

   public void cv() {
      super.cv();
      this.gr.a((i5)null);
   }

   public void a(n4 var1) {
      if (var1 instanceof n7) {
         this.gr.a((i5)(new hv((n7)var1)));
      } else if (var1 instanceof ol) {
         this.gr.a((i5)(new ib((ol)var1)));
      }

   }

   public void goto(abp var1) {
      abr var2 = var1.d();
      if (var2 == abr.bR) {
         this.gr.a((i5)(new ie(this, var1, false)));
      } else if (var2 == abr.bT) {
         this.gr.a((i5)(new ie(this, var1, true)));
      }

   }

   public void a(ajg var1) {
      this.gr.a((i5)(new ia(this.fR, var1)));
   }

   public void a(oc var1) {
      this.gr.a((i5)(new h0(this.fR, var1)));
   }

   public void a(aff var1) {
      this.gr.a((i5)(new h0(this.fR, var1)));
   }

   public void new(int var1, int var2, int var3) {
      this.gr.a((i5)(new h9(this.fR, this.ap, var1, var2, var3)));
   }

   public void a(int var1, int var2, int var3, String var4) {
      this.gr.a((i5)(new h2(this.fR, this.ap, var1, var2, var3, var4)));
   }

   public void for(int var1, int var2, int var3) {
      this.gr.a((i5)(new hw(this.fR, this.ap, var1, var2, var3)));
   }

   public void a(oe var1) {
      this.gr.a((i5)(new h1(this.fR, var1)));
   }

   public void a(on var1) {
      this.gr.a((i5)(new ic(this.fR, var1)));
   }

   public void a(oo var1) {
      this.gr.a((i5)(new ik(this.fR, var1)));
   }

   public void a(oi var1) {
      this.gr.a((i5)(new hu(this.fR, var1)));
   }

   public void a(zn var1, String var2) {
      this.gr.a((i5)(new hy(this.fR, var1, this.ap, var2)));
   }

   public void e(aiw var1) {
      this.gr.vh.a((d7)(new em(this.gr.vm, var1)));
   }

   public void d(aiw var1) {
      em var2 = new em(this.gr.vm, var1, "magicCrit");
      this.gr.vh.a((d7)var2);
   }

   public void if(aiw var1, int var2) {
      this.gr.vh.a((d7)(new dv(this.gr.vm, var1, this, -0.5F)));
   }

   public boolean Q() {
      return this.gt.do && !this.f2;
   }

   public void H(int var1) {
      int var2 = this.cd() - var1;
      if (var2 <= 0) {
         this.t(var1);
         if (var2 < 0) {
            this.bi = this.eN / 2;
         }
      } else {
         this.e9 = var2;
         this.t(this.cd());
         this.bi = this.eN;
         this.for(ai4.void, var2);
         this.fe = this.fd = 10;
      }

   }

   public void new(String var1) {
      this.gr.u4.c5().if(var1);
   }

   public void a(akf var1, int var2) {
      if (var1 != null) {
         if (var1.do()) {
            akl var3 = (akl)var1;
            if (var3.e == null || this.gr.uP.if(var3.e)) {
               if (!this.gr.uP.if(var3)) {
                  this.gr.u5.if(var3);
               }

               this.gr.uP.a(var1, var2);
            }
         } else {
            this.gr.uP.a(var1, var2);
         }
      }

   }

   private boolean byte(int var1, int var2, int var3) {
      return this.ap.try(var1, var2, var3);
   }

   protected boolean for(double var1, double var3, double var5) {
      int var7 = ajs.a(var1);
      int var8 = ajs.a(var3);
      int var9 = ajs.a(var5);
      double var10 = var1 - (double)var7;
      double var12 = var5 - (double)var9;
      if (this.byte(var7, var8, var9) || this.byte(var7, var8 + 1, var9)) {
         boolean var14 = !this.byte(var7 - 1, var8, var9) && !this.byte(var7 - 1, var8 + 1, var9);
         boolean var15 = !this.byte(var7 + 1, var8, var9) && !this.byte(var7 + 1, var8 + 1, var9);
         boolean var16 = !this.byte(var7, var8, var9 - 1) && !this.byte(var7, var8 + 1, var9 - 1);
         boolean var17 = !this.byte(var7, var8, var9 + 1) && !this.byte(var7, var8 + 1, var9 + 1);
         byte var18 = -1;
         double var19 = 9999.0D;
         if (var14 && var10 < var19) {
            var19 = var10;
            var18 = 0;
         }

         if (var15 && 1.0D - var10 < var19) {
            var19 = 1.0D - var10;
            var18 = 1;
         }

         if (var16 && var12 < var19) {
            var19 = var12;
            var18 = 4;
         }

         if (var17 && 1.0D - var12 < var19) {
            var19 = 1.0D - var12;
            var18 = 5;
         }

         float var21 = 0.1F;
         if (var18 == 0) {
            this.ai = (double)(-var21);
         }

         if (var18 == 1) {
            this.ai = (double)var21;
         }

         if (var18 == 4) {
            this.ag = (double)(-var21);
         }

         if (var18 == 5) {
            this.ag = (double)var21;
         }
      }

      return false;
   }

   public void for(boolean var1) {
      super.for(var1);
      this.gn = var1 ? 600 : 0;
   }

   public void a(float var1, int var2, int var3) {
      this.fV = var1;
      this.fW = var2;
      this.fX = var3;
   }

   public void a(String var1) {
      this.gr.u4.c5().else(var1);
   }

   public boolean a(int var1, String var2) {
      return var1 <= 0;
   }

   public apg for() {
      return new apg(ajs.a(this.al + 0.5D), ajs.a(this.ak + 0.5D), ajs.a(this.aj + 0.5D));
   }

   public abp bW() {
      return this.fR.L();
   }

   public void a(String var1, float var2, float var3) {
      this.ap.a(this.al, this.ak - (double)this.aQ, this.aj, var1, var2, var3, false);
   }
}
