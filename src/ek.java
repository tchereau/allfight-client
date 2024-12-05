public class ek extends d7 {
   private ts cm;
   private int cn;

   public ek(y6 var1, double var2, double var4, double var6, ts var8) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.ai = this.ah = this.ag = 0.0D;
      if (var8 == ts.s) {
         this.bs = 0.0F;
         this.br = 0.0F;
         this.bq = 1.0F;
      } else {
         this.bs = 1.0F;
         this.br = 0.0F;
         this.bq = 0.0F;
      }

      this.g(113);
      this.if(0.01F, 0.01F);
      this.bu = 0.06F;
      this.cm = var8;
      this.cn = 40;
      this.bw = (int)(64.0D / (Math.random() * 0.8D + 0.2D));
      this.ai = this.ah = this.ag = 0.0D;
   }

   public int new(float var1) {
      return this.cm == ts.s ? super.new(var1) : 257;
   }

   public float int(float var1) {
      return this.cm == ts.s ? super.int(var1) : 1.0F;
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      if (this.cm == ts.s) {
         this.bs = 0.2F;
         this.br = 0.3F;
         this.bq = 1.0F;
      } else {
         this.bs = 1.0F;
         this.br = 16.0F / (float)(40 - this.cn + 16);
         this.bq = 4.0F / (float)(40 - this.cn + 8);
      }

      this.ah -= (double)this.bu;
      if (this.cn-- > 0) {
         this.ai *= 0.02D;
         this.ah *= 0.02D;
         this.ag *= 0.02D;
         this.g(113);
      } else {
         this.g(112);
      }

      this.do(this.ai, this.ah, this.ag);
      this.ai *= 0.9800000190734863D;
      this.ah *= 0.9800000190734863D;
      this.ag *= 0.9800000190734863D;
      if (this.bw-- <= 0) {
         this.az();
      }

      if (this.aY) {
         if (this.cm == ts.s) {
            this.az();
            this.ap.a("splash", this.al, this.ak, this.aj, 0.0D, 0.0D, 0.0D);
         } else {
            this.g(114);
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
