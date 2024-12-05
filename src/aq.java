import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import net.minecraft.client.Minecraft;

public class aq extends Thread {
   private final ap if;
   private final InetAddress a;
   private final MulticastSocket do;

   public aq(ap var1) {
      super("LanServerDetector");
      this.if = var1;
      this.setDaemon(true);
      this.do = new MulticastSocket(4445);
      this.a = InetAddress.getByName("224.0.2.60");
      this.do.setSoTimeout(5000);
      this.do.joinGroup(this.a);
   }

   public void run() {
      byte[] var2 = new byte[1024];

      while(!this.isInterrupted()) {
         DatagramPacket var1 = new DatagramPacket(var2, var2.length);

         try {
            this.do.receive(var1);
         } catch (SocketTimeoutException var5) {
            continue;
         } catch (IOException var6) {
            var6.printStackTrace();
            break;
         }

         String var3 = new String(var1.getData(), var1.getOffset(), var1.getLength());
         Minecraft.ih().a().for(var1.getAddress() + ": " + var3);
         this.if.a(var3, var1.getAddress());
      }

      try {
         this.do.leaveGroup(this.a);
      } catch (IOException var4) {
      }

      this.do.close();
   }
}
