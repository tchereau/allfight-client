import java.util.Random;

public abstract class r7 extends pa {
   private String fa;

   protected r7(int var1, String var2, ts var3) {
      super(var1, var3);
      this.fa = var2;
      this.a((acn)acn.b);
      this.a(true);
      this.M(this.N(15));
   }

   public void int(yy var1, int var2, int var3, int var4) {
      this.M(var1.for(var2, var3, var4));
   }

   protected void M(int var1) {
      boolean var2 = this.O(var1) > 0;
      float var3 = 0.0625F;
      if (var2) {
         this.a(var3, 0.0F, var3, 1.0F - var3, 0.03125F, 1.0F - var3);
      } else {
         this.a(var3, 0.0F, var3, 1.0F - var3, 0.0625F, 1.0F - var3);
      }

   }

   public int a(y6 var1) {
      return 20;
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

   public boolean a(yy var1, int var2, int var3, int var4) {
      return true;
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      return var1.case(var2, var3 - 1, var4) || q8.p(var1.new(var2, var3 - 1, var4));
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if (!var1.case(var2, var3 - 1, var4) && !q8.p(var1.new(var2, var3 - 1, var4))) {
         var6 = true;
      }

      if (var6) {
         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.o(var2, var3, var4);
      }

   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (!var1.goto) {
         int var6 = this.O(var1.for(var2, var3, var4));
         if (var6 > 0) {
            this.p(var1, var2, var3, var4, var6);
         }

      }
   }

   public void if(y6 var1, int var2, int var3, int var4, aiw var5) {
      if (!var1.goto) {
         int var6 = this.O(var1.for(var2, var3, var4));
         if (var6 == 0) {
            this.p(var1, var2, var3, var4, var6);
         }

      }
   }

   protected void p(y6 var1, int var2, int var3, int var4, int var5) {
      int var6 = this.Y(var1, var2, var3, var4);
      boolean var7 = var5 > 0;
      boolean var8 = var6 > 0;
      if (var5 != var6) {
         var1.do(var2, var3, var4, this.N(var6), 2);
         this.Z(var1, var2, var3, var4);
         var1.new(var2, var3, var4, var2, var3, var4);
      }

      if (!var8 && var7) {
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.3F, 0.5F);
      } else if (var8 && !var7) {
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.3F, 0.6F);
      }

      if (var8) {
         var1.if(var2, var3, var4, this.void, this.a(var1));
      }

   }

   protected nw if(int var1, int var2, int var3) {
      float var4 = 0.125F;
      return nw.if().a((double)((float)var1 + var4), (double)var2, (double)((float)var3 + var4), (double)((float)(var1 + 1) - var4), (double)var2 + 0.25D, (double)((float)(var3 + 1) - var4));
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.O(var6) > 0) {
         this.Z(var1, var2, var3, var4);
      }

      super.do(var1, var2, var3, var4, var5, var6);
   }

   protected void Z(y6 var1, int var2, int var3, int var4) {
      var1.for(var2, var3, var4, this.void);
      var1.for(var2, var3 - 1, var4, this.void);
   }

   public int do(yy var1, int var2, int var3, int var4, int var5) {
      return this.O(var1.for(var2, var3, var4));
   }

   public int for(yy var1, int var2, int var3, int var4, int var5) {
      return var5 == 1 ? this.O(var1.for(var2, var3, var4)) : 0;
   }

   public boolean int() {
      return true;
   }

   public void try() {
      float var1 = 0.5F;
      float var2 = 0.125F;
      float var3 = 0.5F;
      this.a(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }

   public int case() {
      return 1;
   }

   protected abstract int Y(y6 var1, int var2, int var3, int var4);

   protected abstract int O(int var1);

   protected abstract int N(int var1);

   public void a(ajc var1) {
      this.an = var1.a(this.fa);
   }
}
