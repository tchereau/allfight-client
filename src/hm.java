import java.io.IOException;
import org.lwjgl.input.Keyboard;

public class hm extends i5 {
   private ju jR;
   private gm jQ;
   private final i5 jP;
   private final ht jO;
   private final int jN = 0;
   private final int jM = 1;
   private String jL = "Could not invite the provided name";
   private String jK;
   private boolean jJ = false;

   public hm(i5 var1, ht var2, gm var3) {
      this.jP = var1;
      this.jO = var2;
      this.jQ = var3;
   }

   public void dG() {
      this.jR.de();
   }

   public void dA() {
      aqy var1 = aqy.if();
      Keyboard.enableRepeatEvents(true);
      this.hT.clear();
      this.hT.add(new j6(0, this.hV / 2 - 100, this.hU / 4 + 96 + 12, var1.a("mco.configure.world.buttons.invite")));
      this.hT.add(new j6(1, this.hV / 2 - 100, this.hU / 4 + 120 + 12, var1.a("gui.cancel")));
      this.jR = new ju(this.hR, this.hV / 2 - 100, 66, 200, 20);
      this.jR.h(true);
   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 1) {
            this.hW.a((i5)this.jO);
         } else if (var1.hv == 0) {
            gv var2 = new gv(this.hW.vg);

            try {
               gm var3 = var2.if(this.jQ.g, this.jR.dc());
               if (var3 != null) {
                  this.jQ.b = var3.b;
                  this.hW.a((i5)(new ht(this.jP, this.jQ)));
               } else {
                  this.g(this.jL);
               }
            } catch (gj var4) {
               this.g(var4.a);
            } catch (IOException var5) {
               this.g(this.jL);
            }
         }

      }
   }

   private void g(String var1) {
      this.jJ = true;
      this.jK = var1;
   }

   protected void if(char var1, int var2) {
      this.jR.a(var1, var2);
      if (var1 == '\t') {
         if (this.jR.c9()) {
            this.jR.h(false);
         } else {
            this.jR.h(true);
         }
      }

      if (var1 == '\r') {
         this.a((j6)this.hT.get(0));
      }

   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
      this.jR.case(var1, var2, var3);
   }

   public void if(int var1, int var2, float var3) {
      aqy var4 = aqy.if();
      this.dx();
      this.a(this.hR, var4.a(""), this.hV / 2, 17, 16777215);
      this.if(this.hR, var4.a("mco.configure.world.invite.profile.name"), this.hV / 2 - 100, 53, 10526880);
      if (this.jJ) {
         this.a(this.hR, this.jK, this.hV / 2, 100, 16711680);
      }

      this.jR.db();
      super.if(var1, var2, var3);
   }
}
