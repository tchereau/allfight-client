import java.util.concurrent.Callable;

public class amj implements Callable {
   // $FF: synthetic field
   final net.minecraft.a.a a;

   public amj(net.minecraft.a.a var1) {
      this.a = var1;
   }

   public String a() {
      return net.minecraft.a.a.a(this.a).if() + " / " + net.minecraft.a.a.a(this.a).else() + "; " + net.minecraft.a.a.a(this.a).void;
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
