import java.util.Random;

public class ro extends r0 {
   private ajd[] e3;

   protected ro(int var1) {
      super(var1);
      this.a(true);
      float var2 = 0.5F;
      this.a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, 0.25F, 0.5F + var2);
      this.a((acn)null);
      this.if(0.0F);
      this.a((o6)P);
      this.g();
   }

   protected boolean K(int var1) {
      return var1 == pa.cs.void;
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      super.if(var1, var2, var3, var4, var5);
      if (var1.h(var2, var3 + 1, var4) >= 9) {
         int var6 = var1.for(var2, var3, var4);
         if (var6 < 7) {
            float var7 = this.V(var1, var2, var3, var4);
            if (var5.nextInt((int)(25.0F / var7) + 1) == 0) {
               ++var6;
               var1.do(var2, var3, var4, var6, 2);
            }
         }
      }

   }

   public void W(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4) + ajs.a((Random)var1.o, 2, 5);
      if (var5 > 7) {
         var5 = 7;
      }

      var1.do(var2, var3, var4, var5, 2);
   }

   private float V(y6 var1, int var2, int var3, int var4) {
      float var5 = 1.0F;
      int var6 = var1.new(var2, var3, var4 - 1);
      int var7 = var1.new(var2, var3, var4 + 1);
      int var8 = var1.new(var2 - 1, var3, var4);
      int var9 = var1.new(var2 + 1, var3, var4);
      int var10 = var1.new(var2 - 1, var3, var4 - 1);
      int var11 = var1.new(var2 + 1, var3, var4 - 1);
      int var12 = var1.new(var2 + 1, var3, var4 + 1);
      int var13 = var1.new(var2 - 1, var3, var4 + 1);
      boolean var14 = var8 == this.void || var9 == this.void;
      boolean var15 = var6 == this.void || var7 == this.void;
      boolean var16 = var10 == this.void || var11 == this.void || var12 == this.void || var13 == this.void;

      for(int var17 = var2 - 1; var17 <= var2 + 1; ++var17) {
         for(int var18 = var4 - 1; var18 <= var4 + 1; ++var18) {
            int var19 = var1.new(var17, var3 - 1, var18);
            float var20 = 0.0F;
            if (var19 == pa.cs.void) {
               var20 = 1.0F;
               if (var1.for(var17, var3 - 1, var18) > 0) {
                  var20 = 3.0F;
               }
            }

            if (var17 != var2 || var18 != var4) {
               var20 /= 4.0F;
            }

            var5 += var20;
         }
      }

      if (var16 || var14 && var15) {
         var5 /= 2.0F;
      }

      return var5;
   }

   public ajd if(int var1, int var2) {
      if (var2 < 0 || var2 > 7) {
         var2 = 7;
      }

      return this.e3[var2];
   }

   public int new() {
      return 6;
   }

   protected int D() {
      return abr.aG.A;
   }

   protected int C() {
      return abr.aE.A;
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.a(var1, var2, var3, var4, var5, var6, 0);
      if (!var1.goto) {
         if (var5 >= 7) {
            int var8 = 3 + var7;

            for(int var9 = 0; var9 < var8; ++var9) {
               if (var1.o.nextInt(15) <= var5) {
                  this.a(var1, var2, var3, var4, new abp(this.D(), 1, 0));
               }
            }
         }

      }
   }

   public int a(int var1, Random var2, int var3) {
      return var1 == 7 ? this.C() : this.D();
   }

   public int a(Random var1) {
      return 1;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return this.D();
   }

   public void a(ajc var1) {
      this.e3 = new ajd[8];

      for(int var2 = 0; var2 < this.e3.length; ++var2) {
         this.e3[var2] = var1.a("crops_" + var2);
      }

   }
}
