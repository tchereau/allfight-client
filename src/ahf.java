public class ahf extends ahk {
   private aig aO;
   protected aiw aP;
   private float aT;
   private int aS;
   private float aR;
   private Class aQ;

   public ahf(aig var1, Class var2, float var3) {
      this.aO = var1;
      this.aQ = var2;
      this.aT = var3;
      this.aR = 0.02F;
      this.a(2);
   }

   public ahf(aig var1, Class var2, float var3, float var4) {
      this.aO = var1;
      this.aQ = var2;
      this.aT = var3;
      this.aR = var4;
      this.a(2);
   }

   public boolean do() {
      if (this.aO.bq().nextFloat() >= this.aR) {
         return false;
      } else {
         if (this.aQ == aek.class) {
            this.aP = this.aO.ap.if(this.aO, (double)this.aT);
         } else {
            this.aP = this.aO.ap.a((Class)this.aQ, (nw)this.aO.aZ.do((double)this.aT, 3.0D, (double)this.aT), (aiw)this.aO);
         }

         return this.aP != null;
      }
   }

   public boolean try() {
      if (!this.aP.aA()) {
         return false;
      } else if (this.aO.for((aiw)this.aP) > (double)(this.aT * this.aT)) {
         return false;
      } else {
         return this.aS > 0;
      }
   }

   public void a() {
      this.aS = 40 + this.aO.bq().nextInt(40);
   }

   public void new() {
      this.aP = null;
   }

   public void int() {
      this.aO.b9().a(this.aP.al, this.aP.ak + (double)this.aP.af(), this.aP.aj, 10.0F, (float)this.aO.bJ());
      --this.aS;
   }
}
