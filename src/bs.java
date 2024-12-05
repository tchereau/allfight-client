import org.lwjgl.opengl.GL11;

public class bs extends b4 {
   public bs(fx var1, float var2) {
      super(var1, var2);
   }

   public void a(afz var1, double var2, double var4, double var6, float var8, float var9) {
      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected void a(afz var1, float var2, float var3, float var4) {
      float var5 = var1.re + (var1.rg - var1.re) * var4;
      float var6 = var1.ra + (var1.rc - var1.ra) * var4;
      GL11.glTranslatef(0.0F, 0.5F, 0.0F);
      GL11.glRotatef(180.0F - var3, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var5, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var6, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, -1.2F, 0.0F);
   }

   protected float a(afz var1, float var2) {
      return var1.rf + (var1.q4 - var1.rf) * var2;
   }

   // $FF: synthetic method
   protected float for(aig var1, float var2) {
      return this.a((afz)var1, var2);
   }
}
