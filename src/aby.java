public class aby extends abr {
   private ajd dv;

   public aby(int var1) {
      super(var1);
      this.for(64);
      this.if(1);
      this.a(acn.char);
   }

   public boolean g() {
      return true;
   }

   public boolean else() {
      return true;
   }

   public abp a(abp var1, y6 var2, aek var3) {
      if (var3.fS != null) {
         int var4 = var3.fS.a5();
         var1.a(var4, (aig)var3);
         var3.b5();
      } else {
         var2.a((aiw)var3, "random.bow", 0.5F, 0.4F / (aj.nextFloat() * 0.4F + 0.8F));
         if (!var2.goto) {
            var2.new(new aee(var2, var3));
         }

         var3.b5();
      }

      return var1;
   }

   public void a(ajc var1) {
      super.a(var1);
      this.dv = var1.a("fishingRod_empty");
   }

   public ajd w() {
      return this.dv;
   }
}
