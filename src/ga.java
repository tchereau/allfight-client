public class ga extends fx {
   private e7[] bo = new e7[12];
   private e7 bn;

   public ga() {
      for(int var1 = 0; var1 < this.bo.length; ++var1) {
         this.bo[var1] = new e7(this, 0, 16);
         this.bo[var1].a(0.0F, 0.0F, 0.0F, 2, 8, 2);
      }

      this.bn = new e7(this, 0, 0);
      this.bn.a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
   }

   public int try() {
      return 8;
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      this.bn.for(var7);

      for(int var8 = 0; var8 < this.bo.length; ++var8) {
         this.bo[var8].for(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      float var8 = var3 * 3.1415927F * -0.1F;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         this.bo[var9].f = -2.0F + ajs.for(((float)(var9 * 2) + var3) * 0.25F);
         this.bo[var9].g = ajs.for(var8) * 9.0F;
         this.bo[var9].e = ajs.try(var8) * 9.0F;
         ++var8;
      }

      var8 = 0.7853982F + var3 * 3.1415927F * 0.03F;

      for(var9 = 4; var9 < 8; ++var9) {
         this.bo[var9].f = 2.0F + ajs.for(((float)(var9 * 2) + var3) * 0.25F);
         this.bo[var9].g = ajs.for(var8) * 7.0F;
         this.bo[var9].e = ajs.try(var8) * 7.0F;
         ++var8;
      }

      var8 = 0.47123894F + var3 * 3.1415927F * -0.05F;

      for(var9 = 8; var9 < 12; ++var9) {
         this.bo[var9].f = 11.0F + ajs.for(((float)var9 * 1.5F + var3) * 0.5F);
         this.bo[var9].g = ajs.for(var8) * 5.0F;
         this.bo[var9].e = ajs.try(var8) * 5.0F;
         ++var8;
      }

      this.bn.c = var4 / 57.295776F;
      this.bn.d = var5 / 57.295776F;
   }
}
