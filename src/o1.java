public class o1 extends pa {
   protected o1(int var1, ts var2) {
      super(var1, var2);
      float var3 = 0.5F;
      float var4 = 1.0F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
      this.a(acn.b);
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public boolean a(yy var1, int var2, int var3, int var4) {
      return !void(var1.for(var2, var3, var4));
   }

   public int new() {
      return 0;
   }

   public nw new(y6 var1, int var2, int var3, int var4) {
      this.int((yy)var1, var2, var3, var4);
      return super.new(var1, var2, var3, var4);
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      this.int((yy)var1, var2, var3, var4);
      return super.int(var1, var2, var3, var4);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      this.long(var1.for(var2, var3, var4));
   }

   public void try() {
      float var1 = 0.1875F;
      this.a(0.0F, 0.5F - var1 / 2.0F, 0.0F, 1.0F, 0.5F + var1 / 2.0F, 1.0F);
   }

   public void long(int var1) {
      float var2 = 0.1875F;
      if ((var1 & 8) != 0) {
         this.a(0.0F, 1.0F - var2, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, var2, 1.0F);
      }

      if (void(var1)) {
         if ((var1 & 3) == 0) {
            this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
         }

         if ((var1 & 3) == 1) {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
         }

         if ((var1 & 3) == 2) {
            this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         }

         if ((var1 & 3) == 3) {
            this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
         }
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, aek var5) {
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (this.at == ts.u) {
         return true;
      } else {
         int var10 = var1.for(var2, var3, var4);
         var1.do(var2, var3, var4, var10 ^ 4, 2);
         var1.a(var5, 1003, var2, var3, var4, 0);
         return true;
      }
   }

   public void a(y6 var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1.for(var2, var3, var4);
      boolean var7 = (var6 & 4) > 0;
      if (var7 != var5) {
         var1.do(var2, var3, var4, var6 ^ 4, 2);
         var1.a((aek)null, 1003, var2, var3, var4, 0);
      }
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!var1.goto) {
         int var6 = var1.for(var2, var3, var4);
         int var7 = var2;
         int var8 = var4;
         if ((var6 & 3) == 0) {
            var8 = var4 + 1;
         }

         if ((var6 & 3) == 1) {
            --var8;
         }

         if ((var6 & 3) == 2) {
            var7 = var2 + 1;
         }

         if ((var6 & 3) == 3) {
            --var7;
         }

         if (!b(var1.new(var7, var3, var8))) {
            var1.o(var2, var3, var4);
            this.a(var1, var2, var3, var4, var6, 0);
         }

         boolean var9 = var1.f(var2, var3, var4);
         if (var9 || var5 > 0 && pa.x[var5].int()) {
            this.a(var1, var2, var3, var4, var9);
         }

      }
   }

   public nt a(y6 var1, int var2, int var3, int var4, nr var5, nr var6) {
      this.int((yy)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public int a(y6 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var10 = 0;
      if (var5 == 2) {
         var10 = 0;
      }

      if (var5 == 3) {
         var10 = 1;
      }

      if (var5 == 4) {
         var10 = 2;
      }

      if (var5 == 5) {
         var10 = 3;
      }

      if (var5 != 1 && var5 != 0 && var7 > 0.5F) {
         var10 |= 8;
      }

      return var10;
   }

   public boolean for(y6 var1, int var2, int var3, int var4, int var5) {
      if (var5 == 0) {
         return false;
      } else if (var5 == 1) {
         return false;
      } else {
         if (var5 == 2) {
            ++var4;
         }

         if (var5 == 3) {
            --var4;
         }

         if (var5 == 4) {
            ++var2;
         }

         if (var5 == 5) {
            --var2;
         }

         return b(var1.new(var2, var3, var4));
      }
   }

   public static boolean void(int var0) {
      return (var0 & 4) != 0;
   }

   private static boolean b(int var0) {
      if (var0 <= 0) {
         return false;
      } else {
         pa var1 = pa.x[var0];
         return var1 != null && var1.at.goto() && var1.if() || var1 == pa.aN || var1 instanceof q0 || var1 instanceof pk;
      }
   }
}
