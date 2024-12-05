public class zr extends z3 {
   private static final String[] t = new String[]{"all", "fire", "fall", "explosion", "projectile"};
   private static final int[] s = new int[]{1, 10, 5, 5, 3};
   private static final int[] r = new int[]{11, 8, 6, 8, 6};
   private static final int[] q = new int[]{20, 12, 10, 12, 15};
   public final int p;

   public zr(int var1, int var2, int var3) {
      super(var1, var2, z2.case);
      this.p = var3;
      if (var3 == 2) {
         this.goto = z2.byte;
      }

   }

   public int if(int var1) {
      return s[this.p] + (var1 - 1) * r[this.p];
   }

   public int a(int var1) {
      return this.if(var1) + q[this.p];
   }

   public int do() {
      return 4;
   }

   public int a(int var1, ai4 var2) {
      if (var2.for()) {
         return 0;
      } else {
         float var3 = (float)(6 + var1 * var1) / 3.0F;
         if (this.p == 0) {
            return ajs.new(var3 * 0.75F);
         } else if (this.p == 1 && var2.do()) {
            return ajs.new(var3 * 1.25F);
         } else if (this.p == 2 && var2 == ai4.c) {
            return ajs.new(var3 * 2.5F);
         } else if (this.p == 3 && var2.long()) {
            return ajs.new(var3 * 1.5F);
         } else {
            return this.p == 4 && var2.int() ? ajs.new(var3 * 1.5F) : 0;
         }
      }
   }

   public String for() {
      return "enchantment.protect." + t[this.p];
   }

   public boolean a(z3 var1) {
      if (var1 instanceof zr) {
         zr var2 = (zr)var1;
         if (var2.p == this.p) {
            return false;
         } else {
            return this.p == 2 || var2.p == 2;
         }
      } else {
         return super.a(var1);
      }
   }

   public static int a(aiw var0, int var1) {
      int var2 = z1.a(z3.k.a, var0.as());
      if (var2 > 0) {
         var1 -= ajs.new((float)var1 * (float)var2 * 0.15F);
      }

      return var1;
   }

   public static double a(aiw var0, double var1) {
      int var3 = z1.a(z3.i.a, var0.as());
      if (var3 > 0) {
         var1 -= (double)ajs.a(var1 * (double)((float)var3 * 0.15F));
      }

      return var1;
   }
}
