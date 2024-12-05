public class aeu extends ae0 {
   public aeu(y6 var1) {
      super(var1);
      this.ft = "/mob/spider.png";
      this.if(1.4F, 0.9F);
      this.e2 = 0.8F;
   }

   protected void X() {
      super.X();
      this.bg.a(16, new Byte((byte)0));
   }

   public void aC() {
      super.aC();
      if (!this.ap.goto) {
         this.v(this.aX);
      }

   }

   public int b0() {
      return 16;
   }

   public double O() {
      return (double)this.aO * 0.75D - 0.5D;
   }

   protected aiw eM() {
      float var1 = this.int(1.0F);
      if (var1 < 0.5F) {
         double var2 = 16.0D;
         return this.ap.a(this, var2);
      } else {
         return null;
      }
   }

   protected String b2() {
      return "mob.spider.say";
   }

   protected String bX() {
      return "mob.spider.say";
   }

   protected String bS() {
      return "mob.spider.death";
   }

   protected void a(int var1, int var2, int var3, int var4) {
      this.a("mob.spider.step", 0.15F, 1.0F);
   }

   protected void a(aiw var1, float var2) {
      float var3 = this.int(1.0F);
      if (var3 > 0.5F && this.bm.nextInt(100) == 0) {
         this.pZ = null;
      } else {
         if (var2 > 2.0F && var2 < 6.0F && this.bm.nextInt(10) == 0) {
            if (this.aY) {
               double var4 = var1.al - this.al;
               double var6 = var1.aj - this.aj;
               float var8 = ajs.int(var4 * var4 + var6 * var6);
               this.ai = var4 / (double)var8 * 0.5D * 0.800000011920929D + this.ai * 0.20000000298023224D;
               this.ag = var6 / (double)var8 * 0.5D * 0.800000011920929D + this.ag * 0.20000000298023224D;
               this.ah = 0.4000000059604645D;
            }
         } else {
            super.a(var1, var2);
         }

      }
   }

   protected int bI() {
      return abr.aW.A;
   }

   protected void a(boolean var1, int var2) {
      super.a(var1, var2);
      if (var1 && (this.bm.nextInt(3) == 0 || this.bm.nextInt(1 + var2) > 0)) {
         this.new(abr.as.A, 1);
      }

   }

   public boolean bZ() {
      return this.fi();
   }

   public void Y() {
   }

   public float fj() {
      return 1.0F;
   }

   public ah8 cn() {
      return ah8.for;
   }

   public boolean a(aiz var1) {
      return var1.byte() == ai0.g.try ? false : super.a(var1);
   }

   public boolean fi() {
      return (this.bg.for(16) & 1) != 0;
   }

   public void v(boolean var1) {
      byte var2 = this.bg.for(16);
      if (var1) {
         var2 = (byte)(var2 | 1);
      } else {
         var2 &= -2;
      }

      this.bg.if(16, var2);
   }

   public void bO() {
      if (this.ap.o.nextInt(100) == 0) {
         aew var1 = new aew(this.ap);
         var1.if(this.al, this.ak, this.aj, this.a5, 0.0F);
         var1.bO();
         this.ap.new(var1);
         var1.int(this);
      }

   }
}
