import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

final class lm extends l6 {
   private static final Pattern for = Pattern.compile("(-?)(0|([1-9]([0-9]*)))(\\.[0-9]+)?((e|E)(\\+|-)?[0-9]+)?");
   private final String do;

   lm(String var1) {
      if (var1 == null) {
         throw new NullPointerException("Attempt to construct a JsonNumber with a null value.");
      } else if (!for.matcher(var1).matches()) {
         throw new IllegalArgumentException("Attempt to construct a JsonNumber with a String [" + var1 + "] that does not match the JSON number specification.");
      } else {
         this.do = var1;
      }
   }

   public ln for() {
      return ln.try;
   }

   public String a() {
      return this.do;
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
         lm var2 = (lm)var1;
         return this.do.equals(var2.do);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.do.hashCode();
   }

   public String toString() {
      return "JsonNumberNode value:[" + this.do + "]";
   }
}
