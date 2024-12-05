public class np {
   private final nl if;
   private final String a;
   private final nh for;
   private String do;

   public np(nl var1, String var2, nh var3) {
      this.if = var1;
      this.a = var2;
      this.for = var3;
      this.do = var2;
   }

   public nl do() {
      return this.if;
   }

   public String if() {
      return this.a;
   }

   public nh a() {
      return this.for;
   }

   public String for() {
      return this.do;
   }

   public void a(String var1) {
      this.do = var1;
      this.if.for(this);
   }
}
