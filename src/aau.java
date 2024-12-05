public class aau extends abr {
   public aau(int var1) {
      super(var1);
      this.if(1);
   }

   public abp a(abp var1, y6 var2, aek var3) {
      var3.goto(var1);
      return var1;
   }

   public boolean c() {
      return true;
   }

   public static boolean if(aqv var0) {
      if (var0 == null) {
         return false;
      } else if (!var0.try("pages")) {
         return false;
      } else {
         aqm var1 = (aqm)var0.byte("pages");

         for(int var2 = 0; var2 < var1.for(); ++var2) {
            aqf var3 = (aqf)var1.a(var2);
            if (var3.do == null) {
               return false;
            }

            if (var3.do.length() > 256) {
               return false;
            }
         }

         return true;
      }
   }
}
