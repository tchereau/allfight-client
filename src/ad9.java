import java.util.List;

public abstract class ad9 extends aiw implements aec {
   private int cQ = -1;
   private int cP = -1;
   private int cO = -1;
   private int cN = 0;
   protected boolean cS = false;
   public int cR = 0;
   private aig cM;
   private String cL = null;
   private int cK;
   private int cJ = 0;

   public ad9(y6 var1) {
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

   public ad9(y6 var1, aig var2) {
      super(var1);
      this.cM = var2;
      this.if(0.25F, 0.25F);
      this.if(var2.al, var2.ak + (double)var2.af(), var2.aj, var2.a5, var2.a4);
      this.al -= (double)(ajs.for(this.a5 / 180.0F * 3.1415927F) * 0.16F);
      this.ak -= 0.10000000149011612D;
      this.aj -= (double)(ajs.try(this.a5 / 180.0F * 3.1415927F) * 0.16F);
      this.try(this.al, this.ak, this.aj);
      this.aQ = 0.0F;
      float var3 = 0.4F;
      this.ai = (double)(-ajs.try(this.a5 / 180.0F * 3.1415927F) * ajs.for(this.a4 / 180.0F * 3.1415927F) * var3);
      this.ag = (double)(ajs.for(this.a5 / 180.0F * 3.1415927F) * ajs.for(this.a4 / 180.0F * 3.1415927F) * var3);
      this.ah = (double)(-ajs.try((this.a4 + this.a0()) / 180.0F * 3.1415927F) * var3);
      this.do(this.ai, this.ah, this.ag, this.a2(), 1.0F);
   }

   public ad9(y6 var1, double var2, double var4, double var6) {
      super(var1);
      this.cK = 0;
      this.if(0.25F, 0.25F);
      this.try(var2, var4, var6);
      this.aQ = 0.0F;
   }

   protected float a2() {
      return 1.5F;
   }

   protected float a0() {
      return 0.0F;
   }

   public void do(double var1, double var3, double var5, float var7, float var8) {
      float var9 = ajs.int(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.bm.nextGaussian() * 0.007499999832361937D * (double)var8;
      var3 += this.bm.nextGaussian() * 0.007499999832361937D * (double)var8;
      var5 += this.bm.nextGaussian() * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.ai = var1;
      this.ah = var3;
      this.ag = var5;
      float var10 = ajs.int(var1 * var1 + var5 * var5);
      this.a2 = this.a5 = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
      this.a0 = this.a4 = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.1415927410125732D);
      this.cK = 0;
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
      if (this.cR > 0) {
         --this.cR;
      }

      if (this.cS) {
         int var1 = this.ap.new(this.cQ, this.cP, this.cO);
         if (var1 == this.cN) {
            ++this.cK;
            if (this.cK == 1200) {
               this.az();
            }

            return;
         }

         this.cS = false;
         this.ai *= (double)(this.bm.nextFloat() * 0.2F);
         this.ah *= (double)(this.bm.nextFloat() * 0.2F);
         this.ag *= (double)(this.bm.nextFloat() * 0.2F);
         this.cK = 0;
         this.cJ = 0;
      } else {
         ++this.cJ;
      }

      nr var16 = this.ap.do().a(this.al, this.ak, this.aj);
      nr var2 = this.ap.do().a(this.al + this.ai, this.ak + this.ah, this.aj + this.ag);
      nt var3 = this.ap.a(var16, var2);
      var16 = this.ap.do().a(this.al, this.ak, this.aj);
      var2 = this.ap.do().a(this.al + this.ai, this.ak + this.ah, this.aj + this.ag);
      if (var3 != null) {
         var2 = this.ap.do().a(var3.for.int, var3.for.for, var3.for.do);
      }

      if (!this.ap.goto) {
         aiw var4 = null;
         List var5 = this.ap.a((aiw)this, (nw)this.aZ.a(this.ai, this.ah, this.ag).do(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;
         aig var8 = this.a3();

         for(int var9 = 0; var9 < var5.size(); ++var9) {
            aiw var10 = (aiw)var5.get(var9);
            if (var10.aw() && (var10 != var8 || this.cJ >= 5)) {
               float var11 = 0.3F;
               nw var12 = var10.aZ.do((double)var11, (double)var11, (double)var11);
               nt var13 = var12.a(var16, var2);
               if (var13 != null) {
                  double var14 = var16.a(var13.for);
                  if (var14 < var6 || var6 == 0.0D) {
                     var4 = var10;
                     var6 = var14;
                  }
               }
            }
         }

         if (var4 != null) {
            var3 = new nt(var4);
         }
      }

      if (var3 != null) {
         if (var3.if == ns.if && this.ap.new(var3.a, var3.try, var3.new) == pa.aK.void) {
            this.aR();
         } else {
            this.a(var3);
         }
      }

      this.al += this.ai;
      this.ak += this.ah;
      this.aj += this.ag;
      float var17 = ajs.int(this.ai * this.ai + this.ag * this.ag);
      this.a5 = (float)(Math.atan2(this.ai, this.ag) * 180.0D / 3.1415927410125732D);

      for(this.a4 = (float)(Math.atan2(this.ah, (double)var17) * 180.0D / 3.1415927410125732D); this.a4 - this.a0 < -180.0F; this.a0 -= 360.0F) {
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
      float var18 = 0.99F;
      float var19 = this.a1();
      if (this.ap()) {
         for(int var7 = 0; var7 < 4; ++var7) {
            float var20 = 0.25F;
            this.ap.a("bubble", this.al - this.ai * (double)var20, this.ak - this.ah * (double)var20, this.aj - this.ag * (double)var20, this.ai, this.ah, this.ag);
         }

         var18 = 0.8F;
      }

      this.ai *= (double)var18;
      this.ah *= (double)var18;
      this.ag *= (double)var18;
      this.ah -= (double)var19;
      this.try(this.al, this.ak, this.aj);
   }

   protected float a1() {
      return 0.03F;
   }

   protected abstract void a(nt var1);

   public void for(aqv var1) {
      var1.a("xTile", (short)this.cQ);
      var1.a("yTile", (short)this.cP);
      var1.a("zTile", (short)this.cO);
      var1.a("inTile", (byte)this.cN);
      var1.a("shake", (byte)this.cR);
      var1.a("inGround", (byte)(this.cS ? 1 : 0));
      if ((this.cL == null || this.cL.length() == 0) && this.cM != null && this.cM instanceof aek) {
         this.cL = this.cM.aB();
      }

      var1.a("ownerName", this.cL == null ? "" : this.cL);
   }

   public void try(aqv var1) {
      this.cQ = var1.case("xTile");
      this.cP = var1.case("yTile");
      this.cO = var1.case("zTile");
      this.cN = var1.else("inTile") & 255;
      this.cR = var1.else("shake") & 255;
      this.cS = var1.else("inGround") == 1;
      this.cL = var1.new("ownerName");
      if (this.cL != null && this.cL.length() == 0) {
         this.cL = null;
      }

   }

   public float aH() {
      return 0.0F;
   }

   public aig a3() {
      if (this.cM == null && this.cL != null && this.cL.length() > 0) {
         this.cM = this.ap.if(this.cL);
      }

      return this.cM;
   }
}
