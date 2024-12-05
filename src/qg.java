import java.util.Random;

public class qg extends r0 {
   private final String e2;

   protected qg(int var1, String var2) {
      super(var1);
      this.e2 = var2;
      float var3 = 0.2F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
      this.a(true);
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (var5.nextInt(25) == 0) {
         byte var6 = 4;
         int var7 = 5;

         int var8;
         int var9;
         int var10;
         for(var8 = var2 - var6; var8 <= var2 + var6; ++var8) {
            for(var9 = var4 - var6; var9 <= var4 + var6; ++var9) {
               for(var10 = var3 - 1; var10 <= var3 + 1; ++var10) {
                  if (var1.new(var8, var10, var9) == this.void) {
                     --var7;
                     if (var7 <= 0) {
                        return;
                     }
                  }
               }
            }
         }

         var8 = var2 + var5.nextInt(3) - 1;
         var9 = var3 + var5.nextInt(2) - var5.nextInt(2);
         var10 = var4 + var5.nextInt(3) - 1;

         for(int var11 = 0; var11 < 4; ++var11) {
            if (var1.a(var8, var9, var10) && this.try(var1, var8, var9, var10)) {
               var2 = var8;
               var3 = var9;
               var4 = var10;
            }

            var8 = var2 + var5.nextInt(3) - 1;
            var9 = var3 + var5.nextInt(2) - var5.nextInt(2);
            var10 = var4 + var5.nextInt(3) - 1;
         }

         if (var1.a(var8, var9, var10) && this.try(var1, var8, var9, var10)) {
            var1.int(var8, var9, var10, this.void);
         }
      }

   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      return super.case(var1, var2, var3, var4) && this.try(var1, var2, var3, var4);
   }

   protected boolean K(int var1) {
      return pa.v[var1];
   }

   public boolean try(y6 var1, int var2, int var3, int var4) {
      if (var3 >= 0 && var3 < 256) {
         int var5 = var1.new(var2, var3 - 1, var4);
         return var5 == pa.b2.void || var1.m(var2, var3, var4) < 13 && this.K(var5);
      } else {
         return false;
      }
   }

   public boolean new(y6 var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.for(var2, var3, var4);
      var1.o(var2, var3, var4);
      wv var7 = null;
      if (this.void == pa.bN.void) {
         var7 = new wv(0);
      } else if (this.void == pa.bL.void) {
         var7 = new wv(1);
      }

      if (var7 != null && var7.a(var1, var5, var2, var3, var4)) {
         return true;
      } else {
         var1.int(var2, var3, var4, this.void, var6, 3);
         return false;
      }
   }

   public void a(ajc var1) {
      this.an = var1.a(this.e2);
   }
}
