public class fj extends fx {
   e7 H;
   e7[] G = new e7[8];

   public fj() {
      byte var1 = -16;
      this.H = new e7(this, 0, 0);
      this.H.a(-6.0F, -8.0F, -6.0F, 12, 16, 12);
      e7 var10000 = this.H;
      var10000.f += (float)(24 + var1);

      for(int var2 = 0; var2 < this.G.length; ++var2) {
         this.G[var2] = new e7(this, 48, 0);
         double var3 = (double)var2 * 3.141592653589793D * 2.0D / (double)this.G.length;
         float var5 = (float)Math.cos(var3) * 5.0F;
         float var6 = (float)Math.sin(var3) * 5.0F;
         this.G[var2].a(-1.0F, 0.0F, -1.0F, 2, 18, 2);
         this.G[var2].g = var5;
         this.G[var2].e = var6;
         this.G[var2].f = (float)(31 + var1);
         var3 = (double)var2 * 3.141592653589793D * -2.0D / (double)this.G.length + 1.5707963267948966D;
         this.G[var2].c = (float)var3;
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      e7[] var8 = this.G;
      int var9 = var8.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         e7 var11 = var8[var10];
         var11.d = var3;
      }

   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      this.H.for(var7);

      for(int var8 = 0; var8 < this.G.length; ++var8) {
         this.G[var8].for(var7);
      }

   }
}
