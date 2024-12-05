public class d3 extends d7 {
   float bN;

   public d3(y6 var1, double var2, double var4, double var6, float var8, float var9, float var10) {
      this(var1, var2, var4, var6, 1.0F, var8, var9, var10);
   }

   public d3(y6 var1, double var2, double var4, double var6, float var8, float var9, float var10, float var11) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.ai *= 0.10000000149011612D;
      this.ah *= 0.10000000149011612D;
      this.ag *= 0.10000000149011612D;
      if (var9 == 0.0F) {
         var9 = 1.0F;
      }

      float var12 = (float)Math.random() * 0.4F + 0.6F;
      this.bs = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * var9 * var12;
      this.br = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * var10 * var12;
      this.bq = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * var11 * var12;
      this.bv *= 0.75F;
      this.bv *= var8;
      this.bN = this.bv;
      this.bw = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
      this.bw = (int)((float)this.bw * var8);
      this.aE = false;
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.bx + var2) / (float)this.bw * 32.0F;
      if (var8 < 0.0F) {
         var8 = 0.0F;
      }

      if (var8 > 1.0F) {
         var8 = 1.0F;
      }

      this.bv = this.bN * var8;
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      if (this.bx++ >= this.bw) {
         this.az();
      }

      this.g(7 - this.bx * 8 / this.bw);
      this.do(this.ai, this.ah, this.ag);
      if (this.ak == this.an) {
         this.ai *= 1.1D;
         this.ag *= 1.1D;
      }

      this.ai *= 0.9599999785423279D;
      this.ah *= 0.9599999785423279D;
      this.ag *= 0.9599999785423279D;
      if (this.aY) {
         this.ai *= 0.699999988079071D;
         this.ag *= 0.699999988079071D;
      }

   }
}
