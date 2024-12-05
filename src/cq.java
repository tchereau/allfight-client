import org.lwjgl.opengl.GL11;

public class cq extends b4 {
   private fx D = new f4(2.0F);

   public cq() {
      super(new f4(), 0.5F);
   }

   protected void a(ae7 var1, float var2) {
      float var3 = var1.i(var2);
      float var4 = 1.0F + ajs.try(var3 * 100.0F) * var3 * 0.01F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      var3 *= var3;
      var3 *= var3;
      float var5 = (1.0F + var3 * 0.4F) * var4;
      float var6 = (1.0F + var3 * 0.1F) / var4;
      GL11.glScalef(var5, var6, var5);
   }

   protected int a(ae7 var1, float var2, float var3) {
      float var4 = var1.i(var3);
      if ((int)(var4 * 10.0F) % 2 == 0) {
         return 0;
      } else {
         int var5 = (int)(var4 * 0.2F * 255.0F);
         if (var5 < 0) {
            var5 = 0;
         }

         if (var5 > 255) {
            var5 = 255;
         }

         short var6 = 255;
         short var7 = 255;
         short var8 = 255;
         return var5 << 24 | var6 << 16 | var7 << 8 | var8;
      }
   }

   protected int a(ae7 var1, int var2, float var3) {
      if (var1.fp()) {
         if (var1.U()) {
            GL11.glDepthMask(false);
         } else {
            GL11.glDepthMask(true);
         }

         if (var2 == 1) {
            float var4 = (float)var1.bl + var3;
            this.a("/armor/power.png");
            GL11.glMatrixMode(5890);
            GL11.glLoadIdentity();
            float var5 = var4 * 0.01F;
            float var6 = var4 * 0.01F;
            GL11.glTranslatef(var5, var6, 0.0F);
            this.a(this.D);
            GL11.glMatrixMode(5888);
            GL11.glEnable(3042);
            float var7 = 0.5F;
            GL11.glColor4f(var7, var7, var7, 1.0F);
            GL11.glDisable(2896);
            GL11.glBlendFunc(1, 1);
            return 16;
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

   protected int if(ae7 var1, int var2, float var3) {
      return -1;
   }

   protected void int(aig var1, float var2) {
      this.a((ae7)var1, var2);
   }

   protected int a(aig var1, float var2, float var3) {
      return this.a((ae7)var1, var2, var3);
   }

   protected int do(aig var1, int var2, float var3) {
      return this.a((ae7)var1, var2, var3);
   }

   protected int a(aig var1, int var2, float var3) {
      return this.if((ae7)var1, var2, var3);
   }
}
