import java.util.Random;

public class rp extends rk implements rb {
   public rp(int var1, boolean var2) {
      super(var1, var2);
      this.aU = true;
   }

   public int a(int var1, Random var2, int var3) {
      return abr.bh.A;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return abr.bh.A;
   }

   protected int t(int var1) {
      return 2;
   }

   protected rk x() {
      return pa.n;
   }

   protected rk w() {
      return pa.q;
   }

   public int new() {
      return 37;
   }

   public ajd if(int var1, int var2) {
      boolean var3 = this.d8 || (var2 & 8) != 0;
      if (var1 == 0) {
         return var3 ? pa.cc.do(var1) : pa.cd.do(var1);
      } else if (var1 == 1) {
         return var3 ? pa.n.an : this.an;
      } else {
         return pa.bF.do(1);
      }
   }

   protected boolean v(int var1) {
      return this.d8 || (var1 & 8) != 0;
   }

   protected int char(yy var1, int var2, int var3, int var4, int var5) {
      return this.g(var1, var2, var3, var4).gC();
   }

   private int k(y6 var1, int var2, int var3, int var4, int var5) {
      return !this.C(var5) ? this.i(var1, var2, var3, var4, var5) : Math.max(this.i(var1, var2, var3, var4, var5) - this.else(var1, var2, var3, var4, var5), 0);
   }

   public boolean C(int var1) {
      return (var1 & 4) == 4;
   }

   protected boolean g(y6 var1, int var2, int var3, int var4, int var5) {
      int var6 = this.i(var1, var2, var3, var4, var5);
      if (var6 >= 15) {
         return true;
      } else if (var6 == 0) {
         return false;
      } else {
         int var7 = this.else(var1, var2, var3, var4, var5);
         if (var7 == 0) {
            return true;
         } else {
            return var6 >= var7;
         }
      }
   }

   protected int i(y6 var1, int var2, int var3, int var4, int var5) {
      int var6 = super.i(var1, var2, var3, var4, var5);
      int var7 = r(var5);
      int var8 = var2 + apk.case[var7];
      int var9 = var4 + apk.byte[var7];
      int var10 = var1.new(var8, var3, var9);
      if (var10 > 0) {
         if (pa.x[var10].k()) {
            var6 = pa.x[var10].int(var1, var8, var3, var9, apk.for[var7]);
         } else if (var6 < 15 && pa.if(var10)) {
            var8 += apk.case[var7];
            var9 += apk.byte[var7];
            var10 = var1.new(var8, var3, var9);
            if (var10 > 0 && pa.x[var10].k()) {
               var6 = pa.x[var10].int(var1, var8, var3, var9, apk.for[var7]);
            }
         }
      }

      return var6;
   }

   public ok g(yy var1, int var2, int var3, int var4) {
      return (ok)var1.if(var2, var3, var4);
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      int var10 = var1.for(var2, var3, var4);
      boolean var11 = this.d8 | (var10 & 8) != 0;
      boolean var12 = !this.C(var10);
      int var13 = var12 ? 4 : 0;
      var13 |= var11 ? 8 : 0;
      var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, var12 ? 0.55F : 0.5F);
      var1.do(var2, var3, var4, var13 | var10 & 3, 2);
      this.do(var1, var2, var3, var4, var1.o);
      return true;
   }

   protected void h(y6 var1, int var2, int var3, int var4, int var5) {
      if (!var1.case(var2, var3, var4, this.void)) {
         int var6 = var1.for(var2, var3, var4);
         int var7 = this.k(var1, var2, var3, var4, var6);
         int var8 = this.g(var1, var2, var3, var4).gC();
         if (var7 != var8 || this.v(var6) != this.g(var1, var2, var3, var4, var6)) {
            if (this.f(var1, var2, var3, var4, var6)) {
               var1.a(var2, var3, var4, this.void, this.t(0), -1);
            } else {
               var1.a(var2, var3, var4, this.void, this.t(0), 0);
            }
         }
      }

   }

   private void do(y6 var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.for(var2, var3, var4);
      int var7 = this.k(var1, var2, var3, var4, var6);
      int var8 = this.g(var1, var2, var3, var4).gC();
      this.g(var1, var2, var3, var4).aP(var7);
      if (var8 != var7 || !this.C(var6)) {
         boolean var9 = this.g(var1, var2, var3, var4, var6);
         boolean var10 = this.d8 || (var6 & 8) != 0;
         if (var10 && !var9) {
            var1.do(var2, var3, var4, var6 & -9, 2);
         } else if (!var10 && var9) {
            var1.do(var2, var3, var4, var6 | 8, 2);
         }

         this.D(var1, var2, var3, var4);
      }

   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (this.d8) {
         int var6 = var1.for(var2, var3, var4);
         var1.int(var2, var3, var4, this.w().void, var6 | 8, 4);
      }

      this.do(var1, var2, var3, var4, var5);
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      super.for(var1, var2, var3, var4);
      var1.if(var2, var3, var4, this.if(var1));
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      super.do(var1, var2, var3, var4, var5, var6);
      var1.b(var2, var3, var4);
      this.D(var1, var2, var3, var4);
   }

   public boolean if(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      super.if(var1, var2, var3, var4, var5, var6);
      n4 var7 = var1.if(var2, var3, var4);
      return var7 != null ? var7.a(var5, var6) : false;
   }

   public void a(ajc var1) {
      this.an = var1.a(this.d8 ? "comparator_lit" : "comparator");
   }

   public n4 if(y6 var1) {
      return new ok();
   }
}
