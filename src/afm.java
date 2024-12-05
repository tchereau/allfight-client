import java.util.List;

public class afm extends aiw {
   private boolean dY;
   private double dX;
   private int dW;
   private double dV;
   private double dU;
   private double dT;
   private double dS;
   private double dR;
   private double dQ;
   private double dP;
   private double dO;

   public afm(y6 var1) {
      super(var1);
      this.dY = true;
      this.dX = 0.07D;
      this.at = true;
      this.if(1.5F, 0.6F);
      this.aQ = this.aO / 2.0F;
   }

   protected boolean aK() {
      return false;
   }

   protected void X() {
      this.bg.a(17, new Integer(0));
      this.bg.a(18, new Integer(1));
      this.bg.a(19, new Integer(0));
   }

   public nw case(aiw var1) {
      return var1.aZ;
   }

   public nw aL() {
      return this.aZ;
   }

   public boolean ax() {
      return true;
   }

   public afm(y6 var1, double var2, double var4, double var6) {
      this(var1);
      this.try(var2, var4 + (double)this.aQ, var6);
      this.ai = 0.0D;
      this.ah = 0.0D;
      this.ag = 0.0D;
      this.ao = var2;
      this.an = var4;
      this.am = var6;
   }

   public double O() {
      return (double)this.aO * 0.0D - 0.30000001192092896D;
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else if (!this.ap.goto && !this.aR) {
         this.o(-this.be());
         this.p(10);
         this.n(this.bf() + var2 * 10);
         this.av();
         boolean var3 = var1.new() instanceof aek && ((aek)var1.new()).fY.new;
         if (var3 || this.bf() > 40) {
            if (this.as != null) {
               this.as.int((aiw)this);
            }

            if (!var3) {
               this.a(abr.ct.A, 1, 0.0F);
            }

            this.az();
         }

         return true;
      } else {
         return true;
      }
   }

   public void aM() {
      this.o(-this.be());
      this.p(10);
      this.n(this.bf() * 11);
   }

   public boolean aw() {
      return !this.aR;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      if (this.dY) {
         this.dW = var9 + 5;
      } else {
         double var10 = var1 - this.al;
         double var12 = var3 - this.ak;
         double var14 = var5 - this.aj;
         double var16 = var10 * var10 + var12 * var12 + var14 * var14;
         if (!(var16 > 1.0D)) {
            return;
         }

         this.dW = 3;
      }

      this.dV = var1;
      this.dU = var3;
      this.dT = var5;
      this.dS = (double)var7;
      this.dR = (double)var8;
      this.ai = this.dQ;
      this.ah = this.dP;
      this.ag = this.dO;
   }

   public void new(double var1, double var3, double var5) {
      this.dQ = this.ai = var1;
      this.dP = this.ah = var3;
      this.dO = this.ag = var5;
   }

   public void aC() {
      super.aC();
      if (this.bg() > 0) {
         this.p(this.bg() - 1);
      }

      if (this.bf() > 0) {
         this.n(this.bf() - 1);
      }

      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      byte var1 = 5;
      double var2 = 0.0D;

      for(int var4 = 0; var4 < var1; ++var4) {
         double var5 = this.aZ.a + (this.aZ.int - this.aZ.a) * (double)(var4 + 0) / (double)var1 - 0.125D;
         double var7 = this.aZ.a + (this.aZ.int - this.aZ.a) * (double)(var4 + 1) / (double)var1 - 0.125D;
         nw var9 = nw.if().a(this.aZ.if, var5, this.aZ.try, this.aZ.new, var7, this.aZ.for);
         if (this.ap.a(var9, ts.s)) {
            var2 += 1.0D / (double)var1;
         }
      }

      double var23 = Math.sqrt(this.ai * this.ai + this.ag * this.ag);
      double var6;
      double var8;
      if (var23 > 0.26249999999999996D) {
         var6 = Math.cos((double)this.a5 * 3.141592653589793D / 180.0D);
         var8 = Math.sin((double)this.a5 * 3.141592653589793D / 180.0D);

         for(int var10 = 0; (double)var10 < 1.0D + var23 * 60.0D; ++var10) {
            double var11 = (double)(this.bm.nextFloat() * 2.0F - 1.0F);
            double var13 = (double)(this.bm.nextInt(2) * 2 - 1) * 0.7D;
            double var15;
            double var17;
            if (this.bm.nextBoolean()) {
               var15 = this.al - var6 * var11 * 0.8D + var8 * var13;
               var17 = this.aj - var8 * var11 * 0.8D - var6 * var13;
               this.ap.a("splash", var15, this.ak - 0.125D, var17, this.ai, this.ah, this.ag);
            } else {
               var15 = this.al + var6 + var8 * var11 * 0.7D;
               var17 = this.aj + var8 - var6 * var11 * 0.7D;
               this.ap.a("splash", var15, this.ak - 0.125D, var17, this.ai, this.ah, this.ag);
            }
         }
      }

      double var12;
      double var25;
      if (this.ap.goto && this.dY) {
         if (this.dW > 0) {
            var6 = this.al + (this.dV - this.al) / (double)this.dW;
            var8 = this.ak + (this.dU - this.ak) / (double)this.dW;
            var25 = this.aj + (this.dT - this.aj) / (double)this.dW;
            var12 = ajs.do(this.dS - (double)this.a5);
            this.a5 = (float)((double)this.a5 + var12 / (double)this.dW);
            this.a4 = (float)((double)this.a4 + (this.dR - (double)this.a4) / (double)this.dW);
            --this.dW;
            this.try(var6, var8, var25);
            this.do(this.a5, this.a4);
         } else {
            var6 = this.al + this.ai;
            var8 = this.ak + this.ah;
            var25 = this.aj + this.ag;
            this.try(var6, var8, var25);
            if (this.aY) {
               this.ai *= 0.5D;
               this.ah *= 0.5D;
               this.ag *= 0.5D;
            }

            this.ai *= 0.9900000095367432D;
            this.ah *= 0.949999988079071D;
            this.ag *= 0.9900000095367432D;
         }

      } else {
         if (var2 < 1.0D) {
            var6 = var2 * 2.0D - 1.0D;
            this.ah += 0.03999999910593033D * var6;
         } else {
            if (this.ah < 0.0D) {
               this.ah /= 2.0D;
            }

            this.ah += 0.007000000216066837D;
         }

         if (this.as != null) {
            this.ai += this.as.ai * this.dX;
            this.ag += this.as.ag * this.dX;
         }

         var6 = Math.sqrt(this.ai * this.ai + this.ag * this.ag);
         if (var6 > 0.35D) {
            var8 = 0.35D / var6;
            this.ai *= var8;
            this.ag *= var8;
            var6 = 0.35D;
         }

         if (var6 > var23 && this.dX < 0.35D) {
            this.dX += (0.35D - this.dX) / 35.0D;
            if (this.dX > 0.35D) {
               this.dX = 0.35D;
            }
         } else {
            this.dX -= (this.dX - 0.07D) / 35.0D;
            if (this.dX < 0.07D) {
               this.dX = 0.07D;
            }
         }

         if (this.aY) {
            this.ai *= 0.5D;
            this.ah *= 0.5D;
            this.ag *= 0.5D;
         }

         this.do(this.ai, this.ah, this.ag);
         if (this.aX && var23 > 0.2D) {
            if (!this.ap.goto) {
               this.az();

               int var24;
               for(var24 = 0; var24 < 3; ++var24) {
                  this.a(pa.be.void, 1, 0.0F);
               }

               for(var24 = 0; var24 < 2; ++var24) {
                  this.a(abr.a9.A, 1, 0.0F);
               }
            }
         } else {
            this.ai *= 0.9900000095367432D;
            this.ah *= 0.949999988079071D;
            this.ag *= 0.9900000095367432D;
         }

         this.a4 = 0.0F;
         var8 = (double)this.a5;
         var25 = this.ao - this.al;
         var12 = this.am - this.aj;
         if (var25 * var25 + var12 * var12 > 0.001D) {
            var8 = (double)((float)(Math.atan2(var12, var25) * 180.0D / 3.141592653589793D));
         }

         double var14 = ajs.do(var8 - (double)this.a5);
         if (var14 > 20.0D) {
            var14 = 20.0D;
         }

         if (var14 < -20.0D) {
            var14 = -20.0D;
         }

         this.a5 = (float)((double)this.a5 + var14);
         this.do(this.a5, this.a4);
         if (!this.ap.goto) {
            List var16 = this.ap.a((aiw)this, (nw)this.aZ.do(0.20000000298023224D, 0.0D, 0.20000000298023224D));
            int var26;
            if (var16 != null && !var16.isEmpty()) {
               for(var26 = 0; var26 < var16.size(); ++var26) {
                  aiw var18 = (aiw)var16.get(var26);
                  if (var18 != this.as && var18.ax() && var18 instanceof afm) {
                     var18.try((aiw)this);
                  }
               }
            }

            for(var26 = 0; var26 < 4; ++var26) {
               int var27 = ajs.a(this.al + ((double)(var26 % 2) - 0.5D) * 0.8D);
               int var19 = ajs.a(this.aj + ((double)(var26 / 2) - 0.5D) * 0.8D);

               for(int var20 = 0; var20 < 2; ++var20) {
                  int var21 = ajs.a(this.ak) + var20;
                  int var22 = this.ap.new(var27, var21, var19);
                  if (var22 == pa.ca.void) {
                     this.ap.o(var27, var21, var19);
                  } else if (var22 == pa.b0.void) {
                     this.ap.int(var27, var21, var19, true);
                  }
               }
            }

            if (this.as != null && this.as.aR) {
               this.as = null;
            }

         }
      }
   }

   public void aI() {
      if (this.as != null) {
         double var1 = Math.cos((double)this.a5 * 3.141592653589793D / 180.0D) * 0.4D;
         double var3 = Math.sin((double)this.a5 * 3.141592653589793D / 180.0D) * 0.4D;
         this.as.try(this.al + var1, this.ak + this.O() + this.as.aQ(), this.aj + var3);
      }
   }

   protected void for(aqv var1) {
   }

   protected void try(aqv var1) {
   }

   public float aH() {
      return 0.0F;
   }

   public boolean for(aek var1) {
      if (this.as != null && this.as instanceof aek && this.as != var1) {
         return true;
      } else {
         if (!this.ap.goto) {
            var1.int(this);
         }

         return true;
      }
   }

   public void n(int var1) {
      this.bg.if(19, var1);
   }

   public int bf() {
      return this.bg.int(19);
   }

   public void p(int var1) {
      this.bg.if(17, var1);
   }

   public int bg() {
      return this.bg.int(17);
   }

   public void o(int var1) {
      this.bg.if(18, var1);
   }

   public int be() {
      return this.bg.int(18);
   }

   public void void(boolean var1) {
      this.dY = var1;
   }
}
