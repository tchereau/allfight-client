public class aa0 extends aaz {
   private final boolean cT;
   private final q0 cS;
   private final q0 cU;

   public aa0(int var1, q0 var2, q0 var3, boolean var4) {
      super(var1);
      this.cS = var2;
      this.cU = var3;
      this.cT = var4;
      this.for(0);
      this.a(true);
   }

   public ajd a(int var1) {
      return pa.x[this.A].if(2, var1);
   }

   public int do(int var1) {
      return var1;
   }

   public String int(abp var1) {
      return this.cS.m(var1.new());
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (this.cT) {
         return super.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      } else if (var1.if == 0) {
         return false;
      } else if (!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         int var11 = var3.new(var4, var5, var6);
         int var12 = var3.for(var4, var5, var6);
         int var13 = var12 & 7;
         boolean var14 = (var12 & 8) != 0;
         if ((var7 == 1 && !var14 || var7 == 0 && var14) && var11 == this.cS.void && var13 == var1.new()) {
            if (var3.int(this.cU.int(var3, var4, var5, var6)) && var3.int(var4, var5, var6, this.cU.void, var13, 3)) {
               var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.cU.az.do(), (this.cU.az.for() + 1.0F) / 2.0F, this.cU.az.a() * 0.8F);
               --var1.if;
            }

            return true;
         } else {
            return this.a(var1, var2, var3, var4, var5, var6, var7) ? true : super.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
         }
      }
   }

   public boolean a(y6 var1, int var2, int var3, int var4, int var5, aek var6, abp var7) {
      int var8 = var2;
      int var9 = var3;
      int var10 = var4;
      int var11 = var1.new(var2, var3, var4);
      int var12 = var1.for(var2, var3, var4);
      int var13 = var12 & 7;
      boolean var14 = (var12 & 8) != 0;
      if ((var5 == 1 && !var14 || var5 == 0 && var14) && var11 == this.cS.void && var13 == var7.new()) {
         return true;
      } else {
         if (var5 == 0) {
            --var3;
         }

         if (var5 == 1) {
            ++var3;
         }

         if (var5 == 2) {
            --var4;
         }

         if (var5 == 3) {
            ++var4;
         }

         if (var5 == 4) {
            --var2;
         }

         if (var5 == 5) {
            ++var2;
         }

         var11 = var1.new(var2, var3, var4);
         var12 = var1.for(var2, var3, var4);
         var13 = var12 & 7;
         var14 = (var12 & 8) != 0;
         return var11 == this.cS.void && var13 == var7.new() ? true : super.a(var1, var8, var9, var10, var5, var6, var7);
      }
   }

   private boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7) {
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

      int var8 = var3.new(var4, var5, var6);
      int var9 = var3.for(var4, var5, var6);
      int var10 = var9 & 7;
      if (var8 == this.cS.void && var10 == var1.new()) {
         if (var3.int(this.cU.int(var3, var4, var5, var6)) && var3.int(var4, var5, var6, this.cU.void, var10, 3)) {
            var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.cU.az.do(), (this.cU.az.for() + 1.0F) / 2.0F, this.cU.az.a() * 0.8F);
            --var1.if;
         }

         return true;
      } else {
         return false;
      }
   }
}
