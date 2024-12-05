import java.util.List;
import java.util.Random;

public abstract class q0 extends pa {
   protected final boolean dP;

   public q0(int var1, boolean var2, ts var3) {
      super(var1, var3);
      this.dP = var2;
      if (var2) {
         v[var1] = true;
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

      this.new(255);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      if (this.dP) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         boolean var5 = (var1.for(var2, var3, var4) & 8) != 0;
         if (var5) {
            this.a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
         } else {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         }
      }

   }

   public void try() {
      if (this.dP) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, nw var5, List var6, aiw var7) {
      this.int(var1, var2, var3, var4);
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public boolean do() {
      return this.dP;
   }

   public int a(y6 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      if (this.dP) {
         return var9;
      } else {
         return var5 != 0 && (var5 == 1 || !((double)var7 > 0.5D)) ? var9 : var9 | 8;
      }
   }

   public int a(Random var1) {
      return this.dP ? 2 : 1;
   }

   public int for(int var1) {
      return var1 & 7;
   }

   public boolean if() {
      return this.dP;
   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      if (this.dP) {
         return super.int(var1, var2, var3, var4, var5);
      } else if (var5 != 1 && var5 != 0 && !super.int(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         int var6 = var2 + api.a[api.if[var5]];
         int var7 = var3 + api.int[api.if[var5]];
         int var8 = var4 + api.for[api.if[var5]];
         boolean var9 = (var1.for(var6, var7, var8) & 8) != 0;
         if (var9) {
            if (var5 == 0) {
               return true;
            } else if (var5 == 1 && super.int(var1, var2, var3, var4, var5)) {
               return true;
            } else {
               return !l(var1.new(var2, var3, var4)) || (var1.for(var2, var3, var4) & 8) == 0;
            }
         } else if (var5 == 1) {
            return true;
         } else if (var5 == 0 && super.int(var1, var2, var3, var4, var5)) {
            return true;
         } else {
            return !l(var1.new(var2, var3, var4)) || (var1.for(var2, var3, var4) & 8) != 0;
         }
      }
   }

   private static boolean l(int var0) {
      return var0 == pa.bD.void || var0 == pa.bw.void;
   }

   public abstract String m(int var1);

   public int a(y6 var1, int var2, int var3, int var4) {
      return super.a(var1, var2, var3, var4) & 7;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      if (l(this.void)) {
         return this.void;
      } else if (this.void == pa.bF.void) {
         return pa.bD.void;
      } else {
         return this.void == pa.by.void ? pa.bw.void : pa.bD.void;
      }
   }
}
