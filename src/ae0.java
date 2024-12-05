public abstract class ae0 extends ah5 implements ae5 {
   public ae0(y6 var1) {
      super(var1);
      this.eB = 5;
   }

   public void bU() {
      this.bs();
      float var1 = this.int(1.0F);
      if (var1 > 0.5F) {
         this.e8 += 2;
      }

      super.bU();
   }

   public void aC() {
      super.aC();
      if (!this.ap.goto && this.ap.p == 0) {
         this.az();
      }

   }

   protected aiw eM() {
      aek var1 = this.ap.a(this, 16.0D);
      return var1 != null && this.void(var1) ? var1 : null;
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else if (super.a(var1, var2)) {
         aiw var3 = var1.new();
         if (this.as != var3 && this.ar != var3) {
            if (var3 != this) {
               this.pZ = var3;
            }

            return true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public boolean long(aiw var1) {
      int var2 = this.h(var1);
      if (this.if(ai0.u)) {
         var2 += 3 << this.a(ai0.u).int();
      }

      if (this.if(ai0.h)) {
         var2 -= 2 << this.a(ai0.h).int();
      }

      int var3 = 0;
      if (var1 instanceof aig) {
         var2 += z1.a((aig)this, (aig)((aig)var1));
         var3 += z1.if(this, (aig)var1);
      }

      boolean var4 = var1.a(ai4.a((aig)this), var2);
      if (var4) {
         if (var3 > 0) {
            var1.byte((double)(-ajs.try(this.a5 * 3.1415927F / 180.0F) * (float)var3 * 0.5F), 0.1D, (double)(ajs.for(this.a5 * 3.1415927F / 180.0F) * (float)var3 * 0.5F));
            this.ai *= 0.6D;
            this.ag *= 0.6D;
         }

         int var5 = z1.if(this);
         if (var5 > 0) {
            var1.e(var5 * 4);
         }

         if (var1 instanceof aig) {
            zq.a(this, (aig)var1, this.bm);
         }
      }

      return var4;
   }

   protected void a(aiw var1, float var2) {
      if (this.eF <= 0 && var2 < 2.0F && var1.aZ.int > this.aZ.a && var1.aZ.a < this.aZ.int) {
         this.eF = 20;
         this.long(var1);
      }

   }

   public float long(int var1, int var2, int var3) {
      return 0.5F - this.ap.int(var1, var2, var3);
   }

   protected boolean eZ() {
      int var1 = ajs.a(this.al);
      int var2 = ajs.a(this.aZ.a);
      int var3 = ajs.a(this.aj);
      if (this.ap.for(yw.if, var1, var2, var3) > this.bm.nextInt(32)) {
         return false;
      } else {
         int var4 = this.ap.h(var1, var2, var3);
         if (this.ap.w()) {
            int var5 = this.ap.x;
            this.ap.x = 10;
            var4 = this.ap.h(var1, var2, var3);
            this.ap.x = var5;
         }

         return var4 <= this.bm.nextInt(8);
      }
   }

   public boolean bj() {
      return this.eZ() && super.bj();
   }

   public int h(aiw var1) {
      return 2;
   }
}
