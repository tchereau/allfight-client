import java.util.Random;

public class qy extends pa {
   public static boolean dI = false;

   public qy(int var1) {
      super(var1, ts.k);
      this.a((acn)acn.d);
   }

   public qy(int var1, ts var2) {
      super(var1, var2);
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      var1.if(var2, var3, var4, this.void, this.a(var1));
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      var1.if(var2, var3, var4, this.void, this.a(var1));
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (!var1.goto) {
         this.u(var1, var2, var3, var4);
      }

   }

   private void u(y6 var1, int var2, int var3, int var4) {
      if (v(var1, var2, var3 - 1, var4) && var3 >= 0) {
         byte var8 = 32;
         if (!dI && var1.for(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
            if (!var1.goto) {
               afl var9 = new afl(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), this.void, var1.for(var2, var3, var4));
               this.a(var9);
               var1.new(var9);
            }
         } else {
            var1.o(var2, var3, var4);

            while(v(var1, var2, var3 - 1, var4) && var3 > 0) {
               --var3;
            }

            if (var3 > 0) {
               var1.int(var2, var3, var4, this.void);
            }
         }
      }

   }

   protected void a(afl var1) {
   }

   public int a(y6 var1) {
      return 2;
   }

   public static boolean v(y6 var0, int var1, int var2, int var3) {
      int var4 = var0.new(var1, var2, var3);
      if (var4 == 0) {
         return true;
      } else if (var4 == pa.bo.void) {
         return true;
      } else {
         ts var5 = pa.x[var4].at;
         if (var5 == ts.s) {
            return true;
         } else {
            return var5 == ts.r;
         }
      }
   }

   public void d(y6 var1, int var2, int var3, int var4, int var5) {
   }
}
