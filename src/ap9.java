import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ap9 implements aqb {
   private static final SocketAddress case = new InetSocketAddress("127.0.0.1", 0);
   private final List byte = Collections.synchronizedList(new ArrayList());
   private final ajw try;
   private ap9 new;
   private an6 int;
   private boolean for = false;
   private String do = "";
   private Object[] if;
   private boolean a = false;

   public ap9(ajw var1, an6 var2) {
      this.int = var2;
      this.try = var1;
   }

   public void a(an6 var1) {
      this.int = var1;
   }

   public void a(an7 var1) {
      if (!this.for) {
         this.new.if(var1);
      }
   }

   public void a() {
      this.new = null;
      this.int = null;
   }

   public boolean case() {
      return !this.for && this.new != null;
   }

   public void for() {
   }

   public void if() {
      int var1 = 2500;

      while(var1-- >= 0 && !this.byte.isEmpty()) {
         an7 var2 = (an7)this.byte.remove(0);
         var2.a(this.int);
      }

      if (this.byte.size() > var1) {
         this.try.if("Memory connection overburdened; after processing 2500 packets, we still have " + this.byte.size() + " to go!");
      }

      if (this.for && this.byte.isEmpty()) {
         this.int.a(this.do, this.if);
      }

   }

   public SocketAddress do() {
      return case;
   }

   public void int() {
      this.for = true;
   }

   public void a(String var1, Object... var2) {
      this.for = true;
      this.do = var1;
      this.if = var2;
   }

   public int new() {
      return 0;
   }

   public void a(ap9 var1) {
      this.new = var1;
      var1.new = this;
   }

   public boolean try() {
      return this.a;
   }

   public void a(boolean var1) {
      this.a = var1;
   }

   public ap9 byte() {
      return this.new;
   }

   public void if(an7 var1) {
      if (var1.a() && this.int.if()) {
         var1.a(this.int);
      } else {
         this.byte.add(var1);
      }

   }
}
