import java.util.List;
import java.util.Random;

public class t8 extends t1 {
   private int ae = -1;
   private final boolean ad;

   public t8(t4 var1, int var2, Random var3, wc var4, int var5) {
      super(var1, var2);
      this.if = var5;
      this.do = var4;
      this.ad = var3.nextBoolean();
   }

   public static t8 int(t4 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      wc var8 = wc.a(var3, var4, var5, 0, 0, 0, 5, 6, 5, var6);
      return uk.a(var1, var8) != null ? null : new t8(var0, var7, var2, var8, var6);
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.ae < 0) {
         this.ae = this.if(var1, var3);
         if (this.ae < 0) {
            return true;
         }

         this.do.a(0, this.ae - this.do.for + 6 - 1, 0);
      }

      this.a(var1, var3, 0, 0, 0, 4, 0, 4, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 0, 4, 0, 4, 4, 4, pa.aM.void, pa.aM.void, false);
      this.a(var1, var3, 1, 4, 1, 3, 4, 3, pa.be.void, pa.be.void, false);
      this.a(var1, pa.bf.void, 0, 0, 1, 0, var3);
      this.a(var1, pa.bf.void, 0, 0, 2, 0, var3);
      this.a(var1, pa.bf.void, 0, 0, 3, 0, var3);
      this.a(var1, pa.bf.void, 0, 4, 1, 0, var3);
      this.a(var1, pa.bf.void, 0, 4, 2, 0, var3);
      this.a(var1, pa.bf.void, 0, 4, 3, 0, var3);
      this.a(var1, pa.bf.void, 0, 0, 1, 4, var3);
      this.a(var1, pa.bf.void, 0, 0, 2, 4, var3);
      this.a(var1, pa.bf.void, 0, 0, 3, 4, var3);
      this.a(var1, pa.bf.void, 0, 4, 1, 4, var3);
      this.a(var1, pa.bf.void, 0, 4, 2, 4, var3);
      this.a(var1, pa.bf.void, 0, 4, 3, 4, var3);
      this.a(var1, var3, 0, 1, 1, 0, 3, 3, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 4, 1, 1, 4, 3, 3, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 1, 1, 4, 3, 3, 4, pa.be.void, pa.be.void, false);
      this.a(var1, pa.ae.void, 0, 0, 2, 2, var3);
      this.a(var1, pa.ae.void, 0, 2, 2, 4, var3);
      this.a(var1, pa.ae.void, 0, 4, 2, 2, var3);
      this.a(var1, pa.be.void, 0, 1, 1, 0, var3);
      this.a(var1, pa.be.void, 0, 1, 2, 0, var3);
      this.a(var1, pa.be.void, 0, 1, 3, 0, var3);
      this.a(var1, pa.be.void, 0, 2, 3, 0, var3);
      this.a(var1, pa.be.void, 0, 3, 3, 0, var3);
      this.a(var1, pa.be.void, 0, 3, 2, 0, var3);
      this.a(var1, pa.be.void, 0, 3, 1, 0, var3);
      if (this.if(var1, 2, 0, -1, var3) == 0 && this.if(var1, 2, -1, -1, var3) != 0) {
         this.a(var1, pa.cl.void, this.do(pa.cl.void, 3), 2, 0, -1, var3);
      }

      this.a(var1, var3, 1, 1, 1, 3, 3, 3, 0, 0, false);
      if (this.ad) {
         this.a(var1, pa.aZ.void, 0, 0, 5, 0, var3);
         this.a(var1, pa.aZ.void, 0, 1, 5, 0, var3);
         this.a(var1, pa.aZ.void, 0, 2, 5, 0, var3);
         this.a(var1, pa.aZ.void, 0, 3, 5, 0, var3);
         this.a(var1, pa.aZ.void, 0, 4, 5, 0, var3);
         this.a(var1, pa.aZ.void, 0, 0, 5, 4, var3);
         this.a(var1, pa.aZ.void, 0, 1, 5, 4, var3);
         this.a(var1, pa.aZ.void, 0, 2, 5, 4, var3);
         this.a(var1, pa.aZ.void, 0, 3, 5, 4, var3);
         this.a(var1, pa.aZ.void, 0, 4, 5, 4, var3);
         this.a(var1, pa.aZ.void, 0, 4, 5, 1, var3);
         this.a(var1, pa.aZ.void, 0, 4, 5, 2, var3);
         this.a(var1, pa.aZ.void, 0, 4, 5, 3, var3);
         this.a(var1, pa.aZ.void, 0, 0, 5, 1, var3);
         this.a(var1, pa.aZ.void, 0, 0, 5, 2, var3);
         this.a(var1, pa.aZ.void, 0, 0, 5, 3, var3);
      }

      int var4;
      if (this.ad) {
         var4 = this.do(pa.cn.void, 3);
         this.a(var1, pa.cn.void, var4, 3, 1, 3, var3);
         this.a(var1, pa.cn.void, var4, 3, 2, 3, var3);
         this.a(var1, pa.cn.void, var4, 3, 3, 3, var3);
         this.a(var1, pa.cn.void, var4, 3, 4, 3, var3);
      }

      this.a(var1, pa.bq.void, 0, 2, 3, 1, var3);

      for(var4 = 0; var4 < 5; ++var4) {
         for(int var5 = 0; var5 < 5; ++var5) {
            this.a(var1, var5, 6, var4, var3);
            this.if(var1, pa.bf.void, 0, var5, -1, var4, var3);
         }
      }

      this.a(var1, var3, 1, 1, 2, 1);
      return true;
   }
}
