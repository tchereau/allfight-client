import java.util.concurrent.Callable;

final class aps implements Callable {
   // $FF: synthetic field
   final int a;

   aps(int var1) {
      this.a = var1;
   }

   public String a() {
      try {
         return String.format("ID #%d (%s // %s)", this.a, pa.x[this.a].long(), pa.x[this.a].getClass().getCanonicalName());
      } catch (Throwable var2) {
         return "ID #" + this.a;
      }
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
