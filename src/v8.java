import java.util.List;
import java.util.Random;

public class v8 extends uk {
   private final int N;
   private final boolean M;

   public v8(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.N = var4;
      this.do = var3;
      this.M = var3.do() > 3;
   }

   public static wc do(List var0, Random var1, int var2, int var3, int var4, int var5) {
      wc var6 = new wc(var2, var3, var4, var2, var3 + 2, var4);
      if (var1.nextInt(4) == 0) {
         var6.for += 4;
      }

      switch(var5) {
      case 0:
         var6.if = var2 - 1;
         var6.int = var2 + 3;
         var6.do = var4 + 4;
         break;
      case 1:
         var6.if = var2 - 4;
         var6.new = var4 - 1;
         var6.do = var4 + 3;
         break;
      case 2:
         var6.if = var2 - 1;
         var6.int = var2 + 3;
         var6.new = var4 - 4;
         break;
      case 3:
         var6.int = var2 + 4;
         var6.new = var4 - 1;
         var6.do = var4 + 3;
      }

      return uk.a(var0, var6) != null ? null : var6;
   }

   public void a(uk var1, List var2, Random var3) {
      int var4 = this.a();
      switch(this.N) {
      case 0:
         wa.a(var1, var2, var3, this.do.if + 1, this.do.a, this.do.do + 1, 0, var4);
         wa.a(var1, var2, var3, this.do.if - 1, this.do.a, this.do.new + 1, 1, var4);
         wa.a(var1, var2, var3, this.do.int + 1, this.do.a, this.do.new + 1, 3, var4);
         break;
      case 1:
         wa.a(var1, var2, var3, this.do.if + 1, this.do.a, this.do.new - 1, 2, var4);
         wa.a(var1, var2, var3, this.do.if + 1, this.do.a, this.do.do + 1, 0, var4);
         wa.a(var1, var2, var3, this.do.if - 1, this.do.a, this.do.new + 1, 1, var4);
         break;
      case 2:
         wa.a(var1, var2, var3, this.do.if + 1, this.do.a, this.do.new - 1, 2, var4);
         wa.a(var1, var2, var3, this.do.if - 1, this.do.a, this.do.new + 1, 1, var4);
         wa.a(var1, var2, var3, this.do.int + 1, this.do.a, this.do.new + 1, 3, var4);
         break;
      case 3:
         wa.a(var1, var2, var3, this.do.if + 1, this.do.a, this.do.new - 1, 2, var4);
         wa.a(var1, var2, var3, this.do.if + 1, this.do.a, this.do.do + 1, 0, var4);
         wa.a(var1, var2, var3, this.do.int + 1, this.do.a, this.do.new + 1, 3, var4);
      }

      if (this.M) {
         if (var3.nextBoolean()) {
            wa.a(var1, var2, var3, this.do.if + 1, this.do.a + 3 + 1, this.do.new - 1, 2, var4);
         }

         if (var3.nextBoolean()) {
            wa.a(var1, var2, var3, this.do.if - 1, this.do.a + 3 + 1, this.do.new + 1, 1, var4);
         }

         if (var3.nextBoolean()) {
            wa.a(var1, var2, var3, this.do.int + 1, this.do.a + 3 + 1, this.do.new + 1, 3, var4);
         }

         if (var3.nextBoolean()) {
            wa.a(var1, var2, var3, this.do.if + 1, this.do.a + 3 + 1, this.do.do + 1, 0, var4);
         }
      }

   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         if (this.M) {
            this.a(var1, var3, this.do.if + 1, this.do.a, this.do.new, this.do.int - 1, this.do.a + 3 - 1, this.do.do, 0, 0, false);
            this.a(var1, var3, this.do.if, this.do.a, this.do.new + 1, this.do.int, this.do.a + 3 - 1, this.do.do - 1, 0, 0, false);
            this.a(var1, var3, this.do.if + 1, this.do.for - 2, this.do.new, this.do.int - 1, this.do.for, this.do.do, 0, 0, false);
            this.a(var1, var3, this.do.if, this.do.for - 2, this.do.new + 1, this.do.int, this.do.for, this.do.do - 1, 0, 0, false);
            this.a(var1, var3, this.do.if + 1, this.do.a + 3, this.do.new + 1, this.do.int - 1, this.do.a + 3, this.do.do - 1, 0, 0, false);
         } else {
            this.a(var1, var3, this.do.if + 1, this.do.a, this.do.new, this.do.int - 1, this.do.for, this.do.do, 0, 0, false);
            this.a(var1, var3, this.do.if, this.do.a, this.do.new + 1, this.do.int, this.do.for, this.do.do - 1, 0, 0, false);
         }

         this.a(var1, var3, this.do.if + 1, this.do.a, this.do.new + 1, this.do.if + 1, this.do.for, this.do.new + 1, pa.be.void, 0, false);
         this.a(var1, var3, this.do.if + 1, this.do.a, this.do.do - 1, this.do.if + 1, this.do.for, this.do.do - 1, pa.be.void, 0, false);
         this.a(var1, var3, this.do.int - 1, this.do.a, this.do.new + 1, this.do.int - 1, this.do.for, this.do.new + 1, pa.be.void, 0, false);
         this.a(var1, var3, this.do.int - 1, this.do.a, this.do.do - 1, this.do.int - 1, this.do.for, this.do.do - 1, pa.be.void, 0, false);

         for(int var4 = this.do.if; var4 <= this.do.int; ++var4) {
            for(int var5 = this.do.new; var5 <= this.do.do; ++var5) {
               int var6 = this.if(var1, var4, this.do.a - 1, var5, var3);
               if (var6 == 0) {
                  this.a(var1, pa.be.void, 0, var4, this.do.a - 1, var5, var3);
               }
            }
         }

         return true;
      }
   }
}
