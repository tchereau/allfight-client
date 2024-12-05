import java.util.Random;

public class adk extends pa {
   protected adk(int var1, int var2) {
      super(var1, ts.y);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.a(true);
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4) & 7;
      return nw.if().a((double)var2 + this.aR, (double)var3 + this.aO, (double)var4 + this.aL, (double)var2 + this.aI, (double)((float)var3 + (float)var5), (double)var4 + this.aC);
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public void int(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4) & 7;
      float var6 = (float)(2 * (1 + var5)) / 16.0F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, var6, 1.0F);
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.new(var2, var3 - 1, var4);
      return var5 == 0 || var5 != pa.aJ.void && !pa.x[var5].do() ? false : var1.byte(var2, var3 - 1, var4).void();
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (var1.for(yw.a, var2, var3, var4) > 11) {
         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.do(var2, var3, var4, 0, var4);
      }

   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!var1.goto) {
         int var6 = var1.for(var2, var3, var4);
         boolean var8 = false;
         if (!var1.case(var2, var3 - 1, var4)) {
            var8 = true;
         }

         if (var6 == 2 && !var1.case(var2 + 1, var3, var4)) {
            var8 = true;
         }

         if (var6 == 3 && !var1.case(var2 - 1, var3, var4)) {
            var8 = true;
         }

         if (var6 == 4 && !var1.case(var2, var3, var4 - 1)) {
            var8 = true;
         }

         if (var6 == 5 && !var1.case(var2, var3, var4 + 1)) {
            var8 = true;
         }

         if (var8) {
            this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
            var1.do(var2, var3, var4, 0, var6);
         }
      }

   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      return var5 == 1 ? true : super.int(var1, var2, var3, var4, var5);
   }
}
