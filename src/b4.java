import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class b4 extends ck {
   protected fx l;
   protected fx k;

   public b4(fx var1, float var2) {
      this.l = var1;
      this.for = var2;
   }

   public void a(fx var1) {
      this.k = var1;
   }

   private float if(float var1, float var2, float var3) {
      float var4;
      for(var4 = var2 - var1; var4 < -180.0F; var4 += 360.0F) {
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      return var1 + var3 * var4;
   }

   public void a(aig var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glDisable(2884);
      this.l.try = this.a(var1, var9);
      if (this.k != null) {
         this.k.try = this.l.try;
      }

      this.l.new = var1.N();
      if (this.k != null) {
         this.k.new = this.l.new;
      }

      this.l.for = var1.bG();
      if (this.k != null) {
         this.k.for = this.l.for;
      }

      try {
         float var10 = this.if(var1.eG, var1.eH, var9);
         float var11 = this.if(var1.fz, var1.fA, var9);
         float var12 = var1.a0 + (var1.a4 - var1.a0) * var9;
         this.a(var1, var2, var4, var6);
         float var13 = this.for(var1, var9);
         this.a(var1, var13, var10, var9);
         float var14 = 0.0625F;
         GL11.glEnable(32826);
         GL11.glScalef(-1.0F, -1.0F, 1.0F);
         this.int(var1, var9);
         GL11.glTranslatef(0.0F, -24.0F * var14 - 0.0078125F, 0.0F);
         float var15 = var1.ey + (var1.ex - var1.ey) * var9;
         float var16 = var1.ew - var1.ex * (1.0F - var9);
         if (var1.bG()) {
            var16 *= 3.0F;
         }

         if (var15 > 1.0F) {
            var15 = 1.0F;
         }

         GL11.glEnable(3008);
         this.l.a(var1, var16, var15, var9);
         this.a(var1, var16, var15, var13, var11 - var10, var12, var14);

         int var18;
         float var19;
         float var20;
         float var22;
         for(int var17 = 0; var17 < 4; ++var17) {
            var18 = this.do(var1, var17, var9);
            if (var18 > 0) {
               this.k.a(var1, var16, var15, var9);
               this.k.a(var1, var16, var15, var13, var11 - var10, var12, var14);
               if ((var18 & 240) == 16) {
                  this.if(var1, var17, var9);
                  this.k.a(var1, var16, var15, var13, var11 - var10, var12, var14);
               }

               if ((var18 & 15) == 15) {
                  var19 = (float)var1.bl + var9;
                  this.a((String)"%blur%/misc/glint.png");
                  GL11.glEnable(3042);
                  var20 = 0.5F;
                  GL11.glColor4f(var20, var20, var20, 1.0F);
                  GL11.glDepthFunc(514);
                  GL11.glDepthMask(false);

                  for(int var21 = 0; var21 < 2; ++var21) {
                     GL11.glDisable(2896);
                     var22 = 0.76F;
                     GL11.glColor4f(0.5F * var22, 0.25F * var22, 0.8F * var22, 1.0F);
                     GL11.glBlendFunc(768, 1);
                     GL11.glMatrixMode(5890);
                     GL11.glLoadIdentity();
                     float var23 = var19 * (0.001F + (float)var21 * 0.003F) * 20.0F;
                     float var24 = 0.33333334F;
                     GL11.glScalef(var24, var24, var24);
                     GL11.glRotatef(30.0F - (float)var21 * 60.0F, 0.0F, 0.0F, 1.0F);
                     GL11.glTranslatef(0.0F, var23, 0.0F);
                     GL11.glMatrixMode(5888);
                     this.k.a(var1, var16, var15, var13, var11 - var10, var12, var14);
                  }

                  GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                  GL11.glMatrixMode(5890);
                  GL11.glDepthMask(true);
                  GL11.glLoadIdentity();
                  GL11.glMatrixMode(5888);
                  GL11.glEnable(2896);
                  GL11.glDisable(3042);
                  GL11.glDepthFunc(515);
               }

               GL11.glDisable(3042);
               GL11.glEnable(3008);
            }
         }

         GL11.glDepthMask(true);
         this.do(var1, var9);
         float var26 = var1.int(var9);
         var18 = this.a(var1, var26, var9);
         q.a(q.a);
         GL11.glDisable(3553);
         q.a(q.if);
         if ((var18 >> 24 & 255) > 0 || var1.fe > 0 || var1.fb > 0) {
            GL11.glDisable(3553);
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glDepthFunc(514);
            if (var1.fe > 0 || var1.fb > 0) {
               GL11.glColor4f(var26, 0.0F, 0.0F, 0.4F);
               this.l.a(var1, var16, var15, var13, var11 - var10, var12, var14);

               for(int var27 = 0; var27 < 4; ++var27) {
                  if (this.a(var1, var27, var9) >= 0) {
                     GL11.glColor4f(var26, 0.0F, 0.0F, 0.4F);
                     this.k.a(var1, var16, var15, var13, var11 - var10, var12, var14);
                  }
               }
            }

            if ((var18 >> 24 & 255) > 0) {
               var19 = (float)(var18 >> 16 & 255) / 255.0F;
               var20 = (float)(var18 >> 8 & 255) / 255.0F;
               float var28 = (float)(var18 & 255) / 255.0F;
               var22 = (float)(var18 >> 24 & 255) / 255.0F;
               GL11.glColor4f(var19, var20, var28, var22);
               this.l.a(var1, var16, var15, var13, var11 - var10, var12, var14);

               for(int var29 = 0; var29 < 4; ++var29) {
                  if (this.a(var1, var29, var9) >= 0) {
                     GL11.glColor4f(var19, var20, var28, var22);
                     this.k.a(var1, var16, var15, var13, var11 - var10, var12, var14);
                  }
               }
            }

            GL11.glDepthFunc(515);
            GL11.glDisable(3042);
            GL11.glEnable(3008);
            GL11.glEnable(3553);
         }

         GL11.glDisable(32826);
      } catch (Exception var25) {
         var25.printStackTrace();
      }

      q.a(q.a);
      GL11.glEnable(3553);
      q.a(q.if);
      GL11.glEnable(2884);
      GL11.glPopMatrix();
      this.if(var1, var2, var4, var6);
   }

   protected void a(aig var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.if(var1);
      if (!var1.U()) {
         this.l.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (!var1.if((aek)Minecraft.ih().vk)) {
         GL11.glPushMatrix();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.15F);
         GL11.glDepthMask(false);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glAlphaFunc(516, 0.003921569F);
         this.l.a(var1, var2, var3, var4, var5, var6, var7);
         GL11.glDisable(3042);
         GL11.glAlphaFunc(516, 0.1F);
         GL11.glPopMatrix();
         GL11.glDepthMask(true);
      } else {
         this.l.a(var2, var3, var4, var5, var6, var7, var1);
      }

   }

   protected void if(aig var1) {
      this.a((String)var1.W());
   }

   protected void a(aig var1, double var2, double var4, double var6) {
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
   }

   protected void a(aig var1, float var2, float var3, float var4) {
      GL11.glRotatef(180.0F - var3, 0.0F, 1.0F, 0.0F);
      if (var1.fb > 0) {
         float var5 = ((float)var1.fb + var4 - 1.0F) / 20.0F * 1.6F;
         var5 = ajs.if(var5);
         if (var5 > 1.0F) {
            var5 = 1.0F;
         }

         GL11.glRotatef(var5 * this.a(var1), 0.0F, 0.0F, 1.0F);
      }

   }

   protected float a(aig var1, float var2) {
      return var1.void(var2);
   }

   protected float for(aig var1, float var2) {
      return (float)var1.bl + var2;
   }

   protected void do(aig var1, float var2) {
   }

   protected void if(aig var1, float var2) {
      int var3 = var1.bt();
      if (var3 > 0) {
         aei var4 = new aei(var1.ap, var1.al, var1.ak, var1.aj);
         Random var5 = new Random((long)var1.av);
         k1.do();

         for(int var6 = 0; var6 < var3; ++var6) {
            GL11.glPushMatrix();
            e7 var7 = this.l.a(var5);
            e8 var8 = (e8)var7.else.get(var5.nextInt(var7.else.size()));
            var7.if(0.0625F);
            float var9 = var5.nextFloat();
            float var10 = var5.nextFloat();
            float var11 = var5.nextFloat();
            float var12 = (var8.case + (var8.new - var8.case) * var9) / 16.0F;
            float var13 = (var8.byte + (var8.int - var8.byte) * var10) / 16.0F;
            float var14 = (var8.try + (var8.for - var8.try) * var11) / 16.0F;
            GL11.glTranslatef(var12, var13, var14);
            var9 = var9 * 2.0F - 1.0F;
            var10 = var10 * 2.0F - 1.0F;
            var11 = var11 * 2.0F - 1.0F;
            var9 *= -1.0F;
            var10 *= -1.0F;
            var11 *= -1.0F;
            float var15 = ajs.if(var9 * var9 + var11 * var11);
            var4.a2 = var4.a5 = (float)(Math.atan2((double)var9, (double)var11) * 180.0D / 3.1415927410125732D);
            var4.a0 = var4.a4 = (float)(Math.atan2((double)var10, (double)var15) * 180.0D / 3.1415927410125732D);
            double var16 = 0.0D;
            double var18 = 0.0D;
            double var20 = 0.0D;
            float var22 = 0.0F;
            this.a.if(var4, var16, var18, var20, var22, var2);
            GL11.glPopMatrix();
         }

         k1.if();
      }

   }

   protected int a(aig var1, int var2, float var3) {
      return this.do(var1, var2, var3);
   }

   protected int do(aig var1, int var2, float var3) {
      return -1;
   }

   protected void if(aig var1, int var2, float var3) {
   }

   protected float a(aig var1) {
      return 90.0F;
   }

   protected int a(aig var1, float var2, float var3) {
      return 0;
   }

   protected void int(aig var1, float var2) {
   }

   protected void if(aig var1, double var2, double var4, double var6) {
      if (Minecraft.hY() && var1 != this.a.else && !var1.if((aek)Minecraft.ih().vk) && (var1.bx() || var1.cc() && var1 == this.a.char)) {
         float var8 = 1.6F;
         float var9 = 0.016666668F * var8;
         double var10 = var1.for((aiw)this.a.else);
         float var12 = var1.Q() ? 32.0F : 64.0F;
         if (var10 < (double)(var12 * var12)) {
            String var13 = var1.at();
            if (var1.Q()) {
               jq var14 = this.a();
               GL11.glPushMatrix();
               GL11.glTranslatef((float)var2 + 0.0F, (float)var4 + var1.aO + 0.5F, (float)var6);
               GL11.glNormal3f(0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-this.a.case, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(this.a.byte, 1.0F, 0.0F, 0.0F);
               GL11.glScalef(-var9, -var9, var9);
               GL11.glDisable(2896);
               GL11.glTranslatef(0.0F, 0.25F / var9, 0.0F);
               GL11.glDepthMask(false);
               GL11.glEnable(3042);
               GL11.glBlendFunc(770, 771);
               c4 var15 = c4.G;
               GL11.glDisable(3553);
               var15.if();
               int var16 = var14.for(var13) / 2;
               var15.a(0.0F, 0.0F, 0.0F, 0.25F);
               var15.if((double)(-var16 - 1), -1.0D, 0.0D);
               var15.if((double)(-var16 - 1), 8.0D, 0.0D);
               var15.if((double)(var16 + 1), 8.0D, 0.0D);
               var15.if((double)(var16 + 1), -1.0D, 0.0D);
               var15.for();
               GL11.glEnable(3553);
               GL11.glDepthMask(true);
               var14.if(var13, -var14.for(var13) / 2, 0, 553648127);
               GL11.glEnable(2896);
               GL11.glDisable(3042);
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               GL11.glPopMatrix();
            } else {
               this.a(var1, var2, var4, var6, var13, var9, var10);
            }
         }
      }

   }

   protected void a(aig var1, double var2, double var4, double var6, String var8, float var9, double var10) {
      if (var1.cg()) {
         this.a(var1, var8, var2, var4 - 1.5D, var6, 64);
      } else {
         this.a(var1, var8, var2, var4, var6, 64);
      }

   }

   protected void a(aig var1, String var2, double var3, double var5, double var7, int var9) {
      double var10 = var1.for((aiw)this.a.else);
      if (!(var10 > (double)(var9 * var9))) {
         jq var12 = this.a();
         float var13 = 1.6F;
         float var14 = 0.016666668F * var13;
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var3 + 0.0F, (float)var5 + var1.aO + 0.5F, (float)var7);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-this.a.case, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.a.byte, 1.0F, 0.0F, 0.0F);
         GL11.glScalef(-var14, -var14, var14);
         GL11.glDisable(2896);
         GL11.glDepthMask(false);
         GL11.glDisable(2929);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         c4 var15 = c4.G;
         byte var16 = 0;
         if (var2.equals("deadmau5")) {
            var16 = -10;
         }

         GL11.glDisable(3553);
         var15.if();
         int var17 = var12.for(var2) / 2;
         var15.a(0.0F, 0.0F, 0.0F, 0.25F);
         var15.if((double)(-var17 - 1), (double)(-1 + var16), 0.0D);
         var15.if((double)(-var17 - 1), (double)(8 + var16), 0.0D);
         var15.if((double)(var17 + 1), (double)(8 + var16), 0.0D);
         var15.if((double)(var17 + 1), (double)(-1 + var16), 0.0D);
         var15.for();
         GL11.glEnable(3553);
         var12.if(var2, -var12.for(var2) / 2, var16, 553648127);
         GL11.glEnable(2929);
         GL11.glDepthMask(true);
         var12.if(var2, -var12.for(var2) / 2, var16, -1);
         GL11.glEnable(2896);
         GL11.glDisable(3042);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glPopMatrix();
      }
   }
}
