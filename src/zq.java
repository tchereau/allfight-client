import java.util.Random;

public class zq extends z3 {
   public zq(int var1, int var2) {
      super(var1, var2, z2.new);
      this.a("thorns");
   }

   public int if(int var1) {
      return 10 + 20 * (var1 - 1);
   }

   public int a(int var1) {
      return super.if(var1) + 50;
   }

   public int do() {
      return 3;
   }

   public boolean a(abp var1) {
      return var1.d() instanceof ac4 ? true : super.a(var1);
   }

   public static boolean a(int var0, Random var1) {
      if (var0 <= 0) {
         return false;
      } else {
         return var1.nextFloat() < 0.15F * (float)var0;
      }
   }

   public static int if(int var0, Random var1) {
      return var0 > 10 ? var0 - 10 : 1 + var1.nextInt(4);
   }

   public static void a(aiw var0, aig var1, Random var2) {
      int var3 = z1.do(var1);
      abp var4 = z1.a(z3.e, var1);
      if (a(var3, var2)) {
         var0.a(ai4.a((aiw)var1), if(var3, var2));
         var0.a("damage.thorns", 0.5F, 1.0F);
         if (var4 != null) {
            var4.a(3, (aig)var1);
         }
      } else if (var4 != null) {
         var4.a(1, (aig)var1);
      }

   }
}
