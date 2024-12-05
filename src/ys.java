public class ys implements yy {
   private int if;
   private int a;
   private xx[][] int;
   private boolean for;
   private y6 do;

   public ys(y6 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.do = var1;
      this.if = var2 - var8 >> 4;
      this.a = var4 - var8 >> 4;
      int var9 = var5 + var8 >> 4;
      int var10 = var7 + var8 >> 4;
      this.int = new xx[var9 - this.if + 1][var10 - this.a + 1];
      this.for = true;

      int var11;
      int var12;
      xx var13;
      for(var11 = this.if; var11 <= var9; ++var11) {
         for(var12 = this.a; var12 <= var10; ++var12) {
            var13 = var1.byte(var11, var12);
            if (var13 != null) {
               this.int[var11 - this.if][var12 - this.a] = var13;
            }
         }
      }

      for(var11 = var2 >> 4; var11 <= var5 >> 4; ++var11) {
         for(var12 = var4 >> 4; var12 <= var7 >> 4; ++var12) {
            var13 = this.int[var11 - this.if][var12 - this.a];
            if (var13 != null && !var13.do(var3, var6)) {
               this.for = false;
            }
         }
      }

   }

   public boolean a() {
      return this.for;
   }

   public int new(int var1, int var2, int var3) {
      if (var2 < 0) {
         return 0;
      } else if (var2 >= 256) {
         return 0;
      } else {
         int var4 = (var1 >> 4) - this.if;
         int var5 = (var3 >> 4) - this.a;
         if (var4 >= 0 && var4 < this.int.length && var5 >= 0 && var5 < this.int[var4].length) {
            xx var6 = this.int[var4][var5];
            return var6 == null ? 0 : var6.int(var1 & 15, var2, var3 & 15);
         } else {
            return 0;
         }
      }
   }

   public n4 if(int var1, int var2, int var3) {
      int var4 = (var1 >> 4) - this.if;
      int var5 = (var3 >> 4) - this.a;
      return this.int[var4][var5].byte(var1 & 15, var2, var3 & 15);
   }

   public float if(int var1, int var2, int var3, int var4) {
      int var5 = this.char(var1, var2, var3);
      if (var5 < var4) {
         var5 = var4;
      }

      return this.do.n.do[var5];
   }

   public int do(int var1, int var2, int var3, int var4) {
      int var5 = this.if(yw.if, var1, var2, var3);
      int var6 = this.if(yw.a, var1, var2, var3);
      if (var6 < var4) {
         var6 = var4;
      }

      return var5 << 20 | var6 << 4;
   }

   public float int(int var1, int var2, int var3) {
      return this.do.n.do[this.char(var1, var2, var3)];
   }

   public int char(int var1, int var2, int var3) {
      return this.a(var1, var2, var3, true);
   }

   public int a(int var1, int var2, int var3, boolean var4) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 <= 30000000) {
         int var5;
         int var6;
         if (var4) {
            var5 = this.new(var1, var2, var3);
            if (var5 == pa.bD.void || var5 == pa.bw.void || var5 == pa.cs.void || var5 == pa.bk.void || var5 == pa.cl.void) {
               var6 = this.a(var1, var2 + 1, var3, false);
               int var7 = this.a(var1 + 1, var2, var3, false);
               int var8 = this.a(var1 - 1, var2, var3, false);
               int var9 = this.a(var1, var2, var3 + 1, false);
               int var10 = this.a(var1, var2, var3 - 1, false);
               if (var7 > var6) {
                  var6 = var7;
               }

               if (var8 > var6) {
                  var6 = var8;
               }

               if (var9 > var6) {
                  var6 = var9;
               }

               if (var10 > var6) {
                  var6 = var10;
               }

               return var6;
            }
         }

         if (var2 < 0) {
            return 0;
         } else if (var2 >= 256) {
            var5 = 15 - this.do.x;
            if (var5 < 0) {
               var5 = 0;
            }

            return var5;
         } else {
            var5 = (var1 >> 4) - this.if;
            var6 = (var3 >> 4) - this.a;
            return this.int[var5][var6].do(var1 & 15, var2, var3 & 15, this.do.x);
         }
      } else {
         return 15;
      }
   }

   public int for(int var1, int var2, int var3) {
      if (var2 < 0) {
         return 0;
      } else if (var2 >= 256) {
         return 0;
      } else {
         int var4 = (var1 >> 4) - this.if;
         int var5 = (var3 >> 4) - this.a;
         return this.int[var4][var5].new(var1 & 15, var2, var3 & 15);
      }
   }

   public ts byte(int var1, int var2, int var3) {
      int var4 = this.new(var1, var2, var3);
      return var4 == 0 ? ts.z : pa.x[var4].at;
   }

   public yn a(int var1, int var2) {
      return this.do.a(var1, var2);
   }

   public boolean do(int var1, int var2, int var3) {
      pa var4 = pa.x[this.new(var1, var2, var3)];
      return var4 == null ? false : var4.do();
   }

   public boolean try(int var1, int var2, int var3) {
      pa var4 = pa.x[this.new(var1, var2, var3)];
      if (var4 == null) {
         return false;
      } else {
         return var4.at.void() && var4.if();
      }
   }

   public boolean case(int var1, int var2, int var3) {
      pa var4 = pa.x[this.new(var1, var2, var3)];
      return this.do.a(var4, this.for(var1, var2, var3));
   }

   public nq do() {
      return this.do.do();
   }

   public boolean a(int var1, int var2, int var3) {
      pa var4 = pa.x[this.new(var1, var2, var3)];
      return var4 == null;
   }

   public int if(yw var1, int var2, int var3, int var4) {
      if (var3 < 0) {
         var3 = 0;
      }

      if (var3 >= 256) {
         var3 = 255;
      }

      if (var3 >= 0 && var3 < 256 && var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 <= 30000000) {
         if (var1 == yw.if && this.do.n.for) {
            return 0;
         } else {
            int var5;
            int var6;
            if (pa.m[this.new(var2, var3, var4)]) {
               var5 = this.a(var1, var2, var3 + 1, var4);
               var6 = this.a(var1, var2 + 1, var3, var4);
               int var7 = this.a(var1, var2 - 1, var3, var4);
               int var8 = this.a(var1, var2, var3, var4 + 1);
               int var9 = this.a(var1, var2, var3, var4 - 1);
               if (var6 > var5) {
                  var5 = var6;
               }

               if (var7 > var5) {
                  var5 = var7;
               }

               if (var8 > var5) {
                  var5 = var8;
               }

               if (var9 > var5) {
                  var5 = var9;
               }

               return var5;
            } else {
               var5 = (var2 >> 4) - this.if;
               var6 = (var4 >> 4) - this.a;
               return this.int[var5][var6].a(var1, var2 & 15, var3, var4 & 15);
            }
         }
      } else {
         return var1.for;
      }
   }

   public int a(yw var1, int var2, int var3, int var4) {
      if (var3 < 0) {
         var3 = 0;
      }

      if (var3 >= 256) {
         var3 = 255;
      }

      if (var3 >= 0 && var3 < 256 && var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 <= 30000000) {
         int var5 = (var2 >> 4) - this.if;
         int var6 = (var4 >> 4) - this.a;
         return this.int[var5][var6].a(var1, var2 & 15, var3, var4 & 15);
      } else {
         return var1.for;
      }
   }

   public int if() {
      return 256;
   }

   public int a(int var1, int var2, int var3, int var4) {
      int var5 = this.new(var1, var2, var3);
      return var5 == 0 ? 0 : pa.x[var5].for((yy)this, var1, var2, var3, var4);
   }
}
