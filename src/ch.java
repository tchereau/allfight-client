import org.lwjgl.opengl.GL11;

public class ch extends ck {
   private float f;

   public ch(float var1) {
      this.f = var1;
   }

   public void a(aeg var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glEnable(32826);
      float var10 = this.f;
      GL11.glScalef(var10 / 1.0F, var10 / 1.0F, var10 / 1.0F);
      ajd var11 = abr.bV.a(0);
      this.a("/gui/items.png");
      c4 var12 = c4.G;
      float var13 = var11.a();
      float var14 = var11.byte();
      float var15 = var11.int();
      float var16 = var11.do();
      float var17 = 1.0F;
      float var18 = 0.5F;
      float var19 = 0.25F;
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
   }
}
