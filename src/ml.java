final class ml {
   private final String a;

   ml(String var1) {
      this.a = var1.replace("\\", "\\\\").replace("\"", "\\\"").replace("\b", "\\b").replace("\f", "\\f").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
   }

   public String toString() {
      return this.a;
   }
}
