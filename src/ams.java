class ams extends am7 {
   // $FF: synthetic field
   final abp byte;
   // $FF: synthetic field
   final amt case;

   ams(amt var1, abp var2) {
      this.case = var1;
      this.byte = var2;
   }

   protected aec a(y6 var1, aq3 var2) {
      return new ad4(var1, var2.a(), var2.do(), var2.if(), this.byte.n());
   }

   protected float a() {
      return super.a() * 0.5F;
   }

   protected float if() {
      return super.if() * 1.25F;
   }
}
