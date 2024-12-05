public class ara implements aq8 {
   public final abp a(arc var1, abp var2) {
      abp var3 = this.if(var1, var2);
      this.a(var1);
      this.a(var1, rh.B(var1.byte()));
      return var3;
   }

   protected abp if(arc var1, abp var2) {
      aq6 var3 = rh.B(var1.byte());
      aq3 var4 = rh.a(var1);
      abp var5 = var2.a(1);
      a(var1.for(), var5, 6, var3, var4);
      return var2;
   }

   public static void a(y6 var0, abp var1, int var2, aq6 var3, aq3 var4) {
      double var5 = var4.a();
      double var7 = var4.do();
      double var9 = var4.if();
      afk var11 = new afk(var0, var5, var7 - 0.3D, var9, var1);
      double var12 = var0.o.nextDouble() * 0.1D + 0.2D;
      var11.ai = (double)var3.a() * var12;
      var11.ah = 0.20000000298023224D;
      var11.ag = (double)var3.if() * var12;
      var11.ai += var0.o.nextGaussian() * 0.007499999832361937D * (double)var2;
      var11.ah += var0.o.nextGaussian() * 0.007499999832361937D * (double)var2;
      var11.ag += var0.o.nextGaussian() * 0.007499999832361937D * (double)var2;
      var0.new(var11);
   }

   protected void a(arc var1) {
      var1.for().for(1000, var1.case(), var1.new(), var1.int(), 0);
   }

   protected void a(arc var1, aq6 var2) {
      var1.for().for(2000, var1.case(), var1.new(), var1.int(), this.a(var2));
   }

   private int a(aq6 var1) {
      return var1.a() + 1 + (var1.if() + 1) * 3;
   }
}
