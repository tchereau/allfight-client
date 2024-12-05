import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class ajk {
   public static int a(Collection var0) {
      int var1 = 0;

      ajj var3;
      for(Iterator var2 = var0.iterator(); var2.hasNext(); var1 += var3.a) {
         var3 = (ajj)var2.next();
      }

      return var1;
   }

   public static ajj a(Random var0, Collection var1, int var2) {
      if (var2 <= 0) {
         throw new IllegalArgumentException();
      } else {
         int var3 = var0.nextInt(var2);
         Iterator var4 = var1.iterator();

         ajj var5;
         do {
            if (!var4.hasNext()) {
               return null;
            }

            var5 = (ajj)var4.next();
            var3 -= var5.a;
         } while(var3 >= 0);

         return var5;
      }
   }

   public static ajj a(Random var0, Collection var1) {
      return a(var0, var1, a(var1));
   }

   public static int a(ajj[] var0) {
      int var1 = 0;
      ajj[] var2 = var0;
      int var3 = var0.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         ajj var5 = var2[var4];
         var1 += var5.a;
      }

      return var1;
   }

   public static ajj a(Random var0, ajj[] var1, int var2) {
      if (var2 <= 0) {
         throw new IllegalArgumentException();
      } else {
         int var3 = var0.nextInt(var2);
         ajj[] var4 = var1;
         int var5 = var1.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            ajj var7 = var4[var6];
            var3 -= var7.a;
            if (var3 < 0) {
               return var7;
            }
         }

         return null;
      }
   }

   public static ajj a(Random var0, ajj[] var1) {
      return a(var0, var1, a(var1));
   }
}
