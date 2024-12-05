public class xv {
   public final byte[] if;
   private final int a;
   private final int do;

   public xv(byte[] var1, int var2) {
      this.if = var1;
      this.a = var2;
      this.do = var2 + 4;
   }

   public int a(int var1, int var2, int var3) {
      int var4 = var1 << this.do | var3 << this.a | var2;
      int var5 = var4 >> 1;
      int var6 = var4 & 1;
      return var6 == 0 ? this.if[var5] & 15 : this.if[var5] >> 4 & 15;
   }
}
