public class aak extends aaf {
   public aak() {
      super(3, 3, new abp[]{new abp(abr.cn), new abp(abr.cn), new abp(abr.cn), new abp(abr.cn), new abp(abr.aZ, 0, 32767), new abp(abr.cn), new abp(abr.cn), new abp(abr.cn), new abp(abr.cn)}, new abp(abr.bA, 0, 0));
   }

   public boolean a(adt var1, y6 var2) {
      if (!super.a(var1, var2)) {
         return false;
      } else {
         abp var3 = null;

         for(int var4 = 0; var4 < var1.r() && var3 == null; ++var4) {
            abp var5 = var1.do(var4);
            if (var5 != null && var5.new == abr.aZ.A) {
               var3 = var5;
            }
         }

         if (var3 == null) {
            return false;
         } else {
            s3 var6 = abr.aZ.a(var3, var2);
            if (var6 == null) {
               return false;
            } else {
               return var6.case < 4;
            }
         }
      }
   }

   public abp a(adt var1) {
      abp var2 = null;

      for(int var3 = 0; var3 < var1.r() && var2 == null; ++var3) {
         abp var4 = var1.do(var3);
         if (var4 != null && var4.new == abr.aZ.A) {
            var2 = var4;
         }
      }

      var2 = var2.n();
      var2.if = 1;
      if (var2.b() == null) {
         var2.do(new aqv());
      }

      var2.b().a("map_is_scaling", true);
      return var2;
   }
}
