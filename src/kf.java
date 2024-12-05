import org.lwjgl.opengl.GLContext;

public class kf {
   public static boolean a() {
      return GLContext.getCapabilities().GL_ARB_occlusion_query;
   }
}
