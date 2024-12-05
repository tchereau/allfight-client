final class akc implements akb {
   public String a(int var1) {
      double var2 = (double)var1 / 100.0D;
      double var4 = var2 / 1000.0D;
      if (var4 > 0.5D) {
         return akf.int().format(var4) + " km";
      } else {
         return var2 > 0.5D ? akf.int().format(var2) + " m" : var1 + " cm";
      }
   }
}
