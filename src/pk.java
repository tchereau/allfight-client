import java.util.List;
import java.util.Random;

public class pk extends pa {
   private static final int[][] c4 = new int[][]{{2, 6}, {3, 7}, {2, 3}, {6, 7}, {0, 4}, {1, 5}, {0, 1}, {4, 5}};
   private final pa c3;
   private final int c7;
   private boolean c6 = false;
   private int c5 = 0;

   protected pk(int var1, pa var2, int var3) {
      super(var1, var2.at);
      this.c3 = var2;
      this.c7 = var3;
      this.if(var2.a9);
      this.a(var2.a6 / 3.0F);
      this.a((o6)var2.az);
      this.new(255);
      this.a((acn)acn.d);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      if (this.c6) {
         this.a(0.5F * (float)(this.c5 % 2), 0.5F * (float)(this.c5 / 2 % 2), 0.5F * (float)(this.c5 / 4 % 2), 0.5F + 0.5F * (float)(this.c5 % 2), 0.5F + 0.5F * (float)(this.c5 / 2 % 2), 0.5F + 0.5F * (float)(this.c5 / 4 % 2));
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public int new() {
      return 10;
   }

   public void char(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      if ((var5 & 4) != 0) {
         this.a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

   }

   public static boolean h(int var0) {
      return var0 > 0 && pa.x[var0] instanceof pk;
   }

   private boolean new(yy var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.new(var2, var3, var4);
      return h(var6) && var1.for(var2, var3, var4) == var5;
   }

   public boolean byte(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      int var6 = var5 & 3;
      float var7 = 0.5F;
      float var8 = 1.0F;
      if ((var5 & 4) != 0) {
         var7 = 0.0F;
         var8 = 0.5F;
      }

      float var9 = 0.0F;
      float var10 = 1.0F;
      float var11 = 0.0F;
      float var12 = 0.5F;
      boolean var13 = true;
      int var14;
      int var15;
      int var16;
      if (var6 == 0) {
         var9 = 0.5F;
         var12 = 1.0F;
         var14 = var1.new(var2 + 1, var3, var4);
         var15 = var1.for(var2 + 1, var3, var4);
         if (h(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if (var16 == 3 && !this.new(var1, var2, var3, var4 + 1, var5)) {
               var12 = 0.5F;
               var13 = false;
            } else if (var16 == 2 && !this.new(var1, var2, var3, var4 - 1, var5)) {
               var11 = 0.5F;
               var13 = false;
            }
         }
      } else if (var6 == 1) {
         var10 = 0.5F;
         var12 = 1.0F;
         var14 = var1.new(var2 - 1, var3, var4);
         var15 = var1.for(var2 - 1, var3, var4);
         if (h(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if (var16 == 3 && !this.new(var1, var2, var3, var4 + 1, var5)) {
               var12 = 0.5F;
               var13 = false;
            } else if (var16 == 2 && !this.new(var1, var2, var3, var4 - 1, var5)) {
               var11 = 0.5F;
               var13 = false;
            }
         }
      } else if (var6 == 2) {
         var11 = 0.5F;
         var12 = 1.0F;
         var14 = var1.new(var2, var3, var4 + 1);
         var15 = var1.for(var2, var3, var4 + 1);
         if (h(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if (var16 == 1 && !this.new(var1, var2 + 1, var3, var4, var5)) {
               var10 = 0.5F;
               var13 = false;
            } else if (var16 == 0 && !this.new(var1, var2 - 1, var3, var4, var5)) {
               var9 = 0.5F;
               var13 = false;
            }
         }
      } else if (var6 == 3) {
         var14 = var1.new(var2, var3, var4 - 1);
         var15 = var1.for(var2, var3, var4 - 1);
         if (h(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if (var16 == 1 && !this.new(var1, var2 + 1, var3, var4, var5)) {
               var10 = 0.5F;
               var13 = false;
            } else if (var16 == 0 && !this.new(var1, var2 - 1, var3, var4, var5)) {
               var9 = 0.5F;
               var13 = false;
            }
         }
      }

      this.a(var9, var7, var11, var10, var8, var12);
      return var13;
   }

   public boolean case(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      int var6 = var5 & 3;
      float var7 = 0.5F;
      float var8 = 1.0F;
      if ((var5 & 4) != 0) {
         var7 = 0.0F;
         var8 = 0.5F;
      }

      float var9 = 0.0F;
      float var10 = 0.5F;
      float var11 = 0.5F;
      float var12 = 1.0F;
      boolean var13 = false;
      int var14;
      int var15;
      int var16;
      if (var6 == 0) {
         var14 = var1.new(var2 - 1, var3, var4);
         var15 = var1.for(var2 - 1, var3, var4);
         if (h(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if (var16 == 3 && !this.new(var1, var2, var3, var4 - 1, var5)) {
               var11 = 0.0F;
               var12 = 0.5F;
               var13 = true;
            } else if (var16 == 2 && !this.new(var1, var2, var3, var4 + 1, var5)) {
               var11 = 0.5F;
               var12 = 1.0F;
               var13 = true;
            }
         }
      } else if (var6 == 1) {
         var14 = var1.new(var2 + 1, var3, var4);
         var15 = var1.for(var2 + 1, var3, var4);
         if (h(var14) && (var5 & 4) == (var15 & 4)) {
            var9 = 0.5F;
            var10 = 1.0F;
            var16 = var15 & 3;
            if (var16 == 3 && !this.new(var1, var2, var3, var4 - 1, var5)) {
               var11 = 0.0F;
               var12 = 0.5F;
               var13 = true;
            } else if (var16 == 2 && !this.new(var1, var2, var3, var4 + 1, var5)) {
               var11 = 0.5F;
               var12 = 1.0F;
               var13 = true;
            }
         }
      } else if (var6 == 2) {
         var14 = var1.new(var2, var3, var4 - 1);
         var15 = var1.for(var2, var3, var4 - 1);
         if (h(var14) && (var5 & 4) == (var15 & 4)) {
            var11 = 0.0F;
            var12 = 0.5F;
            var16 = var15 & 3;
            if (var16 == 1 && !this.new(var1, var2 - 1, var3, var4, var5)) {
               var13 = true;
            } else if (var16 == 0 && !this.new(var1, var2 + 1, var3, var4, var5)) {
               var9 = 0.5F;
               var10 = 1.0F;
               var13 = true;
            }
         }
      } else if (var6 == 3) {
         var14 = var1.new(var2, var3, var4 + 1);
         var15 = var1.for(var2, var3, var4 + 1);
         if (h(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if (var16 == 1 && !this.new(var1, var2 - 1, var3, var4, var5)) {
               var13 = true;
            } else if (var16 == 0 && !this.new(var1, var2 + 1, var3, var4, var5)) {
               var9 = 0.5F;
               var10 = 1.0F;
               var13 = true;
            }
         }
      }

      if (var13) {
         this.a(var9, var7, var11, var10, var8, var12);
      }

      return var13;
   }

   public void a(y6 var1, int var2, int var3, int var4, nw var5, List var6, aiw var7) {
      this.char(var1, var2, var3, var4);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      boolean var8 = this.byte(var1, var2, var3, var4);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      if (var8 && this.case((yy)var1, var2, var3, var4)) {
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      this.c3.a(var1, var2, var3, var4, var5);
   }

   public void a(y6 var1, int var2, int var3, int var4, aek var5) {
      this.c3.a(var1, var2, var3, var4, var5);
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5) {
      this.c3.a(var1, var2, var3, var4, var5);
   }

   public int new(yy var1, int var2, int var3, int var4) {
      return this.c3.new(var1, var2, var3, var4);
   }

   public float if(yy var1, int var2, int var3, int var4) {
      return this.c3.if(var1, var2, var3, var4);
   }

   public float a(aiw var1) {
      return this.void != mod_rajouts.X.void ? this.c3.a(var1) : 10.0F;
   }

   public int b() {
      return this.c3.b();
   }

   public ajd if(int var1, int var2) {
      return this.c3.if(var1, this.c7);
   }

   public int a(y6 var1) {
      return this.c3.a(var1);
   }

   public nw new(y6 var1, int var2, int var3, int var4) {
      return this.c3.new(var1, var2, var3, var4);
   }

   public void a(y6 var1, int var2, int var3, int var4, aiw var5, nr var6) {
      this.c3.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean goto() {
      return this.c3.goto();
   }

   public boolean a(int var1, boolean var2) {
      return this.c3.a(var1, var2);
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      return this.c3.case(var1, var2, var3, var4);
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      this.new(var1, var2, var3, var4, 0);
      this.c3.for(var1, var2, var3, var4);
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      this.c3.do(var1, var2, var3, var4, var5, var6);
   }

   public void a(y6 var1, int var2, int var3, int var4, aiw var5) {
      this.c3.a(var1, var2, var3, var4, var5);
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      this.c3.if(var1, var2, var3, var4, var5);
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      return this.c3.a(var1, var2, var3, var4, var5, 0, 0.0F, 0.0F, 0.0F);
   }

   public void a(y6 var1, int var2, int var3, int var4, zg var5) {
      this.c3.a(var1, var2, var3, var4, var5);
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      int var7 = ajs.a((double)(var5.a5 * 4.0F / 360.0F) + 0.5D) & 3;
      int var8 = var1.for(var2, var3, var4) & 4;
      if (var7 == 0) {
         var1.do(var2, var3, var4, 2 | var8, 2);
      }

      if (var7 == 1) {
         var1.do(var2, var3, var4, 1 | var8, 2);
      }

      if (var7 == 2) {
         var1.do(var2, var3, var4, 3 | var8, 2);
      }

      if (var7 == 3) {
         var1.do(var2, var3, var4, 0 | var8, 2);
      }

   }

   public int a(y6 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      return var5 == 0 || var5 != 1 && !((double)var7 <= 0.5D) ? var9 | 4 : var9;
   }

   public nt a(y6 var1, int var2, int var3, int var4, nr var5, nr var6) {
      nt[] var7 = new nt[8];
      int var8 = var1.for(var2, var3, var4);
      int var9 = var8 & 3;
      boolean var10 = (var8 & 4) == 4;
      int[] var11 = c4[var9 + (var10 ? 4 : 0)];
      this.c6 = true;

      int var12;
      int var13;
      int var14;
      for(int var15 = 0; var15 < 8; ++var15) {
         this.c5 = var15;
         int[] var16 = var11;
         var12 = var11.length;

         for(var13 = 0; var13 < var12; ++var13) {
            var14 = var16[var13];
            if (var14 == var15) {
            }
         }

         var7[var15] = super.a(var1, var2, var3, var4, var5, var6);
      }

      int[] var25 = var11;
      int var26 = var11.length;

      for(var12 = 0; var12 < var26; ++var12) {
         var13 = var25[var12];
         var7[var13] = null;
      }

      nt var17 = null;
      double var18 = 0.0D;
      nt[] var20 = var7;
      var14 = var7.length;

      for(int var21 = 0; var21 < var14; ++var21) {
         nt var22 = var20[var21];
         if (var22 != null) {
            double var23 = var22.for.for(var6);
            if (var23 > var18) {
               var17 = var22;
               var18 = var23;
            }
         }
      }

      return var17;
   }

   public void a(ajc var1) {
   }
}
