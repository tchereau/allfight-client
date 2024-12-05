public class aeh extends aiw {
   public int du = 0;
   private double dt;
   private double dy;
   private double dx;
   private int dw;
   private boolean dv;

   public aeh(y6 var1) {
      super(var1);
      this.if(0.25F, 0.25F);
   }

   protected void X() {
   }

   public boolean a(double var1) {
      double var3 = this.aZ.a() * 4.0D;
      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   public aeh(y6 var1, double var2, double var4, double var6) {
      super(var1);
      this.dw = 0;
      this.if(0.25F, 0.25F);
      this.try(var2, var4, var6);
      this.aQ = 0.0F;
   }

   public void a(double var1, int var3, double var4) {
      double var6 = var1 - this.al;
      double var8 = var4 - this.aj;
      float var10 = ajs.int(var6 * var6 + var8 * var8);
      if (var10 > 12.0F) {
         this.dt = this.al + var6 / (double)var10 * 12.0D;
         this.dx = this.aj + var8 / (double)var10 * 12.0D;
         this.dy = this.ak + 8.0D;
      } else {
         this.dt = var1;
         this.dy = (double)var3;
         this.dx = var4;
      }

      this.dw = 0;
      this.dv = this.bm.nextInt(5) > 0;
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
      this.al += this.ai;
      this.ak += this.ah;
      this.aj += this.ag;
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
      if (!this.ap.goto) {
         double var2 = this.dt - this.al;
         double var4 = this.dx - this.aj;
         float var6 = (float)Math.sqrt(var2 * var2 + var4 * var4);
         float var7 = (float)Math.atan2(var4, var2);
         double var8 = (double)var1 + (double)(var6 - var1) * 0.0025D;
         if (var6 < 1.0F) {
            var8 *= 0.8D;
            this.ah *= 0.8D;
         }

         this.ai = Math.cos((double)var7) * var8;
         this.ag = Math.sin((double)var7) * var8;
         if (this.ak < this.dy) {
            this.ah += (1.0D - this.ah) * 0.014999999664723873D;
         } else {
            this.ah += (-1.0D - this.ah) * 0.014999999664723873D;
         }
      }

      float var10 = 0.25F;
      if (this.ap()) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.ap.a("bubble", this.al - this.ai * (double)var10, this.ak - this.ah * (double)var10, this.aj - this.ag * (double)var10, this.ai, this.ah, this.ag);
         }
      } else {
         this.ap.a("portal", this.al - this.ai * (double)var10 + this.bm.nextDouble() * 0.6D - 0.3D, this.ak - this.ah * (double)var10 - 0.5D, this.aj - this.ag * (double)var10 + this.bm.nextDouble() * 0.6D - 0.3D, this.ai, this.ah, this.ag);
      }

      if (!this.ap.goto) {
         this.try(this.al, this.ak, this.aj);
         ++this.dw;
         if (this.dw > 80 && !this.ap.goto) {
            this.az();
            if (this.dv) {
               this.ap.new(new afk(this.ap, this.al, this.ak, this.aj, new abp(abr.b3)));
            } else {
               this.ap.for(2003, (int)Math.round(this.al), (int)Math.round(this.ak), (int)Math.round(this.aj), 0);
            }
         }
      }

   }

   public void for(aqv var1) {
   }

   public void try(aqv var1) {
   }

   public float aH() {
      return 0.0F;
   }

   public float int(float var1) {
      return 1.0F;
   }

   public int new(float var1) {
      return 15728880;
   }

   public boolean aa() {
      return false;
   }
}
