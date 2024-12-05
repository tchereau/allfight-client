import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class hx extends j6 {
   private final boolean hB;

   public hx(int var1, int var2, int var3, boolean var4) {
      super(var1, var2, var3, 12, 19, "");
      this.hB = var4;
   }

   public void if(Minecraft var1, int var2, int var3) {
      if (this.ht) {
         var1.vb.for("/gui/trading.png");
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         boolean var4 = var2 >= this.hy && var3 >= this.hx && var2 < this.hy + this.hA && var3 < this.hx + this.hz;
         int var5 = 0;
         int var6 = 176;
         if (!this.hu) {
            var6 += this.hA * 2;
         } else if (var4) {
            var6 += this.hA;
         }

         if (!this.hB) {
            var5 += this.hz;
         }

         this.if(this.hy, this.hx, var6, var5, this.hA, this.hz);
      }
   }
}
