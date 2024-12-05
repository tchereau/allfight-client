import java.util.List;

public abstract class afj extends aiw {
   private boolean sn;
   private final amd sm;
   private String sl;
   private static final int[][][] sk = new int[][][]{{{0, 0, -1}, {0, 0, 1}}, {{-1, 0, 0}, {1, 0, 0}}, {{-1, -1, 0}, {1, 0, 0}}, {{-1, 0, 0}, {1, -1, 0}}, {{0, 0, -1}, {0, -1, 1}}, {{0, -1, -1}, {0, 0, 1}}, {{0, 0, 1}, {1, 0, 0}}, {{0, 0, 1}, {-1, 0, 0}}, {{0, 0, -1}, {-1, 0, 0}}, {{0, 0, -1}, {1, 0, 0}}};
   private int sj;
   private double si;
   private double sh;
   private double sg;
   private double sf;
   private double se;
   private double sd;
   private double sc;
   private double sb;

   public afj(y6 var1) {
      super(var1);
      this.sn = false;
      this.at = true;
      this.if(0.98F, 0.7F);
      this.aQ = this.aO / 2.0F;
      this.sm = var1 != null ? var1.a(this) : null;
   }

   public static afj a(y6 var0, double var1, double var3, double var5, int var7) {
      switch(var7) {
      case 1:
         return new afi(var0, var1, var3, var5);
      case 2:
         return new afg(var0, var1, var3, var5);
      case 3:
         return new afb(var0, var1, var3, var5);
      case 4:
         return new afd(var0, var1, var3, var5);
      case 5:
         return new aff(var0, var1, var3, var5);
      default:
         return new afe(var0, var1, var3, var5);
      }
   }

   protected boolean aK() {
      return false;
   }

   protected void X() {
      this.bg.a(17, new Integer(0));
      this.bg.a(18, new Integer(1));
      this.bg.a(19, new Integer(0));
      this.bg.a(20, new Integer(0));
      this.bg.a(21, new Integer(6));
      this.bg.a(22, (byte)0);
   }

   public nw case(aiw var1) {
      return var1.ax() ? var1.aZ : null;
   }

   public nw aL() {
      return null;
   }

   public boolean ax() {
      return true;
   }

   public afj(y6 var1, double var2, double var4, double var6) {
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
      if (!this.ap.goto && !this.aR) {
         if (this.ac()) {
            return false;
         } else {
            this.aG(-this.fZ());
            this.aI(10);
            this.av();
            this.aE(this.f2() + var2 * 10);
            boolean var3 = var1.new() instanceof aek && ((aek)var1.new()).fY.new;
            if (var3 || this.f2() > 40) {
               if (this.as != null) {
                  this.as.int((aiw)this);
               }

               if (var3 && !this.s()) {
                  this.az();
               } else {
                  this.if(var1);
               }
            }

            return true;
         }
      } else {
         return true;
      }
   }

   public void if(ai4 var1) {
      this.az();
      abp var2 = new abp(abr.cy, 1);
      if (this.sl != null) {
         var2.a(this.sl);
      }

      this.a(var2, 0.0F);
   }

   public void aM() {
      this.aG(-this.fZ());
      this.aI(10);
      this.aE(this.f2() + this.f2() * 10);
   }

   public boolean aw() {
      return !this.aR;
   }

   public void az() {
      super.az();
      if (this.sm != null) {
         this.sm.a();
      }

   }

   public void aC() {
      if (this.sm != null) {
         this.sm.a();
      }

      if (this.f7() > 0) {
         this.aI(this.f7() - 1);
      }

      if (this.f2() > 0) {
         this.aE(this.f2() - 1);
      }

      if (this.ak < -64.0D) {
         this.ag();
      }

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

      if (this.ap.goto) {
         if (this.sj > 0) {
            double var19 = this.al + (this.si - this.al) / (double)this.sj;
            double var21 = this.ak + (this.sh - this.ak) / (double)this.sj;
            double var5 = this.aj + (this.sg - this.aj) / (double)this.sj;
            double var7 = ajs.do(this.sf - (double)this.a5);
            this.a5 = (float)((double)this.a5 + var7 / (double)this.sj);
            this.a4 = (float)((double)this.a4 + (this.se - (double)this.a4) / (double)this.sj);
            --this.sj;
            this.try(var19, var21, var5);
            this.do(this.a5, this.a4);
         } else {
            this.try(this.al, this.ak, this.aj);
            this.do(this.a5, this.a4);
         }

      } else {
         this.ao = this.al;
         this.an = this.ak;
         this.am = this.aj;
         this.ah -= 0.03999999910593033D;
         int var18 = ajs.a(this.al);
         var2 = ajs.a(this.ak);
         int var20 = ajs.a(this.aj);
         if (r6.X(this.ap, var18, var2 - 1, var20)) {
            --var2;
         }

         double var4 = 0.4D;
         double var6 = 0.0078125D;
         int var8 = this.ap.new(var18, var2, var20);
         if (r6.L(var8)) {
            int var9 = this.ap.for(var18, var2, var20);
            this.a(var18, var2, var20, var4, var6, var8, var9);
            if (var8 == pa.c.void) {
               this.a(var18, var2, var20, (var9 & 8) != 0);
            }
         } else {
            this.for(var4);
         }

         this.ai();
         this.a4 = 0.0F;
         double var22 = this.ao - this.al;
         double var11 = this.am - this.aj;
         if (var22 * var22 + var11 * var11 > 0.001D) {
            this.a5 = (float)(Math.atan2(var11, var22) * 180.0D / 3.141592653589793D);
            if (this.sn) {
               this.a5 += 180.0F;
            }
         }

         double var13 = (double)ajs.int(this.a5 - this.a2);
         if (var13 < -170.0D || var13 >= 170.0D) {
            this.a5 += 180.0F;
            this.sn = !this.sn;
         }

         this.do(this.a5, this.a4);
         List var15 = this.ap.a((aiw)this, (nw)this.aZ.do(0.20000000298023224D, 0.0D, 0.20000000298023224D));
         if (var15 != null && !var15.isEmpty()) {
            for(int var16 = 0; var16 < var15.size(); ++var16) {
               aiw var17 = (aiw)var15.get(var16);
               if (var17 != this.as && var17.ax() && var17 instanceof afj) {
                  var17.try((aiw)this);
               }
            }
         }

         if (this.as != null && this.as.aR) {
            if (this.as.ar == this) {
               this.as.ar = null;
            }

            this.as = null;
         }

      }
   }

   public void a(int var1, int var2, int var3, boolean var4) {
   }

   protected void for(double var1) {
      if (this.ai < -var1) {
         this.ai = -var1;
      }

      if (this.ai > var1) {
         this.ai = var1;
      }

      if (this.ag < -var1) {
         this.ag = -var1;
      }

      if (this.ag > var1) {
         this.ag = var1;
      }

      if (this.aY) {
         this.ai *= 0.5D;
         this.ah *= 0.5D;
         this.ag *= 0.5D;
      }

      this.do(this.ai, this.ah, this.ag);
      if (!this.aY) {
         this.ai *= 0.949999988079071D;
         this.ah *= 0.949999988079071D;
         this.ag *= 0.949999988079071D;
      }

   }

   protected void a(int var1, int var2, int var3, double var4, double var6, int var8, int var9) {
      this.aK = 0.0F;
      nr var10 = this.void(this.al, this.ak, this.aj);
      this.ak = (double)var2;
      boolean var11 = false;
      boolean var12 = false;
      if (var8 == pa.aj.void) {
         var11 = (var9 & 8) != 0;
         var12 = !var11;
      }

      if (((r6)pa.x[var8]).E()) {
         var9 &= 7;
      }

      if (var9 >= 2 && var9 <= 5) {
         this.ak = (double)(var2 + 1);
      }

      if (var9 == 2) {
         this.ai -= var6;
      }

      if (var9 == 3) {
         this.ai += var6;
      }

      if (var9 == 4) {
         this.ag += var6;
      }

      if (var9 == 5) {
         this.ag -= var6;
      }

      int[][] var13 = sk[var9];
      double var14 = (double)(var13[1][0] - var13[0][0]);
      double var16 = (double)(var13[1][2] - var13[0][2]);
      double var18 = Math.sqrt(var14 * var14 + var16 * var16);
      double var20 = this.ai * var14 + this.ag * var16;
      if (var20 < 0.0D) {
         var14 = -var14;
         var16 = -var16;
      }

      double var22 = Math.sqrt(this.ai * this.ai + this.ag * this.ag);
      if (var22 > 2.0D) {
         var22 = 2.0D;
      }

      this.ai = var22 * var14 / var18;
      this.ag = var22 * var16 / var18;
      double var24;
      double var26;
      if (this.as != null) {
         var24 = this.as.ai * this.as.ai + this.as.ag * this.as.ag;
         var26 = this.ai * this.ai + this.ag * this.ag;
         if (var24 > 1.0E-4D && var26 < 0.01D) {
            this.ai += this.as.ai * 0.1D;
            this.ag += this.as.ag * 0.1D;
            var12 = false;
         }
      }

      if (var12) {
         var24 = Math.sqrt(this.ai * this.ai + this.ag * this.ag);
         if (var24 < 0.03D) {
            this.ai *= 0.0D;
            this.ah *= 0.0D;
            this.ag *= 0.0D;
         } else {
            this.ai *= 0.5D;
            this.ah *= 0.0D;
            this.ag *= 0.5D;
         }
      }

      var24 = 0.0D;
      var26 = (double)var1 + 0.5D + (double)var13[0][0] * 0.5D;
      double var28 = (double)var3 + 0.5D + (double)var13[0][2] * 0.5D;
      double var30 = (double)var1 + 0.5D + (double)var13[1][0] * 0.5D;
      double var32 = (double)var3 + 0.5D + (double)var13[1][2] * 0.5D;
      var14 = var30 - var26;
      var16 = var32 - var28;
      double var34;
      double var36;
      if (var14 == 0.0D) {
         this.al = (double)var1 + 0.5D;
         var24 = this.aj - (double)var3;
      } else if (var16 == 0.0D) {
         this.aj = (double)var3 + 0.5D;
         var24 = this.al - (double)var1;
      } else {
         var34 = this.al - var26;
         var36 = this.aj - var28;
         var24 = (var34 * var14 + var36 * var16) * 2.0D;
      }

      this.al = var26 + var14 * var24;
      this.aj = var28 + var16 * var24;
      this.try(this.al, this.ak + (double)this.aQ, this.aj);
      var34 = this.ai;
      var36 = this.ag;
      if (this.as != null) {
         var34 *= 0.75D;
         var36 *= 0.75D;
      }

      if (var34 < -var4) {
         var34 = -var4;
      }

      if (var34 > var4) {
         var34 = var4;
      }

      if (var36 < -var4) {
         var36 = -var4;
      }

      if (var36 > var4) {
         var36 = var4;
      }

      this.do(var34, 0.0D, var36);
      if (var13[0][1] != 0 && ajs.a(this.al) - var1 == var13[0][0] && ajs.a(this.aj) - var3 == var13[0][2]) {
         this.try(this.al, this.ak + (double)var13[0][1], this.aj);
      } else if (var13[1][1] != 0 && ajs.a(this.al) - var1 == var13[1][0] && ajs.a(this.aj) - var3 == var13[1][2]) {
         this.try(this.al, this.ak + (double)var13[1][1], this.aj);
      }

      this.f8();
      nr var38 = this.void(this.al, this.ak, this.aj);
      if (var38 != null && var10 != null) {
         double var39 = (var10.for - var38.for) * 0.05D;
         var22 = Math.sqrt(this.ai * this.ai + this.ag * this.ag);
         if (var22 > 0.0D) {
            this.ai = this.ai / var22 * (var22 + var39);
            this.ag = this.ag / var22 * (var22 + var39);
         }

         this.try(this.al, var38.for, this.aj);
      }

      int var45 = ajs.a(this.al);
      int var40 = ajs.a(this.aj);
      if (var45 != var1 || var40 != var3) {
         var22 = Math.sqrt(this.ai * this.ai + this.ag * this.ag);
         this.ai = var22 * (double)(var45 - var1);
         this.ag = var22 * (double)(var40 - var3);
      }

      if (var11) {
         double var41 = Math.sqrt(this.ai * this.ai + this.ag * this.ag);
         if (var41 > 0.01D) {
            double var43 = 0.06D;
            this.ai += this.ai / var41 * var43;
            this.ag += this.ag / var41 * var43;
         } else if (var9 == 1) {
            if (this.ap.try(var1 - 1, var2, var3)) {
               this.ai = 0.02D;
            } else if (this.ap.try(var1 + 1, var2, var3)) {
               this.ai = -0.02D;
            }
         } else if (var9 == 0) {
            if (this.ap.try(var1, var2, var3 - 1)) {
               this.ag = 0.02D;
            } else if (this.ap.try(var1, var2, var3 + 1)) {
               this.ag = -0.02D;
            }
         }
      }

   }

   protected void f8() {
      if (this.as != null) {
         this.ai *= 0.996999979019165D;
         this.ah *= 0.0D;
         this.ag *= 0.996999979019165D;
      } else {
         this.ai *= 0.9599999785423279D;
         this.ah *= 0.0D;
         this.ag *= 0.9599999785423279D;
      }

   }

   public nr if(double var1, double var3, double var5, double var7) {
      int var9 = ajs.a(var1);
      int var10 = ajs.a(var3);
      int var11 = ajs.a(var5);
      if (r6.X(this.ap, var9, var10 - 1, var11)) {
         --var10;
      }

      int var12 = this.ap.new(var9, var10, var11);
      if (!r6.L(var12)) {
         return null;
      } else {
         int var13 = this.ap.for(var9, var10, var11);
         if (((r6)pa.x[var12]).E()) {
            var13 &= 7;
         }

         var3 = (double)var10;
         if (var13 >= 2 && var13 <= 5) {
            var3 = (double)(var10 + 1);
         }

         int[][] var14 = sk[var13];
         double var15 = (double)(var14[1][0] - var14[0][0]);
         double var17 = (double)(var14[1][2] - var14[0][2]);
         double var19 = Math.sqrt(var15 * var15 + var17 * var17);
         var15 /= var19;
         var17 /= var19;
         var1 += var15 * var7;
         var5 += var17 * var7;
         if (var14[0][1] != 0 && ajs.a(var1) - var9 == var14[0][0] && ajs.a(var5) - var11 == var14[0][2]) {
            var3 += (double)var14[0][1];
         } else if (var14[1][1] != 0 && ajs.a(var1) - var9 == var14[1][0] && ajs.a(var5) - var11 == var14[1][2]) {
            var3 += (double)var14[1][1];
         }

         return this.void(var1, var3, var5);
      }
   }

   public nr void(double var1, double var3, double var5) {
      int var7 = ajs.a(var1);
      int var8 = ajs.a(var3);
      int var9 = ajs.a(var5);
      if (r6.X(this.ap, var7, var8 - 1, var9)) {
         --var8;
      }

      int var10 = this.ap.new(var7, var8, var9);
      if (r6.L(var10)) {
         int var11 = this.ap.for(var7, var8, var9);
         var3 = (double)var8;
         if (((r6)pa.x[var10]).E()) {
            var11 &= 7;
         }

         if (var11 >= 2 && var11 <= 5) {
            var3 = (double)(var8 + 1);
         }

         int[][] var12 = sk[var11];
         double var13 = 0.0D;
         double var15 = (double)var7 + 0.5D + (double)var12[0][0] * 0.5D;
         double var17 = (double)var8 + 0.5D + (double)var12[0][1] * 0.5D;
         double var19 = (double)var9 + 0.5D + (double)var12[0][2] * 0.5D;
         double var21 = (double)var7 + 0.5D + (double)var12[1][0] * 0.5D;
         double var23 = (double)var8 + 0.5D + (double)var12[1][1] * 0.5D;
         double var25 = (double)var9 + 0.5D + (double)var12[1][2] * 0.5D;
         double var27 = var21 - var15;
         double var29 = (var23 - var17) * 2.0D;
         double var31 = var25 - var19;
         if (var27 == 0.0D) {
            var1 = (double)var7 + 0.5D;
            var13 = var5 - (double)var9;
         } else if (var31 == 0.0D) {
            var5 = (double)var9 + 0.5D;
            var13 = var1 - (double)var7;
         } else {
            double var33 = var1 - var15;
            double var35 = var5 - var19;
            var13 = (var33 * var27 + var35 * var31) * 2.0D;
         }

         var1 = var15 + var27 * var13;
         var3 = var17 + var29 * var13;
         var5 = var19 + var31 * var13;
         if (var29 < 0.0D) {
            ++var3;
         }

         if (var29 > 0.0D) {
            var3 += 0.5D;
         }

         return this.ap.do().a(var1, var3, var5);
      } else {
         return null;
      }
   }

   protected void try(aqv var1) {
      if (var1.if("CustomDisplayTile")) {
         this.aF(var1.goto("DisplayTile"));
         this.aD(var1.goto("DisplayData"));
         this.aH(var1.goto("DisplayOffset"));
      }

      if (var1.try("CustomName") && var1.new("CustomName").length() > 0) {
         this.sl = var1.new("CustomName");
      }

   }

   protected void for(aqv var1) {
      if (this.f1()) {
         var1.a("CustomDisplayTile", true);
         var1.a("DisplayTile", this.f4() == null ? 0 : this.f4().void);
         var1.a("DisplayData", this.f9());
         var1.a("DisplayOffset", this.f5());
      }

      if (this.sl != null && this.sl.length() > 0) {
         var1.a("CustomName", this.sl);
      }

   }

   public float aH() {
      return 0.0F;
   }

   public void try(aiw var1) {
      if (!this.ap.goto) {
         if (var1 != this.as) {
            if (var1 instanceof aig && !(var1 instanceof aek) && !(var1 instanceof afy) && this.f3() == 0 && this.ai * this.ai + this.ag * this.ag > 0.01D && this.as == null && var1.ar == null) {
               var1.int((aiw)this);
            }

            double var2 = var1.al - this.al;
            double var4 = var1.aj - this.aj;
            double var6 = var2 * var2 + var4 * var4;
            if (var6 >= 9.999999747378752E-5D) {
               var6 = (double)ajs.int(var6);
               var2 /= var6;
               var4 /= var6;
               double var8 = 1.0D / var6;
               if (var8 > 1.0D) {
                  var8 = 1.0D;
               }

               var2 *= var8;
               var4 *= var8;
               var2 *= 0.10000000149011612D;
               var4 *= 0.10000000149011612D;
               var2 *= (double)(1.0F - this.bn);
               var4 *= (double)(1.0F - this.bn);
               var2 *= 0.5D;
               var4 *= 0.5D;
               if (var1 instanceof afj) {
                  double var10 = var1.al - this.al;
                  double var12 = var1.aj - this.aj;
                  nr var14 = this.ap.do().a(var10, 0.0D, var12).if();
                  nr var15 = this.ap.do().a((double)ajs.for(this.a5 * 3.1415927F / 180.0F), 0.0D, (double)ajs.try(this.a5 * 3.1415927F / 180.0F)).if();
                  double var16 = Math.abs(var14.int(var15));
                  if (var16 < 0.800000011920929D) {
                     return;
                  }

                  double var18 = var1.ai + this.ai;
                  double var20 = var1.ag + this.ag;
                  if (((afj)var1).f3() == 2 && this.f3() != 2) {
                     this.ai *= 0.20000000298023224D;
                     this.ag *= 0.20000000298023224D;
                     this.byte(var1.ai - var2, 0.0D, var1.ag - var4);
                     var1.ai *= 0.949999988079071D;
                     var1.ag *= 0.949999988079071D;
                  } else if (((afj)var1).f3() != 2 && this.f3() == 2) {
                     var1.ai *= 0.20000000298023224D;
                     var1.ag *= 0.20000000298023224D;
                     var1.byte(this.ai + var2, 0.0D, this.ag + var4);
                     this.ai *= 0.949999988079071D;
                     this.ag *= 0.949999988079071D;
                  } else {
                     var18 /= 2.0D;
                     var20 /= 2.0D;
                     this.ai *= 0.20000000298023224D;
                     this.ag *= 0.20000000298023224D;
                     this.byte(var18 - var2, 0.0D, var20 - var4);
                     var1.ai *= 0.20000000298023224D;
                     var1.ag *= 0.20000000298023224D;
                     var1.byte(var18 + var2, 0.0D, var20 + var4);
                  }
               } else {
                  this.byte(-var2, 0.0D, -var4);
                  var1.byte(var2 / 4.0D, 0.0D, var4 / 4.0D);
               }
            }

         }
      }
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.si = var1;
      this.sh = var3;
      this.sg = var5;
      this.sf = (double)var7;
      this.se = (double)var8;
      this.sj = var9 + 2;
      this.ai = this.sd;
      this.ah = this.sc;
      this.ag = this.sb;
   }

   public void new(double var1, double var3, double var5) {
      this.sd = this.ai = var1;
      this.sc = this.ah = var3;
      this.sb = this.ag = var5;
   }

   public void aE(int var1) {
      this.bg.if(19, var1);
   }

   public int f2() {
      return this.bg.int(19);
   }

   public void aI(int var1) {
      this.bg.if(17, var1);
   }

   public int f7() {
      return this.bg.int(17);
   }

   public void aG(int var1) {
      this.bg.if(18, var1);
   }

   public int fZ() {
      return this.bg.int(18);
   }

   public abstract int f3();

   public pa f4() {
      if (!this.f1()) {
         return this.f6();
      } else {
         int var1 = this.ab().int(20) & '\uffff';
         return var1 > 0 && var1 < pa.x.length ? pa.x[var1] : null;
      }
   }

   public pa f6() {
      return null;
   }

   public int f9() {
      return !this.f1() ? this.f0() : this.ab().int(20) >> 16;
   }

   public int f0() {
      return 0;
   }

   public int f5() {
      return !this.f1() ? this.fY() : this.ab().int(21);
   }

   public int fY() {
      return 6;
   }

   public void aF(int var1) {
      this.ab().if(20, var1 & '\uffff' | this.f9() << 16);
      this.J(true);
   }

   public void aD(int var1) {
      pa var2 = this.f4();
      int var3 = var2 == null ? 0 : var2.void;
      this.ab().if(20, var3 & '\uffff' | var1 << 16);
      this.J(true);
   }

   public void aH(int var1) {
      this.ab().if(21, var1);
      this.J(true);
   }

   public boolean f1() {
      return this.ab().for(22) == 1;
   }

   public void J(boolean var1) {
      this.ab().if(22, (byte)(var1 ? 1 : 0));
   }

   public void y(String var1) {
      this.sl = var1;
   }

   public String aB() {
      return this.sl != null ? this.sl : super.aB();
   }

   public boolean s() {
      return this.sl != null;
   }

   public String ga() {
      return this.sl;
   }
}
