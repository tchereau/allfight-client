import org.lwjgl.opengl.GL11;

public class b3 extends b4 {
   public b3(fx var1, float var2) {
      super(var1, var2);
   }

   public void a(af5 var1, double var2, double var4, double var6, float var8, float var9) {
      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected void a(af5 var1, float var2) {
      super.do(var1, var2);
      if (!var1.bG()) {
         this.a("/terrain.png");
         GL11.glEnable(2884);
         GL11.glPushMatrix();
         GL11.glScalef(1.0F, -1.0F, 1.0F);
         GL11.glTranslatef(0.2F, 0.4F, 0.5F);
         GL11.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
         this.int.a(pa.bL, 0, 1.0F);
         GL11.glTranslatef(0.1F, 0.0F, -0.6F);
         GL11.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
         this.int.a(pa.bL, 0, 1.0F);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         ((ft)this.l).al.if(0.0625F);
         GL11.glScalef(1.0F, -1.0F, 1.0F);
         GL11.glTranslatef(0.0F, 0.75F, -0.2F);
         GL11.glRotatef(12.0F, 0.0F, 1.0F, 0.0F);
         this.int.a(pa.bL, 0, 1.0F);
         GL11.glPopMatrix();
         GL11.glDisable(2884);
      }
   }

   // $FF: synthetic method
   protected void do(aig var1, float var2) {
      this.a((af5)var1, var2);
   }
}
