import org.lwjgl.opengl.GL11;

public class cf extends b4 {
   public cf() {
      super(new f2(), 0.5F);
   }

   protected void a(ae3 var1, float var2) {
      float var4 = ((float)var1.qa + (float)(var1.p9 - var1.qa) * var2) / 20.0F;
      if (var4 < 0.0F) {
         var4 = 0.0F;
      }

      var4 = 1.0F / (var4 * var4 * var4 * var4 * var4 * 2.0F + 1.0F);
      float var5 = (8.0F + var4) / 2.0F;
      float var6 = (8.0F + 1.0F / var4) / 2.0F;
      GL11.glScalef(var6, var5, var6);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
