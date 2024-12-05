public class ok extends n4 {
   private int tg = 0;

   public void do(aqv var1) {
      super.do(var1);
      var1.a("OutputSignal", this.tg);
   }

   public void a(aqv var1) {
      super.a(var1);
      this.tg = var1.goto("OutputSignal");
   }

   public int gC() {
      return this.tg;
   }

   public void aP(int var1) {
      this.tg = var1;
   }
}
