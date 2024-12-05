public class ol extends n4 implements ar0 {
   private int tj = 0;
   private String ti = "";
   private String tk = "@";

   public void E(String var1) {
      this.ti = var1;
      this.case();
   }

   public String gF() {
      return this.ti;
   }

   public int do(y6 var1) {
      if (var1.goto) {
         return 0;
      } else {
         net.minecraft.a.a var2 = net.minecraft.a.a.g2();
         if (var2 != null && var2.hF()) {
            ar1 var3 = var2.gM();
            return var3.a(this, this.ti);
         } else {
            return 0;
         }
      }
   }

   public String do() {
      return this.tk;
   }

   public void D(String var1) {
      this.tk = var1;
   }

   public void a(String var1) {
   }

   public boolean a(int var1, String var2) {
      return var1 <= 2;
   }

   public String a(String var1, Object... var2) {
      return var1;
   }

   public void do(aqv var1) {
      super.do(var1);
      var1.a("Command", this.ti);
      var1.a("SuccessCount", this.tj);
      var1.a("CustomName", this.tk);
   }

   public void a(aqv var1) {
      super.a(var1);
      this.ti = var1.new("Command");
      this.tj = var1.goto("SuccessCount");
      if (var1.try("CustomName")) {
         this.tk = var1.new("CustomName");
      }

   }

   public apg for() {
      return new apg(this.new, this.int, this.for);
   }

   public an7 char() {
      aqv var1 = new aqv();
      this.do(var1);
      return new anc(this.new, this.int, this.for, 2, var1);
   }

   public int gE() {
      return this.tj;
   }

   public void aQ(int var1) {
      this.tj = var1;
   }
}
