import org.lwjgl.opengl.GL11;

public class bt extends b4 {
   public bt() {
      super(new fk(), 1.0F);
      this.a((fx)(new fk()));
   }

   protected float a(aeu var1) {
      return 180.0F;
   }

   protected int a(aeu var1, int var2, float var3) {
      if (var2 != 0) {
         return -1;
      } else {
         this.a((String)"/mob/spider_eyes.png");
         float var4 = 1.0F;
         GL11.glEnable(3042);
         GL11.glDisable(3008);
         GL11.glBlendFunc(1, 1);
         if (var1.U()) {
            GL11.glDepthMask(false);
         } else {
            GL11.glDepthMask(true);
         }

         char var5 = '\uf0f0';
         int var6 = var5 % 65536;
         int var7 = var5 / 65536;
         q.a(q.a, (float)var6 / 1.0F, (float)var7 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);
         return 1;
      }
   }

   protected void a(aeu var1, float var2) {
      float var3 = var1.fj();
      GL11.glScalef(var3, var3, var3);
   }

   // $FF: synthetic method
   protected float a(aig var1) {
      return this.a((aeu)var1);
   }
}
