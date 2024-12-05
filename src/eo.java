public class eo extends d7 {
   public eo(y6 var1, double var2, double var4, double var6, abr var8, c3 var9) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.a(var9, var8.a(0));
      this.bs = this.br = this.bq = 1.0F;
      this.bu = pa.b8.aw;
      this.bv /= 2.0F;
   }

   public eo(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12, abr var14, c3 var15) {
      this(var1, var2, var4, var6, var14, var15);
      this.ai *= 0.10000000149011612D;
      this.ah *= 0.10000000149011612D;
      this.ag *= 0.10000000149011612D;
      this.ai += var8;
      this.ah += var10;
      this.ag += var12;
   }

   public int aS() {
      return 2;
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.bB + this.bz / 4.0F) / 16.0F;
      float var9 = var8 + 0.015609375F;
      float var10 = ((float)this.bA + this.by / 4.0F) / 16.0F;
      float var11 = var10 + 0.015609375F;
      float var12 = 0.1F * this.bv;
      if (this.bo != null) {
         var8 = this.bo.if((double)(this.bz / 4.0F * 16.0F));
         var9 = this.bo.if((double)((this.bz + 1.0F) / 4.0F * 16.0F));
         var10 = this.bo.a((double)(this.by / 4.0F * 16.0F));
         var11 = this.bo.a((double)((this.by + 1.0F) / 4.0F * 16.0F));
      }

      float var13 = (float)(this.ao + (this.al - this.ao) * (double)var2 - bD);
      float var14 = (float)(this.an + (this.ak - this.an) * (double)var2 - bC);
      float var15 = (float)(this.am + (this.aj - this.am) * (double)var2 - bt);
      float var16 = 1.0F;
      var1.a(var16 * this.bs, var16 * this.br, var16 * this.bq);
      var1.a((double)(var13 - var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 - var5 * var12 - var7 * var12), (double)var8, (double)var11);
      var1.a((double)(var13 - var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 - var5 * var12 + var7 * var12), (double)var8, (double)var10);
      var1.a((double)(var13 + var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 + var5 * var12 + var7 * var12), (double)var9, (double)var10);
      var1.a((double)(var13 + var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 + var5 * var12 - var7 * var12), (double)var9, (double)var11);
   }
}
