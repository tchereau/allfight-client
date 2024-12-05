import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class i5 extends jo {
   public static final boolean hX;
   protected Minecraft hW;
   public int hV;
   public int hU;
   protected List hT = new ArrayList();
   public boolean hS = false;
   protected jq hR;
   public gx hQ;
   private j6 h1 = null;
   private int h0 = 0;
   private long hZ = 0L;
   private int hY = 0;

   public void if(int var1, int var2, float var3) {
      for(int var4 = 0; var4 < this.hT.size(); ++var4) {
         j6 var5 = (j6)this.hT.get(var4);
         var5.if(this.hW, var1, var2);
      }

   }

   protected void if(char var1, int var2) {
      if (var2 == 1) {
         this.hW.a((i5)null);
         this.hW.ik();
      }

   }

   public static String dD() {
      try {
         Transferable var0 = Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object)null);
         if (var0 != null && var0.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return (String)var0.getTransferData(DataFlavor.stringFlavor);
         }
      } catch (Exception var1) {
      }

      return "";
   }

   public static void void(String var0) {
      try {
         StringSelection var1 = new StringSelection(var0);
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(var1, (ClipboardOwner)null);
      } catch (Exception var2) {
      }

   }

   protected void char(int var1, int var2, int var3) {
      if (var3 == 0) {
         for(int var4 = 0; var4 < this.hT.size(); ++var4) {
            j6 var5 = (j6)this.hT.get(var4);
            if (var5.do(this.hW, var1, var2)) {
               this.h1 = var5;
               this.hW.uX.a("random.click", 1.0F, 1.0F);
               this.a(var5);
            }
         }
      }

   }

   protected void else(int var1, int var2, int var3) {
      if (this.h1 != null && var3 == 0) {
         this.h1.goto(var1, var2);
         this.h1 = null;
      }

   }

   protected void a(int var1, int var2, int var3, long var4) {
   }

   protected void a(j6 var1) {
   }

   public void for(Minecraft var1, int var2, int var3) {
      this.hQ = new gx(var1);
      this.hW = var1;
      this.hR = var1.va;
      this.hV = var2;
      this.hU = var3;
      this.hT.clear();
      this.dA();
   }

   public void dA() {
   }

   public void dz() {
      while(Mouse.next()) {
         this.dw();
      }

      while(Keyboard.next()) {
         this.dB();
      }

   }

   public void dw() {
      int var1 = Mouse.getEventX() * this.hV / this.hW.vo;
      int var2 = this.hU - Mouse.getEventY() * this.hU / this.hW.vn - 1;
      if (Mouse.getEventButtonState()) {
         if (this.hW.u1.aV && this.hY++ > 0) {
            return;
         }

         this.h0 = Mouse.getEventButton();
         this.hZ = Minecraft.h1();
         this.char(var1, var2, this.h0);
      } else if (Mouse.getEventButton() != -1) {
         if (this.hW.u1.aV && --this.hY > 0) {
            return;
         }

         this.h0 = -1;
         this.else(var1, var2, Mouse.getEventButton());
      } else if (this.h0 != -1 && this.hZ > 0L) {
         long var3 = Minecraft.h1() - this.hZ;
         this.a(var1, var2, this.h0, var3);
      }

   }

   public void dB() {
      if (Keyboard.getEventKeyState()) {
         int var1 = Keyboard.getEventKey();
         char var2 = Keyboard.getEventCharacter();
         if (var1 == 87) {
            this.hW.hN();
            return;
         }

         if (hX && var1 == 28 && var2 == 0) {
            var1 = 29;
         }

         this.if(var2, var1);
      }

   }

   public void dG() {
   }

   public void dF() {
   }

   public void dx() {
      this.V(0);
   }

   public void V(int var1) {
      if (this.hW.vm != null) {
         this.a(0, 0, this.hV, this.hU, -1072689136, -804253680);
      } else {
         this.U(var1);
      }

   }

   public void U(int var1) {
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      c4 var2 = c4.G;
      this.hW.vb.for("/gui/background.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var3 = 32.0F;
      var2.if();
      var2.a(4210752);
      var2.a(0.0D, (double)this.hU, 0.0D, 0.0D, (double)((float)this.hU / var3 + (float)var1));
      var2.a((double)this.hV, (double)this.hU, 0.0D, (double)((float)this.hV / var3), (double)((float)this.hU / var3 + (float)var1));
      var2.a((double)this.hV, 0.0D, 0.0D, (double)((float)this.hV / var3), (double)var1);
      var2.a(0.0D, 0.0D, 0.0D, 0.0D, (double)var1);
      var2.for();
   }

   public boolean dy() {
      return true;
   }

   public void do(boolean var1, int var2) {
   }

   public static boolean dC() {
      boolean var0 = Keyboard.isKeyDown(28) && Keyboard.getEventCharacter() == 0;
      return Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157) || hX && (var0 || Keyboard.isKeyDown(219) || Keyboard.isKeyDown(220));
   }

   public static boolean dE() {
      return Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54);
   }

   static {
      hX = Minecraft.io() == kj.int;
   }
}
