import java.util.concurrent.Callable;

final class apo implements Callable {
   // $FF: synthetic field
   final int if;
   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final int do;

   apo(int var1, int var2, int var3) {
      this.if = var1;
      this.a = var2;
      this.do = var3;
   }

   public String a() {
      return apu.a(this.if, this.a, this.do);
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
