public class s9 extends th {
   public s9(long var1, th var3) {
      super(var1);
      super.if = var3;
   }

   public int[] a(int var1, int var2, int var3, int var4) {
      var1 -= 2;
      var2 -= 2;
      byte var5 = 2;
      int var6 = 1 << var5;
      int var7 = var1 >> var5;
      int var8 = var2 >> var5;
      int var9 = (var3 >> var5) + 3;
      int var10 = (var4 >> var5) + 3;
      int[] var11 = this.if.a(var7, var8, var9, var10);
      int var12 = var9 << var5;
      int var13 = var10 << var5;
      int[] var14 = tj.a(var12 * var13);

      int var16;
      for(int var15 = 0; var15 < var10 - 1; ++var15) {
         var16 = var11[0 + (var15 + 0) * var9];
         int var17 = var11[0 + (var15 + 1) * var9];

         for(int var18 = 0; var18 < var9 - 1; ++var18) {
            double var19 = (double)var6 * 0.9D;
            this.a((long)(var18 + var7 << var5), (long)(var15 + var8 << var5));
            double var21 = ((double)this.a(1024) / 1024.0D - 0.5D) * var19;
            double var23 = ((double)this.a(1024) / 1024.0D - 0.5D) * var19;
            this.a((long)(var18 + var7 + 1 << var5), (long)(var15 + var8 << var5));
            double var25 = ((double)this.a(1024) / 1024.0D - 0.5D) * var19 + (double)var6;
            double var27 = ((double)this.a(1024) / 1024.0D - 0.5D) * var19;
            this.a((long)(var18 + var7 << var5), (long)(var15 + var8 + 1 << var5));
            double var29 = ((double)this.a(1024) / 1024.0D - 0.5D) * var19;
            double var31 = ((double)this.a(1024) / 1024.0D - 0.5D) * var19 + (double)var6;
            this.a((long)(var18 + var7 + 1 << var5), (long)(var15 + var8 + 1 << var5));
            double var33 = ((double)this.a(1024) / 1024.0D - 0.5D) * var19 + (double)var6;
            double var35 = ((double)this.a(1024) / 1024.0D - 0.5D) * var19 + (double)var6;
            int var37 = var11[var18 + 1 + (var15 + 0) * var9];
            int var38 = var11[var18 + 1 + (var15 + 1) * var9];

            for(int var39 = 0; var39 < var6; ++var39) {
               int var40 = ((var15 << var5) + var39) * var12 + (var18 << var5);

               for(int var41 = 0; var41 < var6; ++var41) {
                  double var42 = ((double)var39 - var23) * ((double)var39 - var23) + ((double)var41 - var21) * ((double)var41 - var21);
                  double var44 = ((double)var39 - var27) * ((double)var39 - var27) + ((double)var41 - var25) * ((double)var41 - var25);
                  double var46 = ((double)var39 - var31) * ((double)var39 - var31) + ((double)var41 - var29) * ((double)var41 - var29);
                  double var48 = ((double)var39 - var35) * ((double)var39 - var35) + ((double)var41 - var33) * ((double)var41 - var33);
                  if (var42 < var44 && var42 < var46 && var42 < var48) {
                     var14[var40++] = var16;
                  } else if (var44 < var42 && var44 < var46 && var44 < var48) {
                     var14[var40++] = var37;
                  } else if (var46 < var42 && var46 < var44 && var46 < var48) {
                     var14[var40++] = var17;
                  } else {
                     var14[var40++] = var38;
                  }
               }
            }

            var16 = var37;
            var17 = var38;
         }
      }

      int[] var50 = tj.a(var3 * var4);

      for(var16 = 0; var16 < var4; ++var16) {
         System.arraycopy(var14, (var16 + (var2 & var6 - 1)) * (var9 << var5) + (var1 & var6 - 1), var50, var16 * var3, var3);
      }

      return var50;
   }
}
