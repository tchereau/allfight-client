public class dt extends d7 {
   public dt(y6 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.ai *= 0.30000001192092896D;
      this.ah = (double)((float)Math.random() * 0.2F + 0.1F);
      this.ag *= 0.30000001192092896D;
      this.bs = 1.0F;
      this.br = 1.0F;
      this.bq = 1.0F;
      this.g(19 + this.bm.nextInt(4));
      this.if(0.01F, 0.01F);
      this.bu = 0.06F;
      this.bw = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      this.ah -= (double)this.bu;
      this.do(this.ai, this.ah, this.ag);
      this.ai *= 0.9800000190734863D;
      this.ah *= 0.9800000190734863D;
      this.ag *= 0.9800000190734863D;
      if (this.bw-- <= 0) {
         this.az();
      }

      if (this.aY) {
         if (Math.random() < 0.5D) {
            this.az();
         }

         this.ai *= 0.699999988079071D;
         this.ag *= 0.699999988079071D;
      }

      ts var1 = this.ap.byte(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj));
      if (var1.case() || var1.for()) {
         double var2 = (double)((float)(ajs.a(this.ak) + 1) - qn.i(this.ap.for(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj))));
         if (this.ak < var2) {
            this.az();
         }
      }

   }
}
