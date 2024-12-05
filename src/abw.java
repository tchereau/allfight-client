public class abw extends abr {
   public final int ds;
   private final int dr;
   private final float dq;
   private final boolean dp;
   private boolean dn;
   private int dm;
   private int dl;
   private int dk;
   private float dj;

   public abw(int var1, int var2, float var3, boolean var4) {
      super(var1);
      this.ds = 32;
      this.dr = var2;
      this.dp = var4;
      this.dq = var3;
      this.a(acn.else);
   }

   public abw(int var1, int var2, boolean var3) {
      this(var1, var2, 0.6F, var3);
   }

   public abp do(abp var1, y6 var2, aek var3) {
      --var1.if;
      var3.cA().a(this);
      var2.a((aiw)var3, "random.burp", 0.5F, var2.o.nextFloat() * 0.1F + 0.9F);
      this.new(var1, var2, var3);
      return var1;
   }

   protected void new(abp var1, y6 var2, aek var3) {
      if (!var2.goto && this.dm > 0 && var2.o.nextFloat() < this.dj) {
         var3.for(new aiz(this.dm, this.dl * 20, this.dk));
      }

   }

   public int a(abp var1) {
      return 32;
   }

   public aax else(abp var1) {
      return aax.if;
   }

   public abp a(abp var1, y6 var2, aek var3) {
      if (var3.e(this.dn)) {
         var3.do(var1, this.a(var1));
      }

      return var1;
   }

   public int v() {
      return this.dr;
   }

   public float u() {
      return this.dq;
   }

   public boolean s() {
      return this.dp;
   }

   public abw if(int var1, int var2, int var3, float var4) {
      this.dm = var1;
      this.dl = var2;
      this.dk = var3;
      this.dj = var4;
      return this;
   }

   public abw t() {
      this.dn = true;
      return this;
   }
}
