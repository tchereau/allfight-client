import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ap {
   private ArrayList a = new ArrayList();
   boolean if;

   public synchronized boolean if() {
      return this.if;
   }

   public synchronized void do() {
      this.if = false;
   }

   public synchronized List a() {
      return Collections.unmodifiableList(this.a);
   }

   public synchronized void a(String var1, InetAddress var2) {
      String var3 = ao.if(var1);
      String var4 = ao.a(var1);
      if (var4 != null) {
         int var5 = var4.indexOf(58);
         if (var5 > 0) {
            var4 = var2.getHostAddress() + var4.substring(var5);
         }

         boolean var6 = false;
         Iterator var7 = this.a.iterator();

         while(var7.hasNext()) {
            ar var8 = (ar)var7.next();
            if (var8.if().equals(var4)) {
               var8.a();
               var6 = true;
               break;
            }
         }

         if (!var6) {
            this.a.add(new ar(var3, var4));
            this.if = true;
         }

      }
   }
}
