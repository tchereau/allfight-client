public class d5 extends d7 {
   float bS;

   public d5(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      float var14 = 2.5F;
      this.ai *= 0.10000000149011612D;
      this.ah *= 0.10000000149011612D;
      this.ag *= 0.10000000149011612D;
      this.ai += var8;
      this.ah += var10;
      this.ag += var12;
      this.bs = this.br = this.bq = 1.0F - (float)(Math.random() * 0.30000001192092896D);
      this.bv *= 0.75F;
      this.bv *= var14;
      this.bS = this.bv;
      this.bw = (int)(8.0D / (Math.random() * 0.8D + 0.3D));
      this.bw = (int)((float)this.bw * var14);
      this.aE = false;
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.bx + var2) / (float)this.bw * 32.0F;
      if (var8 < 0.0F) {
         var8 = 0.0F;
      }

      if (var8 > 1.0F) {
         var8 = 1.0F;
      }

      this.bv = this.bS * var8;
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      if (this.bx++ >= this.bw) {
         this.az();
      }

      this.g(7 - this.bx * 8 / this.bw);
      this.do(this.ai, this.ah, this.ag);
      this.ai *= 0.9599999785423279D;
      this.ah *= 0.9599999785423279D;
      this.ag *= 0.9599999785423279D;
      aek var1 = this.ap.if(this, 2.0D);
      if (var1 != null && this.ak > var1.aZ.a) {
         this.ak += (var1.aZ.a - this.ak) * 0.2D;
         this.ah += (var1.ah - this.ah) * 0.2D;
         this.try(this.al, this.ak, this.aj);
      }

      if (this.aY) {
         this.ai *= 0.699999988079071D;
         this.ag *= 0.699999988079071D;
      }

   }
}
