import java.util.List;
import java.util.Random;

public class u2 extends uq {
   protected final up h;

   public u2(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.h = this.a(var2);
      this.do = var3;
   }

   public void a(uk var1, List var2, Random var3) {
      if (this.if != 2 && this.if != 3) {
         this.if((ut)var1, var2, var3, 1, 1);
      } else {
         this.a((ut)var1, var2, var3, 1, 1);
      }

   }

   public static u2 byte(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -1, -1, 0, 5, 5, 5, var5);
      return a(var7) && uk.a(var0, var7) == null ? new u2(var6, var1, var7, var5) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 4, 4, true, var2, u9.do());
         this.a(var1, var2, var3, this.h, 1, 1, 0);
         if (this.if != 2 && this.if != 3) {
            this.a(var1, var3, 4, 1, 1, 4, 3, 3, 0, 0, false);
         } else {
            this.a(var1, var3, 0, 1, 1, 0, 3, 3, 0, 0, false);
         }

         return true;
      }
   }
}
