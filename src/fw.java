import org.lwjgl.opengl.GL11;

public class fw extends fx {
   e7 aC;
   e7 aB;
   e7 aA;
   e7 az;
   e7 ay;
   e7 ax;
   e7 aw;
   e7 av;
   int au = 1;

   public fw() {
      this.a("head.main", 0, 0);
      this.a("head.nose", 0, 24);
      this.a("head.ear1", 0, 10);
      this.a("head.ear2", 6, 10);
      this.aw = new e7(this, "head");
      this.aw.a("main", -2.5F, -2.0F, -3.0F, 5, 4, 5);
      this.aw.a("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2);
      this.aw.a("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2);
      this.aw.a("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2);
      this.aw.a(0.0F, 15.0F, -9.0F);
      this.av = new e7(this, 20, 0);
      this.av.a(-2.0F, 3.0F, -8.0F, 4, 16, 6, 0.0F);
      this.av.a(0.0F, 12.0F, -10.0F);
      this.ay = new e7(this, 0, 15);
      this.ay.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
      this.ay.d = 0.9F;
      this.ay.a(0.0F, 15.0F, 8.0F);
      this.ax = new e7(this, 4, 15);
      this.ax.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
      this.ax.a(0.0F, 20.0F, 14.0F);
      this.aC = new e7(this, 8, 13);
      this.aC.a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
      this.aC.a(1.1F, 18.0F, 5.0F);
      this.aB = new e7(this, 8, 13);
      this.aB.a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
      this.aB.a(-1.1F, 18.0F, 5.0F);
      this.aA = new e7(this, 40, 0);
      this.aA.a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
      this.aA.a(1.2F, 13.8F, -5.0F);
      this.az = new e7(this, 40, 0);
      this.az.a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
      this.az.a(-1.2F, 13.8F, -5.0F);
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      if (this.for) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glScalef(1.5F / var8, 1.5F / var8, 1.5F / var8);
         GL11.glTranslatef(0.0F, 10.0F * var7, 4.0F * var7);
         this.aw.for(var7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
         GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
         this.av.for(var7);
         this.aC.for(var7);
         this.aB.for(var7);
         this.aA.for(var7);
         this.az.for(var7);
         this.ay.for(var7);
         this.ax.for(var7);
         GL11.glPopMatrix();
      } else {
         this.aw.for(var7);
         this.av.for(var7);
         this.ay.for(var7);
         this.ax.for(var7);
         this.aC.for(var7);
         this.aB.for(var7);
         this.aA.for(var7);
         this.az.for(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      this.aw.d = var5 / 57.295776F;
      this.aw.c = var4 / 57.295776F;
      if (this.au != 3) {
         this.av.d = 1.5707964F;
         if (this.au == 2) {
            this.aC.d = ajs.for(var1 * 0.6662F) * 1.0F * var2;
            this.aB.d = ajs.for(var1 * 0.6662F + 0.3F) * 1.0F * var2;
            this.aA.d = ajs.for(var1 * 0.6662F + 3.1415927F + 0.3F) * 1.0F * var2;
            this.az.d = ajs.for(var1 * 0.6662F + 3.1415927F) * 1.0F * var2;
            this.ax.d = 1.7278761F + 0.31415927F * ajs.for(var1) * var2;
         } else {
            this.aC.d = ajs.for(var1 * 0.6662F) * 1.0F * var2;
            this.aB.d = ajs.for(var1 * 0.6662F + 3.1415927F) * 1.0F * var2;
            this.aA.d = ajs.for(var1 * 0.6662F + 3.1415927F) * 1.0F * var2;
            this.az.d = ajs.for(var1 * 0.6662F) * 1.0F * var2;
            if (this.au == 1) {
               this.ax.d = 1.7278761F + 0.7853982F * ajs.for(var1) * var2;
            } else {
               this.ax.d = 1.7278761F + 0.47123894F * ajs.for(var1) * var2;
            }
         }
      }

   }

   public void a(aig var1, float var2, float var3, float var4) {
      af4 var5 = (af4)var1;
      this.av.f = 12.0F;
      this.av.e = -10.0F;
      this.aw.f = 15.0F;
      this.aw.e = -9.0F;
      this.ay.f = 15.0F;
      this.ay.e = 8.0F;
      this.ax.f = 20.0F;
      this.ax.e = 14.0F;
      this.aA.f = this.az.f = 13.8F;
      this.aA.e = this.az.e = -5.0F;
      this.aC.f = this.aB.f = 18.0F;
      this.aC.e = this.aB.e = 5.0F;
      this.ay.d = 0.9F;
      e7 var10000;
      if (var5.Q()) {
         ++this.av.f;
         var10000 = this.aw;
         var10000.f += 2.0F;
         ++this.ay.f;
         var10000 = this.ax;
         var10000.f += -4.0F;
         var10000 = this.ax;
         var10000.e += 2.0F;
         this.ay.d = 1.5707964F;
         this.ax.d = 1.5707964F;
         this.au = 0;
      } else if (var5.S()) {
         this.ax.f = this.ay.f;
         var10000 = this.ax;
         var10000.e += 2.0F;
         this.ay.d = 1.5707964F;
         this.ax.d = 1.5707964F;
         this.au = 2;
      } else if (var5.fB()) {
         this.av.d = 0.7853982F;
         var10000 = this.av;
         var10000.f += -4.0F;
         var10000 = this.av;
         var10000.e += 5.0F;
         var10000 = this.aw;
         var10000.f += -3.3F;
         ++this.aw.e;
         var10000 = this.ay;
         var10000.f += 8.0F;
         var10000 = this.ay;
         var10000.e += -2.0F;
         var10000 = this.ax;
         var10000.f += 2.0F;
         var10000 = this.ax;
         var10000.e += -0.8F;
         this.ay.d = 1.7278761F;
         this.ax.d = 2.670354F;
         this.aA.d = this.az.d = -0.15707964F;
         this.aA.f = this.az.f = 15.8F;
         this.aA.e = this.az.e = -7.0F;
         this.aC.d = this.aB.d = -1.5707964F;
         this.aC.f = this.aB.f = 21.0F;
         this.aC.e = this.aB.e = 1.0F;
         this.au = 3;
      } else {
         this.au = 1;
      }

   }
}
