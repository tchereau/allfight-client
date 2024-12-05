import org.lwjgl.opengl.GL11;

public class bk extends b4 {
   public bk(fx var1, fx var2, float var3) {
      super(var1, var3);
      this.a(var2);
   }

   protected float a(afw var1, float var2) {
      return var1.fG();
   }

   protected int a(afw var1, int var2, float var3) {
      float var4;
      if (var2 == 0 && var1.fE()) {
         var4 = var1.int(var3) * var1.m(var3);
         this.a(var1.W());
         GL11.glColor3f(var4, var4, var4);
         return 1;
      } else if (var2 == 1 && var1.fy()) {
         this.a("/mob/wolf_collar.png");
         var4 = 1.0F;
         int var5 = var1.fF();
         GL11.glColor3f(var4 * af2.ro[var5][0], var4 * af2.ro[var5][1], var4 * af2.ro[var5][2]);
         return 1;
      } else {
         return -1;
      }
   }

   // $FF: synthetic method
   protected float for(aig var1, float var2) {
      return this.a((afw)var1, var2);
   }
}
