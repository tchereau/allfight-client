import org.lwjgl.opengl.GL11;

public class fc extends fx {
   public e7 i;
   public e7 h;
   public e7 o;
   public e7 n;
   public e7 m;
   public e7 l;
   e7 k;
   e7 j;

   public fc() {
      float var1 = 0.0F;
      float var2 = 13.5F;
      this.i = new e7(this, 0, 0);
      this.i.a(-3.0F, -3.0F, -2.0F, 6, 6, 4, var1);
      this.i.a(-1.0F, var2, -7.0F);
      this.h = new e7(this, 18, 14);
      this.h.a(-4.0F, -2.0F, -3.0F, 6, 9, 6, var1);
      this.h.a(0.0F, 14.0F, 2.0F);
      this.j = new e7(this, 21, 0);
      this.j.a(-4.0F, -3.0F, -3.0F, 8, 6, 7, var1);
      this.j.a(-1.0F, 14.0F, 2.0F);
      this.o = new e7(this, 0, 18);
      this.o.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.o.a(-2.5F, 16.0F, 7.0F);
      this.n = new e7(this, 0, 18);
      this.n.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.n.a(0.5F, 16.0F, 7.0F);
      this.m = new e7(this, 0, 18);
      this.m.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.m.a(-2.5F, 16.0F, -4.0F);
      this.l = new e7(this, 0, 18);
      this.l.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.l.a(0.5F, 16.0F, -4.0F);
      this.k = new e7(this, 9, 18);
      this.k.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.k.a(-1.0F, 12.0F, 8.0F);
      this.i.a(16, 14).a(-3.0F, -5.0F, 0.0F, 2, 2, 1, var1);
      this.i.a(16, 14).a(1.0F, -5.0F, 0.0F, 2, 2, 1, var1);
      this.i.a(0, 10).a(-1.5F, 0.0F, -5.0F, 3, 3, 4, var1);
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.a(var2, var3, var4, var5, var6, var7, var1);
      if (this.for) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, 5.0F * var7, 2.0F * var7);
         this.i.do(var7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
         GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
         this.h.for(var7);
         this.o.for(var7);
         this.n.for(var7);
         this.m.for(var7);
         this.l.for(var7);
         this.k.do(var7);
         this.j.for(var7);
         GL11.glPopMatrix();
      } else {
         this.i.do(var7);
         this.h.for(var7);
         this.o.for(var7);
         this.n.for(var7);
         this.m.for(var7);
         this.l.for(var7);
         this.k.do(var7);
         this.j.for(var7);
      }

   }

   public void a(aig var1, float var2, float var3, float var4) {
      afw var5 = (afw)var1;
      if (var5.fD()) {
         this.k.c = 0.0F;
      } else {
         this.k.c = ajs.for(var2 * 0.6662F) * 1.4F * var3;
      }

      if (var5.fB()) {
         this.j.a(-1.0F, 16.0F, -3.0F);
         this.j.d = 1.2566371F;
         this.j.c = 0.0F;
         this.h.a(0.0F, 18.0F, 0.0F);
         this.h.d = 0.7853982F;
         this.k.a(-1.0F, 21.0F, 6.0F);
         this.o.a(-2.5F, 22.0F, 2.0F);
         this.o.d = 4.712389F;
         this.n.a(0.5F, 22.0F, 2.0F);
         this.n.d = 4.712389F;
         this.m.d = 5.811947F;
         this.m.a(-2.49F, 17.0F, -4.0F);
         this.l.d = 5.811947F;
         this.l.a(0.51F, 17.0F, -4.0F);
      } else {
         this.h.a(0.0F, 14.0F, 2.0F);
         this.h.d = 1.5707964F;
         this.j.a(-1.0F, 14.0F, -3.0F);
         this.j.d = this.h.d;
         this.k.a(-1.0F, 12.0F, 8.0F);
         this.o.a(-2.5F, 16.0F, 7.0F);
         this.n.a(0.5F, 16.0F, 7.0F);
         this.m.a(-2.5F, 16.0F, -4.0F);
         this.l.a(0.5F, 16.0F, -4.0F);
         this.o.d = ajs.for(var2 * 0.6662F) * 1.4F * var3;
         this.n.d = ajs.for(var2 * 0.6662F + 3.1415927F) * 1.4F * var3;
         this.m.d = ajs.for(var2 * 0.6662F + 3.1415927F) * 1.4F * var3;
         this.l.d = ajs.for(var2 * 0.6662F) * 1.4F * var3;
      }

      this.i.b = var5.n(var4) + var5.new(var4, 0.0F);
      this.j.b = var5.new(var4, -0.08F);
      this.h.b = var5.new(var4, -0.16F);
      this.k.b = var5.new(var4, -0.2F);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.i.d = var5 / 57.295776F;
      this.i.c = var4 / 57.295776F;
      this.k.d = var3;
   }
}
