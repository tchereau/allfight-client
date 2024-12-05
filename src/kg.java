import java.awt.Component;
import org.lwjgl.input.Mouse;

public class kg {
   private final Component for;
   private final ke do;
   public int if;
   public int a;

   public kg(Component var1, ke var2) {
      this.for = var1;
      this.do = var2;
   }

   public void do() {
      Mouse.setGrabbed(true);
      this.if = 0;
      this.a = 0;
   }

   public void if() {
      int var1 = this.for.getWidth();
      int var2 = this.for.getHeight();
      if (this.for.getParent() != null) {
         var1 = this.for.getParent().getWidth();
         var2 = this.for.getParent().getHeight();
      }

      Mouse.setCursorPosition(var1 / 2, var2 / 2);
      Mouse.setGrabbed(false);
   }

   public void a() {
      this.if = Mouse.getDX();
      this.a = Mouse.getDY();
   }
}
