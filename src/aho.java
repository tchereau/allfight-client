public class aho extends ahk {
   private aig bb;

   public aho(aig var1) {
      this.bb = var1;
      this.a(4);
      var1.bl().a(true);
   }

   public boolean do() {
      return this.bb.ap() || this.bb.ar();
   }

   public void int() {
      if (this.bb.bq().nextFloat() < 0.8F) {
         this.bb.bo().if();
      }

   }
}
