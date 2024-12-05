public class adh extends ad1 {
   private zn h;
   private adi j;
   private final y6 i;

   public adh(aen var1, zn var2, y6 var3) {
      this.h = var2;
      this.i = var3;
      this.j = new adi(var1.Z, var2);
      this.if((ac9)(new ac9(this.j, 0, 36, 53)));
      this.if((ac9)(new ac9(this.j, 1, 62, 53)));
      this.if((ac9)(new adg(var1.Z, var2, this.j, 2, 120, 53)));

      int var4;
      for(var4 = 0; var4 < 3; ++var4) {
         for(int var5 = 0; var5 < 9; ++var5) {
            this.if((ac9)(new ac9(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18)));
         }
      }

      for(var4 = 0; var4 < 9; ++var4) {
         this.if((ac9)(new ac9(var1, var4, 8 + var4 * 18, 142)));
      }

   }

   public adi int() {
      return this.j;
   }

   public void a(adv var1) {
      super.a(var1);
   }

   public void do() {
      super.do();
   }

   public void if(ajg var1) {
      this.j.F();
      super.if(var1);
   }

   public void int(int var1) {
      this.j.byte(var1);
   }

   public void a(int var1, int var2) {
   }

   public boolean do(aek var1) {
      return this.h.fJ() == var1;
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
            if (var2 >= 3 && var2 < 30) {
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

   public void if(aek var1) {
      super.if(var1);
      this.h.case((aek)null);
      super.if(var1);
      if (!this.i.goto) {
         abp var2 = this.j.if(0);
         if (var2 != null) {
            var1.else(var2);
         }

         var2 = this.j.if(1);
         if (var2 != null) {
            var1.else(var2);
         }

      }
   }
}
