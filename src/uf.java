import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class uf {
   public static ArrayList a(Random var0, int var1) {
      ArrayList var2 = new ArrayList();
      var2.add(new ua(t8.class, 4, ajs.a(var0, 2 + var1, 4 + var1 * 2)));
      var2.add(new ua(t6.class, 20, ajs.a(var0, 0 + var1, 1 + var1)));
      var2.add(new ua(ue.class, 20, ajs.a(var0, 0 + var1, 2 + var1)));
      var2.add(new ua(t7.class, 3, ajs.a(var0, 2 + var1, 5 + var1 * 3)));
      var2.add(new ua(t9.class, 15, ajs.a(var0, 0 + var1, 2 + var1)));
      var2.add(new ua(ud.class, 3, ajs.a(var0, 1 + var1, 4 + var1)));
      var2.add(new ua(uc.class, 3, ajs.a(var0, 2 + var1, 4 + var1 * 2)));
      var2.add(new ua(t5.class, 15, ajs.a((Random)var0, 0, 1 + var1)));
      var2.add(new ua(t2.class, 8, ajs.a(var0, 0 + var1, 3 + var1 * 2)));
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         if (((ua)var3.next()).do == 0) {
            var3.remove();
         }
      }

      return var2;
   }

   private static int a(List var0) {
      boolean var1 = false;
      int var2 = 0;

      ua var4;
      for(Iterator var3 = var0.iterator(); var3.hasNext(); var2 += var4.a) {
         var4 = (ua)var3.next();
         if (var4.do > 0 && var4.for < var4.do) {
            var1 = true;
         }
      }

      return var1 ? var2 : -1;
   }

   private static t1 a(t4 var0, ua var1, List var2, Random var3, int var4, int var5, int var6, int var7, int var8) {
      Class var9 = var1.if;
      Object var10 = null;
      if (var9 == t8.class) {
         var10 = t8.int(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == t6.class) {
         var10 = t6.do(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == ue.class) {
         var10 = ue.case(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == t7.class) {
         var10 = t7.for(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == t9.class) {
         var10 = t9.new(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == ud.class) {
         var10 = ud.byte(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == uc.class) {
         var10 = uc.try(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == t5.class) {
         var10 = t5.if(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == t2.class) {
         var10 = t2.a(var0, var2, var3, var4, var5, var6, var7, var8);
      }

      return (t1)var10;
   }

   private static t1 int(t4 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = a(var0.aw);
      if (var8 <= 0) {
         return null;
      } else {
         int var9 = 0;

         while(var9 < 5) {
            ++var9;
            int var10 = var2.nextInt(var8);
            Iterator var11 = var0.aw.iterator();

            while(var11.hasNext()) {
               ua var12 = (ua)var11.next();
               var10 -= var12.a;
               if (var10 < 0) {
                  if (!var12.a(var7) || var12 == var0.ax && var0.aw.size() > 1) {
                     break;
                  }

                  t1 var13 = a(var0, var12, var1, var2, var3, var4, var5, var6, var7);
                  if (var13 != null) {
                     ++var12.for;
                     var0.ax = var12;
                     if (!var12.a()) {
                        var0.aw.remove(var12);
                     }

                     return var13;
                  }
               }
            }
         }

         wc var14 = ub.if(var0, var1, var2, var3, var4, var5, var6);
         if (var14 != null) {
            return new ub(var0, var7, var2, var14, var6);
         } else {
            return null;
         }
      }
   }

   private static uk for(t4 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if (var7 > 50) {
         return null;
      } else if (Math.abs(var3 - var0.do().if) <= 112 && Math.abs(var5 - var0.do().new) <= 112) {
         t1 var8 = int(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         if (var8 != null) {
            int var9 = (var8.do.if + var8.do.int) / 2;
            int var10 = (var8.do.new + var8.do.do) / 2;
            int var11 = var8.do.int - var8.do.if;
            int var12 = var8.do.do - var8.do.new;
            int var13 = var11 > var12 ? var11 : var12;
            if (var0.for().a(var9, var10, var13 / 2 + 4, uh.g)) {
               var1.add(var8);
               var0.av.add(var8);
               return var8;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static uk a(t4 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if (var7 > 3 + var0.ay) {
         return null;
      } else if (Math.abs(var3 - var0.do().if) <= 112 && Math.abs(var5 - var0.do().new) <= 112) {
         wc var8 = t3.a(var0, var1, var2, var3, var4, var5, var6);
         if (var8 != null && var8.a > 10) {
            t3 var9 = new t3(var0, var7, var2, var8, var6);
            int var10 = (var9.do.if + var9.do.int) / 2;
            int var11 = (var9.do.new + var9.do.do) / 2;
            int var12 = var9.do.int - var9.do.if;
            int var13 = var9.do.do - var9.do.new;
            int var14 = var12 > var13 ? var12 : var13;
            if (var0.for().a(var10, var11, var14 / 2 + 4, uh.g)) {
               var1.add(var9);
               var0.au.add(var9);
               return var9;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static uk if(t4 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return for(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static uk do(t4 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return a(var0, var1, var2, var3, var4, var5, var6, var7);
   }
}
