import java.net.ConnectException;
import java.net.UnknownHostException;

class g9 extends Thread {
   // $FF: synthetic field
   final String if;
   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final ha do;

   g9(ha var1, String var2, int var3) {
      this.do = var1;
      this.if = var2;
      this.a = var3;
   }

   public void run() {
      try {
         ha.a(this.do, new e5(this.do.a(), this.if, this.a, ha.a(this.do)));
         if (this.do.do()) {
            return;
         }

         this.do.if(aqy.if().a("mco.connect.authorizing"));
         ha.if(this.do).for((an7)(new ao5(60, this.do.a().vg.if, this.if, this.a)));
      } catch (UnknownHostException var2) {
         if (this.do.do()) {
            return;
         }

         this.do.a().a((i5)(new ho(ha.a(this.do), "connect.failed", "disconnect.genericReason", new Object[]{"Unknown host '" + this.if + "'"})));
      } catch (ConnectException var3) {
         if (this.do.do()) {
            return;
         }

         this.do.a().a((i5)(new ho(ha.a(this.do), "connect.failed", "disconnect.genericReason", new Object[]{var3.getMessage()})));
      } catch (Exception var4) {
         if (this.do.do()) {
            return;
         }

         var4.printStackTrace();
         this.do.a().a((i5)(new ho(ha.a(this.do), "connect.failed", "disconnect.genericReason", new Object[]{var4.toString()})));
      }

   }
}
