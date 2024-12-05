public class ej extends d7 {
   private float ci;
   private double cl;
   private double ck;
   private double cj;

   public ej(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.ai = var8;
      this.ah = var10;
      this.ag = var12;
      this.cl = this.al = var2;
      this.ck = this.ak = var4;
      this.cj = this.aj = var6;
      float var14 = this.bm.nextFloat() * 0.6F + 0.4F;
      this.ci = this.bv = this.bm.nextFloat() * 0.5F + 0.2F;
      this.bs = this.br = this.bq = 1.0F * var14;
      this.br *= 0.9F;
      this.bs *= 0.9F;
      this.bw = (int)(Math.random() * 10.0D) + 30;
      this.aE = true;
      this.g((int)(Math.random() * 26.0D + 1.0D + 224.0D));
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
      var3 *= var3;
      var3 *= var3;
      return var2 * (1.0F - var3) + var3;
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      float var1 = (float)this.bx / (float)this.bw;
      var1 = 1.0F - var1;
      float var2 = 1.0F - var1;
      var2 *= var2;
      var2 *= var2;
      this.al = this.cl + this.ai * (double)var1;
      this.ak = this.ck + this.ah * (double)var1 - (double)(var2 * 1.2F);
      this.aj = this.cj + this.ag * (double)var1;
      if (this.bx++ >= this.bw) {
         this.az();
      }

   }
}
