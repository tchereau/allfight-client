import java.util.concurrent.Callable;

class y3 implements Callable {
   // $FF: synthetic field
   final y6 a;

   y3(y6 var1) {
      this.a = var1;
   }

   public String a() {
      return this.a.l.a();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
