import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;

class ai9 extends TimerTask {
   // $FF: synthetic field
   final aja a;

   ai9(aja var1) {
      this.a = var1;
   }

   public void run() {
      if (aja.if(this.a).if()) {
         HashMap var1;
         synchronized(aja.a(this.a)) {
            var1 = new HashMap(aja.do(this.a));
            var1.put("snooper_count", aja.for(this.a));
         }

         aj3.a(aja.if(this.a).a(), aja.int(this.a), (Map)var1, true);
      }
   }
}
