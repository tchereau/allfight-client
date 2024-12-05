import java.util.Comparator;

final class nm implements Comparator {
   public int a(nn var1, nn var2) {
      if (var1.for() > var2.for()) {
         return 1;
      } else {
         return var1.for() < var2.for() ? -1 : 0;
      }
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((nn)var1, (nn)var2);
   }
}
