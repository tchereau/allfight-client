public class ei extends d7 {
   public ei(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.ai = var8 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.ah = var10 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.ag = var12 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.bs = this.br = this.bq = this.bm.nextFloat() * 0.3F + 0.7F;
      this.bv = this.bm.nextFloat() * this.bm.nextFloat() * 6.0F + 1.0F;
      this.bw = (int)(16.0D / ((double)this.bm.nextFloat() * 0.8D + 0.2D)) + 2;
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      if (this.bx++ >= this.bw) {
         this.az();
      }

      this.g(7 - this.bx * 8 / this.bw);
      this.ah += 0.004D;
      this.do(this.ai, this.ah, this.ag);
      this.ai *= 0.8999999761581421D;
      this.ah *= 0.8999999761581421D;
      this.ag *= 0.8999999761581421D;
      if (this.aY) {
         this.ai *= 0.699999988079071D;
         this.ag *= 0.699999988079071D;
      }

   }
}
