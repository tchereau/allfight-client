import java.util.concurrent.Callable;

class y4 implements Callable {
   // $FF: synthetic field
   final y6 a;

   y4(y6 var1) {
      this.a = var1;
   }

   public String a() {
      return this.a.z.size() + " total; " + this.a.z.toString();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
