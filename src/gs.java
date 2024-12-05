public class gs extends gt {
   public gs(String var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public gs case() {
      try {
         this.if.setDoOutput(true);
         this.if.setRequestMethod("DELETE");
         this.if.connect();
         return this;
      } catch (Exception var2) {
         throw new gu("Failed URL: " + this.a, var2);
      }
   }

   // $FF: synthetic method
   public gt a() {
      return this.case();
   }
}
