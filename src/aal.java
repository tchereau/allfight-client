public class aal implements aag {
   public boolean a(adt var1, y6 var2) {
      int var3 = 0;
      abp var4 = null;

      for(int var5 = 0; var5 < var1.r(); ++var5) {
         abp var6 = var1.do(var5);
         if (var6 != null) {
            if (var6.new == abr.aZ.A) {
               if (var4 != null) {
                  return false;
               }

               var4 = var6;
            } else {
               if (var6.new != abr.bA.A) {
                  return false;
               }

               ++var3;
            }
         }
      }

      return var4 != null && var3 > 0;
   }

   public abp a(adt var1) {
      int var2 = 0;
      abp var3 = null;

      for(int var4 = 0; var4 < var1.r(); ++var4) {
         abp var5 = var1.do(var4);
         if (var5 != null) {
            if (var5.new == abr.aZ.A) {
               if (var3 != null) {
                  return null;
               }

               var3 = var5;
            } else {
               if (var5.new != abr.bA.A) {
                  return null;
               }

               ++var2;
            }
         }
      }

      if (var3 != null && var2 >= 1) {
         abp var6 = new abp(abr.aZ, var2 + 1, var3.new());
         if (var3.g()) {
            var6.a(var3.void());
         }

         return var6;
      } else {
         return null;
      }
   }

   public int if() {
      return 9;
   }

   public abp a() {
      return null;
   }
}
