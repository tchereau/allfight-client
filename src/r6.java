import java.util.Random;

public abstract class r6 extends pa {
   protected final boolean e6;

   public static final boolean X(y6 var0, int var1, int var2, int var3) {
      return L(var0.new(var1, var2, var3));
   }

   public static final boolean L(int var0) {
      return var0 == pa.cm.void || var0 == pa.aj.void || var0 == pa.ah.void || var0 == pa.c.void;
   }

   protected r6(int var1, boolean var2) {
      super(var1, ts.j);
      this.e6 = var2;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.a(acn.void);
   }

   public boolean E() {
      return this.e6;
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean do() {
      return false;
   }

   public nt a(y6 var1, int var2, int var3, int var4, nr var5, nr var6) {
      this.int((yy)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      if (var5 >= 2 && var5 <= 5) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      }

   }

   public boolean if() {
      return false;
   }

   public int new() {
      return 9;
   }

   public int a(Random var1) {
      return 1;
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      return var1.case(var2, var3 - 1, var4);
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      if (!var1.goto) {
         this.int(var1, var2, var3, var4, true);
         if (this.e6) {
            this.new(var1, var2, var3, var4, this.void);
         }
      }

   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!var1.goto) {
         int var6 = var1.for(var2, var3, var4);
         int var7 = var6;
         if (this.e6) {
            var7 = var6 & 7;
         }

         boolean var8 = false;
         if (!var1.case(var2, var3 - 1, var4)) {
            var8 = true;
         }

         if (var7 == 2 && !var1.case(var2 + 1, var3, var4)) {
            var8 = true;
         }

         if (var7 == 3 && !var1.case(var2 - 1, var3, var4)) {
            var8 = true;
         }

         if (var7 == 4 && !var1.case(var2, var3, var4 - 1)) {
            var8 = true;
         }

         if (var7 == 5 && !var1.case(var2, var3, var4 + 1)) {
            var8 = true;
         }

         if (var8) {
            this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
            var1.o(var2, var3, var4);
         } else {
            this.if(var1, var2, var3, var4, var6, var7, var5);
         }

      }
   }

   protected void if(y6 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
   }

   protected void int(y6 var1, int var2, int var3, int var4, boolean var5) {
      if (!var1.goto) {
         (new r5(this, var1, var2, var3, var4)).a(var1.f(var2, var3, var4), var5);
      }
   }

   public int case() {
      return 0;
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var6;
      if (this.e6) {
         var7 = var6 & 7;
      }

      super.do(var1, var2, var3, var4, var5, var6);
      if (var7 == 2 || var7 == 3 || var7 == 4 || var7 == 5) {
         var1.for(var2, var3 + 1, var4, var5);
      }

      if (this.e6) {
         var1.for(var2, var3, var4, var5);
         var1.for(var2, var3 - 1, var4, var5);
      }

   }
}
