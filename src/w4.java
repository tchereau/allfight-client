import java.util.Random;

public class w4 extends w2 {
   private int l;

   public w4(int var1) {
      this.l = var1;
   }

   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      int var11;
      for(boolean var6 = false; ((var11 = var1.new(var3, var4, var5)) == 0 || var11 == pa.aJ.void) && var4 > 0; --var4) {
      }

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var9 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var10 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if (var1.a(var8, var9, var10) && pa.x[this.l].try(var1, var8, var9, var10)) {
            var1.int(var8, var9, var10, this.l, 0, 2);
         }
      }

      return true;
   }
}
