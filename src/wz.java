import java.util.Random;

public class wz extends w2 {
   private int j;
   private int i;

   public wz(int var1, int var2) {
      this.i = var1;
      this.j = var2;
   }

   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      int var15;
      for(boolean var6 = false; ((var15 = var1.new(var3, var4, var5)) == 0 || var15 == pa.aJ.void) && var4 > 0; --var4) {
      }

      int var7 = var1.new(var3, var4, var5);
      if (var7 == pa.g.void || var7 == pa.i.void) {
         ++var4;
         this.a(var1, var3, var4, var5, pa.aM.void, this.i);

         for(int var8 = var4; var8 <= var4 + 2; ++var8) {
            int var9 = var8 - var4;
            int var10 = 2 - var9;

            for(int var11 = var3 - var10; var11 <= var3 + var10; ++var11) {
               int var12 = var11 - var3;

               for(int var13 = var5 - var10; var13 <= var5 + var10; ++var13) {
                  int var14 = var13 - var5;
                  if ((Math.abs(var12) != var10 || Math.abs(var14) != var10 || var2.nextInt(2) != 0) && !pa.v[var1.new(var11, var8, var13)]) {
                     this.a(var1, var11, var8, var13, pa.aJ.void, this.j);
                  }
               }
            }
         }
      }

      return true;
   }
}
