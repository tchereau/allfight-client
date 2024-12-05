class apm {
   private final String if;
   private final String a;

   public apm(String var1, Object var2) {
      this.if = var1;
      if (var2 == null) {
         this.a = "~~NULL~~";
      } else if (var2 instanceof Throwable) {
         Throwable var3 = (Throwable)var2;
         this.a = "~~ERROR~~ " + var3.getClass().getSimpleName() + ": " + var3.getMessage();
      } else {
         this.a = var2.toString();
      }

   }

   public String if() {
      return this.if;
   }

   public String a() {
      return this.a;
   }
}
