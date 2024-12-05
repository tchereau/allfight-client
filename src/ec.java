public class ec extends d7 {
   float b1;

   public ec(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 2.0F);
   }

   public ec(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.ai *= 0.009999999776482582D;
      this.ah *= 0.009999999776482582D;
      this.ag *= 0.009999999776482582D;
      this.ah += 0.1D;
      this.bv *= 0.75F;
      this.bv *= var14;
      this.b1 = this.bv;
      this.bw = 16;
      this.aE = false;
      this.g(80);
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.bx + var2) / (float)this.bw * 32.0F;
      if (var8 < 0.0F) {
         var8 = 0.0F;
      }

      if (var8 > 1.0F) {
         var8 = 1.0F;
      }

      this.bv = this.b1 * var8;
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      if (this.bx++ >= this.bw) {
         this.az();
      }

      this.do(this.ai, this.ah, this.ag);
      if (this.ak == this.an) {
         this.ai *= 1.1D;
         this.ag *= 1.1D;
      }

      this.ai *= 0.8600000143051147D;
      this.ah *= 0.8600000143051147D;
      this.ag *= 0.8600000143051147D;
      if (this.aY) {
         this.ai *= 0.699999988079071D;
         this.ag *= 0.699999988079071D;
      }

   }
}
