public class wd {
   private int if;
   private int a;
   private int for;
   private int do;

   public wd(int var1, int var2) {
      this.if = 1;
      this.a = 0;
      this.for = 0;
      this.do = 0;
      this.if = var1;
      this.a = var2;
   }

   public wd(int var1, int var2, int var3) {
      this(var1, var2);
      this.for = var3;
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

   public void a(int var1) {
      this.do = var1;
   }

   public String toString() {
      String var1 = Integer.toString(this.a);
      if (this.if > 1) {
         var1 = this.if + "x" + var1;
      }

      if (this.for > 0) {
         var1 = var1 + ":" + this.for;
      }

      return var1;
   }
}
