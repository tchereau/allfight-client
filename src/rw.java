public class rw extends ro {
   private ajd[] e5;

   public rw(int var1) {
      super(var1);
   }

   public ajd if(int var1, int var2) {
      if (var2 < 7) {
         if (var2 == 6) {
            var2 = 5;
         }

         return this.e5[var2 >> 1];
      } else {
         return this.e5[3];
      }
   }

   protected int D() {
      return abr.bJ.A;
   }

   protected int C() {
      return abr.bJ.A;
   }

   public void a(ajc var1) {
      this.e5 = new ajd[4];

      for(int var2 = 0; var2 < this.e5.length; ++var2) {
         this.e5[var2] = var1.a("carrots_" + var2);
      }

   }
}
