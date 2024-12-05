package net.minecraft.client;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.swing.JPanel;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public abstract class Minecraft implements Runnable, .ai8 {
   public static byte[] vq = new byte[10485760];
   private final .ajw uw = new .aj8("Minecraft-Client", " [CLIENT]", (new File(hQ(), "output-client.log")).getAbsolutePath());
   private .eq uv;
   private static Minecraft uu;
   public .ey vp;
   private boolean ut = false;
   private boolean us = false;
   private .aqh ur;
   public int vo;
   public int vn;
   private .j8 uq = new .j8(20.0F);
   private .aja up = new .aja("client", this);
   public .ex vm;
   public .c9 vl;
   public .eu vk;
   public .aig vj;
   public .aig vi;
   public .d6 vh;
   public .j7 vg = null;
   public String vf;
   public Canvas ve;
   public boolean vd = false;
   public volatile boolean vc = false;
   public .c3 vb;
   public .jq va;
   public .jq u9;
   public .i5 u8 = null;
   public .kb u7;
   public .dh u6;
   private .k8 uo;
   private int un = 0;
   private int um;
   private int u0;
   private .av uZ;
   public .iu u5;
   public .jp u4;
   public boolean u3 = false;
   public .nt u2 = null;
   public .ke u1;
   protected MinecraftApplet uY;
   public .aa uX = new .aa();
   public .kg uV;
   public .ai uT;
   public File uR;
   private .sg uW;
   private static int uU;
   private int uS = 0;
   private boolean uQ;
   public .v uP;
   private String uO;
   private int uN;
   boolean uM = false;
   public boolean uL = false;
   long uJ = h1();
   private int uK = 0;
   private boolean uI;
   private .aqb uH;
   private boolean uF;
   public final .ajq uG = new .ajq();
   private long uD = -1L;
   private static File uB = null;
   public volatile boolean uE = true;
   public String uC = "";
   long uA = h1();
   int uz = 0;
   long ux = -1L;
   private String uy = "root";

   public Minecraft(Canvas var1, MinecraftApplet var2, int var3, int var4, boolean var5) {
      .aka.if();
      this.u0 = var4;
      this.ut = var5;
      this.uY = var2;
      .apf.df = 32767;
      this.hO();
      this.ve = var1;
      this.vo = var3;
      this.vn = var4;
      this.ut = var5;
      uu = this;
      .bc.a();
      this.u5 = new .iu(this);
   }

   private void hO() {
      .kz var1 = new .kz(this, "Timer hack thread");
      var1.setDaemon(true);
      var1.start();
   }

   public void for(.aqh var1) {
      this.us = true;
      this.ur = var1;
   }

   public void int(.aqh var1) {
      this.us = true;
      this.do(var1);
   }

   public abstract void do(.aqh var1);

   public void try(String var1, int var2) {
      this.uO = var1;
      this.uN = var2;
   }

   public void iq() throws LWJGLException {
      if (this.ve != null) {
         Graphics var1 = this.ve.getGraphics();
         if (var1 != null) {
            var1.setColor(Color.BLACK);
            var1.fillRect(0, 0, this.vo, this.vn);
            var1.dispose();
         }

         Display.setParent(this.ve);
      } else if (this.ut) {
         Display.setFullscreen(true);
         this.vo = Display.getDisplayMode().getWidth();
         this.vn = Display.getDisplayMode().getHeight();
         if (this.vo <= 0) {
            this.vo = 1;
         }

         if (this.vn <= 0) {
            this.vn = 1;
         }
      } else {
         Display.setDisplayMode(new DisplayMode(this.vo, this.vn));
      }

      Display.setTitle("Minecraft Minecraft 1.5.1");
      this.a().a("LWJGL Version: " + Sys.getVersion());

      try {
         Display.create((new PixelFormat()).withDepthBits(24));
      } catch (LWJGLException var5) {
         var5.printStackTrace();

         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var4) {
         }

         Display.create();
      }

      .q.a();
      this.uR = hQ();
      this.uW = new .sy(new File(this.uR, "saves"));
      this.u1 = new .ke(this, this.uR);
      this.uT = new .ai(this.uR, this);
      this.vb = new .c3(this.uT, this.u1);
      this.h7();
      this.va = new .jq(this.u1, "/font/default.png", this.vb, false);
      this.u9 = new .jq(this.u1, "/font/alternate.png", this.vb, false);
      if (this.u1.a8 != null) {
         .aqy.if().a(this.u1.a8, false);
         this.va.a(.aqy.if().for());
         this.va.if(.aqy.do(this.u1.a8));
      }

      .y7.a(this.vb.if("/misc/grasscolor.png"));
      .zf.a(this.vb.if("/misc/foliagecolor.png"));
      this.u6 = new .dh(this);
      .cl.e.long = new .da(this);
      this.uP = new .v(this.vg, this.uR);
      .akk.n.a(new .ks(this));
      this.h7();
      Mouse.create();
      this.uV = new .kg(this.ve, this.u1);
      this.U("Pre startup");
      GL11.glEnable(3553);
      GL11.glShadeModel(7425);
      GL11.glClearDepth(1.0D);
      GL11.glEnable(2929);
      GL11.glDepthFunc(515);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      GL11.glCullFace(1029);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glMatrixMode(5888);
      this.U("Startup");
      this.uX.a(this.u1);
      this.vl = new .c9(this, this.vb);
      this.vb.a();
      GL11.glViewport(0, 0, this.vo, this.vn);
      this.vh = new .d6(this.vm, this.vb);

      try {
         this.uo = new .k8(this.uR, this);
         this.uo.start();
      } catch (Exception var3) {
      }

      this.U("Post startup");
      this.u4 = new .jp(this);
      if (this.uO != null) {
         this.a((.i5)(new .e2(new .x(), this, this.uO, this.uN)));
      } else {
         this.a((.i5)(new .x()));
      }

      this.u7 = new .kb(this);
      if (this.u1.S && !this.ut) {
         this.hN();
      }

   }

   private void h7() throws LWJGLException {
      .i4 var1 = new .i4(this.u1, this.vo, this.vn);
      GL11.glClear(16640);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, var1.for(), var1.a(), 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glViewport(0, 0, this.vo, this.vn);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glDisable(2896);
      GL11.glEnable(3553);
      GL11.glDisable(2912);
      .c4 var2 = .c4.G;
      this.vb.for("/title/mojang2.png");
      var2.if();
      var2.a(16777215);
      var2.a(0.0D, (double)this.vn, 0.0D, 0.0D, 0.0D);
      var2.a((double)this.vo, (double)this.vn, 0.0D, 0.0D, 0.0D);
      var2.a((double)this.vo, 0.0D, 0.0D, 0.0D, 0.0D);
      var2.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
      var2.for();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var2.a(16777215);
      short var3 = 256;
      short var4 = 256;
      this.for((var1.int() - var3) / 2, (var1.if() - var4) / 2, 0, 0, var3, var4);
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      Display.swapBuffers();
   }

   public void for(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      .c4 var9 = .c4.G;
      var9.if();
      var9.a((double)(var1 + 0), (double)(var2 + var6), 0.0D, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + var6), 0.0D, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + 0), 0.0D, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.a((double)(var1 + 0), (double)(var2 + 0), 0.0D, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.for();
   }

   public static File hQ() {
      if (uB == null) {
         uB = V("allfight");
      }

      return uB;
   }

   public static File V(String var0) {
      // $FF: Couldn't be decompiled
   }

   public static .kj io() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.contains("win") ? .kj.new : (var0.contains("mac") ? .kj.int : (var0.contains("solaris") ? .kj.a : (var0.contains("sunos") ? .kj.a : (var0.contains("linux") ? .kj.if : (var0.contains("unix") ? .kj.if : .kj.for)))));
   }

   public .sg im() {
      return this.uW;
   }

   public void a(.i5 var1) {
      if (this.u8 != null) {
         this.u8.dF();
      }

      this.uP.do();
      if (var1 == null && this.vm == null) {
         var1 = new .x();
      } else if (var1 == null && this.vk.cd() <= 0) {
         var1 = new .jx();
      }

      if (var1 instanceof .x) {
         this.u1.bn = false;
         this.u4.c5().dn();
      }

      this.u8 = (.i5)var1;
      if (var1 != null) {
         this.hX();
         .i4 var2 = new .i4(this.u1, this.vo, this.vn);
         int var3 = var2.int();
         int var4 = var2.if();
         ((.i5)var1).for(this, var3, var4);
         this.u3 = false;
      } else {
         this.ik();
      }

   }

   private void U(String var1) {
      int var2 = GL11.glGetError();
      if (var2 != 0) {
         String var3 = GLU.gluErrorString(var2);
         this.a().do("########## GL ERROR ##########");
         this.a().do("@ " + var1);
         this.a().do(var2 + ": " + var3);
      }

   }

   public void ia() {
      try {
         this.uP.do();

         try {
            if (this.uo != null) {
               this.uo.a();
            }
         } catch (Exception var9) {
         }

         this.a().a("Stopping!");

         try {
            this.a((.ex)null);
         } catch (Throwable var8) {
         }

         try {
            .k0.a();
         } catch (Throwable var7) {
         }

         this.uX.try();
         Mouse.destroy();
         Keyboard.destroy();
      } finally {
         Display.destroy();
         if (!this.us) {
            System.exit(0);
         }

      }

      System.gc();
   }

   public void run() {
      this.uE = true;

      try {
         this.iq();
      } catch (Exception var11) {
         var11.printStackTrace();
         this.int(this.new(new .aqh("Failed to start game", var11)));
         return;
      }

      while(true) {
         try {
            if (this.uE) {
               if (this.us && this.ur != null) {
                  this.int(this.ur);
                  return;
               }

               if (this.uQ) {
                  this.uQ = false;
                  this.vb.new();
               }

               try {
                  this.in();
               } catch (OutOfMemoryError var10) {
                  this.ir();
                  this.a((.i5)(new .jc()));
                  System.gc();
               }
               continue;
            }
         } catch (.j9 var12) {
         } catch (.ape var13) {
            this.new(var13.a());
            this.ir();
            var13.printStackTrace();
            this.int(var13.a());
         } catch (Throwable var14) {
            .aqh var2 = this.new(new .aqh("Unexpected error", var14));
            this.ir();
            var14.printStackTrace();
            this.int(var2);
         } finally {
            this.ia();
         }

         return;
      }
   }

   private void in() {
      if (this.uY != null && !this.uY.isActive()) {
         this.uE = false;
      } else {
         .nw.if().do();
         if (this.vm != null) {
            this.vm.do().for();
         }

         this.uG.a("root");
         if (this.ve == null && Display.isCloseRequested()) {
            this.h2();
         }

         if (this.vc && this.vm != null) {
            float var1 = this.uq.byte;
            this.uq.a();
            this.uq.byte = var1;
         } else {
            this.uq.a();
         }

         long var6 = System.nanoTime();
         this.uG.a("tick");

         for(int var3 = 0; var3 < this.uq.case; ++var3) {
            this.h5();
         }

         this.uG.do("preRenderErrors");
         long var7 = System.nanoTime() - var6;
         this.U("Pre render");
         .c2.n = this.u1.ag;
         this.uG.do("sound");
         this.uX.a((.aig)this.vk, this.uq.byte);
         if (!this.vc) {
            this.uX.for();
         }

         this.uG.if();
         this.uG.a("render");
         this.uG.a("display");
         GL11.glEnable(3553);
         if (!Keyboard.isKeyDown(65)) {
            Display.update();
         }

         if (this.vk != null && this.vk.aE()) {
            this.u1.bo = 0;
         }

         this.uG.if();
         if (!this.u3) {
            this.uG.do("gameRenderer");
            this.u6.if(this.uq.byte);
            this.uG.if();
         }

         GL11.glFlush();
         this.uG.if();
         if (!Display.isActive() && this.ut) {
            this.hN();
         }

         if (this.u1.bn && this.u1.bm) {
            if (!this.uG.else) {
               this.uG.do();
            }

            this.uG.else = true;
            this.int(var7);
         } else {
            this.uG.else = false;
            this.ux = System.nanoTime();
         }

         this.u5.c1();
         this.uG.a("root");
         Thread.yield();
         if (Keyboard.isKeyDown(65)) {
            Display.update();
         }

         this.ig();
         this.hZ();
         if (this.ve != null && !this.ut && (this.ve.getWidth() != this.vo || this.ve.getHeight() != this.vn)) {
            this.vo = this.ve.getWidth();
            this.vn = this.ve.getHeight();
            if (this.vo <= 0) {
               this.vo = 1;
            }

            if (this.vn <= 0) {
               this.vn = 1;
            }

            this.j(this.vo, this.vn);
         }

         this.U("Post render");
         ++this.uz;
         boolean var5 = this.vc;
         this.vc = this.h9() && this.u8 != null && this.u8.dy() && !this.uZ.hH();
         if (this.hT() && this.vk != null && this.vk.gF != null && this.vc != var5) {
            ((.ap9)this.vk.gF.byte()).a(this.vc);
         }

         while(h1() >= this.uA + 1000L) {
            uU = this.uz;
            this.uC = uU + " fps, " + .dm.v + " chunk updates";
            .dm.v = 0;
            this.uA += 1000L;
            this.uz = 0;
            this.up.a();
            if (!this.up.int()) {
               this.up.for();
            }
         }

         this.uG.if();
         if (this.h4() > 0) {
            Display.sync(.dh.a(this.h4()));
         }
      }

   }

   private int h4() {
      return this.u8 != null && this.u8 instanceof .x ? 2 : this.u1.ah;
   }

   public void ir() {
      try {
         vq = new byte[0];
         this.vl.char();
      } catch (Throwable var4) {
      }

      try {
         System.gc();
         .nw.if().if();
         this.vm.do().do();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         this.a((.ex)null);
      } catch (Throwable var2) {
      }

      System.gc();
   }

   private void hZ() {
      if (Keyboard.isKeyDown(56)) {
         if (!this.uY.isFocusOwner()) {
            this.uY.requestFocus();
         }

         if (!this.ve.isFocusOwner()) {
            this.ve.requestFocus();
         }
      } else if (Keyboard.isKeyDown(68)) {
         if (!this.uY.isFocusOwner()) {
            this.uY.requestFocus();
         }

         if (!this.ve.isFocusOwner()) {
            this.ve.requestFocus();
         }
      }

   }

   private void ig() {
      if (Keyboard.isKeyDown(60)) {
         if (!this.uM) {
            this.uM = true;
            this.u4.c5().else(.ka.a(uB, this.vo, this.vn));
         }
      } else {
         this.uM = false;
      }

   }

   private void aX(int var1) {
      List var2 = this.uG.if(this.uy);
      if (var2 != null && !var2.isEmpty()) {
         .ajp var3 = (.ajp)var2.remove(0);
         if (var1 == 0) {
            if (var3.do.length() > 0) {
               int var4 = this.uy.lastIndexOf(".");
               if (var4 >= 0) {
                  this.uy = this.uy.substring(0, var4);
               }
            }
         } else {
            --var1;
            if (var1 < var2.size() && !((.ajp)var2.get(var1)).do.equals("unspecified")) {
               if (this.uy.length() > 0) {
                  this.uy = this.uy + ".";
               }

               this.uy = this.uy + ((.ajp)var2.get(var1)).do;
            }
         }
      }

   }

   private void int(long var1) {
      if (this.uG.else) {
         List var3 = this.uG.if(this.uy);
         .ajp var4 = (.ajp)var3.remove(0);
         GL11.glClear(256);
         GL11.glMatrixMode(5889);
         GL11.glEnable(2903);
         GL11.glLoadIdentity();
         GL11.glOrtho(0.0D, (double)this.vo, (double)this.vn, 0.0D, 1000.0D, 3000.0D);
         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
         GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
         GL11.glLineWidth(1.0F);
         GL11.glDisable(3553);
         .c4 var5 = .c4.G;
         short var6 = 160;
         int var7 = this.vo - var6 - 10;
         int var8 = this.vn - var6 * 2;
         GL11.glEnable(3042);
         var5.if();
         var5.if(0, 200);
         var5.if((double)((float)var7 - (float)var6 * 1.1F), (double)((float)var8 - (float)var6 * 0.6F - 16.0F), 0.0D);
         var5.if((double)((float)var7 - (float)var6 * 1.1F), (double)(var8 + var6 * 2), 0.0D);
         var5.if((double)((float)var7 + (float)var6 * 1.1F), (double)(var8 + var6 * 2), 0.0D);
         var5.if((double)((float)var7 + (float)var6 * 1.1F), (double)((float)var8 - (float)var6 * 0.6F - 16.0F), 0.0D);
         var5.for();
         GL11.glDisable(3042);
         double var9 = 0.0D;

         int var11;
         int var14;
         for(int var12 = 0; var12 < var3.size(); ++var12) {
            .ajp var13 = (.ajp)var3.get(var12);
            var11 = .ajs.a(var13.if / 4.0D) + 1;
            var5.do(6);
            var5.a(var13.a());
            var5.if((double)var7, (double)var8, 0.0D);

            float var15;
            float var16;
            float var17;
            for(var14 = var11; var14 >= 0; --var14) {
               var15 = (float)((var9 + var13.if * (double)var14 / (double)var11) * 3.141592653589793D * 2.0D / 100.0D);
               var17 = .ajs.try(var15) * (float)var6;
               var16 = .ajs.for(var15) * (float)var6 * 0.5F;
               var5.if((double)((float)var7 + var17), (double)((float)var8 - var16), 0.0D);
            }

            var5.for();
            var5.do(5);
            var5.a((var13.a() & 16711422) >> 1);

            for(var14 = var11; var14 >= 0; --var14) {
               var15 = (float)((var9 + var13.if * (double)var14 / (double)var11) * 3.141592653589793D * 2.0D / 100.0D);
               var17 = .ajs.try(var15) * (float)var6;
               var16 = .ajs.for(var15) * (float)var6 * 0.5F;
               var5.if((double)((float)var7 + var17), (double)((float)var8 - var16), 0.0D);
               var5.if((double)((float)var7 + var17), (double)((float)var8 - var16 + 10.0F), 0.0D);
            }

            var5.for();
            var9 += var13.if;
         }

         DecimalFormat var18 = new DecimalFormat("##0.00");
         GL11.glEnable(3553);
         String var19 = "";
         if (!var4.do.equals("unspecified")) {
            var19 = var19 + "[0] ";
         }

         if (var4.do.length() == 0) {
            var19 = var19 + "ROOT ";
         } else {
            var19 = var19 + var4.do + " ";
         }

         var11 = 16777215;
         this.va.a(var19, var7 - var6, var8 - var6 / 2 - 16, var11);
         this.va.a(var19 = var18.format(var4.a) + "%", var7 + var6 - this.va.for(var19), var8 - var6 / 2 - 16, var11);

         for(var14 = 0; var14 < var3.size(); ++var14) {
            .ajp var20 = (.ajp)var3.get(var14);
            String var21 = "";
            if (var20.do.equals("unspecified")) {
               var21 = var21 + "[?] ";
            } else {
               var21 = var21 + "[" + (var14 + 1) + "] ";
            }

            var21 = var21 + var20.do;
            this.va.a(var21, var7 - var6, var8 + var6 / 2 + var14 * 8 + 20, var20.a());
            this.va.a(var21 = var18.format(var20.if) + "%", var7 + var6 - 50 - this.va.for(var21), var8 + var6 / 2 + var14 * 8 + 20, var20.a());
            this.va.a(var21 = var18.format(var20.a) + "%", var7 + var6 - this.va.for(var21), var8 + var6 / 2 + var14 * 8 + 20, var20.a());
         }
      }

   }

   public void h2() {
      this.uE = false;
   }

   public void ik() {
      if (Display.isActive() && !this.uL) {
         this.uL = true;
         this.uV.do();
         this.a((.i5)null);
         this.un = 10000;
      }

   }

   public void hX() {
      if (this.uL) {
         .k2.if();
         this.uL = false;
         this.uV.if();
      }

   }

   public void ic() {
      if (this.u8 == null) {
         this.a((.i5)(new .jb()));
         if (this.h9() && !this.uZ.hH()) {
            this.uX.if();
         }
      }

   }

   private void do(int var1, boolean var2) {
      if (!var2) {
         this.un = 0;
      }

      if (var1 != 0 || this.un <= 0) {
         if (var2 && this.u2 != null && this.u2.if == .ns.if && var1 == 0) {
            int var3 = this.u2.a;
            int var4 = this.u2.try;
            int var5 = this.u2.new;
            this.vp.if(var3, var4, var5, this.u2.int);
            if (this.vk.try(var3, var4, var5)) {
               this.vh.a(var3, var4, var5, this.u2.int);
               this.vk.b5();
            }
         } else {
            this.vp.char();
         }
      }

   }

   private void aW(int var1) {
      if (var1 != 0 || this.un <= 0) {
         if (var1 == 0) {
            this.vk.b5();
         }

         if (var1 == 1) {
            this.uS = 4;
         }

         boolean var2 = true;
         .abp var3 = this.vk.fR.L();
         if (this.u2 == null) {
            if (var1 == 0 && this.vp.int()) {
               this.un = 10;
            }
         } else if (this.u2.if == .ns.a) {
            if (var1 == 0) {
               this.vp.a(this.vk, this.u2.do);
            }

            if (var1 == 1 && this.vp.if(this.vk, this.u2.do)) {
               var2 = false;
            }
         } else if (this.u2.if == .ns.if) {
            int var4 = this.u2.a;
            int var5 = this.u2.try;
            int var6 = this.u2.new;
            int var7 = this.u2.int;
            if (var1 == 0) {
               this.vp.a(var4, var5, var6, this.u2.int);
            } else {
               int var8 = var3 != null ? var3.if : 0;
               if (this.vp.a(this.vk, this.vm, var3, var4, var5, var6, var7, this.u2.for)) {
                  var2 = false;
                  this.vk.b5();
               }

               if (var3 == null) {
                  return;
               }

               if (var3.if == 0) {
                  this.vk.fR.V[this.vk.fR.aa] = null;
               } else if (var3.if != var8 || this.vp.try()) {
                  this.u6.p.a();
               }
            }
         }

         if (var2 && var1 == 1) {
            .abp var9 = this.vk.fR.L();
            if (var9 != null && this.vp.a(this.vk, this.vm, var9)) {
               this.u6.p.do();
            }
         }
      }

   }

   public void hN() {
      try {
         this.ut = !this.ut;
         if (this.ut) {
            Display.setDisplayMode(Display.getDesktopDisplayMode());
            this.vo = Display.getDisplayMode().getWidth();
            this.vn = Display.getDisplayMode().getHeight();
            if (this.vo <= 0) {
               this.vo = 1;
            }

            if (this.vn <= 0) {
               this.vn = 1;
            }
         } else {
            if (this.ve != null) {
               this.vo = this.ve.getWidth();
               this.vn = this.ve.getHeight();
            } else {
               this.vo = this.um;
               this.vn = this.u0;
            }

            if (this.vo <= 0) {
               this.vo = 1;
            }

            if (this.vn <= 0) {
               this.vn = 1;
            }
         }

         if (this.u8 != null) {
            this.j(this.vo, this.vn);
         }

         Display.setFullscreen(this.ut);
         Display.setVSyncEnabled(this.u1.Q);
         Display.update();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   private void j(int var1, int var2) {
      this.vo = var1 <= 0 ? 1 : var1;
      this.vn = var2 <= 0 ? 1 : var2;
      if (this.u8 != null) {
         .i4 var3 = new .i4(this.u1, var1, var2);
         int var4 = var3.int();
         int var5 = var3.if();
         this.u8.for(this, var4, var5);
      }

   }

   public void h5() {
      if (this.uS > 0) {
         --this.uS;
      }

      this.uG.a("stats");
      this.uP.if();
      this.uG.do("gui");
      if (!this.vc) {
         this.u4.c2();
      }

      this.uG.do("pick");
      this.u6.new(1.0F);
      this.uG.do("gameMode");
      if (!this.vc && this.vm != null) {
         this.vp.if();
      }

      this.vb.for("/terrain.png");
      this.uG.do("textures");
      if (!this.vc) {
         this.vb.int();
      }

      if (this.u8 == null && this.vk != null) {
         if (this.vk.cd() <= 0) {
            this.a((.i5)null);
         } else if (this.vk.cg() && this.vm != null) {
            this.a((.i5)(new .jm()));
         }
      } else if (this.u8 != null && this.u8 instanceof .jm && !this.vk.cg()) {
         this.a((.i5)null);
      }

      if (this.u8 != null) {
         this.un = 10000;
      }

      .aqh var1;
      .apu var2;
      if (this.u8 != null) {
         try {
            this.u8.dz();
         } catch (Throwable var8) {
            var1 = .aqh.a(var8, "Updating screen events");
            var2 = var1.a("Affected screen");
            var2.a((String)"Screen name", (Callable)(new .kr(this)));
            throw new .ape(var1);
         }

         if (this.u8 != null) {
            try {
               this.u8.hQ.cZ();
            } catch (Throwable var7) {
               var1 = .aqh.a(var7, "Ticking screen particles");
               var2 = var1.a("Affected screen");
               var2.a((String)"Screen name", (Callable)(new .kq(this)));
               throw new .ape(var1);
            }

            try {
               this.u8.dG();
            } catch (Throwable var6) {
               var1 = .aqh.a(var6, "Ticking screen");
               var2 = var1.a("Affected screen");
               var2.a((String)"Screen name", (Callable)(new .kp(this)));
               throw new .ape(var1);
            }
         }
      }

      if (this.u8 == null || this.u8.hS) {
         this.uG.do("mouse");

         while(Mouse.next()) {
            .k2.a(Mouse.getEventButton() - 100, Mouse.getEventButtonState());
            if (Mouse.getEventButtonState()) {
               .k2.a(Mouse.getEventButton() - 100);
            }

            long var3 = h1() - this.uJ;
            if (var3 <= 200L) {
               int var5 = Mouse.getEventDWheel();
               if (var5 != 0) {
                  this.vk.fR.goto(var5);
                  if (this.u1.bj) {
                     if (var5 > 0) {
                        var5 = 1;
                     }

                     if (var5 < 0) {
                        var5 = -1;
                     }

                     .ke var10000 = this.u1;
                     var10000.be += (float)var5 * 0.25F;
                  }
               }

               if (this.u8 == null) {
                  if (!this.uL && Mouse.getEventButtonState()) {
                     this.ik();
                  }
               } else if (this.u8 != null) {
                  this.u8.dw();
               }
            }
         }

         if (this.un > 0) {
            --this.un;
         }

         this.uG.do("keyboard");

         label436:
         while(true) {
            while(true) {
               boolean var10;
               do {
                  if (!Keyboard.next()) {
                     var10 = this.u1.ab != 2;

                     while(this.u1.aF.do()) {
                        this.a((.i5)(new .hz(this.vk)));
                     }

                     while(this.u1.aE.do()) {
                        this.vk.f(.i5.dC());
                     }

                     while(this.u1.aD.do() && var10) {
                        this.a((.i5)(new .j3()));
                     }

                     if (this.u8 == null && this.u1.ax.do() && var10) {
                        this.a((.i5)(new .j3("/")));
                     }

                     if (this.vk.cx()) {
                        if (!this.u1.aA.for) {
                           this.vp.if(this.vk);
                        }

                        while(this.u1.aB.do()) {
                        }

                        while(true) {
                           if (!this.u1.aA.do()) {
                              while(this.u1.ay.do()) {
                              }
                              break;
                           }
                        }
                     } else {
                        while(this.u1.aB.do()) {
                           this.aW(0);
                        }

                        while(this.u1.aA.do()) {
                           this.aW(1);
                        }

                        while(this.u1.ay.do()) {
                           this.h8();
                        }
                     }

                     if (this.u1.aA.for && this.uS == 0 && !this.vk.cx()) {
                        this.aW(1);
                     }

                     this.do(0, this.u8 == null && this.u1.aB.for && this.uL);
                     break label436;
                  }

                  .k2.a(Keyboard.getEventKey(), Keyboard.getEventKeyState());
                  if (Keyboard.getEventKeyState()) {
                     .k2.a(Keyboard.getEventKey());
                  }

                  if (this.uD > 0L) {
                     if (h1() - this.uD >= 6000L) {
                        throw new .ape(new .aqh("Manually triggered debug crash", new Throwable()));
                     }

                     if (!Keyboard.isKeyDown(46) || !Keyboard.isKeyDown(61)) {
                        this.uD = -1L;
                     }
                  } else if (Keyboard.isKeyDown(46) && Keyboard.isKeyDown(61)) {
                     this.uD = h1();
                  }
               } while(!Keyboard.getEventKeyState());

               if (Keyboard.getEventKey() == 87) {
                  this.hN();
               } else {
                  if (this.u8 != null) {
                     this.u8.dB();
                  } else {
                     if (Keyboard.getEventKey() == 1) {
                        this.ic();
                     }

                     if (Keyboard.getEventKey() == 31 && Keyboard.isKeyDown(61)) {
                        this.hS();
                     }

                     if (Keyboard.getEventKey() == 20 && Keyboard.isKeyDown(61)) {
                        this.vb.new();
                        this.vl.case();
                     }

                     if (Keyboard.getEventKey() == 33 && Keyboard.isKeyDown(61)) {
                        var10 = Keyboard.isKeyDown(42) | Keyboard.isKeyDown(54);
                        this.u1.a(.kc.K, var10 ? -1 : 1);
                     }

                     if (Keyboard.getEventKey() == 30 && Keyboard.isKeyDown(61)) {
                        this.vl.case();
                     }

                     if (Keyboard.getEventKey() == 35 && Keyboard.isKeyDown(61)) {
                        this.u1.O = !this.u1.O;
                        this.u1.new();
                     }

                     if (Keyboard.getEventKey() == 48 && Keyboard.isKeyDown(61)) {
                        .cl.do = !.cl.do;
                     }

                     if (Keyboard.getEventKey() == 25 && Keyboard.isKeyDown(61)) {
                        this.u1.N = !this.u1.N;
                        this.u1.new();
                     }

                     if (Keyboard.getEventKey() == 59) {
                        this.u1.as = !this.u1.as;
                     }

                     if (Keyboard.getEventKey() == 61) {
                        this.u1.bn = !this.u1.bn;
                        this.u1.bm = .i5.dE();
                     }

                     if (Keyboard.getEventKey() == 63) {
                        ++this.u1.bo;
                        if (this.u1.bo > 2) {
                           this.u1.bo = 0;
                        }
                     }

                     if (Keyboard.getEventKey() == 66) {
                        this.u1.bh = !this.u1.bh;
                     }
                  }

                  int var4;
                  for(var4 = 0; var4 < 9; ++var4) {
                     if (Keyboard.getEventKey() == 2 + var4) {
                        this.vk.fR.aa = var4;
                     }
                  }

                  if (this.u1.bn && this.u1.bm) {
                     if (Keyboard.getEventKey() == 11) {
                        this.aX(0);
                     }

                     for(var4 = 0; var4 < 9; ++var4) {
                        if (Keyboard.getEventKey() == 2 + var4) {
                           this.aX(var4 + 1);
                        }
                     }
                  }
               }
            }
         }
      }

      if (this.vm != null) {
         if (this.vk != null) {
            ++this.uK;
            if (this.uK == 30) {
               this.uK = 0;
               this.vm.byte(this.vk);
            }
         }

         this.uG.do("gameRenderer");
         if (!this.vc) {
            this.u6.new();
         }

         this.uG.do("levelRenderer");
         if (!this.vc) {
            this.vl.for();
         }

         this.uG.do("level");
         if (!this.vc) {
            if (this.vm.q > 0) {
               --this.vm.q;
            }

            this.vm.p();
         }

         if (!this.vc) {
            this.vm.a(this.vm.p > 0, true);

            try {
               this.vm.d();
            } catch (Throwable var9) {
               var1 = .aqh.a(var9, "Exception in world tick");
               if (this.vm == null) {
                  var2 = var1.a("Affected level");
                  var2.a((String)"Problem", (Object)"Level is null!");
               } else {
                  this.vm.a(var1);
               }

               throw new .ape(var1);
            }
         }

         this.uG.do("animateTick");
         if (!this.vc && this.vm != null) {
            this.vm.t(.ajs.a(this.vk.al), .ajs.a(this.vk.ak), .ajs.a(this.vk.aj));
         }

         this.uG.do("particles");
         if (!this.vc) {
            this.vh.if();
         }
      } else if (this.uH != null) {
         this.uG.do("pendingConnection");
         this.uH.if();
      }

      this.uG.if();
      this.uJ = h1();
   }

   private void hS() {
      this.a().a("FORCING RELOAD!");
      if (this.uX != null) {
         this.uX.a();
      }

      this.uX = new .aa();
      this.uX.a(this.u1);
      this.uo.if();
   }

   public void a(String var1, String var2, .y0 var3) {
      this.a((.ex)null);
      System.gc();
      .si var4 = this.uW.a(var1, false);
      .ss var5 = var4.int();
      if (var5 == null && var3 != null) {
         this.uP.a(.aka.o, 1);
         var5 = new .ss(var3, var1);
         var4.a(var5);
      }

      if (var3 == null) {
         var3 = new .y0(var5);
      }

      this.uP.a(.aka.p, 1);
      this.uZ = new .av(this, var1, var2, var3);
      this.uZ.hn();
      this.uF = true;
      this.u7.l(.aqz.if("menu.loadingLevel"));

      while(!this.uZ.gI()) {
         String var6 = this.uZ.hm();
         if (var6 != null) {
            this.u7.n(.aqz.if(var6));
         } else {
            this.u7.n("");
         }

         try {
            Thread.sleep(200L);
         } catch (InterruptedException var9) {
         }
      }

      this.a((.i5)null);

      try {
         .e5 var10 = new .e5(this, this.uZ);
         this.uH = var10.byte();
      } catch (IOException var8) {
         this.int(this.new(new .aqh("Connecting to integrated server", var8)));
      }

   }

   public void a(.ex var1) {
      this.a(var1, "");
   }

   public void a(.ex var1, String var2) {
      this.uP.do();
      if (var1 == null) {
         .e5 var3 = this.hU();
         if (var3 != null) {
            var3.case();
         }

         if (this.uH != null) {
            this.uH.a();
         }

         if (this.uZ != null) {
            this.uZ.ha();
         }

         this.uZ = null;
      }

      this.vj = null;
      this.uH = null;
      if (this.u7 != null) {
         this.u7.m(var2);
         this.u7.n("");
      }

      if (var1 == null && this.vm != null) {
         if (this.uT.for()) {
            this.uT.byte();
         }

         this.for((.eq)null);
         this.uF = false;
      }

      this.uX.if((String)null, 0.0F, 0.0F, 0.0F);
      this.uX.a();
      this.vm = var1;
      if (var1 != null) {
         if (this.vl != null) {
            this.vl.a(var1);
         }

         if (this.vh != null) {
            this.vh.a((.y6)var1);
         }

         if (this.vk == null) {
            this.vk = this.vp.a((.y6)var1);
            this.vp.a((.aek)this.vk);
         }

         this.vk.ay();
         var1.new(this.vk);
         this.vk.gt = new .dr(this.u1);
         this.vp.do(this.vk);
         this.vj = this.vk;
      } else {
         this.uW.a();
         this.vk = null;
      }

      System.gc();
      this.uJ = 0L;
   }

   public void a(String var1, File var2) {
      int var3 = var1.indexOf("/");
      String var4 = var1.substring(0, var3);
      var1 = var1.substring(var3 + 1);
      if (var4.equalsIgnoreCase("sound3")) {
         this.uX.if(var1, var2);
      } else if (var4.equalsIgnoreCase("streaming")) {
         this.uX.do(var1, var2);
      } else if (!var4.equalsIgnoreCase("music") && !var4.equalsIgnoreCase("newmusic")) {
         if (var4.equalsIgnoreCase("lang")) {
            .aqy.if().a(var1, var2);
         }
      } else {
         this.uX.a(var1, var2);
      }

   }

   public String hR() {
      return this.vl.int();
   }

   public String id() {
      return this.vl.a();
   }

   public String hW() {
      return this.vm.e();
   }

   public String ii() {
      return "P: " + this.vh.a() + ". T: " + this.vm.h();
   }

   public void aV(int var1) {
      this.vm.else();
      this.vm.M();
      int var2 = 0;
      if (this.vk != null) {
         var2 = this.vk.av;
         this.vm.a((.aiw)this.vk);
      }

      this.vj = null;
      this.vk = this.vp.a((.y6)this.vm);
      this.vk.a6 = var1;
      this.vj = this.vk;
      this.vk.ay();
      this.vm.new(this.vk);
      this.vp.a((.aek)this.vk);
      this.vk.gt = new .dr(this.u1);
      this.vk.av = var2;
      this.vp.do(this.vk);
      if (this.u8 instanceof .jx) {
         this.a((.i5)null);
      }

   }

   void U(boolean var1) {
      this.uI = var1;
   }

   public final boolean h6() {
      return this.uI;
   }

   public .e5 hU() {
      return this.vk != null ? this.vk.gF : null;
   }

   public static void main(String[] var0) {
      HashMap var1 = new HashMap();
      boolean var2 = false;
      boolean var3 = true;
      boolean var4 = false;
      String var5 = "Misterx38";
      String var6 = var5;
      if (var0.length > 0) {
         var6 = var0[0];
      }

      String var7 = "-";
      if (var0.length > 1) {
         var7 = var0[1];
      }

      ArrayList var8 = new ArrayList();

      for(int var9 = 2; var9 < var0.length; ++var9) {
         String var10 = var0[var9];
         String var11 = var9 == var0.length - 1 ? null : var0[var9 + 1];
         boolean var12 = false;
         if (!var10.equals("-demo") && !var10.equals("--demo")) {
            if (var10.equals("--applet")) {
               var3 = false;
            } else if (var10.equals("--password") && var11 != null) {
               String[] var13 = .aj3.a((.ajw)null, var6, var11);
               if (var13 != null) {
                  var6 = var13[0];
                  var7 = var13[1];
                  var8.add("Logged in insecurely as " + var6);
               } else {
                  var8.add("Could not log in as " + var6 + " with given password");
               }

               var12 = true;
            }
         } else {
            var2 = true;
         }

         if (var12) {
            ++var9;
         }
      }

      if (var6.contains("@") && var7.length() <= 1) {
         var6 = var5;
      }

      var1.put("demo", "" + var2);
      var1.put("stand-alone", "" + var3);
      var1.put("username", var6);
      var1.put("fullscreen", "" + var4);
      var1.put("sessionid", var7);
      Frame var15 = new Frame();
      var15.setTitle("Minecraft");
      var15.setBackground(Color.BLACK);
      JPanel var16 = new JPanel();
      var15.setLayout(new BorderLayout());
      var16.setPreferredSize(new Dimension(982, 608));
      var15.add(var16, "Center");
      var15.pack();
      var15.setLocationRelativeTo((Component)null);
      var15.setVisible(true);
      var15.addWindowListener(new .kn());
      .avk var17 = new .avk(var1);
      MinecraftApplet var18 = new MinecraftApplet();
      var18.setStub(var17);
      var17.setLayout(new BorderLayout());
      var17.add(var18, "Center");
      var17.validate();
      var15.removeAll();
      var15.setLayout(new BorderLayout());
      var15.add(var17, "Center");
      var15.validate();
      var18.init();
      Iterator var19 = var8.iterator();

      while(var19.hasNext()) {
         String var14 = (String)var19.next();
         ih().a().a(var14);
      }

      var18.start();
      Runtime.getRuntime().addShutdownHook(new .km());
   }

   public static boolean hY() {
      return uu == null || !uu.u1.as;
   }

   public static boolean ie() {
      return uu != null && uu.u1.ag;
   }

   public static boolean hP() {
      return uu != null && uu.u1.af != 0;
   }

   public boolean T(String var1) {
      return !var1.startsWith("/") ? false : false;
   }

   private void h8() {
      if (this.u2 != null) {
         boolean var1 = this.vk.fY.new;
         int var2 = 0;
         boolean var3 = false;
         int var4;
         int var5;
         if (this.u2.if == .ns.if) {
            var5 = this.u2.a;
            int var11 = this.u2.try;
            int var7 = this.u2.new;
            .pa var8 = .pa.x[this.vm.new(var5, var11, var7)];
            if (var8 == null) {
               return;
            }

            var4 = var8.do((.y6)this.vm, var5, var11, var7);
            if (var4 == 0) {
               return;
            }

            var3 = .abr.ai[var4].b();
            int var9 = var4 < 256 && !.pa.x[var8.void].for() ? var4 : var8.void;
            var2 = .pa.x[var9].a((.y6)this.vm, var5, var11, var7);
         } else {
            if (this.u2.if != .ns.a || this.u2.do == null || !var1) {
               return;
            }

            if (this.u2.do instanceof .ah7) {
               var4 = .abr.bq.A;
            } else if (this.u2.do instanceof .aih) {
               .aih var6 = (.aih)this.u2.do;
               if (var6.fU() == null) {
                  var4 = .abr.bN.A;
               } else {
                  var4 = var6.fU().new;
                  var2 = var6.fU().new();
                  var3 = true;
               }
            } else if (this.u2.do instanceof .afj) {
               .afj var10 = (.afj)this.u2.do;
               if (var10.f3() == 2) {
                  var4 = .abr.ci.A;
               } else if (var10.f3() == 1) {
                  var4 = .abr.ck.A;
               } else if (var10.f3() == 3) {
                  var4 = .abr.af.A;
               } else if (var10.f3() == 5) {
                  var4 = .abr.ad.A;
               } else {
                  var4 = .abr.cy.A;
               }
            } else if (this.u2.do instanceof .afm) {
               var4 = .abr.ct.A;
            } else {
               var4 = .abr.bZ.A;
               var2 = .air.a(this.u2.do);
               var3 = true;
               if (var2 <= 0 || !.air.if.containsKey(var2)) {
                  return;
               }
            }
         }

         this.vk.fR.a(var4, var2, var3, var1);
         if (var1) {
            var5 = this.vk.fQ.try.size() - 9 + this.vk.fR.aa;
            this.vp.a(this.vk.fR.do(this.vk.fR.aa), var5);
         }
      }

   }

   public .aqh new(.aqh var1) {
      var1.for().a((String)"LWJGL", (Callable)(new .kl(this)));
      var1.for().a((String)"OpenGL", (Callable)(new .kk(this)));
      var1.for().a((String)"Is Modded", (Callable)(new .ky(this)));
      var1.for().a((String)"Type", (Callable)(new .kx(this)));
      var1.for().a((String)"Texture Pack", (Callable)(new .kw(this)));
      var1.for().a((String)"Profiler Position", (Callable)(new .kv(this)));
      var1.for().a((String)"Vec3 Pool Size", (Callable)(new .ku(this)));
      if (this.vm != null) {
         this.vm.a(var1);
      }

      return var1;
   }

   public static Minecraft ih() {
      return uu;
   }

   public void ij() {
      this.uQ = true;
   }

   public void if(.aja var1) {
      var1.a("fps", uU);
      var1.a("texpack_name", this.uT.int().do());
      var1.a("vsync_enabled", this.u1.Q);
      var1.a("display_frequency", Display.getDisplayMode().getFrequency());
      var1.a("display_type", this.ut ? "fullscreen" : "windowed");
      if (this.uZ != null && this.uZ.gZ() != null) {
         var1.a("snooper_partner", this.uZ.gZ().if());
      }

   }

   public void a(.aja var1) {
      var1.a("opengl_version", GL11.glGetString(7938));
      var1.a("opengl_vendor", GL11.glGetString(7936));
      var1.a("client_brand", net.minecraft.client.a.a());
      var1.a("applet", this.vd);
      ContextCapabilities var2 = GLContext.getCapabilities();
      var1.a("gl_caps[ARB_multitexture]", var2.GL_ARB_multitexture);
      var1.a("gl_caps[ARB_multisample]", var2.GL_ARB_multisample);
      var1.a("gl_caps[ARB_texture_cube_map]", var2.GL_ARB_texture_cube_map);
      var1.a("gl_caps[ARB_vertex_blend]", var2.GL_ARB_vertex_blend);
      var1.a("gl_caps[ARB_matrix_palette]", var2.GL_ARB_matrix_palette);
      var1.a("gl_caps[ARB_vertex_program]", var2.GL_ARB_vertex_program);
      var1.a("gl_caps[ARB_vertex_shader]", var2.GL_ARB_vertex_shader);
      var1.a("gl_caps[ARB_fragment_program]", var2.GL_ARB_fragment_program);
      var1.a("gl_caps[ARB_fragment_shader]", var2.GL_ARB_fragment_shader);
      var1.a("gl_caps[ARB_shader_objects]", var2.GL_ARB_shader_objects);
      var1.a("gl_caps[ARB_vertex_buffer_object]", var2.GL_ARB_vertex_buffer_object);
      var1.a("gl_caps[ARB_framebuffer_object]", var2.GL_ARB_framebuffer_object);
      var1.a("gl_caps[ARB_pixel_buffer_object]", var2.GL_ARB_pixel_buffer_object);
      var1.a("gl_caps[ARB_uniform_buffer_object]", var2.GL_ARB_uniform_buffer_object);
      var1.a("gl_caps[ARB_texture_non_power_of_two]", var2.GL_ARB_texture_non_power_of_two);
      var1.a("gl_caps[gl_max_vertex_uniforms]", GL11.glGetInteger(35658));
      var1.a("gl_caps[gl_max_fragment_uniforms]", GL11.glGetInteger(35657));
      var1.a("gl_max_texture_size", h0());
   }

   public static int h0() {
      for(int var0 = 16384; var0 > 0; var0 >>= 1) {
         GL11.glTexImage2D(32868, 0, 6408, var0, var0, 0, 6408, 5121, (ByteBuffer)null);
         int var1 = GL11.glGetTexLevelParameteri(32868, 0, 4096);
         if (var1 != 0) {
            return var0;
         }
      }

      return -1;
   }

   public boolean if() {
      return this.u1.T;
   }

   public void for(.eq var1) {
      this.uv = var1;
   }

   public .eq il() {
      return this.uv;
   }

   public boolean hT() {
      return this.uF;
   }

   public boolean h9() {
      return this.uF && this.uZ != null;
   }

   public .av hV() {
      return this.uZ;
   }

   public static void h3() {
      if (uu != null) {
         .av var0 = uu.hV();
         if (var0 != null) {
            var0.g7();
         }
      }

   }

   public .aja ip() {
      return this.up;
   }

   public static long h1() {
      return Sys.getTime() * 1000L / Sys.getTimerResolution();
   }

   public boolean ib() {
      return this.ut;
   }

   public .ajw a() {
      return this.uw;
   }
}
