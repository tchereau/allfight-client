import java.util.List;
import java.util.Random;

public class t2 extends t1 {
   private int V = -1;

   public t2(t4 var1, int var2, Random var3, wc var4, int var5) {
      super(var1, var2);
      this.if = var5;
      this.do = var4;
   }

   public static t2 a(t4 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      wc var8 = wc.a(var3, var4, var5, 0, 0, 0, 9, 7, 12, var6);
      return do(var8) && uk.a(var1, var8) == null ? new t2(var0, var7, var2, var8, var6) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.V < 0) {
         this.V = this.if(var1, var3);
         if (this.V < 0) {
            return true;
         }

         this.do.a(0, this.V - this.do.for + 7 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 7, 4, 4, 0, 0, false);
      this.a(var1, var3, 2, 1, 6, 8, 4, 10, 0, 0, false);
      this.a(var1, var3, 2, 0, 5, 8, 0, 10, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 1, 0, 1, 7, 0, 4, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 0, 0, 0, 0, 3, 5, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 8, 0, 0, 8, 3, 10, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 1, 0, 0, 7, 2, 0, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 1, 0, 5, 2, 1, 5, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 2, 0, 6, 2, 3, 10, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 3, 0, 10, 7, 3, 10, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 1, 2, 0, 7, 3, 0, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 1, 2, 5, 2, 3, 5, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 0, 4, 1, 8, 4, 1, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 0, 4, 4, 3, 4, 4, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 0, 5, 2, 8, 5, 3, pa.be.void, pa.be.void, false);
      this.a(var1, pa.be.void, 0, 0, 4, 2, var3);
      this.a(var1, pa.be.void, 0, 0, 4, 3, var3);
      this.a(var1, pa.be.void, 0, 8, 4, 2, var3);
      this.a(var1, pa.be.void, 0, 8, 4, 3, var3);
      this.a(var1, pa.be.void, 0, 8, 4, 4, var3);
      int var4 = this.do(pa.bk.void, 3);
      int var5 = this.do(pa.bk.void, 2);

      int var6;
      int var7;
      for(var6 = -1; var6 <= 2; ++var6) {
         for(var7 = 0; var7 <= 8; ++var7) {
            this.a(var1, pa.bk.void, var4, var7, 4 + var6, var6, var3);
            if ((var6 > -1 || var7 <= 1) && (var6 > 0 || var7 <= 3) && (var6 > 1 || var7 <= 4 || var7 >= 6)) {
               this.a(var1, pa.bk.void, var5, var7, 4 + var6, 5 - var6, var3);
            }
         }
      }

      this.a(var1, var3, 3, 4, 5, 3, 4, 10, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 7, 4, 2, 7, 4, 10, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 4, 5, 4, 4, 5, 10, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 6, 5, 4, 6, 5, 10, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 5, 6, 3, 5, 6, 10, pa.be.void, pa.be.void, false);
      var6 = this.do(pa.bk.void, 0);

      int var8;
      for(var7 = 4; var7 >= 1; --var7) {
         this.a(var1, pa.be.void, 0, var7, 2 + var7, 7 - var7, var3);

         for(var8 = 8 - var7; var8 <= 10; ++var8) {
            this.a(var1, pa.bk.void, var6, var7, 2 + var7, var8, var3);
         }
      }

      var7 = this.do(pa.bk.void, 1);
      this.a(var1, pa.be.void, 0, 6, 6, 3, var3);
      this.a(var1, pa.be.void, 0, 7, 5, 4, var3);
      this.a(var1, pa.bk.void, var7, 6, 6, 4, var3);

      int var9;
      for(var8 = 6; var8 <= 8; ++var8) {
         for(var9 = 5; var9 <= 10; ++var9) {
            this.a(var1, pa.bk.void, var7, var8, 12 - var8, var9, var3);
         }
      }

      this.a(var1, pa.aM.void, 0, 0, 2, 1, var3);
      this.a(var1, pa.aM.void, 0, 0, 2, 4, var3);
      this.a(var1, pa.ae.void, 0, 0, 2, 2, var3);
      this.a(var1, pa.ae.void, 0, 0, 2, 3, var3);
      this.a(var1, pa.aM.void, 0, 4, 2, 0, var3);
      this.a(var1, pa.ae.void, 0, 5, 2, 0, var3);
      this.a(var1, pa.aM.void, 0, 6, 2, 0, var3);
      this.a(var1, pa.aM.void, 0, 8, 2, 1, var3);
      this.a(var1, pa.ae.void, 0, 8, 2, 2, var3);
      this.a(var1, pa.ae.void, 0, 8, 2, 3, var3);
      this.a(var1, pa.aM.void, 0, 8, 2, 4, var3);
      this.a(var1, pa.be.void, 0, 8, 2, 5, var3);
      this.a(var1, pa.aM.void, 0, 8, 2, 6, var3);
      this.a(var1, pa.ae.void, 0, 8, 2, 7, var3);
      this.a(var1, pa.ae.void, 0, 8, 2, 8, var3);
      this.a(var1, pa.aM.void, 0, 8, 2, 9, var3);
      this.a(var1, pa.aM.void, 0, 2, 2, 6, var3);
      this.a(var1, pa.ae.void, 0, 2, 2, 7, var3);
      this.a(var1, pa.ae.void, 0, 2, 2, 8, var3);
      this.a(var1, pa.aM.void, 0, 2, 2, 9, var3);
      this.a(var1, pa.aM.void, 0, 4, 4, 10, var3);
      this.a(var1, pa.ae.void, 0, 5, 4, 10, var3);
      this.a(var1, pa.aM.void, 0, 6, 4, 10, var3);
      this.a(var1, pa.be.void, 0, 5, 5, 10, var3);
      this.a(var1, 0, 0, 2, 1, 0, var3);
      this.a(var1, 0, 0, 2, 2, 0, var3);
      this.a(var1, pa.bq.void, 0, 2, 3, 1, var3);
      this.a(var1, var3, var2, 2, 1, 0, this.do(pa.co.void, 1));
      this.a(var1, var3, 1, 0, -1, 3, 2, -1, 0, 0, false);
      if (this.if(var1, 2, 0, -1, var3) == 0 && this.if(var1, 2, -1, -1, var3) != 0) {
         this.a(var1, pa.cl.void, this.do(pa.cl.void, 3), 2, 0, -1, var3);
      }

      for(var8 = 0; var8 < 5; ++var8) {
         for(var9 = 0; var9 < 9; ++var9) {
            this.a(var1, var9, 7, var8, var3);
            this.if(var1, pa.bf.void, 0, var9, -1, var8, var3);
         }
      }

      for(var8 = 5; var8 < 11; ++var8) {
         for(var9 = 2; var9 < 9; ++var9) {
            this.a(var1, var9, 7, var8, var3);
            this.if(var1, pa.bf.void, 0, var9, -1, var8, var3);
         }
      }

      this.a(var1, var3, 4, 1, 2, 2);
      return true;
   }
}
