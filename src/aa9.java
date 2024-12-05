public class aa9 extends abw {
   private int dt;
   private int du;

   public aa9(int var1, int var2, float var3, int var4, int var5) {
      super(var1, var2, var3, false);
      this.dt = var4;
      this.du = var5;
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (var7 != 1) {
         return false;
      } else if (var2.a(var4, var5, var6, var7, var1) && var2.a(var4, var5 + 1, var6, var7, var1)) {
         int var11 = var3.new(var4, var5, var6);
         if (var11 == this.du && var3.a(var4, var5 + 1, var6)) {
            var3.int(var4, var5 + 1, var6, this.dt);
            --var1.if;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
