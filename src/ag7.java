public class ag7 extends ahk {
   y6 ab;
   aig aa;
   aig ad;
   int ac = 0;

   public ag7(aig var1) {
      this.aa = var1;
      this.ab = var1.ap;
      this.a(3);
   }

   public boolean do() {
      aig var1 = this.aa.bB();
      if (var1 == null) {
         return false;
      } else {
         this.ad = var1;
         return true;
      }
   }

   public boolean try() {
      if (!this.ad.aA()) {
         return false;
      } else if (this.aa.for((aiw)this.ad) > 225.0D) {
         return false;
      } else {
         return !this.aa.bl().new() || this.do();
      }
   }

   public void new() {
      this.ad = null;
      this.aa.bl().case();
   }

   public void int() {
      this.aa.b9().a(this.ad, 30.0F, 30.0F);
      double var1 = (double)(this.aa.aP * 2.0F * this.aa.aP * 2.0F);
      double var3 = this.aa.if(this.ad.al, this.ad.aZ.a, this.ad.aj);
      float var5 = 0.23F;
      if (var3 > var1 && var3 < 16.0D) {
         var5 = 0.4F;
      } else if (var3 < 225.0D) {
         var5 = 0.18F;
      }

      this.aa.bl().a(this.ad, var5);
      this.ac = Math.max(this.ac - 1, 0);
      if (!(var3 > var1)) {
         if (this.ac <= 0) {
            this.ac = 20;
            this.aa.long(this.ad);
         }
      }
   }
}
