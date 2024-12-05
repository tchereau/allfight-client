public final class ld extends Exception {
   private final int if;
   private final int a;

   ld(String var1, k9 var2) {
      super("At line " + var2.a() + ", column " + var2.if() + ":  " + var1);
      this.if = var2.if();
      this.a = var2.a();
   }

   ld(String var1, Throwable var2, k9 var3) {
      super("At line " + var3.a() + ", column " + var3.if() + ":  " + var1, var2);
      this.if = var3.if();
      this.a = var3.a();
   }
}
