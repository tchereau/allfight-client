import org.lwjgl.opengl.GL11;

public class f6 extends fx {
   public e7 a5;
   public e7 a4;
   public e7 bb;
   public e7 ba;
   public e7 a9;
   public e7 a8;
   public e7 a7;
   public e7 a6;

   public f6() {
      byte var1 = 16;
      this.a5 = new e7(this, 0, 0);
      this.a5.a(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
      this.a5.a(0.0F, (float)(-1 + var1), -4.0F);
      this.a7 = new e7(this, 14, 0);
      this.a7.a(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
      this.a7.a(0.0F, (float)(-1 + var1), -4.0F);
      this.a6 = new e7(this, 14, 4);
      this.a6.a(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
      this.a6.a(0.0F, (float)(-1 + var1), -4.0F);
      this.a4 = new e7(this, 0, 9);
      this.a4.a(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
      this.a4.a(0.0F, (float)var1, 0.0F);
      this.bb = new e7(this, 26, 0);
      this.bb.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.bb.a(-2.0F, (float)(3 + var1), 1.0F);
      this.ba = new e7(this, 26, 0);
      this.ba.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.ba.a(1.0F, (float)(3 + var1), 1.0F);
      this.a9 = new e7(this, 24, 13);
      this.a9.a(0.0F, 0.0F, -3.0F, 1, 4, 6);
      this.a9.a(-4.0F, (float)(-3 + var1), 0.0F);
      this.a8 = new e7(this, 24, 13);
      this.a8.a(-1.0F, 0.0F, -3.0F, 1, 4, 6);
      this.a8.a(4.0F, (float)(-3 + var1), 0.0F);
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      if (this.for) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, 5.0F * var7, 2.0F * var7);
         this.a5.for(var7);
         this.a7.for(var7);
         this.a6.for(var7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
         GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
         this.a4.for(var7);
         this.bb.for(var7);
         this.ba.for(var7);
         this.a9.for(var7);
         this.a8.for(var7);
         GL11.glPopMatrix();
      } else {
         this.a5.for(var7);
         this.a7.for(var7);
         this.a6.for(var7);
         this.a4.for(var7);
         this.bb.for(var7);
         this.ba.for(var7);
         this.a9.for(var7);
         this.a8.for(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      this.a5.d = var5 / 57.295776F;
      this.a5.c = var4 / 57.295776F;
      this.a7.d = this.a5.d;
      this.a7.c = this.a5.c;
      this.a6.d = this.a5.d;
      this.a6.c = this.a5.c;
      this.a4.d = 1.5707964F;
      this.bb.d = ajs.for(var1 * 0.6662F) * 1.4F * var2;
      this.ba.d = ajs.for(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.a9.b = var3;
      this.a8.b = -var3;
   }
}
