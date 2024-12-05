import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class oy extends pa {
   public oy(int var1) {
      super(var1, ts.j);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.15625F, 1.0F);
      this.a(true);
   }

   public int a(y6 var1) {
      return 10;
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

   public int b() {
      return 1;
   }

   public int new() {
      return 30;
   }

   public int a(int var1, Random var2, int var3) {
      return abr.aW.A;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return abr.aW.A;
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.for(var2, var3, var4);
      boolean var7 = (var6 & 2) == 2;
      boolean var8 = !var1.case(var2, var3 - 1, var4);
      if (var7 != var8) {
         this.a(var1, var2, var3, var4, var6, 0);
         var1.o(var2, var3, var4);
      }

   }

   public void int(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      boolean var6 = (var5 & 4) == 4;
      boolean var7 = (var5 & 2) == 2;
      if (!var7) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.09375F, 1.0F);
      } else if (!var6) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      } else {
         this.a(0.0F, 0.0625F, 0.0F, 1.0F, 0.15625F, 1.0F);
      }

   }

   public void for(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.case(var2, var3 - 1, var4) ? 0 : 2;
      var1.do(var2, var3, var4, var5, 3);
      this.else(var1, var2, var3, var4, var5);
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      this.else(var1, var2, var3, var4, var6 | 1);
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, aek var6) {
      if (!var1.goto) {
         if (var6.cD() != null && var6.cD().new == abr.aX.A) {
            var1.do(var2, var3, var4, var5 | 8, 4);
         }

      }
   }

   private void else(y6 var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 2; ++var6) {
         for(int var7 = 1; var7 < 42; ++var7) {
            int var8 = var2 + apk.case[var6] * var7;
            int var9 = var4 + apk.byte[var6] * var7;
            int var10 = var1.new(var8, var3, var9);
            if (var10 == pa.bl.void) {
               int var11 = var1.for(var8, var3, var9) & 3;
               if (var11 == apk.for[var6]) {
                  pa.bl.a(var1, var8, var3, var9, var10, var1.for(var8, var3, var9), true, var7, var5);
               }
               break;
            }

            if (var10 != pa.bj.void) {
               break;
            }
         }
      }

   }

   public void if(y6 var1, int var2, int var3, int var4, aiw var5) {
      if (!var1.goto) {
         if ((var1.for(var2, var3, var4) & 1) != 1) {
            this.goto(var1, var2, var3, var4);
         }
      }
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (!var1.goto) {
         if ((var1.for(var2, var3, var4) & 1) == 1) {
            this.goto(var1, var2, var3, var4);
         }
      }
   }

   private void goto(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      boolean var6 = (var5 & 1) == 1;
      boolean var7 = false;
      List var8 = var1.a((aiw)null, (nw)nw.if().a((double)var2 + this.aR, (double)var3 + this.aO, (double)var4 + this.aL, (double)var2 + this.aI, (double)var3 + this.aF, (double)var4 + this.aC));
      if (!var8.isEmpty()) {
         Iterator var9 = var8.iterator();

         while(var9.hasNext()) {
            aiw var10 = (aiw)var9.next();
            if (!var10.ah()) {
               var7 = true;
               break;
            }
         }
      }

      if (var7 && !var6) {
         var5 |= 1;
      }

      if (!var7 && var6) {
         var5 &= -2;
      }

      if (var7 != var6) {
         var1.do(var2, var3, var4, var5, 3);
         this.else(var1, var2, var3, var4, var5);
      }

      if (var7) {
         var1.if(var2, var3, var4, this.void, this.a(var1));
      }

   }

   public static boolean a(yy var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + apk.case[var5];
      int var8 = var3 + apk.byte[var5];
      int var9 = var0.new(var6, var2, var8);
      boolean var10 = (var4 & 2) == 2;
      int var11;
      if (var9 == pa.bl.void) {
         var11 = var0.for(var6, var2, var8);
         int var13 = var11 & 3;
         return var13 == apk.for[var5];
      } else if (var9 == pa.bj.void) {
         var11 = var0.for(var6, var2, var8);
         boolean var12 = (var11 & 2) == 2;
         return var10 == var12;
      } else {
         return false;
      }
   }
}
