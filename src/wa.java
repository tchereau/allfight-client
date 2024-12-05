import java.util.List;
import java.util.Random;

public class wa {
   private static final aji[] a;

   private static uk a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1.nextInt(100);
      wc var8;
      if (var7 >= 80) {
         var8 = v8.do(var0, var1, var2, var3, var4, var5);
         if (var8 != null) {
            return new v8(var6, var1, var8, var5);
         }
      } else if (var7 >= 70) {
         var8 = v6.if(var0, var1, var2, var3, var4, var5);
         if (var8 != null) {
            return new v6(var6, var1, var8, var5);
         }
      } else {
         var8 = v9.for(var0, var1, var2, var3, var4, var5);
         if (var8 != null) {
            return new v9(var6, var1, var8, var5);
         }
      }

      return null;
   }

   private static uk if(uk var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if (var7 > 8) {
         return null;
      } else if (Math.abs(var3 - var0.do().if) <= 80 && Math.abs(var5 - var0.do().new) <= 80) {
         uk var8 = a(var1, var2, var3, var4, var5, var6, var7 + 1);
         if (var8 != null) {
            var1.add(var8);
            var8.a(var0, var1, var2);
         }

         return var8;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static uk a(uk var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return if(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static aji[] a() {
      return a;
   }

   static {
      a = new aji[]{new aji(abr.N.A, 0, 1, 5, 10), new aji(abr.L.A, 0, 1, 3, 5), new aji(abr.cv.A, 0, 4, 9, 5), new aji(abr.b9.A, 4, 4, 9, 5), new aji(abr.P.A, 0, 1, 2, 3), new aji(abr.R.A, 0, 3, 8, 10), new aji(abr.aC.A, 0, 1, 3, 15), new aji(abr.ae.A, 0, 1, 1, 1), new aji(pa.cm.void, 0, 4, 8, 1), new aji(abr.aR.A, 0, 2, 4, 10), new aji(abr.aT.A, 0, 2, 4, 10)};
   }
}
