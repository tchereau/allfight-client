import java.util.LinkedList;
import java.util.List;

public final class l0 extends lz {
   final mi if;
   final List a;

   static lz a(mi var0) {
      return new l0(var0, new LinkedList());
   }

   static lz if(l0 var0, lw var1) {
      LinkedList var2 = new LinkedList(var0.a);
      var2.add(var1);
      return new l0(var0.if, var2);
   }

   static lz a(l0 var0, lw var1) {
      LinkedList var2 = new LinkedList();
      var2.add(var1);
      return new l0(var0.if, var2);
   }

   private l0(mi var1, List var2) {
      super("Failed to match any JSON node at [" + a(var2) + "]");
      this.if = var1;
      this.a = var2;
   }

   static String a(List var0) {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = var0.size() - 1; var2 >= 0; --var2) {
         var1.append(((lw)var0.get(var2)).a());
         if (var2 != 0) {
            var1.append(".");
         }
      }

      return var1.toString();
   }

   public String toString() {
      return "JsonNodeDoesNotMatchJsonNodeSelectorException{failedNode=" + this.if + ", failPath=" + this.a + '}';
   }
}
