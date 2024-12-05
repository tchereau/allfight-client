public class aaw extends acp {
   public aaw(int var1) {
      super(var1, false);
   }

   public abp a(abp var1, y6 var2, aek var3) {
      nt var4 = this.a(var2, var3, true);
      if (var4 == null) {
         return var1;
      } else {
         if (var4.if == ns.if) {
            int var5 = var4.a;
            int var6 = var4.try;
            int var7 = var4.new;
            if (!var2.a(var3, var5, var6, var7)) {
               return var1;
            }

            if (!var3.a(var5, var6, var7, var4.int, var1)) {
               return var1;
            }

            if (var2.byte(var5, var6, var7) == ts.s && var2.for(var5, var6, var7) == 0 && var2.a(var5, var6 + 1, var7)) {
               var2.int(var5, var6 + 1, var7, pa.b0.void);
               if (!var3.fY.new) {
                  --var1.if;
               }
            }
         }

         return var1;
      }
   }

   public int a(abp var1, int var2) {
      return pa.b0.a(var1.new());
   }
}
