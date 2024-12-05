import java.util.HashSet;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class ko extends dm {
   private art y = new art();
   public int C = 0;
   public int[] z = new int[]{0, 0};
   public int[][][] A = new int[2][2][16];
   public boolean[] B = new boolean[2];

   public ko(y6 var1, List var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      int var7 = 393216 + 64 * (this.else / 3);

      for(int var8 = 0; var8 < 2; ++var8) {
         int var9 = var7 + var8 * 2 * 16;

         for(int var10 = 0; var10 < 2; ++var10) {
            int var11 = var9 + var10 * 16;

            for(int var12 = 0; var12 < 16; ++var12) {
               this.A[var8][var10][var12] = var11 + var12;
            }
         }
      }

   }

   public void a(int var1, int var2, int var3) {
      if (this.do) {
         this.for();
      }

      super.a(var1, var2, var3);
   }

   public void for() {
      if (this.w != null) {
         this.a(0L);
         this.byte();
      }
   }

   public boolean a(long var1) {
      if (this.w == null) {
         return true;
      } else {
         this.f = false;
         if (!this.do) {
            if (this.if) {
               float var3 = 0.0F;
               GL11.glNewList(this.else + 2, 4864);
               cb.a(nw.if().a((double)((float)this.n - var3), (double)((float)this.m - var3), (double)((float)this.l - var3), (double)((float)(this.n + 16) + var3), (double)((float)(this.m + 16) + var3), (double)((float)(this.l + 16) + var3)));
               GL11.glEndList();
               this.if = false;
            }

            if (vf.J.do()) {
               Object var25 = vf.a(vf.for);
               vf.for(var25, vf.p);
               vf.do(vf.O);
            }

            xx.h = false;
         }

         int var26 = this.u;
         int var4 = this.t;
         int var5 = this.s;
         int var6 = this.u + 16;
         int var7 = this.t + 16;
         int var8 = this.s + 16;
         ys var9 = null;
         c2 var10 = null;
         HashSet var11 = null;
         if (!this.do) {
            for(int var12 = 0; var12 < 2; ++var12) {
               this.B[var12] = true;
            }

            byte var27 = 1;
            var9 = new ys(this.w, var26 - var27, var4 - var27, var5 - var27, var6 + var27, var7 + var27, var8 + var27, var27);
            var10 = new c2(var9);
            var11 = new HashSet();
            var11.addAll(this.goto);
            this.goto.clear();
         }

         if (this.do || !var9.a()) {
            this.for = 0;
            c4 var28 = c4.G;
            boolean var13 = vf.I.do();

            for(int var14 = 0; var14 < 2; ++var14) {
               boolean var15 = false;
               boolean var16 = false;
               boolean var17 = false;

               for(int var18 = var4; var18 < var7; ++var18) {
                  if (this.do) {
                     this.do = false;
                     var9 = this.y.try;
                     var10 = this.y.new;
                     var11 = this.y.int;
                     var14 = this.y.do;
                     var18 = this.y.byte;
                     var15 = this.y.if;
                     var16 = this.y.a;
                     var17 = this.y.for;
                     if (var17) {
                        GL11.glNewList(this.A[this.C][var14][this.z[var14]], 4864);
                        var28.a(true);
                        var28.if();
                        var28.a((double)(-a), 0.0D, (double)(-x));
                     }
                  } else if (var17 && var1 != 0L && System.nanoTime() - var1 > 0L && this.z[var14] < 15) {
                     var28.for();
                     GL11.glEndList();
                     var28.a(false);
                     var28.a(0.0D, 0.0D, 0.0D);
                     int var10002 = this.z[var14]++;
                     this.y.try = var9;
                     this.y.new = var10;
                     this.y.int = var11;
                     this.y.do = var14;
                     this.y.byte = var18;
                     this.y.if = var15;
                     this.y.a = var16;
                     this.y.for = var17;
                     this.do = true;
                     return false;
                  }

                  for(int var19 = var5; var19 < var8; ++var19) {
                     for(int var20 = var26; var20 < var6; ++var20) {
                        int var21 = var9.new(var20, var18, var19);
                        if (var21 > 0) {
                           if (!var17) {
                              var17 = true;
                              GL11.glNewList(this.A[this.C][var14][this.z[var14]], 4864);
                              var28.a(true);
                              var28.if();
                              var28.a((double)(-a), 0.0D, (double)(-x));
                           }

                           pa var22 = pa.x[var21];
                           if (var14 == 0 && var22.h()) {
                              n4 var23 = var9.if(var20, var18, var19);
                              if (az.void.if(var23)) {
                                 this.goto.add(var23);
                              }
                           }

                           int var30 = var22.b();
                           boolean var24 = true;
                           if (var30 != var14) {
                              var15 = true;
                              var24 = false;
                           }

                           if (var13) {
                              var24 = vf.int(var22, vf.P, var14);
                           }

                           if (var24) {
                              var16 |= var10.g(var22, var20, var18, var19);
                           }
                        }
                     }
                  }
               }

               if (var17) {
                  this.for += var28.for();
                  GL11.glEndList();
                  var28.a(false);
                  var28.a(0.0D, 0.0D, 0.0D);
               } else {
                  var16 = false;
               }

               if (var16) {
                  this.B[var14] = false;
               }

               if (!var15) {
                  break;
               }
            }
         }

         HashSet var29 = new HashSet();
         var29.addAll(this.goto);
         var29.removeAll(var11);
         this.int.addAll(var29);
         var11.removeAll(this.goto);
         this.int.removeAll(var11);
         this.long = xx.h;
         this.new = true;
         ++v;
         this.c = true;
         this.q = false;
         this.j[0] = this.B[0];
         this.j[1] = this.B[1];
         this.do = false;
         return true;
      }
   }

   public void byte() {
      int var1;
      int var2;
      int var3;
      for(var1 = 0; var1 < 2; ++var1) {
         if (!this.j[var1]) {
            GL11.glNewList(this.else + var1, 4864);

            for(var2 = 0; var2 <= this.z[var1]; ++var2) {
               var3 = this.A[this.C][var1][var2];
               GL11.glCallList(var3);
            }

            GL11.glEndList();
         }
      }

      if (this.C == 0) {
         this.C = 1;
      } else {
         this.C = 0;
      }

      for(var1 = 0; var1 < 2; ++var1) {
         if (!this.j[var1]) {
            for(var2 = 0; var2 <= this.z[var1]; ++var2) {
               var3 = this.A[this.C][var1][var2];
               GL11.glNewList(var3, 4864);
               GL11.glEndList();
            }
         }
      }

      for(var1 = 0; var1 < 2; ++var1) {
         this.z[var1] = 0;
      }

   }
}
