import java.io.InputStream;
import java.net.URL;

class ad extends InputStream {
   private int for;
   private InputStream do;
   byte[] if;
   // $FF: synthetic field
   final ae a;

   public ad(ae var1, URL var2, InputStream var3) {
      this.a = var1;
      this.if = new byte[1];
      this.do = var3;
      String var4 = var2.getPath();
      var4 = var4.substring(var4.lastIndexOf("/") + 1);
      this.for = var4.hashCode();
   }

   public int read() {
      int var1 = this.read(this.if, 0, 1);
      return var1 < 0 ? var1 : this.if[0];
   }

   public int read(byte[] var1, int var2, int var3) {
      var3 = this.do.read(var1, var2, var3);

      for(int var4 = 0; var4 < var3; ++var4) {
         byte var5 = var1[var2 + var4] = (byte)(var1[var2 + var4] ^ this.for >> 8);
         this.for = this.for * 498729871 + 85731 * var5;
      }

      return var3;
   }
}
