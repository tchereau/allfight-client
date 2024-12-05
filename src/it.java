import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class it extends i5 {
   private static final int lj;
   private static final int li;
   private static final int lh;
   private static final int lg;
   protected int lf = 256;
   protected int ld = 202;
   protected int lb = 0;
   protected int la = 0;
   protected double k9;
   protected double k8;
   protected double k7;
   protected double k6;
   protected double k5;
   protected double lk;
   private int le = 0;
   private v lc;

   public it(v var1) {
      this.lc = var1;
      short var2 = 141;
      short var3 = 141;
      this.k9 = this.k7 = this.k5 = (double)(akk.n.b * 24 - var2 / 2 - 12);
      this.k8 = this.k6 = this.lk = (double)(akk.n.long * 24 - var3 / 2);
   }

   public void dA() {
      this.hT.clear();
      this.hT.add(new iy(1, this.hV / 2 + 24, this.hU / 2 + 74, 80, 20, aqz.if("gui.done")));
   }

   protected void a(j6 var1) {
      if (var1.hv == 1) {
         this.hW.a((i5)null);
         this.hW.ik();
      }

      super.a(var1);
   }

   protected void if(char var1, int var2) {
      if (var2 == this.hW.u1.aF.int) {
         this.hW.a((i5)null);
         this.hW.ik();
      } else {
         super.if(var1, var2);
      }

   }

   public void if(int var1, int var2, float var3) {
      if (Mouse.isButtonDown(0)) {
         int var4 = (this.hV - this.lf) / 2;
         int var5 = (this.hU - this.ld) / 2;
         int var6 = var4 + 8;
         int var7 = var5 + 17;
         if ((this.le == 0 || this.le == 1) && var1 >= var6 && var1 < var6 + 224 && var2 >= var7 && var2 < var7 + 155) {
            if (this.le == 0) {
               this.le = 1;
            } else {
               this.k7 -= (double)(var1 - this.lb);
               this.k6 -= (double)(var2 - this.la);
               this.k5 = this.k9 = this.k7;
               this.lk = this.k8 = this.k6;
            }

            this.lb = var1;
            this.la = var2;
         }

         if (this.k5 < (double)lj) {
            this.k5 = (double)lj;
         }

         if (this.lk < (double)li) {
            this.lk = (double)li;
         }

         if (this.k5 >= (double)lh) {
            this.k5 = (double)(lh - 1);
         }

         if (this.lk >= (double)lg) {
            this.lk = (double)(lg - 1);
         }
      } else {
         this.le = 0;
      }

      this.dx();
      this.new(var1, var2, var3);
      GL11.glDisable(2896);
      GL11.glDisable(2929);
      this.d2();
      GL11.glEnable(2896);
      GL11.glEnable(2929);
   }

   public void dG() {
      this.k9 = this.k7;
      this.k8 = this.k6;
      double var1 = this.k5 - this.k7;
      double var3 = this.lk - this.k6;
      if (var1 * var1 + var3 * var3 < 4.0D) {
         this.k7 += var1;
         this.k6 += var3;
      } else {
         this.k7 += var1 * 0.85D;
         this.k6 += var3 * 0.85D;
      }

   }

   protected void d2() {
      int var1 = (this.hV - this.lf) / 2;
      int var2 = (this.hU - this.ld) / 2;
      this.hR.if("Achievements", var1 + 15, var2 + 5, 4210752);
   }

   protected void new(int var1, int var2, float var3) {
      int var4 = ajs.a(this.k9 + (this.k7 - this.k9) * (double)var3);
      int var5 = ajs.a(this.k8 + (this.k6 - this.k8) * (double)var3);
      if (var4 < lj) {
         var4 = lj;
      }

      if (var5 < li) {
         var5 = li;
      }

      if (var4 >= lh) {
         var4 = lh - 1;
      }

      if (var5 >= lg) {
         var5 = lg - 1;
      }

      int var6 = (this.hV - this.lf) / 2;
      int var7 = (this.hU - this.ld) / 2;
      int var8 = var6 + 16;
      int var9 = var7 + 17;
      this.gH = 0.0F;
      GL11.glDepthFunc(518);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 0.0F, -200.0F);
      GL11.glEnable(3553);
      GL11.glDisable(2896);
      GL11.glEnable(32826);
      GL11.glEnable(2903);
      this.hW.vb.for("/terrain.png");
      int var10 = var4 + 288 >> 4;
      int var11 = var5 + 288 >> 4;
      int var12 = (var4 + 288) % 16;
      int var13 = (var5 + 288) % 16;
      Random var19 = new Random();

      int var20;
      int var22;
      int var23;
      for(var20 = 0; var20 * 16 - var13 < 155; ++var20) {
         float var21 = 0.6F - (float)(var11 + var20) / 25.0F * 0.3F;
         GL11.glColor4f(var21, var21, var21, 1.0F);

         for(var22 = 0; var22 * 16 - var12 < 224; ++var22) {
            var19.setSeed((long)(1234 + var10 + var22));
            var19.nextInt();
            var23 = var19.nextInt(1 + var11 + var20) + (var11 + var20) / 2;
            ajd var24 = pa.a1.if(0, 0);
            if (var23 <= 37 && var11 + var20 != 35) {
               if (var23 == 22) {
                  if (var19.nextInt(2) == 0) {
                     var24 = pa.cw.if(0, 0);
                  } else {
                     var24 = pa.cf.if(0, 0);
                  }
               } else if (var23 == 10) {
                  var24 = pa.aS.if(0, 0);
               } else if (var23 == 8) {
                  var24 = pa.aP.if(0, 0);
               } else if (var23 > 4) {
                  var24 = pa.k.if(0, 0);
               } else if (var23 > 0) {
                  var24 = pa.g.if(0, 0);
               }
            } else {
               var24 = pa.bc.if(0, 0);
            }

            this.a(var8 + var22 * 16 - var12, var9 + var20 * 16 - var13, var24, 16, 16);
         }
      }

      GL11.glEnable(2929);
      GL11.glDepthFunc(515);
      GL11.glDisable(3553);

      int var25;
      int var28;
      int var37;
      for(var20 = 0; var20 < akk.o.size(); ++var20) {
         akl var31 = (akl)akk.o.get(var20);
         if (var31.e != null) {
            var22 = var31.b * 24 - var4 + 11 + var8;
            var23 = var31.long * 24 - var5 + 11 + var9;
            var37 = var31.e.b * 24 - var4 + 11 + var8;
            var25 = var31.e.long * 24 - var5 + 11 + var9;
            boolean var26 = this.lc.if(var31);
            boolean var27 = this.lc.a(var31);
            var28 = Math.sin((double)(Minecraft.h1() % 600L) / 600.0D * 3.141592653589793D * 2.0D) > 0.6D ? 255 : 130;
            int var29 = -16777216;
            if (var26) {
               var29 = -9408400;
            } else if (var27) {
               var29 = '\uff00' + (var28 << 24);
            }

            this.for(var22, var37, var23, var29);
            this.do(var37, var23, var25, var29);
         }
      }

      akl var30 = null;
      cb var32 = new cb();
      k1.a();
      GL11.glDisable(2896);
      GL11.glEnable(32826);
      GL11.glEnable(2903);

      int var38;
      int var39;
      for(var22 = 0; var22 < akk.o.size(); ++var22) {
         akl var33 = (akl)akk.o.get(var22);
         var37 = var33.b * 24 - var4;
         var25 = var33.long * 24 - var5;
         if (var37 >= -24 && var25 >= -24 && var37 <= 224 && var25 <= 155) {
            float var36;
            if (this.lc.if(var33)) {
               var36 = 1.0F;
               GL11.glColor4f(var36, var36, var36, 1.0F);
            } else if (this.lc.a(var33)) {
               var36 = Math.sin((double)(Minecraft.h1() % 600L) / 600.0D * 3.141592653589793D * 2.0D) < 0.6D ? 0.6F : 0.8F;
               GL11.glColor4f(var36, var36, var36, 1.0F);
            } else {
               var36 = 0.3F;
               GL11.glColor4f(var36, var36, var36, 1.0F);
            }

            this.hW.vb.for("/achievement/bg.png");
            var38 = var8 + var37;
            var39 = var9 + var25;
            if (var33.goto()) {
               this.if(var38 - 2, var39 - 2, 26, 202, 26, 26);
            } else {
               this.if(var38 - 2, var39 - 2, 0, 202, 26, 26);
            }

            if (!this.lc.a(var33)) {
               float var40 = 0.1F;
               GL11.glColor4f(var40, var40, var40, 1.0F);
               var32.goto = false;
            }

            GL11.glEnable(2896);
            GL11.glEnable(2884);
            var32.a(this.hW.va, this.hW.vb, var33.d, var38 + 3, var39 + 3);
            GL11.glDisable(2896);
            if (!this.lc.a(var33)) {
               var32.goto = true;
            }

            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            if (var1 >= var8 && var2 >= var9 && var1 < var8 + 224 && var2 < var9 + 155 && var1 >= var38 && var1 <= var38 + 22 && var2 >= var39 && var2 <= var39 + 22) {
               var30 = var33;
            }
         }
      }

      GL11.glDisable(2929);
      GL11.glEnable(3042);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/achievement/bg.png");
      this.if(var6, var7, 0, 0, this.lf, this.ld);
      GL11.glPopMatrix();
      this.gH = 0.0F;
      GL11.glDepthFunc(515);
      GL11.glDisable(2929);
      GL11.glEnable(3553);
      super.if(var1, var2, var3);
      if (var30 != null) {
         String var34 = aqz.if(var30.a());
         String var35 = var30.char();
         var37 = var1 + 12;
         var25 = var2 - 4;
         if (this.lc.a(var30)) {
            var38 = Math.max(this.hR.for(var34), 120);
            var39 = this.hR.for(var35, var38);
            if (this.lc.if(var30)) {
               var39 += 12;
            }

            this.a(var37 - 3, var25 - 3, var37 + var38 + 3, var25 + var39 + 3 + 12, -1073741824, -1073741824);
            this.hR.a(var35, var37, var25 + 12, var38, -6250336);
            if (this.lc.if(var30)) {
               this.hR.a(aqz.if("achievement.taken"), var37, var25 + var39 + 4, -7302913);
            }
         } else {
            var38 = Math.max(this.hR.for(var34), 120);
            String var41 = aqz.a("achievement.requires", aqz.if(var30.e.a()));
            var28 = this.hR.for(var41, var38);
            this.a(var37 - 3, var25 - 3, var37 + var38 + 3, var25 + var28 + 12 + 3, -1073741824, -1073741824);
            this.hR.a(var41, var37, var25 + 12, var38, -9416624);
         }

         this.hR.a(var34, var37, var25, this.lc.a(var30) ? (var30.goto() ? -128 : -1) : (var30.goto() ? -8355776 : -8355712));
      }

      GL11.glEnable(2929);
      GL11.glEnable(2896);
      k1.do();
   }

   public boolean dy() {
      return true;
   }

   static {
      lj = akk.s * 24 - 112;
      li = akk.r * 24 - 112;
      lh = akk.q * 24 - 77;
      lg = akk.p * 24 - 77;
   }
}
