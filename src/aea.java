public class aea extends ad9 {
   public aea(y6 var1) {
      super(var1);
   }

   public aea(y6 var1, aig var2) {
      super(var1, var2);
   }

   public aea(y6 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected void a(nt var1) {
      if (var1.do != null) {
         byte var2 = 0;
         if (var1.do instanceof ae9) {
            var2 = 3;
         }

         var1.do.a((ai4)ai4.a((aiw)this, this.a3()), var2);
      }

      for(int var3 = 0; var3 < 8; ++var3) {
         this.ap.a("snowballpoof", this.al, this.ak, this.aj, 0.0D, 0.0D, 0.0D);
      }

      if (!this.ap.goto) {
         this.az();
      }

   }
}
