import java.util.Random;

public class w8 extends w2 {
   public w8(boolean var1) {
      super(var1);
   }

   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      int var6 = var2.nextInt(3) + 5;
      boolean var7 = true;
      if (var4 >= 1 && var4 + var6 + 1 <= 256) {
         int var8;
         int var10;
         int var11;
         int var12;
         for(var8 = var4; var8 <= var4 + 1 + var6; ++var8) {
            byte var9 = 1;
            if (var8 == var4) {
               var9 = 0;
            }

            if (var8 >= var4 + 1 + var6 - 2) {
               var9 = 2;
            }

            for(var10 = var3 - var9; var10 <= var3 + var9 && var7; ++var10) {
               for(var11 = var5 - var9; var11 <= var5 + var9 && var7; ++var11) {
                  if (var8 >= 0 && var8 < 256) {
                     var12 = var1.new(var10, var8, var11);
                     if (var12 != 0 && var12 != pa.aJ.void) {
                        var7 = false;
                     }
                  } else {
                     var7 = false;
                  }
               }
            }
         }

         if (!var7) {
            return false;
         } else {
            var8 = var1.new(var3, var4 - 1, var5);
            if ((var8 == pa.i.void || var8 == pa.g.void) && var4 < 256 - var6 - 1) {
               this.a(var1, var3, var4 - 1, var5, pa.g.void);

               int var17;
               for(var17 = var4 - 3 + var6; var17 <= var4 + var6; ++var17) {
                  var10 = var17 - (var4 + var6);
                  var11 = 1 - var10 / 2;

                  for(var12 = var3 - var11; var12 <= var3 + var11; ++var12) {
                     int var13 = var12 - var3;

                     for(int var14 = var5 - var11; var14 <= var5 + var11; ++var14) {
                        int var15 = var14 - var5;
                        if (Math.abs(var13) != var11 || Math.abs(var15) != var11 || var2.nextInt(2) != 0 && var10 != 0) {
                           int var16 = var1.new(var12, var17, var14);
                           if (var16 == 0 || var16 == pa.aJ.void) {
                              this.a(var1, var12, var17, var14, pa.aJ.void, 2);
                           }
                        }
                     }
                  }
               }

               for(var17 = 0; var17 < var6; ++var17) {
                  var10 = var1.new(var3, var4 + var17, var5);
                  if (var10 == 0 || var10 == pa.aJ.void) {
                     this.a(var1, var3, var4 + var17, var5, pa.aM.void, 2);
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }
}
