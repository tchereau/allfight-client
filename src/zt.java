public class zt extends z3 {
   protected zt(int var1, int var2, z2 var3) {
      super(var1, var2, var3);
      this.a("lootBonus");
      if (var3 == z2.do) {
         this.a("lootBonusDigger");
      }

   }

   public int if(int var1) {
      return 15 + (var1 - 1) * 9;
   }

   public int a(int var1) {
      return super.if(var1) + 50;
   }

   public int do() {
      return 3;
   }

   public boolean a(z3 var1) {
      return super.a(var1) && var1.a != byte.a;
   }
}
