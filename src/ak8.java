import java.util.ArrayList;
import java.util.List;

public class ak8 {
   private final ak5 if;
   private final List a = new ArrayList();
   private final ajv try = new ajv();
   private List new = new ArrayList();
   public h do = new h(100, 0.8F);
   private int int;
   private final int[][] for = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

   public ak8(ak5 var1, int var2) {
      if (var2 > 15) {
         throw new IllegalArgumentException("Too big view radius!");
      } else if (var2 < 3) {
         throw new IllegalArgumentException("Too small view radius!");
      } else {
         this.int = qs.u();
         qs.for("ViewRadius: " + this.int + ", for: " + this + " (constructor)");
         this.if = var1;
      }
   }

   public ak5 if() {
      return this.if;
   }

   public void a() {
      int var1;
      for(var1 = 0; var1 < this.new.size(); ++var1) {
         ((ak7)this.new.get(var1)).a();
      }

      this.new.clear();
      if (this.a.isEmpty()) {
         xl var18 = this.if.n;
         if (!var18.do()) {
            this.if.T.int();
         }
      }

      if (this.int != qs.u()) {
         this.if(qs.u());
      }

      if (this.do.do() > 0) {
         for(var1 = 0; var1 < this.a.size(); ++var1) {
            ak2 var2 = (ak2)this.a.get(var1);
            int var3 = var2.be;
            int var4 = var2.bc;
            int var5 = this.int + 1;
            int var6 = var5 / 2;
            int var7 = var5 * var5 + var6 * var6;
            int var8 = var7;
            int var9 = -1;
            ak7 var10 = null;
            zi var11 = null;

            for(int var12 = 0; var12 < this.do.do(); ++var12) {
               zi var13 = (zi)this.do.if(var12);
               if (var13 != null) {
                  ak7 var14 = this.a(var13.if, var13.a, false);
                  if (var14 != null && !var14.do) {
                     int var15 = var3 - var13.if;
                     int var16 = var4 - var13.a;
                     int var17 = var15 * var15 + var16 * var16;
                     if (var17 < var8) {
                        var8 = var17;
                        var9 = var12;
                        var10 = var14;
                        var11 = var13;
                     }
                  } else {
                     this.do.if(var12, (Object)null);
                  }
               }
            }

            if (var9 >= 0) {
               this.do.if(var9, (Object)null);
            }

            if (var10 != null) {
               var10.do = true;
               this.if().T.if(var11.if, var11.a);
               var10.if();
               break;
            }
         }

         this.do.if();
      }

   }

   private ak7 a(int var1, int var2, boolean var3) {
      return this.a(var1, var2, var3, false);
   }

   private ak7 a(int var1, int var2, boolean var3, boolean var4) {
      long var5 = (long)var1 + 2147483647L | (long)var2 + 2147483647L << 32;
      ak7 var7 = (ak7)this.try.int(var5);
      if (var7 == null && var3) {
         var7 = new ak7(this, var1, var2, var4);
         this.try.a(var5, var7);
      }

      return var7;
   }

   public void a(int var1, int var2, int var3) {
      int var4 = var1 >> 4;
      int var5 = var3 >> 4;
      ak7 var6 = this.a(var4, var5, false);
      if (var6 != null) {
         var6.a(var1 & 15, var2, var3 & 15);
      }

   }

   public void if(ak2 var1) {
      int var2 = (int)var1.al >> 4;
      int var3 = (int)var1.aj >> 4;
      var1.pS = var1.al;
      var1.pR = var1.aj;
      ArrayList var4 = new ArrayList(1);

      for(int var5 = var2 - this.int; var5 <= var2 + this.int; ++var5) {
         for(int var6 = var3 - this.int; var6 <= var3 + this.int; ++var6) {
            this.a(var5, var6, true).if(var1);
            if (var5 >= var2 - 1 && var5 <= var2 + 1 && var6 >= var3 - 1 && var6 <= var3 + 1) {
               xx var7 = this.if().T.if(var5, var6);
               var4.add(var7);
            }
         }
      }

      var1.pV.if((an7)(new aok(var4)));
      this.a.add(var1);
      this.a(var1);
   }

   public void a(ak2 var1) {
      ArrayList var2 = new ArrayList(var1.pQ);
      int var3 = 0;
      int var4 = this.int;
      int var5 = (int)var1.al >> 4;
      int var6 = (int)var1.aj >> 4;
      int var7 = 0;
      int var8 = 0;
      zi var9 = ak7.if(this.a(var5, var6, true));
      var1.pQ.clear();
      if (var2.contains(var9)) {
         var1.pQ.add(var9);
      }

      int var10;
      for(var10 = 1; var10 <= var4 * 2; ++var10) {
         for(int var11 = 0; var11 < 2; ++var11) {
            int[] var12 = this.for[var3++ % 4];

            for(int var13 = 0; var13 < var10; ++var13) {
               var7 += var12[0];
               var8 += var12[1];
               var9 = ak7.if(this.a(var5 + var7, var6 + var8, true));
               if (var2.contains(var9)) {
                  var1.pQ.add(var9);
               }
            }
         }
      }

      var3 %= 4;

      for(var10 = 0; var10 < var4 * 2; ++var10) {
         var7 += this.for[var3][0];
         var8 += this.for[var3][1];
         var9 = ak7.if(this.a(var5 + var7, var6 + var8, true));
         if (var2.contains(var9)) {
            var1.pQ.add(var9);
         }
      }

   }

   public void for(ak2 var1) {
      int var2 = (int)var1.pS >> 4;
      int var3 = (int)var1.pR >> 4;

      for(int var4 = var2 - this.int; var4 <= var2 + this.int; ++var4) {
         for(int var5 = var3 - this.int; var5 <= var3 + this.int; ++var5) {
            ak7 var6 = this.a(var4, var5, false);
            if (var6 != null) {
               var6.a(var1, false);
            }
         }
      }

      this.a.remove(var1);
   }

   private boolean a(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 - var3;
      int var7 = var2 - var4;
      return var6 >= -var5 && var6 <= var5 ? var7 >= -var5 && var7 <= var5 : false;
   }

   public void do(ak2 var1) {
      int var2 = (int)var1.al >> 4;
      int var3 = (int)var1.aj >> 4;
      double var4 = var1.pS - var1.al;
      double var6 = var1.pR - var1.aj;
      double var8 = var4 * var4 + var6 * var6;
      if (var8 >= 64.0D) {
         int var10 = (int)var1.pS >> 4;
         int var11 = (int)var1.pR >> 4;
         int var12 = this.int;
         int var13 = var2 - var10;
         int var14 = var3 - var11;
         if (var13 != 0 || var14 != 0) {
            for(int var15 = var2 - var12; var15 <= var2 + var12; ++var15) {
               for(int var16 = var3 - var12; var16 <= var3 + var12; ++var16) {
                  if (!this.a(var15, var16, var10, var11, var12)) {
                     this.a(var15, var16, true, true).if(var1);
                  }

                  if (!this.a(var15 - var13, var16 - var14, var2, var3, var12)) {
                     ak7 var17 = this.a(var15 - var13, var16 - var14, false);
                     if (var17 != null) {
                        var17.a(var1);
                     }
                  }
               }
            }

            this.a(var1);
            var1.pS = var1.al;
            var1.pR = var1.aj;
         }
      }

   }

   public boolean a(ak2 var1, int var2, int var3) {
      ak7 var4 = this.a(var2, var3, false);
      return var4 == null ? false : ak7.a(var4).contains(var1) && !var1.pQ.contains(ak7.if(var4));
   }

   public static int a(int var0) {
      return var0 * 16 - 16;
   }

   static ak5 a(ak8 var0) {
      return var0.if;
   }

   static ajv do(ak8 var0) {
      return var0.try;
   }

   static List if(ak8 var0) {
      return var0.new;
   }

   private void if(int var1) {
      if (this.int != var1) {
         ak2[] var2 = (ak2[])((ak2[])this.a.toArray(new ak2[this.a.size()]));

         int var3;
         ak2 var4;
         for(var3 = 0; var3 < var2.length; ++var3) {
            var4 = var2[var3];
            this.for(var4);
         }

         this.int = var1;

         for(var3 = 0; var3 < var2.length; ++var3) {
            var4 = var2[var3];
            this.if(var4);
         }

         qs.for("ViewRadius: " + this.int + ", for: " + this + " (detect)");
      }
   }
}
