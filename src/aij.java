public abstract class aij extends aig {
   public aij(y6 var1) {
      super(var1);
   }

   protected void try(float var1) {
   }

   protected void a(double var1, boolean var3) {
   }

   public void int(float var1, float var2) {
      if (this.ap()) {
         this.a(var1, var2, 0.02F);
         this.do(this.ai, this.ah, this.ag);
         this.ai *= 0.800000011920929D;
         this.ah *= 0.800000011920929D;
         this.ag *= 0.800000011920929D;
      } else if (this.ar()) {
         this.a(var1, var2, 0.02F);
         this.do(this.ai, this.ah, this.ag);
         this.ai *= 0.5D;
         this.ah *= 0.5D;
         this.ag *= 0.5D;
      } else {
         float var3 = 0.91F;
         if (this.aY) {
            var3 = 0.54600006F;
            int var4 = this.ap.new(ajs.a(this.al), ajs.a(this.aZ.a) - 1, ajs.a(this.aj));
            if (var4 > 0) {
               var3 = pa.x[var4].aq * 0.91F;
            }
         }

         float var8 = 0.16277136F / (var3 * var3 * var3);
         this.a(var1, var2, this.aY ? 0.1F * var8 : 0.02F);
         var3 = 0.91F;
         if (this.aY) {
            var3 = 0.54600006F;
            int var5 = this.ap.new(ajs.a(this.al), ajs.a(this.aZ.a) - 1, ajs.a(this.aj));
            if (var5 > 0) {
               var3 = pa.x[var5].aq * 0.91F;
            }
         }

         this.do(this.ai, this.ah, this.ag);
         this.ai *= (double)var3;
         this.ah *= (double)var3;
         this.ag *= (double)var3;
      }

      this.ey = this.ex;
      double var10 = this.al - this.ao;
      double var9 = this.aj - this.am;
      float var7 = ajs.int(var10 * var10 + var9 * var9) * 4.0F;
      if (var7 > 1.0F) {
         var7 = 1.0F;
      }

      this.ex += (var7 - this.ex) * 0.4F;
      this.ew += this.ex;
   }

   public boolean bZ() {
      return false;
   }
}
