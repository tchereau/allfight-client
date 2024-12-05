public class tg extends th {
   public tg(long var1, th var3) {
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
            if (this.a(3) == 0) {
               int var10 = var9;
               if (var9 == yn.D.try) {
                  var10 = yn.o.try;
               } else if (var9 == yn.B.try) {
                  var10 = yn.n.try;
               } else if (var9 == yn.A.try) {
                  var10 = yn.m.try;
               } else if (var9 == yn.E.try) {
                  var10 = yn.B.try;
               } else if (var9 == yn.t.try) {
                  var10 = yn.s.try;
               } else if (var9 == yn.k.try) {
                  var10 = yn.j.try;
               }

               if (var10 == var9) {
                  var6[var8 + var7 * var3] = var9;
               } else {
                  int var11 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
                  int var12 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
                  int var13 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
                  int var14 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
                  if (var11 == var9 && var12 == var9 && var13 == var9 && var14 == var9) {
                     var6[var8 + var7 * var3] = var10;
                  } else {
                     var6[var8 + var7 * var3] = var9;
                  }
               }
            } else {
               var6[var8 + var7 * var3] = var9;
            }
         }
      }

      return var6;
   }
}
