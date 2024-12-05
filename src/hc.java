import java.util.Comparator;

class hc implements Comparator {
   private final String a;
   // $FF: synthetic field
   final hd if;

   private hc(hd var1, String var2) {
      this.if = var1;
      this.a = var2;
   }

   public int a(gm var1, gm var2) {
      if (var1.c.equals(var2.c)) {
         if (var1.g < var2.g) {
            return 1;
         } else {
            return var1.g > var2.g ? -1 : 0;
         }
      } else if (var1.c.equals(this.a)) {
         return -1;
      } else if (var2.c.equals(this.a)) {
         return 1;
      } else {
         if (var1.d.equals("CLOSED") || var2.d.equals("CLOSED")) {
            if (var1.d.equals("CLOSED")) {
               return 1;
            }

            if (var2.d.equals("CLOSED")) {
               return 0;
            }
         }

         if (var1.g < var2.g) {
            return 1;
         } else {
            return var1.g > var2.g ? -1 : 0;
         }
      }
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((gm)var1, (gm)var2);
   }

   // $FF: synthetic method
   hc(hd var1, String var2, he var3) {
      this(var1, var2);
   }
}
