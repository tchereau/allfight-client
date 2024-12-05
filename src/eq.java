public class eq {
   public String else;
   public String char;
   public String case;
   public String byte;
   public long try;
   public int new = 60;
   public String int = "1.5.1";
   public boolean for = false;
   private boolean do = true;
   private boolean if = false;
   private boolean a = false;

   public eq(String var1, String var2) {
      this.else = var1;
      this.char = var2;
   }

   public aqv do() {
      aqv var1 = new aqv();
      var1.a("name", this.else);
      var1.a("ip", this.char);
      var1.a("hideAddress", this.a);
      if (!this.do) {
         var1.a("acceptTextures", this.if);
      }

      return var1;
   }

   public boolean for() {
      return this.if;
   }

   public boolean if() {
      return this.do;
   }

   public void if(boolean var1) {
      this.if = var1;
      this.do = false;
   }

   public boolean a() {
      return this.a;
   }

   public void a(boolean var1) {
      this.a = var1;
   }

   public static eq a(aqv var0) {
      eq var1 = new eq(var0.new("name"), var0.new("ip"));
      var1.a = var0.if("hideAddress");
      if (var0.try("acceptTextures")) {
         var1.if(var0.if("acceptTextures"));
      }

      return var1;
   }
}
