import java.util.Random;

public abstract class rk extends rj {
   protected final boolean d8;

   protected rk(int var1, boolean var2) {
      super(var1, ts.j);
      this.d8 = var2;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   public boolean if() {
      return false;
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      return !var1.case(var2, var3 - 1, var4) ? false : super.case(var1, var2, var3, var4);
   }

   public boolean try(y6 var1, int var2, int var3, int var4) {
      return !var1.case(var2, var3 - 1, var4) ? false : super.try(var1, var2, var3, var4);
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.for(var2, var3, var4);
      if (!this.case(var1, var2, var3, var4, var6)) {
         boolean var7 = this.g(var1, var2, var3, var4, var6);
         if (this.d8 && !var7) {
            var1.int(var2, var3, var4, this.w().void, var6, 2);
         } else if (!this.d8) {
            var1.int(var2, var3, var4, this.x().void, var6, 2);
            if (!var7) {
               var1.a(var2, var3, var4, this.x().void, this.x(var6), -1);
            }
         }
      }

   }

   public ajd if(int var1, int var2) {
      if (var1 == 0) {
         return this.d8 ? pa.cc.do(var1) : pa.cd.do(var1);
      } else {
         return var1 == 1 ? this.an : pa.bF.do(1);
      }
   }

   public void a(ajc var1) {
      this.an = var1.a(this.d8 ? "repeater_lit" : "repeater");
   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      return var5 != 0 && var5 != 1;
   }

   public int new() {
      return 36;
   }

   protected boolean v(int var1) {
      return this.d8;
   }

   public int for(yy var1, int var2, int var3, int var4, int var5) {
      return this.do(var1, var2, var3, var4, var5);
   }

   public int do(yy var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.for(var2, var3, var4);
      if (!this.v(var6)) {
         return 0;
      } else {
         int var7 = r(var6);
         if (var7 == 0 && var5 == 3) {
            return this.char(var1, var2, var3, var4, var6);
         } else if (var7 == 1 && var5 == 4) {
            return this.char(var1, var2, var3, var4, var6);
         } else if (var7 == 2 && var5 == 2) {
            return this.char(var1, var2, var3, var4, var6);
         } else {
            return var7 == 3 && var5 == 5 ? this.char(var1, var2, var3, var4, var6) : 0;
         }
      }
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!this.try(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.o(var2, var3, var4);
         var1.for(var2 + 1, var3, var4, this.void);
         var1.for(var2 - 1, var3, var4, this.void);
         var1.for(var2, var3, var4 + 1, this.void);
         var1.for(var2, var3, var4 - 1, this.void);
         var1.for(var2, var3 - 1, var4, this.void);
         var1.for(var2, var3 + 1, var4, this.void);
      } else {
         this.h(var1, var2, var3, var4, var5);
      }
   }

   protected void h(y6 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.for(var2, var3, var4);
      if (!this.case(var1, var2, var3, var4, var6)) {
         boolean var7 = this.g(var1, var2, var3, var4, var6);
         if ((this.d8 && !var7 || !this.d8 && var7) && !var1.case(var2, var3, var4, this.void)) {
            byte var8 = -1;
            if (this.f(var1, var2, var3, var4, var6)) {
               var8 = -3;
            } else if (this.d8) {
               var8 = -2;
            }

            var1.a(var2, var3, var4, this.void, this.t(var6), var8);
         }
      }

   }

   public boolean case(yy var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   protected boolean g(y6 var1, int var2, int var3, int var4, int var5) {
      return this.i(var1, var2, var3, var4, var5) > 0;
   }

   protected int i(y6 var1, int var2, int var3, int var4, int var5) {
      int var6 = r(var5);
      int var7 = var2 + apk.case[var6];
      int var8 = var4 + apk.byte[var6];
      int var9 = var1.long(var7, var3, var8, apk.new[var6]);
      return var9 >= 15 ? var9 : Math.max(var9, var1.new(var7, var3, var8) == pa.bg.void ? var1.for(var7, var3, var8) : 0);
   }

   protected int else(yy var1, int var2, int var3, int var4, int var5) {
      int var6 = r(var5);
      switch(var6) {
      case 0:
      case 2:
         return Math.max(this.goto(var1, var2 - 1, var3, var4, 4), this.goto(var1, var2 + 1, var3, var4, 5));
      case 1:
      case 3:
         return Math.max(this.goto(var1, var2, var3, var4 + 1, 3), this.goto(var1, var2, var3, var4 - 1, 2));
      default:
         return 0;
      }
   }

   protected int goto(yy var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.new(var2, var3, var4);
      if (this.w(var6)) {
         return var6 == pa.bg.void ? var1.for(var2, var3, var4) : var1.a(var2, var3, var4, var5);
      } else {
         return 0;
      }
   }

   public boolean int() {
      return true;
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      int var7 = ((ajs.a((double)(var5.a5 * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
      var1.do(var2, var3, var4, var7, 3);
      boolean var8 = this.g(var1, var2, var3, var4, var7);
      if (var8) {
         var1.if(var2, var3, var4, this.void, 1);
      }

   }

   public void for(y6 var1, int var2, int var3, int var4) {
      this.D(var1, var2, var3, var4);
   }

   protected void D(y6 var1, int var2, int var3, int var4) {
      int var5 = r(var1.for(var2, var3, var4));
      if (var5 == 1) {
         var1.try(var2 + 1, var3, var4, this.void);
         var1.int(var2 + 1, var3, var4, this.void, 4);
      }

      if (var5 == 3) {
         var1.try(var2 - 1, var3, var4, this.void);
         var1.int(var2 - 1, var3, var4, this.void, 5);
      }

      if (var5 == 2) {
         var1.try(var2, var3, var4 + 1, this.void);
         var1.int(var2, var3, var4 + 1, this.void, 2);
      }

      if (var5 == 0) {
         var1.try(var2, var3, var4 - 1, this.void);
         var1.int(var2, var3, var4 - 1, this.void, 3);
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, int var5) {
      if (this.d8) {
         var1.for(var2 + 1, var3, var4, this.void);
         var1.for(var2 - 1, var3, var4, this.void);
         var1.for(var2, var3, var4 + 1, this.void);
         var1.for(var2, var3, var4 - 1, this.void);
         var1.for(var2, var3 - 1, var4, this.void);
         var1.for(var2, var3 + 1, var4, this.void);
      }

      super.a(var1, var2, var3, var4, var5);
   }

   public boolean do() {
      return false;
   }

   protected boolean w(int var1) {
      pa var2 = pa.x[var1];
      return var2 != null && var2.int();
   }

   protected int char(yy var1, int var2, int var3, int var4, int var5) {
      return 15;
   }

   public static boolean u(int var0) {
      return pa.aB.y(var0) || pa.q.y(var0);
   }

   public boolean y(int var1) {
      return var1 == this.x().void || var1 == this.w().void;
   }

   public boolean f(y6 var1, int var2, int var3, int var4, int var5) {
      int var6 = r(var5);
      if (u(var1.new(var2 - apk.case[var6], var3, var4 - apk.byte[var6]))) {
         int var7 = var1.for(var2 - apk.case[var6], var3, var4 - apk.byte[var6]);
         int var8 = r(var7);
         return var8 != var6;
      } else {
         return false;
      }
   }

   protected int x(int var1) {
      return this.t(var1);
   }

   protected abstract int t(int var1);

   protected abstract rk x();

   protected abstract rk w();

   public boolean try(int var1) {
      return this.y(var1);
   }
}
