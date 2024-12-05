import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class ky implements Callable {
   // $FF: synthetic field
   final Minecraft a;

   public ky(Minecraft var1) {
      this.a = var1;
   }

   public String a() {
      String var1 = net.minecraft.client.a.a();
      if (!var1.equals("vanilla")) {
         return "Definitely; Client brand changed to '" + var1 + "'";
      } else {
         return Minecraft.class.getSigners() == null ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and client brand is untouched.";
      }
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
