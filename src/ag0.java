public class ag0 extends ahk {
   private ah5 y;
   private double x;
   private double B;
   private double A;
   private float z;

   public ag0(ah5 var1, float var2) {
      this.y = var1;
      this.z = var2;
      this.a(1);
   }

   public boolean do() {
      if (this.y.bH() >= 100) {
         return false;
      } else if (this.y.bq().nextInt(120) != 0) {
         return false;
      } else {
         nr var1 = agh.a(this.y, 10, 7);
         if (var1 == null) {
            return false;
         } else {
            this.x = var1.int;
            this.B = var1.for;
            this.A = var1.do;
            return true;
         }
      }
   }

   public boolean try() {
      return !this.y.bl().new();
   }

   public void a() {
      this.y.bl().a(this.x, this.B, this.A, this.z);
   }
}
