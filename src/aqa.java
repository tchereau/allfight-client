import java.util.concurrent.Callable;

class aqa implements Callable {
   // $FF: synthetic field
   final aqh a;

   aqa(aqh var1) {
      this.a = var1;
   }

   public String a() {
      return System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
