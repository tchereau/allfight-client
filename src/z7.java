public class z7 extends z3 {
   public z7(int var1, int var2) {
      super(var1, var2, z2.if);
      this.a("arrowKnockback");
   }

   public int if(int var1) {
      return 12 + (var1 - 1) * 20;
   }

   public int a(int var1) {
      return this.if(var1) + 25;
   }

   public int do() {
      return 2;
   }
}
