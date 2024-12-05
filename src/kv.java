import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class kv implements Callable {
   // $FF: synthetic field
   final Minecraft a;

   public kv(Minecraft var1) {
      this.a = var1;
   }

   public String a() {
      return this.a.uG.else ? this.a.uG.a() : "N/A (disabled)";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
