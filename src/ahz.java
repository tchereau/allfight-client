public class ahz {
   private aig if;
   private float a;
   private float try;
   private boolean new = false;
   private double int;
   private double for;
   private double do;

   public ahz(aig var1) {
      this.if = var1;
   }

   public void a(aiw var1, float var2, float var3) {
      this.int = var1.al;
      if (var1 instanceof aig) {
         this.for = var1.ak + (double)var1.af();
      } else {
         this.for = (var1.aZ.a + var1.aZ.int) / 2.0D;
      }

      this.do = var1.aj;
      this.a = var2;
      this.try = var3;
      this.new = true;
   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      this.int = var1;
      this.for = var3;
      this.do = var5;
      this.a = var7;
      this.try = var8;
      this.new = true;
   }

   public void a() {
      this.if.a4 = 0.0F;
      if (this.new) {
         this.new = false;
         double var1 = this.int - this.if.al;
         double var3 = this.for - (this.if.ak + (double)this.if.af());
         double var5 = this.do - this.if.aj;
         double var7 = (double)ajs.int(var1 * var1 + var5 * var5);
         float var9 = (float)(Math.atan2(var5, var1) * 180.0D / 3.1415927410125732D) - 90.0F;
         float var10 = (float)(-(Math.atan2(var3, var7) * 180.0D / 3.1415927410125732D));
         this.if.a4 = this.a(this.if.a4, var10, this.try);
         this.if.fA = this.a(this.if.fA, var9, this.a);
      } else {
         this.if.fA = this.a(this.if.fA, this.if.eH, 10.0F);
      }

      float var11 = ajs.int(this.if.fA - this.if.eH);
      if (!this.if.bl().new()) {
         if (var11 < -75.0F) {
            this.if.fA = this.if.eH - 75.0F;
         }

         if (var11 > 75.0F) {
            this.if.fA = this.if.eH + 75.0F;
         }
      }

   }

   private float a(float var1, float var2, float var3) {
      float var4 = ajs.int(var2 - var1);
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }
}
