import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class kq implements Callable {
   // $FF: synthetic field
   final Minecraft a;

   public kq(Minecraft var1) {
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
