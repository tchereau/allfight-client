public class ae6 extends ae0 {
   private static boolean[] qV = new boolean[256];
   private int qU = 0;
   private int qT = 0;

   public ae6(y6 var1) {
      super(var1);
      this.ft = "/mob/enderman.png";
      this.e2 = 0.2F;
      this.if(0.6F, 2.9F);
      this.aF = 1.0F;
   }

   public int b0() {
      return 40;
   }

   protected void X() {
      super.X();
      this.bg.a(16, new Byte((byte)0));
      this.bg.a(17, new Byte((byte)0));
      this.bg.a(18, new Byte((byte)0));
   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("carried", (short)this.fk());
      var1.a("carriedData", (short)this.fl());
   }

   public void try(aqv var1) {
      super.try(var1);
      this.aq(var1.case("carried"));
      this.ar(var1.case("carriedData"));
   }

   protected aiw eM() {
      aek var1 = this.ap.a(this, 64.0D);
      if (var1 != null) {
         if (this.byte(var1)) {
            if (this.qT == 0) {
               this.ap.a((aiw)var1, "mob.endermen.stare", 1.0F, 1.0F);
            }

            if (this.qT++ == 5) {
               this.qT = 0;
               this.w(true);
               return var1;
            }
         } else {
            this.qT = 0;
         }
      }

      return null;
   }

   private boolean byte(aek var1) {
      abp var2 = var1.fR.U[3];
      if (var2 != null && var2.new == pa.aW.void) {
         return false;
      } else {
         nr var3 = var1.b(1.0F).if();
         nr var4 = this.ap.do().a(this.al - var1.al, this.aZ.a + (double)(this.aO / 2.0F) - (var1.ak + (double)var1.af()), this.aj - var1.aj);
         double var5 = var4.a();
         var4 = var4.if();
         double var7 = var3.int(var4);
         return var7 > 1.0D - 0.025D / var5 ? var1.void(this) : false;
      }
   }

   public void bU() {
      if (this.ao()) {
         this.a(ai4.f, 1);
      }

      this.e2 = this.pZ != null ? 6.5F : 0.3F;
      int var1;
      if (!this.ap.goto && this.ap.i().a("mobGriefing")) {
         int var2;
         int var3;
         int var4;
         if (this.fk() == 0) {
            if (this.bm.nextInt(20) == 0) {
               var1 = ajs.a(this.al - 2.0D + this.bm.nextDouble() * 4.0D);
               var2 = ajs.a(this.ak + this.bm.nextDouble() * 3.0D);
               var3 = ajs.a(this.aj - 2.0D + this.bm.nextDouble() * 4.0D);
               var4 = this.ap.new(var1, var2, var3);
               if (qV[var4]) {
                  this.aq(this.ap.new(var1, var2, var3));
                  this.ar(this.ap.for(var1, var2, var3));
                  this.ap.int(var1, var2, var3, 0);
               }
            }
         } else if (this.bm.nextInt(2000) == 0) {
            var1 = ajs.a(this.al - 1.0D + this.bm.nextDouble() * 2.0D);
            var2 = ajs.a(this.ak + this.bm.nextDouble() * 2.0D);
            var3 = ajs.a(this.aj - 1.0D + this.bm.nextDouble() * 2.0D);
            var4 = this.ap.new(var1, var2, var3);
            int var5 = this.ap.new(var1, var2 - 1, var3);
            if (var4 == 0 && var5 > 0 && pa.x[var5].if()) {
               this.ap.int(var1, var2, var3, this.fk(), this.fl(), 3);
               this.aq(0);
            }
         }
      }

      for(var1 = 0; var1 < 2; ++var1) {
         this.ap.a("portal", this.al + (this.bm.nextDouble() - 0.5D) * (double)this.aP, this.ak + this.bm.nextDouble() * (double)this.aO - 0.25D, this.aj + (this.bm.nextDouble() - 0.5D) * (double)this.aP, (this.bm.nextDouble() - 0.5D) * 2.0D, -this.bm.nextDouble(), (this.bm.nextDouble() - 0.5D) * 2.0D);
      }

      if (this.ap.j() && !this.ap.goto) {
         float var6 = this.int(1.0F);
         if (var6 > 0.5F && this.ap.j(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj)) && this.bm.nextFloat() * 30.0F < (var6 - 0.4F) * 2.0F) {
            this.pZ = null;
            this.w(false);
            this.fm();
         }
      }

      if (this.ao() || this.aP()) {
         this.pZ = null;
         this.w(false);
         this.fm();
      }

      this.e4 = false;
      if (this.pZ != null) {
         this.a(this.pZ, 100.0F, 100.0F);
      }

      if (!this.ap.goto && this.aA()) {
         if (this.pZ != null) {
            if (this.pZ instanceof aek && this.byte((aek)this.pZ)) {
               this.e7 = this.e6 = 0.0F;
               this.e2 = 0.0F;
               if (this.pZ.for((aiw)this) < 16.0D) {
                  this.fm();
               }

               this.qU = 0;
            } else if (this.pZ.for((aiw)this) > 256.0D && this.qU++ >= 30 && this.j(this.pZ)) {
               this.qU = 0;
            }
         } else {
            this.w(false);
            this.qU = 0;
         }
      }

      super.bU();
   }

   protected boolean fm() {
      double var1 = this.al + (this.bm.nextDouble() - 0.5D) * 64.0D;
      double var3 = this.ak + (double)(this.bm.nextInt(64) - 32);
      double var5 = this.aj + (this.bm.nextDouble() - 0.5D) * 64.0D;
      return this.long(var1, var3, var5);
   }

   protected boolean j(aiw var1) {
      nr var2 = this.ap.do().a(this.al - var1.al, this.aZ.a + (double)(this.aO / 2.0F) - var1.ak + (double)var1.af(), this.aj - var1.aj);
      var2 = var2.if();
      double var3 = 16.0D;
      double var5 = this.al + (this.bm.nextDouble() - 0.5D) * 8.0D - var2.int * var3;
      double var7 = this.ak + (double)(this.bm.nextInt(16) - 8) - var2.for * var3;
      double var9 = this.aj + (this.bm.nextDouble() - 0.5D) * 8.0D - var2.do * var3;
      return this.long(var5, var7, var9);
   }

   protected boolean long(double var1, double var3, double var5) {
      double var7 = this.al;
      double var9 = this.ak;
      double var11 = this.aj;
      this.al = var1;
      this.ak = var3;
      this.aj = var5;
      boolean var13 = false;
      int var14 = ajs.a(this.al);
      int var15 = ajs.a(this.ak);
      int var16 = ajs.a(this.aj);
      int var18;
      if (this.ap.p(var14, var15, var16)) {
         boolean var17 = false;

         while(true) {
            while(!var17 && var15 > 0) {
               var18 = this.ap.new(var14, var15 - 1, var16);
               if (var18 != 0 && pa.x[var18].at.void()) {
                  var17 = true;
               } else {
                  --this.ak;
                  --var15;
               }
            }

            if (var17) {
               this.try(this.al, this.ak, this.aj);
               if (this.ap.if((aiw)this, (nw)this.aZ).isEmpty() && !this.ap.do(this.aZ)) {
                  var13 = true;
               }
            }
            break;
         }
      }

      if (!var13) {
         this.try(var7, var9, var11);
         return false;
      } else {
         short var30 = 128;

         for(var18 = 0; var18 < var30; ++var18) {
            double var19 = (double)var18 / ((double)var30 - 1.0D);
            float var21 = (this.bm.nextFloat() - 0.5F) * 0.2F;
            float var22 = (this.bm.nextFloat() - 0.5F) * 0.2F;
            float var23 = (this.bm.nextFloat() - 0.5F) * 0.2F;
            double var24 = var7 + (this.al - var7) * var19 + (this.bm.nextDouble() - 0.5D) * (double)this.aP * 2.0D;
            double var26 = var9 + (this.ak - var9) * var19 + this.bm.nextDouble() * (double)this.aO;
            double var28 = var11 + (this.aj - var11) * var19 + (this.bm.nextDouble() - 0.5D) * (double)this.aP * 2.0D;
            this.ap.a("portal", var24, var26, var28, (double)var21, (double)var22, (double)var23);
         }

         this.ap.a(var7, var9, var11, "mob.endermen.portal", 1.0F, 1.0F);
         this.a("mob.endermen.portal", 1.0F, 1.0F);
         return true;
      }
   }

   protected String b2() {
      return this.fn() ? "mob.endermen.scream" : "mob.endermen.idle";
   }

   protected String bX() {
      return "mob.endermen.hit";
   }

   protected String bS() {
      return "mob.endermen.death";
   }

   protected int bI() {
      return abr.aF.A;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.bI();
      if (var3 > 0) {
         int var4 = this.bm.nextInt(2 + var2);

         for(int var5 = 0; var5 < var4; ++var5) {
            this.new(var3, 1);
         }
      }

   }

   public void aq(int var1) {
      this.bg.if(16, (byte)(var1 & 255));
   }

   public int fk() {
      return this.bg.for(16);
   }

   public void ar(int var1) {
      this.bg.if(17, (byte)(var1 & 255));
   }

   public int fl() {
      return this.bg.for(17);
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else {
         this.w(true);
         if (var1 instanceof ai2) {
            for(int var3 = 0; var3 < 64; ++var3) {
               if (this.fm()) {
                  return true;
               }
            }

            return false;
         } else {
            return super.a(var1, var2);
         }
      }
   }

   public boolean fn() {
      return this.bg.for(18) > 0;
   }

   public void w(boolean var1) {
      this.bg.if(18, (byte)(var1 ? 1 : 0));
   }

   public int h(aiw var1) {
      return 7;
   }

   static {
      qV[pa.i.void] = true;
      qV[pa.g.void] = true;
      qV[pa.a1.void] = true;
      qV[pa.aY.void] = true;
      qV[pa.bR.void] = true;
      qV[pa.bP.void] = true;
      qV[pa.bN.void] = true;
      qV[pa.bL.void] = true;
      qV[pa.bz.void] = true;
      qV[pa.b7.void] = true;
      qV[pa.a8.void] = true;
      qV[pa.aW.void] = true;
      qV[pa.ad.void] = true;
      qV[pa.b2.void] = true;
   }
}
