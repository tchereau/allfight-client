import java.util.List;
import java.util.Random;

public abstract class rz extends pa {
   private final boolean eS;

   protected rz(int var1, boolean var2) {
      super(var1, ts.j);
      this.a(true);
      this.a((acn)acn.b);
      this.eS = var2;
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      return null;
   }

   public int a(y6 var1) {
      return this.eS ? 30 : 20;
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public boolean for(y6 var1, int var2, int var3, int var4, int var5) {
      if (var5 == 2 && var1.try(var2, var3, var4 + 1)) {
         return true;
      } else if (var5 == 3 && var1.try(var2, var3, var4 - 1)) {
         return true;
      } else if (var5 == 4 && var1.try(var2 + 1, var3, var4)) {
         return true;
      } else {
         return var5 == 5 && var1.try(var2 - 1, var3, var4);
      }
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
      int var10 = var1.for(var2, var3, var4);
      int var11 = var10 & 8;
      var10 &= 7;
      if (var5 == 2 && var1.try(var2, var3, var4 + 1)) {
         var10 = 4;
      } else if (var5 == 3 && var1.try(var2, var3, var4 - 1)) {
         var10 = 3;
      } else if (var5 == 4 && var1.try(var2 + 1, var3, var4)) {
         var10 = 2;
      } else if (var5 == 5 && var1.try(var2 - 1, var3, var4)) {
         var10 = 1;
      } else {
         var10 = this.Q(var1, var2, var3, var4);
      }

      return var10 + var11;
   }

   private int Q(y6 var1, int var2, int var3, int var4) {
      if (var1.try(var2 - 1, var3, var4)) {
         return 1;
      } else if (var1.try(var2 + 1, var3, var4)) {
         return 2;
      } else if (var1.try(var2, var3, var4 - 1)) {
         return 3;
      } else {
         return var1.try(var2, var3, var4 + 1) ? 4 : 1;
      }
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (this.P(var1, var2, var3, var4)) {
         int var6 = var1.for(var2, var3, var4) & 7;
         boolean var7 = false;
         if (!var1.try(var2 - 1, var3, var4) && var6 == 1) {
            var7 = true;
         }

         if (!var1.try(var2 + 1, var3, var4) && var6 == 2) {
            var7 = true;
         }

         if (!var1.try(var2, var3, var4 - 1) && var6 == 3) {
            var7 = true;
         }

         if (!var1.try(var2, var3, var4 + 1) && var6 == 4) {
            var7 = true;
         }

         if (var7) {
            this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
            var1.o(var2, var3, var4);
         }
      }

   }

   private boolean P(y6 var1, int var2, int var3, int var4) {
      if (!this.case(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.o(var2, var3, var4);
         return false;
      } else {
         return true;
      }
   }

   public void int(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      this.J(var5);
   }

   private void J(int var1) {
      int var2 = var1 & 7;
      boolean var3 = (var1 & 8) > 0;
      float var4 = 0.375F;
      float var5 = 0.625F;
      float var6 = 0.1875F;
      float var7 = 0.125F;
      if (var3) {
         var7 = 0.0625F;
      }

      if (var2 == 1) {
         this.a(0.0F, var4, 0.5F - var6, var7, var5, 0.5F + var6);
      } else if (var2 == 2) {
         this.a(1.0F - var7, var4, 0.5F - var6, 1.0F, var5, 0.5F + var6);
      } else if (var2 == 3) {
         this.a(0.5F - var6, var4, 0.0F, 0.5F + var6, var5, var7);
      } else if (var2 == 4) {
         this.a(0.5F - var6, var4, 1.0F - var7, 0.5F + var6, var5, 1.0F);
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, aek var5) {
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      int var10 = var1.for(var2, var3, var4);
      int var11 = var10 & 7;
      int var12 = 8 - (var10 & 8);
      if (var12 == 0) {
         return true;
      } else {
         var1.do(var2, var3, var4, var11 + var12, 3);
         var1.new(var2, var3, var4, var2, var3, var4);
         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, 0.6F);
         this.m(var1, var2, var3, var4, var11);
         var1.if(var2, var3, var4, this.void, this.a(var1));
         return true;
      }
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      if ((var6 & 8) > 0) {
         int var7 = var6 & 7;
         this.m(var1, var2, var3, var4, var7);
      }

      super.do(var1, var2, var3, var4, var5, var6);
   }

   public int do(yy var1, int var2, int var3, int var4, int var5) {
      return (var1.for(var2, var3, var4) & 8) > 0 ? 15 : 0;
   }

   public int for(yy var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.for(var2, var3, var4);
      if ((var6 & 8) == 0) {
         return 0;
      } else {
         int var7 = var6 & 7;
         if (var7 == 5 && var5 == 1) {
            return 15;
         } else if (var7 == 4 && var5 == 2) {
            return 15;
         } else if (var7 == 3 && var5 == 3) {
            return 15;
         } else if (var7 == 2 && var5 == 4) {
            return 15;
         } else {
            return var7 == 1 && var5 == 5 ? 15 : 0;
         }
      }
   }

   public boolean int() {
      return true;
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (!var1.goto) {
         int var6 = var1.for(var2, var3, var4);
         if ((var6 & 8) != 0) {
            if (this.eS) {
               this.R(var1, var2, var3, var4);
            } else {
               var1.do(var2, var3, var4, var6 & 7, 3);
               int var7 = var6 & 7;
               this.m(var1, var2, var3, var4, var7);
               var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, 0.5F);
               var1.new(var2, var3, var4, var2, var3, var4);
            }

         }
      }
   }

   public void try() {
      float var1 = 0.1875F;
      float var2 = 0.125F;
      float var3 = 0.125F;
      this.a(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }

   public void if(y6 var1, int var2, int var3, int var4, aiw var5) {
      if (!var1.goto) {
         if (this.eS) {
            if ((var1.for(var2, var3, var4) & 8) == 0) {
               this.R(var1, var2, var3, var4);
            }
         }
      }
   }

   private void R(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      int var6 = var5 & 7;
      boolean var7 = (var5 & 8) != 0;
      this.J(var5);
      List var9 = var1.a(aei.class, nw.if().a((double)var2 + this.aR, (double)var3 + this.aO, (double)var4 + this.aL, (double)var2 + this.aI, (double)var3 + this.aF, (double)var4 + this.aC));
      boolean var8 = !var9.isEmpty();
      if (var8 && !var7) {
         var1.do(var2, var3, var4, var6 | 8, 3);
         this.m(var1, var2, var3, var4, var6);
         var1.new(var2, var3, var4, var2, var3, var4);
         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, 0.6F);
      }

      if (!var8 && var7) {
         var1.do(var2, var3, var4, var6, 3);
         this.m(var1, var2, var3, var4, var6);
         var1.new(var2, var3, var4, var2, var3, var4);
         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, 0.5F);
      }

      if (var8) {
         var1.if(var2, var3, var4, this.void, this.a(var1));
      }

   }

   private void m(y6 var1, int var2, int var3, int var4, int var5) {
      var1.for(var2, var3, var4, this.void);
      if (var5 == 1) {
         var1.for(var2 - 1, var3, var4, this.void);
      } else if (var5 == 2) {
         var1.for(var2 + 1, var3, var4, this.void);
      } else if (var5 == 3) {
         var1.for(var2, var3, var4 - 1, this.void);
      } else if (var5 == 4) {
         var1.for(var2, var3, var4 + 1, this.void);
      } else {
         var1.for(var2, var3 - 1, var4, this.void);
      }

   }

   public void a(ajc var1) {
   }
}
