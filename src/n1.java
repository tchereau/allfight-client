import java.util.concurrent.Callable;

class n1 implements Callable {
   // $FF: synthetic field
   final n4 a;

   n1(n4 var1) {
      this.a = var1;
   }

   public String a() {
      int var1 = this.a.try.for(this.a.new, this.a.int, this.a.for);
      if (var1 < 0) {
         return "Unknown? (Got " + var1 + ")";
      } else {
         String var2 = String.format("%4s", Integer.toBinaryString(var1)).replace(" ", "0");
         return String.format("%1$d / 0x%1$X / 0b%2$s", var1, var2);
      }
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
