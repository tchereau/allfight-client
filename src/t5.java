import java.util.List;
import java.util.Random;

public class t5 extends t1 {
   private static final aji[] X;
   private int W = -1;
   private boolean Y;

   public t5(t4 var1, int var2, Random var3, wc var4, int var5) {
      super(var1, var2);
      this.if = var5;
      this.do = var4;
   }

   public static t5 if(t4 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      wc var8 = wc.a(var3, var4, var5, 0, 0, 0, 10, 6, 7, var6);
      return do(var8) && uk.a(var1, var8) == null ? new t5(var0, var7, var2, var8, var6) : null;
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.W < 0) {
         this.W = this.if(var1, var3);
         if (this.W < 0) {
            return true;
         }

         this.do.a(0, this.W - this.do.for + 6 - 1, 0);
      }

      this.a(var1, var3, 0, 1, 0, 9, 4, 6, 0, 0, false);
      this.a(var1, var3, 0, 0, 0, 9, 0, 6, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 0, 4, 0, 9, 4, 6, pa.bf.void, pa.bf.void, false);
      this.a(var1, var3, 0, 5, 0, 9, 5, 6, pa.bD.void, pa.bD.void, false);
      this.a(var1, var3, 1, 5, 1, 8, 5, 5, 0, 0, false);
      this.a(var1, var3, 1, 1, 0, 2, 3, 0, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 0, 1, 0, 0, 4, 0, pa.aM.void, pa.aM.void, false);
      this.a(var1, var3, 3, 1, 0, 3, 4, 0, pa.aM.void, pa.aM.void, false);
      this.a(var1, var3, 0, 1, 6, 0, 4, 6, pa.aM.void, pa.aM.void, false);
      this.a(var1, pa.be.void, 0, 3, 3, 1, var3);
      this.a(var1, var3, 3, 1, 2, 3, 3, 2, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 4, 1, 3, 5, 3, 3, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 0, 1, 1, 0, 3, 5, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 1, 1, 6, 5, 3, 6, pa.be.void, pa.be.void, false);
      this.a(var1, var3, 5, 1, 0, 5, 3, 0, pa.aZ.void, pa.aZ.void, false);
      this.a(var1, var3, 9, 1, 0, 9, 3, 0, pa.aZ.void, pa.aZ.void, false);
      this.a(var1, var3, 6, 1, 4, 9, 4, 6, pa.bf.void, pa.bf.void, false);
      this.a(var1, pa.a7.void, 0, 7, 1, 5, var3);
      this.a(var1, pa.a7.void, 0, 8, 1, 5, var3);
      this.a(var1, pa.ag.void, 0, 9, 2, 5, var3);
      this.a(var1, pa.ag.void, 0, 9, 2, 4, var3);
      this.a(var1, var3, 7, 2, 4, 8, 2, 5, 0, 0, false);
      this.a(var1, pa.bf.void, 0, 6, 1, 3, var3);
      this.a(var1, pa.cr.void, 0, 6, 2, 3, var3);
      this.a(var1, pa.cr.void, 0, 6, 3, 3, var3);
      this.a(var1, pa.bF.void, 0, 8, 1, 1, var3);
      this.a(var1, pa.ae.void, 0, 0, 2, 2, var3);
      this.a(var1, pa.ae.void, 0, 0, 2, 4, var3);
      this.a(var1, pa.ae.void, 0, 2, 2, 6, var3);
      this.a(var1, pa.ae.void, 0, 4, 2, 6, var3);
      this.a(var1, pa.aZ.void, 0, 2, 1, 4, var3);
      this.a(var1, pa.cg.void, 0, 2, 2, 4, var3);
      this.a(var1, pa.be.void, 0, 1, 1, 5, var3);
      this.a(var1, pa.bk.void, this.do(pa.bk.void, 3), 2, 1, 5, var3);
      this.a(var1, pa.bk.void, this.do(pa.bk.void, 1), 1, 1, 4, var3);
      int var4;
      int var5;
      if (!this.Y) {
         var4 = this.a(1);
         var5 = this.a(5, 5);
         int var6 = this.if(5, 5);
         if (var3.if(var5, var4, var6)) {
            this.Y = true;
            this.a(var1, var3, var2, 5, 1, 5, X, 3 + var2.nextInt(6));
         }
      }

      for(var4 = 6; var4 <= 8; ++var4) {
         if (this.if(var1, var4, 0, -1, var3) == 0 && this.if(var1, var4, -1, -1, var3) != 0) {
            this.a(var1, pa.cl.void, this.do(pa.cl.void, 3), var4, 0, -1, var3);
         }
      }

      for(var4 = 0; var4 < 7; ++var4) {
         for(var5 = 0; var5 < 10; ++var5) {
            this.a(var1, var5, 6, var4, var3);
            this.if(var1, pa.bf.void, 0, var5, -1, var4, var3);
         }
      }

      this.a(var1, var3, 7, 1, 1, 1);
      return true;
   }

   protected int if(int var1) {
      return 3;
   }

   static {
      X = new aji[]{new aji(abr.P.A, 0, 1, 3, 3), new aji(abr.N.A, 0, 1, 5, 10), new aji(abr.L.A, 0, 1, 3, 5), new aji(abr.aC.A, 0, 1, 3, 15), new aji(abr.Y.A, 0, 1, 3, 15), new aji(abr.ae.A, 0, 1, 1, 5), new aji(abr.J.A, 0, 1, 1, 5), new aji(abr.bS.A, 0, 1, 1, 5), new aji(abr.bU.A, 0, 1, 1, 5), new aji(abr.bQ.A, 0, 1, 1, 5), new aji(abr.bO.A, 0, 1, 1, 5), new aji(pa.bs.void, 0, 3, 7, 5), new aji(pa.bd.void, 0, 3, 7, 5)};
   }
}
