public class ae1 extends aev {
   public ae1(y6 var1) {
      super(var1);
      this.ft = "/mob/lava.png";
      this.bh = true;
      this.fm = 0.2F;
   }

   public boolean bj() {
      return this.ap.p > 0 && this.ap.int(this.aZ) && this.ap.if((aiw)this, (nw)this.aZ).isEmpty() && !this.ap.do(this.aZ);
   }

   public int by() {
      return this.eQ() * 3;
   }

   public int new(float var1) {
      return 15728880;
   }

   public float int(float var1) {
      return 1.0F;
   }

   protected String eT() {
      return "flame";
   }

   protected aev eX() {
      return new ae1(this.ap);
   }

   protected int bI() {
      return abr.ap.A;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.bI();
      if (var3 > 0 && this.eQ() > 1) {
         int var4 = this.bm.nextInt(4) - 2;
         if (var2 > 0) {
            var4 += this.bm.nextInt(var2 + 1);
         }

         for(int var5 = 0; var5 < var4; ++var5) {
            this.new(var3, 1);
         }
      }

   }

   public boolean aP() {
      return false;
   }

   protected int eS() {
      return super.eS() * 4;
   }

   protected void eP() {
      this.p1 *= 0.9F;
   }

   protected void cf() {
      this.ah = (double)(0.42F + (float)this.eQ() * 0.1F);
      this.ba = true;
   }

   protected void try(float var1) {
   }

   protected boolean eR() {
      return true;
   }

   protected int eV() {
      return super.eV() + 2;
   }

   protected String bX() {
      return "mob.slime." + (this.eQ() > 1 ? "big" : "small");
   }

   protected String bS() {
      return "mob.slime." + (this.eQ() > 1 ? "big" : "small");
   }

   protected String eW() {
      return this.eQ() > 1 ? "mob.magmacube.big" : "mob.magmacube.small";
   }

   public boolean ar() {
      return false;
   }

   protected boolean eU() {
      return true;
   }
}
