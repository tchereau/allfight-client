import java.util.List;

public class n0 extends pa {
   private final boolean cz;
   private ajd cy;
   private ajd cB;
   private ajd cA;

   public n0(int var1, boolean var2) {
      super(var1, ts.byte);
      this.cz = var2;
      this.a(N);
      this.if(0.5F);
      this.a(acn.b);
   }

   public ajd s() {
      return this.cA;
   }

   public void if(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a(var1, var2, var3, var4, var5, var6);
   }

   public ajd if(int var1, int var2) {
      int var3 = case(var2);
      if (var3 > 5) {
         return this.cA;
      } else if (var1 == var3) {
         return !char(var2) && !(this.aR > 0.0D) && !(this.aO > 0.0D) && !(this.aL > 0.0D) && !(this.aI < 1.0D) && !(this.aF < 1.0D) && !(this.aC < 1.0D) ? this.cA : this.cy;
      } else {
         return var1 == api.if[var3] ? this.cB : this.an;
      }
   }

   public static ajd if(String var0) {
      if (var0 == "piston_side") {
         return pa.bZ.an;
      } else if (var0 == "piston_top") {
         return pa.bZ.cA;
      } else if (var0 == "piston_top_sticky") {
         return pa.af.cA;
      } else {
         return var0 == "piston_inner_top" ? pa.bZ.cy : null;
      }
   }

   public void a(ajc var1) {
      this.an = var1.a("piston_side");
      this.cA = var1.a(this.cz ? "piston_top_sticky" : "piston_top");
      this.cy = var1.a("piston_inner_top");
      this.cB = var1.a("piston_bottom");
   }

   public int new() {
      return 16;
   }

   public boolean do() {
      return false;
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      return false;
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      int var7 = a(var1, var2, var3, var4, var5);
      var1.do(var2, var3, var4, var7, 2);
      if (!var1.goto) {
         this.char(var1, var2, var3, var4);
      }

   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!var1.goto) {
         this.char(var1, var2, var3, var4);
      }

   }

   public void for(y6 var1, int var2, int var3, int var4) {
      if (!var1.goto && var1.if(var2, var3, var4) == null) {
         this.char(var1, var2, var3, var4);
      }

   }

   private void char(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      int var6 = case(var5);
      if (var6 != 7) {
         boolean var7 = this.byte(var1, var2, var3, var4, var6);
         if (var7 && !char(var5)) {
            if (case(var1, var2, var3, var4, var6)) {
               var1.do(var2, var3, var4, this.void, 0, var6);
            }
         } else if (!var7 && char(var5)) {
            var1.do(var2, var3, var4, var6, 2);
            var1.do(var2, var3, var4, this.void, 1, var6);
         }

      }
   }

   private boolean byte(y6 var1, int var2, int var3, int var4, int var5) {
      if (var5 != 0 && var1.char(var2, var3 - 1, var4, 0)) {
         return true;
      } else if (var5 != 1 && var1.char(var2, var3 + 1, var4, 1)) {
         return true;
      } else if (var5 != 2 && var1.char(var2, var3, var4 - 1, 2)) {
         return true;
      } else if (var5 != 3 && var1.char(var2, var3, var4 + 1, 3)) {
         return true;
      } else if (var5 != 5 && var1.char(var2 + 1, var3, var4, 5)) {
         return true;
      } else if (var5 != 4 && var1.char(var2 - 1, var3, var4, 4)) {
         return true;
      } else if (var1.char(var2, var3, var4, 0)) {
         return true;
      } else if (var1.char(var2, var3 + 2, var4, 1)) {
         return true;
      } else if (var1.char(var2, var3 + 1, var4 - 1, 2)) {
         return true;
      } else if (var1.char(var2, var3 + 1, var4 + 1, 3)) {
         return true;
      } else if (var1.char(var2 - 1, var3 + 1, var4, 4)) {
         return true;
      } else {
         return var1.char(var2 + 1, var3 + 1, var4, 5);
      }
   }

   public boolean if(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.goto) {
         boolean var7 = this.byte(var1, var2, var3, var4, var6);
         if (var7 && var5 == 1) {
            var1.do(var2, var3, var4, var6 | 8, 2);
            return false;
         }

         if (!var7 && var5 == 0) {
            return false;
         }
      }

      if (var5 == 0) {
         if (!this.char(var1, var2, var3, var4, var6)) {
            return false;
         }

         var1.do(var2, var3, var4, var6 | 8, 2);
         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "tile.piston.out", 0.5F, var1.o.nextFloat() * 0.25F + 0.6F);
      } else if (var5 == 1) {
         n4 var16 = var1.if(var2 + api.a[var6], var3 + api.int[var6], var4 + api.for[var6]);
         if (var16 instanceof nx) {
            ((nx)var16).e();
         }

         var1.int(var2, var3, var4, pa.bT.void, var6, 3);
         var1.if(var2, var3, var4, ny.a(this.void, var6, var6, false, true));
         if (this.cz) {
            int var8 = var2 + api.a[var6] * 2;
            int var9 = var3 + api.int[var6] * 2;
            int var10 = var4 + api.for[var6] * 2;
            int var11 = var1.new(var8, var9, var10);
            int var12 = var1.for(var8, var9, var10);
            boolean var13 = false;
            if (var11 == pa.bT.void) {
               n4 var14 = var1.if(var8, var9, var10);
               if (var14 instanceof nx) {
                  nx var15 = (nx)var14;
                  if (var15.g() == var6 && var15.h()) {
                     var15.e();
                     var11 = var15.i();
                     var12 = var15.try();
                     var13 = true;
                  }
               }
            }

            if (!var13 && var11 > 0 && a(var11, var1, var8, var9, var10, false) && (pa.x[var11].case() == 0 || var11 == pa.bZ.void || var11 == pa.af.void)) {
               var2 += api.a[var6];
               var3 += api.int[var6];
               var4 += api.for[var6];
               var1.int(var2, var3, var4, pa.bT.void, var12, 3);
               var1.if(var2, var3, var4, ny.a(var11, var12, var6, false, false));
               var1.o(var8, var9, var10);
            } else if (!var13) {
               var1.o(var2 + api.a[var6], var3 + api.int[var6], var4 + api.for[var6]);
            }
         } else {
            var1.o(var2 + api.a[var6], var3 + api.int[var6], var4 + api.for[var6]);
         }

         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "tile.piston.in", 0.5F, var1.o.nextFloat() * 0.15F + 0.6F);
      }

      return true;
   }

   public void int(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      if (char(var5)) {
         switch(case(var5)) {
         case 0:
            this.a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 1:
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
            break;
         case 2:
            this.a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
            break;
         case 3:
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
            break;
         case 4:
            this.a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 5:
            this.a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
         }
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public void try() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(y6 var1, int var2, int var3, int var4, nw var5, List var6, aiw var7) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      this.int((yy)var1, var2, var3, var4);
      return super.int(var1, var2, var3, var4);
   }

   public boolean if() {
      return false;
   }

   public static int case(int var0) {
      return var0 & 7;
   }

   public static boolean char(int var0) {
      return (var0 & 8) != 0;
   }

   public static int a(y6 var0, int var1, int var2, int var3, aig var4) {
      if (ajs.do((float)var4.al - (float)var1) < 2.0F && ajs.do((float)var4.aj - (float)var3) < 2.0F) {
         double var5 = var4.ak + 1.82D - (double)var4.aQ;
         if (var5 - (double)var2 > 2.0D) {
            return 1;
         }

         if ((double)var2 - var5 > 0.0D) {
            return 0;
         }
      }

      int var7 = ajs.a((double)(var4.a5 * 4.0F / 360.0F) + 0.5D) & 3;
      if (var7 == 0) {
         return 2;
      } else if (var7 == 1) {
         return 5;
      } else if (var7 == 2) {
         return 3;
      } else {
         return var7 == 3 ? 4 : 0;
      }
   }

   private static boolean a(int var0, y6 var1, int var2, int var3, int var4, boolean var5) {
      if (var0 == pa.bs.void) {
         return false;
      } else {
         if (var0 != pa.bZ.void && var0 != pa.af.void) {
            if (pa.x[var0].if(var1, var2, var3, var4) == -1.0F) {
               return false;
            }

            if (pa.x[var0].case() == 2) {
               return false;
            }

            if (pa.x[var0].case() == 1) {
               if (!var5) {
                  return false;
               }

               return true;
            }
         } else if (char(var1.for(var2, var3, var4))) {
            return false;
         }

         return !(pa.x[var0] instanceof rb);
      }
   }

   private static boolean case(y6 var0, int var1, int var2, int var3, int var4) {
      int var5 = var1 + api.a[var4];
      int var6 = var2 + api.int[var4];
      int var7 = var3 + api.for[var4];
      int var8 = 0;

      while(true) {
         if (var8 < 13) {
            if (var6 <= 0 || var6 >= 255) {
               return false;
            }

            int var9 = var0.new(var5, var6, var7);
            if (var9 != 0) {
               if (!a(var9, var0, var5, var6, var7, true)) {
                  return false;
               }

               if (pa.x[var9].case() != 1) {
                  if (var8 == 12) {
                     return false;
                  }

                  var5 += api.a[var4];
                  var6 += api.int[var4];
                  var7 += api.for[var4];
                  ++var8;
                  continue;
               }
            }
         }

         return true;
      }
   }

   private boolean char(y6 var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 + api.a[var5];
      int var7 = var3 + api.int[var5];
      int var8 = var4 + api.for[var5];
      int var9 = 0;

      int var10;
      while(var9 < 13) {
         if (var7 > 0 && var7 < 255) {
            var10 = var1.new(var6, var7, var8);
            if (var10 != 0) {
               if (!a(var10, var1, var6, var7, var8, true)) {
                  return false;
               }

               if (pa.x[var10].case() != 1) {
                  if (var9 == 12) {
                     return false;
                  }

                  var6 += api.a[var5];
                  var7 += api.int[var5];
                  var8 += api.for[var5];
                  ++var9;
                  continue;
               }

               pa.x[var10].a(var1, var6, var7, var8, var1.for(var6, var7, var8), 0);
               var1.o(var6, var7, var8);
            }
            break;
         }

         return false;
      }

      var9 = var6;
      var10 = var7;
      int var11 = var8;
      int var12 = 0;

      int[] var13;
      int var14;
      int var15;
      int var16;
      for(var13 = new int[13]; var6 != var2 || var7 != var3 || var8 != var4; var8 = var16) {
         var14 = var6 - api.a[var5];
         var15 = var7 - api.int[var5];
         var16 = var8 - api.for[var5];
         int var17 = var1.new(var14, var15, var16);
         int var18 = var1.for(var14, var15, var16);
         if (var17 == this.void && var14 == var2 && var15 == var3 && var16 == var4) {
            var1.int(var6, var7, var8, pa.bT.void, var5 | (this.cz ? 8 : 0), 4);
            var1.if(var6, var7, var8, ny.a(pa.bX.void, var5 | (this.cz ? 8 : 0), var5, true, false));
         } else {
            var1.int(var6, var7, var8, pa.bT.void, var18, 4);
            var1.if(var6, var7, var8, ny.a(var17, var18, var5, true, false));
         }

         var13[var12++] = var17;
         var6 = var14;
         var7 = var15;
      }

      var6 = var9;
      var7 = var10;
      var8 = var11;

      for(var12 = 0; var6 != var2 || var7 != var3 || var8 != var4; var8 = var16) {
         var14 = var6 - api.a[var5];
         var15 = var7 - api.int[var5];
         var16 = var8 - api.for[var5];
         var1.for(var14, var15, var16, var13[var12++]);
         var6 = var14;
         var7 = var15;
      }

      return true;
   }
}
