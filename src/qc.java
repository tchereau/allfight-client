import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class qc extends o3 {
   private boolean cT = false;
   private static Map cS = new HashMap();

   private boolean if(y6 var1, int var2, int var3, int var4, boolean var5) {
      if (!cS.containsKey(var1)) {
         cS.put(var1, new ArrayList());
      }

      List var6 = (List)cS.get(var1);
      if (var5) {
         var6.add(new qb(var2, var3, var4, var1.m()));
      }

      int var7 = 0;

      for(int var8 = 0; var8 < var6.size(); ++var8) {
         qb var9 = (qb)var6.get(var8);
         if (var9.if == var2 && var9.a == var3 && var9.for == var4) {
            ++var7;
            if (var7 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   protected qc(int var1, boolean var2) {
      super(var1);
      this.cT = var2;
      this.a(true);
      this.a((acn)null);
   }

   public int a(y6 var1) {
      return 2;
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      if (var1.for(var2, var3, var4) == 0) {
         super.for(var1, var2, var3, var4);
      }

      if (this.cT) {
         var1.for(var2, var3 - 1, var4, this.void);
         var1.for(var2, var3 + 1, var4, this.void);
         var1.for(var2 - 1, var3, var4, this.void);
         var1.for(var2 + 1, var3, var4, this.void);
         var1.for(var2, var3, var4 - 1, this.void);
         var1.for(var2, var3, var4 + 1, this.void);
      }

   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.cT) {
         var1.for(var2, var3 - 1, var4, this.void);
         var1.for(var2, var3 + 1, var4, this.void);
         var1.for(var2 - 1, var3, var4, this.void);
         var1.for(var2 + 1, var3, var4, this.void);
         var1.for(var2, var3, var4 - 1, this.void);
         var1.for(var2, var3, var4 + 1, this.void);
      }

   }

   public int do(yy var1, int var2, int var3, int var4, int var5) {
      if (!this.cT) {
         return 0;
      } else {
         int var6 = var1.for(var2, var3, var4);
         if (var6 == 5 && var5 == 1) {
            return 0;
         } else if (var6 == 3 && var5 == 3) {
            return 0;
         } else if (var6 == 4 && var5 == 2) {
            return 0;
         } else if (var6 == 1 && var5 == 5) {
            return 0;
         } else {
            return var6 == 2 && var5 == 4 ? 0 : 15;
         }
      }
   }

   private boolean d(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      if (var5 == 5 && var1.char(var2, var3 - 1, var4, 0)) {
         return true;
      } else if (var5 == 3 && var1.char(var2, var3, var4 - 1, 2)) {
         return true;
      } else if (var5 == 4 && var1.char(var2, var3, var4 + 1, 3)) {
         return true;
      } else if (var5 == 1 && var1.char(var2 - 1, var3, var4, 4)) {
         return true;
      } else {
         return var5 == 2 && var1.char(var2 + 1, var3, var4, 5);
      }
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      boolean var6 = this.d(var1, var2, var3, var4);
      List var7 = (List)cS.get(var1);

      while(var7 != null && !var7.isEmpty() && var1.m() - ((qb)var7.get(0)).do > 60L) {
         var7.remove(0);
      }

      if (this.cT) {
         if (var6) {
            var1.int(var2, var3, var4, pa.cd.void, var1.for(var2, var3, var4), 3);
            if (this.if(var1, var2, var3, var4, true)) {
               var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.o.nextFloat() - var1.o.nextFloat()) * 0.8F);

               for(int var8 = 0; var8 < 5; ++var8) {
                  double var9 = (double)var2 + var5.nextDouble() * 0.6D + 0.2D;
                  double var11 = (double)var3 + var5.nextDouble() * 0.6D + 0.2D;
                  double var13 = (double)var4 + var5.nextDouble() * 0.6D + 0.2D;
                  var1.a("smoke", var9, var11, var13, 0.0D, 0.0D, 0.0D);
               }
            }
         }
      } else if (!var6 && !this.if(var1, var2, var3, var4, false)) {
         var1.int(var2, var3, var4, pa.cc.void, var1.for(var2, var3, var4), 3);
      }

   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!this.long(var1, var2, var3, var4, var5)) {
         boolean var6 = this.d(var1, var2, var3, var4);
         if (this.cT && var6 || !this.cT && !var6) {
            var1.if(var2, var3, var4, this.void, this.a(var1));
         }

      }
   }

   public int for(yy var1, int var2, int var3, int var4, int var5) {
      return var5 == 0 ? this.do(var1, var2, var3, var4, var5) : 0;
   }

   public int a(int var1, Random var2, int var3) {
      return pa.cc.void;
   }

   public boolean int() {
      return true;
   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      if (this.cT) {
         int var6 = var1.for(var2, var3, var4);
         double var7 = (double)((float)var2 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         double var9 = (double)((float)var3 + 0.7F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         double var11 = (double)((float)var4 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         double var13 = 0.2199999988079071D;
         double var15 = 0.27000001072883606D;
         if (var6 == 1) {
            var1.a("reddust", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
         } else if (var6 == 2) {
            var1.a("reddust", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
         } else if (var6 == 3) {
            var1.a("reddust", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
         } else if (var6 == 4) {
            var1.a("reddust", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
         } else {
            var1.a("reddust", var7, var9, var11, 0.0D, 0.0D, 0.0D);
         }

      }
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return pa.cc.void;
   }

   public boolean try(int var1) {
      return var1 == pa.cd.void || var1 == pa.cc.void;
   }

   public void a(ajc var1) {
      if (this.cT) {
         this.an = var1.a("redtorch_lit");
      } else {
         this.an = var1.a("redtorch");
      }

   }
}
