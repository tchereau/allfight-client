public class fg extends fx {
   public e7 s;
   public e7 r;
   public e7 w;
   public e7 v;
   public e7 u;
   public e7 t;

   public fg(float var1) {
      this(var1, 0.0F, 64, 64);
   }

   public fg(float var1, float var2, int var3, int var4) {
      this.s = (new e7(this)).if(var3, var4);
      this.s.a(0.0F, 0.0F + var2, 0.0F);
      this.s.a(0, 0).a(-4.0F, -10.0F, -4.0F, 8, 10, 8, var1);
      this.t = (new e7(this)).if(var3, var4);
      this.t.a(0.0F, var2 - 2.0F, 0.0F);
      this.t.a(24, 0).a(-1.0F, -1.0F, -6.0F, 2, 4, 2, var1);
      this.s.a(this.t);
      this.r = (new e7(this)).if(var3, var4);
      this.r.a(0.0F, 0.0F + var2, 0.0F);
      this.r.a(16, 20).a(-4.0F, 0.0F, -3.0F, 8, 12, 6, var1);
      this.r.a(0, 38).a(-4.0F, 0.0F, -3.0F, 8, 18, 6, var1 + 0.5F);
      this.w = (new e7(this)).if(var3, var4);
      this.w.a(0.0F, 0.0F + var2 + 2.0F, 0.0F);
      this.w.a(44, 22).a(-8.0F, -2.0F, -2.0F, 4, 8, 4, var1);
      this.w.a(44, 22).a(4.0F, -2.0F, -2.0F, 4, 8, 4, var1);
      this.w.a(40, 38).a(-4.0F, 2.0F, -2.0F, 8, 4, 4, var1);
      this.v = (new e7(this, 0, 22)).if(var3, var4);
      this.v.a(-2.0F, 12.0F + var2, 0.0F);
      this.v.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.u = (new e7(this, 0, 22)).if(var3, var4);
      this.u.void = true;
      this.u.a(2.0F, 12.0F + var2, 0.0F);
      this.u.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      this.s.for(var7);
      this.r.for(var7);
      this.v.for(var7);
      this.u.for(var7);
      this.w.for(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      this.s.c = var4 / 57.295776F;
      this.s.d = var5 / 57.295776F;
      this.w.f = 3.0F;
      this.w.e = -1.0F;
      this.w.d = -0.75F;
      this.v.d = ajs.for(var1 * 0.6662F) * 1.4F * var2 * 0.5F;
      this.u.d = ajs.for(var1 * 0.6662F + 3.1415927F) * 1.4F * var2 * 0.5F;
      this.v.c = 0.0F;
      this.u.c = 0.0F;
   }
}
