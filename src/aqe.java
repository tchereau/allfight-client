import java.util.concurrent.Callable;

class aqe implements Callable {
   // $FF: synthetic field
   final aqh a;

   aqe(aqh var1) {
      this.a = var1;
   }

   public String a() {
      return "1.5.1";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
