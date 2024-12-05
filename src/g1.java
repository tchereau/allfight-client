import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class g1 extends i5 {
   private i5 i6;
   private gm i5;
   private ju ja;
   private final int i8 = 1;
   private final int i9 = 2;
   private j6 i7;

   public g1(i5 var1, gm var2) {
      this.i6 = var1;
      this.i5 = var2;
   }

   public void dG() {
      this.ja.de();
   }

   public void dA() {
      aqy var1 = aqy.if();
      Keyboard.enableRepeatEvents(true);
      this.hT.clear();
      this.hT.add(this.i7 = new j6(1, this.hV / 2 - 100, this.hU / 4 + 96 + 12, var1.a("mco.configure.world.buttons.reset")));
      this.hT.add(new j6(2, this.hV / 2 - 100, this.hU / 4 + 120 + 12, var1.a("gui.cancel")));
      this.ja = new ju(this.hR, this.hV / 2 - 100, 109, 200, 20);
      this.ja.h(true);
      this.ja.M(32);
      this.ja.case("");
   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void if(char var1, int var2) {
      this.ja.a(var1, var2);
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 2) {
            this.hW.a(this.i6);
         } else if (var1.hv == 1) {
            g0 var2 = new g0(this, this.i5.g);
            hi var3 = new hi(this.hW, this.i6, var2);
            var3.dO();
            this.hW.a((i5)var3);
         }

      }
   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
      this.ja.case(var1, var2, var3);
   }

   public void if(int var1, int var2, float var3) {
      aqy var4 = aqy.if();
      this.dx();
      this.a(this.hR, var4.a("mco.reset.world.title"), this.hV / 2, 17, 16777215);
      this.a(this.hR, var4.a("mco.reset.world.warning"), this.hV / 2, 66, 16711680);
      this.if(this.hR, var4.a("mco.reset.world.seed"), this.hV / 2 - 100, 96, 10526880);
      this.ja.db();
      super.if(var1, var2, var3);
   }

   // $FF: synthetic method
   static i5 if(g1 var0) {
      return var0.i6;
   }

   // $FF: synthetic method
   static Minecraft a(g1 var0) {
      return var0.hW;
   }
}
