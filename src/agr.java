public class agr extends agk {
   afy cg;
   aig cf;

   public agr(afy var1) {
      super(var1, 16.0F, false, true);
      this.cg = var1;
      this.a(1);
   }

   public boolean do() {
      agf var1 = this.cg.fe();
      if (var1 == null) {
         return false;
      } else {
         this.cf = var1.a((aig)this.cg);
         if (!this.a(this.cf, false)) {
            if (this.b1.bq().nextInt(20) == 0) {
               this.cf = var1.if((aig)this.cg);
               return this.a(this.cf, false);
            } else {
               return false;
            }
         } else {
            return true;
         }
      }
   }

   public void a() {
      this.cg.do(this.cf);
      super.a();
   }
}
