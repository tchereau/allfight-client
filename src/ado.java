public class ado extends ad1 {
   private oe p;
   private int s = 0;
   private int r = 0;
   private int q = 0;

   public ado(aen var1, oe var2) {
      this.p = var2;
      this.if(new ac9(var2, 0, 56, 17));
      this.if(new ac9(var2, 1, 56, 53));
      this.if(new adn(var1.Z, var2, 2, 116, 35));

      int var3;
      for(var3 = 0; var3 < 3; ++var3) {
         for(int var4 = 0; var4 < 9; ++var4) {
            this.if(new ac9(var1, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 9; ++var3) {
         this.if(new ac9(var1, var3, 8 + var3 * 18, 142));
      }

   }

   public void a(adv var1) {
      super.a(var1);
      var1.a(this, 0, this.p.sH);
      var1.a(this, 1, this.p.sB);
      var1.a(this, 2, this.p.sA);
   }

   public void do() {
      super.do();

      for(int var1 = 0; var1 < this.int.size(); ++var1) {
         adv var2 = (adv)this.int.get(var1);
         if (this.s != this.p.sH) {
            var2.a(this, 0, this.p.sH);
         }

         if (this.r != this.p.sB) {
            var2.a(this, 1, this.p.sB);
         }

         if (this.q != this.p.sA) {
            var2.a(this, 2, this.p.sA);
         }
      }

      this.s = this.p.sH;
      this.r = this.p.sB;
      this.q = this.p.sA;
   }

   public void a(int var1, int var2) {
      if (var1 == 0) {
         this.p.sH = var2;
      }

      if (var1 == 1) {
         this.p.sB = var2;
      }

      if (var1 == 2) {
         this.p.sA = var2;
      }

   }

   public boolean do(aek var1) {
      return this.p.a(var1);
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
         } else if (var2 != 1 && var2 != 0) {
            if (aam.if().a(var5.d().A) != null) {
               if (!this.a(var5, 0, 1, false)) {
                  return null;
               }
            } else if (oe.c(var5)) {
               if (!this.a(var5, 1, 2, false)) {
                  return null;
               }
            } else if (var2 >= 3 && var2 < 30) {
               if (!this.a(var5, 30, 39, false)) {
                  return null;
               }
            } else if (var2 >= 30 && var2 < 39 && !this.a(var5, 3, 30, false)) {
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
}
