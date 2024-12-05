public class op extends pa {
   private ajd cD;
   private ajd cC;

   protected op(int var1) {
      super(var1, ts.w);
      this.a(acn.c);
   }

   public ajd if(int var1, int var2) {
      if (var1 == 1) {
         return this.cD;
      } else if (var1 == 0) {
         return pa.be.do(var1);
      } else {
         return var1 != 2 && var1 != 4 ? this.an : this.cC;
      }
   }

   public void a(ajc var1) {
      this.an = var1.a("workbench_side");
      this.cD = var1.a("workbench_top");
      this.cC = var1.a("workbench_front");
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (var1.goto) {
         return true;
      } else {
         var5.new(var2, var3, var4);
         return true;
      }
   }
}
