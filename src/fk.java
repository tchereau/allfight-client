public class fk extends fx {
   public e7 S;
   public e7 R;
   public e7 Q;
   public e7 P;
   public e7 O;
   public e7 N;
   public e7 M;
   public e7 L;
   public e7 K;
   public e7 J;
   public e7 I;

   public fk() {
      float var1 = 0.0F;
      byte var2 = 15;
      this.S = new e7(this, 32, 4);
      this.S.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, var1);
      this.S.a(0.0F, (float)var2, -3.0F);
      this.R = new e7(this, 0, 0);
      this.R.a(-3.0F, -3.0F, -3.0F, 6, 6, 6, var1);
      this.R.a(0.0F, (float)var2, 0.0F);
      this.Q = new e7(this, 0, 12);
      this.Q.a(-5.0F, -4.0F, -6.0F, 10, 8, 12, var1);
      this.Q.a(0.0F, (float)var2, 9.0F);
      this.P = new e7(this, 18, 0);
      this.P.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.P.a(-4.0F, (float)var2, 2.0F);
      this.O = new e7(this, 18, 0);
      this.O.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.O.a(4.0F, (float)var2, 2.0F);
      this.N = new e7(this, 18, 0);
      this.N.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.N.a(-4.0F, (float)var2, 1.0F);
      this.M = new e7(this, 18, 0);
      this.M.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.M.a(4.0F, (float)var2, 1.0F);
      this.L = new e7(this, 18, 0);
      this.L.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.L.a(-4.0F, (float)var2, 0.0F);
      this.K = new e7(this, 18, 0);
      this.K.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.K.a(4.0F, (float)var2, 0.0F);
      this.J = new e7(this, 18, 0);
      this.J.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.J.a(-4.0F, (float)var2, -1.0F);
      this.I = new e7(this, 18, 0);
      this.I.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.I.a(4.0F, (float)var2, -1.0F);
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      this.S.for(var7);
      this.R.for(var7);
      this.Q.for(var7);
      this.P.for(var7);
      this.O.for(var7);
      this.N.for(var7);
      this.M.for(var7);
      this.L.for(var7);
      this.K.for(var7);
      this.J.for(var7);
      this.I.for(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      this.S.c = var4 / 57.295776F;
      this.S.d = var5 / 57.295776F;
      float var8 = 0.7853982F;
      this.P.b = -var8;
      this.O.b = var8;
      this.N.b = -var8 * 0.74F;
      this.M.b = var8 * 0.74F;
      this.L.b = -var8 * 0.74F;
      this.K.b = var8 * 0.74F;
      this.J.b = -var8;
      this.I.b = var8;
      float var9 = -0.0F;
      float var10 = 0.3926991F;
      this.P.c = var10 * 2.0F + var9;
      this.O.c = -var10 * 2.0F - var9;
      this.N.c = var10 * 1.0F + var9;
      this.M.c = -var10 * 1.0F - var9;
      this.L.c = -var10 * 1.0F + var9;
      this.K.c = var10 * 1.0F - var9;
      this.J.c = -var10 * 2.0F + var9;
      this.I.c = var10 * 2.0F - var9;
      float var11 = -(ajs.for(var1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * var2;
      float var12 = -(ajs.for(var1 * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * var2;
      float var13 = -(ajs.for(var1 * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * var2;
      float var14 = -(ajs.for(var1 * 0.6662F * 2.0F + 4.712389F) * 0.4F) * var2;
      float var15 = Math.abs(ajs.try(var1 * 0.6662F + 0.0F) * 0.4F) * var2;
      float var16 = Math.abs(ajs.try(var1 * 0.6662F + 3.1415927F) * 0.4F) * var2;
      float var17 = Math.abs(ajs.try(var1 * 0.6662F + 1.5707964F) * 0.4F) * var2;
      float var18 = Math.abs(ajs.try(var1 * 0.6662F + 4.712389F) * 0.4F) * var2;
      e7 var10000 = this.P;
      var10000.c += var11;
      var10000 = this.O;
      var10000.c += -var11;
      var10000 = this.N;
      var10000.c += var12;
      var10000 = this.M;
      var10000.c += -var12;
      var10000 = this.L;
      var10000.c += var13;
      var10000 = this.K;
      var10000.c += -var13;
      var10000 = this.J;
      var10000.c += var14;
      var10000 = this.I;
      var10000.c += -var14;
      var10000 = this.P;
      var10000.b += var15;
      var10000 = this.O;
      var10000.b += -var15;
      var10000 = this.N;
      var10000.b += var16;
      var10000 = this.M;
      var10000.b += -var16;
      var10000 = this.L;
      var10000.b += var17;
      var10000 = this.K;
      var10000.b += -var17;
      var10000 = this.J;
      var10000.b += var18;
      var10000 = this.I;
      var10000.b += -var18;
   }
}
