import java.util.Random;

public class rn extends r8 {
   private ajd[] ew = new ajd[2];

   public rn(int var1) {
      super(var1, ts.w);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
      this.a(acn.b);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
   }

   public int do(yy var1, int var2, int var3, int var4, int var5) {
      return var1.for(var2, var3, var4);
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
   }

   public void for(y6 var1, int var2, int var3, int var4) {
   }

   public void J(y6 var1, int var2, int var3, int var4) {
      if (!var1.n.for) {
         int var5 = var1.for(var2, var3, var4);
         int var6 = var1.for(yw.if, var2, var3, var4) - var1.x;
         float var7 = var1.do(1.0F);
         if (var7 < 3.1415927F) {
            var7 += (0.0F - var7) * 0.2F;
         } else {
            var7 += (6.2831855F - var7) * 0.2F;
         }

         var6 = Math.round((float)var6 * ajs.for(var7));
         if (var6 < 0) {
            var6 = 0;
         }

         if (var6 > 15) {
            var6 = 15;
         }

         if (var5 != var6) {
            var1.do(var2, var3, var4, var6, 3);
         }

      }
   }

   public boolean if() {
      return false;
   }

   public boolean do() {
      return false;
   }

   public boolean int() {
      return true;
   }

   public n4 if(y6 var1) {
      return new oj();
   }

   public ajd if(int var1, int var2) {
      return var1 == 1 ? this.ew[0] : this.ew[1];
   }

   public void a(ajc var1) {
      this.ew[0] = var1.a("daylightDetector_top");
      this.ew[1] = var1.a("daylightDetector_side");
   }
}
