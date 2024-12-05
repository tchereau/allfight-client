import java.util.concurrent.Callable;

class sr implements Callable {
   // $FF: synthetic field
   final ss a;

   sr(ss var1) {
      this.a = var1;
   }

   public String a() {
      return String.valueOf(this.a.case());
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
