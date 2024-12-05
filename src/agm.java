public class agm extends agk {
   ah2 b6;
   aig b5;

   public agm(ah2 var1) {
      super(var1, 32.0F, false);
      this.b6 = var1;
      this.a(1);
   }

   public boolean do() {
      if (!this.b6.fy()) {
         return false;
      } else {
         aig var1 = this.b6.fC();
         if (var1 == null) {
            return false;
         } else {
            this.b5 = var1.bD();
            return this.a(this.b5, false);
         }
      }
   }

   public void a() {
      this.b1.do(this.b5);
      super.a();
   }
}
