import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class iz extends j6 {
   public float hP = 1.0F;
   public boolean hO = false;
   private kc hN = null;

   public iz(int var1, int var2, int var3, kc var4, String var5, float var6) {
      super(var1, var2, var3, 150, 20, var5);
      this.hN = var4;
      this.hP = var6;
   }

   protected int l(boolean var1) {
      return 0;
   }

   protected void a(Minecraft var1, int var2, int var3) {
      if (this.ht) {
         if (this.hO) {
            this.hP = (float)(var2 - (this.hy + 4)) / (float)(this.hA - 8);
            if (this.hP < 0.0F) {
               this.hP = 0.0F;
            }

            if (this.hP > 1.0F) {
               this.hP = 1.0F;
            }

            var1.u1.a(this.hN, this.hP);
            this.hw = var1.u1.do(this.hN);
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.if(this.hy + (int)(this.hP * (float)(this.hA - 8)), this.hx, 0, 66, 4, 20);
         this.if(this.hy + (int)(this.hP * (float)(this.hA - 8)) + 4, this.hx, 196, 66, 4, 20);
      }
   }

   public boolean do(Minecraft var1, int var2, int var3) {
      if (super.do(var1, var2, var3)) {
         this.hP = (float)(var2 - (this.hy + 4)) / (float)(this.hA - 8);
         if (this.hP < 0.0F) {
            this.hP = 0.0F;
         }

         if (this.hP > 1.0F) {
            this.hP = 1.0F;
         }

         var1.u1.a(this.hN, this.hP);
         this.hw = var1.u1.do(this.hN);
         this.hO = true;
         return true;
      } else {
         return false;
      }
   }

   public void goto(int var1, int var2) {
      this.hO = false;
   }
}
