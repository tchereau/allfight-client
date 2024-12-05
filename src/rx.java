import java.util.Random;

public class rx extends pa {
   private ajd eO;
   private ajd eN;
   private ajd eP;

   protected rx(int var1) {
      super(var1, ts.char);
      this.a(true);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      this.a(var7, 0.0F, var6, 1.0F - var6, var8, 1.0F - var6);
   }

   public void try() {
      float var1 = 0.0625F;
      float var2 = 0.5F;
      this.a(var1, 0.0F, var1, 1.0F - var1, var2, 1.0F - var1);
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      return nw.if().a((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var6), (double)((float)(var2 + 1) - var6), (double)((float)var3 + var8 - var6), (double)((float)(var4 + 1) - var6));
   }

   public nw new(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      return nw.if().a((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var6), (double)((float)(var2 + 1) - var6), (double)((float)var3 + var8), (double)((float)(var4 + 1) - var6));
   }

   public ajd if(int var1, int var2) {
      if (var1 == 1) {
         return this.eO;
      } else if (var1 == 0) {
         return this.eN;
      } else {
         return var2 > 0 && var1 == 4 ? this.eP : this.an;
      }
   }

   public void a(ajc var1) {
      this.an = var1.a("cake_side");
      this.eP = var1.a("cake_inner");
      this.eO = var1.a("cake_top");
      this.eN = var1.a("cake_bottom");
   }

   public boolean if() {
      return false;
   }

   public boolean do() {
      return false;
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      this.if(var1, var2, var3, var4, var5);
      return true;
   }

   public void a(y6 var1, int var2, int var3, int var4, aek var5) {
      this.if(var1, var2, var3, var4, var5);
   }

   private void if(y6 var1, int var2, int var3, int var4, aek var5) {
      if (var5.e(false)) {
         var5.cA().a(2, 0.1F);
         int var6 = var1.for(var2, var3, var4) + 1;
         if (var6 >= 6) {
            var1.o(var2, var3, var4);
         } else {
            var1.do(var2, var3, var4, var6, 2);
         }
      }

   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      return !super.case(var1, var2, var3, var4) ? false : this.try(var1, var2, var3, var4);
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!this.try(var1, var2, var3, var4)) {
         var1.o(var2, var3, var4);
      }

   }

   public boolean try(y6 var1, int var2, int var3, int var4) {
      return var1.byte(var2, var3 - 1, var4).for();
   }

   public int a(Random var1) {
      return 0;
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return abr.a7.A;
   }
}
