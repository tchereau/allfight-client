import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class px extends pa {
   private boolean dj = true;
   private Set di = new HashSet();
   private ajd dn;
   private ajd dm;
   private ajd dl;
   private ajd dk;

   public px(int var1) {
      super(var1, ts.j);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
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

   public int new() {
      return 5;
   }

   public int do(yy var1, int var2, int var3, int var4) {
      return 8388608;
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      return var1.case(var2, var3 - 1, var4) || var1.new(var2, var3 - 1, var4) == pa.aN.void;
   }

   private void j(y6 var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, var2, var3, var4);
      ArrayList var5 = new ArrayList(this.di);
      this.di.clear();

      for(int var6 = 0; var6 < var5.size(); ++var6) {
         yp var7 = (yp)var5.get(var6);
         var1.for(var7.if, var7.a, var7.do, this.void);
      }

   }

   private void a(y6 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.for(var2, var3, var4);
      byte var9 = 0;
      int var15 = this.void(var1, var5, var6, var7, var9);
      this.dj = false;
      int var10 = var1.i(var2, var3, var4);
      this.dj = true;
      if (var10 > 0 && var10 > var15 - 1) {
         var15 = var10;
      }

      int var11 = 0;

      for(int var12 = 0; var12 < 4; ++var12) {
         int var13 = var2;
         int var14 = var4;
         if (var12 == 0) {
            var13 = var2 - 1;
         }

         if (var12 == 1) {
            ++var13;
         }

         if (var12 == 2) {
            var14 = var4 - 1;
         }

         if (var12 == 3) {
            ++var14;
         }

         if (var13 != var5 || var14 != var7) {
            var11 = this.void(var1, var13, var3, var14, var11);
         }

         if (var1.try(var13, var3, var14) && !var1.try(var2, var3 + 1, var4)) {
            if ((var13 != var5 || var14 != var7) && var3 >= var6) {
               var11 = this.void(var1, var13, var3 + 1, var14, var11);
            }
         } else if (!var1.try(var13, var3, var14) && (var13 != var5 || var14 != var7) && var3 <= var6) {
            var11 = this.void(var1, var13, var3 - 1, var14, var11);
         }
      }

      if (var11 > var15) {
         var15 = var11 - 1;
      } else if (var15 > 0) {
         --var15;
      } else {
         var15 = 0;
      }

      if (var10 > var15 - 1) {
         var15 = var10;
      }

      if (var8 != var15) {
         var1.do(var2, var3, var4, var15, 2);
         this.di.add(new yp(var2, var3, var4));
         this.di.add(new yp(var2 - 1, var3, var4));
         this.di.add(new yp(var2 + 1, var3, var4));
         this.di.add(new yp(var2, var3 - 1, var4));
         this.di.add(new yp(var2, var3 + 1, var4));
         this.di.add(new yp(var2, var3, var4 - 1));
         this.di.add(new yp(var2, var3, var4 + 1));
      }

   }

   private void i(y6 var1, int var2, int var3, int var4) {
      if (var1.new(var2, var3, var4) == this.void) {
         var1.for(var2, var3, var4, this.void);
         var1.for(var2 - 1, var3, var4, this.void);
         var1.for(var2 + 1, var3, var4, this.void);
         var1.for(var2, var3, var4 - 1, this.void);
         var1.for(var2, var3, var4 + 1, this.void);
         var1.for(var2, var3 - 1, var4, this.void);
         var1.for(var2, var3 + 1, var4, this.void);
      }
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      super.for(var1, var2, var3, var4);
      if (!var1.goto) {
         this.j(var1, var2, var3, var4);
         var1.for(var2, var3 + 1, var4, this.void);
         var1.for(var2, var3 - 1, var4, this.void);
         this.i(var1, var2 - 1, var3, var4);
         this.i(var1, var2 + 1, var3, var4);
         this.i(var1, var2, var3, var4 - 1);
         this.i(var1, var2, var3, var4 + 1);
         if (var1.try(var2 - 1, var3, var4)) {
            this.i(var1, var2 - 1, var3 + 1, var4);
         } else {
            this.i(var1, var2 - 1, var3 - 1, var4);
         }

         if (var1.try(var2 + 1, var3, var4)) {
            this.i(var1, var2 + 1, var3 + 1, var4);
         } else {
            this.i(var1, var2 + 1, var3 - 1, var4);
         }

         if (var1.try(var2, var3, var4 - 1)) {
            this.i(var1, var2, var3 + 1, var4 - 1);
         } else {
            this.i(var1, var2, var3 - 1, var4 - 1);
         }

         if (var1.try(var2, var3, var4 + 1)) {
            this.i(var1, var2, var3 + 1, var4 + 1);
         } else {
            this.i(var1, var2, var3 - 1, var4 + 1);
         }

      }
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      super.do(var1, var2, var3, var4, var5, var6);
      if (!var1.goto) {
         var1.for(var2, var3 + 1, var4, this.void);
         var1.for(var2, var3 - 1, var4, this.void);
         var1.for(var2 + 1, var3, var4, this.void);
         var1.for(var2 - 1, var3, var4, this.void);
         var1.for(var2, var3, var4 + 1, this.void);
         var1.for(var2, var3, var4 - 1, this.void);
         this.j(var1, var2, var3, var4);
         this.i(var1, var2 - 1, var3, var4);
         this.i(var1, var2 + 1, var3, var4);
         this.i(var1, var2, var3, var4 - 1);
         this.i(var1, var2, var3, var4 + 1);
         if (var1.try(var2 - 1, var3, var4)) {
            this.i(var1, var2 - 1, var3 + 1, var4);
         } else {
            this.i(var1, var2 - 1, var3 - 1, var4);
         }

         if (var1.try(var2 + 1, var3, var4)) {
            this.i(var1, var2 + 1, var3 + 1, var4);
         } else {
            this.i(var1, var2 + 1, var3 - 1, var4);
         }

         if (var1.try(var2, var3, var4 - 1)) {
            this.i(var1, var2, var3 + 1, var4 - 1);
         } else {
            this.i(var1, var2, var3 - 1, var4 - 1);
         }

         if (var1.try(var2, var3, var4 + 1)) {
            this.i(var1, var2, var3 + 1, var4 + 1);
         } else {
            this.i(var1, var2, var3 - 1, var4 + 1);
         }

      }
   }

   private int void(y6 var1, int var2, int var3, int var4, int var5) {
      if (var1.new(var2, var3, var4) != this.void) {
         return var5;
      } else {
         int var6 = var1.for(var2, var3, var4);
         return var6 > var5 ? var6 : var5;
      }
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!var1.goto) {
         boolean var6 = this.case(var1, var2, var3, var4);
         if (var6) {
            this.j(var1, var2, var3, var4);
         } else {
            this.a(var1, var2, var3, var4, 0, 0);
            var1.o(var2, var3, var4);
         }

         super.new(var1, var2, var3, var4, var5);
      }
   }

   public int a(int var1, Random var2, int var3) {
      return abr.cv.A;
   }

   public int for(yy var1, int var2, int var3, int var4, int var5) {
      return !this.dj ? 0 : this.do(var1, var2, var3, var4, var5);
   }

   public int do(yy var1, int var2, int var3, int var4, int var5) {
      if (!this.dj) {
         return 0;
      } else {
         int var6 = var1.for(var2, var3, var4);
         if (var6 == 0) {
            return 0;
         } else if (var5 == 1) {
            return var6;
         } else {
            boolean var7 = byte(var1, var2 - 1, var3, var4, 1) || !var1.try(var2 - 1, var3, var4) && byte(var1, var2 - 1, var3 - 1, var4, -1);
            boolean var8 = byte(var1, var2 + 1, var3, var4, 3) || !var1.try(var2 + 1, var3, var4) && byte(var1, var2 + 1, var3 - 1, var4, -1);
            boolean var9 = byte(var1, var2, var3, var4 - 1, 2) || !var1.try(var2, var3, var4 - 1) && byte(var1, var2, var3 - 1, var4 - 1, -1);
            boolean var10 = byte(var1, var2, var3, var4 + 1, 0) || !var1.try(var2, var3, var4 + 1) && byte(var1, var2, var3 - 1, var4 + 1, -1);
            if (!var1.try(var2, var3 + 1, var4)) {
               if (var1.try(var2 - 1, var3, var4) && byte(var1, var2 - 1, var3 + 1, var4, -1)) {
                  var7 = true;
               }

               if (var1.try(var2 + 1, var3, var4) && byte(var1, var2 + 1, var3 + 1, var4, -1)) {
                  var8 = true;
               }

               if (var1.try(var2, var3, var4 - 1) && byte(var1, var2, var3 + 1, var4 - 1, -1)) {
                  var9 = true;
               }

               if (var1.try(var2, var3, var4 + 1) && byte(var1, var2, var3 + 1, var4 + 1, -1)) {
                  var10 = true;
               }
            }

            if (!var9 && !var8 && !var7 && !var10 && var5 >= 2 && var5 <= 5) {
               return var6;
            } else if (var5 == 2 && var9 && !var7 && !var8) {
               return var6;
            } else if (var5 == 3 && var10 && !var7 && !var8) {
               return var6;
            } else if (var5 == 4 && var7 && !var9 && !var10) {
               return var6;
            } else {
               return var5 == 5 && var8 && !var9 && !var10 ? var6 : 0;
            }
         }
      }
   }

   public boolean int() {
      return this.dj;
   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.for(var2, var3, var4);
      if (var6 > 0) {
         double var7 = (double)var2 + 0.5D + ((double)var5.nextFloat() - 0.5D) * 0.2D;
         double var9 = (double)((float)var3 + 0.0625F);
         double var11 = (double)var4 + 0.5D + ((double)var5.nextFloat() - 0.5D) * 0.2D;
         float var13 = (float)var6 / 15.0F;
         float var14 = var13 * 0.6F + 0.4F;
         if (var6 == 0) {
            var14 = 0.0F;
         }

         float var15 = var13 * var13 * 0.7F - 0.5F;
         float var16 = var13 * var13 * 0.6F - 0.7F;
         if (var15 < 0.0F) {
            var15 = 0.0F;
         }

         if (var16 < 0.0F) {
            var16 = 0.0F;
         }

         var1.a("reddust", var7, var9, var11, (double)var14, (double)var15, (double)var16);
      }

   }

   public static boolean try(yy var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.new(var1, var2, var3);
      if (var5 == pa.bg.void) {
         return true;
      } else if (var5 == 0) {
         return false;
      } else if (!pa.aB.y(var5)) {
         return pa.x[var5].int() && var4 != -1;
      } else {
         int var6 = var0.for(var1, var2, var3);
         return var4 == (var6 & 3) || var4 == apk.for[var6 & 3];
      }
   }

   public static boolean byte(yy var0, int var1, int var2, int var3, int var4) {
      if (try(var0, var1, var2, var3, var4)) {
         return true;
      } else {
         int var5 = var0.new(var1, var2, var3);
         if (var5 == pa.ay.void) {
            int var6 = var0.for(var1, var2, var3);
            return var4 == (var6 & 3);
         } else {
            return false;
         }
      }
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return abr.cv.A;
   }

   public void a(ajc var1) {
      this.dn = var1.a("redstoneDust_cross");
      this.dm = var1.a("redstoneDust_line");
      this.dl = var1.a("redstoneDust_cross_overlay");
      this.dk = var1.a("redstoneDust_line_overlay");
      this.an = this.dn;
   }

   public static ajd do(String var0) {
      if (var0 == "redstoneDust_cross") {
         return pa.bg.dn;
      } else if (var0 == "redstoneDust_line") {
         return pa.bg.dm;
      } else if (var0 == "redstoneDust_cross_overlay") {
         return pa.bg.dl;
      } else {
         return var0 == "redstoneDust_line_overlay" ? pa.bg.dk : null;
      }
   }
}
