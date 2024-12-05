public class p7 extends ro {
   private ajd[] e4;

   public p7(int var1) {
      super(var1);
   }

   public ajd if(int var1, int var2) {
      if (var2 < 7) {
         if (var2 == 6) {
            var2 = 5;
         }

         return this.e4[var2 >> 1];
      } else {
         return this.e4[3];
      }
   }

   protected int D() {
      return abr.bG.A;
   }

   protected int C() {
      return abr.bG.A;
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      if (!var1.goto) {
         if (var5 >= 7 && var1.o.nextInt(50) == 0) {
            this.a(var1, var2, var3, var4, new abp(abr.bC));
         }

      }
   }

   public void a(ajc var1) {
      this.e4 = new ajd[4];

      for(int var2 = 0; var2 < this.e4.length; ++var2) {
         this.e4[var2] = var1.a("potatoes_" + var2);
      }

   }
}
