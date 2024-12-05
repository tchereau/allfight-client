public class adl extends ad1 {
   public adt k = new adt(this, 2, 2);
   public ajg n = new adb();
   public boolean m = false;
   private final aek l;

   public adl(aen var1, boolean var2, aek var3) {
      this.m = var2;
      this.l = var3;
      this.if((ac9)(new ada(var1.Z, this.k, this.n, 0, 144, 36)));

      int var4;
      int var5;
      for(var4 = 0; var4 < 2; ++var4) {
         for(var5 = 0; var5 < 2; ++var5) {
            this.if((ac9)(new ac9(this.k, var5 + var4 * 2, 88 + var5 * 18, 26 + var4 * 18)));
         }
      }

      for(var4 = 0; var4 < 4; ++var4) {
         this.if((ac9)(new adj(this, var1, var1.r() - 1 - var4, 8, 8 + var4 * 18, var4)));
      }

      for(var4 = 0; var4 < 3; ++var4) {
         for(var5 = 0; var5 < 9; ++var5) {
            this.if((ac9)(new ac9(var1, var5 + (var4 + 1) * 9, 8 + var5 * 18, 84 + var4 * 18)));
         }
      }

      for(var4 = 0; var4 < 9; ++var4) {
         this.if((ac9)(new ac9(var1, var4, 8 + var4 * 18, 142)));
      }

      this.if((ajg)this.k);
   }

   public void if(ajg var1) {
      this.n.if(0, aai.if().a(this.k, this.l.ap));
   }

   public void if(aek var1) {
      super.if(var1);

      for(int var2 = 0; var2 < 4; ++var2) {
         abp var3 = this.k.if(var2);
         if (var3 != null) {
            var1.else(var3);
         }
      }

      this.n.if(0, (abp)null);
   }

   public boolean do(aek var1) {
      return true;
   }

   public abp if(aek var1, int var2) {
      abp var3 = null;
      ac9 var4 = (ac9)this.try.get(var2);
      if (var4 != null && var4.do()) {
         abp var5 = var4.for();
         var3 = var5.n();
         if (var2 == 0) {
            if (!this.a(var5, 9, 45, true)) {
               return null;
            }

            var4.a(var5, var3);
         } else if (var2 >= 1 && var2 < 5) {
            if (!this.a(var5, 9, 45, false)) {
               return null;
            }
         } else if (var2 >= 5 && var2 < 9) {
            if (!this.a(var5, 9, 45, false)) {
               return null;
            }
         } else if (var3.d() instanceof ac4 && !((ac9)this.try.get(5 + ((ac4)var3.d()).dV)).do()) {
            int var6 = 5 + ((ac4)var3.d()).dV;
            if (!this.a(var5, var6, var6 + 1, false)) {
               return null;
            }
         } else if (var2 >= 9 && var2 < 36) {
            if (!this.a(var5, 36, 45, false)) {
               return null;
            }
         } else if (var2 >= 36 && var2 < 45) {
            if (!this.a(var5, 9, 36, false)) {
               return null;
            }
         } else if (!this.a(var5, 9, 45, false)) {
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

   public boolean a(abp var1, ac9 var2) {
      return var2.int != this.n && super.a(var1, var2);
   }
}
