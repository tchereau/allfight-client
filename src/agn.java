public class agn extends agp {
   private ah2 cc;

   public agn(ah2 var1, Class var2, float var3, int var4, boolean var5) {
      super(var1, var2, var3, var4, var5);
      this.cc = var1;
   }

   public boolean do() {
      return this.cc.fy() ? false : super.do();
   }
}
