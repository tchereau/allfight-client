import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class h7 extends h4 {
   private static ajb ph = new ajb("tmp", true, 45);
   private static int pq;
   private float pp = 0.0F;
   private boolean po = false;
   private boolean pn;
   private ju pm;
   private List pl;
   private ac9 pk = null;
   private boolean pj = false;
   private h8 pi;

   public h7(aek var1) {
      super(new h6(var1));
      var1.fP = this.oP;
      this.hS = true;
      var1.a((akf)akk.n, 1);
      this.oQ = 136;
      this.oR = 195;
   }

   public void dG() {
      if (!this.hW.vp.try()) {
         this.hW.a((i5)(new hz(this.hW.vk)));
      }

   }

   protected void a(ac9 var1, int var2, int var3, int var4) {
      this.pj = true;
      boolean var5 = var4 == 1;
      var4 = var2 == -999 && var4 == 0 ? 4 : var4;
      abp var7;
      aen var11;
      if (var1 == null && pq != acn.new.goto() && var4 != 5) {
         var11 = this.hW.vk.fR;
         if (var11.M() != null) {
            if (var3 == 0) {
               this.hW.vk.else(var11.M());
               this.hW.vp.a(var11.M());
               var11.if((abp)null);
            }

            if (var3 == 1) {
               var7 = var11.M().a(1);
               this.hW.vk.else(var7);
               this.hW.vp.a(var7);
               if (var11.M().if == 0) {
                  var11.if((abp)null);
               }
            }
         }
      } else {
         int var10;
         if (var1 == this.pk && var5) {
            for(var10 = 0; var10 < this.hW.vk.fQ.a().size(); ++var10) {
               this.hW.vp.a((abp)null, var10);
            }
         } else {
            abp var6;
            if (pq == acn.new.goto()) {
               if (var1 == this.pk) {
                  this.hW.vk.fR.if((abp)null);
               } else if (var4 == 4 && var1 != null && var1.do()) {
                  var6 = var1.a(var3 == 0 ? 1 : var1.for().h());
                  this.hW.vk.else(var6);
                  this.hW.vp.a(var6);
               } else if (var4 == 4 && this.hW.vk.fR.M() != null) {
                  this.hW.vk.else(this.hW.vk.fR.M());
                  this.hW.vp.a(this.hW.vk.fR.M());
                  this.hW.vk.fR.if((abp)null);
               } else {
                  this.hW.vk.fQ.a(var1 == null ? var2 : h5.a((h5)var1).for, var3, var4, this.hW.vk);
                  this.hW.vk.fQ.do();
               }
            } else if (var4 != 5 && var1.int == ph) {
               var11 = this.hW.vk.fR;
               var7 = var11.M();
               abp var8 = var1.for();
               abp var9;
               if (var4 == 2) {
                  if (var8 != null && var3 >= 0 && var3 < 9) {
                     var9 = var8.n();
                     var9.if = var9.h();
                     this.hW.vk.fR.if(var3, var9);
                     this.hW.vk.fQ.do();
                  }

                  return;
               }

               if (var4 == 3) {
                  if (var11.M() == null && var1.do()) {
                     var9 = var1.for().n();
                     var9.if = var9.h();
                     var11.if(var9);
                  }

                  return;
               }

               if (var4 == 4) {
                  if (var8 != null) {
                     var9 = var8.n();
                     var9.if = var3 == 0 ? 1 : var9.h();
                     this.hW.vk.else(var9);
                     this.hW.vp.a(var9);
                  }

                  return;
               }

               if (var7 != null && var8 != null && var7.do(var8)) {
                  if (var3 == 0) {
                     if (var5) {
                        var7.if = var7.h();
                     } else if (var7.if < var7.h()) {
                        ++var7.if;
                     }
                  } else if (var7.if <= 1) {
                     var11.if((abp)null);
                  } else {
                     --var7.if;
                  }
               } else if (var8 != null && var7 == null) {
                  var11.if(abp.if(var8));
                  var7 = var11.M();
                  if (var5) {
                     var7.if = var7.h();
                  }
               } else {
                  var11.if((abp)null);
               }
            } else {
               this.oP.a(var1 == null ? var2 : var1.for, var3, var4, this.hW.vk);
               if (ad1.for(var3) == 2) {
                  for(var10 = 0; var10 < 9; ++var10) {
                     this.hW.vp.a(this.oP.do(45 + var10).for(), 36 + var10);
                  }
               } else if (var1 != null) {
                  var6 = this.oP.do(var1.for).for();
                  this.hW.vp.a(var6, var1.for - this.oP.try.size() + 9 + 36);
               }
            }
         }
      }

   }

   public void dA() {
      if (this.hW.vp.try()) {
         super.dA();
         this.hT.clear();
         Keyboard.enableRepeatEvents(true);
         this.pm = new ju(this.hR, this.oO + 82, this.oN + 6, 89, this.hR.i);
         this.pm.M(15);
         this.pm.j(false);
         this.pm.g(false);
         this.pm.I(16777215);
         int var1 = pq;
         pq = -1;
         this.a(acn.e[var1]);
         this.pi = new h8(this.hW);
         this.hW.vk.fQ.a((adv)this.pi);
      } else {
         this.hW.a((i5)(new hz(this.hW.vk)));
      }

   }

   public void dF() {
      super.dF();
      if (this.hW.vk != null && this.hW.vk.fR != null) {
         this.hW.vk.fQ.if((adv)this.pi);
      }

      Keyboard.enableRepeatEvents(false);
   }

   protected void if(char var1, int var2) {
      if (pq != acn.goto.goto()) {
         if (ke.a(this.hW.u1.aD)) {
            this.a(acn.goto);
         } else {
            super.if(var1, var2);
         }

      } else {
         if (this.pj) {
            this.pj = false;
            this.pm.case("");
         }

         if (!this.af(var2)) {
            if (this.pm.a(var1, var2)) {
               this.ey();
            } else {
               super.if(var1, var2);
            }

         }
      }
   }

   private void ey() {
      h6 var1 = (h6)this.oP;
      var1.S.clear();
      abr[] var2 = abr.ai;
      int var3 = var2.length;

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         abr var5 = var2[var4];
         if (var5 != null && var5.long() != null) {
            var5.a(var5.A, (acn)null, var1.S);
         }
      }

      z3[] var8 = z3.n;
      var3 = var8.length;

      for(var4 = 0; var4 < var3; ++var4) {
         z3 var11 = var8[var4];
         if (var11 != null && var11.goto != null) {
            abr.bj.a(var11, var1.S);
         }
      }

      Iterator var9 = var1.S.iterator();
      String var10 = this.pm.dc().toLowerCase();

      while(var9.hasNext()) {
         abp var12 = (abp)var9.next();
         boolean var13 = false;
         Iterator var6 = var12.a(this.hW.vk, this.hW.u1.O).iterator();

         while(var6.hasNext()) {
            String var7 = (String)var6.next();
            if (var7.toLowerCase().contains(var10)) {
               var13 = true;
               break;
            }
         }

         if (!var13) {
            var9.remove();
         }
      }

      this.pp = 0.0F;
      var1.a(0.0F);
   }

   protected void f(int var1, int var2) {
      acn var3 = acn.e[pq];
      if (var3.byte()) {
         this.hR.if(var3.case(), 8, 6, 4210752);
      }

   }

   protected void char(int var1, int var2, int var3) {
      if (var3 == 0) {
         int var4 = var1 - this.oO;
         int var5 = var2 - this.oN;
         acn[] var6 = acn.e;
         int var7 = var6.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            acn var9 = var6[var8];
            if (this.a(var9, var4, var5)) {
               return;
            }
         }
      }

      super.char(var1, var2, var3);
   }

   protected void else(int var1, int var2, int var3) {
      if (var3 == 0) {
         int var4 = var1 - this.oO;
         int var5 = var2 - this.oN;
         acn[] var6 = acn.e;
         int var7 = var6.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            acn var9 = var6[var8];
            if (this.a(var9, var4, var5)) {
               this.a(var9);
               return;
            }
         }
      }

      super.else(var1, var2, var3);
   }

   private boolean ez() {
      return pq != acn.new.goto() && acn.e[pq].if() && ((h6)this.oP).byte();
   }

   private void a(acn var1) {
      int var2 = pq;
      pq = var1.goto();
      h6 var3 = (h6)this.oP;
      this.oL.clear();
      var3.S.clear();
      var1.a(var3.S);
      if (var1 == acn.new) {
         ad1 var4 = this.hW.vk.fQ;
         if (this.pl == null) {
            this.pl = var3.try;
         }

         var3.try = new ArrayList();

         for(int var5 = 0; var5 < var4.try.size(); ++var5) {
            h5 var6 = new h5(this, (ac9)var4.try.get(var5), var5);
            var3.try.add(var6);
            int var7;
            int var8;
            int var9;
            if (var5 >= 5 && var5 < 9) {
               var7 = var5 - 5;
               var8 = var7 / 2;
               var9 = var7 % 2;
               var6.do = 9 + var8 * 54;
               var6.if = 6 + var9 * 27;
            } else if (var5 >= 0 && var5 < 5) {
               var6.if = -2000;
               var6.do = -2000;
            } else if (var5 < var4.try.size()) {
               var7 = var5 - 9;
               var8 = var7 % 9;
               var9 = var7 / 9;
               var6.do = 9 + var8 * 18;
               if (var5 >= 36) {
                  var6.if = 112;
               } else {
                  var6.if = 54 + var9 * 18;
               }
            }
         }

         this.pk = new ac9(ph, 0, 173, 112);
         var3.try.add(this.pk);
      } else if (var2 == acn.new.goto()) {
         var3.try = this.pl;
         this.pl = null;
      }

      if (this.pm != null) {
         if (var1 == acn.goto) {
            this.pm.g(true);
            this.pm.i(false);
            this.pm.h(true);
            this.pm.case("");
            this.ey();
         } else {
            this.pm.g(false);
            this.pm.i(true);
            this.pm.h(false);
         }
      }

      this.pp = 0.0F;
      var3.a(0.0F);
   }

   public void dw() {
      super.dw();
      int var1 = Mouse.getEventDWheel();
      if (var1 != 0 && this.ez()) {
         int var2 = ((h6)this.oP).S.size() / 9 - 5 + 1;
         if (var1 > 0) {
            var1 = 1;
         }

         if (var1 < 0) {
            var1 = -1;
         }

         this.pp = (float)((double)this.pp - (double)var1 / (double)var2);
         if (this.pp < 0.0F) {
            this.pp = 0.0F;
         }

         if (this.pp > 1.0F) {
            this.pp = 1.0F;
         }

         ((h6)this.oP).a(this.pp);
      }

   }

   public void if(int var1, int var2, float var3) {
      boolean var4 = Mouse.isButtonDown(0);
      int var5 = this.oO;
      int var6 = this.oN;
      int var7 = var5 + 175;
      int var8 = var6 + 18;
      int var9 = var7 + 14;
      int var10 = var8 + 112;
      if (!this.pn && var4 && var1 >= var7 && var2 >= var8 && var1 < var9 && var2 < var10) {
         this.po = this.ez();
      }

      if (!var4) {
         this.po = false;
      }

      this.pn = var4;
      if (this.po) {
         this.pp = ((float)(var2 - var8) - 7.5F) / ((float)(var10 - var8) - 15.0F);
         if (this.pp < 0.0F) {
            this.pp = 0.0F;
         }

         if (this.pp > 1.0F) {
            this.pp = 1.0F;
         }

         ((h6)this.oP).a(this.pp);
      }

      super.if(var1, var2, var3);
      acn[] var11 = acn.e;
      int var12 = var11.length;

      for(int var13 = 0; var13 < var12; ++var13) {
         acn var14 = var11[var13];
         if (this.if(var14, var1, var2)) {
            break;
         }
      }

      if (this.pk != null && pq == acn.new.goto() && this.do(this.pk.do, this.pk.if, 16, 16, var1, var2)) {
         this.do(aqy.if().a("inventory.binSlot"), var1, var2);
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(2896);
   }

   protected void for(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      k1.a();
      acn var4 = acn.e[pq];
      acn[] var5 = acn.e;
      int var6 = var5.length;

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         acn var8 = var5[var7];
         this.hW.vb.for("/gui/allitems.png");
         if (var8.goto() != pq) {
            this.if(var8);
         }
      }

      this.hW.vb.for("/gui/creative_inv/" + var4.for());
      this.if(this.oO, this.oN, 0, 0, this.oR, this.oQ);
      this.pm.db();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      int var9 = this.oO + 175;
      var6 = this.oN + 18;
      var7 = var6 + 112;
      this.hW.vb.for("/gui/allitems.png");
      if (var4.if()) {
         this.if(var9, var6 + (int)((float)(var7 - var6 - 17) * this.pp), 232 + (this.ez() ? 0 : 12), 0, 12, 15);
      }

      this.if(var4);
      if (var4 == acn.new) {
         hz.if(this.hW, this.oO + 43, this.oN + 45, 20, (float)(this.oO + 43 - var2), (float)(this.oN + 45 - 30 - var3));
      }

   }

   protected boolean a(acn var1, int var2, int var3) {
      int var4 = var1.try();
      int var5 = 28 * var4;
      byte var6 = 0;
      if (var4 == 5) {
         var5 = this.oR - 28 + 2;
      } else if (var4 > 0) {
         var5 += var4;
      }

      int var7;
      if (var1.new()) {
         var7 = var6 - 32;
      } else {
         var7 = var6 + this.oQ;
      }

      return var2 >= var5 && var2 <= var5 + 28 && var3 >= var7 && var3 <= var7 + 32;
   }

   protected boolean if(acn var1, int var2, int var3) {
      int var4 = var1.try();
      int var5 = 28 * var4;
      byte var6 = 0;
      if (var4 == 5) {
         var5 = this.oR - 28 + 2;
      } else if (var4 > 0) {
         var5 += var4;
      }

      int var7;
      if (var1.new()) {
         var7 = var6 - 32;
      } else {
         var7 = var6 + this.oQ;
      }

      if (this.do(var5 + 3, var7 + 3, 23, 27, var2, var3)) {
         this.do(var1.case(), var2, var3);
         return true;
      } else {
         return false;
      }
   }

   protected void if(acn var1) {
      boolean var2 = var1.goto() == pq;
      boolean var3 = var1.new();
      int var4 = var1.try();
      int var5 = var4 * 28;
      int var6 = 0;
      int var7 = this.oO + 28 * var4;
      int var8 = this.oN;
      byte var9 = 32;
      if (var2) {
         var6 += 32;
      }

      if (var4 == 5) {
         var7 = this.oO + this.oR - 28;
      } else if (var4 > 0) {
         var7 += var4;
      }

      if (var3) {
         var8 -= 28;
      } else {
         var6 += 64;
         var8 += this.oQ - 4;
      }

      GL11.glDisable(2896);
      this.if(var7, var8, var5, var6, 28, var9);
      this.gH = 100.0F;
      oS.c = 100.0F;
      var7 += 6;
      var8 += 8 + (var3 ? 1 : -1);
      GL11.glEnable(2896);
      GL11.glEnable(32826);
      abp var10 = new abp(var1.a());
      oS.a(this.hR, this.hW.vb, var10, var7, var8);
      oS.if(this.hR, this.hW.vb, var10, var7, var8);
      GL11.glDisable(2896);
      oS.c = 0.0F;
      this.gH = 0.0F;
   }

   protected void a(j6 var1) {
      if (var1.hv == 0) {
         this.hW.a((i5)(new it(this.hW.uP)));
      }

      if (var1.hv == 1) {
         this.hW.a((i5)(new is(this, this.hW.uP)));
      }

   }

   public int ex() {
      return pq;
   }

   // $FF: synthetic method
   static ajb ew() {
      return ph;
   }

   static {
      pq = acn.d.goto();
   }
}
