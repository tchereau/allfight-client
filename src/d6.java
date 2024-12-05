import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class d6 {
   protected y6 if;
   private List[] a = new List[4];
   private c3 for;
   private Random do = new Random();

   public d6(y6 var1, c3 var2) {
      if (var1 != null) {
         this.if = var1;
      }

      this.for = var2;

      for(int var3 = 0; var3 < 4; ++var3) {
         this.a[var3] = new ArrayList();
      }

   }

   public void a(d7 var1) {
      int var2 = var1.aS();
      if (this.a[var2].size() >= 4000) {
         this.a[var2].remove(0);
      }

      this.a[var2].add(var1);
   }

   public void if() {
      for(int var1 = 0; var1 < 4; ++var1) {
         for(int var2 = 0; var2 < this.a[var1].size(); ++var2) {
            d7 var3 = (d7)this.a[var1].get(var2);
            var3.aC();
            if (var3.aR) {
               this.a[var1].remove(var2--);
            }
         }
      }

   }

   public void if(aiw var1, float var2) {
      float var3 = k7.case;
      float var4 = k7.try;
      float var5 = k7.new;
      float var6 = k7.int;
      float var7 = k7.byte;
      d7.bD = var1.aJ + (var1.al - var1.aJ) * (double)var2;
      d7.bC = var1.aI + (var1.ak - var1.aI) * (double)var2;
      d7.bt = var1.aH + (var1.aj - var1.aH) * (double)var2;

      for(int var8 = 0; var8 < 3; ++var8) {
         if (!this.a[var8].isEmpty()) {
            switch(var8) {
            case 0:
            default:
               this.for.for("/particles.png");
               break;
            case 1:
               this.for.for("/terrain.png");
               break;
            case 2:
               this.for.for("/gui/items.png");
            }

            c4 var9 = c4.G;
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDepthMask(false);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glAlphaFunc(516, 0.003921569F);
            var9.if();

            for(int var10 = 0; var10 < this.a[var8].size(); ++var10) {
               d7 var11 = (d7)this.a[var8].get(var10);
               var9.if(var11.new(var2));
               var11.a(var9, var2, var3, var7, var4, var5, var6);
            }

            var9.for();
            GL11.glDisable(3042);
            GL11.glDepthMask(true);
            GL11.glAlphaFunc(516, 0.1F);
         }
      }

   }

   public void a(aiw var1, float var2) {
      float var4 = ajs.for(var1.a5 * 0.017453292F);
      float var5 = ajs.try(var1.a5 * 0.017453292F);
      float var6 = -var5 * ajs.try(var1.a4 * 0.017453292F);
      float var7 = var4 * ajs.try(var1.a4 * 0.017453292F);
      float var8 = ajs.for(var1.a4 * 0.017453292F);
      byte var9 = 3;
      if (!this.a[var9].isEmpty()) {
         c4 var10 = c4.G;

         for(int var11 = 0; var11 < this.a[var9].size(); ++var11) {
            d7 var12 = (d7)this.a[var9].get(var11);
            var10.if(var12.new(var2));
            var12.a(var10, var2, var4, var8, var5, var6, var7);
         }

      }
   }

   public void a(y6 var1) {
      this.if = var1;

      for(int var2 = 0; var2 < 4; ++var2) {
         this.a[var2].clear();
      }

   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      if (var4 != 0) {
         pa var6 = pa.x[var4];
         byte var7 = 4;

         for(int var8 = 0; var8 < var7; ++var8) {
            for(int var9 = 0; var9 < var7; ++var9) {
               for(int var10 = 0; var10 < var7; ++var10) {
                  double var11 = (double)var1 + ((double)var8 + 0.5D) / (double)var7;
                  double var13 = (double)var2 + ((double)var9 + 0.5D) / (double)var7;
                  double var15 = (double)var3 + ((double)var10 + 0.5D) / (double)var7;
                  int var17 = this.do.nextInt(6);
                  this.a((d7)(new du(this.if, var11, var13, var15, var11 - (double)var1 - 0.5D, var13 - (double)var2 - 0.5D, var15 - (double)var3 - 0.5D, var6, var17, var5, this.for)).if(var1, var2, var3));
               }
            }
         }

      }
   }

   public void a(int var1, int var2, int var3, int var4) {
      int var5 = this.if.new(var1, var2, var3);
      if (var5 != 0) {
         pa var6 = pa.x[var5];
         float var7 = 0.1F;
         double var8 = (double)var1 + this.do.nextDouble() * (var6.l() - var6.j() - (double)(var7 * 2.0F)) + (double)var7 + var6.j();
         double var10 = (double)var2 + this.do.nextDouble() * (var6.n() - var6.m() - (double)(var7 * 2.0F)) + (double)var7 + var6.m();
         double var12 = (double)var3 + this.do.nextDouble() * (var6.q() - var6.o() - (double)(var7 * 2.0F)) + (double)var7 + var6.o();
         if (var4 == 0) {
            var10 = (double)var2 + var6.m() - (double)var7;
         }

         if (var4 == 1) {
            var10 = (double)var2 + var6.n() + (double)var7;
         }

         if (var4 == 2) {
            var12 = (double)var3 + var6.o() - (double)var7;
         }

         if (var4 == 3) {
            var12 = (double)var3 + var6.q() + (double)var7;
         }

         if (var4 == 4) {
            var8 = (double)var1 + var6.j() - (double)var7;
         }

         if (var4 == 5) {
            var8 = (double)var1 + var6.l() + (double)var7;
         }

         this.a((new du(this.if, var8, var10, var12, 0.0D, 0.0D, 0.0D, var6, var4, this.if.for(var1, var2, var3), this.for)).if(var1, var2, var3).else(0.2F).char(0.6F));
      }
   }

   public String a() {
      return "" + (this.a[0].size() + this.a[1].size() + this.a[2].size());
   }
}
