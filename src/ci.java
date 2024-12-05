import org.lwjgl.opengl.GL11;

public class ci extends ck {
   private c2 g = new c2();

   public ci() {
      this.for = 0.5F;
   }

   public void a(afl var1, double var2, double var4, double var6, float var8, float var9) {
      y6 var10 = var1.bd();
      pa var11 = pa.x[var1.dN];
      if (var10.new(ajs.a(var1.al), ajs.a(var1.ak), ajs.a(var1.aj)) != var1.dN) {
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var2, (float)var4, (float)var6);
         this.a("/terrain.png");
         GL11.glDisable(2896);
         c4 var12;
         if (var11 instanceof r9 && var11.new() == 35) {
            this.g.o = var10;
            var12 = c4.G;
            var12.if();
            var12.a((double)((float)(-ajs.a(var1.al)) - 0.5F), (double)((float)(-ajs.a(var1.ak)) - 0.5F), (double)((float)(-ajs.a(var1.aj)) - 0.5F));
            this.g.a((r9)var11, ajs.a(var1.al), ajs.a(var1.ak), ajs.a(var1.aj), var1.dM);
            var12.a(0.0D, 0.0D, 0.0D);
            var12.for();
         } else if (var11.new() == 27) {
            this.g.o = var10;
            var12 = c4.G;
            var12.if();
            var12.a((double)((float)(-ajs.a(var1.al)) - 0.5F), (double)((float)(-ajs.a(var1.ak)) - 0.5F), (double)((float)(-ajs.a(var1.aj)) - 0.5F));
            this.g.a((re)var11, ajs.a(var1.al), ajs.a(var1.ak), ajs.a(var1.aj));
            var12.a(0.0D, 0.0D, 0.0D);
            var12.for();
         } else if (var11 != null) {
            this.g.if(var11);
            this.g.a(var11, var10, ajs.a(var1.al), ajs.a(var1.ak), ajs.a(var1.aj), var1.dM);
         }

         GL11.glEnable(2896);
         GL11.glPopMatrix();
      }

   }
}
