import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class z1 {
   private static final Random if = new Random();
   private static final zx a = new zx((z0)null);
   private static final zy do = new zy((z0)null);

   public static int a(int var0, abp var1) {
      if (var1 == null) {
         return 0;
      } else {
         aqm var2 = var1.try();
         if (var2 == null) {
            return 0;
         } else {
            for(int var3 = 0; var3 < var2.for(); ++var3) {
               short var4 = ((aqv)var2.a(var3)).case("id");
               short var5 = ((aqv)var2.a(var3)).case("lvl");
               if (var4 == var0) {
                  return var5;
               }
            }

            return 0;
         }
      }
   }

   public static Map a(abp var0) {
      LinkedHashMap var1 = new LinkedHashMap();
      aqm var2 = var0.new == abr.bj.A ? abr.bj.long(var0) : var0.try();
      if (var2 != null) {
         for(int var3 = 0; var3 < var2.for(); ++var3) {
            short var4 = ((aqv)var2.a(var3)).case("id");
            short var5 = ((aqv)var2.a(var3)).case("lvl");
            var1.put(Integer.valueOf(var4), Integer.valueOf(var5));
         }
      }

      return var1;
   }

   public static void a(Map var0, abp var1) {
      aqm var2 = new aqm();
      Iterator var3 = var0.keySet().iterator();

      while(var3.hasNext()) {
         int var4 = (Integer)var3.next();
         aqv var5 = new aqv();
         var5.a("id", (short)var4);
         var5.a("lvl", (short)(Integer)var0.get(var4));
         var2.a((aqd)var5);
         if (var1.new == abr.bj.A) {
            abr.bj.a(var1, new zw(var4, (Integer)var0.get(var4)));
         }
      }

      if (var2.for() > 0) {
         if (var1.new != abr.bj.A) {
            var1.a((String)"ench", (aqd)var2);
         }
      } else if (var1.a()) {
         var1.b().do("ench");
      }

   }

   public static int a(int var0, abp[] var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = 0;
         abp[] var3 = var1;
         int var4 = var1.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            abp var6 = var3[var5];
            int var7 = a(var0, var6);
            if (var7 > var2) {
               var2 = var7;
            }
         }

         return var2;
      }
   }

   private static void a(zz var0, abp var1) {
      if (var1 != null) {
         aqm var2 = var1.try();
         if (var2 != null) {
            for(int var3 = 0; var3 < var2.for(); ++var3) {
               short var4 = ((aqv)var2.a(var3)).case("id");
               short var5 = ((aqv)var2.a(var3)).case("lvl");
               if (z3.n[var4] != null) {
                  var0.a(z3.n[var4], var5);
               }
            }

         }
      }
   }

   private static void a(zz var0, abp[] var1) {
      abp[] var2 = var1;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         abp var5 = var2[var4];
         a(var0, var5);
      }

   }

   public static int a(abp[] var0, ai4 var1) {
      a.for = 0;
      a.do = var1;
      a((zz)a, (abp[])var0);
      if (a.for > 25) {
         a.for = 25;
      }

      return (a.for + 1 >> 1) + if.nextInt((a.for >> 1) + 1);
   }

   public static int a(aig var0, aig var1) {
      do.if = 0;
      do.a = var1;
      a((zz)do, (abp)var0.bW());
      return do.if > 0 ? 1 + if.nextInt(do.if) : 0;
   }

   public static int if(aig var0, aig var1) {
      return a(z3.void.a, var0.bW());
   }

   public static int if(aig var0) {
      return a(z3.long.a, var0.bW());
   }

   public static int try(aig var0) {
      return a(z3.g.a, var0.as());
   }

   public static int byte(aig var0) {
      return a(z3.case.a, var0.bW());
   }

   public static boolean for(aig var0) {
      return a(z3.byte.a, var0.bW()) > 0;
   }

   public static int a(aig var0) {
      return a(z3.new.a, var0.bW());
   }

   public static int new(aig var0) {
      return a(z3.else.a, var0.bW());
   }

   public static boolean int(aig var0) {
      return a(z3.f.a, var0.as()) > 0;
   }

   public static int do(aig var0) {
      return a(z3.e.a, var0.as());
   }

   public static abp a(z3 var0, aig var1) {
      abp[] var2 = var1.as();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         abp var5 = var2[var4];
         if (var5 != null && a(var0.a, var5) > 0) {
            return var5;
         }
      }

      return null;
   }

   public static int a(Random var0, int var1, int var2, abp var3) {
      abr var4 = var3.d();
      int var5 = var4.d();
      if (var5 <= 0) {
         return 0;
      } else {
         if (var2 > 15) {
            var2 = 15;
         }

         int var6 = var0.nextInt(8) + 1 + (var2 >> 1) + var0.nextInt(var2 + 1);
         if (var1 == 0) {
            return Math.max(var6 / 3, 1);
         } else {
            return var1 == 1 ? var6 * 2 / 3 + 1 : Math.max(var6, var2 * 2);
         }
      }
   }

   public static abp a(Random var0, abp var1, int var2) {
      List var3 = if(var0, var1, var2);
      boolean var4 = var1.new == abr.cm.A;
      if (var4) {
         var1.new = abr.bj.A;
      }

      if (var3 != null) {
         Iterator var5 = var3.iterator();

         while(var5.hasNext()) {
            zw var6 = (zw)var5.next();
            if (var4) {
               abr.bj.a(var1, var6);
            } else {
               var1.a(var6.int, var6.new);
            }
         }
      }

      return var1;
   }

   public static List if(Random var0, abp var1, int var2) {
      abr var3 = var1.d();
      int var4 = var3.d();
      if (var4 <= 0) {
         return null;
      } else {
         var4 /= 2;
         var4 = 1 + var0.nextInt((var4 >> 1) + 1) + var0.nextInt((var4 >> 1) + 1);
         int var5 = var4 + var2;
         float var6 = (var0.nextFloat() + var0.nextFloat() - 1.0F) * 0.15F;
         int var7 = (int)((float)var5 * (1.0F + var6) + 0.5F);
         if (var7 < 1) {
            var7 = 1;
         }

         ArrayList var8 = null;
         Map var9 = if(var7, var1);
         if (var9 != null && !var9.isEmpty()) {
            zw var10 = (zw)ajk.a(var0, var9.values());
            if (var10 != null) {
               var8 = new ArrayList();
               var8.add(var10);

               for(int var11 = var7; var0.nextInt(50) <= var11; var11 >>= 1) {
                  Iterator var12 = var9.keySet().iterator();

                  while(var12.hasNext()) {
                     Integer var13 = (Integer)var12.next();
                     boolean var14 = true;
                     Iterator var15 = var8.iterator();

                     while(var15.hasNext()) {
                        zw var16 = (zw)var15.next();
                        if (!var16.int.a(z3.n[var13])) {
                           var14 = false;
                           break;
                        }
                     }

                     if (!var14) {
                        var12.remove();
                     }
                  }

                  if (!var9.isEmpty()) {
                     zw var17 = (zw)ajk.a(var0, var9.values());
                     var8.add(var17);
                  }
               }
            }
         }

         return var8;
      }
   }

   public static Map if(int var0, abp var1) {
      abr var2 = var1.d();
      HashMap var3 = null;
      boolean var4 = var1.new == abr.cm.A;
      z3[] var5 = z3.n;
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         z3 var8 = var5[var7];
         if (var8 != null && (var8.goto.a(var2) || var4)) {
            for(int var9 = var8.a(); var9 <= var8.do(); ++var9) {
               if (var0 >= var8.if(var9) && var0 <= var8.a(var9)) {
                  if (var3 == null) {
                     var3 = new HashMap();
                  }

                  var3.put(var8.a, new zw(var8, var9));
               }
            }
         }
      }

      return var3;
   }
}
