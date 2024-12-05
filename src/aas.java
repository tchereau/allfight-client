import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class aas {
   public static final String c = null;
   public static final String b;
   public static final String void = "+0-1-2-3&4-4+13";
   public static final String long;
   public static final String goto;
   public static final String else;
   public static final String char;
   public static final String case;
   public static final String byte;
   public static final String try;
   public static final String new;
   public static final String int;
   private static final HashMap for = new HashMap();
   private static final HashMap do = new HashMap();
   private static final HashMap if;
   private static final String[] a;

   public static boolean do(int var0, int var1) {
      return (var0 & 1 << var1) != 0;
   }

   private static int a(int var0, int var1) {
      return do(var0, var1) ? 1 : 0;
   }

   private static int if(int var0, int var1) {
      return do(var0, var1) ? 0 : 1;
   }

   public static int a(int var0) {
      return a(var0, 5, 4, 3, 2, 1);
   }

   public static int a(Collection var0) {
      int var1 = 3694022;
      if (var0 != null && !var0.isEmpty()) {
         float var2 = 0.0F;
         float var3 = 0.0F;
         float var4 = 0.0F;
         float var5 = 0.0F;
         Iterator var6 = var0.iterator();

         while(var6.hasNext()) {
            aiz var7 = (aiz)var6.next();
            int var8 = ai0.A[var7.byte()].for();

            for(int var9 = 0; var9 <= var7.int(); ++var9) {
               var2 += (float)(var8 >> 16 & 255) / 255.0F;
               var3 += (float)(var8 >> 8 & 255) / 255.0F;
               var4 += (float)(var8 >> 0 & 255) / 255.0F;
               ++var5;
            }
         }

         var2 = var2 / var5 * 255.0F;
         var3 = var3 / var5 * 255.0F;
         var4 = var4 / var5 * 255.0F;
         return (int)var2 << 16 | (int)var3 << 8 | (int)var4;
      } else {
         return var1;
      }
   }

   public static boolean if(Collection var0) {
      Iterator var1 = var0.iterator();

      aiz var2;
      do {
         if (!var1.hasNext()) {
            return true;
         }

         var2 = (aiz)var1.next();
      } while(var2.for());

      return false;
   }

   public static int if(int var0, boolean var1) {
      if (!var1) {
         if (if.containsKey(var0)) {
            return (Integer)if.get(var0);
         } else {
            int var2 = a(a(var0, false));
            if.put(var0, var2);
            return var2;
         }
      } else {
         return a(a(var0, var1));
      }
   }

   public static String if(int var0) {
      int var1 = a(var0);
      return a[var1];
   }

   private static int a(boolean var0, boolean var1, boolean var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if (var0) {
         var7 = if(var6, var4);
      } else if (var3 != -1) {
         if (var3 == 0 && do(var6) == var4) {
            var7 = 1;
         } else if (var3 == 1 && do(var6) > var4) {
            var7 = 1;
         } else if (var3 == 2 && do(var6) < var4) {
            var7 = 1;
         }
      } else {
         var7 = a(var6, var4);
      }

      if (var1) {
         var7 *= var5;
      }

      if (var2) {
         var7 *= -1;
      }

      return var7;
   }

   private static int do(int var0) {
      int var1;
      for(var1 = 0; var0 > 0; ++var1) {
         var0 &= var0 - 1;
      }

      return var1;
   }

   private static int a(String var0, int var1, int var2, int var3) {
      if (var1 < var0.length() && var2 >= 0 && var1 < var2) {
         int var4 = var0.indexOf(124, var1);
         int var5;
         int var17;
         if (var4 >= 0 && var4 < var2) {
            var5 = a(var0, var1, var4 - 1, var3);
            if (var5 > 0) {
               return var5;
            } else {
               var17 = a(var0, var4 + 1, var2, var3);
               return var17 > 0 ? var17 : 0;
            }
         } else {
            var5 = var0.indexOf(38, var1);
            if (var5 >= 0 && var5 < var2) {
               var17 = a(var0, var1, var5 - 1, var3);
               if (var17 <= 0) {
                  return 0;
               } else {
                  int var18 = a(var0, var5 + 1, var2, var3);
                  if (var18 <= 0) {
                     return 0;
                  } else {
                     return var17 > var18 ? var17 : var18;
                  }
               }
            } else {
               boolean var6 = false;
               boolean var7 = false;
               boolean var8 = false;
               boolean var9 = false;
               boolean var10 = false;
               byte var11 = -1;
               int var12 = 0;
               int var13 = 0;
               int var14 = 0;

               for(int var15 = var1; var15 < var2; ++var15) {
                  char var16 = var0.charAt(var15);
                  if (var16 >= '0' && var16 <= '9') {
                     if (var6) {
                        var13 = var16 - 48;
                        var7 = true;
                     } else {
                        var12 *= 10;
                        var12 += var16 - 48;
                        var8 = true;
                     }
                  } else if (var16 == '*') {
                     var6 = true;
                  } else if (var16 == '!') {
                     if (var8) {
                        var14 += a(var9, var7, var10, var11, var12, var13, var3);
                        var9 = false;
                        var10 = false;
                        var6 = false;
                        var7 = false;
                        var8 = false;
                        var13 = 0;
                        var12 = 0;
                        var11 = -1;
                     }

                     var9 = true;
                  } else if (var16 == '-') {
                     if (var8) {
                        var14 += a(var9, var7, var10, var11, var12, var13, var3);
                        var9 = false;
                        var10 = false;
                        var6 = false;
                        var7 = false;
                        var8 = false;
                        var13 = 0;
                        var12 = 0;
                        var11 = -1;
                     }

                     var10 = true;
                  } else if (var16 != '=' && var16 != '<' && var16 != '>') {
                     if (var16 == '+' && var8) {
                        var14 += a(var9, var7, var10, var11, var12, var13, var3);
                        var9 = false;
                        var10 = false;
                        var6 = false;
                        var7 = false;
                        var8 = false;
                        var13 = 0;
                        var12 = 0;
                        var11 = -1;
                     }
                  } else {
                     if (var8) {
                        var14 += a(var9, var7, var10, var11, var12, var13, var3);
                        var9 = false;
                        var10 = false;
                        var6 = false;
                        var7 = false;
                        var8 = false;
                        var13 = 0;
                        var12 = 0;
                        var11 = -1;
                     }

                     if (var16 == '=') {
                        var11 = 0;
                     } else if (var16 == '<') {
                        var11 = 2;
                     } else if (var16 == '>') {
                        var11 = 1;
                     }
                  }
               }

               if (var8) {
                  var14 += a(var9, var7, var10, var11, var12, var13, var3);
               }

               return var14;
            }
         }
      } else {
         return 0;
      }
   }

   public static List a(int var0, boolean var1) {
      ArrayList var2 = null;
      ai0[] var3 = ai0.A;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         ai0 var6 = var3[var5];
         if (var6 != null && (!var6.a() || var1)) {
            String var7 = (String)for.get(var6.do());
            if (var7 != null) {
               int var8 = a(var7, 0, var7.length(), var0);
               if (var8 > 0) {
                  int var9 = 0;
                  String var10 = (String)do.get(var6.do());
                  if (var10 != null) {
                     var9 = a(var10, 0, var10.length(), var0);
                     if (var9 < 0) {
                        var9 = 0;
                     }
                  }

                  if (var6.case()) {
                     var8 = 1;
                  } else {
                     var8 = 1200 * (var8 * 3 + (var8 - 1) * 2);
                     var8 >>= var9;
                     var8 = (int)Math.round((double)var8 * var6.int());
                     if ((var0 & 16384) != 0) {
                        var8 = (int)Math.round((double)var8 * 0.75D + 0.5D);
                     }
                  }

                  if (var2 == null) {
                     var2 = new ArrayList();
                  }

                  aiz var11 = new aiz(var6.do(), var8, var9);
                  if ((var0 & 16384) != 0) {
                     var11.if(true);
                  }

                  var2.add(var11);
               }
            }
         }
      }

      return var2;
   }

   private static int a(int var0, int var1, boolean var2, boolean var3, boolean var4) {
      if (var4) {
         if (!do(var0, var1)) {
            return 0;
         }
      } else if (var2) {
         var0 &= ~(1 << var1);
      } else if (var3) {
         if ((var0 & 1 << var1) == 0) {
            var0 |= 1 << var1;
         } else {
            var0 &= ~(1 << var1);
         }
      } else {
         var0 |= 1 << var1;
      }

      return var0;
   }

   public static int a(int var0, String var1) {
      byte var2 = 0;
      int var3 = var1.length();
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      int var8 = 0;

      for(int var9 = var2; var9 < var3; ++var9) {
         char var10 = var1.charAt(var9);
         if (var10 >= '0' && var10 <= '9') {
            var8 *= 10;
            var8 += var10 - 48;
            var4 = true;
         } else if (var10 == '!') {
            if (var4) {
               var0 = a(var0, var8, var6, var5, var7);
               var7 = false;
               var5 = false;
               var6 = false;
               var4 = false;
               var8 = 0;
            }

            var5 = true;
         } else if (var10 == '-') {
            if (var4) {
               var0 = a(var0, var8, var6, var5, var7);
               var7 = false;
               var5 = false;
               var6 = false;
               var4 = false;
               var8 = 0;
            }

            var6 = true;
         } else if (var10 == '+') {
            if (var4) {
               var0 = a(var0, var8, var6, var5, var7);
               var7 = false;
               var5 = false;
               var6 = false;
               var4 = false;
               var8 = 0;
            }
         } else if (var10 == '&') {
            if (var4) {
               var0 = a(var0, var8, var6, var5, var7);
               var7 = false;
               var5 = false;
               var6 = false;
               var4 = false;
               var8 = 0;
            }

            var7 = true;
         }
      }

      if (var4) {
         var0 = a(var0, var8, var6, var5, var7);
      }

      return var0 & 32767;
   }

   public static int a(int var0, int var1, int var2, int var3, int var4, int var5) {
      return (do(var0, var1) ? 16 : 0) | (do(var0, var2) ? 8 : 0) | (do(var0, var3) ? 4 : 0) | (do(var0, var4) ? 2 : 0) | (do(var0, var5) ? 1 : 0);
   }

   static {
      for.put(ai0.p.do(), "0 & !1 & !2 & !3 & 0+6");
      b = "-0+1-2-3&4-4+13";
      for.put(ai0.y.do(), "!0 & 1 & !2 & !3 & 1+6");
      case = "+0+1-2-3&4-4+13";
      for.put(ai0.n.do(), "0 & 1 & !2 & !3 & 0+6");
      else = "+0-1+2-3&4-4+13";
      for.put(ai0.t.do(), "0 & !1 & 2 & !3");
      long = "-0-1+2-3&4-4+13";
      for.put(ai0.g.do(), "!0 & !1 & 2 & !3 & 2+6");
      goto = "-0+3-4+13";
      for.put(ai0.h.do(), "!0 & !1 & !2 & 3 & 3+6");
      for.put(ai0.s.do(), "!0 & !1 & 2 & 3");
      for.put(ai0.x.do(), "!0 & 1 & !2 & 3 & 3+6");
      char = "+0-1-2+3&4-4+13";
      for.put(ai0.u.do(), "0 & !1 & !2 & 3 & 3+6");
      int = "-0+1+2-3+13&4-4";
      for.put(ai0.j.do(), "!0 & 1 & 2 & !3 & 2+6");
      for.put(ai0.l.do(), "!0 & 1 & 2 & 3 & 2+6");
      try = "+5-6-7";
      do.put(ai0.y.do(), "5");
      do.put(ai0.w.do(), "5");
      do.put(ai0.u.do(), "5");
      do.put(ai0.p.do(), "5");
      do.put(ai0.s.do(), "5");
      do.put(ai0.t.do(), "5");
      do.put(ai0.o.do(), "5");
      do.put(ai0.g.do(), "5");
      byte = "-5+6-7";
      new = "+14&13-13";
      if = new HashMap();
      a = new String[]{"potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", "potion.prefix.gross", "potion.prefix.stinky"};
   }
}
