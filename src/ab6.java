public class ab6 extends aco {
   protected ab6(int var1) {
      super(var1);
      this.a(acn.long);
   }

   public abp a(abp var1, y6 var2, aek var3) {
      abp var4 = new abp(abr.aZ, 1, var2.a("map"));
      String var5 = "map_" + var4.new();
      s3 var6 = new s3(var5);
      var2.a((String)var5, (s0)var6);
      var6.case = 0;
      int var7 = 128 * (1 << var6.case);
      var6.for = (int)(Math.round(var3.al / (double)var7) * (long)var7);
      var6.do = (int)(Math.round(var3.aj / (double)var7) * (long)var7);
      var6.char = (byte)var2.n.if;
      var6.a();
      --var1.if;
      if (var1.if <= 0) {
         return var4;
      } else {
         if (!var3.fR.new(var4.n())) {
            var3.else(var4);
         }

         return var1;
      }
   }
}
