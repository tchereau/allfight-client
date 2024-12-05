import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.lang.reflect.Field;
import java.nio.FloatBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;

public class dh {
   public static boolean r = false;
   public static int q;
   private Minecraft void;
   private float long = 0.0F;
   public da p;
   private int goto;
   private aiw else = null;
   private ajn char = new ajn();
   private ajn case = new ajn();
   private ajn byte = new ajn();
   private ajn try = new ajn();
   private ajn int = new ajn();
   private ajn Y = new ajn();
   private float X = 4.0F;
   private float W = 4.0F;
   private float V = 0.0F;
   private float U = 0.0F;
   private float T = 0.0F;
   private float S = 0.0F;
   private float R;
   private float Q;
   private float P;
   private float O;
   private float N;
   private float L = 0.0F;
   private float J = 0.0F;
   private float H = 0.0F;
   private float G = 0.0F;
   public int o;
   private int[] F;
   private float D;
   private float B;
   private float z;
   private float y;
   private float x;
   private boolean w = false;
   private double v = 1.0D;
   private double u = 0.0D;
   private double t = 0.0D;
   private long ah = Minecraft.h1();
   private long ag = 0L;
   private boolean ae = false;
   float n = 0.0F;
   float m = 0.0F;
   float l = 0.0F;
   float k = 0.0F;
   private Random ad = new Random();
   private int ac = 0;
   float[] j;
   float[] i;
   volatile int h = 0;
   volatile int g = 0;
   FloatBuffer f = k0.if(16);
   float e;
   float d;
   float c;
   private float ab;
   private float aa;
   public int b;
   private y6 do = null;
   private boolean al = false;
   private boolean a = false;
   private boolean ak = false;
   private String C = null;
   private long M = 0L;
   private int K = 0;
   private int A = 0;
   private int E = 0;
   private float new = 0.0F;
   private float ai = 0.0F;
   public long[] s = new long[512];
   public long[] am = new long[512];
   public long[] for = new long[512];
   public long[] I = new long[512];
   public int Z = 0;
   public long af = -1L;
   private boolean aj = false;
   private boolean if = false;

   public dh(Minecraft var1) {
      this.void = var1;
      this.p = new da(var1);
      this.o = var1.vb.if(new BufferedImage(16, 16, 1));
      this.F = new int[256];
   }

   public void new() {
      this.do();
      this.for();
      this.ab = this.aa;
      this.W = this.X;
      this.U = this.V;
      this.S = this.T;
      this.J = this.L;
      this.G = this.H;
      float var1;
      float var2;
      if (this.void.u1.bh) {
         var1 = this.void.u1.ao * 0.6F + 0.2F;
         var2 = var1 * var1 * var1 * 8.0F;
         this.P = this.char.a(this.R, 0.05F * var2);
         this.O = this.case.a(this.Q, 0.05F * var2);
         this.N = 0.0F;
         this.R = 0.0F;
         this.Q = 0.0F;
      }

      if (this.void.vj == null) {
         this.void.vj = this.void.vk;
      }

      var1 = this.void.vm.int(ajs.a(this.void.vj.al), ajs.a(this.void.vj.ak), ajs.a(this.void.vj.aj));
      var2 = (float)(3 - this.void.u1.al) / 3.0F;
      float var3 = var1 * (1.0F - var2) + var2;
      this.aa += (var3 - this.aa) * 0.1F;
      ++this.goto;
      this.p.if();
      this.int();
      this.x = this.y;
      if (dn.do) {
         this.y += 0.05F;
         if (this.y > 1.0F) {
            this.y = 1.0F;
         }

         dn.do = false;
      } else if (this.y > 0.0F) {
         this.y -= 0.0125F;
      }

   }

   public void new(float var1) {
      if (this.void.vj != null && this.void.vm != null) {
         this.void.vi = null;
         double var2 = (double)this.void.vp.for();
         this.void.u2 = this.void.vj.a(var2, var1);
         double var4 = var2;
         nr var6 = this.void.vj.long(var1);
         if (this.void.vp.case()) {
            var2 = 6.0D;
            var4 = 6.0D;
         } else {
            if (var2 > 3.0D) {
               var4 = 3.0D;
            }

            var2 = var4;
         }

         if (this.void.u2 != null) {
            var4 = this.void.u2.for.a(var6);
         }

         nr var7 = this.void.vj.b(var1);
         nr var8 = var6.a(var7.int * var2, var7.for * var2, var7.do * var2);
         this.else = null;
         float var9 = 1.0F;
         List var10 = this.void.vm.a(this.void.vj, this.void.vj.aZ.a(var7.int * var2, var7.for * var2, var7.do * var2).do((double)var9, (double)var9, (double)var9));
         double var11 = var4;

         for(int var13 = 0; var13 < var10.size(); ++var13) {
            aiw var14 = (aiw)var10.get(var13);
            if (var14.aw()) {
               float var15 = var14.P();
               nw var16 = var14.aZ.do((double)var15, (double)var15, (double)var15);
               nt var17 = var16.a(var6, var8);
               if (var16.for(var6)) {
                  if (0.0D < var11 || var11 == 0.0D) {
                     this.else = var14;
                     var11 = 0.0D;
                  }
               } else if (var17 != null) {
                  double var18 = var6.a(var17.for);
                  if (var18 < var11 || var11 == 0.0D) {
                     this.else = var14;
                     var11 = var18;
                  }
               }
            }
         }

         if (this.else != null && (var11 < var4 || this.void.u2 == null)) {
            this.void.u2 = new nt(this.else);
            if (this.else instanceof aig) {
               this.void.vi = (aig)this.else;
            }
         }
      }

   }

   private void do() {
      if (this.void.vj instanceof dq) {
         dq var1 = (dq)this.void.vj;
         this.z = var1.cW();
      } else {
         this.z = this.void.vk.cW();
      }

      this.B = this.D;
      this.D += (this.z - this.D) * 0.5F;
      if (this.D > 1.5F) {
         this.D = 1.5F;
      }

      if (this.D < 0.1F) {
         this.D = 0.1F;
      }

   }

   private float a(float var1, boolean var2) {
      if (this.b > 0) {
         return 90.0F;
      } else {
         aig var3 = this.void.vj;
         float var4 = 70.0F;
         if (var2) {
            var4 += this.void.u1.bc * 40.0F;
            var4 *= this.B + (this.D - this.B) * var1;
         }

         boolean var5 = false;
         if (this.void.u8 == null) {
            if (this.void.u1.a6.int < 0) {
               var5 = Mouse.isButtonDown(this.void.u1.a6.int + 100);
            } else {
               var5 = Keyboard.isKeyDown(this.void.u1.a6.int);
            }
         }

         if (var5) {
            if (!qs.k) {
               qs.k = true;
               this.void.u1.bh = true;
            }

            if (qs.k) {
               var4 /= 4.0F;
            }
         } else if (qs.k) {
            qs.k = false;
            this.void.u1.bh = false;
            this.char = new ajn();
            this.case = new ajn();
         }

         if (var3.cd() <= 0) {
            float var6 = (float)var3.fb + var1;
            var4 /= (1.0F - 500.0F / (var6 + 500.0F)) * 2.0F + 1.0F;
         }

         int var7 = k7.a(this.void.vm, var3, var1);
         if (var7 != 0 && pa.x[var7].at == ts.s) {
            var4 = var4 * 60.0F / 70.0F;
         }

         return var4 + this.J + (this.L - this.J) * var1;
      }
   }

   private void a(float var1) {
      aig var2 = this.void.vj;
      float var3 = (float)var2.fe - var1;
      float var4;
      if (var2.cd() <= 0) {
         var4 = (float)var2.fb + var1;
         GL11.glRotatef(40.0F - 8000.0F / (var4 + 200.0F), 0.0F, 0.0F, 1.0F);
      }

      if (var3 >= 0.0F) {
         var3 /= (float)var2.fd;
         var3 = ajs.try(var3 * var3 * var3 * var3 * 3.1415927F);
         var4 = var2.fc;
         GL11.glRotatef(-var4, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var3 * 14.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(var4, 0.0F, 1.0F, 0.0F);
      }

   }

   private void try(float var1) {
      if (this.void.vj instanceof aek) {
         aek var2 = (aek)this.void.vj;
         float var3 = var2.aM - var2.aN;
         float var4 = -(var2.aM + var3 * var1);
         float var5 = var2.fL + (var2.fK - var2.fL) * var1;
         float var6 = var2.eE + (var2.eD - var2.eE) * var1;
         GL11.glTranslatef(ajs.try(var4 * 3.1415927F) * var5 * 0.5F, -Math.abs(ajs.for(var4 * 3.1415927F) * var5), 0.0F);
         GL11.glRotatef(ajs.try(var4 * 3.1415927F) * var5 * 3.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(Math.abs(ajs.for(var4 * 3.1415927F - 0.2F) * var5) * 5.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var6, 1.0F, 0.0F, 0.0F);
      }

   }

   private void do(float var1) {
      aig var2 = this.void.vj;
      float var3 = var2.aQ - 1.62F;
      double var4 = var2.ao + (var2.al - var2.ao) * (double)var1;
      double var6 = var2.an + (var2.ak - var2.an) * (double)var1 - (double)var3;
      double var8 = var2.am + (var2.aj - var2.am) * (double)var1;
      GL11.glRotatef(this.G + (this.H - this.G) * var1, 0.0F, 0.0F, 1.0F);
      if (var2.cg()) {
         var3 = (float)((double)var3 + 1.0D);
         GL11.glTranslatef(0.0F, 0.3F, 0.0F);
         if (!this.void.u1.bf) {
            int var10 = this.void.vm.new(ajs.a(var2.al), ajs.a(var2.ak), ajs.a(var2.aj));
            if (vf.v.for()) {
               vf.do(vf.v, this.void, var2);
            } else if (var10 == pa.al.void) {
               int var11 = this.void.vm.for(ajs.a(var2.al), ajs.a(var2.ak), ajs.a(var2.aj));
               int var12 = var11 & 3;
               GL11.glRotatef((float)(var12 * 90), 0.0F, 1.0F, 0.0F);
            }

            GL11.glRotatef(var2.a2 + (var2.a5 - var2.a2) * var1 + 180.0F, 0.0F, -1.0F, 0.0F);
            GL11.glRotatef(var2.a0 + (var2.a4 - var2.a0) * var1, -1.0F, 0.0F, 0.0F);
         }
      } else if (this.void.u1.bo > 0) {
         double var27 = (double)(this.W + (this.X - this.W) * var1);
         float var13;
         float var28;
         if (this.void.u1.bf) {
            var28 = this.U + (this.V - this.U) * var1;
            var13 = this.S + (this.T - this.S) * var1;
            GL11.glTranslatef(0.0F, 0.0F, (float)(-var27));
            GL11.glRotatef(var13, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var28, 0.0F, 1.0F, 0.0F);
         } else {
            var28 = var2.a5;
            var13 = var2.a4;
            if (this.void.u1.bo == 2) {
               var13 += 180.0F;
            }

            double var14 = (double)(-ajs.try(var28 / 180.0F * 3.1415927F) * ajs.for(var13 / 180.0F * 3.1415927F)) * var27;
            double var16 = (double)(ajs.for(var28 / 180.0F * 3.1415927F) * ajs.for(var13 / 180.0F * 3.1415927F)) * var27;
            double var18 = (double)(-ajs.try(var13 / 180.0F * 3.1415927F)) * var27;

            for(int var20 = 0; var20 < 8; ++var20) {
               float var21 = (float)((var20 & 1) * 2 - 1);
               float var22 = (float)((var20 >> 1 & 1) * 2 - 1);
               float var23 = (float)((var20 >> 2 & 1) * 2 - 1);
               var21 *= 0.1F;
               var22 *= 0.1F;
               var23 *= 0.1F;
               nt var24 = this.void.vm.a(this.void.vm.do().a(var4 + (double)var21, var6 + (double)var22, var8 + (double)var23), this.void.vm.do().a(var4 - var14 + (double)var21 + (double)var23, var6 - var18 + (double)var22, var8 - var16 + (double)var23));
               if (var24 != null) {
                  double var25 = var24.for.a(this.void.vm.do().a(var4, var6, var8));
                  if (var25 < var27) {
                     var27 = var25;
                  }
               }
            }

            if (this.void.u1.bo == 2) {
               GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            }

            GL11.glRotatef(var2.a4 - var13, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var2.a5 - var28, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, 0.0F, (float)(-var27));
            GL11.glRotatef(var28 - var2.a5, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var13 - var2.a4, 1.0F, 0.0F, 0.0F);
         }
      } else {
         GL11.glTranslatef(0.0F, 0.0F, -0.1F);
      }

      if (!this.void.u1.bf) {
         GL11.glRotatef(var2.a0 + (var2.a4 - var2.a0) * var1, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var2.a2 + (var2.a5 - var2.a2) * var1 + 180.0F, 0.0F, 1.0F, 0.0F);
      }

      GL11.glTranslatef(0.0F, var3, 0.0F);
      var4 = var2.ao + (var2.al - var2.ao) * (double)var1;
      var6 = var2.an + (var2.ak - var2.an) * (double)var1 - (double)var3;
      var8 = var2.am + (var2.aj - var2.am) * (double)var1;
      this.w = this.void.vl.a(var4, var6, var8, var1);
   }

   private void a(float var1, int var2) {
      this.long = (float)(32 << 3 - this.void.u1.al);
      this.long = (float)this.void.u1.B;
      if (qs.l()) {
         this.long *= 0.95F;
      }

      if (qs.n()) {
         this.long *= 0.83F;
      }

      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      float var3 = 0.07F;
      if (this.void.u1.aj) {
         GL11.glTranslatef((float)(-(var2 * 2 - 1)) * var3, 0.0F, 0.0F);
      }

      float var4 = this.long * 2.0F;
      if (var4 < 128.0F) {
         var4 = 128.0F;
      }

      if (this.v != 1.0D) {
         GL11.glTranslatef((float)this.u, (float)(-this.t), 0.0F);
         GL11.glScaled(this.v, this.v, 1.0D);
      }

      GLU.gluPerspective(this.a(var1, true), (float)this.void.vo / (float)this.void.vn, 0.05F, var4);
      float var5;
      if (this.void.vp.new()) {
         var5 = 0.6666667F;
         GL11.glScalef(1.0F, var5, 1.0F);
      }

      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      if (this.void.u1.aj) {
         GL11.glTranslatef((float)(var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
      }

      this.a(var1);
      if (this.void.u1.ak) {
         this.try(var1);
      }

      var5 = this.void.vk.gu + (this.void.vk.gi - this.void.vk.gu) * var1;
      if (var5 > 0.0F) {
         byte var6 = 20;
         if (this.void.vk.if(ai0.q)) {
            var6 = 7;
         }

         float var7 = 5.0F / (var5 * var5 + 5.0F) - var5 * 0.04F;
         var7 *= var7;
         GL11.glRotatef(((float)this.goto + var1) * (float)var6, 0.0F, 1.0F, 1.0F);
         GL11.glScalef(1.0F / var7, 1.0F, 1.0F);
         GL11.glRotatef(-((float)this.goto + var1) * (float)var6, 0.0F, 1.0F, 1.0F);
      }

      this.do(var1);
      if (this.b > 0) {
         int var8 = this.b - 1;
         if (var8 == 1) {
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         }

         if (var8 == 2) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         }

         if (var8 == 3) {
            GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         }

         if (var8 == 4) {
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         }

         if (var8 == 5) {
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
         }
      }

   }

   private void if(float var1, int var2) {
      if (this.b <= 0) {
         GL11.glMatrixMode(5889);
         GL11.glLoadIdentity();
         float var3 = 0.07F;
         if (this.void.u1.aj) {
            GL11.glTranslatef((float)(-(var2 * 2 - 1)) * var3, 0.0F, 0.0F);
         }

         if (this.v != 1.0D) {
            GL11.glTranslatef((float)this.u, (float)(-this.t), 0.0F);
            GL11.glScaled(this.v, this.v, 1.0D);
         }

         GLU.gluPerspective(this.a(var1, false), (float)this.void.vo / (float)this.void.vn, 0.05F, this.long * 2.0F);
         if (this.void.vp.new()) {
            float var4 = 0.6666667F;
            GL11.glScalef(1.0F, var4, 1.0F);
         }

         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
         if (this.void.u1.aj) {
            GL11.glTranslatef((float)(var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
         }

         GL11.glPushMatrix();
         this.a(var1);
         if (this.void.u1.ak) {
            this.try(var1);
         }

         if (this.void.u1.bo == 0 && !this.void.vj.cg() && !this.void.u1.as && !this.void.vp.new()) {
            this.a((double)var1);
            this.p.for(var1);
            this.if((double)var1);
         }

         GL11.glPopMatrix();
         if (this.void.u1.bo == 0 && !this.void.vj.cg()) {
            this.p.do(var1);
            this.a(var1);
         }

         if (this.void.u1.ak) {
            this.try(var1);
         }
      }

   }

   public void if(double var1) {
      q.a(q.a);
      GL11.glDisable(3553);
      q.a(q.if);
   }

   public void a(double var1) {
      q.a(q.a);
      GL11.glMatrixMode(5890);
      GL11.glLoadIdentity();
      float var3 = 0.00390625F;
      GL11.glScalef(var3, var3, var3);
      GL11.glTranslatef(8.0F, 8.0F, 8.0F);
      GL11.glMatrixMode(5888);
      GL11.glBindTexture(3553, this.o);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10242, 10496);
      GL11.glTexParameteri(3553, 10243, 10496);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(3553);
      this.void.vb.do();
      q.a(q.if);
   }

   private void for() {
      this.m = (float)((double)this.m + (Math.random() - Math.random()) * Math.random() * Math.random());
      this.k = (float)((double)this.k + (Math.random() - Math.random()) * Math.random() * Math.random());
      this.m = (float)((double)this.m * 0.9D);
      this.k = (float)((double)this.k * 0.9D);
      this.n += (this.m - this.n) * 1.0F;
      this.l += (this.k - this.l) * 1.0F;
      this.ae = true;
   }

   private void byte(float var1) {
      ex var2 = this.void.vm;
      if (var2 != null) {
         if (ad8.a(var2, this, this.F, this.void.vk.if(ai0.j))) {
            this.void.vb.a(this.F, 16, 16, this.o);
            return;
         }

         for(int var3 = 0; var3 < 256; ++var3) {
            float var4 = var2.case(1.0F) * 0.95F + 0.05F;
            float var5 = var2.n.do[var3 / 16] * var4;
            float var6 = var2.n.do[var3 % 16] * (this.n * 0.1F + 1.5F);
            if (var2.q > 0) {
               var5 = var2.n.do[var3 / 16];
            }

            float var7 = var5 * (var2.case(1.0F) * 0.65F + 0.35F);
            float var8 = var5 * (var2.case(1.0F) * 0.65F + 0.35F);
            float var9 = var6 * ((var6 * 0.6F + 0.4F) * 0.6F + 0.4F);
            float var10 = var6 * (var6 * var6 * 0.6F + 0.4F);
            float var11 = var7 + var6;
            float var12 = var8 + var9;
            float var13 = var5 + var10;
            var11 = var11 * 0.96F + 0.03F;
            var12 = var12 * 0.96F + 0.03F;
            var13 = var13 * 0.96F + 0.03F;
            float var14;
            if (this.y > 0.0F) {
               var14 = this.x + (this.y - this.x) * var1;
               var11 = var11 * (1.0F - var14) + var11 * 0.7F * var14;
               var12 = var12 * (1.0F - var14) + var12 * 0.6F * var14;
               var13 = var13 * (1.0F - var14) + var13 * 0.6F * var14;
            }

            if (var2.n.if == 1) {
               var11 = 0.22F + var6 * 0.75F;
               var12 = 0.28F + var9 * 0.75F;
               var13 = 0.25F + var10 * 0.75F;
            }

            float var15;
            if (this.void.vk.if(ai0.j)) {
               var14 = this.a((aek)this.void.vk, var1);
               var15 = 1.0F / var11;
               if (var15 > 1.0F / var12) {
                  var15 = 1.0F / var12;
               }

               if (var15 > 1.0F / var13) {
                  var15 = 1.0F / var13;
               }

               var11 = var11 * (1.0F - var14) + var11 * var15 * var14;
               var12 = var12 * (1.0F - var14) + var12 * var15 * var14;
               var13 = var13 * (1.0F - var14) + var13 * var15 * var14;
            }

            if (var11 > 1.0F) {
               var11 = 1.0F;
            }

            if (var12 > 1.0F) {
               var12 = 1.0F;
            }

            if (var13 > 1.0F) {
               var13 = 1.0F;
            }

            var14 = this.void.u1.bb;
            var15 = 1.0F - var11;
            float var16 = 1.0F - var12;
            float var17 = 1.0F - var13;
            var15 = 1.0F - var15 * var15 * var15 * var15;
            var16 = 1.0F - var16 * var16 * var16 * var16;
            var17 = 1.0F - var17 * var17 * var17 * var17;
            var11 = var11 * (1.0F - var14) + var15 * var14;
            var12 = var12 * (1.0F - var14) + var16 * var14;
            var13 = var13 * (1.0F - var14) + var17 * var14;
            var11 = var11 * 0.96F + 0.03F;
            var12 = var12 * 0.96F + 0.03F;
            var13 = var13 * 0.96F + 0.03F;
            if (var11 > 1.0F) {
               var11 = 1.0F;
            }

            if (var12 > 1.0F) {
               var12 = 1.0F;
            }

            if (var13 > 1.0F) {
               var13 = 1.0F;
            }

            if (var11 < 0.0F) {
               var11 = 0.0F;
            }

            if (var12 < 0.0F) {
               var12 = 0.0F;
            }

            if (var13 < 0.0F) {
               var13 = 0.0F;
            }

            short var18 = 255;
            int var19 = (int)(var11 * 255.0F);
            int var20 = (int)(var12 * 255.0F);
            int var21 = (int)(var13 * 255.0F);
            this.F[var3] = var18 << 24 | var19 << 16 | var20 << 8 | var21;
         }

         this.void.vb.a(this.F, 16, 16, this.o);
      }

   }

   private float a(aek var1, float var2) {
      int var3 = var1.a((ai0)ai0.j).do();
      return var3 > 200 ? 1.0F : 0.7F + ajs.try(((float)var3 - var2) * 3.1415927F * 0.2F) * 0.3F;
   }

   public void if(float var1) {
      this.void.uG.a("lightTex");
      ex var2 = this.void.vm;
      this.a();
      if (var2 != null && qs.ap() != null) {
         String var3 = "HD_U " + qs.ap();
         qs.int((String)null);
      }

      if (this.void.u8 instanceof x) {
         this.a((x)this.void.u8);
      }

      if (this.do != var2) {
         c.a(this.do, var2);
         qs.t();
         this.M = 0L;
         this.K = 0;
         this.do = var2;
      }

      if (this.C == null) {
         this.C = this.void.uT.int().do();
      }

      if (!this.C.equals(this.void.uT.int().do())) {
         this.void.vl.case();
         this.C = this.void.uT.int().do();
      }

      c2.n = qs.X() || qs.ag();
      pa.aJ.if(qs.e());
      if (!qs.byte() && var2 != null && var2.j != null) {
         var2.j.do(false);
         var2.j.a(false);
      }

      if (!qs.ax()) {
         qs.a(this.void);
      }

      if (this.ae) {
         this.byte(var1);
      }

      this.void.uG.if();
      boolean var14 = Display.isActive();
      if (var14 || !this.void.u1.N || this.void.u1.aV && Mouse.isButtonDown(1)) {
         this.ah = Minecraft.h1();
      } else if (Minecraft.h1() - this.ah > 500L) {
         this.void.ic();
      }

      this.void.uG.a("mouse");
      if (this.void.uL && var14) {
         this.void.uV.a();
         float var4 = this.void.u1.ao * 0.6F + 0.2F;
         float var5 = var4 * var4 * var4 * 8.0F;
         float var6 = (float)this.void.uV.if * var5;
         float var7 = (float)this.void.uV.a * var5;
         byte var8 = 1;
         if (this.void.u1.am) {
            var8 = -1;
         }

         if (this.void.u1.bh) {
            this.R += var6;
            this.Q += var7;
            float var9 = var1 - this.N;
            this.N = var1;
            var6 = this.P * var9;
            var7 = this.O * var9;
            this.void.vk.for(var6, var7 * (float)var8);
         } else {
            this.void.vk.for(var6, var7 * (float)var8);
         }
      }

      this.void.uG.if();
      if (!this.void.u3) {
         r = this.void.u1.aj;
         i4 var15 = new i4(this.void.u1, this.void.vo, this.void.vn);
         int var16 = var15.int();
         int var17 = var15.if();
         int var18 = Mouse.getX() * var16 / this.void.vo;
         int var19 = var17 - Mouse.getY() * var17 / this.void.vn - 1;
         int var20 = a(this.void.u1.ah);
         if (this.void.vm != null) {
            this.void.uG.a("level");
            if (this.void.u1.ah == 0) {
               this.a(var1, 0L);
            } else {
               this.a(var1, this.ag + (long)(1000000000 / var20));
            }

            this.ag = System.nanoTime();
            this.void.uG.do("gui");
            if (!this.void.u1.as || this.void.u8 != null) {
               this.void.u4.a(var1, this.void.u8 != null, var18, var19);
            }

            this.void.uG.if();
         } else {
            GL11.glViewport(0, 0, this.void.vo, this.void.vn);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            this.try();
            this.ag = System.nanoTime();
         }

         if (this.void.u8 != null) {
            GL11.glClear(256);

            try {
               this.void.u8.if(var18, var19, var1);
            } catch (Throwable var13) {
               aqh var11 = aqh.a(var13, "Rendering screen");
               apu var12 = var11.a("Screen render details");
               var12.a((String)"Screen name", (Callable)(new dg(this)));
               var12.a((String)"Mouse location", (Callable)(new df(this, var18, var19)));
               var12.a((String)"Screen size", (Callable)(new de(this, var15)));
               throw new ape(var11);
            }

            if (this.void.u8 != null && this.void.u8.hQ != null) {
               this.void.u8.hQ.e(var1);
            }
         }
      }

      this.if();
      if (this.void.u1.bn != this.aj) {
         this.if = this.void.u1.bm;
         this.aj = this.void.u1.bn;
      }

      if (this.void.u1.bn) {
         this.a(this.void.uG.for, this.void.uG.a);
      }

      if (this.void.u1.bi) {
         this.void.u1.bm = true;
      }

   }

   private void if() {
      this.E = 0;
      if (!qs.P()) {
         this.M = 0L;
         this.K = 0;
      } else if (this.void.hV() != null) {
         av var1 = this.void.hV();
         boolean var2 = var1.hI().new();
         if (var2) {
            if (this.void.u8 instanceof es) {
               qs.if(20L);
            }

            this.M = 0L;
            this.K = 0;
         } else {
            if (this.A > 0) {
               qs.if((long)this.A);
               this.E = this.A;
            }

            long var3 = System.nanoTime() / 1000000L;
            if (this.M != 0L && this.K != 0) {
               long var5 = var3 - this.M;
               if (var5 < 0L) {
                  this.M = var3;
                  var5 = 0L;
               }

               if (var5 >= 50L) {
                  this.M = var3;
                  int var7 = var1.gO();
                  int var8 = var7 - this.K;
                  if (var8 < 0) {
                     this.K = var7;
                     var8 = 0;
                  }

                  if (var8 < 1 && this.A < 100) {
                     this.A += 2;
                  }

                  if (var8 > 1 && this.A > 0) {
                     --this.A;
                  }

                  this.K = var7;
               }
            } else {
               this.M = var3;
               this.K = var1.gO();
               this.ai = 1.0F;
               this.new = 50.0F;
            }
         }
      }

   }

   private void a(long var1, long var3) {
      if (this.void.u1.D || this.if) {
         if (this.af == -1L) {
            this.af = System.nanoTime();
         }

         long var5 = System.nanoTime();
         int var7 = this.Z & this.s.length - 1;
         this.am[var7] = var1;
         this.for[var7] = var3;
         this.I[var7] = (long)this.E;
         this.s[var7] = var5 - this.af;
         ++this.Z;
         this.af = var5;
         GL11.glClear(256);
         GL11.glMatrixMode(5889);
         GL11.glEnable(2903);
         GL11.glLoadIdentity();
         GL11.glOrtho(0.0D, (double)this.void.vo, (double)this.void.vn, 0.0D, 1000.0D, 3000.0D);
         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
         GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
         GL11.glLineWidth(1.0F);
         GL11.glDisable(3553);
         c4 var8 = c4.G;
         var8.do(1);

         for(int var9 = 0; var9 < this.s.length; ++var9) {
            int var10 = (var9 - this.Z & this.s.length - 1) * 255 / this.s.length;
            long var11 = this.s[var9] / 200000L;
            float var13 = (float)this.void.vn;
            var8.a(-16777216 + var10 * 256);
            var8.if((double)((float)var9 + 0.5F), (double)(var13 - (float)var11 + 0.5F), 0.0D);
            var8.if((double)((float)var9 + 0.5F), (double)(var13 + 0.5F), 0.0D);
            var13 -= (float)var11;
            long var14 = this.am[var9] / 200000L;
            var8.a(-16777216 + var10 * 65536 + var10 * 256 + var10 * 1);
            var8.if((double)((float)var9 + 0.5F), (double)(var13 + 0.5F), 0.0D);
            var8.if((double)((float)var9 + 0.5F), (double)(var13 + (float)var14 + 0.5F), 0.0D);
            var13 += (float)var14;
            long var16 = this.for[var9] / 200000L;
            var8.a(-16777216 + var10 * 65536);
            var8.if((double)((float)var9 + 0.5F), (double)(var13 + 0.5F), 0.0D);
            var8.if((double)((float)var9 + 0.5F), (double)(var13 + (float)var16 + 0.5F), 0.0D);
            var13 += (float)var16;
            long var18 = this.I[var9];
            if (var18 > 0L) {
               long var20 = var18 * 1000000L / 200000L;
               var8.a(-16777216 + var10 * 1);
               var8.if((double)((float)var9 + 0.5F), (double)(var13 + 0.5F), 0.0D);
               var8.if((double)((float)var9 + 0.5F), (double)(var13 + (float)var20 + 0.5F), 0.0D);
            }
         }

         var8.for();
      }

   }

   private void a(x var1) {
      try {
         Object var2 = null;
         Calendar var3 = Calendar.getInstance();
         var3.setTime(new Date());
         int var4 = var3.get(5);
         int var5 = var3.get(2) + 1;
         if (var2 == null) {
            return;
         }

         Field[] var6 = x.class.getDeclaredFields();

         for(int var7 = 0; var7 < var6.length; ++var7) {
            if (var6[var7].getType() == String.class) {
               var6[var7].setAccessible(true);
               var6[var7].set(var1, var2);
               break;
            }
         }
      } catch (Throwable var8) {
      }

   }

   private void a() {
      try {
         DisplayMode var1;
         if (Display.isFullscreen()) {
            if (this.a) {
               return;
            }

            this.a = true;
            this.ak = false;
            var1 = Display.getDisplayMode();
            Dimension var2 = qs.a();
            if (var2 == null) {
               return;
            }

            if (var1.getWidth() == var2.width && var1.getHeight() == var2.height) {
               return;
            }

            DisplayMode var3 = qs.a(var2);
            Display.setDisplayMode(var3);
            this.void.vo = Display.getDisplayMode().getWidth();
            this.void.vn = Display.getDisplayMode().getHeight();
            if (this.void.vo <= 0) {
               this.void.vo = 1;
            }

            if (this.void.vn <= 0) {
               this.void.vn = 1;
            }

            Display.setFullscreen(true);
            this.void.u1.try();
            Display.update();
            GL11.glEnable(3553);
         } else {
            if (this.ak) {
               return;
            }

            this.ak = true;
            this.a = false;
            if (qs.goto() == null) {
               qs.a(Display.getDesktopDisplayMode());
            }

            var1 = Display.getDisplayMode();
            if (var1.equals(qs.goto())) {
               return;
            }

            Display.setDisplayMode(qs.goto());
            if (this.void.ve != null) {
               this.void.vo = this.void.ve.getWidth();
               this.void.vn = this.void.ve.getHeight();
            }

            if (this.void.vo <= 0) {
               this.void.vo = 1;
            }

            if (this.void.vn <= 0) {
               this.void.vn = 1;
            }

            Display.setFullscreen(false);
            this.void.u1.try();
            Display.update();
            GL11.glEnable(3553);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   public void a(float var1, long var2) {
      this.void.uG.a("lightTex");
      if (this.ae) {
         this.byte(var1);
      }

      GL11.glEnable(2884);
      GL11.glEnable(2929);
      if (this.void.vj == null) {
         this.void.vj = this.void.vk;
      }

      this.void.uG.do("pick");
      this.new(var1);
      aig var4 = this.void.vj;
      c9 var5 = this.void.vl;
      d6 var6 = this.void.vh;
      double var7 = var4.aJ + (var4.al - var4.aJ) * (double)var1;
      double var9 = var4.aI + (var4.ak - var4.aI) * (double)var1;
      double var11 = var4.aH + (var4.aj - var4.aH) * (double)var1;
      this.void.uG.do("center");

      for(int var13 = 0; var13 < 2; ++var13) {
         if (this.void.u1.aj) {
            q = var13;
            if (q == 0) {
               GL11.glColorMask(false, true, true, false);
            } else {
               GL11.glColorMask(true, false, false, false);
            }
         }

         this.void.uG.do("clear");
         GL11.glViewport(0, 0, this.void.vo, this.void.vn);
         this.int(var1);
         GL11.glClear(16640);
         GL11.glEnable(2884);
         this.void.uG.do("camera");
         this.a(var1, var13);
         k7.a(this.void.vk, this.void.u1.bo == 2);
         this.void.uG.do("frustrum");
         c0.if();
         if (!qs.ar() && !qs.r() && !qs.do()) {
            GL11.glDisable(3042);
         } else {
            this.a(-1, var1);
            this.void.uG.do("sky");
            var5.if(var1);
         }

         GL11.glEnable(2912);
         this.a(1, var1);
         if (this.void.u1.af != 0) {
            GL11.glShadeModel(7425);
         }

         this.void.uG.do("culling");
         cz var14 = new cz();
         var14.a(var7, var9, var11);
         this.void.vl.a(var14, var1);
         if (var13 == 0) {
            this.void.uG.do("updatechunks");

            while(!this.void.vl.a(var4, false) && var2 != 0L) {
               long var15 = var2 - System.nanoTime();
               if (var15 < 0L || var15 > 1000000000L) {
                  break;
               }
            }
         }

         if (var4.ak < 128.0D) {
            this.a(var5, var1);
         }

         this.void.uG.do("prepareterrain");
         this.a(0, var1);
         GL11.glEnable(2912);
         this.void.vb.for("/terrain.png");
         k1.do();
         this.void.uG.do("terrain");
         var5.a(var4, 0, (double)var1);
         GL11.glShadeModel(7424);
         boolean var18 = vf.I.do();
         aek var16;
         if (this.b == 0) {
            k1.if();
            this.void.uG.do("entities");
            if (var18) {
               vf.do(vf.F, 0);
            }

            var5.a((nr)var4.long(var1), (c1)var14, var1);
            if (var18) {
               vf.do(vf.F, -1);
            }

            this.a((double)var1);
            this.void.uG.do("litParticles");
            var6.a(var4, var1);
            k1.do();
            this.a(0, var1);
            this.void.uG.do("particles");
            var6.if(var4, var1);
            this.if((double)var1);
            if (this.void.u2 != null && var4.a((ts)ts.s) && var4 instanceof aek && !this.void.u1.as) {
               var16 = (aek)var4;
               GL11.glDisable(3008);
               this.void.uG.do("outline");
               if (!var18 || !vf.int(vf.K, var5, var16, this.void.u2, 0, var16.fR.L(), var1)) {
                  var5.if(var16, this.void.u2, 0, var16.fR.L(), var1);
                  if (!this.void.u1.as) {
                     var5.a(var16, this.void.u2, 0, var16.fR.L(), var1);
                  }
               }

               GL11.glEnable(3008);
            }
         }

         GL11.glDisable(3042);
         GL11.glEnable(2884);
         GL11.glBlendFunc(770, 771);
         GL11.glDepthMask(true);
         this.a(0, var1);
         GL11.glEnable(3042);
         GL11.glDisable(2884);
         this.void.vb.for("/terrain.png");
         ajt.do();
         if (qs.aq()) {
            this.void.uG.do("water");
            if (this.void.u1.af != 0) {
               GL11.glShadeModel(7425);
            }

            GL11.glColorMask(false, false, false, false);
            int var17 = var5.a(1, (double)var1);
            if (this.void.u1.aj) {
               if (q == 0) {
                  GL11.glColorMask(false, true, true, true);
               } else {
                  GL11.glColorMask(true, false, false, true);
               }
            } else {
               GL11.glColorMask(true, true, true, true);
            }

            if (var17 > 0) {
               var5.a(1, (double)var1);
            }

            GL11.glShadeModel(7424);
         } else {
            this.void.uG.do("water");
            var5.a(1, (double)var1);
         }

         ajt.a();
         if (var18) {
            k1.if();
            this.void.uG.do("entities");
            vf.do(vf.F, 1);
            var5.a((nr)var4.long(var1), (c1)var14, var1);
            vf.do(vf.F, -1);
            k1.do();
         }

         GL11.glDepthMask(true);
         GL11.glEnable(2884);
         GL11.glDisable(3042);
         if (this.v == 1.0D && var4 instanceof aek && !this.void.u1.as && this.void.u2 != null && !var4.a((ts)ts.s)) {
            var16 = (aek)var4;
            GL11.glDisable(3008);
            this.void.uG.do("outline");
            if (!var18 || !vf.int(vf.K, var5, var16, this.void.u2, 0, var16.fR.L(), var1)) {
               var5.if(var16, this.void.u2, 0, var16.fR.L(), var1);
               if (!this.void.u1.as) {
                  var5.a(var16, this.void.u2, 0, var16.fR.L(), var1);
               }
            }

            GL11.glEnable(3008);
         }

         this.void.uG.do("destroyProgress");
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 1);
         var5.a(c4.G, var4, var1);
         GL11.glDisable(3042);
         this.void.uG.do("weather");
         this.for(var1);
         GL11.glDisable(2912);
         if (var4.ak >= 128.0D) {
            this.a(var5, var1);
         }

         if (var18) {
            this.void.uG.do("FRenderLast");
            vf.do(vf.o, var5, var1);
         }

         this.void.uG.do("hand");
         if (this.v == 1.0D) {
            GL11.glClear(256);
            this.if(var1, var13);
         }

         if (!this.void.u1.aj) {
            this.void.uG.if();
            return;
         }
      }

      GL11.glColorMask(true, true, true, false);
      this.void.uG.if();
   }

   private void a(c9 var1, float var2) {
      if (this.void.u1.a()) {
         this.void.uG.do("clouds");
         GL11.glPushMatrix();
         this.a(0, var2);
         GL11.glEnable(2912);
         var1.a(var2);
         GL11.glDisable(2912);
         this.a(1, var2);
         GL11.glPopMatrix();
      }

   }

   private void int() {
      float var1 = this.void.vm.char(1.0F);
      if (!qs.ab()) {
         var1 /= 2.0F;
      }

      if (qs.ak()) {
         this.ad.setSeed((long)this.goto * 312987231L);
         aig var2 = this.void.vj;
         ex var3 = this.void.vm;
         int var4 = ajs.a(var2.al);
         int var5 = ajs.a(var2.ak);
         int var6 = ajs.a(var2.aj);
         byte var7 = 10;
         double var8 = 0.0D;
         double var10 = 0.0D;
         double var12 = 0.0D;
         int var14 = 0;
         int var15 = (int)(100.0F * var1 * var1);
         if (this.void.u1.a9 == 1) {
            var15 >>= 1;
         } else if (this.void.u1.a9 == 2) {
            var15 = 0;
         }

         for(int var16 = 0; var16 < var15; ++var16) {
            int var17 = var4 + this.ad.nextInt(var7) - this.ad.nextInt(var7);
            int var18 = var6 + this.ad.nextInt(var7) - this.ad.nextInt(var7);
            int var19 = var3.new(var17, var18);
            int var20 = var3.new(var17, var19 - 1, var18);
            yn var21 = var3.a(var17, var18);
            if (var19 <= var5 + var7 && var19 >= var5 - var7 && var21.if() && var21.int() >= 0.2F) {
               float var22 = this.ad.nextFloat();
               float var23 = this.ad.nextFloat();
               if (var20 > 0) {
                  if (pa.x[var20].at == ts.r) {
                     this.void.vh.a((d7)(new d2(var3, (double)((float)var17 + var22), (double)((float)var19 + 0.1F) - pa.x[var20].m(), (double)((float)var18 + var23), 0.0D, 0.0D, 0.0D)));
                  } else {
                     ++var14;
                     if (this.ad.nextInt(var14) == 0) {
                        var8 = (double)((float)var17 + var22);
                        var10 = (double)((float)var19 + 0.1F) - pa.x[var20].m();
                        var12 = (double)((float)var18 + var23);
                     }

                     dt var24 = new dt(var3, (double)((float)var17 + var22), (double)((float)var19 + 0.1F) - pa.x[var20].m(), (double)((float)var18 + var23));
                     ad8.a((d7)var24, (yy)var3);
                     this.void.vh.a((d7)var24);
                  }
               }
            }
         }

         if (var14 > 0 && this.ad.nextInt(3) < this.ac++) {
            this.ac = 0;
            if (var10 > var2.ak + 1.0D && var3.new(ajs.a(var2.al), ajs.a(var2.aj)) > ajs.a(var2.ak)) {
               this.void.vm.a(var8, var10, var12, "ambient.weather.rain", 0.1F, 0.5F, false);
            } else {
               this.void.vm.a(var8, var10, var12, "ambient.weather.rain", 0.2F, 1.0F, false);
            }
         }
      }

   }

   protected void for(float var1) {
      float var2 = this.void.vm.char(var1);
      if (var2 > 0.0F) {
         this.a((double)var1);
         if (this.j == null) {
            this.j = new float[1024];
            this.i = new float[1024];

            for(int var3 = 0; var3 < 32; ++var3) {
               for(int var4 = 0; var4 < 32; ++var4) {
                  float var5 = (float)(var4 - 16);
                  float var6 = (float)(var3 - 16);
                  float var7 = ajs.if(var5 * var5 + var6 * var6);
                  this.j[var3 << 5 | var4] = -var6 / var7;
                  this.i[var3 << 5 | var4] = var5 / var7;
               }
            }
         }

         if (qs.c()) {
            return;
         }

         aig var41 = this.void.vj;
         ex var42 = this.void.vm;
         int var43 = ajs.a(var41.al);
         int var44 = ajs.a(var41.ak);
         int var45 = ajs.a(var41.aj);
         c4 var8 = c4.G;
         GL11.glDisable(2884);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glAlphaFunc(516, 0.01F);
         this.void.vb.for("/environment/snow.png");
         double var9 = var41.aJ + (var41.al - var41.aJ) * (double)var1;
         double var11 = var41.aI + (var41.ak - var41.aI) * (double)var1;
         double var13 = var41.aH + (var41.aj - var41.aH) * (double)var1;
         int var15 = ajs.a(var11);
         byte var16 = 5;
         if (qs.ab()) {
            var16 = 10;
         }

         boolean var17 = false;
         byte var18 = -1;
         float var19 = (float)this.goto + var1;
         if (qs.ab()) {
            var16 = 10;
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var17 = false;

         for(int var20 = var45 - var16; var20 <= var45 + var16; ++var20) {
            for(int var21 = var43 - var16; var21 <= var43 + var16; ++var21) {
               int var22 = (var20 - var45 + 16) * 32 + var21 - var43 + 16;
               float var23 = this.j[var22] * 0.5F;
               float var24 = this.i[var22] * 0.5F;
               yn var25 = var42.a(var21, var20);
               if (var25.if() || var25.goto()) {
                  int var26 = var42.new(var21, var20);
                  int var27 = var44 - var16;
                  int var28 = var44 + var16;
                  if (var27 < var26) {
                     var27 = var26;
                  }

                  if (var28 < var26) {
                     var28 = var26;
                  }

                  float var29 = 1.0F;
                  int var30 = var26;
                  if (var26 < var15) {
                     var30 = var15;
                  }

                  if (var27 != var28) {
                     this.ad.setSeed((long)(var21 * var21 * 3121 + var21 * 45238971 ^ var20 * var20 * 418711 + var20 * 13761));
                     float var31 = var25.int();
                     float var32;
                     double var33;
                     if (var42.void().a(var31, var26) >= 0.15F) {
                        if (var18 != 0) {
                           if (var18 >= 0) {
                              var8.for();
                           }

                           var18 = 0;
                           this.void.vb.for("/environment/rain.png");
                           var8.if();
                        }

                        var32 = ((float)(this.goto + var21 * var21 * 3121 + var21 * 45238971 + var20 * var20 * 418711 + var20 * 13761 & 31) + var1) / 32.0F * (3.0F + this.ad.nextFloat());
                        double var35 = (double)((float)var21 + 0.5F) - var41.al;
                        var33 = (double)((float)var20 + 0.5F) - var41.aj;
                        float var37 = ajs.int(var35 * var35 + var33 * var33) / (float)var16;
                        float var38 = 1.0F;
                        var8.if(var42.do(var21, var30, var20, 0));
                        var8.a(var38, var38, var38, ((1.0F - var37 * var37) * 0.5F + 0.5F) * var2);
                        var8.a(-var9 * 1.0D, -var11 * 1.0D, -var13 * 1.0D);
                        var8.a((double)((float)var21 - var23) + 0.5D, (double)var27, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29), (double)((float)var27 * var29 / 4.0F + var32 * var29));
                        var8.a((double)((float)var21 + var23) + 0.5D, (double)var27, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29), (double)((float)var27 * var29 / 4.0F + var32 * var29));
                        var8.a((double)((float)var21 + var23) + 0.5D, (double)var28, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29), (double)((float)var28 * var29 / 4.0F + var32 * var29));
                        var8.a((double)((float)var21 - var23) + 0.5D, (double)var28, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29), (double)((float)var28 * var29 / 4.0F + var32 * var29));
                        var8.a(0.0D, 0.0D, 0.0D);
                     } else {
                        if (var18 != 1) {
                           if (var18 >= 0) {
                              var8.for();
                           }

                           var18 = 1;
                           this.void.vb.for("/environment/snow.png");
                           var8.if();
                        }

                        var32 = ((float)(this.goto & 511) + var1) / 512.0F;
                        float var46 = this.ad.nextFloat() + var19 * 0.01F * (float)this.ad.nextGaussian();
                        float var36 = this.ad.nextFloat() + var19 * (float)this.ad.nextGaussian() * 0.001F;
                        var33 = (double)((float)var21 + 0.5F) - var41.al;
                        double var47 = (double)((float)var20 + 0.5F) - var41.aj;
                        float var39 = ajs.int(var33 * var33 + var47 * var47) / (float)var16;
                        float var40 = 1.0F;
                        var8.if((var42.do(var21, var30, var20, 0) * 3 + 15728880) / 4);
                        var8.a(var40, var40, var40, ((1.0F - var39 * var39) * 0.3F + 0.5F) * var2);
                        var8.a(-var9 * 1.0D, -var11 * 1.0D, -var13 * 1.0D);
                        var8.a((double)((float)var21 - var23) + 0.5D, (double)var27, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29 + var46), (double)((float)var27 * var29 / 4.0F + var32 * var29 + var36));
                        var8.a((double)((float)var21 + var23) + 0.5D, (double)var27, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29 + var46), (double)((float)var27 * var29 / 4.0F + var32 * var29 + var36));
                        var8.a((double)((float)var21 + var23) + 0.5D, (double)var28, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29 + var46), (double)((float)var28 * var29 / 4.0F + var32 * var29 + var36));
                        var8.a((double)((float)var21 - var23) + 0.5D, (double)var28, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29 + var46), (double)((float)var28 * var29 / 4.0F + var32 * var29 + var36));
                        var8.a(0.0D, 0.0D, 0.0D);
                     }
                  }
               }
            }
         }

         if (var18 >= 0) {
            var8.for();
         }

         GL11.glEnable(2884);
         GL11.glDisable(3042);
         GL11.glAlphaFunc(516, 0.1F);
         this.if((double)var1);
      }

   }

   public void try() {
      i4 var1 = new i4(this.void.u1, this.void.vo, this.void.vn);
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, var1.for(), var1.a(), 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
   }

   private void int(float var1) {
      ex var2 = this.void.vm;
      aig var3 = this.void.vj;
      float var4 = 1.0F / (float)(4 - this.void.u1.al);
      var4 = 1.0F - (float)Math.pow((double)var4, 0.25D);
      nr var5 = var2.a(this.void.vj, var1);
      int var6 = var2.n.if;
      switch(var6) {
      case 0:
         var5 = ad8.a((nr)var5, this.void.vm, this.void.vj.al, this.void.vj.ak + 1.0D, this.void.vj.aj);
         break;
      case 1:
         var5 = ad8.do(var5);
      }

      float var7 = (float)var5.int;
      float var8 = (float)var5.for;
      float var9 = (float)var5.do;
      nr var10 = var2.byte(var1);
      switch(var6) {
      case -1:
         var10 = ad8.a(var10);
         break;
      case 0:
         var10 = ad8.if(var10, this.void.vm, this.void.vj.al, this.void.vj.ak + 1.0D, this.void.vj.aj);
         break;
      case 1:
         var10 = ad8.if(var10);
      }

      this.e = (float)var10.int;
      this.d = (float)var10.for;
      this.c = (float)var10.do;
      float var11;
      if (this.void.u1.al < 2) {
         nr var12 = ajs.try(var2.do(var1)) > 0.0F ? var2.do().a(-1.0D, 0.0D, 0.0D) : var2.do().a(1.0D, 0.0D, 0.0D);
         var11 = (float)var3.b(var1).int(var12);
         if (var11 < 0.0F) {
            var11 = 0.0F;
         }

         if (var11 > 0.0F) {
            float[] var13 = var2.n.if(var2.try(var1), var1);
            if (var13 != null) {
               var11 *= var13[3];
               this.e = this.e * (1.0F - var11) + var13[0] * var11;
               this.d = this.d * (1.0F - var11) + var13[1] * var11;
               this.c = this.c * (1.0F - var11) + var13[2] * var11;
            }
         }
      }

      this.e += (var7 - this.e) * var4;
      this.d += (var8 - this.d) * var4;
      this.c += (var9 - this.c) * var4;
      float var24 = var2.char(var1);
      float var25;
      if (var24 > 0.0F) {
         var11 = 1.0F - var24 * 0.5F;
         var25 = 1.0F - var24 * 0.4F;
         this.e *= var11;
         this.d *= var11;
         this.c *= var25;
      }

      var11 = var2.if(var1);
      if (var11 > 0.0F) {
         var25 = 1.0F - var11 * 0.5F;
         this.e *= var25;
         this.d *= var25;
         this.c *= var25;
      }

      int var14 = k7.a(this.void.vm, var3, var1);
      nr var15;
      if (this.w) {
         var15 = var2.for(var1);
         this.e = (float)var15.int;
         this.d = (float)var15.for;
         this.c = (float)var15.do;
      } else if (var14 != 0 && pa.x[var14].at == ts.s) {
         this.e = 0.02F;
         this.d = 0.02F;
         this.c = 0.2F;
         var15 = ad8.a(this.void.vm, this.void.vj.al, this.void.vj.ak + 1.0D, this.void.vj.aj);
         if (var15 != null) {
            this.e = (float)var15.int;
            this.d = (float)var15.for;
            this.c = (float)var15.do;
         }
      } else if (var14 != 0 && pa.x[var14].at == ts.r) {
         this.e = 0.6F;
         this.d = 0.1F;
         this.c = 0.0F;
      }

      float var16 = this.ab + (this.aa - this.ab) * var1;
      this.e *= var16;
      this.d *= var16;
      this.c *= var16;
      double var17 = var2.n.int();
      if (!qs.U()) {
         var17 = 1.0D;
      }

      double var19 = (var3.aI + (var3.ak - var3.aI) * (double)var1) * var17;
      if (var3.if(ai0.k)) {
         int var21 = var3.a(ai0.k).do();
         if (var21 < 20) {
            var19 *= (double)(1.0F - (float)var21 / 20.0F);
         } else {
            var19 = 0.0D;
         }
      }

      if (var19 < 1.0D) {
         if (var19 < 0.0D) {
            var19 = 0.0D;
         }

         var19 *= var19;
         this.e = (float)((double)this.e * var19);
         this.d = (float)((double)this.d * var19);
         this.c = (float)((double)this.c * var19);
      }

      float var26;
      if (this.y > 0.0F) {
         var26 = this.x + (this.y - this.x) * var1;
         this.e = this.e * (1.0F - var26) + this.e * 0.7F * var26;
         this.d = this.d * (1.0F - var26) + this.d * 0.6F * var26;
         this.c = this.c * (1.0F - var26) + this.c * 0.6F * var26;
      }

      float var22;
      if (var3.if(ai0.j)) {
         var26 = this.a((aek)this.void.vk, var1);
         var22 = 1.0F / this.e;
         if (var22 > 1.0F / this.d) {
            var22 = 1.0F / this.d;
         }

         if (var22 > 1.0F / this.c) {
            var22 = 1.0F / this.c;
         }

         this.e = this.e * (1.0F - var26) + this.e * var22 * var26;
         this.d = this.d * (1.0F - var26) + this.d * var22 * var26;
         this.c = this.c * (1.0F - var26) + this.c * var22 * var26;
      }

      if (this.void.u1.aj) {
         var26 = (this.e * 30.0F + this.d * 59.0F + this.c * 11.0F) / 100.0F;
         var22 = (this.e * 30.0F + this.d * 70.0F) / 100.0F;
         float var23 = (this.e * 30.0F + this.c * 70.0F) / 100.0F;
         this.e = var26;
         this.d = var22;
         this.c = var23;
      }

      GL11.glClearColor(this.e, this.d, this.c, 0.0F);
   }

   private void a(int var1, float var2) {
      aig var3 = this.void.vj;
      boolean var4 = false;
      if (var3 instanceof aek) {
         var4 = ((aek)var3).fY.new;
      }

      if (var1 == 999) {
         GL11.glFog(2918, this.a(0.0F, 0.0F, 0.0F, 1.0F));
         GL11.glFogi(2917, 9729);
         GL11.glFogf(2915, 0.0F);
         GL11.glFogf(2916, 8.0F);
         if (GLContext.getCapabilities().GL_NV_fog_distance) {
            GL11.glFogi(34138, 34139);
         }

         GL11.glFogf(2915, 0.0F);
      } else {
         GL11.glFog(2918, this.a(this.e, this.d, this.c, 1.0F));
         GL11.glNormal3f(0.0F, -1.0F, 0.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var5 = k7.a(this.void.vm, var3, var2);
         float var6;
         if (var3.if(ai0.k)) {
            var6 = 5.0F;
            int var15 = var3.a(ai0.k).do();
            if (var15 < 20) {
               var6 = 5.0F + (this.long - 5.0F) * (1.0F - (float)var15 / 20.0F);
            }

            GL11.glFogi(2917, 9729);
            if (var1 < 0) {
               GL11.glFogf(2915, 0.0F);
               GL11.glFogf(2916, var6 * 0.8F);
            } else {
               GL11.glFogf(2915, var6 * 0.25F);
               GL11.glFogf(2916, var6);
            }

            if (qs.l()) {
               GL11.glFogi(34138, 34139);
            }
         } else {
            float var7;
            float var8;
            float var9;
            float var10;
            float var11;
            if (this.w) {
               GL11.glFogi(2917, 2048);
               GL11.glFogf(2914, 0.1F);
               var6 = 1.0F;
               var10 = 1.0F;
               var11 = 1.0F;
               if (this.void.u1.aj) {
                  var7 = (var6 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
                  var8 = (var6 * 30.0F + var10 * 70.0F) / 100.0F;
                  var9 = (var6 * 30.0F + var11 * 70.0F) / 100.0F;
               }
            } else {
               float var12;
               if (var5 > 0 && pa.x[var5].at == ts.s) {
                  GL11.glFogi(2917, 2048);
                  var12 = 0.1F;
                  if (var3.if(ai0.m)) {
                     var12 = 0.05F;
                  }

                  if (qs.D()) {
                     var12 /= 5.0F;
                  }

                  GL11.glFogf(2914, var12);
                  var6 = 0.4F;
                  var10 = 0.4F;
                  var11 = 0.9F;
                  if (this.void.u1.aj) {
                     var7 = (var6 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
                     var8 = (var6 * 30.0F + var10 * 70.0F) / 100.0F;
                     var9 = (var6 * 30.0F + var11 * 70.0F) / 100.0F;
                  }
               } else if (var5 > 0 && pa.x[var5].at == ts.r) {
                  GL11.glFogi(2917, 2048);
                  GL11.glFogf(2914, 2.0F);
                  var6 = 0.4F;
                  var10 = 0.3F;
                  var11 = 0.3F;
                  if (this.void.u1.aj) {
                     var7 = (var6 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
                     var8 = (var6 * 30.0F + var10 * 70.0F) / 100.0F;
                     var9 = (var6 * 30.0F + var11 * 70.0F) / 100.0F;
                  }
               } else {
                  var6 = this.long;
                  if (qs.U() && this.void.vm.n.goto() && !var4) {
                     double var13 = (double)((var3.new(var2) & 15728640) >> 20) / 16.0D + (var3.aI + (var3.ak - var3.aI) * (double)var2 + 4.0D) / 32.0D;
                     if (var13 < 1.0D) {
                        if (var13 < 0.0D) {
                           var13 = 0.0D;
                        }

                        var13 *= var13;
                        var7 = 100.0F * (float)var13;
                        if (var7 < 5.0F) {
                           var7 = 5.0F;
                        }

                        if (var6 > var7) {
                           var6 = var7;
                        }
                     }
                  }

                  GL11.glFogi(2917, 9729);
                  if (GLContext.getCapabilities().GL_NV_fog_distance) {
                     if (qs.l()) {
                        GL11.glFogi(34138, 34139);
                     }

                     if (qs.n()) {
                        GL11.glFogi(34138, 34140);
                     }
                  }

                  var12 = qs.s();
                  float var16 = 1.0F;
                  if (var1 < 0) {
                     var12 = 0.0F;
                     var16 = 0.8F;
                  }

                  if (this.void.vm.n.if((int)var3.al, (int)var3.aj)) {
                     var12 = 0.05F;
                     var16 = 1.0F;
                     var6 = this.long;
                  }

                  GL11.glFogf(2915, var6 * var12);
                  GL11.glFogf(2916, var6 * var16);
               }
            }
         }

         GL11.glEnable(2903);
         GL11.glColorMaterial(1028, 4608);
      }

   }

   private FloatBuffer a(float var1, float var2, float var3, float var4) {
      this.f.clear();
      this.f.put(var1).put(var2).put(var3).put(var4);
      this.f.flip();
      return this.f;
   }

   public static int a(int var0) {
      Minecraft var1 = qs.T();
      if (var1.u8 != null && var1.u8 instanceof x) {
         return 35;
      } else if (var1.vm == null) {
         return 35;
      } else {
         int var2 = qs.S().long;
         if (var2 <= 0) {
            var2 = 10000;
         }

         return var2;
      }
   }

   static Minecraft a(dh var0) {
      return var0.void;
   }
}
