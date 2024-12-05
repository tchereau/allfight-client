import org.lwjgl.opengl.GL11;

public class bw extends cd {
   public bw() {
      super(new fn(), 0.5F);
   }

   protected void a(aew var1, float var2) {
      if (var1.e4() == 1) {
         GL11.glScalef(1.2F, 1.2F, 1.2F);
      }

   }

   protected void for() {
      GL11.glTranslatef(0.09375F, 0.1875F, 0.0F);
   }
}
