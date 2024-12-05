import java.util.concurrent.Callable;

class sq implements Callable {
   // $FF: synthetic field
   final ss a;

   sq(ss var1) {
      this.a = var1;
   }

   public String a() {
      return String.format("ID %02d - %s, ver %d. Features enabled: %b", ss.byte(this.a).int(), ss.byte(this.a).byte(), ss.byte(this.a).do(), ss.int(this.a));
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
