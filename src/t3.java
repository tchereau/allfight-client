import java.util.List;
import java.util.Random;

public class t3 extends t0 {
   private int U;

   public t3(t4 var1, int var2, Random var3, wc var4, int var5) {
      super(var1, var2);
      this.if = var5;
      this.do = var4;
      this.U = Math.max(var4.int(), var4.a());
   }

   public void a(uk var1, List var2, Random var3) {
      boolean var4 = false;

      int var5;
      uk var6;
      for(var5 = var3.nextInt(5); var5 < this.U - 8; var5 += 2 + var3.nextInt(5)) {
         var6 = this.a((t4)var1, var2, var3, 0, var5);
         if (var6 != null) {
            var5 += Math.max(var6.do.int(), var6.do.a());
            var4 = true;
         }
      }

      for(var5 = var3.nextInt(5); var5 < this.U - 8; var5 += 2 + var3.nextInt(5)) {
         var6 = this.if((t4)var1, var2, var3, 0, var5);
         if (var6 != null) {
            var5 += Math.max(var6.do.int(), var6.do.a());
            var4 = true;
         }
      }

      if (var4 && var3.nextInt(3) > 0) {
         switch(this.if) {
         case 0:
            uf.do((t4)var1, var2, var3, this.do.if - 1, this.do.a, this.do.do - 2, 1, this.a());
            break;
         case 1:
            uf.do((t4)var1, var2, var3, this.do.if, this.do.a, this.do.new - 1, 2, this.a());
            break;
         case 2:
            uf.do((t4)var1, var2, var3, this.do.if - 1, this.do.a, this.do.new, 1, this.a());
            break;
         case 3:
            uf.do((t4)var1, var2, var3, this.do.int - 2, this.do.a, this.do.new - 1, 2, this.a());
         }
      }

      if (var4 && var3.nextInt(3) > 0) {
         switch(this.if) {
         case 0:
            uf.do((t4)var1, var2, var3, this.do.int + 1, this.do.a, this.do.do - 2, 3, this.a());
            break;
         case 1:
            uf.do((t4)var1, var2, var3, this.do.if, this.do.a, this.do.do + 1, 0, this.a());
            break;
         case 2:
            uf.do((t4)var1, var2, var3, this.do.int + 1, this.do.a, this.do.new, 3, this.a());
            break;
         case 3:
            uf.do((t4)var1, var2, var3, this.do.int - 2, this.do.a, this.do.do + 1, 0, this.a());
         }
      }

   }

   public static wc a(t4 var0, List var1, Random var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 7 * ajs.a((Random)var2, 3, 5); var7 >= 7; var7 -= 7) {
         wc var8 = wc.a(var3, var4, var5, 0, 0, 0, 3, 3, var7, var6);
         if (uk.a(var1, var8) == null) {
            return var8;
         }
      }

      return null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      int var4 = this.for(pa.aY.void, 0);

      for(int var5 = this.do.if; var5 <= this.do.int; ++var5) {
         for(int var6 = this.do.new; var6 <= this.do.do; ++var6) {
            if (var3.if(var5, 64, var6)) {
               int var7 = var1.case(var5, var6) - 1;
               var1.int(var5, var7, var6, var4, 0, 2);
            }
         }
      }

      return true;
   }
}
