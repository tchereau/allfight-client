import java.util.concurrent.Callable;

class sk implements Callable {
   // $FF: synthetic field
   final ss a;

   sk(ss var1) {
      this.a = var1;
   }

   public String a() {
      return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", ss.new(this.a), ss.else(this.a), ss.if(this.a), ss.case(this.a));
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
