public class ads extends ad1 {
   public adt B = new adt(this, 3, 3);
   public ajg G = new adb();
   private y6 F;
   private int E;
   private int D;
   private int C;

   public ads(aen var1, y6 var2, int var3, int var4, int var5) {
      this.F = var2;
      this.E = var3;
      this.D = var4;
      this.C = var5;
      this.if((ac9)(new ada(var1.Z, this.B, this.G, 0, 124, 35)));

      int var6;
      int var7;
      for(var6 = 0; var6 < 3; ++var6) {
         for(var7 = 0; var7 < 3; ++var7) {
            this.if((ac9)(new ac9(this.B, var7 + var6 * 3, 30 + var7 * 18, 17 + var6 * 18)));
         }
      }

      for(var6 = 0; var6 < 3; ++var6) {
         for(var7 = 0; var7 < 9; ++var7) {
            this.if((ac9)(new ac9(var1, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18)));
         }
      }

      for(var6 = 0; var6 < 9; ++var6) {
         this.if((ac9)(new ac9(var1, var6, 8 + var6 * 18, 142)));
      }

      this.if((ajg)this.B);
   }

   public void if(ajg var1) {
      this.G.if(0, aai.if().a(this.B, this.F));
   }

   public void if(aek var1) {
      super.if(var1);
      if (!this.F.goto) {
         for(int var2 = 0; var2 < 9; ++var2) {
            abp var3 = this.B.if(var2);
            if (var3 != null) {
               var1.else(var3);
            }
         }

      }
   }

   public boolean do(aek var1) {
      if (this.F.new(this.E, this.D, this.C) != pa.cu.void) {
         return false;
      } else {
         return !(var1.if((double)this.E + 0.5D, (double)this.D + 0.5D, (double)this.C + 0.5D) > 64.0D);
      }
   }

   public abp if(aek var1, int var2) {
      abp var3 = null;
      ac9 var4 = (ac9)this.try.get(var2);
      if (var4 != null && var4.do()) {
         abp var5 = var4.for();
         var3 = var5.n();
         if (var2 == 0) {
            if (!this.a(var5, 10, 46, true)) {
               return null;
            }

            var4.a(var5, var3);
         } else if (var2 >= 10 && var2 < 37) {
            if (!this.a(var5, 37, 46, false)) {
               return null;
            }
         } else if (var2 >= 37 && var2 < 46) {
            if (!this.a(var5, 10, 37, false)) {
               return null;
            }
         } else if (!this.a(var5, 10, 46, false)) {
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
      return var2.int != this.G && super.a(var1, var2);
   }
}
