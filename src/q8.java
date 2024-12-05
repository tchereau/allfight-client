import java.util.List;

public class q8 extends pa {
   private final String dZ;

   public q8(int var1, String var2, ts var3) {
      super(var1, var3);
      this.dZ = var2;
      this.a(acn.c);
   }

   public void a(y6 var1, int var2, int var3, int var4, nw var5, List var6, aiw var7) {
      boolean var8 = this.void(var1, var2, var3, var4 - 1);
      boolean var9 = this.void(var1, var2, var3, var4 + 1);
      boolean var10 = this.void(var1, var2 - 1, var3, var4);
      boolean var11 = this.void(var1, var2 + 1, var3, var4);
      float var12 = 0.375F;
      float var13 = 0.625F;
      float var14 = 0.375F;
      float var15 = 0.625F;
      if (var8) {
         var14 = 0.0F;
      }

      if (var9) {
         var15 = 1.0F;
      }

      if (var8 || var9) {
         this.a(var12, 0.0F, var14, var13, 1.5F, var15);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

      var14 = 0.375F;
      var15 = 0.625F;
      if (var10) {
         var12 = 0.0F;
      }

      if (var11) {
         var13 = 1.0F;
      }

      if (var10 || var11 || !var8 && !var9) {
         this.a(var12, 0.0F, var14, var13, 1.5F, var15);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

      if (var8) {
         var14 = 0.0F;
      }

      if (var9) {
         var15 = 1.0F;
      }

      this.a(var12, 0.0F, var14, var13, 1.0F, var15);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      boolean var5 = this.void(var1, var2, var3, var4 - 1);
      boolean var6 = this.void(var1, var2, var3, var4 + 1);
      boolean var7 = this.void(var1, var2 - 1, var3, var4);
      boolean var8 = this.void(var1, var2 + 1, var3, var4);
      float var9 = 0.375F;
      float var10 = 0.625F;
      float var11 = 0.375F;
      float var12 = 0.625F;
      if (var5) {
         var11 = 0.0F;
      }

      if (var6) {
         var12 = 1.0F;
      }

      if (var7) {
         var9 = 0.0F;
      }

      if (var8) {
         var10 = 1.0F;
      }

      this.a(var9, 0.0F, var11, var10, 1.0F, var12);
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public boolean a(yy var1, int var2, int var3, int var4) {
      return false;
   }

   public int new() {
      return 11;
   }

   public boolean void(yy var1, int var2, int var3, int var4) {
      int var5 = var1.new(var2, var3, var4);
      if (var5 != this.void && var5 != pa.Y.void) {
         pa var6 = pa.x[var5];
         if (var6 != null && var6.at.goto() && var6.if()) {
            return var6.at != ts.long;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean p(int var0) {
      return var0 == pa.aZ.void || var0 == pa.bW.void;
   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      return true;
   }

   public void a(ajc var1) {
      this.an = var1.a(this.dZ);
   }
}
