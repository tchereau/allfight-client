public class adm extends ad1 {
   private final ajg o;

   public adm(aen var1, ajg var2) {
      this.o = var2;
      var2.p();
      byte var3 = 51;

      int var4;
      for(var4 = 0; var4 < var2.r(); ++var4) {
         this.if(new ac9(var2, var4, 44 + var4 * 18, 20));
      }

      for(var4 = 0; var4 < 3; ++var4) {
         for(int var5 = 0; var5 < 9; ++var5) {
            this.if(new ac9(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, var4 * 18 + var3));
         }
      }

      for(var4 = 0; var4 < 9; ++var4) {
         this.if(new ac9(var1, var4, 8 + var4 * 18, 58 + var3));
      }

   }

   public boolean do(aek var1) {
      return this.o.a(var1);
   }

   public abp if(aek var1, int var2) {
      abp var3 = null;
      ac9 var4 = (ac9)this.try.get(var2);
      if (var4 != null && var4.do()) {
         abp var5 = var4.for();
         var3 = var5.n();
         if (var2 < this.o.r()) {
            if (!this.a(var5, this.o.r(), this.try.size(), true)) {
               return null;
            }
         } else if (!this.a(var5, 0, this.o.r(), false)) {
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
      this.o.u();
   }
}
