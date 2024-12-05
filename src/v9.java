import java.util.List;
import java.util.Random;

public class v9 extends uk {
   private final boolean P;
   private final boolean O;
   private boolean R;
   private int Q;

   public v9(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.do = var3;
      this.P = var2.nextInt(3) == 0;
      this.O = !this.P && var2.nextInt(23) == 0;
      if (this.if != 2 && this.if != 0) {
         this.Q = var3.int() / 5;
      } else {
         this.Q = var3.a() / 5;
      }

   }

   public static wc for(List var0, Random var1, int var2, int var3, int var4, int var5) {
      wc var6 = new wc(var2, var3, var4, var2, var3 + 2, var4);

      int var7;
      for(var7 = var1.nextInt(3) + 2; var7 > 0; --var7) {
         int var8 = var7 * 5;
         switch(var5) {
         case 0:
            var6.int = var2 + 2;
            var6.do = var4 + (var8 - 1);
            break;
         case 1:
            var6.if = var2 - (var8 - 1);
            var6.do = var4 + 2;
            break;
         case 2:
            var6.int = var2 + 2;
            var6.new = var4 - (var8 - 1);
            break;
         case 3:
            var6.int = var2 + (var8 - 1);
            var6.do = var4 + 2;
         }

         if (uk.a(var0, var6) == null) {
            break;
         }
      }

      return var7 > 0 ? var6 : null;
   }

   public void a(uk var1, List var2, Random var3) {
      int var4 = this.a();
      int var5 = var3.nextInt(4);
      switch(this.if) {
      case 0:
         if (var5 <= 1) {
            wa.a(var1, var2, var3, this.do.if, this.do.a - 1 + var3.nextInt(3), this.do.do + 1, this.if, var4);
         } else if (var5 == 2) {
            wa.a(var1, var2, var3, this.do.if - 1, this.do.a - 1 + var3.nextInt(3), this.do.do - 3, 1, var4);
         } else {
            wa.a(var1, var2, var3, this.do.int + 1, this.do.a - 1 + var3.nextInt(3), this.do.do - 3, 3, var4);
         }
         break;
      case 1:
         if (var5 <= 1) {
            wa.a(var1, var2, var3, this.do.if - 1, this.do.a - 1 + var3.nextInt(3), this.do.new, this.if, var4);
         } else if (var5 == 2) {
            wa.a(var1, var2, var3, this.do.if, this.do.a - 1 + var3.nextInt(3), this.do.new - 1, 2, var4);
         } else {
            wa.a(var1, var2, var3, this.do.if, this.do.a - 1 + var3.nextInt(3), this.do.do + 1, 0, var4);
         }
         break;
      case 2:
         if (var5 <= 1) {
            wa.a(var1, var2, var3, this.do.if, this.do.a - 1 + var3.nextInt(3), this.do.new - 1, this.if, var4);
         } else if (var5 == 2) {
            wa.a(var1, var2, var3, this.do.if - 1, this.do.a - 1 + var3.nextInt(3), this.do.new, 1, var4);
         } else {
            wa.a(var1, var2, var3, this.do.int + 1, this.do.a - 1 + var3.nextInt(3), this.do.new, 3, var4);
         }
         break;
      case 3:
         if (var5 <= 1) {
            wa.a(var1, var2, var3, this.do.int + 1, this.do.a - 1 + var3.nextInt(3), this.do.new, this.if, var4);
         } else if (var5 == 2) {
            wa.a(var1, var2, var3, this.do.int - 3, this.do.a - 1 + var3.nextInt(3), this.do.new - 1, 2, var4);
         } else {
            wa.a(var1, var2, var3, this.do.int - 3, this.do.a - 1 + var3.nextInt(3), this.do.do + 1, 0, var4);
         }
      }

      if (var4 < 8) {
         int var6;
         int var7;
         if (this.if != 2 && this.if != 0) {
            for(var6 = this.do.if + 3; var6 + 3 <= this.do.int; var6 += 5) {
               var7 = var3.nextInt(5);
               if (var7 == 0) {
                  wa.a(var1, var2, var3, var6, this.do.a, this.do.new - 1, 2, var4 + 1);
               } else if (var7 == 1) {
                  wa.a(var1, var2, var3, var6, this.do.a, this.do.do + 1, 0, var4 + 1);
               }
            }
         } else {
            for(var6 = this.do.new + 3; var6 + 3 <= this.do.do; var6 += 5) {
               var7 = var3.nextInt(5);
               if (var7 == 0) {
                  wa.a(var1, var2, var3, this.do.if - 1, this.do.a, var6, 1, var4 + 1);
               } else if (var7 == 1) {
                  wa.a(var1, var2, var3, this.do.int + 1, this.do.a, var6, 3, var4 + 1);
               }
            }
         }
      }

   }

   protected boolean a(y6 var1, wc var2, Random var3, int var4, int var5, int var6, aji[] var7, int var8) {
      int var9 = this.a(var4, var6);
      int var10 = this.a(var5);
      int var11 = this.if(var4, var6);
      if (var2.if(var9, var10, var11) && var1.new(var9, var10, var11) == 0) {
         var1.int(var9, var10, var11, pa.cm.void, this.do(pa.cm.void, var3.nextBoolean() ? 1 : 0), 2);
         afi var12 = new afi(var1, (double)((float)var9 + 0.5F), (double)((float)var10 + 0.5F), (double)((float)var11 + 0.5F));
         aji.a(var3, var7, (ajg)var12, var8);
         var1.new(var12);
         return true;
      } else {
         return false;
      }
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         int var8 = this.Q * 5 - 1;
         this.a(var1, var3, 0, 0, 0, 2, 1, var8, 0, 0, false);
         this.a(var1, var3, var2, 0.8F, 0, 2, 0, 2, 2, var8, 0, 0, false);
         if (this.O) {
            this.a(var1, var3, var2, 0.6F, 0, 0, 0, 2, 1, var8, pa.b5.void, 0, false);
         }

         int var9;
         int var10;
         int var11;
         for(var9 = 0; var9 < this.Q; ++var9) {
            var10 = 2 + var9 * 5;
            this.a(var1, var3, 0, 0, var10, 0, 1, var10, pa.aZ.void, 0, false);
            this.a(var1, var3, 2, 0, var10, 2, 1, var10, pa.aZ.void, 0, false);
            if (var2.nextInt(4) == 0) {
               this.a(var1, var3, 0, 2, var10, 0, 2, var10, pa.be.void, 0, false);
               this.a(var1, var3, 2, 2, var10, 2, 2, var10, pa.be.void, 0, false);
            } else {
               this.a(var1, var3, 0, 2, var10, 2, 2, var10, pa.be.void, 0, false);
            }

            this.a(var1, var3, var2, 0.1F, 0, 2, var10 - 1, pa.b5.void, 0);
            this.a(var1, var3, var2, 0.1F, 2, 2, var10 - 1, pa.b5.void, 0);
            this.a(var1, var3, var2, 0.1F, 0, 2, var10 + 1, pa.b5.void, 0);
            this.a(var1, var3, var2, 0.1F, 2, 2, var10 + 1, pa.b5.void, 0);
            this.a(var1, var3, var2, 0.05F, 0, 2, var10 - 2, pa.b5.void, 0);
            this.a(var1, var3, var2, 0.05F, 2, 2, var10 - 2, pa.b5.void, 0);
            this.a(var1, var3, var2, 0.05F, 0, 2, var10 + 2, pa.b5.void, 0);
            this.a(var1, var3, var2, 0.05F, 2, 2, var10 + 2, pa.b5.void, 0);
            this.a(var1, var3, var2, 0.05F, 1, 2, var10 - 1, pa.bq.void, 0);
            this.a(var1, var3, var2, 0.05F, 1, 2, var10 + 1, pa.bq.void, 0);
            if (var2.nextInt(100) == 0) {
               this.a(var1, var3, var2, 2, 0, var10 - 1, aji.a(wa.a(), abr.bj.if(var2)), 3 + var2.nextInt(4));
            }

            if (var2.nextInt(100) == 0) {
               this.a(var1, var3, var2, 0, 0, var10 + 1, aji.a(wa.a(), abr.bj.if(var2)), 3 + var2.nextInt(4));
            }

            if (this.O && !this.R) {
               var11 = this.a(0);
               int var12 = var10 - 1 + var2.nextInt(3);
               int var13 = this.a(1, var12);
               var12 = this.if(1, var12);
               if (var3.if(var13, var11, var12)) {
                  this.R = true;
                  var1.int(var13, var11, var12, pa.bm.void, 0, 2);
                  oa var14 = (oa)var1.if(var13, var11, var12);
                  if (var14 != null) {
                     var14.o().a("CaveSpider");
                  }
               }
            }
         }

         for(var9 = 0; var9 <= 2; ++var9) {
            for(var10 = 0; var10 <= var8; ++var10) {
               var11 = this.if(var1, var9, -1, var10, var3);
               if (var11 == 0) {
                  this.a(var1, pa.be.void, 0, var9, -1, var10, var3);
               }
            }
         }

         if (this.P) {
            for(var9 = 0; var9 <= var8; ++var9) {
               var10 = this.if(var1, 1, -1, var9, var3);
               if (var10 > 0 && pa.v[var10]) {
                  this.a(var1, var3, var2, 0.7F, 1, 0, var9, pa.cm.void, this.do(pa.cm.void, 0));
               }
            }
         }

         return true;
      }
   }
}
