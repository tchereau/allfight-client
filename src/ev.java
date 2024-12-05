import java.util.concurrent.Callable;

class ev implements Callable {
   // $FF: synthetic field
   final ex a;

   ev(ex var1) {
      this.a = var1;
   }

   public String a() {
      return ex.if(this.a).size() + " total; " + ex.if(this.a).toString();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
