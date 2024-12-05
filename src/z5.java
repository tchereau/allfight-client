import java.util.Random;

public class z5 extends z3 {
   protected z5(int var1, int var2) {
      super(var1, var2, z2.do);
      this.a("durability");
   }

   public int if(int var1) {
      return 5 + (var1 - 1) * 8;
   }

   public int a(int var1) {
      return super.if(var1) + 50;
   }

   public int do() {
      return 3;
   }

   public boolean a(abp var1) {
      return var1.else() ? true : super.a(var1);
   }

   public static boolean a(abp var0, int var1, Random var2) {
      if (var0.d() instanceof ac4 && var2.nextFloat() < 0.6F) {
         return false;
      } else {
         return var2.nextInt(var1 + 1) > 0;
      }
   }
}
