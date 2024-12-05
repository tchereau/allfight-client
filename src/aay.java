public class aay extends abr {
   private int cP;

   public aay(int var1, pa var2) {
      super(var1);
      this.cP = var2.void;
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      int var11 = var3.new(var4, var5, var6);
      if (var11 == pa.ca.void && (var3.for(var4, var5, var6) & 7) < 1) {
         var7 = 1;
      } else if (var11 != pa.Z.void && var11 != pa.b3.void && var11 != pa.b1.void) {
         if (var7 == 0) {
            --var5;
         }

         if (var7 == 1) {
            ++var5;
         }

         if (var7 == 2) {
            --var6;
         }

         if (var7 == 3) {
            ++var6;
         }

         if (var7 == 4) {
            --var4;
         }

         if (var7 == 5) {
            ++var4;
         }
      }

      if (!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else if (var1.if == 0) {
         return false;
      } else {
         if (var3.a(this.cP, var4, var5, var6, false, var7, (aiw)null, var1)) {
            pa var12 = pa.x[this.cP];
            int var13 = var12.a(var3, var4, var5, var6, var7, var8, var9, var10, 0);
            if (var3.int(var4, var5, var6, this.cP, var13, 3)) {
               if (var3.new(var4, var5, var6) == this.cP) {
                  pa.x[this.cP].a(var3, var4, var5, var6, (aig)var2, (abp)var1);
                  pa.x[this.cP].try(var3, var4, var5, var6, var13);
               }

               var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var12.az.do(), (var12.az.for() + 1.0F) / 2.0F, var12.az.a() * 0.8F);
               --var1.if;
            }
         }

         return true;
      }
   }
}
