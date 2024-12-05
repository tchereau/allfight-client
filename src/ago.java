import java.util.Comparator;

public class ago implements Comparator {
   private aiw a;
   // $FF: synthetic field
   final agp if;

   public ago(agp var1, aiw var2) {
      this.if = var1;
      this.a = var2;
   }

   public int a(aiw var1, aiw var2) {
      double var3 = this.a.for(var1);
      double var5 = this.a.for(var2);
      if (var3 < var5) {
         return -1;
      } else {
         return var3 > var5 ? 1 : 0;
      }
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((aiw)var1, (aiw)var2);
   }
}
