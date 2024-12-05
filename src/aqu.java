import java.util.concurrent.Callable;

class aqu implements Callable {
   // $FF: synthetic field
   final String if;
   // $FF: synthetic field
   final aqv a;

   aqu(aqv var1, String var2) {
      this.a = var1;
      this.if = var2;
   }

   public String a() {
      return aqd.a[((aqd)aqv.a(this.a).get(this.if)).a()];
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
