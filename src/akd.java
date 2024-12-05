final class akd implements akb {
   public String a(int var1) {
      double var2 = (double)var1 / 20.0D;
      double var4 = var2 / 60.0D;
      double var6 = var4 / 60.0D;
      double var8 = var6 / 24.0D;
      double var10 = var8 / 365.0D;
      if (var10 > 0.5D) {
         return akf.int().format(var10) + " y";
      } else if (var8 > 0.5D) {
         return akf.int().format(var8) + " d";
      } else if (var6 > 0.5D) {
         return akf.int().format(var6) + " h";
      } else {
         return var4 > 0.5D ? akf.int().format(var4) + " m" : var2 + " s";
      }
   }
}
