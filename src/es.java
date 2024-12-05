public class es extends i5 {
   private e5 iK;
   private int iJ = 0;

   public es(e5 var1) {
      this.iK = var1;
   }

   protected void if(char var1, int var2) {
   }

   public void dA() {
      this.hT.clear();
   }

   public void dG() {
      ++this.iJ;
      if (this.iJ % 20 == 0) {
         this.iK.for((an7)(new aon()));
      }

      if (this.iK != null) {
         this.iK.char();
      }

   }

   public void if(int var1, int var2, float var3) {
      this.U(0);
      aqy var4 = aqy.if();
      this.a(this.hR, var4.a("multiplayer.downloadingTerrain"), this.hV / 2, this.hU / 2 - 50, 16777215);
      super.if(var1, var2, var3);
   }
}
