import java.util.HashSet;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class b extends dm {
   private int D;
   private int E;

   public b(y6 var1, List var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.D = this.else + 393216;
      this.E = this.else + 2;
   }

   public void for() {
      if (this.w != null) {
         this.a((ain)null);
         this.case();
      }
   }

   public void a(ain var1) {
      if (this.w != null) {
         this.f = false;
         int var2 = this.u;
         int var3 = this.t;
         int var4 = this.s;
         int var5 = this.u + 16;
         int var6 = this.t + 16;
         int var7 = this.s + 16;
         boolean[] var8 = new boolean[2];

         for(int var9 = 0; var9 < var8.length; ++var9) {
            var8[var9] = true;
         }

         if (vf.J.do()) {
            Object var27 = vf.a(vf.for);
            vf.for(var27, vf.p);
            vf.do(vf.O);
         }

         xx.h = false;
         HashSet var28 = new HashSet();
         var28.addAll(this.goto);
         this.goto.clear();
         byte var10 = 1;
         ys var11 = new ys(this.w, var2 - var10, var3 - var10, var4 - var10, var5 + var10, var6 + var10, var7 + var10, var10);
         if (!var11.a()) {
            ++v;
            c2 var12 = new c2(var11);
            this.for = 0;
            c4 var13 = c4.G;
            boolean var14 = vf.I.do();
            g3 var15 = new g3();

            for(int var16 = 0; var16 < 2; ++var16) {
               var15.a(var16);
               boolean var17 = false;
               boolean var18 = false;
               boolean var19 = false;

               for(int var20 = var3; var20 < var6; ++var20) {
                  if (var18 && var1 != null) {
                     var1.a(var15);
                  }

                  for(int var21 = var4; var21 < var7; ++var21) {
                     for(int var22 = var2; var22 < var5; ++var22) {
                        int var23 = var11.new(var22, var20, var21);
                        if (var23 > 0) {
                           if (!var19) {
                              var19 = true;
                              GL11.glNewList(this.else + var16, 4864);
                              var13.a(true);
                              var13.if();
                              var13.a((double)(-a), 0.0D, (double)(-x));
                           }

                           pa var24 = pa.x[var23];
                           if (var16 == 0 && var24.h()) {
                              n4 var25 = var11.if(var22, var20, var21);
                              if (az.void.if(var25)) {
                                 this.goto.add(var25);
                              }
                           }

                           int var31 = var24.b();
                           boolean var26 = true;
                           if (var31 != var16) {
                              var17 = true;
                              var26 = false;
                           }

                           if (var14) {
                              var26 = vf.int(var24, vf.P, var16);
                           }

                           if (var26) {
                              var18 |= var12.g(var24, var22, var20, var21);
                           }
                        }
                     }
                  }
               }

               if (var19) {
                  if (var1 != null) {
                     var1.a(var15);
                  }

                  this.for += var13.for();
                  GL11.glEndList();
                  var13.a(false);
                  var13.a(0.0D, 0.0D, 0.0D);
               } else {
                  var18 = false;
               }

               if (var18) {
                  var8[var16] = false;
               }

               if (!var17) {
                  break;
               }
            }
         }

         for(int var29 = 0; var29 < 2; ++var29) {
            this.j[var29] = var8[var29];
         }

         HashSet var30 = new HashSet();
         var30.addAll(this.goto);
         var30.removeAll(var28);
         this.int.addAll(var30);
         var28.removeAll(this.goto);
         this.int.removeAll(var28);
         this.long = xx.h;
         this.new = true;
         this.c = true;
         this.q = false;
      }
   }

   public void case() {
      int var1 = this.else;
      this.else = this.D;
      this.D = var1;

      for(int var2 = 0; var2 < 2; ++var2) {
         if (!this.j[var2]) {
            GL11.glNewList(this.else + var2, 4864);
            GL11.glEndList();
         }
      }

      if (this.if && !this.do()) {
         float var3 = 0.0F;
         GL11.glNewList(this.E, 4864);
         cb.a(nw.if().a((double)((float)this.n - var3), (double)((float)this.m - var3), (double)((float)this.l - var3), (double)((float)(this.n + 16) + var3), (double)((float)(this.m + 16) + var3), (double)((float)(this.l + 16) + var3)));
         GL11.glEndList();
         this.if = false;
      }

   }

   public int a(int var1) {
      if (!this.k) {
         return -1;
      } else {
         return !this.j[var1] ? this.D + var1 : -1;
      }
   }

   public void int() {
      GL11.glCallList(this.E);
   }
}
