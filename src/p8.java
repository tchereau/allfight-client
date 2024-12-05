import java.util.Random;

public class p8 extends qz {
   public p8(int var1) {
      super(var1, "portal", ts.else, false);
      this.a(true);
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      super.if(var1, var2, var3, var4, var5);
      if (var1.n.a() && var5.nextInt(2000) < var1.p) {
         int var6;
         for(var6 = var3; !var1.case(var2, var6, var4) && var6 > 0; --var6) {
         }

         if (var6 > 0 && !var1.try(var2, var6 + 1, var4)) {
            aiw var7 = abj.a(var1, 57, (double)var2 + 0.5D, (double)var6 + 1.1D, (double)var4 + 0.5D);
            if (var7 != null) {
               var7.a9 = var7.aO();
            }
         }
      }

   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      return null;
   }

   public void int(yy var1, int var2, int var3, int var4) {
      float var5;
      float var6;
      if (var1.new(var2 - 1, var3, var4) != this.void && var1.new(var2 + 1, var3, var4) != this.void) {
         var5 = 0.125F;
         var6 = 0.5F;
         this.a(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
      } else {
         var5 = 0.5F;
         var6 = 0.125F;
         this.a(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
      }

   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public boolean w(y6 var1, int var2, int var3, int var4) {
      byte var5 = 0;
      byte var6 = 0;
      if (var1.new(var2 - 1, var3, var4) == pa.bs.void || var1.new(var2 + 1, var3, var4) == pa.bs.void) {
         var5 = 1;
      }

      if (var1.new(var2, var3, var4 - 1) == pa.bs.void || var1.new(var2, var3, var4 + 1) == pa.bs.void) {
         var6 = 1;
      }

      if (var5 == var6) {
         return false;
      } else {
         if (var1.new(var2 - var5, var3, var4 - var6) == 0) {
            var2 -= var5;
            var4 -= var6;
         }

         int var7;
         int var8;
         for(var7 = -1; var7 <= 2; ++var7) {
            for(var8 = -1; var8 <= 3; ++var8) {
               boolean var9 = var7 == -1 || var7 == 2 || var8 == -1 || var8 == 3;
               if (var7 != -1 && var7 != 2 || var8 != -1 && var8 != 3) {
                  int var10 = var1.new(var2 + var5 * var7, var3 + var8, var4 + var6 * var7);
                  if (var9) {
                     if (var10 != pa.bs.void) {
                        return false;
                     }
                  } else if (var10 != 0 && var10 != pa.bo.void) {
                     return false;
                  }
               }
            }
         }

         for(var7 = 0; var7 < 2; ++var7) {
            for(var8 = 0; var8 < 3; ++var8) {
               var1.int(var2 + var5 * var7, var3 + var8, var4 + var6 * var7, pa.aK.void, 0, 2);
            }
         }

         return true;
      }
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      byte var6 = 0;
      byte var7 = 1;
      if (var1.new(var2 - 1, var3, var4) == this.void || var1.new(var2 + 1, var3, var4) == this.void) {
         var6 = 1;
         var7 = 0;
      }

      int var8;
      for(var8 = var3; var1.new(var2, var8 - 1, var4) == this.void; --var8) {
      }

      if (var1.new(var2, var8 - 1, var4) != pa.bs.void) {
         var1.o(var2, var3, var4);
      } else {
         int var9;
         for(var9 = 1; var9 < 4 && var1.new(var2, var8 + var9, var4) == this.void; ++var9) {
         }

         if (var9 == 3 && var1.new(var2, var8 + var9, var4) == pa.bs.void) {
            boolean var10 = var1.new(var2 - 1, var3, var4) == this.void || var1.new(var2 + 1, var3, var4) == this.void;
            boolean var11 = var1.new(var2, var3, var4 - 1) == this.void || var1.new(var2, var3, var4 + 1) == this.void;
            if (var10 && var11) {
               var1.o(var2, var3, var4);
            } else {
               if ((var1.new(var2 + var6, var3, var4 + var7) != pa.bs.void || var1.new(var2 - var6, var3, var4 - var7) != this.void) && (var1.new(var2 - var6, var3, var4 - var7) != pa.bs.void || var1.new(var2 + var6, var3, var4 + var7) != this.void)) {
                  var1.o(var2, var3, var4);
               }

            }
         } else {
            var1.o(var2, var3, var4);
         }
      }
   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      if (var1.new(var2, var3, var4) == this.void) {
         return false;
      } else {
         boolean var6 = var1.new(var2 - 1, var3, var4) == this.void && var1.new(var2 - 2, var3, var4) != this.void;
         boolean var7 = var1.new(var2 + 1, var3, var4) == this.void && var1.new(var2 + 2, var3, var4) != this.void;
         boolean var8 = var1.new(var2, var3, var4 - 1) == this.void && var1.new(var2, var3, var4 - 2) != this.void;
         boolean var9 = var1.new(var2, var3, var4 + 1) == this.void && var1.new(var2, var3, var4 + 2) != this.void;
         boolean var10 = var6 || var7;
         boolean var11 = var8 || var9;
         if (var10 && var5 == 4) {
            return true;
         } else if (var10 && var5 == 5) {
            return true;
         } else if (var11 && var5 == 2) {
            return true;
         } else {
            return var11 && var5 == 3;
         }
      }
   }

   public int a(Random var1) {
      return 0;
   }

   public int b() {
      return 1;
   }

   public void if(y6 var1, int var2, int var3, int var4, aiw var5) {
      if (var5.ar == null && var5.as == null) {
         var5.aR();
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      if (var5.nextInt(100) == 0) {
         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "portal.portal", 0.5F, var5.nextFloat() * 0.4F + 0.8F, false);
      }

      for(int var6 = 0; var6 < 4; ++var6) {
         double var7 = (double)((float)var2 + var5.nextFloat());
         double var9 = (double)((float)var3 + var5.nextFloat());
         double var11 = (double)((float)var4 + var5.nextFloat());
         double var13 = 0.0D;
         double var15 = 0.0D;
         double var17 = 0.0D;
         int var19 = var5.nextInt(2) * 2 - 1;
         var13 = ((double)var5.nextFloat() - 0.5D) * 0.5D;
         var15 = ((double)var5.nextFloat() - 0.5D) * 0.5D;
         var17 = ((double)var5.nextFloat() - 0.5D) * 0.5D;
         if (var1.new(var2 - 1, var3, var4) != this.void && var1.new(var2 + 1, var3, var4) != this.void) {
            var7 = (double)var2 + 0.5D + 0.25D * (double)var19;
            var13 = (double)(var5.nextFloat() * 2.0F * (float)var19);
         } else {
            var11 = (double)var4 + 0.5D + 0.25D * (double)var19;
            var17 = (double)(var5.nextFloat() * 2.0F * (float)var19);
         }

         var1.a("portal", var7, var9, var11, var13, var15, var17);
      }

   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return 0;
   }
}
