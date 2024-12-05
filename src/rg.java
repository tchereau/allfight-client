import java.util.Random;

public class rg extends pa {
   private static final String[] d3 = new String[]{"doorWood_lower", "doorWood_upper", "doorIron_lower", "doorIron_upper"};
   private final int d2;
   private ajd[] d4;

   protected rg(int var1, ts var2) {
      super(var1, var2);
      if (var2 == ts.u) {
         this.d2 = 2;
      } else {
         this.d2 = 0;
      }

      float var3 = 0.5F;
      float var4 = 1.0F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
   }

   public ajd if(int var1, int var2) {
      return this.d4[this.d2];
   }

   public ajd if(yy var1, int var2, int var3, int var4, int var5) {
      if (var5 != 1 && var5 != 0) {
         int var6 = this.d(var1, var2, var3, var4);
         int var7 = var6 & 3;
         boolean var8 = (var6 & 4) != 0;
         boolean var9 = false;
         boolean var10 = (var6 & 8) != 0;
         if (var8) {
            if (var7 == 0 && var5 == 2) {
               var9 = !var9;
            } else if (var7 == 1 && var5 == 5) {
               var9 = !var9;
            } else if (var7 == 2 && var5 == 3) {
               var9 = !var9;
            } else if (var7 == 3 && var5 == 4) {
               var9 = !var9;
            }
         } else {
            if (var7 == 0 && var5 == 5) {
               var9 = !var9;
            } else if (var7 == 1 && var5 == 3) {
               var9 = !var9;
            } else if (var7 == 2 && var5 == 4) {
               var9 = !var9;
            } else if (var7 == 3 && var5 == 2) {
               var9 = !var9;
            }

            if ((var6 & 16) != 0) {
               var9 = !var9;
            }
         }

         return this.d4[this.d2 + (var9 ? d3.length : 0) + (var10 ? 1 : 0)];
      } else {
         return this.d4[this.d2];
      }
   }

   public void a(ajc var1) {
      this.d4 = new ajd[d3.length * 2];

      for(int var2 = 0; var2 < d3.length; ++var2) {
         this.d4[var2] = var1.a(d3[var2]);
         this.d4[var2 + d3.length] = new aje(this.d4[var2], true, false);
      }

   }

   public boolean do() {
      return false;
   }

   public boolean a(yy var1, int var2, int var3, int var4) {
      int var5 = this.d(var1, var2, var3, var4);
      return (var5 & 4) != 0;
   }

   public boolean if() {
      return false;
   }

   public int new() {
      return 7;
   }

   public nw new(y6 var1, int var2, int var3, int var4) {
      this.int((yy)var1, var2, var3, var4);
      return super.new(var1, var2, var3, var4);
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      this.int((yy)var1, var2, var3, var4);
      return super.int(var1, var2, var3, var4);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      this.q(this.d(var1, var2, var3, var4));
   }

   public int b(yy var1, int var2, int var3, int var4) {
      return this.d(var1, var2, var3, var4) & 3;
   }

   public boolean c(yy var1, int var2, int var3, int var4) {
      return (this.d(var1, var2, var3, var4) & 4) != 0;
   }

   private void q(int var1) {
      float var2 = 0.1875F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
      int var3 = var1 & 3;
      boolean var4 = (var1 & 4) != 0;
      boolean var5 = (var1 & 16) != 0;
      if (var3 == 0) {
         if (var4) {
            if (!var5) {
               this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
            } else {
               this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
            }
         } else {
            this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
         }
      } else if (var3 == 1) {
         if (var4) {
            if (!var5) {
               this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            } else {
               this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
            }
         } else {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
         }
      } else if (var3 == 2) {
         if (var4) {
            if (!var5) {
               this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
            } else {
               this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
            }
         } else {
            this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         }
      } else if (var3 == 3) {
         if (var4) {
            if (!var5) {
               this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
            } else {
               this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            }
         } else {
            this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
         }
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, aek var5) {
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (this.at == ts.u) {
         return true;
      } else {
         int var10 = this.d(var1, var2, var3, var4);
         int var11 = var10 & 7;
         var11 ^= 4;
         if ((var10 & 8) == 0) {
            var1.do(var2, var3, var4, var11, 2);
            var1.new(var2, var3, var4, var2, var3, var4);
         } else {
            var1.do(var2, var3 - 1, var4, var11, 2);
            var1.new(var2, var3 - 1, var4, var2, var3, var4);
         }

         var1.a(var5, 1003, var2, var3, var4, 0);
         return true;
      }
   }

   public void do(y6 var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.d(var1, var2, var3, var4);
      boolean var7 = (var6 & 4) != 0;
      if (var7 != var5) {
         int var8 = var6 & 7;
         var8 ^= 4;
         if ((var6 & 8) == 0) {
            var1.do(var2, var3, var4, var8, 2);
            var1.new(var2, var3, var4, var2, var3, var4);
         } else {
            var1.do(var2, var3 - 1, var4, var8, 2);
            var1.new(var2, var3 - 1, var4, var2, var3, var4);
         }

         var1.a((aek)null, 1003, var2, var3, var4, 0);
      }
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.for(var2, var3, var4);
      if ((var6 & 8) == 0) {
         boolean var7 = false;
         if (var1.new(var2, var3 + 1, var4) != this.void) {
            var1.o(var2, var3, var4);
            var7 = true;
         }

         if (!var1.case(var2, var3 - 1, var4)) {
            var1.o(var2, var3, var4);
            var7 = true;
            if (var1.new(var2, var3 + 1, var4) == this.void) {
               var1.o(var2, var3 + 1, var4);
            }
         }

         if (var7) {
            if (!var1.goto) {
               this.a(var1, var2, var3, var4, var6, 0);
            }
         } else {
            boolean var8 = var1.f(var2, var3, var4) || var1.f(var2, var3 + 1, var4);
            if ((var8 || var5 > 0 && pa.x[var5].int()) && var5 != this.void) {
               this.do(var1, var2, var3, var4, var8);
            }
         }
      } else {
         if (var1.new(var2, var3 - 1, var4) != this.void) {
            var1.o(var2, var3, var4);
         }

         if (var5 > 0 && var5 != this.void) {
            this.new(var1, var2, var3 - 1, var4, var5);
         }
      }

   }

   public int a(int var1, Random var2, int var3) {
      if ((var1 & 8) != 0) {
         return 0;
      } else {
         return this.at == ts.u ? abr.cw.A : abr.bk.A;
      }
   }

   public nt a(y6 var1, int var2, int var3, int var4, nr var5, nr var6) {
      this.int((yy)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      if (var3 >= 255) {
         return false;
      } else {
         return var1.case(var2, var3 - 1, var4) && super.case(var1, var2, var3, var4) && super.case(var1, var2, var3 + 1, var4);
      }
   }

   public int case() {
      return 1;
   }

   public int d(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      boolean var6 = (var5 & 8) != 0;
      int var7;
      int var8;
      if (var6) {
         var7 = var1.for(var2, var3 - 1, var4);
         var8 = var5;
      } else {
         var7 = var5;
         var8 = var1.for(var2, var3 + 1, var4);
      }

      boolean var9 = (var8 & 1) != 0;
      return var7 & 7 | (var6 ? 8 : 0) | (var9 ? 16 : 0);
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return this.at == ts.u ? abr.cw.A : abr.bk.A;
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, aek var6) {
      if (var6.fY.new && (var5 & 8) != 0 && var1.new(var2, var3 - 1, var4) == this.void) {
         var1.o(var2, var3 - 1, var4);
      }

   }
}
