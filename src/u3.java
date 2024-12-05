import java.util.List;
import java.util.Random;

public class u3 extends uq {
   protected final up j;
   private boolean i;
   private boolean m;
   private boolean l;
   private boolean k;

   public u3(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.j = this.a(var2);
      this.do = var3;
      this.i = var2.nextBoolean();
      this.m = var2.nextBoolean();
      this.l = var2.nextBoolean();
      this.k = var2.nextInt(3) > 0;
   }

   public void a(uk var1, List var2, Random var3) {
      int var4 = 3;
      int var5 = 5;
      if (this.if == 1 || this.if == 2) {
         var4 = 8 - var4;
         var5 = 8 - var5;
      }

      this.do((ut)var1, var2, var3, 5, 1);
      if (this.i) {
         this.a((ut)var1, var2, var3, var4, 1);
      }

      if (this.m) {
         this.a((ut)var1, var2, var3, var5, 7);
      }

      if (this.l) {
         this.if((ut)var1, var2, var3, var4, 1);
      }

      if (this.k) {
         this.if((ut)var1, var2, var3, var5, 7);
      }

   }

   public static u3 case(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -4, -3, 0, 10, 9, 11, var5);
      return a(var7) && uk.a(var0, var7) == null ? new u3(var6, var1, var7, var5) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 9, 8, 10, true, var2, u9.do());
         this.a(var1, var2, var3, this.j, 4, 3, 0);
         if (this.i) {
            this.a(var1, var3, 0, 3, 1, 0, 5, 3, 0, 0, false);
         }

         if (this.l) {
            this.a(var1, var3, 9, 3, 1, 9, 5, 3, 0, 0, false);
         }

         if (this.m) {
            this.a(var1, var3, 0, 5, 7, 0, 7, 9, 0, 0, false);
         }

         if (this.k) {
            this.a(var1, var3, 9, 5, 7, 9, 7, 9, 0, 0, false);
         }

         this.a(var1, var3, 5, 1, 10, 7, 3, 10, 0, 0, false);
         this.a(var1, var3, 1, 2, 1, 8, 2, 6, false, var2, u9.do());
         this.a(var1, var3, 4, 1, 5, 4, 4, 9, false, var2, u9.do());
         this.a(var1, var3, 8, 1, 5, 8, 4, 9, false, var2, u9.do());
         this.a(var1, var3, 1, 4, 7, 3, 4, 9, false, var2, u9.do());
         this.a(var1, var3, 1, 3, 5, 3, 3, 6, false, var2, u9.do());
         this.a(var1, var3, 1, 3, 4, 3, 3, 4, pa.bD.void, pa.bD.void, false);
         this.a(var1, var3, 1, 4, 6, 3, 4, 6, pa.bD.void, pa.bD.void, false);
         this.a(var1, var3, 5, 1, 7, 7, 1, 8, false, var2, u9.do());
         this.a(var1, var3, 5, 1, 9, 7, 1, 9, pa.bD.void, pa.bD.void, false);
         this.a(var1, var3, 5, 2, 7, 7, 2, 7, pa.bD.void, pa.bD.void, false);
         this.a(var1, var3, 4, 5, 7, 4, 5, 9, pa.bD.void, pa.bD.void, false);
         this.a(var1, var3, 8, 5, 7, 8, 5, 9, pa.bD.void, pa.bD.void, false);
         this.a(var1, var3, 5, 5, 7, 7, 5, 9, pa.bF.void, pa.bF.void, false);
         this.a(var1, pa.bq.void, 0, 6, 5, 6, var3);
         return true;
      }
   }
}
