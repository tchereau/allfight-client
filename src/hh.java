public class hh extends abr {
   public final int cM;
   private final int cE;
   private final float cG;
   private final boolean cL;
   private boolean cH;
   private int cJ;
   private int cF;
   private int cK;
   private int cI;
   private float cD;

   public hh(int var1, int var2, float var3, boolean var4) {
      super(var1);
      this.cM = 32;
      this.cE = var2;
      this.cL = var4;
      this.cG = var3;
      this.a(acn.else);
   }

   public hh(int var1, int var2, boolean var3, int var4) {
      this(var1, var2, 0.6F, var3);
   }

   public abp int(abp var1, y6 var2, aek var3) {
      --var1.if;
      this.for(var1, var2, var3);
      return var1;
   }

   protected void for(abp var1, y6 var2, aek var3) {
      if (!var2.goto) {
         var3.for(new aiz(9, 350, 2));
         var3.for(new aiz(ai0.x.do(), 350, 2));
      }

   }

   public int a(abp var1) {
      return 32;
   }

   public aax else(abp var1) {
      return aax.a;
   }

   public abp a(abp var1, y6 var2, aek var3) {
      if (var3.e(this.cH)) {
         var3.do(var1, this.a(var1));
      }

      return var1;
   }

   public int h() {
      return this.cE;
   }

   public float i() {
      return this.cG;
   }

   public boolean k() {
      return this.cL;
   }

   public hh a(int var1, int var2, int var3, float var4) {
      this.cJ = var1;
      this.cF = var2;
      this.cK = var3;
      this.cD = var4;
      return this;
   }

   public hh j() {
      this.cH = true;
      return this;
   }
}
