import java.util.List;
import java.util.Random;

public class u5 extends uq {
   private static final aji[] p;
   private final up o;
   private boolean q;

   public u5(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.o = this.a(var2);
      this.do = var3;
   }

   public void a(uk var1, List var2, Random var3) {
      this.do((ut)var1, var2, var3, 1, 1);
   }

   public static u5 char(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return a(var7) && uk.a(var0, var7) == null ? new u5(var6, var1, var7, var5) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 4, 6, true, var2, u9.do());
         this.a(var1, var2, var3, this.o, 1, 1, 0);
         this.a(var1, var2, var3, up.if, 1, 1, 6);
         this.a(var1, var3, 3, 1, 2, 3, 1, 4, pa.am.void, pa.am.void, false);
         this.a(var1, pa.bD.void, 5, 3, 1, 1, var3);
         this.a(var1, pa.bD.void, 5, 3, 1, 5, var3);
         this.a(var1, pa.bD.void, 5, 3, 2, 2, var3);
         this.a(var1, pa.bD.void, 5, 3, 2, 4, var3);

         int var4;
         for(var4 = 2; var4 <= 4; ++var4) {
            this.a(var1, pa.bD.void, 5, 2, 1, var4, var3);
         }

         if (!this.q) {
            var4 = this.a(2);
            int var5 = this.a(3, 3);
            int var6 = this.if(3, 3);
            if (var3.if(var5, var4, var6)) {
               this.q = true;
               this.a(var1, var3, var2, 3, 2, 3, aji.a(p, abr.bj.if(var2)), 2 + var2.nextInt(2));
            }
         }

         return true;
      }
   }

   static {
      p = new aji[]{new aji(abr.aF.A, 0, 1, 1, 10), new aji(abr.P.A, 0, 1, 3, 3), new aji(abr.N.A, 0, 1, 5, 10), new aji(abr.L.A, 0, 1, 3, 5), new aji(abr.cv.A, 0, 4, 9, 5), new aji(abr.aC.A, 0, 1, 3, 15), new aji(abr.Y.A, 0, 1, 3, 15), new aji(abr.ae.A, 0, 1, 1, 5), new aji(abr.J.A, 0, 1, 1, 5), new aji(abr.bS.A, 0, 1, 1, 5), new aji(abr.bU.A, 0, 1, 1, 5), new aji(abr.bQ.A, 0, 1, 1, 5), new aji(abr.bO.A, 0, 1, 1, 5), new aji(abr.bo.A, 0, 1, 1, 1)};
   }
}
