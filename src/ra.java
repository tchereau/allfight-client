import java.util.Random;

public class ra extends pa {
   private ajd d1;
   private ajd d0;

   protected ra(int var1) {
      super(var1, ts.x);
      this.a(true);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
      this.new(255);
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      return nw.if().a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 0), (double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1));
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public ajd if(int var1, int var2) {
      if (var1 == 1) {
         return var2 > 0 ? this.d1 : this.d0;
      } else {
         return pa.g.do(var1);
      }
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (!this.z(var1, var2, var3, var4) && !var1.d(var2, var3 + 1, var4)) {
         int var6 = var1.for(var2, var3, var4);
         if (var6 > 0) {
            var1.do(var2, var3, var4, var6 - 1, 2);
         } else if (!this.A(var1, var2, var3, var4)) {
            var1.int(var2, var3, var4, pa.g.void);
         }
      } else {
         var1.do(var2, var3, var4, 7, 2);
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, aiw var5, float var6) {
      if (!var1.goto && var1.o.nextFloat() < var6 - 0.5F) {
         if (!(var5 instanceof aek) && !var1.i().a("mobGriefing")) {
            return;
         }

         var1.int(var2, var3, var4, pa.g.void);
      }

   }

   private boolean A(y6 var1, int var2, int var3, int var4) {
      byte var5 = 0;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var4 - var5; var7 <= var4 + var5; ++var7) {
            int var8 = var1.new(var6, var3 + 1, var7);
            if (var8 == pa.ct.void || var8 == pa.aa.void || var8 == pa.ac.void || var8 == pa.E.void || var8 == pa.G.void) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean z(y6 var1, int var2, int var3, int var4) {
      for(int var5 = var2 - 4; var5 <= var2 + 4; ++var5) {
         for(int var6 = var3; var6 <= var3 + 1; ++var6) {
            for(int var7 = var4 - 4; var7 <= var4 + 4; ++var7) {
               if (var1.byte(var5, var6, var7) == ts.s) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      super.new(var1, var2, var3, var4, var5);
      ts var6 = var1.byte(var2, var3 + 1, var4);
      if (var6.for()) {
         var1.int(var2, var3, var4, pa.g.void);
      }

   }

   public int a(int var1, Random var2, int var3) {
      return pa.g.a(0, var2, var3);
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return pa.g.void;
   }

   public void a(ajc var1) {
      this.d1 = var1.a("farmland_wet");
      this.d0 = var1.a("farmland_dry");
   }
}
