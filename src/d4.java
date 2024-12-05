public class d4 extends d7 {
   private float bO;
   private double bR;
   private double bQ;
   private double bP;

   public d4(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.ai = var8;
      this.ah = var10;
      this.ag = var12;
      this.bR = this.al = var2;
      this.bQ = this.ak = var4;
      this.bP = this.aj = var6;
      float var14 = this.bm.nextFloat() * 0.6F + 0.4F;
      this.bO = this.bv = this.bm.nextFloat() * 0.2F + 0.5F;
      this.bs = this.br = this.bq = 1.0F * var14;
      this.br *= 0.3F;
      this.bs *= 0.9F;
      this.bw = (int)(Math.random() * 10.0D) + 40;
      this.aE = true;
      this.g((int)(Math.random() * 8.0D));
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.bx + var2) / (float)this.bw;
      var8 = 1.0F - var8;
      var8 *= var8;
      var8 = 1.0F - var8;
      this.bv = this.bO * var8;
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public int new(float var1) {
      int var2 = super.new(var1);
      float var3 = (float)this.bx / (float)this.bw;
      var3 *= var3;
      var3 *= var3;
      int var4 = var2 & 255;
      int var5 = var2 >> 16 & 255;
      var5 += (int)(var3 * 15.0F * 16.0F);
      if (var5 > 240) {
         var5 = 240;
      }

      return var4 | var5 << 16;
   }

   public float int(float var1) {
      float var2 = super.int(var1);
      float var3 = (float)this.bx / (float)this.bw;
      var3 = var3 * var3 * var3 * var3;
      return var2 * (1.0F - var3) + var3;
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      float var1 = (float)this.bx / (float)this.bw;
      float var2 = var1;
      var1 = -var1 + var1 * var1 * 2.0F;
      var1 = 1.0F - var1;
      this.al = this.bR + this.ai * (double)var1;
      this.ak = this.bQ + this.ah * (double)var1 + (double)(1.0F - var2);
      this.aj = this.bP + this.ag * (double)var1;
      if (this.bx++ >= this.bw) {
         this.az();
      }

   }
}
