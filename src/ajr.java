import java.util.HashMap;
import java.util.Map;

public class ajr {
   public static boolean if = true;
   private static final Map a = new HashMap();
   private static final Map for = new HashMap();
   private static final Object do = new Object();

   public static void a(int var0, long var1) {
      if (if) {
         synchronized(do) {
            if (a.containsKey(var0)) {
               a.put(var0, (Long)a.get(var0) + 1L);
               for.put(var0, (Long)for.get(var0) + var1);
            } else {
               a.put(var0, 1L);
               for.put(var0, var1);
            }

         }
      }
   }
}
