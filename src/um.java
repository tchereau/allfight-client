import java.util.concurrent.Callable;

class um implements Callable {
   // $FF: synthetic field
   final int if;
   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final uo do;

   um(uo var1, int var2, int var3) {
      this.do = var1;
      this.if = var2;
      this.a = var3;
   }

   public String a() {
      return String.valueOf(zi.a(this.if, this.a));
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
