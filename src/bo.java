import org.lwjgl.opengl.GL11;

public class bo extends b4 {
   protected fg p;

   public bo() {
      super(new fg(0.0F), 0.5F);
      this.p = (fg)this.l;
   }

   protected int a(aep var1, int var2, float var3) {
      return -1;
   }

   public void a(aep var1, double var2, double var4, double var6, float var8, float var9) {
      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected void a(aep var1, float var2) {
      super.do(var1, var2);
   }

   protected void if(aep var1, float var2) {
      float var3 = 0.9375F;
      if (var1.fr() < 0) {
         var3 = (float)((double)var3 * 0.5D);
         this.for = 0.25F;
      } else {
         this.for = 0.5F;
      }

      GL11.glScalef(var3, var3, var3);
   }

   // $FF: synthetic method
   protected void int(aig var1, float var2) {
      this.if((aep)var1, var2);
   }

   // $FF: synthetic method
   protected void do(aig var1, float var2) {
      this.a((aep)var1, var2);
   }
}
