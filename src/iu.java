import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class iu extends jo {
   private Minecraft gS;
   private int gR;
   private int gQ;
   private String gP;
   private String gO;
   private akl gN;
   private long gM;
   private cb gL;
   private boolean gK;

   public iu(Minecraft var1) {
      this.gS = var1;
      this.gL = new cb();
   }

   public void if(akl var1) {
      this.gP = aqz.if("achievement.get");
      this.gO = aqz.if(var1.a());
      this.gM = Minecraft.h1();
      this.gN = var1;
      this.gK = false;
   }

   public void a(akl var1) {
      this.gP = aqz.if(var1.a());
      this.gO = var1.char();
      this.gM = Minecraft.h1() - 2500L;
      this.gN = var1;
      this.gK = true;
   }

   private void c0() {
      GL11.glViewport(0, 0, this.gS.vo, this.gS.vn);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      this.gR = this.gS.vo;
      this.gQ = this.gS.vn;
      i4 var1 = new i4(this.gS.u1, this.gS.vo, this.gS.vn);
      this.gR = var1.int();
      this.gQ = var1.if();
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)this.gR, (double)this.gQ, 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
   }

   public void c1() {
      if (this.gN != null && this.gM != 0L) {
         double var1 = (double)(Minecraft.h1() - this.gM) / 3000.0D;
         if (this.gK || !(var1 < 0.0D) && !(var1 > 1.0D)) {
            this.c0();
            GL11.glDisable(2929);
            GL11.glDepthMask(false);
            double var3 = var1 * 2.0D;
            if (var3 > 1.0D) {
               var3 = 2.0D - var3;
            }

            var3 *= 4.0D;
            var3 = 1.0D - var3;
            if (var3 < 0.0D) {
               var3 = 0.0D;
            }

            var3 *= var3;
            var3 *= var3;
            int var5 = this.gR - 160;
            int var6 = 0 - (int)(var3 * 36.0D);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(3553);
            this.gS.vb.for("/achievement/bg.png");
            GL11.glDisable(2896);
            this.if(var5, var6, 96, 202, 160, 32);
            if (this.gK) {
               this.gS.va.a(this.gO, var5 + 30, var6 + 7, 120, -1);
            } else {
               this.gS.va.if(this.gP, var5 + 30, var6 + 7, -256);
               this.gS.va.if(this.gO, var5 + 30, var6 + 18, -1);
            }

            k1.a();
            GL11.glDisable(2896);
            GL11.glEnable(32826);
            GL11.glEnable(2903);
            GL11.glEnable(2896);
            this.gL.a(this.gS.va, this.gS.vb, this.gN.d, var5 + 8, var6 + 8);
            GL11.glDisable(2896);
            GL11.glDepthMask(true);
            GL11.glEnable(2929);
         } else {
            this.gM = 0L;
         }
      }
   }
}
