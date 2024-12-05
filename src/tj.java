import java.util.ArrayList;
import java.util.List;

public class tj {
   private static int if = 256;
   private static List a = new ArrayList();
   private static List int = new ArrayList();
   private static List for = new ArrayList();
   private static List do = new ArrayList();

   public static synchronized int[] a(int var0) {
      int[] var1;
      if (var0 <= 256) {
         if (a.isEmpty()) {
            var1 = new int[256];
            int.add(var1);
            return var1;
         } else {
            var1 = (int[])a.remove(a.size() - 1);
            int.add(var1);
            return var1;
         }
      } else if (var0 > if) {
         if = var0;
         for.clear();
         do.clear();
         var1 = new int[if];
         do.add(var1);
         return var1;
      } else if (for.isEmpty()) {
         var1 = new int[if];
         do.add(var1);
         return var1;
      } else {
         var1 = (int[])for.remove(for.size() - 1);
         do.add(var1);
         return var1;
      }
   }

   public static synchronized void if() {
      if (!for.isEmpty()) {
         for.remove(for.size() - 1);
      }

      if (!a.isEmpty()) {
         a.remove(a.size() - 1);
      }

      for.addAll(do);
      a.addAll(int);
      do.clear();
      int.clear();
   }

   public static synchronized String a() {
      return "cache: " + for.size() + ", tcache: " + a.size() + ", allocated: " + do.size() + ", tallocated: " + int.size();
   }
}
