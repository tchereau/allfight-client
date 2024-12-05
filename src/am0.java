final class am0 extends ara {
   private final ara new = new ara();

   public abp if(arc var1, abp var2) {
      aq6 var3 = rh.B(var1.byte());
      y6 var4 = var1.for();
      int var5 = var1.case() + var3.a();
      int var6 = var1.new() + var3.for();
      int var7 = var1.int() + var3.if();
      ts var8 = var4.byte(var5, var6, var7);
      int var9 = var4.for(var5, var6, var7);
      abr var10;
      if (ts.s.equals(var8) && var9 == 0) {
         var10 = abr.bg;
      } else {
         if (!ts.r.equals(var8) || var9 != 0) {
            return super.if(var1, var2);
         }

         var10 = abr.be;
      }

      var4.o(var5, var6, var7);
      if (--var2.if == 0) {
         var2.new = var10.A;
         var2.if = 1;
      } else if (((oi)var1.try()).a(new abp(var10)) < 0) {
         this.new.a(var1, new abp(var10));
      }

      return var2;
   }
}
