public abstract class afx extends ah5 implements aix {
   public afx(y6 var1) {
      super(var1);
   }

   public boolean bV() {
      return true;
   }

   public boolean bj() {
      return this.ap.int(this.aZ);
   }

   public int bE() {
      return 120;
   }

   protected boolean bn() {
      return true;
   }

   protected int new(aek var1) {
      return 1 + this.ap.o.nextInt(3);
   }

   public void aD() {
      int var1 = this.Z();
      super.aD();
      if (this.aA() && !this.a(ts.s)) {
         --var1;
         this.b(var1);
         if (this.Z() == -20) {
            this.b(0);
            this.a(ai4.f, 2);
         }
      } else {
         this.b(300);
      }

   }
}
