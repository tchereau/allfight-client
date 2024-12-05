public class abl extends abr {
   private static final aq8 df = new abk();
   public int dg;

   public abl(int var1, int var2) {
      super(var1);
      this.y = 1;
      this.dg = var2;
      this.a(acn.void);
      rh.er.a(this, df);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      int var11 = var3.new(var4, var5, var6);
      if (r6.L(var11)) {
         if (!var3.goto) {
            afj var12 = afj.a(var3, (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.dg);
            if (var1.g()) {
               var12.y(var1.void());
            }

            var3.new(var12);
         }

         --var1.if;
         return true;
      } else {
         return false;
      }
   }
}
