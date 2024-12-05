import java.util.Random;

abstract class vd extends uk {
   protected final int s;
   protected final int r;
   protected final int u;
   protected int t = -1;

   protected vd(Random var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(0);
      this.s = var5;
      this.r = var6;
      this.u = var7;
      this.if = var1.nextInt(4);
      switch(this.if) {
      case 0:
      case 2:
         this.do = new wc(var2, var3, var4, var2 + var5 - 1, var3 + var6 - 1, var4 + var7 - 1);
         break;
      default:
         this.do = new wc(var2, var3, var4, var2 + var7 - 1, var3 + var6 - 1, var4 + var5 - 1);
      }

   }

   protected boolean a(y6 var1, wc var2, int var3) {
      if (this.t >= 0) {
         return true;
      } else {
         int var4 = 0;
         int var5 = 0;

         for(int var6 = this.do.new; var6 <= this.do.do; ++var6) {
            for(int var7 = this.do.if; var7 <= this.do.int; ++var7) {
               if (var2.if(var7, 64, var6)) {
                  var4 += Math.max(var1.case(var7, var6), var1.n.if());
                  ++var5;
               }
            }
         }

         if (var5 == 0) {
            return false;
         } else {
            this.t = var4 / var5;
            this.do.a(0, this.t - this.do.a + var3, 0);
            return true;
         }
      }
   }
}
