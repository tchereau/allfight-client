public class tc extends th {
   public tc(long var1, th var3) {
      super(var1);
      this.if = var3;
   }

   public int[] a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.if.a(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      int[] var6 = tj.a(var3 * var4);

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            this.a((long)(var8 + var1), (long)(var7 + var2));
            int var9 = var5[var8 + 1 + (var7 + 1) * (var3 + 2)];
            int var10;
            int var11;
            int var12;
            int var13;
            if (var9 == yn.r.try) {
               var10 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
               var11 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
               var12 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
               var13 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
               if (var10 != yn.F.try && var11 != yn.F.try && var12 != yn.F.try && var13 != yn.F.try) {
                  var6[var8 + var7 * var3] = var9;
               } else {
                  var6[var8 + var7 * var3] = yn.q.try;
               }
            } else if (var9 != yn.F.try && var9 != yn.y.try && var9 != yn.z.try && var9 != yn.C.try) {
               var10 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
               var11 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
               var12 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
               var13 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
               if (var10 != yn.F.try && var11 != yn.F.try && var12 != yn.F.try && var13 != yn.F.try) {
                  var6[var8 + var7 * var3] = var9;
               } else {
                  var6[var8 + var7 * var3] = yn.p.try;
               }
            } else if (var9 == yn.C.try) {
               var10 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
               var11 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
               var12 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
               var13 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
               if (var10 == yn.C.try && var11 == yn.C.try && var12 == yn.C.try && var13 == yn.C.try) {
                  var6[var8 + var7 * var3] = var9;
               } else {
                  var6[var8 + var7 * var3] = yn.l.try;
               }
            } else {
               var6[var8 + var7 * var3] = var9;
            }
         }
      }

      return var6;
   }
}
