import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class gx extends jo {
   private List gJ = new ArrayList();
   private Minecraft gI;

   public gx(Minecraft var1) {
      this.gI = var1;
   }

   public void cZ() {
      for(int var1 = 0; var1 < this.gJ.size(); ++var1) {
         gy var2 = (gy)this.gJ.get(var1);
         var2.if();
         var2.a(this);
         if (var2.goto) {
            this.gJ.remove(var1--);
         }
      }

   }

   public void e(float var1) {
      this.gI.vb.for("/gui/particles.png");

      for(int var2 = 0; var2 < this.gJ.size(); ++var2) {
         gy var3 = (gy)this.gJ.get(var2);
         int var4 = (int)(var3.d + (var3.f - var3.d) * (double)var1 - 4.0D);
         int var5 = (int)(var3.c + (var3.e - var3.c) * (double)var1 - 4.0D);
         float var6 = (float)(var3.if + (var3.new - var3.if) * (double)var1);
         float var7 = (float)(var3.int + (var3.case - var3.int) * (double)var1);
         float var8 = (float)(var3.for + (var3.byte - var3.for) * (double)var1);
         float var9 = (float)(var3.do + (var3.try - var3.do) * (double)var1);
         GL11.glColor4f(var7, var8, var9, var6);
         this.if(var4, var5, 40, 0, 8, 8);
      }

   }
}
