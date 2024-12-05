import org.lwjgl.opengl.GL11;

public class bl extends ck {
   fo new = new fo();

   private float a(float var1, float var2, float var3) {
      float var4;
      for(var4 = var2 - var1; var4 < -180.0F; var4 += 360.0F) {
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      return var1 + var3 * var4;
   }

   public void a(ad3 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glDisable(2884);
      float var10 = this.a(var1.a2, var1.a5, var9);
      float var11 = var1.a0 + (var1.a4 - var1.a0) * var9;
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      float var12 = 0.0625F;
      GL11.glEnable(32826);
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      GL11.glEnable(3008);
      if (var1.a7()) {
         this.a("/mob/wither_invul.png");
      } else {
         this.a("/mob/wither.png");
      }

      this.new.a(var1, 0.0F, 0.0F, 0.0F, var10, var11, var12);
      GL11.glPopMatrix();
   }
}
