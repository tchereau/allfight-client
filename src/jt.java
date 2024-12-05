import org.lwjgl.input.Keyboard;

public class jt extends i5 {
   private i5 mQ;
   private ju mP;
   private ju mS;
   private eq mR;

   public jt(i5 var1, eq var2) {
      this.mQ = var1;
      this.mR = var2;
   }

   public void dG() {
      this.mS.de();
      this.mP.de();
   }

   public void dA() {
      aqy var1 = aqy.if();
      Keyboard.enableRepeatEvents(true);
      this.hT.clear();
      this.hT.add(new j6(0, this.hV / 2 - 100, this.hU / 4 + 96 + 12, var1.a("addServer.add")));
      this.hT.add(new j6(1, this.hV / 2 - 100, this.hU / 4 + 120 + 12, var1.a("gui.cancel")));
      this.hT.add(new j6(2, this.hV / 2 - 100, 142, var1.a("addServer.hideAddress") + ": " + (this.mR.a() ? var1.a("gui.yes") : var1.a("gui.no"))));
      this.mS = new ju(this.hR, this.hV / 2 - 100, 66, 200, 20);
      this.mS.h(true);
      this.mS.case(this.mR.else);
      this.mP = new ju(this.hR, this.hV / 2 - 100, 106, 200, 20);
      this.mP.M(128);
      this.mP.case(this.mR.char);
      ((j6)this.hT.get(0)).hu = this.mP.dc().length() > 0 && this.mP.dc().split(":").length > 0 && this.mS.dc().length() > 0;
   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 1) {
            this.mQ.do(false, 0);
         } else if (var1.hv == 0) {
            this.mR.else = this.mS.dc();
            this.mR.char = this.mP.dc();
            this.mQ.do(true, 0);
         } else if (var1.hv == 2) {
            aqy var2 = aqy.if();
            this.mR.a(!this.mR.a());
            ((j6)this.hT.get(2)).hw = var2.a("addServer.hideAddress") + ": " + (this.mR.a() ? var2.a("gui.yes") : var2.a("gui.no"));
         }

      }
   }

   protected void if(char var1, int var2) {
      this.mS.a(var1, var2);
      this.mP.a(var1, var2);
      if (var1 == '\t') {
         if (this.mS.c9()) {
            this.mS.h(false);
            this.mP.h(true);
         } else {
            this.mS.h(true);
            this.mP.h(false);
         }
      }

      if (var1 == '\r') {
         this.a((j6)this.hT.get(0));
      }

      ((j6)this.hT.get(0)).hu = this.mP.dc().length() > 0 && this.mP.dc().split(":").length > 0 && this.mS.dc().length() > 0;
   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
      this.mP.case(var1, var2, var3);
      this.mS.case(var1, var2, var3);
   }

   public void if(int var1, int var2, float var3) {
      aqy var4 = aqy.if();
      this.dx();
      this.a(this.hR, var4.a("addServer.title"), this.hV / 2, 17, 16777215);
      this.if(this.hR, var4.a("addServer.enterName"), this.hV / 2 - 100, 53, 10526880);
      this.if(this.hR, var4.a("addServer.enterIp"), this.hV / 2 - 100, 94, 10526880);
      this.mS.db();
      this.mP.db();
      super.if(var1, var2, var3);
   }
}
