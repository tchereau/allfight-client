import java.util.concurrent.Callable;
import org.lwjgl.input.Mouse;

class df implements Callable {
   // $FF: synthetic field
   final int if;
   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final dh do;

   df(dh var1, int var2, int var3) {
      this.do = var1;
      this.if = var2;
      this.a = var3;
   }

   public String a() {
      return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", this.if, this.a, Mouse.getX(), Mouse.getY());
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
