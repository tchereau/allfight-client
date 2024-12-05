import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.TimerTask;

class hd extends TimerTask {
   gv if;
   // $FF: synthetic field
   final hf a;

   private hd(hf var1) {
      this.a = var1;
      this.if = new gv(hf.if(this.a));
   }

   public void run() {
      if (!hf.a(this.a)) {
         this.a();
      }

   }

   private void a() {
      try {
         List var1 = this.if.a().do;
         this.a(var1);
         hf.a(this.a, var1);
      } catch (gj var2) {
      } catch (IOException var3) {
         System.err.println(var3);
      }

   }

   private void a(List var1) {
      Collections.sort(var1, new hc(this, hf.if(this.a).if, (he)null));
   }

   // $FF: synthetic method
   hd(hf var1, he var2) {
      this(var1);
   }
}
