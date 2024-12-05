import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;

public class c6 {
   private int case;
   private int byte;
   private int try;
   private double new;
   private double int;
   private double for;
   private IntBuffer do = k0.do(65536);
   private boolean if = false;
   private boolean a = false;

   public void a(int var1, int var2, int var3, double var4, double var6, double var8) {
      this.if = true;
      this.do.clear();
      this.case = var1;
      this.byte = var2;
      this.try = var3;
      this.new = var4;
      this.int = var6;
      this.for = var8;
   }

   public boolean a(int var1, int var2, int var3) {
      if (!this.if) {
         return false;
      } else {
         return var1 == this.case && var2 == this.byte && var3 == this.try;
      }
   }

   public void a(int var1) {
      this.do.put(var1);
      if (this.do.remaining() == 0) {
         this.if();
      }

   }

   public void if() {
      if (this.if) {
         if (!this.a) {
            this.do.flip();
            this.a = true;
         }

         if (this.do.remaining() > 0) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((double)this.case - this.new), (float)((double)this.byte - this.int), (float)((double)this.try - this.for));
            GL11.glCallLists(this.do);
            GL11.glPopMatrix();
         }

      }
   }

   public void a() {
      this.if = false;
      this.a = false;
   }
}
