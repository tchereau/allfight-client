import java.util.Random;

public class pt extends pa {
   protected pt(int var1) {
      super(var1, ts.p);
      float var2 = 0.375F;
      this.a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, 1.0F, 0.5F + var2);
      this.a(true);
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (var1.a(var2, var3 + 1, var4)) {
         int var6;
         for(var6 = 1; var1.new(var2, var3 - var6, var4) == this.void; ++var6) {
         }

         if (var6 < 3) {
            int var7 = var1.for(var2, var3, var4);
            if (var7 == 15) {
               var1.int(var2, var3 + 1, var4, this.void);
               var1.do(var2, var3, var4, 0, 4);
            } else {
               var1.do(var2, var3, var4, var7 + 1, 4);
            }
         }
      }

   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.new(var2, var3 - 1, var4);
      if (var5 == this.void) {
         return true;
      } else if (var5 != pa.i.void && var5 != pa.g.void && var5 != pa.a1.void) {
         return false;
      } else if (var1.byte(var2 - 1, var3 - 1, var4) == ts.s) {
         return true;
      } else if (var1.byte(var2 + 1, var3 - 1, var4) == ts.s) {
         return true;
      } else if (var1.byte(var2, var3 - 1, var4 - 1) == ts.s) {
         return true;
      } else {
         return var1.byte(var2, var3 - 1, var4 + 1) == ts.s;
      }
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      this.f(var1, var2, var3, var4);
   }

   protected final void f(y6 var1, int var2, int var3, int var4) {
      if (!this.try(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.o(var2, var3, var4);
      }

   }

   public boolean try(y6 var1, int var2, int var3, int var4) {
      return this.case(var1, var2, var3, var4);
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      return null;
   }

   public int a(int var1, Random var2, int var3) {
      return abr.co.A;
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public int new() {
      return 1;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return abr.co.A;
   }
}
