public class du extends d7 {
   private pa bE;

   public du(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12, pa var14, int var15, int var16, c3 var17) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.bE = var14;
      this.a(var17, var14.if(0, var16));
      this.bu = var14.aw;
      this.bs = this.br = this.bq = 0.6F;
      this.bv /= 2.0F;
   }

   public du if(int var1, int var2, int var3) {
      if (this.bE == pa.i) {
         return this;
      } else {
         int var4 = this.bE.do((yy)this.ap, var1, var2, var3);
         this.bs *= (float)(var4 >> 16 & 255) / 255.0F;
         this.br *= (float)(var4 >> 8 & 255) / 255.0F;
         this.bq *= (float)(var4 & 255) / 255.0F;
         return this;
      }
   }

   public du h(int var1) {
      if (this.bE == pa.i) {
         return this;
      } else {
         int var2 = this.bE.a(var1);
         this.bs *= (float)(var2 >> 16 & 255) / 255.0F;
         this.br *= (float)(var2 >> 8 & 255) / 255.0F;
         this.bq *= (float)(var2 & 255) / 255.0F;
         return this;
      }
   }

   public int aS() {
      return 1;
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
