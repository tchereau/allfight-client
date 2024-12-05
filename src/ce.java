import org.lwjgl.opengl.GL11;

public class ce extends b4 {
   private float y;

   public ce(fx var1, float var2, float var3) {
      super(var1, var2 * var3);
      this.y = var3;
   }

   protected void a(ae2 var1, float var2) {
      GL11.glScalef(this.y, this.y, this.y);
   }
}
