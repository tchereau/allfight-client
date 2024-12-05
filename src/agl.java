public class agl extends agk {
   ah2 b4;
   aig b3;

   public agl(ah2 var1) {
      super(var1, 32.0F, false);
      this.b4 = var1;
      this.a(1);
   }

   public boolean do() {
      if (!this.b4.fy()) {
         return false;
      } else {
         aig var1 = this.b4.fC();
         if (var1 == null) {
            return false;
         } else {
            this.b3 = var1.bF();
            return this.a(this.b3, false);
         }
      }
   }

   public void a() {
      this.b1.do(this.b3);
      super.a();
   }
}
