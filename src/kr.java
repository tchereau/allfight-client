import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class kr implements Callable {
   // $FF: synthetic field
   final Minecraft a;

   public kr(Minecraft var1) {
      this.a = var1;
   }

   public String a() {
      return this.a.u8.getClass().getCanonicalName();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
