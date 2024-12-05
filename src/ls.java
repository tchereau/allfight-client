import java.util.Map;

final class ls extends le {
   // $FF: synthetic field
   final lg for;

   ls(lg var1) {
      this.for = var1;
   }

   public boolean a(Map var1) {
      return var1.containsKey(this.for);
   }

   public String a() {
      return "\"" + this.for.a() + "\"";
   }

   public l6 if(Map var1) {
      return (l6)var1.get(this.for);
   }

   public String toString() {
      return "a field called [\"" + this.for.a() + "\"]";
   }

   // $FF: synthetic method
   public Object do(Object var1) {
      return this.if((Map)var1);
   }
}
