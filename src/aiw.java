import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;

public abstract class aiw {
   private static int aD = 0;
   public int av;
   public double au;
   public boolean at;
   public aiw as;
   public aiw ar;
   public boolean aq;
   public y6 ap;
   public double ao;
   public double an;
   public double am;
   public double al;
   public double ak;
   public double aj;
   public double ai;
   public double ah;
   public double ag;
   public float a5;
   public float a4;
   public float a2;
   public float a0;
   public final nw aZ;
   public boolean aY;
   public boolean aX;
   public boolean aW;
   public boolean aV;
   public boolean aU;
   protected boolean aT;
   public boolean aS;
   public boolean aR;
   public float aQ;
   public float aP;
   public float aO;
   public float aN;
   public float aM;
   public float aL;
   public float aK;
   private int aC;
   public double aJ;
   public double aI;
   public double aH;
   public float aG;
   public float aF;
   public boolean aE;
   public float bn;
   protected Random bm;
   public int bl;
   public int bk;
   private int aB;
   protected boolean bj;
   public int bi;
   private boolean aA;
   public String af;
   public String ae;
   protected boolean bh;
   protected ah4 bg;
   private double az;
   private double ay;
   public boolean bf;
   public int be;
   public int bd;
   public int bc;
   public int ad;
   public int ac;
   public int ab;
   public boolean bb;
   public boolean ba;
   public int a9;
   protected boolean a8;
   protected int a7;
   public int a6;
   protected int a3;
   private boolean ax;
   private UUID aw;
   public ais a1;

   public aiw(y6 var1) {
      this.av = aD++;
      this.au = 1.0D;
      this.at = false;
      this.aZ = nw.if(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
      this.aY = false;
      this.aV = false;
      this.aU = false;
      this.aS = true;
      this.aR = false;
      this.aQ = 0.0F;
      this.aP = 0.6F;
      this.aO = 1.8F;
      this.aN = 0.0F;
      this.aM = 0.0F;
      this.aL = 0.0F;
      this.aK = 0.0F;
      this.aC = 1;
      this.aG = 0.0F;
      this.aF = 0.0F;
      this.aE = false;
      this.bn = 0.0F;
      this.bm = new Random();
      this.bl = 0;
      this.bk = 1;
      this.aB = 0;
      this.bj = false;
      this.bi = 0;
      this.aA = true;
      this.bh = false;
      this.bg = new ah4();
      this.bf = false;
      this.a3 = 0;
      this.ax = false;
      this.aw = UUID.randomUUID();
      this.a1 = ais.a;
      this.ap = var1;
      this.try(0.0D, 0.0D, 0.0D);
      if (var1 != null) {
         this.a6 = var1.n.if;
      }

      this.bg.a(0, (byte)0);
      this.bg.a(1, (short)300);
      this.X();
   }

   protected abstract void X();

   public ah4 ab() {
      return this.bg;
   }

   public boolean equals(Object var1) {
      if (var1 instanceof aiw) {
         return ((aiw)var1).av == this.av;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.av;
   }

   protected void ay() {
      if (this.ap != null) {
         while(this.ak > 0.0D) {
            this.try(this.al, this.ak, this.aj);
            if (this.ap.if(this, this.aZ).isEmpty()) {
               break;
            }

            ++this.ak;
         }

         this.ai = this.ah = this.ag = 0.0D;
         this.a4 = 0.0F;
      }
   }

   public void az() {
      this.aR = true;
   }

   protected void if(float var1, float var2) {
      if (var1 != this.aP || var2 != this.aO) {
         this.aP = var1;
         this.aO = var2;
         this.aZ.new = this.aZ.if + (double)this.aP;
         this.aZ.for = this.aZ.try + (double)this.aP;
         this.aZ.int = this.aZ.a + (double)this.aO;
      }

      float var3 = var1 % 2.0F;
      if ((double)var3 < 0.375D) {
         this.a1 = ais.if;
      } else if ((double)var3 < 0.75D) {
         this.a1 = ais.a;
      } else if ((double)var3 < 1.0D) {
         this.a1 = ais.try;
      } else if ((double)var3 < 1.375D) {
         this.a1 = ais.new;
      } else if ((double)var3 < 1.75D) {
         this.a1 = ais.int;
      } else {
         this.a1 = ais.for;
      }

   }

   protected void do(float var1, float var2) {
      this.a5 = var1 % 360.0F;
      this.a4 = var2 % 360.0F;
   }

   public void try(double var1, double var3, double var5) {
      this.al = var1;
      this.ak = var3;
      this.aj = var5;
      float var7 = this.aP / 2.0F;
      float var8 = this.aO;
      this.aZ.a(var1 - (double)var7, var3 - (double)this.aQ + (double)this.aG, var5 - (double)var7, var1 + (double)var7, var3 - (double)this.aQ + (double)this.aG + (double)var8, var5 + (double)var7);
   }

   public void for(float var1, float var2) {
      float var3 = this.a4;
      float var4 = this.a5;
      this.a5 = (float)((double)this.a5 + (double)var1 * 0.15D);
      this.a4 = (float)((double)this.a4 - (double)var2 * 0.15D);
      if (this.a4 < -90.0F) {
         this.a4 = -90.0F;
      }

      if (this.a4 > 90.0F) {
         this.a4 = 90.0F;
      }

      this.a0 += this.a4 - var3;
      this.a2 += this.a5 - var4;
   }

   public void aC() {
      this.aD();
   }

   public void aD() {
      this.ap.e.a("entityBaseTick");
      if (this.ar != null && this.ar.aR) {
         this.ar = null;
      }

      this.aN = this.aM;
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      this.a0 = this.a4;
      this.a2 = this.a5;
      int var2;
      if (!this.ap.goto && this.ap instanceof ak5) {
         this.ap.e.a("portal");
         net.minecraft.a.a var1 = ((ak5)this.ap).F();
         var2 = this.aJ();
         if (this.a8) {
            if (var1.hj()) {
               if (this.ar == null && this.a7++ >= var2) {
                  this.a7 = var2;
                  this.a9 = this.aO();
                  byte var3;
                  if (this.ap.n.if == -1) {
                     var3 = 0;
                  } else {
                     var3 = -1;
                  }

                  this.f(var3);
               }

               this.a8 = false;
            }
         } else {
            if (this.a7 > 0) {
               this.a7 -= 4;
            }

            if (this.a7 < 0) {
               this.a7 = 0;
            }
         }

         if (this.a9 > 0) {
            --this.a9;
         }

         this.ap.e.if();
      }

      if (this.S() && !this.ap()) {
         int var5 = ajs.a(this.al);
         var2 = ajs.a(this.ak - 0.20000000298023224D - (double)this.aQ);
         int var6 = ajs.a(this.aj);
         int var4 = this.ap.new(var5, var2, var6);
         if (var4 > 0) {
            this.ap.a("tilecrack_" + var4 + "_" + this.ap.for(var5, var2, var6), this.al + ((double)this.bm.nextFloat() - 0.5D) * (double)this.aP, this.aZ.a + 0.1D, this.aj + ((double)this.bm.nextFloat() - 0.5D) * (double)this.aP, -this.ai * 4.0D, 1.5D, -this.ag * 4.0D);
         }
      }

      this.aq();
      if (this.ap.goto) {
         this.aB = 0;
      } else if (this.aB > 0) {
         if (this.bh) {
            this.aB -= 4;
            if (this.aB < 0) {
               this.aB = 0;
            }
         } else {
            if (this.aB % 20 == 0) {
               this.a((ai4)ai4.i, 1);
            }

            --this.aB;
         }
      }

      if (this.ar()) {
         this.aF();
         this.aK *= 0.5F;
      }

      if (this.ak < -64.0D) {
         this.ag();
      }

      if (!this.ap.goto) {
         this.a(0, this.aB > 0);
         this.a(2, this.ar != null);
      }

      this.aA = false;
      this.ap.e.if();
   }

   public int aJ() {
      return 0;
   }

   protected void aF() {
      if (!this.bh) {
         this.a((ai4)ai4.h, 4);
         this.e(15);
      }

   }

   public void e(int var1) {
      int var2 = var1 * 20;
      var2 = zr.a(this, var2);
      if (this.aB < var2) {
         this.aB = var2;
      }

   }

   public void ad() {
      this.aB = 0;
   }

   protected void ag() {
      this.az();
   }

   public boolean int(double var1, double var3, double var5) {
      nw var7 = this.aZ.int(var1, var3, var5);
      List var8 = this.ap.if(this, var7);
      if (!var8.isEmpty()) {
         return false;
      } else {
         return !this.ap.do(var7);
      }
   }

   public void do(double var1, double var3, double var5) {
      if (this.aE) {
         this.aZ.if(var1, var3, var5);
         this.al = (this.aZ.if + this.aZ.new) / 2.0D;
         this.ak = this.aZ.a + (double)this.aQ - (double)this.aG;
         this.aj = (this.aZ.try + this.aZ.for) / 2.0D;
      } else {
         this.ap.e.a("move");
         this.aG *= 0.4F;
         double var7 = this.al;
         double var9 = this.ak;
         double var11 = this.aj;
         if (this.aT) {
            this.aT = false;
            var1 *= 0.25D;
            var3 *= 0.05000000074505806D;
            var5 *= 0.25D;
            this.ai = 0.0D;
            this.ah = 0.0D;
            this.ag = 0.0D;
         }

         double var13 = var1;
         double var15 = var3;
         double var17 = var5;
         nw var19 = this.aZ.do();
         boolean var20 = this.aY && this.Q() && this instanceof aek;
         if (var20) {
            double var21;
            for(var21 = 0.05D; var1 != 0.0D && this.ap.if(this, this.aZ.int(var1, -1.0D, 0.0D)).isEmpty(); var13 = var1) {
               if (var1 < var21 && var1 >= -var21) {
                  var1 = 0.0D;
               } else if (var1 > 0.0D) {
                  var1 -= var21;
               } else {
                  var1 += var21;
               }
            }

            for(; var5 != 0.0D && this.ap.if(this, this.aZ.int(0.0D, -1.0D, var5)).isEmpty(); var17 = var5) {
               if (var5 < var21 && var5 >= -var21) {
                  var5 = 0.0D;
               } else if (var5 > 0.0D) {
                  var5 -= var21;
               } else {
                  var5 += var21;
               }
            }

            while(var1 != 0.0D && var5 != 0.0D && this.ap.if(this, this.aZ.int(var1, -1.0D, var5)).isEmpty()) {
               if (var1 < var21 && var1 >= -var21) {
                  var1 = 0.0D;
               } else if (var1 > 0.0D) {
                  var1 -= var21;
               } else {
                  var1 += var21;
               }

               if (var5 < var21 && var5 >= -var21) {
                  var5 = 0.0D;
               } else if (var5 > 0.0D) {
                  var5 -= var21;
               } else {
                  var5 += var21;
               }

               var13 = var1;
               var17 = var5;
            }
         }

         List var34 = this.ap.if(this, this.aZ.a(var1, var3, var5));

         for(int var22 = 0; var22 < var34.size(); ++var22) {
            var3 = ((nw)var34.get(var22)).a(this.aZ, var3);
         }

         this.aZ.if(0.0D, var3, 0.0D);
         if (!this.aS && var15 != var3) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         boolean var35 = this.aY || var15 != var3 && var15 < 0.0D;

         int var23;
         for(var23 = 0; var23 < var34.size(); ++var23) {
            var1 = ((nw)var34.get(var23)).do(this.aZ, var1);
         }

         this.aZ.if(var1, 0.0D, 0.0D);
         if (!this.aS && var13 != var1) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         for(var23 = 0; var23 < var34.size(); ++var23) {
            var5 = ((nw)var34.get(var23)).if(this.aZ, var5);
         }

         this.aZ.if(0.0D, 0.0D, var5);
         if (!this.aS && var17 != var5) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         double var25;
         double var27;
         int var30;
         double var36;
         if (this.aF > 0.0F && var35 && (var20 || this.aG < 0.05F) && (var13 != var1 || var17 != var5)) {
            var36 = var1;
            var25 = var3;
            var27 = var5;
            var1 = var13;
            var3 = (double)this.aF;
            var5 = var17;
            nw var29 = this.aZ.do();
            this.aZ.if(var19);
            var34 = this.ap.if(this, this.aZ.a(var13, var3, var17));

            for(var30 = 0; var30 < var34.size(); ++var30) {
               var3 = ((nw)var34.get(var30)).a(this.aZ, var3);
            }

            this.aZ.if(0.0D, var3, 0.0D);
            if (!this.aS && var15 != var3) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            for(var30 = 0; var30 < var34.size(); ++var30) {
               var1 = ((nw)var34.get(var30)).do(this.aZ, var1);
            }

            this.aZ.if(var1, 0.0D, 0.0D);
            if (!this.aS && var13 != var1) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            for(var30 = 0; var30 < var34.size(); ++var30) {
               var5 = ((nw)var34.get(var30)).if(this.aZ, var5);
            }

            this.aZ.if(0.0D, 0.0D, var5);
            if (!this.aS && var17 != var5) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            if (!this.aS && var15 != var3) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            } else {
               var3 = (double)(-this.aF);

               for(var30 = 0; var30 < var34.size(); ++var30) {
                  var3 = ((nw)var34.get(var30)).a(this.aZ, var3);
               }

               this.aZ.if(0.0D, var3, 0.0D);
            }

            if (var36 * var36 + var27 * var27 >= var1 * var1 + var5 * var5) {
               var1 = var36;
               var3 = var25;
               var5 = var27;
               this.aZ.if(var29);
            }
         }

         this.ap.e.if();
         this.ap.e.a("rest");
         this.al = (this.aZ.if + this.aZ.new) / 2.0D;
         this.ak = this.aZ.a + (double)this.aQ - (double)this.aG;
         this.aj = (this.aZ.try + this.aZ.for) / 2.0D;
         this.aX = var13 != var1 || var17 != var5;
         this.aW = var15 != var3;
         this.aY = var15 != var3 && var15 < 0.0D;
         this.aV = this.aX || this.aW;
         this.a(var3, this.aY);
         if (var13 != var1) {
            this.ai = 0.0D;
         }

         if (var15 != var3) {
            this.ah = 0.0D;
         }

         if (var17 != var5) {
            this.ag = 0.0D;
         }

         var36 = this.al - var7;
         var25 = this.ak - var9;
         var27 = this.aj - var11;
         if (this.aK() && !var20 && this.ar == null) {
            int var37 = ajs.a(this.al);
            var30 = ajs.a(this.ak - 0.20000000298023224D - (double)this.aQ);
            int var31 = ajs.a(this.aj);
            int var32 = this.ap.new(var37, var30, var31);
            if (var32 == 0) {
               int var33 = this.ap.q(var37, var30 - 1, var31);
               if (var33 == 11 || var33 == 32 || var33 == 21) {
                  var32 = this.ap.new(var37, var30 - 1, var31);
               }
            }

            if (var32 != pa.cn.void) {
               var25 = 0.0D;
            }

            this.aM = (float)((double)this.aM + (double)ajs.int(var36 * var36 + var27 * var27) * 0.6D);
            this.aL = (float)((double)this.aL + (double)ajs.int(var36 * var36 + var25 * var25 + var27 * var27) * 0.6D);
            if (this.aL > (float)this.aC && var32 > 0) {
               this.aC = (int)this.aL + 1;
               if (this.ap()) {
                  float var39 = ajs.int(this.ai * this.ai * 0.20000000298023224D + this.ah * this.ah + this.ag * this.ag * 0.20000000298023224D) * 0.35F;
                  if (var39 > 1.0F) {
                     var39 = 1.0F;
                  }

                  this.a("liquid.swim", var39, 1.0F + (this.bm.nextFloat() - this.bm.nextFloat()) * 0.4F);
               }

               this.a(var37, var30, var31, var32);
               pa.x[var32].a(this.ap, var37, var30, var31, this);
            }
         }

         this.ai();
         boolean var38 = this.ao();
         if (this.ap.for(this.aZ.for(0.001D, 0.001D, 0.001D))) {
            this.d(1);
            if (!var38) {
               ++this.aB;
               if (this.aB == 0) {
                  this.e(8);
               }
            }
         } else if (this.aB <= 0) {
            this.aB = -this.bk;
         }

         if (var38 && this.aB > 0) {
            this.a("random.fizz", 0.7F, 1.6F + (this.bm.nextFloat() - this.bm.nextFloat()) * 0.4F);
            this.aB = -this.bk;
         }

         this.ap.e.if();
      }
   }

   protected void ai() {
      int var1 = ajs.a(this.aZ.if + 0.001D);
      int var2 = ajs.a(this.aZ.a + 0.001D);
      int var3 = ajs.a(this.aZ.try + 0.001D);
      int var4 = ajs.a(this.aZ.new - 0.001D);
      int var5 = ajs.a(this.aZ.int - 0.001D);
      int var6 = ajs.a(this.aZ.for - 0.001D);
      if (this.ap.for(var1, var2, var3, var4, var5, var6)) {
         for(int var7 = var1; var7 <= var4; ++var7) {
            for(int var8 = var2; var8 <= var5; ++var8) {
               for(int var9 = var3; var9 <= var6; ++var9) {
                  int var10 = this.ap.new(var7, var8, var9);
                  if (var10 > 0) {
                     pa.x[var10].if(this.ap, var7, var8, var9, this);
                  }
               }
            }
         }
      }

   }

   protected void a(int var1, int var2, int var3, int var4) {
      o6 var5 = pa.x[var4].az;
      if (this.ap.new(var1, var2 + 1, var3) == pa.ca.void) {
         var5 = pa.ca.az;
         this.a(var5.if(), var5.for() * 0.15F, var5.a());
      } else if (!pa.x[var4].at.case()) {
         this.a(var5.if(), var5.for() * 0.15F, var5.a());
      }

   }

   public void a(String var1, float var2, float var3) {
      this.ap.a(this, var1, var2, var3);
   }

   protected boolean aK() {
      return true;
   }

   protected void a(double var1, boolean var3) {
      if (var3) {
         if (this.aK > 0.0F) {
            this.try(this.aK);
            this.aK = 0.0F;
         }
      } else if (var1 < 0.0D) {
         this.aK = (float)((double)this.aK - var1);
      }

   }

   public nw aL() {
      return null;
   }

   protected void d(int var1) {
      if (!this.bh) {
         this.a(ai4.j, var1);
      }

   }

   public final boolean al() {
      return this.bh;
   }

   protected void try(float var1) {
      if (this.as != null) {
         this.as.try(var1);
      }

   }

   public boolean ao() {
      return this.bj || this.ap.d(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj)) || this.ap.d(ajs.a(this.al), ajs.a(this.ak + (double)this.aO), ajs.a(this.aj));
   }

   public boolean ap() {
      return this.bj;
   }

   public boolean aq() {
      if (this.ap.a(this.aZ.do(0.0D, -0.4000000059604645D, 0.0D).for(0.001D, 0.001D, 0.001D), ts.s, this)) {
         if (!this.bj && !this.aA) {
            float var1 = ajs.int(this.ai * this.ai * 0.20000000298023224D + this.ah * this.ah + this.ag * this.ag * 0.20000000298023224D) * 0.2F;
            if (var1 > 1.0F) {
               var1 = 1.0F;
            }

            this.a("liquid.splash", var1, 1.0F + (this.bm.nextFloat() - this.bm.nextFloat()) * 0.4F);
            float var2 = (float)ajs.a(this.aZ.a);

            int var3;
            float var4;
            float var5;
            for(var3 = 0; (float)var3 < 1.0F + this.aP * 20.0F; ++var3) {
               var4 = (this.bm.nextFloat() * 2.0F - 1.0F) * this.aP;
               var5 = (this.bm.nextFloat() * 2.0F - 1.0F) * this.aP;
               this.ap.a("bubble", this.al + (double)var4, (double)(var2 + 1.0F), this.aj + (double)var5, this.ai, this.ah - (double)(this.bm.nextFloat() * 0.2F), this.ag);
            }

            for(var3 = 0; (float)var3 < 1.0F + this.aP * 20.0F; ++var3) {
               var4 = (this.bm.nextFloat() * 2.0F - 1.0F) * this.aP;
               var5 = (this.bm.nextFloat() * 2.0F - 1.0F) * this.aP;
               this.ap.a("splash", this.al + (double)var4, (double)(var2 + 1.0F), this.aj + (double)var5, this.ai, this.ah, this.ag);
            }
         }

         this.aK = 0.0F;
         this.bj = true;
         this.aB = 0;
      } else {
         this.bj = false;
      }

      return this.bj;
   }

   public boolean a(ts var1) {
      double var2 = this.ak + (double)this.af();
      int var4 = ajs.a(this.al);
      int var5 = ajs.new((float)ajs.a(var2));
      int var6 = ajs.a(this.aj);
      int var7 = this.ap.new(var4, var5, var6);
      if (var7 != 0 && pa.x[var7].at == var1) {
         float var8 = qn.i(this.ap.for(var4, var5, var6)) - 0.11111111F;
         float var9 = (float)(var5 + 1) - var8;
         return var2 < (double)var9;
      } else {
         return false;
      }
   }

   public float af() {
      return 0.0F;
   }

   public boolean ar() {
      return this.ap.if(this.aZ.do(-0.10000000149011612D, -0.4000000059604645D, -0.10000000149011612D), ts.r);
   }

   public void a(float var1, float var2, float var3) {
      float var4 = var1 * var1 + var2 * var2;
      if (!(var4 < 1.0E-4F)) {
         var4 = ajs.if(var4);
         if (var4 < 1.0F) {
            var4 = 1.0F;
         }

         var4 = var3 / var4;
         var1 *= var4;
         var2 *= var4;
         float var5 = ajs.try(this.a5 * 3.1415927F / 180.0F);
         float var6 = ajs.for(this.a5 * 3.1415927F / 180.0F);
         this.ai += (double)(var1 * var6 - var2 * var5);
         this.ag += (double)(var2 * var6 + var1 * var5);
      }
   }

   public int new(float var1) {
      int var2 = ajs.a(this.al);
      int var3 = ajs.a(this.aj);
      if (this.ap.p(var2, 0, var3)) {
         double var4 = (this.aZ.int - this.aZ.a) * 0.66D;
         int var6 = ajs.a(this.ak - (double)this.aQ + var4);
         return this.ap.do(var2, var6, var3, 0);
      } else {
         return 0;
      }
   }

   public float int(float var1) {
      int var2 = ajs.a(this.al);
      int var3 = ajs.a(this.aj);
      if (this.ap.p(var2, 0, var3)) {
         double var4 = (this.aZ.int - this.aZ.a) * 0.66D;
         int var6 = ajs.a(this.ak - (double)this.aQ + var4);
         return this.ap.int(var2, var6, var3);
      } else {
         return 0.0F;
      }
   }

   public void if(y6 var1) {
      this.ap = var1;
   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      this.ao = this.al = var1;
      this.an = this.ak = var3;
      this.am = this.aj = var5;
      this.a2 = this.a5 = var7;
      this.a0 = this.a4 = var8;
      this.aG = 0.0F;
      double var9 = (double)(this.a2 - var7);
      if (var9 < -180.0D) {
         this.a2 += 360.0F;
      }

      if (var9 >= 180.0D) {
         this.a2 -= 360.0F;
      }

      this.try(this.al, this.ak, this.aj);
      this.do(var7, var8);
   }

   public void if(double var1, double var3, double var5, float var7, float var8) {
      this.aJ = this.ao = this.al = var1;
      this.aI = this.an = this.ak = var3 + (double)this.aQ;
      this.aH = this.am = this.aj = var5;
      this.a5 = var7;
      this.a4 = var8;
      this.try(this.al, this.ak, this.aj);
   }

   public float char(aiw var1) {
      float var2 = (float)(this.al - var1.al);
      float var3 = (float)(this.ak - var1.ak);
      float var4 = (float)(this.aj - var1.aj);
      return ajs.if(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public double if(double var1, double var3, double var5) {
      double var7 = this.al - var1;
      double var9 = this.ak - var3;
      double var11 = this.aj - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double case(double var1, double var3, double var5) {
      double var7 = this.al - var1;
      double var9 = this.ak - var3;
      double var11 = this.aj - var5;
      return (double)ajs.int(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public double for(aiw var1) {
      double var2 = this.al - var1.al;
      double var4 = this.ak - var1.ak;
      double var6 = this.aj - var1.aj;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public void do(aek var1) {
   }

   public void try(aiw var1) {
      if (var1.as != this && var1.ar != this) {
         double var2 = var1.al - this.al;
         double var4 = var1.aj - this.aj;
         double var6 = ajs.a(var2, var4);
         if (var6 >= 0.009999999776482582D) {
            var6 = (double)ajs.int(var6);
            var2 /= var6;
            var4 /= var6;
            double var8 = 1.0D / var6;
            if (var8 > 1.0D) {
               var8 = 1.0D;
            }

            var2 *= var8;
            var4 *= var8;
            var2 *= 0.05000000074505806D;
            var4 *= 0.05000000074505806D;
            var2 *= (double)(1.0F - this.bn);
            var4 *= (double)(1.0F - this.bn);
            this.byte(-var2, 0.0D, -var4);
            var1.byte(var2, 0.0D, var4);
         }

      }
   }

   public void byte(double var1, double var3, double var5) {
      this.ai += var1;
      this.ah += var3;
      this.ag += var5;
      this.ba = true;
   }

   protected void av() {
      this.aU = true;
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else {
         this.av();
         return false;
      }
   }

   public boolean aw() {
      return false;
   }

   public boolean ax() {
      return false;
   }

   public void a(aiw var1, int var2) {
   }

   public boolean a(nr var1) {
      double var2 = this.al - var1.int;
      double var4 = this.ak - var1.for;
      double var6 = this.aj - var1.do;
      double var8 = var2 * var2 + var4 * var4 + var6 * var6;
      return this.a(var8);
   }

   public boolean a(double var1) {
      double var3 = this.aZ.a();
      var3 *= 64.0D * this.au;
      return var1 < var3 * var3;
   }

   public String W() {
      return null;
   }

   public boolean new(aqv var1) {
      String var2 = this.au();
      if (!this.aR && var2 != null) {
         var1.a("id", var2);
         this.int(var1);
         return true;
      } else {
         return false;
      }
   }

   public boolean case(aqv var1) {
      String var2 = this.au();
      if (!this.aR && var2 != null && this.as == null) {
         var1.a("id", var2);
         this.int(var1);
         return true;
      } else {
         return false;
      }
   }

   public void int(aqv var1) {
      try {
         var1.a("Pos", (aqd)this.a(this.al, this.ak + (double)this.aG, this.aj));
         var1.a("Motion", (aqd)this.a(this.ai, this.ah, this.ag));
         var1.a("Rotation", (aqd)this.a(this.a5, this.a4));
         var1.a("FallDistance", this.aK);
         var1.a("Fire", (short)this.aB);
         var1.a("Air", (short)this.Z());
         var1.a("OnGround", this.aY);
         var1.a("Dimension", this.a6);
         var1.a("Invulnerable", this.ax);
         var1.a("PortalCooldown", this.a9);
         var1.a("UUIDMost", this.aw.getMostSignificantBits());
         var1.a("UUIDLeast", this.aw.getLeastSignificantBits());
         this.for(var1);
         if (this.ar != null) {
            aqv var2 = new aqv("Riding");
            if (this.ar.new(var2)) {
               var1.a("Riding", (aqd)var2);
            }
         }

      } catch (Throwable var5) {
         aqh var3 = aqh.a(var5, "Saving entity NBT");
         apu var4 = var3.a("Entity being saved");
         this.if(var4);
         throw new ape(var3);
      }
   }

   public void byte(aqv var1) {
      try {
         aqm var2 = var1.void("Pos");
         aqm var6 = var1.void("Motion");
         aqm var7 = var1.void("Rotation");
         this.ai = ((aqs)var6.a(0)).else;
         this.ah = ((aqs)var6.a(1)).else;
         this.ag = ((aqs)var6.a(2)).else;
         if (Math.abs(this.ai) > 10.0D) {
            this.ai = 0.0D;
         }

         if (Math.abs(this.ah) > 10.0D) {
            this.ah = 0.0D;
         }

         if (Math.abs(this.ag) > 10.0D) {
            this.ag = 0.0D;
         }

         this.ao = this.aJ = this.al = ((aqs)var2.a(0)).else;
         this.an = this.aI = this.ak = ((aqs)var2.a(1)).else;
         this.am = this.aH = this.aj = ((aqs)var2.a(2)).else;
         this.a2 = this.a5 = ((aqq)var7.a(0)).char;
         this.a0 = this.a4 = ((aqq)var7.a(1)).char;
         this.aK = var1.b("FallDistance");
         this.aB = var1.case("Fire");
         this.b(var1.case("Air"));
         this.aY = var1.if("OnGround");
         this.a6 = var1.goto("Dimension");
         this.ax = var1.if("Invulnerable");
         this.a9 = var1.goto("PortalCooldown");
         if (var1.try("UUIDMost") && var1.try("UUIDLeast")) {
            this.aw = new UUID(var1.long("UUIDMost"), var1.long("UUIDLeast"));
         }

         this.try(this.al, this.ak, this.aj);
         this.do(this.a5, this.a4);
         this.try(var1);
      } catch (Throwable var5) {
         aqh var3 = aqh.a(var5, "Loading entity NBT");
         apu var4 = var3.a("Entity being loaded");
         this.if(var4);
         throw new ape(var3);
      }
   }

   protected final String au() {
      return air.if(this);
   }

   protected abstract void try(aqv var1);

   protected abstract void for(aqv var1);

   protected aqm a(double... var1) {
      aqm var2 = new aqm();
      double[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         double var6 = var3[var5];
         var2.a((aqd)(new aqs((String)null, var6)));
      }

      return var2;
   }

   protected aqm a(float... var1) {
      aqm var2 = new aqm();
      float[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         float var6 = var3[var5];
         var2.a((aqd)(new aqq((String)null, var6)));
      }

      return var2;
   }

   public float aH() {
      return this.aO / 2.0F;
   }

   public afk new(int var1, int var2) {
      return this.a(var1, var2, 0.0F);
   }

   public afk a(int var1, int var2, float var3) {
      return this.a(new abp(var1, var2, 0), var3);
   }

   public afk a(abp var1, float var2) {
      afk var3 = new afk(this.ap, this.al, this.ak + (double)var2, this.aj, var1);
      var3.dB = 10;
      this.ap.new(var3);
      return var3;
   }

   public boolean aA() {
      return !this.aR;
   }

   public boolean aE() {
      for(int var1 = 0; var1 < 8; ++var1) {
         float var2 = ((float)((var1 >> 0) % 2) - 0.5F) * this.aP * 0.8F;
         float var3 = ((float)((var1 >> 1) % 2) - 0.5F) * 0.1F;
         float var4 = ((float)((var1 >> 2) % 2) - 0.5F) * this.aP * 0.8F;
         int var5 = ajs.a(this.al + (double)var2);
         int var6 = ajs.a(this.ak + (double)this.af() + (double)var3);
         int var7 = ajs.a(this.aj + (double)var4);
         if (this.ap.try(var5, var6, var7)) {
            return true;
         }
      }

      return false;
   }

   public boolean for(aek var1) {
      return false;
   }

   public nw case(aiw var1) {
      return null;
   }

   public void aG() {
      if (this.ar.aR) {
         this.ar = null;
      } else {
         this.ai = 0.0D;
         this.ah = 0.0D;
         this.ag = 0.0D;
         this.aC();
         if (this.ar != null) {
            this.ar.aI();
            this.ay += (double)(this.ar.a5 - this.ar.a2);

            for(this.az += (double)(this.ar.a4 - this.ar.a0); this.ay >= 180.0D; this.ay -= 360.0D) {
            }

            while(this.ay < -180.0D) {
               this.ay += 360.0D;
            }

            while(this.az >= 180.0D) {
               this.az -= 360.0D;
            }

            while(this.az < -180.0D) {
               this.az += 360.0D;
            }

            double var1 = this.ay * 0.5D;
            double var3 = this.az * 0.5D;
            float var5 = 10.0F;
            if (var1 > (double)var5) {
               var1 = (double)var5;
            }

            if (var1 < (double)(-var5)) {
               var1 = (double)(-var5);
            }

            if (var3 > (double)var5) {
               var3 = (double)var5;
            }

            if (var3 < (double)(-var5)) {
               var3 = (double)(-var5);
            }

            this.ay -= var1;
            this.az -= var3;
            this.a5 = (float)((double)this.a5 + var1);
            this.a4 = (float)((double)this.a4 + var3);
         }
      }
   }

   public void aI() {
      if (this.as != null) {
         if (!(this.as instanceof aek) || !((aek)this.as).cM()) {
            this.as.aJ = this.aJ;
            this.as.aI = this.aI + this.O() + this.as.aQ();
            this.as.aH = this.aH;
         }

         this.as.try(this.al, this.ak + this.O() + this.as.aQ(), this.aj);
      }
   }

   public double aQ() {
      return (double)this.aQ;
   }

   public double O() {
      return (double)this.aO * 0.75D;
   }

   public void int(aiw var1) {
      this.az = 0.0D;
      this.ay = 0.0D;
      if (var1 == null) {
         if (this.ar != null) {
            this.if(this.ar.al, this.ar.aZ.a + (double)this.ar.aO, this.ar.aj, this.a5, this.a4);
            this.ar.as = null;
         }

         this.ar = null;
      } else {
         if (this.ar != null) {
            this.ar.as = null;
         }

         this.ar = var1;
         var1.as = this;
      }
   }

   public void byte(aiw var1) {
      double var3 = this.al;
      double var5 = this.ak;
      double var7 = this.aj;
      if (var1 != null) {
         var3 = var1.al;
         var5 = var1.aZ.a + (double)var1.aO;
         var7 = var1.aj;
      }

      for(double var9 = -1.5D; var9 < 2.0D; ++var9) {
         for(double var11 = -1.5D; var11 < 2.0D; ++var11) {
            if (var9 != 0.0D || var11 != 0.0D) {
               int var13 = (int)(this.al + var9);
               int var14 = (int)(this.aj + var11);
               nw var2 = this.aZ.int(var9, 1.0D, var11);
               if (this.ap.if(var2).isEmpty()) {
                  if (this.ap.case(var13, (int)this.ak, var14)) {
                     this.if(this.al + var9, this.ak + 1.0D, this.aj + var11, this.a5, this.a4);
                     return;
                  }

                  if (this.ap.case(var13, (int)this.ak - 1, var14) || this.ap.byte(var13, (int)this.ak - 1, var14) == ts.s) {
                     var3 = this.al + var9;
                     var5 = this.ak + 1.0D;
                     var7 = this.aj + var11;
                  }
               }
            }
         }
      }

      this.if(var3, var5, var7, this.a5, this.a4);
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.try(var1, var3, var5);
      this.do(var7, var8);
      List var10 = this.ap.if(this, this.aZ.for(0.03125D, 0.0D, 0.03125D));
      if (!var10.isEmpty()) {
         double var11 = 0.0D;

         for(int var13 = 0; var13 < var10.size(); ++var13) {
            nw var14 = (nw)var10.get(var13);
            if (var14.int > var11) {
               var11 = var14.int;
            }
         }

         var3 += var11 - this.aZ.a;
         this.try(var1, var3, var5);
      }

   }

   public float P() {
      return 0.1F;
   }

   public nr T() {
      return null;
   }

   public void aR() {
      if (this.a9 > 0) {
         this.a9 = this.aO();
      } else {
         double var1 = this.ao - this.al;
         double var3 = this.am - this.aj;
         if (!this.ap.goto && !this.a8) {
            this.a3 = apk.a(var1, var3);
         }

         this.a8 = true;
      }
   }

   public int aO() {
      return 900;
   }

   public void new(double var1, double var3, double var5) {
      this.ai = var1;
      this.ah = var3;
      this.ag = var5;
   }

   public void a(byte var1) {
   }

   public void aM() {
   }

   public void aN() {
   }

   public abp[] as() {
      return null;
   }

   public void do(int var1, abp var2) {
   }

   public boolean aP() {
      return this.aB > 0 || this.c(0);
   }

   public boolean N() {
      return this.ar != null || this.c(2);
   }

   public boolean Q() {
      return this.c(1);
   }

   public void int(boolean var1) {
      this.a(1, var1);
   }

   public boolean S() {
      return this.c(3);
   }

   public void for(boolean var1) {
      this.a(3, var1);
   }

   public boolean U() {
      return this.c(5);
   }

   public boolean if(aek var1) {
      return this.U();
   }

   public void do(boolean var1) {
      this.a(5, var1);
   }

   public boolean V() {
      return this.c(4);
   }

   public void if(boolean var1) {
      this.a(4, var1);
   }

   protected boolean c(int var1) {
      return (this.bg.for(0) & 1 << var1) != 0;
   }

   protected void a(int var1, boolean var2) {
      byte var3 = this.bg.for(0);
      if (var2) {
         this.bg.if(0, (byte)(var3 | 1 << var1));
      } else {
         this.bg.if(0, (byte)(var3 & ~(1 << var1)));
      }

   }

   public int Z() {
      return this.bg.try(1);
   }

   public void b(int var1) {
      this.bg.if(1, (short)var1);
   }

   public void a(afn var1) {
      this.d(5);
      ++this.aB;
      if (this.aB == 0) {
         this.e(8);
      }

   }

   public void a(aig var1) {
   }

   protected boolean for(double var1, double var3, double var5) {
      int var7 = ajs.a(var1);
      int var8 = ajs.a(var3);
      int var9 = ajs.a(var5);
      double var10 = var1 - (double)var7;
      double var12 = var3 - (double)var8;
      double var14 = var5 - (double)var9;
      List var16 = this.ap.if(this.aZ);
      if (var16.isEmpty() && !this.ap.void(var7, var8, var9)) {
         return false;
      } else {
         boolean var17 = !this.ap.void(var7 - 1, var8, var9);
         boolean var18 = !this.ap.void(var7 + 1, var8, var9);
         boolean var19 = !this.ap.void(var7, var8 - 1, var9);
         boolean var20 = !this.ap.void(var7, var8 + 1, var9);
         boolean var21 = !this.ap.void(var7, var8, var9 - 1);
         boolean var22 = !this.ap.void(var7, var8, var9 + 1);
         byte var23 = 3;
         double var24 = 9999.0D;
         if (var17 && var10 < var24) {
            var24 = var10;
            var23 = 0;
         }

         if (var18 && 1.0D - var10 < var24) {
            var24 = 1.0D - var10;
            var23 = 1;
         }

         if (var20 && 1.0D - var12 < var24) {
            var24 = 1.0D - var12;
            var23 = 3;
         }

         if (var21 && var14 < var24) {
            var24 = var14;
            var23 = 4;
         }

         if (var22 && 1.0D - var14 < var24) {
            var24 = 1.0D - var14;
            var23 = 5;
         }

         float var26 = this.bm.nextFloat() * 0.2F + 0.1F;
         if (var23 == 0) {
            this.ai = (double)(-var26);
         }

         if (var23 == 1) {
            this.ai = (double)var26;
         }

         if (var23 == 2) {
            this.ah = (double)(-var26);
         }

         if (var23 == 3) {
            this.ah = (double)var26;
         }

         if (var23 == 4) {
            this.ag = (double)(-var26);
         }

         if (var23 == 5) {
            this.ag = (double)var26;
         }

         return true;
      }
   }

   public void Y() {
      this.aT = true;
      this.aK = 0.0F;
   }

   public String aB() {
      String var1 = air.if(this);
      if (var1 == null) {
         var1 = "generic";
      }

      return aqz.if("entity." + var1 + ".name");
   }

   public aiw[] R() {
      return null;
   }

   public boolean do(aiw var1) {
      return this == var1;
   }

   public float ae() {
      return 0.0F;
   }

   public void byte(float var1) {
   }

   public boolean aa() {
      return true;
   }

   public boolean new(aiw var1) {
      return false;
   }

   public String toString() {
      return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", this.getClass().getSimpleName(), this.aB(), this.av, this.ap == null ? "~NULL~" : this.ap.l().l(), this.al, this.ak, this.aj);
   }

   public boolean ac() {
      return this.ax;
   }

   public void if(aiw var1) {
      this.if(var1.al, var1.ak, var1.aj, var1.a5, var1.a4);
   }

   public void a(aiw var1, boolean var2) {
      aqv var3 = new aqv();
      var1.int(var3);
      this.byte(var3);
      this.a9 = var1.a9;
      this.a3 = var1.a3;
   }

   public void f(int var1) {
      if (!this.ap.goto && !this.aR) {
         this.ap.e.a("changeDimension");
         net.minecraft.a.a var2 = net.minecraft.a.a.g2();
         int var3 = this.a6;
         ak5 var4 = var2.aS(var3);
         ak5 var5 = var2.aS(var1);
         this.a6 = var1;
         this.ap.a(this);
         this.aR = false;
         this.ap.e.a("reposition");
         var2.g6().a(this, var3, var4, var5);
         this.ap.e.do("reloading");
         aiw var6 = air.a((String)air.if(this), var5);
         if (var6 != null) {
            var6.a(this, true);
            var5.new(var6);
         }

         this.aR = true;
         this.ap.e.if();
         var4.A();
         var5.A();
         this.ap.e.if();
      }
   }

   public float a(zg var1, y6 var2, int var3, int var4, int var5, pa var6) {
      return var6.a(this);
   }

   public boolean a(zg var1, y6 var2, int var3, int var4, int var5, int var6, float var7) {
      return true;
   }

   public int ak() {
      return 3;
   }

   public int am() {
      return this.a3;
   }

   public boolean ah() {
      return false;
   }

   public void if(apu var1) {
      var1.a((String)"Entity Type", (Callable)(new aiv(this)));
      var1.a((String)"Entity ID", (Object)this.av);
      var1.a((String)"Entity Name", (Callable)(new aiu(this)));
      var1.a((String)"Entity's Exact location", (Object)String.format("%.2f, %.2f, %.2f", this.al, this.ak, this.aj));
      var1.a((String)"Entity's Block location", (Object)apu.a(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj)));
      var1.a((String)"Entity's Momentum", (Object)String.format("%.2f, %.2f, %.2f", this.ai, this.ah, this.ag));
   }

   public boolean aj() {
      return this.aP();
   }

   public boolean an() {
      return true;
   }

   public String at() {
      return this.aB();
   }
}
