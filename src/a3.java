import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class a3 extends ay {
   private c2 try;

   public void a(nx var1, double var2, double var4, double var6, float var8) {
      pa var9 = pa.x[var1.i()];
      if (var9 != null && var1.a(var8) < 1.0F) {
         c4 var10 = c4.G;
         this.a("/terrain.png");
         k1.do();
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(3042);
         GL11.glDisable(2884);
         if (Minecraft.hP()) {
            GL11.glShadeModel(7425);
         } else {
            GL11.glShadeModel(7424);
         }

         var10.if();
         var10.a((double)((float)var2 - (float)var1.new + var1.for(var8)), (double)((float)var4 - (float)var1.int + var1.do(var8)), (double)((float)var6 - (float)var1.for + var1.if(var8)));
         var10.a(1, 1, 1);
         if (var9 == pa.bX && var1.a(var8) < 0.5F) {
            this.try.do(var9, var1.new, var1.int, var1.for, false);
         } else if (var1.f() && !var1.h()) {
            pa.bX.a(((n0)var9).s());
            this.try.do(pa.bX, var1.new, var1.int, var1.for, var1.a(var8) < 0.5F);
            pa.bX.r();
            var10.a((double)((float)var2 - (float)var1.new), (double)((float)var4 - (float)var1.int), (double)((float)var6 - (float)var1.for));
            this.try.byte(var9, var1.new, var1.int, var1.for);
         } else {
            this.try.void(var9, var1.new, var1.int, var1.for);
         }

         var10.a(0.0D, 0.0D, 0.0D);
         var10.for();
         k1.if();
      }

   }

   public void a(y6 var1) {
      this.try = new c2(var1);
   }
}
