public class fl extends fx {
   public e7 U;
   public e7 T;
   public e7 X;
   public e7 W;
   public e7 V;

   public fl() {
      float var1 = 4.0F;
      float var2 = 0.0F;
      this.X = (new e7(this, 0, 0)).if(64, 64);
      this.X.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var2 - 0.5F);
      this.X.a(0.0F, 0.0F + var1, 0.0F);
      this.W = (new e7(this, 32, 0)).if(64, 64);
      this.W.a(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.W.a(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      this.V = (new e7(this, 32, 0)).if(64, 64);
      this.V.a(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.V.a(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      this.U = (new e7(this, 0, 16)).if(64, 64);
      this.U.a(-5.0F, -10.0F, -5.0F, 10, 10, 10, var2 - 0.5F);
      this.U.a(0.0F, 0.0F + var1 + 9.0F, 0.0F);
      this.T = (new e7(this, 0, 36)).if(64, 64);
      this.T.a(-6.0F, -12.0F, -6.0F, 12, 12, 12, var2 - 0.5F);
      this.T.a(0.0F, 0.0F + var1 + 20.0F, 0.0F);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.X.c = var4 / 57.295776F;
      this.X.d = var5 / 57.295776F;
      this.U.c = var4 / 57.295776F * 0.25F;
      float var8 = ajs.try(this.U.c);
      float var9 = ajs.for(this.U.c);
      this.W.b = 1.0F;
      this.V.b = -1.0F;
      this.W.c = 0.0F + this.U.c;
      this.V.c = 3.1415927F + this.U.c;
      this.W.g = var9 * 5.0F;
      this.W.e = -var8 * 5.0F;
      this.V.g = -var9 * 5.0F;
      this.V.e = var8 * 5.0F;
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      this.U.for(var7);
      this.T.for(var7);
      this.X.for(var7);
      this.W.for(var7);
      this.V.for(var7);
   }
}
