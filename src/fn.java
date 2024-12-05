public class fn extends fb {
   public fn() {
      this(0.0F);
   }

   public fn(float var1) {
      super(var1, 0.0F, 64, 32);
      this.aP = new e7(this, 40, 16);
      this.aP.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, var1);
      this.aP.a(-5.0F, 2.0F, 0.0F);
      this.aO = new e7(this, 40, 16);
      this.aO.void = true;
      this.aO.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, var1);
      this.aO.a(5.0F, 2.0F, 0.0F);
      this.aN = new e7(this, 0, 16);
      this.aN.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, var1);
      this.aN.a(-2.0F, 12.0F, 0.0F);
      this.aM = new e7(this, 0, 16);
      this.aM.void = true;
      this.aM.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, var1);
      this.aM.a(2.0F, 12.0F, 0.0F);
   }

   public void a(aig var1, float var2, float var3, float var4) {
      this.aG = ((aew)var1).e4() == 1;
      super.a(var1, var2, var3, var4);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }
}
