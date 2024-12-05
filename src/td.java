public class td extends th {
   private th int;
   private th new;

   public td(long var1, th var3, th var4) {
      super(var1);
      this.int = var3;
      this.new = var4;
   }

   public void a(long var1) {
      this.int.a(var1);
      this.new.a(var1);
      super.a(var1);
   }

   public int[] a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.int.a(var1, var2, var3, var4);
      int[] var6 = this.new.a(var1, var2, var3, var4);
      int[] var7 = tj.a(var3 * var4);

      for(int var8 = 0; var8 < var3 * var4; ++var8) {
         if (var5[var8] == yn.F.try) {
            var7[var8] = var5[var8];
         } else if (var6[var8] >= 0) {
            if (var5[var8] == yn.t.try) {
               var7[var8] = yn.u.try;
            } else if (var5[var8] != yn.r.try && var5[var8] != yn.q.try) {
               var7[var8] = var6[var8];
            } else {
               var7[var8] = yn.q.try;
            }
         } else {
            var7[var8] = var5[var8];
         }
      }

      return var7;
   }
}
