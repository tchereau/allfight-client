public class aac {
   private String[][] if = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
   private Object[][] a;

   public aac() {
      this.a = new Object[][]{{pa.be, pa.bf, abr.N, abr.P, abr.L}, {abr.B, abr.t, abr.ae, abr.bb, abr.a0}, {abr.D, abr.v, abr.ag, abr.bc, abr.a2}, {abr.z, abr.r, abr.ac, abr.ba, abr.aY}, {abr.aQ, abr.aO, abr.aM, abr.aK, abr.aI}};
   }

   public void a(aai var1) {
      for(int var2 = 0; var2 < this.a[0].length; ++var2) {
         Object var3 = this.a[0][var2];

         for(int var4 = 0; var4 < this.a.length - 1; ++var4) {
            abr var5 = (abr)this.a[var4 + 1][var2];
            var1.if(new abp(var5), this.if[var4], '#', abr.a9, 'X', var3);
         }
      }

      var1.if(new abp(abr.aX), " #", "# ", '#', abr.N);
   }
}
