import java.util.Random;

public class wm extends w2 {
   private int else;
   private int char;

   public wm(int var1, int var2) {
      this.else = var2;
      this.char = var1;
   }

   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      if (var1.byte(var3, var4, var5) != ts.s) {
         return false;
      } else {
         int var6 = var2.nextInt(this.char - 2) + 2;
         byte var7 = 2;

         for(int var8 = var3 - var6; var8 <= var3 + var6; ++var8) {
            for(int var9 = var5 - var6; var9 <= var5 + var6; ++var9) {
               int var10 = var8 - var3;
               int var11 = var9 - var5;
               if (var10 * var10 + var11 * var11 <= var6 * var6) {
                  for(int var12 = var4 - var7; var12 <= var4 + var7; ++var12) {
                     int var13 = var1.new(var8, var12, var9);
                     if (var13 == pa.g.void || var13 == pa.i.void) {
                        var1.int(var8, var12, var9, this.else, 0, 2);
                     }
                  }
               }
            }
         }

         return true;
      }
   }
}
