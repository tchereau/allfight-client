import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class ka {
   private static final DateFormat if = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
   private static IntBuffer a;
   private static int[] do;

   public static String a(File var0, int var1, int var2) {
      return a(var0, (String)null, var1, var2);
   }

   public static String a(File var0, String var1, int var2, int var3) {
      try {
         File var4 = new File(var0, "screenshots");
         var4.mkdir();
         int var5 = var2 * var3;
         if (a == null || a.capacity() < var5) {
            a = BufferUtils.createIntBuffer(var5);
            do = new int[var5];
         }

         GL11.glPixelStorei(3333, 1);
         GL11.glPixelStorei(3317, 1);
         a.clear();
         GL11.glReadPixels(0, 0, var2, var3, 32993, 33639, a);
         a.get(do);
         a(do, var2, var3);
         BufferedImage var6 = new BufferedImage(var2, var3, 1);
         var6.setRGB(0, 0, var2, var3, do, 0, var2);
         File var7;
         if (var1 == null) {
            var7 = a(var4);
         } else {
            var7 = new File(var4, var1);
         }

         ImageIO.write(var6, "png", var7);
         return "Saved screenshot as " + var7.getName();
      } catch (Exception var8) {
         var8.printStackTrace();
         return "Failed to save: " + var8;
      }
   }

   private static File a(File var0) {
      String var2 = if.format(new Date()).toString();
      int var3 = 1;

      while(true) {
         File var1 = new File(var0, var2 + (var3 == 1 ? "" : "_" + var3) + ".png");
         if (!var1.exists()) {
            return var1;
         }

         ++var3;
      }
   }

   private static void a(int[] var0, int var1, int var2) {
      int[] var3 = new int[var1];
      int var4 = var2 / 2;

      for(int var5 = 0; var5 < var4; ++var5) {
         System.arraycopy(var0, var5 * var1, var3, 0, var1);
         System.arraycopy(var0, (var2 - 1 - var5) * var1, var0, var5 * var1, var1);
         System.arraycopy(var3, 0, var0, (var2 - 1 - var5) * var1, var1);
      }

   }
}
