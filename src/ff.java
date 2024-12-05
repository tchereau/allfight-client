public class ff extends f1 {
   public ff() {
      this(0.0F, 0.0F, false);
   }

   public ff(float var1, float var2, boolean var3) {
      super(var1, 0.0F, 64, var3 ? 32 : 64);
      if (var3) {
         this.aS = new e7(this, 0, 0);
         this.aS.a(-4.0F, -10.0F, -4.0F, 8, 6, 8, var1);
         this.aS.a(0.0F, 0.0F + var2, 0.0F);
      } else {
         this.aS = new e7(this);
         this.aS.a(0.0F, 0.0F + var2, 0.0F);
         this.aS.a(0, 32).a(-4.0F, -10.0F, -4.0F, 8, 10, 8, var1);
         this.aS.a(24, 32).a(-1.0F, -3.0F, -6.0F, 2, 4, 2, var1);
      }

   }

   public int int() {
      return 10;
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
