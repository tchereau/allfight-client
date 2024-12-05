import net.minecraft.client.Minecraft;

public class a9 extends bh {
   public static a9 m;
   public double l;
   public double k;

   public a9() {
      super("compass");
      m = this;
   }

   public void else() {
      Minecraft var1 = Minecraft.ih();
      if (var1.vm != null && var1.vk != null) {
         this.a(var1.vm, var1.vk.al, var1.vk.aj, (double)var1.vk.a5, false, false);
      } else {
         this.a((y6)null, 0.0D, 0.0D, 0.0D, true, false);
      }

   }

   public void a(y6 var1, double var2, double var4, double var6, boolean var8, boolean var9) {
      double var10 = 0.0D;
      if (var1 != null && !var8) {
         apg var12 = var1.long();
         double var13 = (double)var12.if - var2;
         double var15 = (double)var12.do - var4;
         var6 %= 360.0D;
         var10 = -((var6 - 90.0D) * 3.141592653589793D / 180.0D - Math.atan2(var15, var13));
         if (!var1.n.a()) {
            var10 = Math.random() * 3.1415927410125732D * 2.0D;
         }
      }

      if (var9) {
         this.l = var10;
      } else {
         double var17;
         for(var17 = var10 - this.l; var17 < -3.141592653589793D; var17 += 6.283185307179586D) {
         }

         while(var17 >= 3.141592653589793D) {
            var17 -= 6.283185307179586D;
         }

         if (var17 < -1.0D) {
            var17 = -1.0D;
         }

         if (var17 > 1.0D) {
            var17 = 1.0D;
         }

         this.k += var17 * 0.1D;
         this.k *= 0.8D;
         this.l += this.k;
      }

      int var18;
      for(var18 = (int)((this.l / 6.283185307179586D + 1.0D) * (double)this.g.size()) % this.g.size(); var18 < 0; var18 = (var18 + this.g.size()) % this.g.size()) {
      }

      if (var18 != this.c) {
         this.c = var18;
         this.h.a(this.e, this.d, (be)this.g.get(this.c), this.f);
      }

   }
}
