class ih extends ig {
   private final int hI;
   private final int hH;
   // $FF: synthetic field
   final ik hJ;

   public ih(ik var1, int var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, "/gui/inventory.png", 0 + ai0.A[var5].try() % 8 * 18, 198 + ai0.A[var5].try() / 8 * 18);
      this.hJ = var1;
      this.hI = var5;
      this.hH = var6;
   }

   public void else(int var1, int var2) {
      String var3 = aqz.if(ai0.A[this.hI].byte());
      if (this.hH >= 3 && this.hI != ai0.p.try) {
         var3 = var3 + " II";
      }

      this.hJ.do(var3, var1, var2);
   }
}
