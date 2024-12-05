class zd {
   private String if;
   private boolean a;
   private int for;
   private double do;

   public zd(String var1) {
      this.a(var1);
   }

   public void a(String var1) {
      this.if = var1;
      this.a = Boolean.parseBoolean(var1);

      try {
         this.for = Integer.parseInt(var1);
      } catch (NumberFormatException var4) {
      }

      try {
         this.do = Double.parseDouble(var1);
      } catch (NumberFormatException var3) {
      }

   }

   public String a() {
      return this.if;
   }

   public boolean if() {
      return this.a;
   }
}
