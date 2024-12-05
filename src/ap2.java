import java.util.concurrent.Callable;

class ap2 implements Callable {
   // $FF: synthetic field
   final aqh a;

   ap2(aqh var1) {
      this.a = var1;
   }

   public String a() {
      int var1 = nw.if().a();
      int var2 = 56 * var1;
      int var3 = var2 / 1024 / 1024;
      int var4 = nw.if().for();
      int var5 = 56 * var4;
      int var6 = var5 / 1024 / 1024;
      return var1 + " (" + var2 + " bytes; " + var3 + " MB) allocated, " + var4 + " (" + var5 + " bytes; " + var6 + " MB) used";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
