import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class gn {
   public List if;
   public go a;

   public static gn a(String var0) {
      gn var1 = new gn();
      var1.if = new ArrayList();

      try {
         lh var2 = (new mh()).a(var0);
         if (var2.if(new Object[]{"locations"})) {
            Iterator var3 = var2.int(new Object[]{"locations"}).iterator();

            while(var3.hasNext()) {
               l6 var4 = (l6)var3.next();
               var1.if.add(go.if(var4));
            }
         }

         var1.a = go.a(var2, "suggestion");
      } catch (ld var5) {
      } catch (IllegalArgumentException var6) {
      }

      return var1;
   }
}
