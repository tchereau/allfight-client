import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class akq implements Runnable {
   protected boolean if = false;
   protected amg a;
   protected Thread new;
   protected int int = 5;
   protected List for = new ArrayList();
   protected List do = new ArrayList();

   akq(amg var1) {
      this.a = var1;
      if (this.a.g1()) {
         this.if("Debugging is enabled, performance maybe reduced!");
      }

   }

   public synchronized void do() {
      this.new = new Thread(this);
      this.new.start();
      this.if = true;
   }

   public boolean for() {
      return this.if;
   }

   protected void for(String var1) {
      this.a.F(var1);
   }

   protected void do(String var1) {
      this.a.J(var1);
   }

   protected void if(String var1) {
      this.a.I(var1);
   }

   protected void a(String var1) {
      this.a.G(var1);
   }

   protected int a() {
      return this.a.hw();
   }

   protected void a(DatagramSocket var1) {
      this.for("registerSocket: " + var1);
      this.for.add(var1);
   }

   protected boolean a(DatagramSocket var1, boolean var2) {
      this.for("closeSocket: " + var1);
      if (null == var1) {
         return false;
      } else {
         boolean var3 = false;
         if (!var1.isClosed()) {
            var1.close();
            var3 = true;
         }

         if (var2) {
            this.for.remove(var1);
         }

         return var3;
      }
   }

   protected boolean a(ServerSocket var1) {
      return this.a(var1, true);
   }

   protected boolean a(ServerSocket var1, boolean var2) {
      this.for("closeSocket: " + var1);
      if (null == var1) {
         return false;
      } else {
         boolean var3 = false;

         try {
            if (!var1.isClosed()) {
               var1.close();
               var3 = true;
            }
         } catch (IOException var5) {
            this.if("IO: " + var5.getMessage());
         }

         if (var2) {
            this.do.remove(var1);
         }

         return var3;
      }
   }

   protected void if() {
      this.a(false);
   }

   protected void a(boolean var1) {
      int var2 = 0;
      Iterator var3 = this.for.iterator();

      while(var3.hasNext()) {
         DatagramSocket var4 = (DatagramSocket)var3.next();
         if (this.a(var4, false)) {
            ++var2;
         }
      }

      this.for.clear();
      var3 = this.do.iterator();

      while(var3.hasNext()) {
         ServerSocket var5 = (ServerSocket)var3.next();
         if (this.a(var5, false)) {
            ++var2;
         }
      }

      this.do.clear();
      if (var1 && 0 < var2) {
         this.if("Force closed " + var2 + " sockets");
      }

   }
}
