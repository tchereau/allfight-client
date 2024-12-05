import java.util.concurrent.Callable;

class sm implements Callable {
   // $FF: synthetic field
   final ss a;

   sm(ss var1) {
      this.a = var1;
   }

   public String a() {
      return String.valueOf(ss.char(this.a));
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
