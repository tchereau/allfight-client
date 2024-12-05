import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class gk extends gg {
   public List do;

   public static gk if(String var0) {
      gk var1 = new gk();
      var1.do = new ArrayList();

      try {
         lh var2 = (new mh()).a(var0);
         if (var2.if(new Object[]{"servers"})) {
            Iterator var3 = var2.int(new Object[]{"servers"}).iterator();

            while(var3.hasNext()) {
               l6 var4 = (l6)var3.next();
               var1.do.add(gm.a(var4));
            }
         }
      } catch (ld var5) {
      } catch (IllegalArgumentException var6) {
      }

      return var1;
   }
}
