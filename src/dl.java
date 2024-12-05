import java.util.Comparator;

public class dl implements Comparator {
   private aig a;

   public dl(aig var1) {
      this.a = var1;
   }

   public int a(dm var1, dm var2) {
      if (var1.k && !var2.k) {
         return 1;
      } else if (var2.k && !var1.k) {
         return -1;
      } else {
         double var3 = (double)var1.a((aiw)this.a);
         double var5 = (double)var2.a((aiw)this.a);
         if (var3 < var5) {
            return 1;
         } else if (var3 > var5) {
            return -1;
         } else {
            return var1.d < var2.d ? 1 : -1;
         }
      }
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((dm)var1, (dm)var2);
   }
}
