public class ahv extends ahk {
   private afw bJ;
   private aek bI;
   private y6 bM;
   private float bL;
   private int bK;

   public ahv(afw var1, float var2) {
      this.bJ = var1;
      this.bM = var1.ap;
      this.bL = var2;
      this.a(2);
   }

   public boolean do() {
      this.bI = this.bM.if(this.bJ, (double)this.bL);
      return this.bI == null ? false : this.a(this.bI);
   }

   public boolean try() {
      if (!this.bI.aA()) {
         return false;
      } else if (this.bJ.for((aiw)this.bI) > (double)(this.bL * this.bL)) {
         return false;
      } else {
         return this.bK > 0 && this.a(this.bI);
      }
   }

   public void a() {
      this.bJ.F(true);
      this.bK = 40 + this.bJ.bq().nextInt(40);
   }

   public void new() {
      this.bJ.F(false);
      this.bI = null;
   }

   public void int() {
      this.bJ.b9().a(this.bI.al, this.bI.ak + (double)this.bI.af(), this.bI.aj, 10.0F, (float)this.bJ.bJ());
      --this.bK;
   }

   private boolean a(aek var1) {
      abp var2 = var1.fR.L();
      if (var2 == null) {
         return false;
      } else {
         return !this.bJ.fy() && var2.new == abr.b8.A ? true : this.bJ.long(var2);
      }
   }
}
