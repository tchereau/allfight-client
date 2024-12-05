import java.util.HashMap;
import java.util.Iterator;

class li extends HashMap {
   // $FF: synthetic field
   final lj a;

   li(lj var1) {
      this.a = var1;
      Iterator var2 = lj.a(this.a).iterator();

      while(var2.hasNext()) {
         mc var3 = (mc)var2.next();
         this.put(var3.if(), var3.a());
      }

   }
}
