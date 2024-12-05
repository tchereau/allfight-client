import java.util.concurrent.Callable;

class y5 implements Callable {
   // $FF: synthetic field
   final int if;
   // $FF: synthetic field
   final y6 a;

   y5(y6 var1, int var2) {
      this.a = var1;
      this.if = var2;
   }

   public String a() {
      try {
         return String.format("ID #%d (%s // %s)", this.if, pa.x[this.if].long(), pa.x[this.if].getClass().getCanonicalName());
      } catch (Throwable var2) {
         return "ID #" + this.if;
      }
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
