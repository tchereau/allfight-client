import java.util.concurrent.Callable;

class ew implements Callable {
   // $FF: synthetic field
   final ex a;

   ew(ex var1) {
      this.a = var1;
   }

   public String a() {
      return ex.a(this.a).size() + " total; " + ex.a(this.a).toString();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
