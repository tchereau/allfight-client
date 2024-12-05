import java.net.ConnectException;
import java.net.UnknownHostException;

class e1 extends Thread {
   final String if;
   final int a;
   final e2 do;

   e1(e2 var1, String var2, int var3) {
      this.do = var1;
      this.if = var2;
      this.a = var3;
   }

   public void run() {
      try {
         e2.a(this.do, new e5(e2.byte(this.do), this.if, this.a));
         if (e2.new(this.do)) {
            return;
         }

         e2.int(this.do).for((an7)(new ao5(34, e2.do(this.do).vg.if, this.if, this.a)));
      } catch (UnknownHostException var2) {
         if (e2.new(this.do)) {
            return;
         }

         e2.for(this.do).a((i5)(new e0(e2.if(this.do), "connect.failed", "disconnect.genericReason", new Object[]{"Unknown host '" + this.if + "'"})));
      } catch (ConnectException var3) {
         if (e2.new(this.do)) {
            return;
         }

         e2.a(this.do).a((i5)(new e0(e2.if(this.do), "connect.failed", "disconnect.genericReason", new Object[]{var3.getMessage()})));
      } catch (Exception var4) {
         if (e2.new(this.do)) {
            return;
         }

         var4.printStackTrace();
         e2.try(this.do).a((i5)(new e0(e2.if(this.do), "connect.failed", "disconnect.genericReason", new Object[]{var4.toString()})));
      }

   }
}
