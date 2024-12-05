public class eh extends d7 {
   protected eh(y6 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
      this.bw = 4;
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = 0.25F;
      float var9 = var8 + 0.25F;
      float var10 = 0.125F;
      float var11 = var10 + 0.25F;
      float var12 = 7.1F * ajs.try(((float)this.bx + var2 - 1.0F) * 0.25F * 3.1415927F);
      this.bp = 0.6F - ((float)this.bx + var2 - 1.0F) * 0.25F * 0.5F;
      float var13 = (float)(this.ao + (this.al - this.ao) * (double)var2 - bD);
      float var14 = (float)(this.an + (this.ak - this.an) * (double)var2 - bC);
      float var15 = (float)(this.am + (this.aj - this.am) * (double)var2 - bt);
      var1.a(this.bs, this.br, this.bq, this.bp);
      var1.a((double)(var13 - var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 - var5 * var12 - var7 * var12), (double)var9, (double)var11);
      var1.a((double)(var13 - var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 - var5 * var12 + var7 * var12), (double)var9, (double)var10);
      var1.a((double)(var13 + var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 + var5 * var12 + var7 * var12), (double)var8, (double)var10);
      var1.a((double)(var13 + var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 + var5 * var12 - var7 * var12), (double)var8, (double)var11);
   }
}
