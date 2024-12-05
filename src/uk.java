import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class uk {
   protected wc do;
   protected int if;
   protected int a;

   protected uk(int var1) {
      this.a = var1;
      this.if = -1;
   }

   public void a(uk var1, List var2, Random var3) {
   }

   public abstract boolean a(y6 var1, Random var2, wc var3);

   public wc do() {
      return this.do;
   }

   public int a() {
      return this.a;
   }

   public static uk a(List var0, wc var1) {
      Iterator var2 = var0.iterator();

      uk var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (uk)var2.next();
      } while(var3.do() == null || !var3.do().if(var1));

      return var3;
   }

   public yp if() {
      return new yp(this.do.new(), this.do.for(), this.do.if());
   }

   protected boolean a(y6 var1, wc var2) {
      int var3 = Math.max(this.do.if - 1, var2.if);
      int var4 = Math.max(this.do.a - 1, var2.a);
      int var5 = Math.max(this.do.new - 1, var2.new);
      int var6 = Math.min(this.do.int + 1, var2.int);
      int var7 = Math.min(this.do.for + 1, var2.for);
      int var8 = Math.min(this.do.do + 1, var2.do);

      int var9;
      int var10;
      int var11;
      for(var9 = var3; var9 <= var6; ++var9) {
         for(var10 = var5; var10 <= var8; ++var10) {
            var11 = var1.new(var9, var4, var10);
            if (var11 > 0 && pa.x[var11].at.case()) {
               return true;
            }

            var11 = var1.new(var9, var7, var10);
            if (var11 > 0 && pa.x[var11].at.case()) {
               return true;
            }
         }
      }

      for(var9 = var3; var9 <= var6; ++var9) {
         for(var10 = var4; var10 <= var7; ++var10) {
            var11 = var1.new(var9, var10, var5);
            if (var11 > 0 && pa.x[var11].at.case()) {
               return true;
            }

            var11 = var1.new(var9, var10, var8);
            if (var11 > 0 && pa.x[var11].at.case()) {
               return true;
            }
         }
      }

      for(var9 = var5; var9 <= var8; ++var9) {
         for(var10 = var4; var10 <= var7; ++var10) {
            var11 = var1.new(var3, var10, var9);
            if (var11 > 0 && pa.x[var11].at.case()) {
               return true;
            }

            var11 = var1.new(var6, var10, var9);
            if (var11 > 0 && pa.x[var11].at.case()) {
               return true;
            }
         }
      }

      return false;
   }

   protected int a(int var1, int var2) {
      switch(this.if) {
      case 0:
      case 2:
         return this.do.if + var1;
      case 1:
         return this.do.int - var2;
      case 3:
         return this.do.if + var2;
      default:
         return var1;
      }
   }

   protected int a(int var1) {
      return this.if == -1 ? var1 : var1 + this.do.a;
   }

   protected int if(int var1, int var2) {
      switch(this.if) {
      case 0:
         return this.do.new + var2;
      case 1:
      case 3:
         return this.do.new + var1;
      case 2:
         return this.do.do - var2;
      default:
         return var2;
      }
   }

   protected int do(int var1, int var2) {
      if (var1 == pa.cm.void) {
         if (this.if == 1 || this.if == 3) {
            if (var2 == 1) {
               return 0;
            }

            return 1;
         }
      } else if (var1 != pa.co.void && var1 != pa.ch.void && var1 != mod_rajouts.T.void) {
         if (var1 != pa.cl.void && var1 != pa.bk.void && var1 != pa.bU.void && var1 != pa.b4.void && var1 != pa.br.void) {
            if (var1 == pa.cn.void) {
               if (this.if == 0) {
                  if (var2 == 2) {
                     return 3;
                  }

                  if (var2 == 3) {
                     return 2;
                  }
               } else if (this.if == 1) {
                  if (var2 == 2) {
                     return 4;
                  }

                  if (var2 == 3) {
                     return 5;
                  }

                  if (var2 == 4) {
                     return 2;
                  }

                  if (var2 == 5) {
                     return 3;
                  }
               } else if (this.if == 3) {
                  if (var2 == 2) {
                     return 5;
                  }

                  if (var2 == 3) {
                     return 4;
                  }

                  if (var2 == 4) {
                     return 2;
                  }

                  if (var2 == 5) {
                     return 3;
                  }
               }
            } else if (var1 == pa.cb.void) {
               if (this.if == 0) {
                  if (var2 == 3) {
                     return 4;
                  }

                  if (var2 == 4) {
                     return 3;
                  }
               } else if (this.if == 1) {
                  if (var2 == 3) {
                     return 1;
                  }

                  if (var2 == 4) {
                     return 2;
                  }

                  if (var2 == 2) {
                     return 3;
                  }

                  if (var2 == 1) {
                     return 4;
                  }
               } else if (this.if == 3) {
                  if (var2 == 3) {
                     return 2;
                  }

                  if (var2 == 4) {
                     return 1;
                  }

                  if (var2 == 2) {
                     return 3;
                  }

                  if (var2 == 1) {
                     return 4;
                  }
               }
            } else if (var1 == pa.bl.void || pa.x[var1] != null && pa.x[var1] instanceof rj) {
               if (this.if == 0) {
                  if (var2 == 0 || var2 == 2) {
                     return apk.for[var2];
                  }
               } else if (this.if == 1) {
                  if (var2 == 2) {
                     return 1;
                  }

                  if (var2 == 0) {
                     return 3;
                  }

                  if (var2 == 1) {
                     return 2;
                  }

                  if (var2 == 3) {
                     return 0;
                  }
               } else if (this.if == 3) {
                  if (var2 == 2) {
                     return 3;
                  }

                  if (var2 == 0) {
                     return 1;
                  }

                  if (var2 == 1) {
                     return 2;
                  }

                  if (var2 == 3) {
                     return 0;
                  }
               }
            } else if (var1 == pa.bZ.void || var1 == pa.af.void || var1 == pa.cj.void || var1 == pa.au.void) {
               if (this.if == 0) {
                  if (var2 == 2 || var2 == 3) {
                     return api.if[var2];
                  }
               } else if (this.if == 1) {
                  if (var2 == 2) {
                     return 4;
                  }

                  if (var2 == 3) {
                     return 5;
                  }

                  if (var2 == 4) {
                     return 2;
                  }

                  if (var2 == 5) {
                     return 3;
                  }
               } else if (this.if == 3) {
                  if (var2 == 2) {
                     return 5;
                  }

                  if (var2 == 3) {
                     return 4;
                  }

                  if (var2 == 4) {
                     return 2;
                  }

                  if (var2 == 5) {
                     return 3;
                  }
               }
            }
         } else if (this.if == 0) {
            if (var2 == 2) {
               return 3;
            }

            if (var2 == 3) {
               return 2;
            }
         } else if (this.if == 1) {
            if (var2 == 0) {
               return 2;
            }

            if (var2 == 1) {
               return 3;
            }

            if (var2 == 2) {
               return 0;
            }

            if (var2 == 3) {
               return 1;
            }
         } else if (this.if == 3) {
            if (var2 == 0) {
               return 2;
            }

            if (var2 == 1) {
               return 3;
            }

            if (var2 == 2) {
               return 1;
            }

            if (var2 == 3) {
               return 0;
            }
         }
      } else if (this.if == 0) {
         if (var2 == 0) {
            return 2;
         }

         if (var2 == 2) {
            return 0;
         }
      } else {
         if (this.if == 1) {
            return var2 + 1 & 3;
         }

         if (this.if == 3) {
            return var2 + 3 & 3;
         }
      }

      return var2;
   }

   protected void a(y6 var1, int var2, int var3, int var4, int var5, int var6, wc var7) {
      int var8 = this.a(var4, var6);
      int var9 = this.a(var5);
      int var10 = this.if(var4, var6);
      if (var7.if(var8, var9, var10)) {
         var1.int(var8, var9, var10, var2, var3, 2);
      }

   }

   protected int if(y6 var1, int var2, int var3, int var4, wc var5) {
      int var6 = this.a(var2, var4);
      int var7 = this.a(var3);
      int var8 = this.if(var2, var4);
      return !var5.if(var6, var7, var8) ? 0 : var1.new(var6, var7, var8);
   }

   protected void a(y6 var1, wc var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for(int var9 = var4; var9 <= var7; ++var9) {
         for(int var10 = var3; var10 <= var6; ++var10) {
            for(int var11 = var5; var11 <= var8; ++var11) {
               this.a(var1, 0, 0, var10, var9, var11, var2);
            }
         }
      }

   }

   protected void a(y6 var1, wc var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      for(int var12 = var4; var12 <= var7; ++var12) {
         for(int var13 = var3; var13 <= var6; ++var13) {
            for(int var14 = var5; var14 <= var8; ++var14) {
               if (!var11 || this.if(var1, var13, var12, var14, var2) != 0) {
                  if (var12 != var4 && var12 != var7 && var13 != var3 && var13 != var6 && var14 != var5 && var14 != var8) {
                     this.a(var1, var10, 0, var13, var12, var14, var2);
                  } else {
                     this.a(var1, var9, 0, var13, var12, var14, var2);
                  }
               }
            }
         }
      }

   }

   protected void a(y6 var1, wc var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13) {
      for(int var14 = var4; var14 <= var7; ++var14) {
         for(int var15 = var3; var15 <= var6; ++var15) {
            for(int var16 = var5; var16 <= var8; ++var16) {
               if (!var13 || this.if(var1, var15, var14, var16, var2) != 0) {
                  if (var14 != var4 && var14 != var7 && var15 != var3 && var15 != var6 && var16 != var5 && var16 != var8) {
                     this.a(var1, var11, var12, var15, var14, var16, var2);
                  } else {
                     this.a(var1, var9, var10, var15, var14, var16, var2);
                  }
               }
            }
         }
      }

   }

   protected void a(y6 var1, wc var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Random var10, uj var11) {
      for(int var12 = var4; var12 <= var7; ++var12) {
         for(int var13 = var3; var13 <= var6; ++var13) {
            for(int var14 = var5; var14 <= var8; ++var14) {
               if (!var9 || this.if(var1, var13, var12, var14, var2) != 0) {
                  var11.a(var10, var13, var12, var14, var12 == var4 || var12 == var7 || var13 == var3 || var13 == var6 || var14 == var5 || var14 == var8);
                  this.a(var1, var11.if(), var11.a(), var13, var12, var14, var2);
               }
            }
         }
      }

   }

   protected void a(y6 var1, wc var2, Random var3, float var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13) {
      for(int var14 = var6; var14 <= var9; ++var14) {
         for(int var15 = var5; var15 <= var8; ++var15) {
            for(int var16 = var7; var16 <= var10; ++var16) {
               if (var3.nextFloat() <= var4 && (!var13 || this.if(var1, var15, var14, var16, var2) != 0)) {
                  if (var14 != var6 && var14 != var9 && var15 != var5 && var15 != var8 && var16 != var7 && var16 != var10) {
                     this.a(var1, var12, 0, var15, var14, var16, var2);
                  } else {
                     this.a(var1, var11, 0, var15, var14, var16, var2);
                  }
               }
            }
         }
      }

   }

   protected void a(y6 var1, wc var2, Random var3, float var4, int var5, int var6, int var7, int var8, int var9) {
      if (var3.nextFloat() < var4) {
         this.a(var1, var8, var9, var5, var6, var7, var2);
      }

   }

   protected void a(y6 var1, wc var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      float var11 = (float)(var6 - var3 + 1);
      float var12 = (float)(var7 - var4 + 1);
      float var13 = (float)(var8 - var5 + 1);
      float var14 = (float)var3 + var11 / 2.0F;
      float var15 = (float)var5 + var13 / 2.0F;

      for(int var16 = var4; var16 <= var7; ++var16) {
         float var17 = (float)(var16 - var4) / var12;

         for(int var18 = var3; var18 <= var6; ++var18) {
            float var19 = ((float)var18 - var14) / (var11 * 0.5F);

            for(int var20 = var5; var20 <= var8; ++var20) {
               float var21 = ((float)var20 - var15) / (var13 * 0.5F);
               if (!var10 || this.if(var1, var18, var16, var20, var2) != 0) {
                  float var22 = var19 * var19 + var17 * var17 + var21 * var21;
                  if (var22 <= 1.05F) {
                     this.a(var1, var9, 0, var18, var16, var20, var2);
                  }
               }
            }
         }
      }

   }

   protected void a(y6 var1, int var2, int var3, int var4, wc var5) {
      int var6 = this.a(var2, var4);
      int var7 = this.a(var3);
      int var8 = this.if(var2, var4);
      if (var5.if(var6, var7, var8)) {
         while(!var1.a(var6, var7, var8) && var7 < 255) {
            var1.int(var6, var7, var8, 0, 0, 2);
            ++var7;
         }
      }

   }

   protected void if(y6 var1, int var2, int var3, int var4, int var5, int var6, wc var7) {
      int var8 = this.a(var4, var6);
      int var9 = this.a(var5);
      int var10 = this.if(var4, var6);
      if (var7.if(var8, var9, var10)) {
         while((var1.a(var8, var9, var10) || var1.byte(var8, var9, var10).case()) && var9 > 1) {
            var1.int(var8, var9, var10, var2, var3, 2);
            --var9;
         }
      }

   }

   protected boolean a(y6 var1, wc var2, Random var3, int var4, int var5, int var6, aji[] var7, int var8) {
      int var9 = this.a(var4, var6);
      int var10 = this.a(var5);
      int var11 = this.if(var4, var6);
      if (var2.if(var9, var10, var11) && var1.new(var9, var10, var11) != pa.bi.void) {
         var1.int(var9, var10, var11, pa.bi.void, 0, 2);
         om var12 = (om)var1.if(var9, var10, var11);
         if (var12 != null) {
            aji.a(var3, var7, (ajg)var12, var8);
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(y6 var1, wc var2, Random var3, int var4, int var5, int var6, int var7, aji[] var8, int var9) {
      int var10 = this.a(var4, var6);
      int var11 = this.a(var5);
      int var12 = this.if(var4, var6);
      if (var2.if(var10, var11, var12) && var1.new(var10, var11, var12) != pa.au.void) {
         var1.int(var10, var11, var12, pa.au.void, this.do(pa.au.void, var7), 2);
         oi var13 = (oi)var1.if(var10, var11, var12);
         if (var13 != null) {
            aji.a(var3, var8, var13, var9);
         }

         return true;
      } else {
         return false;
      }
   }

   protected void a(y6 var1, wc var2, Random var3, int var4, int var5, int var6, int var7) {
      int var8 = this.a(var4, var6);
      int var9 = this.a(var5);
      int var10 = this.if(var4, var6);
      if (var2.if(var8, var9, var10)) {
         ab9.a(var1, var8, var9, var10, var7, pa.co);
      }

   }
}
