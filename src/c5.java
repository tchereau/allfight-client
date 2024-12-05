public class c5 {
   private int if;
   private int a;
   private int for;
   private int do;

   public c5(int var1, int var2, int var3, int var4) {
      this.if = var1;
      this.a = var2;
      this.for = var3;
      this.do = var4;
   }

   public c5 a(c5 var1) {
      int var2 = this.if;
      int var3 = this.a;
      int var4 = this.if + this.for;
      int var5 = this.a + this.do;
      int var6 = var1.do();
      int var7 = var1.if();
      int var8 = var6 + var1.a();
      int var9 = var7 + var1.for();
      this.if = Math.max(var2, var6);
      this.a = Math.max(var3, var7);
      this.for = Math.max(0, Math.min(var4, var8) - this.if);
      this.do = Math.max(0, Math.min(var5, var9) - this.a);
      return this;
   }

   public int do() {
      return this.if;
   }

   public int if() {
      return this.a;
   }

   public int a() {
      return this.for;
   }

   public int for() {
      return this.do;
   }
}
