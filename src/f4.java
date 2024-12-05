public class f4 extends fx {
   public e7 aY;
   public e7 aX;
   public e7 a3;
   public e7 a2;
   public e7 a1;
   public e7 a0;
   public e7 aZ;

   public f4() {
      this(0.0F);
   }

   public f4(float var1) {
      byte var2 = 4;
      this.aY = new e7(this, 0, 0);
      this.aY.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.aY.a(0.0F, (float)var2, 0.0F);
      this.aX = new e7(this, 32, 0);
      this.aX.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.aX.a(0.0F, (float)var2, 0.0F);
      this.a3 = new e7(this, 16, 16);
      this.a3.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.a3.a(0.0F, (float)var2, 0.0F);
      this.a2 = new e7(this, 0, 16);
      this.a2.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.a2.a(-2.0F, (float)(12 + var2), 4.0F);
      this.a1 = new e7(this, 0, 16);
      this.a1.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.a1.a(2.0F, (float)(12 + var2), 4.0F);
      this.a0 = new e7(this, 0, 16);
      this.a0.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.a0.a(-2.0F, (float)(12 + var2), -4.0F);
      this.aZ = new e7(this, 0, 16);
      this.aZ.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.aZ.a(2.0F, (float)(12 + var2), -4.0F);
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      this.aY.for(var7);
      this.a3.for(var7);
      this.a2.for(var7);
      this.a1.for(var7);
      this.a0.for(var7);
      this.aZ.for(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      this.aY.c = var4 / 57.295776F;
      this.aY.d = var5 / 57.295776F;
      this.a2.d = ajs.for(var1 * 0.6662F) * 1.4F * var2;
      this.a1.d = ajs.for(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.a0.d = ajs.for(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.aZ.d = ajs.for(var1 * 0.6662F) * 1.4F * var2;
   }
}
