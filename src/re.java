import java.util.Random;

public class re extends pa {
   public re(int var1) {
      super(var1, ts.goto);
      this.a(0.0625F, 0.0F, 0.0625F, 0.9375F, 1.0F, 0.9375F);
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      var1.if(var2, var3, var4, this.void, this.a(var1));
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      var1.if(var2, var3, var4, this.void, this.a(var1));
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      this.C(var1, var2, var3, var4);
   }

   private void C(y6 var1, int var2, int var3, int var4) {
      if (qy.v(var1, var2, var3 - 1, var4) && var3 >= 0) {
         byte var5 = 32;
         if (!qy.dI && var1.for(var2 - var5, var3 - var5, var4 - var5, var2 + var5, var3 + var5, var4 + var5)) {
            afl var6 = new afl(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), this.void);
            var1.new(var6);
         } else {
            var1.o(var2, var3, var4);

            while(qy.v(var1, var2, var3 - 1, var4) && var3 > 0) {
               --var3;
            }

            if (var3 > 0) {
               var1.int(var2, var3, var4, this.void, 0, 2);
            }
         }
      }

   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      this.B(var1, var2, var3, var4);
      return true;
   }

   public void a(y6 var1, int var2, int var3, int var4, aek var5) {
      this.B(var1, var2, var3, var4);
   }

   private void B(y6 var1, int var2, int var3, int var4) {
      if (var1.new(var2, var3, var4) == this.void) {
         for(int var5 = 0; var5 < 1000; ++var5) {
            int var6 = var2 + var1.o.nextInt(16) - var1.o.nextInt(16);
            int var7 = var3 + var1.o.nextInt(8) - var1.o.nextInt(8);
            int var8 = var4 + var1.o.nextInt(16) - var1.o.nextInt(16);
            if (var1.new(var6, var7, var8) == 0) {
               if (!var1.goto) {
                  var1.int(var6, var7, var8, this.void, var1.for(var2, var3, var4), 2);
                  var1.o(var2, var3, var4);
               } else {
                  short var9 = 128;

                  for(int var10 = 0; var10 < var9; ++var10) {
                     double var11 = var1.o.nextDouble();
                     float var13 = (var1.o.nextFloat() - 0.5F) * 0.2F;
                     float var14 = (var1.o.nextFloat() - 0.5F) * 0.2F;
                     float var15 = (var1.o.nextFloat() - 0.5F) * 0.2F;
                     double var16 = (double)var6 + (double)(var2 - var6) * var11 + (var1.o.nextDouble() - 0.5D) * 1.0D + 0.5D;
                     double var18 = (double)var7 + (double)(var3 - var7) * var11 + var1.o.nextDouble() * 1.0D - 0.5D;
                     double var20 = (double)var8 + (double)(var4 - var8) * var11 + (var1.o.nextDouble() - 0.5D) * 1.0D + 0.5D;
                     var1.a("portal", var16, var18, var20, (double)var13, (double)var14, (double)var15);
                  }
               }

               return;
            }
         }

      }
   }

   public int a(y6 var1) {
      return 5;
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      return true;
   }

   public int new() {
      return 27;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return 0;
   }
}
