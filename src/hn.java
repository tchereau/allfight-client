import org.lwjgl.input.Keyboard;

public class hn extends i5 {
   private i5 jT;
   private i5 jS;
   private ju jX;
   private ju jV;
   private gm jW;
   private j6 jU;

   public hn(i5 var1, i5 var2, gm var3) {
      this.jT = var1;
      this.jS = var2;
      this.jW = var3;
   }

   public void dG() {
      this.jV.de();
      this.jX.de();
   }

   public void dA() {
      aqy var1 = aqy.if();
      Keyboard.enableRepeatEvents(true);
      this.hT.clear();
      this.hT.add(this.jU = new j6(0, this.hV / 2 - 100, this.hU / 4 + 96 + 12, var1.a("mco.configure.world.buttons.done")));
      this.hT.add(new j6(1, this.hV / 2 - 100, this.hU / 4 + 120 + 12, var1.a("gui.cancel")));
      this.jV = new ju(this.hR, this.hV / 2 - 100, 66, 200, 20);
      this.jV.h(true);
      this.jV.M(32);
      this.jV.case(this.jW.a());
      this.jX = new ju(this.hR, this.hV / 2 - 100, 106, 200, 20);
      this.jX.M(32);
      this.jX.case(this.jW.if());
   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 1) {
            this.hW.a(this.jT);
         } else if (var1.hv == 0) {
            this.dQ();
         }

      }
   }

   private void dQ() {
      gv var1 = new gv(this.hW.vg);

      try {
         String var2 = this.jX.dc() != null && !this.jX.dc().trim().equals("") ? this.jX.dc() : "";
         var1.a(this.jW.g, this.jV.dc(), var2);
         this.jW.for(this.jV.dc());
         this.jW.int(this.jX.dc());
         this.hW.a((i5)(new ht(this.jS, this.jW)));
      } catch (Exception var3) {
      }

   }

   protected void if(char var1, int var2) {
      this.jV.a(var1, var2);
      this.jX.a(var1, var2);
      if (var1 == '\t') {
         if (this.jV.c9()) {
            this.jV.h(false);
            this.jX.h(true);
         } else {
            this.jV.h(true);
            this.jX.h(false);
         }
      }

      if (var1 == '\r') {
         this.dQ();
      }

      this.jU.hu = this.jV.dc() != null && !this.jV.dc().trim().equals("");
   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
      this.jX.case(var1, var2, var3);
      this.jV.case(var1, var2, var3);
   }

   public void if(int var1, int var2, float var3) {
      aqy var4 = aqy.if();
      this.dx();
      this.a(this.hR, var4.a("mco.configure.world.edit.title"), this.hV / 2, 17, 16777215);
      this.if(this.hR, var4.a("mco.configure.world.name"), this.hV / 2 - 100, 53, 10526880);
      this.if(this.hR, var4.a("mco.configure.world.description"), this.hV / 2 - 100, 94, 10526880);
      this.jV.db();
      this.jX.db();
      super.if(var1, var2, var3);
   }
}
