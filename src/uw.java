import java.util.List;
import java.util.Random;

public class uw extends uq {
   private static final aji[] b;
   protected final up void;
   protected final int long;

   public uw(int var1, Random var2, wc var3, int var4) {
      super(var1);
      this.if = var4;
      this.void = this.a(var2);
      this.do = var3;
      this.long = var2.nextInt(5);
   }

   public void a(uk var1, List var2, Random var3) {
      this.do((ut)var1, var2, var3, 4, 1);
      this.a((ut)var1, var2, var3, 1, 4);
      this.if((ut)var1, var2, var3, 1, 4);
   }

   public static uw for(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      wc var7 = wc.a(var2, var3, var4, -4, -1, 0, 11, 7, 11, var5);
      return a(var7) && uk.a(var0, var7) == null ? new uw(var6, var1, var7, var5) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 10, 6, 10, true, var2, u9.do());
         this.a(var1, var2, var3, this.void, 4, 1, 0);
         this.a(var1, var3, 4, 1, 10, 6, 3, 10, 0, 0, false);
         this.a(var1, var3, 0, 1, 4, 0, 3, 6, 0, 0, false);
         this.a(var1, var3, 10, 1, 4, 10, 3, 6, 0, 0, false);
         int var4;
         switch(this.long) {
         case 0:
            this.a(var1, pa.am.void, 0, 5, 1, 5, var3);
            this.a(var1, pa.am.void, 0, 5, 2, 5, var3);
            this.a(var1, pa.am.void, 0, 5, 3, 5, var3);
            this.a(var1, pa.bq.void, 0, 4, 3, 5, var3);
            this.a(var1, pa.bq.void, 0, 6, 3, 5, var3);
            this.a(var1, pa.bq.void, 0, 5, 3, 4, var3);
            this.a(var1, pa.bq.void, 0, 5, 3, 6, var3);
            this.a(var1, pa.bD.void, 0, 4, 1, 4, var3);
            this.a(var1, pa.bD.void, 0, 4, 1, 5, var3);
            this.a(var1, pa.bD.void, 0, 4, 1, 6, var3);
            this.a(var1, pa.bD.void, 0, 6, 1, 4, var3);
            this.a(var1, pa.bD.void, 0, 6, 1, 5, var3);
            this.a(var1, pa.bD.void, 0, 6, 1, 6, var3);
            this.a(var1, pa.bD.void, 0, 5, 1, 4, var3);
            this.a(var1, pa.bD.void, 0, 5, 1, 6, var3);
            break;
         case 1:
            for(var4 = 0; var4 < 5; ++var4) {
               this.a(var1, pa.am.void, 0, 3, 1, 3 + var4, var3);
               this.a(var1, pa.am.void, 0, 7, 1, 3 + var4, var3);
               this.a(var1, pa.am.void, 0, 3 + var4, 1, 3, var3);
               this.a(var1, pa.am.void, 0, 3 + var4, 1, 7, var3);
            }

            this.a(var1, pa.am.void, 0, 5, 1, 5, var3);
            this.a(var1, pa.am.void, 0, 5, 2, 5, var3);
            this.a(var1, pa.am.void, 0, 5, 3, 5, var3);
            this.a(var1, pa.bb.void, 0, 5, 4, 5, var3);
            break;
         case 2:
            for(var4 = 1; var4 <= 9; ++var4) {
               this.a(var1, pa.bf.void, 0, 1, 3, var4, var3);
               this.a(var1, pa.bf.void, 0, 9, 3, var4, var3);
            }

            for(var4 = 1; var4 <= 9; ++var4) {
               this.a(var1, pa.bf.void, 0, var4, 3, 1, var3);
               this.a(var1, pa.bf.void, 0, var4, 3, 9, var3);
            }

            this.a(var1, pa.bf.void, 0, 5, 1, 4, var3);
            this.a(var1, pa.bf.void, 0, 5, 1, 6, var3);
            this.a(var1, pa.bf.void, 0, 5, 3, 4, var3);
            this.a(var1, pa.bf.void, 0, 5, 3, 6, var3);
            this.a(var1, pa.bf.void, 0, 4, 1, 5, var3);
            this.a(var1, pa.bf.void, 0, 6, 1, 5, var3);
            this.a(var1, pa.bf.void, 0, 4, 3, 5, var3);
            this.a(var1, pa.bf.void, 0, 6, 3, 5, var3);

            for(var4 = 1; var4 <= 3; ++var4) {
               this.a(var1, pa.bf.void, 0, 4, var4, 4, var3);
               this.a(var1, pa.bf.void, 0, 6, var4, 4, var3);
               this.a(var1, pa.bf.void, 0, 4, var4, 6, var3);
               this.a(var1, pa.bf.void, 0, 6, var4, 6, var3);
            }

            this.a(var1, pa.bq.void, 0, 5, 3, 5, var3);

            for(var4 = 2; var4 <= 8; ++var4) {
               this.a(var1, pa.be.void, 0, 2, 3, var4, var3);
               this.a(var1, pa.be.void, 0, 3, 3, var4, var3);
               if (var4 <= 3 || var4 >= 7) {
                  this.a(var1, pa.be.void, 0, 4, 3, var4, var3);
                  this.a(var1, pa.be.void, 0, 5, 3, var4, var3);
                  this.a(var1, pa.be.void, 0, 6, 3, var4, var3);
               }

               this.a(var1, pa.be.void, 0, 7, 3, var4, var3);
               this.a(var1, pa.be.void, 0, 8, 3, var4, var3);
            }

            this.a(var1, pa.cn.void, this.do(pa.cn.void, 4), 9, 1, 3, var3);
            this.a(var1, pa.cn.void, this.do(pa.cn.void, 4), 9, 2, 3, var3);
            this.a(var1, pa.cn.void, this.do(pa.cn.void, 4), 9, 3, 3, var3);
            this.a(var1, var3, var2, 3, 4, 8, aji.a(b, abr.bj.if(var2)), 1 + var2.nextInt(4));
         }

         return true;
      }
   }

   static {
      b = new aji[]{new aji(abr.N.A, 0, 1, 5, 10), new aji(abr.L.A, 0, 1, 3, 5), new aji(abr.cv.A, 0, 4, 9, 5), new aji(abr.R.A, 0, 3, 8, 10), new aji(abr.aC.A, 0, 1, 3, 15), new aji(abr.Y.A, 0, 1, 3, 15), new aji(abr.ae.A, 0, 1, 1, 1)};
   }
}
