import org.lwjgl.opengl.GL11;

public class bp extends b4 {
   private fh q;

   public bp() {
      super(new fh(), 0.5F);
      this.q = (fh)this.l;
   }

   public void a(afy var1, double var2, double var4, double var6, float var8, float var9) {
      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected void a(afy var1, float var2, float var3, float var4) {
      super.a(var1, var2, var3, var4);
      if (!((double)var1.ex < 0.01D)) {
         float var5 = 13.0F;
         float var6 = var1.ew - var1.ex * (1.0F - var4) + 6.0F;
         float var7 = (Math.abs(var6 % var5 - var5 * 0.5F) - var5 * 0.25F) / (var5 * 0.25F);
         GL11.glRotatef(6.5F * var7, 0.0F, 0.0F, 1.0F);
      }
   }

   protected void a(afy var1, float var2) {
      super.do(var1, var2);
      if (var1.fd() != 0) {
         GL11.glEnable(32826);
         GL11.glPushMatrix();
         GL11.glRotatef(5.0F + 180.0F * this.q.F.d / 3.1415927F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(-0.6875F, 1.25F, -0.9375F);
         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         float var3 = 0.8F;
         GL11.glScalef(var3, -var3, var3);
         int var4 = var1.new(var2);
         int var5 = var4 % 65536;
         int var6 = var4 / 65536;
         q.a(q.a, (float)var5 / 1.0F, (float)var6 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.a("/terrain.png");
         this.int.a(pa.bP, 0, 1.0F);
         GL11.glPopMatrix();
         GL11.glDisable(32826);
      }
   }

   // $FF: synthetic method
   protected void do(aig var1, float var2) {
      this.a((afy)var1, var2);
   }
}
