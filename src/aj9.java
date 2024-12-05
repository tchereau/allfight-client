import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class aj9 {
   public static aj9 if = new aj9();
   private Map a = new HashMap();

   private aj9() {
      try {
         BufferedReader var1 = new BufferedReader(new InputStreamReader(aj9.class.getResourceAsStream("/achievement/map.txt")));

         String var2;
         while((var2 = var1.readLine()) != null) {
            String[] var3 = var2.split(",");
            int var4 = Integer.parseInt(var3[0]);
            this.a.put(var4, var3[1]);
         }

         var1.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public static String a(int var0) {
      return (String)if.a.get(var0);
   }
}
