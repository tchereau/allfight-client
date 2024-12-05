public class rf extends rh {
   private final aq8 ev = new ara();

   protected rf(int var1) {
      super(var1);
   }

   public void a(ajc var1) {
      this.an = var1.a("furnace_side");
      this.eu = var1.a("furnace_top");
      this.et = var1.a("dropper_front");
      this.es = var1.a("dropper_front_vertical");
   }

   protected aq8 do(abp var1) {
      return this.ev;
   }

   public n4 if(y6 var1) {
      return new oh();
   }

   protected void H(y6 var1, int var2, int var3, int var4) {
      arb var5 = new arb(var1, var2, var3, var4);
      oi var6 = (oi)var5.try();
      if (var6 != null) {
         int var7 = var6.v();
         if (var7 < 0) {
            var1.for(1001, var2, var3, var4, 0);
         } else {
            abp var8 = var6.do(var7);
            int var9 = var1.for(var2, var3, var4) & 7;
            ajg var10 = oc.a(var1, (double)(var2 + api.a[var9]), (double)(var3 + api.int[var9]), (double)(var4 + api.for[var9]));
            abp var11;
            if (var10 != null) {
               var11 = oc.a(var10, var8.n().a(1), api.if[var9]);
               if (var11 == null) {
                  var11 = var8.n();
                  if (--var11.if == 0) {
                     var11 = null;
                  }
               } else {
                  var11 = var8.n();
               }
            } else {
               var11 = this.ev.a(var5, var8);
               if (var11 != null && var11.if == 0) {
                  var11 = null;
               }
            }

            var6.if(var7, var11);
         }

      }
   }
}
