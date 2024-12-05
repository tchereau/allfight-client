import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class bn extends b4 {
   private fe n;
   private int o;

   public bn() {
      super(new fe(0.0F), 0.5F);
      this.n = (fe)this.l;
      this.o = this.n.if();
   }

   public void a(aet var1, double var2, double var4, double var6, float var8, float var9) {
      abp var10 = var1.bW();
      if (this.n.if() != this.o) {
         Minecraft.ih().a().a("Loaded new witch model");
         this.l = this.n = new fe(0.0F);
         this.o = this.n.if();
      }

      this.n.z = var10 != null;
      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected void if(aet var1, float var2) {
      float var3 = 1.0F;
      GL11.glColor3f(var3, var3, var3);
      super.do(var1, var2);
      abp var4 = var1.bW();
      if (var4 != null) {
         GL11.glPushMatrix();
         float var5;
         if (this.l.for) {
            var5 = 0.5F;
            GL11.glTranslatef(0.0F, 0.625F, 0.0F);
            GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
            GL11.glScalef(var5, var5, var5);
         }

         this.n.t.if(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.53125F, 0.21875F);
         if (var4.new < 256 && c2.a(pa.x[var4.new].new())) {
            var5 = 0.5F;
            GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
            var5 *= 0.75F;
            GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var5, -var5, var5);
         } else if (var4.new == abr.W.A) {
            var5 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var5, -var5, var5);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if (abr.ai[var4.new].g()) {
            var5 = 0.625F;
            if (abr.ai[var4.new].else()) {
               GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
               GL11.glTranslatef(0.0F, -0.125F, 0.0F);
            }

            this.do();
            GL11.glScalef(var5, -var5, var5);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else {
            var5 = 0.375F;
            GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
            GL11.glScalef(var5, var5, var5);
            GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
         }

         GL11.glRotatef(-15.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(40.0F, 0.0F, 0.0F, 1.0F);
         this.a.long.a(var1, var4, 0);
         if (var4.d().do()) {
            this.a.long.a(var1, var4, 1);
         }

         GL11.glPopMatrix();
      }

   }

   protected void do() {
      GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
   }

   protected void a(aet var1, float var2) {
      float var3 = 0.9375F;
      GL11.glScalef(var3, var3, var3);
   }

   // $FF: synthetic method
   protected void int(aig var1, float var2) {
      this.a((aet)var1, var2);
   }

   // $FF: synthetic method
   protected void do(aig var1, float var2) {
      this.if((aet)var1, var2);
   }
}
