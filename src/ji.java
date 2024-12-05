import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class ji extends j6 {
   public ji(int var1, int var2, int var3) {
      super(var1, var2, var3, 20, 20, "");
   }

   public void if(Minecraft var1, int var2, int var3) {
      if (this.ht) {
         var1.vb.for("/gui/gui.png");
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         boolean var4 = var2 >= this.hy && var3 >= this.hx && var2 < this.hy + this.hA && var3 < this.hx + this.hz;
         int var5 = 106;
         if (var4) {
            var5 += this.hz;
         }

         this.if(this.hy, this.hx, 0, var5, this.hA, this.hz);
      }
   }
}
