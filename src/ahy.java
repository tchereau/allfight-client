public class ahy {
   private aig if;
   private double a;
   private double new;
   private double int;
   private float for;
   private boolean do = false;

   public ahy(aig var1) {
      this.if = var1;
      this.a = var1.al;
      this.new = var1.ak;
      this.int = var1.aj;
   }

   public boolean if() {
      return this.do;
   }

   public float do() {
      return this.for;
   }

   public void a(double var1, double var3, double var5, float var7) {
      this.a = var1;
      this.new = var3;
      this.int = var5;
      this.for = var7;
      this.do = true;
   }

   public void a() {
      this.if.c(0.0F);
      if (this.do) {
         this.do = false;
         int var1 = ajs.a(this.if.aZ.a + 0.5D);
         double var2 = this.a - this.if.al;
         double var4 = this.int - this.if.aj;
         double var6 = this.new - (double)var1;
         double var8 = var2 * var2 + var6 * var6 + var4 * var4;
         if (!(var8 < 2.500000277905201E-7D)) {
            float var10 = (float)(Math.atan2(var4, var2) * 180.0D / 3.1415927410125732D) - 90.0F;
            this.if.a5 = this.a(this.if.a5, var10, 30.0F);
            this.if.goto(this.for * this.if.bM());
            if (var6 > 0.0D && var2 * var2 + var4 * var4 < 1.0D) {
               this.if.bo().if();
            }

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
