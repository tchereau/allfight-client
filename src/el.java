public class el extends d7 {
   float co;

   public el(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 1.0F);
   }

   public el(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.ai *= 0.10000000149011612D;
      this.ah *= 0.10000000149011612D;
      this.ag *= 0.10000000149011612D;
      this.ai += var8 * 0.4D;
      this.ah += var10 * 0.4D;
      this.ag += var12 * 0.4D;
      this.bs = this.br = this.bq = (float)(Math.random() * 0.30000001192092896D + 0.6000000238418579D);
      this.bv *= 0.75F;
      this.bv *= var14;
      this.co = this.bv;
      this.bw = (int)(6.0D / (Math.random() * 0.8D + 0.6D));
      this.bw = (int)((float)this.bw * var14);
      this.aE = false;
      this.g(65);
      this.aC();
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.bx + var2) / (float)this.bw * 32.0F;
      if (var8 < 0.0F) {
         var8 = 0.0F;
      }

      if (var8 > 1.0F) {
         var8 = 1.0F;
      }

      this.bv = this.co * var8;
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
      this.br = (float)((double)this.br * 0.96D);
      this.bq = (float)((double)this.bq * 0.9D);
      this.ai *= 0.699999988079071D;
      this.ah *= 0.699999988079071D;
      this.ag *= 0.699999988079071D;
      this.ah -= 0.019999999552965164D;
      if (this.aY) {
         this.ai *= 0.699999988079071D;
         this.ag *= 0.699999988079071D;
      }

   }
}
