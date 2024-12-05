public class abx extends abr {
   public abx(int var1) {
      super(var1);
      this.y = 1;
      this.for(64);
      this.a(acn.char);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (var7 == 0) {
         --var5;
      }

      if (var7 == 1) {
         ++var5;
      }

      if (var7 == 2) {
         --var6;
      }

      if (var7 == 3) {
         ++var6;
      }

      if (var7 == 4) {
         --var4;
      }

      if (var7 == 5) {
         ++var4;
      }

      if (!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         int var11 = var3.new(var4, var5, var6);
         if (var11 == 0) {
            var3.a((double)var4 + 0.5D, (double)var5 + 0.5D, (double)var6 + 0.5D, "fire.ignite", 1.0F, aj.nextFloat() * 0.4F + 0.8F);
            var3.int(var4, var5, var6, pa.bo.void);
         }

         var1.a(1, (aig)var2);
         return true;
      }
   }
}
