public class j2 extends i5 {
   protected i5 nC;
   private String nG;
   private String nE;
   protected String nB;
   protected String nF;
   protected int nD;

   public j2(i5 var1, String var2, String var3, int var4) {
      this.nC = var1;
      this.nG = var2;
      this.nE = var3;
      this.nD = var4;
      aqy var5 = aqy.if();
      this.nB = var5.a("gui.yes");
      this.nF = var5.a("gui.no");
   }

   public j2(i5 var1, String var2, String var3, String var4, String var5, int var6) {
      this.nC = var1;
      this.nG = var2;
      this.nE = var3;
      this.nB = var4;
      this.nF = var5;
      this.nD = var6;
   }

   public void dA() {
      this.hT.add(new iy(0, this.hV / 2 - 155, this.hU / 6 + 96, this.nB));
      this.hT.add(new iy(1, this.hV / 2 - 155 + 160, this.hU / 6 + 96, this.nF));
   }

   protected void a(j6 var1) {
      this.nC.do(var1.hv == 0, this.nD);
   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.a(this.hR, this.nG, this.hV / 2, 70, 16777215);
      this.a(this.hR, this.nE, this.hV / 2, 90, 16777215);
      super.if(var1, var2, var3);
   }
}
