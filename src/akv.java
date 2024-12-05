import java.util.concurrent.Callable;

class akv implements Callable {
   // $FF: synthetic field
   final an7 if;
   // $FF: synthetic field
   final akx a;

   akv(akx var1, an7 var2) {
      this.a = var1;
      this.if = var2;
   }

   public String a() {
      return this.if.getClass().getCanonicalName();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
