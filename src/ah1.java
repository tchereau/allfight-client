public class ah1 {
   private aig if;
   private int a = 0;
   private float do = 0.0F;

   public ah1(aig var1) {
      this.if = var1;
   }

   public void a() {
      double var1 = this.if.al - this.if.ao;
      double var3 = this.if.aj - this.if.am;
      if (var1 * var1 + var3 * var3 > 2.500000277905201E-7D) {
         this.if.eH = this.if.a5;
         this.if.fA = this.a(this.if.eH, this.if.fA, 75.0F);
         this.do = this.if.fA;
         this.a = 0;
      } else {
         float var5 = 75.0F;
         if (Math.abs(this.if.fA - this.do) > 15.0F) {
            this.a = 0;
            this.do = this.if.fA;
         } else {
            ++this.a;
            if (this.a > 10) {
               var5 = Math.max(1.0F - (float)(this.a - 10) / 10.0F, 0.0F) * 75.0F;
            }
         }

         this.if.eH = this.a(this.if.fA, this.if.eH, var5);
      }
   }

   private float a(float var1, float var2, float var3) {
      float var4 = ajs.int(var1 - var2);
      if (var4 < -var3) {
         var4 = -var3;
      }

      if (var4 >= var3) {
         var4 = var3;
      }

      return var1 - var4;
   }
}
