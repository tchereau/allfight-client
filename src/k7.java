import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class k7 {
   public static float goto = 0.0F;
   public static float else = 0.0F;
   public static float char = 0.0F;
   private static IntBuffer for = k0.do(16);
   private static FloatBuffer do = k0.if(16);
   private static FloatBuffer if = k0.if(16);
   private static FloatBuffer a = k0.if(3);
   public static float case;
   public static float byte;
   public static float try;
   public static float new;
   public static float int;

   public static void a(aek var0, boolean var1) {
      GL11.glGetFloat(2982, do);
      GL11.glGetFloat(2983, if);
      GL11.glGetInteger(2978, for);
      float var2 = (float)((for.get(0) + for.get(2)) / 2);
      float var3 = (float)((for.get(1) + for.get(3)) / 2);
      GLU.gluUnProject(var2, var3, 0.0F, do, if, for, a);
      goto = a.get(0);
      else = a.get(1);
      char = a.get(2);
      int var4 = var1 ? 1 : 0;
      float var5 = var0.a4;
      float var6 = var0.a5;
      case = ajs.for(var6 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      try = ajs.try(var6 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      new = -try * ajs.try(var5 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      int = case * ajs.try(var5 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      byte = ajs.for(var5 * 3.1415927F / 180.0F);
   }

   public static nr a(aig var0, double var1) {
      double var3 = var0.ao + (var0.al - var0.ao) * var1;
      double var5 = var0.an + (var0.ak - var0.an) * var1 + (double)var0.af();
      double var7 = var0.am + (var0.aj - var0.am) * var1;
      double var9 = var3 + (double)(goto * 1.0F);
      double var11 = var5 + (double)(else * 1.0F);
      double var13 = var7 + (double)(char * 1.0F);
      return var0.ap.do().a(var9, var11, var13);
   }

   public static int a(y6 var0, aig var1, float var2) {
      nr var3 = a(var1, (double)var2);
      yp var4 = new yp(var3);
      int var5 = var0.new(var4.if, var4.a, var4.do);
      if (var5 != 0 && pa.x[var5].at.case()) {
         float var6 = qn.i(var0.for(var4.if, var4.a, var4.do)) - 0.11111111F;
         float var7 = (float)(var4.a + 1) - var6;
         if (var3.for >= (double)var7) {
            var5 = var0.new(var4.if, var4.a + 1, var4.do);
         }
      }

      return var5;
   }
}
