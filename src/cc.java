import org.lwjgl.opengl.GL11;

public class cc extends ck {
   private final c2 d = new c2();
   private ajd e;

   public void a(ajc var1) {
      this.e = var1.a("itemframe_back");
   }

   public void a(aih var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      float var10 = (float)(var1.al - var2) - 0.5F;
      float var11 = (float)(var1.ak - var4) - 0.5F;
      float var12 = (float)(var1.aj - var6) - 0.5F;
      int var13 = var1.rX + apk.case[var1.rY];
      int var14 = var1.r1;
      int var15 = var1.r0 + apk.byte[var1.rY];
      GL11.glTranslatef((float)var13 - var10, (float)var14 - var11, (float)var15 - var12);
      this.if(var1);
      this.a(var1);
      GL11.glPopMatrix();
   }

   private void if(aih var1) {
      GL11.glPushMatrix();
      this.a.void.for("/terrain.png");
      GL11.glRotatef(var1.a5, 0.0F, 1.0F, 0.0F);
      pa var2 = pa.be;
      float var3 = 0.0625F;
      float var4 = 0.75F;
      float var5 = var4 / 2.0F;
      GL11.glPushMatrix();
      this.d.if(0.0D, (double)(0.5F - var5 + 0.0625F), (double)(0.5F - var5 + 0.0625F), (double)(var3 * 0.5F), (double)(0.5F + var5 - 0.0625F), (double)(0.5F + var5 - 0.0625F));
      this.d.if(this.e);
      this.d.a(var2, 0, 1.0F);
      this.d.a();
      this.d.do();
      GL11.glPopMatrix();
      this.d.if(pa.be.if(1, 2));
      GL11.glPushMatrix();
      this.d.if(0.0D, (double)(0.5F - var5), (double)(0.5F - var5), (double)(var3 + 1.0E-4F), (double)(var3 + 0.5F - var5), (double)(0.5F + var5));
      this.d.a(var2, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      this.d.if(0.0D, (double)(0.5F + var5 - var3), (double)(0.5F - var5), (double)(var3 + 1.0E-4F), (double)(0.5F + var5), (double)(0.5F + var5));
      this.d.a(var2, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      this.d.if(0.0D, (double)(0.5F - var5), (double)(0.5F - var5), (double)var3, (double)(0.5F + var5), (double)(var3 + 0.5F - var5));
      this.d.a(var2, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      this.d.if(0.0D, (double)(0.5F - var5), (double)(0.5F + var5 - var3), (double)var3, (double)(0.5F + var5), (double)(0.5F + var5));
      this.d.a(var2, 0, 1.0F);
      GL11.glPopMatrix();
      this.d.do();
      this.d.a();
      GL11.glPopMatrix();
   }

   private void a(aih var1) {
      abp var2 = var1.fU();
      if (var2 != null) {
         afk var3 = new afk(var1.ap, 0.0D, 0.0D, 0.0D, var2);
         var3.ba().if = 1;
         var3.dE = 0.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(-0.453125F * (float)apk.case[var1.rY], -0.18F, -0.453125F * (float)apk.byte[var1.rY]);
         GL11.glRotatef(180.0F + var1.a5, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef((float)(-90 * var1.fV()), 0.0F, 0.0F, 1.0F);
         switch(var1.fV()) {
         case 1:
            GL11.glTranslatef(-0.16F, -0.16F, 0.0F);
            break;
         case 2:
            GL11.glTranslatef(0.0F, -0.32F, 0.0F);
            break;
         case 3:
            GL11.glTranslatef(0.16F, -0.16F, 0.0F);
         }

         if (var3.ba().d() == abr.aZ) {
            this.a.void.for("/misc/mapbg.png");
            c4 var4 = c4.G;
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
            GL11.glScalef(0.00390625F, 0.00390625F, 0.00390625F);
            GL11.glTranslatef(-65.0F, -107.0F, -3.0F);
            GL11.glNormal3f(0.0F, 0.0F, -1.0F);
            var4.if();
            byte var5 = 7;
            var4.a((double)(0 - var5), (double)(128 + var5), 0.0D, 0.0D, 1.0D);
            var4.a((double)(128 + var5), (double)(128 + var5), 0.0D, 1.0D, 1.0D);
            var4.a((double)(128 + var5), (double)(0 - var5), 0.0D, 1.0D, 0.0D);
            var4.a((double)(0 - var5), (double)(0 - var5), 0.0D, 0.0D, 0.0D);
            var4.for();
            s3 var6 = abr.aZ.a(var3.ba(), var1.ap);
            GL11.glTranslatef(0.0F, 0.0F, -1.0F);
            if (var6 != null) {
               this.a.long.if.a((aek)null, this.a.void, var6);
            }
         } else {
            a9 var9;
            if (var3.ba().d() == abr.cg) {
               var9 = a9.m;
               double var10 = var9.l;
               double var7 = var9.k;
               var9.l = 0.0D;
               var9.k = 0.0D;
               var9.a(var1.ap, var1.al, var1.aj, (double)ajs.int((float)(180 + var1.rY * 90)), false, true);
               var9.l = var10;
               var9.k = var7;
            }

            cb.b = true;
            cl.e.if(var3, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
            cb.b = false;
            if (var3.ba().d() == abr.cg) {
               var9 = a9.m;
               var9.else();
            }
         }

         GL11.glPopMatrix();
      }
   }
}
