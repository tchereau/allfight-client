public abstract class ah5 extends aig {
   private s5 pX;
   protected aiw pZ;
   protected boolean pW = false;
   protected int pY = 0;

   public ah5(y6 var1) {
      super(var1);
   }

   protected boolean eL() {
      return false;
   }

   protected void cl() {
      this.ap.e.a("ai");
      if (this.pY > 0) {
         --this.pY;
      }

      this.pW = this.eL();
      float var1 = 16.0F;
      if (this.pZ == null) {
         this.pZ = this.eM();
         if (this.pZ != null) {
            this.pX = this.ap.a(this, this.pZ, var1, true, false, false, true);
         }
      } else if (this.pZ.aA()) {
         float var2 = this.pZ.char(this);
         if (this.void(this.pZ)) {
            this.a(this.pZ, var2);
         }
      } else {
         this.pZ = null;
      }

      this.ap.e.if();
      if (!this.pW && this.pZ != null && (this.pX == null || this.bm.nextInt(20) == 0)) {
         this.pX = this.ap.a(this, this.pZ, var1, true, false, false, true);
      } else if (!this.pW && (this.pX == null && this.bm.nextInt(180) == 0 || this.bm.nextInt(120) == 0 || this.pY > 0) && this.e8 < 100) {
         this.eK();
      }

      int var21 = ajs.a(this.aZ.a + 0.5D);
      boolean var3 = this.ap();
      boolean var4 = this.ar();
      this.a4 = 0.0F;
      if (this.pX != null && this.bm.nextInt(100) != 0) {
         this.ap.e.a("followpath");
         nr var5 = this.pX.a((aiw)this);
         double var6 = (double)(this.aP * 2.0F);

         while(var5 != null && var5.if(this.al, var5.for, this.aj) < var6 * var6) {
            this.pX.if();
            if (this.pX.int()) {
               var5 = null;
               this.pX = null;
            } else {
               var5 = this.pX.a((aiw)this);
            }
         }

         this.e4 = false;
         if (var5 != null) {
            double var8 = var5.int - this.al;
            double var10 = var5.do - this.aj;
            double var12 = var5.for - (double)var21;
            float var14 = (float)(Math.atan2(var10, var8) * 180.0D / 3.1415927410125732D) - 90.0F;
            float var15 = ajs.int(var14 - this.a5);
            this.e6 = this.e2;
            if (var15 > 30.0F) {
               var15 = 30.0F;
            }

            if (var15 < -30.0F) {
               var15 = -30.0F;
            }

            this.a5 += var15;
            if (this.pW && this.pZ != null) {
               double var16 = this.pZ.al - this.al;
               double var18 = this.pZ.aj - this.aj;
               float var20 = this.a5;
               this.a5 = (float)(Math.atan2(var18, var16) * 180.0D / 3.1415927410125732D) - 90.0F;
               var15 = (var20 - this.a5 + 90.0F) * 3.1415927F / 180.0F;
               this.e7 = -ajs.try(var15) * this.e6 * 1.0F;
               this.e6 = ajs.for(var15) * this.e6 * 1.0F;
            }

            if (var12 > 0.0D) {
               this.e4 = true;
            }
         }

         if (this.pZ != null) {
            this.a(this.pZ, 30.0F, 30.0F);
         }

         if (this.aX && !this.eN()) {
            this.e4 = true;
         }

         if (this.bm.nextFloat() < 0.8F && (var3 || var4)) {
            this.e4 = true;
         }

         this.ap.e.if();
      } else {
         super.cl();
         this.pX = null;
      }
   }

   protected void eK() {
      this.ap.e.a("stroll");
      boolean var1 = false;
      int var2 = -1;
      int var3 = -1;
      int var4 = -1;
      float var5 = -99999.0F;

      for(int var6 = 0; var6 < 10; ++var6) {
         int var7 = ajs.a(this.al + (double)this.bm.nextInt(13) - 6.0D);
         int var8 = ajs.a(this.ak + (double)this.bm.nextInt(7) - 3.0D);
         int var9 = ajs.a(this.aj + (double)this.bm.nextInt(13) - 6.0D);
         float var10 = this.long(var7, var8, var9);
         if (var10 > var5) {
            var5 = var10;
            var2 = var7;
            var3 = var8;
            var4 = var9;
            var1 = true;
         }
      }

      if (var1) {
         this.pX = this.ap.a(this, var2, var3, var4, 10.0F, true, false, false, true);
      }

      this.ap.e.if();
   }

   protected void a(aiw var1, float var2) {
   }

   public float long(int var1, int var2, int var3) {
      return 0.0F;
   }

   protected aiw eM() {
      return null;
   }

   public boolean bj() {
      int var1 = ajs.a(this.al);
      int var2 = ajs.a(this.aZ.a);
      int var3 = ajs.a(this.aj);
      return super.bj() && this.long(var1, var2, var3) >= 0.0F;
   }

   public boolean eN() {
      return this.pX != null;
   }

   public void a(s5 var1) {
      this.pX = var1;
   }

   public aiw eO() {
      return this.pZ;
   }

   public void g(aiw var1) {
      this.pZ = var1;
   }

   public float bM() {
      float var1 = super.bM();
      if (this.pY > 0 && !this.co()) {
         var1 *= 2.0F;
      }

      return var1;
   }
}
