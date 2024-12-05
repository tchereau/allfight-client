public class aab {
   private String[][] if = new String[][]{{"X", "X", "#"}};
   private Object[][] a;

   public aab() {
      this.a = new Object[][]{{pa.be, pa.bf, abr.N, abr.P, abr.L}, {abr.G, abr.x, abr.J, abr.bd, abr.a4}};
   }

   public void a(aai var1) {
      for(int var2 = 0; var2 < this.a[0].length; ++var2) {
         Object var3 = this.a[0][var2];

         for(int var4 = 0; var4 < this.a.length - 1; ++var4) {
            abr var5 = (abr)this.a[var4 + 1][var2];
            var1.if(new abp(var5), this.if[var4], '#', abr.a9, 'X', var3);
         }
      }

      var1.if(new abp(abr.W, 1), " #X", "# X", " #X", 'X', abr.aW, '#', abr.a9);
      var1.if(new abp(abr.T, 4), "X", "#", "Y", 'Y', abr.aU, 'X', abr.bw, '#', abr.a9);
   }
}
