public class d8 extends d7 {
   float bT;

   public d8(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 2.0F);
   }

   public d8(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.ai *= 0.009999999776482582D;
      this.ah *= 0.009999999776482582D;
      this.ag *= 0.009999999776482582D;
      this.ah += 0.2D;
      this.bs = ajs.try(((float)var8 + 0.0F) * 3.1415927F * 2.0F) * 0.65F + 0.35F;
      this.br = ajs.try(((float)var8 + 0.33333334F) * 3.1415927F * 2.0F) * 0.65F + 0.35F;
      this.bq = ajs.try(((float)var8 + 0.6666667F) * 3.1415927F * 2.0F) * 0.65F + 0.35F;
      this.bv *= 0.75F;
      this.bv *= var14;
      this.bT = this.bv;
      this.bw = 6;
      this.aE = false;
      this.g(64);
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.bx + var2) / (float)this.bw * 32.0F;
      if (var8 < 0.0F) {
         var8 = 0.0F;
      }

      if (var8 > 1.0F) {
         var8 = 1.0F;
      }

      this.bv = this.bT * var8;
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

      this.ai *= 0.6600000262260437D;
      this.ah *= 0.6600000262260437D;
      this.ag *= 0.6600000262260437D;
      if (this.aY) {
         this.ai *= 0.699999988079071D;
         this.ag *= 0.699999988079071D;
      }

   }
}
