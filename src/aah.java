import java.util.Comparator;

class aah implements Comparator {
   // $FF: synthetic field
   final aai a;

   aah(aai var1) {
      this.a = var1;
   }

   public int a(aag var1, aag var2) {
      if (var1 instanceof aae && var2 instanceof aaf) {
         return 1;
      } else if (var2 instanceof aae && var1 instanceof aaf) {
         return -1;
      } else if (var2.if() < var1.if()) {
         return -1;
      } else {
         return var2.if() > var1.if() ? 1 : 0;
      }
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((aag)var1, (aag)var2);
   }
}
