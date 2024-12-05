import java.util.concurrent.Callable;

class aqt implements Callable {
   // $FF: synthetic field
   final int if;
   // $FF: synthetic field
   final aqv a;

   aqt(aqv var1, int var2) {
      this.a = var1;
      this.if = var2;
   }

   public String a() {
      return aqd.a[this.if];
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
