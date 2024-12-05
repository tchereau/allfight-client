import java.util.concurrent.Callable;

class c8 implements Callable {
   // $FF: synthetic field
   final double if;
   // $FF: synthetic field
   final double a;
   // $FF: synthetic field
   final double for;
   // $FF: synthetic field
   final c9 do;

   c8(c9 var1, double var2, double var4, double var6) {
      this.do = var1;
      this.if = var2;
      this.a = var4;
      this.for = var6;
   }

   public String a() {
      return apu.a(this.if, this.a, this.for);
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
