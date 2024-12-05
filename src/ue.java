import java.util.List;
import java.util.Random;

public class ue extends t1 {
   private int ap = -1;

   public ue(t4 var1, int var2, Random var3, wc var4, int var5) {
      super(var1, var2);
      this.if = var5;
      this.do = var4;
   }

   public static ue case(t4 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      wc var8 = wc.a(var3, var4, var5, 0, 0, 0, 9, 9, 6, var6);
      return do(var8) && uk.a(var1, var8) == null ? new ue(var0, var7, var2, var8, var6) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.ap < 0) {
         this.ap = this.if(var1, var3);
         if (this.ap < 0) {
            return true;
         }

         this.do.a(0, this.ap - this.do.for + 9 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 7, 5, 4, 0, 0, false);
      this.a(var1, var3, 0, 0, 0, 8, 0, 5, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 0, 5, 0, 8, 5, 5, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 0, 6, 1, 8, 6, 4, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 0, 7, 2, 8, 7, 3, pa.bf.void, pa.bf.void, false);
      int var4 = this.do(pa.bk.void, 3);
      int var5 = this.do(pa.bk.void, 2);

      int var6;
      int var7;
      for(var6 = -1; var6 <= 2; ++var6) {
         for(var7 = 0; var7 <= 8; ++var7) {
            this.a(var1, pa.bk.void, var4, var7, 6 + var6, var6, var3);
            this.a(var1, pa.bk.void, var5, var7, 6 + var6, 5 - var6, var3);
         }
      }

      this.a(var1, var3, 0, 1, 0, 0, 1, 5, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 1, 1, 5, 8, 1, 5, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 8, 1, 0, 8, 1, 4, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 2, 1, 0, 7, 1, 0, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 0, 2, 0, 0, 4, 0, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 0, 2, 5, 0, 4, 5, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 8, 2, 5, 8, 4, 5, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 8, 2, 0, 8, 4, 0, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 0, 2, 1, 0, 4, 4, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 1, 2, 5, 7, 4, 5, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 8, 2, 1, 8, 4, 4, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 1, 2, 0, 7, 4, 0, pa.be.void, pa.be.void, false);
      this.a(var1, pa.ae.void, 0, 4, 2, 0, var3);
      this.a(var1, pa.ae.void, 0, 5, 2, 0, var3);
      this.a(var1, pa.ae.void, 0, 6, 2, 0, var3);
      this.a(var1, pa.ae.void, 0, 4, 3, 0, var3);
      this.a(var1, pa.ae.void, 0, 5, 3, 0, var3);
      this.a(var1, pa.ae.void, 0, 6, 3, 0, var3);
      this.a(var1, pa.ae.void, 0, 0, 2, 2, var3);
      this.a(var1, pa.ae.void, 0, 0, 2, 3, var3);
      this.a(var1, pa.ae.void, 0, 0, 3, 2, var3);
      this.a(var1, pa.ae.void, 0, 0, 3, 3, var3);
      this.a(var1, pa.ae.void, 0, 8, 2, 2, var3);
      this.a(var1, pa.ae.void, 0, 8, 2, 3, var3);
      this.a(var1, pa.ae.void, 0, 8, 3, 2, var3);
      this.a(var1, pa.ae.void, 0, 8, 3, 3, var3);
      this.a(var1, pa.ae.void, 0, 2, 2, 5, var3);
      this.a(var1, pa.ae.void, 0, 3, 2, 5, var3);
      this.a(var1, pa.ae.void, 0, 5, 2, 5, var3);
      this.a(var1, pa.ae.void, 0, 6, 2, 5, var3);
      this.a(var1, var3, 1, 4, 1, 7, 4, 1, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 1, 4, 4, 7, 4, 4, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 1, 3, 4, 7, 3, 4, pa.bx.void, pa.bx.void, false);
      this.a(var1, pa.be.void, 0, 7, 1, 4, var3);
      this.a(var1, pa.bk.void, this.do(pa.bk.void, 0), 7, 1, 3, var3);
      var6 = this.do(pa.bk.void, 3);
      this.a(var1, pa.bk.void, var6, 6, 1, 4, var3);
      this.a(var1, pa.bk.void, var6, 5, 1, 4, var3);
      this.a(var1, pa.bk.void, var6, 4, 1, 4, var3);
      this.a(var1, pa.bk.void, var6, 3, 1, 4, var3);
      this.a(var1, pa.aZ.void, 0, 6, 1, 3, var3);
      this.a(var1, pa.cg.void, 0, 6, 2, 3, var3);
      this.a(var1, pa.aZ.void, 0, 4, 1, 3, var3);
      this.a(var1, pa.cg.void, 0, 4, 2, 3, var3);
      this.a(var1, pa.cu.void, 0, 7, 1, 1, var3);
      this.a(var1, 0, 0, 1, 1, 0, var3);
      this.a(var1, 0, 0, 1, 2, 0, var3);
      this.a(var1, var3, var2, 1, 1, 0, this.do(pa.co.void, 1));
      if (this.if(var1, 1, 0, -1, var3) == 0 && this.if(var1, 1, -1, -1, var3) != 0) {
         this.a(var1, pa.cl.void, this.do(pa.cl.void, 3), 1, 0, -1, var3);
      }

      for(var7 = 0; var7 < 6; ++var7) {
         for(int var8 = 0; var8 < 9; ++var8) {
            this.a(var1, var8, 9, var7, var3);
            this.if(var1, pa.bf.void, 0, var8, -1, var7, var3);
         }
      }

      this.a(var1, var3, 2, 1, 2, 1);
      return true;
   }

   protected int if(int var1) {
      return 1;
   }
}
