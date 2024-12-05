import java.util.concurrent.Callable;

class ul implements Callable {
   // $FF: synthetic field
   final uo a;

   ul(uo var1) {
      this.a = var1;
   }

   public String a() {
      return this.a.getClass().getCanonicalName();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
