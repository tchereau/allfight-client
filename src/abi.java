public class abi extends aaz {
   private final pa cW;
   private final String[] cV;

   public abi(int var1, pa var2, String[] var3) {
      super(var1);
      this.cW = var2;
      this.cV = var3;
      this.for(0);
      this.a(true);
   }

   public ajd a(int var1) {
      return this.cW.if(2, var1);
   }

   public int do(int var1) {
      return var1;
   }

   public String int(abp var1) {
      int var2 = var1.new();
      if (var2 < 0 || var2 >= this.cV.length) {
         var2 = 0;
      }

      return super.int() + "." + this.cV[var2];
   }
}
