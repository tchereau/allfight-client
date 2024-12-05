public class fz extends fx {
   e7[] aF = new e7[8];
   e7 aE;

   public fz() {
      for(int var1 = 0; var1 < this.aF.length; ++var1) {
         byte var2 = 0;
         int var3 = var1;
         if (var1 == 2) {
            var2 = 24;
            var3 = 10;
         } else if (var1 == 3) {
            var2 = 24;
            var3 = 19;
         }

         this.aF[var1] = new e7(this, var2, var3);
         this.aF[var1].a(-4.0F, (float)(16 + var1), -4.0F, 8, 1, 8);
      }

      this.aE = new e7(this, 0, 16);
      this.aE.a(-2.0F, 18.0F, -2.0F, 4, 4, 4);
   }

   public int for() {
      return 5;
   }

   public void a(aig var1, float var2, float var3, float var4) {
      ae1 var5 = (ae1)var1;
      float var6 = var5.p4 + (var5.p5 - var5.p4) * var4;
      if (var6 < 0.0F) {
         var6 = 0.0F;
      }

      for(int var7 = 0; var7 < this.aF.length; ++var7) {
         this.aF[var7].f = (float)(-(4 - var7)) * var6 * 1.7F;
      }

   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      this.aE.for(var7);

      for(int var8 = 0; var8 < this.aF.length; ++var8) {
         this.aF[var8].for(var7);
      }

   }
}
