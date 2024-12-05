class adj extends ac9 {
   // $FF: synthetic field
   final int f;
   // $FF: synthetic field
   final adl e;

   adj(adl var1, ajg var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, var5);
      this.e = var1;
      this.f = var6;
   }

   public int int() {
      return 1;
   }

   public boolean if(abp var1) {
      if (var1 == null) {
         return false;
      } else if (var1.d() instanceof ac4) {
         return ((ac4)var1.d()).dV == this.f;
      } else if (var1.d().A != pa.aW.void && var1.d().A != abr.bv.A) {
         return false;
      } else {
         return this.f == 0;
      }
   }

   public ajd a() {
      return ac4.else(this.f);
   }
}
