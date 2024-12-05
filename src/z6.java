public class z6 extends z3 {
   private static final String[] y = new String[]{"all", "undead", "arthropods"};
   private static final int[] x = new int[]{1, 5, 5};
   private static final int[] w = new int[]{11, 8, 8};
   private static final int[] v = new int[]{20, 20, 20};
   public final int u;

   public z6(int var1, int var2, int var3) {
      super(var1, var2, z2.for);
      this.u = var3;
   }

   public int if(int var1) {
      return x[this.u] + (var1 - 1) * w[this.u];
   }

   public int a(int var1) {
      return this.if(var1) + v[this.u];
   }

   public int do() {
      return 5;
   }

   public int a(int var1, aig var2) {
      if (this.u == 0) {
         return ajs.new((float)var1 * 2.75F);
      } else if (this.u == 1 && var2.cn() == ah8.a) {
         return ajs.new((float)var1 * 4.5F);
      } else {
         return this.u == 2 && var2.cn() == ah8.for ? ajs.new((float)var1 * 4.5F) : 0;
      }
   }

   public String for() {
      return "enchantment.damage." + y[this.u];
   }

   public boolean a(z3 var1) {
      return !(var1 instanceof z6);
   }

   public boolean a(abp var1) {
      return var1.d() instanceof abt ? true : super.a(var1);
   }
}
