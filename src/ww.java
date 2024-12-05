import java.util.Random;

public class ww extends w2 {
   private int h;
   private boolean g = false;

   public ww(int var1, boolean var2) {
      this.h = var1;
      this.g = var2;
   }

   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      if (var1.new(var3, var4 + 1, var5) != pa.aT.void) {
         return false;
      } else if (var1.new(var3, var4, var5) != 0 && var1.new(var3, var4, var5) != pa.aT.void) {
         return false;
      } else {
         int var6 = 0;
         if (var1.new(var3 - 1, var4, var5) == pa.aT.void) {
            ++var6;
         }

         if (var1.new(var3 + 1, var4, var5) == pa.aT.void) {
            ++var6;
         }

         if (var1.new(var3, var4, var5 - 1) == pa.aT.void) {
            ++var6;
         }

         if (var1.new(var3, var4, var5 + 1) == pa.aT.void) {
            ++var6;
         }

         if (var1.new(var3, var4 - 1, var5) == pa.aT.void) {
            ++var6;
         }

         int var7 = 0;
         if (var1.a(var3 - 1, var4, var5)) {
            ++var7;
         }

         if (var1.a(var3 + 1, var4, var5)) {
            ++var7;
         }

         if (var1.a(var3, var4, var5 - 1)) {
            ++var7;
         }

         if (var1.a(var3, var4, var5 + 1)) {
            ++var7;
         }

         if (var1.a(var3, var4 - 1, var5)) {
            ++var7;
         }

         if (!this.g && var6 == 4 && var7 == 1 || var6 == 5) {
            var1.int(var3, var4, var5, this.h, 0, 2);
            var1.D = true;
            pa.x[this.h].if(var1, var3, var4, var5, var2);
            var1.D = false;
         }

         return true;
      }
   }
}
