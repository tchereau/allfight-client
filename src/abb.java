public class abb extends abr {
   public abb(int var1) {
      super(var1);
      this.a(acn.b);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (var3.new(var4, var5, var6) != pa.ca.void) {
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

         if (!var3.a(var4, var5, var6)) {
            return false;
         }
      }

      if (!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         if (pa.bg.case(var3, var4, var5, var6)) {
            --var1.if;
            var3.int(var4, var5, var6, pa.bg.void);
         }

         return true;
      }
   }
}
