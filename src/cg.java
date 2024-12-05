import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class cg extends ck {
   public void a(aee var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glEnable(32826);
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      byte var10 = 1;
      byte var11 = 2;
      this.a("/particles.png");
      c4 var12 = c4.G;
      float var13 = (float)(var10 * 8 + 0) / 128.0F;
      float var14 = (float)(var10 * 8 + 8) / 128.0F;
      float var15 = (float)(var11 * 8 + 0) / 128.0F;
      float var16 = (float)(var11 * 8 + 8) / 128.0F;
      float var17 = 1.0F;
      float var18 = 0.5F;
      float var19 = 0.5F;
      GL11.glRotatef(180.0F - this.a.case, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.a.byte, 1.0F, 0.0F, 0.0F);
      var12.if();
      var12.do(0.0F, 1.0F, 0.0F);
      var12.a((double)(0.0F - var18), (double)(0.0F - var19), 0.0D, (double)var13, (double)var16);
      var12.a((double)(var17 - var18), (double)(0.0F - var19), 0.0D, (double)var14, (double)var16);
      var12.a((double)(var17 - var18), (double)(1.0F - var19), 0.0D, (double)var14, (double)var15);
      var12.a((double)(0.0F - var18), (double)(1.0F - var19), 0.0D, (double)var13, (double)var15);
      var12.for();
      GL11.glDisable(32826);
      GL11.glPopMatrix();
      if (var1.dc != null) {
         float var20 = var1.dc.void(var9);
         float var21 = ajs.try(ajs.if(var20) * 3.1415927F);
         nr var22 = var1.ap.do().a(-0.5D, 0.03D, 0.8D);
         var22.if(-(var1.dc.a0 + (var1.dc.a4 - var1.dc.a0) * var9) * 3.1415927F / 180.0F);
         var22.a(-(var1.dc.a2 + (var1.dc.a5 - var1.dc.a2) * var9) * 3.1415927F / 180.0F);
         var22.a(var21 * 0.5F);
         var22.if(-var21 * 0.7F);
         double var23 = var1.dc.ao + (var1.dc.al - var1.dc.ao) * (double)var9 + var22.int;
         double var25 = var1.dc.an + (var1.dc.ak - var1.dc.an) * (double)var9 + var22.for;
         double var27 = var1.dc.am + (var1.dc.aj - var1.dc.am) * (double)var9 + var22.do;
         double var29 = var1.dc != Minecraft.ih().vk ? (double)var1.dc.af() : 0.0D;
         if (this.a.try.bo > 0 || var1.dc != Minecraft.ih().vk) {
            float var31 = (var1.dc.eG + (var1.dc.eH - var1.dc.eG) * var9) * 3.1415927F / 180.0F;
            double var32 = (double)ajs.try(var31);
            double var34 = (double)ajs.for(var31);
            var23 = var1.dc.ao + (var1.dc.al - var1.dc.ao) * (double)var9 - var34 * 0.35D - var32 * 0.85D;
            var25 = var1.dc.an + var29 + (var1.dc.ak - var1.dc.an) * (double)var9 - 0.45D;
            var27 = var1.dc.am + (var1.dc.aj - var1.dc.am) * (double)var9 - var32 * 0.35D + var34 * 0.85D;
         }

         double var46 = var1.ao + (var1.al - var1.ao) * (double)var9;
         double var33 = var1.an + (var1.ak - var1.an) * (double)var9 + 0.25D;
         double var35 = var1.am + (var1.aj - var1.am) * (double)var9;
         double var37 = (double)((float)(var23 - var46));
         double var39 = (double)((float)(var25 - var33));
         double var41 = (double)((float)(var27 - var35));
         GL11.glDisable(3553);
         GL11.glDisable(2896);
         var12.do(3);
         var12.a(0);
         byte var43 = 16;

         for(int var44 = 0; var44 <= var43; ++var44) {
            float var45 = (float)var44 / (float)var43;
            var12.if(var2 + var37 * (double)var45, var4 + var39 * (double)(var45 * var45 + var45) * 0.5D + 0.25D, var6 + var41 * (double)var45);
         }

         var12.for();
         GL11.glEnable(2896);
         GL11.glEnable(3553);
      }

   }
}
