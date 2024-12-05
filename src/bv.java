import org.lwjgl.opengl.GL11;

public class bv extends b4 {
   private fx s;

   public bv(fx var1, fx var2, float var3) {
      super(var1, var3);
      this.s = var2;
   }

   protected int a(aev var1, int var2, float var3) {
      if (var1.U()) {
         return 0;
      } else if (var2 == 0) {
         this.a(this.s);
         GL11.glEnable(2977);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         return 1;
      } else {
         if (var2 == 1) {
            GL11.glDisable(3042);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }

         return -1;
      }
   }

   protected void a(aev var1, float var2) {
      float var3 = (float)var1.eQ();
      float var4 = (var1.p4 + (var1.p5 - var1.p4) * var2) / (var3 * 0.5F + 1.0F);
      float var5 = 1.0F / (var4 + 1.0F);
      GL11.glScalef(var5 * var3, 1.0F / var5 * var3, var5 * var3);
   }
}
