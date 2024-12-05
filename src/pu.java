import java.util.Random;

public class pu extends pa {
   private final boolean dg;

   public pu(int var1, boolean var2) {
      super(var1, ts.h);
      this.dg = var2;
      if (var2) {
         this.do(1.0F);
      }

   }

   public void a(ajc var1) {
      if (this.dg) {
         this.an = var1.a("redstoneLight_lit");
      } else {
         this.an = var1.a("redstoneLight");
      }

   }

   public void for(y6 var1, int var2, int var3, int var4) {
      if (!var1.goto) {
         if (this.dg && !var1.f(var2, var3, var4)) {
            var1.if(var2, var3, var4, this.void, 4);
         } else if (!this.dg && var1.f(var2, var3, var4)) {
            var1.int(var2, var3, var4, pa.bA.void, 0, 2);
         }
      }

   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!var1.goto) {
         if (this.dg && !var1.f(var2, var3, var4)) {
            var1.if(var2, var3, var4, this.void, 4);
         } else if (!this.dg && var1.f(var2, var3, var4)) {
            var1.int(var2, var3, var4, pa.bA.void, 0, 2);
         }
      }

   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (!var1.goto && this.dg && !var1.f(var2, var3, var4)) {
         var1.int(var2, var3, var4, pa.bC.void, 0, 2);
      }

   }

   public int a(int var1, Random var2, int var3) {
      return pa.bC.void;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return pa.bC.void;
   }
}
