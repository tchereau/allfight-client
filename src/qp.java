public class qp extends pa {
   protected qp(int var1) {
      super(var1, ts.j);
      this.a(acn.b);
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public int new() {
      return 12;
   }

   public boolean for(y6 var1, int var2, int var3, int var4, int var5) {
      if (var5 == 0 && var1.try(var2, var3 + 1, var4)) {
         return true;
      } else if (var5 == 1 && var1.case(var2, var3 - 1, var4)) {
         return true;
      } else if (var5 == 2 && var1.try(var2, var3, var4 + 1)) {
         return true;
      } else if (var5 == 3 && var1.try(var2, var3, var4 - 1)) {
         return true;
      } else if (var5 == 4 && var1.try(var2 + 1, var3, var4)) {
         return true;
      } else {
         return var5 == 5 && var1.try(var2 - 1, var3, var4);
      }
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      if (var1.try(var2 - 1, var3, var4)) {
         return true;
      } else if (var1.try(var2 + 1, var3, var4)) {
         return true;
      } else if (var1.try(var2, var3, var4 - 1)) {
         return true;
      } else if (var1.try(var2, var3, var4 + 1)) {
         return true;
      } else if (var1.case(var2, var3 - 1, var4)) {
         return true;
      } else {
         return var1.try(var2, var3 + 1, var4);
      }
   }

   public int a(y6 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var11 = var9 & 8;
      int var10 = var9 & 7;
      byte var12 = -1;
      if (var5 == 0 && var1.try(var2, var3 + 1, var4)) {
         var12 = 0;
      }

      if (var5 == 1 && var1.case(var2, var3 - 1, var4)) {
         var12 = 5;
      }

      if (var5 == 2 && var1.try(var2, var3, var4 + 1)) {
         var12 = 4;
      }

      if (var5 == 3 && var1.try(var2, var3, var4 - 1)) {
         var12 = 3;
      }

      if (var5 == 4 && var1.try(var2 + 1, var3, var4)) {
         var12 = 2;
      }

      if (var5 == 5 && var1.try(var2 - 1, var3, var4)) {
         var12 = 1;
      }

      return var12 + var11;
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      int var7 = var1.for(var2, var3, var4);
      int var8 = var7 & 7;
      int var9 = var7 & 8;
      if (var8 == j(1)) {
         if ((ajs.a((double)(var5.a5 * 4.0F / 360.0F) + 0.5D) & 1) == 0) {
            var1.do(var2, var3, var4, 5 | var9, 2);
         } else {
            var1.do(var2, var3, var4, 6 | var9, 2);
         }
      } else if (var8 == j(0)) {
         if ((ajs.a((double)(var5.a5 * 4.0F / 360.0F) + 0.5D) & 1) == 0) {
            var1.do(var2, var3, var4, 7 | var9, 2);
         } else {
            var1.do(var2, var3, var4, 0 | var9, 2);
         }
      }

   }

   public static int j(int var0) {
      switch(var0) {
      case 0:
         return 0;
      case 1:
         return 5;
      case 2:
         return 4;
      case 3:
         return 3;
      case 4:
         return 2;
      case 5:
         return 1;
      default:
         return -1;
      }
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (this.t(var1, var2, var3, var4)) {
         int var6 = var1.for(var2, var3, var4) & 7;
         boolean var7 = false;
         if (!var1.try(var2 - 1, var3, var4) && var6 == 1) {
            var7 = true;
         }

         if (!var1.try(var2 + 1, var3, var4) && var6 == 2) {
            var7 = true;
         }

         if (!var1.try(var2, var3, var4 - 1) && var6 == 3) {
            var7 = true;
         }

         if (!var1.try(var2, var3, var4 + 1) && var6 == 4) {
            var7 = true;
         }

         if (!var1.case(var2, var3 - 1, var4) && var6 == 5) {
            var7 = true;
         }

         if (!var1.case(var2, var3 - 1, var4) && var6 == 6) {
            var7 = true;
         }

         if (!var1.try(var2, var3 + 1, var4) && var6 == 0) {
            var7 = true;
         }

         if (!var1.try(var2, var3 + 1, var4) && var6 == 7) {
            var7 = true;
         }

         if (var7) {
            this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
            var1.o(var2, var3, var4);
         }
      }

   }

   private boolean t(y6 var1, int var2, int var3, int var4) {
      if (!this.case(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.o(var2, var3, var4);
         return false;
      } else {
         return true;
      }
   }

   public void int(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4) & 7;
      float var6 = 0.1875F;
      if (var5 == 1) {
         this.a(0.0F, 0.2F, 0.5F - var6, var6 * 2.0F, 0.8F, 0.5F + var6);
      } else if (var5 == 2) {
         this.a(1.0F - var6 * 2.0F, 0.2F, 0.5F - var6, 1.0F, 0.8F, 0.5F + var6);
      } else if (var5 == 3) {
         this.a(0.5F - var6, 0.2F, 0.0F, 0.5F + var6, 0.8F, var6 * 2.0F);
      } else if (var5 == 4) {
         this.a(0.5F - var6, 0.2F, 1.0F - var6 * 2.0F, 0.5F + var6, 0.8F, 1.0F);
      } else if (var5 != 5 && var5 != 6) {
         if (var5 == 0 || var5 == 7) {
            var6 = 0.25F;
            this.a(0.5F - var6, 0.4F, 0.5F - var6, 0.5F + var6, 1.0F, 0.5F + var6);
         }
      } else {
         var6 = 0.25F;
         this.a(0.5F - var6, 0.0F, 0.5F - var6, 0.5F + var6, 0.6F, 0.5F + var6);
      }

   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (var1.goto) {
         return true;
      } else {
         int var10 = var1.for(var2, var3, var4);
         int var11 = var10 & 7;
         int var12 = 8 - (var10 & 8);
         var1.do(var2, var3, var4, var11 + var12, 3);
         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, var12 > 0 ? 0.6F : 0.5F);
         var1.for(var2, var3, var4, this.void);
         if (var11 == 1) {
            var1.for(var2 - 1, var3, var4, this.void);
         } else if (var11 == 2) {
            var1.for(var2 + 1, var3, var4, this.void);
         } else if (var11 == 3) {
            var1.for(var2, var3, var4 - 1, this.void);
         } else if (var11 == 4) {
            var1.for(var2, var3, var4 + 1, this.void);
         } else if (var11 != 5 && var11 != 6) {
            if (var11 == 0 || var11 == 7) {
               var1.for(var2, var3 + 1, var4, this.void);
            }
         } else {
            var1.for(var2, var3 - 1, var4, this.void);
         }

         return true;
      }
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      if ((var6 & 8) > 0) {
         var1.for(var2, var3, var4, this.void);
         int var7 = var6 & 7;
         if (var7 == 1) {
            var1.for(var2 - 1, var3, var4, this.void);
         } else if (var7 == 2) {
            var1.for(var2 + 1, var3, var4, this.void);
         } else if (var7 == 3) {
            var1.for(var2, var3, var4 - 1, this.void);
         } else if (var7 == 4) {
            var1.for(var2, var3, var4 + 1, this.void);
         } else if (var7 != 5 && var7 != 6) {
            if (var7 == 0 || var7 == 7) {
               var1.for(var2, var3 + 1, var4, this.void);
            }
         } else {
            var1.for(var2, var3 - 1, var4, this.void);
         }
      }

      super.do(var1, var2, var3, var4, var5, var6);
   }

   public int do(yy var1, int var2, int var3, int var4, int var5) {
      return (var1.for(var2, var3, var4) & 8) > 0 ? 15 : 0;
   }

   public int for(yy var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.for(var2, var3, var4);
      if ((var6 & 8) == 0) {
         return 0;
      } else {
         int var7 = var6 & 7;
         if (var7 == 0 && var5 == 0) {
            return 15;
         } else if (var7 == 7 && var5 == 0) {
            return 15;
         } else if (var7 == 6 && var5 == 1) {
            return 15;
         } else if (var7 == 5 && var5 == 1) {
            return 15;
         } else if (var7 == 4 && var5 == 2) {
            return 15;
         } else if (var7 == 3 && var5 == 3) {
            return 15;
         } else if (var7 == 2 && var5 == 4) {
            return 15;
         } else {
            return var7 == 1 && var5 == 5 ? 15 : 0;
         }
      }
   }

   public boolean int() {
      return true;
   }
}
