public class ag9 extends ahk {
   private ah5 am;
   private double al;
   private double ap;
   private double ao;
   private float an;

   public ag9(ah5 var1, float var2) {
      this.am = var1;
      this.an = var2;
      this.a(1);
   }

   public boolean do() {
      if (this.am.bv()) {
         return false;
      } else {
         apg var1 = this.am.bh();
         nr var2 = agh.if(this.am, 16, 7, this.am.ap.do().a((double)var1.if, (double)var1.a, (double)var1.do));
         if (var2 == null) {
            return false;
         } else {
            this.al = var2.int;
            this.ap = var2.for;
            this.ao = var2.do;
            return true;
         }
      }
   }

   public boolean try() {
      return !this.am.bl().new();
   }

   public void a() {
      this.am.bl().a(this.al, this.ap, this.ao, this.an);
   }
}
