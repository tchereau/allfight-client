import java.util.Calendar;
import org.lwjgl.opengl.GL11;

public class a7 extends ay {
   private f7 char = new f7();
   private f7 goto = new f0();
   private boolean else;

   public a7() {
      Calendar var1 = Calendar.getInstance();
      if (var1.get(2) + 1 == 12 && var1.get(5) >= 24 && var1.get(5) <= 26) {
         this.else = true;
      }

   }

   public void a(om var1, double var2, double var4, double var6, float var8) {
      int var9;
      if (!var1.goto()) {
         var9 = 0;
      } else {
         pa var10 = var1.else();
         var9 = var1.try();
         if (var10 instanceof ru && var9 == 0) {
            ((ru)var10).M(var1.b(), var1.new, var1.int, var1.for);
            var9 = var1.try();
         }

         var1.w();
      }

      if (var1.z == null && var1.x == null) {
         f7 var14;
         if (var1.y == null && var1.w == null) {
            var14 = this.char;
            if (var1.x() == 1) {
               this.a("/item/chests/trap_small.png");
            } else if (this.else) {
               this.a("/item/xmaschest.png");
            } else {
               this.a("/item/chest.png");
            }
         } else {
            var14 = this.goto;
            if (var1.x() == 1) {
               this.a("/item/chests/trap_large.png");
            } else if (this.else) {
               this.a("/item/largexmaschest.png");
            } else {
               this.a("/item/largechest.png");
            }
         }

         GL11.glPushMatrix();
         GL11.glEnable(32826);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glTranslatef((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
         GL11.glScalef(1.0F, -1.0F, -1.0F);
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         short var11 = 0;
         if (var9 == 2) {
            var11 = 180;
         }

         if (var9 == 3) {
            var11 = 0;
         }

         if (var9 == 4) {
            var11 = 90;
         }

         if (var9 == 5) {
            var11 = -90;
         }

         if (var9 == 2 && var1.y != null) {
            GL11.glTranslatef(1.0F, 0.0F, 0.0F);
         }

         if (var9 == 5 && var1.w != null) {
            GL11.glTranslatef(0.0F, 0.0F, -1.0F);
         }

         GL11.glRotatef((float)var11, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         float var12 = var1.u + (var1.v - var1.u) * var8;
         float var13;
         if (var1.z != null) {
            var13 = var1.z.u + (var1.z.v - var1.z.u) * var8;
            if (var13 > var12) {
               var12 = var13;
            }
         }

         if (var1.x != null) {
            var13 = var1.x.u + (var1.x.v - var1.x.u) * var8;
            if (var13 > var12) {
               var12 = var13;
            }
         }

         var12 = 1.0F - var12;
         var12 = 1.0F - var12 * var12 * var12;
         var14.bd.d = -(var12 * 3.1415927F / 2.0F);
         var14.new();
         GL11.glDisable(32826);
         GL11.glPopMatrix();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
