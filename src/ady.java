public class ady extends ad1 {
   private on J;
   private final ac9 L;
   private int K = 0;

   public ady(aen var1, on var2) {
      this.J = var2;
      this.if(new adw(var1.Z, var2, 0, 56, 46));
      this.if(new adw(var1.Z, var2, 1, 79, 53));
      this.if(new adw(var1.Z, var2, 2, 102, 46));
      this.L = this.if(new adx(this, var2, 3, 79, 17));

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
      var1.a(this, 0, this.J.gw());
   }

   public void do() {
      super.do();

      for(int var1 = 0; var1 < this.int.size(); ++var1) {
         adv var2 = (adv)this.int.get(var1);
         if (this.K != this.J.gw()) {
            var2.a(this, 0, this.J.gw());
         }
      }

      this.K = this.J.gw();
   }

   public void a(int var1, int var2) {
      if (var1 == 0) {
         this.J.aO(var2);
      }

   }

   public boolean do(aek var1) {
      return this.J.a(var1);
   }

   public abp if(aek var1, int var2) {
      abp var3 = null;
      ac9 var4 = (ac9)this.try.get(var2);
      if (var4 != null && var4.do()) {
         abp var5 = var4.for();
         var3 = var5.n();
         if ((var2 < 0 || var2 > 2) && var2 != 3) {
            if (!this.L.do() && this.L.if(var5)) {
               if (!this.a(var5, 3, 4, false)) {
                  return null;
               }
            } else if (adw.for(var3)) {
               if (!this.a(var5, 0, 3, false)) {
                  return null;
               }
            } else if (var2 >= 4 && var2 < 31) {
               if (!this.a(var5, 31, 40, false)) {
                  return null;
               }
            } else if (var2 >= 31 && var2 < 40) {
               if (!this.a(var5, 4, 31, false)) {
                  return null;
               }
            } else if (!this.a(var5, 4, 40, false)) {
               return null;
            }
         } else {
            if (!this.a(var5, 4, 40, true)) {
               return null;
            }

            var4.a(var5, var3);
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
