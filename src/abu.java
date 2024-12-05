public class abu extends abr {
   private final Class di;

   public abu(int var1, Class var2) {
      super(var1);
      this.di = var2;
      this.a(acn.c);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (var7 == 0) {
         return false;
      } else if (var7 == 1) {
         return false;
      } else {
         int var11 = apk.int[var7];
         aii var12 = this.a(var3, var4, var5, var6, var11);
         if (!var2.a(var4, var5, var6, var7, var1)) {
            return false;
         } else {
            if (var12 != null && var12.fT()) {
               if (!var3.goto) {
                  var3.new(var12);
               }

               --var1.if;
            }

            return true;
         }
      }
   }

   private aii a(y6 var1, int var2, int var3, int var4, int var5) {
      if (this.di == ah7.class) {
         return new ah7(var1, var2, var3, var4, var5);
      } else {
         return this.di == aih.class ? new aih(var1, var2, var3, var4, var5) : null;
      }
   }
}
