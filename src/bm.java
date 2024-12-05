import org.lwjgl.opengl.GL11;

public class bm extends b4 {
   private int m;

   public bm() {
      super(new fd(), 1.0F);
      this.m = ((fd)this.l).a();
   }

   public void a(afq var1, double var2, double var4, double var6, float var8, float var9) {
      dn.a(var1, true);
      int var10 = ((fd)this.l).a();
      if (var10 != this.m) {
         this.m = var10;
         this.l = new fd();
      }

      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected void a(afq var1, float var2) {
      int var3 = var1.fa();
      if (var3 > 0) {
         float var4 = 2.0F - ((float)var3 - var2) / 220.0F * 0.5F;
         GL11.glScalef(var4, var4, var4);
      } else {
         GL11.glScalef(2.0F, 2.0F, 2.0F);
      }

   }

   protected int if(afq var1, int var2, float var3) {
      if (var1.fb()) {
         if (var1.U()) {
            GL11.glDepthMask(false);
         } else {
            GL11.glDepthMask(true);
         }

         if (var2 == 1) {
            float var4 = (float)var1.bl + var3;
            this.a("/armor/witherarmor.png");
            GL11.glMatrixMode(5890);
            GL11.glLoadIdentity();
            float var5 = ajs.for(var4 * 0.02F) * 3.0F;
            float var6 = var4 * 0.01F;
            GL11.glTranslatef(var5, var6, 0.0F);
            this.a(this.l);
            GL11.glMatrixMode(5888);
            GL11.glEnable(3042);
            float var7 = 0.5F;
            GL11.glColor4f(var7, var7, var7, 1.0F);
            GL11.glDisable(2896);
            GL11.glBlendFunc(1, 1);
            GL11.glTranslatef(0.0F, -0.01F, 0.0F);
            GL11.glScalef(1.1F, 1.1F, 1.1F);
            return 1;
         }

         if (var2 == 2) {
            GL11.glMatrixMode(5890);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glEnable(2896);
            GL11.glDisable(3042);
         }
      }

      return -1;
   }

   protected int a(afq var1, int var2, float var3) {
      return -1;
   }
}
