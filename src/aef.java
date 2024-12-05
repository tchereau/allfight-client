public class aef extends aiw {
   private int df;
   private int de;

   public aef(y6 var1) {
      super(var1);
      this.if(0.25F, 0.25F);
   }

   protected void X() {
      this.bg.a(8, 5);
   }

   public boolean a(double var1) {
      return var1 < 4096.0D;
   }

   public aef(y6 var1, double var2, double var4, double var6, abp var8) {
      super(var1);
      this.df = 0;
      this.if(0.25F, 0.25F);
      this.try(var2, var4, var6);
      this.aQ = 0.0F;
      int var9 = 1;
      if (var8 != null && var8.a()) {
         this.bg.if(8, var8);
         aqv var10 = var8.b();
         aqv var11 = var10.char("Fireworks");
         if (var11 != null) {
            var9 += var11.else("Flight");
         }
      }

      this.ai = this.bm.nextGaussian() * 0.001D;
      this.ag = this.bm.nextGaussian() * 0.001D;
      this.ah = 0.05D;
      this.de = 10 * var9 + this.bm.nextInt(6) + this.bm.nextInt(7);
   }

   public void new(double var1, double var3, double var5) {
      this.ai = var1;
      this.ah = var3;
      this.ag = var5;
      if (this.a0 == 0.0F && this.a2 == 0.0F) {
         float var7 = ajs.int(var1 * var1 + var5 * var5);
         this.a2 = this.a5 = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
         this.a0 = this.a4 = (float)(Math.atan2(var3, (double)var7) * 180.0D / 3.1415927410125732D);
      }

   }

   public void aC() {
      this.aJ = this.al;
      this.aI = this.ak;
      this.aH = this.aj;
      super.aC();
      this.ai *= 1.15D;
      this.ag *= 1.15D;
      this.ah += 0.04D;
      this.do(this.ai, this.ah, this.ag);
      float var1 = ajs.int(this.ai * this.ai + this.ag * this.ag);
      this.a5 = (float)(Math.atan2(this.ai, this.ag) * 180.0D / 3.1415927410125732D);

      for(this.a4 = (float)(Math.atan2(this.ah, (double)var1) * 180.0D / 3.1415927410125732D); this.a4 - this.a0 < -180.0F; this.a0 -= 360.0F) {
      }

      while(this.a4 - this.a0 >= 180.0F) {
         this.a0 += 360.0F;
      }

      while(this.a5 - this.a2 < -180.0F) {
         this.a2 -= 360.0F;
      }

      while(this.a5 - this.a2 >= 180.0F) {
         this.a2 += 360.0F;
      }

      this.a4 = this.a0 + (this.a4 - this.a0) * 0.2F;
      this.a5 = this.a2 + (this.a5 - this.a2) * 0.2F;
      if (this.df == 0) {
         this.ap.a((aiw)this, "fireworks.launch", 3.0F, 1.0F);
      }

      ++this.df;
      if (this.ap.goto && this.df % 2 < 2) {
         this.ap.a("fireworksSpark", this.al, this.ak - 0.3D, this.aj, this.bm.nextGaussian() * 0.05D, -this.ah * 0.5D, this.bm.nextGaussian() * 0.05D);
      }

      if (!this.ap.goto && this.df > this.de) {
         this.ap.a((aiw)this, (byte)17);
         this.az();
      }

   }

   public void a(byte var1) {
      if (var1 == 17 && this.ap.goto) {
         abp var2 = this.bg.new(8);
         aqv var3 = null;
         if (var2 != null && var2.a()) {
            var3 = var2.b().char("Fireworks");
         }

         this.ap.a(this.al, this.ak, this.aj, this.ai, this.ah, this.ag, var3);
      }

      super.a(var1);
   }

   public void for(aqv var1) {
      var1.a("Life", this.df);
      var1.a("LifeTime", this.de);
      abp var2 = this.bg.new(8);
      if (var2 != null) {
         aqv var3 = new aqv();
         var2.if(var3);
         var1.a("FireworksItem", var3);
      }

   }

   public void try(aqv var1) {
      this.df = var1.goto("Life");
      this.de = var1.goto("LifeTime");
      aqv var2 = var1.char("FireworksItem");
      if (var2 != null) {
         abp var3 = abp.for(var2);
         if (var3 != null) {
            this.bg.if(8, var3);
         }
      }

   }

   public float aH() {
      return 0.0F;
   }

   public float int(float var1) {
      return super.int(var1);
   }

   public int new(float var1) {
      return super.new(var1);
   }

   public boolean aa() {
      return false;
   }
}
