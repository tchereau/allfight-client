import net.minecraft.client.Minecraft;

public class kz extends Thread {
   // $FF: synthetic field
   final Minecraft a;

   public kz(Minecraft var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      while(this.a.uE) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException var2) {
         }
      }

   }
}
