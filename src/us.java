import java.util.List;
import java.util.Random;

public class us extends uq {
   private final up new;
   private final boolean int;
   private final boolean try;

   public us(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.new = this.a(var2);
      this.do = var3;
      this.int = var2.nextInt(2) == 0;
      this.try = var2.nextInt(2) == 0;
   }

   public void a(uk var1, List var2, Random var3) {
      this.do((ut)var1, var2, var3, 1, 1);
      if (this.int) {
         this.a((ut)var1, var2, var3, 1, 2);
      }

      if (this.try) {
         this.if((ut)var1, var2, var3, 1, 2);
      }

   }

   public static us if(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return a(var7) && uk.a(var0, var7) == null ? new us(var6, var1, var7, var5) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 4, 6, true, var2, u9.do());
         this.a(var1, var2, var3, this.new, 1, 1, 0);
         this.a(var1, var2, var3, up.if, 1, 1, 6);
         this.a(var1, var3, var2, 0.1F, 1, 2, 1, pa.bq.void, 0);
         this.a(var1, var3, var2, 0.1F, 3, 2, 1, pa.bq.void, 0);
         this.a(var1, var3, var2, 0.1F, 1, 2, 5, pa.bq.void, 0);
         this.a(var1, var3, var2, 0.1F, 3, 2, 5, pa.bq.void, 0);
         if (this.int) {
            this.a(var1, var3, 0, 1, 2, 0, 3, 4, 0, 0, false);
         }

         if (this.try) {
            this.a(var1, var3, 4, 1, 2, 4, 3, 4, 0, 0, false);
         }

         return true;
      }
   }
}
