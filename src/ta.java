public class ta extends th {
   public ta(long var1, th var3) {
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
            if ((var9 != yn.z.try || this.a(6) != 0) && (var9 != yn.k.try && var9 != yn.j.try || this.a(8) != 0)) {
               var6[var8 + var7 * var3] = var9;
            } else {
               var6[var8 + var7 * var3] = yn.y.try;
            }
         }
      }

      return var6;
   }
}
