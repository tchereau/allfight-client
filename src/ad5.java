public class ad5 extends ad9 {
   public ad5(y6 var1) {
      super(var1);
   }

   public ad5(y6 var1, aig var2) {
      super(var1, var2);
   }

   public ad5(y6 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected float a1() {
      return 0.07F;
   }

   protected float a2() {
      return 0.7F;
   }

   protected float a0() {
      return -20.0F;
   }

   protected void a(nt var1) {
      if (!this.ap.goto) {
         this.ap.for(2002, (int)Math.round(this.al), (int)Math.round(this.ak), (int)Math.round(this.aj), 0);
         int var2 = 3 + this.ap.o.nextInt(5) + this.ap.o.nextInt(5);

         while(var2 > 0) {
            int var3 = aik.aC(var2);
            var2 -= var3;
            this.ap.new(new aik(this.ap, this.al, this.ak, this.aj, var3));
         }

         this.az();
      }

   }
}
