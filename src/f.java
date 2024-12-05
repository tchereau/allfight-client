public class f extends abr {
   public final int ea;
   private final int d2;
   private final float d4;
   private final boolean d9;
   private boolean d5;
   private int d7;
   private int d3;
   private int d8;
   private int d6;
   private float d1;

   public f(int var1, int var2, float var3, boolean var4, int var5) {
      super(var1);
      this.ea = 32;
      this.d2 = var2;
      this.d9 = var4;
      this.d4 = var3;
      this.a(acn.else);
      this.d6 = var5;
   }

   public f(int var1, int var2, boolean var3, int var4) {
      this(var1, var2, 0.6F, var3, var4);
   }

   public abp do(abp var1, y6 var2, aek var3) {
      --var1.if;
      var3.cA().a(this);
      var2.a((aiw)var3, "random.burp", 0.5F, var2.o.nextFloat() * 0.1F + 0.9F);
      this.byte(var1, var2, var3);
      return var1;
   }

   protected void byte(abp var1, y6 var2, aek var3) {
      if (!var2.goto && this.d6 == 1) {
         var3.for(new aiz(ai0.y.do(), 300, this.d8));
         var3.for(new aiz(ai0.r.do(), 200, this.d8));
         var3.for(new aiz(ai0.n.do(), 600, this.d8));
      } else if (!var2.goto && this.d6 == 2) {
         var3.for(new aiz(ai0.y.do(), 600, this.d8));
         var3.for(new aiz(ai0.r.do(), 300, this.d8));
         var3.for(new aiz(ai0.p.do(), 200, this.d8));
         var3.for(new aiz(ai0.n.do(), 900, this.d8));
      }

   }

   public int a(abp var1) {
      return 32;
   }

   public aax else(abp var1) {
      return aax.if;
   }

   public abp a(abp var1, y6 var2, aek var3) {
      if (var3.e(this.d5)) {
         var3.do(var1, this.a(var1));
      }

      return var1;
   }

   public int A() {
      return this.d2;
   }

   public float C() {
      return this.d4;
   }

   public boolean D() {
      return this.d9;
   }

   public f do(int var1, int var2, int var3, float var4) {
      this.d7 = var1;
      this.d3 = var2;
      this.d8 = var3;
      this.d1 = var4;
      return this;
   }

   public f B() {
      this.d5 = true;
      return this;
   }
}
