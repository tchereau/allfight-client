import org.lwjgl.opengl.GL11;

public class cj extends ck {
   public cj() {
      this.for = 0.15F;
      this.do = 0.75F;
   }

   public void a(aik var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      int var10 = var1.fW();
      this.a("/item/xporb.png");
      c4 var11 = c4.G;
      float var12 = (float)(var10 % 4 * 16 + 0) / 64.0F;
      float var13 = (float)(var10 % 4 * 16 + 16) / 64.0F;
      float var14 = (float)(var10 / 4 * 16 + 0) / 64.0F;
      float var15 = (float)(var10 / 4 * 16 + 16) / 64.0F;
      float var16 = 1.0F;
      float var17 = 0.5F;
      float var18 = 0.25F;
      int var19 = var1.new(var9);
      int var20 = var19 % 65536;
      int var21 = var19 / 65536;
      q.a(q.a, (float)var20 / 1.0F, (float)var21 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var26 = 255.0F;
      float var27 = ((float)var1.r5 + var9) / 2.0F;
      var21 = (int)((ajs.try(var27 + 0.0F) + 1.0F) * 0.5F * var26);
      int var22 = (int)var26;
      int var23 = (int)((ajs.try(var27 + 4.1887903F) + 1.0F) * 0.1F * var26);
      int var24 = var21 << 16 | var22 << 8 | var23;
      GL11.glRotatef(180.0F - this.a.case, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.a.byte, 1.0F, 0.0F, 0.0F);
      float var25 = 0.3F;
      GL11.glScalef(var25, var25, var25);
      var11.if();
      var11.if(var24, 128);
      var11.do(0.0F, 1.0F, 0.0F);
      var11.a((double)(0.0F - var17), (double)(0.0F - var18), 0.0D, (double)var12, (double)var15);
      var11.a((double)(var16 - var17), (double)(0.0F - var18), 0.0D, (double)var13, (double)var15);
      var11.a((double)(var16 - var17), (double)(1.0F - var18), 0.0D, (double)var13, (double)var14);
      var11.a((double)(0.0F - var17), (double)(1.0F - var18), 0.0D, (double)var12, (double)var14);
      var11.for();
      GL11.glDisable(3042);
      GL11.glDisable(32826);
      GL11.glPopMatrix();
   }
}
