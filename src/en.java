public class en extends d7 {
   public en(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.bs = 1.0F;
      this.br = 1.0F;
      this.bq = 1.0F;
      this.g(32);
      this.if(0.02F, 0.02F);
      this.bv *= this.bm.nextFloat() * 0.6F + 0.2F;
      this.ai = var8 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.ah = var10 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.ag = var12 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.bw = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      this.ah += 0.002D;
      this.do(this.ai, this.ah, this.ag);
      this.ai *= 0.8500000238418579D;
      this.ah *= 0.8500000238418579D;
      this.ag *= 0.8500000238418579D;
      if (this.ap.byte(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj)) != ts.s) {
         this.az();
      }

      if (this.bw-- <= 0) {
         this.az();
      }

   }
}
