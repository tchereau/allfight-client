public class aca extends abr {
   private pa[] dG;
   protected float dE = 4.0F;
   private int dF;
   protected abq dD;

   protected aca(int var1, int var2, abq var3, pa[] var4) {
      super(var1);
      this.dD = var3;
      this.dG = var4;
      this.y = 1;
      this.for(var3.new());
      this.dE = var3.int();
      this.dF = var2 + var3.if();
      this.a(acn.char);
   }

   public float a(abp var1, pa var2) {
      for(int var3 = 0; var3 < this.dG.length; ++var3) {
         if (this.dG[var3] == var2) {
            return this.dE;
         }
      }

      return 1.0F;
   }

   public boolean a(abp var1, aig var2, aig var3) {
      var1.a(2, (aig)var3);
      return true;
   }

   public boolean a(abp var1, y6 var2, int var3, int var4, int var5, int var6, aig var7) {
      if ((double)pa.x[var3].if(var2, var4, var5, var6) != 0.0D) {
         var1.a(1, (aig)var7);
      }

      return true;
   }

   public int a(aiw var1) {
      return this.dF;
   }

   public boolean g() {
      return true;
   }

   public int d() {
      return this.dD.for();
   }

   public String x() {
      return this.dD.toString();
   }

   public boolean a(abp var1, abp var2) {
      return this.dD.do() == var2.new ? true : super.a(var1, var2);
   }
}
