import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class alg extends Thread {
   private final List if = Collections.synchronizedList(new ArrayList());
   private final HashMap a = new HashMap();
   private int try = 0;
   private final ServerSocket new;
   private aku int;
   private final InetAddress for;
   private final int do;

   public alg(aku var1, InetAddress var2, int var3) {
      super("Listen thread");
      this.int = var1;
      this.do = var3;
      this.new = new ServerSocket(var3, 0, var2);
      this.for = var2 == null ? this.new.getInetAddress() : var2;
      this.new.setPerformancePreferences(0, 2, 1);
   }

   public void if() {
      synchronized(this.if) {
         for(int var2 = 0; var2 < this.if.size(); ++var2) {
            akz var3 = (akz)this.if.get(var2);

            try {
               var3.try();
            } catch (Exception var6) {
               var3.do("Internal server error");
               this.int.if().a().if("Failed to handle packet for " + var3.int() + ": " + var6, var6);
            }

            if (var3.o) {
               this.if.remove(var2--);
            }

            var3.p.for();
         }

      }
   }

   public void run() {
      while(this.int.if) {
         try {
            Socket var1 = this.new.accept();
            akz var2 = new akz(this.int.if(), var1, "Connection #" + this.try++);
            this.a(var2);
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

      this.int.if().a().a("Closing listening thread");
   }

   private void a(akz var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Got null pendingconnection!");
      } else {
         synchronized(this.if) {
            this.if.add(var1);
         }
      }
   }

   public void a(InetAddress var1) {
      if (var1 != null) {
         synchronized(this.a) {
            this.a.remove(var1);
         }
      }

   }

   public void a() {
      try {
         this.new.close();
      } catch (Throwable var2) {
      }

   }

   public InetAddress for() {
      return this.for;
   }

   public int do() {
      return this.do;
   }
}
