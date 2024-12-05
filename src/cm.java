import java.util.Random;
import org.lwjgl.opengl.GL11;

public class cm extends b4 {
   private f3 z;
   private Random A = new Random();

   public cm() {
      super(new f3(), 0.5F);
      this.z = (f3)super.l;
      this.a(this.z);
   }

   public void a(ae6 var1, double var2, double var4, double var6, float var8, float var9) {
      this.z.aU = var1.fk() > 0;
      this.z.aT = var1.fn();
      if (var1.fn()) {
         double var10 = 0.02D;
         var2 += this.A.nextGaussian() * var10;
         var6 += this.A.nextGaussian() * var10;
      }

      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected void a(ae6 var1, float var2) {
      super.do(var1, var2);
      if (var1.fk() > 0) {
         GL11.glEnable(32826);
         GL11.glPushMatrix();
         float var3 = 0.5F;
         GL11.glTranslatef(0.0F, 0.6875F, -0.75F);
         var3 *= 1.0F;
         GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(-var3, -var3, var3);
         int var4 = var1.new(var2);
         int var5 = var4 % 65536;
         int var6 = var4 / 65536;
         q.a(q.a, (float)var5 / 1.0F, (float)var6 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.a("/terrain.png");
         this.int.a(pa.x[var1.fk()], var1.fl(), 1.0F);
         GL11.glPopMatrix();
         GL11.glDisable(32826);
      }

   }

   protected int a(ae6 var1, int var2, float var3) {
      if (var2 != 0) {
         return -1;
      } else {
         this.a("/mob/enderman_eyes.png");
         float var4 = 1.0F;
         GL11.glEnable(3042);
         GL11.glDisable(3008);
         GL11.glBlendFunc(1, 1);
         GL11.glDisable(2896);
         if (var1.U()) {
            GL11.glDepthMask(false);
         } else {
            GL11.glDepthMask(true);
         }

         char var5 = '\uf0f0';
         int var6 = var5 % 65536;
         int var7 = var5 / 65536;
         q.a(q.a, (float)var6 / 1.0F, (float)var7 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(2896);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);
         return 1;
      }
   }

   // $FF: synthetic method
   protected void do(aig var1, float var2) {
      this.a((ae6)var1, var2);
   }
}
