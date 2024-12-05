import java.util.Random;

public class w7 extends w2 {
   private final aji[] p;
   private final int o;

   public w7(aji[] var1, int var2) {
      this.p = var1;
      this.o = var2;
   }

   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      int var12;
      for(boolean var6 = false; ((var12 = var1.new(var3, var4, var5)) == 0 || var12 == pa.aJ.void) && var4 > 1; --var4) {
      }

      if (var4 < 1) {
         return false;
      } else {
         ++var4;

         for(int var7 = 0; var7 < 4; ++var7) {
            int var8 = var3 + var2.nextInt(4) - var2.nextInt(4);
            int var9 = var4 + var2.nextInt(3) - var2.nextInt(3);
            int var10 = var5 + var2.nextInt(4) - var2.nextInt(4);
            if (var1.a(var8, var9, var10) && var1.case(var8, var9 - 1, var10)) {
               var1.int(var8, var9, var10, pa.bi.void, 0, 2);
               om var11 = (om)var1.if(var8, var9, var10);
               if (var11 != null && var11 != null) {
                  aji.a(var2, this.p, (ajg)var11, this.o);
               }

               if (var1.a(var8 - 1, var9, var10) && var1.case(var8 - 1, var9 - 1, var10)) {
                  var1.int(var8 - 1, var9, var10, pa.bq.void, 0, 2);
               }

               if (var1.a(var8 + 1, var9, var10) && var1.case(var8 - 1, var9 - 1, var10)) {
                  var1.int(var8 + 1, var9, var10, pa.bq.void, 0, 2);
               }

               if (var1.a(var8, var9, var10 - 1) && var1.case(var8 - 1, var9 - 1, var10)) {
                  var1.int(var8, var9, var10 - 1, pa.bq.void, 0, 2);
               }

               if (var1.a(var8, var9, var10 + 1) && var1.case(var8 - 1, var9 - 1, var10)) {
                  var1.int(var8, var9, var10 + 1, pa.bq.void, 0, 2);
               }

               return true;
            }
         }

         return false;
      }
   }
}
