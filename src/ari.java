public class ari extends RuntimeException {
   private Object[] a;

   public ari(String var1, Object... var2) {
      super(var1);
      this.a = var2;
   }

   public Object[] a() {
      return this.a;
   }
}
