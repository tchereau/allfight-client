import java.util.Comparator;
import org.lwjgl.opengl.DisplayMode;

final class qs$1 implements Comparator {
   public int compare(Object var1, Object var2) {
      DisplayMode var3 = (DisplayMode)var1;
      DisplayMode var4 = (DisplayMode)var2;
      if (var3.getWidth() != var4.getWidth()) {
         return var4.getWidth() - var3.getWidth();
      } else {
         return var3.getHeight() != var4.getHeight() ? var4.getHeight() - var3.getHeight() : 0;
      }
   }
}
