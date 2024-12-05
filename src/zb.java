public class zb extends ab9 {
   private ts dC;

   public zb(int var1, ts var2) {
      super(var1, var2);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (var7 != 1) {
         return false;
      } else {
         ++var5;
         pa var11 = mod_rajouts.T;
         if (var2.a(var4, var5, var6, var7, var1) && var2.a(var4, var5 + 1, var6, var7, var1)) {
            if (!var11.case(var3, var4, var5, var6)) {
               return false;
            } else {
               int var12 = ajs.a((double)((var2.a5 + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
               a(var3, var4, var5, var6, var12, var11);
               --var1.if;
               return true;
            }
         } else {
            return false;
         }
      }
   }
}
