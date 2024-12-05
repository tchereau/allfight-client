import org.lwjgl.opengl.GL11;

public class bu extends b4 {
   private fl r;

   public bu() {
      super(new fl(), 0.5F);
      this.r = (fl)super.l;
      this.a(this.r);
   }

   protected void a(af0 var1, float var2) {
      super.do(var1, var2);
      abp var3 = new abp(pa.aW, 1);
      if (var3 != null && var3.d().A < 256) {
         GL11.glPushMatrix();
         this.r.X.if(0.0625F);
         if (c2.a(pa.x[var3.new].new())) {
            float var4 = 0.625F;
            GL11.glTranslatef(0.0F, -0.34375F, 0.0F);
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
         }

         this.a.long.a(var1, var3, 0);
         GL11.glPopMatrix();
      }

   }

   // $FF: synthetic method
   protected void do(aig var1, float var2) {
      this.a((af0)var1, var2);
   }
}
