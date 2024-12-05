public class dy extends dt {
   public dy(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.bu = 0.04F;
      this.aV();
      if (var10 == 0.0D && (var8 != 0.0D || var12 != 0.0D)) {
         this.ai = var8;
         this.ah = var10 + 0.1D;
         this.ag = var12;
      }

   }
}
