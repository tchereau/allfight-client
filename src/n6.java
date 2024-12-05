public class n6 extends n4 {
   private int f;
   private int e;
   private String g = "";

   public void do(aqv var1) {
      super.do(var1);
      var1.a("SkullType", (byte)(this.f & 255));
      var1.a("Rot", (byte)(this.e & 255));
      var1.a("ExtraType", this.g);
   }

   public void a(aqv var1) {
      super.a(var1);
      this.f = var1.else("SkullType");
      this.e = var1.else("Rot");
      if (var1.try("ExtraType")) {
         this.g = var1.new("ExtraType");
      }

   }

   public an7 char() {
      aqv var1 = new aqv();
      this.do(var1);
      return new anc(this.new, this.int, this.for, 4, var1);
   }

   public void if(int var1, String var2) {
      this.f = var1;
      this.g = var2;
   }

   public int l() {
      return this.f;
   }

   public int k() {
      return this.e;
   }

   public void a(int var1) {
      this.e = var1;
   }

   public String j() {
      return this.g;
   }
}
