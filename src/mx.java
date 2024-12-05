public class mx implements m6 {
   private byte[] a;

   public mx(byte[] var1) {
      this(var1, 0, var1.length);
   }

   public mx(byte[] var1, int var2, int var3) {
      this.a = new byte[var3];
      System.arraycopy(var1, var2, this.a, 0, var3);
   }

   public byte[] a() {
      return this.a;
   }
}
