import org.lwjgl.opengl.GL11;

public class a2 extends ay {
   private fq new = new fq();

   public void a(n7 var1, double var2, double var4, double var6, float var8) {
      pa var9 = var1.else();
      GL11.glPushMatrix();
      float var10 = 0.6666667F;
      float var12;
      if (var9 == pa.cp) {
         GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F * var10, (float)var6 + 0.5F);
         float var11 = (float)(var1.try() * 360) / 16.0F;
         GL11.glRotatef(-var11, 0.0F, 1.0F, 0.0F);
         this.new.ai.long = true;
      } else {
         int var16 = var1.try();
         var12 = 0.0F;
         if (var16 == 2) {
            var12 = 180.0F;
         }

         if (var16 == 4) {
            var12 = 90.0F;
         }

         if (var16 == 5) {
            var12 = -90.0F;
         }

         GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F * var10, (float)var6 + 0.5F);
         GL11.glRotatef(-var12, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.3125F, -0.4375F);
         this.new.ai.long = false;
      }

      this.a("/item/sign.png");
      GL11.glPushMatrix();
      GL11.glScalef(var10, -var10, -var10);
      this.new.do();
      GL11.glPopMatrix();
      jq var17 = this.a();
      var12 = 0.016666668F * var10;
      GL11.glTranslatef(0.0F, 0.5F * var10, 0.07F * var10);
      GL11.glScalef(var12, -var12, var12);
      GL11.glNormal3f(0.0F, 0.0F, -1.0F * var12);
      GL11.glDepthMask(false);
      byte var13 = 0;

      for(int var14 = 0; var14 < var1.i.length; ++var14) {
         String var15 = var1.i[var14];
         if (var14 == var1.h) {
            var15 = "> " + var15 + " <";
            var17.if(var15, -var17.for(var15) / 2, var14 * 10 - var1.i.length * 5, var13);
         } else {
            var17.if(var15, -var17.for(var15) / 2, var14 * 10 - var1.i.length * 5, var13);
         }
      }

      GL11.glDepthMask(true);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }
}
