import org.lwjgl.opengl.GL11;

public class by extends b4 {
   public by(fx var1, fx var2, float var3) {
      super(var1, var3);
      this.a(var2);
   }

   protected int a(af2 var1, int var2, float var3) {
      if (var2 == 0 && !var1.fu()) {
         this.a("/mob/sheep_fur.png");
         float var4 = 1.0F;
         int var5 = var1.fv();
         GL11.glColor3f(var4 * af2.ro[var5][0], var4 * af2.ro[var5][1], var4 * af2.ro[var5][2]);
         return 1;
      } else {
         return -1;
      }
   }
}
