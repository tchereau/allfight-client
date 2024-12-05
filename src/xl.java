public abstract class xl {
   public y6 case;
   public yx byte;
   public String try;
   public yi new;
   public boolean int = false;
   public boolean for = false;
   public float[] do = new float[16];
   public int if = 0;
   private float[] a = new float[4];

   public final void a(y6 var1) {
      this.case = var1;
      this.byte = var1.l().new();
      this.try = var1.l().d();
      this.char();
      this.new();
   }

   protected void new() {
      float var1 = 0.0F;

      for(int var2 = 0; var2 <= 15; ++var2) {
         float var3 = 1.0F - (float)var2 / 15.0F;
         this.do[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
      }

   }

   protected void char() {
      this.new = this.byte.if(this.case);
   }

   public x0 else() {
      return this.byte.a(this.case, this.try);
   }

   public boolean a(int var1, int var2) {
      int var3 = this.case.if(var1, var2);
      return var3 == pa.i.void;
   }

   public float a(long var1, float var3) {
      int var4 = (int)(var1 % 24000L);
      float var5 = ((float)var4 + var3) / 24000.0F - 0.25F;
      if (var5 < 0.0F) {
         ++var5;
      }

      if (var5 > 1.0F) {
         --var5;
      }

      float var6 = var5;
      var5 = 1.0F - (float)((Math.cos((double)var5 * 3.141592653589793D) + 1.0D) / 2.0D);
      var5 = var6 + (var5 - var6) / 3.0F;
      return var5;
   }

   public int a(long var1) {
      return (int)(var1 / 24000L) % 8;
   }

   public boolean a() {
      return true;
   }

   public float[] if(float var1, float var2) {
      float var3 = 0.4F;
      float var4 = ajs.for(var1 * 3.1415927F * 2.0F) - 0.0F;
      float var5 = -0.0F;
      if (var4 >= var5 - var3 && var4 <= var5 + var3) {
         float var6 = (var4 - var5) / var3 * 0.5F + 0.5F;
         float var7 = 1.0F - (1.0F - ajs.try(var6 * 3.1415927F)) * 0.99F;
         var7 *= var7;
         this.a[0] = var6 * 0.3F + 0.7F;
         this.a[1] = var6 * var6 * 0.7F + 0.2F;
         this.a[2] = var6 * var6 * 0.0F + 0.2F;
         this.a[3] = var7;
         return this.a;
      } else {
         return null;
      }
   }

   public nr a(float var1, float var2) {
      float var3 = ajs.for(var1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = 0.7529412F;
      float var5 = 0.84705883F;
      float var6 = 1.0F;
      var4 *= var3 * 0.94F + 0.06F;
      var5 *= var3 * 0.94F + 0.06F;
      var6 *= var3 * 0.91F + 0.09F;
      return this.case.do().a((double)var4, (double)var5, (double)var6);
   }

   public boolean do() {
      return true;
   }

   public static xl a(int var0) {
      return (xl)(var0 == -1 ? new xk() : (var0 == 0 ? new xj() : (var0 == 1 ? new xi() : null)));
   }

   public float byte() {
      return 128.0F;
   }

   public boolean for() {
      return true;
   }

   public apg case() {
      return null;
   }

   public int if() {
      return this.byte.a(this.case);
   }

   public boolean goto() {
      return this.byte.if(this.for);
   }

   public double int() {
      return this.byte.for();
   }

   public boolean if(int var1, int var2) {
      return false;
   }

   public abstract String try();
}
