import org.lwjgl.opengl.GL11;

public class a4 extends ay {
   public void a(oa var1, double var2, double var4, double var6, float var8) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2 + 0.5F, (float)var4, (float)var6 + 0.5F);
      a(var1.o(), var2, var4, var6, var8);
      GL11.glPopMatrix();
   }

   public static void a(zk var0, double var1, double var3, double var5, float var7) {
      aiw var8 = var0.int();
      if (var8 != null) {
         var8.if(var0.do());
         float var9 = 0.4375F;
         GL11.glTranslatef(0.0F, 0.4F, 0.0F);
         GL11.glRotatef((float)(var0.char + (var0.else - var0.char) * (double)var7) * 10.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-30.0F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.4F, 0.0F);
         GL11.glScalef(var9, var9, var9);
         var8.if(var1, var3, var5, 0.0F, 0.0F);
         cl.e.if(var8, 0.0D, 0.0D, 0.0D, 0.0F, var7);
      }

   }
}
