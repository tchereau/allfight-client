import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class c2 {
   public yy o;
   public ajd l = null;
   public boolean k = false;
   public boolean j = false;
   public static boolean n = true;
   public static boolean Y = true;
   public boolean m = true;
   public double i;
   public double h;
   public double g;
   public double f;
   public double e;
   public double d;
   public boolean c = false;
   public boolean b = false;
   public final Minecraft void;
   public int long = 0;
   public int goto = 0;
   public int else = 0;
   public int char = 0;
   public int case = 0;
   public int byte = 0;
   public boolean try;
   public float new;
   public float int;
   public float for;
   public float do;
   public float W;
   public float V;
   public float T;
   public float R;
   public float P;
   public float N;
   public float L;
   public float J;
   public float H;
   public float F;
   public float E;
   public float D;
   public float C;
   public float B;
   public float A;
   public float z;
   public int y;
   public int x;
   public int w;
   public int v;
   public int u;
   public int t;
   public int s;
   public int r;
   public int q;
   public int p;
   public int ap;
   public int ao;
   public int an;
   public int am;
   public int al;
   public int ak;
   public int aj;
   public int ai;
   public int ah;
   public int ag;
   public int af;
   public int ae;
   public int ad;
   public int ac;
   public float ab;
   public float aa;
   public float Z;
   public float X;
   public float U;
   public float S;
   public float Q;
   public float O;
   public float M;
   public float K;
   public float I;
   public float G;
   public boolean if;
   public float a = 0.2F;

   public c2(yy var1) {
      this.o = var1;
      this.void = Minecraft.ih();
      this.a = 1.0F - qs.else() * 0.8F;
   }

   public c2() {
      this.void = Minecraft.ih();
   }

   public void if(ajd var1) {
      this.l = var1;
   }

   public void a() {
      this.l = null;
   }

   public boolean if() {
      return this.l != null;
   }

   public void a(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (!this.c) {
         this.i = var1;
         this.h = var7;
         this.g = var3;
         this.f = var9;
         this.e = var5;
         this.d = var11;
         this.b = this.void.u1.af >= 2 && (this.i > 0.0D || this.h < 1.0D || this.g > 0.0D || this.f < 1.0D || this.e > 0.0D || this.d < 1.0D);
      }

   }

   public void if(pa var1) {
      if (!this.c) {
         this.i = var1.j();
         this.h = var1.l();
         this.g = var1.m();
         this.f = var1.n();
         this.e = var1.o();
         this.d = var1.q();
         this.b = this.void.u1.af >= 2 && (this.i > 0.0D || this.h < 1.0D || this.g > 0.0D || this.f < 1.0D || this.e > 0.0D || this.d < 1.0D);
      }

   }

   public void if(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.i = var1;
      this.h = var7;
      this.g = var3;
      this.f = var9;
      this.e = var5;
      this.d = var11;
      this.c = true;
      this.b = this.void.u1.af >= 2 && (this.i > 0.0D || this.h < 1.0D || this.g > 0.0D || this.f < 1.0D || this.e > 0.0D || this.d < 1.0D);
   }

   public void do() {
      this.c = false;
   }

   public void a(pa var1, int var2, int var3, int var4, ajd var5) {
      this.if(var5);
      this.g(var1, var2, var3, var4);
      this.a();
   }

   public void void(pa var1, int var2, int var3, int var4) {
      this.j = true;
      this.g(var1, var2, var3, var4);
      this.j = false;
   }

   public boolean g(pa var1, int var2, int var3, int var4) {
      int var5 = var1.new();
      if (var5 == -1) {
         return false;
      } else {
         var1.int(this.o, var2, var3, var4);
         if (qs.R() && var1 == pa.cp && this.a(var2, var3, var4)) {
            this.a(var2, var3, var4, pa.ca.aF);
         }

         this.if(var1);
         switch(var5) {
         case 0:
            return this.for(var1, var2, var3, var4);
         case 1:
            return this.j(var1, var2, var3, var4);
         case 2:
            return this.if(var1, var2, var3, var4);
         case 3:
            return this.a((q7)var1, var2, var3, var4);
         case 4:
            return this.i(var1, var2, var3, var4);
         case 5:
            return this.try(var1, var2, var3, var4);
         case 6:
            return this.else(var1, var2, var3, var4);
         case 7:
            return this.do(var1, var2, var3, var4);
         case 8:
            return this.goto(var1, var2, var3, var4);
         case 9:
            return this.a((r6)var1, var2, var3, var4);
         case 10:
            return this.a((pk)var1, var2, var3, var4);
         case 11:
            return this.a((q8)var1, var2, var3, var4);
         case 12:
            return this.long(var1, var2, var3, var4);
         case 13:
            return this.h(var1, var2, var3, var4);
         case 14:
            return this.case(var1, var2, var3, var4);
         case 15:
            return this.a((ps)var1, var2, var3, var4);
         case 16:
            return this.a(var1, var2, var3, var4, false);
         case 17:
            return this.if(var1, var2, var3, var4, true);
         case 18:
            return this.a((pb)var1, var2, var3, var4);
         case 19:
            return this.int(var1, var2, var3, var4);
         case 20:
            return this.d(var1, var2, var3, var4);
         case 21:
            return this.a((q9)var1, var2, var3, var4);
         case 22:
         default:
            if (vf.H.do()) {
               return vf.int(vf.else, this, this.o, var2, var3, var4, var1, var5);
            } else {
               if (vf.x.do()) {
                  return vf.int(vf.try, this, this.o, var2, var3, var4, var1, var5);
               }

               return false;
            }
         case 23:
            return this.c(var1, var2, var3, var4);
         case 24:
            return this.a((rv)var1, var2, var3, var4);
         case 25:
            return this.a((r1)var1, var2, var3, var4);
         case 26:
            return this.a((pc)var1, var2, var3, var4);
         case 27:
            return this.a((re)var1, var2, var3, var4);
         case 28:
            return this.a((rr)var1, var2, var3, var4);
         case 29:
            return this.e(var1, var2, var3, var4);
         case 30:
            return this.a(var1, var2, var3, var4);
         case 31:
            return this.char(var1, var2, var3, var4);
         case 32:
            return this.a((ow)var1, var2, var3, var4);
         case 33:
            return this.a((q6)var1, var2, var3, var4);
         case 34:
            return this.a((r4)var1, var2, var3, var4);
         case 35:
            return this.a((r9)var1, var2, var3, var4);
         case 36:
            return this.a((rk)var1, var2, var3, var4);
         case 37:
            return this.a((rp)var1, var2, var3, var4);
         case 38:
            return this.a((qv)var1, var2, var3, var4);
         case 39:
            return this.b(var1, var2, var3, var4);
         case 40:
            return this.new(var1, var2, var3, var4);
         }
      }
   }

   public boolean a(pc var1, int var2, int var3, int var4) {
      int var5 = this.o.for(var2, var3, var4);
      int var6 = var5 & 3;
      if (var6 == 0) {
         this.case = 3;
      } else if (var6 == 3) {
         this.case = 1;
      } else if (var6 == 1) {
         this.case = 2;
      }

      if (!pc.e(var5)) {
         this.a(0.0D, 0.0D, 0.0D, 1.0D, 0.8125D, 1.0D);
         this.for(var1, var2, var3, var4);
         this.case = 0;
         return true;
      } else {
         this.j = true;
         this.a(0.0D, 0.0D, 0.0D, 1.0D, 0.8125D, 1.0D);
         this.for(var1, var2, var3, var4);
         this.if(var1.u());
         this.a(0.25D, 0.8125D, 0.25D, 0.75D, 1.0D, 0.75D);
         this.for(var1, var2, var3, var4);
         this.j = false;
         this.a();
         this.case = 0;
         return true;
      }
   }

   public boolean case(pa var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      int var6 = this.o.for(var2, var3, var4);
      int var7 = r3.r(var6);
      boolean var8 = r3.F(var6);
      if (vf.if.for()) {
         var7 = vf.new(var1, vf.if, this.o, var2, var3, var4);
      }

      if (vf.h.for()) {
         var8 = vf.int(var1, vf.h, this.o, var2, var3, var4);
      }

      float var9 = 0.5F;
      float var10 = 1.0F;
      float var11 = 0.8F;
      float var12 = 0.6F;
      int var13 = var1.new(this.o, var2, var3, var4);
      var5.if(var13);
      var5.a(var9, var9, var9);
      ajd var14 = this.a(var1, (yy)this.o, var2, var3, var4, 0);
      if (this.l != null) {
         var14 = this.l;
      }

      double var15 = (double)var14.a();
      double var17 = (double)var14.byte();
      double var19 = (double)var14.int();
      double var21 = (double)var14.do();
      double var23 = (double)var2 + this.i;
      double var25 = (double)var2 + this.h;
      double var27 = (double)var3 + this.g + 0.1875D;
      double var29 = (double)var4 + this.e;
      double var31 = (double)var4 + this.d;
      var5.a(var23, var27, var31, var15, var21);
      var5.a(var23, var27, var29, var15, var19);
      var5.a(var25, var27, var29, var17, var19);
      var5.a(var25, var27, var31, var17, var21);
      var5.if(var1.new(this.o, var2, var3 + 1, var4));
      var5.a(var10, var10, var10);
      var14 = this.a(var1, (yy)this.o, var2, var3, var4, 1);
      if (this.l != null) {
         var14 = this.l;
      }

      var15 = (double)var14.a();
      var17 = (double)var14.byte();
      var19 = (double)var14.int();
      var21 = (double)var14.do();
      var23 = var15;
      var25 = var17;
      var27 = var19;
      var29 = var19;
      var31 = var15;
      double var33 = var17;
      double var35 = var21;
      double var37 = var21;
      if (var7 == 0) {
         var25 = var15;
         var27 = var21;
         var31 = var17;
         var37 = var19;
      } else if (var7 == 2) {
         var23 = var17;
         var29 = var21;
         var33 = var15;
         var35 = var19;
      } else if (var7 == 3) {
         var23 = var17;
         var29 = var21;
         var33 = var15;
         var35 = var19;
         var25 = var15;
         var27 = var21;
         var31 = var17;
         var37 = var19;
      }

      double var39 = (double)var2 + this.i;
      double var41 = (double)var2 + this.h;
      double var43 = (double)var3 + this.f;
      double var45 = (double)var4 + this.e;
      double var47 = (double)var4 + this.d;
      var5.a(var41, var43, var47, var31, var35);
      var5.a(var41, var43, var45, var23, var27);
      var5.a(var39, var43, var45, var25, var29);
      var5.a(var39, var43, var47, var33, var37);
      int var49 = apk.new[var7];
      if (var8) {
         var49 = apk.new[apk.for[var7]];
      }

      byte var50 = 4;
      switch(var7) {
      case 0:
         var50 = 5;
         break;
      case 1:
         var50 = 3;
      case 2:
      default:
         break;
      case 3:
         var50 = 2;
      }

      if (var49 != 2 && (this.j || var1.int((yy)this.o, var2, var3, var4 - 1, 2))) {
         var5.if(this.e > 0.0D ? var13 : var1.new(this.o, var2, var3, var4 - 1));
         var5.a(var11, var11, var11);
         this.k = var50 == 2;
         this.a(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 2));
      }

      if (var49 != 3 && (this.j || var1.int((yy)this.o, var2, var3, var4 + 1, 3))) {
         var5.if(this.d < 1.0D ? var13 : var1.new(this.o, var2, var3, var4 + 1));
         var5.a(var11, var11, var11);
         this.k = var50 == 3;
         this.new(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 3));
      }

      if (var49 != 4 && (this.j || var1.int((yy)this.o, var2 - 1, var3, var4, 4))) {
         var5.if(this.e > 0.0D ? var13 : var1.new(this.o, var2 - 1, var3, var4));
         var5.a(var12, var12, var12);
         this.k = var50 == 4;
         this.int(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 4));
      }

      if (var49 != 5 && (this.j || var1.int((yy)this.o, var2 + 1, var3, var4, 5))) {
         var5.if(this.d < 1.0D ? var13 : var1.new(this.o, var2 + 1, var3, var4));
         var5.a(var12, var12, var12);
         this.k = var50 == 5;
         this.for(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 5));
      }

      this.k = false;
      return true;
   }

   public boolean a(r1 var1, int var2, int var3, int var4) {
      this.a(0.4375D, 0.0D, 0.4375D, 0.5625D, 0.875D, 0.5625D);
      this.for(var1, var2, var3, var4);
      this.if(var1.y());
      this.a(0.5625D, 0.0D, 0.3125D, 0.9375D, 0.125D, 0.6875D);
      this.for(var1, var2, var3, var4);
      this.a(0.125D, 0.0D, 0.0625D, 0.5D, 0.125D, 0.4375D);
      this.for(var1, var2, var3, var4);
      this.a(0.125D, 0.0D, 0.5625D, 0.5D, 0.125D, 0.9375D);
      this.for(var1, var2, var3, var4);
      this.a();
      c4 var5 = c4.G;
      var5.if(var1.new(this.o, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = var1.do(this.o, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      if (dh.r) {
         float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
         float var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
         float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
         var8 = var11;
         var9 = var12;
         var10 = var13;
      }

      var5.a(var6 * var8, var6 * var9, var6 * var10);
      ajd var32 = this.a(var1, 0, 0);
      if (this.if()) {
         var32 = this.l;
      }

      double var33 = (double)var32.int();
      double var14 = (double)var32.do();
      int var16 = this.o.for(var2, var3, var4);

      for(int var17 = 0; var17 < 3; ++var17) {
         double var18 = (double)var17 * 3.141592653589793D * 2.0D / 3.0D + 1.5707963267948966D;
         double var20 = (double)var32.if(8.0D);
         double var22 = (double)var32.byte();
         if ((var16 & 1 << var17) != 0) {
            var22 = (double)var32.a();
         }

         double var24 = (double)var2 + 0.5D;
         double var26 = (double)var2 + 0.5D + Math.sin(var18) * 8.0D / 16.0D;
         double var28 = (double)var4 + 0.5D;
         double var30 = (double)var4 + 0.5D + Math.cos(var18) * 8.0D / 16.0D;
         var5.a(var24, (double)(var3 + 1), var28, var20, var33);
         var5.a(var24, (double)(var3 + 0), var28, var20, var14);
         var5.a(var26, (double)(var3 + 0), var30, var22, var14);
         var5.a(var26, (double)(var3 + 1), var30, var22, var33);
         var5.a(var26, (double)(var3 + 1), var30, var22, var33);
         var5.a(var26, (double)(var3 + 0), var30, var22, var14);
         var5.a(var24, (double)(var3 + 0), var28, var20, var14);
         var5.a(var24, (double)(var3 + 1), var28, var20, var33);
      }

      var1.try();
      return true;
   }

   public boolean a(rv var1, int var2, int var3, int var4) {
      this.for(var1, var2, var3, var4);
      c4 var5 = c4.G;
      var5.if(var1.new(this.o, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = var1.do(this.o, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      float var11;
      if (dh.r) {
         float var12 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
         var11 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
         float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
         var8 = var12;
         var9 = var11;
         var10 = var13;
      }

      var5.a(var6 * var8, var6 * var9, var6 * var10);
      ajd var20 = var1.do(2);
      var11 = 0.125F;
      this.for(var1, (double)((float)var2 - 1.0F + var11), (double)var3, (double)var4, var20);
      this.int(var1, (double)((float)var2 + 1.0F - var11), (double)var3, (double)var4, var20);
      this.new(var1, (double)var2, (double)var3, (double)((float)var4 - 1.0F + var11), var20);
      this.a(var1, (double)var2, (double)var3, (double)((float)var4 + 1.0F - var11), var20);
      ajd var21 = rv.new("cauldron_inner");
      this.if(var1, (double)var2, (double)((float)var3 - 1.0F + 0.25F), (double)var4, var21);
      this.do(var1, (double)var2, (double)((float)var3 + 1.0F - 0.75F), (double)var4, var21);
      int var14 = this.o.for(var2, var3, var4);
      if (var14 > 0) {
         ajd var15 = qn.for("water");
         if (var14 > 3) {
            var14 = 3;
         }

         int var16 = ad8.a(pa.ba, this.o, var2, var3, var4);
         float var17 = (float)(var16 >> 16 & 255) / 255.0F;
         float var18 = (float)(var16 >> 8 & 255) / 255.0F;
         float var19 = (float)(var16 & 255) / 255.0F;
         var5.a(var17, var18, var19);
         this.if(var1, (double)var2, (double)((float)var3 - 1.0F + (6.0F + (float)var14 * 3.0F) / 16.0F), (double)var4, var15);
      }

      return true;
   }

   public boolean a(q6 var1, int var2, int var3, int var4) {
      this.for(var1, var2, var3, var4);
      c4 var5 = c4.G;
      var5.if(var1.new(this.o, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = var1.do(this.o, var2, var3, var4);
      ajd var8 = this.a(var1, 0);
      float var9 = (float)(var7 >> 16 & 255) / 255.0F;
      float var10 = (float)(var7 >> 8 & 255) / 255.0F;
      float var11 = (float)(var7 & 255) / 255.0F;
      float var12;
      float var13;
      if (dh.r) {
         var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
         float var14 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
         var13 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
         var9 = var12;
         var10 = var14;
         var11 = var13;
      }

      var5.a(var6 * var9, var6 * var10, var6 * var11);
      var12 = 0.1865F;
      this.for(var1, (double)((float)var2 - 0.5F + var12), (double)var3, (double)var4, var8);
      this.int(var1, (double)((float)var2 + 0.5F - var12), (double)var3, (double)var4, var8);
      this.new(var1, (double)var2, (double)var3, (double)((float)var4 - 0.5F + var12), var8);
      this.a(var1, (double)var2, (double)var3, (double)((float)var4 + 0.5F - var12), var8);
      this.if(var1, (double)var2, (double)((float)var3 - 0.5F + var12 + 0.1875F), (double)var4, this.a(pa.g));
      int var19 = this.o.for(var2, var3, var4);
      if (var19 != 0) {
         var13 = 0.0F;
         float var15 = 4.0F;
         float var16 = 0.0F;
         r0 var17 = null;
         switch(var19) {
         case 1:
            var17 = pa.bP;
            break;
         case 2:
            var17 = pa.bR;
         case 3:
         case 4:
         case 5:
         case 6:
         case 9:
         case 10:
         case 11:
         default:
            break;
         case 7:
            var17 = pa.bL;
            break;
         case 8:
            var17 = pa.bN;
            break;
         case 12:
            var17 = mod_rajouts.P;
            break;
         case 13:
            var17 = mod_rajouts.ac;
         }

         var5.if(var13 / 16.0F, var15 / 16.0F, var16 / 16.0F);
         if (var17 != null) {
            this.g(var17, var2, var3, var4);
         } else if (var19 == 9) {
            this.j = true;
            float var18 = 0.125F;
            this.a((double)(0.5F - var18), 0.0D, (double)(0.5F - var18), (double)(0.5F + var18), 0.25D, (double)(0.5F + var18));
            this.for(pa.b7, var2, var3, var4);
            this.a((double)(0.5F - var18), 0.25D, (double)(0.5F - var18), (double)(0.5F + var18), 0.5D, (double)(0.5F + var18));
            this.for(pa.b7, var2, var3, var4);
            this.a((double)(0.5F - var18), 0.5D, (double)(0.5F - var18), (double)(0.5F + var18), 0.75D, (double)(0.5F + var18));
            this.for(pa.b7, var2, var3, var4);
            this.j = false;
            this.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
         } else if (var19 == 3) {
            this.a(pa.bd, 0, (double)var2, (double)var3, (double)var4, 0.75F);
         } else if (var19 == 5) {
            this.a(pa.bd, 2, (double)var2, (double)var3, (double)var4, 0.75F);
         } else if (var19 == 4) {
            this.a(pa.bd, 1, (double)var2, (double)var3, (double)var4, 0.75F);
         } else if (var19 == 6) {
            this.a(pa.bd, 3, (double)var2, (double)var3, (double)var4, 0.75F);
         } else if (var19 == 11) {
            var7 = pa.b3.do(this.o, var2, var3, var4);
            var9 = (float)(var7 >> 16 & 255) / 255.0F;
            var10 = (float)(var7 >> 8 & 255) / 255.0F;
            var11 = (float)(var7 & 255) / 255.0F;
            var5.a(var6 * var9, var6 * var10, var6 * var11);
            this.a(pa.b3, 2, (double)var2, (double)var3, (double)var4, 0.75F);
         } else if (var19 == 10) {
            this.a(pa.b1, 2, (double)var2, (double)var3, (double)var4, 0.75F);
         }

         var5.if(-var13 / 16.0F, -var15 / 16.0F, -var16 / 16.0F);
      }

      return true;
   }

   public boolean a(r9 var1, int var2, int var3, int var4) {
      return this.a(var1, var2, var3, var4, this.o.for(var2, var3, var4));
   }

   public boolean a(r9 var1, int var2, int var3, int var4, int var5) {
      c4 var6 = c4.G;
      var6.if(var1.new(this.o, var2, var3, var4));
      float var7 = 1.0F;
      int var8 = var1.do(this.o, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      if (dh.r) {
         float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
         float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
         float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
         var9 = var12;
         var10 = var13;
         var11 = var14;
      }

      var6.a(var7 * var9, var7 * var10, var7 * var11);
      return this.a(var1, var2, var3, var4, var5, false);
   }

   public boolean a(r9 var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = var6 ? 0 : var5 & 3;
      boolean var8 = false;
      float var9 = 0.0F;
      switch(var7) {
      case 0:
         this.else = 2;
         this.char = 1;
         this.case = 3;
         this.byte = 3;
         break;
      case 1:
         this.long = 1;
         this.goto = 2;
         this.case = 2;
         this.byte = 1;
         var8 = true;
         break;
      case 2:
         this.else = 1;
         this.char = 2;
         break;
      case 3:
         this.long = 2;
         this.goto = 1;
         this.case = 1;
         this.byte = 2;
         var8 = true;
      }

      var9 = this.a(var1, var2, var3, var4, 0, var9, 0.75F, 0.25F, 0.75F, var8, var6, var5);
      var9 = this.a(var1, var2, var3, var4, 1, var9, 0.5F, 0.0625F, 0.625F, var8, var6, var5);
      var9 = this.a(var1, var2, var3, var4, 2, var9, 0.25F, 0.3125F, 0.5F, var8, var6, var5);
      this.a(var1, var2, var3, var4, 3, var9, 0.625F, 0.375F, 1.0F, var8, var6, var5);
      this.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
      this.long = 0;
      this.goto = 0;
      this.else = 0;
      this.char = 0;
      this.case = 0;
      this.byte = 0;
      return true;
   }

   public float a(r9 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9, boolean var10, boolean var11, int var12) {
      if (var10) {
         float var13 = var7;
         var7 = var9;
         var9 = var13;
      }

      var7 /= 2.0F;
      var9 /= 2.0F;
      var1.dJ = var5;
      this.a((double)(0.5F - var7), (double)var6, (double)(0.5F - var9), (double)(0.5F + var7), (double)(var6 + var8), (double)(0.5F + var9));
      if (var11) {
         c4 var14 = c4.G;
         var14.if();
         var14.do(0.0F, -1.0F, 0.0F);
         this.do(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 0, var12));
         var14.for();
         var14.if();
         var14.do(0.0F, 1.0F, 0.0F);
         this.if(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 1, var12));
         var14.for();
         var14.if();
         var14.do(0.0F, 0.0F, -1.0F);
         this.a(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 2, var12));
         var14.for();
         var14.if();
         var14.do(0.0F, 0.0F, 1.0F);
         this.new(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 3, var12));
         var14.for();
         var14.if();
         var14.do(-1.0F, 0.0F, 0.0F);
         this.int(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 4, var12));
         var14.for();
         var14.if();
         var14.do(1.0F, 0.0F, 0.0F);
         this.for(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 5, var12));
         var14.for();
      } else {
         this.for(var1, var2, var3, var4);
      }

      return var6 + var8;
   }

   public boolean if(pa var1, int var2, int var3, int var4) {
      int var5 = this.o.for(var2, var3, var4);
      c4 var6 = c4.G;
      var6.if(var1.new(this.o, var2, var3, var4));
      var6.a(1.0F, 1.0F, 1.0F);
      double var7 = 0.4000000059604645D;
      double var9 = 0.5D - var7;
      double var11 = 0.20000000298023224D;
      if (var5 == 1) {
         this.a(var1, (double)var2 - var9, (double)var3 + var11, (double)var4, -var7, 0.0D, 0);
      } else if (var5 == 2) {
         this.a(var1, (double)var2 + var9, (double)var3 + var11, (double)var4, var7, 0.0D, 0);
      } else if (var5 == 3) {
         this.a(var1, (double)var2, (double)var3 + var11, (double)var4 - var9, 0.0D, -var7, 0);
      } else if (var5 == 4) {
         this.a(var1, (double)var2, (double)var3 + var11, (double)var4 + var9, 0.0D, var7, 0);
      } else {
         this.a(var1, (double)var2, (double)var3, (double)var4, 0.0D, 0.0D, 0);
         if (var1 != pa.bq && qs.R() && this.a(var2, var3, var4)) {
            this.a(var2, var3, var4, pa.ca.aF);
         }
      }

      return true;
   }

   public boolean a(ps var1, int var2, int var3, int var4) {
      int var5 = this.o.for(var2, var3, var4);
      int var6 = var5 & 3;
      int var7 = (var5 & 12) >> 2;
      c4 var8 = c4.G;
      var8.if(var1.new(this.o, var2, var3, var4));
      var8.a(1.0F, 1.0F, 1.0F);
      double var9 = -0.1875D;
      boolean var11 = var1.case(this.o, var2, var3, var4, var5);
      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = 0.0D;
      double var18 = 0.0D;
      switch(var6) {
      case 0:
         var18 = -0.3125D;
         var14 = ps.d9[var7];
         break;
      case 1:
         var16 = 0.3125D;
         var12 = -ps.d9[var7];
         break;
      case 2:
         var18 = 0.3125D;
         var14 = -ps.d9[var7];
         break;
      case 3:
         var16 = -0.3125D;
         var12 = ps.d9[var7];
      }

      if (!var11) {
         this.a(var1, (double)var2 + var12, (double)var3 + var9, (double)var4 + var14, 0.0D, 0.0D, 0);
      } else {
         ajd var20 = this.a(pa.bc);
         this.if(var20);
         float var21 = 2.0F;
         float var22 = 14.0F;
         float var23 = 7.0F;
         float var24 = 9.0F;
         switch(var6) {
         case 1:
         case 3:
            var21 = 7.0F;
            var22 = 9.0F;
            var23 = 2.0F;
            var24 = 14.0F;
         case 0:
         case 2:
         default:
            this.a((double)(var21 / 16.0F + (float)var12), 0.125D, (double)(var23 / 16.0F + (float)var14), (double)(var22 / 16.0F + (float)var12), 0.25D, (double)(var24 / 16.0F + (float)var14));
            double var25 = (double)var20.if((double)var21);
            double var27 = (double)var20.a((double)var23);
            double var29 = (double)var20.if((double)var22);
            double var31 = (double)var20.a((double)var24);
            var8.a((double)((float)var2 + var21 / 16.0F) + var12, (double)((float)var3 + 0.25F), (double)((float)var4 + var23 / 16.0F) + var14, var25, var27);
            var8.a((double)((float)var2 + var21 / 16.0F) + var12, (double)((float)var3 + 0.25F), (double)((float)var4 + var24 / 16.0F) + var14, var25, var31);
            var8.a((double)((float)var2 + var22 / 16.0F) + var12, (double)((float)var3 + 0.25F), (double)((float)var4 + var24 / 16.0F) + var14, var29, var31);
            var8.a((double)((float)var2 + var22 / 16.0F) + var12, (double)((float)var3 + 0.25F), (double)((float)var4 + var23 / 16.0F) + var14, var29, var27);
            this.for(var1, var2, var3, var4);
            this.a(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);
            this.a();
         }
      }

      var8.if(var1.new(this.o, var2, var3, var4));
      var8.a(1.0F, 1.0F, 1.0F);
      this.a(var1, (double)var2 + var16, (double)var3 + var9, (double)var4 + var18, 0.0D, 0.0D, 0);
      this.a((rk)var1, var2, var3, var4);
      return true;
   }

   public boolean a(rp var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      var5.if(var1.new(this.o, var2, var3, var4));
      var5.a(1.0F, 1.0F, 1.0F);
      int var6 = this.o.for(var2, var3, var4);
      int var7 = var6 & 3;
      double var8 = 0.0D;
      double var10 = -0.1875D;
      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = 0.0D;
      ajd var18;
      if (var1.C(var6)) {
         var18 = pa.cc.do(0);
      } else {
         var10 -= 0.1875D;
         var18 = pa.cd.do(0);
      }

      switch(var7) {
      case 0:
         var12 = -0.3125D;
         var16 = 1.0D;
         break;
      case 1:
         var8 = 0.3125D;
         var14 = -1.0D;
         break;
      case 2:
         var12 = 0.3125D;
         var16 = -1.0D;
         break;
      case 3:
         var8 = -0.3125D;
         var14 = 1.0D;
      }

      this.a(var1, (double)var2 + 0.25D * var14 + 0.1875D * var16, (double)((float)var3 - 0.1875F), (double)var4 + 0.25D * var16 + 0.1875D * var14, 0.0D, 0.0D, var6);
      this.a(var1, (double)var2 + 0.25D * var14 + -0.1875D * var16, (double)((float)var3 - 0.1875F), (double)var4 + 0.25D * var16 + -0.1875D * var14, 0.0D, 0.0D, var6);
      this.if(var18);
      this.a(var1, (double)var2 + var8, (double)var3 + var10, (double)var4 + var12, 0.0D, 0.0D, var6);
      this.a();
      this.a((rk)var1, var2, var3, var4, var7);
      return true;
   }

   public boolean a(rk var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      this.a(var1, var2, var3, var4, this.o.for(var2, var3, var4) & 3);
      return true;
   }

   public void a(rk var1, int var2, int var3, int var4, int var5) {
      this.for(var1, var2, var3, var4);
      c4 var6 = c4.G;
      var6.if(var1.new(this.o, var2, var3, var4));
      var6.a(1.0F, 1.0F, 1.0F);
      int var7 = this.o.for(var2, var3, var4);
      ajd var8 = this.a(var1, 1, var7);
      double var9 = (double)var8.a();
      double var11 = (double)var8.byte();
      double var13 = (double)var8.int();
      double var15 = (double)var8.do();
      double var17 = 0.125D;
      double var19 = (double)(var2 + 1);
      double var21 = (double)(var2 + 1);
      double var23 = (double)(var2 + 0);
      double var25 = (double)(var2 + 0);
      double var27 = (double)(var4 + 0);
      double var29 = (double)(var4 + 1);
      double var31 = (double)(var4 + 1);
      double var33 = (double)(var4 + 0);
      double var35 = (double)var3 + var17;
      if (var5 == 2) {
         var19 = var21 = (double)(var2 + 0);
         var23 = var25 = (double)(var2 + 1);
         var27 = var33 = (double)(var4 + 1);
         var29 = var31 = (double)(var4 + 0);
      } else if (var5 == 3) {
         var19 = var25 = (double)(var2 + 0);
         var21 = var23 = (double)(var2 + 1);
         var27 = var29 = (double)(var4 + 0);
         var31 = var33 = (double)(var4 + 1);
      } else if (var5 == 1) {
         var19 = var25 = (double)(var2 + 1);
         var21 = var23 = (double)(var2 + 0);
         var27 = var29 = (double)(var4 + 1);
         var31 = var33 = (double)(var4 + 0);
      }

      var6.a(var25, var35, var33, var9, var13);
      var6.a(var23, var35, var31, var9, var15);
      var6.a(var21, var35, var29, var11, var15);
      var6.a(var19, var35, var27, var11, var13);
   }

   public void byte(pa var1, int var2, int var3, int var4) {
      this.j = true;
      this.a(var1, var2, var3, var4, true);
      this.j = false;
   }

   public boolean a(pa var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.o.for(var2, var3, var4);
      boolean var7 = var5 || (var6 & 8) != 0;
      int var8 = n0.case(var6);
      if (var7) {
         switch(var8) {
         case 0:
            this.long = 3;
            this.goto = 3;
            this.else = 3;
            this.char = 3;
            this.a(0.0D, 0.25D, 0.0D, 1.0D, 1.0D, 1.0D);
            break;
         case 1:
            this.a(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D);
            break;
         case 2:
            this.else = 1;
            this.char = 2;
            this.a(0.0D, 0.0D, 0.25D, 1.0D, 1.0D, 1.0D);
            break;
         case 3:
            this.else = 2;
            this.char = 1;
            this.case = 3;
            this.byte = 3;
            this.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.75D);
            break;
         case 4:
            this.long = 1;
            this.goto = 2;
            this.case = 2;
            this.byte = 1;
            this.a(0.25D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
            break;
         case 5:
            this.long = 2;
            this.goto = 1;
            this.case = 1;
            this.byte = 2;
            this.a(0.0D, 0.0D, 0.0D, 0.75D, 1.0D, 1.0D);
         }

         ((n0)var1).if((float)this.i, (float)this.g, (float)this.e, (float)this.h, (float)this.f, (float)this.d);
         this.for(var1, var2, var3, var4);
         this.long = 0;
         this.goto = 0;
         this.else = 0;
         this.char = 0;
         this.case = 0;
         this.byte = 0;
         this.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
         ((n0)var1).if((float)this.i, (float)this.g, (float)this.e, (float)this.h, (float)this.f, (float)this.d);
      } else {
         switch(var8) {
         case 0:
            this.long = 3;
            this.goto = 3;
            this.else = 3;
            this.char = 3;
         case 1:
         default:
            break;
         case 2:
            this.else = 1;
            this.char = 2;
            break;
         case 3:
            this.else = 2;
            this.char = 1;
            this.case = 3;
            this.byte = 3;
            break;
         case 4:
            this.long = 1;
            this.goto = 2;
            this.case = 2;
            this.byte = 1;
            break;
         case 5:
            this.long = 2;
            this.goto = 1;
            this.case = 1;
            this.byte = 2;
         }

         this.for(var1, var2, var3, var4);
         this.long = 0;
         this.goto = 0;
         this.else = 0;
         this.char = 0;
         this.case = 0;
         this.byte = 0;
      }

      return true;
   }

   public void do(double var1, double var3, double var5, double var7, double var9, double var11, float var13, double var14) {
      ajd var16 = n0.if("piston_side");
      if (this.if()) {
         var16 = this.l;
      }

      c4 var17 = c4.G;
      double var18 = (double)var16.a();
      double var20 = (double)var16.int();
      double var22 = (double)var16.if(var14);
      double var24 = (double)var16.a(4.0D);
      var17.a(var13, var13, var13);
      var17.a(var1, var7, var9, var22, var20);
      var17.a(var1, var5, var9, var18, var20);
      var17.a(var3, var5, var11, var18, var24);
      var17.a(var3, var7, var11, var22, var24);
   }

   public void a(double var1, double var3, double var5, double var7, double var9, double var11, float var13, double var14) {
      ajd var16 = n0.if("piston_side");
      if (this.if()) {
         var16 = this.l;
      }

      c4 var17 = c4.G;
      double var18 = (double)var16.a();
      double var20 = (double)var16.int();
      double var22 = (double)var16.if(var14);
      double var24 = (double)var16.a(4.0D);
      var17.a(var13, var13, var13);
      var17.a(var1, var5, var11, var22, var20);
      var17.a(var1, var5, var9, var18, var20);
      var17.a(var3, var7, var9, var18, var24);
      var17.a(var3, var7, var11, var22, var24);
   }

   public void if(double var1, double var3, double var5, double var7, double var9, double var11, float var13, double var14) {
      ajd var16 = n0.if("piston_side");
      if (this.if()) {
         var16 = this.l;
      }

      c4 var17 = c4.G;
      double var18 = (double)var16.a();
      double var20 = (double)var16.int();
      double var22 = (double)var16.if(var14);
      double var24 = (double)var16.a(4.0D);
      var17.a(var13, var13, var13);
      var17.a(var3, var5, var9, var22, var20);
      var17.a(var1, var5, var9, var18, var20);
      var17.a(var1, var7, var11, var18, var24);
      var17.a(var3, var7, var11, var22, var24);
   }

   public void do(pa var1, int var2, int var3, int var4, boolean var5) {
      this.j = true;
      this.if(var1, var2, var3, var4, var5);
      this.j = false;
   }

   public boolean if(pa var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.o.for(var2, var3, var4);
      int var7 = nz.byte(var6);
      float var8 = var1.if(this.o, var2, var3, var4);
      float var9 = var5 ? 1.0F : 0.5F;
      double var10 = var5 ? 16.0D : 8.0D;
      switch(var7) {
      case 0:
         this.long = 3;
         this.goto = 3;
         this.else = 3;
         this.char = 3;
         this.a(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D);
         this.for(var1, var2, var3, var4);
         this.do((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var9), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var8 * 0.8F, var10);
         this.do((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var9), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var8 * 0.8F, var10);
         this.do((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var9), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var8 * 0.6F, var10);
         this.do((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var9), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var8 * 0.6F, var10);
         break;
      case 1:
         this.a(0.0D, 0.75D, 0.0D, 1.0D, 1.0D, 1.0D);
         this.for(var1, var2, var3, var4);
         this.do((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 - 0.25F + 1.0F - var9), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var8 * 0.8F, var10);
         this.do((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 - 0.25F + 1.0F - var9), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var8 * 0.8F, var10);
         this.do((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 - 0.25F + 1.0F - var9), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var8 * 0.6F, var10);
         this.do((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 - 0.25F + 1.0F - var9), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var8 * 0.6F, var10);
         break;
      case 2:
         this.else = 1;
         this.char = 2;
         this.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.25D);
         this.for(var1, var2, var3, var4);
         this.a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var9), var8 * 0.6F, var10);
         this.a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var9), var8 * 0.6F, var10);
         this.a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var9), var8 * 0.5F, var10);
         this.a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var9), var8, var10);
         break;
      case 3:
         this.else = 2;
         this.char = 1;
         this.case = 3;
         this.byte = 3;
         this.a(0.0D, 0.0D, 0.75D, 1.0D, 1.0D, 1.0D);
         this.for(var1, var2, var3, var4);
         this.a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 - 0.25F + 1.0F - var9), (double)((float)var4 - 0.25F + 1.0F), var8 * 0.6F, var10);
         this.a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 - 0.25F + 1.0F - var9), (double)((float)var4 - 0.25F + 1.0F), var8 * 0.6F, var10);
         this.a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 - 0.25F + 1.0F - var9), (double)((float)var4 - 0.25F + 1.0F), var8 * 0.5F, var10);
         this.a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 - 0.25F + 1.0F - var9), (double)((float)var4 - 0.25F + 1.0F), var8, var10);
         break;
      case 4:
         this.long = 1;
         this.goto = 2;
         this.case = 2;
         this.byte = 1;
         this.a(0.0D, 0.0D, 0.0D, 0.25D, 1.0D, 1.0D);
         this.for(var1, var2, var3, var4);
         this.if((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var9), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var8 * 0.5F, var10);
         this.if((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var9), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var8, var10);
         this.if((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var9), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var8 * 0.6F, var10);
         this.if((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var9), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var8 * 0.6F, var10);
         break;
      case 5:
         this.long = 2;
         this.goto = 1;
         this.case = 1;
         this.byte = 2;
         this.a(0.75D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
         this.for(var1, var2, var3, var4);
         this.if((double)((float)var2 - 0.25F + 1.0F - var9), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var8 * 0.5F, var10);
         this.if((double)((float)var2 - 0.25F + 1.0F - var9), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var8, var10);
         this.if((double)((float)var2 - 0.25F + 1.0F - var9), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var8 * 0.6F, var10);
         this.if((double)((float)var2 - 0.25F + 1.0F - var9), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var8 * 0.6F, var10);
      }

      this.long = 0;
      this.goto = 0;
      this.else = 0;
      this.char = 0;
      this.case = 0;
      this.byte = 0;
      this.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
      return true;
   }

   public boolean long(pa var1, int var2, int var3, int var4) {
      int var5 = this.o.for(var2, var3, var4);
      int var6 = var5 & 7;
      boolean var7 = (var5 & 8) > 0;
      c4 var8 = c4.G;
      boolean var9 = this.if();
      if (!var9) {
         this.if(this.a(pa.bf));
      }

      float var10 = 0.25F;
      float var11 = 0.1875F;
      float var12 = 0.1875F;
      if (var6 == 5) {
         this.a((double)(0.5F - var11), 0.0D, (double)(0.5F - var10), (double)(0.5F + var11), (double)var12, (double)(0.5F + var10));
      } else if (var6 == 6) {
         this.a((double)(0.5F - var10), 0.0D, (double)(0.5F - var11), (double)(0.5F + var10), (double)var12, (double)(0.5F + var11));
      } else if (var6 == 4) {
         this.a((double)(0.5F - var11), (double)(0.5F - var10), (double)(1.0F - var12), (double)(0.5F + var11), (double)(0.5F + var10), 1.0D);
      } else if (var6 == 3) {
         this.a((double)(0.5F - var11), (double)(0.5F - var10), 0.0D, (double)(0.5F + var11), (double)(0.5F + var10), (double)var12);
      } else if (var6 == 2) {
         this.a((double)(1.0F - var12), (double)(0.5F - var10), (double)(0.5F - var11), 1.0D, (double)(0.5F + var10), (double)(0.5F + var11));
      } else if (var6 == 1) {
         this.a(0.0D, (double)(0.5F - var10), (double)(0.5F - var11), (double)var12, (double)(0.5F + var10), (double)(0.5F + var11));
      } else if (var6 == 0) {
         this.a((double)(0.5F - var10), (double)(1.0F - var12), (double)(0.5F - var11), (double)(0.5F + var10), 1.0D, (double)(0.5F + var11));
      } else if (var6 == 7) {
         this.a((double)(0.5F - var11), (double)(1.0F - var12), (double)(0.5F - var10), (double)(0.5F + var11), 1.0D, (double)(0.5F + var10));
      }

      this.for(var1, var2, var3, var4);
      if (!var9) {
         this.a();
      }

      var8.if(var1.new(this.o, var2, var3, var4));
      float var13 = 1.0F;
      if (pa.o[var1.void] > 0) {
         var13 = 1.0F;
      }

      var8.a(var13, var13, var13);
      ajd var14 = this.a(var1, 0);
      if (this.if()) {
         var14 = this.l;
      }

      double var15 = (double)var14.a();
      double var17 = (double)var14.int();
      double var19 = (double)var14.byte();
      double var21 = (double)var14.do();
      nr[] var23 = new nr[8];
      float var24 = 0.0625F;
      float var25 = 0.0625F;
      float var26 = 0.625F;
      var23[0] = this.o.do().a((double)(-var24), 0.0D, (double)(-var25));
      var23[1] = this.o.do().a((double)var24, 0.0D, (double)(-var25));
      var23[2] = this.o.do().a((double)var24, 0.0D, (double)var25);
      var23[3] = this.o.do().a((double)(-var24), 0.0D, (double)var25);
      var23[4] = this.o.do().a((double)(-var24), (double)var26, (double)(-var25));
      var23[5] = this.o.do().a((double)var24, (double)var26, (double)(-var25));
      var23[6] = this.o.do().a((double)var24, (double)var26, (double)var25);
      var23[7] = this.o.do().a((double)(-var24), (double)var26, (double)var25);

      for(int var27 = 0; var27 < 8; ++var27) {
         if (var7) {
            var23[var27].do -= 0.0625D;
            var23[var27].if(0.69813174F);
         } else {
            var23[var27].do += 0.0625D;
            var23[var27].if(-0.69813174F);
         }

         if (var6 == 0 || var6 == 7) {
            var23[var27].do(3.1415927F);
         }

         if (var6 == 6 || var6 == 0) {
            var23[var27].a(1.5707964F);
         }

         if (var6 > 0 && var6 < 5) {
            var23[var27].for -= 0.375D;
            var23[var27].if(1.5707964F);
            if (var6 == 4) {
               var23[var27].a(0.0F);
            }

            if (var6 == 3) {
               var23[var27].a(3.1415927F);
            }

            if (var6 == 2) {
               var23[var27].a(1.5707964F);
            }

            if (var6 == 1) {
               var23[var27].a(-1.5707964F);
            }

            var23[var27].int += (double)var2 + 0.5D;
            var23[var27].for += (double)((float)var3 + 0.5F);
            var23[var27].do += (double)var4 + 0.5D;
         } else if (var6 != 0 && var6 != 7) {
            var23[var27].int += (double)var2 + 0.5D;
            var23[var27].for += (double)((float)var3 + 0.125F);
            var23[var27].do += (double)var4 + 0.5D;
         } else {
            var23[var27].int += (double)var2 + 0.5D;
            var23[var27].for += (double)((float)var3 + 0.875F);
            var23[var27].do += (double)var4 + 0.5D;
         }
      }

      nr var32 = null;
      nr var28 = null;
      nr var29 = null;
      nr var30 = null;

      for(int var31 = 0; var31 < 6; ++var31) {
         if (var31 == 0) {
            var15 = (double)var14.if(7.0D);
            var17 = (double)var14.a(6.0D);
            var19 = (double)var14.if(9.0D);
            var21 = (double)var14.a(8.0D);
         } else if (var31 == 2) {
            var15 = (double)var14.if(7.0D);
            var17 = (double)var14.a(6.0D);
            var19 = (double)var14.if(9.0D);
            var21 = (double)var14.do();
         }

         if (var31 == 0) {
            var32 = var23[0];
            var28 = var23[1];
            var29 = var23[2];
            var30 = var23[3];
         } else if (var31 == 1) {
            var32 = var23[7];
            var28 = var23[6];
            var29 = var23[5];
            var30 = var23[4];
         } else if (var31 == 2) {
            var32 = var23[1];
            var28 = var23[0];
            var29 = var23[4];
            var30 = var23[5];
         } else if (var31 == 3) {
            var32 = var23[2];
            var28 = var23[1];
            var29 = var23[5];
            var30 = var23[6];
         } else if (var31 == 4) {
            var32 = var23[3];
            var28 = var23[2];
            var29 = var23[6];
            var30 = var23[7];
         } else if (var31 == 5) {
            var32 = var23[0];
            var28 = var23[3];
            var29 = var23[7];
            var30 = var23[4];
         }

         var8.a(var32.int, var32.for, var32.do, var15, var21);
         var8.a(var28.int, var28.for, var28.do, var19, var21);
         var8.a(var29.int, var29.for, var29.do, var19, var17);
         var8.a(var30.int, var30.for, var30.do, var15, var17);
      }

      if (qs.R() && this.a(var2, var3, var4)) {
         this.a(var2, var3, var4, pa.ca.aF);
      }

      return true;
   }

   public boolean e(pa var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      int var6 = this.o.for(var2, var3, var4);
      int var7 = var6 & 3;
      boolean var8 = (var6 & 4) == 4;
      boolean var9 = (var6 & 8) == 8;
      boolean var10 = !this.o.case(var2, var3 - 1, var4);
      boolean var11 = this.if();
      if (!var11) {
         this.if(this.a(pa.be));
      }

      float var12 = 0.25F;
      float var13 = 0.125F;
      float var14 = 0.125F;
      float var15 = 0.3F - var12;
      float var16 = 0.3F + var12;
      if (var7 == 2) {
         this.a((double)(0.5F - var13), (double)var15, (double)(1.0F - var14), (double)(0.5F + var13), (double)var16, 1.0D);
      } else if (var7 == 0) {
         this.a((double)(0.5F - var13), (double)var15, 0.0D, (double)(0.5F + var13), (double)var16, (double)var14);
      } else if (var7 == 1) {
         this.a((double)(1.0F - var14), (double)var15, (double)(0.5F - var13), 1.0D, (double)var16, (double)(0.5F + var13));
      } else if (var7 == 3) {
         this.a(0.0D, (double)var15, (double)(0.5F - var13), (double)var14, (double)var16, (double)(0.5F + var13));
      }

      this.for(var1, var2, var3, var4);
      if (!var11) {
         this.a();
      }

      var5.if(var1.new(this.o, var2, var3, var4));
      float var17 = 1.0F;
      if (pa.o[var1.void] > 0) {
         var17 = 1.0F;
      }

      var5.a(var17, var17, var17);
      ajd var18 = this.a(var1, 0);
      if (this.if()) {
         var18 = this.l;
      }

      double var19 = (double)var18.a();
      double var21 = (double)var18.int();
      double var23 = (double)var18.byte();
      double var25 = (double)var18.do();
      nr[] var27 = new nr[8];
      float var28 = 0.046875F;
      float var29 = 0.046875F;
      float var30 = 0.3125F;
      var27[0] = this.o.do().a((double)(-var28), 0.0D, (double)(-var29));
      var27[1] = this.o.do().a((double)var28, 0.0D, (double)(-var29));
      var27[2] = this.o.do().a((double)var28, 0.0D, (double)var29);
      var27[3] = this.o.do().a((double)(-var28), 0.0D, (double)var29);
      var27[4] = this.o.do().a((double)(-var28), (double)var30, (double)(-var29));
      var27[5] = this.o.do().a((double)var28, (double)var30, (double)(-var29));
      var27[6] = this.o.do().a((double)var28, (double)var30, (double)var29);
      var27[7] = this.o.do().a((double)(-var28), (double)var30, (double)var29);

      for(int var31 = 0; var31 < 8; ++var31) {
         var27[var31].do += 0.0625D;
         if (var9) {
            var27[var31].if(0.5235988F);
            var27[var31].for -= 0.4375D;
         } else if (var8) {
            var27[var31].if(0.08726647F);
            var27[var31].for -= 0.4375D;
         } else {
            var27[var31].if(-0.69813174F);
            var27[var31].for -= 0.375D;
         }

         var27[var31].if(1.5707964F);
         if (var7 == 2) {
            var27[var31].a(0.0F);
         }

         if (var7 == 0) {
            var27[var31].a(3.1415927F);
         }

         if (var7 == 1) {
            var27[var31].a(1.5707964F);
         }

         if (var7 == 3) {
            var27[var31].a(-1.5707964F);
         }

         var27[var31].int += (double)var2 + 0.5D;
         var27[var31].for += (double)((float)var3 + 0.3125F);
         var27[var31].do += (double)var4 + 0.5D;
      }

      nr var62 = null;
      nr var32 = null;
      nr var33 = null;
      nr var34 = null;
      byte var35 = 7;
      byte var36 = 9;
      byte var37 = 9;
      byte var38 = 16;

      for(int var39 = 0; var39 < 6; ++var39) {
         if (var39 == 0) {
            var62 = var27[0];
            var32 = var27[1];
            var33 = var27[2];
            var34 = var27[3];
            var19 = (double)var18.if((double)var35);
            var21 = (double)var18.a((double)var37);
            var23 = (double)var18.if((double)var36);
            var25 = (double)var18.a((double)(var37 + 2));
         } else if (var39 == 1) {
            var62 = var27[7];
            var32 = var27[6];
            var33 = var27[5];
            var34 = var27[4];
         } else if (var39 == 2) {
            var62 = var27[1];
            var32 = var27[0];
            var33 = var27[4];
            var34 = var27[5];
            var19 = (double)var18.if((double)var35);
            var21 = (double)var18.a((double)var37);
            var23 = (double)var18.if((double)var36);
            var25 = (double)var18.a((double)var38);
         } else if (var39 == 3) {
            var62 = var27[2];
            var32 = var27[1];
            var33 = var27[5];
            var34 = var27[6];
         } else if (var39 == 4) {
            var62 = var27[3];
            var32 = var27[2];
            var33 = var27[6];
            var34 = var27[7];
         } else if (var39 == 5) {
            var62 = var27[0];
            var32 = var27[3];
            var33 = var27[7];
            var34 = var27[4];
         }

         var5.a(var62.int, var62.for, var62.do, var19, var25);
         var5.a(var32.int, var32.for, var32.do, var23, var25);
         var5.a(var33.int, var33.for, var33.do, var23, var21);
         var5.a(var34.int, var34.for, var34.do, var19, var21);
      }

      float var63 = 0.09375F;
      float var40 = 0.09375F;
      float var41 = 0.03125F;
      var27[0] = this.o.do().a((double)(-var63), 0.0D, (double)(-var40));
      var27[1] = this.o.do().a((double)var63, 0.0D, (double)(-var40));
      var27[2] = this.o.do().a((double)var63, 0.0D, (double)var40);
      var27[3] = this.o.do().a((double)(-var63), 0.0D, (double)var40);
      var27[4] = this.o.do().a((double)(-var63), (double)var41, (double)(-var40));
      var27[5] = this.o.do().a((double)var63, (double)var41, (double)(-var40));
      var27[6] = this.o.do().a((double)var63, (double)var41, (double)var40);
      var27[7] = this.o.do().a((double)(-var63), (double)var41, (double)var40);

      for(int var42 = 0; var42 < 8; ++var42) {
         var27[var42].do += 0.21875D;
         if (var9) {
            var27[var42].for -= 0.09375D;
            var27[var42].do -= 0.1625D;
            var27[var42].if(0.0F);
         } else if (var8) {
            var27[var42].for += 0.015625D;
            var27[var42].do -= 0.171875D;
            var27[var42].if(0.17453294F);
         } else {
            var27[var42].if(0.87266463F);
         }

         if (var7 == 2) {
            var27[var42].a(0.0F);
         }

         if (var7 == 0) {
            var27[var42].a(3.1415927F);
         }

         if (var7 == 1) {
            var27[var42].a(1.5707964F);
         }

         if (var7 == 3) {
            var27[var42].a(-1.5707964F);
         }

         var27[var42].int += (double)var2 + 0.5D;
         var27[var42].for += (double)((float)var3 + 0.3125F);
         var27[var42].do += (double)var4 + 0.5D;
      }

      byte var64 = 5;
      byte var43 = 11;
      byte var44 = 3;
      byte var45 = 9;

      for(int var46 = 0; var46 < 6; ++var46) {
         if (var46 == 0) {
            var62 = var27[0];
            var32 = var27[1];
            var33 = var27[2];
            var34 = var27[3];
            var19 = (double)var18.if((double)var64);
            var21 = (double)var18.a((double)var44);
            var23 = (double)var18.if((double)var43);
            var25 = (double)var18.a((double)var45);
         } else if (var46 == 1) {
            var62 = var27[7];
            var32 = var27[6];
            var33 = var27[5];
            var34 = var27[4];
         } else if (var46 == 2) {
            var62 = var27[1];
            var32 = var27[0];
            var33 = var27[4];
            var34 = var27[5];
            var19 = (double)var18.if((double)var64);
            var21 = (double)var18.a((double)var44);
            var23 = (double)var18.if((double)var43);
            var25 = (double)var18.a((double)(var44 + 2));
         } else if (var46 == 3) {
            var62 = var27[2];
            var32 = var27[1];
            var33 = var27[5];
            var34 = var27[6];
         } else if (var46 == 4) {
            var62 = var27[3];
            var32 = var27[2];
            var33 = var27[6];
            var34 = var27[7];
         } else if (var46 == 5) {
            var62 = var27[0];
            var32 = var27[3];
            var33 = var27[7];
            var34 = var27[4];
         }

         var5.a(var62.int, var62.for, var62.do, var19, var25);
         var5.a(var32.int, var32.for, var32.do, var23, var25);
         var5.a(var33.int, var33.for, var33.do, var23, var21);
         var5.a(var34.int, var34.for, var34.do, var19, var21);
      }

      if (var8) {
         double var65 = var27[0].for;
         float var48 = 0.03125F;
         float var49 = 0.5F - var48 / 2.0F;
         float var50 = var49 + var48;
         ajd var51 = this.a(pa.bj);
         double var52 = (double)var18.a();
         double var54 = (double)var18.a(var8 ? 2.0D : 0.0D);
         double var56 = (double)var18.byte();
         double var58 = (double)var18.a(var8 ? 4.0D : 2.0D);
         double var60 = (double)(var10 ? 3.5F : 1.5F) / 16.0D;
         var17 = var1.if(this.o, var2, var3, var4) * 0.75F;
         var5.a(var17, var17, var17);
         if (var7 == 2) {
            var5.a((double)((float)var2 + var49), (double)var3 + var60, (double)var4 + 0.25D, var52, var54);
            var5.a((double)((float)var2 + var50), (double)var3 + var60, (double)var4 + 0.25D, var52, var58);
            var5.a((double)((float)var2 + var50), (double)var3 + var60, (double)var4, var56, var58);
            var5.a((double)((float)var2 + var49), (double)var3 + var60, (double)var4, var56, var54);
            var5.a((double)((float)var2 + var49), var65, (double)var4 + 0.5D, var52, var54);
            var5.a((double)((float)var2 + var50), var65, (double)var4 + 0.5D, var52, var58);
            var5.a((double)((float)var2 + var50), (double)var3 + var60, (double)var4 + 0.25D, var56, var58);
            var5.a((double)((float)var2 + var49), (double)var3 + var60, (double)var4 + 0.25D, var56, var54);
         } else if (var7 == 0) {
            var5.a((double)((float)var2 + var49), (double)var3 + var60, (double)var4 + 0.75D, var52, var54);
            var5.a((double)((float)var2 + var50), (double)var3 + var60, (double)var4 + 0.75D, var52, var58);
            var5.a((double)((float)var2 + var50), var65, (double)var4 + 0.5D, var56, var58);
            var5.a((double)((float)var2 + var49), var65, (double)var4 + 0.5D, var56, var54);
            var5.a((double)((float)var2 + var49), (double)var3 + var60, (double)(var4 + 1), var52, var54);
            var5.a((double)((float)var2 + var50), (double)var3 + var60, (double)(var4 + 1), var52, var58);
            var5.a((double)((float)var2 + var50), (double)var3 + var60, (double)var4 + 0.75D, var56, var58);
            var5.a((double)((float)var2 + var49), (double)var3 + var60, (double)var4 + 0.75D, var56, var54);
         } else if (var7 == 1) {
            var5.a((double)var2, (double)var3 + var60, (double)((float)var4 + var50), var52, var58);
            var5.a((double)var2 + 0.25D, (double)var3 + var60, (double)((float)var4 + var50), var56, var58);
            var5.a((double)var2 + 0.25D, (double)var3 + var60, (double)((float)var4 + var49), var56, var54);
            var5.a((double)var2, (double)var3 + var60, (double)((float)var4 + var49), var52, var54);
            var5.a((double)var2 + 0.25D, (double)var3 + var60, (double)((float)var4 + var50), var52, var58);
            var5.a((double)var2 + 0.5D, var65, (double)((float)var4 + var50), var56, var58);
            var5.a((double)var2 + 0.5D, var65, (double)((float)var4 + var49), var56, var54);
            var5.a((double)var2 + 0.25D, (double)var3 + var60, (double)((float)var4 + var49), var52, var54);
         } else {
            var5.a((double)var2 + 0.5D, var65, (double)((float)var4 + var50), var52, var58);
            var5.a((double)var2 + 0.75D, (double)var3 + var60, (double)((float)var4 + var50), var56, var58);
            var5.a((double)var2 + 0.75D, (double)var3 + var60, (double)((float)var4 + var49), var56, var54);
            var5.a((double)var2 + 0.5D, var65, (double)((float)var4 + var49), var52, var54);
            var5.a((double)var2 + 0.75D, (double)var3 + var60, (double)((float)var4 + var50), var52, var58);
            var5.a((double)(var2 + 1), (double)var3 + var60, (double)((float)var4 + var50), var56, var58);
            var5.a((double)(var2 + 1), (double)var3 + var60, (double)((float)var4 + var49), var56, var54);
            var5.a((double)var2 + 0.75D, (double)var3 + var60, (double)((float)var4 + var49), var52, var54);
         }
      }

      return true;
   }

   public boolean a(pa var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      ajd var6 = this.a(var1, 0);
      int var7 = this.o.for(var2, var3, var4);
      boolean var8 = (var7 & 4) == 4;
      boolean var9 = (var7 & 2) == 2;
      if (this.if()) {
         var6 = this.l;
      }

      var5.if(var1.new(this.o, var2, var3, var4));
      float var10 = var1.if(this.o, var2, var3, var4) * 0.75F;
      var5.a(var10, var10, var10);
      double var11 = (double)var6.a();
      double var13 = (double)var6.a(var8 ? 2.0D : 0.0D);
      double var15 = (double)var6.byte();
      double var17 = (double)var6.a(var8 ? 4.0D : 2.0D);
      double var19 = (double)(var9 ? 3.5F : 1.5F) / 16.0D;
      boolean var21 = oy.a(this.o, var2, var3, var4, var7, 1);
      boolean var22 = oy.a(this.o, var2, var3, var4, var7, 3);
      boolean var23 = oy.a(this.o, var2, var3, var4, var7, 2);
      boolean var24 = oy.a(this.o, var2, var3, var4, var7, 0);
      float var25 = 0.03125F;
      float var26 = 0.5F - var25 / 2.0F;
      float var27 = var26 + var25;
      if (!var23 && !var22 && !var24 && !var21) {
         var23 = true;
         var24 = true;
      }

      if (var23) {
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.25D, var11, var13);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.25D, var11, var17);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)var4, var15, var17);
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)var4, var15, var13);
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)var4, var15, var13);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)var4, var15, var17);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.25D, var11, var17);
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.25D, var11, var13);
      }

      if (var23 || var24 && !var22 && !var21) {
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.5D, var11, var13);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.5D, var11, var17);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.25D, var15, var17);
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.25D, var15, var13);
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.25D, var15, var13);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.25D, var15, var17);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.5D, var11, var17);
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.5D, var11, var13);
      }

      if (var24 || var23 && !var22 && !var21) {
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.75D, var11, var13);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.75D, var11, var17);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.5D, var15, var17);
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.5D, var15, var13);
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.5D, var15, var13);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.5D, var15, var17);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.75D, var11, var17);
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.75D, var11, var13);
      }

      if (var24) {
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)(var4 + 1), var11, var13);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)(var4 + 1), var11, var17);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.75D, var15, var17);
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.75D, var15, var13);
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.75D, var15, var13);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.75D, var15, var17);
         var5.a((double)((float)var2 + var27), (double)var3 + var19, (double)(var4 + 1), var11, var17);
         var5.a((double)((float)var2 + var26), (double)var3 + var19, (double)(var4 + 1), var11, var13);
      }

      if (var21) {
         var5.a((double)var2, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
         var5.a((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
         var5.a((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
         var5.a((double)var2, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
         var5.a((double)var2, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
         var5.a((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
         var5.a((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
         var5.a((double)var2, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
      }

      if (var21 || var22 && !var23 && !var24) {
         var5.a((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
         var5.a((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
         var5.a((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
         var5.a((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
         var5.a((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
         var5.a((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
         var5.a((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
         var5.a((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
      }

      if (var22 || var21 && !var23 && !var24) {
         var5.a((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
         var5.a((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
         var5.a((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
         var5.a((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
         var5.a((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
         var5.a((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
         var5.a((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
         var5.a((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
      }

      if (var22) {
         var5.a((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
         var5.a((double)(var2 + 1), (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
         var5.a((double)(var2 + 1), (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
         var5.a((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
         var5.a((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
         var5.a((double)(var2 + 1), (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
         var5.a((double)(var2 + 1), (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
         var5.a((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
      }

      return true;
   }

   public boolean a(q7 var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      ajd var6 = var1.o(0);
      ajd var7 = var1.o(1);
      ajd var8 = var6;
      if (this.if()) {
         var8 = this.l;
      }

      var5.a(1.0F, 1.0F, 1.0F);
      var5.if(var1.new(this.o, var2, var3, var4));
      double var9 = (double)var8.a();
      double var11 = (double)var8.int();
      double var13 = (double)var8.byte();
      double var15 = (double)var8.do();
      float var17 = 1.4F;
      double var18;
      double var20;
      double var22;
      double var24;
      double var26;
      double var28;
      double var30;
      if (!this.o.case(var2, var3 - 1, var4) && !pa.bo.long(this.o, var2, var3 - 1, var4)) {
         float var36 = 0.2F;
         float var33 = 0.0625F;
         if ((var2 + var3 + var4 & 1) == 1) {
            var9 = (double)var7.a();
            var11 = (double)var7.int();
            var13 = (double)var7.byte();
            var15 = (double)var7.do();
         }

         if ((var2 / 2 + var3 / 2 + var4 / 2 & 1) == 1) {
            var18 = var13;
            var13 = var9;
            var9 = var18;
         }

         if (pa.bo.long(this.o, var2 - 1, var3, var4)) {
            var5.a((double)((float)var2 + var36), (double)((float)var3 + var17 + var33), (double)(var4 + 1), var13, var11);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var33), (double)(var4 + 1), var13, var15);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var33), (double)(var4 + 0), var9, var15);
            var5.a((double)((float)var2 + var36), (double)((float)var3 + var17 + var33), (double)(var4 + 0), var9, var11);
            var5.a((double)((float)var2 + var36), (double)((float)var3 + var17 + var33), (double)(var4 + 0), var9, var11);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var33), (double)(var4 + 0), var9, var15);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var33), (double)(var4 + 1), var13, var15);
            var5.a((double)((float)var2 + var36), (double)((float)var3 + var17 + var33), (double)(var4 + 1), var13, var11);
         }

         if (pa.bo.long(this.o, var2 + 1, var3, var4)) {
            var5.a((double)((float)(var2 + 1) - var36), (double)((float)var3 + var17 + var33), (double)(var4 + 0), var9, var11);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var33), (double)(var4 + 0), var9, var15);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var33), (double)(var4 + 1), var13, var15);
            var5.a((double)((float)(var2 + 1) - var36), (double)((float)var3 + var17 + var33), (double)(var4 + 1), var13, var11);
            var5.a((double)((float)(var2 + 1) - var36), (double)((float)var3 + var17 + var33), (double)(var4 + 1), var13, var11);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var33), (double)(var4 + 1), var13, var15);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var33), (double)(var4 + 0), var9, var15);
            var5.a((double)((float)(var2 + 1) - var36), (double)((float)var3 + var17 + var33), (double)(var4 + 0), var9, var11);
         }

         if (pa.bo.long(this.o, var2, var3, var4 - 1)) {
            var5.a((double)(var2 + 0), (double)((float)var3 + var17 + var33), (double)((float)var4 + var36), var13, var11);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var33), (double)(var4 + 0), var13, var15);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var33), (double)(var4 + 0), var9, var15);
            var5.a((double)(var2 + 1), (double)((float)var3 + var17 + var33), (double)((float)var4 + var36), var9, var11);
            var5.a((double)(var2 + 1), (double)((float)var3 + var17 + var33), (double)((float)var4 + var36), var9, var11);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var33), (double)(var4 + 0), var9, var15);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var33), (double)(var4 + 0), var13, var15);
            var5.a((double)(var2 + 0), (double)((float)var3 + var17 + var33), (double)((float)var4 + var36), var13, var11);
         }

         if (pa.bo.long(this.o, var2, var3, var4 + 1)) {
            var5.a((double)(var2 + 1), (double)((float)var3 + var17 + var33), (double)((float)(var4 + 1) - var36), var9, var11);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var33), (double)(var4 + 1 - 0), var9, var15);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var33), (double)(var4 + 1 - 0), var13, var15);
            var5.a((double)(var2 + 0), (double)((float)var3 + var17 + var33), (double)((float)(var4 + 1) - var36), var13, var11);
            var5.a((double)(var2 + 0), (double)((float)var3 + var17 + var33), (double)((float)(var4 + 1) - var36), var13, var11);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var33), (double)(var4 + 1 - 0), var13, var15);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var33), (double)(var4 + 1 - 0), var9, var15);
            var5.a((double)(var2 + 1), (double)((float)var3 + var17 + var33), (double)((float)(var4 + 1) - var36), var9, var11);
         }

         if (pa.bo.long(this.o, var2, var3 + 1, var4)) {
            var18 = (double)var2 + 0.5D + 0.5D;
            var20 = (double)var2 + 0.5D - 0.5D;
            var22 = (double)var4 + 0.5D + 0.5D;
            var24 = (double)var4 + 0.5D - 0.5D;
            var26 = (double)var2 + 0.5D - 0.5D;
            var28 = (double)var2 + 0.5D + 0.5D;
            var30 = (double)var4 + 0.5D - 0.5D;
            double var34 = (double)var4 + 0.5D + 0.5D;
            var9 = (double)var6.a();
            var11 = (double)var6.int();
            var13 = (double)var6.byte();
            var15 = (double)var6.do();
            ++var3;
            var17 = -0.2F;
            if ((var2 + var3 + var4 & 1) == 0) {
               var5.a(var26, (double)((float)var3 + var17), (double)(var4 + 0), var13, var11);
               var5.a(var18, (double)(var3 + 0), (double)(var4 + 0), var13, var15);
               var5.a(var18, (double)(var3 + 0), (double)(var4 + 1), var9, var15);
               var5.a(var26, (double)((float)var3 + var17), (double)(var4 + 1), var9, var11);
               var9 = (double)var7.a();
               var11 = (double)var7.int();
               var13 = (double)var7.byte();
               var15 = (double)var7.do();
               var5.a(var28, (double)((float)var3 + var17), (double)(var4 + 1), var13, var11);
               var5.a(var20, (double)(var3 + 0), (double)(var4 + 1), var13, var15);
               var5.a(var20, (double)(var3 + 0), (double)(var4 + 0), var9, var15);
               var5.a(var28, (double)((float)var3 + var17), (double)(var4 + 0), var9, var11);
            } else {
               var5.a((double)(var2 + 0), (double)((float)var3 + var17), var34, var13, var11);
               var5.a((double)(var2 + 0), (double)(var3 + 0), var24, var13, var15);
               var5.a((double)(var2 + 1), (double)(var3 + 0), var24, var9, var15);
               var5.a((double)(var2 + 1), (double)((float)var3 + var17), var34, var9, var11);
               var9 = (double)var7.a();
               var11 = (double)var7.int();
               var13 = (double)var7.byte();
               var15 = (double)var7.do();
               var5.a((double)(var2 + 1), (double)((float)var3 + var17), var30, var13, var11);
               var5.a((double)(var2 + 1), (double)(var3 + 0), var22, var13, var15);
               var5.a((double)(var2 + 0), (double)(var3 + 0), var22, var9, var15);
               var5.a((double)(var2 + 0), (double)((float)var3 + var17), var30, var9, var11);
            }
         }
      } else {
         double var32 = (double)var2 + 0.5D + 0.2D;
         var18 = (double)var2 + 0.5D - 0.2D;
         var20 = (double)var4 + 0.5D + 0.2D;
         var22 = (double)var4 + 0.5D - 0.2D;
         var24 = (double)var2 + 0.5D - 0.3D;
         var26 = (double)var2 + 0.5D + 0.3D;
         var28 = (double)var4 + 0.5D - 0.3D;
         var30 = (double)var4 + 0.5D + 0.3D;
         var5.a(var24, (double)((float)var3 + var17), (double)(var4 + 1), var13, var11);
         var5.a(var32, (double)(var3 + 0), (double)(var4 + 1), var13, var15);
         var5.a(var32, (double)(var3 + 0), (double)(var4 + 0), var9, var15);
         var5.a(var24, (double)((float)var3 + var17), (double)(var4 + 0), var9, var11);
         var5.a(var26, (double)((float)var3 + var17), (double)(var4 + 0), var13, var11);
         var5.a(var18, (double)(var3 + 0), (double)(var4 + 0), var13, var15);
         var5.a(var18, (double)(var3 + 0), (double)(var4 + 1), var9, var15);
         var5.a(var26, (double)((float)var3 + var17), (double)(var4 + 1), var9, var11);
         var9 = (double)var7.a();
         var11 = (double)var7.int();
         var13 = (double)var7.byte();
         var15 = (double)var7.do();
         var5.a((double)(var2 + 1), (double)((float)var3 + var17), var30, var13, var11);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var22, var13, var15);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var22, var9, var15);
         var5.a((double)(var2 + 0), (double)((float)var3 + var17), var30, var9, var11);
         var5.a((double)(var2 + 0), (double)((float)var3 + var17), var28, var13, var11);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var20, var13, var15);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var20, var9, var15);
         var5.a((double)(var2 + 1), (double)((float)var3 + var17), var28, var9, var11);
         var32 = (double)var2 + 0.5D - 0.5D;
         var18 = (double)var2 + 0.5D + 0.5D;
         var20 = (double)var4 + 0.5D - 0.5D;
         var22 = (double)var4 + 0.5D + 0.5D;
         var24 = (double)var2 + 0.5D - 0.4D;
         var26 = (double)var2 + 0.5D + 0.4D;
         var28 = (double)var4 + 0.5D - 0.4D;
         var30 = (double)var4 + 0.5D + 0.4D;
         var5.a(var24, (double)((float)var3 + var17), (double)(var4 + 0), var9, var11);
         var5.a(var32, (double)(var3 + 0), (double)(var4 + 0), var9, var15);
         var5.a(var32, (double)(var3 + 0), (double)(var4 + 1), var13, var15);
         var5.a(var24, (double)((float)var3 + var17), (double)(var4 + 1), var13, var11);
         var5.a(var26, (double)((float)var3 + var17), (double)(var4 + 1), var9, var11);
         var5.a(var18, (double)(var3 + 0), (double)(var4 + 1), var9, var15);
         var5.a(var18, (double)(var3 + 0), (double)(var4 + 0), var13, var15);
         var5.a(var26, (double)((float)var3 + var17), (double)(var4 + 0), var13, var11);
         var9 = (double)var6.a();
         var11 = (double)var6.int();
         var13 = (double)var6.byte();
         var15 = (double)var6.do();
         var5.a((double)(var2 + 0), (double)((float)var3 + var17), var30, var9, var11);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var22, var9, var15);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var22, var13, var15);
         var5.a((double)(var2 + 1), (double)((float)var3 + var17), var30, var13, var11);
         var5.a((double)(var2 + 1), (double)((float)var3 + var17), var28, var9, var11);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var20, var9, var15);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var20, var13, var15);
         var5.a((double)(var2 + 0), (double)((float)var3 + var17), var28, var13, var11);
      }

      return true;
   }

   public boolean try(pa var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      int var6 = this.o.for(var2, var3, var4);
      ajd var7 = px.do("redstoneDust_cross");
      ajd var8 = px.do("redstoneDust_line");
      ajd var9 = px.do("redstoneDust_cross_overlay");
      ajd var10 = px.do("redstoneDust_line_overlay");
      var5.if(var1.new(this.o, var2, var3, var4));
      float var11 = 1.0F;
      float var12 = (float)var6 / 15.0F;
      float var13 = var12 * 0.6F + 0.4F;
      if (var6 == 0) {
         var13 = 0.3F;
      }

      float var14 = var12 * var12 * 0.7F - 0.5F;
      float var15 = var12 * var12 * 0.6F - 0.7F;
      if (var14 < 0.0F) {
         var14 = 0.0F;
      }

      if (var15 < 0.0F) {
         var15 = 0.0F;
      }

      int var16 = ad8.a(var6);
      if (var16 != -1) {
         int var17 = var16 >> 16 & 255;
         int var18 = var16 >> 8 & 255;
         int var19 = var16 & 255;
         var13 = (float)var17 / 255.0F;
         var14 = (float)var18 / 255.0F;
         var15 = (float)var19 / 255.0F;
      }

      var5.a(var13, var14, var15);
      boolean var30 = px.try(this.o, var2 - 1, var3, var4, 1) || !this.o.try(var2 - 1, var3, var4) && px.try(this.o, var2 - 1, var3 - 1, var4, -1);
      boolean var31 = px.try(this.o, var2 + 1, var3, var4, 3) || !this.o.try(var2 + 1, var3, var4) && px.try(this.o, var2 + 1, var3 - 1, var4, -1);
      boolean var32 = px.try(this.o, var2, var3, var4 - 1, 2) || !this.o.try(var2, var3, var4 - 1) && px.try(this.o, var2, var3 - 1, var4 - 1, -1);
      boolean var20 = px.try(this.o, var2, var3, var4 + 1, 0) || !this.o.try(var2, var3, var4 + 1) && px.try(this.o, var2, var3 - 1, var4 + 1, -1);
      if (!this.o.try(var2, var3 + 1, var4)) {
         if (this.o.try(var2 - 1, var3, var4) && px.try(this.o, var2 - 1, var3 + 1, var4, -1)) {
            var30 = true;
         }

         if (this.o.try(var2 + 1, var3, var4) && px.try(this.o, var2 + 1, var3 + 1, var4, -1)) {
            var31 = true;
         }

         if (this.o.try(var2, var3, var4 - 1) && px.try(this.o, var2, var3 + 1, var4 - 1, -1)) {
            var32 = true;
         }

         if (this.o.try(var2, var3, var4 + 1) && px.try(this.o, var2, var3 + 1, var4 + 1, -1)) {
            var20 = true;
         }
      }

      float var21 = (float)(var2 + 0);
      float var22 = (float)(var2 + 1);
      float var23 = (float)(var4 + 0);
      float var24 = (float)(var4 + 1);
      boolean var25 = false;
      if ((var30 || var31) && !var32 && !var20) {
         var25 = true;
      }

      if ((var32 || var20) && !var31 && !var30) {
         var25 = true;
      }

      if (!var25) {
         int var26 = 0;
         int var27 = 0;
         int var28 = 16;
         int var29 = 16;
         if (!var30) {
            var21 += 0.3125F;
         }

         if (!var30) {
            var26 += 5;
         }

         if (!var31) {
            var22 -= 0.3125F;
         }

         if (!var31) {
            var28 -= 5;
         }

         if (!var32) {
            var23 += 0.3125F;
         }

         if (!var32) {
            var27 += 5;
         }

         if (!var20) {
            var24 -= 0.3125F;
         }

         if (!var20) {
            var29 -= 5;
         }

         var5.a((double)var22, (double)var3 + 0.015625D, (double)var24, (double)var7.if((double)var28), (double)var7.a((double)var29));
         var5.a((double)var22, (double)var3 + 0.015625D, (double)var23, (double)var7.if((double)var28), (double)var7.a((double)var27));
         var5.a((double)var21, (double)var3 + 0.015625D, (double)var23, (double)var7.if((double)var26), (double)var7.a((double)var27));
         var5.a((double)var21, (double)var3 + 0.015625D, (double)var24, (double)var7.if((double)var26), (double)var7.a((double)var29));
         var5.a(var11, var11, var11);
         var5.a((double)var22, (double)var3 + 0.015625D, (double)var24, (double)var9.if((double)var28), (double)var9.a((double)var29));
         var5.a((double)var22, (double)var3 + 0.015625D, (double)var23, (double)var9.if((double)var28), (double)var9.a((double)var27));
         var5.a((double)var21, (double)var3 + 0.015625D, (double)var23, (double)var9.if((double)var26), (double)var9.a((double)var27));
         var5.a((double)var21, (double)var3 + 0.015625D, (double)var24, (double)var9.if((double)var26), (double)var9.a((double)var29));
      } else if (var25) {
         var5.a((double)var22, (double)var3 + 0.015625D, (double)var24, (double)var8.byte(), (double)var8.do());
         var5.a((double)var22, (double)var3 + 0.015625D, (double)var23, (double)var8.byte(), (double)var8.int());
         var5.a((double)var21, (double)var3 + 0.015625D, (double)var23, (double)var8.a(), (double)var8.int());
         var5.a((double)var21, (double)var3 + 0.015625D, (double)var24, (double)var8.a(), (double)var8.do());
         var5.a(var11, var11, var11);
         var5.a((double)var22, (double)var3 + 0.015625D, (double)var24, (double)var10.byte(), (double)var10.do());
         var5.a((double)var22, (double)var3 + 0.015625D, (double)var23, (double)var10.byte(), (double)var10.int());
         var5.a((double)var21, (double)var3 + 0.015625D, (double)var23, (double)var10.a(), (double)var10.int());
         var5.a((double)var21, (double)var3 + 0.015625D, (double)var24, (double)var10.a(), (double)var10.do());
      } else {
         var5.a((double)var22, (double)var3 + 0.015625D, (double)var24, (double)var8.byte(), (double)var8.do());
         var5.a((double)var22, (double)var3 + 0.015625D, (double)var23, (double)var8.a(), (double)var8.do());
         var5.a((double)var21, (double)var3 + 0.015625D, (double)var23, (double)var8.a(), (double)var8.int());
         var5.a((double)var21, (double)var3 + 0.015625D, (double)var24, (double)var8.byte(), (double)var8.int());
         var5.a(var11, var11, var11);
         var5.a((double)var22, (double)var3 + 0.015625D, (double)var24, (double)var10.byte(), (double)var10.do());
         var5.a((double)var22, (double)var3 + 0.015625D, (double)var23, (double)var10.a(), (double)var10.do());
         var5.a((double)var21, (double)var3 + 0.015625D, (double)var23, (double)var10.a(), (double)var10.int());
         var5.a((double)var21, (double)var3 + 0.015625D, (double)var24, (double)var10.byte(), (double)var10.int());
      }

      if (!this.o.try(var2, var3 + 1, var4)) {
         if (this.o.try(var2 - 1, var3, var4) && this.o.new(var2 - 1, var3 + 1, var4) == pa.bg.void) {
            var5.a(var11 * var13, var11 * var14, var11 * var15);
            var5.a((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), (double)var8.byte(), (double)var8.int());
            var5.a((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 1), (double)var8.a(), (double)var8.int());
            var5.a((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 0), (double)var8.a(), (double)var8.do());
            var5.a((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), (double)var8.byte(), (double)var8.do());
            var5.a(var11, var11, var11);
            var5.a((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), (double)var10.byte(), (double)var10.int());
            var5.a((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 1), (double)var10.a(), (double)var10.int());
            var5.a((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 0), (double)var10.a(), (double)var10.do());
            var5.a((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), (double)var10.byte(), (double)var10.do());
         }

         if (this.o.try(var2 + 1, var3, var4) && this.o.new(var2 + 1, var3 + 1, var4) == pa.bg.void) {
            var5.a(var11 * var13, var11 * var14, var11 * var15);
            var5.a((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 1), (double)var8.a(), (double)var8.do());
            var5.a((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), (double)var8.byte(), (double)var8.do());
            var5.a((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), (double)var8.byte(), (double)var8.int());
            var5.a((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 0), (double)var8.a(), (double)var8.int());
            var5.a(var11, var11, var11);
            var5.a((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 1), (double)var10.a(), (double)var10.do());
            var5.a((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), (double)var10.byte(), (double)var10.do());
            var5.a((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), (double)var10.byte(), (double)var10.int());
            var5.a((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 0), (double)var10.a(), (double)var10.int());
         }

         if (this.o.try(var2, var3, var4 - 1) && this.o.new(var2, var3 + 1, var4 - 1) == pa.bg.void) {
            var5.a(var11 * var13, var11 * var14, var11 * var15);
            var5.a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + 0.015625D, (double)var8.a(), (double)var8.do());
            var5.a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, (double)var8.byte(), (double)var8.do());
            var5.a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, (double)var8.byte(), (double)var8.int());
            var5.a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + 0.015625D, (double)var8.a(), (double)var8.int());
            var5.a(var11, var11, var11);
            var5.a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + 0.015625D, (double)var10.a(), (double)var10.do());
            var5.a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, (double)var10.byte(), (double)var10.do());
            var5.a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, (double)var10.byte(), (double)var10.int());
            var5.a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + 0.015625D, (double)var10.a(), (double)var10.int());
         }

         if (this.o.try(var2, var3, var4 + 1) && this.o.new(var2, var3 + 1, var4 + 1) == pa.bg.void) {
            var5.a(var11 * var13, var11 * var14, var11 * var15);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, (double)var8.byte(), (double)var8.int());
            var5.a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, (double)var8.a(), (double)var8.int());
            var5.a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, (double)var8.a(), (double)var8.do());
            var5.a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, (double)var8.byte(), (double)var8.do());
            var5.a(var11, var11, var11);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, (double)var10.byte(), (double)var10.int());
            var5.a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, (double)var10.a(), (double)var10.int());
            var5.a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, (double)var10.a(), (double)var10.do());
            var5.a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, (double)var10.byte(), (double)var10.do());
         }
      }

      if (qs.R() && this.a(var2, var3, var4)) {
         this.a(var2, var3, var4, 0.01D);
      }

      return true;
   }

   public boolean a(r6 var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      int var6 = this.o.for(var2, var3, var4);
      ajd var7 = this.a(var1, 0, var6);
      if (this.if()) {
         var7 = this.l;
      }

      if (var1.E()) {
         var6 &= 7;
      }

      var5.if(var1.new(this.o, var2, var3, var4));
      var5.a(1.0F, 1.0F, 1.0F);
      double var8 = (double)var7.a();
      double var10 = (double)var7.int();
      double var12 = (double)var7.byte();
      double var14 = (double)var7.do();
      double var16 = 0.0625D;
      double var18 = (double)(var2 + 1);
      double var20 = (double)(var2 + 1);
      double var22 = (double)(var2 + 0);
      double var24 = (double)(var2 + 0);
      double var26 = (double)(var4 + 0);
      double var28 = (double)(var4 + 1);
      double var30 = (double)(var4 + 1);
      double var32 = (double)(var4 + 0);
      double var34 = (double)var3 + var16;
      double var36 = (double)var3 + var16;
      double var38 = (double)var3 + var16;
      double var40 = (double)var3 + var16;
      if (var6 != 1 && var6 != 2 && var6 != 3 && var6 != 7) {
         if (var6 == 8) {
            var18 = var20 = (double)(var2 + 0);
            var22 = var24 = (double)(var2 + 1);
            var26 = var32 = (double)(var4 + 1);
            var28 = var30 = (double)(var4 + 0);
         } else if (var6 == 9) {
            var18 = var24 = (double)(var2 + 0);
            var20 = var22 = (double)(var2 + 1);
            var26 = var28 = (double)(var4 + 0);
            var30 = var32 = (double)(var4 + 1);
         }
      } else {
         var18 = var24 = (double)(var2 + 1);
         var20 = var22 = (double)(var2 + 0);
         var26 = var28 = (double)(var4 + 1);
         var30 = var32 = (double)(var4 + 0);
      }

      if (var6 != 2 && var6 != 4) {
         if (var6 == 3 || var6 == 5) {
            ++var36;
            ++var38;
         }
      } else {
         ++var34;
         ++var40;
      }

      var5.a(var18, var34, var26, var12, var10);
      var5.a(var20, var36, var28, var12, var14);
      var5.a(var22, var38, var30, var8, var14);
      var5.a(var24, var40, var32, var8, var10);
      var5.a(var24, var40, var32, var8, var10);
      var5.a(var22, var38, var30, var8, var14);
      var5.a(var20, var36, var28, var12, var14);
      var5.a(var18, var34, var26, var12, var10);
      if (qs.R() && this.a(var2, var3, var4)) {
         this.a(var2, var3, var4, 0.05D);
      }

      return true;
   }

   public boolean goto(pa var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      ajd var6 = this.a(var1, 0);
      if (this.if()) {
         var6 = this.l;
      }

      if (qs.aj() && this.l == null) {
         var6 = e.if(this.o, var1, var2, var3, var4, -1, var6);
      }

      var5.if(var1.new(this.o, var2, var3, var4));
      float var7 = 1.0F;
      var5.a(var7, var7, var7);
      double var8 = (double)var6.a();
      double var10 = (double)var6.int();
      double var12 = (double)var6.byte();
      double var14 = (double)var6.do();
      int var16 = this.o.for(var2, var3, var4);
      double var17 = 0.0D;
      double var19 = 0.05000000074505806D;
      if (var16 == 5) {
         var5.a((double)var2 + var19, (double)(var3 + 1) + var17, (double)(var4 + 1) + var17, var8, var10);
         var5.a((double)var2 + var19, (double)(var3 + 0) - var17, (double)(var4 + 1) + var17, var8, var14);
         var5.a((double)var2 + var19, (double)(var3 + 0) - var17, (double)(var4 + 0) - var17, var12, var14);
         var5.a((double)var2 + var19, (double)(var3 + 1) + var17, (double)(var4 + 0) - var17, var12, var10);
      }

      if (var16 == 4) {
         var5.a((double)(var2 + 1) - var19, (double)(var3 + 0) - var17, (double)(var4 + 1) + var17, var12, var14);
         var5.a((double)(var2 + 1) - var19, (double)(var3 + 1) + var17, (double)(var4 + 1) + var17, var12, var10);
         var5.a((double)(var2 + 1) - var19, (double)(var3 + 1) + var17, (double)(var4 + 0) - var17, var8, var10);
         var5.a((double)(var2 + 1) - var19, (double)(var3 + 0) - var17, (double)(var4 + 0) - var17, var8, var14);
      }

      if (var16 == 3) {
         var5.a((double)(var2 + 1) + var17, (double)(var3 + 0) - var17, (double)var4 + var19, var12, var14);
         var5.a((double)(var2 + 1) + var17, (double)(var3 + 1) + var17, (double)var4 + var19, var12, var10);
         var5.a((double)(var2 + 0) - var17, (double)(var3 + 1) + var17, (double)var4 + var19, var8, var10);
         var5.a((double)(var2 + 0) - var17, (double)(var3 + 0) - var17, (double)var4 + var19, var8, var14);
      }

      if (var16 == 2) {
         var5.a((double)(var2 + 1) + var17, (double)(var3 + 1) + var17, (double)(var4 + 1) - var19, var8, var10);
         var5.a((double)(var2 + 1) + var17, (double)(var3 + 0) - var17, (double)(var4 + 1) - var19, var8, var14);
         var5.a((double)(var2 + 0) - var17, (double)(var3 + 0) - var17, (double)(var4 + 1) - var19, var12, var14);
         var5.a((double)(var2 + 0) - var17, (double)(var3 + 1) + var17, (double)(var4 + 1) - var19, var12, var10);
      }

      return true;
   }

   public boolean d(pa var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      ajd var6 = this.a(var1, 0);
      if (this.if()) {
         var6 = this.l;
      }

      if (qs.aj() && this.l == null) {
         var6 = e.if(this.o, var1, var2, var3, var4, -1, var6);
      }

      float var7 = 1.0F;
      var5.if(var1.new(this.o, var2, var3, var4));
      int var8 = ad8.if(var1, this.o, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      var5.a(var7 * var9, var7 * var10, var7 * var11);
      double var12 = (double)var6.a();
      double var14 = (double)var6.int();
      double var16 = (double)var6.byte();
      double var18 = (double)var6.do();
      double var20 = 0.05000000074505806D;
      int var22 = this.o.for(var2, var3, var4);
      if ((var22 & 2) != 0) {
         var5.a((double)var2 + var20, (double)(var3 + 1), (double)(var4 + 1), var12, var14);
         var5.a((double)var2 + var20, (double)(var3 + 0), (double)(var4 + 1), var12, var18);
         var5.a((double)var2 + var20, (double)(var3 + 0), (double)(var4 + 0), var16, var18);
         var5.a((double)var2 + var20, (double)(var3 + 1), (double)(var4 + 0), var16, var14);
         var5.a((double)var2 + var20, (double)(var3 + 1), (double)(var4 + 0), var16, var14);
         var5.a((double)var2 + var20, (double)(var3 + 0), (double)(var4 + 0), var16, var18);
         var5.a((double)var2 + var20, (double)(var3 + 0), (double)(var4 + 1), var12, var18);
         var5.a((double)var2 + var20, (double)(var3 + 1), (double)(var4 + 1), var12, var14);
      }

      if ((var22 & 8) != 0) {
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 0), (double)(var4 + 1), var16, var18);
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 1), (double)(var4 + 1), var16, var14);
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 1), (double)(var4 + 0), var12, var14);
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 0), (double)(var4 + 0), var12, var18);
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 0), (double)(var4 + 0), var12, var18);
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 1), (double)(var4 + 0), var12, var14);
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 1), (double)(var4 + 1), var16, var14);
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 0), (double)(var4 + 1), var16, var18);
      }

      if ((var22 & 4) != 0) {
         var5.a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + var20, var16, var18);
         var5.a((double)(var2 + 1), (double)(var3 + 1), (double)var4 + var20, var16, var14);
         var5.a((double)(var2 + 0), (double)(var3 + 1), (double)var4 + var20, var12, var14);
         var5.a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + var20, var12, var18);
         var5.a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + var20, var12, var18);
         var5.a((double)(var2 + 0), (double)(var3 + 1), (double)var4 + var20, var12, var14);
         var5.a((double)(var2 + 1), (double)(var3 + 1), (double)var4 + var20, var16, var14);
         var5.a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + var20, var16, var18);
      }

      if ((var22 & 1) != 0) {
         var5.a((double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1) - var20, var12, var14);
         var5.a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - var20, var12, var18);
         var5.a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - var20, var16, var18);
         var5.a((double)(var2 + 0), (double)(var3 + 1), (double)(var4 + 1) - var20, var16, var14);
         var5.a((double)(var2 + 0), (double)(var3 + 1), (double)(var4 + 1) - var20, var16, var14);
         var5.a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - var20, var16, var18);
         var5.a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - var20, var12, var18);
         var5.a((double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1) - var20, var12, var14);
      }

      if (this.o.try(var2, var3 + 1, var4)) {
         var5.a((double)(var2 + 1), (double)(var3 + 1) - var20, (double)(var4 + 0), var12, var14);
         var5.a((double)(var2 + 1), (double)(var3 + 1) - var20, (double)(var4 + 1), var12, var18);
         var5.a((double)(var2 + 0), (double)(var3 + 1) - var20, (double)(var4 + 1), var16, var18);
         var5.a((double)(var2 + 0), (double)(var3 + 1) - var20, (double)(var4 + 0), var16, var14);
      }

      return true;
   }

   public boolean a(pb var1, int var2, int var3, int var4) {
      int var5 = this.o.if();
      c4 var6 = c4.G;
      var6.if(var1.new(this.o, var2, var3, var4));
      float var7 = 1.0F;
      int var8 = var1.do(this.o, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      if (dh.r) {
         float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
         float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
         float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
         var9 = var12;
         var10 = var13;
         var11 = var14;
      }

      var6.a(var7 * var9, var7 * var10, var7 * var11);
      w0 var104 = null;
      ajd var15;
      int var105;
      ajd var106;
      if (this.if()) {
         var106 = this.l;
         var15 = this.l;
      } else {
         var105 = this.o.for(var2, var3, var4);
         var106 = this.a(var1, 0, var105);
         var15 = var1.t();
         if (qs.aj()) {
            var104 = e.a(this.o, var1, var2, var3, var4, -1, var106);
         }
      }

      ajd var16 = var106;
      ajd var17 = var106;
      ajd var18 = var106;
      int var19;
      if (var104 != null) {
         var19 = var1.void;
         int var20 = this.o.new(var2 + 1, var3, var4);
         int var21 = this.o.new(var2 - 1, var3, var4);
         int var22 = this.o.new(var2, var3 + 1, var4);
         int var23 = this.o.new(var2, var3 - 1, var4);
         int var24 = this.o.new(var2, var3, var4 + 1);
         int var25 = this.o.new(var2, var3, var4 - 1);
         boolean var26 = var20 == var19;
         boolean var27 = var21 == var19;
         boolean var28 = var22 == var19;
         boolean var29 = var23 == var19;
         boolean var30 = var24 == var19;
         boolean var31 = var25 == var19;
         int var32 = e.a(var26, var27, var28, var29);
         int var33 = e.a(var32);
         int var34 = e.a(var30, var31, var28, var29);
         int var35 = e.a(var34);
         var106 = e.a(var104, var32, var106);
         var16 = e.a(var104, var33, var16);
         var17 = e.a(var104, var34, var17);
         var18 = e.a(var104, var35, var18);
      }

      var105 = var106.case();
      var19 = var106.try();
      double var107 = (double)var106.a();
      double var108 = (double)var106.if(8.0D);
      double var109 = (double)var106.byte();
      double var110 = (double)var106.int();
      double var111 = (double)var106.do();
      int var112 = var16.case();
      int var113 = var16.try();
      double var114 = (double)var16.a();
      double var115 = (double)var16.if(8.0D);
      double var36 = (double)var16.byte();
      double var38 = (double)var16.int();
      double var40 = (double)var16.do();
      int var42 = var17.case();
      int var43 = var17.try();
      double var44 = (double)var17.a();
      double var46 = (double)var17.if(8.0D);
      double var48 = (double)var17.byte();
      double var50 = (double)var17.int();
      double var52 = (double)var17.do();
      int var54 = var18.case();
      int var55 = var18.try();
      double var56 = (double)var18.a();
      double var58 = (double)var18.if(8.0D);
      double var60 = (double)var18.byte();
      double var62 = (double)var18.int();
      double var64 = (double)var18.do();
      int var66 = var15.case();
      int var67 = var15.try();
      double var68 = (double)var15.if(7.0D);
      double var70 = (double)var15.if(9.0D);
      double var72 = (double)var15.int();
      double var74 = (double)var15.a(8.0D);
      double var76 = (double)var15.do();
      double var78 = (double)var2;
      double var80 = (double)var2 + 0.5D;
      double var82 = (double)(var2 + 1);
      double var84 = (double)var4;
      double var86 = (double)var4 + 0.5D;
      double var88 = (double)(var4 + 1);
      double var90 = (double)var2 + 0.5D - 0.0625D;
      double var92 = (double)var2 + 0.5D + 0.0625D;
      double var94 = (double)var4 + 0.5D - 0.0625D;
      double var96 = (double)var4 + 0.5D + 0.0625D;
      boolean var98 = var1.d(this.o.new(var2, var3, var4 - 1));
      boolean var99 = var1.d(this.o.new(var2, var3, var4 + 1));
      boolean var100 = var1.d(this.o.new(var2 - 1, var3, var4));
      boolean var101 = var1.d(this.o.new(var2 + 1, var3, var4));
      boolean var102 = var1.int(this.o, var2, var3 + 1, var4, 1);
      boolean var103 = var1.int(this.o, var2, var3 - 1, var4, 0);
      if ((!var100 || !var101) && (var100 || var101 || var98 || var99)) {
         if (var100 && !var101) {
            var6.a(var78, (double)(var3 + 1), var86, var107, var110);
            var6.a(var78, (double)(var3 + 0), var86, var107, var111);
            var6.a(var80, (double)(var3 + 0), var86, var108, var111);
            var6.a(var80, (double)(var3 + 1), var86, var108, var110);
            var6.a(var80, (double)(var3 + 1), var86, var115, var38);
            var6.a(var80, (double)(var3 + 0), var86, var115, var40);
            var6.a(var78, (double)(var3 + 0), var86, var36, var40);
            var6.a(var78, (double)(var3 + 1), var86, var36, var38);
            if (!var99 && !var98) {
               var6.a(var80, (double)(var3 + 1), var96, var68, var72);
               var6.a(var80, (double)(var3 + 0), var96, var68, var76);
               var6.a(var80, (double)(var3 + 0), var94, var70, var76);
               var6.a(var80, (double)(var3 + 1), var94, var70, var72);
               var6.a(var80, (double)(var3 + 1), var94, var68, var72);
               var6.a(var80, (double)(var3 + 0), var94, var68, var76);
               var6.a(var80, (double)(var3 + 0), var96, var70, var76);
               var6.a(var80, (double)(var3 + 1), var96, var70, var72);
            }

            if (var102 || var3 < var5 - 1 && this.o.a(var2 - 1, var3 + 1, var4)) {
               var6.a(var78, (double)(var3 + 1) + 0.01D, var96, var70, var74);
               var6.a(var80, (double)(var3 + 1) + 0.01D, var96, var70, var76);
               var6.a(var80, (double)(var3 + 1) + 0.01D, var94, var68, var76);
               var6.a(var78, (double)(var3 + 1) + 0.01D, var94, var68, var74);
               var6.a(var80, (double)(var3 + 1) + 0.01D, var96, var70, var74);
               var6.a(var78, (double)(var3 + 1) + 0.01D, var96, var70, var76);
               var6.a(var78, (double)(var3 + 1) + 0.01D, var94, var68, var76);
               var6.a(var80, (double)(var3 + 1) + 0.01D, var94, var68, var74);
            }

            if (var103 || var3 > 1 && this.o.a(var2 - 1, var3 - 1, var4)) {
               var6.a(var78, (double)var3 - 0.01D, var96, var70, var74);
               var6.a(var80, (double)var3 - 0.01D, var96, var70, var76);
               var6.a(var80, (double)var3 - 0.01D, var94, var68, var76);
               var6.a(var78, (double)var3 - 0.01D, var94, var68, var74);
               var6.a(var80, (double)var3 - 0.01D, var96, var70, var74);
               var6.a(var78, (double)var3 - 0.01D, var96, var70, var76);
               var6.a(var78, (double)var3 - 0.01D, var94, var68, var76);
               var6.a(var80, (double)var3 - 0.01D, var94, var68, var74);
            }
         } else if (!var100 && var101) {
            var6.a(var80, (double)(var3 + 1), var86, var108, var110);
            var6.a(var80, (double)(var3 + 0), var86, var108, var111);
            var6.a(var82, (double)(var3 + 0), var86, var109, var111);
            var6.a(var82, (double)(var3 + 1), var86, var109, var110);
            var6.a(var82, (double)(var3 + 1), var86, var114, var38);
            var6.a(var82, (double)(var3 + 0), var86, var114, var40);
            var6.a(var80, (double)(var3 + 0), var86, var115, var40);
            var6.a(var80, (double)(var3 + 1), var86, var115, var38);
            if (!var99 && !var98) {
               var6.a(var80, (double)(var3 + 1), var94, var68, var72);
               var6.a(var80, (double)(var3 + 0), var94, var68, var76);
               var6.a(var80, (double)(var3 + 0), var96, var70, var76);
               var6.a(var80, (double)(var3 + 1), var96, var70, var72);
               var6.a(var80, (double)(var3 + 1), var96, var68, var72);
               var6.a(var80, (double)(var3 + 0), var96, var68, var76);
               var6.a(var80, (double)(var3 + 0), var94, var70, var76);
               var6.a(var80, (double)(var3 + 1), var94, var70, var72);
            }

            if (var102 || var3 < var5 - 1 && this.o.a(var2 + 1, var3 + 1, var4)) {
               var6.a(var80, (double)(var3 + 1) + 0.01D, var96, var70, var72);
               var6.a(var82, (double)(var3 + 1) + 0.01D, var96, var70, var74);
               var6.a(var82, (double)(var3 + 1) + 0.01D, var94, var68, var74);
               var6.a(var80, (double)(var3 + 1) + 0.01D, var94, var68, var72);
               var6.a(var82, (double)(var3 + 1) + 0.01D, var96, var70, var72);
               var6.a(var80, (double)(var3 + 1) + 0.01D, var96, var70, var74);
               var6.a(var80, (double)(var3 + 1) + 0.01D, var94, var68, var74);
               var6.a(var82, (double)(var3 + 1) + 0.01D, var94, var68, var72);
            }

            if (var103 || var3 > 1 && this.o.a(var2 + 1, var3 - 1, var4)) {
               var6.a(var80, (double)var3 - 0.01D, var96, var70, var72);
               var6.a(var82, (double)var3 - 0.01D, var96, var70, var74);
               var6.a(var82, (double)var3 - 0.01D, var94, var68, var74);
               var6.a(var80, (double)var3 - 0.01D, var94, var68, var72);
               var6.a(var82, (double)var3 - 0.01D, var96, var70, var72);
               var6.a(var80, (double)var3 - 0.01D, var96, var70, var74);
               var6.a(var80, (double)var3 - 0.01D, var94, var68, var74);
               var6.a(var82, (double)var3 - 0.01D, var94, var68, var72);
            }
         }
      } else {
         var6.a(var78, (double)(var3 + 1), var86, var107, var110);
         var6.a(var78, (double)(var3 + 0), var86, var107, var111);
         var6.a(var82, (double)(var3 + 0), var86, var109, var111);
         var6.a(var82, (double)(var3 + 1), var86, var109, var110);
         var6.a(var82, (double)(var3 + 1), var86, var114, var38);
         var6.a(var82, (double)(var3 + 0), var86, var114, var40);
         var6.a(var78, (double)(var3 + 0), var86, var36, var40);
         var6.a(var78, (double)(var3 + 1), var86, var36, var38);
         if (var102) {
            var6.a(var78, (double)(var3 + 1) + 0.01D, var96, var70, var76);
            var6.a(var82, (double)(var3 + 1) + 0.01D, var96, var70, var72);
            var6.a(var82, (double)(var3 + 1) + 0.01D, var94, var68, var72);
            var6.a(var78, (double)(var3 + 1) + 0.01D, var94, var68, var76);
            var6.a(var82, (double)(var3 + 1) + 0.01D, var96, var70, var76);
            var6.a(var78, (double)(var3 + 1) + 0.01D, var96, var70, var72);
            var6.a(var78, (double)(var3 + 1) + 0.01D, var94, var68, var72);
            var6.a(var82, (double)(var3 + 1) + 0.01D, var94, var68, var76);
         } else {
            if (var3 < var5 - 1 && this.o.a(var2 - 1, var3 + 1, var4)) {
               var6.a(var78, (double)(var3 + 1) + 0.01D, var96, var70, var74);
               var6.a(var80, (double)(var3 + 1) + 0.01D, var96, var70, var76);
               var6.a(var80, (double)(var3 + 1) + 0.01D, var94, var68, var76);
               var6.a(var78, (double)(var3 + 1) + 0.01D, var94, var68, var74);
               var6.a(var80, (double)(var3 + 1) + 0.01D, var96, var70, var74);
               var6.a(var78, (double)(var3 + 1) + 0.01D, var96, var70, var76);
               var6.a(var78, (double)(var3 + 1) + 0.01D, var94, var68, var76);
               var6.a(var80, (double)(var3 + 1) + 0.01D, var94, var68, var74);
            }

            if (var3 < var5 - 1 && this.o.a(var2 + 1, var3 + 1, var4)) {
               var6.a(var80, (double)(var3 + 1) + 0.01D, var96, var70, var72);
               var6.a(var82, (double)(var3 + 1) + 0.01D, var96, var70, var74);
               var6.a(var82, (double)(var3 + 1) + 0.01D, var94, var68, var74);
               var6.a(var80, (double)(var3 + 1) + 0.01D, var94, var68, var72);
               var6.a(var82, (double)(var3 + 1) + 0.01D, var96, var70, var72);
               var6.a(var80, (double)(var3 + 1) + 0.01D, var96, var70, var74);
               var6.a(var80, (double)(var3 + 1) + 0.01D, var94, var68, var74);
               var6.a(var82, (double)(var3 + 1) + 0.01D, var94, var68, var72);
            }
         }

         if (var103) {
            var6.a(var78, (double)var3 - 0.01D, var96, var70, var76);
            var6.a(var82, (double)var3 - 0.01D, var96, var70, var72);
            var6.a(var82, (double)var3 - 0.01D, var94, var68, var72);
            var6.a(var78, (double)var3 - 0.01D, var94, var68, var76);
            var6.a(var82, (double)var3 - 0.01D, var96, var70, var76);
            var6.a(var78, (double)var3 - 0.01D, var96, var70, var72);
            var6.a(var78, (double)var3 - 0.01D, var94, var68, var72);
            var6.a(var82, (double)var3 - 0.01D, var94, var68, var76);
         } else {
            if (var3 > 1 && this.o.a(var2 - 1, var3 - 1, var4)) {
               var6.a(var78, (double)var3 - 0.01D, var96, var70, var74);
               var6.a(var80, (double)var3 - 0.01D, var96, var70, var76);
               var6.a(var80, (double)var3 - 0.01D, var94, var68, var76);
               var6.a(var78, (double)var3 - 0.01D, var94, var68, var74);
               var6.a(var80, (double)var3 - 0.01D, var96, var70, var74);
               var6.a(var78, (double)var3 - 0.01D, var96, var70, var76);
               var6.a(var78, (double)var3 - 0.01D, var94, var68, var76);
               var6.a(var80, (double)var3 - 0.01D, var94, var68, var74);
            }

            if (var3 > 1 && this.o.a(var2 + 1, var3 - 1, var4)) {
               var6.a(var80, (double)var3 - 0.01D, var96, var70, var72);
               var6.a(var82, (double)var3 - 0.01D, var96, var70, var74);
               var6.a(var82, (double)var3 - 0.01D, var94, var68, var74);
               var6.a(var80, (double)var3 - 0.01D, var94, var68, var72);
               var6.a(var82, (double)var3 - 0.01D, var96, var70, var72);
               var6.a(var80, (double)var3 - 0.01D, var96, var70, var74);
               var6.a(var80, (double)var3 - 0.01D, var94, var68, var74);
               var6.a(var82, (double)var3 - 0.01D, var94, var68, var72);
            }
         }
      }

      if ((!var98 || !var99) && (var100 || var101 || var98 || var99)) {
         if (var98 && !var99) {
            var6.a(var80, (double)(var3 + 1), var84, var44, var50);
            var6.a(var80, (double)(var3 + 0), var84, var44, var52);
            var6.a(var80, (double)(var3 + 0), var86, var46, var52);
            var6.a(var80, (double)(var3 + 1), var86, var46, var50);
            var6.a(var80, (double)(var3 + 1), var86, var58, var62);
            var6.a(var80, (double)(var3 + 0), var86, var58, var64);
            var6.a(var80, (double)(var3 + 0), var84, var60, var64);
            var6.a(var80, (double)(var3 + 1), var84, var60, var62);
            if (!var101 && !var100) {
               var6.a(var90, (double)(var3 + 1), var86, var68, var72);
               var6.a(var90, (double)(var3 + 0), var86, var68, var76);
               var6.a(var92, (double)(var3 + 0), var86, var70, var76);
               var6.a(var92, (double)(var3 + 1), var86, var70, var72);
               var6.a(var92, (double)(var3 + 1), var86, var68, var72);
               var6.a(var92, (double)(var3 + 0), var86, var68, var76);
               var6.a(var90, (double)(var3 + 0), var86, var70, var76);
               var6.a(var90, (double)(var3 + 1), var86, var70, var72);
            }

            if (var102 || var3 < var5 - 1 && this.o.a(var2, var3 + 1, var4 - 1)) {
               var6.a(var90, (double)(var3 + 1) + 0.005D, var84, var70, var72);
               var6.a(var90, (double)(var3 + 1) + 0.005D, var86, var70, var74);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var86, var68, var74);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var84, var68, var72);
               var6.a(var90, (double)(var3 + 1) + 0.005D, var86, var70, var72);
               var6.a(var90, (double)(var3 + 1) + 0.005D, var84, var70, var74);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var84, var68, var74);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var86, var68, var72);
            }

            if (var103 || var3 > 1 && this.o.a(var2, var3 - 1, var4 - 1)) {
               var6.a(var90, (double)var3 - 0.005D, var84, var70, var72);
               var6.a(var90, (double)var3 - 0.005D, var86, var70, var74);
               var6.a(var92, (double)var3 - 0.005D, var86, var68, var74);
               var6.a(var92, (double)var3 - 0.005D, var84, var68, var72);
               var6.a(var90, (double)var3 - 0.005D, var86, var70, var72);
               var6.a(var90, (double)var3 - 0.005D, var84, var70, var74);
               var6.a(var92, (double)var3 - 0.005D, var84, var68, var74);
               var6.a(var92, (double)var3 - 0.005D, var86, var68, var72);
            }
         } else if (!var98 && var99) {
            var6.a(var80, (double)(var3 + 1), var86, var46, var50);
            var6.a(var80, (double)(var3 + 0), var86, var46, var52);
            var6.a(var80, (double)(var3 + 0), var88, var48, var52);
            var6.a(var80, (double)(var3 + 1), var88, var48, var50);
            var6.a(var80, (double)(var3 + 1), var88, var56, var62);
            var6.a(var80, (double)(var3 + 0), var88, var56, var64);
            var6.a(var80, (double)(var3 + 0), var86, var58, var64);
            var6.a(var80, (double)(var3 + 1), var86, var58, var62);
            if (!var101 && !var100) {
               var6.a(var92, (double)(var3 + 1), var86, var68, var72);
               var6.a(var92, (double)(var3 + 0), var86, var68, var76);
               var6.a(var90, (double)(var3 + 0), var86, var70, var76);
               var6.a(var90, (double)(var3 + 1), var86, var70, var72);
               var6.a(var90, (double)(var3 + 1), var86, var68, var72);
               var6.a(var90, (double)(var3 + 0), var86, var68, var76);
               var6.a(var92, (double)(var3 + 0), var86, var70, var76);
               var6.a(var92, (double)(var3 + 1), var86, var70, var72);
            }

            if (var102 || var3 < var5 - 1 && this.o.a(var2, var3 + 1, var4 + 1)) {
               var6.a(var90, (double)(var3 + 1) + 0.005D, var86, var68, var74);
               var6.a(var90, (double)(var3 + 1) + 0.005D, var88, var68, var76);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var88, var70, var76);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var86, var70, var74);
               var6.a(var90, (double)(var3 + 1) + 0.005D, var88, var68, var74);
               var6.a(var90, (double)(var3 + 1) + 0.005D, var86, var68, var76);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var86, var70, var76);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var88, var70, var74);
            }

            if (var103 || var3 > 1 && this.o.a(var2, var3 - 1, var4 + 1)) {
               var6.a(var90, (double)var3 - 0.005D, var86, var68, var74);
               var6.a(var90, (double)var3 - 0.005D, var88, var68, var76);
               var6.a(var92, (double)var3 - 0.005D, var88, var70, var76);
               var6.a(var92, (double)var3 - 0.005D, var86, var70, var74);
               var6.a(var90, (double)var3 - 0.005D, var88, var68, var74);
               var6.a(var90, (double)var3 - 0.005D, var86, var68, var76);
               var6.a(var92, (double)var3 - 0.005D, var86, var70, var76);
               var6.a(var92, (double)var3 - 0.005D, var88, var70, var74);
            }
         }
      } else {
         var6.a(var80, (double)(var3 + 1), var88, var56, var62);
         var6.a(var80, (double)(var3 + 0), var88, var56, var64);
         var6.a(var80, (double)(var3 + 0), var84, var60, var64);
         var6.a(var80, (double)(var3 + 1), var84, var60, var62);
         var6.a(var80, (double)(var3 + 1), var84, var44, var50);
         var6.a(var80, (double)(var3 + 0), var84, var44, var52);
         var6.a(var80, (double)(var3 + 0), var88, var48, var52);
         var6.a(var80, (double)(var3 + 1), var88, var48, var50);
         if (var102) {
            var6.a(var92, (double)(var3 + 1) + 0.005D, var88, var70, var76);
            var6.a(var92, (double)(var3 + 1) + 0.005D, var84, var70, var72);
            var6.a(var90, (double)(var3 + 1) + 0.005D, var84, var68, var72);
            var6.a(var90, (double)(var3 + 1) + 0.005D, var88, var68, var76);
            var6.a(var92, (double)(var3 + 1) + 0.005D, var84, var70, var76);
            var6.a(var92, (double)(var3 + 1) + 0.005D, var88, var70, var72);
            var6.a(var90, (double)(var3 + 1) + 0.005D, var88, var68, var72);
            var6.a(var90, (double)(var3 + 1) + 0.005D, var84, var68, var76);
         } else {
            if (var3 < var5 - 1 && this.o.a(var2, var3 + 1, var4 - 1)) {
               var6.a(var90, (double)(var3 + 1) + 0.005D, var84, var70, var72);
               var6.a(var90, (double)(var3 + 1) + 0.005D, var86, var70, var74);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var86, var68, var74);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var84, var68, var72);
               var6.a(var90, (double)(var3 + 1) + 0.005D, var86, var70, var72);
               var6.a(var90, (double)(var3 + 1) + 0.005D, var84, var70, var74);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var84, var68, var74);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var86, var68, var72);
            }

            if (var3 < var5 - 1 && this.o.a(var2, var3 + 1, var4 + 1)) {
               var6.a(var90, (double)(var3 + 1) + 0.005D, var86, var68, var74);
               var6.a(var90, (double)(var3 + 1) + 0.005D, var88, var68, var76);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var88, var70, var76);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var86, var70, var74);
               var6.a(var90, (double)(var3 + 1) + 0.005D, var88, var68, var74);
               var6.a(var90, (double)(var3 + 1) + 0.005D, var86, var68, var76);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var86, var70, var76);
               var6.a(var92, (double)(var3 + 1) + 0.005D, var88, var70, var74);
            }
         }

         if (var103) {
            var6.a(var92, (double)var3 - 0.005D, var88, var70, var76);
            var6.a(var92, (double)var3 - 0.005D, var84, var70, var72);
            var6.a(var90, (double)var3 - 0.005D, var84, var68, var72);
            var6.a(var90, (double)var3 - 0.005D, var88, var68, var76);
            var6.a(var92, (double)var3 - 0.005D, var84, var70, var76);
            var6.a(var92, (double)var3 - 0.005D, var88, var70, var72);
            var6.a(var90, (double)var3 - 0.005D, var88, var68, var72);
            var6.a(var90, (double)var3 - 0.005D, var84, var68, var76);
         } else {
            if (var3 > 1 && this.o.a(var2, var3 - 1, var4 - 1)) {
               var6.a(var90, (double)var3 - 0.005D, var84, var70, var72);
               var6.a(var90, (double)var3 - 0.005D, var86, var70, var74);
               var6.a(var92, (double)var3 - 0.005D, var86, var68, var74);
               var6.a(var92, (double)var3 - 0.005D, var84, var68, var72);
               var6.a(var90, (double)var3 - 0.005D, var86, var70, var72);
               var6.a(var90, (double)var3 - 0.005D, var84, var70, var74);
               var6.a(var92, (double)var3 - 0.005D, var84, var68, var74);
               var6.a(var92, (double)var3 - 0.005D, var86, var68, var72);
            }

            if (var3 > 1 && this.o.a(var2, var3 - 1, var4 + 1)) {
               var6.a(var90, (double)var3 - 0.005D, var86, var68, var74);
               var6.a(var90, (double)var3 - 0.005D, var88, var68, var76);
               var6.a(var92, (double)var3 - 0.005D, var88, var70, var76);
               var6.a(var92, (double)var3 - 0.005D, var86, var70, var74);
               var6.a(var90, (double)var3 - 0.005D, var88, var68, var74);
               var6.a(var90, (double)var3 - 0.005D, var86, var68, var76);
               var6.a(var92, (double)var3 - 0.005D, var86, var70, var76);
               var6.a(var92, (double)var3 - 0.005D, var88, var70, var74);
            }
         }
      }

      if (qs.R() && this.a(var2, var3, var4)) {
         this.a(var2, var3, var4, pa.ca.aF);
      }

      return true;
   }

   public boolean j(pa var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      var5.if(var1.new(this.o, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = ad8.if(var1, this.o, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      if (dh.r) {
         float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
         float var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
         float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
         var8 = var11;
         var9 = var12;
         var10 = var13;
      }

      var5.a(var6 * var8, var6 * var9, var6 * var10);
      double var19 = (double)var2;
      double var20 = (double)var3;
      double var15 = (double)var4;
      if (var1 == pa.b3) {
         long var17 = (long)(var2 * 3129871) ^ (long)var4 * 116129781L ^ (long)var3;
         var17 = var17 * var17 * 42317861L + var17 * 11L;
         var19 += ((double)((float)(var17 >> 16 & 15L) / 15.0F) - 0.5D) * 0.5D;
         var20 += ((double)((float)(var17 >> 20 & 15L) / 15.0F) - 1.0D) * 0.2D;
         var15 += ((double)((float)(var17 >> 24 & 15L) / 15.0F) - 0.5D) * 0.5D;
      }

      this.a(var1, this.o.for(var2, var3, var4), var19, var20, var15, 1.0F);
      if (qs.R() && this.a(var2, var3, var4)) {
         this.a(var2, var3, var4, pa.ca.aF);
      }

      return true;
   }

   public boolean int(pa var1, int var2, int var3, int var4) {
      pj var5 = (pj)var1;
      c4 var6 = c4.G;
      var6.if(var5.new(this.o, var2, var3, var4));
      float var7 = 1.0F;
      int var8 = ad8.a(var5, this.o, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      if (dh.r) {
         float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
         float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
         float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
         var9 = var12;
         var10 = var13;
         var11 = var14;
      }

      var6.a(var7 * var9, var7 * var10, var7 * var11);
      var5.int(this.o, var2, var3, var4);
      int var15 = var5.h(this.o, var2, var3, var4);
      if (var15 < 0) {
         this.a(var5, this.o.for(var2, var3, var4), this.f, (double)var2, (double)((float)var3 - 0.0625F), (double)var4);
      } else {
         this.a(var5, this.o.for(var2, var3, var4), 0.5D, (double)var2, (double)((float)var3 - 0.0625F), (double)var4);
         this.a(var5, this.o.for(var2, var3, var4), var15, this.f, (double)var2, (double)((float)var3 - 0.0625F), (double)var4);
      }

      return true;
   }

   public boolean else(pa var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      var5.if(var1.new(this.o, var2, var3, var4));
      var5.a(1.0F, 1.0F, 1.0F);
      this.a(var1, this.o.for(var2, var3, var4), (double)var2, (double)((float)var3 - 0.0625F), (double)var4);
      return true;
   }

   public void a(pa var1, double var2, double var4, double var6, double var8, double var10, int var12) {
      c4 var13 = c4.G;
      ajd var14 = this.a(var1, 0, var12);
      if (this.if()) {
         var14 = this.l;
      }

      double var15 = (double)var14.a();
      double var17 = (double)var14.int();
      double var19 = (double)var14.byte();
      double var21 = (double)var14.do();
      double var23 = (double)var14.if(7.0D);
      double var25 = (double)var14.a(6.0D);
      double var27 = (double)var14.if(9.0D);
      double var29 = (double)var14.a(8.0D);
      double var31 = (double)var14.if(7.0D);
      double var33 = (double)var14.a(13.0D);
      double var35 = (double)var14.if(9.0D);
      double var37 = (double)var14.a(15.0D);
      var2 += 0.5D;
      var6 += 0.5D;
      double var39 = var2 - 0.5D;
      double var41 = var2 + 0.5D;
      double var43 = var6 - 0.5D;
      double var45 = var6 + 0.5D;
      double var47 = 0.0625D;
      double var49 = 0.625D;
      var13.a(var2 + var8 * (1.0D - var49) - var47, var4 + var49, var6 + var10 * (1.0D - var49) - var47, var23, var25);
      var13.a(var2 + var8 * (1.0D - var49) - var47, var4 + var49, var6 + var10 * (1.0D - var49) + var47, var23, var29);
      var13.a(var2 + var8 * (1.0D - var49) + var47, var4 + var49, var6 + var10 * (1.0D - var49) + var47, var27, var29);
      var13.a(var2 + var8 * (1.0D - var49) + var47, var4 + var49, var6 + var10 * (1.0D - var49) - var47, var27, var25);
      var13.a(var2 + var47 + var8, var4, var6 - var47 + var10, var35, var33);
      var13.a(var2 + var47 + var8, var4, var6 + var47 + var10, var35, var37);
      var13.a(var2 - var47 + var8, var4, var6 + var47 + var10, var31, var37);
      var13.a(var2 - var47 + var8, var4, var6 - var47 + var10, var31, var33);
      var13.a(var2 - var47, var4 + 1.0D, var43, var15, var17);
      var13.a(var2 - var47 + var8, var4 + 0.0D, var43 + var10, var15, var21);
      var13.a(var2 - var47 + var8, var4 + 0.0D, var45 + var10, var19, var21);
      var13.a(var2 - var47, var4 + 1.0D, var45, var19, var17);
      var13.a(var2 + var47, var4 + 1.0D, var45, var15, var17);
      var13.a(var2 + var8 + var47, var4 + 0.0D, var45 + var10, var15, var21);
      var13.a(var2 + var8 + var47, var4 + 0.0D, var43 + var10, var19, var21);
      var13.a(var2 + var47, var4 + 1.0D, var43, var19, var17);
      var13.a(var39, var4 + 1.0D, var6 + var47, var15, var17);
      var13.a(var39 + var8, var4 + 0.0D, var6 + var47 + var10, var15, var21);
      var13.a(var41 + var8, var4 + 0.0D, var6 + var47 + var10, var19, var21);
      var13.a(var41, var4 + 1.0D, var6 + var47, var19, var17);
      var13.a(var41, var4 + 1.0D, var6 - var47, var15, var17);
      var13.a(var41 + var8, var4 + 0.0D, var6 - var47 + var10, var15, var21);
      var13.a(var39 + var8, var4 + 0.0D, var6 - var47 + var10, var19, var21);
      var13.a(var39, var4 + 1.0D, var6 - var47, var19, var17);
   }

   public void a(pa var1, int var2, double var3, double var5, double var7, float var9) {
      c4 var10 = c4.G;
      ajd var11 = this.a(var1, 0, var2);
      if (this.if()) {
         var11 = this.l;
      }

      if (qs.aj() && this.l == null) {
         var11 = e.if(this.o, var1, (int)var3, (int)var5, (int)var7, -1, var11);
      }

      double var12 = (double)var11.a();
      double var14 = (double)var11.int();
      double var16 = (double)var11.byte();
      double var18 = (double)var11.do();
      double var20 = 0.45D * (double)var9;
      double var22 = var3 + 0.5D - var20;
      double var24 = var3 + 0.5D + var20;
      double var26 = var7 + 0.5D - var20;
      double var28 = var7 + 0.5D + var20;
      var10.a(var22, var5 + (double)var9, var26, var12, var14);
      var10.a(var22, var5 + 0.0D, var26, var12, var18);
      var10.a(var24, var5 + 0.0D, var28, var16, var18);
      var10.a(var24, var5 + (double)var9, var28, var16, var14);
      var10.a(var24, var5 + (double)var9, var28, var12, var14);
      var10.a(var24, var5 + 0.0D, var28, var12, var18);
      var10.a(var22, var5 + 0.0D, var26, var16, var18);
      var10.a(var22, var5 + (double)var9, var26, var16, var14);
      var10.a(var22, var5 + (double)var9, var28, var12, var14);
      var10.a(var22, var5 + 0.0D, var28, var12, var18);
      var10.a(var24, var5 + 0.0D, var26, var16, var18);
      var10.a(var24, var5 + (double)var9, var26, var16, var14);
      var10.a(var24, var5 + (double)var9, var26, var12, var14);
      var10.a(var24, var5 + 0.0D, var26, var12, var18);
      var10.a(var22, var5 + 0.0D, var28, var16, var18);
      var10.a(var22, var5 + (double)var9, var28, var16, var14);
   }

   public void a(pa var1, int var2, double var3, double var5, double var7, double var9) {
      c4 var11 = c4.G;
      ajd var12 = this.a(var1, 0, var2);
      if (this.if()) {
         var12 = this.l;
      }

      double var13 = (double)var12.a();
      double var15 = (double)var12.int();
      double var17 = (double)var12.byte();
      double var19 = (double)var12.a(var3 * 16.0D);
      double var21 = var5 + 0.5D - 0.44999998807907104D;
      double var23 = var5 + 0.5D + 0.44999998807907104D;
      double var25 = var9 + 0.5D - 0.44999998807907104D;
      double var27 = var9 + 0.5D + 0.44999998807907104D;
      var11.a(var21, var7 + var3, var25, var13, var15);
      var11.a(var21, var7 + 0.0D, var25, var13, var19);
      var11.a(var23, var7 + 0.0D, var27, var17, var19);
      var11.a(var23, var7 + var3, var27, var17, var15);
      var11.a(var23, var7 + var3, var27, var13, var15);
      var11.a(var23, var7 + 0.0D, var27, var13, var19);
      var11.a(var21, var7 + 0.0D, var25, var17, var19);
      var11.a(var21, var7 + var3, var25, var17, var15);
      var11.a(var21, var7 + var3, var27, var13, var15);
      var11.a(var21, var7 + 0.0D, var27, var13, var19);
      var11.a(var23, var7 + 0.0D, var25, var17, var19);
      var11.a(var23, var7 + var3, var25, var17, var15);
      var11.a(var23, var7 + var3, var25, var13, var15);
      var11.a(var23, var7 + 0.0D, var25, var13, var19);
      var11.a(var21, var7 + 0.0D, var27, var17, var19);
      var11.a(var21, var7 + var3, var27, var17, var15);
   }

   public boolean c(pa var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      ajd var6 = this.a(var1, 1);
      if (this.if()) {
         var6 = this.l;
      }

      if (qs.aj() && this.l == null) {
         var6 = e.if(this.o, var1, var2, var3, var4, -1, var6);
      }

      float var7 = 0.015625F;
      double var8 = (double)var6.a();
      double var10 = (double)var6.int();
      double var12 = (double)var6.byte();
      double var14 = (double)var6.do();
      long var16 = (long)(var2 * 3129871) ^ (long)var4 * 116129781L ^ (long)var3;
      var16 = var16 * var16 * 42317861L + var16 * 11L;
      int var18 = (int)(var16 >> 16 & 3L);
      var5.if(var1.new(this.o, var2, var3, var4));
      float var19 = (float)var2 + 0.5F;
      float var20 = (float)var4 + 0.5F;
      float var21 = (float)(var18 & 1) * 0.5F * (float)(1 - var18 / 2 % 2 * 2);
      float var22 = (float)(var18 + 1 & 1) * 0.5F * (float)(1 - (var18 + 1) / 2 % 2 * 2);
      int var23 = ad8.a();
      var5.a(var23);
      var5.a((double)(var19 + var21 - var22), (double)((float)var3 + var7), (double)(var20 + var21 + var22), var8, var10);
      var5.a((double)(var19 + var21 + var22), (double)((float)var3 + var7), (double)(var20 - var21 + var22), var12, var10);
      var5.a((double)(var19 - var21 + var22), (double)((float)var3 + var7), (double)(var20 - var21 - var22), var12, var14);
      var5.a((double)(var19 - var21 - var22), (double)((float)var3 + var7), (double)(var20 + var21 - var22), var8, var14);
      var5.a((var23 & 16711422) >> 1);
      var5.a((double)(var19 - var21 - var22), (double)((float)var3 + var7), (double)(var20 + var21 - var22), var8, var14);
      var5.a((double)(var19 - var21 + var22), (double)((float)var3 + var7), (double)(var20 - var21 - var22), var12, var14);
      var5.a((double)(var19 + var21 + var22), (double)((float)var3 + var7), (double)(var20 - var21 + var22), var12, var10);
      var5.a((double)(var19 + var21 - var22), (double)((float)var3 + var7), (double)(var20 + var21 + var22), var8, var10);
      return true;
   }

   public void a(pj var1, int var2, int var3, double var4, double var6, double var8, double var10) {
      c4 var12 = c4.G;
      ajd var13 = var1.B();
      if (this.if()) {
         var13 = this.l;
      }

      double var14 = (double)var13.a();
      double var16 = (double)var13.int();
      double var18 = (double)var13.byte();
      double var20 = (double)var13.do();
      double var22 = var6 + 0.5D - 0.5D;
      double var24 = var6 + 0.5D + 0.5D;
      double var26 = var10 + 0.5D - 0.5D;
      double var28 = var10 + 0.5D + 0.5D;
      double var30 = var6 + 0.5D;
      double var32 = var10 + 0.5D;
      if ((var3 + 1) / 2 % 2 == 1) {
         double var34 = var18;
         var18 = var14;
         var14 = var34;
      }

      if (var3 < 2) {
         var12.a(var22, var8 + var4, var32, var14, var16);
         var12.a(var22, var8 + 0.0D, var32, var14, var20);
         var12.a(var24, var8 + 0.0D, var32, var18, var20);
         var12.a(var24, var8 + var4, var32, var18, var16);
         var12.a(var24, var8 + var4, var32, var18, var16);
         var12.a(var24, var8 + 0.0D, var32, var18, var20);
         var12.a(var22, var8 + 0.0D, var32, var14, var20);
         var12.a(var22, var8 + var4, var32, var14, var16);
      } else {
         var12.a(var30, var8 + var4, var28, var14, var16);
         var12.a(var30, var8 + 0.0D, var28, var14, var20);
         var12.a(var30, var8 + 0.0D, var26, var18, var20);
         var12.a(var30, var8 + var4, var26, var18, var16);
         var12.a(var30, var8 + var4, var26, var18, var16);
         var12.a(var30, var8 + 0.0D, var26, var18, var20);
         var12.a(var30, var8 + 0.0D, var28, var14, var20);
         var12.a(var30, var8 + var4, var28, var14, var16);
      }

   }

   public void a(pa var1, int var2, double var3, double var5, double var7) {
      c4 var9 = c4.G;
      ajd var10 = this.a(var1, 0, var2);
      if (this.if()) {
         var10 = this.l;
      }

      double var11 = (double)var10.a();
      double var13 = (double)var10.int();
      double var15 = (double)var10.byte();
      double var17 = (double)var10.do();
      double var19 = var3 + 0.5D - 0.25D;
      double var21 = var3 + 0.5D + 0.25D;
      double var23 = var7 + 0.5D - 0.5D;
      double var25 = var7 + 0.5D + 0.5D;
      var9.a(var19, var5 + 1.0D, var23, var11, var13);
      var9.a(var19, var5 + 0.0D, var23, var11, var17);
      var9.a(var19, var5 + 0.0D, var25, var15, var17);
      var9.a(var19, var5 + 1.0D, var25, var15, var13);
      var9.a(var19, var5 + 1.0D, var25, var11, var13);
      var9.a(var19, var5 + 0.0D, var25, var11, var17);
      var9.a(var19, var5 + 0.0D, var23, var15, var17);
      var9.a(var19, var5 + 1.0D, var23, var15, var13);
      var9.a(var21, var5 + 1.0D, var25, var11, var13);
      var9.a(var21, var5 + 0.0D, var25, var11, var17);
      var9.a(var21, var5 + 0.0D, var23, var15, var17);
      var9.a(var21, var5 + 1.0D, var23, var15, var13);
      var9.a(var21, var5 + 1.0D, var23, var11, var13);
      var9.a(var21, var5 + 0.0D, var23, var11, var17);
      var9.a(var21, var5 + 0.0D, var25, var15, var17);
      var9.a(var21, var5 + 1.0D, var25, var15, var13);
      var19 = var3 + 0.5D - 0.5D;
      var21 = var3 + 0.5D + 0.5D;
      var23 = var7 + 0.5D - 0.25D;
      var25 = var7 + 0.5D + 0.25D;
      var9.a(var19, var5 + 1.0D, var23, var11, var13);
      var9.a(var19, var5 + 0.0D, var23, var11, var17);
      var9.a(var21, var5 + 0.0D, var23, var15, var17);
      var9.a(var21, var5 + 1.0D, var23, var15, var13);
      var9.a(var21, var5 + 1.0D, var23, var11, var13);
      var9.a(var21, var5 + 0.0D, var23, var11, var17);
      var9.a(var19, var5 + 0.0D, var23, var15, var17);
      var9.a(var19, var5 + 1.0D, var23, var15, var13);
      var9.a(var21, var5 + 1.0D, var25, var11, var13);
      var9.a(var21, var5 + 0.0D, var25, var11, var17);
      var9.a(var19, var5 + 0.0D, var25, var15, var17);
      var9.a(var19, var5 + 1.0D, var25, var15, var13);
      var9.a(var19, var5 + 1.0D, var25, var11, var13);
      var9.a(var19, var5 + 0.0D, var25, var11, var17);
      var9.a(var21, var5 + 0.0D, var25, var15, var17);
      var9.a(var21, var5 + 1.0D, var25, var15, var13);
   }

   public boolean i(pa var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      int var6 = ad8.a(var1, this.o, var2, var3, var4);
      float var7 = (float)(var6 >> 16 & 255) / 255.0F;
      float var8 = (float)(var6 >> 8 & 255) / 255.0F;
      float var9 = (float)(var6 & 255) / 255.0F;
      boolean var10 = var1.int((yy)this.o, var2, var3 + 1, var4, 1);
      boolean var11 = var1.int((yy)this.o, var2, var3 - 1, var4, 0);
      boolean[] var12 = new boolean[]{var1.int((yy)this.o, var2, var3, var4 - 1, 2), var1.int((yy)this.o, var2, var3, var4 + 1, 3), var1.int((yy)this.o, var2 - 1, var3, var4, 4), var1.int((yy)this.o, var2 + 1, var3, var4, 5)};
      if (!var10 && !var11 && !var12[0] && !var12[1] && !var12[2] && !var12[3]) {
         return false;
      } else {
         boolean var13 = false;
         float var14 = 0.5F;
         float var15 = 1.0F;
         float var16 = 0.8F;
         float var17 = 0.6F;
         double var18 = 0.0D;
         double var20 = 1.0D;
         ts var22 = var1.at;
         int var23 = this.o.for(var2, var3, var4);
         double var24 = (double)this.a(var2, var3, var4, var22);
         double var26 = (double)this.a(var2, var3, var4 + 1, var22);
         double var28 = (double)this.a(var2 + 1, var3, var4 + 1, var22);
         double var30 = (double)this.a(var2 + 1, var3, var4, var22);
         double var32 = 0.0010000000474974513D;
         float var34;
         float var35;
         double var36;
         double var38;
         double var40;
         double var42;
         double var44;
         double var46;
         if (this.j || var10) {
            var13 = true;
            ajd var48 = this.a(var1, 1, var23);
            float var49 = (float)qn.a(this.o, var2, var3, var4, var22);
            if (var49 > -999.0F) {
               var48 = this.a(var1, 2, var23);
            }

            var24 -= var32;
            var26 -= var32;
            var28 -= var32;
            var30 -= var32;
            double var50;
            double var52;
            if (var49 < -999.0F) {
               var38 = (double)var48.if(0.0D);
               var46 = (double)var48.a(0.0D);
               var50 = var38;
               var40 = (double)var48.a(16.0D);
               var42 = (double)var48.if(16.0D);
               var52 = var40;
               var36 = var42;
               var44 = var46;
            } else {
               var35 = ajs.try(var49) * 0.25F;
               var34 = ajs.for(var49) * 0.25F;
               var38 = (double)var48.if((double)(8.0F + (-var34 - var35) * 16.0F));
               var46 = (double)var48.a((double)(8.0F + (-var34 + var35) * 16.0F));
               var50 = (double)var48.if((double)(8.0F + (-var34 + var35) * 16.0F));
               var40 = (double)var48.a((double)(8.0F + (var34 + var35) * 16.0F));
               var42 = (double)var48.if((double)(8.0F + (var34 + var35) * 16.0F));
               var52 = (double)var48.a((double)(8.0F + (var34 - var35) * 16.0F));
               var36 = (double)var48.if((double)(8.0F + (var34 - var35) * 16.0F));
               var44 = (double)var48.a((double)(8.0F + (-var34 - var35) * 16.0F));
            }

            var5.if(var1.new(this.o, var2, var3, var4));
            var35 = 1.0F;
            var5.a(var15 * var35 * var7, var15 * var35 * var8, var15 * var35 * var9);
            double var54 = 3.90625E-5D;
            var5.a((double)(var2 + 0), (double)var3 + var24, (double)(var4 + 0), var38 + var54, var46 + var54);
            var5.a((double)(var2 + 0), (double)var3 + var26, (double)(var4 + 1), var50 + var54, var40 - var54);
            var5.a((double)(var2 + 1), (double)var3 + var28, (double)(var4 + 1), var42 - var54, var52 - var54);
            var5.a((double)(var2 + 1), (double)var3 + var30, (double)(var4 + 0), var36 - var54, var44 + var54);
         }

         if (this.j || var11) {
            var5.if(var1.new(this.o, var2, var3 - 1, var4));
            float var56 = 1.0F;
            var5.a(var14 * var56 * var7, var14 * var56 * var8, var14 * var56 * var9);
            this.do(var1, (double)var2, (double)var3 + var32, (double)var4, this.a(var1, 0));
            var13 = true;
         }

         for(int var58 = 0; var58 < 4; ++var58) {
            int var57 = var2;
            int var59 = var4;
            if (var58 == 0) {
               var59 = var4 - 1;
            }

            if (var58 == 1) {
               ++var59;
            }

            if (var58 == 2) {
               var57 = var2 - 1;
            }

            if (var58 == 3) {
               ++var57;
            }

            ajd var51 = this.a(var1, var58 + 2, var23);
            if (this.j || var12[var58]) {
               if (var58 == 0) {
                  var38 = var24;
                  var42 = var30;
                  var36 = (double)var2;
                  var40 = (double)(var2 + 1);
                  var46 = (double)var4 + var32;
                  var44 = (double)var4 + var32;
               } else if (var58 == 1) {
                  var38 = var28;
                  var42 = var26;
                  var36 = (double)(var2 + 1);
                  var40 = (double)var2;
                  var46 = (double)(var4 + 1) - var32;
                  var44 = (double)(var4 + 1) - var32;
               } else if (var58 == 2) {
                  var38 = var26;
                  var42 = var24;
                  var36 = (double)var2 + var32;
                  var40 = (double)var2 + var32;
                  var46 = (double)(var4 + 1);
                  var44 = (double)var4;
               } else {
                  var38 = var30;
                  var42 = var28;
                  var36 = (double)(var2 + 1) - var32;
                  var40 = (double)(var2 + 1) - var32;
                  var46 = (double)var4;
                  var44 = (double)(var4 + 1);
               }

               var13 = true;
               float var60 = var51.if(0.0D);
               var35 = var51.if(8.0D);
               var34 = var51.a((1.0D - var38) * 16.0D * 0.5D);
               float var53 = var51.a((1.0D - var42) * 16.0D * 0.5D);
               float var61 = var51.a(8.0D);
               var5.if(var1.new(this.o, var57, var3, var59));
               float var55 = 1.0F;
               if (var58 < 2) {
                  var55 *= var16;
               } else {
                  var55 *= var17;
               }

               var5.a(var15 * var55 * var7, var15 * var55 * var8, var15 * var55 * var9);
               var5.a(var36, (double)var3 + var38, var46, (double)var60, (double)var34);
               var5.a(var40, (double)var3 + var42, var44, (double)var35, (double)var53);
               var5.a(var40, (double)(var3 + 0), var44, (double)var35, (double)var61);
               var5.a(var36, (double)(var3 + 0), var46, (double)var60, (double)var61);
            }
         }

         this.g = var18;
         this.f = var20;
         return var13;
      }
   }

   public float a(int var1, int var2, int var3, ts var4) {
      int var5 = 0;
      float var6 = 0.0F;

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var1 - (var7 & 1);
         int var9 = var3 - (var7 >> 1 & 1);
         if (this.o.byte(var8, var2 + 1, var9) == var4) {
            return 1.0F;
         }

         ts var10 = this.o.byte(var8, var2, var9);
         if (var10 != var4) {
            if (!var10.for()) {
               ++var6;
               ++var5;
            }
         } else {
            int var11 = this.o.for(var8, var2, var9);
            if (var11 >= 8 || var11 == 0) {
               var6 += qn.i(var11) * 10.0F;
               var5 += 10;
            }

            var6 += qn.i(var11);
            ++var5;
         }
      }

      return 1.0F - var6 / (float)var5;
   }

   public void a(pa var1, y6 var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.5F;
      float var8 = 1.0F;
      float var9 = 0.8F;
      float var10 = 0.6F;
      c4 var11 = c4.G;
      var11.if();
      var11.if(var1.new((yy)var2, var3, var4, var5));
      float var12 = 1.0F;
      float var13 = 1.0F;
      if (var13 < var12) {
         var13 = var12;
      }

      var11.a(var7 * var13, var7 * var13, var7 * var13);
      this.do(var1, -0.5D, -0.5D, -0.5D, this.a(var1, 0, var6));
      var13 = 1.0F;
      if (var13 < var12) {
         var13 = var12;
      }

      var11.a(var8 * var13, var8 * var13, var8 * var13);
      this.if(var1, -0.5D, -0.5D, -0.5D, this.a(var1, 1, var6));
      var13 = 1.0F;
      if (var13 < var12) {
         var13 = var12;
      }

      var11.a(var9 * var13, var9 * var13, var9 * var13);
      this.a(var1, -0.5D, -0.5D, -0.5D, this.a(var1, 2, var6));
      var13 = 1.0F;
      if (var13 < var12) {
         var13 = var12;
      }

      var11.a(var9 * var13, var9 * var13, var9 * var13);
      this.new(var1, -0.5D, -0.5D, -0.5D, this.a(var1, 3, var6));
      var13 = 1.0F;
      if (var13 < var12) {
         var13 = var12;
      }

      var11.a(var10 * var13, var10 * var13, var10 * var13);
      this.int(var1, -0.5D, -0.5D, -0.5D, this.a(var1, 4, var6));
      var13 = 1.0F;
      if (var13 < var12) {
         var13 = var12;
      }

      var11.a(var10 * var13, var10 * var13, var10 * var13);
      this.for(var1, -0.5D, -0.5D, -0.5D, this.a(var1, 5, var6));
      var11.for();
   }

   public boolean for(pa var1, int var2, int var3, int var4) {
      int var5 = ad8.if(var1, this.o, var2, var3, var4);
      float var6 = (float)(var5 >> 16 & 255) / 255.0F;
      float var7 = (float)(var5 >> 8 & 255) / 255.0F;
      float var8 = (float)(var5 & 255) / 255.0F;
      if (dh.r) {
         float var9 = (var6 * 30.0F + var7 * 59.0F + var8 * 11.0F) / 100.0F;
         float var10 = (var6 * 30.0F + var7 * 70.0F) / 100.0F;
         float var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
         var6 = var9;
         var7 = var10;
         var8 = var11;
      }

      return Minecraft.hP() && pa.o[var1.void] == 0 ? (this.b ? this.for(var1, var2, var3, var4, var6, var7, var8) : this.a(var1, var2, var3, var4, var6, var7, var8)) : this.do(var1, var2, var3, var4, var6, var7, var8);
   }

   public boolean char(pa var1, int var2, int var3, int var4) {
      int var5 = this.o.for(var2, var3, var4);
      int var6 = var5 & 12;
      if (var6 == 4) {
         this.long = 1;
         this.goto = 1;
         this.case = 1;
         this.byte = 1;
      } else if (var6 == 8) {
         this.else = 1;
         this.char = 1;
      }

      boolean var7 = this.for(var1, var2, var3, var4);
      this.else = 0;
      this.long = 0;
      this.goto = 0;
      this.char = 0;
      this.case = 0;
      this.byte = 0;
      return var7;
   }

   public boolean b(pa var1, int var2, int var3, int var4) {
      int var5 = this.o.for(var2, var3, var4);
      if (var5 == 3) {
         this.long = 1;
         this.goto = 1;
         this.case = 1;
         this.byte = 1;
      } else if (var5 == 4) {
         this.else = 1;
         this.char = 1;
      }

      boolean var6 = this.for(var1, var2, var3, var4);
      this.else = 0;
      this.long = 0;
      this.goto = 0;
      this.char = 0;
      this.case = 0;
      this.byte = 0;
      return var6;
   }

   public boolean a(pa var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      this.try = true;
      boolean var8 = c4.G.g;
      boolean var9 = qs.Y() && var8;
      boolean var10 = false;
      float var11 = 0.0F;
      float var12 = 0.0F;
      float var13 = 0.0F;
      float var14 = 0.0F;
      boolean var15 = true;
      int var16 = var1.new(this.o, var2, var3, var4);
      c4 var17 = c4.G;
      var17.if(983055);
      if (this.a(var1).if().equals("grass_top")) {
         var15 = false;
      } else if (this.if()) {
         var15 = false;
      }

      boolean var18;
      boolean var19;
      boolean var20;
      boolean var21;
      int var22;
      float var23;
      if (this.j || var1.int((yy)this.o, var2, var3 - 1, var4, 0)) {
         if (this.g <= 0.0D) {
            --var3;
         }

         this.x = var1.new(this.o, var2 - 1, var3, var4);
         this.v = var1.new(this.o, var2, var3, var4 - 1);
         this.u = var1.new(this.o, var2, var3, var4 + 1);
         this.s = var1.new(this.o, var2 + 1, var3, var4);
         this.int = var1.for(this.o, var2 - 1, var3, var4);
         this.do = var1.for(this.o, var2, var3, var4 - 1);
         this.W = var1.for(this.o, var2, var3, var4 + 1);
         this.T = var1.for(this.o, var2 + 1, var3, var4);
         var18 = pa.r[this.o.new(var2 + 1, var3 - 1, var4)];
         var19 = pa.r[this.o.new(var2 - 1, var3 - 1, var4)];
         var20 = pa.r[this.o.new(var2, var3 - 1, var4 + 1)];
         var21 = pa.r[this.o.new(var2, var3 - 1, var4 - 1)];
         if (!var21 && !var19) {
            this.new = this.int;
            this.y = this.x;
         } else {
            this.new = var1.for(this.o, var2 - 1, var3, var4 - 1);
            this.y = var1.new(this.o, var2 - 1, var3, var4 - 1);
         }

         if (!var20 && !var19) {
            this.for = this.int;
            this.w = this.x;
         } else {
            this.for = var1.for(this.o, var2 - 1, var3, var4 + 1);
            this.w = var1.new(this.o, var2 - 1, var3, var4 + 1);
         }

         if (!var21 && !var18) {
            this.V = this.T;
            this.t = this.s;
         } else {
            this.V = var1.for(this.o, var2 + 1, var3, var4 - 1);
            this.t = var1.new(this.o, var2 + 1, var3, var4 - 1);
         }

         if (!var20 && !var18) {
            this.R = this.T;
            this.r = this.s;
         } else {
            this.R = var1.for(this.o, var2 + 1, var3, var4 + 1);
            this.r = var1.new(this.o, var2 + 1, var3, var4 + 1);
         }

         if (this.g <= 0.0D) {
            ++var3;
         }

         var22 = var16;
         if (this.g <= 0.0D || !this.o.do(var2, var3 - 1, var4)) {
            var22 = var1.new(this.o, var2, var3 - 1, var4);
         }

         var23 = var1.for(this.o, var2, var3 - 1, var4);
         var11 = (this.for + this.int + this.W + var23) / 4.0F;
         var14 = (this.W + var23 + this.R + this.T) / 4.0F;
         var13 = (var23 + this.do + this.T + this.V) / 4.0F;
         var12 = (this.int + this.new + var23 + this.do) / 4.0F;
         this.af = this.a(this.w, this.x, this.u, var22);
         this.ac = this.a(this.u, this.r, this.s, var22);
         this.ad = this.a(this.v, this.s, this.t, var22);
         this.ae = this.a(this.x, this.y, this.v, var22);
         if (var15) {
            this.ab = this.aa = this.Z = this.X = var5 * 0.5F;
            this.U = this.S = this.Q = this.O = var6 * 0.5F;
            this.M = this.K = this.I = this.G = var7 * 0.5F;
         } else {
            this.ab = this.aa = this.Z = this.X = 0.5F;
            this.U = this.S = this.Q = this.O = 0.5F;
            this.M = this.K = this.I = this.G = 0.5F;
         }

         this.ab *= var11;
         this.U *= var11;
         this.M *= var11;
         this.aa *= var12;
         this.S *= var12;
         this.K *= var12;
         this.Z *= var13;
         this.Q *= var13;
         this.I *= var13;
         this.X *= var14;
         this.O *= var14;
         this.G *= var14;
         this.do(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 0));
         var10 = true;
      }

      if (this.j || var1.int((yy)this.o, var2, var3 + 1, var4, 1)) {
         if (this.f >= 1.0D) {
            ++var3;
         }

         this.p = var1.new(this.o, var2 - 1, var3, var4);
         this.am = var1.new(this.o, var2 + 1, var3, var4);
         this.ao = var1.new(this.o, var2, var3, var4 - 1);
         this.al = var1.new(this.o, var2, var3, var4 + 1);
         this.N = var1.for(this.o, var2 - 1, var3, var4);
         this.F = var1.for(this.o, var2 + 1, var3, var4);
         this.J = var1.for(this.o, var2, var3, var4 - 1);
         this.E = var1.for(this.o, var2, var3, var4 + 1);
         var18 = pa.r[this.o.new(var2 + 1, var3 + 1, var4)];
         var19 = pa.r[this.o.new(var2 - 1, var3 + 1, var4)];
         var20 = pa.r[this.o.new(var2, var3 + 1, var4 + 1)];
         var21 = pa.r[this.o.new(var2, var3 + 1, var4 - 1)];
         if (!var21 && !var19) {
            this.P = this.N;
            this.q = this.p;
         } else {
            this.P = var1.for(this.o, var2 - 1, var3, var4 - 1);
            this.q = var1.new(this.o, var2 - 1, var3, var4 - 1);
         }

         if (!var21 && !var18) {
            this.H = this.F;
            this.an = this.am;
         } else {
            this.H = var1.for(this.o, var2 + 1, var3, var4 - 1);
            this.an = var1.new(this.o, var2 + 1, var3, var4 - 1);
         }

         if (!var20 && !var19) {
            this.L = this.N;
            this.ap = this.p;
         } else {
            this.L = var1.for(this.o, var2 - 1, var3, var4 + 1);
            this.ap = var1.new(this.o, var2 - 1, var3, var4 + 1);
         }

         if (!var20 && !var18) {
            this.D = this.F;
            this.ak = this.am;
         } else {
            this.D = var1.for(this.o, var2 + 1, var3, var4 + 1);
            this.ak = var1.new(this.o, var2 + 1, var3, var4 + 1);
         }

         if (this.f >= 1.0D) {
            --var3;
         }

         var22 = var16;
         if (this.f >= 1.0D || !this.o.do(var2, var3 + 1, var4)) {
            var22 = var1.new(this.o, var2, var3 + 1, var4);
         }

         var23 = var1.for(this.o, var2, var3 + 1, var4);
         var14 = (this.L + this.N + this.E + var23) / 4.0F;
         var11 = (this.E + var23 + this.D + this.F) / 4.0F;
         var12 = (var23 + this.J + this.F + this.H) / 4.0F;
         var13 = (this.N + this.P + var23 + this.J) / 4.0F;
         this.ac = this.a(this.ap, this.p, this.al, var22);
         this.af = this.a(this.al, this.ak, this.am, var22);
         this.ae = this.a(this.ao, this.am, this.an, var22);
         this.ad = this.a(this.p, this.q, this.ao, var22);
         this.ab = this.aa = this.Z = this.X = var5;
         this.U = this.S = this.Q = this.O = var6;
         this.M = this.K = this.I = this.G = var7;
         this.ab *= var11;
         this.U *= var11;
         this.M *= var11;
         this.aa *= var12;
         this.S *= var12;
         this.K *= var12;
         this.Z *= var13;
         this.Q *= var13;
         this.I *= var13;
         this.X *= var14;
         this.O *= var14;
         this.G *= var14;
         this.if(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 1));
         var10 = true;
      }

      ajd var24;
      if (this.j || var1.int((yy)this.o, var2, var3, var4 - 1, 2)) {
         if (this.e <= 0.0D) {
            --var4;
         }

         this.C = var1.for(this.o, var2 - 1, var3, var4);
         this.do = var1.for(this.o, var2, var3 - 1, var4);
         this.J = var1.for(this.o, var2, var3 + 1, var4);
         this.B = var1.for(this.o, var2 + 1, var3, var4);
         this.aj = var1.new(this.o, var2 - 1, var3, var4);
         this.v = var1.new(this.o, var2, var3 - 1, var4);
         this.ao = var1.new(this.o, var2, var3 + 1, var4);
         this.ai = var1.new(this.o, var2 + 1, var3, var4);
         var18 = pa.r[this.o.new(var2 + 1, var3, var4 - 1)];
         var19 = pa.r[this.o.new(var2 - 1, var3, var4 - 1)];
         var20 = pa.r[this.o.new(var2, var3 + 1, var4 - 1)];
         var21 = pa.r[this.o.new(var2, var3 - 1, var4 - 1)];
         if (!var19 && !var21) {
            this.new = this.C;
            this.y = this.aj;
         } else {
            this.new = var1.for(this.o, var2 - 1, var3 - 1, var4);
            this.y = var1.new(this.o, var2 - 1, var3 - 1, var4);
         }

         if (!var19 && !var20) {
            this.P = this.C;
            this.q = this.aj;
         } else {
            this.P = var1.for(this.o, var2 - 1, var3 + 1, var4);
            this.q = var1.new(this.o, var2 - 1, var3 + 1, var4);
         }

         if (!var18 && !var21) {
            this.V = this.B;
            this.t = this.ai;
         } else {
            this.V = var1.for(this.o, var2 + 1, var3 - 1, var4);
            this.t = var1.new(this.o, var2 + 1, var3 - 1, var4);
         }

         if (!var18 && !var20) {
            this.H = this.B;
            this.an = this.ai;
         } else {
            this.H = var1.for(this.o, var2 + 1, var3 + 1, var4);
            this.an = var1.new(this.o, var2 + 1, var3 + 1, var4);
         }

         if (this.e <= 0.0D) {
            ++var4;
         }

         var22 = var16;
         if (this.e <= 0.0D || !this.o.do(var2, var3, var4 - 1)) {
            var22 = var1.new(this.o, var2, var3, var4 - 1);
         }

         var23 = var1.for(this.o, var2, var3, var4 - 1);
         var11 = (this.C + this.P + var23 + this.J) / 4.0F;
         var12 = (var23 + this.J + this.B + this.H) / 4.0F;
         var13 = (this.do + var23 + this.V + this.B) / 4.0F;
         var14 = (this.new + this.C + this.do + var23) / 4.0F;
         this.af = this.a(this.aj, this.q, this.ao, var22);
         this.ae = this.a(this.ao, this.ai, this.an, var22);
         this.ad = this.a(this.v, this.t, this.ai, var22);
         this.ac = this.a(this.y, this.aj, this.v, var22);
         if (var15) {
            this.ab = this.aa = this.Z = this.X = var5 * 0.8F;
            this.U = this.S = this.Q = this.O = var6 * 0.8F;
            this.M = this.K = this.I = this.G = var7 * 0.8F;
         } else {
            this.ab = this.aa = this.Z = this.X = 0.8F;
            this.U = this.S = this.Q = this.O = 0.8F;
            this.M = this.K = this.I = this.G = 0.8F;
         }

         this.ab *= var11;
         this.U *= var11;
         this.M *= var11;
         this.aa *= var12;
         this.S *= var12;
         this.K *= var12;
         this.Z *= var13;
         this.Q *= var13;
         this.I *= var13;
         this.X *= var14;
         this.O *= var14;
         this.G *= var14;
         var24 = this.a(var1, (yy)this.o, var2, var3, var4, 2);
         if (var9) {
            var24 = this.a(var24, var2, var3, var4, 2, var5, var6, var7);
         }

         this.a(var1, (double)var2, (double)var3, (double)var4, var24);
         if (var8 && n && var24.if().equals("grass_side") && !this.if()) {
            this.ab *= var5;
            this.aa *= var5;
            this.Z *= var5;
            this.X *= var5;
            this.U *= var6;
            this.S *= var6;
            this.Q *= var6;
            this.O *= var6;
            this.M *= var7;
            this.K *= var7;
            this.I *= var7;
            this.G *= var7;
            this.a(var1, (double)var2, (double)var3, (double)var4, q2.v());
         }

         var10 = true;
      }

      if (this.j || var1.int((yy)this.o, var2, var3, var4 + 1, 3)) {
         if (this.d >= 1.0D) {
            ++var4;
         }

         this.A = var1.for(this.o, var2 - 1, var3, var4);
         this.z = var1.for(this.o, var2 + 1, var3, var4);
         this.W = var1.for(this.o, var2, var3 - 1, var4);
         this.E = var1.for(this.o, var2, var3 + 1, var4);
         this.ah = var1.new(this.o, var2 - 1, var3, var4);
         this.ag = var1.new(this.o, var2 + 1, var3, var4);
         this.u = var1.new(this.o, var2, var3 - 1, var4);
         this.al = var1.new(this.o, var2, var3 + 1, var4);
         var18 = pa.r[this.o.new(var2 + 1, var3, var4 + 1)];
         var19 = pa.r[this.o.new(var2 - 1, var3, var4 + 1)];
         var20 = pa.r[this.o.new(var2, var3 + 1, var4 + 1)];
         var21 = pa.r[this.o.new(var2, var3 - 1, var4 + 1)];
         if (!var19 && !var21) {
            this.for = this.A;
            this.w = this.ah;
         } else {
            this.for = var1.for(this.o, var2 - 1, var3 - 1, var4);
            this.w = var1.new(this.o, var2 - 1, var3 - 1, var4);
         }

         if (!var19 && !var20) {
            this.L = this.A;
            this.ap = this.ah;
         } else {
            this.L = var1.for(this.o, var2 - 1, var3 + 1, var4);
            this.ap = var1.new(this.o, var2 - 1, var3 + 1, var4);
         }

         if (!var18 && !var21) {
            this.R = this.z;
            this.r = this.ag;
         } else {
            this.R = var1.for(this.o, var2 + 1, var3 - 1, var4);
            this.r = var1.new(this.o, var2 + 1, var3 - 1, var4);
         }

         if (!var18 && !var20) {
            this.D = this.z;
            this.ak = this.ag;
         } else {
            this.D = var1.for(this.o, var2 + 1, var3 + 1, var4);
            this.ak = var1.new(this.o, var2 + 1, var3 + 1, var4);
         }

         if (this.d >= 1.0D) {
            --var4;
         }

         var22 = var16;
         if (this.d >= 1.0D || !this.o.do(var2, var3, var4 + 1)) {
            var22 = var1.new(this.o, var2, var3, var4 + 1);
         }

         var23 = var1.for(this.o, var2, var3, var4 + 1);
         var11 = (this.A + this.L + var23 + this.E) / 4.0F;
         var14 = (var23 + this.E + this.z + this.D) / 4.0F;
         var13 = (this.W + var23 + this.R + this.z) / 4.0F;
         var12 = (this.for + this.A + this.W + var23) / 4.0F;
         this.af = this.a(this.ah, this.ap, this.al, var22);
         this.ac = this.a(this.al, this.ag, this.ak, var22);
         this.ad = this.a(this.u, this.r, this.ag, var22);
         this.ae = this.a(this.w, this.ah, this.u, var22);
         if (var15) {
            this.ab = this.aa = this.Z = this.X = var5 * 0.8F;
            this.U = this.S = this.Q = this.O = var6 * 0.8F;
            this.M = this.K = this.I = this.G = var7 * 0.8F;
         } else {
            this.ab = this.aa = this.Z = this.X = 0.8F;
            this.U = this.S = this.Q = this.O = 0.8F;
            this.M = this.K = this.I = this.G = 0.8F;
         }

         this.ab *= var11;
         this.U *= var11;
         this.M *= var11;
         this.aa *= var12;
         this.S *= var12;
         this.K *= var12;
         this.Z *= var13;
         this.Q *= var13;
         this.I *= var13;
         this.X *= var14;
         this.O *= var14;
         this.G *= var14;
         var24 = this.a(var1, (yy)this.o, var2, var3, var4, 3);
         if (var9) {
            var24 = this.a(var24, var2, var3, var4, 3, var5, var6, var7);
         }

         this.new(var1, (double)var2, (double)var3, (double)var4, var24);
         if (var8 && n && var24.if().equals("grass_side") && !this.if()) {
            this.ab *= var5;
            this.aa *= var5;
            this.Z *= var5;
            this.X *= var5;
            this.U *= var6;
            this.S *= var6;
            this.Q *= var6;
            this.O *= var6;
            this.M *= var7;
            this.K *= var7;
            this.I *= var7;
            this.G *= var7;
            this.new(var1, (double)var2, (double)var3, (double)var4, q2.v());
         }

         var10 = true;
      }

      if (this.j || var1.int((yy)this.o, var2 - 1, var3, var4, 4)) {
         if (this.i <= 0.0D) {
            --var2;
         }

         this.int = var1.for(this.o, var2, var3 - 1, var4);
         this.C = var1.for(this.o, var2, var3, var4 - 1);
         this.A = var1.for(this.o, var2, var3, var4 + 1);
         this.N = var1.for(this.o, var2, var3 + 1, var4);
         this.x = var1.new(this.o, var2, var3 - 1, var4);
         this.aj = var1.new(this.o, var2, var3, var4 - 1);
         this.ah = var1.new(this.o, var2, var3, var4 + 1);
         this.p = var1.new(this.o, var2, var3 + 1, var4);
         var18 = pa.r[this.o.new(var2 - 1, var3 + 1, var4)];
         var19 = pa.r[this.o.new(var2 - 1, var3 - 1, var4)];
         var20 = pa.r[this.o.new(var2 - 1, var3, var4 - 1)];
         var21 = pa.r[this.o.new(var2 - 1, var3, var4 + 1)];
         if (!var20 && !var19) {
            this.new = this.C;
            this.y = this.aj;
         } else {
            this.new = var1.for(this.o, var2, var3 - 1, var4 - 1);
            this.y = var1.new(this.o, var2, var3 - 1, var4 - 1);
         }

         if (!var21 && !var19) {
            this.for = this.A;
            this.w = this.ah;
         } else {
            this.for = var1.for(this.o, var2, var3 - 1, var4 + 1);
            this.w = var1.new(this.o, var2, var3 - 1, var4 + 1);
         }

         if (!var20 && !var18) {
            this.P = this.C;
            this.q = this.aj;
         } else {
            this.P = var1.for(this.o, var2, var3 + 1, var4 - 1);
            this.q = var1.new(this.o, var2, var3 + 1, var4 - 1);
         }

         if (!var21 && !var18) {
            this.L = this.A;
            this.ap = this.ah;
         } else {
            this.L = var1.for(this.o, var2, var3 + 1, var4 + 1);
            this.ap = var1.new(this.o, var2, var3 + 1, var4 + 1);
         }

         if (this.i <= 0.0D) {
            ++var2;
         }

         var22 = var16;
         if (this.i <= 0.0D || !this.o.do(var2 - 1, var3, var4)) {
            var22 = var1.new(this.o, var2 - 1, var3, var4);
         }

         var23 = var1.for(this.o, var2 - 1, var3, var4);
         var14 = (this.int + this.for + var23 + this.A) / 4.0F;
         var11 = (var23 + this.A + this.N + this.L) / 4.0F;
         var12 = (this.C + var23 + this.P + this.N) / 4.0F;
         var13 = (this.new + this.int + this.C + var23) / 4.0F;
         this.ac = this.a(this.x, this.w, this.ah, var22);
         this.af = this.a(this.ah, this.p, this.ap, var22);
         this.ae = this.a(this.aj, this.q, this.p, var22);
         this.ad = this.a(this.y, this.x, this.aj, var22);
         if (var15) {
            this.ab = this.aa = this.Z = this.X = var5 * 0.6F;
            this.U = this.S = this.Q = this.O = var6 * 0.6F;
            this.M = this.K = this.I = this.G = var7 * 0.6F;
         } else {
            this.ab = this.aa = this.Z = this.X = 0.6F;
            this.U = this.S = this.Q = this.O = 0.6F;
            this.M = this.K = this.I = this.G = 0.6F;
         }

         this.ab *= var11;
         this.U *= var11;
         this.M *= var11;
         this.aa *= var12;
         this.S *= var12;
         this.K *= var12;
         this.Z *= var13;
         this.Q *= var13;
         this.I *= var13;
         this.X *= var14;
         this.O *= var14;
         this.G *= var14;
         var24 = this.a(var1, (yy)this.o, var2, var3, var4, 4);
         if (var9) {
            var24 = this.a(var24, var2, var3, var4, 4, var5, var6, var7);
         }

         this.int(var1, (double)var2, (double)var3, (double)var4, var24);
         if (var8 && n && var24.if().equals("grass_side") && !this.if()) {
            this.ab *= var5;
            this.aa *= var5;
            this.Z *= var5;
            this.X *= var5;
            this.U *= var6;
            this.S *= var6;
            this.Q *= var6;
            this.O *= var6;
            this.M *= var7;
            this.K *= var7;
            this.I *= var7;
            this.G *= var7;
            this.int(var1, (double)var2, (double)var3, (double)var4, q2.v());
         }

         var10 = true;
      }

      if (this.j || var1.int((yy)this.o, var2 + 1, var3, var4, 5)) {
         if (this.h >= 1.0D) {
            ++var2;
         }

         this.T = var1.for(this.o, var2, var3 - 1, var4);
         this.B = var1.for(this.o, var2, var3, var4 - 1);
         this.z = var1.for(this.o, var2, var3, var4 + 1);
         this.F = var1.for(this.o, var2, var3 + 1, var4);
         this.s = var1.new(this.o, var2, var3 - 1, var4);
         this.ai = var1.new(this.o, var2, var3, var4 - 1);
         this.ag = var1.new(this.o, var2, var3, var4 + 1);
         this.am = var1.new(this.o, var2, var3 + 1, var4);
         var18 = pa.r[this.o.new(var2 + 1, var3 + 1, var4)];
         var19 = pa.r[this.o.new(var2 + 1, var3 - 1, var4)];
         var20 = pa.r[this.o.new(var2 + 1, var3, var4 + 1)];
         var21 = pa.r[this.o.new(var2 + 1, var3, var4 - 1)];
         if (!var19 && !var21) {
            this.V = this.B;
            this.t = this.ai;
         } else {
            this.V = var1.for(this.o, var2, var3 - 1, var4 - 1);
            this.t = var1.new(this.o, var2, var3 - 1, var4 - 1);
         }

         if (!var19 && !var20) {
            this.R = this.z;
            this.r = this.ag;
         } else {
            this.R = var1.for(this.o, var2, var3 - 1, var4 + 1);
            this.r = var1.new(this.o, var2, var3 - 1, var4 + 1);
         }

         if (!var18 && !var21) {
            this.H = this.B;
            this.an = this.ai;
         } else {
            this.H = var1.for(this.o, var2, var3 + 1, var4 - 1);
            this.an = var1.new(this.o, var2, var3 + 1, var4 - 1);
         }

         if (!var18 && !var20) {
            this.D = this.z;
            this.ak = this.ag;
         } else {
            this.D = var1.for(this.o, var2, var3 + 1, var4 + 1);
            this.ak = var1.new(this.o, var2, var3 + 1, var4 + 1);
         }

         if (this.h >= 1.0D) {
            --var2;
         }

         var22 = var16;
         if (this.h >= 1.0D || !this.o.do(var2 + 1, var3, var4)) {
            var22 = var1.new(this.o, var2 + 1, var3, var4);
         }

         var23 = var1.for(this.o, var2 + 1, var3, var4);
         var11 = (this.T + this.R + var23 + this.z) / 4.0F;
         var12 = (this.V + this.T + this.B + var23) / 4.0F;
         var13 = (this.B + var23 + this.H + this.F) / 4.0F;
         var14 = (var23 + this.z + this.F + this.D) / 4.0F;
         this.af = this.a(this.s, this.r, this.ag, var22);
         this.ac = this.a(this.ag, this.am, this.ak, var22);
         this.ad = this.a(this.ai, this.an, this.am, var22);
         this.ae = this.a(this.t, this.s, this.ai, var22);
         if (var15) {
            this.ab = this.aa = this.Z = this.X = var5 * 0.6F;
            this.U = this.S = this.Q = this.O = var6 * 0.6F;
            this.M = this.K = this.I = this.G = var7 * 0.6F;
         } else {
            this.ab = this.aa = this.Z = this.X = 0.6F;
            this.U = this.S = this.Q = this.O = 0.6F;
            this.M = this.K = this.I = this.G = 0.6F;
         }

         this.ab *= var11;
         this.U *= var11;
         this.M *= var11;
         this.aa *= var12;
         this.S *= var12;
         this.K *= var12;
         this.Z *= var13;
         this.Q *= var13;
         this.I *= var13;
         this.X *= var14;
         this.O *= var14;
         this.G *= var14;
         var24 = this.a(var1, (yy)this.o, var2, var3, var4, 5);
         if (var9) {
            var24 = this.a(var24, var2, var3, var4, 5, var5, var6, var7);
         }

         this.for(var1, (double)var2, (double)var3, (double)var4, var24);
         if (var8 && n && var24.if().equals("grass_side") && !this.if()) {
            this.ab *= var5;
            this.aa *= var5;
            this.Z *= var5;
            this.X *= var5;
            this.U *= var6;
            this.S *= var6;
            this.Q *= var6;
            this.O *= var6;
            this.M *= var7;
            this.K *= var7;
            this.I *= var7;
            this.G *= var7;
            this.for(var1, (double)var2, (double)var3, (double)var4, q2.v());
         }

         var10 = true;
      }

      this.try = false;
      return var10;
   }

   public boolean for(pa var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      this.try = true;
      boolean var8 = c4.G.g;
      boolean var9 = qs.Y() && var8;
      boolean var10 = false;
      float var11 = 0.0F;
      float var12 = 0.0F;
      float var13 = 0.0F;
      float var14 = 0.0F;
      boolean var15 = true;
      int var16 = var1.new(this.o, var2, var3, var4);
      c4 var17 = c4.G;
      var17.if(983055);
      if (this.a(var1).if().equals("grass_top")) {
         var15 = false;
      } else if (this.if()) {
         var15 = false;
      }

      boolean var18;
      boolean var19;
      boolean var20;
      boolean var21;
      int var22;
      float var23;
      if (this.j || var1.int((yy)this.o, var2, var3 - 1, var4, 0)) {
         if (this.g <= 0.0D) {
            --var3;
         }

         this.x = var1.new(this.o, var2 - 1, var3, var4);
         this.v = var1.new(this.o, var2, var3, var4 - 1);
         this.u = var1.new(this.o, var2, var3, var4 + 1);
         this.s = var1.new(this.o, var2 + 1, var3, var4);
         this.int = var1.for(this.o, var2 - 1, var3, var4);
         this.do = var1.for(this.o, var2, var3, var4 - 1);
         this.W = var1.for(this.o, var2, var3, var4 + 1);
         this.T = var1.for(this.o, var2 + 1, var3, var4);
         var18 = pa.r[this.o.new(var2 + 1, var3 - 1, var4)];
         var19 = pa.r[this.o.new(var2 - 1, var3 - 1, var4)];
         var20 = pa.r[this.o.new(var2, var3 - 1, var4 + 1)];
         var21 = pa.r[this.o.new(var2, var3 - 1, var4 - 1)];
         if (!var21 && !var19) {
            this.new = this.int;
            this.y = this.x;
         } else {
            this.new = var1.for(this.o, var2 - 1, var3, var4 - 1);
            this.y = var1.new(this.o, var2 - 1, var3, var4 - 1);
         }

         if (!var20 && !var19) {
            this.for = this.int;
            this.w = this.x;
         } else {
            this.for = var1.for(this.o, var2 - 1, var3, var4 + 1);
            this.w = var1.new(this.o, var2 - 1, var3, var4 + 1);
         }

         if (!var21 && !var18) {
            this.V = this.T;
            this.t = this.s;
         } else {
            this.V = var1.for(this.o, var2 + 1, var3, var4 - 1);
            this.t = var1.new(this.o, var2 + 1, var3, var4 - 1);
         }

         if (!var20 && !var18) {
            this.R = this.T;
            this.r = this.s;
         } else {
            this.R = var1.for(this.o, var2 + 1, var3, var4 + 1);
            this.r = var1.new(this.o, var2 + 1, var3, var4 + 1);
         }

         if (this.g <= 0.0D) {
            ++var3;
         }

         var22 = var16;
         if (this.g <= 0.0D || !this.o.do(var2, var3 - 1, var4)) {
            var22 = var1.new(this.o, var2, var3 - 1, var4);
         }

         var23 = var1.for(this.o, var2, var3 - 1, var4);
         var11 = (this.for + this.int + this.W + var23) / 4.0F;
         var14 = (this.W + var23 + this.R + this.T) / 4.0F;
         var13 = (var23 + this.do + this.T + this.V) / 4.0F;
         var12 = (this.int + this.new + var23 + this.do) / 4.0F;
         this.af = this.a(this.w, this.x, this.u, var22);
         this.ac = this.a(this.u, this.r, this.s, var22);
         this.ad = this.a(this.v, this.s, this.t, var22);
         this.ae = this.a(this.x, this.y, this.v, var22);
         if (var15) {
            this.ab = this.aa = this.Z = this.X = var5 * 0.5F;
            this.U = this.S = this.Q = this.O = var6 * 0.5F;
            this.M = this.K = this.I = this.G = var7 * 0.5F;
         } else {
            this.ab = this.aa = this.Z = this.X = 0.5F;
            this.U = this.S = this.Q = this.O = 0.5F;
            this.M = this.K = this.I = this.G = 0.5F;
         }

         this.ab *= var11;
         this.U *= var11;
         this.M *= var11;
         this.aa *= var12;
         this.S *= var12;
         this.K *= var12;
         this.Z *= var13;
         this.Q *= var13;
         this.I *= var13;
         this.X *= var14;
         this.O *= var14;
         this.G *= var14;
         this.do(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 0));
         var10 = true;
      }

      if (this.j || var1.int((yy)this.o, var2, var3 + 1, var4, 1)) {
         if (this.f >= 1.0D) {
            ++var3;
         }

         this.p = var1.new(this.o, var2 - 1, var3, var4);
         this.am = var1.new(this.o, var2 + 1, var3, var4);
         this.ao = var1.new(this.o, var2, var3, var4 - 1);
         this.al = var1.new(this.o, var2, var3, var4 + 1);
         this.N = var1.for(this.o, var2 - 1, var3, var4);
         this.F = var1.for(this.o, var2 + 1, var3, var4);
         this.J = var1.for(this.o, var2, var3, var4 - 1);
         this.E = var1.for(this.o, var2, var3, var4 + 1);
         var18 = pa.r[this.o.new(var2 + 1, var3 + 1, var4)];
         var19 = pa.r[this.o.new(var2 - 1, var3 + 1, var4)];
         var20 = pa.r[this.o.new(var2, var3 + 1, var4 + 1)];
         var21 = pa.r[this.o.new(var2, var3 + 1, var4 - 1)];
         if (!var21 && !var19) {
            this.P = this.N;
            this.q = this.p;
         } else {
            this.P = var1.for(this.o, var2 - 1, var3, var4 - 1);
            this.q = var1.new(this.o, var2 - 1, var3, var4 - 1);
         }

         if (!var21 && !var18) {
            this.H = this.F;
            this.an = this.am;
         } else {
            this.H = var1.for(this.o, var2 + 1, var3, var4 - 1);
            this.an = var1.new(this.o, var2 + 1, var3, var4 - 1);
         }

         if (!var20 && !var19) {
            this.L = this.N;
            this.ap = this.p;
         } else {
            this.L = var1.for(this.o, var2 - 1, var3, var4 + 1);
            this.ap = var1.new(this.o, var2 - 1, var3, var4 + 1);
         }

         if (!var20 && !var18) {
            this.D = this.F;
            this.ak = this.am;
         } else {
            this.D = var1.for(this.o, var2 + 1, var3, var4 + 1);
            this.ak = var1.new(this.o, var2 + 1, var3, var4 + 1);
         }

         if (this.f >= 1.0D) {
            --var3;
         }

         var22 = var16;
         if (this.f >= 1.0D || !this.o.do(var2, var3 + 1, var4)) {
            var22 = var1.new(this.o, var2, var3 + 1, var4);
         }

         var23 = var1.for(this.o, var2, var3 + 1, var4);
         var14 = (this.L + this.N + this.E + var23) / 4.0F;
         var11 = (this.E + var23 + this.D + this.F) / 4.0F;
         var12 = (var23 + this.J + this.F + this.H) / 4.0F;
         var13 = (this.N + this.P + var23 + this.J) / 4.0F;
         this.ac = this.a(this.ap, this.p, this.al, var22);
         this.af = this.a(this.al, this.ak, this.am, var22);
         this.ae = this.a(this.ao, this.am, this.an, var22);
         this.ad = this.a(this.p, this.q, this.ao, var22);
         this.ab = this.aa = this.Z = this.X = var5;
         this.U = this.S = this.Q = this.O = var6;
         this.M = this.K = this.I = this.G = var7;
         this.ab *= var11;
         this.U *= var11;
         this.M *= var11;
         this.aa *= var12;
         this.S *= var12;
         this.K *= var12;
         this.Z *= var13;
         this.Q *= var13;
         this.I *= var13;
         this.X *= var14;
         this.O *= var14;
         this.G *= var14;
         this.if(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 1));
         var10 = true;
      }

      float var24;
      float var25;
      float var26;
      float var27;
      int var28;
      int var29;
      int var30;
      int var31;
      ajd var32;
      if (this.j || var1.int((yy)this.o, var2, var3, var4 - 1, 2)) {
         if (this.e <= 0.0D) {
            --var4;
         }

         this.C = var1.for(this.o, var2 - 1, var3, var4);
         this.do = var1.for(this.o, var2, var3 - 1, var4);
         this.J = var1.for(this.o, var2, var3 + 1, var4);
         this.B = var1.for(this.o, var2 + 1, var3, var4);
         this.aj = var1.new(this.o, var2 - 1, var3, var4);
         this.v = var1.new(this.o, var2, var3 - 1, var4);
         this.ao = var1.new(this.o, var2, var3 + 1, var4);
         this.ai = var1.new(this.o, var2 + 1, var3, var4);
         var18 = pa.r[this.o.new(var2 + 1, var3, var4 - 1)];
         var19 = pa.r[this.o.new(var2 - 1, var3, var4 - 1)];
         var20 = pa.r[this.o.new(var2, var3 + 1, var4 - 1)];
         var21 = pa.r[this.o.new(var2, var3 - 1, var4 - 1)];
         if (!var19 && !var21) {
            this.new = this.C;
            this.y = this.aj;
         } else {
            this.new = var1.for(this.o, var2 - 1, var3 - 1, var4);
            this.y = var1.new(this.o, var2 - 1, var3 - 1, var4);
         }

         if (!var19 && !var20) {
            this.P = this.C;
            this.q = this.aj;
         } else {
            this.P = var1.for(this.o, var2 - 1, var3 + 1, var4);
            this.q = var1.new(this.o, var2 - 1, var3 + 1, var4);
         }

         if (!var18 && !var21) {
            this.V = this.B;
            this.t = this.ai;
         } else {
            this.V = var1.for(this.o, var2 + 1, var3 - 1, var4);
            this.t = var1.new(this.o, var2 + 1, var3 - 1, var4);
         }

         if (!var18 && !var20) {
            this.H = this.B;
            this.an = this.ai;
         } else {
            this.H = var1.for(this.o, var2 + 1, var3 + 1, var4);
            this.an = var1.new(this.o, var2 + 1, var3 + 1, var4);
         }

         if (this.e <= 0.0D) {
            ++var4;
         }

         var22 = var16;
         if (this.e <= 0.0D || !this.o.do(var2, var3, var4 - 1)) {
            var22 = var1.new(this.o, var2, var3, var4 - 1);
         }

         var23 = var1.for(this.o, var2, var3, var4 - 1);
         var24 = (this.C + this.P + var23 + this.J) / 4.0F;
         var25 = (var23 + this.J + this.B + this.H) / 4.0F;
         var26 = (this.do + var23 + this.V + this.B) / 4.0F;
         var27 = (this.new + this.C + this.do + var23) / 4.0F;
         var11 = (float)((double)var24 * this.f * (1.0D - this.i) + (double)var25 * this.g * this.i + (double)var26 * (1.0D - this.f) * this.i + (double)var27 * (1.0D - this.f) * (1.0D - this.i));
         var12 = (float)((double)var24 * this.f * (1.0D - this.h) + (double)var25 * this.f * this.h + (double)var26 * (1.0D - this.f) * this.h + (double)var27 * (1.0D - this.f) * (1.0D - this.h));
         var13 = (float)((double)var24 * this.g * (1.0D - this.h) + (double)var25 * this.g * this.h + (double)var26 * (1.0D - this.g) * this.h + (double)var27 * (1.0D - this.g) * (1.0D - this.h));
         var14 = (float)((double)var24 * this.g * (1.0D - this.i) + (double)var25 * this.g * this.i + (double)var26 * (1.0D - this.g) * this.i + (double)var27 * (1.0D - this.g) * (1.0D - this.i));
         var28 = this.a(this.aj, this.q, this.ao, var22);
         var29 = this.a(this.ao, this.ai, this.an, var22);
         var30 = this.a(this.v, this.t, this.ai, var22);
         var31 = this.a(this.y, this.aj, this.v, var22);
         this.af = this.a(var28, var29, var30, var31, this.f * (1.0D - this.i), this.f * this.i, (1.0D - this.f) * this.i, (1.0D - this.f) * (1.0D - this.i));
         this.ae = this.a(var28, var29, var30, var31, this.f * (1.0D - this.h), this.f * this.h, (1.0D - this.f) * this.h, (1.0D - this.f) * (1.0D - this.h));
         this.ad = this.a(var28, var29, var30, var31, this.g * (1.0D - this.h), this.g * this.h, (1.0D - this.g) * this.h, (1.0D - this.g) * (1.0D - this.h));
         this.ac = this.a(var28, var29, var30, var31, this.g * (1.0D - this.i), this.g * this.i, (1.0D - this.g) * this.i, (1.0D - this.g) * (1.0D - this.i));
         if (var15) {
            this.ab = this.aa = this.Z = this.X = var5 * 0.8F;
            this.U = this.S = this.Q = this.O = var6 * 0.8F;
            this.M = this.K = this.I = this.G = var7 * 0.8F;
         } else {
            this.ab = this.aa = this.Z = this.X = 0.8F;
            this.U = this.S = this.Q = this.O = 0.8F;
            this.M = this.K = this.I = this.G = 0.8F;
         }

         this.ab *= var11;
         this.U *= var11;
         this.M *= var11;
         this.aa *= var12;
         this.S *= var12;
         this.K *= var12;
         this.Z *= var13;
         this.Q *= var13;
         this.I *= var13;
         this.X *= var14;
         this.O *= var14;
         this.G *= var14;
         var32 = this.a(var1, (yy)this.o, var2, var3, var4, 2);
         if (var9) {
            var32 = this.a(var32, var2, var3, var4, 2, var5, var6, var7);
         }

         this.a(var1, (double)var2, (double)var3, (double)var4, var32);
         if (var8 && n && var32.if().equals("grass_side") && !this.if()) {
            this.ab *= var5;
            this.aa *= var5;
            this.Z *= var5;
            this.X *= var5;
            this.U *= var6;
            this.S *= var6;
            this.Q *= var6;
            this.O *= var6;
            this.M *= var7;
            this.K *= var7;
            this.I *= var7;
            this.G *= var7;
            this.a(var1, (double)var2, (double)var3, (double)var4, q2.v());
         }

         var10 = true;
      }

      if (this.j || var1.int((yy)this.o, var2, var3, var4 + 1, 3)) {
         if (this.d >= 1.0D) {
            ++var4;
         }

         this.A = var1.for(this.o, var2 - 1, var3, var4);
         this.z = var1.for(this.o, var2 + 1, var3, var4);
         this.W = var1.for(this.o, var2, var3 - 1, var4);
         this.E = var1.for(this.o, var2, var3 + 1, var4);
         this.ah = var1.new(this.o, var2 - 1, var3, var4);
         this.ag = var1.new(this.o, var2 + 1, var3, var4);
         this.u = var1.new(this.o, var2, var3 - 1, var4);
         this.al = var1.new(this.o, var2, var3 + 1, var4);
         var18 = pa.r[this.o.new(var2 + 1, var3, var4 + 1)];
         var19 = pa.r[this.o.new(var2 - 1, var3, var4 + 1)];
         var20 = pa.r[this.o.new(var2, var3 + 1, var4 + 1)];
         var21 = pa.r[this.o.new(var2, var3 - 1, var4 + 1)];
         if (!var19 && !var21) {
            this.for = this.A;
            this.w = this.ah;
         } else {
            this.for = var1.for(this.o, var2 - 1, var3 - 1, var4);
            this.w = var1.new(this.o, var2 - 1, var3 - 1, var4);
         }

         if (!var19 && !var20) {
            this.L = this.A;
            this.ap = this.ah;
         } else {
            this.L = var1.for(this.o, var2 - 1, var3 + 1, var4);
            this.ap = var1.new(this.o, var2 - 1, var3 + 1, var4);
         }

         if (!var18 && !var21) {
            this.R = this.z;
            this.r = this.ag;
         } else {
            this.R = var1.for(this.o, var2 + 1, var3 - 1, var4);
            this.r = var1.new(this.o, var2 + 1, var3 - 1, var4);
         }

         if (!var18 && !var20) {
            this.D = this.z;
            this.ak = this.ag;
         } else {
            this.D = var1.for(this.o, var2 + 1, var3 + 1, var4);
            this.ak = var1.new(this.o, var2 + 1, var3 + 1, var4);
         }

         if (this.d >= 1.0D) {
            --var4;
         }

         var22 = var16;
         if (this.d >= 1.0D || !this.o.do(var2, var3, var4 + 1)) {
            var22 = var1.new(this.o, var2, var3, var4 + 1);
         }

         var23 = var1.for(this.o, var2, var3, var4 + 1);
         var24 = (this.A + this.L + var23 + this.E) / 4.0F;
         var25 = (var23 + this.E + this.z + this.D) / 4.0F;
         var26 = (this.W + var23 + this.R + this.z) / 4.0F;
         var27 = (this.for + this.A + this.W + var23) / 4.0F;
         var11 = (float)((double)var24 * this.f * (1.0D - this.i) + (double)var25 * this.f * this.i + (double)var26 * (1.0D - this.f) * this.i + (double)var27 * (1.0D - this.f) * (1.0D - this.i));
         var12 = (float)((double)var24 * this.g * (1.0D - this.i) + (double)var25 * this.g * this.i + (double)var26 * (1.0D - this.g) * this.i + (double)var27 * (1.0D - this.g) * (1.0D - this.i));
         var13 = (float)((double)var24 * this.g * (1.0D - this.h) + (double)var25 * this.g * this.h + (double)var26 * (1.0D - this.g) * this.h + (double)var27 * (1.0D - this.g) * (1.0D - this.h));
         var14 = (float)((double)var24 * this.f * (1.0D - this.h) + (double)var25 * this.f * this.h + (double)var26 * (1.0D - this.f) * this.h + (double)var27 * (1.0D - this.f) * (1.0D - this.h));
         var28 = this.a(this.ah, this.ap, this.al, var22);
         var29 = this.a(this.al, this.ag, this.ak, var22);
         var30 = this.a(this.u, this.r, this.ag, var22);
         var31 = this.a(this.w, this.ah, this.u, var22);
         this.af = this.a(var28, var31, var30, var29, this.f * (1.0D - this.i), (1.0D - this.f) * (1.0D - this.i), (1.0D - this.f) * this.i, this.f * this.i);
         this.ae = this.a(var28, var31, var30, var29, this.g * (1.0D - this.i), (1.0D - this.g) * (1.0D - this.i), (1.0D - this.g) * this.i, this.g * this.i);
         this.ad = this.a(var28, var31, var30, var29, this.g * (1.0D - this.h), (1.0D - this.g) * (1.0D - this.h), (1.0D - this.g) * this.h, this.g * this.h);
         this.ac = this.a(var28, var31, var30, var29, this.f * (1.0D - this.h), (1.0D - this.f) * (1.0D - this.h), (1.0D - this.f) * this.h, this.f * this.h);
         if (var15) {
            this.ab = this.aa = this.Z = this.X = var5 * 0.8F;
            this.U = this.S = this.Q = this.O = var6 * 0.8F;
            this.M = this.K = this.I = this.G = var7 * 0.8F;
         } else {
            this.ab = this.aa = this.Z = this.X = 0.8F;
            this.U = this.S = this.Q = this.O = 0.8F;
            this.M = this.K = this.I = this.G = 0.8F;
         }

         this.ab *= var11;
         this.U *= var11;
         this.M *= var11;
         this.aa *= var12;
         this.S *= var12;
         this.K *= var12;
         this.Z *= var13;
         this.Q *= var13;
         this.I *= var13;
         this.X *= var14;
         this.O *= var14;
         this.G *= var14;
         var32 = this.a(var1, (yy)this.o, var2, var3, var4, 3);
         if (var9) {
            var32 = this.a(var32, var2, var3, var4, 3, var5, var6, var7);
         }

         this.new(var1, (double)var2, (double)var3, (double)var4, var32);
         if (var8 && n && var32.if().equals("grass_side") && !this.if()) {
            this.ab *= var5;
            this.aa *= var5;
            this.Z *= var5;
            this.X *= var5;
            this.U *= var6;
            this.S *= var6;
            this.Q *= var6;
            this.O *= var6;
            this.M *= var7;
            this.K *= var7;
            this.I *= var7;
            this.G *= var7;
            this.new(var1, (double)var2, (double)var3, (double)var4, q2.v());
         }

         var10 = true;
      }

      if (this.j || var1.int((yy)this.o, var2 - 1, var3, var4, 4)) {
         if (this.i <= 0.0D) {
            --var2;
         }

         this.int = var1.for(this.o, var2, var3 - 1, var4);
         this.C = var1.for(this.o, var2, var3, var4 - 1);
         this.A = var1.for(this.o, var2, var3, var4 + 1);
         this.N = var1.for(this.o, var2, var3 + 1, var4);
         this.x = var1.new(this.o, var2, var3 - 1, var4);
         this.aj = var1.new(this.o, var2, var3, var4 - 1);
         this.ah = var1.new(this.o, var2, var3, var4 + 1);
         this.p = var1.new(this.o, var2, var3 + 1, var4);
         var18 = pa.r[this.o.new(var2 - 1, var3 + 1, var4)];
         var19 = pa.r[this.o.new(var2 - 1, var3 - 1, var4)];
         var20 = pa.r[this.o.new(var2 - 1, var3, var4 - 1)];
         var21 = pa.r[this.o.new(var2 - 1, var3, var4 + 1)];
         if (!var20 && !var19) {
            this.new = this.C;
            this.y = this.aj;
         } else {
            this.new = var1.for(this.o, var2, var3 - 1, var4 - 1);
            this.y = var1.new(this.o, var2, var3 - 1, var4 - 1);
         }

         if (!var21 && !var19) {
            this.for = this.A;
            this.w = this.ah;
         } else {
            this.for = var1.for(this.o, var2, var3 - 1, var4 + 1);
            this.w = var1.new(this.o, var2, var3 - 1, var4 + 1);
         }

         if (!var20 && !var18) {
            this.P = this.C;
            this.q = this.aj;
         } else {
            this.P = var1.for(this.o, var2, var3 + 1, var4 - 1);
            this.q = var1.new(this.o, var2, var3 + 1, var4 - 1);
         }

         if (!var21 && !var18) {
            this.L = this.A;
            this.ap = this.ah;
         } else {
            this.L = var1.for(this.o, var2, var3 + 1, var4 + 1);
            this.ap = var1.new(this.o, var2, var3 + 1, var4 + 1);
         }

         if (this.i <= 0.0D) {
            ++var2;
         }

         var22 = var16;
         if (this.i <= 0.0D || !this.o.do(var2 - 1, var3, var4)) {
            var22 = var1.new(this.o, var2 - 1, var3, var4);
         }

         var23 = var1.for(this.o, var2 - 1, var3, var4);
         var24 = (this.int + this.for + var23 + this.A) / 4.0F;
         var25 = (var23 + this.A + this.N + this.L) / 4.0F;
         var26 = (this.C + var23 + this.P + this.N) / 4.0F;
         var27 = (this.new + this.int + this.C + var23) / 4.0F;
         var11 = (float)((double)var25 * this.f * this.d + (double)var26 * this.f * (1.0D - this.d) + (double)var27 * (1.0D - this.f) * (1.0D - this.d) + (double)var24 * (1.0D - this.f) * this.d);
         var12 = (float)((double)var25 * this.f * this.e + (double)var26 * this.f * (1.0D - this.e) + (double)var27 * (1.0D - this.f) * (1.0D - this.e) + (double)var24 * (1.0D - this.f) * this.e);
         var13 = (float)((double)var25 * this.g * this.e + (double)var26 * this.g * (1.0D - this.e) + (double)var27 * (1.0D - this.g) * (1.0D - this.e) + (double)var24 * (1.0D - this.g) * this.e);
         var14 = (float)((double)var25 * this.g * this.d + (double)var26 * this.g * (1.0D - this.d) + (double)var27 * (1.0D - this.g) * (1.0D - this.d) + (double)var24 * (1.0D - this.g) * this.d);
         var28 = this.a(this.x, this.w, this.ah, var22);
         var29 = this.a(this.ah, this.p, this.ap, var22);
         var30 = this.a(this.aj, this.q, this.p, var22);
         var31 = this.a(this.y, this.x, this.aj, var22);
         this.af = this.a(var29, var30, var31, var28, this.f * this.d, this.f * (1.0D - this.d), (1.0D - this.f) * (1.0D - this.d), (1.0D - this.f) * this.d);
         this.ae = this.a(var29, var30, var31, var28, this.f * this.e, this.f * (1.0D - this.e), (1.0D - this.f) * (1.0D - this.e), (1.0D - this.f) * this.e);
         this.ad = this.a(var29, var30, var31, var28, this.g * this.e, this.g * (1.0D - this.e), (1.0D - this.g) * (1.0D - this.e), (1.0D - this.g) * this.e);
         this.ac = this.a(var29, var30, var31, var28, this.g * this.d, this.g * (1.0D - this.d), (1.0D - this.g) * (1.0D - this.d), (1.0D - this.g) * this.d);
         if (var15) {
            this.ab = this.aa = this.Z = this.X = var5 * 0.6F;
            this.U = this.S = this.Q = this.O = var6 * 0.6F;
            this.M = this.K = this.I = this.G = var7 * 0.6F;
         } else {
            this.ab = this.aa = this.Z = this.X = 0.6F;
            this.U = this.S = this.Q = this.O = 0.6F;
            this.M = this.K = this.I = this.G = 0.6F;
         }

         this.ab *= var11;
         this.U *= var11;
         this.M *= var11;
         this.aa *= var12;
         this.S *= var12;
         this.K *= var12;
         this.Z *= var13;
         this.Q *= var13;
         this.I *= var13;
         this.X *= var14;
         this.O *= var14;
         this.G *= var14;
         var32 = this.a(var1, (yy)this.o, var2, var3, var4, 4);
         if (var9) {
            var32 = this.a(var32, var2, var3, var4, 4, var5, var6, var7);
         }

         this.int(var1, (double)var2, (double)var3, (double)var4, var32);
         if (var8 && n && var32.if().equals("grass_side") && !this.if()) {
            this.ab *= var5;
            this.aa *= var5;
            this.Z *= var5;
            this.X *= var5;
            this.U *= var6;
            this.S *= var6;
            this.Q *= var6;
            this.O *= var6;
            this.M *= var7;
            this.K *= var7;
            this.I *= var7;
            this.G *= var7;
            this.int(var1, (double)var2, (double)var3, (double)var4, q2.v());
         }

         var10 = true;
      }

      if (this.j || var1.int((yy)this.o, var2 + 1, var3, var4, 5)) {
         if (this.h >= 1.0D) {
            ++var2;
         }

         this.T = var1.for(this.o, var2, var3 - 1, var4);
         this.B = var1.for(this.o, var2, var3, var4 - 1);
         this.z = var1.for(this.o, var2, var3, var4 + 1);
         this.F = var1.for(this.o, var2, var3 + 1, var4);
         this.s = var1.new(this.o, var2, var3 - 1, var4);
         this.ai = var1.new(this.o, var2, var3, var4 - 1);
         this.ag = var1.new(this.o, var2, var3, var4 + 1);
         this.am = var1.new(this.o, var2, var3 + 1, var4);
         var18 = pa.r[this.o.new(var2 + 1, var3 + 1, var4)];
         var19 = pa.r[this.o.new(var2 + 1, var3 - 1, var4)];
         var20 = pa.r[this.o.new(var2 + 1, var3, var4 + 1)];
         var21 = pa.r[this.o.new(var2 + 1, var3, var4 - 1)];
         if (!var19 && !var21) {
            this.V = this.B;
            this.t = this.ai;
         } else {
            this.V = var1.for(this.o, var2, var3 - 1, var4 - 1);
            this.t = var1.new(this.o, var2, var3 - 1, var4 - 1);
         }

         if (!var19 && !var20) {
            this.R = this.z;
            this.r = this.ag;
         } else {
            this.R = var1.for(this.o, var2, var3 - 1, var4 + 1);
            this.r = var1.new(this.o, var2, var3 - 1, var4 + 1);
         }

         if (!var18 && !var21) {
            this.H = this.B;
            this.an = this.ai;
         } else {
            this.H = var1.for(this.o, var2, var3 + 1, var4 - 1);
            this.an = var1.new(this.o, var2, var3 + 1, var4 - 1);
         }

         if (!var18 && !var20) {
            this.D = this.z;
            this.ak = this.ag;
         } else {
            this.D = var1.for(this.o, var2, var3 + 1, var4 + 1);
            this.ak = var1.new(this.o, var2, var3 + 1, var4 + 1);
         }

         if (this.h >= 1.0D) {
            --var2;
         }

         var22 = var16;
         if (this.h >= 1.0D || !this.o.do(var2 + 1, var3, var4)) {
            var22 = var1.new(this.o, var2 + 1, var3, var4);
         }

         var23 = var1.for(this.o, var2 + 1, var3, var4);
         var24 = (this.T + this.R + var23 + this.z) / 4.0F;
         var25 = (this.V + this.T + this.B + var23) / 4.0F;
         var26 = (this.B + var23 + this.H + this.F) / 4.0F;
         var27 = (var23 + this.z + this.F + this.D) / 4.0F;
         var11 = (float)((double)var24 * (1.0D - this.g) * this.d + (double)var25 * (1.0D - this.g) * (1.0D - this.d) + (double)var26 * this.g * (1.0D - this.d) + (double)var27 * this.g * this.d);
         var12 = (float)((double)var24 * (1.0D - this.g) * this.e + (double)var25 * (1.0D - this.g) * (1.0D - this.e) + (double)var26 * this.g * (1.0D - this.e) + (double)var27 * this.g * this.e);
         var13 = (float)((double)var24 * (1.0D - this.f) * this.e + (double)var25 * (1.0D - this.f) * (1.0D - this.e) + (double)var26 * this.f * (1.0D - this.e) + (double)var27 * this.f * this.e);
         var14 = (float)((double)var24 * (1.0D - this.f) * this.d + (double)var25 * (1.0D - this.f) * (1.0D - this.d) + (double)var26 * this.f * (1.0D - this.d) + (double)var27 * this.f * this.d);
         var28 = this.a(this.s, this.r, this.ag, var22);
         var29 = this.a(this.ag, this.am, this.ak, var22);
         var30 = this.a(this.ai, this.an, this.am, var22);
         var31 = this.a(this.t, this.s, this.ai, var22);
         this.af = this.a(var28, var31, var30, var29, (1.0D - this.g) * this.d, (1.0D - this.g) * (1.0D - this.d), this.g * (1.0D - this.d), this.g * this.d);
         this.ae = this.a(var28, var31, var30, var29, (1.0D - this.g) * this.e, (1.0D - this.g) * (1.0D - this.e), this.g * (1.0D - this.e), this.g * this.e);
         this.ad = this.a(var28, var31, var30, var29, (1.0D - this.f) * this.e, (1.0D - this.f) * (1.0D - this.e), this.f * (1.0D - this.e), this.f * this.e);
         this.ac = this.a(var28, var31, var30, var29, (1.0D - this.f) * this.d, (1.0D - this.f) * (1.0D - this.d), this.f * (1.0D - this.d), this.f * this.d);
         if (var15) {
            this.ab = this.aa = this.Z = this.X = var5 * 0.6F;
            this.U = this.S = this.Q = this.O = var6 * 0.6F;
            this.M = this.K = this.I = this.G = var7 * 0.6F;
         } else {
            this.ab = this.aa = this.Z = this.X = 0.6F;
            this.U = this.S = this.Q = this.O = 0.6F;
            this.M = this.K = this.I = this.G = 0.6F;
         }

         this.ab *= var11;
         this.U *= var11;
         this.M *= var11;
         this.aa *= var12;
         this.S *= var12;
         this.K *= var12;
         this.Z *= var13;
         this.Q *= var13;
         this.I *= var13;
         this.X *= var14;
         this.O *= var14;
         this.G *= var14;
         var32 = this.a(var1, (yy)this.o, var2, var3, var4, 5);
         if (var9) {
            var32 = this.a(var32, var2, var3, var4, 5, var5, var6, var7);
         }

         this.for(var1, (double)var2, (double)var3, (double)var4, var32);
         if (var8 && n && var32.if().equals("grass_side") && !this.if()) {
            this.ab *= var5;
            this.aa *= var5;
            this.Z *= var5;
            this.X *= var5;
            this.U *= var6;
            this.S *= var6;
            this.Q *= var6;
            this.O *= var6;
            this.M *= var7;
            this.K *= var7;
            this.I *= var7;
            this.G *= var7;
            this.for(var1, (double)var2, (double)var3, (double)var4, q2.v());
         }

         var10 = true;
      }

      this.try = false;
      return var10;
   }

   public int a(int var1, int var2, int var3, int var4) {
      if (var1 == 0) {
         var1 = var4;
      }

      if (var2 == 0) {
         var2 = var4;
      }

      if (var3 == 0) {
         var3 = var4;
      }

      return var1 + var2 + var3 + var4 >> 2 & 16711935;
   }

   public int a(int var1, int var2, int var3, int var4, double var5, double var7, double var9, double var11) {
      int var13 = (int)((double)(var1 >> 16 & 255) * var5 + (double)(var2 >> 16 & 255) * var7 + (double)(var3 >> 16 & 255) * var9 + (double)(var4 >> 16 & 255) * var11) & 255;
      int var14 = (int)((double)(var1 & 255) * var5 + (double)(var2 & 255) * var7 + (double)(var3 & 255) * var9 + (double)(var4 & 255) * var11) & 255;
      return var13 << 16 | var14;
   }

   public boolean do(pa var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      this.try = false;
      boolean var8 = c4.G.g;
      boolean var9 = qs.Y() && var8;
      c4 var10 = c4.G;
      boolean var11 = false;
      float var12 = 0.5F;
      float var13 = 1.0F;
      float var14 = 0.8F;
      float var15 = 0.6F;
      float var16 = var13 * var5;
      float var17 = var13 * var6;
      float var18 = var13 * var7;
      float var19 = var12;
      float var20 = var14;
      float var21 = var15;
      float var22 = var12;
      float var23 = var14;
      float var24 = var15;
      float var25 = var12;
      float var26 = var14;
      float var27 = var15;
      if (var1 != pa.i) {
         var19 = var12 * var5;
         var20 = var14 * var5;
         var21 = var15 * var5;
         var22 = var12 * var6;
         var23 = var14 * var6;
         var24 = var15 * var6;
         var25 = var12 * var7;
         var26 = var14 * var7;
         var27 = var15 * var7;
      }

      int var28 = var1.new(this.o, var2, var3, var4);
      if (this.j || var1.int((yy)this.o, var2, var3 - 1, var4, 0)) {
         var10.if(this.g > 0.0D ? var28 : var1.new(this.o, var2, var3 - 1, var4));
         var10.a(var19, var22, var25);
         this.do(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 0));
         var11 = true;
      }

      if (this.j || var1.int((yy)this.o, var2, var3 + 1, var4, 1)) {
         var10.if(this.f < 1.0D ? var28 : var1.new(this.o, var2, var3 + 1, var4));
         var10.a(var16, var17, var18);
         this.if(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 1));
         var11 = true;
      }

      ajd var29;
      if (this.j || var1.int((yy)this.o, var2, var3, var4 - 1, 2)) {
         var10.if(this.e > 0.0D ? var28 : var1.new(this.o, var2, var3, var4 - 1));
         var10.a(var20, var23, var26);
         var29 = this.a(var1, (yy)this.o, var2, var3, var4, 2);
         if (var9) {
            if (var29 == ct.I || var29 == ct.C) {
               var29 = qs.a(this.o, var2, var3, var4, 2, var29);
               if (var29 == ct.void) {
                  var10.a(var20 * var5, var23 * var6, var26 * var7);
               }
            }

            if (var29 == ct.q) {
               var29 = qs.a(this.o, var2, var3, var4, 2);
            }
         }

         this.a(var1, (double)var2, (double)var3, (double)var4, var29);
         if (var8 && n && var29.if().equals("grass_side") && !this.if()) {
            var10.a(var20 * var5, var23 * var6, var26 * var7);
            this.a(var1, (double)var2, (double)var3, (double)var4, q2.v());
         }

         var11 = true;
      }

      if (this.j || var1.int((yy)this.o, var2, var3, var4 + 1, 3)) {
         var10.if(this.d < 1.0D ? var28 : var1.new(this.o, var2, var3, var4 + 1));
         var10.a(var20, var23, var26);
         var29 = this.a(var1, (yy)this.o, var2, var3, var4, 3);
         if (var9) {
            if (var29 == ct.I || var29 == ct.C) {
               var29 = qs.a(this.o, var2, var3, var4, 3, var29);
               if (var29 == ct.void) {
                  var10.a(var20 * var5, var23 * var6, var26 * var7);
               }
            }

            if (var29 == ct.q) {
               var29 = qs.a(this.o, var2, var3, var4, 3);
            }
         }

         this.new(var1, (double)var2, (double)var3, (double)var4, var29);
         if (var8 && n && var29.if().equals("grass_side") && !this.if()) {
            var10.a(var20 * var5, var23 * var6, var26 * var7);
            this.new(var1, (double)var2, (double)var3, (double)var4, q2.v());
         }

         var11 = true;
      }

      if (this.j || var1.int((yy)this.o, var2 - 1, var3, var4, 4)) {
         var10.if(this.i > 0.0D ? var28 : var1.new(this.o, var2 - 1, var3, var4));
         var10.a(var21, var24, var27);
         var29 = this.a(var1, (yy)this.o, var2, var3, var4, 4);
         if (var9) {
            if (var29 == ct.I || var29 == ct.C) {
               var29 = qs.a(this.o, var2, var3, var4, 4, var29);
               if (var29 == ct.void) {
                  var10.a(var21 * var5, var24 * var6, var27 * var7);
               }
            }

            if (var29 == ct.q) {
               var29 = qs.a(this.o, var2, var3, var4, 4);
            }
         }

         this.int(var1, (double)var2, (double)var3, (double)var4, var29);
         if (var8 && n && var29.if().equals("grass_side") && !this.if()) {
            var10.a(var21 * var5, var24 * var6, var27 * var7);
            this.int(var1, (double)var2, (double)var3, (double)var4, q2.v());
         }

         var11 = true;
      }

      if (this.j || var1.int((yy)this.o, var2 + 1, var3, var4, 5)) {
         var10.if(this.h < 1.0D ? var28 : var1.new(this.o, var2 + 1, var3, var4));
         var10.a(var21, var24, var27);
         var29 = this.a(var1, (yy)this.o, var2, var3, var4, 5);
         if (var9) {
            if (var29 == ct.I || var29 == ct.C) {
               var29 = qs.a(this.o, var2, var3, var4, 5, var29);
               if (var29 == ct.void) {
                  var10.a(var21 * var5, var24 * var6, var27 * var7);
               }
            }

            if (var29 == ct.q) {
               var29 = qs.a(this.o, var2, var3, var4, 5);
            }
         }

         this.for(var1, (double)var2, (double)var3, (double)var4, var29);
         if (var8 && n && var29.if().equals("grass_side") && !this.if()) {
            var10.a(var21 * var5, var24 * var6, var27 * var7);
            this.for(var1, (double)var2, (double)var3, (double)var4, q2.v());
         }

         var11 = true;
      }

      return var11;
   }

   public boolean a(rr var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      var5.if(var1.new(this.o, var2, var3, var4));
      var5.a(1.0F, 1.0F, 1.0F);
      int var6 = this.o.for(var2, var3, var4);
      int var7 = rj.r(var6);
      int var8 = rr.E(var6);
      ajd var9 = var1.D(var8);
      int var10 = 4 + var8 * 2;
      int var11 = 5 + var8 * 2;
      double var12 = 15.0D - (double)var10;
      double var14 = 15.0D;
      double var16 = 4.0D;
      double var18 = 4.0D + (double)var11;
      double var20 = (double)var9.if(var12);
      double var22 = (double)var9.if(var14);
      double var24 = (double)var9.a(var16);
      double var26 = (double)var9.a(var18);
      double var28 = 0.0D;
      double var30 = 0.0D;
      switch(var7) {
      case 0:
         var28 = 8.0D - (double)(var10 / 2);
         var30 = 15.0D - (double)var10;
         break;
      case 1:
         var28 = 1.0D;
         var30 = 8.0D - (double)(var10 / 2);
         break;
      case 2:
         var28 = 8.0D - (double)(var10 / 2);
         var30 = 1.0D;
         break;
      case 3:
         var28 = 15.0D - (double)var10;
         var30 = 8.0D - (double)(var10 / 2);
      }

      double var32 = (double)var2 + var28 / 16.0D;
      double var34 = (double)var2 + (var28 + (double)var10) / 16.0D;
      double var36 = (double)var3 + (12.0D - (double)var11) / 16.0D;
      double var38 = (double)var3 + 0.75D;
      double var40 = (double)var4 + var30 / 16.0D;
      double var42 = (double)var4 + (var30 + (double)var10) / 16.0D;
      var5.a(var32, var36, var40, var20, var26);
      var5.a(var32, var36, var42, var22, var26);
      var5.a(var32, var38, var42, var22, var24);
      var5.a(var32, var38, var40, var20, var24);
      var5.a(var34, var36, var42, var20, var26);
      var5.a(var34, var36, var40, var22, var26);
      var5.a(var34, var38, var40, var22, var24);
      var5.a(var34, var38, var42, var20, var24);
      var5.a(var34, var36, var40, var20, var26);
      var5.a(var32, var36, var40, var22, var26);
      var5.a(var32, var38, var40, var22, var24);
      var5.a(var34, var38, var40, var20, var24);
      var5.a(var32, var36, var42, var20, var26);
      var5.a(var34, var36, var42, var22, var26);
      var5.a(var34, var38, var42, var22, var24);
      var5.a(var32, var38, var42, var20, var24);
      int var44 = var10;
      if (var8 >= 2) {
         var44 = var10 - 1;
      }

      var20 = (double)var9.a();
      var22 = (double)var9.if((double)var44);
      var24 = (double)var9.int();
      var26 = (double)var9.a((double)var44);
      var5.a(var32, var38, var42, var20, var26);
      var5.a(var34, var38, var42, var22, var26);
      var5.a(var34, var38, var40, var22, var24);
      var5.a(var32, var38, var40, var20, var24);
      var5.a(var32, var36, var40, var20, var24);
      var5.a(var34, var36, var40, var22, var24);
      var5.a(var34, var36, var42, var22, var26);
      var5.a(var32, var36, var42, var20, var26);
      var20 = (double)var9.if(12.0D);
      var22 = (double)var9.byte();
      var24 = (double)var9.int();
      var26 = (double)var9.a(4.0D);
      var28 = 8.0D;
      var30 = 0.0D;
      double var45;
      switch(var7) {
      case 0:
         var28 = 8.0D;
         var30 = 12.0D;
         var45 = var20;
         var20 = var22;
         var22 = var45;
         break;
      case 1:
         var28 = 0.0D;
         var30 = 8.0D;
         break;
      case 2:
         var28 = 8.0D;
         var30 = 0.0D;
         break;
      case 3:
         var28 = 12.0D;
         var30 = 8.0D;
         var45 = var20;
         var20 = var22;
         var22 = var45;
      }

      var32 = (double)var2 + var28 / 16.0D;
      var34 = (double)var2 + (var28 + 4.0D) / 16.0D;
      var36 = (double)var3 + 0.75D;
      var38 = (double)var3 + 1.0D;
      var40 = (double)var4 + var30 / 16.0D;
      var42 = (double)var4 + (var30 + 4.0D) / 16.0D;
      if (var7 != 2 && var7 != 0) {
         if (var7 == 1 || var7 == 3) {
            var5.a(var34, var36, var40, var20, var26);
            var5.a(var32, var36, var40, var22, var26);
            var5.a(var32, var38, var40, var22, var24);
            var5.a(var34, var38, var40, var20, var24);
            var5.a(var32, var36, var40, var22, var26);
            var5.a(var34, var36, var40, var20, var26);
            var5.a(var34, var38, var40, var20, var24);
            var5.a(var32, var38, var40, var22, var24);
         }
      } else {
         var5.a(var32, var36, var40, var22, var26);
         var5.a(var32, var36, var42, var20, var26);
         var5.a(var32, var38, var42, var20, var24);
         var5.a(var32, var38, var40, var22, var24);
         var5.a(var32, var36, var42, var20, var26);
         var5.a(var32, var36, var40, var22, var26);
         var5.a(var32, var38, var40, var22, var24);
         var5.a(var32, var38, var42, var20, var24);
      }

      return true;
   }

   public boolean a(r4 var1, int var2, int var3, int var4) {
      float var5 = 0.1875F;
      this.if(this.a(pa.bs));
      this.a(0.125D, 0.0062500000931322575D, 0.125D, 0.875D, (double)var5, 0.875D);
      this.for(var1, var2, var3, var4);
      this.if(this.a(pa.aD));
      this.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
      this.for(var1, var2, var3, var4);
      this.if(var1.z());
      this.a(0.1875D, (double)var5, 0.1875D, 0.8125D, 0.875D, 0.8125D);
      this.for(var1, var2, var3, var4);
      this.a();
      return true;
   }

   public boolean h(pa var1, int var2, int var3, int var4) {
      int var5 = var1.do(this.o, var2, var3, var4);
      float var6 = (float)(var5 >> 16 & 255) / 255.0F;
      float var7 = (float)(var5 >> 8 & 255) / 255.0F;
      float var8 = (float)(var5 & 255) / 255.0F;
      if (dh.r) {
         float var9 = (var6 * 30.0F + var7 * 59.0F + var8 * 11.0F) / 100.0F;
         float var10 = (var6 * 30.0F + var7 * 70.0F) / 100.0F;
         float var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
         var6 = var9;
         var7 = var10;
         var8 = var11;
      }

      return this.if(var1, var2, var3, var4, var6, var7, var8);
   }

   public boolean if(pa var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      c4 var8 = c4.G;
      boolean var9 = false;
      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      float var14 = var10 * var5;
      float var15 = var11 * var5;
      float var16 = var12 * var5;
      float var17 = var13 * var5;
      float var18 = var10 * var6;
      float var19 = var11 * var6;
      float var20 = var12 * var6;
      float var21 = var13 * var6;
      float var22 = var10 * var7;
      float var23 = var11 * var7;
      float var24 = var12 * var7;
      float var25 = var13 * var7;
      float var26 = 0.0625F;
      int var27 = var1.new(this.o, var2, var3, var4);
      if (this.j || var1.int((yy)this.o, var2, var3 - 1, var4, 0)) {
         var8.if(this.g > 0.0D ? var27 : var1.new(this.o, var2, var3 - 1, var4));
         var8.a(var14, var18, var22);
         this.do(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 0));
         var9 = true;
      }

      if (this.j || var1.int((yy)this.o, var2, var3 + 1, var4, 1)) {
         var8.if(this.f < 1.0D ? var27 : var1.new(this.o, var2, var3 + 1, var4));
         var8.a(var15, var19, var23);
         this.if(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 1));
         var9 = true;
      }

      if (this.j || var1.int((yy)this.o, var2, var3, var4 - 1, 2)) {
         var8.if(this.e > 0.0D ? var27 : var1.new(this.o, var2, var3, var4 - 1));
         var8.a(var16, var20, var24);
         var8.if(0.0F, 0.0F, var26);
         this.a(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 2));
         var8.if(0.0F, 0.0F, -var26);
         var9 = true;
      }

      if (this.j || var1.int((yy)this.o, var2, var3, var4 + 1, 3)) {
         var8.if(this.d < 1.0D ? var27 : var1.new(this.o, var2, var3, var4 + 1));
         var8.a(var16, var20, var24);
         var8.if(0.0F, 0.0F, -var26);
         this.new(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 3));
         var8.if(0.0F, 0.0F, var26);
         var9 = true;
      }

      if (this.j || var1.int((yy)this.o, var2 - 1, var3, var4, 4)) {
         var8.if(this.i > 0.0D ? var27 : var1.new(this.o, var2 - 1, var3, var4));
         var8.a(var17, var21, var25);
         var8.if(var26, 0.0F, 0.0F);
         this.int(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 4));
         var8.if(-var26, 0.0F, 0.0F);
         var9 = true;
      }

      if (this.j || var1.int((yy)this.o, var2 + 1, var3, var4, 5)) {
         var8.if(this.h < 1.0D ? var27 : var1.new(this.o, var2 + 1, var3, var4));
         var8.a(var17, var21, var25);
         var8.if(-var26, 0.0F, 0.0F);
         this.for(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 5));
         var8.if(var26, 0.0F, 0.0F);
         var9 = true;
      }

      return var9;
   }

   public boolean a(q8 var1, int var2, int var3, int var4) {
      boolean var5 = false;
      float var6 = 0.375F;
      float var7 = 0.625F;
      this.a((double)var6, 0.0D, (double)var6, (double)var7, 1.0D, (double)var7);
      this.for(var1, var2, var3, var4);
      var5 = true;
      boolean var8 = false;
      boolean var9 = false;
      if (var1.void(this.o, var2 - 1, var3, var4) || var1.void(this.o, var2 + 1, var3, var4)) {
         var8 = true;
      }

      if (var1.void(this.o, var2, var3, var4 - 1) || var1.void(this.o, var2, var3, var4 + 1)) {
         var9 = true;
      }

      boolean var10 = var1.void(this.o, var2 - 1, var3, var4);
      boolean var11 = var1.void(this.o, var2 + 1, var3, var4);
      boolean var12 = var1.void(this.o, var2, var3, var4 - 1);
      boolean var13 = var1.void(this.o, var2, var3, var4 + 1);
      if (!var8 && !var9) {
         var8 = true;
      }

      var6 = 0.4375F;
      var7 = 0.5625F;
      float var14 = 0.75F;
      float var15 = 0.9375F;
      float var16 = var10 ? 0.0F : var6;
      float var17 = var11 ? 1.0F : var7;
      float var18 = var12 ? 0.0F : var6;
      float var19 = var13 ? 1.0F : var7;
      if (var8) {
         this.a((double)var16, (double)var14, (double)var6, (double)var17, (double)var15, (double)var7);
         this.for(var1, var2, var3, var4);
         var5 = true;
      }

      if (var9) {
         this.a((double)var6, (double)var14, (double)var18, (double)var7, (double)var15, (double)var19);
         this.for(var1, var2, var3, var4);
         var5 = true;
      }

      var14 = 0.375F;
      var15 = 0.5625F;
      if (var8) {
         this.a((double)var16, (double)var14, (double)var6, (double)var17, (double)var15, (double)var7);
         this.for(var1, var2, var3, var4);
         var5 = true;
      }

      if (var9) {
         this.a((double)var6, (double)var14, (double)var18, (double)var7, (double)var15, (double)var19);
         this.for(var1, var2, var3, var4);
         var5 = true;
      }

      var1.int(this.o, var2, var3, var4);
      if (qs.R() && this.a(var2, var3, var4)) {
         this.a(var2, var3, var4, pa.ca.aF);
      }

      return var5;
   }

   public boolean a(ow var1, int var2, int var3, int var4) {
      boolean var5 = var1.try(this.o, var2 - 1, var3, var4);
      boolean var6 = var1.try(this.o, var2 + 1, var3, var4);
      boolean var7 = var1.try(this.o, var2, var3, var4 - 1);
      boolean var8 = var1.try(this.o, var2, var3, var4 + 1);
      boolean var9 = var7 && var8 && !var5 && !var6;
      boolean var10 = !var7 && !var8 && var5 && var6;
      boolean var11 = this.o.a(var2, var3 + 1, var4);
      if ((var9 || var10) && var11) {
         if (var9) {
            this.a(0.3125D, 0.0D, 0.0D, 0.6875D, 0.8125D, 1.0D);
            this.for(var1, var2, var3, var4);
         } else {
            this.a(0.0D, 0.0D, 0.3125D, 1.0D, 0.8125D, 0.6875D);
            this.for(var1, var2, var3, var4);
         }
      } else {
         this.a(0.25D, 0.0D, 0.25D, 0.75D, 1.0D, 0.75D);
         this.for(var1, var2, var3, var4);
         if (var5) {
            this.a(0.0D, 0.0D, 0.3125D, 0.25D, 0.8125D, 0.6875D);
            this.for(var1, var2, var3, var4);
         }

         if (var6) {
            this.a(0.75D, 0.0D, 0.3125D, 1.0D, 0.8125D, 0.6875D);
            this.for(var1, var2, var3, var4);
         }

         if (var7) {
            this.a(0.3125D, 0.0D, 0.0D, 0.6875D, 0.8125D, 0.25D);
            this.for(var1, var2, var3, var4);
         }

         if (var8) {
            this.a(0.3125D, 0.0D, 0.75D, 0.6875D, 0.8125D, 1.0D);
            this.for(var1, var2, var3, var4);
         }
      }

      var1.int(this.o, var2, var3, var4);
      if (qs.R() && this.a(var2, var3, var4)) {
         this.a(var2, var3, var4, pa.ca.aF);
      }

      return true;
   }

   public boolean a(re var1, int var2, int var3, int var4) {
      boolean var5 = false;
      int var6 = 0;

      for(int var7 = 0; var7 < 8; ++var7) {
         byte var8 = 0;
         byte var9 = 1;
         if (var7 == 0) {
            var8 = 2;
         }

         if (var7 == 1) {
            var8 = 3;
         }

         if (var7 == 2) {
            var8 = 4;
         }

         if (var7 == 3) {
            var8 = 5;
            var9 = 2;
         }

         if (var7 == 4) {
            var8 = 6;
            var9 = 3;
         }

         if (var7 == 5) {
            var8 = 7;
            var9 = 5;
         }

         if (var7 == 6) {
            var8 = 6;
            var9 = 2;
         }

         if (var7 == 7) {
            var8 = 3;
         }

         float var10 = (float)var8 / 16.0F;
         float var11 = 1.0F - (float)var6 / 16.0F;
         float var12 = 1.0F - (float)(var6 + var9) / 16.0F;
         var6 += var9;
         this.a((double)(0.5F - var10), (double)var12, (double)(0.5F - var10), (double)(0.5F + var10), (double)var11, (double)(0.5F + var10));
         this.for(var1, var2, var3, var4);
      }

      var5 = true;
      this.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
      return var5;
   }

   public boolean a(q9 var1, int var2, int var3, int var4) {
      boolean var5 = true;
      int var6 = this.o.for(var2, var3, var4);
      boolean var7 = q9.s(var6);
      int var8 = rj.r(var6);
      float var9 = 0.375F;
      float var10 = 0.5625F;
      float var11 = 0.75F;
      float var12 = 0.9375F;
      float var13 = 0.3125F;
      float var14 = 1.0F;
      if ((var8 == 2 || var8 == 0) && this.o.new(var2 - 1, var3, var4) == pa.K.void && this.o.new(var2 + 1, var3, var4) == pa.K.void || (var8 == 3 || var8 == 1) && this.o.new(var2, var3, var4 - 1) == pa.K.void && this.o.new(var2, var3, var4 + 1) == pa.K.void) {
         var9 -= 0.1875F;
         var10 -= 0.1875F;
         var11 -= 0.1875F;
         var12 -= 0.1875F;
         var13 -= 0.1875F;
         var14 -= 0.1875F;
      }

      this.j = true;
      float var15;
      float var16;
      float var17;
      float var18;
      if (var8 != 3 && var8 != 1) {
         var15 = 0.0F;
         var16 = 0.125F;
         var17 = 0.4375F;
         var18 = 0.5625F;
         this.a((double)var15, (double)var13, (double)var17, (double)var16, (double)var14, (double)var18);
         this.for(var1, var2, var3, var4);
         var15 = 0.875F;
         var16 = 1.0F;
         this.a((double)var15, (double)var13, (double)var17, (double)var16, (double)var14, (double)var18);
         this.for(var1, var2, var3, var4);
      } else {
         this.case = 1;
         var15 = 0.4375F;
         var16 = 0.5625F;
         var17 = 0.0F;
         var18 = 0.125F;
         this.a((double)var15, (double)var13, (double)var17, (double)var16, (double)var14, (double)var18);
         this.for(var1, var2, var3, var4);
         var17 = 0.875F;
         var18 = 1.0F;
         this.a((double)var15, (double)var13, (double)var17, (double)var16, (double)var14, (double)var18);
         this.for(var1, var2, var3, var4);
         this.case = 0;
      }

      if (var7) {
         if (var8 == 2 || var8 == 0) {
            this.case = 1;
         }

         if (var8 == 3) {
            this.a(0.8125D, (double)var9, 0.0D, 0.9375D, (double)var12, 0.125D);
            this.for(var1, var2, var3, var4);
            this.a(0.8125D, (double)var9, 0.875D, 0.9375D, (double)var12, 1.0D);
            this.for(var1, var2, var3, var4);
            this.a(0.5625D, (double)var9, 0.0D, 0.8125D, (double)var10, 0.125D);
            this.for(var1, var2, var3, var4);
            this.a(0.5625D, (double)var9, 0.875D, 0.8125D, (double)var10, 1.0D);
            this.for(var1, var2, var3, var4);
            this.a(0.5625D, (double)var11, 0.0D, 0.8125D, (double)var12, 0.125D);
            this.for(var1, var2, var3, var4);
            this.a(0.5625D, (double)var11, 0.875D, 0.8125D, (double)var12, 1.0D);
            this.for(var1, var2, var3, var4);
         } else if (var8 == 1) {
            this.a(0.0625D, (double)var9, 0.0D, 0.1875D, (double)var12, 0.125D);
            this.for(var1, var2, var3, var4);
            this.a(0.0625D, (double)var9, 0.875D, 0.1875D, (double)var12, 1.0D);
            this.for(var1, var2, var3, var4);
            this.a(0.1875D, (double)var9, 0.0D, 0.4375D, (double)var10, 0.125D);
            this.for(var1, var2, var3, var4);
            this.a(0.1875D, (double)var9, 0.875D, 0.4375D, (double)var10, 1.0D);
            this.for(var1, var2, var3, var4);
            this.a(0.1875D, (double)var11, 0.0D, 0.4375D, (double)var12, 0.125D);
            this.for(var1, var2, var3, var4);
            this.a(0.1875D, (double)var11, 0.875D, 0.4375D, (double)var12, 1.0D);
            this.for(var1, var2, var3, var4);
         } else if (var8 == 0) {
            this.a(0.0D, (double)var9, 0.8125D, 0.125D, (double)var12, 0.9375D);
            this.for(var1, var2, var3, var4);
            this.a(0.875D, (double)var9, 0.8125D, 1.0D, (double)var12, 0.9375D);
            this.for(var1, var2, var3, var4);
            this.a(0.0D, (double)var9, 0.5625D, 0.125D, (double)var10, 0.8125D);
            this.for(var1, var2, var3, var4);
            this.a(0.875D, (double)var9, 0.5625D, 1.0D, (double)var10, 0.8125D);
            this.for(var1, var2, var3, var4);
            this.a(0.0D, (double)var11, 0.5625D, 0.125D, (double)var12, 0.8125D);
            this.for(var1, var2, var3, var4);
            this.a(0.875D, (double)var11, 0.5625D, 1.0D, (double)var12, 0.8125D);
            this.for(var1, var2, var3, var4);
         } else if (var8 == 2) {
            this.a(0.0D, (double)var9, 0.0625D, 0.125D, (double)var12, 0.1875D);
            this.for(var1, var2, var3, var4);
            this.a(0.875D, (double)var9, 0.0625D, 1.0D, (double)var12, 0.1875D);
            this.for(var1, var2, var3, var4);
            this.a(0.0D, (double)var9, 0.1875D, 0.125D, (double)var10, 0.4375D);
            this.for(var1, var2, var3, var4);
            this.a(0.875D, (double)var9, 0.1875D, 1.0D, (double)var10, 0.4375D);
            this.for(var1, var2, var3, var4);
            this.a(0.0D, (double)var11, 0.1875D, 0.125D, (double)var12, 0.4375D);
            this.for(var1, var2, var3, var4);
            this.a(0.875D, (double)var11, 0.1875D, 1.0D, (double)var12, 0.4375D);
            this.for(var1, var2, var3, var4);
         }
      } else if (var8 != 3 && var8 != 1) {
         var15 = 0.375F;
         var16 = 0.5F;
         var17 = 0.4375F;
         var18 = 0.5625F;
         this.a((double)var15, (double)var9, (double)var17, (double)var16, (double)var12, (double)var18);
         this.for(var1, var2, var3, var4);
         var15 = 0.5F;
         var16 = 0.625F;
         this.a((double)var15, (double)var9, (double)var17, (double)var16, (double)var12, (double)var18);
         this.for(var1, var2, var3, var4);
         var15 = 0.625F;
         var16 = 0.875F;
         this.a((double)var15, (double)var9, (double)var17, (double)var16, (double)var10, (double)var18);
         this.for(var1, var2, var3, var4);
         this.a((double)var15, (double)var11, (double)var17, (double)var16, (double)var12, (double)var18);
         this.for(var1, var2, var3, var4);
         var15 = 0.125F;
         var16 = 0.375F;
         this.a((double)var15, (double)var9, (double)var17, (double)var16, (double)var10, (double)var18);
         this.for(var1, var2, var3, var4);
         this.a((double)var15, (double)var11, (double)var17, (double)var16, (double)var12, (double)var18);
         this.for(var1, var2, var3, var4);
      } else {
         this.case = 1;
         var15 = 0.4375F;
         var16 = 0.5625F;
         var17 = 0.375F;
         var18 = 0.5F;
         this.a((double)var15, (double)var9, (double)var17, (double)var16, (double)var12, (double)var18);
         this.for(var1, var2, var3, var4);
         var17 = 0.5F;
         var18 = 0.625F;
         this.a((double)var15, (double)var9, (double)var17, (double)var16, (double)var12, (double)var18);
         this.for(var1, var2, var3, var4);
         var17 = 0.625F;
         var18 = 0.875F;
         this.a((double)var15, (double)var9, (double)var17, (double)var16, (double)var10, (double)var18);
         this.for(var1, var2, var3, var4);
         this.a((double)var15, (double)var11, (double)var17, (double)var16, (double)var12, (double)var18);
         this.for(var1, var2, var3, var4);
         var17 = 0.125F;
         var18 = 0.375F;
         this.a((double)var15, (double)var9, (double)var17, (double)var16, (double)var10, (double)var18);
         this.for(var1, var2, var3, var4);
         this.a((double)var15, (double)var11, (double)var17, (double)var16, (double)var12, (double)var18);
         this.for(var1, var2, var3, var4);
      }

      if (qs.R() && this.a(var2, var3, var4)) {
         this.a(var2, var3, var4, pa.ca.aF);
      }

      this.j = false;
      this.case = 0;
      this.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
      return var5;
   }

   public boolean a(qv var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      var5.if(var1.new(this.o, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = var1.do(this.o, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      if (dh.r) {
         float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
         float var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
         float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
         var8 = var11;
         var9 = var12;
         var10 = var13;
      }

      var5.a(var6 * var8, var6 * var9, var6 * var10);
      return this.a(var1, var2, var3, var4, this.o.for(var2, var3, var4), false);
   }

   public boolean a(qv var1, int var2, int var3, int var4, int var5, boolean var6) {
      c4 var7 = c4.G;
      int var8 = qv.A(var5);
      double var9 = 0.625D;
      this.a(0.0D, var9, 0.0D, 1.0D, 1.0D, 1.0D);
      if (var6) {
         var7.if();
         var7.do(0.0F, -1.0F, 0.0F);
         this.do(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 0, var5));
         var7.for();
         var7.if();
         var7.do(0.0F, 1.0F, 0.0F);
         this.if(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 1, var5));
         var7.for();
         var7.if();
         var7.do(0.0F, 0.0F, -1.0F);
         this.a(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 2, var5));
         var7.for();
         var7.if();
         var7.do(0.0F, 0.0F, 1.0F);
         this.new(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 3, var5));
         var7.for();
         var7.if();
         var7.do(-1.0F, 0.0F, 0.0F);
         this.int(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 4, var5));
         var7.for();
         var7.if();
         var7.do(1.0F, 0.0F, 0.0F);
         this.for(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 5, var5));
         var7.for();
      } else {
         this.for(var1, var2, var3, var4);
      }

      float var11;
      if (!var6) {
         var7.if(var1.new(this.o, var2, var3, var4));
         float var12 = 1.0F;
         int var13 = var1.do(this.o, var2, var3, var4);
         var11 = (float)(var13 >> 16 & 255) / 255.0F;
         float var14 = (float)(var13 >> 8 & 255) / 255.0F;
         float var15 = (float)(var13 & 255) / 255.0F;
         if (dh.r) {
            float var16 = (var11 * 30.0F + var14 * 59.0F + var15 * 11.0F) / 100.0F;
            float var17 = (var11 * 30.0F + var14 * 70.0F) / 100.0F;
            float var18 = (var11 * 30.0F + var15 * 70.0F) / 100.0F;
            var11 = var16;
            var14 = var17;
            var15 = var18;
         }

         var7.a(var12 * var11, var12 * var14, var12 * var15);
      }

      ajd var22 = qv.int("hopper");
      ajd var23 = qv.int("hopper_inside");
      var11 = 0.125F;
      if (var6) {
         var7.if();
         var7.do(1.0F, 0.0F, 0.0F);
         this.for(var1, (double)(-1.0F + var11), 0.0D, 0.0D, var22);
         var7.for();
         var7.if();
         var7.do(-1.0F, 0.0F, 0.0F);
         this.int(var1, (double)(1.0F - var11), 0.0D, 0.0D, var22);
         var7.for();
         var7.if();
         var7.do(0.0F, 0.0F, 1.0F);
         this.new(var1, 0.0D, 0.0D, (double)(-1.0F + var11), var22);
         var7.for();
         var7.if();
         var7.do(0.0F, 0.0F, -1.0F);
         this.a(var1, 0.0D, 0.0D, (double)(1.0F - var11), var22);
         var7.for();
         var7.if();
         var7.do(0.0F, 1.0F, 0.0F);
         this.if(var1, 0.0D, -1.0D + var9, 0.0D, var23);
         var7.for();
      } else {
         this.for(var1, (double)((float)var2 - 1.0F + var11), (double)var3, (double)var4, var22);
         this.int(var1, (double)((float)var2 + 1.0F - var11), (double)var3, (double)var4, var22);
         this.new(var1, (double)var2, (double)var3, (double)((float)var4 - 1.0F + var11), var22);
         this.a(var1, (double)var2, (double)var3, (double)((float)var4 + 1.0F - var11), var22);
         this.if(var1, (double)var2, (double)((float)var3 - 1.0F) + var9, (double)var4, var23);
      }

      this.if(var22);
      double var24 = 0.25D;
      double var25 = 0.25D;
      this.a(var24, var25, var24, 1.0D - var24, var9 - 0.002D, 1.0D - var24);
      if (var6) {
         var7.if();
         var7.do(1.0F, 0.0F, 0.0F);
         this.for(var1, 0.0D, 0.0D, 0.0D, var22);
         var7.for();
         var7.if();
         var7.do(-1.0F, 0.0F, 0.0F);
         this.int(var1, 0.0D, 0.0D, 0.0D, var22);
         var7.for();
         var7.if();
         var7.do(0.0F, 0.0F, 1.0F);
         this.new(var1, 0.0D, 0.0D, 0.0D, var22);
         var7.for();
         var7.if();
         var7.do(0.0F, 0.0F, -1.0F);
         this.a(var1, 0.0D, 0.0D, 0.0D, var22);
         var7.for();
         var7.if();
         var7.do(0.0F, 1.0F, 0.0F);
         this.if(var1, 0.0D, 0.0D, 0.0D, var22);
         var7.for();
         var7.if();
         var7.do(0.0F, -1.0F, 0.0F);
         this.do(var1, 0.0D, 0.0D, 0.0D, var22);
         var7.for();
      } else {
         this.for(var1, var2, var3, var4);
      }

      if (!var6) {
         double var26 = 0.375D;
         double var20 = 0.25D;
         this.if(var22);
         if (var8 == 0) {
            this.a(var26, 0.0D, var26, 1.0D - var26, 0.25D, 1.0D - var26);
            this.for(var1, var2, var3, var4);
         }

         if (var8 == 2) {
            this.a(var26, var25, 0.0D, 1.0D - var26, var25 + var20, var24);
            this.for(var1, var2, var3, var4);
         }

         if (var8 == 3) {
            this.a(var26, var25, 1.0D - var24, 1.0D - var26, var25 + var20, 1.0D);
            this.for(var1, var2, var3, var4);
         }

         if (var8 == 4) {
            this.a(0.0D, var25, var26, var24, var25 + var20, 1.0D - var26);
            this.for(var1, var2, var3, var4);
         }

         if (var8 == 5) {
            this.a(1.0D - var24, var25, var26, 1.0D, var25 + var20, 1.0D - var26);
            this.for(var1, var2, var3, var4);
         }
      }

      this.a();
      return true;
   }

   public boolean a(pk var1, int var2, int var3, int var4) {
      var1.char(this.o, var2, var3, var4);
      this.if((pa)var1);
      this.for(var1, var2, var3, var4);
      boolean var5 = var1.byte(this.o, var2, var3, var4);
      this.if((pa)var1);
      this.for(var1, var2, var3, var4);
      if (var5 && var1.case(this.o, var2, var3, var4)) {
         this.if((pa)var1);
         this.for(var1, var2, var3, var4);
      }

      return true;
   }

   public boolean new(pa var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      int var6 = this.o.for(var2, var3, var4);
      if ((var6 & 8) != 0) {
         if (this.o.new(var2, var3 - 1, var4) != var1.void) {
            return false;
         }
      } else if (this.o.new(var2, var3 + 1, var4) != var1.void) {
         return false;
      }

      boolean var7 = false;
      float var8 = 0.5F;
      float var9 = 1.0F;
      float var10 = 0.8F;
      float var11 = 0.6F;
      int var12 = var1.new(this.o, var2, var3, var4);
      var5.if(this.g > 0.0D ? var12 : var1.new(this.o, var2, var3 - 1, var4));
      var5.a(var8, var8, var8);
      ajd var13 = var1.if((yy)this.o, var2, var3, var4, 0);
      this.do(var1, (double)var2, (double)var3, (double)var4, var13);
      var7 = true;
      var5.if(this.f < 1.0D ? var12 : var1.new(this.o, var2, var3 + 1, var4));
      var5.a(var9, var9, var9);
      this.if(var1, (double)var2, (double)var3, (double)var4, var13);
      var7 = true;
      var5.if(this.e > 0.0D ? var12 : var1.new(this.o, var2, var3, var4 - 1));
      var5.a(var10, var10, var10);
      this.a(var1, (double)var2, (double)var3, (double)var4, var13);
      var7 = true;
      this.k = false;
      var5.if(this.d < 1.0D ? var12 : var1.new(this.o, var2, var3, var4 + 1));
      var5.a(var10, var10, var10);
      this.new(var1, (double)var2, (double)var3, (double)var4, var13);
      var7 = true;
      this.k = false;
      var5.if(this.i > 0.0D ? var12 : var1.new(this.o, var2 - 1, var3, var4));
      var5.a(var11, var11, var11);
      this.int(var1, (double)var2, (double)var3, (double)var4, var13);
      var7 = true;
      this.k = false;
      var5.if(this.h < 1.0D ? var12 : var1.new(this.o, var2 + 1, var3, var4));
      var5.a(var11, var11, var11);
      this.for(var1, (double)var2, (double)var3, (double)var4, var13);
      var7 = true;
      this.k = false;
      return var7;
   }

   public boolean do(pa var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      int var6 = this.o.for(var2, var3, var4);
      if ((var6 & 8) != 0) {
         if (this.o.new(var2, var3 - 1, var4) != var1.void) {
            return false;
         }
      } else if (this.o.new(var2, var3 + 1, var4) != var1.void) {
         return false;
      }

      boolean var7 = false;
      float var8 = 0.5F;
      float var9 = 1.0F;
      float var10 = 0.8F;
      float var11 = 0.6F;
      int var12 = var1.new(this.o, var2, var3, var4);
      var5.if(this.g > 0.0D ? var12 : var1.new(this.o, var2, var3 - 1, var4));
      var5.a(var8, var8, var8);
      this.do(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 0));
      var7 = true;
      var5.if(this.f < 1.0D ? var12 : var1.new(this.o, var2, var3 + 1, var4));
      var5.a(var9, var9, var9);
      this.if(var1, (double)var2, (double)var3, (double)var4, this.a(var1, (yy)this.o, var2, var3, var4, 1));
      var7 = true;
      var5.if(this.e > 0.0D ? var12 : var1.new(this.o, var2, var3, var4 - 1));
      var5.a(var10, var10, var10);
      ajd var13 = this.a(var1, (yy)this.o, var2, var3, var4, 2);
      this.a(var1, (double)var2, (double)var3, (double)var4, var13);
      var7 = true;
      this.k = false;
      var5.if(this.d < 1.0D ? var12 : var1.new(this.o, var2, var3, var4 + 1));
      var5.a(var10, var10, var10);
      var13 = this.a(var1, (yy)this.o, var2, var3, var4, 3);
      this.new(var1, (double)var2, (double)var3, (double)var4, var13);
      var7 = true;
      this.k = false;
      var5.if(this.i > 0.0D ? var12 : var1.new(this.o, var2 - 1, var3, var4));
      var5.a(var11, var11, var11);
      var13 = this.a(var1, (yy)this.o, var2, var3, var4, 4);
      this.int(var1, (double)var2, (double)var3, (double)var4, var13);
      var7 = true;
      this.k = false;
      var5.if(this.h < 1.0D ? var12 : var1.new(this.o, var2 + 1, var3, var4));
      var5.a(var11, var11, var11);
      var13 = this.a(var1, (yy)this.o, var2, var3, var4, 5);
      this.for(var1, (double)var2, (double)var3, (double)var4, var13);
      var7 = true;
      this.k = false;
      return var7;
   }

   public void do(pa var1, double var2, double var4, double var6, ajd var8) {
      c4 var9 = c4.G;
      if (this.if()) {
         var8 = this.l;
      }

      if (qs.aj() && this.l == null && this.byte == 0) {
         var8 = e.if(this.o, var1, (int)var2, (int)var4, (int)var6, 0, var8);
      }

      boolean var10 = false;
      if (qs.al() && this.l == null && this.byte == 0) {
         za var11 = r.a(var8);
         if (var11 != null) {
            int var12 = qs.a((int)var2, (int)var4, (int)var6, 0);
            if (var11.a > 1) {
               this.byte = var12 & 3;
            }

            if (var11.a == 2) {
               this.byte = this.byte / 2 * 3;
            }

            if (var11.if) {
               this.k = (var12 & 4) != 0;
            }

            var10 = true;
         }
      }

      double var37 = (double)var8.if(this.i * 16.0D);
      double var13 = (double)var8.if(this.h * 16.0D);
      double var15 = (double)var8.a(this.e * 16.0D);
      double var17 = (double)var8.a(this.d * 16.0D);
      if (this.i < 0.0D || this.h > 1.0D) {
         var37 = (double)var8.a();
         var13 = (double)var8.byte();
      }

      if (this.e < 0.0D || this.d > 1.0D) {
         var15 = (double)var8.int();
         var17 = (double)var8.do();
      }

      double var19;
      if (this.k) {
         var19 = var37;
         var37 = var13;
         var13 = var19;
      }

      var19 = var13;
      double var21 = var37;
      double var23 = var15;
      double var25 = var17;
      double var27;
      if (this.byte == 2) {
         var37 = (double)var8.if(this.e * 16.0D);
         var15 = (double)var8.a(16.0D - this.h * 16.0D);
         var13 = (double)var8.if(this.d * 16.0D);
         var17 = (double)var8.a(16.0D - this.i * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var23 = var15;
         var25 = var17;
         var19 = var37;
         var21 = var13;
         var15 = var17;
         var17 = var23;
      } else if (this.byte == 1) {
         var37 = (double)var8.if(16.0D - this.d * 16.0D);
         var15 = (double)var8.a(this.i * 16.0D);
         var13 = (double)var8.if(16.0D - this.e * 16.0D);
         var17 = (double)var8.a(this.h * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var19 = var13;
         var21 = var37;
         var37 = var13;
         var13 = var21;
         var23 = var17;
         var25 = var15;
      } else if (this.byte == 3) {
         var37 = (double)var8.if(16.0D - this.i * 16.0D);
         var13 = (double)var8.if(16.0D - this.h * 16.0D);
         var15 = (double)var8.a(16.0D - this.e * 16.0D);
         var17 = (double)var8.a(16.0D - this.d * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var19 = var13;
         var21 = var37;
         var23 = var15;
         var25 = var17;
      }

      if (var10) {
         this.byte = 0;
         this.k = false;
      }

      var27 = var2 + this.i;
      double var29 = var2 + this.h;
      double var31 = var4 + this.g;
      double var33 = var6 + this.e;
      double var35 = var6 + this.d;
      if (this.try) {
         var9.a(this.ab, this.U, this.M);
         var9.if(this.af);
         var9.a(var27, var31, var35, var21, var25);
         var9.a(this.aa, this.S, this.K);
         var9.if(this.ae);
         var9.a(var27, var31, var33, var37, var15);
         var9.a(this.Z, this.Q, this.I);
         var9.if(this.ad);
         var9.a(var29, var31, var33, var19, var23);
         var9.a(this.X, this.O, this.G);
         var9.if(this.ac);
         var9.a(var29, var31, var35, var13, var17);
      } else {
         var9.a(var27, var31, var35, var21, var25);
         var9.a(var27, var31, var33, var37, var15);
         var9.a(var29, var31, var33, var19, var23);
         var9.a(var29, var31, var35, var13, var17);
      }

   }

   public void if(pa var1, double var2, double var4, double var6, ajd var8) {
      c4 var9 = c4.G;
      if (this.if()) {
         var8 = this.l;
      }

      if (qs.aj() && this.l == null && this.case == 0) {
         var8 = e.if(this.o, var1, (int)var2, (int)var4, (int)var6, 1, var8);
      }

      boolean var10 = false;
      if (qs.al() && this.l == null && this.case == 0) {
         za var11 = r.a(var8);
         if (var11 != null) {
            int var12 = qs.a((int)var2, (int)var4, (int)var6, 1);
            if (var11.a > 1) {
               this.case = var12 & 3;
            }

            if (var11.a == 2) {
               this.case = this.case / 2 * 3;
            }

            if (var11.if) {
               this.k = (var12 & 4) != 0;
            }

            var10 = true;
         }
      }

      double var37 = (double)var8.if(this.i * 16.0D);
      double var13 = (double)var8.if(this.h * 16.0D);
      double var15 = (double)var8.a(this.e * 16.0D);
      double var17 = (double)var8.a(this.d * 16.0D);
      double var19;
      if (this.k) {
         var19 = var37;
         var37 = var13;
         var13 = var19;
      }

      if (this.i < 0.0D || this.h > 1.0D) {
         var37 = (double)var8.a();
         var13 = (double)var8.byte();
      }

      if (this.e < 0.0D || this.d > 1.0D) {
         var15 = (double)var8.int();
         var17 = (double)var8.do();
      }

      var19 = var13;
      double var21 = var37;
      double var23 = var15;
      double var25 = var17;
      double var27;
      if (this.case == 1) {
         var37 = (double)var8.if(this.e * 16.0D);
         var15 = (double)var8.a(16.0D - this.h * 16.0D);
         var13 = (double)var8.if(this.d * 16.0D);
         var17 = (double)var8.a(16.0D - this.i * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var23 = var15;
         var25 = var17;
         var19 = var37;
         var21 = var13;
         var15 = var17;
         var17 = var23;
      } else if (this.case == 2) {
         var37 = (double)var8.if(16.0D - this.d * 16.0D);
         var15 = (double)var8.a(this.i * 16.0D);
         var13 = (double)var8.if(16.0D - this.e * 16.0D);
         var17 = (double)var8.a(this.h * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var19 = var13;
         var21 = var37;
         var37 = var13;
         var13 = var21;
         var23 = var17;
         var25 = var15;
      } else if (this.case == 3) {
         var37 = (double)var8.if(16.0D - this.i * 16.0D);
         var13 = (double)var8.if(16.0D - this.h * 16.0D);
         var15 = (double)var8.a(16.0D - this.e * 16.0D);
         var17 = (double)var8.a(16.0D - this.d * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var19 = var13;
         var21 = var37;
         var23 = var15;
         var25 = var17;
      }

      if (var10) {
         this.case = 0;
         this.k = false;
      }

      var27 = var2 + this.i;
      double var29 = var2 + this.h;
      double var31 = var4 + this.f;
      double var33 = var6 + this.e;
      double var35 = var6 + this.d;
      if (this.try) {
         var9.a(this.ab, this.U, this.M);
         var9.if(this.af);
         var9.a(var29, var31, var35, var13, var17);
         var9.a(this.aa, this.S, this.K);
         var9.if(this.ae);
         var9.a(var29, var31, var33, var19, var23);
         var9.a(this.Z, this.Q, this.I);
         var9.if(this.ad);
         var9.a(var27, var31, var33, var37, var15);
         var9.a(this.X, this.O, this.G);
         var9.if(this.ac);
         var9.a(var27, var31, var35, var21, var25);
      } else {
         var9.a(var29, var31, var35, var13, var17);
         var9.a(var29, var31, var33, var19, var23);
         var9.a(var27, var31, var33, var37, var15);
         var9.a(var27, var31, var35, var21, var25);
      }

   }

   public void a(pa var1, double var2, double var4, double var6, ajd var8) {
      c4 var9 = c4.G;
      if (this.if()) {
         var8 = this.l;
      }

      if (qs.aj() && this.l == null && this.long == 0) {
         var8 = e.if(this.o, var1, (int)var2, (int)var4, (int)var6, 2, var8);
      }

      boolean var10 = false;
      if (qs.al() && this.l == null && this.long == 0) {
         za var11 = r.a(var8);
         if (var11 != null) {
            int var12 = qs.a((int)var2, (int)var4, (int)var6, 2);
            if (var11.a > 1) {
               this.long = var12 & 3;
            }

            if (var11.a == 2) {
               this.long = this.long / 2 * 3;
            }

            if (var11.if) {
               this.k = (var12 & 4) != 0;
            }

            var10 = true;
         }
      }

      double var37 = (double)var8.if(this.i * 16.0D);
      double var13 = (double)var8.if(this.h * 16.0D);
      double var15 = (double)var8.a(16.0D - this.f * 16.0D);
      double var17 = (double)var8.a(16.0D - this.g * 16.0D);
      double var19;
      if (this.k) {
         var19 = var37;
         var37 = var13;
         var13 = var19;
      }

      if (this.i < 0.0D || this.h > 1.0D) {
         var37 = (double)var8.a();
         var13 = (double)var8.byte();
      }

      if (this.g < 0.0D || this.f > 1.0D) {
         var15 = (double)var8.int();
         var17 = (double)var8.do();
      }

      var19 = var13;
      double var21 = var37;
      double var23 = var15;
      double var25 = var17;
      double var27;
      if (this.long == 2) {
         var37 = (double)var8.if(this.g * 16.0D);
         var15 = (double)var8.a(16.0D - this.i * 16.0D);
         var13 = (double)var8.if(this.f * 16.0D);
         var17 = (double)var8.a(16.0D - this.h * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var23 = var15;
         var25 = var17;
         var19 = var37;
         var21 = var13;
         var15 = var17;
         var17 = var23;
      } else if (this.long == 1) {
         var37 = (double)var8.if(16.0D - this.f * 16.0D);
         var15 = (double)var8.a(this.h * 16.0D);
         var13 = (double)var8.if(16.0D - this.g * 16.0D);
         var17 = (double)var8.a(this.i * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var19 = var13;
         var21 = var37;
         var37 = var13;
         var13 = var21;
         var23 = var17;
         var25 = var15;
      } else if (this.long == 3) {
         var37 = (double)var8.if(16.0D - this.i * 16.0D);
         var13 = (double)var8.if(16.0D - this.h * 16.0D);
         var15 = (double)var8.a(this.f * 16.0D);
         var17 = (double)var8.a(this.g * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var19 = var13;
         var21 = var37;
         var23 = var15;
         var25 = var17;
      }

      if (var10) {
         this.long = 0;
         this.k = false;
      }

      var27 = var2 + this.i;
      double var29 = var2 + this.h;
      double var31 = var4 + this.g;
      double var33 = var4 + this.f;
      double var35 = var6 + this.e;
      if (this.try) {
         var9.a(this.ab, this.U, this.M);
         var9.if(this.af);
         var9.a(var27, var33, var35, var19, var23);
         var9.a(this.aa, this.S, this.K);
         var9.if(this.ae);
         var9.a(var29, var33, var35, var37, var15);
         var9.a(this.Z, this.Q, this.I);
         var9.if(this.ad);
         var9.a(var29, var31, var35, var21, var25);
         var9.a(this.X, this.O, this.G);
         var9.if(this.ac);
         var9.a(var27, var31, var35, var13, var17);
      } else {
         var9.a(var27, var33, var35, var19, var23);
         var9.a(var29, var33, var35, var37, var15);
         var9.a(var29, var31, var35, var21, var25);
         var9.a(var27, var31, var35, var13, var17);
      }

   }

   public void new(pa var1, double var2, double var4, double var6, ajd var8) {
      c4 var9 = c4.G;
      if (this.if()) {
         var8 = this.l;
      }

      if (qs.aj() && this.l == null && this.goto == 0) {
         var8 = e.if(this.o, var1, (int)var2, (int)var4, (int)var6, 3, var8);
      }

      boolean var10 = false;
      if (qs.al() && this.l == null && this.goto == 0) {
         za var11 = r.a(var8);
         if (var11 != null) {
            int var12 = qs.a((int)var2, (int)var4, (int)var6, 3);
            if (var11.a > 1) {
               this.goto = var12 & 3;
            }

            if (var11.a == 2) {
               this.goto = this.goto / 2 * 3;
            }

            if (var11.if) {
               this.k = (var12 & 4) != 0;
            }

            var10 = true;
         }
      }

      double var37 = (double)var8.if(this.i * 16.0D);
      double var13 = (double)var8.if(this.h * 16.0D);
      double var15 = (double)var8.a(16.0D - this.f * 16.0D);
      double var17 = (double)var8.a(16.0D - this.g * 16.0D);
      double var19;
      if (this.k) {
         var19 = var37;
         var37 = var13;
         var13 = var19;
      }

      if (this.i < 0.0D || this.h > 1.0D) {
         var37 = (double)var8.a();
         var13 = (double)var8.byte();
      }

      if (this.g < 0.0D || this.f > 1.0D) {
         var15 = (double)var8.int();
         var17 = (double)var8.do();
      }

      var19 = var13;
      double var21 = var37;
      double var23 = var15;
      double var25 = var17;
      double var27;
      if (this.goto == 1) {
         var37 = (double)var8.if(this.g * 16.0D);
         var17 = (double)var8.a(16.0D - this.i * 16.0D);
         var13 = (double)var8.if(this.f * 16.0D);
         var15 = (double)var8.a(16.0D - this.h * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var23 = var15;
         var25 = var17;
         var19 = var37;
         var21 = var13;
         var15 = var17;
         var17 = var23;
      } else if (this.goto == 2) {
         var37 = (double)var8.if(16.0D - this.f * 16.0D);
         var15 = (double)var8.a(this.i * 16.0D);
         var13 = (double)var8.if(16.0D - this.g * 16.0D);
         var17 = (double)var8.a(this.h * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var19 = var13;
         var21 = var37;
         var37 = var13;
         var13 = var21;
         var23 = var17;
         var25 = var15;
      } else if (this.goto == 3) {
         var37 = (double)var8.if(16.0D - this.i * 16.0D);
         var13 = (double)var8.if(16.0D - this.h * 16.0D);
         var15 = (double)var8.a(this.f * 16.0D);
         var17 = (double)var8.a(this.g * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var19 = var13;
         var21 = var37;
         var23 = var15;
         var25 = var17;
      }

      if (var10) {
         this.goto = 0;
         this.k = false;
      }

      var27 = var2 + this.i;
      double var29 = var2 + this.h;
      double var31 = var4 + this.g;
      double var33 = var4 + this.f;
      double var35 = var6 + this.d;
      if (this.try) {
         var9.a(this.ab, this.U, this.M);
         var9.if(this.af);
         var9.a(var27, var33, var35, var37, var15);
         var9.a(this.aa, this.S, this.K);
         var9.if(this.ae);
         var9.a(var27, var31, var35, var21, var25);
         var9.a(this.Z, this.Q, this.I);
         var9.if(this.ad);
         var9.a(var29, var31, var35, var13, var17);
         var9.a(this.X, this.O, this.G);
         var9.if(this.ac);
         var9.a(var29, var33, var35, var19, var23);
      } else {
         var9.a(var27, var33, var35, var37, var15);
         var9.a(var27, var31, var35, var21, var25);
         var9.a(var29, var31, var35, var13, var17);
         var9.a(var29, var33, var35, var19, var23);
      }

   }

   public void int(pa var1, double var2, double var4, double var6, ajd var8) {
      c4 var9 = c4.G;
      if (this.if()) {
         var8 = this.l;
      }

      if (qs.aj() && this.l == null && this.char == 0) {
         var8 = e.if(this.o, var1, (int)var2, (int)var4, (int)var6, 4, var8);
      }

      boolean var10 = false;
      if (qs.al() && this.l == null && this.char == 0) {
         za var11 = r.a(var8);
         if (var11 != null) {
            int var12 = qs.a((int)var2, (int)var4, (int)var6, 4);
            if (var11.a > 1) {
               this.char = var12 & 3;
            }

            if (var11.a == 2) {
               this.char = this.char / 2 * 3;
            }

            if (var11.if) {
               this.k = (var12 & 4) != 0;
            }

            var10 = true;
         }
      }

      double var37 = (double)var8.if(this.e * 16.0D);
      double var13 = (double)var8.if(this.d * 16.0D);
      double var15 = (double)var8.a(16.0D - this.f * 16.0D);
      double var17 = (double)var8.a(16.0D - this.g * 16.0D);
      double var19;
      if (this.k) {
         var19 = var37;
         var37 = var13;
         var13 = var19;
      }

      if (this.e < 0.0D || this.d > 1.0D) {
         var37 = (double)var8.a();
         var13 = (double)var8.byte();
      }

      if (this.g < 0.0D || this.f > 1.0D) {
         var15 = (double)var8.int();
         var17 = (double)var8.do();
      }

      var19 = var13;
      double var21 = var37;
      double var23 = var15;
      double var25 = var17;
      double var27;
      if (this.char == 1) {
         var37 = (double)var8.if(this.g * 16.0D);
         var15 = (double)var8.a(16.0D - this.d * 16.0D);
         var13 = (double)var8.if(this.f * 16.0D);
         var17 = (double)var8.a(16.0D - this.e * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var23 = var15;
         var25 = var17;
         var19 = var37;
         var21 = var13;
         var15 = var17;
         var17 = var23;
      } else if (this.char == 2) {
         var37 = (double)var8.if(16.0D - this.f * 16.0D);
         var15 = (double)var8.a(this.e * 16.0D);
         var13 = (double)var8.if(16.0D - this.g * 16.0D);
         var17 = (double)var8.a(this.d * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var19 = var13;
         var21 = var37;
         var37 = var13;
         var13 = var21;
         var23 = var17;
         var25 = var15;
      } else if (this.char == 3) {
         var37 = (double)var8.if(16.0D - this.e * 16.0D);
         var13 = (double)var8.if(16.0D - this.d * 16.0D);
         var15 = (double)var8.a(this.f * 16.0D);
         var17 = (double)var8.a(this.g * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var19 = var13;
         var21 = var37;
         var23 = var15;
         var25 = var17;
      }

      if (var10) {
         this.char = 0;
         this.k = false;
      }

      var27 = var2 + this.i;
      double var29 = var4 + this.g;
      double var31 = var4 + this.f;
      double var33 = var6 + this.e;
      double var35 = var6 + this.d;
      if (this.try) {
         var9.a(this.ab, this.U, this.M);
         var9.if(this.af);
         var9.a(var27, var31, var35, var19, var23);
         var9.a(this.aa, this.S, this.K);
         var9.if(this.ae);
         var9.a(var27, var31, var33, var37, var15);
         var9.a(this.Z, this.Q, this.I);
         var9.if(this.ad);
         var9.a(var27, var29, var33, var21, var25);
         var9.a(this.X, this.O, this.G);
         var9.if(this.ac);
         var9.a(var27, var29, var35, var13, var17);
      } else {
         var9.a(var27, var31, var35, var19, var23);
         var9.a(var27, var31, var33, var37, var15);
         var9.a(var27, var29, var33, var21, var25);
         var9.a(var27, var29, var35, var13, var17);
      }

   }

   public void for(pa var1, double var2, double var4, double var6, ajd var8) {
      c4 var9 = c4.G;
      if (this.if()) {
         var8 = this.l;
      }

      if (qs.aj() && this.l == null && this.else == 0) {
         var8 = e.if(this.o, var1, (int)var2, (int)var4, (int)var6, 5, var8);
      }

      boolean var10 = false;
      if (qs.al() && this.l == null && this.else == 0) {
         za var11 = r.a(var8);
         if (var11 != null) {
            int var12 = qs.a((int)var2, (int)var4, (int)var6, 5);
            if (var11.a > 1) {
               this.else = var12 & 3;
            }

            if (var11.a == 2) {
               this.else = this.else / 2 * 3;
            }

            if (var11.if) {
               this.k = (var12 & 4) != 0;
            }

            var10 = true;
         }
      }

      double var37 = (double)var8.if(this.e * 16.0D);
      double var13 = (double)var8.if(this.d * 16.0D);
      double var15 = (double)var8.a(16.0D - this.f * 16.0D);
      double var17 = (double)var8.a(16.0D - this.g * 16.0D);
      double var19;
      if (this.k) {
         var19 = var37;
         var37 = var13;
         var13 = var19;
      }

      if (this.e < 0.0D || this.d > 1.0D) {
         var37 = (double)var8.a();
         var13 = (double)var8.byte();
      }

      if (this.g < 0.0D || this.f > 1.0D) {
         var15 = (double)var8.int();
         var17 = (double)var8.do();
      }

      var19 = var13;
      double var21 = var37;
      double var23 = var15;
      double var25 = var17;
      double var27;
      if (this.else == 2) {
         var37 = (double)var8.if(this.g * 16.0D);
         var15 = (double)var8.a(16.0D - this.e * 16.0D);
         var13 = (double)var8.if(this.f * 16.0D);
         var17 = (double)var8.a(16.0D - this.d * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var23 = var15;
         var25 = var17;
         var19 = var37;
         var21 = var13;
         var15 = var17;
         var17 = var23;
      } else if (this.else == 1) {
         var37 = (double)var8.if(16.0D - this.f * 16.0D);
         var15 = (double)var8.a(this.d * 16.0D);
         var13 = (double)var8.if(16.0D - this.g * 16.0D);
         var17 = (double)var8.a(this.e * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var19 = var13;
         var21 = var37;
         var37 = var13;
         var13 = var21;
         var23 = var17;
         var25 = var15;
      } else if (this.else == 3) {
         var37 = (double)var8.if(16.0D - this.e * 16.0D);
         var13 = (double)var8.if(16.0D - this.d * 16.0D);
         var15 = (double)var8.a(this.f * 16.0D);
         var17 = (double)var8.a(this.g * 16.0D);
         if (this.k) {
            var27 = var37;
            var37 = var13;
            var13 = var27;
         }

         var19 = var13;
         var21 = var37;
         var23 = var15;
         var25 = var17;
      }

      if (var10) {
         this.else = 0;
         this.k = false;
      }

      var27 = var2 + this.h;
      double var29 = var4 + this.g;
      double var31 = var4 + this.f;
      double var33 = var6 + this.e;
      double var35 = var6 + this.d;
      if (this.try) {
         var9.a(this.ab, this.U, this.M);
         var9.if(this.af);
         var9.a(var27, var29, var35, var21, var25);
         var9.a(this.aa, this.S, this.K);
         var9.if(this.ae);
         var9.a(var27, var29, var33, var13, var17);
         var9.a(this.Z, this.Q, this.I);
         var9.if(this.ad);
         var9.a(var27, var31, var33, var19, var23);
         var9.a(this.X, this.O, this.G);
         var9.if(this.ac);
         var9.a(var27, var31, var35, var37, var15);
      } else {
         var9.a(var27, var29, var35, var21, var25);
         var9.a(var27, var29, var33, var13, var17);
         var9.a(var27, var31, var33, var19, var23);
         var9.a(var27, var31, var35, var37, var15);
      }

   }

   public void a(pa var1, int var2, float var3) {
      c4 var4 = c4.G;
      boolean var5 = var1.void == pa.i.void;
      if (var1 == pa.au || var1 == pa.b || var1 == pa.cr) {
         var2 = 3;
      }

      int var6;
      float var7;
      float var8;
      float var9;
      if (this.m) {
         var6 = var1.a(var2);
         if (var5) {
            var6 = 16777215;
         }

         var7 = (float)(var6 >> 16 & 255) / 255.0F;
         var8 = (float)(var6 >> 8 & 255) / 255.0F;
         var9 = (float)(var6 & 255) / 255.0F;
         GL11.glColor4f(var7 * var3, var8 * var3, var9 * var3, 1.0F);
      }

      var6 = var1.new();
      this.if(var1);
      int var10;
      if (var6 != 0 && var6 != 31 && var6 != 39 && var6 != 16 && var6 != 26) {
         if (var6 == 1) {
            var4.if();
            var4.do(0.0F, -1.0F, 0.0F);
            this.a(var1, var2, -0.5D, -0.5D, -0.5D, 1.0F);
            var4.for();
         } else if (var6 == 19) {
            var4.if();
            var4.do(0.0F, -1.0F, 0.0F);
            var1.try();
            this.a(var1, var2, this.f, -0.5D, -0.5D, -0.5D);
            var4.for();
         } else if (var6 == 23) {
            var4.if();
            var4.do(0.0F, -1.0F, 0.0F);
            var1.try();
            var4.for();
         } else if (var6 == 13) {
            var1.try();
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            var7 = 0.0625F;
            var4.if();
            var4.do(0.0F, -1.0F, 0.0F);
            this.do(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 0));
            var4.for();
            var4.if();
            var4.do(0.0F, 1.0F, 0.0F);
            this.if(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 1));
            var4.for();
            var4.if();
            var4.do(0.0F, 0.0F, -1.0F);
            var4.if(0.0F, 0.0F, var7);
            this.a(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 2));
            var4.if(0.0F, 0.0F, -var7);
            var4.for();
            var4.if();
            var4.do(0.0F, 0.0F, 1.0F);
            var4.if(0.0F, 0.0F, -var7);
            this.new(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 3));
            var4.if(0.0F, 0.0F, var7);
            var4.for();
            var4.if();
            var4.do(-1.0F, 0.0F, 0.0F);
            var4.if(var7, 0.0F, 0.0F);
            this.int(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 4));
            var4.if(-var7, 0.0F, 0.0F);
            var4.for();
            var4.if();
            var4.do(1.0F, 0.0F, 0.0F);
            var4.if(-var7, 0.0F, 0.0F);
            this.for(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 5));
            var4.if(var7, 0.0F, 0.0F);
            var4.for();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         } else if (var6 == 22) {
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            di.if.a(var1, var2, var3);
            GL11.glEnable(32826);
         } else if (var6 == 6) {
            var4.if();
            var4.do(0.0F, -1.0F, 0.0F);
            this.a(var1, var2, -0.5D, -0.5D, -0.5D);
            var4.for();
         } else if (var6 == 2) {
            var4.if();
            var4.do(0.0F, -1.0F, 0.0F);
            this.a(var1, -0.5D, -0.5D, -0.5D, 0.0D, 0.0D, 0);
            var4.for();
         } else if (var6 == 10) {
            for(var10 = 0; var10 < 2; ++var10) {
               if (var10 == 0) {
                  this.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.5D);
               }

               if (var10 == 1) {
                  this.a(0.0D, 0.0D, 0.5D, 1.0D, 0.5D, 1.0D);
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.if();
               var4.do(0.0F, -1.0F, 0.0F);
               this.do(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 0));
               var4.for();
               var4.if();
               var4.do(0.0F, 1.0F, 0.0F);
               this.if(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 1));
               var4.for();
               var4.if();
               var4.do(0.0F, 0.0F, -1.0F);
               this.a(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 2));
               var4.for();
               var4.if();
               var4.do(0.0F, 0.0F, 1.0F);
               this.new(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 3));
               var4.for();
               var4.if();
               var4.do(-1.0F, 0.0F, 0.0F);
               this.int(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 4));
               var4.for();
               var4.if();
               var4.do(1.0F, 0.0F, 0.0F);
               this.for(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 5));
               var4.for();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }
         } else if (var6 == 27) {
            var10 = 0;
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            var4.if();

            for(int var17 = 0; var17 < 8; ++var17) {
               byte var12 = 0;
               byte var13 = 1;
               if (var17 == 0) {
                  var12 = 2;
               }

               if (var17 == 1) {
                  var12 = 3;
               }

               if (var17 == 2) {
                  var12 = 4;
               }

               if (var17 == 3) {
                  var12 = 5;
                  var13 = 2;
               }

               if (var17 == 4) {
                  var12 = 6;
                  var13 = 3;
               }

               if (var17 == 5) {
                  var12 = 7;
                  var13 = 5;
               }

               if (var17 == 6) {
                  var12 = 6;
                  var13 = 2;
               }

               if (var17 == 7) {
                  var12 = 3;
               }

               float var14 = (float)var12 / 16.0F;
               float var15 = 1.0F - (float)var10 / 16.0F;
               float var16 = 1.0F - (float)(var10 + var13) / 16.0F;
               var10 += var13;
               this.a((double)(0.5F - var14), (double)var16, (double)(0.5F - var14), (double)(0.5F + var14), (double)var15, (double)(0.5F + var14));
               var4.do(0.0F, -1.0F, 0.0F);
               this.do(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 0));
               var4.do(0.0F, 1.0F, 0.0F);
               this.if(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 1));
               var4.do(0.0F, 0.0F, -1.0F);
               this.a(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 2));
               var4.do(0.0F, 0.0F, 1.0F);
               this.new(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 3));
               var4.do(-1.0F, 0.0F, 0.0F);
               this.int(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 4));
               var4.do(1.0F, 0.0F, 0.0F);
               this.for(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 5));
            }

            var4.for();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            this.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
         } else if (var6 == 11) {
            for(var10 = 0; var10 < 4; ++var10) {
               var8 = 0.125F;
               if (var10 == 0) {
                  this.a((double)(0.5F - var8), 0.0D, 0.0D, (double)(0.5F + var8), 1.0D, (double)(var8 * 2.0F));
               }

               if (var10 == 1) {
                  this.a((double)(0.5F - var8), 0.0D, (double)(1.0F - var8 * 2.0F), (double)(0.5F + var8), 1.0D, 1.0D);
               }

               var8 = 0.0625F;
               if (var10 == 2) {
                  this.a((double)(0.5F - var8), (double)(1.0F - var8 * 3.0F), (double)(-var8 * 2.0F), (double)(0.5F + var8), (double)(1.0F - var8), (double)(1.0F + var8 * 2.0F));
               }

               if (var10 == 3) {
                  this.a((double)(0.5F - var8), (double)(0.5F - var8 * 3.0F), (double)(-var8 * 2.0F), (double)(0.5F + var8), (double)(0.5F - var8), (double)(1.0F + var8 * 2.0F));
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.if();
               var4.do(0.0F, -1.0F, 0.0F);
               this.do(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 0));
               var4.for();
               var4.if();
               var4.do(0.0F, 1.0F, 0.0F);
               this.if(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 1));
               var4.for();
               var4.if();
               var4.do(0.0F, 0.0F, -1.0F);
               this.a(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 2));
               var4.for();
               var4.if();
               var4.do(0.0F, 0.0F, 1.0F);
               this.new(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 3));
               var4.for();
               var4.if();
               var4.do(-1.0F, 0.0F, 0.0F);
               this.int(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 4));
               var4.for();
               var4.if();
               var4.do(1.0F, 0.0F, 0.0F);
               this.for(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 5));
               var4.for();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }

            this.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
         } else if (var6 == 21) {
            for(var10 = 0; var10 < 3; ++var10) {
               var8 = 0.0625F;
               if (var10 == 0) {
                  this.a((double)(0.5F - var8), 0.30000001192092896D, 0.0D, (double)(0.5F + var8), 1.0D, (double)(var8 * 2.0F));
               }

               if (var10 == 1) {
                  this.a((double)(0.5F - var8), 0.30000001192092896D, (double)(1.0F - var8 * 2.0F), (double)(0.5F + var8), 1.0D, 1.0D);
               }

               var8 = 0.0625F;
               if (var10 == 2) {
                  this.a((double)(0.5F - var8), 0.5D, 0.0D, (double)(0.5F + var8), (double)(1.0F - var8), 1.0D);
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.if();
               var4.do(0.0F, -1.0F, 0.0F);
               this.do(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 0));
               var4.for();
               var4.if();
               var4.do(0.0F, 1.0F, 0.0F);
               this.if(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 1));
               var4.for();
               var4.if();
               var4.do(0.0F, 0.0F, -1.0F);
               this.a(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 2));
               var4.for();
               var4.if();
               var4.do(0.0F, 0.0F, 1.0F);
               this.new(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 3));
               var4.for();
               var4.if();
               var4.do(-1.0F, 0.0F, 0.0F);
               this.int(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 4));
               var4.for();
               var4.if();
               var4.do(1.0F, 0.0F, 0.0F);
               this.for(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 5));
               var4.for();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }
         } else if (var6 == 32) {
            for(var10 = 0; var10 < 2; ++var10) {
               if (var10 == 0) {
                  this.a(0.0D, 0.0D, 0.3125D, 1.0D, 0.8125D, 0.6875D);
               }

               if (var10 == 1) {
                  this.a(0.25D, 0.0D, 0.25D, 0.75D, 1.0D, 0.75D);
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.if();
               var4.do(0.0F, -1.0F, 0.0F);
               this.do(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 0, var2));
               var4.for();
               var4.if();
               var4.do(0.0F, 1.0F, 0.0F);
               this.if(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 1, var2));
               var4.for();
               var4.if();
               var4.do(0.0F, 0.0F, -1.0F);
               this.a(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 2, var2));
               var4.for();
               var4.if();
               var4.do(0.0F, 0.0F, 1.0F);
               this.new(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 3, var2));
               var4.for();
               var4.if();
               var4.do(-1.0F, 0.0F, 0.0F);
               this.int(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 4, var2));
               var4.for();
               var4.if();
               var4.do(1.0F, 0.0F, 0.0F);
               this.for(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 5, var2));
               var4.for();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }

            this.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
         } else if (var6 == 35) {
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            this.a((r9)((r9)var1), 0, 0, 0, var2, true);
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         } else if (var6 == 34) {
            for(var10 = 0; var10 < 3; ++var10) {
               if (var10 == 0) {
                  this.a(0.125D, 0.0D, 0.125D, 0.875D, 0.1875D, 0.875D);
                  this.if(this.a(pa.bs));
               } else if (var10 == 1) {
                  this.a(0.1875D, 0.1875D, 0.1875D, 0.8125D, 0.875D, 0.8125D);
                  this.if(pa.M.z());
               } else if (var10 == 2) {
                  this.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
                  this.if(this.a(pa.aD));
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.if();
               var4.do(0.0F, -1.0F, 0.0F);
               this.do(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 0, var2));
               var4.for();
               var4.if();
               var4.do(0.0F, 1.0F, 0.0F);
               this.if(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 1, var2));
               var4.for();
               var4.if();
               var4.do(0.0F, 0.0F, -1.0F);
               this.a(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 2, var2));
               var4.for();
               var4.if();
               var4.do(0.0F, 0.0F, 1.0F);
               this.new(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 3, var2));
               var4.for();
               var4.if();
               var4.do(-1.0F, 0.0F, 0.0F);
               this.int(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 4, var2));
               var4.for();
               var4.if();
               var4.do(1.0F, 0.0F, 0.0F);
               this.for(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 5, var2));
               var4.for();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }

            this.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
            this.a();
         } else if (var6 == 38) {
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            this.a((qv)((qv)var1), 0, 0, 0, 0, true);
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         } else if (vf.H.do()) {
            vf.do(vf.L, this, var1, var2, var6);
         } else if (vf.x.do()) {
            vf.do(vf.E, this, var1, var2, var6);
         }
      } else {
         if (var6 == 16) {
            var2 = 1;
         }

         var1.try();
         this.if(var1);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         var4.if();
         var4.do(0.0F, -1.0F, 0.0F);
         this.do(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 0, var2));
         var4.for();
         if (var5 && this.m) {
            var10 = var1.a(var2);
            var8 = (float)(var10 >> 16 & 255) / 255.0F;
            var9 = (float)(var10 >> 8 & 255) / 255.0F;
            float var11 = (float)(var10 & 255) / 255.0F;
            GL11.glColor4f(var8 * var3, var9 * var3, var11 * var3, 1.0F);
         }

         var4.if();
         var4.do(0.0F, 1.0F, 0.0F);
         this.if(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 1, var2));
         var4.for();
         if (var5 && this.m) {
            GL11.glColor4f(var3, var3, var3, 1.0F);
         }

         var4.if();
         var4.do(0.0F, 0.0F, -1.0F);
         this.a(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 2, var2));
         var4.for();
         var4.if();
         var4.do(0.0F, 0.0F, 1.0F);
         this.new(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 3, var2));
         var4.for();
         var4.if();
         var4.do(-1.0F, 0.0F, 0.0F);
         this.int(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 4, var2));
         var4.for();
         var4.if();
         var4.do(1.0F, 0.0F, 0.0F);
         this.for(var1, 0.0D, 0.0D, 0.0D, this.a(var1, 5, var2));
         var4.for();
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      }

   }

   public static boolean a(int var0) {
      switch(var0) {
      case 0:
      case 10:
      case 11:
      case 13:
      case 16:
      case 21:
      case 22:
      case 26:
      case 27:
      case 31:
      case 32:
      case 34:
      case 35:
      case 39:
         return true;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 12:
      case 14:
      case 15:
      case 17:
      case 18:
      case 19:
      case 20:
      case 23:
      case 24:
      case 25:
      case 28:
      case 29:
      case 30:
      case 33:
      case 36:
      case 37:
      case 38:
      default:
         return vf.H.do() ? vf.int(vf.u, var0) : (vf.x.do() ? vf.int(vf.C, var0) : false);
      }
   }

   public ajd a(pa var1, yy var2, int var3, int var4, int var5, int var6) {
      return this.a(var1.if(var2, var3, var4, var5, var6));
   }

   public ajd a(pa var1, int var2, int var3) {
      return this.a(var1.if(var2, var3));
   }

   public ajd a(pa var1, int var2) {
      return this.a(var1.do(var2));
   }

   public ajd a(pa var1) {
      return this.a(var1.do(1));
   }

   public ajd a(ajd var1) {
      return var1 == null ? this.void.vb.a(0) : var1;
   }

   private void f(pa var1, int var2, int var3, int var4) {
   }

   private float a(yy var1, int var2, int var3, int var4) {
      pa var5 = pa.x[var1.new(var2, var3, var4)];
      return var5 == null ? 1.0F : (var5.getClass() == q3.class ? 1.0F : (var5.at.void() && var5.if() ? this.a : 1.0F));
   }

   private ajd a(ajd var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      if (var1 == ct.I || var1 == ct.C) {
         var1 = qs.a(this.o, var2, var3, var4, var5, var1);
         if (var1 == ct.void) {
            this.ab *= var6;
            this.aa *= var6;
            this.Z *= var6;
            this.X *= var6;
            this.U *= var7;
            this.S *= var7;
            this.Q *= var7;
            this.O *= var7;
            this.M *= var8;
            this.K *= var8;
            this.I *= var8;
            this.G *= var8;
         }
      }

      if (var1 == ct.q) {
         var1 = qs.a(this.o, var2, var3, var4, var5);
      }

      return var1;
   }

   private boolean a(int var1, int var2, int var3) {
      int var4 = pa.ca.void;
      return this.o.new(var1 - 1, var2, var3) != var4 && this.o.new(var1 + 1, var2, var3) != var4 && this.o.new(var1, var2, var3 - 1) != var4 && this.o.new(var1, var2, var3 + 1) != var4 ? false : this.o.do(var1, var2 - 1, var3);
   }

   private void a(int var1, int var2, int var3, double var4) {
      this.if(pa.ca);
      this.f = var4;
      this.for(pa.ca, var1, var2, var3);
   }
}
