import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class ku implements Callable {
   // $FF: synthetic field
   final Minecraft a;

   public ku(Minecraft var1) {
      this.a = var1;
   }

   public String a() {
      int var1 = this.a.vm.do().if();
      int var2 = 56 * var1;
      int var3 = var2 / 1024 / 1024;
      int var4 = this.a.vm.do().int();
      int var5 = 56 * var4;
      int var6 = var5 / 1024 / 1024;
      return var1 + " (" + var2 + " bytes; " + var3 + " MB) allocated, " + var4 + " (" + var5 + " bytes; " + var6 + " MB) used";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
