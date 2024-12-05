import java.net.URI;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class jw extends i5 {
   public void dA() {
      this.hT.clear();
      byte var1 = -16;
      this.hT.add(new j6(1, this.hV / 2 - 116, this.hU / 2 + 62 + var1, 114, 20, aqz.if("demo.help.buy")));
      this.hT.add(new j6(2, this.hV / 2 + 2, this.hU / 2 + 62 + var1, 114, 20, aqz.if("demo.help.later")));
   }

   protected void a(j6 var1) {
      switch(var1.hv) {
      case 1:
         var1.hu = false;

         try {
            Class var2 = Class.forName("java.awt.Desktop");
            Object var3 = var2.getMethod("getDesktop").invoke((Object)null);
            var2.getMethod("browse", URI.class).invoke(var3, new URI("http://www.minecraft.net/store?source=demo"));
         } catch (Throwable var4) {
            var4.printStackTrace();
         }
         break;
      case 2:
         this.hW.a((i5)null);
         this.hW.ik();
      }

   }

   public void dG() {
      super.dG();
   }

   public void dx() {
      super.dx();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/gui/demo_bg.png");
      int var1 = (this.hV - 248) / 2;
      int var2 = (this.hU - 166) / 2;
      this.if(var1, var2, 0, 0, 248, 166);
   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      int var4 = (this.hV - 248) / 2 + 10;
      int var5 = (this.hU - 166) / 2 + 8;
      this.hR.if(aqz.if("demo.help.title"), var4, var5, 2039583);
      var5 += 12;
      ke var7 = this.hW.u1;
      String var6 = aqz.if("demo.help.movementShort");
      var6 = String.format(var6, Keyboard.getKeyName(var7.aL.int), Keyboard.getKeyName(var7.aK.int), Keyboard.getKeyName(var7.aJ.int), Keyboard.getKeyName(var7.aH.int));
      this.hR.if(var6, var4, var5, 5197647);
      var6 = aqz.if("demo.help.movementMouse");
      this.hR.if(var6, var4, var5 + 12, 5197647);
      var6 = aqz.if("demo.help.jump");
      var6 = String.format(var6, Keyboard.getKeyName(var7.aG.int));
      this.hR.if(var6, var4, var5 + 24, 5197647);
      var6 = aqz.if("demo.help.inventory");
      var6 = String.format(var6, Keyboard.getKeyName(var7.aF.int));
      this.hR.if(var6, var4, var5 + 36, 5197647);
      this.hR.a(aqz.if("demo.help.fullWrapped"), var4, var5 + 68, 218, 2039583);
      super.if(var1, var2, var3);
   }
}
