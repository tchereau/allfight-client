public class ab9 extends abr {
   private ts dB;

   public ab9(int var1, ts var2) {
      super(var1);
      this.dB = var2;
      this.y = 1;
      this.a(acn.b);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (var7 != 1) {
         return false;
      } else {
         ++var5;
         pa var11;
         if (this.dB == ts.w) {
            var11 = pa.co;
         } else {
            var11 = pa.ch;
         }

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

   public static void a(y6 var0, int var1, int var2, int var3, int var4, pa var5) {
      byte var6 = 0;
      byte var7 = 0;
      if (var4 == 0) {
         var7 = 1;
      }

      if (var4 == 1) {
         var6 = -1;
      }

      if (var4 == 2) {
         var7 = -1;
      }

      if (var4 == 3) {
         var6 = 1;
      }

      int var8 = (var0.try(var1 - var6, var2, var3 - var7) ? 1 : 0) + (var0.try(var1 - var6, var2 + 1, var3 - var7) ? 1 : 0);
      int var9 = (var0.try(var1 + var6, var2, var3 + var7) ? 1 : 0) + (var0.try(var1 + var6, var2 + 1, var3 + var7) ? 1 : 0);
      boolean var10 = var0.new(var1 - var6, var2, var3 - var7) == var5.void || var0.new(var1 - var6, var2 + 1, var3 - var7) == var5.void;
      boolean var11 = var0.new(var1 + var6, var2, var3 + var7) == var5.void || var0.new(var1 + var6, var2 + 1, var3 + var7) == var5.void;
      boolean var12 = false;
      if (var10 && !var11) {
         var12 = true;
      } else if (var9 > var8) {
         var12 = true;
      }

      var0.int(var1, var2, var3, var5.void, var4, 2);
      var0.int(var1, var2 + 1, var3, var5.void, 8 | (var12 ? 1 : 0), 2);
      var0.for(var1, var2, var3, var5.void);
      var0.for(var1, var2 + 1, var3, var5.void);
   }
}
