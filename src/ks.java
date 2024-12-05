import net.minecraft.client.Minecraft;

public class ks implements akj {
   // $FF: synthetic field
   final Minecraft a;

   public ks(Minecraft var1) {
      this.a = var1;
   }

   public String a(String var1) {
      try {
         return String.format(var1, ke.new(this.a.u1.aF.int));
      } catch (Exception var3) {
         return "Error: " + var3.getLocalizedMessage();
      }
   }
}
