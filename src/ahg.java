public class ahg extends ahk {
   aig aW;
   aig aV;
   float aX;

   public ahg(aig var1, float var2) {
      this.aW = var1;
      this.aX = var2;
      this.a(5);
   }

   public boolean do() {
      this.aV = this.aW.bB();
      if (this.aV == null) {
         return false;
      } else {
         double var1 = this.aW.for((aiw)this.aV);
         if (!(var1 < 4.0D) && !(var1 > 16.0D)) {
            if (!this.aW.aY) {
               return false;
            } else {
               return this.aW.bq().nextInt(5) == 0;
            }
         } else {
            return false;
         }
      }
   }

   public boolean try() {
      return !this.aW.aY;
   }

   public void a() {
      double var1 = this.aV.al - this.aW.al;
      double var3 = this.aV.aj - this.aW.aj;
      float var5 = ajs.int(var1 * var1 + var3 * var3);
      aig var10000 = this.aW;
      var10000.ai += var1 / (double)var5 * 0.5D * 0.800000011920929D + this.aW.ai * 0.20000000298023224D;
      var10000 = this.aW;
      var10000.ag += var3 / (double)var5 * 0.5D * 0.800000011920929D + this.aW.ag * 0.20000000298023224D;
      this.aW.ah = (double)this.aX;
   }
}
