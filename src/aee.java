import java.util.List;

public class aee extends aiw {
   private int da;
   private int c9;
   private int c8;
   private int c7;
   private boolean c6;
   public int dd;
   public aek dc;
   private int c5;
   private int c4;
   private int cZ;
   public aiw db;
   private int cY;
   private double cX;
   private double cW;
   private double cV;
   private double cU;
   private double c3;
   private double c2;
   private double c1;
   private double c0;

   public aee(y6 var1) {
      super(var1);
      this.da = -1;
      this.c9 = -1;
      this.c8 = -1;
      this.c7 = 0;
      this.c6 = false;
      this.dd = 0;
      this.c4 = 0;
      this.cZ = 0;
      this.db = null;
      this.if(0.25F, 0.25F);
      this.bb = true;
   }

   public aee(y6 var1, double var2, double var4, double var6, aek var8) {
      this(var1);
      this.try(var2, var4, var6);
      this.bb = true;
      this.dc = var8;
      var8.fS = this;
   }

   public aee(y6 var1, aek var2) {
      super(var1);
      this.da = -1;
      this.c9 = -1;
      this.c8 = -1;
      this.c7 = 0;
      this.c6 = false;
      this.dd = 0;
      this.c4 = 0;
      this.cZ = 0;
      this.db = null;
      this.bb = true;
      this.dc = var2;
      this.dc.fS = this;
      this.if(0.25F, 0.25F);
      this.if(var2.al, var2.ak + 1.62D - (double)var2.aQ, var2.aj, var2.a5, var2.a4);
      this.al -= (double)(ajs.for(this.a5 / 180.0F * 3.1415927F) * 0.16F);
      this.ak -= 0.10000000149011612D;
      this.aj -= (double)(ajs.try(this.a5 / 180.0F * 3.1415927F) * 0.16F);
      this.try(this.al, this.ak, this.aj);
      this.aQ = 0.0F;
      float var3 = 0.4F;
      this.ai = (double)(-ajs.try(this.a5 / 180.0F * 3.1415927F) * ajs.for(this.a4 / 180.0F * 3.1415927F) * var3);
      this.ag = (double)(ajs.for(this.a5 / 180.0F * 3.1415927F) * ajs.for(this.a4 / 180.0F * 3.1415927F) * var3);
      this.ah = (double)(-ajs.try(this.a4 / 180.0F * 3.1415927F) * var3);
      this.for(this.ai, this.ah, this.ag, 1.5F, 1.0F);
   }

   protected void X() {
   }

   public boolean a(double var1) {
      double var3 = this.aZ.a() * 4.0D;
      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   public void for(double var1, double var3, double var5, float var7, float var8) {
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
      this.c5 = 0;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.cX = var1;
      this.cW = var3;
      this.cV = var5;
      this.cU = (double)var7;
      this.c3 = (double)var8;
      this.cY = var9;
      this.ai = this.c2;
      this.ah = this.c1;
      this.ag = this.c0;
   }

   public void new(double var1, double var3, double var5) {
      this.c2 = this.ai = var1;
      this.c1 = this.ah = var3;
      this.c0 = this.ag = var5;
   }

   public void aC() {
      super.aC();
      if (this.cY > 0) {
         double var21 = this.al + (this.cX - this.al) / (double)this.cY;
         double var22 = this.ak + (this.cW - this.ak) / (double)this.cY;
         double var23 = this.aj + (this.cV - this.aj) / (double)this.cY;
         double var7 = ajs.do(this.cU - (double)this.a5);
         this.a5 = (float)((double)this.a5 + var7 / (double)this.cY);
         this.a4 = (float)((double)this.a4 + (this.c3 - (double)this.a4) / (double)this.cY);
         --this.cY;
         this.try(var21, var22, var23);
         this.do(this.a5, this.a4);
      } else {
         if (!this.ap.goto) {
            abp var1 = this.dc.cD();
            if (this.dc.aR || !this.dc.aA() || var1 == null || var1.d() != abr.ce || this.for(this.dc) > 1024.0D) {
               this.az();
               this.dc.fS = null;
               return;
            }

            if (this.db != null) {
               if (!this.db.aR) {
                  this.al = this.db.al;
                  this.ak = this.db.aZ.a + (double)this.db.aO * 0.8D;
                  this.aj = this.db.aj;
                  return;
               }

               this.db = null;
            }
         }

         if (this.dd > 0) {
            --this.dd;
         }

         if (this.c6) {
            int var19 = this.ap.new(this.da, this.c9, this.c8);
            if (var19 == this.c7) {
               ++this.c5;
               if (this.c5 == 1200) {
                  this.az();
               }

               return;
            }

            this.c6 = false;
            this.ai *= (double)(this.bm.nextFloat() * 0.2F);
            this.ah *= (double)(this.bm.nextFloat() * 0.2F);
            this.ag *= (double)(this.bm.nextFloat() * 0.2F);
            this.c5 = 0;
            this.c4 = 0;
         } else {
            ++this.c4;
         }

         nr var20 = this.ap.do().a(this.al, this.ak, this.aj);
         nr var2 = this.ap.do().a(this.al + this.ai, this.ak + this.ah, this.aj + this.ag);
         nt var3 = this.ap.a(var20, var2);
         var20 = this.ap.do().a(this.al, this.ak, this.aj);
         var2 = this.ap.do().a(this.al + this.ai, this.ak + this.ah, this.aj + this.ag);
         if (var3 != null) {
            var2 = this.ap.do().a(var3.for.int, var3.for.for, var3.for.do);
         }

         aiw var4 = null;
         List var5 = this.ap.a((aiw)this, (nw)this.aZ.a(this.ai, this.ah, this.ag).do(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;

         double var13;
         for(int var8 = 0; var8 < var5.size(); ++var8) {
            aiw var9 = (aiw)var5.get(var8);
            if (var9.aw() && (var9 != this.dc || this.c4 >= 5)) {
               float var10 = 0.3F;
               nw var11 = var9.aZ.do((double)var10, (double)var10, (double)var10);
               nt var12 = var11.a(var20, var2);
               if (var12 != null) {
                  var13 = var20.a(var12.for);
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
            if (var3.do != null) {
               if (var3.do.a((ai4)ai4.a((aiw)this, this.dc), 0)) {
                  this.db = var3.do;
               }
            } else {
               this.c6 = true;
            }
         }

         if (!this.c6) {
            this.do(this.ai, this.ah, this.ag);
            float var24 = ajs.int(this.ai * this.ai + this.ag * this.ag);
            this.a5 = (float)(Math.atan2(this.ai, this.ag) * 180.0D / 3.1415927410125732D);

            for(this.a4 = (float)(Math.atan2(this.ah, (double)var24) * 180.0D / 3.1415927410125732D); this.a4 - this.a0 < -180.0F; this.a0 -= 360.0F) {
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
            float var25 = 0.92F;
            if (this.aY || this.aX) {
               var25 = 0.5F;
            }

            byte var26 = 5;
            double var27 = 0.0D;

            for(int var28 = 0; var28 < var26; ++var28) {
               double var14 = this.aZ.a + (this.aZ.int - this.aZ.a) * (double)(var28 + 0) / (double)var26 - 0.125D + 0.125D;
               double var16 = this.aZ.a + (this.aZ.int - this.aZ.a) * (double)(var28 + 1) / (double)var26 - 0.125D + 0.125D;
               nw var18 = nw.if().a(this.aZ.if, var14, this.aZ.try, this.aZ.new, var16, this.aZ.for);
               if (this.ap.a(var18, ts.s)) {
                  var27 += 1.0D / (double)var26;
               }
            }

            if (var27 > 0.0D) {
               if (this.cZ > 0) {
                  --this.cZ;
               } else {
                  short var29 = 500;
                  if (this.ap.d(ajs.a(this.al), ajs.a(this.ak) + 1, ajs.a(this.aj))) {
                     var29 = 300;
                  }

                  if (this.bm.nextInt(var29) == 0) {
                     this.cZ = this.bm.nextInt(30) + 10;
                     this.ah -= 0.20000000298023224D;
                     this.a("random.splash", 0.25F, 1.0F + (this.bm.nextFloat() - this.bm.nextFloat()) * 0.4F);
                     float var30 = (float)ajs.a(this.aZ.a);

                     int var15;
                     float var17;
                     float var31;
                     for(var15 = 0; (float)var15 < 1.0F + this.aP * 20.0F; ++var15) {
                        var31 = (this.bm.nextFloat() * 2.0F - 1.0F) * this.aP;
                        var17 = (this.bm.nextFloat() * 2.0F - 1.0F) * this.aP;
                        this.ap.a("bubble", this.al + (double)var31, (double)(var30 + 1.0F), this.aj + (double)var17, this.ai, this.ah - (double)(this.bm.nextFloat() * 0.2F), this.ag);
                     }

                     for(var15 = 0; (float)var15 < 1.0F + this.aP * 20.0F; ++var15) {
                        var31 = (this.bm.nextFloat() * 2.0F - 1.0F) * this.aP;
                        var17 = (this.bm.nextFloat() * 2.0F - 1.0F) * this.aP;
                        this.ap.a("splash", this.al + (double)var31, (double)(var30 + 1.0F), this.aj + (double)var17, this.ai, this.ah, this.ag);
                     }
                  }
               }
            }

            if (this.cZ > 0) {
               this.ah -= (double)(this.bm.nextFloat() * this.bm.nextFloat() * this.bm.nextFloat()) * 0.2D;
            }

            var13 = var27 * 2.0D - 1.0D;
            this.ah += 0.03999999910593033D * var13;
            if (var27 > 0.0D) {
               var25 = (float)((double)var25 * 0.9D);
               this.ah *= 0.8D;
            }

            this.ai *= (double)var25;
            this.ah *= (double)var25;
            this.ag *= (double)var25;
            this.try(this.al, this.ak, this.aj);
         }
      }
   }

   public void for(aqv var1) {
      var1.a("xTile", (short)this.da);
      var1.a("yTile", (short)this.c9);
      var1.a("zTile", (short)this.c8);
      var1.a("inTile", (byte)this.c7);
      var1.a("shake", (byte)this.dd);
      var1.a("inGround", (byte)(this.c6 ? 1 : 0));
   }

   public void try(aqv var1) {
      this.da = var1.case("xTile");
      this.c9 = var1.case("yTile");
      this.c8 = var1.case("zTile");
      this.c7 = var1.else("inTile") & 255;
      this.dd = var1.else("shake") & 255;
      this.c6 = var1.else("inGround") == 1;
   }

   public float aH() {
      return 0.0F;
   }

   public int a5() {
      if (this.ap.goto) {
         return 0;
      } else {
         byte var1 = 0;
         if (this.db != null) {
            double var2 = this.dc.al - this.al;
            double var4 = this.dc.ak - this.ak;
            double var6 = this.dc.aj - this.aj;
            double var8 = (double)ajs.int(var2 * var2 + var4 * var4 + var6 * var6);
            double var10 = 0.1D;
            aiw var10000 = this.db;
            var10000.ai += var2 * var10;
            var10000 = this.db;
            var10000.ah += var4 * var10 + (double)ajs.int(var8) * 0.08D;
            var10000 = this.db;
            var10000.ag += var6 * var10;
            var1 = 3;
         } else if (this.cZ > 0) {
            afk var13 = new afk(this.ap, this.al, this.ak, this.aj, new abp(abr.cb));
            double var3 = this.dc.al - this.al;
            double var5 = this.dc.ak - this.ak;
            double var7 = this.dc.aj - this.aj;
            double var9 = (double)ajs.int(var3 * var3 + var5 * var5 + var7 * var7);
            double var11 = 0.1D;
            var13.ai = var3 * var11;
            var13.ah = var5 * var11 + (double)ajs.int(var9) * 0.08D;
            var13.ag = var7 * var11;
            this.ap.new(var13);
            this.dc.a((akf)aka.c, 1);
            this.dc.ap.new(new aik(this.dc.ap, this.dc.al, this.dc.ak + 0.5D, this.dc.aj + 0.5D, this.bm.nextInt(6) + 1));
            var1 = 1;
         }

         if (this.c6) {
            var1 = 2;
         }

         this.az();
         this.dc.fS = null;
         return var1;
      }
   }

   public void az() {
      super.az();
      if (this.dc != null) {
         this.dc.fS = null;
      }

   }
}
