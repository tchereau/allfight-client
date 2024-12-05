import java.util.Random;

public abstract class w2 {
   private final boolean a;

   public w2() {
      this.a = false;
   }

   public w2(boolean var1) {
      this.a = var1;
   }

   public abstract boolean a(y6 var1, Random var2, int var3, int var4, int var5);

   public void a(double var1, double var3, double var5) {
   }

   protected void a(y6 var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, 0);
   }

   protected void a(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.a) {
         var1.int(var2, var3, var4, var5, var6, 3);
      } else {
         var1.int(var2, var3, var4, var5, var6, 2);
      }

   }
}
