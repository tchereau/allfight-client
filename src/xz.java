public class xz {
   public final byte[] if;
   private final int a;
   private final int do;

   public xz(int var1, int var2) {
      this.if = new byte[var1 >> 1];
      this.a = var2;
      this.do = var2 + 4;
   }

   public xz(byte[] var1, int var2) {
      this.if = var1;
      this.a = var2;
      this.do = var2 + 4;
   }

   public int a(int var1, int var2, int var3) {
      int var4 = var2 << this.do | var3 << this.a | var1;
      int var5 = var4 >> 1;
      int var6 = var4 & 1;
      return var6 == 0 ? this.if[var5] & 15 : this.if[var5] >> 4 & 15;
   }

   public void a(int var1, int var2, int var3, int var4) {
      int var5 = var2 << this.do | var3 << this.a | var1;
      int var6 = var5 >> 1;
      int var7 = var5 & 1;
      if (var7 == 0) {
         this.if[var6] = (byte)(this.if[var6] & 240 | var4 & 15);
      } else {
         this.if[var6] = (byte)(this.if[var6] & 15 | (var4 & 15) << 4);
      }

   }
}
