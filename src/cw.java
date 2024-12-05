import org.lwjgl.opengl.GL11;

public class cw extends b4 {
   private int F;

   public cw() {
      super(new gb(), 0.25F);
      this.F = ((gb)this.l).byte();
   }

   public void a(aga var1, double var2, double var4, double var6, float var8, float var9) {
      int var10 = ((gb)this.l).byte();
      if (var10 != this.F) {
         this.F = var10;
         this.l = new gb();
      }

      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected void a(aga var1, float var2) {
      GL11.glScalef(0.35F, 0.35F, 0.35F);
   }

   protected void a(aga var1, double var2, double var4, double var6) {
      super.a(var1, var2, var4, var6);
   }

   protected void a(aga var1, float var2, float var3, float var4) {
      if (!var1.fP()) {
         GL11.glTranslatef(0.0F, ajs.for(var2 * 0.3F) * 0.1F, 0.0F);
      } else {
         GL11.glTranslatef(0.0F, -0.1F, 0.0F);
      }

      super.a(var1, var2, var3, var4);
   }
}
