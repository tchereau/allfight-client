import java.util.Iterator;
import java.util.Map;

public class ade extends ad1 {
   private ajg f = new adb();
   private ajg e = new add(this, "Repair", true, 2);
   private y6 d;
   private int c;
   private int b;
   private int void;
   public int g = 0;
   private int long = 0;
   private String goto;
   private final aek else;

   public ade(aen var1, y6 var2, int var3, int var4, int var5, aek var6) {
      this.d = var2;
      this.c = var3;
      this.b = var4;
      this.void = var5;
      this.else = var6;
      this.if((ac9)(new ac9(this.e, 0, 27, 47)));
      this.if((ac9)(new ac9(this.e, 1, 76, 47)));
      this.if((ac9)(new adc(this, this.f, 2, 134, 47, var2, var3, var4, var5)));

      int var7;
      for(var7 = 0; var7 < 3; ++var7) {
         for(int var8 = 0; var8 < 9; ++var8) {
            this.if((ac9)(new ac9(var1, var8 + var7 * 9 + 9, 8 + var8 * 18, 84 + var7 * 18)));
         }
      }

      for(var7 = 0; var7 < 9; ++var7) {
         this.if((ac9)(new ac9(var1, var7, 8 + var7 * 18, 142)));
      }

   }

   public void if(ajg var1) {
      super.if(var1);
      if (var1 == this.e) {
         this.for();
      }

   }

   public void for() {
      abp var1 = this.e.do(0);
      this.g = 0;
      int var2 = 0;
      byte var3 = 0;
      int var4 = 0;
      if (var1 == null) {
         this.f.if(0, (abp)null);
         this.g = 0;
      } else {
         abp var5 = var1.n();
         abp var6 = this.e.do(1);
         Map var7 = z1.a(var5);
         boolean var8 = false;
         int var19 = var3 + var1.char() + (var6 == null ? 0 : var6.char());
         this.long = 0;
         int var9;
         int var10;
         int var11;
         int var13;
         int var14;
         Iterator var21;
         z3 var22;
         if (var6 != null) {
            var8 = var6.new == abr.bj.A && abr.bj.long(var6).for() > 0;
            if (var5.else() && abr.ai[var5.new].a(var1, var6)) {
               var9 = Math.min(var5.k(), var5.e() / 4);
               if (var9 <= 0) {
                  this.f.if(0, (abp)null);
                  this.g = 0;
                  return;
               }

               for(var10 = 0; var9 > 0 && var10 < var6.if; ++var10) {
                  var11 = var5.k() - var9;
                  var5.do(var11);
                  var2 += Math.max(1, var9 / 100) + var7.size();
                  var9 = Math.min(var5.k(), var5.e() / 4);
               }

               this.long = var10;
            } else {
               if (!var8 && (var5.new != var6.new || !var5.else())) {
                  this.f.if(0, (abp)null);
                  this.g = 0;
                  return;
               }

               if (var5.else() && !var8) {
                  var9 = var1.e() - var1.k();
                  var10 = var6.e() - var6.k();
                  var11 = var10 + var5.e() * 12 / 100;
                  int var12 = var9 + var11;
                  var13 = var5.e() - var12;
                  if (var13 < 0) {
                     var13 = 0;
                  }

                  if (var13 < var5.new()) {
                     var5.do(var13);
                     var2 += Math.max(1, var11 / 100);
                  }
               }

               Map var20 = z1.a(var6);
               var21 = var20.keySet().iterator();

               while(var21.hasNext()) {
                  var11 = (Integer)var21.next();
                  var22 = z3.n[var11];
                  var13 = var7.containsKey(var11) ? (Integer)var7.get(var11) : 0;
                  var14 = (Integer)var20.get(var11);
                  int var10000;
                  if (var13 == var14) {
                     ++var14;
                     var10000 = var14;
                  } else {
                     var10000 = Math.max(var14, var13);
                  }

                  var14 = var10000;
                  int var15 = var14 - var13;
                  boolean var16 = var22.a(var1);
                  if (this.else.fY.new || var1.new == ab5.bj.A) {
                     var16 = true;
                  }

                  Iterator var17 = var7.keySet().iterator();

                  while(var17.hasNext()) {
                     int var18 = (Integer)var17.next();
                     if (var18 != var11 && !var22.a(z3.n[var18])) {
                        var16 = false;
                        var2 += var15;
                     }
                  }

                  if (var16) {
                     if (var14 > var22.do()) {
                        var14 = var22.do();
                     }

                     var7.put(var11, var14);
                     int var23 = 0;
                     switch(var22.if()) {
                     case 1:
                        var23 = 8;
                        break;
                     case 2:
                        var23 = 4;
                     case 3:
                     case 4:
                     case 6:
                     case 7:
                     case 8:
                     case 9:
                     default:
                        break;
                     case 5:
                        var23 = 2;
                        break;
                     case 10:
                        var23 = 1;
                     }

                     if (var8) {
                        var23 = Math.max(1, var23 / 2);
                     }

                     var2 += var23 * var15;
                  }
               }
            }
         }

         if (this.goto != null && !this.goto.equalsIgnoreCase(var1.void()) && this.goto.length() > 0) {
            var4 = var1.else() ? 7 : var1.if * 5;
            var2 += var4;
            if (var1.g()) {
               var19 += var4 / 2;
            }

            var5.a(this.goto);
         }

         var9 = 0;

         for(var21 = var7.keySet().iterator(); var21.hasNext(); var19 += var9 + var13 * var14) {
            var11 = (Integer)var21.next();
            var22 = z3.n[var11];
            var13 = (Integer)var7.get(var11);
            var14 = 0;
            ++var9;
            switch(var22.if()) {
            case 1:
               var14 = 8;
               break;
            case 2:
               var14 = 4;
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
               break;
            case 5:
               var14 = 2;
               break;
            case 10:
               var14 = 1;
            }

            if (var8) {
               var14 = Math.max(1, var14 / 2);
            }
         }

         if (var8) {
            var19 = Math.max(1, var19 / 2);
         }

         this.g = var19 + var2;
         if (var2 <= 0) {
            var5 = null;
         }

         if (var4 == var2 && var4 > 0 && this.g >= 40) {
            this.d.char().a("Naming an item only, cost too high; giving discount to cap cost to 39 levels");
            this.g = 39;
         }

         if (this.g >= 40 && !this.else.fY.new) {
            var5 = null;
         }

         if (var5 != null) {
            var10 = var5.char();
            if (var6 != null && var10 < var6.char()) {
               var10 = var6.char();
            }

            if (var5.g()) {
               var10 -= 9;
            }

            if (var10 < 0) {
               var10 = 0;
            }

            var10 += 2;
            var5.if(var10);
            z1.a(var7, var5);
         }

         this.f.if(0, var5);
         this.do();
      }
   }

   public void a(adv var1) {
      super.a(var1);
      var1.a(this, 0, this.g);
   }

   public void a(int var1, int var2) {
      if (var1 == 0) {
         this.g = var2;
      }

   }

   public void if(aek var1) {
      super.if(var1);
      if (!this.d.goto) {
         for(int var2 = 0; var2 < this.e.r(); ++var2) {
            abp var3 = this.e.if(var2);
            if (var3 != null) {
               var1.else(var3);
            }
         }

      }
   }

   public boolean do(aek var1) {
      if (this.d.new(this.c, this.b, this.void) != pa.y.void) {
         return false;
      } else {
         return !(var1.if((double)this.c + 0.5D, (double)this.b + 0.5D, (double)this.void + 0.5D) > 64.0D);
      }
   }

   public abp if(aek var1, int var2) {
      abp var3 = null;
      ac9 var4 = (ac9)this.try.get(var2);
      if (var4 != null && var4.do()) {
         abp var5 = var4.for();
         var3 = var5.n();
         if (var2 == 2) {
            if (!this.a(var5, 3, 39, true)) {
               return null;
            }

            var4.a(var5, var3);
         } else if (var2 != 0 && var2 != 1) {
            if (var2 >= 3 && var2 < 39 && !this.a(var5, 0, 2, false)) {
               return null;
            }
         } else if (!this.a(var5, 3, 39, false)) {
            return null;
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

   public void a(String var1) {
      this.goto = var1;
      if (this.do(2).do()) {
         this.do(2).for().a(this.goto);
      }

      this.for();
   }

   // $FF: synthetic method
   static ajg if(ade var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static int a(ade var0) {
      return var0.long;
   }
}
