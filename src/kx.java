import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class kx implements Callable {
   // $FF: synthetic field
   final Minecraft a;

   public kx(Minecraft var1) {
      this.a = var1;
   }

   public String a() {
      return "Client (map_client.txt)";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
