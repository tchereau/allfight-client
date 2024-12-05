import java.util.Comparator;

class apy implements Comparator {
   // $FF: synthetic field
   final ap0 a;

   apy(ap0 var1) {
      this.a = var1;
   }

   public int a(Class var1, Class var2) {
      String var3 = var1.getPackage() == null ? "" : var1.getPackage().getName();
      String var4 = var2.getPackage() == null ? "" : var2.getPackage().getName();
      return var3.compareTo(var4);
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((Class)var1, (Class)var2);
   }
}
