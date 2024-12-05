import java.util.concurrent.Callable;

class aie implements Callable {
   // $FF: synthetic field
   final aiz if;
   // $FF: synthetic field
   final aig a;

   aie(aig var1, aiz var2) {
      this.a = var1;
      this.if = var2;
   }

   public String a() {
      return this.if.byte() + "";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
