import java.util.concurrent.Callable;

class n3 implements Callable {
   // $FF: synthetic field
   final n4 a;

   n3(n4 var1) {
      this.a = var1;
   }

   public String a() {
      return (String)n4.void().get(this.a.getClass()) + " // " + this.a.getClass().getCanonicalName();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
