public class jr extends i5 {
   private String mO;
   private String mN;

   public jr(String var1, String var2) {
      this.mO = var1;
      this.mN = var2;
   }

   public void dA() {
      super.dA();
      this.hT.add(new j6(0, this.hV / 2 - 100, 140, aqz.if("gui.cancel")));
   }

   public void if(int var1, int var2, float var3) {
      this.a(0, 0, this.hV, this.hU, -12574688, -11530224);
      this.a(this.hR, this.mO, this.hV / 2, 90, 16777215);
      this.a(this.hR, this.mN, this.hV / 2, 110, 16777215);
      super.if(var1, var2, var3);
   }

   protected void if(char var1, int var2) {
   }

   protected void a(j6 var1) {
      this.hW.a((i5)null);
   }
}
