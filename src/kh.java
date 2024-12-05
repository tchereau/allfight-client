import java.awt.BorderLayout;
import java.awt.Canvas;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftApplet;

public class kh extends Minecraft {
   // $FF: synthetic field
   final MinecraftApplet vr;

   public kh(MinecraftApplet var1, Canvas var2, MinecraftApplet var3, int var4, int var5, boolean var6) {
      super(var2, var3, var4, var5, var6);
      this.vr = var1;
   }

   public void do(aqh var1) {
      this.vr.removeAll();
      this.vr.setLayout(new BorderLayout());
      this.vr.add(new k6(var1), "Center");
      this.vr.validate();
   }

   public void iq() {
      this.uR = hQ();
      this.u1 = new ke(this, this.uR);
      if (this.u1.aT > 0 && this.u1.aU > 0 && this.vr.getParent() != null && this.vr.getParent().getParent() != null) {
         this.vr.getParent().getParent().setSize(this.u1.aU, this.u1.aT);
      }

      super.iq();
   }
}
