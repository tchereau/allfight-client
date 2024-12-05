import java.util.Random;

public class o4 extends pa {
   protected o4(int var1) {
      super(var1, ts.d);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.a(true);
      this.a((acn)acn.c);
      this.c(0);
   }

   public void a(ajc var1) {
      this.an = var1.a("snow");
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4) & 7;
      float var6 = 0.125F;
      return nw.if().a((double)var2 + this.aR, (double)var3 + this.aO, (double)var4 + this.aL, (double)var2 + this.aI, (double)((float)var3 + (float)var5 * var6), (double)var4 + this.aC);
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public void try() {
      this.c(0);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      this.c(var1.for(var2, var3, var4));
   }

   protected void c(int var1) {
      int var2 = var1 & 7;
      float var3 = (float)(2 * (1 + var2)) / 16.0F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, var3, 1.0F);
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.new(var2, var3 - 1, var4);
      if (var5 == 0) {
         return false;
      } else if (var5 == this.void && (var1.for(var2, var3 - 1, var4) & 7) == 7) {
         return true;
      } else {
         return var5 != pa.aJ.void && !pa.x[var5].do() ? false : var1.byte(var2, var3 - 1, var4).void();
      }
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      this.e(var1, var2, var3, var4);
   }

   private boolean e(y6 var1, int var2, int var3, int var4) {
      if (!this.case(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.o(var2, var3, var4);
         return false;
      } else {
         return true;
      }
   }

   public void a(y6 var1, aek var2, int var3, int var4, int var5, int var6) {
      int var7 = abr.cu.A;
      int var8 = var6 & 7;
      this.a(var1, var3, var4, var5, new abp(var7, var8 + 1, 0));
      var1.o(var3, var4, var5);
      var2.a((akf)aka.void[this.void], 1);
   }

   public int a(int var1, Random var2, int var3) {
      return abr.cu.A;
   }

   public int a(Random var1) {
      return 0;
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (var1.for(yw.a, var2, var3, var4) > 11) {
         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.o(var2, var3, var4);
      }

   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      return var5 == 1 ? true : super.int(var1, var2, var3, var4, var5);
   }
}
