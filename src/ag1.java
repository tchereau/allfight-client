public class ag1 extends ahk {
   private aig D;
   private double C;
   private double F;
   private int E = 0;

   public ag1(aig var1) {
      this.D = var1;
      this.a(3);
   }

   public boolean do() {
      return this.D.bq().nextFloat() < 0.02F;
   }

   public boolean try() {
      return this.E >= 0;
   }

   public void a() {
      double var1 = 6.283185307179586D * this.D.bq().nextDouble();
      this.C = Math.cos(var1);
      this.F = Math.sin(var1);
      this.E = 20 + this.D.bq().nextInt(20);
   }

   public void int() {
      --this.E;
      this.D.b9().a(this.D.al + this.C, this.D.ak + (double)this.D.af(), this.D.aj + this.F, 10.0F, (float)this.D.bJ());
   }
}
