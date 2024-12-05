public class aaj {
   private Object[][] a;

   public aaj() {
      this.a = new Object[][]{{pa.bJ, new abp(abr.L, 9)}, {pa.bH, new abp(abr.N, 9)}, {pa.cv, new abp(abr.P, 9)}, {pa.bh, new abp(abr.bP, 9)}, {pa.ax, new abp(abr.b9, 9, 4)}, {pa.j, new abp(abr.cv, 9)}};
   }

   public void a(aai var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         pa var3 = (pa)this.a[var2][0];
         abp var4 = (abp)this.a[var2][1];
         var1.if(new abp(var3), "###", "###", "###", '#', var4);
         var1.if(var4, "#", '#', var3);
      }

      var1.if(new abp(abr.L), "###", "###", "###", '#', abr.az);
      var1.if(new abp(abr.az, 9), "#", '#', abr.L);
   }
}
