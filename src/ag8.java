public class ag8 extends ahk {
   private ah5 af;
   private aig ae;
   private double ak;
   private double aj;
   private double ai;
   private float ah;
   private float ag;

   public ag8(ah5 var1, float var2, float var3) {
      this.af = var1;
      this.ah = var2;
      this.ag = var3;
      this.a(1);
   }

   public boolean do() {
      this.ae = this.af.bB();
      if (this.ae == null) {
         return false;
      } else if (this.ae.for((aiw)this.af) > (double)(this.ag * this.ag)) {
         return false;
      } else {
         nr var1 = agh.if(this.af, 16, 7, this.af.ap.do().a(this.ae.al, this.ae.ak, this.ae.aj));
         if (var1 == null) {
            return false;
         } else {
            this.ak = var1.int;
            this.aj = var1.for;
            this.ai = var1.do;
            return true;
         }
      }
   }

   public boolean try() {
      return !this.af.bl().new() && this.ae.aA() && this.ae.for((aiw)this.af) < (double)(this.ag * this.ag);
   }

   public void new() {
      this.ae = null;
   }

   public void a() {
      this.af.bl().a(this.ak, this.aj, this.ai, this.ah);
   }
}
