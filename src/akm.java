import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class akm extends akq {
   private int s;
   private int r;
   private String q;
   private ServerSocket p = null;
   private String o;
   private Map n;

   public akm(amg var1) {
      super(var1);
      this.s = var1.new("rcon.port", 0);
      this.o = var1.do("rcon.password", "");
      this.q = var1.hl();
      this.r = var1.hr();
      if (0 == this.s) {
         this.s = this.r + 10;
         this.do("Setting default rcon port to " + this.s);
         var1.a("rcon.port", this.s);
         if (0 == this.o.length()) {
            var1.a("rcon.password", "");
         }

         var1.hJ();
      }

      if (0 == this.q.length()) {
         this.q = "0.0.0.0";
      }

      this.case();
      this.p = null;
   }

   private void case() {
      this.n = new HashMap();
   }

   private void char() {
      Iterator var1 = this.n.entrySet().iterator();

      while(var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         if (!((akn)var2.getValue()).for()) {
            var1.remove();
         }
      }

   }

   public void run() {
      this.do("RCON running on " + this.q + ":" + this.s);

      try {
         while(this.if) {
            try {
               Socket var1 = this.p.accept();
               var1.setSoTimeout(500);
               akn var2 = new akn(this.a, var1);
               var2.do();
               this.n.put(var1.getRemoteSocketAddress(), var2);
               this.char();
            } catch (SocketTimeoutException var7) {
               this.char();
            } catch (IOException var8) {
               if (this.if) {
                  this.do("IO: " + var8.getMessage());
               }
            }
         }
      } finally {
         this.a(this.p);
      }

   }

   public void do() {
      if (0 == this.o.length()) {
         this.if("No rcon password set in '" + this.a.hK() + "', rcon disabled!");
      } else if (0 < this.s && 65535 >= this.s) {
         if (!this.if) {
            try {
               this.p = new ServerSocket(this.s, 0, InetAddress.getByName(this.q));
               this.p.setSoTimeout(500);
               super.do();
            } catch (IOException var2) {
               this.if("Unable to initialise rcon on " + this.q + ":" + this.s + " : " + var2.getMessage());
            }

         }
      } else {
         this.if("Invalid rcon port " + this.s + " found in '" + this.a.hK() + "', rcon disabled!");
      }
   }
}
