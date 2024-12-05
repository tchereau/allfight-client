import org.lwjgl.opengl.GL11;

public class f1 extends fx {
   public e7 aS;
   public e7 aR;
   public e7 aQ;
   public e7 aP;
   public e7 aO;
   public e7 aN;
   public e7 aM;
   public e7 aL;
   public e7 aK;
   public int aJ;
   public int aI;
   public boolean aH;
   public boolean aG;

   public f1() {
      this(0.0F);
   }

   public f1(float var1) {
      this(var1, 0.0F, 64, 32);
   }

   public f1(float var1, float var2, int var3, int var4) {
      this.aJ = 0;
      this.aI = 0;
      this.aH = false;
      this.aG = false;
      this.do = var3;
      this.if = var4;
      this.aK = new e7(this, 0, 0);
      this.aK.a(-5.0F, 0.0F, -1.0F, 10, 16, 1, var1);
      this.aL = new e7(this, 24, 0);
      this.aL.a(-3.0F, -6.0F, -1.0F, 6, 6, 1, var1);
      this.aS = new e7(this, 0, 0);
      this.aS.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.aS.a(0.0F, 0.0F + var2, 0.0F);
      this.aR = new e7(this, 32, 0);
      this.aR.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.aR.a(0.0F, 0.0F + var2, 0.0F);
      this.aQ = new e7(this, 16, 16);
      this.aQ.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.aQ.a(0.0F, 0.0F + var2, 0.0F);
      this.aP = new e7(this, 40, 16);
      this.aP.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.aP.a(-5.0F, 2.0F + var2, 0.0F);
      this.aO = new e7(this, 40, 16);
      this.aO.void = true;
      this.aO.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.aO.a(5.0F, 2.0F + var2, 0.0F);
      this.aN = new e7(this, 0, 16);
      this.aN.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.aN.a(-1.9F, 12.0F + var2, 0.0F);
      this.aM = new e7(this, 0, 16);
      this.aM.void = true;
      this.aM.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.aM.a(1.9F, 12.0F + var2, 0.0F);
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      if (this.for) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glScalef(1.5F / var8, 1.5F / var8, 1.5F / var8);
         GL11.glTranslatef(0.0F, 16.0F * var7, 0.0F);
         this.aS.for(var7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
         GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
         this.aQ.for(var7);
         this.aP.for(var7);
         this.aO.for(var7);
         this.aN.for(var7);
         this.aM.for(var7);
         this.aR.for(var7);
         GL11.glPopMatrix();
      } else {
         this.aS.for(var7);
         this.aQ.for(var7);
         this.aP.for(var7);
         this.aO.for(var7);
         this.aN.for(var7);
         this.aM.for(var7);
         this.aR.for(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      this.aS.c = var4 / 57.295776F;
      this.aS.d = var5 / 57.295776F;
      this.aR.c = this.aS.c;
      this.aR.d = this.aS.d;
      this.aP.d = ajs.for(var1 * 0.6662F + 3.1415927F) * 2.0F * var2 * 0.5F;
      this.aO.d = ajs.for(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
      this.aP.b = 0.0F;
      this.aO.b = 0.0F;
      this.aN.d = ajs.for(var1 * 0.6662F) * 1.4F * var2;
      this.aM.d = ajs.for(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.aN.c = 0.0F;
      this.aM.c = 0.0F;
      e7 var10000;
      if (this.new) {
         var10000 = this.aP;
         var10000.d += -0.62831855F;
         var10000 = this.aO;
         var10000.d += -0.62831855F;
         this.aN.d = -1.2566371F;
         this.aM.d = -1.2566371F;
         this.aN.c = 0.31415927F;
         this.aM.c = -0.31415927F;
      }

      if (this.aJ != 0) {
         this.aO.d = this.aO.d * 0.5F - 0.31415927F * (float)this.aJ;
      }

      if (this.aI != 0) {
         this.aP.d = this.aP.d * 0.5F - 0.31415927F * (float)this.aI;
      }

      this.aP.c = 0.0F;
      this.aO.c = 0.0F;
      float var8;
      float var9;
      if (this.try > -9990.0F) {
         var8 = this.try;
         this.aQ.c = ajs.try(ajs.if(var8) * 3.1415927F * 2.0F) * 0.2F;
         this.aP.e = ajs.try(this.aQ.c) * 5.0F;
         this.aP.g = -ajs.for(this.aQ.c) * 5.0F;
         this.aO.e = -ajs.try(this.aQ.c) * 5.0F;
         this.aO.g = ajs.for(this.aQ.c) * 5.0F;
         var10000 = this.aP;
         var10000.c += this.aQ.c;
         var10000 = this.aO;
         var10000.c += this.aQ.c;
         var10000 = this.aO;
         var10000.d += this.aQ.c;
         var8 = 1.0F - this.try;
         var8 *= var8;
         var8 *= var8;
         var8 = 1.0F - var8;
         var9 = ajs.try(var8 * 3.1415927F);
         float var10 = ajs.try(this.try * 3.1415927F) * -(this.aS.d - 0.7F) * 0.75F;
         var10000 = this.aP;
         var10000.d = (float)((double)var10000.d - ((double)var9 * 1.2D + (double)var10));
         var10000 = this.aP;
         var10000.c += this.aQ.c * 2.0F;
         this.aP.b = ajs.try(this.try * 3.1415927F) * -0.4F;
      }

      if (this.aH) {
         this.aQ.d = 0.5F;
         var10000 = this.aP;
         var10000.d += 0.4F;
         var10000 = this.aO;
         var10000.d += 0.4F;
         this.aN.e = 4.0F;
         this.aM.e = 4.0F;
         this.aN.f = 9.0F;
         this.aM.f = 9.0F;
         this.aS.f = 1.0F;
         this.aR.f = 1.0F;
      } else {
         this.aQ.d = 0.0F;
         this.aN.e = 0.1F;
         this.aM.e = 0.1F;
         this.aN.f = 12.0F;
         this.aM.f = 12.0F;
         this.aS.f = 0.0F;
         this.aR.f = 0.0F;
      }

      var10000 = this.aP;
      var10000.b += ajs.for(var3 * 0.09F) * 0.05F + 0.05F;
      var10000 = this.aO;
      var10000.b -= ajs.for(var3 * 0.09F) * 0.05F + 0.05F;
      var10000 = this.aP;
      var10000.d += ajs.try(var3 * 0.067F) * 0.05F;
      var10000 = this.aO;
      var10000.d -= ajs.try(var3 * 0.067F) * 0.05F;
      if (this.aG) {
         var8 = 0.0F;
         var9 = 0.0F;
         this.aP.b = 0.0F;
         this.aO.b = 0.0F;
         this.aP.c = -(0.1F - var8 * 0.6F) + this.aS.c;
         this.aO.c = 0.1F - var8 * 0.6F + this.aS.c + 0.4F;
         this.aP.d = -1.5707964F + this.aS.d;
         this.aO.d = -1.5707964F + this.aS.d;
         var10000 = this.aP;
         var10000.d -= var8 * 1.2F - var9 * 0.4F;
         var10000 = this.aO;
         var10000.d -= var8 * 1.2F - var9 * 0.4F;
         var10000 = this.aP;
         var10000.b += ajs.for(var3 * 0.09F) * 0.05F + 0.05F;
         var10000 = this.aO;
         var10000.b -= ajs.for(var3 * 0.09F) * 0.05F + 0.05F;
         var10000 = this.aP;
         var10000.d += ajs.try(var3 * 0.067F) * 0.05F;
         var10000 = this.aO;
         var10000.d -= ajs.try(var3 * 0.067F) * 0.05F;
      }

   }

   public void if(float var1) {
      this.aL.c = this.aS.c;
      this.aL.d = this.aS.d;
      this.aL.g = 0.0F;
      this.aL.f = 0.0F;
      this.aL.for(var1);
   }

   public void a(float var1) {
      this.aK.for(var1);
   }
}
