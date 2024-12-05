import java.util.List;

public abstract class aeg extends aiw {
   private int dm = -1;
   private int dl = -1;
   private int dk = -1;
   private int dj = 0;
   private boolean di = false;
   public aig dr;
   private int dh;
   private int dg = 0;
   public double dq;
   public double dp;
   public double dn;

   public aeg(y6 var1) {
      super(var1);
      this.if(1.0F, 1.0F);
   }

   protected void X() {
   }

   public boolean a(double var1) {
      double var3 = this.aZ.a() * 4.0D;
      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   public aeg(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.if(1.0F, 1.0F);
      this.if(var2, var4, var6, this.a5, this.a4);
      this.try(var2, var4, var6);
      double var14 = (double)ajs.int(var8 * var8 + var10 * var10 + var12 * var12);
      this.dq = var8 / var14 * 0.1D;
      this.dp = var10 / var14 * 0.1D;
      this.dn = var12 / var14 * 0.1D;
   }

   public aeg(y6 var1, aig var2, double var3, double var5, double var7) {
      super(var1);
      this.dr = var2;
      this.if(1.0F, 1.0F);
      this.if(var2.al, var2.ak, var2.aj, var2.a5, var2.a4);
      this.try(this.al, this.ak, this.aj);
      this.aQ = 0.0F;
      this.ai = this.ah = this.ag = 0.0D;
      var3 += this.bm.nextGaussian() * 0.4D;
      var5 += this.bm.nextGaussian() * 0.4D;
      var7 += this.bm.nextGaussian() * 0.4D;
      double var9 = (double)ajs.int(var3 * var3 + var5 * var5 + var7 * var7);
      this.dq = var3 / var9 * 0.1D;
      this.dp = var5 / var9 * 0.1D;
      this.dn = var7 / var9 * 0.1D;
   }

   public void aC() {
      if (this.ap.goto || (this.dr == null || !this.dr.aR) && this.ap.p((int)this.al, (int)this.ak, (int)this.aj)) {
         super.aC();
         this.e(1);
         if (this.di) {
            int var1 = this.ap.new(this.dm, this.dl, this.dk);
            if (var1 == this.dj) {
               ++this.dh;
               if (this.dh == 600) {
                  this.az();
               }

               return;
            }

            this.di = false;
            this.ai *= (double)(this.bm.nextFloat() * 0.2F);
            this.ah *= (double)(this.bm.nextFloat() * 0.2F);
            this.ag *= (double)(this.bm.nextFloat() * 0.2F);
            this.dh = 0;
            this.dg = 0;
         } else {
            ++this.dg;
         }

         nr var15 = this.ap.do().a(this.al, this.ak, this.aj);
         nr var2 = this.ap.do().a(this.al + this.ai, this.ak + this.ah, this.aj + this.ag);
         nt var3 = this.ap.a(var15, var2);
         var15 = this.ap.do().a(this.al, this.ak, this.aj);
         var2 = this.ap.do().a(this.al + this.ai, this.ak + this.ah, this.aj + this.ag);
         if (var3 != null) {
            var2 = this.ap.do().a(var3.for.int, var3.for.for, var3.for.do);
         }

         aiw var4 = null;
         List var5 = this.ap.a((aiw)this, (nw)this.aZ.a(this.ai, this.ah, this.ag).do(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;

         for(int var8 = 0; var8 < var5.size(); ++var8) {
            aiw var9 = (aiw)var5.get(var8);
            if (var9.aw() && (!var9.do((aiw)this.dr) || this.dg >= 25)) {
               float var10 = 0.3F;
               nw var11 = var9.aZ.do((double)var10, (double)var10, (double)var10);
               nt var12 = var11.a(var15, var2);
               if (var12 != null) {
                  double var13 = var15.a(var12.for);
                  if (var13 < var6 || var6 == 0.0D) {
                     var4 = var9;
                     var6 = var13;
                  }
               }
            }
         }

         if (var4 != null) {
            var3 = new nt(var4);
         }

         if (var3 != null) {
            this.if(var3);
         }

         this.al += this.ai;
         this.ak += this.ah;
         this.aj += this.ag;
         float var16 = ajs.int(this.ai * this.ai + this.ag * this.ag);
         this.a5 = (float)(Math.atan2(this.ag, this.ai) * 180.0D / 3.1415927410125732D) + 90.0F;

         for(this.a4 = (float)(Math.atan2((double)var16, this.ah) * 180.0D / 3.1415927410125732D) - 90.0F; this.a4 - this.a0 < -180.0F; this.a0 -= 360.0F) {
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
         float var17 = this.a6();
         if (this.ap()) {
            for(int var18 = 0; var18 < 4; ++var18) {
               float var19 = 0.25F;
               this.ap.a("bubble", this.al - this.ai * (double)var19, this.ak - this.ah * (double)var19, this.aj - this.ag * (double)var19, this.ai, this.ah, this.ag);
            }

            var17 = 0.8F;
         }

         this.ai += this.dq;
         this.ah += this.dp;
         this.ag += this.dn;
         this.ai *= (double)var17;
         this.ah *= (double)var17;
         this.ag *= (double)var17;
         this.ap.a("smoke", this.al, this.ak + 0.5D, this.aj, 0.0D, 0.0D, 0.0D);
         this.try(this.al, this.ak, this.aj);
      } else {
         this.az();
      }
   }

   protected float a6() {
      return 0.95F;
   }

   protected abstract void if(nt var1);

   public void for(aqv var1) {
      var1.a("xTile", (short)this.dm);
      var1.a("yTile", (short)this.dl);
      var1.a("zTile", (short)this.dk);
      var1.a("inTile", (byte)this.dj);
      var1.a("inGround", (byte)(this.di ? 1 : 0));
      var1.a("direction", (aqd)this.a(new double[]{this.ai, this.ah, this.ag}));
   }

   public void try(aqv var1) {
      this.dm = var1.case("xTile");
      this.dl = var1.case("yTile");
      this.dk = var1.case("zTile");
      this.dj = var1.else("inTile") & 255;
      this.di = var1.else("inGround") == 1;
      if (var1.try("direction")) {
         aqm var2 = var1.void("direction");
         this.ai = ((aqs)var2.a(0)).else;
         this.ah = ((aqs)var2.a(1)).else;
         this.ag = ((aqs)var2.a(2)).else;
      } else {
         this.az();
      }

   }

   public boolean aw() {
      return true;
   }

   public float P() {
      return 1.0F;
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else {
         this.av();
         if (var1.new() != null) {
            nr var3 = var1.new().T();
            if (var3 != null) {
               this.ai = var3.int;
               this.ah = var3.for;
               this.ag = var3.do;
               this.dq = this.ai * 0.1D;
               this.dp = this.ah * 0.1D;
               this.dn = this.ag * 0.1D;
            }

            if (var1.new() instanceof aig) {
               this.dr = (aig)var1.new();
            }

            return true;
         } else {
            return false;
         }
      }
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
}
