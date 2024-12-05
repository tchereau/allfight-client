import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class xo {
   private static final Map a = new HashMap();

   public static synchronized xq if(File var0, int var1, int var2) {
      File var3 = new File(var0, "region");
      File var4 = new File(var3, "r." + (var1 >> 5) + "." + (var2 >> 5) + ".mca");
      xq var5 = (xq)a.get(var4);
      if (var5 != null) {
         return var5;
      } else {
         if (!var3.exists()) {
            var3.mkdirs();
         }

         if (a.size() >= 256) {
            a();
         }

         xq var6 = new xq(var4);
         a.put(var4, var6);
         return var6;
      }
   }

   public static synchronized void a() {
      Iterator var0 = a.values().iterator();

      while(var0.hasNext()) {
         xq var1 = (xq)var0.next();

         try {
            if (var1 != null) {
               var1.a();
            }
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

      a.clear();
   }

   public static DataInputStream do(File var0, int var1, int var2) {
      xq var3 = if(var0, var1, var2);
      return var3.int(var1 & 31, var2 & 31);
   }

   public static DataOutputStream a(File var0, int var1, int var2) {
      xq var3 = if(var0, var1, var2);
      return var3.if(var1 & 31, var2 & 31);
   }
}
