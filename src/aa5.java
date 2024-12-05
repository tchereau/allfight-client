public class aa5 extends abr {
   public aa5(int var1) {
      super(var1);
      this.y = 16;
      this.a(acn.c);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (var7 == 0) {
         return false;
      } else if (!var3.byte(var4, var5, var6).for()) {
         return false;
      } else {
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

         if (!var2.a(var4, var5, var6, var7, var1)) {
            return false;
         } else if (!pa.cp.case(var3, var4, var5, var6)) {
            return false;
         } else {
            if (var7 == 1) {
               int var11 = ajs.a((double)((var2.a5 + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15;
               var3.int(var4, var5, var6, pa.cp.void, var11, 2);
            } else {
               var3.int(var4, var5, var6, pa.ck.void, var7, 2);
            }

            --var1.if;
            n7 var12 = (n7)var3.if(var4, var5, var6);
            if (var12 != null) {
               var2.a((n4)var12);
            }

            return true;
         }
      }
   }
}
