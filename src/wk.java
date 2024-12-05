import java.util.Random;

public class wk extends w2 {
   private int byte;

   public wk(int var1) {
      this.byte = var1;
   }

   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      if (var1.new(var3, var4 + 1, var5) != pa.k.void) {
         return false;
      } else if (var1.new(var3, var4 - 1, var5) != pa.k.void) {
         return false;
      } else if (var1.new(var3, var4, var5) != 0 && var1.new(var3, var4, var5) != pa.k.void) {
         return false;
      } else {
         int var6 = 0;
         if (var1.new(var3 - 1, var4, var5) == pa.k.void) {
            ++var6;
         }

         if (var1.new(var3 + 1, var4, var5) == pa.k.void) {
            ++var6;
         }

         if (var1.new(var3, var4, var5 - 1) == pa.k.void) {
            ++var6;
         }

         if (var1.new(var3, var4, var5 + 1) == pa.k.void) {
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

         if (var6 == 3 && var7 == 1) {
            var1.int(var3, var4, var5, this.byte, 0, 2);
            var1.D = true;
            pa.x[this.byte].if(var1, var3, var4, var5, var2);
            var1.D = false;
         }

         return true;
      }
   }
}
