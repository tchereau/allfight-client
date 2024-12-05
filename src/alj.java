import java.util.concurrent.Callable;

class alj implements Callable {
   // $FF: synthetic field
   final alm a;

   alj(alm var1) {
      this.a = var1;
   }

   public String a() {
      String var1 = this.a.hd();
      return !var1.equals("vanilla") ? "Definitely; Server brand changed to '" + var1 + "'" : "Unknown (can't tell)";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
