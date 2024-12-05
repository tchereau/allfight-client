public class fd extends fx {
   private e7[] q;
   private e7[] p;

   public fd() {
      this.do = 64;
      this.if = 64;
      this.q = new e7[3];
      this.q[0] = new e7(this, 0, 16);
      this.q[0].a(-10.0F, 3.9F, -0.5F, 20, 3, 3);
      this.q[1] = (new e7(this)).if(this.do, this.if);
      this.q[1].a(-2.0F, 6.9F, -0.5F);
      this.q[1].a(0, 22).a(0.0F, 0.0F, 0.0F, 3, 10, 3);
      this.q[1].a(24, 22).a(-4.0F, 1.5F, 0.5F, 11, 2, 2);
      this.q[1].a(24, 22).a(-4.0F, 4.0F, 0.5F, 11, 2, 2);
      this.q[1].a(24, 22).a(-4.0F, 6.5F, 0.5F, 11, 2, 2);
      this.q[2] = new e7(this, 12, 22);
      this.q[2].a(0.0F, 0.0F, 0.0F, 3, 6, 3);
      this.p = new e7[3];
      this.p[0] = new e7(this, 0, 0);
      this.p[0].a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      this.p[1] = new e7(this, 32, 0);
      this.p[1].a(-4.0F, -4.0F, -4.0F, 6, 6, 6);
      this.p[1].g = -8.0F;
      this.p[1].f = 4.0F;
      this.p[2] = new e7(this, 32, 0);
      this.p[2].a(-4.0F, -4.0F, -4.0F, 6, 6, 6);
      this.p[2].g = 10.0F;
      this.p[2].f = 4.0F;
   }

   public int a() {
      return 32;
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      e7[] var8 = this.p;
      int var9 = var8.length;

      int var10;
      e7 var11;
      for(var10 = 0; var10 < var9; ++var10) {
         var11 = var8[var10];
         var11.for(var7);
      }

      var8 = this.q;
      var9 = var8.length;

      for(var10 = 0; var10 < var9; ++var10) {
         var11 = var8[var10];
         var11.for(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      float var8 = ajs.for(var3 * 0.1F);
      this.q[1].d = (0.065F + 0.05F * var8) * 3.1415927F;
      this.q[2].a(-2.0F, 6.9F + ajs.for(this.q[1].d) * 10.0F, -0.5F + ajs.try(this.q[1].d) * 10.0F);
      this.q[2].d = (0.265F + 0.1F * var8) * 3.1415927F;
      this.p[0].c = var4 / 57.295776F;
      this.p[0].d = var5 / 57.295776F;
   }

   public void a(aig var1, float var2, float var3, float var4) {
      afq var5 = (afq)var1;

      for(int var6 = 1; var6 < 3; ++var6) {
         this.p[var6].c = (var5.ak(var6 - 1) - var1.eH) / 57.295776F;
         this.p[var6].d = var5.am(var6 - 1) / 57.295776F;
      }

   }
}
