public class dw extends d7 {
   public dw(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      float var14 = this.bm.nextFloat() * 0.1F + 0.2F;
      this.bs = var14;
      this.br = var14;
      this.bq = var14;
      this.g(0);
      this.if(0.02F, 0.02F);
      this.bv *= this.bm.nextFloat() * 0.6F + 0.5F;
      this.ai *= 0.019999999552965164D;
      this.ah *= 0.019999999552965164D;
      this.ag *= 0.019999999552965164D;
      this.bw = (int)(20.0D / (Math.random() * 0.8D + 0.2D));
      this.aE = true;
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      this.do(this.ai, this.ah, this.ag);
      this.ai *= 0.99D;
      this.ah *= 0.99D;
      this.ag *= 0.99D;
      if (this.bw-- <= 0) {
         this.az();
      }

   }
}
