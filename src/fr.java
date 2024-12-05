public class fr extends ft {
   private float as;

   public fr() {
      super(12, 0.0F);
      this.al = new e7(this, 0, 0);
      this.al.a(-3.0F, -4.0F, -6.0F, 6, 6, 8, 0.0F);
      this.al.a(0.0F, 6.0F, -8.0F);
      this.ak = new e7(this, 28, 8);
      this.ak.a(-4.0F, -10.0F, -7.0F, 8, 16, 6, 0.0F);
      this.ak.a(0.0F, 5.0F, 2.0F);
   }

   public void a(aig var1, float var2, float var3, float var4) {
      super.a(var1, var2, var3, var4);
      this.al.f = 6.0F + ((af2)var1).l(var4) * 9.0F;
      this.as = ((af2)var1).k(var4);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.al.d = this.as;
   }
}
