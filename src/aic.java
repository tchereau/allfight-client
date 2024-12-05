import java.util.concurrent.Callable;

class aic implements Callable {
   // $FF: synthetic field
   final aiz if;
   // $FF: synthetic field
   final aig a;

   aic(aig var1, aiz var2) {
      this.a = var1;
      this.if = var2;
   }

   public String a() {
      return this.if.int() + "";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
