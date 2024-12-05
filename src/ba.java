import net.minecraft.client.Minecraft;

public class ba extends bh {
   private double j;
   private double i;

   public ba() {
      super("compass");
   }

   public void else() {
      Minecraft var1 = Minecraft.ih();
      double var2 = 0.0D;
      if (var1.vm != null && var1.vk != null) {
         float var4 = var1.vm.try(1.0F);
         var2 = (double)var4;
         if (!var1.vm.n.a()) {
            var2 = Math.random();
         }
      }

      double var7;
      for(var7 = var2 - this.j; var7 < -0.5D; ++var7) {
      }

      while(var7 >= 0.5D) {
         --var7;
      }

      if (var7 < -1.0D) {
         var7 = -1.0D;
      }

      if (var7 > 1.0D) {
         var7 = 1.0D;
      }

      this.i += var7 * 0.1D;
      this.i *= 0.8D;
      this.j += this.i;

      int var6;
      for(var6 = (int)((this.j + 1.0D) * (double)this.g.size()) % this.g.size(); var6 < 0; var6 = (var6 + this.g.size()) % this.g.size()) {
      }

      if (var6 != this.c) {
         this.c = var6;
         this.h.a(this.e, this.d, (be)this.g.get(this.c), this.f);
      }

   }
}
