import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class cb extends ck {
   private c2 void = new c2();
   private Random long = new Random();
   public boolean goto = true;
   public float c = 0.0F;
   public static boolean b = false;

   public cb() {
      this.for = 0.15F;
      this.do = 0.75F;
   }

   public void a(afk var1, double var2, double var4, double var6, float var8, float var9) {
      this.long.setSeed(187L);
      abp var10 = var1.ba();
      if (var10.d() != null) {
         GL11.glPushMatrix();
         float var11 = ajs.try(((float)var1.dC + var9) / 10.0F + var1.dE) * 0.1F + 0.1F;
         float var12 = (((float)var1.dC + var9) / 20.0F + var1.dE) * 57.295776F;
         byte var13 = 1;
         if (var1.ba().if > 1) {
            var13 = 2;
         }

         if (var1.ba().if > 5) {
            var13 = 3;
         }

         if (var1.ba().if > 20) {
            var13 = 4;
         }

         if (var1.ba().if > 40) {
            var13 = 5;
         }

         GL11.glTranslatef((float)var2, (float)var4 + var11, (float)var6);
         GL11.glEnable(32826);
         pa var14 = null;
         if (var10.new < pa.x.length) {
            var14 = pa.x[var10.new];
         }

         int var15;
         float var16;
         float var17;
         float var18;
         float var19;
         int var23;
         if (var10.byte() == 0 && var14 != null && c2.a(var14.new())) {
            GL11.glRotatef(var12, 0.0F, 1.0F, 0.0F);
            if (b) {
               GL11.glScalef(1.25F, 1.25F, 1.25F);
               GL11.glTranslatef(0.0F, 0.05F, 0.0F);
               GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
            }

            this.a("/terrain.png");
            var19 = 0.25F;
            var23 = var14.new();
            if (var23 == 1 || var23 == 19 || var23 == 12 || var23 == 2) {
               var19 = 0.5F;
            }

            GL11.glScalef(var19, var19, var19);

            for(var15 = 0; var15 < var13; ++var15) {
               GL11.glPushMatrix();
               if (var15 > 0) {
                  var17 = (this.long.nextFloat() * 2.0F - 1.0F) * 0.2F / var19;
                  var16 = (this.long.nextFloat() * 2.0F - 1.0F) * 0.2F / var19;
                  var18 = (this.long.nextFloat() * 2.0F - 1.0F) * 0.2F / var19;
                  GL11.glTranslatef(var17, var16, var18);
               }

               var17 = 1.0F;
               this.void.a(var14, var10.new(), var17);
               GL11.glPopMatrix();
            }
         } else if (var10.d().do()) {
            if (b) {
               GL11.glScalef(0.5128205F, 0.5128205F, 0.5128205F);
               GL11.glTranslatef(0.0F, -0.05F, 0.0F);
            } else {
               GL11.glScalef(0.5F, 0.5F, 0.5F);
            }

            this.a("/gui/items.png");

            for(var23 = 0; var23 <= 1; ++var23) {
               this.long.setSeed(187L);
               ajd var24 = var10.d().a(var10.new(), var23);
               var19 = 1.0F;
               if (this.goto) {
                  var15 = abr.ai[var10.new].a(var10, var23);
                  var17 = (float)(var15 >> 16 & 255) / 255.0F;
                  var16 = (float)(var15 >> 8 & 255) / 255.0F;
                  var18 = (float)(var15 & 255) / 255.0F;
                  GL11.glColor4f(var17 * var19, var16 * var19, var18 * var19, 1.0F);
                  this.a(var1, var24, var13, var9, var17 * var19, var16 * var19, var18 * var19);
               } else {
                  this.a(var1, var24, var13, var9, 1.0F, 1.0F, 1.0F);
               }
            }
         } else {
            if (b) {
               GL11.glScalef(0.5128205F, 0.5128205F, 0.5128205F);
               GL11.glTranslatef(0.0F, -0.05F, 0.0F);
            } else {
               GL11.glScalef(0.5F, 0.5F, 0.5F);
            }

            ajd var20 = var10.f();
            if (var10.byte() == 0) {
               this.a("/terrain.png");
            } else {
               this.a("/gui/items.png");
            }

            if (this.goto) {
               int var21 = abr.ai[var10.new].a(var10, 0);
               var19 = (float)(var21 >> 16 & 255) / 255.0F;
               float var22 = (float)(var21 >> 8 & 255) / 255.0F;
               var17 = (float)(var21 & 255) / 255.0F;
               var16 = 1.0F;
               this.a(var1, var20, var13, var9, var19 * var16, var22 * var16, var17 * var16);
            } else {
               this.a(var1, var20, var13, var9, 1.0F, 1.0F, 1.0F);
            }
         }

         GL11.glDisable(32826);
         GL11.glPopMatrix();
      }

   }

   private void a(afk var1, ajd var2, int var3, float var4, float var5, float var6, float var7) {
      c4 var8 = c4.G;
      if (var2 == null) {
         var2 = this.a.void.a(var1.ba().byte());
      }

      float var9 = var2.a();
      float var10 = var2.byte();
      float var11 = var2.int();
      float var12 = var2.do();
      float var13 = 1.0F;
      float var14 = 0.5F;
      float var15 = 0.25F;
      float var16;
      if (this.a.try.ag) {
         GL11.glPushMatrix();
         if (b) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         } else {
            GL11.glRotatef((((float)var1.dC + var4) / 20.0F + var1.dE) * 57.295776F, 0.0F, 1.0F, 0.0F);
         }

         float var17 = 0.0625F;
         var16 = 0.021875F;
         abp var18 = var1.ba();
         int var19 = var18.if;
         byte var20;
         if (var19 < 2) {
            var20 = 1;
         } else if (var19 < 16) {
            var20 = 2;
         } else if (var19 < 32) {
            var20 = 3;
         } else {
            var20 = 4;
         }

         GL11.glTranslatef(-var14, -var15, -((var17 + var16) * (float)var20 / 2.0F));

         for(int var21 = 0; var21 < var20; ++var21) {
            GL11.glTranslatef(0.0F, 0.0F, var17 + var16);
            if (var18.new < pa.x.length && var18.byte() == 0 && pa.x[var18.new] != null) {
               this.a("/terrain.png");
            } else {
               this.a("/gui/items.png");
            }

            GL11.glColor4f(var5, var6, var7, 1.0F);
            da.a(var8, var10, var11, var9, var12, var2.new(), var2.for(), var17);
            if (var18 != null && var18.if()) {
               GL11.glDepthFunc(514);
               GL11.glDisable(2896);
               this.a.void.for("%blur%/misc/glint.png");
               GL11.glEnable(3042);
               GL11.glBlendFunc(768, 1);
               float var22 = 0.76F;
               GL11.glColor4f(0.5F * var22, 0.25F * var22, 0.8F * var22, 1.0F);
               GL11.glMatrixMode(5890);
               GL11.glPushMatrix();
               float var23 = 0.125F;
               GL11.glScalef(var23, var23, var23);
               float var24 = (float)(Minecraft.h1() % 3000L) / 3000.0F * 8.0F;
               GL11.glTranslatef(var24, 0.0F, 0.0F);
               GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
               da.a(var8, 0.0F, 0.0F, 1.0F, 1.0F, 255, 255, var17);
               GL11.glPopMatrix();
               GL11.glPushMatrix();
               GL11.glScalef(var23, var23, var23);
               var24 = (float)(Minecraft.h1() % 4873L) / 4873.0F * 8.0F;
               GL11.glTranslatef(-var24, 0.0F, 0.0F);
               GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
               da.a(var8, 0.0F, 0.0F, 1.0F, 1.0F, 255, 255, var17);
               GL11.glPopMatrix();
               GL11.glMatrixMode(5888);
               GL11.glDisable(3042);
               GL11.glEnable(2896);
               GL11.glDepthFunc(515);
            }
         }

         GL11.glPopMatrix();
      } else {
         for(int var25 = 0; var25 < var3; ++var25) {
            GL11.glPushMatrix();
            if (var25 > 0) {
               var16 = (this.long.nextFloat() * 2.0F - 1.0F) * 0.3F;
               float var26 = (this.long.nextFloat() * 2.0F - 1.0F) * 0.3F;
               float var27 = (this.long.nextFloat() * 2.0F - 1.0F) * 0.3F;
               GL11.glTranslatef(var16, var26, var27);
            }

            if (!b) {
               GL11.glRotatef(180.0F - this.a.case, 0.0F, 1.0F, 0.0F);
            }

            GL11.glColor4f(var5, var6, var7, 1.0F);
            var8.if();
            var8.do(0.0F, 1.0F, 0.0F);
            var8.a((double)(0.0F - var14), (double)(0.0F - var15), 0.0D, (double)var9, (double)var12);
            var8.a((double)(var13 - var14), (double)(0.0F - var15), 0.0D, (double)var10, (double)var12);
            var8.a((double)(var13 - var14), (double)(1.0F - var15), 0.0D, (double)var10, (double)var11);
            var8.a((double)(0.0F - var14), (double)(1.0F - var15), 0.0D, (double)var9, (double)var11);
            var8.for();
            GL11.glPopMatrix();
         }
      }

   }

   public void do(jq var1, c3 var2, abp var3, int var4, int var5) {
      int var6 = var3.new;
      int var7 = var3.new();
      ajd var8 = var3.f();
      float var9;
      float var10;
      float var11;
      if (var3.byte() == 0 && c2.a(pa.x[var6].new())) {
         var2.for("/terrain.png");
         pa var16 = pa.x[var6];
         GL11.glPushMatrix();
         GL11.glTranslatef((float)(var4 - 2), (float)(var5 + 3), -3.0F + this.c);
         GL11.glScalef(10.0F, 10.0F, 10.0F);
         GL11.glTranslatef(1.0F, 0.5F, 1.0F);
         GL11.glScalef(1.0F, 1.0F, -1.0F);
         GL11.glRotatef(210.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         int var18 = abr.ai[var6].a(var3, 0);
         var11 = (float)(var18 >> 16 & 255) / 255.0F;
         var9 = (float)(var18 >> 8 & 255) / 255.0F;
         var10 = (float)(var18 & 255) / 255.0F;
         if (this.goto) {
            GL11.glColor4f(var11, var9, var10, 1.0F);
         }

         GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         this.void.m = this.goto;
         this.void.a(var16, var7, 1.0F);
         this.void.m = true;
         GL11.glPopMatrix();
      } else {
         int var12;
         if (abr.ai[var6].do()) {
            GL11.glDisable(2896);
            var2.for("/gui/items.png");

            for(var12 = 0; var12 <= 1; ++var12) {
               ajd var13 = abr.ai[var6].a(var7, var12);
               int var14 = abr.ai[var6].a(var3, var12);
               var9 = (float)(var14 >> 16 & 255) / 255.0F;
               var10 = (float)(var14 >> 8 & 255) / 255.0F;
               float var15 = (float)(var14 & 255) / 255.0F;
               if (this.goto) {
                  GL11.glColor4f(var9, var10, var15, 1.0F);
               }

               this.a(var4, var5, var13, 16, 16);
            }

            GL11.glEnable(2896);
         } else {
            GL11.glDisable(2896);
            if (var3.byte() == 0) {
               var2.for("/terrain.png");
            } else {
               var2.for("/gui/items.png");
            }

            if (var8 == null) {
               var8 = var2.a(var3.byte());
            }

            var12 = abr.ai[var6].a(var3, 0);
            float var17 = (float)(var12 >> 16 & 255) / 255.0F;
            var11 = (float)(var12 >> 8 & 255) / 255.0F;
            var9 = (float)(var12 & 255) / 255.0F;
            if (this.goto) {
               GL11.glColor4f(var17, var11, var9, 1.0F);
            }

            this.a(var4, var5, var8, 16, 16);
            GL11.glEnable(2896);
         }
      }

      GL11.glEnable(2884);
   }

   public void a(jq var1, c3 var2, abp var3, int var4, int var5) {
      if (var3 != null) {
         this.do(var1, var2, var3, var4, var5);
         if (var3.if()) {
            GL11.glDepthFunc(516);
            GL11.glDisable(2896);
            GL11.glDepthMask(false);
            var2.for("%blur%/misc/glint.png");
            this.c -= 50.0F;
            GL11.glEnable(3042);
            GL11.glBlendFunc(774, 774);
            GL11.glColor4f(0.5F, 0.25F, 0.8F, 1.0F);
            this.a(var4 * 431278612 + var5 * 32178161, var4 - 2, var5 - 2, 20, 20);
            GL11.glDisable(3042);
            GL11.glDepthMask(true);
            this.c += 50.0F;
            GL11.glEnable(2896);
            GL11.glDepthFunc(515);
         }
      }

   }

   private void a(int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 2; ++var6) {
         if (var6 == 0) {
            GL11.glBlendFunc(768, 1);
         }

         if (var6 == 1) {
            GL11.glBlendFunc(768, 1);
         }

         float var7 = 0.00390625F;
         float var8 = 0.00390625F;
         float var9 = (float)(Minecraft.h1() % (long)(3000 + var6 * 1873)) / (3000.0F + (float)(var6 * 1873)) * 256.0F;
         float var10 = 0.0F;
         c4 var11 = c4.G;
         float var12 = 4.0F;
         if (var6 == 1) {
            var12 = -1.0F;
         }

         var11.if();
         var11.a((double)(var2 + 0), (double)(var3 + var5), (double)this.c, (double)((var9 + (float)var5 * var12) * var7), (double)((var10 + (float)var5) * var8));
         var11.a((double)(var2 + var4), (double)(var3 + var5), (double)this.c, (double)((var9 + (float)var4 + (float)var5 * var12) * var7), (double)((var10 + (float)var5) * var8));
         var11.a((double)(var2 + var4), (double)(var3 + 0), (double)this.c, (double)((var9 + (float)var4) * var7), (double)((var10 + 0.0F) * var8));
         var11.a((double)(var2 + 0), (double)(var3 + 0), (double)this.c, (double)((var9 + 0.0F) * var7), (double)((var10 + 0.0F) * var8));
         var11.for();
      }

   }

   public void if(jq var1, c3 var2, abp var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, (String)null);
   }

   public void a(jq var1, c3 var2, abp var3, int var4, int var5, String var6) {
      if (var3 != null) {
         if (var3.if > 1 || var6 != null) {
            String var7 = var6 == null ? String.valueOf(var3.if) : var6;
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            var1.a(var7, var4 + 19 - 2 - var1.for(var7), var5 + 6 + 3, 16777215);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
         }

         if (var3.int()) {
            int var12 = (int)Math.round(13.0D - (double)var3.k() * 13.0D / (double)var3.e());
            int var8 = (int)Math.round(255.0D - (double)var3.k() * 255.0D / (double)var3.e());
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            GL11.glDisable(3553);
            c4 var9 = c4.G;
            int var10 = 255 - var8 << 16 | var8 << 8;
            int var11 = (255 - var8) / 4 << 16 | 16128;
            this.a(var9, var4 + 2, var5 + 13, 13, 2, 0);
            this.a(var9, var4 + 2, var5 + 13, 12, 1, var11);
            this.a(var9, var4 + 2, var5 + 13, var12, 1, var10);
            GL11.glEnable(3553);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }
      }

   }

   private void a(c4 var1, int var2, int var3, int var4, int var5, int var6) {
      var1.if();
      var1.a(var6);
      var1.if((double)(var2 + 0), (double)(var3 + 0), 0.0D);
      var1.if((double)(var2 + 0), (double)(var3 + var5), 0.0D);
      var1.if((double)(var2 + var4), (double)(var3 + var5), 0.0D);
      var1.if((double)(var2 + var4), (double)(var3 + 0), 0.0D);
      var1.for();
   }

   public void a(int var1, int var2, ajd var3, int var4, int var5) {
      c4 var6 = c4.G;
      var6.if();
      var6.a((double)(var1 + 0), (double)(var2 + var5), (double)this.c, (double)var3.a(), (double)var3.do());
      var6.a((double)(var1 + var4), (double)(var2 + var5), (double)this.c, (double)var3.byte(), (double)var3.do());
      var6.a((double)(var1 + var4), (double)(var2 + 0), (double)this.c, (double)var3.byte(), (double)var3.int());
      var6.a((double)(var1 + 0), (double)(var2 + 0), (double)this.c, (double)var3.a(), (double)var3.int());
      var6.for();
   }

   public void do(aiw var1, double var2, double var4, double var6, float var8, float var9) {
      this.a((afk)var1, var2, var4, var6, var8, var9);
   }
}
