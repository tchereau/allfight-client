public class q9 extends rj {
   public q9(int var1) {
      super(var1, ts.w);
      this.a(acn.b);
   }

   public ajd if(int var1, int var2) {
      return pa.be.do(var1);
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      return !var1.byte(var2, var3 - 1, var4).for() ? false : super.case(var1, var2, var3, var4);
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      if (s(var5)) {
         return null;
      } else {
         return var5 != 2 && var5 != 0 ? nw.if().a((double)((float)var2 + 0.375F), (double)var3, (double)var4, (double)((float)var2 + 0.625F), (double)((float)var3 + 1.5F), (double)(var4 + 1)) : nw.if().a((double)var2, (double)var3, (double)((float)var4 + 0.375F), (double)(var2 + 1), (double)((float)var3 + 1.5F), (double)((float)var4 + 0.625F));
      }
   }

   public void int(yy var1, int var2, int var3, int var4) {
      int var5 = r(var1.for(var2, var3, var4));
      if (var5 != 2 && var5 != 0) {
         this.a(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
      }

   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public boolean a(yy var1, int var2, int var3, int var4) {
      return s(var1.for(var2, var3, var4));
   }

   public int new() {
      return 21;
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      int var7 = (ajs.a((double)(var5.a5 * 4.0F / 360.0F) + 0.5D) & 3) % 4;
      var1.do(var2, var3, var4, var7, 2);
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      int var10 = var1.for(var2, var3, var4);
      if (s(var10)) {
         var1.do(var2, var3, var4, var10 & -5, 2);
      } else {
         int var11 = (ajs.a((double)(var5.a5 * 4.0F / 360.0F) + 0.5D) & 3) % 4;
         int var12 = r(var10);
         if (var12 == (var11 + 2) % 4) {
            var10 = var11;
         }

         var1.do(var2, var3, var4, var10 | 4, 2);
      }

      var1.a(var5, 1003, var2, var3, var4, 0);
      return true;
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!var1.goto) {
         int var6 = var1.for(var2, var3, var4);
         boolean var7 = var1.f(var2, var3, var4);
         if (var7 || var5 > 0 && pa.x[var5].int()) {
            if (var7 && !s(var6)) {
               var1.do(var2, var3, var4, var6 | 4, 2);
               var1.a((aek)null, 1003, var2, var3, var4, 0);
            } else if (!var7 && s(var6)) {
               var1.do(var2, var3, var4, var6 & -5, 2);
               var1.a((aek)null, 1003, var2, var3, var4, 0);
            }
         }

      }
   }

   public static boolean s(int var0) {
      return (var0 & 4) != 0;
   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      return true;
   }

   public void a(ajc var1) {
   }
}
