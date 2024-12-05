import java.util.List;

public class aaz extends abr {
   private int cR;
   private ajd cQ;

   public aaz(int var1) {
      super(var1);
      this.cR = var1 + 256;
   }

   public int n() {
      return this.cR;
   }

   public int if() {
      return pa.x[this.cR].void() != null ? 1 : 0;
   }

   public ajd a(int var1) {
      return this.cQ != null ? this.cQ : pa.x[this.cR].do(1);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      int var11 = var3.new(var4, var5, var6);
      if (var11 == pa.ca.void && (var3.for(var4, var5, var6) & 7) < 1) {
         var7 = 1;
      } else if (var11 != pa.Z.void && var11 != pa.b3.void && var11 != pa.b1.void) {
         if (var7 == 0) {
            --var5;
         }

         if (var7 == 1) {
            ++var5;
         }

         if (var7 == 2) {
            --var6;
         }

         if (var7 == 3) {
            ++var6;
         }

         if (var7 == 4) {
            --var4;
         }

         if (var7 == 5) {
            ++var4;
         }
      }

      if (var1.if == 0) {
         return false;
      } else if (!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else if (var5 == 255 && pa.x[this.cR].at.for()) {
         return false;
      } else if (var3.a(this.cR, var4, var5, var6, false, var7, var2, var1)) {
         pa var12 = pa.x[this.cR];
         int var13 = this.do(var1.new());
         int var14 = pa.x[this.cR].a(var3, var4, var5, var6, var7, var8, var9, var10, var13);
         if (var3.int(var4, var5, var6, this.cR, var14, 3)) {
            if (var3.new(var4, var5, var6) == this.cR) {
               pa.x[this.cR].a(var3, var4, var5, var6, (aig)var2, (abp)var1);
               pa.x[this.cR].try(var3, var4, var5, var6, var14);
            }

            var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var12.az.do(), (var12.az.for() + 1.0F) / 2.0F, var12.az.a() * 0.8F);
            --var1.if;
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean a(y6 var1, int var2, int var3, int var4, int var5, aek var6, abp var7) {
      int var8 = var1.new(var2, var3, var4);
      if (var8 == pa.ca.void) {
         var5 = 1;
      } else if (var8 != pa.Z.void && var8 != pa.b3.void && var8 != pa.b1.void) {
         if (var5 == 0) {
            --var3;
         }

         if (var5 == 1) {
            ++var3;
         }

         if (var5 == 2) {
            --var4;
         }

         if (var5 == 3) {
            ++var4;
         }

         if (var5 == 4) {
            --var2;
         }

         if (var5 == 5) {
            ++var2;
         }
      }

      return var1.a(this.n(), var2, var3, var4, false, var5, (aiw)null, var7);
   }

   public String int(abp var1) {
      return pa.x[this.cR].long();
   }

   public String int() {
      return pa.x[this.cR].long();
   }

   public acn long() {
      return pa.x[this.cR].i();
   }

   public void a(int var1, acn var2, List var3) {
      pa.x[this.cR].a(var1, var2, var3);
   }

   public void a(ajc var1) {
      String var2 = pa.x[this.cR].void();
      if (var2 != null) {
         this.cQ = var1.a(var2);
      }

   }
}
