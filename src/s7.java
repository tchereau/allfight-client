public class s7 {
   private s6[] if = new s6[1024];
   private int a = 0;

   public s6 a(s6 var1) {
      if (var1.try >= 0) {
         throw new IllegalStateException("OW KNOWS!");
      } else {
         if (this.a == this.if.length) {
            s6[] var2 = new s6[this.a << 1];
            System.arraycopy(this.if, 0, var2, 0, this.a);
            this.if = var2;
         }

         this.if[this.a] = var1;
         var1.try = this.a;
         this.a(this.a++);
         return var1;
      }
   }

   public void do() {
      this.a = 0;
   }

   public s6 if() {
      s6 var1 = this.if[0];
      this.if[0] = this.if[--this.a];
      this.if[this.a] = null;
      if (this.a > 0) {
         this.if(0);
      }

      var1.try = -1;
      return var1;
   }

   public void a(s6 var1, float var2) {
      float var3 = var1.for;
      var1.for = var2;
      if (var2 < var3) {
         this.a(var1.try);
      } else {
         this.if(var1.try);
      }

   }

   private void a(int var1) {
      s6 var2 = this.if[var1];

      int var4;
      for(float var3 = var2.for; var1 > 0; var1 = var4) {
         var4 = var1 - 1 >> 1;
         s6 var5 = this.if[var4];
         if (!(var3 < var5.for)) {
            break;
         }

         this.if[var1] = var5;
         var5.try = var1;
      }

      this.if[var1] = var2;
      var2.try = var1;
   }

   private void if(int var1) {
      s6 var2 = this.if[var1];
      float var3 = var2.for;

      while(true) {
         int var4 = 1 + (var1 << 1);
         int var5 = var4 + 1;
         if (var4 >= this.a) {
            break;
         }

         s6 var6 = this.if[var4];
         float var7 = var6.for;
         s6 var8;
         float var9;
         if (var5 >= this.a) {
            var8 = null;
            var9 = Float.POSITIVE_INFINITY;
         } else {
            var8 = this.if[var5];
            var9 = var8.for;
         }

         if (var7 < var9) {
            if (!(var7 < var3)) {
               break;
            }

            this.if[var1] = var6;
            var6.try = var1;
            var1 = var4;
         } else {
            if (!(var9 < var3)) {
               break;
            }

            this.if[var1] = var8;
            var8.try = var1;
            var1 = var5;
         }
      }

      this.if[var1] = var2;
      var2.try = var1;
   }

   public boolean a() {
      return this.a == 0;
   }
}
