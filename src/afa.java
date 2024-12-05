public class afa extends aiw {
   public int dA;
   private aig dz;

   public afa(y6 var1) {
      super(var1);
      this.dA = 0;
      this.at = true;
      this.if(0.98F, 0.98F);
      this.aQ = this.aO / 2.0F;
   }

   public afa(y6 var1, double var2, double var4, double var6, aig var8) {
      this(var1);
      this.try(var2, var4, var6);
      float var9 = (float)(Math.random() * 3.1415927410125732D * 2.0D);
      this.ai = (double)(-((float)Math.sin((double)var9)) * 0.02F);
      this.ah = 0.20000000298023224D;
      this.ag = (double)(-((float)Math.cos((double)var9)) * 0.02F);
      this.dA = 80;
      this.ao = var2;
      this.an = var4;
      this.am = var6;
      this.dz = var8;
   }

   protected void X() {
   }

   protected boolean aK() {
      return false;
   }

   public boolean aw() {
      return !this.aR;
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      this.ah -= 0.03999999910593033D;
      this.do(this.ai, this.ah, this.ag);
      this.ai *= 0.9800000190734863D;
      this.ah *= 0.9800000190734863D;
      this.ag *= 0.9800000190734863D;
      if (this.aY) {
         this.ai *= 0.699999988079071D;
         this.ag *= 0.699999988079071D;
         this.ah *= -0.5D;
      }

      if (this.dA-- <= 0) {
         this.az();
         if (!this.ap.goto) {
            this.a9();
         }
      } else {
         this.ap.a("smoke", this.al, this.ak + 0.5D, this.aj, 0.0D, 0.0D, 0.0D);
      }

   }

   private void a9() {
      float var1 = 4.0F;
      this.ap.a(this, this.al, this.ak, this.aj, var1, true);
   }

   protected void for(aqv var1) {
      var1.a("Fuse", (byte)this.dA);
   }

   protected void try(aqv var1) {
      this.dA = var1.else("Fuse");
   }

   public float aH() {
      return 0.0F;
   }

   public aig a8() {
      return this.dz;
   }
}
