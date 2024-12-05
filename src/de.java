import java.util.concurrent.Callable;

class de implements Callable {
   // $FF: synthetic field
   final i4 if;
   // $FF: synthetic field
   final dh a;

   de(dh var1, i4 var2) {
      this.a = var1;
      this.if = var2;
   }

   public String a() {
      return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", this.if.int(), this.if.if(), dh.a(this.a).vo, dh.a(this.a).vn, this.if.do());
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
