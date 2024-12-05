public class f3 extends f1 {
   public boolean aU = false;
   public boolean aT = false;

   public f3() {
      super(0.0F, -14.0F, 64, 32);
      float var1 = -14.0F;
      float var2 = 0.0F;
      this.aR = new e7(this, 0, 16);
      this.aR.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var2 - 0.5F);
      this.aR.a(0.0F, 0.0F + var1, 0.0F);
      this.aQ = new e7(this, 32, 16);
      this.aQ.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, var2);
      this.aQ.a(0.0F, 0.0F + var1, 0.0F);
      this.aP = new e7(this, 56, 0);
      this.aP.a(-1.0F, -2.0F, -1.0F, 2, 30, 2, var2);
      this.aP.a(-3.0F, 2.0F + var1, 0.0F);
      this.aO = new e7(this, 56, 0);
      this.aO.void = true;
      this.aO.a(-1.0F, -2.0F, -1.0F, 2, 30, 2, var2);
      this.aO.a(5.0F, 2.0F + var1, 0.0F);
      this.aN = new e7(this, 56, 0);
      this.aN.a(-1.0F, 0.0F, -1.0F, 2, 30, 2, var2);
      this.aN.a(-2.0F, 12.0F + var1, 0.0F);
      this.aM = new e7(this, 56, 0);
      this.aM.void = true;
      this.aM.a(-1.0F, 0.0F, -1.0F, 2, 30, 2, var2);
      this.aM.a(2.0F, 12.0F + var1, 0.0F);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.aS.long = true;
      float var8 = -14.0F;
      this.aQ.d = 0.0F;
      this.aQ.f = var8;
      this.aQ.e = -0.0F;
      e7 var10000 = this.aN;
      var10000.d -= 0.0F;
      var10000 = this.aM;
      var10000.d -= 0.0F;
      var10000 = this.aP;
      var10000.d = (float)((double)var10000.d * 0.5D);
      var10000 = this.aO;
      var10000.d = (float)((double)var10000.d * 0.5D);
      var10000 = this.aN;
      var10000.d = (float)((double)var10000.d * 0.5D);
      var10000 = this.aM;
      var10000.d = (float)((double)var10000.d * 0.5D);
      float var9 = 0.4F;
      if (this.aP.d > var9) {
         this.aP.d = var9;
      }

      if (this.aO.d > var9) {
         this.aO.d = var9;
      }

      if (this.aP.d < -var9) {
         this.aP.d = -var9;
      }

      if (this.aO.d < -var9) {
         this.aO.d = -var9;
      }

      if (this.aN.d > var9) {
         this.aN.d = var9;
      }

      if (this.aM.d > var9) {
         this.aM.d = var9;
      }

      if (this.aN.d < -var9) {
         this.aN.d = -var9;
      }

      if (this.aM.d < -var9) {
         this.aM.d = -var9;
      }

      if (this.aU) {
         this.aP.d = -0.5F;
         this.aO.d = -0.5F;
         this.aP.b = 0.05F;
         this.aO.b = -0.05F;
      }

      this.aP.e = 0.0F;
      this.aO.e = 0.0F;
      this.aN.e = 0.0F;
      this.aM.e = 0.0F;
      this.aN.f = 9.0F + var8;
      this.aM.f = 9.0F + var8;
      this.aS.e = -0.0F;
      this.aS.f = var8 + 1.0F;
      this.aR.g = this.aS.g;
      this.aR.f = this.aS.f;
      this.aR.e = this.aS.e;
      this.aR.d = this.aS.d;
      this.aR.c = this.aS.c;
      this.aR.b = this.aS.b;
      if (this.aT) {
         float var10 = 1.0F;
         var10000 = this.aS;
         var10000.f -= var10 * 5.0F;
      }

   }
}
