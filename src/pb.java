import java.util.List;
import java.util.Random;

public class pb extends pa {
   private final String cX;
   private final boolean cW;
   private final String cZ;
   private ajd cY;

   protected pb(int var1, String var2, String var3, ts var4, boolean var5) {
      super(var1, var4);
      this.cX = var3;
      this.cW = var5;
      this.cZ = var2;
      this.a(acn.c);
   }

   public int b() {
      return 0;
   }

   public int do(yy var1, int var2, int var3, int var4) {
      if (this.void == mod_rajouts.ag.void) {
         return 16711680;
      } else if (this.void == mod_rajouts.Y.void) {
         return 255;
      } else if (this.void == mod_rajouts.N.void) {
         return 65280;
      } else if (this.void == mod_rajouts.ai.void) {
         return 8404992;
      } else {
         return this.void == mod_rajouts.ah.void ? 0 : 16777200;
      }
   }

   public int a(int var1, Random var2, int var3) {
      return !this.cW ? 0 : super.a(var1, var2, var3);
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public int new() {
      return 18;
   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.new(var2, var3, var4);
      return var6 == this.void ? false : super.int(var1, var2, var3, var4, var5);
   }

   public void a(y6 var1, int var2, int var3, int var4, nw var5, List var6, aiw var7) {
      boolean var8 = this.d(var1.new(var2, var3, var4 - 1));
      boolean var9 = this.d(var1.new(var2, var3, var4 + 1));
      boolean var10 = this.d(var1.new(var2 - 1, var3, var4));
      boolean var11 = this.d(var1.new(var2 + 1, var3, var4));
      if (var10 && var11 || !var10 && !var11 && !var8 && !var9) {
         this.a(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var10 && !var11) {
         this.a(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (!var10 && var11) {
         this.a(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

      if (var8 && var9 || !var10 && !var11 && !var8 && !var9) {
         this.a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 && !var9) {
         this.a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      } else if (!var8 && var9) {
         this.a(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

   }

   public void try() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      float var5 = 0.4375F;
      float var6 = 0.5625F;
      float var7 = 0.4375F;
      float var8 = 0.5625F;
      boolean var9 = this.d(var1.new(var2, var3, var4 - 1));
      boolean var10 = this.d(var1.new(var2, var3, var4 + 1));
      boolean var11 = this.d(var1.new(var2 - 1, var3, var4));
      boolean var12 = this.d(var1.new(var2 + 1, var3, var4));
      if (var11 && var12 || !var11 && !var12 && !var9 && !var10) {
         var5 = 0.0F;
         var6 = 1.0F;
      } else if (var11 && !var12) {
         var5 = 0.0F;
      } else if (!var11 && var12) {
         var6 = 1.0F;
      }

      if (var9 && var10 || !var11 && !var12 && !var9 && !var10) {
         var7 = 0.0F;
         var8 = 1.0F;
      } else if (var9 && !var10) {
         var7 = 0.0F;
      } else if (!var9 && var10) {
         var8 = 1.0F;
      }

      this.a(var5, 0.0F, var7, var6, 1.0F, var8);
   }

   public ajd t() {
      return this.cY;
   }

   public final boolean d(int var1) {
      return pa.v[var1] || var1 == this.void || var1 == pa.aD.void;
   }

   protected boolean d() {
      return true;
   }

   protected abp int(int var1) {
      return new abp(this.void, 1, var1);
   }

   public void a(ajc var1) {
      this.an = var1.a(this.cZ);
      this.cY = var1.a(this.cX);
   }
}
