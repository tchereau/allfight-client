import java.util.Random;

public class vc extends vd {
   private boolean v;

   public vc(Random var1, int var2, int var3) {
      super(var1, var2, 64, var3, 7, 5, 9);
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (!this.a(var1, var3, 0)) {
         return false;
      } else {
         this.a(var1, var3, 1, 1, 1, 5, 1, 7, pa.be.void, 1, pa.be.void, 1, false);
         this.a(var1, var3, 1, 4, 2, 5, 4, 7, pa.be.void, 1, pa.be.void, 1, false);
         this.a(var1, var3, 2, 1, 0, 4, 1, 0, pa.be.void, 1, pa.be.void, 1, false);
         this.a(var1, var3, 2, 2, 2, 3, 3, 2, pa.be.void, 1, pa.be.void, 1, false);
         this.a(var1, var3, 1, 2, 3, 1, 3, 6, pa.be.void, 1, pa.be.void, 1, false);
         this.a(var1, var3, 5, 2, 3, 5, 3, 6, pa.be.void, 1, pa.be.void, 1, false);
         this.a(var1, var3, 2, 2, 7, 4, 3, 7, pa.be.void, 1, pa.be.void, 1, false);
         this.a(var1, var3, 1, 0, 2, 1, 3, 2, pa.aM.void, pa.aM.void, false);
         this.a(var1, var3, 5, 0, 2, 5, 3, 2, pa.aM.void, pa.aM.void, false);
         this.a(var1, var3, 1, 0, 7, 1, 3, 7, pa.aM.void, pa.aM.void, false);
         this.a(var1, var3, 5, 0, 7, 5, 3, 7, pa.aM.void, pa.aM.void, false);
         this.a(var1, pa.aZ.void, 0, 2, 3, 2, var3);
         this.a(var1, pa.aZ.void, 0, 3, 3, 7, var3);
         this.a(var1, 0, 0, 1, 3, 4, var3);
         this.a(var1, 0, 0, 5, 3, 4, var3);
         this.a(var1, 0, 0, 5, 3, 5, var3);
         this.a(var1, pa.I.void, 7, 1, 3, 5, var3);
         this.a(var1, pa.cu.void, 0, 3, 2, 6, var3);
         this.a(var1, pa.bM.void, 0, 4, 2, 6, var3);
         this.a(var1, pa.aZ.void, 0, 1, 2, 1, var3);
         this.a(var1, pa.aZ.void, 0, 5, 2, 1, var3);
         int var4 = this.do(pa.bk.void, 3);
         int var5 = this.do(pa.bk.void, 1);
         int var6 = this.do(pa.bk.void, 0);
         int var7 = this.do(pa.bk.void, 2);
         this.a(var1, var3, 0, 4, 1, 6, 4, 1, pa.U.void, var4, pa.U.void, var4, false);
         this.a(var1, var3, 0, 4, 2, 0, 4, 7, pa.U.void, var6, pa.U.void, var6, false);
         this.a(var1, var3, 6, 4, 2, 6, 4, 7, pa.U.void, var5, pa.U.void, var5, false);
         this.a(var1, var3, 0, 4, 8, 6, 4, 8, pa.U.void, var7, pa.U.void, var7, false);

         int var8;
         int var9;
         for(var8 = 2; var8 <= 7; var8 += 5) {
            for(var9 = 1; var9 <= 5; var9 += 4) {
               this.if(var1, pa.aM.void, 0, var9, -1, var8, var3);
            }
         }

         if (!this.v) {
            var8 = this.a(2, 5);
            var9 = this.a(2);
            int var10 = this.if(2, 5);
            if (var3.if(var8, var9, var10)) {
               this.v = true;
               aet var11 = new aet(var1);
               var11.if((double)var8 + 0.5D, (double)var9, (double)var10 + 0.5D, 0.0F, 0.0F);
               var11.bO();
               var1.new(var11);
            }
         }

         return true;
      }
   }
}
