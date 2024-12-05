import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class y {
   private Random int = new Random();
   private Map for = new HashMap();
   private List do = new ArrayList();
   public int if = 0;
   public boolean a = true;

   public ab a(String var1, File var2) {
      try {
         return this.a(var1, var2.toURI().toURL());
      } catch (MalformedURLException var4) {
         var4.printStackTrace();
         throw new RuntimeException(var4);
      }
   }

   public ab a(String var1, URL var2) {
      String var3 = var1;
      var1 = var1.substring(0, var1.indexOf("."));
      if (this.a) {
         while(Character.isDigit(var1.charAt(var1.length() - 1))) {
            var1 = var1.substring(0, var1.length() - 1);
         }
      }

      var1 = var1.replaceAll("/", ".");
      if (!this.for.containsKey(var1)) {
         this.for.put(var1, new ArrayList());
      }

      ab var4 = new ab(var3, var2);
      ((List)this.for.get(var1)).add(var4);
      this.do.add(var4);
      ++this.if;
      return var4;
   }

   public ab a(String var1) {
      List var2 = (List)this.for.get(var1);
      return var2 == null ? null : (ab)var2.get(this.int.nextInt(var2.size()));
   }

   public ab a() {
      return this.do.isEmpty() ? null : (ab)this.do.get(this.int.nextInt(this.do.size()));
   }
}
