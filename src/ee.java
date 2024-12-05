public class ee extends d7 {
   private float b5;

   public ee(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.ai = this.ai * 0.009999999776482582D + var8;
      this.ah = this.ah * 0.009999999776482582D + var10;
      this.ag = this.ag * 0.009999999776482582D + var12;
      double var10000 = var2 + (double)((this.bm.nextFloat() - this.bm.nextFloat()) * 0.05F);
      var10000 = var4 + (double)((this.bm.nextFloat() - this.bm.nextFloat()) * 0.05F);
      var10000 = var6 + (double)((this.bm.nextFloat() - this.bm.nextFloat()) * 0.05F);
      this.b5 = this.bv;
      this.bs = this.br = this.bq = 1.0F;
      this.bw = (int)(8.0D / (Math.random() * 0.8D + 0.2D)) + 4;
      this.aE = true;
      this.g(48);
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.bx + var2) / (float)this.bw;
      this.bv = this.b5 * (1.0F - var8 * var8 * 0.5F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public int new(float var1) {
      float var2 = ((float)this.bx + var1) / (float)this.bw;
      if (var2 < 0.0F) {
         var2 = 0.0F;
      }

      if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      int var3 = super.new(var1);
      int var4 = var3 & 255;
      int var5 = var3 >> 16 & 255;
      var4 += (int)(var2 * 15.0F * 16.0F);
      if (var4 > 240) {
         var4 = 240;
      }

      return var4 | var5 << 16;
   }

   public float int(float var1) {
      float var2 = ((float)this.bx + var1) / (float)this.bw;
      if (var2 < 0.0F) {
         var2 = 0.0F;
      }

      if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      float var3 = super.int(var1);
      return var3 * var2 + (1.0F - var2);
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      if (this.bx++ >= this.bw) {
         this.az();
      }

      this.do(this.ai, this.ah, this.ag);
      this.ai *= 0.9599999785423279D;
      this.ah *= 0.9599999785423279D;
      this.ag *= 0.9599999785423279D;
      if (this.aY) {
         this.ai *= 0.699999988079071D;
         this.ag *= 0.699999988079071D;
      }

   }
}
