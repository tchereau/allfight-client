import java.util.concurrent.Callable;

class aia implements Callable {
   // $FF: synthetic field
   final aiz if;
   // $FF: synthetic field
   final aig a;

   aia(aig var1, aiz var2) {
      this.a = var1;
      this.if = var2;
   }

   public String a() {
      return this.if.for() + "";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
