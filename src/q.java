import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GLContext;

public class q {
   public static int if;
   public static int a;
   private static boolean do = false;

   public static void a() {
      do = GLContext.getCapabilities().GL_ARB_multitexture && !GLContext.getCapabilities().OpenGL13;
      if (do) {
         if = 33984;
         a = 33985;
      } else {
         if = 33984;
         a = 33985;
      }

   }

   public static void a(int var0) {
      if (do) {
         ARBMultitexture.glActiveTextureARB(var0);
      } else {
         GL13.glActiveTexture(var0);
      }

   }

   public static void if(int var0) {
      if (do) {
         ARBMultitexture.glClientActiveTextureARB(var0);
      } else {
         GL13.glClientActiveTexture(var0);
      }

   }

   public static void a(int var0, float var1, float var2) {
      if (do) {
         ARBMultitexture.glMultiTexCoord2fARB(var0, var1, var2);
      } else {
         GL13.glMultiTexCoord2f(var0, var1, var2);
      }

   }
}
