import org.lwjgl.opengl.GL11;

public class a5 extends ay {
   private f7 byte = new f7();

   public void a(of var1, double var2, double var4, double var6, float var8) {
      int var9 = 0;
      if (var1.goto()) {
         var9 = var1.try();
      }

      this.a("/item/enderchest.png");
      GL11.glPushMatrix();
      GL11.glEnable(32826);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glTranslatef((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
      GL11.glScalef(1.0F, -1.0F, -1.0F);
      GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      short var10 = 0;
      if (var9 == 2) {
         var10 = 180;
      }

      if (var9 == 3) {
         var10 = 0;
      }

      if (var9 == 4) {
         var10 = 90;
      }

      if (var9 == 5) {
         var10 = -90;
      }

      GL11.glRotatef((float)var10, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
      float var11 = var1.s0 + (var1.s1 - var1.s0) * var8;
      var11 = 1.0F - var11;
      var11 = 1.0F - var11 * var11 * var11;
      this.byte.bd.d = -(var11 * 3.1415927F / 2.0F);
      this.byte.new();
      GL11.glDisable(32826);
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
