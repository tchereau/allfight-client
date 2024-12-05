import java.awt.Canvas;
import net.minecraft.client.MinecraftApplet;

public class ki extends Canvas {
   final MinecraftApplet a;

   public ki(MinecraftApplet var1) {
      this.a = var1;
   }

   public synchronized void addNotify() {
      super.addNotify();
      this.a.if();
   }

   public synchronized void removeNotify() {
      this.a.a();
      super.removeNotify();
   }
}
