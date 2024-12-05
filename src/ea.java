public class ea extends d7 {
   private int bV = 0;
   private int bW = 0;

   public ea(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.bW = 8;
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
   }

   public void aC() {
      for(int var1 = 0; var1 < 6; ++var1) {
         double var2 = this.al + (this.bm.nextDouble() - this.bm.nextDouble()) * 4.0D;
         double var4 = this.ak + (this.bm.nextDouble() - this.bm.nextDouble()) * 4.0D;
         double var6 = this.aj + (this.bm.nextDouble() - this.bm.nextDouble()) * 4.0D;
         this.ap.a("largeexplode", var2, var4, var6, (double)((float)this.bV / (float)this.bW), 0.0D, 0.0D);
      }

      ++this.bV;
      if (this.bV == this.bW) {
         this.az();
      }

   }

   public int aS() {
      return 1;
   }
}
