public class ae8 extends aeu {
   public ae8(y6 var1) {
      super(var1);
      this.ft = "/mob/cavespider.png";
      this.if(0.7F, 0.5F);
   }

   public int b0() {
      return 12;
   }

   public float fj() {
      return 0.7F;
   }

   public boolean long(aiw var1) {
      if (super.long(var1)) {
         if (var1 instanceof aig) {
            byte var2 = 0;
            if (this.ap.p > 1) {
               if (this.ap.p == 2) {
                  var2 = 7;
               } else if (this.ap.p == 3) {
                  var2 = 15;
               }
            }

            if (var2 > 0) {
               ((aig)var1).for(new aiz(ai0.g.try, var2 * 20, 0));
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void bO() {
   }
}
