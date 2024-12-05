public class fh extends fx {
   public e7 B;
   public e7 A;
   public e7 F;
   public e7 E;
   public e7 D;
   public e7 C;

   public fh() {
      this(0.0F);
   }

   public fh(float var1) {
      this(var1, -7.0F);
   }

   public fh(float var1, float var2) {
      short var3 = 128;
      short var4 = 128;
      this.B = (new e7(this)).if(var3, var4);
      this.B.a(0.0F, 0.0F + var2, -2.0F);
      this.B.a(0, 0).a(-4.0F, -12.0F, -5.5F, 8, 10, 8, var1);
      this.B.a(24, 0).a(-1.0F, -5.0F, -7.5F, 2, 4, 2, var1);
      this.A = (new e7(this)).if(var3, var4);
      this.A.a(0.0F, 0.0F + var2, 0.0F);
      this.A.a(0, 40).a(-9.0F, -2.0F, -6.0F, 18, 12, 11, var1);
      this.A.a(0, 70).a(-4.5F, 10.0F, -3.0F, 9, 5, 6, var1 + 0.5F);
      this.F = (new e7(this)).if(var3, var4);
      this.F.a(0.0F, -7.0F, 0.0F);
      this.F.a(60, 21).a(-13.0F, -2.5F, -3.0F, 4, 30, 6, var1);
      this.E = (new e7(this)).if(var3, var4);
      this.E.a(0.0F, -7.0F, 0.0F);
      this.E.a(60, 58).a(9.0F, -2.5F, -3.0F, 4, 30, 6, var1);
      this.D = (new e7(this, 0, 22)).if(var3, var4);
      this.D.a(-4.0F, 18.0F + var2, 0.0F);
      this.D.a(37, 0).a(-3.5F, -3.0F, -3.0F, 6, 16, 5, var1);
      this.C = (new e7(this, 0, 22)).if(var3, var4);
      this.C.void = true;
      this.C.a(60, 0).a(5.0F, 18.0F + var2, 0.0F);
      this.C.a(-3.5F, -3.0F, -3.0F, 6, 16, 5, var1);
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      this.B.for(var7);
      this.A.for(var7);
      this.D.for(var7);
      this.C.for(var7);
      this.F.for(var7);
      this.E.for(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      this.B.c = var4 / 57.295776F;
      this.B.d = var5 / 57.295776F;
      this.D.d = -1.5F * this.a(var1, 13.0F) * var2;
      this.C.d = 1.5F * this.a(var1, 13.0F) * var2;
      this.D.c = 0.0F;
      this.C.c = 0.0F;
   }

   public void a(aig var1, float var2, float var3, float var4) {
      afy var5 = (afy)var1;
      int var6 = var5.fg();
      if (var6 > 0) {
         this.F.d = -2.0F + 1.5F * this.a((float)var6 - var4, 10.0F);
         this.E.d = -2.0F + 1.5F * this.a((float)var6 - var4, 10.0F);
      } else {
         int var7 = var5.fd();
         if (var7 > 0) {
            this.F.d = -0.8F + 0.025F * this.a((float)var7, 70.0F);
            this.E.d = 0.0F;
         } else {
            this.F.d = (-0.2F + 1.5F * this.a(var2, 13.0F)) * var3;
            this.E.d = (-0.2F - 1.5F * this.a(var2, 13.0F)) * var3;
         }
      }

   }

   private float a(float var1, float var2) {
      return (Math.abs(var1 % var2 - var2 * 0.5F) - var2 * 0.25F) / (var2 * 0.25F);
   }
}
