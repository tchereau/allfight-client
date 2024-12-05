public class ag5 extends ahk {
   private afy Q;
   private aep P;
   private int R;

   public ag5(afy var1) {
      this.Q = var1;
      this.a(3);
   }

   public boolean do() {
      if (!this.Q.ap.j()) {
         return false;
      } else if (this.Q.bq().nextInt(8000) != 0) {
         return false;
      } else {
         this.P = (aep)this.Q.ap.a((Class)aep.class, (nw)this.Q.aZ.do(6.0D, 2.0D, 6.0D), (aiw)this.Q);
         return this.P != null;
      }
   }

   public boolean try() {
      return this.R > 0;
   }

   public void a() {
      this.R = 400;
      this.Q.t(true);
   }

   public void new() {
      this.Q.t(false);
      this.P = null;
   }

   public void int() {
      this.Q.b9().a(this.P, 30.0F, 30.0F);
      --this.R;
   }
}
