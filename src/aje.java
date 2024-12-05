public class aje implements ajd {
   private final ajd if;
   private final boolean a;
   private final boolean do;

   public aje(ajd var1, boolean var2, boolean var3) {
      this.if = var1;
      this.a = var2;
      this.do = var3;
   }

   public int case() {
      return this.if.case();
   }

   public int try() {
      return this.if.try();
   }

   public float a() {
      return this.a ? this.if.byte() : this.if.a();
   }

   public float byte() {
      return this.a ? this.if.a() : this.if.byte();
   }

   public float if(double var1) {
      float var3 = this.byte() - this.a();
      return this.a() + var3 * ((float)var1 / 16.0F);
   }

   public float int() {
      return this.do ? this.if.int() : this.if.int();
   }

   public float do() {
      return this.do ? this.if.int() : this.if.do();
   }

   public float a(double var1) {
      float var3 = this.do() - this.int();
      return this.int() + var3 * ((float)var1 / 16.0F);
   }

   public String if() {
      return this.if.if();
   }

   public int new() {
      return this.if.new();
   }

   public int for() {
      return this.if.for();
   }
}
