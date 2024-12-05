import java.util.List;
import java.util.Random;

public class uy extends uq {
   protected final up c;

   public uy(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.c = this.a(var2);
      this.do = var3;
   }

   public void a(uk var1, List var2, Random var3) {
      this.do((ut)var1, var2, var3, 1, 1);
   }

   public static uy int(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -1, -1, 0, 9, 5, 11, var5);
      return a(var7) && uk.a(var0, var7) == null ? new uy(var6, var1, var7, var5) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 8, 4, 10, true, var2, u9.do());
         this.a(var1, var2, var3, this.c, 1, 1, 0);
         this.a(var1, var3, 1, 1, 10, 3, 3, 10, 0, 0, false);
         this.a(var1, var3, 4, 1, 1, 4, 3, 1, false, var2, u9.do());
         this.a(var1, var3, 4, 1, 3, 4, 3, 3, false, var2, u9.do());
         this.a(var1, var3, 4, 1, 7, 4, 3, 7, false, var2, u9.do());
         this.a(var1, var3, 4, 1, 9, 4, 3, 9, false, var2, u9.do());
         this.a(var1, var3, 4, 1, 4, 4, 3, 6, pa.ag.void, pa.ag.void, false);
         this.a(var1, var3, 5, 1, 5, 7, 3, 5, pa.ag.void, pa.ag.void, false);
         this.a(var1, pa.ag.void, 0, 4, 3, 2, var3);
         this.a(var1, pa.ag.void, 0, 4, 3, 8, var3);
         this.a(var1, pa.ch.void, this.do(pa.ch.void, 3), 4, 1, 2, var3);
         this.a(var1, pa.ch.void, this.do(pa.ch.void, 3) + 8, 4, 2, 2, var3);
         this.a(var1, pa.ch.void, this.do(pa.ch.void, 3), 4, 1, 8, var3);
         this.a(var1, pa.ch.void, this.do(pa.ch.void, 3) + 8, 4, 2, 8, var3);
         return true;
      }
   }
}
