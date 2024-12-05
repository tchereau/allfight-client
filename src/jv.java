import org.lwjgl.input.Keyboard;

public class jv extends i5 {
   private final i5 mU;
   private final eq mT;
   private ju mV;

   public jv(i5 var1, eq var2) {
      this.mU = var1;
      this.mT = var2;
   }

   public void dG() {
      this.mV.de();
   }

   public void dA() {
      aqy var1 = aqy.if();
      Keyboard.enableRepeatEvents(true);
      this.hT.clear();
      this.hT.add(new j6(0, this.hV / 2 - 100, this.hU / 4 + 96 + 12, var1.a("selectServer.select")));
      this.hT.add(new j6(1, this.hV / 2 - 100, this.hU / 4 + 120 + 12, var1.a("gui.cancel")));
      this.mV = new ju(this.hR, this.hV / 2 - 100, 116, 200, 20);
      this.mV.M(128);
      this.mV.h(true);
      this.mV.case(this.hW.u1.bl);
      ((j6)this.hT.get(0)).hu = this.mV.dc().length() > 0 && this.mV.dc().split(":").length > 0;
   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
      this.hW.u1.bl = this.mV.dc();
      this.hW.u1.new();
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 1) {
            this.mU.do(false, 0);
         } else if (var1.hv == 0) {
            this.mT.char = this.mV.dc();
            this.mU.do(true, 0);
         }

      }
   }

   protected void if(char var1, int var2) {
      if (this.mV.a(var1, var2)) {
         ((j6)this.hT.get(0)).hu = this.mV.dc().length() > 0 && this.mV.dc().split(":").length > 0;
      } else if (var2 == 28) {
         this.a((j6)this.hT.get(0));
      }

   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
      this.mV.case(var1, var2, var3);
   }

   public void if(int var1, int var2, float var3) {
      aqy var4 = aqy.if();
      this.dx();
      this.a(this.hR, var4.a("selectServer.direct"), this.hV / 2, this.hU / 4 - 60 + 20, 16777215);
      this.if(this.hR, var4.a("addServer.enterIp"), this.hV / 2 - 100, 100, 10526880);
      this.mV.db();
      super.if(var1, var2, var3);
   }
}
