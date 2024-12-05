import org.lwjgl.opengl.GL11;

public class br extends b6 {
   protected void a(afb var1, float var2, pa var3, int var4) {
      int var5 = var1.gb();
      if (var5 > -1 && (float)var5 - var2 + 1.0F < 10.0F) {
         float var6 = 1.0F - ((float)var5 - var2 + 1.0F) / 10.0F;
         if (var6 < 0.0F) {
            var6 = 0.0F;
         }

         if (var6 > 1.0F) {
            var6 = 1.0F;
         }

         var6 *= var6;
         var6 *= var6;
         float var7 = 1.0F + var6 * 0.3F;
         GL11.glScalef(var7, var7, var7);
      }

      super.a(var1, var2, var3, var4);
      if (var5 > -1 && var5 / 5 % 2 == 0) {
         GL11.glDisable(3553);
         GL11.glDisable(2896);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 772);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, (1.0F - ((float)var5 - var2 + 1.0F) / 100.0F) * 0.8F);
         GL11.glPushMatrix();
         this.case.a(pa.bz, 0, 1.0F);
         GL11.glPopMatrix();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glEnable(2896);
         GL11.glEnable(3553);
      }

   }
}
