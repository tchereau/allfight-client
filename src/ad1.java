import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class ad1 {
   public List byte = new ArrayList();
   public List try = new ArrayList();
   public int new = 0;
   private short case = 0;
   private int for = -1;
   private int do = 0;
   private final Set if = new HashSet();
   protected List int = new ArrayList();
   private Set a = new HashSet();

   protected ac9 if(ac9 var1) {
      var1.for = this.try.size();
      this.try.add(var1);
      this.byte.add((Object)null);
      return var1;
   }

   public void a(adv var1) {
      if (this.int.contains(var1)) {
         throw new IllegalArgumentException("Listener already listening");
      } else {
         this.int.add(var1);
         var1.a(this, this.a());
         this.do();
      }
   }

   public void if(adv var1) {
      this.int.remove(var1);
   }

   public List a() {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < this.try.size(); ++var2) {
         var1.add(((ac9)this.try.get(var2)).for());
      }

      return var1;
   }

   public void do() {
      for(int var1 = 0; var1 < this.try.size(); ++var1) {
         abp var2 = ((ac9)this.try.get(var1)).for();
         abp var3 = (abp)this.byte.get(var1);
         if (!abp.if(var3, var2)) {
            var3 = var2 == null ? null : var2.n();
            this.byte.set(var1, var3);

            for(int var4 = 0; var4 < this.int.size(); ++var4) {
               ((adv)this.int.get(var4)).a(this, var1, var3);
            }
         }
      }

   }

   public boolean a(aek var1, int var2) {
      return false;
   }

   public ac9 a(ajg var1, int var2) {
      for(int var3 = 0; var3 < this.try.size(); ++var3) {
         ac9 var4 = (ac9)this.try.get(var3);
         if (var4.a(var1, var2)) {
            return var4;
         }
      }

      return null;
   }

   public ac9 do(int var1) {
      return (ac9)this.try.get(var1);
   }

   public abp if(aek var1, int var2) {
      ac9 var3 = (ac9)this.try.get(var2);
      return var3 != null ? var3.for() : null;
   }

   public abp a(int var1, int var2, int var3, aek var4) {
      abp var5 = null;
      aen var6 = var4.fR;
      int var9;
      abp var17;
      if (var3 == 5) {
         int var7 = this.do;
         this.do = for(var2);
         if ((var7 != 1 || this.do != 2) && var7 != this.do) {
            this.if();
         } else if (var6.M() == null) {
            this.if();
         } else if (this.do == 0) {
            this.for = if(var2);
            if (a(this.for)) {
               this.do = 1;
               this.if.clear();
            } else {
               this.if();
            }
         } else if (this.do == 1) {
            ac9 var8 = (ac9)this.try.get(var1);
            if (var8 != null && a(var8, var6.M(), true) && var8.if(var6.M()) && var6.M().if > this.if.size() && this.a(var8)) {
               this.if.add(var8);
            }
         } else if (this.do == 2) {
            if (!this.if.isEmpty()) {
               var17 = var6.M().n();
               var9 = var6.M().if;
               Iterator var10 = this.if.iterator();

               while(var10.hasNext()) {
                  ac9 var11 = (ac9)var10.next();
                  if (var11 != null && a(var11, var6.M(), true) && var11.if(var6.M()) && var6.M().if >= this.if.size() && this.a(var11)) {
                     abp var12 = var17.n();
                     int var13 = var11.do() ? var11.for().if : 0;
                     a(this.if, this.for, var12, var13);
                     if (var12.if > var12.h()) {
                        var12.if = var12.h();
                     }

                     if (var12.if > var11.int()) {
                        var12.if = var11.int();
                     }

                     var9 -= var12.if - var13;
                     var11.a(var12);
                  }
               }

               var17.if = var9;
               if (var17.if <= 0) {
                  var17 = null;
               }

               var6.if(var17);
            }

            this.if();
         } else {
            this.if();
         }
      } else if (this.do != 0) {
         this.if();
      } else {
         ac9 var16;
         int var19;
         abp var22;
         if ((var3 == 0 || var3 == 1) && (var2 == 0 || var2 == 1)) {
            if (var1 == -999) {
               if (var6.M() != null && var1 == -999) {
                  if (var2 == 0) {
                     var4.else(var6.M());
                     var6.if((abp)null);
                  }

                  if (var2 == 1) {
                     var4.else(var6.M().a(1));
                     if (var6.M().if == 0) {
                        var6.if((abp)null);
                     }
                  }
               }
            } else if (var3 == 1) {
               if (var1 < 0) {
                  return null;
               }

               var16 = (ac9)this.try.get(var1);
               if (var16 != null && var16.a(var4)) {
                  var17 = this.if(var4, var1);
                  if (var17 != null) {
                     var9 = var17.new;
                     var5 = var17.n();
                     if (var16 != null && var16.for() != null && var16.for().new == var9) {
                        this.a(var1, var2, true, var4);
                     }
                  }
               }
            } else {
               if (var1 < 0) {
                  return null;
               }

               var16 = (ac9)this.try.get(var1);
               if (var16 != null) {
                  var17 = var16.for();
                  abp var20 = var6.M();
                  if (var17 != null) {
                     var5 = var17.n();
                  }

                  if (var17 == null) {
                     if (var20 != null && var16.if(var20)) {
                        var19 = var2 == 0 ? var20.if : 1;
                        if (var19 > var16.int()) {
                           var19 = var16.int();
                        }

                        var16.a(var20.a(var19));
                        if (var20.if == 0) {
                           var6.if((abp)null);
                        }
                     }
                  } else if (var16.a(var4)) {
                     if (var20 == null) {
                        var19 = var2 == 0 ? var17.if : (var17.if + 1) / 2;
                        var22 = var16.a(var19);
                        var6.if(var22);
                        if (var17.if == 0) {
                           var16.a((abp)null);
                        }

                        var16.a(var4, var6.M());
                     } else if (var16.if(var20)) {
                        if (var17.new == var20.new && var17.new() == var20.new() && abp.a(var17, var20)) {
                           var19 = var2 == 0 ? var20.if : 1;
                           if (var19 > var16.int() - var17.if) {
                              var19 = var16.int() - var17.if;
                           }

                           if (var19 > var20.h() - var17.if) {
                              var19 = var20.h() - var17.if;
                           }

                           var20.a(var19);
                           if (var20.if == 0) {
                              var6.if((abp)null);
                           }

                           var17.if += var19;
                        } else if (var20.if <= var16.int()) {
                           var16.a(var20);
                           var6.if(var17);
                        }
                     } else if (var17.new == var20.new && var20.h() > 1 && (!var17.j() || var17.new() == var20.new()) && abp.a(var17, var20)) {
                        var19 = var17.if;
                        if (var19 > 0 && var19 + var20.if <= var20.h()) {
                           var20.if += var19;
                           var17 = var16.a(var19);
                           if (var17.if == 0) {
                              var16.a((abp)null);
                           }

                           var16.a(var4, var6.M());
                        }
                     }
                  }

                  var16.if();
               }
            }
         } else if (var3 == 2 && var2 >= 0 && var2 < 9) {
            var16 = (ac9)this.try.get(var1);
            if (var16.a(var4)) {
               var17 = var6.do(var2);
               boolean var18 = var17 == null || var16.int == var6 && var16.if(var17);
               var19 = -1;
               if (!var18) {
                  var19 = var6.J();
                  var18 |= var19 > -1;
               }

               if (var16.do() && var18) {
                  var22 = var16.for();
                  var6.if(var2, var22);
                  if ((var16.int != var6 || !var16.if(var17)) && var17 != null) {
                     if (var19 > -1) {
                        var6.new(var17);
                        var16.a(var22.if);
                        var16.a((abp)null);
                        var16.a(var4, var22);
                     }
                  } else {
                     var16.a(var22.if);
                     var16.a(var17);
                     var16.a(var4, var22);
                  }
               } else if (!var16.do() && var17 != null && var16.if(var17)) {
                  var6.if(var2, (abp)null);
                  var16.a(var17);
               }
            }
         } else if (var3 == 3 && var4.fY.new && var6.M() == null && var1 >= 0) {
            var16 = (ac9)this.try.get(var1);
            if (var16 != null && var16.do()) {
               var17 = var16.for().n();
               var17.if = var17.h();
               var6.if(var17);
            }
         } else if (var3 == 4 && var6.M() == null && var1 >= 0) {
            var16 = (ac9)this.try.get(var1);
            if (var16 != null && var16.do()) {
               var17 = var16.a(var2 == 0 ? 1 : var16.for().if);
               var16.a(var4, var17);
               var4.else(var17);
            }
         } else if (var3 == 6 && var1 >= 0) {
            var16 = (ac9)this.try.get(var1);
            var17 = var6.M();
            if (var17 != null && (var16 == null || !var16.do() || !var16.a(var4))) {
               var9 = var2 == 0 ? 0 : this.try.size() - 1;
               var19 = var2 == 0 ? 1 : -1;

               for(int var21 = 0; var21 < 2; ++var21) {
                  for(int var23 = var9; var23 >= 0 && var23 < this.try.size() && var17.if < var17.h(); var23 += var19) {
                     ac9 var24 = (ac9)this.try.get(var23);
                     if (var24.do() && a(var24, var17, true) && var24.a(var4) && this.a(var17, var24) && (var21 != 0 || var24.for().if != var24.for().h())) {
                        int var14 = Math.min(var17.h() - var17.if, var24.for().if);
                        abp var15 = var24.a(var14);
                        var17.if += var14;
                        if (var15.if <= 0) {
                           var24.a((abp)null);
                        }

                        var24.a(var4, var15);
                     }
                  }
               }
            }

            this.do();
         }
      }

      return var5;
   }

   public boolean a(abp var1, ac9 var2) {
      return true;
   }

   protected void a(int var1, int var2, boolean var3, aek var4) {
      this.a(var1, var2, 1, var4);
   }

   public void if(aek var1) {
      aen var2 = var1.fR;
      if (var2.M() != null) {
         var1.else(var2.M());
         var2.if((abp)null);
      }

   }

   public void if(ajg var1) {
      this.do();
   }

   public void a(int var1, abp var2) {
      this.do(var1).a(var2);
   }

   public void a(abp[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.do(var2).a(var1[var2]);
      }

   }

   public void a(int var1, int var2) {
   }

   public short a(aen var1) {
      ++this.case;
      return this.case;
   }

   public boolean a(aek var1) {
      return !this.a.contains(var1);
   }

   public void a(aek var1, boolean var2) {
      if (var2) {
         this.a.remove(var1);
      } else {
         this.a.add(var1);
      }

   }

   public abstract boolean do(aek var1);

   protected boolean a(abp var1, int var2, int var3, boolean var4) {
      boolean var5 = false;
      int var6 = var2;
      if (var4) {
         var6 = var3 - 1;
      }

      ac9 var7;
      abp var8;
      if (var1.o()) {
         while(var1.if > 0 && (!var4 && var6 < var3 || var4 && var6 >= var2)) {
            var7 = (ac9)this.try.get(var6);
            var8 = var7.for();
            if (var8 != null && var8.new == var1.new && (!var1.j() || var1.new() == var8.new()) && abp.a(var1, var8)) {
               int var9 = var8.if + var1.if;
               if (var9 <= var1.h()) {
                  var1.if = 0;
                  var8.if = var9;
                  var7.if();
                  var5 = true;
               } else if (var8.if < var1.h()) {
                  var1.if -= var1.h() - var8.if;
                  var8.if = var1.h();
                  var7.if();
                  var5 = true;
               }
            }

            if (var4) {
               --var6;
            } else {
               ++var6;
            }
         }
      }

      if (var1.if > 0) {
         if (var4) {
            var6 = var3 - 1;
         } else {
            var6 = var2;
         }

         while(!var4 && var6 < var3 || var4 && var6 >= var2) {
            var7 = (ac9)this.try.get(var6);
            var8 = var7.for();
            if (var8 == null) {
               var7.a(var1.n());
               var7.if();
               var1.if = 0;
               var5 = true;
               break;
            }

            if (var4) {
               --var6;
            } else {
               ++var6;
            }
         }
      }

      return var5;
   }

   public static int if(int var0) {
      return var0 >> 2 & 3;
   }

   public static int for(int var0) {
      return var0 & 3;
   }

   public static int if(int var0, int var1) {
      return var0 & 3 | (var1 & 3) << 2;
   }

   public static boolean a(int var0) {
      return var0 == 0 || var0 == 1;
   }

   protected void if() {
      this.do = 0;
      this.if.clear();
   }

   public static boolean a(ac9 var0, abp var1, boolean var2) {
      boolean var3 = var0 == null || !var0.do();
      if (var0 != null && var0.do() && var1 != null && var1.do(var0.for()) && abp.a(var0.for(), var1)) {
         var3 |= var0.for().if + (var2 ? 0 : var1.if) <= var1.h();
      }

      return var3;
   }

   public static void a(Set var0, int var1, abp var2, int var3) {
      switch(var1) {
      case 0:
         var2.if = ajs.new((float)var2.if / (float)var0.size());
         break;
      case 1:
         var2.if = 1;
      }

      var2.if += var3;
   }

   public boolean a(ac9 var1) {
      return true;
   }

   public static int a(ajg var0) {
      if (var0 == null) {
         return 0;
      } else {
         int var1 = 0;
         float var2 = 0.0F;

         for(int var3 = 0; var3 < var0.r(); ++var3) {
            abp var4 = var0.do(var3);
            if (var4 != null) {
               var2 += (float)var4.if / (float)Math.min(var0.q(), var4.h());
               ++var1;
            }
         }

         var2 /= (float)var0.r();
         return ajs.new(var2 * 14.0F) + (var1 > 0 ? 1 : 0);
      }
   }
}
