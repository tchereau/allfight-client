import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class da {
   private Minecraft a;
   private abp try = null;
   private float new = 0.0F;
   private float int = 0.0F;
   private c2 for = new c2();
   public final je if;
   private int do = -1;

   public da(Minecraft var1) {
      this.a = var1;
      this.if = new je(var1.va, var1.u1, var1.vb);
   }

   public void a(aig var1, abp var2, int var3) {
      GL11.glPushMatrix();
      pa var4 = null;
      if (var2.new < pa.x.length) {
         var4 = pa.x[var2.new];
      }

      if (var2.byte() == 0 && var4 != null && c2.a(var4.new())) {
         this.a.vb.for("/terrain.png");
         this.for.a(pa.x[var2.new], var2.new(), 1.0F);
      } else {
         ajd var5 = var1.a(var2, var3);
         if (var5 == null) {
            GL11.glPopMatrix();
            return;
         }

         if (var2.byte() == 0) {
            this.a.vb.for("/terrain.png");
         } else {
            this.a.vb.for("/gui/items.png");
         }

         c4 var6 = c4.G;
         float var7 = var5.a();
         float var8 = var5.byte();
         float var9 = var5.int();
         float var10 = var5.do();
         float var11 = 0.0F;
         float var12 = 0.3F;
         GL11.glEnable(32826);
         GL11.glTranslatef(-var11, -var12, 0.0F);
         float var13 = 1.5F;
         GL11.glScalef(var13, var13, var13);
         GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
         a(var6, var8, var9, var7, var10, var5.new(), var5.for(), 0.0625F);
         if (var2 != null && var2.if() && var3 == 0) {
            GL11.glDepthFunc(514);
            GL11.glDisable(2896);
            this.a.vb.for("%blur%/misc/glint.png");
            GL11.glEnable(3042);
            GL11.glBlendFunc(768, 1);
            float var14 = 0.76F;
            GL11.glColor4f(0.5F * var14, 0.25F * var14, 0.8F * var14, 1.0F);
            GL11.glMatrixMode(5890);
            GL11.glPushMatrix();
            float var15 = 0.125F;
            GL11.glScalef(var15, var15, var15);
            float var16 = (float)(Minecraft.h1() % 3000L) / 3000.0F * 8.0F;
            GL11.glTranslatef(var16, 0.0F, 0.0F);
            GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
            a(var6, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(var15, var15, var15);
            var16 = (float)(Minecraft.h1() % 4873L) / 4873.0F * 8.0F;
            GL11.glTranslatef(-var16, 0.0F, 0.0F);
            GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
            a(var6, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5888);
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glDepthFunc(515);
         }

         GL11.glDisable(32826);
      }

      GL11.glPopMatrix();
   }

   public static void a(c4 var0, float var1, float var2, float var3, float var4, int var5, int var6, float var7) {
      var0.if();
      var0.do(0.0F, 0.0F, 1.0F);
      var0.a(0.0D, 0.0D, 0.0D, (double)var1, (double)var4);
      var0.a(1.0D, 0.0D, 0.0D, (double)var3, (double)var4);
      var0.a(1.0D, 1.0D, 0.0D, (double)var3, (double)var2);
      var0.a(0.0D, 1.0D, 0.0D, (double)var1, (double)var2);
      var0.for();
      var0.if();
      var0.do(0.0F, 0.0F, -1.0F);
      var0.a(0.0D, 1.0D, (double)(0.0F - var7), (double)var1, (double)var2);
      var0.a(1.0D, 1.0D, (double)(0.0F - var7), (double)var3, (double)var2);
      var0.a(1.0D, 0.0D, (double)(0.0F - var7), (double)var3, (double)var4);
      var0.a(0.0D, 0.0D, (double)(0.0F - var7), (double)var1, (double)var4);
      var0.for();
      float var8 = (float)var5 * (var1 - var3);
      float var9 = (float)var6 * (var4 - var2);
      var0.if();
      var0.do(-1.0F, 0.0F, 0.0F);

      int var10;
      float var11;
      float var12;
      for(var10 = 0; (float)var10 < var8; ++var10) {
         var11 = (float)var10 / var8;
         var12 = var1 + (var3 - var1) * var11 - 0.5F / (float)var5;
         var0.a((double)var11, 0.0D, (double)(0.0F - var7), (double)var12, (double)var4);
         var0.a((double)var11, 0.0D, 0.0D, (double)var12, (double)var4);
         var0.a((double)var11, 1.0D, 0.0D, (double)var12, (double)var2);
         var0.a((double)var11, 1.0D, (double)(0.0F - var7), (double)var12, (double)var2);
      }

      var0.for();
      var0.if();
      var0.do(1.0F, 0.0F, 0.0F);

      float var13;
      for(var10 = 0; (float)var10 < var8; ++var10) {
         var11 = (float)var10 / var8;
         var12 = var1 + (var3 - var1) * var11 - 0.5F / (float)var5;
         var13 = var11 + 1.0F / var8;
         var0.a((double)var13, 1.0D, (double)(0.0F - var7), (double)var12, (double)var2);
         var0.a((double)var13, 1.0D, 0.0D, (double)var12, (double)var2);
         var0.a((double)var13, 0.0D, 0.0D, (double)var12, (double)var4);
         var0.a((double)var13, 0.0D, (double)(0.0F - var7), (double)var12, (double)var4);
      }

      var0.for();
      var0.if();
      var0.do(0.0F, 1.0F, 0.0F);

      for(var10 = 0; (float)var10 < var9; ++var10) {
         var11 = (float)var10 / var9;
         var12 = var4 + (var2 - var4) * var11 - 0.5F / (float)var6;
         var13 = var11 + 1.0F / var9;
         var0.a(0.0D, (double)var13, 0.0D, (double)var1, (double)var12);
         var0.a(1.0D, (double)var13, 0.0D, (double)var3, (double)var12);
         var0.a(1.0D, (double)var13, (double)(0.0F - var7), (double)var3, (double)var12);
         var0.a(0.0D, (double)var13, (double)(0.0F - var7), (double)var1, (double)var12);
      }

      var0.for();
      var0.if();
      var0.do(0.0F, -1.0F, 0.0F);

      for(var10 = 0; (float)var10 < var9; ++var10) {
         var11 = (float)var10 / var9;
         var12 = var4 + (var2 - var4) * var11 - 0.5F / (float)var6;
         var0.a(1.0D, (double)var11, 0.0D, (double)var3, (double)var12);
         var0.a(0.0D, (double)var11, 0.0D, (double)var1, (double)var12);
         var0.a(0.0D, (double)var11, (double)(0.0F - var7), (double)var1, (double)var12);
         var0.a(1.0D, (double)var11, (double)(0.0F - var7), (double)var3, (double)var12);
      }

      var0.for();
   }

   public void for(float var1) {
      float var2 = this.int + (this.new - this.int) * var1;
      eu var3 = this.a.vk;
      float var4 = var3.a0 + (var3.a4 - var3.a0) * var1;
      GL11.glPushMatrix();
      GL11.glRotatef(var4, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var3.a2 + (var3.a5 - var3.a2) * var1, 0.0F, 1.0F, 0.0F);
      k1.if();
      GL11.glPopMatrix();
      float var5;
      float var6;
      if (var3 instanceof dq) {
         var5 = var3.gj + (var3.gl - var3.gj) * var1;
         var6 = var3.gk + (var3.gm - var3.gk) * var1;
         GL11.glRotatef((var3.a4 - var5) * 0.1F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef((var3.a5 - var6) * 0.1F, 0.0F, 1.0F, 0.0F);
      }

      abp var7 = this.try;
      var5 = this.a.vm.int(ajs.a(var3.al), ajs.a(var3.ak), ajs.a(var3.aj));
      var5 = 1.0F;
      int var8 = this.a.vm.do(ajs.a(var3.al), ajs.a(var3.ak), ajs.a(var3.aj), 0);
      int var9 = var8 % 65536;
      int var10 = var8 / 65536;
      q.a(q.a, (float)var9 / 1.0F, (float)var10 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var11;
      float var12;
      float var13;
      if (var7 != null) {
         var8 = abr.ai[var7.new].a(var7, 0);
         var13 = (float)(var8 >> 16 & 255) / 255.0F;
         var12 = (float)(var8 >> 8 & 255) / 255.0F;
         var11 = (float)(var8 & 255) / 255.0F;
         GL11.glColor4f(var5 * var13, var5 * var12, var5 * var11, 1.0F);
      } else {
         GL11.glColor4f(var5, var5, var5, 1.0F);
      }

      float var14;
      float var15;
      ck var16;
      float var17;
      bz var18;
      if (var7 != null && var7.new == abr.aZ.A) {
         GL11.glPushMatrix();
         var6 = 0.8F;
         var13 = var3.void(var1);
         var12 = ajs.try(var13 * 3.1415927F);
         var11 = ajs.try(ajs.if(var13) * 3.1415927F);
         GL11.glTranslatef(-var11 * 0.4F, ajs.try(ajs.if(var13) * 3.1415927F * 2.0F) * 0.2F, -var12 * 0.2F);
         var13 = 1.0F - var4 / 45.0F + 0.1F;
         if (var13 < 0.0F) {
            var13 = 0.0F;
         }

         if (var13 > 1.0F) {
            var13 = 1.0F;
         }

         var13 = -ajs.for(var13 * 3.1415927F) * 0.5F + 0.5F;
         GL11.glTranslatef(0.0F, 0.0F * var6 - (1.0F - var2) * 1.2F - var13 * 0.5F + 0.04F, -0.9F * var6);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(var13 * -85.0F, 0.0F, 0.0F, 1.0F);
         GL11.glEnable(32826);
         GL11.glBindTexture(3553, this.a.vb.a(this.a.vk.af, this.a.vk.W()));
         this.a.vb.do();

         for(var10 = 0; var10 < 2; ++var10) {
            int var23 = var10 * 2 - 1;
            GL11.glPushMatrix();
            GL11.glTranslatef(-0.0F, -0.6F, 1.1F * (float)var23);
            GL11.glRotatef((float)(-45 * var23), 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(59.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef((float)(-65 * var23), 0.0F, 1.0F, 0.0F);
            var16 = cl.e.a((aiw)this.a.vk);
            var18 = (bz)var16;
            var17 = 1.0F;
            GL11.glScalef(var17, var17, var17);
            var18.a(this.a.vk);
            GL11.glPopMatrix();
         }

         var12 = var3.void(var1);
         var11 = ajs.try(var12 * var12 * 3.1415927F);
         var14 = ajs.try(ajs.if(var12) * 3.1415927F);
         GL11.glRotatef(-var11 * 20.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var14 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var14 * 80.0F, 1.0F, 0.0F, 0.0F);
         var15 = 0.38F;
         GL11.glScalef(var15, var15, var15);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-1.0F, -1.0F, 0.0F);
         var17 = 0.015625F;
         GL11.glScalef(var17, var17, var17);
         this.a.vb.for("/misc/mapbg.png");
         c4 var24 = c4.G;
         GL11.glNormal3f(0.0F, 0.0F, -1.0F);
         var24.if();
         byte var26 = 7;
         var24.a((double)(0 - var26), (double)(128 + var26), 0.0D, 0.0D, 1.0D);
         var24.a((double)(128 + var26), (double)(128 + var26), 0.0D, 1.0D, 1.0D);
         var24.a((double)(128 + var26), (double)(0 - var26), 0.0D, 1.0D, 0.0D);
         var24.a((double)(0 - var26), (double)(0 - var26), 0.0D, 0.0D, 0.0D);
         var24.for();
         s3 var27 = abr.aZ.a(var7, this.a.vm);
         if (var27 != null) {
            this.if.a(this.a.vk, this.a.vb, var27);
         }

         GL11.glPopMatrix();
      } else if (var7 != null) {
         GL11.glPushMatrix();
         var6 = 0.8F;
         if (var3.cy() <= 0) {
            var13 = var3.void(var1);
            var12 = ajs.try(var13 * 3.1415927F);
            var11 = ajs.try(ajs.if(var13) * 3.1415927F);
            GL11.glTranslatef(-var11 * 0.4F, ajs.try(ajs.if(var13) * 3.1415927F * 2.0F) * 0.2F, -var12 * 0.2F);
         } else {
            aax var19 = var7.l();
            if (var19 == aax.if || var19 == aax.try) {
               var12 = (float)var3.cy() - var1 + 1.0F;
               var11 = 1.0F - var12 / (float)var7.long();
               var14 = 1.0F - var11;
               var14 = var14 * var14 * var14;
               var14 = var14 * var14 * var14;
               var14 = var14 * var14 * var14;
               var15 = 1.0F - var14;
               GL11.glTranslatef(0.0F, ajs.do(ajs.for(var12 / 4.0F * 3.1415927F) * 0.1F) * (float)((double)var11 > 0.2D ? 1 : 0), 0.0F);
               GL11.glTranslatef(var15 * 0.6F, -var15 * 0.5F, 0.0F);
               GL11.glRotatef(var15 * 90.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(var15 * 10.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(var15 * 30.0F, 0.0F, 0.0F, 1.0F);
            }

            if (var19 == aax.a) {
               var12 = (float)var3.cy() - var1 + 1.0F;
               var11 = 1.0F - var12 / (float)var7.long();
               var14 = 1.0F - var11;
               var14 = var14 * var14 * var14;
               var14 = var14 * var14 * var14;
               var14 = var14 * var14 * var14;
               var15 = 1.0F - var14;
               GL11.glTranslatef(0.0F, ajs.do(ajs.for(var12 / 4.0F * 3.1415927F) * 0.1F) * (float)((double)var11 > 0.2D ? 1 : 0), 0.0F);
               GL11.glTranslatef(var15 * 0.6F, -var15 * 0.5F, 0.0F);
               GL11.glRotatef(var15 * 50.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(var15 * 10.0F, 0.0F, 0.0F, 0.0F);
               GL11.glRotatef(var15 * 40.0F, 0.0F, 0.0F, 1.0F);
            }
         }

         GL11.glTranslatef(0.7F * var6, -0.65F * var6 - (1.0F - var2) * 0.6F, -0.9F * var6);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable(32826);
         var13 = var3.void(var1);
         var12 = ajs.try(var13 * var13 * 3.1415927F);
         var11 = ajs.try(ajs.if(var13) * 3.1415927F);
         GL11.glRotatef(-var12 * 20.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var11 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var11 * 80.0F, 1.0F, 0.0F, 0.0F);
         var14 = 0.4F;
         GL11.glScalef(var14, var14, var14);
         float var20;
         float var22;
         if (var3.cy() > 0) {
            aax var21 = var7.l();
            if (var21 == aax.new) {
               GL11.glTranslatef(-0.5F, 0.2F, 0.0F);
               GL11.glRotatef(30.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-80.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(60.0F, 0.0F, 1.0F, 0.0F);
            } else if (var21 == aax.int) {
               GL11.glRotatef(-18.0F, 0.0F, 0.0F, 1.0F);
               GL11.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-8.0F, 1.0F, 0.0F, 0.0F);
               GL11.glTranslatef(-0.9F, 0.2F, 0.0F);
               var17 = (float)var7.long() - ((float)var3.cy() - var1 + 1.0F);
               var20 = var17 / 20.0F;
               var20 = (var20 * var20 + var20 * 2.0F) / 3.0F;
               if (var20 > 1.0F) {
                  var20 = 1.0F;
               }

               if (var20 > 0.1F) {
                  GL11.glTranslatef(0.0F, ajs.try((var17 - 0.1F) * 1.3F) * 0.01F * (var20 - 0.1F), 0.0F);
               }

               GL11.glTranslatef(0.0F, 0.0F, var20 * 0.1F);
               GL11.glRotatef(-335.0F, 0.0F, 0.0F, 1.0F);
               GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
               GL11.glTranslatef(0.0F, 0.5F, 0.0F);
               var22 = 1.0F + var20 * 0.2F;
               GL11.glScalef(1.0F, 1.0F, var22);
               GL11.glTranslatef(0.0F, -0.5F, 0.0F);
               GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
            }
         }

         if (var7.d().else()) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         }

         if (var7.d().do()) {
            this.a(var3, var7, 0);
            int var25 = abr.ai[var7.new].a(var7, 1);
            var17 = (float)(var25 >> 16 & 255) / 255.0F;
            var20 = (float)(var25 >> 8 & 255) / 255.0F;
            var22 = (float)(var25 & 255) / 255.0F;
            GL11.glColor4f(var5 * var17, var5 * var20, var5 * var22, 1.0F);
            this.a(var3, var7, 1);
         } else {
            this.a(var3, var7, 0);
         }

         GL11.glPopMatrix();
      } else if (!var3.U()) {
         GL11.glPushMatrix();
         var6 = 0.8F;
         var13 = var3.void(var1);
         var12 = ajs.try(var13 * 3.1415927F);
         var11 = ajs.try(ajs.if(var13) * 3.1415927F);
         GL11.glTranslatef(-var11 * 0.3F, ajs.try(ajs.if(var13) * 3.1415927F * 2.0F) * 0.4F, -var12 * 0.4F);
         GL11.glTranslatef(0.8F * var6, -0.75F * var6 - (1.0F - var2) * 0.6F, -0.9F * var6);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable(32826);
         var13 = var3.void(var1);
         var12 = ajs.try(var13 * var13 * 3.1415927F);
         var11 = ajs.try(ajs.if(var13) * 3.1415927F);
         GL11.glRotatef(var11 * 70.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var12 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glBindTexture(3553, this.a.vb.a(this.a.vk.af, this.a.vk.W()));
         this.a.vb.do();
         GL11.glTranslatef(-1.0F, 3.6F, 3.5F);
         GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(1.0F, 1.0F, 1.0F);
         GL11.glTranslatef(5.6F, 0.0F, 0.0F);
         var16 = cl.e.a((aiw)this.a.vk);
         var18 = (bz)var16;
         var17 = 1.0F;
         GL11.glScalef(var17, var17, var17);
         var18.a(this.a.vk);
         GL11.glPopMatrix();
      }

      GL11.glDisable(32826);
      k1.do();
   }

   public void do(float var1) {
      GL11.glDisable(3008);
      if (this.a.vk.aP()) {
         this.a.vb.for("/terrain.png");
         this.a(var1);
      }

      if (this.a.vk.aE()) {
         int var2 = ajs.a(this.a.vk.al);
         int var3 = ajs.a(this.a.vk.ak);
         int var4 = ajs.a(this.a.vk.aj);
         this.a.vb.for("/terrain.png");
         int var5 = this.a.vm.new(var2, var3, var4);
         if (this.a.vm.try(var2, var3, var4)) {
            this.a(var1, pa.x[var5].do(2));
         } else {
            for(int var6 = 0; var6 < 8; ++var6) {
               float var7 = ((float)((var6 >> 0) % 2) - 0.5F) * this.a.vk.aP * 0.9F;
               float var8 = ((float)((var6 >> 1) % 2) - 0.5F) * this.a.vk.aO * 0.2F;
               float var9 = ((float)((var6 >> 2) % 2) - 0.5F) * this.a.vk.aP * 0.9F;
               int var10 = ajs.new((float)var2 + var7);
               int var11 = ajs.new((float)var3 + var8);
               int var12 = ajs.new((float)var4 + var9);
               if (this.a.vm.try(var10, var11, var12)) {
                  var5 = this.a.vm.new(var10, var11, var12);
               }
            }
         }

         if (pa.x[var5] != null) {
            this.a(var1, pa.x[var5].do(2));
         }
      }

      if (this.a.vk.a(ts.s)) {
         this.a.vb.for("/misc/water.png");
         this.if(var1);
      }

      GL11.glEnable(3008);
   }

   private void a(float var1, ajd var2) {
      c4 var3 = c4.G;
      float var4 = 0.1F;
      GL11.glColor4f(var4, var4, var4, 0.5F);
      GL11.glPushMatrix();
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = var2.a();
      float var11 = var2.byte();
      float var12 = var2.int();
      float var13 = var2.do();
      var3.if();
      var3.a((double)var5, (double)var7, (double)var9, (double)var11, (double)var13);
      var3.a((double)var6, (double)var7, (double)var9, (double)var10, (double)var13);
      var3.a((double)var6, (double)var8, (double)var9, (double)var10, (double)var12);
      var3.a((double)var5, (double)var8, (double)var9, (double)var11, (double)var12);
      var3.for();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void if(float var1) {
      c4 var2 = c4.G;
      float var3 = this.a.vk.int(var1);
      GL11.glColor4f(var3, var3, var3, 0.5F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glPushMatrix();
      float var4 = 4.0F;
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = -this.a.vk.a5 / 64.0F;
      float var11 = this.a.vk.a4 / 64.0F;
      var2.if();
      var2.a((double)var5, (double)var7, (double)var9, (double)(var4 + var10), (double)(var4 + var11));
      var2.a((double)var6, (double)var7, (double)var9, (double)(0.0F + var10), (double)(var4 + var11));
      var2.a((double)var6, (double)var8, (double)var9, (double)(0.0F + var10), (double)(0.0F + var11));
      var2.a((double)var5, (double)var8, (double)var9, (double)(var4 + var10), (double)(0.0F + var11));
      var2.for();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   private void a(float var1) {
      c4 var2 = c4.G;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      float var3 = 1.0F;

      for(int var4 = 0; var4 < 2; ++var4) {
         GL11.glPushMatrix();
         ajd var5 = pa.bo.o(1);
         float var6 = var5.a();
         float var7 = var5.byte();
         float var8 = var5.int();
         float var9 = var5.do();
         float var10 = (0.0F - var3) / 2.0F;
         float var11 = var10 + var3;
         float var12 = 0.0F - var3 / 2.0F;
         float var13 = var12 + var3;
         float var14 = -0.5F;
         GL11.glTranslatef((float)(-(var4 * 2 - 1)) * 0.24F, -0.3F, 0.0F);
         GL11.glRotatef((float)(var4 * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
         var2.if();
         var2.a((double)var10, (double)var12, (double)var14, (double)var7, (double)var9);
         var2.a((double)var11, (double)var12, (double)var14, (double)var6, (double)var9);
         var2.a((double)var11, (double)var13, (double)var14, (double)var6, (double)var8);
         var2.a((double)var10, (double)var13, (double)var14, (double)var7, (double)var8);
         var2.for();
         GL11.glPopMatrix();
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   public void if() {
      this.int = this.new;
      eu var1 = this.a.vk;
      abp var2 = var1.fR.L();
      boolean var3 = this.do == var1.fR.aa && var2 == this.try;
      if (this.try == null && var2 == null) {
         var3 = true;
      }

      if (var2 != null && this.try != null && var2 != this.try && var2.new == this.try.new && var2.new() == this.try.new()) {
         this.try = var2;
         var3 = true;
      }

      float var4 = 0.4F;
      float var5 = var3 ? 1.0F : 0.0F;
      float var6 = var5 - this.new;
      if (var6 < -var4) {
         var6 = -var4;
      }

      if (var6 > var4) {
         var6 = var4;
      }

      this.new += var6;
      if (this.new < 0.1F) {
         this.try = var2;
         this.do = var1.fR.aa;
      }

   }

   public void a() {
      this.new = 0.0F;
   }

   public void do() {
      this.new = 0.0F;
   }
}
