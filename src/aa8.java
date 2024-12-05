public class aa8 extends abr {
   private int c4;
   private int c3;

   public aa8(int var1, int var2, int var3) {
      super(var1);
      this.c4 = var2;
      this.c3 = var3;
      this.a(acn.try);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (var7 != 1) {
         return false;
      } else if (var2.a(var4, var5, var6, var7, var1) && var2.a(var4, var5 + 1, var6, var7, var1)) {
         int var11 = var3.new(var4, var5, var6);
         if (var11 == this.c3 && var3.a(var4, var5 + 1, var6)) {
            var3.int(var4, var5 + 1, var6, this.c4);
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
