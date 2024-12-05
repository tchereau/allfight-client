import java.util.List;
import java.util.Map;

public final class lg extends l6 implements Comparable {
   private final String case;

   lg(String var1) {
      if (var1 == null) {
         throw new NullPointerException("Attempt to construct a JsonString with a null value.");
      } else {
         this.case = var1;
      }
   }

   public ln for() {
      return ln.byte;
   }

   public String a() {
      return this.case;
   }

   public Map if() {
      throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
   }

   public List do() {
      throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         lg var2 = (lg)var1;
         return this.case.equals(var2.case);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.case.hashCode();
   }

   public String toString() {
      return "JsonStringNode value:[" + this.case + "]";
   }

   public int a(lg var1) {
      return this.case.compareTo(var1.case);
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((lg)var1);
   }
}
