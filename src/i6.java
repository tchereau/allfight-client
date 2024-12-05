import org.lwjgl.input.Keyboard;

public class i6 extends i5 {
   private i5 lW;
   private ju lV;
   private final String lX;

   public i6(i5 var1, String var2) {
      this.lW = var1;
      this.lX = var2;
   }

   public void dG() {
      this.lV.de();
   }

   public void dA() {
      aqy var1 = aqy.if();
      Keyboard.enableRepeatEvents(true);
      this.hT.clear();
      this.hT.add(new j6(0, this.hV / 2 - 100, this.hU / 4 + 96 + 12, var1.a("selectWorld.renameButton")));
      this.hT.add(new j6(1, this.hV / 2 - 100, this.hU / 4 + 120 + 12, var1.a("gui.cancel")));
      sg var2 = this.hW.im();
      ss var3 = var2.a(this.lX);
      String var4 = var3.l();
      this.lV = new ju(this.hR, this.hV / 2 - 100, 60, 200, 20);
      this.lV.h(true);
      this.lV.case(var4);
   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 1) {
            this.hW.a(this.lW);
         } else if (var1.hv == 0) {
            sg var2 = this.hW.im();
            var2.a(this.lX, this.lV.dc().trim());
            this.hW.a(this.lW);
         }

      }
   }

   protected void if(char var1, int var2) {
      this.lV.a(var1, var2);
      ((j6)this.hT.get(0)).hu = this.lV.dc().trim().length() > 0;
      if (var1 == '\r') {
         this.a((j6)this.hT.get(0));
      }

   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
      this.lV.case(var1, var2, var3);
   }

   public void if(int var1, int var2, float var3) {
      aqy var4 = aqy.if();
      this.dx();
      this.a(this.hR, var4.a("selectWorld.renameTitle"), this.hV / 2, this.hU / 4 - 60 + 20, 16777215);
      this.if(this.hR, var4.a("selectWorld.enterName"), this.hV / 2 - 100, 47, 10526880);
      this.lV.db();
      super.if(var1, var2, var3);
   }
}
