public class fb extends f1 {
   public fb() {
      this(0.0F, false);
   }

   protected fb(float var1, float var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   public fb(float var1, boolean var2) {
      super(var1, 0.0F, 64, var2 ? 32 : 64);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      float var8 = ajs.try(this.try * 3.1415927F);
      float var9 = ajs.try((1.0F - (1.0F - this.try) * (1.0F - this.try)) * 3.1415927F);
      this.aP.b = 0.0F;
      this.aO.b = 0.0F;
      this.aP.c = -(0.1F - var8 * 0.6F);
      this.aO.c = 0.1F - var8 * 0.6F;
      this.aP.d = -1.5707964F;
      this.aO.d = -1.5707964F;
      e7 var10000 = this.aP;
      var10000.d -= var8 * 1.2F - var9 * 0.4F;
      var10000 = this.aO;
      var10000.d -= var8 * 1.2F - var9 * 0.4F;
      var10000 = this.aP;
      var10000.b += ajs.for(var3 * 0.09F) * 0.05F + 0.05F;
      var10000 = this.aO;
      var10000.b -= ajs.for(var3 * 0.09F) * 0.05F + 0.05F;
      var10000 = this.aP;
      var10000.d += ajs.try(var3 * 0.067F) * 0.05F;
      var10000 = this.aO;
      var10000.d -= ajs.try(var3 * 0.067F) * 0.05F;
   }
}
