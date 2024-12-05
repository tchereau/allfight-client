import java.util.Random;

public class rc extends r8 {
   protected rc(int var1) {
      super(var1, ts.v);
      this.a((acn)acn.c);
      this.a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public int new() {
      return 22;
   }

   public int a(int var1, Random var2, int var3) {
      return pa.bs.void;
   }

   public int a(Random var1) {
      return 8;
   }

   protected boolean d() {
      return true;
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      byte var7 = 0;
      int var8 = ajs.a((double)(var5.a5 * 4.0F / 360.0F) + 0.5D) & 3;
      if (var8 == 0) {
         var7 = 2;
      }

      if (var8 == 1) {
         var7 = 5;
      }

      if (var8 == 2) {
         var7 = 3;
      }

      if (var8 == 3) {
         var7 = 4;
      }

      var1.do(var2, var3, var4, var7, 2);
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      adf var10 = var5.cG();
      of var11 = (of)var1.if(var2, var3, var4);
      if (var10 != null && var11 != null) {
         if (var1.try(var2, var3 + 1, var4)) {
            return true;
         } else if (var1.goto) {
            return true;
         } else {
            var10.a(var11);
            var5.a((ajg)var10);
            return true;
         }
      } else {
         return true;
      }
   }

   public n4 if(y6 var1) {
      return new of();
   }

   public void a(y6 var1, int var2, int var3, int var4, Random var5) {
      for(int var6 = 0; var6 < 3; ++var6) {
         double var10000 = (double)((float)var2 + var5.nextFloat());
         double var9 = (double)((float)var3 + var5.nextFloat());
         var10000 = (double)((float)var4 + var5.nextFloat());
         double var13 = 0.0D;
         double var15 = 0.0D;
         double var17 = 0.0D;
         int var19 = var5.nextInt(2) * 2 - 1;
         int var20 = var5.nextInt(2) * 2 - 1;
         var13 = ((double)var5.nextFloat() - 0.5D) * 0.125D;
         var15 = ((double)var5.nextFloat() - 0.5D) * 0.125D;
         var17 = ((double)var5.nextFloat() - 0.5D) * 0.125D;
         double var11 = (double)var4 + 0.5D + 0.25D * (double)var20;
         var17 = (double)(var5.nextFloat() * 1.0F * (float)var20);
         double var7 = (double)var2 + 0.5D + 0.25D * (double)var19;
         var13 = (double)(var5.nextFloat() * 1.0F * (float)var19);
         var1.a("portal", var7, var9, var11, var13, var15, var17);
      }

   }

   public void a(ajc var1) {
      this.an = var1.a("obsidian");
   }
}
