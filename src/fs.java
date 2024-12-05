public class fs extends ft {
   private float at;

   public fs() {
      super(12, 0.0F);
      this.al = new e7(this, 0, 0);
      this.al.a(-3.0F, -4.0F, -4.0F, 6, 6, 6, 0.6F);
      this.al.a(0.0F, 6.0F, -8.0F);
      this.ak = new e7(this, 28, 8);
      this.ak.a(-4.0F, -10.0F, -7.0F, 8, 16, 6, 1.75F);
      this.ak.a(0.0F, 5.0F, 2.0F);
      float var1 = 0.5F;
      this.ar = new e7(this, 0, 16);
      this.ar.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.ar.a(-3.0F, 12.0F, 7.0F);
      this.aq = new e7(this, 0, 16);
      this.aq.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.aq.a(3.0F, 12.0F, 7.0F);
      this.ap = new e7(this, 0, 16);
      this.ap.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.ap.a(-3.0F, 12.0F, -5.0F);
      this.ao = new e7(this, 0, 16);
      this.ao.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.ao.a(3.0F, 12.0F, -5.0F);
   }

   public void a(aig var1, float var2, float var3, float var4) {
      super.a(var1, var2, var3, var4);
      this.al.f = 6.0F + ((af2)var1).l(var4) * 9.0F;
      this.at = ((af2)var1).k(var4);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.al.d = this.at;
   }
}
