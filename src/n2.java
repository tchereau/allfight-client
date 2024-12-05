import java.util.concurrent.Callable;

class n2 implements Callable {
   // $FF: synthetic field
   final n4 a;

   n2(n4 var1) {
      this.a = var1;
   }

   public String a() {
      int var1 = this.a.try.new(this.a.new, this.a.int, this.a.for);

      try {
         return String.format("ID #%d (%s // %s)", var1, pa.x[var1].long(), pa.x[var1].getClass().getCanonicalName());
      } catch (Throwable var3) {
         return "ID #" + var1;
      }
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
