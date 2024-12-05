import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ARBOcclusionQuery;
import org.lwjgl.opengl.GL11;

public class c9 implements y1 {
   public List N = new ArrayList();
   public ex G;
   public final c3 F;
   public h E = new h(100, 0.8F);
   private dm[] D;
   private dm[] C;
   private int B;
   private int A;
   private int z;
   private int y;
   public Minecraft x;
   public c2 w;
   private IntBuffer v;
   private boolean u = false;
   private int t = 0;
   private int s;
   private int r;
   private int q;
   private int p;
   private int o;
   private int h;
   private int g;
   private int f;
   private int e;
   public Map d = new HashMap();
   private ajd[] c;
   private int void = -1;
   private int long = 2;
   private int goto;
   private int else;
   private int char;
   int[] M = new int['썐'];
   IntBuffer L = k0.do(64);
   private int case;
   private int byte;
   private int try;
   private int new;
   private int int;
   private int for;
   private int do;
   private IntBuffer l = BufferUtils.createIntBuffer(65536);
   double K = -9999.0D;
   double J = -9999.0D;
   double I = -9999.0D;
   int H = 0;
   double k;
   double j;
   double i;
   public aiw m;
   private long n = System.currentTimeMillis();
   private long b = System.currentTimeMillis();

   public c9(Minecraft var1, c3 var2) {
      this.x = var1;
      this.F = var2;
      byte var3 = 65;
      byte var4 = 16;
      this.y = k0.a(var3 * var3 * var4 * 3);
      this.u = kf.a();
      if (this.u) {
         this.L.clear();
         this.v = k0.do(var3 * var3 * var4);
         this.v.clear();
         this.v.position(0);
         this.v.limit(var3 * var3 * var4);
         ARBOcclusionQuery.glGenQueriesARB(this.v);
      }

      this.s = k0.a(3);
      GL11.glPushMatrix();
      GL11.glNewList(this.s, 4864);
      this.do();
      GL11.glEndList();
      GL11.glPopMatrix();
      c4 var5 = c4.G;
      this.r = this.s + 1;
      GL11.glNewList(this.r, 4864);
      byte var6 = 64;
      int var7 = 256 / var6 + 2;
      float var8 = 16.0F;

      int var9;
      int var10;
      for(var9 = -var6 * var7; var9 <= var6 * var7; var9 += var6) {
         for(var10 = -var6 * var7; var10 <= var6 * var7; var10 += var6) {
            var5.if();
            var5.if((double)(var9 + 0), (double)var8, (double)(var10 + 0));
            var5.if((double)(var9 + var6), (double)var8, (double)(var10 + 0));
            var5.if((double)(var9 + var6), (double)var8, (double)(var10 + var6));
            var5.if((double)(var9 + 0), (double)var8, (double)(var10 + var6));
            var5.for();
         }
      }

      GL11.glEndList();
      this.q = this.s + 2;
      GL11.glNewList(this.q, 4864);
      var8 = -16.0F;
      var5.if();

      for(var9 = -var6 * var7; var9 <= var6 * var7; var9 += var6) {
         for(var10 = -var6 * var7; var10 <= var6 * var7; var10 += var6) {
            var5.if((double)(var9 + var6), (double)var8, (double)(var10 + 0));
            var5.if((double)(var9 + 0), (double)var8, (double)(var10 + 0));
            var5.if((double)(var9 + 0), (double)var8, (double)(var10 + var6));
            var5.if((double)(var9 + var6), (double)var8, (double)(var10 + var6));
         }
      }

      var5.for();
      GL11.glEndList();
      this.F.int();
   }

   private void do() {
      Random var1 = new Random(10842L);
      c4 var2 = c4.G;
      var2.if();

      for(int var3 = 0; var3 < 1500; ++var3) {
         double var4 = (double)(var1.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(var1.nextFloat() * 2.0F - 1.0F);
         double var8 = (double)(var1.nextFloat() * 2.0F - 1.0F);
         double var10 = (double)(0.15F + var1.nextFloat() * 0.1F);
         double var12 = var4 * var4 + var6 * var6 + var8 * var8;
         if (var12 < 1.0D && var12 > 0.01D) {
            var12 = 1.0D / Math.sqrt(var12);
            var4 *= var12;
            var6 *= var12;
            var8 *= var12;
            double var14 = var4 * 100.0D;
            double var16 = var6 * 100.0D;
            double var18 = var8 * 100.0D;
            double var20 = Math.atan2(var4, var8);
            double var22 = Math.sin(var20);
            double var24 = Math.cos(var20);
            double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
            double var28 = Math.sin(var26);
            double var30 = Math.cos(var26);
            double var32 = var1.nextDouble() * 3.141592653589793D * 2.0D;
            double var34 = Math.sin(var32);
            double var36 = Math.cos(var32);

            for(int var38 = 0; var38 < 4; ++var38) {
               double var39 = 0.0D;
               double var41 = (double)((var38 & 2) - 1) * var10;
               double var43 = (double)((var38 + 1 & 2) - 1) * var10;
               double var45 = var41 * var36 - var43 * var34;
               double var47 = var43 * var36 + var41 * var34;
               double var49 = var45 * var28 + var39 * var30;
               double var51 = var39 * var28 - var45 * var30;
               double var53 = var51 * var22 - var47 * var24;
               double var55 = var47 * var22 + var51 * var24;
               var2.if(var14 + var53, var16 + var49, var18 + var55);
            }
         }
      }

      var2.for();
   }

   public void a(ex var1) {
      if (this.G != null) {
         this.G.if((y1)this);
      }

      this.K = -9999.0D;
      this.J = -9999.0D;
      this.I = -9999.0D;
      cl.e.a((y6)var1);
      this.G = var1;
      this.w = new c2(var1);
      if (var1 != null) {
         var1.a((y1)this);
         this.case();
      }

   }

   public void case() {
      if (this.G != null) {
         pa.aJ.if(qs.e());
         this.void = this.x.u1.al;
         int var1;
         if (this.C != null) {
            for(var1 = 0; var1 < this.C.length; ++var1) {
               this.C[var1].try();
            }
         }

         var1 = 64 << 3 - this.void;
         short var2 = 512;
         var1 = 2 * this.x.u1.B;
         if (qs.I() && var1 < var2) {
            var1 = var2;
         }

         var1 += qs.K() * 2 * 16;
         short var3 = 400;
         if (this.x.u1.B > 256) {
            var3 = 1024;
         }

         if (var1 > var3) {
            var1 = var3;
         }

         this.k = -9999.0D;
         this.j = -9999.0D;
         this.i = -9999.0D;
         this.B = var1 / 16 + 1;
         this.A = 16;
         this.z = var1 / 16 + 1;
         this.C = new dm[this.B * this.A * this.z];
         this.D = new dm[this.B * this.A * this.z];
         int var4 = 0;
         int var5 = 0;
         this.p = 0;
         this.o = 0;
         this.h = 0;
         this.g = this.B;
         this.f = this.A;
         this.e = this.z;

         int var6;
         for(var6 = 0; var6 < this.E.do(); ++var6) {
            dm var7 = (dm)this.E.if(var6);
            if (var7 != null) {
               var7.f = false;
            }
         }

         this.E.a();
         this.N.clear();

         for(var6 = 0; var6 < this.B; ++var6) {
            for(int var10 = 0; var10 < this.A; ++var10) {
               for(int var8 = 0; var8 < this.z; ++var8) {
                  int var9 = (var8 * this.A + var10) * this.B + var6;
                  this.C[var9] = ajt.a(this.G, this.N, var6 * 16, var10 * 16, var8 * 16, this.y + var4);
                  if (this.u) {
                     this.C[var9].void = this.v.get(var5);
                  }

                  this.C[var9].b = false;
                  this.C[var9].c = true;
                  this.C[var9].k = false;
                  this.C[var9].d = var5++;
                  this.D[var9] = this.C[var9];
                  if (this.G.for(var6, var8)) {
                     this.C[var9].a();
                     this.E.if(this.C[var9]);
                  }

                  var4 += 3;
               }
            }
         }

         if (this.G != null) {
            Object var11 = this.x.vj;
            if (var11 == null) {
               var11 = this.x.vk;
            }

            if (var11 != null) {
               this.do(ajs.a(((aig)var11).al), ajs.a(((aig)var11).ak), ajs.a(((aig)var11).aj));
               Arrays.sort(this.D, new dj((aiw)var11));
            }
         }

         this.long = 2;
      }

   }

   public void a(nr var1, c1 var2, float var3) {
      if (this.long > 0) {
         --this.long;
      } else {
         this.G.e.a("prepare");
         az.void.a(this.G, this.F, this.x.va, this.x.vj, var3);
         cl.e.a(this.G, this.F, this.x.va, this.x.vj, this.x.vi, this.x.u1, var3);
         this.goto = 0;
         this.else = 0;
         this.char = 0;
         aig var4 = this.x.vj;
         cl.d = var4.aJ + (var4.al - var4.aJ) * (double)var3;
         cl.c = var4.aI + (var4.ak - var4.aI) * (double)var3;
         cl.b = var4.aH + (var4.aj - var4.aH) * (double)var3;
         az.long = var4.aJ + (var4.al - var4.aJ) * (double)var3;
         az.goto = var4.aI + (var4.ak - var4.aI) * (double)var3;
         az.else = var4.aH + (var4.aj - var4.aH) * (double)var3;
         this.x.u6.a((double)var3);
         this.G.e.do("global");
         List var5 = this.G.int();
         this.goto = var5.size();

         int var6;
         aiw var7;
         for(var6 = 0; var6 < this.G.y.size(); ++var6) {
            var7 = (aiw)this.G.y.get(var6);
            ++this.else;
            if (var7.a(var1)) {
               cl.e.a(var7, var3);
            }
         }

         this.G.e.do("entities");
         boolean var8 = this.x.u1.ag;
         this.x.u1.ag = qs.ai();

         for(var6 = 0; var6 < var5.size(); ++var6) {
            var7 = (aiw)var5.get(var6);
            if (var7.a(var1) && (var7.bb || var2.a(var7.aZ) || var7.as == this.x.vk) && (var7 != this.x.vj || this.x.u1.bo != 0 || this.x.vj.cg()) && this.G.p(ajs.a(var7.al), 0, ajs.a(var7.aj))) {
               ++this.else;
               if (var7.getClass() == aih.class) {
                  var7.au = 0.06D;
               }

               this.m = var7;
               cl.e.a(var7, var3);
               this.m = null;
            }
         }

         this.x.u1.ag = var8;
         this.G.e.do("tileentities");
         k1.if();

         for(var6 = 0; var6 < this.N.size(); ++var6) {
            n4 var9 = (n4)this.N.get(var6);
            Class var10 = var9.getClass();
            if (var10 == n7.class && !qs.k) {
               eu var11 = this.x.vk;
               double var12 = var9.a(var11.al, var11.ak, var11.aj);
               if (var12 > 256.0D) {
                  jq var14 = az.void.a();
                  var14.a = false;
                  az.void.a(var9, var3);
                  var14.a = true;
                  continue;
               }
            }

            if (var10 == om.class) {
               int var15 = this.G.new(var9.new, var9.int, var9.for);
               pa var16 = pa.x[var15];
               if (!(var16 instanceof ru)) {
                  continue;
               }
            }

            az.void.a(var9, var3);
         }

         this.x.u6.if((double)var3);
         this.G.e.if();
      }

   }

   public String int() {
      return "C: " + this.new + "/" + this.case + ". F: " + this.byte + ", O: " + this.try + ", E: " + this.int;
   }

   public String a() {
      return "E: " + this.else + "/" + this.goto + ". B: " + this.char + ", I: " + (this.goto - this.char - this.else) + ", " + qs.L();
   }

   private void do(int var1, int var2, int var3) {
      var1 -= 8;
      var2 -= 8;
      var3 -= 8;
      this.p = Integer.MAX_VALUE;
      this.o = Integer.MAX_VALUE;
      this.h = Integer.MAX_VALUE;
      this.g = Integer.MIN_VALUE;
      this.f = Integer.MIN_VALUE;
      this.e = Integer.MIN_VALUE;
      int var4 = this.B * 16;
      int var5 = var4 / 2;

      for(int var6 = 0; var6 < this.B; ++var6) {
         int var7 = var6 * 16;
         int var8 = var7 + var5 - var1;
         if (var8 < 0) {
            var8 -= var4 - 1;
         }

         var8 /= var4;
         var7 -= var8 * var4;
         if (var7 < this.p) {
            this.p = var7;
         }

         if (var7 > this.g) {
            this.g = var7;
         }

         for(int var9 = 0; var9 < this.z; ++var9) {
            int var10 = var9 * 16;
            int var11 = var10 + var5 - var3;
            if (var11 < 0) {
               var11 -= var4 - 1;
            }

            var11 /= var4;
            var10 -= var11 * var4;
            if (var10 < this.h) {
               this.h = var10;
            }

            if (var10 > this.e) {
               this.e = var10;
            }

            for(int var12 = 0; var12 < this.A; ++var12) {
               int var13 = var12 * 16;
               if (var13 < this.o) {
                  this.o = var13;
               }

               if (var13 > this.f) {
                  this.f = var13;
               }

               dm var14 = this.C[(var9 * this.A + var12) * this.B + var6];
               boolean var15 = var14.f;
               var14.a(var7, var13, var10);
               if (!var15 && var14.f) {
                  this.E.if(var14);
               }
            }
         }
      }

   }

   public int a(aig var1, int var2, double var3) {
      ajq var5 = this.G.e;
      var5.a("sortchunks");
      if (this.E.do() < 10) {
         byte var6 = 10;

         for(int var7 = 0; var7 < var6; ++var7) {
            this.do = (this.do + 1) % this.C.length;
            dm var8 = this.C[this.do];
            if (var8.f && !this.E.a(var8)) {
               this.E.if(var8);
            }
         }
      }

      if (this.x.u1.al != this.void && !qs.I()) {
         this.case();
      }

      if (var2 == 0) {
         this.case = 0;
         this.for = 0;
         this.byte = 0;
         this.try = 0;
         this.new = 0;
         this.int = 0;
      }

      double var41 = var1.aJ + (var1.al - var1.aJ) * var3;
      double var42 = var1.aI + (var1.ak - var1.aI) * var3;
      double var10 = var1.aH + (var1.aj - var1.aH) * var3;
      double var12 = var1.al - this.K;
      double var14 = var1.ak - this.J;
      double var16 = var1.aj - this.I;
      double var18 = var12 * var12 + var14 * var14 + var16 * var16;
      int var20;
      int var29;
      if (var18 > 16.0D) {
         this.K = var1.al;
         this.J = var1.ak;
         this.I = var1.aj;
         var20 = qs.K() * 16;
         double var21 = var1.al - this.k;
         double var23 = var1.ak - this.j;
         double var25 = var1.aj - this.i;
         double var27 = var21 * var21 + var23 * var23 + var25 * var25;
         if (var27 > (double)(var20 * var20) + 16.0D) {
            this.k = var1.al;
            this.j = var1.ak;
            this.i = var1.aj;
            this.do(ajs.a(var1.al), ajs.a(var1.ak), ajs.a(var1.aj));
         }

         Arrays.sort(this.D, new dj(var1));
         var29 = (int)var1.al;
         int var30 = (int)var1.aj;
         short var31 = 2000;
         if (Math.abs(var29 - dm.a) > var31 || Math.abs(var30 - dm.x) > var31) {
            dm.a = var29;
            dm.x = var30;
            this.case();
         }
      }

      k1.do();
      ajt.a(this, var1);
      if (this.x.u1.x && var2 == 0) {
         GL11.glFinish();
      }

      byte var43 = 0;
      int var22 = 0;
      if (this.u && this.x.u1.ai && !this.x.u1.aj && var2 == 0) {
         byte var44 = 0;
         byte var24 = 20;
         this.a(var44, var24, var1.al, var1.ak, var1.aj);

         int var45;
         for(var45 = var44; var45 < var24; ++var45) {
            this.D[var45].c = true;
         }

         var5.do("render");
         var20 = var43 + this.a(var44, var24, var2, var3);
         var45 = var24;
         int var26 = 0;
         byte var46 = 40;

         int var28;
         for(var29 = this.B; var45 < this.D.length; var20 += this.a(var28, var45, var2, var3)) {
            var5.do("occ");
            var28 = var45;
            if (var26 < var29) {
               ++var26;
            } else {
               --var26;
            }

            var45 += var26 * var46;
            if (var45 <= var28) {
               var45 = var28 + 10;
            }

            if (var45 > this.D.length) {
               var45 = this.D.length;
            }

            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glDisable(3008);
            GL11.glDisable(2912);
            GL11.glColorMask(false, false, false, false);
            GL11.glDepthMask(false);
            var5.a("check");
            this.a(var28, var45, var1.al, var1.ak, var1.aj);
            var5.if();
            GL11.glPushMatrix();
            float var47 = 0.0F;
            float var48 = 0.0F;
            float var32 = 0.0F;

            for(int var33 = var28; var33 < var45; ++var33) {
               dm var34 = this.D[var33];
               if (var34.do()) {
                  var34.k = false;
               } else if (var34.do) {
                  var34.c = true;
               } else if (var34.k) {
                  if (qs.x() && !var34.try) {
                     var34.c = true;
                  } else if (var34.k && !var34.b) {
                     float var35;
                     float var36;
                     float var37;
                     float var38;
                     if (var34.q) {
                        var35 = Math.abs((float)(var34.char - var1.al));
                        var36 = Math.abs((float)(var34.case - var1.ak));
                        var37 = Math.abs((float)(var34.byte - var1.aj));
                        var38 = var35 + var36 + var37;
                        if ((double)var38 < 10.0D + (double)var33 / 1000.0D) {
                           var34.c = true;
                           continue;
                        }

                        var34.q = false;
                     }

                     var35 = (float)((double)var34.r - var41);
                     var36 = (float)((double)var34.p - var42);
                     var37 = (float)((double)var34.o - var10);
                     var38 = var35 - var47;
                     float var39 = var36 - var48;
                     float var40 = var37 - var32;
                     if (var38 != 0.0F || var39 != 0.0F || var40 != 0.0F) {
                        GL11.glTranslatef(var38, var39, var40);
                        var47 += var38;
                        var48 += var39;
                        var32 += var40;
                     }

                     var5.a("bb");
                     ARBOcclusionQuery.glBeginQueryARB(35092, var34.void);
                     var34.int();
                     ARBOcclusionQuery.glEndQueryARB(35092);
                     var5.if();
                     var34.b = true;
                     ++var22;
                  }
               }
            }

            GL11.glPopMatrix();
            if (this.x.u1.aj) {
               if (dh.q == 0) {
                  GL11.glColorMask(false, true, true, true);
               } else {
                  GL11.glColorMask(true, false, false, true);
               }
            } else {
               GL11.glColorMask(true, true, true, true);
            }

            GL11.glDepthMask(true);
            GL11.glEnable(3553);
            GL11.glEnable(3008);
            GL11.glEnable(2912);
            var5.do("render");
         }
      } else {
         var5.do("render");
         var20 = var43 + this.a(0, this.D.length, var2, var3);
      }

      var5.if();
      ajt.if();
      return var20;
   }

   private void a(int var1, int var2, double var3, double var5, double var7) {
      for(int var9 = var1; var9 < var2; ++var9) {
         dm var10 = this.D[var9];
         if (var10.b) {
            this.L.clear();
            ARBOcclusionQuery.glGetQueryObjectuARB(var10.void, 34919, this.L);
            if (this.L.get(0) != 0) {
               var10.b = false;
               this.L.clear();
               ARBOcclusionQuery.glGetQueryObjectuARB(var10.void, 34918, this.L);
               boolean var11 = var10.c;
               var10.c = this.L.get(0) > 0;
               if (var11 && var10.c) {
                  var10.q = true;
                  var10.char = var3;
                  var10.case = var5;
                  var10.byte = var7;
               }
            }
         }
      }

   }

   private int a(int var1, int var2, int var3, double var4) {
      this.l.clear();
      int var6 = 0;

      for(int var7 = var1; var7 < var2; ++var7) {
         dm var8 = this.D[var7];
         if (var3 == 0) {
            ++this.case;
            if (var8.j[var3]) {
               ++this.int;
            } else if (!var8.k) {
               ++this.byte;
            } else if (this.u && !var8.c) {
               ++this.try;
            } else {
               ++this.new;
            }
         }

         if (var8.k && !var8.j[var3] && (!this.u || var8.c)) {
            int var9 = var8.a(var3);
            if (var9 >= 0) {
               this.l.put(var9);
               ++var6;
            }
         }
      }

      if (var6 == 0) {
         return 0;
      } else {
         if (qs.av()) {
            GL11.glDisable(2912);
         }

         this.l.flip();
         aig var14 = this.x.vj;
         double var15 = var14.aJ + (var14.al - var14.aJ) * var4 - (double)dm.a;
         double var10 = var14.aI + (var14.ak - var14.aI) * var4;
         double var12 = var14.aH + (var14.aj - var14.aH) * var4 - (double)dm.x;
         this.x.u6.a(var4);
         GL11.glTranslatef((float)(-var15), (float)(-var10), (float)(-var12));
         GL11.glCallLists(this.l);
         GL11.glTranslatef((float)var15, (float)var10, (float)var12);
         this.x.u6.if(var4);
         return var6;
      }
   }

   public void if(int var1, double var2) {
   }

   public void for() {
      ++this.t;
      if (this.t % 20 == 0) {
         Iterator var1 = this.d.values().iterator();

         while(var1.hasNext()) {
            alf var2 = (alf)var1.next();
            int var3 = var2.if();
            if (this.t - var3 > 400) {
               var1.remove();
            }
         }
      }

   }

   public void if(float var1) {
      if (vf.D.for()) {
         xl var2 = this.x.vm.n;
         Object var3 = vf.if(var2, vf.D);
         if (var3 != null) {
            vf.for(var3, vf.Q, var1, this.G, this.x);
            return;
         }
      }

      if (this.x.vm.n.if == 1) {
         if (!qs.ar()) {
            return;
         }

         GL11.glDisable(2912);
         GL11.glDisable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         k1.do();
         GL11.glDepthMask(false);
         this.F.for("/misc/tunnel.png");
         c4 var21 = c4.G;

         for(int var23 = 0; var23 < 6; ++var23) {
            GL11.glPushMatrix();
            if (var23 == 1) {
               GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            }

            if (var23 == 2) {
               GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            }

            if (var23 == 3) {
               GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            }

            if (var23 == 4) {
               GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
            }

            if (var23 == 5) {
               GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
            }

            var21.if();
            var21.a(2631720);
            var21.a(-100.0D, -100.0D, -100.0D, 0.0D, 0.0D);
            var21.a(-100.0D, -100.0D, 100.0D, 0.0D, 16.0D);
            var21.a(100.0D, -100.0D, 100.0D, 16.0D, 16.0D);
            var21.a(100.0D, -100.0D, -100.0D, 16.0D, 0.0D);
            var21.for();
            GL11.glPopMatrix();
         }

         GL11.glDepthMask(true);
         GL11.glEnable(3553);
         GL11.glEnable(3008);
      } else if (this.x.vm.n.a()) {
         GL11.glDisable(3553);
         nr var22 = this.G.a(this.x.vj, var1);
         var22 = ad8.a((nr)var22, this.x.vm, this.x.vj.al, this.x.vj.ak + 1.0D, this.x.vj.aj);
         float var24 = (float)var22.int;
         float var4 = (float)var22.for;
         float var5 = (float)var22.do;
         float var6;
         if (this.x.u1.aj) {
            float var7 = (var24 * 30.0F + var4 * 59.0F + var5 * 11.0F) / 100.0F;
            float var8 = (var24 * 30.0F + var4 * 70.0F) / 100.0F;
            var6 = (var24 * 30.0F + var5 * 70.0F) / 100.0F;
            var24 = var7;
            var4 = var8;
            var5 = var6;
         }

         GL11.glColor3f(var24, var4, var5);
         c4 var25 = c4.G;
         GL11.glDepthMask(false);
         GL11.glEnable(2912);
         GL11.glColor3f(var24, var4, var5);
         if (qs.ar()) {
            GL11.glCallList(this.r);
         }

         GL11.glDisable(2912);
         GL11.glDisable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         k1.do();
         float[] var26 = this.G.n.if(this.G.try(var1), var1);
         float var9;
         float var10;
         float var11;
         float var12;
         float var13;
         int var14;
         float var15;
         float var16;
         if (var26 != null && qs.r()) {
            GL11.glDisable(3553);
            GL11.glShadeModel(7425);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(ajs.try(this.G.do(var1)) < 0.0F ? 180.0F : 0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
            var6 = var26[0];
            var9 = var26[1];
            var10 = var26[2];
            if (this.x.u1.aj) {
               var11 = (var6 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
               var12 = (var6 * 30.0F + var9 * 70.0F) / 100.0F;
               var13 = (var6 * 30.0F + var10 * 70.0F) / 100.0F;
               var6 = var11;
               var9 = var12;
               var10 = var13;
            }

            var25.do(6);
            var25.a(var6, var9, var10, var26[3]);
            var25.if(0.0D, 100.0D, 0.0D);
            byte var17 = 16;
            var25.a(var26[0], var26[1], var26[2], 0.0F);

            for(var14 = 0; var14 <= var17; ++var14) {
               var13 = (float)var14 * 3.1415927F * 2.0F / (float)var17;
               var16 = ajs.try(var13);
               var15 = ajs.for(var13);
               var25.if((double)(var16 * 120.0F), (double)(var15 * 120.0F), (double)(-var15 * 40.0F * var26[3]));
            }

            var25.for();
            GL11.glPopMatrix();
            GL11.glShadeModel(7424);
         }

         GL11.glEnable(3553);
         GL11.glBlendFunc(770, 1);
         GL11.glPushMatrix();
         var6 = 1.0F - this.G.char(var1);
         var9 = 0.0F;
         var10 = 0.0F;
         var11 = 0.0F;
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var6);
         GL11.glTranslatef(var9, var10, var11);
         GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         js.a(this.G, this.F, this.G.try(var1), var6);
         GL11.glRotatef(this.G.try(var1) * 360.0F, 1.0F, 0.0F, 0.0F);
         if (qs.r()) {
            var12 = 30.0F;
            this.F.for("/environment/sun.png");
            var25.if();
            var25.a((double)(-var12), 100.0D, (double)(-var12), 0.0D, 0.0D);
            var25.a((double)var12, 100.0D, (double)(-var12), 1.0D, 0.0D);
            var25.a((double)var12, 100.0D, (double)var12, 1.0D, 1.0D);
            var25.a((double)(-var12), 100.0D, (double)var12, 0.0D, 1.0D);
            var25.for();
            var12 = 20.0F;
            this.F.for("/environment/moon_phases.png");
            int var27 = this.G.r();
            int var18 = var27 % 4;
            var14 = var27 / 4 % 2;
            var16 = (float)(var18 + 0) / 4.0F;
            var15 = (float)(var14 + 0) / 2.0F;
            float var19 = (float)(var18 + 1) / 4.0F;
            float var20 = (float)(var14 + 1) / 2.0F;
            var25.if();
            var25.a((double)(-var12), -100.0D, (double)var12, (double)var19, (double)var20);
            var25.a((double)var12, -100.0D, (double)var12, (double)var16, (double)var20);
            var25.a((double)var12, -100.0D, (double)(-var12), (double)var16, (double)var15);
            var25.a((double)(-var12), -100.0D, (double)(-var12), (double)var19, (double)var15);
            var25.for();
         }

         GL11.glDisable(3553);
         var13 = this.G.int(var1) * var6;
         if (var13 > 0.0F && qs.do() && !js.a((y6)this.G)) {
            GL11.glColor4f(var13, var13, var13, var13);
            GL11.glCallList(this.s);
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glEnable(3008);
         GL11.glEnable(2912);
         GL11.glPopMatrix();
         GL11.glDisable(3553);
         GL11.glColor3f(0.0F, 0.0F, 0.0F);
         double var28 = this.x.vk.long(var1).for - this.G.byte();
         if (var28 < 0.0D) {
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 12.0F, 0.0F);
            GL11.glCallList(this.q);
            GL11.glPopMatrix();
            var10 = 1.0F;
            var11 = -((float)(var28 + 65.0D));
            var12 = -var10;
            var25.if();
            var25.if(0, 255);
            var25.if((double)(-var10), (double)var11, (double)var10);
            var25.if((double)var10, (double)var11, (double)var10);
            var25.if((double)var10, (double)var12, (double)var10);
            var25.if((double)(-var10), (double)var12, (double)var10);
            var25.if((double)(-var10), (double)var12, (double)(-var10));
            var25.if((double)var10, (double)var12, (double)(-var10));
            var25.if((double)var10, (double)var11, (double)(-var10));
            var25.if((double)(-var10), (double)var11, (double)(-var10));
            var25.if((double)var10, (double)var12, (double)(-var10));
            var25.if((double)var10, (double)var12, (double)var10);
            var25.if((double)var10, (double)var11, (double)var10);
            var25.if((double)var10, (double)var11, (double)(-var10));
            var25.if((double)(-var10), (double)var11, (double)(-var10));
            var25.if((double)(-var10), (double)var11, (double)var10);
            var25.if((double)(-var10), (double)var12, (double)var10);
            var25.if((double)(-var10), (double)var12, (double)(-var10));
            var25.if((double)(-var10), (double)var12, (double)(-var10));
            var25.if((double)(-var10), (double)var12, (double)var10);
            var25.if((double)var10, (double)var12, (double)var10);
            var25.if((double)var10, (double)var12, (double)(-var10));
            var25.for();
         }

         if (this.G.n.for()) {
            GL11.glColor3f(var24 * 0.2F + 0.04F, var4 * 0.2F + 0.04F, var5 * 0.6F + 0.1F);
         } else {
            GL11.glColor3f(var24, var4, var5);
         }

         if (this.x.u1.B <= 64) {
            GL11.glColor3f(this.x.u6.e, this.x.u6.d, this.x.u6.c);
         }

         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, -((float)(var28 - 16.0D)), 0.0F);
         if (qs.ar()) {
            GL11.glCallList(this.q);
         }

         GL11.glPopMatrix();
         GL11.glEnable(3553);
         GL11.glDepthMask(true);
      }

   }

   public void a(float var1) {
      if (this.x.u1.bv != 3) {
         if (vf.G.for()) {
            xl var2 = this.x.vm.n;
            Object var3 = vf.if(var2, vf.G);
            if (var3 != null) {
               vf.for(var3, vf.Q, var1, this.G, this.x);
               return;
            }
         }

         if (this.x.vm.n.a()) {
            if (qs.o()) {
               this.do(var1);
            } else {
               GL11.glDisable(2884);
               float var24 = (float)(this.x.vj.aI + (this.x.vj.ak - this.x.vj.aI) * (double)var1);
               byte var25 = 32;
               int var4 = 256 / var25;
               c4 var5 = c4.G;
               this.F.for("/environment/clouds.png");
               GL11.glEnable(3042);
               GL11.glBlendFunc(770, 771);
               nr var6 = this.G.for(var1);
               float var7 = (float)var6.int;
               float var8 = (float)var6.for;
               float var9 = (float)var6.do;
               float var10;
               if (this.x.u1.aj) {
                  var10 = (var7 * 30.0F + var8 * 59.0F + var9 * 11.0F) / 100.0F;
                  float var11 = (var7 * 30.0F + var8 * 70.0F) / 100.0F;
                  float var12 = (var7 * 30.0F + var9 * 70.0F) / 100.0F;
                  var7 = var10;
                  var8 = var11;
                  var9 = var12;
               }

               var10 = 4.8828125E-4F;
               double var26 = (double)((float)this.t + var1);
               double var13 = this.x.vj.ao + (this.x.vj.al - this.x.vj.ao) * (double)var1 + var26 * 0.029999999329447746D;
               double var15 = this.x.vj.am + (this.x.vj.aj - this.x.vj.am) * (double)var1;
               int var17 = ajs.a(var13 / 2048.0D);
               int var18 = ajs.a(var15 / 2048.0D);
               var13 -= (double)(var17 * 2048);
               var15 -= (double)(var18 * 2048);
               float var19 = this.G.n.byte() - var24 + 0.33F;
               var19 += this.x.u1.int * 128.0F;
               float var20 = (float)(var13 * (double)var10);
               float var21 = (float)(var15 * (double)var10);
               var5.if();
               var5.a(var7, var8, var9, 0.8F);

               for(int var22 = -var25 * var4; var22 < var25 * var4; var22 += var25) {
                  for(int var23 = -var25 * var4; var23 < var25 * var4; var23 += var25) {
                     var5.a((double)(var22 + 0), (double)var19, (double)(var23 + var25), (double)((float)(var22 + 0) * var10 + var20), (double)((float)(var23 + var25) * var10 + var21));
                     var5.a((double)(var22 + var25), (double)var19, (double)(var23 + var25), (double)((float)(var22 + var25) * var10 + var20), (double)((float)(var23 + var25) * var10 + var21));
                     var5.a((double)(var22 + var25), (double)var19, (double)(var23 + 0), (double)((float)(var22 + var25) * var10 + var20), (double)((float)(var23 + 0) * var10 + var21));
                     var5.a((double)(var22 + 0), (double)var19, (double)(var23 + 0), (double)((float)(var22 + 0) * var10 + var20), (double)((float)(var23 + 0) * var10 + var21));
                  }
               }

               var5.for();
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               GL11.glDisable(3042);
               GL11.glEnable(2884);
            }
         }
      }

   }

   public boolean a(double var1, double var3, double var5, float var7) {
      return false;
   }

   public void do(float var1) {
      GL11.glDisable(2884);
      float var2 = (float)(this.x.vj.aI + (this.x.vj.ak - this.x.vj.aI) * (double)var1);
      c4 var3 = c4.G;
      float var4 = 12.0F;
      float var5 = 4.0F;
      double var6 = (double)((float)this.t + var1);
      double var8 = (this.x.vj.ao + (this.x.vj.al - this.x.vj.ao) * (double)var1 + var6 * 0.029999999329447746D) / (double)var4;
      double var10 = (this.x.vj.am + (this.x.vj.aj - this.x.vj.am) * (double)var1) / (double)var4 + 0.33000001311302185D;
      float var12 = this.G.n.byte() - var2 + 0.33F;
      var12 += this.x.u1.int * 128.0F;
      int var13 = ajs.a(var8 / 2048.0D);
      int var14 = ajs.a(var10 / 2048.0D);
      var8 -= (double)(var13 * 2048);
      var10 -= (double)(var14 * 2048);
      this.F.for("/environment/clouds.png");
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      nr var15 = this.G.for(var1);
      float var16 = (float)var15.int;
      float var17 = (float)var15.for;
      float var18 = (float)var15.do;
      float var19;
      float var20;
      float var21;
      if (this.x.u1.aj) {
         var19 = (var16 * 30.0F + var17 * 59.0F + var18 * 11.0F) / 100.0F;
         var20 = (var16 * 30.0F + var17 * 70.0F) / 100.0F;
         var21 = (var16 * 30.0F + var18 * 70.0F) / 100.0F;
         var16 = var19;
         var17 = var20;
         var18 = var21;
      }

      var19 = (float)(var8 * 0.0D);
      var20 = (float)(var10 * 0.0D);
      var21 = 0.00390625F;
      var19 = (float)ajs.a(var8) * var21;
      var20 = (float)ajs.a(var10) * var21;
      float var22 = (float)(var8 - (double)ajs.a(var8));
      float var23 = (float)(var10 - (double)ajs.a(var10));
      byte var24 = 8;
      byte var25 = 4;
      float var26 = 9.765625E-4F;
      GL11.glScalef(var4, 1.0F, var4);

      for(int var27 = 0; var27 < 2; ++var27) {
         if (var27 == 0) {
            GL11.glColorMask(false, false, false, false);
         } else if (this.x.u1.aj) {
            if (dh.q == 0) {
               GL11.glColorMask(false, true, true, true);
            } else {
               GL11.glColorMask(true, false, false, true);
            }
         } else {
            GL11.glColorMask(true, true, true, true);
         }

         for(int var28 = -var25 + 1; var28 <= var25; ++var28) {
            for(int var29 = -var25 + 1; var29 <= var25; ++var29) {
               var3.if();
               float var30 = (float)(var28 * var24);
               float var31 = (float)(var29 * var24);
               float var32 = var30 - var22;
               float var33 = var31 - var23;
               if (var12 > -var5 - 1.0F) {
                  var3.a(var16 * 0.7F, var17 * 0.7F, var18 * 0.7F, 0.8F);
                  var3.do(0.0F, -1.0F, 0.0F);
                  var3.a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                  var3.a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                  var3.a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                  var3.a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
               }

               if (var12 <= var5 + 1.0F) {
                  var3.a(var16, var17, var18, 0.8F);
                  var3.do(0.0F, 1.0F, 0.0F);
                  var3.a((double)(var32 + 0.0F), (double)(var12 + var5 - var26), (double)(var33 + (float)var24), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                  var3.a((double)(var32 + (float)var24), (double)(var12 + var5 - var26), (double)(var33 + (float)var24), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                  var3.a((double)(var32 + (float)var24), (double)(var12 + var5 - var26), (double)(var33 + 0.0F), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                  var3.a((double)(var32 + 0.0F), (double)(var12 + var5 - var26), (double)(var33 + 0.0F), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
               }

               var3.a(var16 * 0.9F, var17 * 0.9F, var18 * 0.9F, 0.8F);
               int var34;
               if (var28 > -1) {
                  var3.do(-1.0F, 0.0F, 0.0F);

                  for(var34 = 0; var34 < var24; ++var34) {
                     var3.a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                     var3.a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + var5), (double)(var33 + (float)var24), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                     var3.a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + var5), (double)(var33 + 0.0F), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                     var3.a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                  }
               }

               if (var28 <= 1) {
                  var3.do(1.0F, 0.0F, 0.0F);

                  for(var34 = 0; var34 < var24; ++var34) {
                     var3.a((double)(var32 + (float)var34 + 1.0F - var26), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                     var3.a((double)(var32 + (float)var34 + 1.0F - var26), (double)(var12 + var5), (double)(var33 + (float)var24), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                     var3.a((double)(var32 + (float)var34 + 1.0F - var26), (double)(var12 + var5), (double)(var33 + 0.0F), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                     var3.a((double)(var32 + (float)var34 + 1.0F - var26), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                  }
               }

               var3.a(var16 * 0.8F, var17 * 0.8F, var18 * 0.8F, 0.8F);
               if (var29 > -1) {
                  var3.do(0.0F, 0.0F, -1.0F);

                  for(var34 = 0; var34 < var24; ++var34) {
                     var3.a((double)(var32 + 0.0F), (double)(var12 + var5), (double)(var33 + (float)var34 + 0.0F), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.a((double)(var32 + (float)var24), (double)(var12 + var5), (double)(var33 + (float)var34 + 0.0F), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + (float)var34 + 0.0F), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var34 + 0.0F), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                  }
               }

               if (var29 <= 1) {
                  var3.do(0.0F, 0.0F, 1.0F);

                  for(var34 = 0; var34 < var24; ++var34) {
                     var3.a((double)(var32 + 0.0F), (double)(var12 + var5), (double)(var33 + (float)var34 + 1.0F - var26), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.a((double)(var32 + (float)var24), (double)(var12 + var5), (double)(var33 + (float)var34 + 1.0F - var26), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + (float)var34 + 1.0F - var26), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var34 + 1.0F - var26), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                  }
               }

               var3.for();
            }
         }
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glEnable(2884);
   }

   public boolean a(aig var1, boolean var2) {
      if (ajt.int()) {
         return ajt.a(this, var1, var2);
      } else if (this.E.do() <= 0) {
         return false;
      } else {
         int var3 = 0;
         int var4 = qs.ae();
         if (qs.G() && !this.a(var1)) {
            var4 *= 3;
         }

         byte var5 = 4;
         int var6 = 0;
         dm var7 = null;
         float var8 = Float.MAX_VALUE;
         int var9 = -1;

         for(int var10 = 0; var10 < this.E.do(); ++var10) {
            dm var11 = (dm)this.E.if(var10);
            if (var11 != null) {
               ++var6;
               if (!var11.f) {
                  this.E.if(var10, (Object)null);
               } else {
                  float var12 = var11.a((aiw)var1);
                  if (var12 <= 256.0F && this.byte()) {
                     var11.for();
                     var11.f = false;
                     this.E.if(var10, (Object)null);
                     ++var3;
                  } else {
                     if (var12 > 256.0F && var3 >= var4) {
                        break;
                     }

                     if (!var11.k) {
                        var12 *= (float)var5;
                     }

                     if (var7 == null) {
                        var7 = var11;
                        var8 = var12;
                        var9 = var10;
                     } else if (var12 < var8) {
                        var7 = var11;
                        var8 = var12;
                        var9 = var10;
                     }
                  }
               }
            }
         }

         if (var7 != null) {
            var7.for();
            var7.f = false;
            this.E.if(var9, (Object)null);
            ++var3;
            float var15 = var8 / 5.0F;

            for(int var16 = 0; var16 < this.E.do() && var3 < var4; ++var16) {
               dm var17 = (dm)this.E.if(var16);
               if (var17 != null) {
                  float var13 = var17.a((aiw)var1);
                  if (!var17.k) {
                     var13 *= (float)var5;
                  }

                  float var14 = Math.abs(var13 - var8);
                  if (var14 < var15) {
                     var17.for();
                     var17.f = false;
                     this.E.if(var16, (Object)null);
                     ++var3;
                  }
               }
            }
         }

         if (var6 == 0) {
            this.E.a();
         }

         this.E.if();
         return true;
      }
   }

   public void if(aek var1, nt var2, int var3, abp var4, float var5) {
      c4 var6 = c4.G;
      GL11.glEnable(3042);
      GL11.glEnable(3008);
      GL11.glBlendFunc(770, 1);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, (ajs.try((float)Minecraft.h1() / 100.0F) * 0.2F + 0.4F) * 0.5F);
      if (var3 != 0 && var4 != null) {
         GL11.glBlendFunc(770, 771);
         float var7 = ajs.try((float)Minecraft.h1() / 100.0F) * 0.2F + 0.8F;
         GL11.glColor4f(var7, var7, var7, ajs.try((float)Minecraft.h1() / 200.0F) * 0.2F + 0.5F);
         this.F.for("/terrain.png");
      }

      GL11.glDisable(3042);
      GL11.glDisable(3008);
   }

   public void a(c4 var1, aek var2, float var3) {
      this.a(var1, var2, var3);
   }

   public void a(c4 var1, aig var2, float var3) {
      double var4 = var2.aJ + (var2.al - var2.aJ) * (double)var3;
      double var6 = var2.aI + (var2.ak - var2.aI) * (double)var3;
      double var8 = var2.aH + (var2.aj - var2.aH) * (double)var3;
      if (!this.d.isEmpty()) {
         GL11.glBlendFunc(774, 768);
         this.F.for("/terrain.png");
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
         GL11.glPushMatrix();
         GL11.glDisable(3008);
         GL11.glPolygonOffset(-3.0F, -3.0F);
         GL11.glEnable(32823);
         GL11.glEnable(3008);
         var1.if();
         var1.a(-var4, -var6, -var8);
         var1.new();
         Iterator var10 = this.d.values().iterator();

         while(var10.hasNext()) {
            alf var11 = (alf)var10.next();
            double var12 = (double)var11.do() - var4;
            double var14 = (double)var11.a() - var6;
            double var16 = (double)var11.int() - var8;
            if (var12 * var12 + var14 * var14 + var16 * var16 > 1024.0D) {
               var10.remove();
            } else {
               int var18 = this.G.new(var11.do(), var11.a(), var11.int());
               pa var19 = var18 > 0 ? pa.x[var18] : null;
               if (var19 == null) {
                  var19 = pa.k;
               }

               this.w.a(var19, var11.do(), var11.a(), var11.int(), this.c[var11.for()]);
            }
         }

         var1.for();
         var1.a(0.0D, 0.0D, 0.0D);
         GL11.glDisable(3008);
         GL11.glPolygonOffset(0.0F, 0.0F);
         GL11.glDisable(32823);
         GL11.glEnable(3008);
         GL11.glDepthMask(true);
         GL11.glPopMatrix();
      }

   }

   public void a(aek var1, nt var2, int var3, abp var4, float var5) {
      if (var3 == 0 && var2.if == ns.if) {
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
         GL11.glLineWidth(2.0F);
         GL11.glDisable(3553);
         GL11.glDepthMask(false);
         float var6 = 0.002F;
         int var7 = this.G.new(var2.a, var2.try, var2.new);
         if (var7 > 0) {
            pa.x[var7].int((yy)this.G, var2.a, var2.try, var2.new);
            double var8 = var1.aJ + (var1.al - var1.aJ) * (double)var5;
            double var10 = var1.aI + (var1.ak - var1.aI) * (double)var5;
            double var12 = var1.aH + (var1.aj - var1.aH) * (double)var5;
            this.a(pa.x[var7].new((y6)this.G, var2.a, var2.try, var2.new).do((double)var6, (double)var6, (double)var6).int(-var8, -var10, -var12));
         }

         GL11.glDepthMask(true);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
      }

   }

   private void a(nw var1) {
      c4 var2 = c4.G;
      var2.do(3);
      var2.if(var1.if, var1.a, var1.try);
      var2.if(var1.new, var1.a, var1.try);
      var2.if(var1.new, var1.a, var1.for);
      var2.if(var1.if, var1.a, var1.for);
      var2.if(var1.if, var1.a, var1.try);
      var2.for();
      var2.do(3);
      var2.if(var1.if, var1.int, var1.try);
      var2.if(var1.new, var1.int, var1.try);
      var2.if(var1.new, var1.int, var1.for);
      var2.if(var1.if, var1.int, var1.for);
      var2.if(var1.if, var1.int, var1.try);
      var2.for();
      var2.do(1);
      var2.if(var1.if, var1.a, var1.try);
      var2.if(var1.if, var1.int, var1.try);
      var2.if(var1.new, var1.a, var1.try);
      var2.if(var1.new, var1.int, var1.try);
      var2.if(var1.new, var1.a, var1.for);
      var2.if(var1.new, var1.int, var1.for);
      var2.if(var1.if, var1.a, var1.for);
      var2.if(var1.if, var1.int, var1.for);
      var2.for();
   }

   public void if(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = ajs.a(var1, 16);
      int var8 = ajs.a(var2, 16);
      int var9 = ajs.a(var3, 16);
      int var10 = ajs.a(var4, 16);
      int var11 = ajs.a(var5, 16);
      int var12 = ajs.a(var6, 16);

      for(int var13 = var7; var13 <= var10; ++var13) {
         int var14 = var13 % this.B;
         if (var14 < 0) {
            var14 += this.B;
         }

         for(int var15 = var8; var15 <= var11; ++var15) {
            int var16 = var15 % this.A;
            if (var16 < 0) {
               var16 += this.A;
            }

            for(int var17 = var9; var17 <= var12; ++var17) {
               int var18 = var17 % this.z;
               if (var18 < 0) {
                  var18 += this.z;
               }

               int var19 = (var18 * this.A + var16) * this.B + var14;
               dm var20 = this.C[var19];
               if (var20 != null && !var20.f) {
                  this.E.if(var20);
                  var20.a();
               }
            }
         }
      }

   }

   public void a(int var1, int var2, int var3) {
      this.if(var1 - 1, var2 - 1, var3 - 1, var1 + 1, var2 + 1, var3 + 1);
   }

   public void if(int var1, int var2, int var3) {
      this.if(var1 - 1, var2 - 1, var3 - 1, var1 + 1, var2 + 1, var3 + 1);
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.if(var1 - 1, var2 - 1, var3 - 1, var4 + 1, var5 + 1, var6 + 1);
   }

   public void a(c1 var1, float var2) {
      for(int var3 = 0; var3 < this.C.length; ++var3) {
         if (!this.C[var3].do()) {
            this.C[var3].a(var1);
         }
      }

      ++this.H;
   }

   public void if(String var1, int var2, int var3, int var4) {
      abc var5 = abc.do(var1);
      if (var1 != null && var5 != null) {
         this.x.u4.byte(var5.o());
      }

      this.x.uX.if(var1, (float)var2, (float)var3, (float)var4);
   }

   public void a(String var1, int var2, int var3, int var4) {
      abc var5 = abc.do(var1);
      if (var1 != null && var5 != null) {
         this.x.u4.byte(var5.o());
      }

      this.x.uX.a(var1, (float)var2, (float)var3, (float)var4);
   }

   public void a(String var1, double var2, double var4, double var6, float var8, float var9) {
   }

   public void a(aek var1, String var2, double var3, double var5, double var7, float var9, float var10) {
   }

   public void a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      try {
         this.if(var1, var2, var4, var6, var8, var10, var12);
      } catch (Throwable var17) {
         aqh var15 = aqh.a(var17, "Exception while adding particle");
         apu var16 = var15.a("Particle being added");
         var16.a((String)"Name", (Object)var1);
         var16.a((String)"Position", (Callable)(new c8(this, var2, var4, var6)));
         throw new ape(var15);
      }
   }

   public d7 if(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      if (this.x != null && this.x.vj != null && this.x.vh != null) {
         int var14 = this.x.u1.a9;
         if (var14 == 1 && this.G.o.nextInt(3) == 0) {
            var14 = 2;
         }

         double var15 = this.x.vj.al - var2;
         double var17 = this.x.vj.ak - var4;
         double var19 = this.x.vj.aj - var6;
         Object var21 = null;
         if (var1.equals("hugeexplosion")) {
            if (qs.V()) {
               this.x.vh.a((d7)(var21 = new ea(this.G, var2, var4, var6, var8, var10, var12)));
            }
         } else if (var1.equals("largeexplode")) {
            if (qs.V()) {
               this.x.vh.a((d7)(var21 = new eb(this.F, this.G, var2, var4, var6, var8, var10, var12)));
            }
         } else if (var1.equals("fireworksSpark")) {
            this.x.vh.a((d7)(var21 = new eg(this.G, var2, var4, var6, var8, var10, var12, this.x.vh)));
         }

         if (var21 != null) {
            return (d7)var21;
         } else {
            double var22 = 16.0D;
            double var24 = 16.0D;
            if (var1.equals("crit")) {
               var22 = 196.0D;
            }

            if (var15 * var15 + var17 * var17 + var19 * var19 > var22 * var22) {
               return null;
            } else if (var14 > 1) {
               return null;
            } else {
               if (var1.equals("bubble")) {
                  var21 = new en(this.G, var2, var4, var6, var8, var10, var12);
                  ad8.a((d7)var21, (yy)this.G);
               } else if (var1.equals("suspended")) {
                  if (qs.char()) {
                     var21 = new dx(this.G, var2, var4, var6, var8, var10, var12);
                  }
               } else if (var1.equals("depthsuspend")) {
                  if (qs.for()) {
                     var21 = new dw(this.G, var2, var4, var6, var8, var10, var12);
                  }
               } else if (var1.equals("townaura")) {
                  var21 = new dw(this.G, var2, var4, var6, var8, var10, var12);
                  ad8.if((d7)var21);
               } else if (var1.equals("crit")) {
                  var21 = new el(this.G, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("magicCrit")) {
                  var21 = new el(this.G, var2, var4, var6, var8, var10, var12);
                  ((d7)var21).if(((d7)var21).aT() * 0.3F, ((d7)var21).aU() * 0.8F, ((d7)var21).aW());
                  ((d7)var21).aV();
               } else if (var1.equals("smoke")) {
                  if (qs.au()) {
                     var21 = new d2(this.G, var2, var4, var6, var8, var10, var12);
                  }
               } else if (var1.equals("mobSpell")) {
                  var21 = new dz(this.G, var2, var4, var6, 0.0D, 0.0D, 0.0D);
                  ((d7)var21).if((float)var8, (float)var10, (float)var12);
               } else if (var1.equals("mobSpellAmbient")) {
                  var21 = new dz(this.G, var2, var4, var6, 0.0D, 0.0D, 0.0D);
                  ((d7)var21).case(0.15F);
                  ((d7)var21).if((float)var8, (float)var10, (float)var12);
               } else if (var1.equals("spell")) {
                  var21 = new dz(this.G, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("instantSpell")) {
                  var21 = new dz(this.G, var2, var4, var6, var8, var10, var12);
                  ((dz)var21).i(144);
               } else if (var1.equals("witchMagic")) {
                  var21 = new dz(this.G, var2, var4, var6, var8, var10, var12);
                  ((dz)var21).i(144);
                  float var26 = this.G.o.nextFloat() * 0.5F + 0.35F;
                  ((d7)var21).if(1.0F * var26, 0.0F * var26, 1.0F * var26);
               } else if (var1.equals("note")) {
                  var21 = new d8(this.G, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("portal")) {
                  var21 = new d4(this.G, var2, var4, var6, var8, var10, var12);
                  ad8.a((d7)var21);
               } else if (var1.equals("enchantmenttable")) {
                  var21 = new ej(this.G, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("explode")) {
                  if (qs.V()) {
                     var21 = new ei(this.G, var2, var4, var6, var8, var10, var12);
                  }
               } else if (var1.equals("flame")) {
                  if (qs.E()) {
                     var21 = new ee(this.G, var2, var4, var6, var8, var10, var12);
                  }
               } else if (var1.equals("lava")) {
                  var21 = new d9(this.G, var2, var4, var6);
               } else if (var1.equals("footstep")) {
                  var21 = new ed(this.F, this.G, var2, var4, var6);
               } else if (var1.equals("splash")) {
                  var21 = new dy(this.G, var2, var4, var6, var8, var10, var12);
                  ad8.a((d7)var21, (yy)this.G);
               } else if (var1.equals("largesmoke")) {
                  if (qs.au()) {
                     var21 = new d2(this.G, var2, var4, var6, var8, var10, var12, 2.5F);
                  }
               } else if (var1.equals("cloud")) {
                  var21 = new d5(this.G, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("reddust")) {
                  if (qs.an()) {
                     var21 = new d3(this.G, var2, var4, var6, (float)var8, (float)var10, (float)var12);
                     ad8.a((d7)var21, this.G, var15, var17, var19);
                  }
               } else if (var1.equals("snowballpoof")) {
                  var21 = new eo(this.G, var2, var4, var6, abr.cu, this.F);
               } else if (var1.equals("dripWater")) {
                  if (qs.case()) {
                     var21 = new ek(this.G, var2, var4, var6, ts.s);
                  }
               } else if (var1.equals("dripLava")) {
                  if (qs.case()) {
                     var21 = new ek(this.G, var2, var4, var6, ts.r);
                  }
               } else if (var1.equals("snowshovel")) {
                  var21 = new d0(this.G, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("slime")) {
                  var21 = new eo(this.G, var2, var4, var6, abr.cl, this.F);
               } else if (var1.equals("heart")) {
                  var21 = new ec(this.G, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("angryVillager")) {
                  var21 = new ec(this.G, var2, var4 + 0.5D, var6, var8, var10, var12);
                  ((d7)var21).g(81);
                  ((d7)var21).if(1.0F, 1.0F, 1.0F);
               } else if (var1.equals("happyVillager")) {
                  var21 = new dw(this.G, var2, var4, var6, var8, var10, var12);
                  ((d7)var21).g(82);
                  ((d7)var21).if(1.0F, 1.0F, 1.0F);
               } else if (var1.startsWith("iconcrack_")) {
                  int var29 = Integer.parseInt(var1.substring(var1.indexOf("_") + 1));
                  var21 = new eo(this.G, var2, var4, var6, var8, var10, var12, abr.ai[var29], this.F);
               } else if (var1.startsWith("tilecrack_")) {
                  String[] var30 = var1.split("_", 3);
                  int var27 = Integer.parseInt(var30[1]);
                  int var28 = Integer.parseInt(var30[2]);
                  var21 = (new du(this.G, var2, var4, var6, var8, var10, var12, pa.x[var27], 0, var28, this.F)).h(var28);
               }

               if (var21 != null) {
                  this.x.vh.a((d7)var21);
               }

               return (d7)var21;
            }
         }
      } else {
         return null;
      }
   }

   public void if(aiw var1) {
      var1.aN();
      if (var1.af != null) {
         this.F.a((String)var1.af, (db)(new c7()));
      }

      if (var1.ae != null) {
         this.F.a((String)var1.ae, (db)(new c7()));
         if (var1 instanceof aek) {
            aek var2 = (aek)var1;
            dd var3 = this.F.a((String)var2.ae, (db)(new c7()));
            this.F.a(var2.ae);
            String var4 = "http://s.optifine.net/capes/" + ajm.a(var2.fJ) + ".png";
            dc var5 = new dc(var3, var4, new c7());
            var5.start();
            if (!qs.z()) {
               var2.ae = "";
            }
         }
      }

      if (qs.w()) {
         c.a(var1);
      }

   }

   public void a(aiw var1) {
      if (var1.af != null) {
         this.F.a(var1.af);
      }

      if (var1.ae != null) {
         this.F.a(var1.ae);
      }

   }

   public void char() {
      k0.int(this.y);
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      Random var6 = this.G.o;
      switch(var1) {
      case 1013:
      case 1018:
         if (this.x.vj != null) {
            double var7 = (double)var2 - this.x.vj.al;
            double var9 = (double)var3 - this.x.vj.ak;
            double var11 = (double)var4 - this.x.vj.aj;
            double var13 = Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
            double var15 = this.x.vj.al;
            double var17 = this.x.vj.ak;
            double var19 = this.x.vj.aj;
            if (var13 > 0.0D) {
               var15 += var7 / var13 * 2.0D;
               var17 += var9 / var13 * 2.0D;
               var19 += var11 / var13 * 2.0D;
            }

            if (var1 == 1013) {
               this.G.a(var15, var17, var19, "mob.wither.spawn", 1.0F, 1.0F, false);
            } else if (var1 == 1018) {
               this.G.a(var15, var17, var19, "mob.enderdragon.end", 5.0F, 1.0F, false);
            }
         }
      default:
      }
   }

   public void a(aek var1, int var2, int var3, int var4, int var5, int var6) {
      Random var7 = this.G.o;
      double var8;
      double var10;
      double var12;
      String var14;
      int var15;
      double var16;
      int var18;
      double var19;
      double var21;
      double var23;
      double var25;
      switch(var2) {
      case 1000:
         this.G.a((double)var3, (double)var4, (double)var5, "random.click", 1.0F, 1.0F, false);
         break;
      case 1001:
         this.G.a((double)var3, (double)var4, (double)var5, "random.click", 1.0F, 1.2F, false);
         break;
      case 1002:
         this.G.a((double)var3, (double)var4, (double)var5, "random.bow", 1.0F, 1.2F, false);
         break;
      case 1003:
         if (Math.random() < 0.5D) {
            this.G.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "random.door_open", 1.0F, this.G.o.nextFloat() * 0.1F + 0.9F, false);
         } else {
            this.G.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "random.door_close", 1.0F, this.G.o.nextFloat() * 0.1F + 0.9F, false);
         }
         break;
      case 1004:
         this.G.a((double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), "random.fizz", 0.5F, 2.6F + (var7.nextFloat() - var7.nextFloat()) * 0.8F, false);
         break;
      case 1005:
         if (abr.ai[var6] instanceof abc) {
            this.G.if(((abc)abr.ai[var6]).c6, var3, var4, var5);
         } else {
            this.G.if((String)null, var3, var4, var5);
         }
         break;
      case 1006:
         if (abr.ai[var6] instanceof abc) {
            this.G.do(((abc)abr.ai[var6]).c6, var3, var4, var5);
         } else {
            this.G.do((String)null, var3, var4, var5);
         }
         break;
      case 1007:
         this.G.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.ghast.charge", 10.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1008:
         this.G.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.ghast.fireball", 10.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1009:
         this.G.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.ghast.fireball", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1010:
         this.G.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.zombie.wood", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1011:
         this.G.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.zombie.metal", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1012:
         this.G.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.zombie.woodbreak", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1014:
         this.G.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.wither.shoot", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1015:
         this.G.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.bat.takeoff", 0.05F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1016:
         this.G.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.zombie.infect", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1017:
         this.G.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.zombie.unfect", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1020:
         this.G.a((double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), "random.anvil_break", 1.0F, this.G.o.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 1021:
         this.G.a((double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), "random.anvil_use", 1.0F, this.G.o.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 1022:
         this.G.a((double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), "random.anvil_land", 0.3F, this.G.o.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 2000:
         int var27 = var6 % 3 - 1;
         int var28 = var6 / 3 % 3 - 1;
         var10 = (double)var3 + (double)var27 * 0.6D + 0.5D;
         var12 = (double)var4 + 0.5D;
         double var29 = (double)var5 + (double)var28 * 0.6D + 0.5D;

         for(int var43 = 0; var43 < 10; ++var43) {
            double var44 = var7.nextDouble() * 0.2D + 0.01D;
            double var45 = var10 + (double)var27 * 0.01D + (var7.nextDouble() - 0.5D) * (double)var28 * 0.5D;
            var25 = var12 + (var7.nextDouble() - 0.5D) * 0.5D;
            var16 = var29 + (double)var28 * 0.01D + (var7.nextDouble() - 0.5D) * (double)var27 * 0.5D;
            var19 = (double)var27 * var44 + var7.nextGaussian() * 0.01D;
            var21 = -0.03D + var7.nextGaussian() * 0.01D;
            var23 = (double)var28 * var44 + var7.nextGaussian() * 0.01D;
            this.a("smoke", var45, var25, var16, var19, var21, var23);
         }

         return;
      case 2001:
         var18 = var6 & 4095;
         if (var18 > 0) {
            pa var42 = pa.x[var18];
            this.x.uX.a(var42.az.int(), (float)var3 + 0.5F, (float)var4 + 0.5F, (float)var5 + 0.5F, (var42.az.for() + 1.0F) / 2.0F, var42.az.a() * 0.8F);
         }

         this.x.vh.a(var3, var4, var5, var6 & 4095, var6 >> 12 & 255);
         break;
      case 2002:
         var8 = (double)var3;
         var10 = (double)var4;
         var12 = (double)var5;
         var14 = "iconcrack_" + abr.av.A;

         for(var15 = 0; var15 < 8; ++var15) {
            this.a(var14, var8, var10, var12, var7.nextGaussian() * 0.15D, var7.nextDouble() * 0.2D, var7.nextGaussian() * 0.15D);
         }

         var15 = abr.av.new(var6);
         float var31 = (float)(var15 >> 16 & 255) / 255.0F;
         float var32 = (float)(var15 >> 8 & 255) / 255.0F;
         float var33 = (float)(var15 >> 0 & 255) / 255.0F;
         String var34 = "spell";
         if (abr.av.byte(var6)) {
            var34 = "instantSpell";
         }

         for(var18 = 0; var18 < 100; ++var18) {
            var25 = var7.nextDouble() * 4.0D;
            var16 = var7.nextDouble() * 3.141592653589793D * 2.0D;
            var19 = Math.cos(var16) * var25;
            var21 = 0.01D + var7.nextDouble() * 0.5D;
            var23 = Math.sin(var16) * var25;
            d7 var47 = this.if(var34, var8 + var19 * 0.1D, var10 + 0.3D, var12 + var23 * 0.1D, var19, var21, var23);
            if (var47 != null) {
               float var48 = 0.75F + var7.nextFloat() * 0.25F;
               var47.if(var31 * var48, var32 * var48, var33 * var48);
               var47.else((float)var25);
            }
         }

         this.G.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "random.glass", 1.0F, this.G.o.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 2003:
         var8 = (double)var3 + 0.5D;
         var10 = (double)var4;
         var12 = (double)var5 + 0.5D;
         var14 = "iconcrack_" + abr.b3.A;

         for(var15 = 0; var15 < 8; ++var15) {
            this.a(var14, var8, var10, var12, var7.nextGaussian() * 0.15D, var7.nextDouble() * 0.2D, var7.nextGaussian() * 0.15D);
         }

         for(double var46 = 0.0D; var46 < 6.283185307179586D; var46 += 0.15707963267948966D) {
            this.a("portal", var8 + Math.cos(var46) * 5.0D, var10 - 0.4D, var12 + Math.sin(var46) * 5.0D, Math.cos(var46) * -5.0D, 0.0D, Math.sin(var46) * -5.0D);
            this.a("portal", var8 + Math.cos(var46) * 5.0D, var10 - 0.4D, var12 + Math.sin(var46) * 5.0D, Math.cos(var46) * -7.0D, 0.0D, Math.sin(var46) * -7.0D);
         }

         return;
      case 2004:
         for(int var35 = 0; var35 < 20; ++var35) {
            double var36 = (double)var3 + 0.5D + ((double)this.G.o.nextFloat() - 0.5D) * 2.0D;
            double var38 = (double)var4 + 0.5D + ((double)this.G.o.nextFloat() - 0.5D) * 2.0D;
            double var40 = (double)var5 + 0.5D + ((double)this.G.o.nextFloat() - 0.5D) * 2.0D;
            this.G.a("smoke", var36, var38, var40, 0.0D, 0.0D, 0.0D);
            this.G.a("flame", var36, var38, var40, 0.0D, 0.0D, 0.0D);
         }

         return;
      case 2005:
         ab8.if(this.G, var3, var4, var5, var6);
      }

   }

   public void if(int var1, int var2, int var3, int var4, int var5) {
      if (var5 >= 0 && var5 < 10) {
         alf var6 = (alf)this.d.get(var1);
         if (var6 == null || var6.do() != var2 || var6.a() != var3 || var6.int() != var4) {
            var6 = new alf(var1, var2, var3, var4);
            this.d.put(var1, var6);
         }

         var6.a(var5);
         var6.if(this.t);
      } else {
         this.d.remove(var1);
      }

   }

   public void a(ajc var1) {
      this.c = new ajd[10];

      for(int var2 = 0; var2 < this.c.length; ++var2) {
         this.c[var2] = var1.a("destroy_" + var2);
      }

   }

   public void new() {
      if (this.C != null) {
         for(int var1 = 0; var1 < this.C.length; ++var1) {
            this.C[var1].c = true;
         }
      }

   }

   public boolean a(aig var1) {
      boolean var2 = this.if(var1);
      if (var2) {
         this.n = System.currentTimeMillis();
         return true;
      } else {
         return System.currentTimeMillis() - this.n < 2000L;
      }
   }

   private boolean if(aig var1) {
      double var2 = 0.001D;
      return var1.e4 ? true : (var1.Q() ? true : ((double)var1.fk > var2 ? true : (this.x.uV.if != 0 ? true : (this.x.uV.a != 0 ? true : (Math.abs(var1.al - var1.ao) > var2 ? true : (Math.abs(var1.ak - var1.an) > var2 ? true : Math.abs(var1.aj - var1.am) > var2))))));
   }

   public boolean try() {
      boolean var1 = this.byte();
      if (var1) {
         this.b = System.currentTimeMillis();
         return true;
      } else {
         return System.currentTimeMillis() - this.b < 500L;
      }
   }

   public boolean byte() {
      return Mouse.isButtonDown(0) ? true : Mouse.isButtonDown(1);
   }

   public int a(int var1, double var2) {
      return this.a(0, this.D.length, var1, var2);
   }

   public void if() {
      if (this.G != null) {
         boolean var1 = qs.z();
         List var2 = this.G.z;

         for(int var3 = 0; var3 < var2.size(); ++var3) {
            aiw var4 = (aiw)var2.get(var3);
            if (var4 instanceof aek) {
               aek var5 = (aek)var4;
               if (var1) {
                  var5.ae = var5.ae;
               } else {
                  var5.ae = "";
               }
            }
         }
      }

   }
}
