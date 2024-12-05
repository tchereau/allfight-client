import java.awt.Color;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class jp extends jo {
   private static final cb g2 = new cb();
   private final Random g1 = new Random();
   private final Minecraft g0;
   private final j5 gZ;
   private int gY = 0;
   private String gX = "";
   private int gW = 0;
   private boolean gV = false;
   public float g3 = 1.0F;
   private int gU;
   private abp gT;

   public jp(Minecraft var1) {
      this.g0 = var1;
      this.gZ = new j5(var1);
   }

   public void a(float var1, boolean var2, int var3, int var4) {
      i4 var5 = new i4(this.g0.u1, this.g0.vo, this.g0.vn);
      int var6 = var5.int();
      int var7 = var5.if();
      jq var8 = this.g0.va;
      this.g0.u6.try();
      GL11.glEnable(3042);
      if (Minecraft.ie()) {
         this.do(this.g0.vk.int(var1), var6, var7);
      } else {
         GL11.glBlendFunc(770, 771);
      }

      abp var9 = this.g0.vk.fR.long(3);
      if (this.g0.u1.bo == 0 && var9 != null && var9.new == pa.aW.void) {
         this.byte(var6, var7);
      }

      if (!this.g0.vk.if(ai0.q)) {
         float var10 = this.g0.vk.gu + (this.g0.vk.gi - this.g0.vk.gu) * var1;
         if (var10 > 0.0F) {
            this.if(var10, var6, var7);
         }
      }

      boolean var11;
      int var12;
      int var13;
      int var16;
      int var17;
      int var18;
      int var20;
      int var22;
      int var23;
      int var24;
      int var26;
      byte var27;
      int var47;
      int var52;
      if (!this.g0.vp.new()) {
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.g0.vb.for("/gui/gui.png");
         aen var31 = this.g0.vk.fR;
         this.gH = -90.0F;
         this.if(var6 / 2 - 91, var7 - 22, 0, 0, 182, 22);
         this.if(var6 / 2 - 91 - 1 + var31.aa * 20, var7 - 22 - 1, 0, 22, 24, 22);
         this.g0.vb.for("/gui/icons.png");
         GL11.glEnable(3042);
         GL11.glBlendFunc(775, 769);
         this.if(var6 / 2 - 7, var7 / 2 - 7, 0, 0, 16, 16);
         GL11.glDisable(3042);
         var11 = this.g0.vk.bi / 3 % 2 == 1;
         if (this.g0.vk.bi < 10) {
            var11 = false;
         }

         var12 = this.g0.vk.cd();
         var13 = this.g0.vk.fh;
         this.g1.setSeed((long)(this.gY * 312871));
         boolean var14 = false;
         ad2 var15 = this.g0.vk.cA();
         var16 = var15.for();
         var17 = var15.do();
         this.g0.uG.a("bossHealth");
         this.c4();
         this.g0.uG.if();
         int var19;
         if (this.g0.vp.byte()) {
            var18 = var6 / 2 - 91;
            var19 = var6 / 2 + 91;
            this.g0.uG.a("expBar");
            var20 = this.g0.vk.cU();
            if (var20 > 0) {
               short var21 = 182;
               var22 = (int)(this.g0.vk.fV * (float)(var21 + 1));
               var23 = var7 - 32 + 3;
               this.if(var18, var23, 0, 64, var21, 5);
               if (var22 > 0) {
                  this.if(var18, var23, 0, 69, var22, 5);
               }
            }

            var47 = var7 - 39;
            var22 = var47 - 10;
            var23 = this.g0.vk.by();
            var24 = -1;
            if (this.g0.vk.if(ai0.p)) {
               var24 = this.gY % 25;
            }

            this.g0.uG.do("healthArmor");

            int var25;
            int var28;
            int var29;
            for(var25 = 0; var25 < 10; ++var25) {
               if (var23 > 0) {
                  var26 = var18 + var25 * 8;
                  if (var25 * 2 + 1 < var23) {
                     this.if(var26, var22, 34, 9, 9, 9);
                  }

                  if (var25 * 2 + 1 == var23) {
                     this.if(var26, var22, 25, 9, 9, 9);
                  }

                  if (var25 * 2 + 1 > var23) {
                     this.if(var26, var22, 16, 9, 9, 9);
                  }
               }

               var26 = 16;
               if (this.g0.vk.if(ai0.g)) {
                  var26 += 36;
               } else if (this.g0.vk.if(ai0.f)) {
                  var26 += 72;
               }

               var27 = 0;
               if (var11) {
                  var27 = 1;
               }

               var28 = var18 + var25 * 8;
               var29 = var47;
               if (var12 <= 4) {
                  var29 = var47 + this.g1.nextInt(2);
               }

               if (var25 == var24) {
                  var29 -= 2;
               }

               byte var30 = 0;
               if (this.g0.vm.l().void()) {
                  var30 = 5;
               }

               this.if(var28, var29, 16 + var27 * 9, 9 * var30, 9, 9);
               if (var11) {
                  if (var25 * 2 + 1 < var13) {
                     this.if(var28, var29, var26 + 54, 9 * var30, 9, 9);
                  }

                  if (var25 * 2 + 1 == var13) {
                     this.if(var28, var29, var26 + 63, 9 * var30, 9, 9);
                  }
               }

               if (var25 * 2 + 1 < var12) {
                  this.if(var28, var29, var26 + 36, 9 * var30, 9, 9);
               }

               if (var25 * 2 + 1 == var12) {
                  this.if(var28, var29, var26 + 45, 9 * var30, 9, 9);
               }
            }

            this.g0.uG.do("food");

            for(var25 = 0; var25 < 10; ++var25) {
               var26 = var47;
               var52 = 16;
               byte var53 = 0;
               if (this.g0.vk.if(ai0.i)) {
                  var52 += 36;
                  var53 = 13;
               }

               if (this.g0.vk.cA().a() <= 0.0F && this.gY % (var16 * 3 + 1) == 0) {
                  var26 = var47 + (this.g1.nextInt(3) - 1);
               }

               if (var14) {
                  var53 = 1;
               }

               var29 = var19 - var25 * 8 - 9;
               this.if(var29, var26, 16 + var53 * 9, 27, 9, 9);
               if (var14) {
                  if (var25 * 2 + 1 < var17) {
                     this.if(var29, var26, var52 + 54, 27, 9, 9);
                  }

                  if (var25 * 2 + 1 == var17) {
                     this.if(var29, var26, var52 + 63, 27, 9, 9);
                  }
               }

               if (var25 * 2 + 1 < var16) {
                  this.if(var29, var26, var52 + 36, 27, 9, 9);
               }

               if (var25 * 2 + 1 == var16) {
                  this.if(var29, var26, var52 + 45, 27, 9, 9);
               }
            }

            this.g0.uG.do("air");
            if (this.g0.vk.a(ts.s)) {
               var25 = this.g0.vk.Z();
               var26 = ajs.new((double)(var25 - 2) * 10.0D / 300.0D);
               var52 = ajs.new((double)var25 * 10.0D / 300.0D) - var26;

               for(var28 = 0; var28 < var26 + var52; ++var28) {
                  if (var28 < var26) {
                     this.if(var19 - var28 * 8 - 9, var22, 16, 18, 9, 9);
                  } else {
                     this.if(var19 - var28 * 8 - 9, var22, 25, 18, 9, 9);
                  }
               }
            }

            this.g0.uG.if();
         }

         GL11.glDisable(3042);
         this.g0.uG.a("actionBar");
         GL11.glEnable(32826);
         k1.a();

         for(var18 = 0; var18 < 9; ++var18) {
            var19 = var6 / 2 - 90 + var18 * 20 + 2;
            var20 = var7 - 16 - 3;
            this.a(var18, var19, var20, var1);
         }

         k1.do();
         GL11.glDisable(32826);
         this.g0.uG.if();
      }

      float var33;
      if (this.g0.vk.cS() > 0) {
         this.g0.uG.a("sleep");
         GL11.glDisable(2929);
         GL11.glDisable(3008);
         int var32 = this.g0.vk.cS();
         var33 = (float)var32 / 100.0F;
         if (var33 > 1.0F) {
            var33 = 1.0F - (float)(var32 - 100) / 10.0F;
         }

         var12 = (int)(220.0F * var33) << 24 | 1052704;
         a(0, 0, var6, var7, var12);
         GL11.glEnable(3008);
         GL11.glEnable(2929);
         this.g0.uG.if();
      }

      int var36;
      int var40;
      if (this.g0.vp.do() && this.g0.vk.fX > 0) {
         this.g0.uG.a("expLevel");
         var11 = false;
         var12 = var11 ? 16777215 : 8453920;
         String var34 = "" + this.g0.vk.fX;
         var36 = (var6 - var8.for(var34)) / 2;
         var40 = var7 - 31 - 4;
         var8.if(var34, var36 + 1, var40, 0);
         var8.if(var34, var36 - 1, var40, 0);
         var8.if(var34, var36, var40 + 1, 0);
         var8.if(var34, var36, var40 - 1, 0);
         var8.if(var34, var36, var40, var12);
         this.g0.uG.if();
      }

      String var35;
      if (this.g0.u1.aS) {
         this.g0.uG.a("toolHighlight");
         if (this.gU > 0 && this.gT != null) {
            var35 = this.gT.void();
            var12 = (var6 - var8.for(var35)) / 2;
            var13 = var7 - 59;
            if (!this.g0.vp.byte()) {
               var13 += 14;
            }

            var36 = (int)((float)this.gU * 256.0F / 10.0F);
            if (var36 > 255) {
               var36 = 255;
            }

            if (var36 > 0) {
               GL11.glPushMatrix();
               GL11.glEnable(3042);
               GL11.glBlendFunc(770, 771);
               var8.a(var35, var12, var13, 16777215 + (var36 << 24));
               GL11.glDisable(3042);
               GL11.glPopMatrix();
            }
         }

         this.g0.uG.if();
      }

      if (this.g0.h6()) {
         this.g0.uG.a("demo");
         var35 = "";
         if (this.g0.vm.m() >= 120500L) {
            var35 = aqz.if("demo.demoExpired");
         } else {
            var35 = String.format(aqz.if("demo.remainingTime"), ajm.a((int)(120500L - this.g0.vm.m())));
         }

         var12 = var8.for(var35);
         var8.a(var35, var6 - var12 - 10, 5, 16777215);
         this.g0.uG.if();
      }

      if (this.g0.u1.bn) {
         this.g0.uG.a("debug");
         GL11.glPushMatrix();
         var8.a("Minecraft 1.5.1 (" + this.g0.uC + ")", 2, 2, 16777215);
         var8.a(this.g0.hR(), 2, 12, 16777215);
         var8.a(this.g0.id(), 2, 22, 16777215);
         var8.a(this.g0.ii(), 2, 32, 16777215);
         var8.a(this.g0.hW(), 2, 42, 16777215);
         long var39 = Runtime.getRuntime().maxMemory();
         long var37 = Runtime.getRuntime().totalMemory();
         long var41 = Runtime.getRuntime().freeMemory();
         long var44 = var37 - var41;
         String var45 = "Used memory: " + var44 * 100L / var39 + "% (" + var44 / 1024L / 1024L + "MB) of " + var39 / 1024L / 1024L + "MB";
         this.if(var8, var45, var6 - var8.for(var45) - 2, 2, 14737632);
         var45 = "Allocated memory: " + var37 * 100L / var39 + "% (" + var37 / 1024L / 1024L + "MB)";
         this.if(var8, var45, var6 - var8.for(var45) - 2, 12, 14737632);
         var47 = ajs.a(this.g0.vk.al);
         var22 = ajs.a(this.g0.vk.ak);
         var23 = ajs.a(this.g0.vk.aj);
         this.if(var8, String.format("x: %.5f (%d) // c: %d (%d)", this.g0.vk.al, var47, var47 >> 4, var47 & 15), 2, 64, 14737632);
         this.if(var8, String.format("y: %.3f (feet pos, %.3f eyes pos)", this.g0.vk.aZ.a, this.g0.vk.ak), 2, 72, 14737632);
         this.if(var8, String.format("z: %.5f (%d) // c: %d (%d)", this.g0.vk.aj, var23, var23 >> 4, var23 & 15), 2, 80, 14737632);
         var24 = ajs.a((double)(this.g0.vk.a5 * 4.0F / 360.0F) + 0.5D) & 3;
         this.if(var8, "f: " + var24 + " (" + apk.try[var24] + ") / " + ajs.int(this.g0.vk.a5), 2, 88, 14737632);
         if (this.g0.vm != null && this.g0.vm.p(var47, var22, var23)) {
            xx var50 = this.g0.vm.try(var47, var23);
            this.if(var8, "lc: " + (var50.long() + 15) + " b: " + var50.a(var47 & 15, var23 & 15, this.g0.vm.void()).i + " bl: " + var50.a(yw.a, var47 & 15, var22, var23 & 15) + " sl: " + var50.a(yw.if, var47 & 15, var22, var23 & 15) + " rl: " + var50.do(var47 & 15, var22, var23 & 15, 0), 2, 96, 14737632);
         }

         this.if(var8, String.format("ws: %.3f, fs: %.3f, g: %b, fl: %d", this.g0.vk.fY.if(), this.g0.vk.fY.a(), this.g0.vk.aY, this.g0.vm.do(var47, var23)), 2, 104, 14737632);
         GL11.glPopMatrix();
         this.g0.uG.if();
      }

      if (this.gW > 0) {
         this.g0.uG.a("overlayMessage");
         var33 = (float)this.gW - var1;
         var12 = (int)(var33 * 256.0F / 20.0F);
         if (var12 > 255) {
            var12 = 255;
         }

         if (var12 > 0) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(var6 / 2), (float)(var7 - 48), 0.0F);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            var13 = 16777215;
            if (this.gV) {
               var13 = Color.HSBtoRGB(var33 / 50.0F, 0.7F, 0.6F) & 16777215;
            }

            var8.if(this.gX, -var8.for(this.gX) / 2, -4, var13 + (var12 << 24));
            GL11.glDisable(3042);
            GL11.glPopMatrix();
         }

         this.g0.uG.if();
      }

      np var42 = this.g0.vm.f().if(1);
      if (var42 != null) {
         this.a(var42, var7, var6, var8);
      }

      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3008);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, (float)(var7 - 48), 0.0F);
      this.g0.uG.a("chat");
      this.gZ.R(this.gY);
      this.g0.uG.if();
      GL11.glPopMatrix();
      var42 = this.g0.vm.f().if(0);
      if (this.g0.u1.az.for && (!this.g0.hT() || this.g0.vk.gF.z.size() > 1 || var42 != null)) {
         this.g0.uG.a("playerList");
         e5 var38 = this.g0.vk.gF;
         List var43 = var38.z;
         var36 = var38.y;
         var40 = var36;

         for(var16 = 1; var40 > 20; var40 = (var36 + var16 - 1) / var16) {
            ++var16;
         }

         var17 = 300 / var16;
         if (var17 > 150) {
            var17 = 150;
         }

         var18 = (var6 - var16 * var17) / 2;
         byte var46 = 10;
         a(var18 - 1, var46 - 1, var18 + var17 * var16, var46 + 9 * var40, Integer.MIN_VALUE);

         for(var20 = 0; var20 < var36; ++var20) {
            var47 = var18 + var20 % var16 * var17;
            var22 = var46 + var20 / var16 * 9;
            a(var47, var22, var47 + var17 - 1, var22 + 8, 553648127);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(3008);
            if (var20 < var43.size()) {
               et var48 = (et)var43.get(var20);
               no var49 = this.g0.vm.f().case(var48.if);
               String var51 = no.a(var49, var48.if);
               var8.a(var51, var47, var22, 16777215);
               if (var42 != null) {
                  var26 = var47 + var8.for(var51) + 5;
                  var52 = var47 + var17 - 12 - 5;
                  if (var52 - var26 > 5) {
                     nn var55 = var42.do().a(var48.if, var42);
                     String var57 = aqj.b + "" + var55.for();
                     var8.a(var57, var52 - var8.for(var57), var22, 16777215);
                  }
               }

               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               this.g0.vb.for("/gui/icons.png");
               byte var54 = 0;
               boolean var56 = false;
               if (var48.a < 0) {
                  var27 = 5;
               } else if (var48.a < 150) {
                  var27 = 0;
               } else if (var48.a < 300) {
                  var27 = 1;
               } else if (var48.a < 600) {
                  var27 = 2;
               } else if (var48.a < 1000) {
                  var27 = 3;
               } else {
                  var27 = 4;
               }

               this.gH += 100.0F;
               this.if(var47 + var17 - 12, var22, 0 + var54 * 10, 176 + var27 * 8, 10, 8);
               this.gH -= 100.0F;
            }
         }
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(2896);
      GL11.glEnable(3008);
   }

   private void a(np var1, int var2, int var3, jq var4) {
      nl var5 = var1.do();
      Collection var6 = var5.do(var1);
      if (var6.size() <= 15) {
         int var7 = var4.for(var1.for());

         String var11;
         for(Iterator var8 = var6.iterator(); var8.hasNext(); var7 = Math.max(var7, var4.for(var11))) {
            nn var9 = (nn)var8.next();
            no var10 = var5.case(var9.do());
            var11 = no.a(var10, var9.do()) + ": " + aqj.d + var9.for();
         }

         int var22 = var6.size() * var4.i;
         int var23 = var2 / 2 + var22 / 3;
         byte var24 = 3;
         int var25 = var3 - var7 - var24;
         int var12 = 0;
         Iterator var13 = var6.iterator();

         while(var13.hasNext()) {
            nn var14 = (nn)var13.next();
            ++var12;
            no var15 = var5.case(var14.do());
            String var16 = no.a(var15, var14.do());
            String var17 = aqj.d + "" + var14.for();
            int var19 = var23 - var12 * var4.i;
            int var20 = var3 - var24 + 2;
            a(var25 - 2, var19, var20, var19 + var4.i, 1342177280);
            var4.if(var16, var25, var19, 553648127);
            var4.if(var17, var20 - var4.for(var17), var19, 553648127);
            if (var12 == var6.size()) {
               String var21 = var1.for();
               a(var25 - 2, var19 - var4.i - 1, var20, var19 - 1, 1610612736);
               a(var25 - 2, var19 - 1, var20, var19, 1342177280);
               var4.if(var21, var25 + var7 / 2 - var4.for(var21) / 2, var19 - var4.i, 553648127);
            }
         }

      }
   }

   private void c4() {
      if (dn.for != null && dn.a > 0) {
         --dn.a;
         jq var1 = this.g0.va;
         i4 var2 = new i4(this.g0.u1, this.g0.vo, this.g0.vn);
         int var3 = var2.int();
         short var4 = 182;
         int var5 = var3 / 2 - var4 / 2;
         int var6 = (int)(dn.if * (float)(var4 + 1));
         byte var7 = 12;
         this.if(var5, var7, 0, 74, var4, 5);
         this.if(var5, var7, 0, 74, var4, 5);
         if (var6 > 0) {
            this.if(var5, var7, 0, 79, var6, 5);
         }

         String var8 = dn.for;
         var1.a(var8, var3 / 2 - var1.for(var8) / 2, var7 - 10, 16777215);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.g0.vb.for("/gui/icons.png");
      }
   }

   private void byte(int var1, int var2) {
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3008);
      this.g0.vb.for("%blur%/misc/pumpkinblur.png");
      c4 var3 = c4.G;
      var3.if();
      var3.a(0.0D, (double)var2, -90.0D, 0.0D, 1.0D);
      var3.a((double)var1, (double)var2, -90.0D, 1.0D, 1.0D);
      var3.a((double)var1, 0.0D, -90.0D, 1.0D, 0.0D);
      var3.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
      var3.for();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glEnable(3008);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void do(float var1, int var2, int var3) {
      var1 = 1.0F - var1;
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      this.g3 = (float)((double)this.g3 + (double)(var1 - this.g3) * 0.01D);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(0, 769);
      GL11.glColor4f(this.g3, this.g3, this.g3, 1.0F);
      this.g0.vb.for("%blur%/misc/vignette.png");
      c4 var4 = c4.G;
      var4.if();
      var4.a(0.0D, (double)var3, -90.0D, 0.0D, 1.0D);
      var4.a((double)var2, (double)var3, -90.0D, 1.0D, 1.0D);
      var4.a((double)var2, 0.0D, -90.0D, 1.0D, 0.0D);
      var4.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
      var4.for();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBlendFunc(770, 771);
   }

   private void if(float var1, int var2, int var3) {
      if (var1 < 1.0F) {
         var1 *= var1;
         var1 *= var1;
         var1 = var1 * 0.8F + 0.2F;
      }

      GL11.glDisable(3008);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, var1);
      this.g0.vb.for("/terrain.png");
      ajd var4 = pa.aK.do(1);
      float var5 = var4.a();
      float var6 = var4.int();
      float var7 = var4.byte();
      float var8 = var4.do();
      c4 var9 = c4.G;
      var9.if();
      var9.a(0.0D, (double)var3, -90.0D, (double)var5, (double)var8);
      var9.a((double)var2, (double)var3, -90.0D, (double)var7, (double)var8);
      var9.a((double)var2, 0.0D, -90.0D, (double)var7, (double)var6);
      var9.a(0.0D, 0.0D, -90.0D, (double)var5, (double)var6);
      var9.for();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glEnable(3008);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(int var1, int var2, int var3, float var4) {
      abp var5 = this.g0.vk.fR.V[var1];
      if (var5 != null) {
         float var6 = (float)var5.a - var4;
         if (var6 > 0.0F) {
            GL11.glPushMatrix();
            float var7 = 1.0F + var6 / 5.0F;
            GL11.glTranslatef((float)(var2 + 8), (float)(var3 + 12), 0.0F);
            GL11.glScalef(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
            GL11.glTranslatef((float)(-(var2 + 8)), (float)(-(var3 + 12)), 0.0F);
         }

         g2.a(this.g0.va, this.g0.vb, var5, var2, var3);
         if (var6 > 0.0F) {
            GL11.glPopMatrix();
         }

         g2.if(this.g0.va, this.g0.vb, var5, var2, var3);
      }
   }

   public void c2() {
      if (this.gW > 0) {
         --this.gW;
      }

      ++this.gY;
      if (this.g0.vk != null) {
         abp var1 = this.g0.vk.fR.L();
         if (var1 == null) {
            this.gU = 0;
         } else if (this.gT == null || var1.new != this.gT.new || !abp.a(var1, this.gT) || !var1.else() && var1.new() != this.gT.new()) {
            this.gU = 40;
         } else if (this.gU > 0) {
            --this.gU;
         }

         this.gT = var1;
      }

   }

   public void byte(String var1) {
      this.gX = "Now playing: " + var1;
      this.gW = 60;
      this.gV = true;
   }

   public j5 c5() {
      return this.gZ;
   }

   public int c3() {
      return this.gY;
   }
}
