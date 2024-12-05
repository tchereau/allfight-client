import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class ig extends j6 {
   private final String hF;
   private final int hE;
   private final int hD;
   private boolean hG;

   protected ig(int var1, int var2, int var3, String var4, int var5, int var6) {
      super(var1, var2, var3, 22, 22, "");
      this.hF = var4;
      this.hE = var5;
      this.hD = var6;
   }

   public void if(Minecraft var1, int var2, int var3) {
      if (this.ht) {
         var1.vb.for("/gui/beacon.png");
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.hs = var2 >= this.hy && var3 >= this.hx && var2 < this.hy + this.hA && var3 < this.hx + this.hz;
         short var4 = 219;
         int var5 = 0;
         if (!this.hu) {
            var5 += this.hA * 2;
         } else if (this.hG) {
            var5 += this.hA * 1;
         } else if (this.hs) {
            var5 += this.hA * 3;
         }

         this.if(this.hy, this.hx, var5, var4, this.hA, this.hz);
         if (!"/gui/beacon.png".equals(this.hF)) {
            var1.vb.for(this.hF);
         }

         this.if(this.hy + 2, this.hx + 2, this.hE, this.hD, 18, 18);
      }
   }

   public boolean du() {
      return this.hG;
   }

   public void m(boolean var1) {
      this.hG = var1;
   }
}
