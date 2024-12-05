import java.util.Iterator;
import java.util.Random;

public class r3 extends rj {
   public static final int[][] eG = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
   private ajd[] eF;
   private ajd[] eI;
   private ajd[] eH;

   public r3(int var1) {
      super(var1, ts.m);
      this.A();
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (var1.goto) {
         return true;
      } else {
         int var10 = var1.for(var2, var3, var4);
         if (!F(var10)) {
            int var11 = r(var10);
            var2 += eG[var11][0];
            var4 += eG[var11][1];
            if (var1.new(var2, var3, var4) != this.void) {
               return true;
            }

            var10 = var1.for(var2, var3, var4);
         }

         if (var1.n.do() && var1.a(var2, var4) != yn.x) {
            if (G(var10)) {
               aek var19 = null;
               Iterator var12 = var1.z.iterator();

               while(var12.hasNext()) {
                  aek var21 = (aek)var12.next();
                  if (var21.cg()) {
                     apg var14 = var21.f1;
                     if (var14.if == var2 && var14.a == var3 && var14.do == var4) {
                        var19 = var21;
                     }
                  }
               }

               if (var19 != null) {
                  var5.new("tile.bed.occupied");
                  return true;
               }

               for(var1, var2, var3, var4, false);
            }

            aej var20 = var5.int(var2, var3, var4);
            if (var20 == aej.if) {
               for(var1, var2, var3, var4, true);
               return true;
            } else {
               if (var20 == aej.try) {
                  var5.new("tile.bed.noSleep");
               } else if (var20 == aej.for) {
                  var5.new("tile.bed.notSafe");
               }

               return true;
            }
         } else {
            double var18 = (double)var2 + 0.5D;
            double var13 = (double)var3 + 0.5D;
            double var15 = (double)var4 + 0.5D;
            var1.o(var2, var3, var4);
            int var17 = r(var10);
            var2 += eG[var17][0];
            var4 += eG[var17][1];
            if (var1.new(var2, var3, var4) == this.void) {
               var1.o(var2, var3, var4);
               var18 = (var18 + (double)var2 + 0.5D) / 2.0D;
               var13 = (var13 + (double)var3 + 0.5D) / 2.0D;
               var15 = (var15 + (double)var4 + 0.5D) / 2.0D;
            }

            var1.a((aiw)null, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), 5.0F, true, true);
            return true;
         }
      }
   }

   public ajd if(int var1, int var2) {
      if (var1 == 0) {
         return pa.be.do(var1);
      } else {
         int var3 = r(var2);
         int var4 = apk.a[var3][var1];
         int var5 = F(var2) ? 1 : 0;
         if (var5 == 1 && var4 == 2 || var5 == 0 && var4 == 3) {
            return this.eF[var5];
         } else {
            return var4 != 5 && var4 != 4 ? this.eH[var5] : this.eI[var5];
         }
      }
   }

   public void a(ajc var1) {
      this.eH = new ajd[]{var1.a("bed_feet_top"), var1.a("bed_head_top")};
      this.eF = new ajd[]{var1.a("bed_feet_end"), var1.a("bed_head_end")};
      this.eI = new ajd[]{var1.a("bed_feet_side"), var1.a("bed_head_side")};
   }

   public int new() {
      return 14;
   }

   public boolean if() {
      return false;
   }

   public boolean do() {
      return false;
   }

   public void int(yy var1, int var2, int var3, int var4) {
      this.A();
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.for(var2, var3, var4);
      int var7 = r(var6);
      if (F(var6)) {
         if (var1.new(var2 - eG[var7][0], var3, var4 - eG[var7][1]) != this.void) {
            var1.o(var2, var3, var4);
         }
      } else if (var1.new(var2 + eG[var7][0], var3, var4 + eG[var7][1]) != this.void) {
         var1.o(var2, var3, var4);
         if (!var1.goto) {
            this.a(var1, var2, var3, var4, var6, 0);
         }
      }

   }

   public int a(int var1, Random var2, int var3) {
      return F(var1) ? 0 : abr.a5.A;
   }

   private void A() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
   }

   public static boolean F(int var0) {
      return (var0 & 8) != 0;
   }

   public static boolean G(int var0) {
      return (var0 & 4) != 0;
   }

   public static void for(y6 var0, int var1, int var2, int var3, boolean var4) {
      int var5 = var0.for(var1, var2, var3);
      if (var4) {
         var5 |= 4;
      } else {
         var5 &= -5;
      }

      var0.do(var1, var2, var3, var5, 4);
   }

   public static apg l(y6 var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.for(var1, var2, var3);
      int var6 = rj.r(var5);

      for(int var7 = 0; var7 <= 1; ++var7) {
         int var8 = var1 - eG[var6][0] * var7 - 1;
         int var9 = var3 - eG[var6][1] * var7 - 1;
         int var10 = var8 + 2;
         int var11 = var9 + 2;

         for(int var12 = var8; var12 <= var10; ++var12) {
            for(int var13 = var9; var13 <= var11; ++var13) {
               if (var0.case(var12, var2 - 1, var13) && var0.a(var12, var2, var13) && var0.a(var12, var2 + 1, var13)) {
                  if (var4 <= 0) {
                     return new apg(var12, var2, var13);
                  }

                  --var4;
               }
            }
         }
      }

      return null;
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if (!F(var5)) {
         super.a(var1, var2, var3, var4, var5, var6, 0);
      }

   }

   public int case() {
      return 1;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return abr.a5.A;
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, aek var6) {
      if (var6.fY.new && F(var5)) {
         int var7 = r(var5);
         var2 -= eG[var7][0];
         var4 -= eG[var7][1];
         if (var1.new(var2, var3, var4) == this.void) {
            var1.o(var2, var3, var4);
         }
      }

   }
}
