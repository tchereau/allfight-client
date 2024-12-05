import java.util.Random;

public class qr extends pa {
   protected qr(int var1) {
      super(var1, ts.j);
      this.a(acn.c);
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      this.int((yy)var1, var2, var3, var4);
      return super.int(var1, var2, var3, var4);
   }

   public nw new(y6 var1, int var2, int var3, int var4) {
      this.int((yy)var1, var2, var3, var4);
      return super.new(var1, var2, var3, var4);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      this.k(var1.for(var2, var3, var4));
   }

   public void k(int var1) {
      float var3 = 0.125F;
      if (var1 == 2) {
         this.a(0.0F, 0.0F, 1.0F - var3, 1.0F, 1.0F, 1.0F);
      }

      if (var1 == 3) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var3);
      }

      if (var1 == 4) {
         this.a(1.0F - var3, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if (var1 == 5) {
         this.a(0.0F, 0.0F, 0.0F, var3, 1.0F, 1.0F);
      }

   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public int new() {
      return 8;
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      if (var1.try(var2 - 1, var3, var4)) {
         return true;
      } else if (var1.try(var2 + 1, var3, var4)) {
         return true;
      } else if (var1.try(var2, var3, var4 - 1)) {
         return true;
      } else {
         return var1.try(var2, var3, var4 + 1);
      }
   }

   public int a(y6 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var10 = var9;
      if ((var9 == 0 || var5 == 2) && var1.try(var2, var3, var4 + 1)) {
         var10 = 2;
      }

      if ((var10 == 0 || var5 == 3) && var1.try(var2, var3, var4 - 1)) {
         var10 = 3;
      }

      if ((var10 == 0 || var5 == 4) && var1.try(var2 + 1, var3, var4)) {
         var10 = 4;
      }

      if ((var10 == 0 || var5 == 5) && var1.try(var2 - 1, var3, var4)) {
         var10 = 5;
      }

      return var10;
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.for(var2, var3, var4);
      boolean var7 = false;
      if (var6 == 2 && var1.try(var2, var3, var4 + 1)) {
         var7 = true;
      }

      if (var6 == 3 && var1.try(var2, var3, var4 - 1)) {
         var7 = true;
      }

      if (var6 == 4 && var1.try(var2 + 1, var3, var4)) {
         var7 = true;
      }

      if (var6 == 5 && var1.try(var2 - 1, var3, var4)) {
         var7 = true;
      }

      if (!var7) {
         this.a(var1, var2, var3, var4, var6, 0);
         var1.o(var2, var3, var4);
      }

      super.new(var1, var2, var3, var4, var5);
   }

   public int a(Random var1) {
      return 1;
   }
}
