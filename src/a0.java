import java.nio.FloatBuffer;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class a0 extends ay {
   FloatBuffer if = k0.if(16);

   public void a(n5 var1, double var2, double var4, double var6, float var8) {
      float var9 = (float)this.a.int;
      float var10 = (float)this.a.for;
      float var11 = (float)this.a.do;
      GL11.glDisable(2896);
      Random var12 = new Random(31100L);
      float var13 = 0.75F;

      for(int var14 = 0; var14 < 16; ++var14) {
         GL11.glPushMatrix();
         float var15 = (float)(16 - var14);
         float var16 = 0.0625F;
         float var17 = 1.0F / (var15 + 1.0F);
         if (var14 == 0) {
            this.a("/misc/tunnel.png");
            var17 = 0.1F;
            var15 = 65.0F;
            var16 = 0.125F;
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
         }

         if (var14 == 1) {
            this.a("/misc/particlefield.png");
            GL11.glEnable(3042);
            GL11.glBlendFunc(1, 1);
            var16 = 0.5F;
         }

         float var18 = (float)(-(var4 + (double)var13));
         float var19 = var18 + k7.else;
         float var20 = var18 + var15 + k7.else;
         float var21 = var19 / var20;
         var21 += (float)(var4 + (double)var13);
         GL11.glTranslatef(var9, var21, var11);
         GL11.glTexGeni(8192, 9472, 9217);
         GL11.glTexGeni(8193, 9472, 9217);
         GL11.glTexGeni(8194, 9472, 9217);
         GL11.glTexGeni(8195, 9472, 9216);
         GL11.glTexGen(8192, 9473, this.a(1.0F, 0.0F, 0.0F, 0.0F));
         GL11.glTexGen(8193, 9473, this.a(0.0F, 0.0F, 1.0F, 0.0F));
         GL11.glTexGen(8194, 9473, this.a(0.0F, 0.0F, 0.0F, 1.0F));
         GL11.glTexGen(8195, 9474, this.a(0.0F, 1.0F, 0.0F, 0.0F));
         GL11.glEnable(3168);
         GL11.glEnable(3169);
         GL11.glEnable(3170);
         GL11.glEnable(3171);
         GL11.glPopMatrix();
         GL11.glMatrixMode(5890);
         GL11.glPushMatrix();
         GL11.glLoadIdentity();
         GL11.glTranslatef(0.0F, (float)(Minecraft.h1() % 700000L) / 700000.0F, 0.0F);
         GL11.glScalef(var16, var16, var16);
         GL11.glTranslatef(0.5F, 0.5F, 0.0F);
         GL11.glRotatef((float)(var14 * var14 * 4321 + var14 * 9) * 2.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-0.5F, -0.5F, 0.0F);
         GL11.glTranslatef(-var9, -var11, -var10);
         var19 = var18 + k7.else;
         GL11.glTranslatef(k7.goto * var15 / var19, k7.char * var15 / var19, -var10);
         c4 var24 = c4.G;
         var24.if();
         var21 = var12.nextFloat() * 0.5F + 0.1F;
         float var22 = var12.nextFloat() * 0.5F + 0.4F;
         float var23 = var12.nextFloat() * 0.5F + 0.5F;
         if (var14 == 0) {
            var23 = 1.0F;
            var22 = 1.0F;
            var21 = 1.0F;
         }

         var24.a(var21 * var17, var22 * var17, var23 * var17, 1.0F);
         var24.if(var2, var4 + (double)var13, var6);
         var24.if(var2, var4 + (double)var13, var6 + 1.0D);
         var24.if(var2 + 1.0D, var4 + (double)var13, var6 + 1.0D);
         var24.if(var2 + 1.0D, var4 + (double)var13, var6);
         var24.for();
         GL11.glPopMatrix();
         GL11.glMatrixMode(5888);
      }

      GL11.glDisable(3042);
      GL11.glDisable(3168);
      GL11.glDisable(3169);
      GL11.glDisable(3170);
      GL11.glDisable(3171);
      GL11.glEnable(2896);
   }

   private FloatBuffer a(float var1, float var2, float var3, float var4) {
      this.if.clear();
      this.if.put(var1).put(var2).put(var3).put(var4);
      this.if.flip();
      return this.if;
   }
}
