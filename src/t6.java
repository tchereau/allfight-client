import java.util.List;
import java.util.Random;

public class t6 extends t1 {
   private int Z = -1;

   public t6(t4 var1, int var2, Random var3, wc var4, int var5) {
      super(var1, var2);
      this.if = var5;
      this.do = var4;
   }

   public static t6 do(t4 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      wc var8 = wc.a(var3, var4, var5, 0, 0, 0, 5, 12, 9, var6);
      return do(var8) && uk.a(var1, var8) == null ? new t6(var0, var7, var2, var8, var6) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.Z < 0) {
         this.Z = this.if(var1, var3);
         if (this.Z < 0) {
            return true;
         }

         this.do.a(0, this.Z - this.do.for + 12 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 3, 3, 7, 0, 0, false);
      this.a(var1, var3, 1, 5, 1, 3, 9, 3, 0, 0, false);
      this.a(var1, var3, 1, 0, 0, 3, 0, 8, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 1, 1, 0, 3, 10, 0, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 0, 1, 1, 0, 10, 3, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 4, 1, 1, 4, 10, 3, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 0, 0, 4, 0, 4, 7, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 4, 0, 4, 4, 4, 7, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 1, 1, 8, 3, 4, 8, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 1, 5, 4, 3, 10, 4, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 1, 5, 5, 3, 5, 7, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 0, 9, 0, 4, 9, 4, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 0, 4, 0, 4, 4, 4, pa.bf.void, pa.bf.void, false);
      this.a(var1, pa.bf.void, 0, 0, 11, 2, var3);
      this.a(var1, pa.bf.void, 0, 4, 11, 2, var3);
      this.a(var1, pa.bf.void, 0, 2, 11, 0, var3);
      this.a(var1, pa.bf.void, 0, 2, 11, 4, var3);
      this.a(var1, pa.bf.void, 0, 1, 1, 6, var3);
      this.a(var1, pa.bf.void, 0, 1, 1, 7, var3);
      this.a(var1, pa.bf.void, 0, 2, 1, 7, var3);
      this.a(var1, pa.bf.void, 0, 3, 1, 6, var3);
      this.a(var1, pa.bf.void, 0, 3, 1, 7, var3);
      this.a(var1, pa.cl.void, this.do(pa.cl.void, 3), 1, 1, 5, var3);
      this.a(var1, pa.cl.void, this.do(pa.cl.void, 3), 2, 1, 6, var3);
      this.a(var1, pa.cl.void, this.do(pa.cl.void, 3), 3, 1, 5, var3);
      this.a(var1, pa.cl.void, this.do(pa.cl.void, 1), 1, 2, 7, var3);
      this.a(var1, pa.cl.void, this.do(pa.cl.void, 0), 3, 2, 7, var3);
      this.a(var1, pa.ae.void, 0, 0, 2, 2, var3);
      this.a(var1, pa.ae.void, 0, 0, 3, 2, var3);
      this.a(var1, pa.ae.void, 0, 4, 2, 2, var3);
      this.a(var1, pa.ae.void, 0, 4, 3, 2, var3);
      this.a(var1, pa.ae.void, 0, 0, 6, 2, var3);
      this.a(var1, pa.ae.void, 0, 0, 7, 2, var3);
      this.a(var1, pa.ae.void, 0, 4, 6, 2, var3);
      this.a(var1, pa.ae.void, 0, 4, 7, 2, var3);
      this.a(var1, pa.ae.void, 0, 2, 6, 0, var3);
      this.a(var1, pa.ae.void, 0, 2, 7, 0, var3);
      this.a(var1, pa.ae.void, 0, 2, 6, 4, var3);
      this.a(var1, pa.ae.void, 0, 2, 7, 4, var3);
      this.a(var1, pa.ae.void, 0, 0, 3, 6, var3);
      this.a(var1, pa.ae.void, 0, 4, 3, 6, var3);
      this.a(var1, pa.ae.void, 0, 2, 3, 8, var3);
      this.a(var1, pa.bq.void, 0, 2, 4, 7, var3);
      this.a(var1, pa.bq.void, 0, 1, 4, 6, var3);
      this.a(var1, pa.bq.void, 0, 3, 4, 6, var3);
      this.a(var1, pa.bq.void, 0, 2, 4, 5, var3);
      int var4 = this.do(pa.cn.void, 4);

      int var5;
      for(var5 = 1; var5 <= 9; ++var5) {
         this.a(var1, pa.cn.void, var4, 3, var5, 3, var3);
      }

      this.a(var1, 0, 0, 2, 1, 0, var3);
      this.a(var1, 0, 0, 2, 2, 0, var3);
      this.a(var1, var3, var2, 2, 1, 0, this.do(pa.co.void, 1));
      if (this.if(var1, 2, 0, -1, var3) == 0 && this.if(var1, 2, -1, -1, var3) != 0) {
         this.a(var1, pa.cl.void, this.do(pa.cl.void, 3), 2, 0, -1, var3);
      }

      for(var5 = 0; var5 < 9; ++var5) {
         for(int var6 = 0; var6 < 5; ++var6) {
            this.a(var1, var6, 12, var5, var3);
            this.if(var1, pa.bf.void, 0, var6, -1, var5, var3);
         }
      }

      this.a(var1, var3, 2, 1, 2, 1);
      return true;
   }

   protected int if(int var1) {
      return 2;
   }
}
