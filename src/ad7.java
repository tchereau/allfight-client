public class ad7 extends ad9 {
   public ad7(y6 var1) {
      super(var1);
   }

   public ad7(y6 var1, aig var2) {
      super(var1, var2);
   }

   public ad7(y6 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected void a(nt var1) {
      if (var1.do != null) {
         var1.do.a((ai4)ai4.a((aiw)this, this.a3()), 0);
      }

      if (!this.ap.goto && this.bm.nextInt(8) == 0) {
         byte var2 = 1;
         if (this.bm.nextInt(32) == 0) {
            var2 = 4;
         }

         for(int var3 = 0; var3 < var2; ++var3) {
            af8 var4 = new af8(this.ap);
            var4.at(-24000);
            var4.if(this.al, this.ak, this.aj, this.a5, 0.0F);
            this.ap.new(var4);
         }
      }

      for(int var5 = 0; var5 < 8; ++var5) {
         this.ap.a("snowballpoof", this.al, this.ak, this.aj, 0.0D, 0.0D, 0.0D);
      }

      if (!this.ap.goto) {
         this.az();
      }

   }
}
