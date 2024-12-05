public class d7 extends aiw {
   protected int bB;
   protected int bA;
   protected float bz;
   protected float by;
   protected int bx;
   protected int bw;
   protected float bv;
   protected float bu;
   protected float bs;
   protected float br;
   protected float bq;
   protected float bp;
   protected ajd bo;
   public static double bD;
   public static double bC;
   public static double bt;

   protected d7(y6 var1, double var2, double var4, double var6) {
      super(var1);
      this.bx = 0;
      this.bw = 0;
      this.bp = 1.0F;
      this.bo = null;
      this.if(0.2F, 0.2F);
      this.aQ = this.aO / 2.0F;
      this.try(var2, var4, var6);
      this.aJ = var2;
      this.aI = var4;
      this.aH = var6;
      this.bs = this.br = this.bq = 1.0F;
      this.bz = this.bm.nextFloat() * 3.0F;
      this.by = this.bm.nextFloat() * 3.0F;
      this.bv = (this.bm.nextFloat() * 0.5F + 0.5F) * 2.0F;
      this.bw = (int)(4.0F / (this.bm.nextFloat() * 0.9F + 0.1F));
      this.bx = 0;
   }

   public d7(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6);
      this.ai = var8 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      this.ah = var10 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      this.ag = var12 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      float var14 = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
      float var15 = ajs.int(this.ai * this.ai + this.ah * this.ah + this.ag * this.ag);
      this.ai = this.ai / (double)var15 * (double)var14 * 0.4000000059604645D;
      this.ah = this.ah / (double)var15 * (double)var14 * 0.4000000059604645D + 0.10000000149011612D;
      this.ag = this.ag / (double)var15 * (double)var14 * 0.4000000059604645D;
   }

   public d7 else(float var1) {
      this.ai *= (double)var1;
      this.ah = (this.ah - 0.10000000149011612D) * (double)var1 + 0.10000000149011612D;
      this.ag *= (double)var1;
      return this;
   }

   public d7 char(float var1) {
      this.if(0.2F * var1, 0.2F * var1);
      this.bv *= var1;
      return this;
   }

   public void if(float var1, float var2, float var3) {
      this.bs = var1;
      this.br = var2;
      this.bq = var3;
   }

   public void case(float var1) {
      this.bp = var1;
   }

   public float aT() {
      return this.bs;
   }

   public float aU() {
      return this.br;
   }

   public float aW() {
      return this.bq;
   }

   protected boolean aK() {
      return false;
   }

   protected void X() {
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      if (this.bx++ >= this.bw) {
         this.az();
      }

      this.ah -= 0.04D * (double)this.bu;
      this.do(this.ai, this.ah, this.ag);
      this.ai *= 0.9800000190734863D;
      this.ah *= 0.9800000190734863D;
      this.ag *= 0.9800000190734863D;
      if (this.aY) {
         this.ai *= 0.699999988079071D;
         this.ag *= 0.699999988079071D;
      }

   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (float)this.bB / 16.0F;
      float var9 = var8 + 0.0624375F;
      float var10 = (float)this.bA / 16.0F;
      float var11 = var10 + 0.0624375F;
      float var12 = 0.1F * this.bv;
      if (this.bo != null) {
         var8 = this.bo.a();
         var9 = this.bo.byte();
         var10 = this.bo.int();
         var11 = this.bo.do();
      }

      float var13 = (float)(this.ao + (this.al - this.ao) * (double)var2 - bD);
      float var14 = (float)(this.an + (this.ak - this.an) * (double)var2 - bC);
      float var15 = (float)(this.am + (this.aj - this.am) * (double)var2 - bt);
      float var16 = 1.0F;
      var1.a(this.bs * var16, this.br * var16, this.bq * var16, this.bp);
      var1.a((double)(var13 - var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 - var5 * var12 - var7 * var12), (double)var9, (double)var11);
      var1.a((double)(var13 - var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 - var5 * var12 + var7 * var12), (double)var9, (double)var10);
      var1.a((double)(var13 + var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 + var5 * var12 + var7 * var12), (double)var8, (double)var10);
      var1.a((double)(var13 + var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 + var5 * var12 - var7 * var12), (double)var8, (double)var11);
   }

   public int aS() {
      return 0;
   }

   public void for(aqv var1) {
   }

   public void try(aqv var1) {
   }

   public void a(c3 var1, ajd var2) {
      if (this.aS() == 1) {
         this.bo = var2;
      } else {
         if (this.aS() != 2) {
            throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
         }

         this.bo = var2;
      }

   }

   public void g(int var1) {
      if (this.aS() != 0) {
         throw new RuntimeException("Invalid call to Particle.setMiscTex");
      } else {
         this.bB = var1 % 16;
         this.bA = var1 / 16;
      }
   }

   public void aV() {
      ++this.bB;
   }

   public boolean aa() {
      return false;
   }

   public String toString() {
      return this.getClass().getSimpleName() + ", Pos (" + this.al + "," + this.ak + "," + this.aj + "), RGBA (" + this.bs + "," + this.br + "," + this.bq + "," + this.bp + "), Age " + this.bx;
   }
}
