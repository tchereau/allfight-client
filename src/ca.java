import org.lwjgl.opengl.GL11;

public class ca extends ck {
   private abr char;
   private int else;

   public ca(abr var1, int var2) {
      this.char = var1;
      this.else = var2;
   }

   public ca(abr var1) {
      this(var1, 0);
   }

   public void do(aiw var1, double var2, double var4, double var6, float var8, float var9) {
      ajd var10 = this.char.a(this.else);
      if (var10 != null) {
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var2, (float)var4, (float)var6);
         GL11.glEnable(32826);
         GL11.glScalef(0.5F, 0.5F, 0.5F);
         this.a("/gui/items.png");
         c4 var11 = c4.G;
         if (var10 == abe.for("potion_splash")) {
            int var12 = aas.if(((ad4)var1).a4(), false);
            float var13 = (float)(var12 >> 16 & 255) / 255.0F;
            float var14 = (float)(var12 >> 8 & 255) / 255.0F;
            float var15 = (float)(var12 & 255) / 255.0F;
            GL11.glColor3f(var13, var14, var15);
            GL11.glPushMatrix();
            this.a(var11, abe.for("potion_contents"));
            GL11.glPopMatrix();
            GL11.glColor3f(1.0F, 1.0F, 1.0F);
         }

         this.a(var11, var10);
         GL11.glDisable(32826);
         GL11.glPopMatrix();
      }
   }

   private void a(c4 var1, ajd var2) {
      float var3 = var2.a();
      float var4 = var2.byte();
      float var5 = var2.int();
      float var6 = var2.do();
      float var7 = 1.0F;
      float var8 = 0.5F;
      float var9 = 0.25F;
      GL11.glRotatef(180.0F - this.a.case, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.a.byte, 1.0F, 0.0F, 0.0F);
      var1.if();
      var1.do(0.0F, 1.0F, 0.0F);
      var1.a((double)(0.0F - var8), (double)(0.0F - var9), 0.0D, (double)var3, (double)var6);
      var1.a((double)(var7 - var8), (double)(0.0F - var9), 0.0D, (double)var4, (double)var6);
      var1.a((double)(var7 - var8), (double)(var7 - var9), 0.0D, (double)var4, (double)var5);
      var1.a((double)(0.0F - var8), (double)(var7 - var9), 0.0D, (double)var3, (double)var5);
      var1.for();
   }
}
