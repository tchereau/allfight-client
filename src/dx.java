public class dx extends d7 {
   public dx(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4 - 0.125D, var6, var8, var10, var12);
      this.bs = 0.4F;
      this.br = 0.4F;
      this.bq = 0.7F;
      this.g(0);
      this.if(0.01F, 0.01F);
      this.bv *= this.bm.nextFloat() * 0.6F + 0.2F;
      this.ai = var8 * 0.0D;
      this.ah = var10 * 0.0D;
      this.ag = var12 * 0.0D;
      this.bw = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      this.do(this.ai, this.ah, this.ag);
      if (this.ap.byte(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj)) != ts.s) {
         this.az();
      }

      if (this.bw-- <= 0) {
         this.az();
      }

   }
}
