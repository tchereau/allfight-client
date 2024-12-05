import java.util.concurrent.Callable;

class aiv implements Callable {
   // $FF: synthetic field
   final aiw a;

   aiv(aiw var1) {
      this.a = var1;
   }

   public String a() {
      return air.if(this.a) + " (" + this.a.getClass().getCanonicalName() + ")";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
