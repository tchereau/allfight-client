import java.util.ArrayList;
import java.util.Iterator;

final class mf extends ArrayList {
   // $FF: synthetic field
   final Iterable a;

   mf(Iterable var1) {
      this.a = var1;
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         l6 var3 = (l6)var2.next();
         this.add(var3);
      }

   }
}
