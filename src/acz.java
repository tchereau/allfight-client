public class acz extends abr {
   public acz(int var1) {
      super(var1);
      this.a(acn.c);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (var3.goto) {
         return true;
      } else if (var7 != 1) {
         return false;
      } else {
         ++var5;
         r3 var11 = (r3)pa.al;
         int var12 = ajs.a((double)(var2.a5 * 4.0F / 360.0F) + 0.5D) & 3;
         byte var13 = 0;
         byte var14 = 0;
         if (var12 == 0) {
            var14 = 1;
         }

         if (var12 == 1) {
            var13 = -1;
         }

         if (var12 == 2) {
            var14 = -1;
         }

         if (var12 == 3) {
            var13 = 1;
         }

         if (var2.a(var4, var5, var6, var7, var1) && var2.a(var4 + var13, var5, var6 + var14, var7, var1)) {
            if (var3.a(var4, var5, var6) && var3.a(var4 + var13, var5, var6 + var14) && var3.case(var4, var5 - 1, var6) && var3.case(var4 + var13, var5 - 1, var6 + var14)) {
               var3.int(var4, var5, var6, var11.void, var12, 3);
               if (var3.new(var4, var5, var6) == var11.void) {
                  var3.int(var4 + var13, var5, var6 + var14, var11.void, var12 + 8, 3);
               }

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
}
