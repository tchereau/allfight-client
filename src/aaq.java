public class aaq {
   private String[][] if = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
   private Object[][] a;

   public aaq() {
      this.a = new Object[][]{{abr.cs, pa.bo, abr.N, abr.P, abr.L}, {abr.aA, abr.b2, abr.bU, abr.bM, abr.bD}, {abr.ay, abr.b0, abr.bS, abr.bK, abr.bB}, {abr.aw, abr.bY, abr.bQ, abr.bI, abr.bz}, {abr.au, abr.bW, abr.bO, abr.bF, abr.by}};
   }

   public void a(aai var1) {
      for(int var2 = 0; var2 < this.a[0].length; ++var2) {
         Object var3 = this.a[0][var2];

         for(int var4 = 0; var4 < this.a.length - 1; ++var4) {
            abr var5 = (abr)this.a[var4 + 1][var2];
            var1.if(new abp(var5), this.if[var4], 'X', var3);
         }
      }

   }
}
