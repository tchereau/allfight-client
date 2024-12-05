import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;
import org.lwjgl.Sys;

public class kl implements Callable {
   // $FF: synthetic field
   final Minecraft a;

   public kl(Minecraft var1) {
      this.a = var1;
   }

   public String a() {
      return Sys.getVersion();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
