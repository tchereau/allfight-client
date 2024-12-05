final class abk extends ara {
   private final ara char = new ara();

   public abp if(arc var1, abp var2) {
      aq6 var3 = rh.B(var1.byte());
      y6 var4 = var1.for();
      double var5 = var1.a() + (double)((float)var3.a() * 1.125F);
      double var7 = var1.do() + (double)((float)var3.for() * 1.125F);
      double var9 = var1.if() + (double)((float)var3.if() * 1.125F);
      int var11 = var1.case() + var3.a();
      int var12 = var1.new() + var3.for();
      int var13 = var1.int() + var3.if();
      int var14 = var4.new(var11, var12, var13);
      double var15;
      if (r6.L(var14)) {
         var15 = 0.0D;
      } else {
         if (var14 != 0 || !r6.L(var4.new(var11, var12 - 1, var13))) {
            return this.char.a(var1, var2);
         }

         var15 = -1.0D;
      }

      afj var17 = afj.a(var4, var5, var7 + var15, var9, ((abl)var2.d()).dg);
      var4.new(var17);
      var2.a(1);
      return var2;
   }

   protected void a(arc var1) {
      var1.for().for(1000, var1.case(), var1.new(), var1.int(), 0);
   }
}
