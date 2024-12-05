import java.util.Random;

public class o3 extends pa {
   protected o3(int var1) {
      super(var1, ts.j);
      this.a(true);
      this.a(acn.c);
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public int new() {
      return 2;
   }

   private boolean b(y6 var1, int var2, int var3, int var4) {
      if (var1.case(var2, var3, var4)) {
         return true;
      } else {
         int var5 = var1.new(var2, var3, var4);
         return var5 == pa.aZ.void || var5 == pa.bW.void || var5 == pa.aD.void || var5 == pa.K.void;
      }
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      if (var1.do(var2 - 1, var3, var4, true)) {
         return true;
      } else if (var1.do(var2 + 1, var3, var4, true)) {
         return true;
      } else if (var1.do(var2, var3, var4 - 1, true)) {
         return true;
      } else if (var1.do(var2, var3, var4 + 1, true)) {
         return true;
      } else {
         return this.b(var1, var2, var3 - 1, var4);
      }
   }

   public int a(y6 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var10 = var9;
      if (var5 == 1 && this.b(var1, var2, var3 - 1, var4)) {
         var10 = 5;
      }

      if (var5 == 2 && var1.do(var2, var3, var4 + 1, true)) {
         var10 = 4;
      }

      if (var5 == 3 && var1.do(var2, var3, var4 - 1, true)) {
         var10 = 3;
      }

      if (var5 == 4 && var1.do(var2 + 1, var3, var4, true)) {
         var10 = 2;
      }

      if (var5 == 5 && var1.do(var2 - 1, var3, var4, true)) {
         var10 = 1;
      }

      return var10;
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      super.if(var1, var2, var3, var4, var5);
      if (var1.for(var2, var3, var4) == 0) {
         this.for(var1, var2, var3, var4);
      }

   }

   public void for(y6 var1, int var2, int var3, int var4) {
      if (var1.for(var2, var3, var4) == 0) {
         if (var1.do(var2 - 1, var3, var4, true)) {
            var1.do(var2, var3, var4, 1, 2);
         } else if (var1.do(var2 + 1, var3, var4, true)) {
            var1.do(var2, var3, var4, 2, 2);
         } else if (var1.do(var2, var3, var4 - 1, true)) {
            var1.do(var2, var3, var4, 3, 2);
         } else if (var1.do(var2, var3, var4 + 1, true)) {
            var1.do(var2, var3, var4, 4, 2);
         } else if (this.b(var1, var2, var3 - 1, var4)) {
            var1.do(var2, var3, var4, 5, 2);
         }
      }

      this.c(var1, var2, var3, var4);
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      this.long(var1, var2, var3, var4, var5);
   }

   protected boolean long(y6 var1, int var2, int var3, int var4, int var5) {
      if (this.c(var1, var2, var3, var4)) {
         int var6 = var1.for(var2, var3, var4);
         boolean var7 = false;
         if (!var1.do(var2 - 1, var3, var4, true) && var6 == 1) {
            var7 = true;
         }

         if (!var1.do(var2 + 1, var3, var4, true) && var6 == 2) {
            var7 = true;
         }

         if (!var1.do(var2, var3, var4 - 1, true) && var6 == 3) {
            var7 = true;
         }

         if (!var1.do(var2, var3, var4 + 1, true) && var6 == 4) {
            var7 = true;
         }

         if (!this.b(var1, var2, var3 - 1, var4) && var6 == 5) {
            var7 = true;
         }

         if (var7) {
            this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
            var1.o(var2, var3, var4);
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   protected boolean c(y6 var1, int var2, int var3, int var4) {
      if (!this.case(var1, var2, var3, var4)) {
         if (var1.new(var2, var3, var4) == this.void) {
            this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
            var1.o(var2, var3, var4);
         }

         return false;
      } else {
         return true;
      }
   }

   public nt a(y6 var1, int var2, int var3, int var4, nr var5, nr var6) {
      int var7 = var1.for(var2, var3, var4) & 7;
      float var8 = 0.15F;
      if (var7 == 1) {
         this.a(0.0F, 0.2F, 0.5F - var8, var8 * 2.0F, 0.8F, 0.5F + var8);
      } else if (var7 == 2) {
         this.a(1.0F - var8 * 2.0F, 0.2F, 0.5F - var8, 1.0F, 0.8F, 0.5F + var8);
      } else if (var7 == 3) {
         this.a(0.5F - var8, 0.2F, 0.0F, 0.5F + var8, 0.8F, var8 * 2.0F);
      } else if (var7 == 4) {
         this.a(0.5F - var8, 0.2F, 1.0F - var8 * 2.0F, 0.5F + var8, 0.8F, 1.0F);
      } else {
         var8 = 0.1F;
         this.a(0.5F - var8, 0.0F, 0.5F - var8, 0.5F + var8, 0.6F, 0.5F + var8);
      }

      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.for(var2, var3, var4);
      double var7 = (double)((float)var2 + 0.5F);
      double var9 = (double)((float)var3 + 0.7F);
      double var11 = (double)((float)var4 + 0.5F);
      double var13 = 0.2199999988079071D;
      double var15 = 0.27000001072883606D;
      if (var6 == 1) {
         var1.a("smoke", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
         var1.a("flame", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
      } else if (var6 == 2) {
         var1.a("smoke", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
         var1.a("flame", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
      } else if (var6 == 3) {
         var1.a("smoke", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
         var1.a("flame", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
      } else if (var6 == 4) {
         var1.a("smoke", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
         var1.a("flame", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
      } else {
         var1.a("smoke", var7, var9, var11, 0.0D, 0.0D, 0.0D);
         var1.a("flame", var7, var9, var11, 0.0D, 0.0D, 0.0D);
      }

   }
}
