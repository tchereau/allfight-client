import java.util.concurrent.Callable;

class sn implements Callable {
   // $FF: synthetic field
   final ss a;

   sn(ss var1) {
      this.a = var1;
   }

   public String a() {
      return String.format("%d game time, %d day time", ss.goto(this.a), ss.a(this.a));
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
