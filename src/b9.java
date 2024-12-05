import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class b9 extends b4 {
   private int x;

   public b9() {
      super(new fz(), 0.25F);
      this.x = ((fz)this.l).for();
   }

   public void a(ae1 var1, double var2, double var4, double var6, float var8, float var9) {
      int var10 = ((fz)this.l).for();
      if (var10 != this.x) {
         this.x = var10;
         this.l = new fz();
         Minecraft.ih().a().a("Loaded new lava slime model");
      }

      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected void a(ae1 var1, float var2) {
      int var3 = var1.eQ();
      float var4 = (var1.p4 + (var1.p5 - var1.p4) * var2) / ((float)var3 * 0.5F + 1.0F);
      float var5 = 1.0F / (var4 + 1.0F);
      float var6 = (float)var3;
      GL11.glScalef(var5 * var6, 1.0F / var5 * var6, var5 * var6);
   }
}
