import java.util.Random;

public class qj extends pa {
   private ajd dy;

   protected qj(int var1) {
      super(var1, ts.long);
      this.a((acn)acn.d);
   }

   public ajd if(int var1, int var2) {
      return var1 != 1 && var1 != 0 ? this.an : this.dy;
   }

   public int a(int var1, Random var2, int var3) {
      return abr.aV.A;
   }

   public int a(Random var1) {
      return 3 + var1.nextInt(5);
   }

   public int a(int var1, Random var2) {
      int var3 = this.a(var2) + var2.nextInt(1 + var1);
      if (var3 > 9) {
         var3 = 9;
      }

      return var3;
   }

   public void a(ajc var1) {
      this.an = var1.a("melon_side");
      this.dy = var1.a("melon_top");
   }
}
