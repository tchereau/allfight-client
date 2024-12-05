import java.util.concurrent.Callable;

class sj implements Callable {
   // $FF: synthetic field
   final ss a;

   sj(ss var1) {
      this.a = var1;
   }

   public String a() {
      return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", ss.c(this.a).int(), ss.c(this.a).new(), ss.for(this.a), ss.void(this.a));
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
