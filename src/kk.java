import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class kk implements Callable {
   // $FF: synthetic field
   final Minecraft a;

   public kk(Minecraft var1) {
      this.a = var1;
   }

   public String a() {
      return GL11.glGetString(7937) + " GL version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936);
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
