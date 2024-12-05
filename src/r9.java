import java.util.List;

public class r9 extends qy {
   public static final String[] dK = new String[]{"intact", "slightlyDamaged", "veryDamaged"};
   private static final String[] dM = new String[]{"anvil_top", "anvil_top_damaged_1", "anvil_top_damaged_2"};
   public int dJ = 0;
   private ajd[] dL;

   protected r9(int var1) {
      super(var1, ts.t);
      this.new(0);
      this.a((acn)acn.c);
   }

   public boolean if() {
      return false;
   }

   public boolean do() {
      return false;
   }

   public ajd if(int var1, int var2) {
      if (this.dJ == 3 && var1 == 1) {
         int var3 = (var2 >> 2) % this.dL.length;
         return this.dL[var3];
      } else {
         return this.an;
      }
   }

   public void a(ajc var1) {
      this.an = var1.a("anvil_base");
      this.dL = new ajd[dM.length];

      for(int var2 = 0; var2 < this.dL.length; ++var2) {
         this.dL[var2] = var1.a(dM[var2]);
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      int var7 = ajs.a((double)(var5.a5 * 4.0F / 360.0F) + 0.5D) & 3;
      int var8 = var1.for(var2, var3, var4) >> 2;
      ++var7;
      var7 %= 4;
      if (var7 == 0) {
         var1.do(var2, var3, var4, 2 | var8 << 2, 2);
      }

      if (var7 == 1) {
         var1.do(var2, var3, var4, 3 | var8 << 2, 2);
      }

      if (var7 == 2) {
         var1.do(var2, var3, var4, 0 | var8 << 2, 2);
      }

      if (var7 == 3) {
         var1.do(var2, var3, var4, 1 | var8 << 2, 2);
      }

   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      if (var1.goto) {
         return true;
      } else {
         var5.for(var2, var3, var4);
         return true;
      }
   }

   public int new() {
      return 35;
   }

   public int for(int var1) {
      return var1 >> 2;
   }

   public void int(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4) & 3;
      if (var5 != 3 && var5 != 1) {
         this.a(0.125F, 0.0F, 0.0F, 0.875F, 1.0F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.125F, 1.0F, 1.0F, 0.875F);
      }

   }

   public void a(int var1, acn var2, List var3) {
      var3.add(new abp(var1, 1, 0));
      var3.add(new abp(var1, 1, 1));
      var3.add(new abp(var1, 1, 2));
   }

   protected void a(afl var1) {
      var1.long(true);
   }

   public void d(y6 var1, int var2, int var3, int var4, int var5) {
      var1.for(1022, var2, var3, var4, 0);
   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      return true;
   }
}
