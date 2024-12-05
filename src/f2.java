import java.util.Random;
import org.lwjgl.opengl.GL11;

public class f2 extends fx {
   e7 aW;
   e7[] aV = new e7[9];

   public f2() {
      byte var1 = -16;
      this.aW = new e7(this, 0, 0);
      this.aW.a(-8.0F, -8.0F, -8.0F, 16, 16, 16);
      e7 var10000 = this.aW;
      var10000.f += (float)(24 + var1);
      Random var2 = new Random(1660L);

      for(int var3 = 0; var3 < this.aV.length; ++var3) {
         this.aV[var3] = new e7(this, 0, 0);
         float var4 = (((float)(var3 % 3) - (float)(var3 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float var5 = ((float)(var3 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int var6 = var2.nextInt(7) + 8;
         this.aV[var3].a(-1.0F, 0.0F, -1.0F, 2, var6, 2);
         this.aV[var3].g = var4;
         this.aV[var3].e = var5;
         this.aV[var3].f = (float)(31 + var1);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      for(int var8 = 0; var8 < this.aV.length; ++var8) {
         this.aV[var8].d = 0.2F * ajs.try(var3 * 0.3F + (float)var8) + 0.4F;
      }

   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 0.6F, 0.0F);
      this.aW.for(var7);
      e7[] var8 = this.aV;
      int var9 = var8.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         e7 var11 = var8[var10];
         var11.for(var7);
      }

      GL11.glPopMatrix();
   }
}
