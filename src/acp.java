public class acp extends aaz {
   private final pa cY;
   private String[] cX;

   public acp(int var1, boolean var2) {
      super(var1);
      this.cY = pa.x[this.n()];
      if (var2) {
         this.for(0);
         this.a(true);
      }

   }

   public int a(abp var1, int var2) {
      return this.cY.a(var1.new());
   }

   public ajd a(int var1) {
      return this.cY.if(0, var1);
   }

   public int do(int var1) {
      return var1;
   }

   public acp a(String[] var1) {
      this.cX = var1;
      return this;
   }

   public String int(abp var1) {
      if (this.cX == null) {
         return super.int(var1);
      } else {
         int var2 = var1.new();
         return var2 >= 0 && var2 < this.cX.length ? super.int(var1) + "." + this.cX[var2] : super.int(var1);
      }
   }
}
