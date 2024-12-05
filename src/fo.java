public class fo extends fx {
   public e7 ac;

   public fo() {
      this(0, 35, 64, 64);
   }

   public fo(int var1, int var2, int var3, int var4) {
      this.do = var3;
      this.if = var4;
      this.ac = new e7(this, var1, var2);
      this.ac.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
      this.ac.a(0.0F, 0.0F, 0.0F);
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      this.ac.for(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.ac.c = var4 / 57.295776F;
      this.ac.d = var5 / 57.295776F;
   }
}
