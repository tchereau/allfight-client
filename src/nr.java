public class nr {
   public static final nq if = new nq(-1, -1);
   public final nq a;
   public double int;
   public double for;
   public double do;

   public static nr do(double var0, double var2, double var4) {
      return new nr(if, var0, var2, var4);
   }

   protected nr(nq var1, double var2, double var4, double var6) {
      if (var2 == -0.0D) {
         var2 = 0.0D;
      }

      if (var4 == -0.0D) {
         var4 = 0.0D;
      }

      if (var6 == -0.0D) {
         var6 = 0.0D;
      }

      this.int = var2;
      this.for = var4;
      this.do = var6;
      this.a = var1;
   }

   protected nr for(double var1, double var3, double var5) {
      this.int = var1;
      this.for = var3;
      this.do = var5;
      return this;
   }

   public nr do(nr var1) {
      return this.a.a(var1.int - this.int, var1.for - this.for, var1.do - this.do);
   }

   public nr if() {
      double var1 = (double)ajs.int(this.int * this.int + this.for * this.for + this.do * this.do);
      return var1 < 1.0E-4D ? this.a.a(0.0D, 0.0D, 0.0D) : this.a.a(this.int / var1, this.for / var1, this.do / var1);
   }

   public double int(nr var1) {
      return this.int * var1.int + this.for * var1.for + this.do * var1.do;
   }

   public nr if(nr var1) {
      return this.a.a(this.for * var1.do - this.do * var1.for, this.do * var1.int - this.int * var1.do, this.int * var1.for - this.for * var1.int);
   }

   public nr a(double var1, double var3, double var5) {
      return this.a.a(this.int + var1, this.for + var3, this.do + var5);
   }

   public double a(nr var1) {
      double var2 = var1.int - this.int;
      double var4 = var1.for - this.for;
      double var6 = var1.do - this.do;
      return (double)ajs.int(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public double for(nr var1) {
      double var2 = var1.int - this.int;
      double var4 = var1.for - this.for;
      double var6 = var1.do - this.do;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public double if(double var1, double var3, double var5) {
      double var7 = var1 - this.int;
      double var9 = var3 - this.for;
      double var11 = var5 - this.do;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double a() {
      return (double)ajs.int(this.int * this.int + this.for * this.for + this.do * this.do);
   }

   public nr if(nr var1, double var2) {
      double var4 = var1.int - this.int;
      double var6 = var1.for - this.for;
      double var8 = var1.do - this.do;
      if (var4 * var4 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.int) / var4;
         return !(var10 < 0.0D) && !(var10 > 1.0D) ? this.a.a(this.int + var4 * var10, this.for + var6 * var10, this.do + var8 * var10) : null;
      }
   }

   public nr do(nr var1, double var2) {
      double var4 = var1.int - this.int;
      double var6 = var1.for - this.for;
      double var8 = var1.do - this.do;
      if (var6 * var6 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.for) / var6;
         return !(var10 < 0.0D) && !(var10 > 1.0D) ? this.a.a(this.int + var4 * var10, this.for + var6 * var10, this.do + var8 * var10) : null;
      }
   }

   public nr a(nr var1, double var2) {
      double var4 = var1.int - this.int;
      double var6 = var1.for - this.for;
      double var8 = var1.do - this.do;
      if (var8 * var8 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.do) / var8;
         return !(var10 < 0.0D) && !(var10 > 1.0D) ? this.a.a(this.int + var4 * var10, this.for + var6 * var10, this.do + var8 * var10) : null;
      }
   }

   public String toString() {
      return "(" + this.int + ", " + this.for + ", " + this.do + ")";
   }

   public void if(float var1) {
      float var2 = ajs.for(var1);
      float var3 = ajs.try(var1);
      double var4 = this.int;
      double var6 = this.for * (double)var2 + this.do * (double)var3;
      double var8 = this.do * (double)var2 - this.for * (double)var3;
      this.int = var4;
      this.for = var6;
      this.do = var8;
   }

   public void a(float var1) {
      float var2 = ajs.for(var1);
      float var3 = ajs.try(var1);
      double var4 = this.int * (double)var2 + this.do * (double)var3;
      double var6 = this.for;
      double var8 = this.do * (double)var2 - this.int * (double)var3;
      this.int = var4;
      this.for = var6;
      this.do = var8;
   }

   public void do(float var1) {
      float var2 = ajs.for(var1);
      float var3 = ajs.try(var1);
      double var4 = this.int * (double)var2 + this.for * (double)var3;
      double var6 = this.for * (double)var2 - this.int * (double)var3;
      double var8 = this.do;
      this.int = var4;
      this.for = var6;
      this.do = var8;
   }
}
