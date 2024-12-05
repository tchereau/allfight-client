import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class kw implements Callable {
   // $FF: synthetic field
   final Minecraft a;

   public kw(Minecraft var1) {
      this.a = var1;
   }

   public String a() {
      return this.a.u1.ac;
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
