import java.util.concurrent.Callable;

public class aml implements Callable {
   // $FF: synthetic field
   final net.minecraft.a.a a;

   public aml(net.minecraft.a.a var1) {
      this.a = var1;
   }

   public String a() {
      return this.a.t5.else ? this.a.t5.a() : "N/A (disabled)";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
