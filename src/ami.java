import java.util.Comparator;

public class ami implements Comparator {
   private final apg a;

   public ami(apg var1) {
      this.a = var1;
   }

   public int a(ak2 var1, ak2 var2) {
      double var3 = var1.if((double)this.a.if, (double)this.a.a, (double)this.a.do);
      double var5 = var2.if((double)this.a.if, (double)this.a.a, (double)this.a.do);
      if (var3 < var5) {
         return -1;
      } else {
         return var3 > var5 ? 1 : 0;
      }
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((ak2)var1, (ak2)var2);
   }
}
