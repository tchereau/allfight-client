public class mw implements m6 {
   private byte[] do;
   private m6 if;

   public mw(m6 var1, byte[] var2, int var3, int var4) {
      this.do = new byte[var4];
      this.if = var1;
      System.arraycopy(var2, var3, this.do, 0, var4);
   }

   public byte[] do() {
      return this.do;
   }

   public m6 if() {
      return this.if;
   }
}
