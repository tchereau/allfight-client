import java.util.List;
import java.util.Random;

public class adr extends ad1 {
   public ajg u = new adq(this, "Enchant", true, 1);
   private y6 y;
   private int x;
   private int w;
   private int v;
   private Random t = new Random();
   public long A;
   public int[] z = new int[3];

   public adr(aen var1, y6 var2, int var3, int var4, int var5) {
      this.y = var2;
      this.x = var3;
      this.w = var4;
      this.v = var5;
      this.if((ac9)(new adp(this, this.u, 0, 25, 47)));

      int var6;
      for(var6 = 0; var6 < 3; ++var6) {
         for(int var7 = 0; var7 < 9; ++var7) {
            this.if((ac9)(new ac9(var1, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18)));
         }
      }

      for(var6 = 0; var6 < 9; ++var6) {
         this.if((ac9)(new ac9(var1, var6, 8 + var6 * 18, 142)));
      }

   }

   public void a(adv var1) {
      super.a(var1);
      var1.a(this, 0, this.z[0]);
      var1.a(this, 1, this.z[1]);
      var1.a(this, 2, this.z[2]);
   }

   public void do() {
      super.do();

      for(int var1 = 0; var1 < this.int.size(); ++var1) {
         adv var2 = (adv)this.int.get(var1);
         var2.a(this, 0, this.z[0]);
         var2.a(this, 1, this.z[1]);
         var2.a(this, 2, this.z[2]);
      }

   }

   public void a(int var1, int var2) {
      if (var1 >= 0 && var1 <= 2) {
         this.z[var1] = var2;
      } else {
         super.a(var1, var2);
      }

   }

   public void if(ajg var1) {
      if (var1 == this.u) {
         abp var2 = var1.do(0);
         int var3;
         if (var2 != null && var2.m()) {
            this.A = this.t.nextLong();
            if (!this.y.goto) {
               var3 = 0;

               int var4;
               for(var4 = -1; var4 <= 1; ++var4) {
                  for(int var5 = -1; var5 <= 1; ++var5) {
                     if ((var4 != 0 || var5 != 0) && this.y.a(this.x + var5, this.w, this.v + var4) && this.y.a(this.x + var5, this.w + 1, this.v + var4)) {
                        if (this.y.new(this.x + var5 * 2, this.w, this.v + var4 * 2) == pa.bx.void) {
                           ++var3;
                        }

                        if (this.y.new(this.x + var5 * 2, this.w + 1, this.v + var4 * 2) == pa.bx.void) {
                           ++var3;
                        }

                        if (var5 != 0 && var4 != 0) {
                           if (this.y.new(this.x + var5 * 2, this.w, this.v + var4) == pa.bx.void) {
                              ++var3;
                           }

                           if (this.y.new(this.x + var5 * 2, this.w + 1, this.v + var4) == pa.bx.void) {
                              ++var3;
                           }

                           if (this.y.new(this.x + var5, this.w, this.v + var4 * 2) == pa.bx.void) {
                              ++var3;
                           }

                           if (this.y.new(this.x + var5, this.w + 1, this.v + var4 * 2) == pa.bx.void) {
                              ++var3;
                           }
                        }
                     }
                  }
               }

               for(var4 = 0; var4 < 3; ++var4) {
                  this.z[var4] = z1.a(this.t, var4, var3, var2);
               }

               this.do();
            }
         } else {
            for(var3 = 0; var3 < 3; ++var3) {
               this.z[var3] = 0;
            }
         }
      }

   }

   public boolean a(aek var1, int var2) {
      abp var3 = this.u.do(0);
      if (this.z[var2] <= 0 || var3 == null || var1.fX < this.z[var2] && !var1.fY.new) {
         return false;
      } else {
         if (!this.y.goto) {
            List var4 = z1.if(this.t, var3, this.z[var2]);
            boolean var5 = var3.new == abr.cm.A;
            if (var4 != null) {
               var1.D(-this.z[var2]);
               if (var5) {
                  var3.new = abr.bj.A;
               }

               int var6 = var5 ? this.t.nextInt(var4.size()) : -1;

               for(int var7 = 0; var7 < var4.size(); ++var7) {
                  zw var8 = (zw)var4.get(var7);
                  if (!var5 || var7 == var6) {
                     if (var5) {
                        abr.bj.a(var3, var8);
                     } else {
                        var3.a(var8.int, var8.new);
                     }
                  }
               }

               this.if(this.u);
            }
         }

         return true;
      }
   }

   public void if(aek var1) {
      super.if(var1);
      if (!this.y.goto) {
         abp var2 = this.u.if(0);
         if (var2 != null) {
            var1.else(var2);
         }

      }
   }

   public boolean do(aek var1) {
      if (this.y.new(this.x, this.w, this.v) != pa.bQ.void) {
         return false;
      } else {
         return !(var1.if((double)this.x + 0.5D, (double)this.w + 0.5D, (double)this.v + 0.5D) > 64.0D);
      }
   }

   public abp if(aek var1, int var2) {
      abp var3 = null;
      ac9 var4 = (ac9)this.try.get(var2);
      if (var4 != null && var4.do()) {
         abp var5 = var4.for();
         var3 = var5.n();
         if (var2 == 0) {
            if (!this.a(var5, 1, 37, true)) {
               return null;
            }
         } else {
            if (((ac9)this.try.get(0)).do() || !((ac9)this.try.get(0)).if(var5)) {
               return null;
            }

            if (var5.a() && var5.if == 1) {
               ((ac9)this.try.get(0)).a(var5.n());
               var5.if = 0;
            } else if (var5.if >= 1) {
               ((ac9)this.try.get(0)).a(new abp(var5.new, 1, var5.new()));
               --var5.if;
            }
         }

         if (var5.if == 0) {
            var4.a((abp)null);
         } else {
            var4.if();
         }

         if (var5.if == var3.if) {
            return null;
         }

         var4.a(var1, var5);
      }

      return var3;
   }
}
