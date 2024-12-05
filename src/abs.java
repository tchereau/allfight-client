public class abs extends abr {
   protected abq dh;

   public abs(int var1, abq var2) {
      super(var1);
      this.dh = var2;
      this.y = 1;
      this.for(var2.new());
      this.a(acn.char);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         int var11 = var3.new(var4, var5, var6);
         int var12 = var3.new(var4, var5 + 1, var6);
         if ((var7 == 0 || var12 != 0 || var11 != pa.i.void) && var11 != pa.g.void) {
            return false;
         } else {
            pa var13 = pa.cs;
            var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var13.az.if(), (var13.az.for() + 1.0F) / 2.0F, var13.az.a() * 0.8F);
            if (var3.goto) {
               return true;
            } else {
               var3.int(var4, var5, var6, var13.void);
               var1.a(1, (aig)var2);
               return true;
            }
         }
      }
   }

   public boolean g() {
      return true;
   }

   public String r() {
      return this.dh.toString();
   }
}
