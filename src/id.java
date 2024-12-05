import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class id extends j6 {
   private final boolean hC;

   public id(int var1, int var2, int var3, boolean var4) {
      super(var1, var2, var3, 23, 13, "");
      this.hC = var4;
   }

   public void if(Minecraft var1, int var2, int var3) {
      if (this.ht) {
         boolean var4 = var2 >= this.hy && var3 >= this.hx && var2 < this.hy + this.hA && var3 < this.hx + this.hz;
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var1.vb.for("/gui/book.png");
         int var5 = 0;
         int var6 = 192;
         if (var4) {
            var5 += 23;
         }

         if (!this.hC) {
            var6 += 13;
         }

         this.if(this.hy, this.hx, var5, var6, 23, 13);
      }
   }
}
