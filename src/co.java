import org.lwjgl.opengl.GL11;

public class co extends ck {
   private int h = -1;
   private fx i;

   public co() {
      this.for = 0.5F;
   }

   public void a(afs var1, double var2, double var4, double var6, float var8, float var9) {
      if (this.h != 1) {
         this.i = new e9(0.0F, true);
         this.h = 1;
      }

      float var10 = (float)var1.d3 + var9;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      this.a("/mob/enderdragon/crystal.png");
      float var11 = ajs.try(var10 * 0.2F) / 2.0F + 0.5F;
      var11 += var11 * var11;
      this.i.a(var1, 0.0F, var10 * 3.0F, var11 * 0.2F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }
}
