public class oe extends n4 implements ai7 {
   private static final int[] sG = new int[]{0};
   private static final int[] sF = new int[]{2, 1};
   private static final int[] sE = new int[]{1};
   private abp[] sD = new abp[3];
   public int sB = 0;
   public int sA = 0;
   public int sH = 0;
   private String sC;

   public int r() {
      return this.sD.length;
   }

   public abp do(int var1) {
      return this.sD[var1];
   }

   public abp if(int var1, int var2) {
      if (this.sD[var1] != null) {
         abp var3;
         if (this.sD[var1].if <= var2) {
            var3 = this.sD[var1];
            this.sD[var1] = null;
            return var3;
         } else {
            var3 = this.sD[var1].a(var2);
            if (this.sD[var1].if == 0) {
               this.sD[var1] = null;
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public abp if(int var1) {
      if (this.sD[var1] != null) {
         abp var2 = this.sD[var1];
         this.sD[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void if(int var1, abp var2) {
      this.sD[var1] = var2;
      if (var2 != null && var2.if > this.q()) {
         var2.if = this.q();
      }

   }

   public String t() {
      return this.s() ? this.sC : "container.furnace";
   }

   public boolean s() {
      return this.sC != null && this.sC.length() > 0;
   }

   public void A(String var1) {
      this.sC = var1;
   }

   public void a(aqv var1) {
      super.a(var1);
      aqm var2 = var1.void("Items");
      this.sD = new abp[this.r()];

      for(int var3 = 0; var3 < var2.for(); ++var3) {
         aqv var4 = (aqv)var2.a(var3);
         byte var5 = var4.else("Slot");
         if (var5 >= 0 && var5 < this.sD.length) {
            this.sD[var5] = abp.for(var4);
         }
      }

      this.sB = var1.case("BurnTime");
      this.sH = var1.case("CookTime");
      this.sA = b(this.sD[1]);
      if (var1.try("CustomName")) {
         this.sC = var1.new("CustomName");
      }

   }

   public void do(aqv var1) {
      super.do(var1);
      var1.a("BurnTime", (short)this.sB);
      var1.a("CookTime", (short)this.sH);
      aqm var2 = new aqm();

      for(int var3 = 0; var3 < this.sD.length; ++var3) {
         if (this.sD[var3] != null) {
            aqv var4 = new aqv();
            var4.a("Slot", (byte)var3);
            this.sD[var3].if(var4);
            var2.a((aqd)var4);
         }
      }

      var1.a("Items", (aqd)var2);
      if (this.s()) {
         var1.a("CustomName", this.sC);
      }

   }

   public int q() {
      return 64;
   }

   public int aN(int var1) {
      return this.sH * var1 / 200;
   }

   public int aM(int var1) {
      if (this.sA == 0) {
         this.sA = 200;
      }

      return this.sB * var1 / this.sA;
   }

   public boolean gs() {
      return this.sB > 0;
   }

   public void long() {
      boolean var1 = this.sB > 0;
      boolean var2 = false;
      if (this.sB > 0) {
         --this.sB;
      }

      if (!this.try.goto) {
         if (this.sB == 0 && this.gr()) {
            this.sA = this.sB = b(this.sD[1]);
            if (this.sB > 0) {
               var2 = true;
               if (this.sD[1] != null) {
                  --this.sD[1].if;
                  if (this.sD[1].if == 0) {
                     abr var3 = this.sD[1].d().case();
                     this.sD[1] = var3 != null ? new abp(var3) : null;
                  }
               }
            }
         }

         if (this.gs() && this.gr()) {
            ++this.sH;
            if (this.sH == 200) {
               this.sH = 0;
               this.gq();
               var2 = true;
            }
         } else {
            this.sH = 0;
         }

         if (var1 != this.sB > 0) {
            var2 = true;
            q5.a(this.sB > 0, this.try, this.new, this.int, this.for);
         }
      }

      if (var2) {
         this.case();
      }

   }

   private boolean gr() {
      if (this.sD[0] == null) {
         return false;
      } else {
         abp var1 = aam.if().a(this.sD[0].d().A);
         return var1 == null ? false : (this.sD[2] == null ? true : (!this.sD[2].do(var1) ? false : (this.sD[2].if < this.q() && this.sD[2].if < this.sD[2].h() ? true : this.sD[2].if < var1.h())));
      }
   }

   public void gq() {
      if (this.gr()) {
         abp var1 = aam.if().a(this.sD[0].d().A);
         if (this.sD[2] == null) {
            this.sD[2] = var1.n();
         } else if (this.sD[2].new == var1.new) {
            ++this.sD[2].if;
         }

         --this.sD[0].if;
         if (this.sD[0].if <= 0) {
            abr var2 = this.sD[0].d().case();
            this.sD[0] = var2 != null ? new abp(var2) : null;
         }
      }

   }

   public static int b(abp var0) {
      if (var0 == null) {
         return 0;
      } else {
         int var1 = var0.d().A;
         abr var2 = var0.d();
         if (var1 < 256 && pa.x[var1] != null) {
            pa var3 = pa.x[var1];
            if (var3 == pa.bw) {
               return 150;
            }

            if (var3.at == ts.w) {
               return 300;
            }
         }

         return var2 instanceof aca && ((aca)var2).x().equals("WOOD") ? 200 : (var2 instanceof aav && ((aav)var2).l().equals("WOOD") ? 200 : (var2 instanceof abs && ((abs)var2).r().equals("WOOD") ? 200 : (var1 == abr.a9.A ? 100 : (var1 == abr.R.A ? 1600 : (var1 == abr.be.A ? 20000 : (var1 == pa.bd.void ? 100 : (var1 == abr.aD.A ? 2400 : ModLoader.a(var0.new, var0.new()))))))));
      }
   }

   public static boolean c(abp var0) {
      return b(var0) > 0;
   }

   public boolean a(aek var1) {
      return this.try.if(this.new, this.int, this.for) != this ? false : var1.if((double)this.new + 0.5D, (double)this.int + 0.5D, (double)this.for + 0.5D) <= 64.0D;
   }

   public void p() {
   }

   public void u() {
   }

   public boolean a(int var1, abp var2) {
      return var1 == 2 ? false : (var1 == 1 ? c(var2) : true);
   }

   public int[] aL(int var1) {
      return var1 == 0 ? sF : (var1 == 1 ? sG : sE);
   }

   public boolean a(int var1, abp var2, int var3) {
      return this.a(var1, var2);
   }

   public boolean if(int var1, abp var2, int var3) {
      return var3 != 0 || var1 != 1 || var2.new == abr.bi.A;
   }
}
