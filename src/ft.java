import org.lwjgl.opengl.GL11;

public class ft extends fx {
   public e7 al = new e7(this, 0, 0);
   public e7 ak;
   public e7 ar;
   public e7 aq;
   public e7 ap;
   public e7 ao;
   protected float an = 8.0F;
   protected float am = 4.0F;

   public ft(int var1, float var2) {
      this.al.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, var2);
      this.al.a(0.0F, (float)(18 - var1), -6.0F);
      this.ak = new e7(this, 28, 8);
      this.ak.a(-5.0F, -10.0F, -7.0F, 10, 16, 8, var2);
      this.ak.a(0.0F, (float)(17 - var1), 2.0F);
      this.ar = new e7(this, 0, 16);
      this.ar.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.ar.a(-3.0F, (float)(24 - var1), 7.0F);
      this.aq = new e7(this, 0, 16);
      this.aq.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.aq.a(3.0F, (float)(24 - var1), 7.0F);
      this.ap = new e7(this, 0, 16);
      this.ap.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.ap.a(-3.0F, (float)(24 - var1), -5.0F);
      this.ao = new e7(this, 0, 16);
      this.ao.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.ao.a(3.0F, (float)(24 - var1), -5.0F);
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      if (this.for) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, this.an * var7, this.am * var7);
         this.al.for(var7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
         GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
         this.ak.for(var7);
         this.ar.for(var7);
         this.aq.for(var7);
         this.ap.for(var7);
         this.ao.for(var7);
         GL11.glPopMatrix();
      } else {
         this.al.for(var7);
         this.ak.for(var7);
         this.ar.for(var7);
         this.aq.for(var7);
         this.ap.for(var7);
         this.ao.for(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      this.al.d = var5 / 57.295776F;
      this.al.c = var4 / 57.295776F;
      this.ak.d = 1.5707964F;
      this.ar.d = ajs.for(var1 * 0.6662F) * 1.4F * var2;
      this.aq.d = ajs.for(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.ap.d = ajs.for(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.ao.d = ajs.for(var1 * 0.6662F) * 1.4F * var2;
   }
}
