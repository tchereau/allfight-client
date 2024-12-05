public class em extends d7 {
   private aiw cp;
   private int cs;
   private int cr;
   private String cq;

   public em(y6 var1, aiw var2) {
      this(var1, var2, "crit");
   }

   public em(y6 var1, aiw var2, String var3) {
      super(var1, var2.al, var2.aZ.a + (double)(var2.aO / 2.0F), var2.aj, var2.ai, var2.ah, var2.ag);
      this.cs = 0;
      this.cr = 0;
      this.cp = var2;
      this.cr = 3;
      this.cq = var3;
      this.aC();
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
   }

   public void aC() {
      for(int var1 = 0; var1 < 16; ++var1) {
         double var2 = (double)(this.bm.nextFloat() * 2.0F - 1.0F);
         double var4 = (double)(this.bm.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(this.bm.nextFloat() * 2.0F - 1.0F);
         if (!(var2 * var2 + var4 * var4 + var6 * var6 > 1.0D)) {
            double var8 = this.cp.al + var2 * (double)this.cp.aP / 4.0D;
            double var10 = this.cp.aZ.a + (double)(this.cp.aO / 2.0F) + var4 * (double)this.cp.aO / 4.0D;
            double var12 = this.cp.aj + var6 * (double)this.cp.aP / 4.0D;
            this.ap.a(this.cq, var8, var10, var12, var2, var4 + 0.2D, var6);
         }
      }

      ++this.cs;
      if (this.cs >= this.cr) {
         this.az();
      }

   }

   public int aS() {
      return 3;
   }
}
