import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public class akt {
   private ByteArrayOutputStream if;
   private DataOutputStream a;

   public akt(int var1) {
      this.if = new ByteArrayOutputStream(var1);
      this.a = new DataOutputStream(this.if);
   }

   public void a(byte[] var1) {
      this.a.write(var1, 0, var1.length);
   }

   public void a(String var1) {
      this.a.writeBytes(var1);
      this.a.write(0);
   }

   public void a(int var1) {
      this.a.write(var1);
   }

   public void a(short var1) {
      this.a.writeShort(Short.reverseBytes(var1));
   }

   public byte[] if() {
      return this.if.toByteArray();
   }

   public void a() {
      this.if.reset();
   }
}
