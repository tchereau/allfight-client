import java.util.concurrent.Callable;

class aid implements Callable {
   // $FF: synthetic field
   final aiz if;
   // $FF: synthetic field
   final aig a;

   aid(aig var1, aiz var2) {
      this.a = var1;
      this.if = var2;
   }

   public String a() {
      return this.if.do() + "";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
