import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import net.minecraft.client.Minecraft;

public class ao extends Thread {
   private final String if;
   private final DatagramSocket a;
   private boolean for = true;
   private final String do;

   public ao(String var1, String var2) {
      super("LanServerPinger");
      this.if = var1;
      this.do = var2;
      this.setDaemon(true);
      this.a = new DatagramSocket();
   }

   public void run() {
      String var1 = a(this.if, this.do);
      byte[] var2 = var1.getBytes();

      while(!this.isInterrupted() && this.for) {
         try {
            InetAddress var3 = InetAddress.getByName("224.0.2.60");
            DatagramPacket var4 = new DatagramPacket(var2, var2.length, var3, 4445);
            this.a.send(var4);
         } catch (IOException var6) {
            Minecraft.ih().a().if("LanServerPinger: " + var6.getMessage());
            break;
         }

         try {
            sleep(1500L);
         } catch (InterruptedException var5) {
         }
      }

   }

   public void interrupt() {
      super.interrupt();
      this.for = false;
   }

   public static String a(String var0, String var1) {
      return "[MOTD]" + var0 + "[/MOTD][AD]" + var1 + "[/AD]";
   }

   public static String if(String var0) {
      int var1 = var0.indexOf("[MOTD]");
      if (var1 < 0) {
         return "missing no";
      } else {
         int var2 = var0.indexOf("[/MOTD]", var1 + "[MOTD]".length());
         return var2 < var1 ? "missing no" : var0.substring(var1 + "[MOTD]".length(), var2);
      }
   }

   public static String a(String var0) {
      int var1 = var0.indexOf("[/MOTD]");
      if (var1 < 0) {
         return null;
      } else {
         int var2 = var0.indexOf("[/MOTD]", var1 + "[/MOTD]".length());
         if (var2 >= 0) {
            return null;
         } else {
            int var3 = var0.indexOf("[AD]", var1 + "[/MOTD]".length());
            if (var3 < 0) {
               return null;
            } else {
               int var4 = var0.indexOf("[/AD]", var3 + "[AD]".length());
               return var4 < var3 ? null : var0.substring(var3 + "[AD]".length(), var4);
            }
         }
      }
   }
}
