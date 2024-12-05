import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class j6 extends jo {
   protected int hA;
   protected int hz;
   public int hy;
   public int hx;
   public String hw;
   public int hv;
   public boolean hu;
   public boolean ht;
   protected boolean hs;

   public j6(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, 200, 20, var4);
   }

   public j6(int var1, int var2, int var3, int var4, int var5, String var6) {
      this.hA = 200;
      this.hz = 20;
      this.hu = true;
      this.ht = true;
      this.hv = var1;
      this.hy = var2;
      this.hx = var3;
      this.hA = var4;
      this.hz = var5;
      this.hw = var6;
   }

   protected int l(boolean var1) {
      byte var2 = 1;
      if (!this.hu) {
         var2 = 0;
      } else if (var1) {
         var2 = 2;
      }

      return var2;
   }

   public void if(Minecraft var1, int var2, int var3) {
      if (this.ht) {
         jq var4 = var1.va;
         var1.vb.for("/gui/gui.png");
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.hs = var2 >= this.hy && var3 >= this.hx && var2 < this.hy + this.hA && var3 < this.hx + this.hz;
         int var5 = this.l(this.hs);
         this.if(this.hy, this.hx, 0, 46 + var5 * 20, this.hA / 2, this.hz);
         this.if(this.hy + this.hA / 2, this.hx, 200 - this.hA / 2, 46 + var5 * 20, this.hA / 2, this.hz);
         this.a(var1, var2, var3);
         int var6 = 14737632;
         if (!this.hu) {
            var6 = -6250336;
         } else if (this.hs) {
            var6 = 16777120;
         }

         this.a(var4, this.hw, this.hy + this.hA / 2, this.hx + (this.hz - 8) / 2, var6);
      }
   }

   protected void a(Minecraft var1, int var2, int var3) {
   }

   public void goto(int var1, int var2) {
   }

   public boolean do(Minecraft var1, int var2, int var3) {
      return this.hu && this.ht && var2 >= this.hy && var3 >= this.hx && var2 < this.hy + this.hA && var3 < this.hx + this.hz;
   }

   public boolean dt() {
      return this.hs;
   }

   public void else(int var1, int var2) {
   }
}
