import java.util.Comparator;

class iq implements Comparator {
   // $FF: synthetic field
   final is if;
   // $FF: synthetic field
   final ir a;

   iq(ir var1, is var2) {
      this.a = var1;
      this.if = var2;
   }

   public int a(akh var1, akh var2) {
      int var3 = var1.try();
      int var4 = var2.try();
      akf var5 = null;
      akf var6 = null;
      if (this.a.m == 2) {
         var5 = aka.void[var3];
         var6 = aka.void[var4];
      } else if (this.a.m == 0) {
         var5 = aka.goto[var3];
         var6 = aka.goto[var4];
      } else if (this.a.m == 1) {
         var5 = aka.char[var3];
         var6 = aka.char[var4];
      }

      if (var5 != null || var6 != null) {
         if (var5 == null) {
            return 1;
         }

         if (var6 == null) {
            return -1;
         }

         int var7 = is.case(this.a.q).a(var5);
         int var8 = is.case(this.a.q).a(var6);
         if (var7 != var8) {
            return (var7 - var8) * this.a.l;
         }
      }

      return var3 - var4;
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((akh)var1, (akh)var2);
   }
}
