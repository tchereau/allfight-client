import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class lk extends lh {
   private final Map a;

   lk(Map var1) {
      this.a = new HashMap(var1);
   }

   public Map if() {
      return new HashMap(this.a);
   }

   public ln for() {
      return ln.if;
   }

   public String a() {
      throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
   }

   public List do() {
      throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         lk var2 = (lk)var1;
         return this.a.equals(var2.a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }

   public String toString() {
      return "JsonObject fields:[" + this.a + "]";
   }
}
