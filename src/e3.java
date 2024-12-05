public class e3 extends j2 {
   private String nK;
   private String nJ;
   private String nI;
   private boolean nH = true;

   public e3(i5 var1, String var2, int var3) {
      super(var1, aqy.if().a("chat.link.confirm"), var2, var3);
      aqy var4 = aqy.if();
      this.nB = var4.a("gui.yes");
      this.nF = var4.a("gui.no");
      this.nJ = var4.a("chat.copy");
      this.nK = var4.a("chat.link.warning");
      this.nI = var2;
   }

   public void dA() {
      this.hT.add(new j6(0, this.hV / 3 - 83 + 0, this.hU / 6 + 96, 100, 20, this.nB));
      this.hT.add(new j6(2, this.hV / 3 - 83 + 105, this.hU / 6 + 96, 100, 20, this.nJ));
      this.hT.add(new j6(1, this.hV / 3 - 83 + 210, this.hU / 6 + 96, 100, 20, this.nF));
   }

   protected void a(j6 var1) {
      if (var1.hv == 2) {
         this.ep();
      }

      this.nC.do(var1.hv == 0, this.nD);
   }

   public void ep() {
      void(this.nI);
   }

   public void if(int var1, int var2, float var3) {
      super.if(var1, var2, var3);
      if (this.nH) {
         this.a(this.hR, this.nK, this.hV / 2, 110, 16764108);
      }

   }

   public void eo() {
      this.nH = false;
   }
}
