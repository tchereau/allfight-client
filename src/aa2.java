public class aa2 extends ac0 {
   public aa2(int var1, pa var2) {
      super(var1, var2);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (var1.if == 0) {
         return false;
      } else if (!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         int var11 = var3.new(var4, var5, var6);
         if (var11 == pa.ca.void) {
            pa var12 = pa.x[this.n()];
            int var13 = var3.for(var4, var5, var6);
            int var14 = var13 & 7;
            if (var14 <= 6 && var3.int(var12.int(var3, var4, var5, var6)) && var3.do(var4, var5, var6, var14 + 1 | var13 & -8, 2)) {
               var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var12.az.do(), (var12.az.for() + 1.0F) / 2.0F, var12.az.a() * 0.8F);
               --var1.if;
               return true;
            }
         }

         return super.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      }
   }
}
