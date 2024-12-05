import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class me implements l5 {
   private final List do = new LinkedList();

   me() {
   }

   public me a(l5 var1) {
      this.do.add(var1);
      return this;
   }

   public lh do() {
      LinkedList var1 = new LinkedList();
      Iterator var2 = this.do.iterator();

      while(var2.hasNext()) {
         l5 var3 = (l5)var2.next();
         var1.add(var3.a());
      }

      return lx.a((Iterable)var1);
   }

   // $FF: synthetic method
   public l6 a() {
      return this.do();
   }
}
