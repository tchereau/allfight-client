public class ahc extends ahk {
   y6 aI;
   aig aH;
   aig aG;
   int aF;
   float aE;
   boolean aD;
   s5 aC;
   Class aB;
   private int aA;

   public ahc(aig var1, Class var2, float var3, boolean var4) {
      this(var1, var3, var4);
      this.aB = var2;
   }

   public ahc(aig var1, float var2, boolean var3) {
      this.aF = 0;
      this.aH = var1;
      this.aI = var1.ap;
      this.aE = var2;
      this.aD = var3;
      this.a(3);
   }

   public boolean do() {
      aig var1 = this.aH.bB();
      if (var1 == null) {
         return false;
      } else if (this.aB != null && !this.aB.isAssignableFrom(var1.getClass())) {
         return false;
      } else {
         this.aG = var1;
         this.aC = this.aH.bl().a(this.aG);
         return this.aC != null;
      }
   }

   public boolean try() {
      aig var1 = this.aH.bB();
      if (var1 == null) {
         return false;
      } else if (!this.aG.aA()) {
         return false;
      } else if (!this.aD) {
         return !this.aH.bl().new();
      } else {
         return this.aH.do(ajs.a(this.aG.al), ajs.a(this.aG.ak), ajs.a(this.aG.aj));
      }
   }

   public void a() {
      this.aH.bl().a(this.aC, this.aE);
      this.aA = 0;
   }

   public void new() {
      this.aG = null;
      this.aH.bl().case();
   }

   public void int() {
      this.aH.b9().a(this.aG, 30.0F, 30.0F);
      if ((this.aD || this.aH.ci().a(this.aG)) && --this.aA <= 0) {
         this.aA = 4 + this.aH.bq().nextInt(7);
         this.aH.bl().a(this.aG, this.aE);
      }

      this.aF = Math.max(this.aF - 1, 0);
      double var1 = (double)(this.aH.aP * 2.0F * this.aH.aP * 2.0F);
      if (!(this.aH.if(this.aG.al, this.aG.aZ.a, this.aG.aj) > var1)) {
         if (this.aF <= 0) {
            this.aF = 20;
            if (this.aH.bW() != null) {
               this.aH.b5();
            }

            this.aH.long(this.aG);
         }
      }
   }
}
