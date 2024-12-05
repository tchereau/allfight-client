import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

class at implements Callable {
   // $FF: synthetic field
   final av a;

   at(av var1) {
      this.a = var1;
   }

   public String a() {
      String var1 = net.minecraft.client.a.a();
      if (!var1.equals("vanilla")) {
         return "Definitely; Client brand changed to '" + var1 + "'";
      } else {
         var1 = this.a.hd();
         if (!var1.equals("vanilla")) {
            return "Definitely; Server brand changed to '" + var1 + "'";
         } else {
            return Minecraft.class.getSigners() == null ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and both client + server brands are untouched.";
         }
      }
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
