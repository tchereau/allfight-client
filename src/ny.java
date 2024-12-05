import java.util.Random;

public class ny extends r8 {
   public ny(int var1) {
      super(var1, ts.byte);
      this.if(-1.0F);
   }

   public n4 if(y6 var1) {
      return null;
   }

   public void for(y6 var1, int var2, int var3, int var4) {
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      n4 var7 = var1.if(var2, var3, var4);
      if (var7 instanceof nx) {
         ((nx)var7).e();
      } else {
         super.do(var1, var2, var3, var4, var5, var6);
      }

   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      return false;
   }

   public boolean for(y6 var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public int new() {
      return -1;
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (!var1.goto && var1.if(var2, var3, var4) == null) {
         var1.o(var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if (!var1.goto) {
         nx var8 = this.e(var1, var2, var3, var4);
         if (var8 != null) {
            pa.x[var8.i()].a(var1, var2, var3, var4, var8.try(), 0);
         }
      }
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!var1.goto && var1.if(var2, var3, var4) == null) {
      }

   }

   public static n4 a(int var0, int var1, int var2, boolean var3, boolean var4) {
      return new nx(var0, var1, var2, var3, var4);
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      nx var5 = this.e(var1, var2, var3, var4);
      if (var5 == null) {
         return null;
      } else {
         float var6 = var5.a(0.0F);
         if (var5.h()) {
            var6 = 1.0F - var6;
         }

         return this.if(var1, var2, var3, var4, var5.i(), var6, var5.g());
      }
   }

   public void int(yy var1, int var2, int var3, int var4) {
      nx var5 = this.e(var1, var2, var3, var4);
      if (var5 != null) {
         pa var6 = pa.x[var5.i()];
         if (var6 == null || var6 == this) {
            return;
         }

         var6.int(var1, var2, var3, var4);
         float var7 = var5.a(0.0F);
         if (var5.h()) {
            var7 = 1.0F - var7;
         }

         int var8 = var5.g();
         this.aR = var6.j() - (double)((float)api.a[var8] * var7);
         this.aO = var6.m() - (double)((float)api.int[var8] * var7);
         this.aL = var6.o() - (double)((float)api.for[var8] * var7);
         this.aI = var6.l() - (double)((float)api.a[var8] * var7);
         this.aF = var6.n() - (double)((float)api.int[var8] * var7);
         this.aC = var6.q() - (double)((float)api.for[var8] * var7);
      }

   }

   public nw if(y6 var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if (var5 != 0 && var5 != this.void) {
         nw var8 = pa.x[var5].int(var1, var2, var3, var4);
         if (var8 == null) {
            return null;
         } else {
            if (api.a[var7] < 0) {
               var8.if -= (double)((float)api.a[var7] * var6);
            } else {
               var8.new -= (double)((float)api.a[var7] * var6);
            }

            if (api.int[var7] < 0) {
               var8.a -= (double)((float)api.int[var7] * var6);
            } else {
               var8.int -= (double)((float)api.int[var7] * var6);
            }

            if (api.for[var7] < 0) {
               var8.try -= (double)((float)api.for[var7] * var6);
            } else {
               var8.for -= (double)((float)api.for[var7] * var6);
            }

            return var8;
         }
      } else {
         return null;
      }
   }

   private nx e(yy var1, int var2, int var3, int var4) {
      n4 var5 = var1.if(var2, var3, var4);
      return var5 instanceof nx ? (nx)var5 : null;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return 0;
   }

   public void a(ajc var1) {
      this.an = var1.a("piston_top");
   }
}
