import java.util.List;

public class afq extends ae0 implements afv, aey {
   private float[] qK = new float[2];
   private float[] qJ = new float[2];
   private float[] qI = new float[2];
   private float[] qH = new float[2];
   private int[] qG = new int[2];
   private int[] qF = new int[2];
   private int qE;
   private static final aip qL = new afp();

   public afq(y6 var1) {
      super(var1);
      this.t(this.b0());
      this.ft = "/mob/wither.png";
      this.if(0.9F, 4.0F);
      this.bh = true;
      this.e2 = 0.6F;
      this.bl().a(true);
      this.er.a(0, new aho(this));
      this.er.a(2, new agz(this, this.e2, 40, 20.0F));
      this.er.a(5, new ag0(this, this.e2));
      this.er.a(6, new ahf(this, aek.class, 8.0F));
      this.er.a(7, new ag1(this));
      this.eq.a(1, new agq(this, false));
      this.eq.a(2, new agp(this, aig.class, 30.0F, 0, false, false, qL));
      this.eB = 50;
   }

   protected void X() {
      super.X();
      this.bg.a(16, new Integer(100));
      this.bg.a(17, new Integer(0));
      this.bg.a(18, new Integer(0));
      this.bg.a(19, new Integer(0));
      this.bg.a(20, new Integer(0));
   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("Invul", this.fa());
   }

   public void try(aqv var1) {
      super.try(var1);
      this.ap(var1.goto("Invul"));
      this.bg.if(16, this.fi);
   }

   public float aH() {
      return this.aO / 8.0F;
   }

   protected String b2() {
      return "mob.wither.idle";
   }

   protected String bX() {
      return "mob.wither.hurt";
   }

   protected String bS() {
      return "mob.wither.death";
   }

   public String W() {
      int var1 = this.fa();
      return var1 > 0 && (var1 > 80 || var1 / 5 % 2 != 1) ? "/mob/wither_invul.png" : "/mob/wither.png";
   }

   public void bU() {
      if (!this.ap.goto) {
         this.bg.if(16, this.fi);
      }

      this.ah *= 0.6000000238418579D;
      double var4;
      double var6;
      double var8;
      if (!this.ap.goto && this.ao(0) > 0) {
         aiw var1 = this.ap.a(this.ao(0));
         if (var1 != null) {
            if (this.ak < var1.ak || !this.fb() && this.ak < var1.ak + 5.0D) {
               if (this.ah < 0.0D) {
                  this.ah = 0.0D;
               }

               this.ah += (0.5D - this.ah) * 0.6000000238418579D;
            }

            double var2 = var1.al - this.al;
            var4 = var1.aj - this.aj;
            var6 = var2 * var2 + var4 * var4;
            if (var6 > 9.0D) {
               var8 = (double)ajs.int(var6);
               this.ai += (var2 / var8 * 0.5D - this.ai) * 0.6000000238418579D;
               this.ag += (var4 / var8 * 0.5D - this.ag) * 0.6000000238418579D;
            }
         }
      }

      if (this.ai * this.ai + this.ag * this.ag > 0.05000000074505806D) {
         this.a5 = (float)Math.atan2(this.ag, this.ai) * 57.295776F - 90.0F;
      }

      super.bU();

      int var20;
      for(var20 = 0; var20 < 2; ++var20) {
         this.qH[var20] = this.qJ[var20];
         this.qI[var20] = this.qK[var20];
      }

      int var21;
      for(var20 = 0; var20 < 2; ++var20) {
         var21 = this.ao(var20 + 1);
         aiw var3 = null;
         if (var21 > 0) {
            var3 = this.ap.a(var21);
         }

         if (var3 != null) {
            var4 = this.an(var20 + 1);
            var6 = this.al(var20 + 1);
            var8 = this.aj(var20 + 1);
            double var10 = var3.al - var4;
            double var12 = var3.ak + (double)var3.af() - var6;
            double var14 = var3.aj - var8;
            double var16 = (double)ajs.int(var10 * var10 + var14 * var14);
            float var18 = (float)(Math.atan2(var14, var10) * 180.0D / 3.1415927410125732D) - 90.0F;
            float var19 = (float)(-(Math.atan2(var12, var16) * 180.0D / 3.1415927410125732D));
            this.qK[var20] = this.for(this.qK[var20], var19, 40.0F);
            this.qJ[var20] = this.for(this.qJ[var20], var18, 10.0F);
         } else {
            this.qJ[var20] = this.for(this.qJ[var20], this.eH, 10.0F);
         }
      }

      boolean var22 = this.fb();

      for(var21 = 0; var21 < 3; ++var21) {
         double var23 = this.an(var21);
         double var5 = this.al(var21);
         double var7 = this.aj(var21);
         this.ap.a("smoke", var23 + this.bm.nextGaussian() * 0.30000001192092896D, var5 + this.bm.nextGaussian() * 0.30000001192092896D, var7 + this.bm.nextGaussian() * 0.30000001192092896D, 0.0D, 0.0D, 0.0D);
         if (var22 && this.ap.o.nextInt(4) == 0) {
            this.ap.a("mobSpell", var23 + this.bm.nextGaussian() * 0.30000001192092896D, var5 + this.bm.nextGaussian() * 0.30000001192092896D, var7 + this.bm.nextGaussian() * 0.30000001192092896D, 0.699999988079071D, 0.699999988079071D, 0.5D);
         }
      }

      if (this.fa() > 0) {
         for(var21 = 0; var21 < 3; ++var21) {
            this.ap.a("mobSpell", this.al + this.bm.nextGaussian() * 1.0D, this.ak + (double)(this.bm.nextFloat() * 3.3F), this.aj + this.bm.nextGaussian() * 1.0D, 0.699999988079071D, 0.699999988079071D, 0.8999999761581421D);
         }
      }

   }

   protected void bQ() {
      int var1;
      if (this.fa() > 0) {
         var1 = this.fa() - 1;
         if (var1 <= 0) {
            this.ap.a(this, this.al, this.ak + (double)this.af(), this.aj, 7.0F, false, this.ap.i().a("mobGriefing"));
            this.ap.a(1013, (int)this.al, (int)this.ak, (int)this.aj, 0);
         }

         this.ap(var1);
         if (this.bl % 10 == 0) {
            this.q(10);
         }

      } else {
         super.bQ();

         int var12;
         for(var1 = 1; var1 < 3; ++var1) {
            if (this.bl >= this.qG[var1 - 1]) {
               this.qG[var1 - 1] = this.bl + 10 + this.bm.nextInt(10);
               if (this.ap.p >= 2) {
                  int[] var10000 = this.qF;
                  int var10001 = var1 - 1;
                  int var10003 = var10000[var1 - 1];
                  var10000[var10001] = var10000[var1 - 1] + 1;
                  if (var10003 > 15) {
                     float var2 = 10.0F;
                     float var3 = 5.0F;
                     double var4 = ajs.a(this.bm, this.al - (double)var2, this.al + (double)var2);
                     double var6 = ajs.a(this.bm, this.ak - (double)var3, this.ak + (double)var3);
                     double var8 = ajs.a(this.bm, this.aj - (double)var2, this.aj + (double)var2);
                     this.a(var1 + 1, var4, var6, var8, true);
                     this.qF[var1 - 1] = 0;
                  }
               }

               var12 = this.ao(var1);
               if (var12 > 0) {
                  aiw var14 = this.ap.a(var12);
                  if (var14 != null && var14.aA() && !(this.for((aiw)var14) > 900.0D) && this.void(var14)) {
                     this.a(var1 + 1, (aig)var14);
                     this.qG[var1 - 1] = this.bl + 40 + this.bm.nextInt(20);
                     this.qF[var1 - 1] = 0;
                  } else {
                     this.i(var1, 0);
                  }
               } else {
                  List var13 = this.ap.a(aig.class, this.aZ.do(20.0D, 8.0D, 20.0D), qL);

                  for(int var16 = 0; var16 < 10 && !var13.isEmpty(); ++var16) {
                     aig var5 = (aig)var13.get(this.bm.nextInt(var13.size()));
                     if (var5 != this && var5.aA() && this.void(var5)) {
                        if (var5 instanceof aek) {
                           if (!((aek)var5).fY.if) {
                              this.i(var1, var5.av);
                           }
                        } else {
                           this.i(var1, var5.av);
                        }
                        break;
                     }

                     var13.remove(var5);
                  }
               }
            }
         }

         if (this.bB() != null) {
            this.i(0, this.bB().av);
         } else {
            this.i(0, 0);
         }

         if (this.qE > 0) {
            --this.qE;
            if (this.qE == 0 && this.ap.i().a("mobGriefing")) {
               var1 = ajs.a(this.ak);
               var12 = ajs.a(this.al);
               int var15 = ajs.a(this.aj);
               boolean var17 = false;

               for(int var18 = -1; var18 <= 1; ++var18) {
                  for(int var19 = -1; var19 <= 1; ++var19) {
                     for(int var7 = 0; var7 <= 3; ++var7) {
                        int var20 = var12 + var18;
                        int var9 = var1 + var7;
                        int var10 = var15 + var19;
                        int var11 = this.ap.new(var20, var9, var10);
                        if (var11 > 0 && var11 != pa.bc.void && var11 != pa.bK.void && var11 != pa.bI.void) {
                           var17 = this.ap.int(var20, var9, var10, true) || var17;
                        }
                     }
                  }
               }

               if (var17) {
                  this.ap.a((aek)null, 1012, (int)this.al, (int)this.ak, (int)this.aj, 0);
               }
            }
         }

         if (this.bl % 20 == 0) {
            this.q(1);
         }

      }
   }

   public void fc() {
      this.ap(220);
      this.t(this.b0() / 3);
   }

   public void Y() {
   }

   public int by() {
      return 4;
   }

   private double an(int var1) {
      if (var1 <= 0) {
         return this.al;
      } else {
         float var2 = (this.eH + (float)(180 * (var1 - 1))) / 180.0F * 3.1415927F;
         float var3 = ajs.for(var2);
         return this.al + (double)var3 * 1.3D;
      }
   }

   private double al(int var1) {
      return var1 <= 0 ? this.ak + 3.0D : this.ak + 2.2D;
   }

   private double aj(int var1) {
      if (var1 <= 0) {
         return this.aj;
      } else {
         float var2 = (this.eH + (float)(180 * (var1 - 1))) / 180.0F * 3.1415927F;
         float var3 = ajs.try(var2);
         return this.aj + (double)var3 * 1.3D;
      }
   }

   private float for(float var1, float var2, float var3) {
      float var4 = ajs.int(var2 - var1);
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   private void a(int var1, aig var2) {
      this.a(var1, var2.al, var2.ak + (double)var2.af() * 0.5D, var2.aj, var1 == 0 && this.bm.nextFloat() < 0.001F);
   }

   private void a(int var1, double var2, double var4, double var6, boolean var8) {
      this.ap.a((aek)null, 1014, (int)this.al, (int)this.ak, (int)this.aj, 0);
      double var9 = this.an(var1);
      double var11 = this.al(var1);
      double var13 = this.aj(var1);
      double var15 = var2 - var9;
      double var17 = var4 - var11;
      double var19 = var6 - var13;
      ad3 var21 = new ad3(this.ap, this, var15, var17, var19);
      if (var8) {
         var21.goto(true);
      }

      var21.ak = var11;
      var21.al = var9;
      var21.aj = var13;
      this.ap.new(var21);
   }

   public void a(aig var1, float var2) {
      this.a(0, var1);
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else if (var1 == ai4.f) {
         return false;
      } else if (this.fa() > 0) {
         return false;
      } else {
         aiw var3;
         if (this.fb()) {
            var3 = var1.byte();
            if (var3 instanceof aei) {
               return false;
            }
         }

         var3 = var1.new();
         if (var3 != null && !(var3 instanceof aek) && var3 instanceof aig && ((aig)var3).cn() == this.cn()) {
            return false;
         } else {
            if (this.qE <= 0) {
               this.qE = 20;
            }

            for(int var4 = 0; var4 < this.qF.length; ++var4) {
               int[] var10000 = this.qF;
               var10000[var4] += 3;
            }

            return super.a(var1, var2);
         }
      }
   }

   protected void a(boolean var1, int var2) {
      this.new(abr.br.A, 1);
   }

   protected void bC() {
      this.e8 = 0;
   }

   public int new(float var1) {
      return 15728880;
   }

   public boolean aw() {
      return !this.aR;
   }

   public int e6() {
      return this.bg.int(16);
   }

   protected void try(float var1) {
   }

   public void for(aiz var1) {
   }

   protected boolean co() {
      return true;
   }

   public int b0() {
      return 300;
   }

   public float ak(int var1) {
      return this.qJ[var1];
   }

   public float am(int var1) {
      return this.qK[var1];
   }

   public int fa() {
      return this.bg.int(20);
   }

   public void ap(int var1) {
      this.bg.if(20, var1);
   }

   public int ao(int var1) {
      return this.bg.int(17 + var1);
   }

   public void i(int var1, int var2) {
      this.bg.if(17 + var1, var2);
   }

   public boolean fb() {
      return this.e6() <= this.b0() / 2;
   }

   public ah8 cn() {
      return ah8.a;
   }

   public void int(aiw var1) {
      this.ar = null;
   }
}
