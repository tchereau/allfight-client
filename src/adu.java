public class adu extends ad1 {
   private ajg H;
   private int I;

   public adu(ajg var1, ajg var2) {
      this.H = var2;
      this.I = var2.r() / 9;
      var2.p();
      int var3 = (this.I - 4) * 18;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.I; ++var4) {
         for(var5 = 0; var5 < 9; ++var5) {
            this.if(new ac9(var2, var5 + var4 * 9, 8 + var5 * 18, 18 + var4 * 18));
         }
      }

      for(var4 = 0; var4 < 3; ++var4) {
         for(var5 = 0; var5 < 9; ++var5) {
            this.if(new ac9(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, 103 + var4 * 18 + var3));
         }
      }

      for(var4 = 0; var4 < 9; ++var4) {
         this.if(new ac9(var1, var4, 8 + var4 * 18, 161 + var3));
      }

   }

   public boolean do(aek var1) {
      return this.H.a(var1);
   }

   public abp if(aek var1, int var2) {
      abp var3 = null;
      ac9 var4 = (ac9)this.try.get(var2);
      if (var4 != null && var4.do()) {
         abp var5 = var4.for();
         var3 = var5.n();
         if (var2 < this.I * 9) {
            if (!this.a(var5, this.I * 9, this.try.size(), true)) {
               return null;
            }
         } else if (!this.a(var5, 0, this.I * 9, false)) {
            return null;
         }

         if (var5.if == 0) {
            var4.a((abp)null);
         } else {
            var4.if();
         }
      }

      return var3;
   }

   public void if(aek var1) {
      super.if(var1);
      this.H.u();
   }

   public ajg new() {
      return this.H;
   }
}
