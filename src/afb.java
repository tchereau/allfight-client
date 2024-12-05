public class afb extends afj {
   private int so = -1;

   public afb(y6 var1) {
      super(var1);
   }

   public afb(y6 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public int f3() {
      return 3;
   }

   public pa f6() {
      return pa.bz;
   }

   public void aC() {
      super.aC();
      if (this.so > 0) {
         --this.so;
         this.ap.a("smoke", this.al, this.ak + 0.5D, this.aj, 0.0D, 0.0D, 0.0D);
      } else if (this.so == 0) {
         this.int(this.ai * this.ai + this.ag * this.ag);
      }

      if (this.aX) {
         double var1 = this.ai * this.ai + this.ag * this.ag;
         if (var1 >= 0.009999999776482582D) {
            this.int(var1);
         }
      }

   }

   public void if(ai4 var1) {
      super.if(var1);
      double var2 = this.ai * this.ai + this.ag * this.ag;
      if (!var1.long()) {
         this.a(new abp(pa.bz, 1), 0.0F);
      }

      if (var1.do() || var1.long() || var2 >= 0.009999999776482582D) {
         this.int(var2);
      }

   }

   protected void int(double var1) {
      if (!this.ap.goto) {
         double var3 = Math.sqrt(var1);
         if (var3 > 5.0D) {
            var3 = 5.0D;
         }

         this.ap.a(this, this.al, this.ak, this.aj, (float)(4.0D + this.bm.nextDouble() * 1.5D * var3), true);
         this.az();
      }

   }

   protected void try(float var1) {
      if (var1 >= 3.0F) {
         float var2 = var1 / 10.0F;
         this.int((double)(var2 * var2));
      }

      super.try(var1);
   }

   public void a(int var1, int var2, int var3, boolean var4) {
      if (var4 && this.so < 0) {
         this.gd();
      }

   }

   public void a(byte var1) {
      if (var1 == 10) {
         this.gd();
      } else {
         super.a(var1);
      }

   }

   public void gd() {
      this.so = 80;
      if (!this.ap.goto) {
         this.ap.a((aiw)this, (byte)10);
         this.ap.a((aiw)this, "random.fuse", 1.0F, 1.0F);
      }

   }

   public int gb() {
      return this.so;
   }

   public boolean gc() {
      return this.so > -1;
   }

   public float a(zg var1, y6 var2, int var3, int var4, int var5, pa var6) {
      return !this.gc() || !r6.L(var6.void) && !r6.X(var2, var3, var4 + 1, var5) ? super.a(var1, var2, var3, var4, var5, var6) : 0.0F;
   }

   public boolean a(zg var1, y6 var2, int var3, int var4, int var5, int var6, float var7) {
      return !this.gc() || !r6.L(var6) && !r6.X(var2, var3, var4 + 1, var5) ? super.a(var1, var2, var3, var4, var5, var6, var7) : false;
   }

   protected void try(aqv var1) {
      super.try(var1);
      if (var1.try("TNTFuse")) {
         this.so = var1.goto("TNTFuse");
      }

   }

   protected void for(aqv var1) {
      super.for(var1);
      var1.a("TNTFuse", this.so);
   }
}
