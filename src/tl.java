public class tl extends th {
   public static yn[] byte;
   private yn[] try;

   public tl(long var1, th var3, yx var4) {
      super(var1);
      this.try = byte;
      this.if = var3;
      if (var4 == yx.new) {
         this.try = new yn[]{yn.D, yn.B, yn.C, yn.z, yn.E, yn.A};
      }

   }

   public int[] a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.if.a(var1, var2, var3, var4);
      int[] var6 = tj.a(var3 * var4);

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            this.a((long)(var8 + var1), (long)(var7 + var2));
            int var9 = var5[var8 + var7 * var3];
            if (var9 == 0) {
               var6[var8 + var7 * var3] = 0;
            } else if (var9 == yn.r.try) {
               var6[var8 + var7 * var3] = var9;
            } else if (var9 == 1) {
               var6[var8 + var7 * var3] = this.try[this.a(this.try.length)].try;
            } else {
               int var10 = this.try[this.a(this.try.length)].try;
               if (var10 == yn.A.try) {
                  var6[var8 + var7 * var3] = var10;
               } else {
                  var6[var8 + var7 * var3] = yn.t.try;
               }
            }
         }
      }

      return var6;
   }

   static {
      byte = new yn[]{yn.D, yn.B, yn.C, yn.z, yn.E, yn.A, yn.k};
   }
}
