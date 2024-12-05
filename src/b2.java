import org.lwjgl.opengl.GL11;

public class b2 extends b4 {
   public b2(fx var1, float var2) {
      super(var1, var2);
   }

   public void a(af4 var1, double var2, double var4, double var6, float var8, float var9) {
      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected void a(af4 var1, float var2) {
      super.int(var1, var2);
      if (var1.fy()) {
         GL11.glScalef(0.8F, 0.8F, 0.8F);
      }

   }
}
