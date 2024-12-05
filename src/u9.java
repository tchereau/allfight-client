import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class u9 {
   private static final u0[] a = new u0[]{new u0(us.class, 40, 0), new u0(uy.class, 5, 5), new u0(u2.class, 20, 0), new u0(ux.class, 20, 0), new u0(uw.class, 10, 6), new u0(ur.class, 5, 5), new u0(uu.class, 5, 5), new u0(u3.class, 5, 4), new u0(u5.class, 5, 4), new u8(u1.class, 10, 2), new u7(uz.class, 20, 1)};
   private static List int;
   private static Class for;
   static int if = 0;
   private static final uv do = new uv((u8)null);

   public static void a() {
      int = new ArrayList();
      u0[] var0 = a;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         u0 var3 = var0[var2];
         var3.for = 0;
         int.add(var3);
      }

      for = null;
   }

   private static boolean if() {
      boolean var0 = false;
      if = 0;

      u0 var2;
      for(Iterator var1 = int.iterator(); var1.hasNext(); if += var2.a) {
         var2 = (u0)var1.next();
         if (var2.do > 0 && var2.for < var2.do) {
            var0 = true;
         }
      }

      return var0;
   }

   private static uq a(Class var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      Object var8 = null;
      if (var0 == us.class) {
         var8 = us.if(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == uy.class) {
         var8 = uy.int(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == u2.class) {
         var8 = u2.byte(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == ux.class) {
         var8 = ux.byte(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == uw.class) {
         var8 = uw.for(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == ur.class) {
         var8 = ur.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == uu.class) {
         var8 = uu.do(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == u3.class) {
         var8 = u3.case(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == u5.class) {
         var8 = u5.char(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == u1.class) {
         var8 = u1.try(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == uz.class) {
         var8 = uz.new(var1, var2, var3, var4, var5, var6, var7);
      }

      return (uq)var8;
   }

   private static uq if(ut var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if (!if()) {
         return null;
      } else {
         if (for != null) {
            uq var8 = a(for, var1, var2, var3, var4, var5, var6, var7);
            for = null;
            if (var8 != null) {
               return var8;
            }
         }

         int var13 = 0;

         while(var13 < 5) {
            ++var13;
            int var9 = var2.nextInt(if);
            Iterator var10 = int.iterator();

            while(var10.hasNext()) {
               u0 var11 = (u0)var10.next();
               var9 -= var11.a;
               if (var9 < 0) {
                  if (!var11.a(var7) || var11 == var0.else) {
                     break;
                  }

                  uq var12 = a(var11.if, var1, var2, var3, var4, var5, var6, var7);
                  if (var12 != null) {
                     ++var11.for;
                     var0.else = var11;
                     if (!var11.a()) {
                        int.remove(var11);
                     }

                     return var12;
                  }
               }
            }
         }

         wc var14 = u4.a(var1, var2, var3, var4, var5, var6);
         if (var14 != null && var14.a > 1) {
            return new u4(var7, var2, var14, var6);
         } else {
            return null;
         }
      }
   }

   private static uk do(ut var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if (var7 > 50) {
         return null;
      } else if (Math.abs(var3 - var0.do().if) <= 112 && Math.abs(var5 - var0.do().new) <= 112) {
         uq var8 = if(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         if (var8 != null) {
            var1.add(var8);
            var0.goto.add(var8);
         }

         return var8;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static uk a(ut var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return do(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static Class a(Class var0) {
      for = var0;
      return var0;
   }

   // $FF: synthetic method
   static uv do() {
      return do;
   }
}
