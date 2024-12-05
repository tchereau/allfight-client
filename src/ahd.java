public class ahd extends ahk {
   private aep aJ;
   private aep aN;
   private y6 aM;
   private int aL = 0;
   agf aK;

   public ahd(aep var1) {
      this.aJ = var1;
      this.aM = var1.ap;
      this.a(3);
   }

   public boolean do() {
      if (this.aJ.fr() != 0) {
         return false;
      } else if (this.aJ.bq().nextInt(500) != 0) {
         return false;
      } else {
         this.aK = this.aM.g.a(ajs.a(this.aJ.al), ajs.a(this.aJ.ak), ajs.a(this.aJ.aj), 0);
         if (this.aK == null) {
            return false;
         } else if (!this.else()) {
            return false;
         } else {
            aiw var1 = this.aM.a((Class)aep.class, (nw)this.aJ.aZ.do(8.0D, 3.0D, 8.0D), (aiw)this.aJ);
            if (var1 == null) {
               return false;
            } else {
               this.aN = (aep)var1;
               return this.aN.fr() == 0;
            }
         }
      }
   }

   public void a() {
      this.aL = 300;
      this.aJ.H(true);
   }

   public void new() {
      this.aK = null;
      this.aN = null;
      this.aJ.H(false);
   }

   public boolean try() {
      return this.aL >= 0 && this.else() && this.aJ.fr() == 0;
   }

   public void int() {
      --this.aL;
      this.aJ.b9().a(this.aN, 10.0F, 30.0F);
      if (this.aJ.for((aiw)this.aN) > 2.25D) {
         this.aJ.bl().a((aig)this.aN, 0.25F);
      } else if (this.aL == 0 && this.aN.fL()) {
         this.goto();
      }

      if (this.aJ.bq().nextInt(35) == 0) {
         this.aM.a((aiw)this.aJ, (byte)12);
      }

   }

   private boolean else() {
      if (!this.aK.long()) {
         return false;
      } else {
         int var1 = (int)((double)((float)this.aK.int()) * 0.35D);
         return this.aK.char() < var1;
      }
   }

   private void goto() {
      aep var1 = this.aJ.case((aiy)this.aN);
      this.aN.at(6000);
      this.aJ.at(6000);
      var1.at(-24000);
      var1.if(this.aJ.al, this.aJ.ak, this.aJ.aj, 0.0F, 0.0F);
      this.aM.new(var1);
      this.aM.a((aiw)var1, (byte)12);
   }
}
