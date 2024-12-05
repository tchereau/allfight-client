import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class yv {
   private static HashMap a = new HashMap();
   protected static final Class[] if = new Class[]{aeu.class, aes.class, aew.class};

   protected static yp a(y6 var0, int var1, int var2) {
      xx var3 = var0.byte(var1, var2);
      int var4 = var1 * 16 + var0.o.nextInt(16);
      int var5 = var2 * 16 + var0.o.nextInt(16);
      int var6 = var0.o.nextInt(var3 == null ? var0.q() : var3.long() + 16 - 1);
      return new yp(var4, var6, var5);
   }

   public static final int a(ak5 var0, boolean var1, boolean var2, boolean var3) {
      if (!var1 && !var2) {
         return 0;
      } else {
         a.clear();

         int var4;
         int var7;
         for(var4 = 0; var4 < var0.z.size(); ++var4) {
            aek var5 = (aek)var0.z.get(var4);
            int var6 = ajs.a(var5.al / 16.0D);
            var7 = ajs.a(var5.aj / 16.0D);
            byte var8 = 8;

            for(int var9 = -var8; var9 <= var8; ++var9) {
               for(int var10 = -var8; var10 <= var8; ++var10) {
                  boolean var11 = var9 == -var8 || var9 == var8 || var10 == -var8 || var10 == var8;
                  zi var12 = new zi(var9 + var6, var10 + var7);
                  if (!var11) {
                     a.put(var12, false);
                  } else if (!a.containsKey(var12)) {
                     a.put(var12, true);
                  }
               }
            }
         }

         var4 = 0;
         apg var32 = var0.long();
         ah9[] var33 = ah9.new();
         var7 = var33.length;

         label131:
         for(int var34 = 0; var34 < var7; ++var34) {
            ah9 var35 = var33[var34];
            if ((!var35.do() || var2) && (var35.do() || var1) && (!var35.a() || var3) && var0.a((Class)var35.int()) <= var35.for() * a.size() / 256) {
               Iterator var36 = a.keySet().iterator();

               label128:
               while(true) {
                  int var13;
                  int var14;
                  int var15;
                  do {
                     do {
                        zi var37;
                        do {
                           if (!var36.hasNext()) {
                              continue label131;
                           }

                           var37 = (zi)var36.next();
                        } while((Boolean)a.get(var37));

                        yp var38 = a(var0, var37.if, var37.a);
                        var13 = var38.if;
                        var14 = var38.a;
                        var15 = var38.do;
                     } while(var0.try(var13, var14, var15));
                  } while(var0.byte(var13, var14, var15) != var35.if());

                  int var16 = 0;

                  for(int var17 = 0; var17 < 3; ++var17) {
                     int var18 = var13;
                     int var19 = var14;
                     int var20 = var15;
                     byte var21 = 6;
                     ym var22 = null;

                     for(int var23 = 0; var23 < 4; ++var23) {
                        var18 += var0.o.nextInt(var21) - var0.o.nextInt(var21);
                        var19 += var0.o.nextInt(1) - var0.o.nextInt(1);
                        var20 += var0.o.nextInt(var21) - var0.o.nextInt(var21);
                        if (a(var35, var0, var18, var19, var20)) {
                           float var24 = (float)var18 + 0.5F;
                           float var25 = (float)var19;
                           float var26 = (float)var20 + 0.5F;
                           if (var0.a((double)var24, (double)var25, (double)var26, 24.0D) == null) {
                              float var27 = var24 - (float)var32.if;
                              float var28 = var25 - (float)var32.a;
                              float var29 = var26 - (float)var32.do;
                              float var30 = var27 * var27 + var28 * var28 + var29 * var29;
                              if (!(var30 < 576.0F)) {
                                 if (var22 == null) {
                                    var22 = var0.a(var35, var18, var19, var20);
                                    if (var22 == null) {
                                       break;
                                    }
                                 }

                                 aig var39;
                                 try {
                                    var39 = (aig)var22.char.getConstructor(y6.class).newInstance(var0);
                                 } catch (Exception var31) {
                                    var31.printStackTrace();
                                    return var4;
                                 }

                                 var39.if((double)var24, (double)var25, (double)var26, var0.o.nextFloat() * 360.0F, 0.0F);
                                 if (var39.bj()) {
                                    ++var16;
                                    var0.new(var39);
                                    a(var39, var0, var24, var25, var26);
                                    if (var16 >= var39.b6()) {
                                       continue label128;
                                    }
                                 }

                                 var4 += var16;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         return var4;
      }
   }

   public static boolean a(ah9 var0, y6 var1, int var2, int var3, int var4) {
      if (var0.if() == ts.s) {
         return var1.byte(var2, var3, var4).case() && var1.byte(var2, var3 - 1, var4).case() && !var1.try(var2, var3 + 1, var4);
      } else if (!var1.case(var2, var3 - 1, var4)) {
         return false;
      } else {
         int var5 = var1.new(var2, var3 - 1, var4);
         return var5 != pa.bc.void && !var1.try(var2, var3, var4) && !var1.byte(var2, var3, var4).case() && !var1.try(var2, var3 + 1, var4);
      }
   }

   private static void a(aig var0, y6 var1, float var2, float var3, float var4) {
      var0.bO();
   }

   public static void a(y6 var0, yn var1, int var2, int var3, int var4, int var5, Random var6) {
      List var7 = var1.a(ah9.case);
      if (!var7.isEmpty()) {
         while(var6.nextFloat() < var1.char()) {
            ym var8 = (ym)ajk.a(var0.o, (Collection)var7);
            int var9 = var8.goto + var6.nextInt(1 + var8.else - var8.goto);
            int var10 = var2 + var6.nextInt(var4);
            int var11 = var3 + var6.nextInt(var5);
            int var12 = var10;
            int var13 = var11;

            for(int var14 = 0; var14 < var9; ++var14) {
               boolean var15 = false;

               for(int var16 = 0; !var15 && var16 < 4; ++var16) {
                  int var17 = var0.case(var10, var11);
                  if (a(ah9.case, var0, var10, var17, var11)) {
                     float var18 = (float)var10 + 0.5F;
                     float var19 = (float)var17;
                     float var20 = (float)var11 + 0.5F;

                     aig var21;
                     try {
                        var21 = (aig)var8.char.getConstructor(y6.class).newInstance(var0);
                     } catch (Exception var23) {
                        var23.printStackTrace();
                        continue;
                     }

                     var21.if((double)var18, (double)var19, (double)var20, var6.nextFloat() * 360.0F, 0.0F);
                     var0.new(var21);
                     a(var21, var0, var18, var19, var20);
                     var15 = true;
                  }

                  var10 += var6.nextInt(5) - var6.nextInt(5);

                  for(var11 += var6.nextInt(5) - var6.nextInt(5); var10 < var2 || var10 >= var2 + var4 || var11 < var3 || var11 >= var3 + var4; var11 = var13 + var6.nextInt(5) - var6.nextInt(5)) {
                     var10 = var12 + var6.nextInt(5) - var6.nextInt(5);
                  }
               }
            }
         }

      }
   }
}
