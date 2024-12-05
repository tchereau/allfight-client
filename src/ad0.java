public class ad0 extends ad1 {
   private oo M;
   private final adz Q;
   private int P;
   private int O;
   private int N;

   public ad0(aen var1, oo var2) {
      this.M = var2;
      this.if(this.Q = new adz(this, var2, 0, 136, 110));
      byte var3 = 36;
      short var4 = 137;

      int var5;
      for(var5 = 0; var5 < 3; ++var5) {
         for(int var6 = 0; var6 < 9; ++var6) {
            this.if(new ac9(var1, var6 + var5 * 9 + 9, var3 + var6 * 18, var4 + var5 * 18));
         }
      }

      for(var5 = 0; var5 < 9; ++var5) {
         this.if(new ac9(var1, var5, var3 + var5 * 18, 58 + var4));
      }

      this.P = var2.B();
      this.O = var2.y();
      this.N = var2.z();
   }

   public void a(adv var1) {
      super.a(var1);
      var1.a(this, 0, this.P);
      var1.a(this, 1, this.O);
      var1.a(this, 2, this.N);
   }

   public void do() {
      super.do();
   }

   public void a(int var1, int var2) {
      if (var1 == 0) {
         this.M.int(var2);
      }

      if (var1 == 1) {
         this.M.for(var2);
      }

      if (var1 == 2) {
         this.M.new(var2);
      }

   }

   public oo try() {
      return this.M;
   }

   public boolean do(aek var1) {
      return this.M.a(var1);
   }

   public abp if(aek var1, int var2) {
      abp var3 = null;
      ac9 var4 = (ac9)this.try.get(var2);
      if (var4 != null && var4.do()) {
         abp var5 = var4.for();
         var3 = var5.n();
         if (var2 == 0) {
            if (!this.a(var5, 1, 37, true)) {
               return null;
            }

            var4.a(var5, var3);
         } else if (!this.Q.do() && this.Q.if(var5) && var5.if == 1) {
            if (!this.a(var5, 0, 1, false)) {
               return null;
            }
         } else if (var2 >= 1 && var2 < 28) {
            if (!this.a(var5, 28, 37, false)) {
               return null;
            }
         } else if (var2 >= 28 && var2 < 37) {
            if (!this.a(var5, 1, 28, false)) {
               return null;
            }
         } else if (!this.a(var5, 1, 37, false)) {
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
