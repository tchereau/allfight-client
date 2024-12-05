import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class dm {
   public y6 w;
   protected int else = -1;
   public static volatile int v = 0;
   public int u;
   public int t;
   public int s;
   public int r;
   public int p;
   public int o;
   public int n;
   public int m;
   public int l;
   public boolean k = false;
   public boolean[] j = new boolean[2];
   public int i;
   public int h;
   public int g;
   public volatile boolean f;
   public nw e;
   public int d;
   public boolean c = true;
   public boolean b;
   public int void;
   public boolean long;
   protected boolean new = false;
   public List goto = new ArrayList();
   protected List int;
   protected int for;
   public boolean q = false;
   public double char;
   public double case;
   public double byte;
   public boolean try = false;
   protected boolean if = false;
   public volatile boolean do = false;
   public static int a = 0;
   public static int x = 0;

   public dm(y6 var1, List var2, int var3, int var4, int var5, int var6) {
      this.w = var1;
      this.int = var2;
      this.else = var6;
      this.u = -999;
      this.a(var3, var4, var5);
      this.f = false;
   }

   public void a(int var1, int var2, int var3) {
      if (var1 != this.u || var2 != this.t || var3 != this.s) {
         this.if();
         this.u = var1;
         this.t = var2;
         this.s = var3;
         this.i = var1 + 8;
         this.h = var2 + 8;
         this.g = var3 + 8;
         this.n = var1 & 1023;
         this.m = var2;
         this.l = var3 & 1023;
         this.r = var1 - this.n;
         this.p = var2 - this.m;
         this.o = var3 - this.l;
         float var4 = 0.0F;
         this.e = nw.if((double)((float)var1 - var4), (double)((float)var2 - var4), (double)((float)var3 - var4), (double)((float)(var1 + 16) + var4), (double)((float)(var2 + 16) + var4), (double)((float)(var3 + 16) + var4));
         this.if = true;
         this.a();
         this.q = false;
      }
   }

   private void new() {
      GL11.glTranslatef((float)this.n, (float)this.m, (float)this.l);
   }

   public void for() {
      if (this.w != null) {
         if (this.f) {
            if (this.if) {
               float var1 = 0.0F;
               GL11.glNewList(this.else + 2, 4864);
               cb.a(nw.if().a((double)((float)this.n - var1), (double)((float)this.m - var1), (double)((float)this.l - var1), (double)((float)(this.n + 16) + var1), (double)((float)(this.m + 16) + var1), (double)((float)(this.l + 16) + var1)));
               GL11.glEndList();
               this.if = false;
            }

            this.c = true;
            this.q = false;
            this.f = false;
            int var24 = this.u;
            int var2 = this.t;
            int var3 = this.s;
            int var4 = this.u + 16;
            int var5 = this.t + 16;
            int var6 = this.s + 16;

            for(int var7 = 0; var7 < 2; ++var7) {
               this.j[var7] = true;
            }

            if (vf.J.do()) {
               Object var25 = vf.a(vf.for);
               vf.for(var25, vf.p);
               vf.do(vf.O);
            }

            xx.h = false;
            HashSet var26 = new HashSet();
            var26.addAll(this.goto);
            this.goto.clear();
            byte var8 = 1;
            ys var9 = new ys(this.w, var24 - var8, var2 - var8, var3 - var8, var4 + var8, var5 + var8, var6 + var8, var8);
            if (!var9.a()) {
               ++v;
               c2 var10 = new c2(var9);
               this.for = 0;
               c4 var11 = c4.G;
               boolean var12 = vf.I.do();

               for(int var13 = 0; var13 < 2; ++var13) {
                  boolean var14 = false;
                  boolean var15 = false;
                  boolean var16 = false;

                  for(int var17 = var2; var17 < var5; ++var17) {
                     for(int var18 = var3; var18 < var6; ++var18) {
                        for(int var19 = var24; var19 < var4; ++var19) {
                           int var20 = var9.new(var19, var17, var18);
                           if (var20 > 0) {
                              if (!var16) {
                                 var16 = true;
                                 GL11.glNewList(this.else + var13, 4864);
                                 var11.a(true);
                                 var11.if();
                                 var11.a((double)(-a), 0.0D, (double)(-x));
                              }

                              pa var21 = pa.x[var20];
                              if (var21 != null) {
                                 if (var13 == 0 && var21.h()) {
                                    n4 var22 = var9.if(var19, var17, var18);
                                    if (az.void.if(var22)) {
                                       this.goto.add(var22);
                                    }
                                 }

                                 int var28 = var21.b();
                                 boolean var23 = true;
                                 if (var28 != var13) {
                                    var14 = true;
                                    var23 = false;
                                 }

                                 if (var12) {
                                    var23 = vf.int(var21, vf.P, var13);
                                 }

                                 if (var23) {
                                    var15 |= var10.g(var21, var19, var17, var18);
                                 }
                              }
                           }
                        }
                     }
                  }

                  if (var16) {
                     this.for += var11.for();
                     GL11.glEndList();
                     var11.a(false);
                     var11.a(0.0D, 0.0D, 0.0D);
                  } else {
                     var15 = false;
                  }

                  if (var15) {
                     this.j[var13] = false;
                  }

                  if (!var14) {
                     break;
                  }
               }
            }

            HashSet var27 = new HashSet();
            var27.addAll(this.goto);
            var27.removeAll(var26);
            this.int.addAll(var27);
            var26.removeAll(this.goto);
            this.int.removeAll(var26);
            this.long = xx.h;
            this.new = true;
         }
      }
   }

   public float a(aiw var1) {
      float var2 = (float)(var1.al - (double)this.i);
      float var3 = (float)(var1.ak - (double)this.h);
      float var4 = (float)(var1.aj - (double)this.g);
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public void if() {
      for(int var1 = 0; var1 < 2; ++var1) {
         this.j[var1] = true;
      }

      this.k = false;
      this.new = false;
   }

   public void try() {
      this.if();
      this.w = null;
   }

   public int a(int var1) {
      if (!this.k) {
         return -1;
      } else {
         return !this.j[var1] ? this.else + var1 : -1;
      }
   }

   public void a(c1 var1) {
      this.k = var1.a(this.e);
      if (this.k && qs.az() && qs.x()) {
         this.try = var1.if(this.e);
      } else {
         this.try = false;
      }

   }

   public void int() {
      GL11.glCallList(this.else + 2);
   }

   public boolean do() {
      if (!this.new) {
         return false;
      } else {
         return this.j[0] && this.j[1];
      }
   }

   public void a() {
      this.f = true;
   }
}
