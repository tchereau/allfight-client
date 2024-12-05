import java.util.concurrent.Callable;

class sp implements Callable {
   // $FF: synthetic field
   final ss a;

   sp(ss var1) {
      this.a = var1;
   }

   public String a() {
      return ss.long(this.a);
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
