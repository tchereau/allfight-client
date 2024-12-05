import java.util.List;

public class aei extends aiw implements aec {
   private int cE = -1;
   private int cD = -1;
   private int cC = -1;
   private int cB = 0;
   private int cA = 0;
   private boolean cz = false;
   private static boolean cx = false;
   private static boolean ct = false;
   private static boolean cH = false;
   public int cI = 0;
   public int cG = 0;
   public aiw cF;
   private int cy;
   private int cw = 0;
   private double cv = 2.0D;
   private int cu;

   public aei(y6 var1) {
      super(var1);
      this.au = 10.0D;
      this.if(0.5F, 0.5F);
   }

   public aei(y6 var1, double var2, double var4, double var6) {
      super(var1);
      this.au = 10.0D;
      this.if(0.5F, 0.5F);
      this.try(var2, var4, var6);
      this.aQ = 0.0F;
   }

   public aei(y6 var1, aig var2, aig var3, float var4, float var5) {
      super(var1);
      this.au = 10.0D;
      this.cF = var2;
      if (var2 instanceof aek) {
         this.cI = 1;
      }

      this.ak = var2.ak + (double)var2.af() - 0.10000000149011612D;
      double var6 = var3.al - var2.al;
      double var8 = var3.aZ.a + (double)(var3.aO / 3.0F) - this.ak;
      double var10 = var3.aj - var2.aj;
      double var12 = (double)ajs.int(var6 * var6 + var10 * var10);
      if (var12 >= 1.0E-7D) {
         float var14 = (float)(Math.atan2(var10, var6) * 180.0D / 3.141592653589793D) - 90.0F;
         float var15 = (float)(-(Math.atan2(var8, var12) * 180.0D / 3.141592653589793D));
         double var16 = var6 / var12;
         double var18 = var10 / var12;
         this.if(var2.al + var16, this.ak, var2.aj + var18, var14, var15);
         this.aQ = 0.0F;
         float var20 = (float)var12 * 0.2F;
         this.do(var6, var8 + (double)var20, var10, var4, var5);
      }

   }

   public aei(y6 var1, aig var2, float var3) {
      super(var1);
      this.au = 10.0D;
      this.cF = var2;
      if (var2 instanceof aek) {
         this.cI = 1;
      }

      this.if(0.5F, 0.5F);
      this.if(var2.al, var2.ak + (double)var2.af(), var2.aj, var2.a5, var2.a4);
      this.al -= (double)(ajs.for(this.a5 / 180.0F * 3.1415927F) * 0.16F);
      this.ak -= 0.10000000149011612D;
      this.aj -= (double)(ajs.try(this.a5 / 180.0F * 3.1415927F) * 0.16F);
      this.try(this.al, this.ak, this.aj);
      this.aQ = 0.0F;
      this.ai = (double)(-ajs.try(this.a5 / 180.0F * 3.1415927F) * ajs.for(this.a4 / 180.0F * 3.1415927F));
      this.ag = (double)(ajs.for(this.a5 / 180.0F * 3.1415927F) * ajs.for(this.a4 / 180.0F * 3.1415927F));
      this.ah = (double)(-ajs.try(this.a4 / 180.0F * 3.1415927F));
      this.do(this.ai, this.ah, this.ag, var3 * 1.5F, 1.0F);
   }

   protected void X() {
      this.bg.a(16, (byte)0);
   }

   public void do(double var1, double var3, double var5, float var7, float var8) {
      float var9 = ajs.int(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.bm.nextGaussian() * (double)(this.bm.nextBoolean() ? -1 : 1) * 0.007499999832361937D * (double)var8;
      var3 += this.bm.nextGaussian() * (double)(this.bm.nextBoolean() ? -1 : 1) * 0.007499999832361937D * (double)var8;
      var5 += this.bm.nextGaussian() * (double)(this.bm.nextBoolean() ? -1 : 1) * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.ai = var1;
      this.ah = var3;
      this.ag = var5;
      float var10 = ajs.int(var1 * var1 + var5 * var5);
      this.a2 = this.a5 = (float)(Math.atan2(var1, var5) * 180.0D / 3.141592653589793D);
      this.a0 = this.a4 = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.141592653589793D);
      this.cy = 0;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.try(var1, var3, var5);
      this.do(var7, var8);
   }

   public void new(double var1, double var3, double var5) {
      this.ai = var1;
      this.ah = var3;
      this.ag = var5;
      if (this.a0 == 0.0F && this.a2 == 0.0F) {
         float var7 = ajs.int(var1 * var1 + var5 * var5);
         this.a2 = this.a5 = (float)(Math.atan2(var1, var5) * 180.0D / 3.141592653589793D);
         this.a0 = this.a4 = (float)(Math.atan2(var3, (double)var7) * 180.0D / 3.141592653589793D);
         this.a0 = this.a4;
         this.a2 = this.a5;
         this.if(this.al, this.ak, this.aj, this.a5, this.a4);
         this.cy = 0;
      }

   }

   public void aC() {
      super.aC();
      if (this.a0 == 0.0F && this.a2 == 0.0F) {
         float var1 = ajs.int(this.ai * this.ai + this.ag * this.ag);
         this.a2 = this.a5 = (float)(Math.atan2(this.ai, this.ag) * 180.0D / 3.141592653589793D);
         this.a0 = this.a4 = (float)(Math.atan2(this.ah, (double)var1) * 180.0D / 3.141592653589793D);
      }

      int var16 = this.ap.new(this.cE, this.cD, this.cC);
      if (var16 > 0) {
         pa.x[var16].int((yy)this.ap, this.cE, this.cD, this.cC);
         nw var2 = pa.x[var16].int(this.ap, this.cE, this.cD, this.cC);
         if (var2 != null && var2.for(this.ap.do().a(this.al, this.ak, this.aj))) {
            this.cz = true;
         }
      }

      if (this.cG > 0) {
         --this.cG;
      }

      if (this.cz) {
         int var17 = this.ap.new(this.cE, this.cD, this.cC);
         int var3 = this.ap.for(this.cE, this.cD, this.cC);
         if (var17 == this.cB && var3 == this.cA) {
            ++this.cy;
            if (this.cy == 1200) {
               this.az();
            }
         } else {
            this.cz = false;
            this.ai *= (double)(this.bm.nextFloat() * 0.2F);
            this.ah *= (double)(this.bm.nextFloat() * 0.2F);
            this.ag *= (double)(this.bm.nextFloat() * 0.2F);
            this.cy = 0;
            this.cw = 0;
         }
      } else {
         ++this.cw;
         nr var18 = this.ap.do().a(this.al, this.ak, this.aj);
         nr var19 = this.ap.do().a(this.al + this.ai, this.ak + this.ah, this.aj + this.ag);
         nt var4 = this.ap.a(var18, var19, false, true);
         var18 = this.ap.do().a(this.al, this.ak, this.aj);
         var19 = this.ap.do().a(this.al + this.ai, this.ak + this.ah, this.aj + this.ag);
         if (var4 != null) {
            var19 = this.ap.do().a(var4.for.int, var4.for.for, var4.for.do);
         }

         aiw var5 = null;
         List var6 = this.ap.a((aiw)this, (nw)this.aZ.a(this.ai, this.ah, this.ag).do(1.0D, 1.0D, 1.0D));
         double var7 = 0.0D;

         int var9;
         float var10;
         for(var9 = 0; var9 < var6.size(); ++var9) {
            aiw var11 = (aiw)var6.get(var9);
            if (var11.aw() && (var11 != this.cF || this.cw >= 5)) {
               var10 = 0.3F;
               nw var12 = var11.aZ.do((double)var10, (double)var10, (double)var10);
               nt var13 = var12.a(var18, var19);
               if (var13 != null) {
                  double var14 = var18.a(var13.for);
                  if (var14 < var7 || var7 == 0.0D) {
                     var5 = var11;
                     var7 = var14;
                  }
               }
            }
         }

         if (var5 != null) {
            var4 = new nt(var5);
         }

         if (var4 != null && var4.do != null && var4.do instanceof aek) {
            aek var20 = (aek)var4.do;
            if (var20.fY.if || this.cF instanceof aek && !((aek)this.cF).try(var20)) {
               var4 = null;
            }
         }

         float var21;
         float var22;
         if (var4 != null) {
            if (var4.do != null) {
               var21 = ajs.int(this.ai * this.ai + this.ah * this.ah + this.ag * this.ag);
               int var23 = ajs.new((double)var21 * this.cv);
               if (this.aY()) {
                  var23 += this.bm.nextInt(var23 / 2 + 2);
               }

               ai4 var24 = null;
               if (this.cF == null) {
                  var24 = ai4.a((aei)this, this);
               } else {
                  var24 = ai4.a(this, this.cF);
               }

               if (this.aP() && !(var4.do instanceof ae6)) {
                  var4.do.e(5);
               }

               if (var4.do.a(var24, var23)) {
                  if (var4.do instanceof aig) {
                     aig var15 = (aig)var4.do;
                     if (!this.ap.goto) {
                        var15.y(var15.bt() + 1);
                     }

                     if (this.cu > 0) {
                        var22 = ajs.int(this.ai * this.ai + this.ag * this.ag);
                        if (var22 > 0.0F) {
                           var4.do.byte(this.ai * (double)this.cu * 0.6000000238418579D / (double)var22, 0.1D, this.ag * (double)this.cu * 0.6000000238418579D / (double)var22);
                        }
                     }

                     if (this.cF != null) {
                        zq.a(this.cF, var15, this.bm);
                     }

                     if (this.cF != null && var4.do != this.cF && var4.do instanceof aek && this.cF instanceof ak2) {
                        ((ak2)this.cF).pV.if((an7)(new aoq(6, 0)));
                     }
                  }

                  this.a("random.bowhit", 1.0F, 1.2F / (this.bm.nextFloat() * 0.2F + 0.9F));
                  if (!(var4.do instanceof ae6)) {
                     this.az();
                  }
               } else {
                  this.ai *= -0.10000000149011612D;
                  this.ah *= -0.10000000149011612D;
                  this.ag *= -0.10000000149011612D;
                  this.a5 += 180.0F;
                  this.a2 += 180.0F;
                  this.cw = 0;
               }
            } else {
               this.cE = var4.a;
               this.cD = var4.try;
               this.cC = var4.new;
               this.cB = this.ap.new(this.cE, this.cD, this.cC);
               this.cA = this.ap.for(this.cE, this.cD, this.cC);
               this.ai = (double)((float)(var4.for.int - this.al));
               this.ah = (double)((float)(var4.for.for - this.ak));
               this.ag = (double)((float)(var4.for.do - this.aj));
               var21 = ajs.int(this.ai * this.ai + this.ah * this.ah + this.ag * this.ag);
               this.al -= this.ai / (double)var21 * 0.05000000074505806D;
               this.ak -= this.ah / (double)var21 * 0.05000000074505806D;
               this.aj -= this.ag / (double)var21 * 0.05000000074505806D;
               this.a("random.bowhit", 1.0F, 1.2F / (this.bm.nextFloat() * 0.2F + 0.9F));
               this.cz = true;
               ct = false;
               cx = false;
               cH = false;
               this.cG = 7;
               this.char(false);
               if (this.cB != 0) {
                  pa.x[this.cB].if(this.ap, this.cE, this.cD, this.cC, (aiw)this);
               }
            }
         }

         if (this.aY()) {
            for(var9 = 0; var9 < 4; ++var9) {
               this.ap.a("crit", this.al + this.ai * (double)var9 / 4.0D, this.ak + this.ah * (double)var9 / 4.0D, this.aj + this.ag * (double)var9 / 4.0D, -this.ai, -this.ah + 0.2D, -this.ag);
            }
         }

         this.al += this.ai;
         this.ak += this.ah;
         this.aj += this.ag;
         var21 = ajs.int(this.ai * this.ai + this.ag * this.ag);
         this.a5 = (float)(Math.atan2(this.ai, this.ag) * 180.0D / 3.141592653589793D);

         for(this.a4 = (float)(Math.atan2(this.ah, (double)var21) * 180.0D / 3.141592653589793D); this.a4 - this.a0 < -180.0F; this.a0 -= 360.0F) {
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
         float var25 = 0.99F;
         var10 = 0.05F;
         if (this.ap()) {
            for(int var26 = 0; var26 < 4; ++var26) {
               var22 = 0.25F;
               this.ap.a("bubble", this.al - this.ai * (double)var22, this.ak - this.ah * (double)var22, this.aj - this.ag * (double)var22, this.ai, this.ah, this.ag);
            }

            var25 = 0.8F;
         }

         if (cx) {
            this.ap.a("portal", this.al, this.ak, this.aj, -this.ai * 0.1D, -this.ah * 0.1D, -this.ag * 0.1D);
            this.ap.a("enchantmenttable", this.al, this.ak, this.aj, -this.ai * 0.1D, -this.ah * 0.1D, -this.ag * 0.1D);
         }

         if (ct) {
            this.ap.a("cloud", this.al, this.ak, this.aj, -this.ai * 0.1D, -this.ah * 0.1D, -this.ag * 0.1D);
         }

         if (cH) {
            this.ap.a("magicCrit", this.al, this.ak, this.aj, -this.ai * 0.1D, -this.ah * 0.1D, -this.ag * 0.1D);
         }

         this.ai *= (double)var25;
         this.ah *= (double)var25;
         this.ag *= (double)var25;
         this.ah -= (double)var10;
         this.try(this.al, this.ak, this.aj);
         this.ai();
      }

   }

   public void for(aqv var1) {
      var1.a("xTile", (short)this.cE);
      var1.a("yTile", (short)this.cD);
      var1.a("zTile", (short)this.cC);
      var1.a("inTile", (byte)this.cB);
      var1.a("inData", (byte)this.cA);
      var1.a("shake", (byte)this.cG);
      var1.a("inGround", (byte)(this.cz ? 1 : 0));
      var1.a("pickup", (byte)this.cI);
      var1.a("damage", this.cv);
   }

   public void try(aqv var1) {
      this.cE = var1.case("xTile");
      this.cD = var1.case("yTile");
      this.cC = var1.case("zTile");
      this.cB = var1.else("inTile") & 255;
      this.cA = var1.else("inData") & 255;
      this.cG = var1.else("shake") & 255;
      this.cz = var1.else("inGround") == 1;
      if (var1.try("damage")) {
         this.cv = var1.c("damage");
      }

      if (var1.try("pickup")) {
         this.cI = var1.else("pickup");
      } else if (var1.try("player")) {
         this.cI = var1.if("player") ? 1 : 0;
      }

   }

   public void do(aek var1) {
      if (!this.ap.goto && this.cz && this.cG <= 0) {
         boolean var2 = this.cI == 1 || this.cI == 2 && var1.fY.new;
         if (this.cI == 1 && !var1.fR.new(new abp(abr.T, 1))) {
            var2 = false;
         }

         if (var2) {
            this.a("random.pop", 0.2F, ((this.bm.nextFloat() - this.bm.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.if(this, 1);
            this.az();
         }
      }

   }

   protected boolean aK() {
      return false;
   }

   public float aH() {
      return 0.0F;
   }

   public void if(double var1) {
      this.cv = var1;
   }

   public void byte(boolean var1) {
      cx = var1;
   }

   public void else(boolean var1) {
      ct = var1;
   }

   public void case(boolean var1) {
      cH = var1;
   }

   public double aZ() {
      return this.cv;
   }

   public void l(int var1) {
      this.cu = var1;
   }

   public boolean aa() {
      return false;
   }

   public void char(boolean var1) {
      byte var2 = this.bg.for(16);
      if (var1) {
         this.bg.if(16, (byte)(var2 | 1));
      } else {
         this.bg.if(16, (byte)(var2 & -2));
      }

   }

   public boolean aY() {
      byte var1 = this.bg.for(16);
      return (var1 & 1) != 0;
   }
}
