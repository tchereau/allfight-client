public class d9 extends d7 {
   private float bU;

   public d9(y6 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.ai *= 0.800000011920929D;
      this.ah *= 0.800000011920929D;
      this.ag *= 0.800000011920929D;
      this.ah = (double)(this.bm.nextFloat() * 0.4F + 0.05F);
      this.bs = this.br = this.bq = 1.0F;
      this.bv *= this.bm.nextFloat() * 2.0F + 0.2F;
      this.bU = this.bv;
      this.bw = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
      this.aE = false;
      this.g(49);
   }

   public int new(float var1) {
      float var2 = ((float)this.bx + var1) / (float)this.bw;
      if (var2 < 0.0F) {
         var2 = 0.0F;
      }

      if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      int var3 = super.new(var1);
      short var4 = 240;
      int var5 = var3 >> 16 & 255;
      return var4 | var5 << 16;
   }

   public float int(float var1) {
      return 1.0F;
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.bx + var2) / (float)this.bw;
      this.bv = this.bU * (1.0F - var8 * var8);
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      if (this.bx++ >= this.bw) {
         this.az();
      }

      float var1 = (float)this.bx / (float)this.bw;
      if (this.bm.nextFloat() > var1) {
         this.ap.a("smoke", this.al, this.ak, this.aj, this.ai, this.ah, this.ag);
      }

      this.ah -= 0.03D;
      this.do(this.ai, this.ah, this.ag);
      this.ai *= 0.9990000128746033D;
      this.ah *= 0.9990000128746033D;
      this.ag *= 0.9990000128746033D;
      if (this.aY) {
         this.ai *= 0.699999988079071D;
         this.ag *= 0.699999988079071D;
      }

   }
}
