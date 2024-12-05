import java.util.List;
import java.util.Random;

public class t9 extends t1 {
   private int af = -1;

   public t9(t4 var1, int var2, Random var3, wc var4, int var5) {
      super(var1, var2);
      this.if = var5;
      this.do = var4;
   }

   public static t9 new(t4 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      wc var8 = wc.a(var3, var4, var5, 0, 0, 0, 9, 7, 11, var6);
      return do(var8) && uk.a(var1, var8) == null ? new t9(var0, var7, var2, var8, var6) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.af < 0) {
         this.af = this.if(var1, var3);
         if (this.af < 0) {
            return true;
         }

         this.do.a(0, this.af - this.do.for + 7 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 7, 4, 4, 0, 0, false);
      this.a(var1, var3, 2, 1, 6, 8, 4, 10, 0, 0, false);
      this.a(var1, var3, 2, 0, 6, 8, 0, 10, pa.g.void, pa.g.void, false);
      this.a(var1, pa.bf.void, 0, 6, 0, 6, var3);
      this.a(var1, var3, 2, 1, 6, 2, 1, 10, pa.aZ.void, pa.aZ.void, false);
      this.a(var1, var3, 8, 1, 6, 8, 1, 10, pa.aZ.void, pa.aZ.void, false);
      this.a(var1, var3, 3, 1, 10, 7, 1, 10, pa.aZ.void, pa.aZ.void, false);
      this.a(var1, var3, 1, 0, 1, 7, 0, 4, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 0, 0, 0, 0, 3, 5, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 8, 0, 0, 8, 3, 5, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 1, 0, 0, 7, 1, 0, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 1, 0, 5, 7, 1, 5, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 1, 2, 0, 7, 3, 0, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 1, 2, 5, 7, 3, 5, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 0, 4, 1, 8, 4, 1, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 0, 4, 4, 8, 4, 4, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 0, 5, 2, 8, 5, 3, pa.be.void, pa.be.void, false);
      this.a(var1, pa.be.void, 0, 0, 4, 2, var3);
      this.a(var1, pa.be.void, 0, 0, 4, 3, var3);
      this.a(var1, pa.be.void, 0, 8, 4, 2, var3);
      this.a(var1, pa.be.void, 0, 8, 4, 3, var3);
      int var4 = this.do(pa.bk.void, 3);
      int var5 = this.do(pa.bk.void, 2);

      int var6;
      int var7;
      for(var6 = -1; var6 <= 2; ++var6) {
         for(var7 = 0; var7 <= 8; ++var7) {
            this.a(var1, pa.bk.void, var4, var7, 4 + var6, var6, var3);
            this.a(var1, pa.bk.void, var5, var7, 4 + var6, 5 - var6, var3);
         }
      }

      this.a(var1, pa.aM.void, 0, 0, 2, 1, var3);
      this.a(var1, pa.aM.void, 0, 0, 2, 4, var3);
      this.a(var1, pa.aM.void, 0, 8, 2, 1, var3);
      this.a(var1, pa.aM.void, 0, 8, 2, 4, var3);
      this.a(var1, pa.ae.void, 0, 0, 2, 2, var3);
      this.a(var1, pa.ae.void, 0, 0, 2, 3, var3);
      this.a(var1, pa.ae.void, 0, 8, 2, 2, var3);
      this.a(var1, pa.ae.void, 0, 8, 2, 3, var3);
      this.a(var1, pa.ae.void, 0, 2, 2, 5, var3);
      this.a(var1, pa.ae.void, 0, 3, 2, 5, var3);
      this.a(var1, pa.ae.void, 0, 5, 2, 0, var3);
      this.a(var1, pa.ae.void, 0, 6, 2, 5, var3);
      this.a(var1, pa.aZ.void, 0, 2, 1, 3, var3);
      this.a(var1, pa.cg.void, 0, 2, 2, 3, var3);
      this.a(var1, pa.be.void, 0, 1, 1, 4, var3);
      this.a(var1, pa.bk.void, this.do(pa.bk.void, 3), 2, 1, 4, var3);
      this.a(var1, pa.bk.void, this.do(pa.bk.void, 1), 1, 1, 3, var3);
      this.a(var1, var3, 5, 0, 1, 7, 0, 3, pa.bF.void, pa.bF.void, false);
      this.a(var1, pa.bF.void, 0, 6, 1, 1, var3);
      this.a(var1, pa.bF.void, 0, 6, 1, 2, var3);
      this.a(var1, 0, 0, 2, 1, 0, var3);
      this.a(var1, 0, 0, 2, 2, 0, var3);
      this.a(var1, pa.bq.void, 0, 2, 3, 1, var3);
      this.a(var1, var3, var2, 2, 1, 0, this.do(pa.co.void, 1));
      if (this.if(var1, 2, 0, -1, var3) == 0 && this.if(var1, 2, -1, -1, var3) != 0) {
         this.a(var1, pa.cl.void, this.do(pa.cl.void, 3), 2, 0, -1, var3);
      }

      this.a(var1, 0, 0, 6, 1, 5, var3);
      this.a(var1, 0, 0, 6, 2, 5, var3);
      this.a(var1, pa.bq.void, 0, 6, 3, 4, var3);
      this.a(var1, var3, var2, 6, 1, 5, this.do(pa.co.void, 1));

      for(var6 = 0; var6 < 5; ++var6) {
         for(var7 = 0; var7 < 9; ++var7) {
            this.a(var1, var7, 7, var6, var3);
            this.if(var1, pa.bf.void, 0, var7, -1, var6, var3);
         }
      }

      this.a(var1, var3, 4, 1, 2, 2);
      return true;
   }

   protected int if(int var1) {
      return var1 == 0 ? 4 : 0;
   }
}
