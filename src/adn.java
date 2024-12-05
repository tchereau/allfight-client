public class adn extends ac9 {
   private aek h;
   private int g;

   public adn(aek var1, ajg var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.h = var1;
   }

   public boolean if(abp var1) {
      return false;
   }

   public abp a(int var1) {
      if (this.do()) {
         this.g += Math.min(var1, this.for().if);
      }

      return super.a(var1);
   }

   public void a(aek var1, abp var2) {
      this.do(var2);
      super.a(var1, var2);
   }

   protected void a(abp var1, int var2) {
      this.g += var2;
      this.do(var1);
   }

   protected void do(abp var1) {
      var1.if(this.h.ap, this.h, this.g);
      ModLoader.a(this.h, var1);
      if (!this.h.ap.goto) {
         int var2 = this.g;
         float var3 = aam.if().if(var1.new);
         int var4;
         if (var3 == 0.0F) {
            var2 = 0;
         } else if (var3 < 1.0F) {
            var4 = ajs.new((float)var2 * var3);
            if (var4 < ajs.a((float)var2 * var3) && (float)Math.random() < (float)var2 * var3 - (float)var4) {
               ++var4;
            }

            var2 = var4;
         }

         while(var2 > 0) {
            var4 = aik.aC(var2);
            var2 -= var4;
            this.h.ap.new(new aik(this.h.ap, this.h.al, this.h.ak + 0.5D, this.h.aj + 0.5D, var4));
         }
      }

      this.g = 0;
      if (var1.new == abr.N.A) {
         this.h.a((akf)akk.i, 1);
      }

      if (var1.new == abr.ca.A) {
         this.h.a((akf)akk.d, 1);
      }

   }
}
