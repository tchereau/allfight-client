import java.util.List;
import java.util.Random;

public class ux extends u2 {
   public void a(uk var1, List var2, Random var3) {
      if (this.if != 2 && this.if != 3) {
         this.a((ut)var1, var2, var3, 1, 1);
      } else {
         this.if((ut)var1, var2, var3, 1, 1);
      }

   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 4, 4, true, var2, u9.do());
         this.a(var1, var2, var3, this.h, 1, 1, 0);
         if (this.if != 2 && this.if != 3) {
            this.a(var1, var3, 0, 1, 1, 0, 3, 3, 0, 0, false);
         } else {
            this.a(var1, var3, 4, 1, 1, 4, 3, 3, 0, 0, false);
         }

         return true;
      }
   }
}
