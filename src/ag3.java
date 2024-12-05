public class ag3 extends ahk {
   private ah5 L;
   private float K;
   private double O;
   private double N;
   private double M;

   public ag3(ah5 var1, float var2) {
      this.L = var1;
      this.K = var2;
      this.a(1);
   }

   public boolean do() {
      if (this.L.bD() == null && !this.L.aP()) {
         return false;
      } else {
         nr var1 = agh.a(this.L, 5, 4);
         if (var1 == null) {
            return false;
         } else {
            this.O = var1.int;
            this.N = var1.for;
            this.M = var1.do;
            return true;
         }
      }
   }

   public void a() {
      this.L.bl().a(this.O, this.N, this.M, this.K);
   }

   public boolean try() {
      return !this.L.bl().new();
   }
}
