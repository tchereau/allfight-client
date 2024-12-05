import java.util.List;
import java.util.Random;

public class uu extends uq {
   private final boolean case;
   private final up byte;

   public uu(int var1, Random var2, int var3, int var4) {
      super(var1);
      this.case = true;
      this.if = var2.nextInt(4);
      this.byte = up.if;
      switch(this.if) {
      case 0:
      case 2:
         this.do = new wc(var3, 64, var4, var3 + 5 - 1, 74, var4 + 5 - 1);
         break;
      default:
         this.do = new wc(var3, 64, var4, var3 + 5 - 1, 74, var4 + 5 - 1);
      }

   }

   public uu(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.case = false;
      this.if = var4;
      this.byte = this.a(var2);
      this.do = var3;
   }

   public void a(uk var1, List var2, Random var3) {
      if (this.case) {
         u9.a(u3.class);
      }

      this.do((ut)var1, var2, var3, 1, 1);
   }

   public static uu do(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -1, -7, 0, 5, 11, 5, var5);
      return a(var7) && uk.a(var0, var7) == null ? new uu(var6, var1, var7, var5) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 10, 4, true, var2, u9.do());
         this.a(var1, var2, var3, this.byte, 1, 7, 0);
         this.a(var1, var2, var3, up.if, 1, 1, 4);
         this.a(var1, pa.am.void, 0, 2, 6, 1, var3);
         this.a(var1, pa.am.void, 0, 1, 5, 1, var3);
         this.a(var1, pa.bD.void, 0, 1, 6, 1, var3);
         this.a(var1, pa.am.void, 0, 1, 5, 2, var3);
         this.a(var1, pa.am.void, 0, 1, 4, 3, var3);
         this.a(var1, pa.bD.void, 0, 1, 5, 3, var3);
         this.a(var1, pa.am.void, 0, 2, 4, 3, var3);
         this.a(var1, pa.am.void, 0, 3, 3, 3, var3);
         this.a(var1, pa.bD.void, 0, 3, 4, 3, var3);
         this.a(var1, pa.am.void, 0, 3, 3, 2, var3);
         this.a(var1, pa.am.void, 0, 3, 2, 1, var3);
         this.a(var1, pa.bD.void, 0, 3, 3, 1, var3);
         this.a(var1, pa.am.void, 0, 2, 2, 1, var3);
         this.a(var1, pa.am.void, 0, 1, 1, 1, var3);
         this.a(var1, pa.bD.void, 0, 1, 2, 1, var3);
         this.a(var1, pa.am.void, 0, 1, 1, 2, var3);
         this.a(var1, pa.bD.void, 0, 1, 1, 3, var3);
         return true;
      }
   }
}
