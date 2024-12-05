import java.util.Iterator;
import java.util.List;

public class afr extends aig implements afv, afu {
   public double qD;
   public double qC;
   public double qB;
   public double[][] qA = new double[64][3];
   public int qz = -1;
   public aft[] qy;
   public aft qx;
   public aft qw;
   public aft qv;
   public aft qt;
   public aft qu;
   public aft qs;
   public aft qr;
   public float qq = 0.0F;
   public float qp = 0.0F;
   public boolean qo = false;
   public boolean qn = false;
   private aiw qk;
   public int qm = 0;
   public afs ql = null;

   public afr(y6 var1) {
      super(var1);
      this.qy = new aft[]{this.qx = new aft(this, "head", 6.0F, 6.0F), this.qw = new aft(this, "body", 8.0F, 8.0F), this.qv = new aft(this, "tail", 4.0F, 4.0F), this.qt = new aft(this, "tail", 4.0F, 4.0F), this.qu = new aft(this, "tail", 4.0F, 4.0F), this.qs = new aft(this, "wing", 4.0F, 4.0F), this.qr = new aft(this, "wing", 4.0F, 4.0F)};
      this.t(this.b0());
      this.ft = "/mob/enderdragon/ender.png";
      this.if(16.0F, 8.0F);
      this.aE = true;
      this.bh = true;
      this.qC = 100.0D;
      this.bb = true;
   }

   public int b0() {
      return 200;
   }

   protected void X() {
      super.X();
      this.bg.a(16, new Integer(this.b0()));
   }

   public double[] if(int var1, float var2) {
      if (this.fi <= 0) {
         var2 = 0.0F;
      }

      var2 = 1.0F - var2;
      int var3 = this.qz - var1 * 1 & 63;
      int var4 = this.qz - var1 * 1 - 1 & 63;
      double[] var5 = new double[3];
      double var6 = this.qA[var3][0];
      double var8 = ajs.do(this.qA[var4][0] - var6);
      var5[0] = var6 + var8 * (double)var2;
      var6 = this.qA[var3][1];
      var8 = this.qA[var4][1] - var6;
      var5[1] = var6 + var8 * (double)var2;
      var5[2] = this.qA[var3][2] + (this.qA[var4][2] - this.qA[var3][2]) * (double)var2;
      return var5;
   }

   public void bU() {
      float var1;
      float var2;
      if (!this.ap.goto) {
         this.bg.if(16, this.fi);
      } else {
         var1 = ajs.for(this.qp * 3.1415927F * 2.0F);
         var2 = ajs.for(this.qq * 3.1415927F * 2.0F);
         if (var2 <= -0.3F && var1 >= -0.3F) {
            this.ap.a(this.al, this.ak, this.aj, "mob.enderdragon.wings", 5.0F, 0.8F + this.bm.nextFloat() * 0.3F, false);
         }
      }

      this.qq = this.qp;
      float var3;
      if (this.fi <= 0) {
         var1 = (this.bm.nextFloat() - 0.5F) * 8.0F;
         var2 = (this.bm.nextFloat() - 0.5F) * 4.0F;
         var3 = (this.bm.nextFloat() - 0.5F) * 8.0F;
         this.ap.a("largeexplode", this.al + (double)var1, this.ak + 2.0D + (double)var2, this.aj + (double)var3, 0.0D, 0.0D, 0.0D);
      } else {
         this.e8();
         var1 = 0.2F / (ajs.int(this.ai * this.ai + this.ag * this.ag) * 10.0F + 1.0F);
         var1 *= (float)Math.pow(2.0D, this.ah);
         if (this.qn) {
            this.qp += var1 * 0.5F;
         } else {
            this.qp += var1;
         }

         this.a5 = ajs.int(this.a5);
         if (this.qz < 0) {
            for(int var25 = 0; var25 < this.qA.length; ++var25) {
               this.qA[var25][0] = (double)this.a5;
               this.qA[var25][1] = this.ak;
            }
         }

         if (++this.qz == this.qA.length) {
            this.qz = 0;
         }

         this.qA[this.qz][0] = (double)this.a5;
         this.qA[this.qz][1] = this.ak;
         double var4;
         double var6;
         double var8;
         double var26;
         float var31;
         if (this.ap.goto) {
            if (this.ej > 0) {
               var26 = this.al + (this.eh - this.al) / (double)this.ej;
               var4 = this.ak + (this.ef - this.ak) / (double)this.ej;
               var6 = this.aj + (this.ed - this.aj) / (double)this.ej;
               var8 = ajs.do(this.eb - (double)this.a5);
               this.a5 = (float)((double)this.a5 + var8 / (double)this.ej);
               this.a4 = (float)((double)this.a4 + (this.d9 - (double)this.a4) / (double)this.ej);
               --this.ej;
               this.try(var26, var4, var6);
               this.do(this.a5, this.a4);
            }
         } else {
            var26 = this.qD - this.al;
            var4 = this.qC - this.ak;
            var6 = this.qB - this.aj;
            var8 = var26 * var26 + var4 * var4 + var6 * var6;
            if (this.qk != null) {
               this.qD = this.qk.al;
               this.qB = this.qk.aj;
               double var10 = this.qD - this.al;
               double var12 = this.qB - this.aj;
               double var14 = Math.sqrt(var10 * var10 + var12 * var12);
               double var16 = 0.4000000059604645D + var14 / 80.0D - 1.0D;
               if (var16 > 10.0D) {
                  var16 = 10.0D;
               }

               this.qC = this.qk.aZ.a + var16;
            } else {
               this.qD += this.bm.nextGaussian() * 2.0D;
               this.qB += this.bm.nextGaussian() * 2.0D;
            }

            if (this.qo || var8 < 100.0D || var8 > 22500.0D || this.aX || this.aW) {
               this.e9();
            }

            var4 /= (double)ajs.int(var26 * var26 + var6 * var6);
            var31 = 0.6F;
            if (var4 < (double)(-var31)) {
               var4 = (double)(-var31);
            }

            if (var4 > (double)var31) {
               var4 = (double)var31;
            }

            this.ah += var4 * 0.10000000149011612D;
            this.a5 = ajs.int(this.a5);
            double var11 = 180.0D - Math.atan2(var26, var6) * 180.0D / 3.1415927410125732D;
            double var13 = ajs.do(var11 - (double)this.a5);
            if (var13 > 50.0D) {
               var13 = 50.0D;
            }

            if (var13 < -50.0D) {
               var13 = -50.0D;
            }

            nr var15 = this.ap.do().a(this.qD - this.al, this.qC - this.ak, this.qB - this.aj).if();
            nr var39 = this.ap.do().a((double)ajs.try(this.a5 * 3.1415927F / 180.0F), this.ah, (double)(-ajs.for(this.a5 * 3.1415927F / 180.0F))).if();
            float var17 = (float)(var39.int(var15) + 0.5D) / 1.5F;
            if (var17 < 0.0F) {
               var17 = 0.0F;
            }

            this.e5 *= 0.8F;
            float var18 = ajs.int(this.ai * this.ai + this.ag * this.ag) * 1.0F + 1.0F;
            double var19 = Math.sqrt(this.ai * this.ai + this.ag * this.ag) * 1.0D + 1.0D;
            if (var19 > 40.0D) {
               var19 = 40.0D;
            }

            this.e5 = (float)((double)this.e5 + var13 * (0.699999988079071D / var19 / (double)var18));
            this.a5 += this.e5 * 0.1F;
            float var21 = (float)(2.0D / (var19 + 1.0D));
            float var22 = 0.06F;
            this.a(0.0F, -1.0F, var22 * (var17 * var21 + (1.0F - var21)));
            if (this.qn) {
               this.do(this.ai * 0.800000011920929D, this.ah * 0.800000011920929D, this.ag * 0.800000011920929D);
            } else {
               this.do(this.ai, this.ah, this.ag);
            }

            nr var23 = this.ap.do().a(this.ai, this.ah, this.ag).if();
            float var24 = (float)(var23.int(var39) + 1.0D) / 2.0F;
            var24 = 0.8F + 0.15F * var24;
            this.ai *= (double)var24;
            this.ag *= (double)var24;
            this.ah *= 0.9100000262260437D;
         }

         this.eH = this.a5;
         this.qx.aP = this.qx.aO = 3.0F;
         this.qv.aP = this.qv.aO = 2.0F;
         this.qt.aP = this.qt.aO = 2.0F;
         this.qu.aP = this.qu.aO = 2.0F;
         this.qw.aO = 3.0F;
         this.qw.aP = 5.0F;
         this.qs.aO = 2.0F;
         this.qs.aP = 4.0F;
         this.qr.aO = 3.0F;
         this.qr.aP = 4.0F;
         var2 = (float)(this.if(5, 1.0F)[1] - this.if(10, 1.0F)[1]) * 10.0F / 180.0F * 3.1415927F;
         var3 = ajs.for(var2);
         float var27 = -ajs.try(var2);
         float var5 = this.a5 * 3.1415927F / 180.0F;
         float var28 = ajs.try(var5);
         float var7 = ajs.for(var5);
         this.qw.aC();
         this.qw.if(this.al + (double)(var28 * 0.5F), this.ak, this.aj - (double)(var7 * 0.5F), 0.0F, 0.0F);
         this.qs.aC();
         this.qs.if(this.al + (double)(var7 * 4.5F), this.ak + 2.0D, this.aj + (double)(var28 * 4.5F), 0.0F, 0.0F);
         this.qr.aC();
         this.qr.if(this.al - (double)(var7 * 4.5F), this.ak + 2.0D, this.aj - (double)(var28 * 4.5F), 0.0F, 0.0F);
         if (!this.ap.goto && this.fe == 0) {
            this.a(this.ap.a((aiw)this, (nw)this.qs.aZ.do(4.0D, 2.0D, 4.0D).if(0.0D, -2.0D, 0.0D)));
            this.a(this.ap.a((aiw)this, (nw)this.qr.aZ.do(4.0D, 2.0D, 4.0D).if(0.0D, -2.0D, 0.0D)));
            this.if(this.ap.a((aiw)this, (nw)this.qx.aZ.do(1.0D, 1.0D, 1.0D)));
         }

         double[] var29 = this.if(5, 1.0F);
         double[] var9 = this.if(0, 1.0F);
         var31 = ajs.try(this.a5 * 3.1415927F / 180.0F - this.e5 * 0.01F);
         float var33 = ajs.for(this.a5 * 3.1415927F / 180.0F - this.e5 * 0.01F);
         this.qx.aC();
         this.qx.if(this.al + (double)(var31 * 5.5F * var3), this.ak + (var9[1] - var29[1]) * 1.0D + (double)(var27 * 5.5F), this.aj - (double)(var33 * 5.5F * var3), 0.0F, 0.0F);

         for(int var30 = 0; var30 < 3; ++var30) {
            aft var32 = null;
            if (var30 == 0) {
               var32 = this.qv;
            }

            if (var30 == 1) {
               var32 = this.qt;
            }

            if (var30 == 2) {
               var32 = this.qu;
            }

            double[] var34 = this.if(12 + var30 * 2, 1.0F);
            float var35 = this.a5 * 3.1415927F / 180.0F + this.do(var34[0] - var29[0]) * 3.1415927F / 180.0F * 1.0F;
            float var37 = ajs.try(var35);
            float var36 = ajs.for(var35);
            float var38 = 1.5F;
            float var40 = (float)(var30 + 1) * 2.0F;
            var32.aC();
            var32.if(this.al - (double)((var28 * var38 + var37 * var40) * var3), this.ak + (var34[1] - var29[1]) * 1.0D - (double)((var40 + var38) * var27) + 1.5D, this.aj + (double)((var7 * var38 + var36 * var40) * var3), 0.0F, 0.0F);
         }

         if (!this.ap.goto) {
            this.qn = this.a(this.qx.aZ) | this.a(this.qw.aZ);
         }

      }
   }

   private void e8() {
      if (this.ql != null) {
         if (this.ql.aR) {
            if (!this.ap.goto) {
               this.a(this.qx, ai4.a((zg)null), 10);
            }

            this.ql = null;
         } else if (this.bl % 10 == 0 && this.cd() < this.b0()) {
            this.t(this.cd() + 1);
         }
      }

      if (this.bm.nextInt(10) == 0) {
         float var1 = 32.0F;
         List var2 = this.ap.a(afs.class, this.aZ.do((double)var1, (double)var1, (double)var1));
         afs var3 = null;
         double var4 = Double.MAX_VALUE;
         Iterator var6 = var2.iterator();

         while(var6.hasNext()) {
            afs var7 = (afs)var6.next();
            double var8 = var7.for(this);
            if (var8 < var4) {
               var4 = var8;
               var3 = var7;
            }
         }

         this.ql = var3;
      }

   }

   private void a(List var1) {
      double var2 = (this.qw.aZ.if + this.qw.aZ.new) / 2.0D;
      double var4 = (this.qw.aZ.try + this.qw.aZ.for) / 2.0D;
      Iterator var6 = var1.iterator();

      while(var6.hasNext()) {
         aiw var7 = (aiw)var6.next();
         if (var7 instanceof aig) {
            double var8 = var7.al - var2;
            double var10 = var7.aj - var4;
            double var12 = var8 * var8 + var10 * var10;
            var7.byte(var8 / var12 * 4.0D, 0.20000000298023224D, var10 / var12 * 4.0D);
         }
      }

   }

   private void if(List var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         aiw var3 = (aiw)var1.get(var2);
         if (var3 instanceof aig) {
            var3.a((ai4)ai4.a((aig)this), 10);
         }
      }

   }

   private void e9() {
      this.qo = false;
      if (this.bm.nextInt(2) == 0 && !this.ap.z.isEmpty()) {
         this.qk = (aiw)this.ap.z.get(this.bm.nextInt(this.ap.z.size()));
      } else {
         boolean var1 = false;

         do {
            this.qD = 0.0D;
            this.qC = (double)(70.0F + this.bm.nextFloat() * 50.0F);
            this.qB = 0.0D;
            this.qD += (double)(this.bm.nextFloat() * 120.0F - 60.0F);
            this.qB += (double)(this.bm.nextFloat() * 120.0F - 60.0F);
            double var2 = this.al - this.qD;
            double var4 = this.ak - this.qC;
            double var6 = this.aj - this.qB;
            var1 = var2 * var2 + var4 * var4 + var6 * var6 > 100.0D;
         } while(!var1);

         this.qk = null;
      }

   }

   private float do(double var1) {
      return (float)ajs.do(var1);
   }

   private boolean a(nw var1) {
      int var2 = ajs.a(var1.if);
      int var3 = ajs.a(var1.a);
      int var4 = ajs.a(var1.try);
      int var5 = ajs.a(var1.new);
      int var6 = ajs.a(var1.int);
      int var7 = ajs.a(var1.for);
      boolean var8 = false;
      boolean var9 = false;

      for(int var10 = var2; var10 <= var5; ++var10) {
         for(int var11 = var3; var11 <= var6; ++var11) {
            for(int var12 = var4; var12 <= var7; ++var12) {
               int var13 = this.ap.new(var10, var11, var12);
               if (var13 != 0) {
                  if (var13 != pa.bs.void && var13 != pa.bG.void && var13 != pa.bc.void && this.ap.i().a("mobGriefing")) {
                     var9 = this.ap.o(var10, var11, var12) || var9;
                  } else {
                     var8 = true;
                  }
               }
            }
         }
      }

      if (var9) {
         double var16 = var1.if + (var1.new - var1.if) * (double)this.bm.nextFloat();
         double var17 = var1.a + (var1.int - var1.a) * (double)this.bm.nextFloat();
         double var14 = var1.try + (var1.for - var1.try) * (double)this.bm.nextFloat();
         this.ap.a("largeexplode", var16, var17, var14, 0.0D, 0.0D, 0.0D);
      }

      return var8;
   }

   public boolean a(aft var1, ai4 var2, int var3) {
      if (var1 != this.qx) {
         var3 = var3 / 4 + 1;
      }

      float var4 = this.a5 * 3.1415927F / 180.0F;
      float var5 = ajs.try(var4);
      float var6 = ajs.for(var4);
      this.qD = this.al + (double)(var5 * 5.0F) + (double)((this.bm.nextFloat() - 0.5F) * 2.0F);
      this.qC = this.ak + (double)(this.bm.nextFloat() * 3.0F) + 1.0D;
      this.qB = this.aj - (double)(var6 * 5.0F) + (double)((this.bm.nextFloat() - 0.5F) * 2.0F);
      this.qk = null;
      if (var2.new() instanceof aek || var2.long()) {
         this.int(var2, var3);
      }

      return true;
   }

   public boolean a(ai4 var1, int var2) {
      return false;
   }

   protected boolean int(ai4 var1, int var2) {
      return super.a(var1, var2);
   }

   protected void b7() {
      ++this.qm;
      if (this.qm >= 180 && this.qm <= 200) {
         float var1 = (this.bm.nextFloat() - 0.5F) * 8.0F;
         float var2 = (this.bm.nextFloat() - 0.5F) * 4.0F;
         float var3 = (this.bm.nextFloat() - 0.5F) * 8.0F;
         this.ap.a("hugeexplosion", this.al + (double)var1, this.ak + 2.0D + (double)var2, this.aj + (double)var3, 0.0D, 0.0D, 0.0D);
      }

      int var4;
      int var5;
      if (!this.ap.goto) {
         if (this.qm > 150 && this.qm % 5 == 0) {
            var4 = 1000;

            while(var4 > 0) {
               var5 = aik.aC(var4);
               var4 -= var5;
               this.ap.new(new aik(this.ap, this.al, this.ak, this.aj, var5));
            }
         }

         if (this.qm == 1) {
            this.ap.a(1018, (int)this.al, (int)this.ak, (int)this.aj, 0);
         }
      }

      this.do(0.0D, 0.10000000149011612D, 0.0D);
      this.eH = this.a5 += 20.0F;
      if (this.qm == 200 && !this.ap.goto) {
         var4 = 2000;

         while(var4 > 0) {
            var5 = aik.aC(var4);
            var4 -= var5;
            this.ap.new(new aik(this.ap, this.al, this.ak, this.aj, var5));
         }

         this.h(ajs.a(this.al), ajs.a(this.aj));
         this.az();
      }

   }

   private void h(int var1, int var2) {
      byte var3 = 64;
      pd.eb = true;
      byte var4 = 4;

      for(int var5 = var3 - 1; var5 <= var3 + 32; ++var5) {
         for(int var6 = var1 - var4; var6 <= var1 + var4; ++var6) {
            for(int var7 = var2 - var4; var7 <= var2 + var4; ++var7) {
               double var8 = (double)(var6 - var1);
               double var10 = (double)(var7 - var2);
               double var12 = var8 * var8 + var10 * var10;
               if (var12 <= ((double)var4 - 0.5D) * ((double)var4 - 0.5D)) {
                  if (var5 < var3) {
                     if (!(var12 > ((double)(var4 - 1) - 0.5D) * ((double)(var4 - 1) - 0.5D))) {
                        this.ap.int(var6, var5, var7, pa.bc.void);
                     }
                  } else if (var5 > var3) {
                     this.ap.int(var6, var5, var7, 0);
                  } else if (var12 > ((double)(var4 - 1) - 0.5D) * ((double)(var4 - 1) - 0.5D)) {
                     this.ap.int(var6, var5, var7, pa.bc.void);
                  } else {
                     this.ap.int(var6, var5, var7, pa.bK.void);
                  }
               }
            }
         }
      }

      this.ap.int(var1, var3 + 0, var2, pa.bc.void);
      this.ap.int(var1, var3 + 1, var2, pa.bc.void);
      this.ap.int(var1, var3 + 2, var2, pa.bc.void);
      this.ap.int(var1 - 1, var3 + 2, var2, pa.bq.void);
      this.ap.int(var1 + 1, var3 + 2, var2, pa.bq.void);
      this.ap.int(var1, var3 + 2, var2 - 1, pa.bq.void);
      this.ap.int(var1, var3 + 2, var2 + 1, pa.bq.void);
      this.ap.int(var1, var3 + 3, var2, pa.bc.void);
      this.ap.int(var1, var3 + 4, var2, pa.bE.void);
      pd.eb = false;
   }

   protected void bC() {
   }

   public aiw[] R() {
      return this.qy;
   }

   public boolean aw() {
      return false;
   }

   public int e6() {
      return this.bg.int(16);
   }

   public y6 e7() {
      return this.ap;
   }

   protected String b2() {
      return "mob.enderdragon.growl";
   }

   protected String bX() {
      return "mob.enderdragon.hit";
   }

   protected float bR() {
      return 5.0F;
   }
}
