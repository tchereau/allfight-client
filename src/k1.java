import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class k1 {
   private static FloatBuffer if = k0.if(16);
   private static final nr a = nr.do(0.20000000298023224D, 1.0D, -0.699999988079071D).if();
   private static final nr do = nr.do(-0.20000000298023224D, 1.0D, 0.699999988079071D).if();

   public static void do() {
      GL11.glDisable(2896);
      GL11.glDisable(16384);
      GL11.glDisable(16385);
      GL11.glDisable(2903);
   }

   public static void if() {
      GL11.glEnable(2896);
      GL11.glEnable(16384);
      GL11.glEnable(16385);
      GL11.glEnable(2903);
      GL11.glColorMaterial(1032, 5634);
      float var0 = 0.4F;
      float var1 = 0.6F;
      float var2 = 0.0F;
      GL11.glLight(16384, 4611, a(a.int, a.for, a.do, 0.0D));
      GL11.glLight(16384, 4609, a(var1, var1, var1, 1.0F));
      GL11.glLight(16384, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
      GL11.glLight(16384, 4610, a(var2, var2, var2, 1.0F));
      GL11.glLight(16385, 4611, a(do.int, do.for, do.do, 0.0D));
      GL11.glLight(16385, 4609, a(var1, var1, var1, 1.0F));
      GL11.glLight(16385, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
      GL11.glLight(16385, 4610, a(var2, var2, var2, 1.0F));
      GL11.glShadeModel(7424);
      GL11.glLightModel(2899, a(var0, var0, var0, 1.0F));
   }

   private static FloatBuffer a(double var0, double var2, double var4, double var6) {
      return a((float)var0, (float)var2, (float)var4, (float)var6);
   }

   private static FloatBuffer a(float var0, float var1, float var2, float var3) {
      if.clear();
      if.put(var0).put(var1).put(var2).put(var3);
      if.flip();
      return if;
   }

   public static void a() {
      GL11.glPushMatrix();
      GL11.glRotatef(-30.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(165.0F, 1.0F, 0.0F, 0.0F);
      if();
      GL11.glPopMatrix();
   }
}
