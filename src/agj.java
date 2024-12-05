public class agj {
   private aig long;
   private y6 goto;
   private s5 else;
   private float char;
   private float case;
   private boolean byte = false;
   private int try;
   private int new;
   private nr int = nr.do(0.0D, 0.0D, 0.0D);
   private boolean for = true;
   private boolean do = false;
   private boolean if = false;
   private boolean a = false;

   public agj(aig var1, y6 var2, float var3) {
      this.long = var1;
      this.goto = var2;
      this.case = var3;
   }

   public void for(boolean var1) {
      this.if = var1;
   }

   public boolean char() {
      return this.if;
   }

   public void if(boolean var1) {
      this.do = var1;
   }

   public void int(boolean var1) {
      this.for = var1;
   }

   public boolean goto() {
      return this.do;
   }

   public void do(boolean var1) {
      this.byte = var1;
   }

   public void a(float var1) {
      this.char = var1;
   }

   public void a(boolean var1) {
      this.a = var1;
   }

   public s5 a(double var1, double var3, double var5) {
      return !this.if() ? null : this.goto.a(this.long, ajs.a(var1), (int)var3, ajs.a(var5), this.case, this.for, this.do, this.if, this.a);
   }

   public boolean a(double var1, double var3, double var5, float var7) {
      s5 var8 = this.a((double)ajs.a(var1), (double)((int)var3), (double)ajs.a(var5));
      return this.a(var8, var7);
   }

   public s5 a(aig var1) {
      return !this.if() ? null : this.goto.a(this.long, var1, this.case, this.for, this.do, this.if, this.a);
   }

   public boolean a(aig var1, float var2) {
      s5 var3 = this.a(var1);
      return var3 != null ? this.a(var3, var2) : false;
   }

   public boolean a(s5 var1, float var2) {
      if (var1 == null) {
         this.else = null;
         return false;
      } else {
         if (!var1.a(this.else)) {
            this.else = var1;
         }

         if (this.byte) {
            this.byte();
         }

         if (this.else.a() == 0) {
            return false;
         } else {
            this.char = var2;
            nr var3 = this.try();
            this.new = this.try;
            this.int.int = var3.int;
            this.int.for = var3.for;
            this.int.do = var3.do;
            return true;
         }
      }
   }

   public s5 a() {
      return this.else;
   }

   public void for() {
      ++this.try;
      if (!this.new()) {
         if (this.if()) {
            this.else();
         }

         if (!this.new()) {
            nr var1 = this.else.a((aiw)this.long);
            if (var1 != null) {
               this.long.ch().a(var1.int, var1.for, var1.do, this.char);
            }
         }
      }
   }

   private void else() {
      nr var1 = this.try();
      int var2 = this.else.a();

      for(int var3 = this.else.for(); var3 < this.else.a(); ++var3) {
         if (this.else.a(var3).case != (int)var1.for) {
            var2 = var3;
            break;
         }
      }

      float var8 = this.long.aP * this.long.aP;

      int var4;
      for(var4 = this.else.for(); var4 < var2; ++var4) {
         if (var1.for(this.else.a(this.long, var4)) < (double)var8) {
            this.else.if(var4 + 1);
         }
      }

      var4 = ajs.a(this.long.aP);
      int var5 = (int)this.long.aO + 1;
      int var6 = var4;

      for(int var7 = var2 - 1; var7 >= this.else.for(); --var7) {
         if (this.a(var1, this.else.a(this.long, var7), var4, var5, var6)) {
            this.else.if(var7);
            break;
         }
      }

      if (this.try - this.new > 100) {
         if (var1.for(this.int) < 2.25D) {
            this.case();
         }

         this.new = this.try;
         this.int.int = var1.int;
         this.int.for = var1.for;
         this.int.do = var1.do;
      }

   }

   public boolean new() {
      return this.else == null || this.else.int();
   }

   public void case() {
      this.else = null;
   }

   private nr try() {
      return this.goto.do().a(this.long.al, (double)this.int(), this.long.aj);
   }

   private int int() {
      if (this.long.ap() && this.a) {
         int var1 = (int)this.long.aZ.a;
         int var2 = this.goto.new(ajs.a(this.long.al), var1, ajs.a(this.long.aj));
         int var3 = 0;

         do {
            if (var2 != pa.bb.void && var2 != pa.ba.void) {
               return var1;
            }

            ++var1;
            var2 = this.goto.new(ajs.a(this.long.al), var1, ajs.a(this.long.aj));
            ++var3;
         } while(var3 <= 16);

         return (int)this.long.aZ.a;
      } else {
         return (int)(this.long.aZ.a + 0.5D);
      }
   }

   private boolean if() {
      return this.long.aY || this.a && this.do();
   }

   private boolean do() {
      return this.long.ap() || this.long.ar();
   }

   private void byte() {
      if (!this.goto.j(ajs.a(this.long.al), (int)(this.long.aZ.a + 0.5D), ajs.a(this.long.aj))) {
         for(int var1 = 0; var1 < this.else.a(); ++var1) {
            s6 var2 = this.else.a(var1);
            if (this.goto.j(var2.char, var2.case, var2.byte)) {
               this.else.do(var1 - 1);
               return;
            }
         }

      }
   }

   private boolean a(nr var1, nr var2, int var3, int var4, int var5) {
      int var6 = ajs.a(var1.int);
      int var7 = ajs.a(var1.do);
      double var8 = var2.int - var1.int;
      double var10 = var2.do - var1.do;
      double var12 = var8 * var8 + var10 * var10;
      if (var12 < 1.0E-8D) {
         return false;
      } else {
         double var14 = 1.0D / Math.sqrt(var12);
         var8 *= var14;
         var10 *= var14;
         var3 += 2;
         var5 += 2;
         if (!this.a(var6, (int)var1.for, var7, var3, var4, var5, var1, var8, var10)) {
            return false;
         } else {
            var3 -= 2;
            var5 -= 2;
            double var16 = 1.0D / Math.abs(var8);
            double var18 = 1.0D / Math.abs(var10);
            double var20 = (double)(var6 * 1) - var1.int;
            double var22 = (double)(var7 * 1) - var1.do;
            if (var8 >= 0.0D) {
               ++var20;
            }

            if (var10 >= 0.0D) {
               ++var22;
            }

            var20 /= var8;
            var22 /= var10;
            int var24 = var8 < 0.0D ? -1 : 1;
            int var25 = var10 < 0.0D ? -1 : 1;
            int var26 = ajs.a(var2.int);
            int var27 = ajs.a(var2.do);
            int var28 = var26 - var6;
            int var29 = var27 - var7;

            do {
               if (var28 * var24 <= 0 && var29 * var25 <= 0) {
                  return true;
               }

               if (var20 < var22) {
                  var20 += var16;
                  var6 += var24;
                  var28 = var26 - var6;
               } else {
                  var22 += var18;
                  var7 += var25;
                  var29 = var27 - var7;
               }
            } while(this.a(var6, (int)var1.for, var7, var3, var4, var5, var1, var8, var10));

            return false;
         }
      }
   }

   private boolean a(int var1, int var2, int var3, int var4, int var5, int var6, nr var7, double var8, double var10) {
      int var12 = var1 - var4 / 2;
      int var13 = var3 - var6 / 2;
      if (!this.if(var12, var2, var13, var4, var5, var6, var7, var8, var10)) {
         return false;
      } else {
         for(int var14 = var12; var14 < var12 + var4; ++var14) {
            for(int var15 = var13; var15 < var13 + var6; ++var15) {
               double var16 = (double)var14 + 0.5D - var7.int;
               double var18 = (double)var15 + 0.5D - var7.do;
               if (!(var16 * var8 + var18 * var10 < 0.0D)) {
                  int var20 = this.goto.new(var14, var2 - 1, var15);
                  if (var20 <= 0) {
                     return false;
                  }

                  ts var21 = pa.x[var20].at;
                  if (var21 == ts.s && !this.long.ap()) {
                     return false;
                  }

                  if (var21 == ts.r) {
                     return false;
                  }
               }
            }
         }

         return true;
      }
   }

   private boolean if(int var1, int var2, int var3, int var4, int var5, int var6, nr var7, double var8, double var10) {
      for(int var12 = var1; var12 < var1 + var4; ++var12) {
         for(int var13 = var2; var13 < var2 + var5; ++var13) {
            for(int var14 = var3; var14 < var3 + var6; ++var14) {
               double var15 = (double)var12 + 0.5D - var7.int;
               double var17 = (double)var14 + 0.5D - var7.do;
               if (!(var15 * var8 + var17 * var10 < 0.0D)) {
                  int var19 = this.goto.new(var12, var13, var14);
                  if (var19 > 0 && !pa.x[var19].a((yy)this.goto, var12, var13, var14)) {
                     return false;
                  }
               }
            }
         }
      }

      return true;
   }
}
