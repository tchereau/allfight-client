import java.util.List;
import java.util.Random;

public class v6 extends uk {
   public v6(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.do = var3;
   }

   public static wc if(List var0, Random var1, int var2, int var3, int var4, int var5) {
      wc var6 = new wc(var2, var3 - 5, var4, var2, var3 + 2, var4);
      switch(var5) {
      case 0:
         var6.int = var2 + 2;
         var6.do = var4 + 8;
         break;
      case 1:
         var6.if = var2 - 8;
         var6.do = var4 + 2;
         break;
      case 2:
         var6.int = var2 + 2;
         var6.new = var4 - 8;
         break;
      case 3:
         var6.int = var2 + 8;
         var6.do = var4 + 2;
      }

      return uk.a(var0, var6) != null ? null : var6;
   }

   public void a(uk var1, List var2, Random var3) {
      int var4 = this.a();
      switch(this.if) {
      case 0:
         wa.a(var1, var2, var3, this.do.if, this.do.a, this.do.do + 1, 0, var4);
         break;
      case 1:
         wa.a(var1, var2, var3, this.do.if - 1, this.do.a, this.do.new, 1, var4);
         break;
      case 2:
         wa.a(var1, var2, var3, this.do.if, this.do.a, this.do.new - 1, 2, var4);
         break;
      case 3:
         wa.a(var1, var2, var3, this.do.int + 1, this.do.a, this.do.new, 3, var4);
      }

   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 5, 0, 2, 7, 1, 0, 0, false);
         this.a(var1, var3, 0, 0, 7, 2, 2, 8, 0, 0, false);

         for(int var4 = 0; var4 < 5; ++var4) {
            this.a(var1, var3, 0, 5 - var4 - (var4 < 4 ? 1 : 0), 2 + var4, 2, 7 - var4, 2 + var4, 0, 0, false);
         }

         return true;
      }
   }
}
