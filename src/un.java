import java.util.concurrent.Callable;

class un implements Callable {
   // $FF: synthetic field
   final int if;
   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final uo do;

   un(uo var1, int var2, int var3) {
      this.do = var1;
      this.if = var2;
      this.a = var3;
   }

   public String a() {
      return this.do.if(this.if, this.a) ? "True" : "False";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
