import java.util.Random;

public class vh extends vd {
   private boolean[] E = new boolean[4];
   private static final aji[] D;

   public vh(Random var1, int var2, int var3) {
      super(var1, var2, 64, var3, 21, 15, 21);
   }

   public boolean a(y6 var1, Random var2, wc var3) {
      this.a(var1, var3, 0, -4, 0, this.s - 1, 0, this.u - 1, pa.ar.void, pa.ar.void, false);

      int var4;
      for(var4 = 1; var4 <= 9; ++var4) {
         this.a(var1, var3, var4, var4, var4, this.s - 1 - var4, var4, this.u - 1 - var4, pa.ar.void, pa.ar.void, false);
         this.a(var1, var3, var4 + 1, var4, var4 + 1, this.s - 2 - var4, var4, this.u - 2 - var4, 0, 0, false);
      }

      int var5;
      for(var4 = 0; var4 < this.s; ++var4) {
         for(var5 = 0; var5 < this.u; ++var5) {
            this.if(var1, pa.ar.void, 0, var4, -5, var5, var3);
         }
      }

      var4 = this.do(pa.br.void, 3);
      var5 = this.do(pa.br.void, 2);
      int var6 = this.do(pa.br.void, 0);
      int var7 = this.do(pa.br.void, 1);
      byte var8 = 1;
      byte var9 = 11;
      this.a(var1, var3, 0, 0, 0, 4, 9, 4, pa.ar.void, 0, false);
      this.a(var1, var3, 1, 10, 1, 3, 10, 3, pa.ar.void, pa.ar.void, false);
      this.a(var1, pa.br.void, var4, 2, 10, 0, var3);
      this.a(var1, pa.br.void, var5, 2, 10, 4, var3);
      this.a(var1, pa.br.void, var6, 0, 10, 2, var3);
      this.a(var1, pa.br.void, var7, 4, 10, 2, var3);
      this.a(var1, var3, this.s - 5, 0, 0, this.s - 1, 9, 4, pa.ar.void, 0, false);
      this.a(var1, var3, this.s - 4, 10, 1, this.s - 2, 10, 3, pa.ar.void, pa.ar.void, false);
      this.a(var1, pa.br.void, var4, this.s - 3, 10, 0, var3);
      this.a(var1, pa.br.void, var5, this.s - 3, 10, 4, var3);
      this.a(var1, pa.br.void, var6, this.s - 5, 10, 2, var3);
      this.a(var1, pa.br.void, var7, this.s - 1, 10, 2, var3);
      this.a(var1, var3, 8, 0, 0, 12, 4, 4, pa.ar.void, 0, false);
      this.a(var1, var3, 9, 1, 0, 11, 3, 4, 0, 0, false);
      this.a(var1, pa.ar.void, 2, 9, 1, 1, var3);
      this.a(var1, pa.ar.void, 2, 9, 2, 1, var3);
      this.a(var1, pa.ar.void, 2, 9, 3, 1, var3);
      this.a(var1, pa.ar.void, 2, 10, 3, 1, var3);
      this.a(var1, pa.ar.void, 2, 11, 3, 1, var3);
      this.a(var1, pa.ar.void, 2, 11, 2, 1, var3);
      this.a(var1, pa.ar.void, 2, 11, 1, 1, var3);
      this.a(var1, var3, 4, 1, 1, 8, 3, 3, pa.ar.void, 0, false);
      this.a(var1, var3, 4, 1, 2, 8, 2, 2, 0, 0, false);
      this.a(var1, var3, 12, 1, 1, 16, 3, 3, pa.ar.void, 0, false);
      this.a(var1, var3, 12, 1, 2, 16, 2, 2, 0, 0, false);
      this.a(var1, var3, 5, 4, 5, this.s - 6, 4, this.u - 6, pa.ar.void, pa.ar.void, false);
      this.a(var1, var3, 9, 4, 9, 11, 4, 11, 0, 0, false);
      this.a(var1, var3, 8, 1, 8, 8, 3, 8, pa.ar.void, 2, pa.ar.void, 2, false);
      this.a(var1, var3, 12, 1, 8, 12, 3, 8, pa.ar.void, 2, pa.ar.void, 2, false);
      this.a(var1, var3, 8, 1, 12, 8, 3, 12, pa.ar.void, 2, pa.ar.void, 2, false);
      this.a(var1, var3, 12, 1, 12, 12, 3, 12, pa.ar.void, 2, pa.ar.void, 2, false);
      this.a(var1, var3, 1, 1, 5, 4, 4, 11, pa.ar.void, pa.ar.void, false);
      this.a(var1, var3, this.s - 5, 1, 5, this.s - 2, 4, 11, pa.ar.void, pa.ar.void, false);
      this.a(var1, var3, 6, 7, 9, 6, 7, 11, pa.ar.void, pa.ar.void, false);
      this.a(var1, var3, this.s - 7, 7, 9, this.s - 7, 7, 11, pa.ar.void, pa.ar.void, false);
      this.a(var1, var3, 5, 5, 9, 5, 7, 11, pa.ar.void, 2, pa.ar.void, 2, false);
      this.a(var1, var3, this.s - 6, 5, 9, this.s - 6, 7, 11, pa.ar.void, 2, pa.ar.void, 2, false);
      this.a(var1, 0, 0, 5, 5, 10, var3);
      this.a(var1, 0, 0, 5, 6, 10, var3);
      this.a(var1, 0, 0, 6, 6, 10, var3);
      this.a(var1, 0, 0, this.s - 6, 5, 10, var3);
      this.a(var1, 0, 0, this.s - 6, 6, 10, var3);
      this.a(var1, 0, 0, this.s - 7, 6, 10, var3);
      this.a(var1, var3, 2, 4, 4, 2, 6, 4, 0, 0, false);
      this.a(var1, var3, this.s - 3, 4, 4, this.s - 3, 6, 4, 0, 0, false);
      this.a(var1, pa.br.void, var4, 2, 4, 5, var3);
      this.a(var1, pa.br.void, var4, 2, 3, 4, var3);
      this.a(var1, pa.br.void, var4, this.s - 3, 4, 5, var3);
      this.a(var1, pa.br.void, var4, this.s - 3, 3, 4, var3);
      this.a(var1, var3, 1, 1, 3, 2, 2, 3, pa.ar.void, pa.ar.void, false);
      this.a(var1, var3, this.s - 3, 1, 3, this.s - 2, 2, 3, pa.ar.void, pa.ar.void, false);
      this.a(var1, pa.br.void, 0, 1, 1, 2, var3);
      this.a(var1, pa.br.void, 0, this.s - 2, 1, 2, var3);
      this.a(var1, pa.bD.void, 1, 1, 2, 2, var3);
      this.a(var1, pa.bD.void, 1, this.s - 2, 2, 2, var3);
      this.a(var1, pa.br.void, var7, 2, 1, 2, var3);
      this.a(var1, pa.br.void, var6, this.s - 3, 1, 2, var3);
      this.a(var1, var3, 4, 3, 5, 4, 3, 18, pa.ar.void, pa.ar.void, false);
      this.a(var1, var3, this.s - 5, 3, 5, this.s - 5, 3, 17, pa.ar.void, pa.ar.void, false);
      this.a(var1, var3, 3, 1, 5, 4, 2, 16, 0, 0, false);
      this.a(var1, var3, this.s - 6, 1, 5, this.s - 5, 2, 16, 0, 0, false);

      int var10;
      for(var10 = 5; var10 <= 17; var10 += 2) {
         this.a(var1, pa.ar.void, 2, 4, 1, var10, var3);
         this.a(var1, pa.ar.void, 1, 4, 2, var10, var3);
         this.a(var1, pa.ar.void, 2, this.s - 5, 1, var10, var3);
         this.a(var1, pa.ar.void, 1, this.s - 5, 2, var10, var3);
      }

      this.a(var1, pa.bV.void, var8, 10, 0, 7, var3);
      this.a(var1, pa.bV.void, var8, 10, 0, 8, var3);
      this.a(var1, pa.bV.void, var8, 9, 0, 9, var3);
      this.a(var1, pa.bV.void, var8, 11, 0, 9, var3);
      this.a(var1, pa.bV.void, var8, 8, 0, 10, var3);
      this.a(var1, pa.bV.void, var8, 12, 0, 10, var3);
      this.a(var1, pa.bV.void, var8, 7, 0, 10, var3);
      this.a(var1, pa.bV.void, var8, 13, 0, 10, var3);
      this.a(var1, pa.bV.void, var8, 9, 0, 11, var3);
      this.a(var1, pa.bV.void, var8, 11, 0, 11, var3);
      this.a(var1, pa.bV.void, var8, 10, 0, 12, var3);
      this.a(var1, pa.bV.void, var8, 10, 0, 13, var3);
      this.a(var1, pa.bV.void, var9, 10, 0, 10, var3);

      for(var10 = 0; var10 <= this.s - 1; var10 += this.s - 1) {
         this.a(var1, pa.ar.void, 2, var10, 2, 1, var3);
         this.a(var1, pa.bV.void, var8, var10, 2, 2, var3);
         this.a(var1, pa.ar.void, 2, var10, 2, 3, var3);
         this.a(var1, pa.ar.void, 2, var10, 3, 1, var3);
         this.a(var1, pa.bV.void, var8, var10, 3, 2, var3);
         this.a(var1, pa.ar.void, 2, var10, 3, 3, var3);
         this.a(var1, pa.bV.void, var8, var10, 4, 1, var3);
         this.a(var1, pa.ar.void, 1, var10, 4, 2, var3);
         this.a(var1, pa.bV.void, var8, var10, 4, 3, var3);
         this.a(var1, pa.ar.void, 2, var10, 5, 1, var3);
         this.a(var1, pa.bV.void, var8, var10, 5, 2, var3);
         this.a(var1, pa.ar.void, 2, var10, 5, 3, var3);
         this.a(var1, pa.bV.void, var8, var10, 6, 1, var3);
         this.a(var1, pa.ar.void, 1, var10, 6, 2, var3);
         this.a(var1, pa.bV.void, var8, var10, 6, 3, var3);
         this.a(var1, pa.bV.void, var8, var10, 7, 1, var3);
         this.a(var1, pa.bV.void, var8, var10, 7, 2, var3);
         this.a(var1, pa.bV.void, var8, var10, 7, 3, var3);
         this.a(var1, pa.ar.void, 2, var10, 8, 1, var3);
         this.a(var1, pa.ar.void, 2, var10, 8, 2, var3);
         this.a(var1, pa.ar.void, 2, var10, 8, 3, var3);
      }

      for(var10 = 2; var10 <= this.s - 3; var10 += this.s - 3 - 2) {
         this.a(var1, pa.ar.void, 2, var10 - 1, 2, 0, var3);
         this.a(var1, pa.bV.void, var8, var10, 2, 0, var3);
         this.a(var1, pa.ar.void, 2, var10 + 1, 2, 0, var3);
         this.a(var1, pa.ar.void, 2, var10 - 1, 3, 0, var3);
         this.a(var1, pa.bV.void, var8, var10, 3, 0, var3);
         this.a(var1, pa.ar.void, 2, var10 + 1, 3, 0, var3);
         this.a(var1, pa.bV.void, var8, var10 - 1, 4, 0, var3);
         this.a(var1, pa.ar.void, 1, var10, 4, 0, var3);
         this.a(var1, pa.bV.void, var8, var10 + 1, 4, 0, var3);
         this.a(var1, pa.ar.void, 2, var10 - 1, 5, 0, var3);
         this.a(var1, pa.bV.void, var8, var10, 5, 0, var3);
         this.a(var1, pa.ar.void, 2, var10 + 1, 5, 0, var3);
         this.a(var1, pa.bV.void, var8, var10 - 1, 6, 0, var3);
         this.a(var1, pa.ar.void, 1, var10, 6, 0, var3);
         this.a(var1, pa.bV.void, var8, var10 + 1, 6, 0, var3);
         this.a(var1, pa.bV.void, var8, var10 - 1, 7, 0, var3);
         this.a(var1, pa.bV.void, var8, var10, 7, 0, var3);
         this.a(var1, pa.bV.void, var8, var10 + 1, 7, 0, var3);
         this.a(var1, pa.ar.void, 2, var10 - 1, 8, 0, var3);
         this.a(var1, pa.ar.void, 2, var10, 8, 0, var3);
         this.a(var1, pa.ar.void, 2, var10 + 1, 8, 0, var3);
      }

      this.a(var1, var3, 8, 4, 0, 12, 6, 0, pa.ar.void, 2, pa.ar.void, 2, false);
      this.a(var1, 0, 0, 8, 6, 0, var3);
      this.a(var1, 0, 0, 12, 6, 0, var3);
      this.a(var1, pa.bV.void, var8, 9, 5, 0, var3);
      this.a(var1, pa.ar.void, 1, 10, 5, 0, var3);
      this.a(var1, pa.bV.void, var8, 11, 5, 0, var3);
      this.a(var1, var3, 8, -14, 8, 12, -11, 12, pa.ar.void, 2, pa.ar.void, 2, false);
      this.a(var1, var3, 8, -10, 8, 12, -10, 12, pa.ar.void, 1, pa.ar.void, 1, false);
      this.a(var1, var3, 8, -9, 8, 12, -9, 12, pa.ar.void, 2, pa.ar.void, 2, false);
      this.a(var1, var3, 8, -8, 8, 12, -1, 12, pa.ar.void, pa.ar.void, false);
      this.a(var1, var3, 9, -11, 9, 11, -1, 11, 0, 0, false);
      this.a(var1, pa.ci.void, 0, 10, -11, 10, var3);
      this.a(var1, var3, 9, -13, 9, 11, -13, 11, pa.bz.void, 0, false);
      this.a(var1, 0, 0, 8, -11, 10, var3);
      this.a(var1, 0, 0, 8, -10, 10, var3);
      this.a(var1, pa.ar.void, 1, 7, -10, 10, var3);
      this.a(var1, pa.ar.void, 2, 7, -11, 10, var3);
      this.a(var1, 0, 0, 12, -11, 10, var3);
      this.a(var1, 0, 0, 12, -10, 10, var3);
      this.a(var1, pa.ar.void, 1, 13, -10, 10, var3);
      this.a(var1, pa.ar.void, 2, 13, -11, 10, var3);
      this.a(var1, 0, 0, 10, -11, 8, var3);
      this.a(var1, 0, 0, 10, -10, 8, var3);
      this.a(var1, pa.ar.void, 1, 10, -10, 7, var3);
      this.a(var1, pa.ar.void, 2, 10, -11, 7, var3);
      this.a(var1, 0, 0, 10, -11, 12, var3);
      this.a(var1, 0, 0, 10, -10, 12, var3);
      this.a(var1, pa.ar.void, 1, 10, -10, 13, var3);
      this.a(var1, pa.ar.void, 2, 10, -11, 13, var3);

      for(var10 = 0; var10 < 4; ++var10) {
         if (!this.E[var10]) {
            int var11 = apk.case[var10] * 2;
            int var12 = apk.byte[var10] * 2;
            this.E[var10] = this.a(var1, var3, var2, 10 + var11, -11, 10 + var12, aji.a(D, abr.bj.if(var2)), 2 + var2.nextInt(5));
         }
      }

      return true;
   }

   static {
      D = new aji[]{new aji(abr.P.A, 0, 1, 3, 3), new aji(abr.N.A, 0, 1, 5, 10), new aji(abr.L.A, 0, 2, 7, 15), new aji(abr.bP.A, 0, 1, 3, 2), new aji(abr.b8.A, 0, 4, 6, 20), new aji(abr.aH.A, 0, 3, 7, 16)};
   }
}
