public class aaa extends z3 {
   public aaa(int var1, int var2) {
      super(var1, var2, z2.if);
      this.a("arrowDamage");
   }

   public int if(int var1) {
      return 1 + (var1 - 1) * 10;
   }

   public int a(int var1) {
      return this.if(var1) + 15;
   }

   public int do() {
      return 5;
   }
}
