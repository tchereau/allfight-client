import java.util.concurrent.Callable;

class sl implements Callable {
   // $FF: synthetic field
   final ss a;

   sl(ss var1) {
      this.a = var1;
   }

   public String a() {
      String var1 = "Unknown?";

      try {
         switch(ss.d(this.a)) {
         case 19132:
            var1 = "McRegion";
            break;
         case 19133:
            var1 = "Anvil";
         }
      } catch (Throwable var3) {
      }

      return String.format("0x%05X - %s", ss.d(this.a), var1);
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
