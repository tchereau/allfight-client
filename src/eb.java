import org.lwjgl.opengl.GL11;

public class eb extends d7 {
   private int bX = 0;
   private int b0 = 0;
   private c3 bZ;
   private float bY;

   public eb(c3 var1, y6 var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      super(var2, var3, var5, var7, 0.0D, 0.0D, 0.0D);
      this.bZ = var1;
      this.b0 = 6 + this.bm.nextInt(4);
      this.bs = this.br = this.bq = this.bm.nextFloat() * 0.6F + 0.4F;
      this.bY = 1.0F - (float)var9 * 0.5F;
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      int var8 = (int)(((float)this.bX + var2) * 15.0F / (float)this.b0);
      if (var8 <= 15) {
         this.bZ.for("/misc/explosion.png");
         float var9 = (float)(var8 % 4) / 4.0F;
         float var10 = var9 + 0.24975F;
         float var11 = (float)(var8 / 4) / 4.0F;
         float var12 = var11 + 0.24975F;
         float var13 = 2.0F * this.bY;
         float var14 = (float)(this.ao + (this.al - this.ao) * (double)var2 - bD);
         float var15 = (float)(this.an + (this.ak - this.an) * (double)var2 - bC);
         float var16 = (float)(this.am + (this.aj - this.am) * (double)var2 - bt);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(2896);
         k1.do();
         var1.if();
         var1.a(this.bs, this.br, this.bq, 1.0F);
         var1.do(0.0F, 1.0F, 0.0F);
         var1.if(240);
         var1.a((double)(var14 - var3 * var13 - var6 * var13), (double)(var15 - var4 * var13), (double)(var16 - var5 * var13 - var7 * var13), (double)var10, (double)var12);
         var1.a((double)(var14 - var3 * var13 + var6 * var13), (double)(var15 + var4 * var13), (double)(var16 - var5 * var13 + var7 * var13), (double)var10, (double)var11);
         var1.a((double)(var14 + var3 * var13 + var6 * var13), (double)(var15 + var4 * var13), (double)(var16 + var5 * var13 + var7 * var13), (double)var9, (double)var11);
         var1.a((double)(var14 + var3 * var13 - var6 * var13), (double)(var15 - var4 * var13), (double)(var16 + var5 * var13 - var7 * var13), (double)var9, (double)var12);
         var1.for();
         GL11.glPolygonOffset(0.0F, 0.0F);
         GL11.glEnable(2896);
      }
   }

   public int new(float var1) {
      return 61680;
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      ++this.bX;
      if (this.bX == this.b0) {
         this.az();
      }

   }

   public int aS() {
      return 3;
   }
}
