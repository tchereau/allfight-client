import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class mg extends lh {
   private final List if;

   mg(Iterable var1) {
      this.if = a(var1);
   }

   public ln for() {
      return ln.a;
   }

   public List do() {
      return new ArrayList(this.if);
   }

   public String a() {
      throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
   }

   public Map if() {
      throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         mg var2 = (mg)var1;
         return this.if.equals(var2.if);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.if.hashCode();
   }

   public String toString() {
      return "JsonArray elements:[" + this.if + "]";
   }

   private static List a(Iterable var0) {
      return new mf(var0);
   }
}
