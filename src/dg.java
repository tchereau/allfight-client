import java.util.concurrent.Callable;

class dg implements Callable {
   // $FF: synthetic field
   final dh a;

   dg(dh var1) {
      this.a = var1;
   }

   public String a() {
      return dh.a(this.a).u8.getClass().getCanonicalName();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
