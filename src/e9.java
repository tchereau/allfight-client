import org.lwjgl.opengl.GL11;

public class e9 extends fx {
   private e7 bw;
   private e7 bv = new e7(this, "glass");
   private e7 bx;

   public e9(float var1, boolean var2) {
      this.bv.a(0, 0).a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      this.bw = new e7(this, "cube");
      this.bw.a(32, 0).a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      if (var2) {
         this.bx = new e7(this, "base");
         this.bx.a(0, 16).a(-6.0F, 0.0F, -6.0F, 12, 4, 12);
      }

   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      GL11.glTranslatef(0.0F, -0.5F, 0.0F);
      if (this.bx != null) {
         this.bx.for(var7);
      }

      GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.8F + var4, 0.0F);
      GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
      this.bv.for(var7);
      float var8 = 0.875F;
      GL11.glScalef(var8, var8, var8);
      GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
      GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
      this.bv.for(var7);
      GL11.glScalef(var8, var8, var8);
      GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
      GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
      this.bw.for(var7);
      GL11.glPopMatrix();
   }
}
